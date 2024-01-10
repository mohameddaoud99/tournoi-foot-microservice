package tn.iit.microservice02.entity;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "match")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nom_stade")
    private String nom_stade;

    @Column(name = "ville")
    private String ville;

    @Column(name = "date")
    private String date;

    @OneToMany(mappedBy = "match", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    private Set<Equipe> comptes = new HashSet<>();


}
