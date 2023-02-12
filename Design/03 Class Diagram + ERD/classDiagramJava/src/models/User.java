package models;

import java.util.List;

public abstract class User {
    private String id;
    private String name;
    private String contact_no;
    private String email;
    private String address;
    private List<Tag> tags;
}
