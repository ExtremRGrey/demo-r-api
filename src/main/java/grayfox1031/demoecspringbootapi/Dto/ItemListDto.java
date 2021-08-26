package grayfox1031.demoecspringbootapi.Dto;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
//@JsonIgnoreProperties(ignoreUnknown=true)
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemListDto {

    private List<ItemsDto> items = null;
    private Integer pageCount;
    private List<String> TagInformation = null;
    private Integer hits;
    private Integer last;
    private Integer count;
    private Integer page;
    private Integer carrier;
    private List<String> GenreInformation = null;
    private Integer first;

//    @JsonIgnoreProperties(ignoreUnknown=true)
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
