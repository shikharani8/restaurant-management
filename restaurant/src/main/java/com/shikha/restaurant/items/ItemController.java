package com.shikha.restaurant.items;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Shikha
 */
@RestController
@RequestMapping("/admin/item")
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;
    ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping
    public ResponseEntity<List<Item>> listItems() {
        return ResponseEntity.ok(itemService.findAll());
    }

    @PostMapping("/upload")
    public ResponseEntity<List<Item>> uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
        try {
            List<Item> uploadedItems = new ArrayList<>()
;            List<Item> items = objectMapper.readValue(file.getInputStream(), new TypeReference<List<Item>>(){});
            items.forEach(item -> {
                uploadedItems.add(itemService.save(item));
            });
            return ResponseEntity.ok(uploadedItems);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to parse file: " + e.getMessage());
        }
    }
}
