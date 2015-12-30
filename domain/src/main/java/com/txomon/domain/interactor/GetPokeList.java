package com.txomon.domain.interactor;

import com.txomon.domain.Contact;
import com.txomon.domain.executor.PostExecutionThread;
import com.txomon.domain.executor.ThreadExecutor;
import com.txomon.domain.repository.ContactRepository;

import java.util.TreeSet;

import javax.inject.Inject;

import rx.Observable;

public class GetPokeList extends UseCase {

    private final ContactRepository contactRepository;
    private final TreeSet<Contact> contactTreeSet;

    @Inject
    public GetPokeList(ThreadExecutor threadExecutor, PostExecutionThread postExecutionThread,
                       ContactRepository contactRepository, TreeSet<Contact> contactTreeSet) {
        super(threadExecutor, postExecutionThread);
        this.contactRepository = contactRepository;
        this.contactTreeSet = contactTreeSet;
    }

    @Override
    protected Observable buildUseCaseObservable() {
        return Observable.concat(
                contactRepository.getContactList().flatMap((a) -> Observable.from(a)),
                contactRepository.getContactUpdates()
        ).scan(
                contactTreeSet,
                (list, contact) -> {
                    contactTreeSet.add(contact);
                    return contactTreeSet;
                }
        );
    }
}
