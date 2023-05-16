package kz.itstep;

import org.springframework.stereotype.Component;

public class MyRepository {
    public MyRepository(String db) {
        this.db = db;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    private String db;
    public void findAll(){
        System.out.println("Find all");
    }
    public void findById(Long id){
        System.out.println(id + " Found");
    }
}
