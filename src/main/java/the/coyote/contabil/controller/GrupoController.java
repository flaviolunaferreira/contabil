package the.coyote.contabil.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import the.coyote.contabil.model.dto.grupo.TodosGruposResponseDto;
import the.coyote.contabil.service.GrupoService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/grupo")
public class GrupoController {

    private final GrupoService grupoService;

    @GetMapping("/")
    public ResponseEntity<List<TodosGruposResponseDto>> todosGrupos() {
        return ResponseEntity.ok().body(grupoService.todosGrupos());
    }
    

}
