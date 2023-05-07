package com.ArgProg.backend.controller;

import com.ArgProg.backend.Model.Estudio;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @GetMapping("/opcionesVista")
    public OpcionesVista getOpcionesVista(){
        return null;
    }
    @PutMapping("/set/opcionesVista")
    public void setOpcionesVista(@RequestBody OpcionesVista opVista, @RequestBody Long id){
        return null;
    }
    
    @GetMapping("/usuario")
    public DatosUsuario getOpcionesVista(){
        return null;
    }
    @PutMapping("/set/opcionesVista")
    public void setOpcionesVista(@RequestBody DatosUsuario datosUser){
        return null;
    }
    
    @GetMapping("/estudios")
    public List<Estudio> getEtudios(){
        return null;
    }
    @PostMapping("/create/estudio")
    public void createEstudio(@RequestBody Estudio estudio){
        return null;
    }
    @PutMapping("/set/opcionesVista")
    public void setEstudio(@RequestBody Estudio estudio){
        return null;
    }
}
