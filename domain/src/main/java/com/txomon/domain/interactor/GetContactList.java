package com.txomon.domain.interactor;

import com.txomon.domain.repository.ContactRepository;

import rx.Observable;

public class GetContactList extends UseCase{

    private final ContactRepository contactRepository;

    public GetContactList()
    @Override
    protected Observable buildUseCaseObservable() {
        return null;
    }
}
