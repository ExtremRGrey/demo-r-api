package grayfox1031.demoecspringbootapi.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import java.util.List;

import java.util.HashMap;
import java.util.Map;

@Data
//@JsonIgnoreProperties(ignoreUnknown=true)
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemsDto {

    private List<ItemDto> item = null;

//    @JsonIgnoreProperties(ignoreUnknown=true)
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
