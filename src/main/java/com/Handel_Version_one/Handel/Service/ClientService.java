package com.Handel_Version_one.Handel.Service;

import com.Handel_Version_one.Handel.Model.Registeration;
import com.Handel_Version_one.Handel.Repository.ClientRegi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    ClientRegi clientRegi;
    public Registeration addClientService(Registeration reg)
    {

        return this.clientRegi.save(reg);

    }
}
