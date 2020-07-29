package com.atguigu.spring5;

public class Book {
    private String bname;
    private String bauthor;

    public Book() {
    }

    public Book(String bname, String bauthor) {
        this.bname = bname;
        this.bauthor = bauthor;
    }

    // set方法注入
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void testDemo(){
        System.out.println(bauthor+" "+bname);
    }
}
