package com.company;

public class Main {

    public static void main(String[] args) {
	Teacher t1 = new Teacher("Mahmut hoca","TRH","555");
    Teacher t2 = new Teacher("Ghram bell","FZK","000");
    Teacher t3 = new Teacher("Külyutmaz","BIO","111");



    Course tarih = new Course("tarih","101","TRH");
    tarih.addTeacher(t1);


    Course fizik = new Course("Fizik","102","FZK");
    fizik.addTeacher(t2);

    Course biyoloji = new Course("biyoloji","103","BIO");
    biyoloji.addTeacher(t3);

    Student s1 = new Student("inek şaban","123","4.sinif",tarih,fizik,biyoloji);
    s1.addBulkExamNote(100,10,50);
    s1.isPass();

    Student s2 = new Student("Güdük necmi","345","3.sinif",tarih,fizik,biyoloji);
    s2.addBulkExamNote(35,67,45);
    s2.isPass();
    }
}
