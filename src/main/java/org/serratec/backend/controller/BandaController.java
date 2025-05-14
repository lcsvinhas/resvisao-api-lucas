package org.serratec.backend.controller;

import org.serratec.backend.entity.Banda;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/bandas")
public class BandaController {
    private static List<Banda> bandas = new ArrayList<>();

    static {
        bandas.add(new Banda(100L, "Djavan", "Bossa Nova"));
        bandas.add(new Banda(200L, "Lady Gaga", "Pop"));
        bandas.add(new Banda(300L, "Led Zeppelin", "Rock"));
        bandas.add(new Banda(400L, "Air Supply", "Pop"));
    }

    @GetMapping
    public List<Banda> listar() {
        return bandas;
    }

    @GetMapping("/{id}")
    public Banda buscar(@PathVariable Long id) {
        for (Banda banda : bandas) {
            if (banda.getId().equals(id)) {
                return banda;
            }
        }
        return null;
    }

    @PostMapping
    public Banda adicionar(@RequestBody Banda banda) {
        bandas.add(banda);
        return banda;
    }

    @GetMapping("/nome")
    public Banda buscar(@RequestParam String nome) {
        for (Banda banda : bandas) {
            if (banda.getNome().equals(nome)) {
                return banda;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public Banda apagar(@PathVariable Long id) {
        for (Banda banda : bandas) {
            if (banda.getId().equals(id)) {
                bandas.remove(banda);
                return banda;
            }
        }
        return null;
    }

    @PutMapping("/{id}")
    public Banda atualizar(@PathVariable Long id, @RequestBody Banda banda) {
        for (Banda b : bandas){
            if (b.getId().equals(id)){
                banda.setId(id);
                bandas.set(bandas.indexOf(b), banda);
                return banda;
            }
        }
        return null;
    }
}
