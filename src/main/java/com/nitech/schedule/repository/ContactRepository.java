package com.nitech.schedule.repository;

import com.nitech.schedule.domain.Contact;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class ContactRepository {
    private List<Contact> contactList;


    public ContactRepository() throws IOException {
        System.out.println("*********************************");

        Reader reader = Files.newBufferedReader(Paths.get("src/main/java/com/nitech/schedule/data/contact.csv"));
        CsvToBean<Contact> csvToBean = new CsvToBeanBuilder(reader)
                .withType(Contact.class)
                .build();
        this.contactList = new ArrayList<Contact>();
        this.contactList = csvToBean.parse();               
        this.contactList.add(new Contact(UUID.fromString("57F2B390-5D82-11E0-84CC-002170FBAC5B"), "Rivaldo Guimarães",
                "rivaldo.glima@yahdoo.com", "github.com/rivaldogljunior", "819529157"));
        this.contactList.add(new Contact(UUID.fromString("57F2B391-5D82-11E0-84CC-002170FBAC5B"), "Joeliza Barreto",
                "joeliza.barreto@yahdoo.com", "github.com/joelizacbarretos", "8189652147"));
        this.contactList.add(new Contact(UUID.fromString("57F2B392-5D82-11E0-84CC-002170FBAC5B"), "Pedro Artur",
                "pedro.art@gnail.com", "github.com/pedroart", "8158471258"));
        this.contactList.add(new Contact(UUID.fromString("57F2B393-5D82-11E0-84CC-002170FBAC5B"), "Artemísia Tália",
                "artemisia.talia@gnail.com", "github.com/rivaldogljunior", "819529157"));
        this.contactList.add(new Contact(UUID.fromString("57F2B394-5D82-11E0-84CC-002170FBAC5B"), "Maria Feitosa",
                "maria.feitosa@gnail.com", "github.com/mariafeitosa", "819529157"));
        this.contactList.add(new Contact(UUID.fromString("57F2B395-5D82-11E0-84CC-002170FBAC5B"), "Rodolfo Antunes",
                "r.antunes@yahodoo.com", "github.com/rodolfoantunes", "819529157"));
        this.contactList.add(new Contact(UUID.fromString("57F2B396-5D82-11E0-84CC-002170FBAC5B"), "Ricardo Ribeiro Brito",
                "rr.brito@gnail.com", "github.com/ricardorbrito", "819529157"));
        this.contactList.add(new Contact(UUID.fromString("57F2B397-5D82-11E0-84CC-002170FBAC5B"), "Jéssica da Silva",
                "jsilva@gnail.com", "github.com/jessicasilva", "819529157"));
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
