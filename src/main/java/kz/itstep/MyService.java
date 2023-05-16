package kz.itstep;

import org.springframework.stereotype.Service;

public class MyService {
    private MyRepository myRepository;

    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }
    public void findAllService(){
        myRepository.findAll();
    }
}


