package ch.bbw.zork.models;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class FurnitureModel {
    Integer id;
    String name;
    String description;
    Integer itemToOpen;
    Integer itemInSide;
}
