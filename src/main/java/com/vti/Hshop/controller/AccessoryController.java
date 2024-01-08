package com.vti.Hshop.controller;

import com.vti.Hshop.dto.AccessoryDto;
import com.vti.Hshop.form.AccessoryCreateForm;
import com.vti.Hshop.form.AccessoryUpdateForm;
import com.vti.Hshop.service.AccessoryService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@AllArgsConstructor
@CrossOrigin("https://lengochai1402.github.io/")
public class AccessoryController {
    private final AccessoryService accessoryService;

    @GetMapping("/api/v1/accessories")
    public Page<AccessoryDto> findAll(Pageable pageable) {
        return accessoryService.findAll(pageable);
    }

    @PostMapping("/api/v1/accessories")
    public AccessoryDto create(@RequestBody @Valid AccessoryCreateForm form) {
        return accessoryService.create(form);
    }

    @PutMapping("/api/v1/accessories/{id}")
    public AccessoryDto update(@RequestBody @Valid AccessoryUpdateForm form,
                               @PathVariable Long id
    ) {
        return accessoryService.update(form, id);
    }

    @DeleteMapping("/api/v1/accessories/{id}")
    public void deleteById(@PathVariable Long id) {
        accessoryService.deleteById(id);
    }
}
