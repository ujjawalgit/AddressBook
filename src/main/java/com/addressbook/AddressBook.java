package com.addressbook;

public class AddressBook {
    public String BookName;
    public String FirstName;
    public String LastName;
    public String Address;
    public String City;
    public int Zip;
    public String State;
    public long PhoneNumber;
    public String Email;
    /**
     * This is a parameterized constructor having the given parameters.
     * @param BookName
     * @param FirstName
     * @param LastName
     * @param Address
     * @param City
     * @param Zip
     * @param State
     * @param PhoneNumber
     * @param Email
     */
    public AddressBook(String BookName, String FirstName, String LastName, String Address, String City, int Zip,
                       String State, long PhoneNumber, String Email) {
        this.BookName = BookName;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
        this.City = City;
        this.Zip = Zip;
        this.State = State;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
    }
    /**
     * this constructor will work if we'll not pass any parameters.
     */
    public AddressBook(){

    }
    /**
     * this method will return all initialised values.
     * @return string.
     */
    @Override
    public String toString() {
        return BookName + " " + FirstName + " " + LastName + " " + Address + " " + City + " " + Zip + " " + State + " "
                + PhoneNumber + " " + Email;
    }
}