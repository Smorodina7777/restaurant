package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer num;
    private Integer cost;
    @OneToOne
    private Waiter waiter;
    @OneToOne
    private Tables table;
    @OneToMany
    @JoinColumn(name = "orders_id")
    private List<Dishes> dishes;




}
