package com.txomon.domain.repository;

import com.txomon.domain.Contact;

import java.util.List;

import rx.Observable;

public interface ContactRepository {
    Observable<List<Contact>> getContactList();

    void setContactUpdater(Observable<Contact> contactUpdatesObservable);

    Observable<Contact> getContactUpdates();
}
