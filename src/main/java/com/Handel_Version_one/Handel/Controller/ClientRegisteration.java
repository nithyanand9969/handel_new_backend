package com.Handel_Version_one.Handel.Controller;

import com.Handel_Version_one.Handel.Model.Registeration;
import com.Handel_Version_one.Handel.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController

@RequestMapping("/client")
public class ClientRegisteration {
    @Autowired
    ClientService clientService;
    @PostMapping("/registeration")
    public Registeration addData(@RequestBody Registeration regi)
    {
    return this.clientService.addClientService(regi);
    }

}
