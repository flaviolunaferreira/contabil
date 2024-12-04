package the.coyote.contabil.service;

import java.util.List;

import org.springframework.stereotype.Service;

import the.coyote.contabil.model.dto.grupo.TodosGruposResponseDto;

@Service
public interface GrupoService {

    List<TodosGruposResponseDto> todosGrupos();

}
