package com.abctreinamento.servidorpublico.controler;

import com.abctreinamento.servidorpublico.entity.ServidorPublico;
import com.abctreinamento.servidorpublico.service.ServidorPublicoService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
public class ServidorPublicoControler {

    private ServidorPublicoService servidorPublicoService;


    @GetMapping("/list")
    public List<ServidorPublico> listAll(){
        try {
            return servidorPublicoService.listAll();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @GetMapping("/list/{id}")
    public Optional<ServidorPublico> listByMatriculaServidorPublico(@PathVariable String id){
        try {
            return servidorPublicoService.listByMatriculaServidorPublico(id);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/save")
    public ResponseEntity<ServidorPublico> listByMatriculaServidorPublico(@RequestBody ServidorPublico servidorPublico){
        return ResponseEntity.ok(servidorPublicoService.save(servidorPublico));
    }

    @Autowired
    private void setServidorPublicoService(ServidorPublicoService servidorPublicoService){
        this.servidorPublicoService = servidorPublicoService;
    }

}
