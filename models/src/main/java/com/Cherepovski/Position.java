package com.Cherepovski;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper=true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Position extends AbstractId{
    private String name;
}
