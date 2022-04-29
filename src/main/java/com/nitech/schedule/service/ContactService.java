package com.nitech.schedule.service;

import com.nitech.schedule.domain.Contact;
import com.nitech.schedule.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Service
public class ContactService {

    @Autowired
    ContactRepository contactRepository;

    public List<Contact> getAllContact() throws IOException {
        return this.contactRepository.findContactAll();
    }

    public Contact geContactById(UUID id) throws IOException {
        return this.contactRepository.findContactById(id);
    }
}
