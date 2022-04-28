package com.nitech.schedule.repository;

import com.nitech.schedule.domain.Contact;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class ContactRepository {
    private List<Contact> contactList;

    public ContactRepository(){
        contactList = new ArrayList<Contact>();
        contactList.add(new Contact(UUID.fromString("57F2B390-5D82-11E0-84CC-002170FBAC5B"), "Rivaldo Guimarães",
                "rivaldo.glima@yahdoo.com", "github.com/rivaldogljunior", "819529157"));
        contactList.add(new Contact(UUID.fromString("57F2B391-5D82-11E0-84CC-002170FBAC5B"), "Joeliza Barreto",
                "joeliza.barreto@yahdoo.com", "github.com/joelizacbarretos", "8189652147"));
        contactList.add(new Contact(UUID.fromString("57F2B392-5D82-11E0-84CC-002170FBAC5B"), "Pedro Artur",
                "pedro.art@gnail.com", "github.com/pedroart", "8158471258"));
        contactList.add(new Contact(UUID.fromString("57F2B393-5D82-11E0-84CC-002170FBAC5B"), "Artemísia Tália",
                "artemisia.talia@gnail.com", "github.com/rivaldogljunior", "819529157"));
    }

    public List<Contact> findContactAll(){
        return this.contactList;
    }

    public Contact findContactById(UUID id){
        Contact result = null;
        for(Contact contact : contactList){
            if(contact.getId().equals(id)){
                result = contact;
                break;
            }
        }
        return result;
    }

}
