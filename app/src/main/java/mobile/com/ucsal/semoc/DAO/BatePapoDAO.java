package mobile.com.ucsal.semoc.DAO;

import java.io.Serializable;
import java.util.Arrays;

import mobile.com.ucsal.semoc.model.ItemCronograma;

public class BatePapoDAO extends MasterDAO implements Serializable {

    public BatePapoDAO(){
        this.lista =  Arrays.asList(
                new ItemCronograma(
                        "09h às 10h",
                        "18/10",
                        "BATE PAPO SOBRE O CEP",
                        "Comitê de Ética em Pesquisa\n" +
                                "Procedimentos de avaliação Ética na Pesquisa nos cursos de Graduação e\n" +
                                "Pós-Graduação\n" +
                                "Participantes:\n" +
                                "Prof. Dr. João Marcos de Oliveira Cavalcanti\n" +
                                "Prof. Dra. Fernanda Ravazzano Lopes Baqueiro\n" +
                                "Cristiane Lima dos Santos",
                        "SALA GOOGLE"
                ),
                new ItemCronograma(
                        "10h às 11h",
                        "18/10",
                        "BATE PAPO SOBRE O CEC",
                        "Centro de Escrita Científica\n" +
                                "Participantes:\n" +
                                "Profa. Dra. Liliane Vasconcelos de Jesus\n" +
                                "Profa. Dra. Kátia Oliver de Sá\n",
                        "SALA GOOGLE"
                ),
                new ItemCronograma(
                        "09h às 11h",
                        "20/10",
                        "BATE PAPO SOBRE CARREIRA PROFISSIONAL",
                        "Participantes:\n" +
                                "Profa. Me. Cristiane Carbonell Rabello\n" +
                                "Profa. Me. Maria Sampaio de Almeida\n",
                        "SALA GOOGLE"
                )
        );
    }
}
