package com.example.springboot_rest.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity()
@Table(name="groups")
public class Group{
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="group_name")
    private String groupName;

    public Group(long id, String groupName) {
        this.id = id;

        this.groupName = groupName;
    }

    public Group(String groupName) {
        this.groupName = groupName;
    }
    public Group(){}


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getGroupByName() {
        return groupName;
    }

    public void setGroup(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group that = (Group) o;
        return id == that.id && Objects.equals(groupName, that.groupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, groupName);
    }
}
