package tn.esprit.spring.RestControllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Services.IServiceCrud;
import tn.esprit.spring.ServicesImplementation.CrudService;

import java.util.List;

@RequiredArgsConstructor
@Slf4j

public class CrudController<T> {

    public static final String ROOT_ENDPOINT = "/api";

    protected final IServiceCrud<T> iServiceCrud;


    @GetMapping(value = "")
    public ResponseEntity<List<T>> listAllT() {
        List<T> datas = this.iServiceCrud.findAll();
        return new ResponseEntity<>(datas, HttpStatus.OK);
    }


    @PostMapping(value = "")
    public ResponseEntity<T> createT(@RequestBody T data) {
        data = this.iServiceCrud.createData(data);
        return new ResponseEntity<>(data, HttpStatus.CREATED);
    }

    // Update DATA
    @PutMapping(value = "/{id}")
    public ResponseEntity<T> update(@PathVariable("id") Long id, @RequestBody T data) {
        data = this.iServiceCrud.updateData(id, data);
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") Long id) {
        this.iServiceCrud.deleteData(id);
        return new ResponseEntity<>(true, HttpStatus.OK);
    }


}

