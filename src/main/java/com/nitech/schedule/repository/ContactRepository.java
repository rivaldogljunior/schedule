package com.nitech.schedule.repository;

import com.nitech.schedule.domain.Contact;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class ContactRepository {


    public List<Contact> chargeContactList() throws IOException {
        List<Contact> contactList;
        Reader reader = Files.newBufferedReader(Paths.get("src/main/java/com/nitech/schedule/data/contact.csv"));
            CsvToBean<Contact> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(Contact.class)
                    .build();
            contactList = new ArrayList<Contact>();
            contactList = csvToBean.parse();
            return contactList;
    }
    public List<Contact> findContactAll() throws IOException {
        return this.chargeContactList();
    }

    public Contact findContactById(UUID id) throws IOException {

        Contact result = null;
        for(Contact contact : this.chargeContactList()){
            if(contact.getUuid().equals(id)){
                result = contact;
                break;
            }
        }
        return result;
    }

}
