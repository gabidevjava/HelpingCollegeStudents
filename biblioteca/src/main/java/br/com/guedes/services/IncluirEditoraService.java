package br.com.guedes.services;

import br.com.guedes.model.Editora;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class IncluirEditoraService {

    public static void main(String... doYouBest) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("editoras");
        EntityManager em = emf.createEntityManager();

        Editora editora = new Editora();

        editora.setNome("GTX 1060");
        editora.setSite("okok.com");

        em.getTransaction().begin();
        em.persist(editora);
        em.getTransaction().commit();
        em.close();
    }
}
