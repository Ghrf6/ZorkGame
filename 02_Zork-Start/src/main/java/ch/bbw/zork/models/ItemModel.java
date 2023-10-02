package ch.bbw.zork.models;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class ItemModel {
    Integer id ;
    String name;
    String description;

}
