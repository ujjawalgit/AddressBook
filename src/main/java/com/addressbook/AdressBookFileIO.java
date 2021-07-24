package com.addressbook;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AdressBookFileIO {
    public void writeData(List<AddressBook> addressBook){
        StringBuffer addressBookBuffer = new StringBuffer();
        addressBook.forEach(person ->{
            String personDataString = person.toString().concat("\n");
            addressBookBuffer.append(personDataString);
        });
        try {
            Files.write(Paths.get("C:\\Users\\ujjawal singh\\IdeaProjects\\addressbook\\src\\main\\resources\\addressbook.txt"),addressBookBuffer.toString().getBytes());
        }catch (IOException x){
            x.printStackTrace();
        }
    }

    public List<AddressBook> readData() {
        List<AddressBook> addressBookList = new ArrayList<AddressBook>();

        try {
            Files.lines(new File("C:\\Users\\ujjawal singh\\IdeaProjects\\addressbook\\src\\main\\resources\\addressbook.txt").toPath())
                    .map(line -> line.trim())
                    .forEach(line -> System.out.println(line));
        }catch (IOException x){
            x.printStackTrace();
        }
        return addressBookList;
    }
}