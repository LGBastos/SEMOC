package mobile.com.ucsal.semoc.DAO;

import java.io.Serializable;
import java.util.Arrays;

import mobile.com.ucsal.semoc.model.ItemCronograma;

public class SemocJovemDAO extends MasterDAO implements Serializable {
    public SemocJovemDAO(){
        this.lista =  Arrays.asList(
                new ItemCronograma(
                        "08h30 às 09h30",
                        "19/10",
                        "Acolhimento",
                        "Profa. Dra. Roberta Gontijo - Reitora\n" +
                                "Prof. Dr. Deivid Carvalho Lorenzo - Pró Reitor de Graduação\n" +
                                "Conferência\n" +
                                "Iniciação Científica: para que serve?\n" +
                                "Pariticipantes:\n" +
                                "Thalita Santiago (UCSAL)\n" +
                                "Felipe Canto (UCSAL)",
                        ""
                ),new ItemCronograma(
                        "10h às 12h",
                        "19/10",
                        "APRESENTAÇÃO TEMÁTICA - ESTUDANTES ENSINO MÉDIO",
                        "Mediadores: Thalita Santiago (UCSAL)\n" +
                                "Artigos (Autores):\n" +
                                "1. APPANC: Desenvolvimento de um aplicativo para divulgação científica\n" +
                                "das PANCs (Heloisa Serra Rodrigues de Souza - Colégio Sesi)\n" +
                                "2. Planta faz isso? O podcast como ferramenta de divulgação científica\n" +
                                "(Rodrigo dos Santos Brito, Talita Alves Silva e Júlia Nascimento\n" +
                                "Barreto - Colégio Sesi)\n" +
                                "3. Tecnologia: Influência das mídias sociais no comportamento dos\n" +
                                "jovens (Elaine Passos e Gabriel Melo - Colégio Cleriston Andrade)\n" +
                                "4. Tecnologia e Juventude contemporânea: como os jovens acessam a\n" +
                                "informação? (Alice Gomes da Conceição - Colégio Sesi)\n" +
                                "5. A cultura do Cancelamento nas redes sociais: A percepção das\n" +
                                "relações de laços fortes e laços fracos (Isabela Ramos Santa Rita da\n" +
                                "Cruz - Colégio Sesi)\n" +
                                "6. Racismo Recreativo nas Mídias Digitais: Uma análise a partir dos\n" +
                                "realities shows (Klismann Schramm Souza - Colégio Sesi)\n" +
                                "7. A acessibilidade e o incentivo à leitura literária nas escolas estaduais\n" +
                                "do subúrbio de Salvador ( Sophia Santos Guimarães da Silva - Colégio\n" +
                                "Cleriston Andrade)",
                        "AUDITÓRIO TÉRREO - BLOCO A"
                ),new ItemCronograma(
                        "10h às 12h",
                        "19/10",
                        "APRESENTAÇÃO TEMÁTICA - ESTUDANTES ENSINO MÉDIO",
                        "Mediadores: Thalita Santiago (UCSAL)\n" +
                                "Artigos (Autores):\n" +
                                "1. APPANC: Desenvolvimento de um aplicativo para divulgação científica\n" +
                                "das PANCs (Heloisa Serra Rodrigues de Souza - Colégio Sesi)\n" +
                                "2. Planta faz isso? O podcast como ferramenta de divulgação científica\n" +
                                "(Rodrigo dos Santos Brito, Talita Alves Silva e Júlia Nascimento\n" +
                                "Barreto - Colégio Sesi)\n" +
                                "3. Tecnologia: Influência das mídias sociais no comportamento dos\n" +
                                "jovens (Elaine Passos e Gabriel Melo - Colégio Cleriston Andrade)\n" +
                                "4. Tecnologia e Juventude contemporânea: como os jovens acessam a\n" +
                                "informação? (Alice Gomes da Conceição - Colégio Sesi)\n" +
                                "5. A cultura do Cancelamento nas redes sociais: A percepção das\n" +
                                "relações de laços fortes e laços fracos (Isabela Ramos Santa Rita da\n" +
                                "Cruz - Colégio Sesi)\n" +
                                "6. Racismo Recreativo nas Mídias Digitais: Uma análise a partir dos\n" +
                                "realities shows (Klismann Schramm Souza - Colégio Sesi)\n" +
                                "7. A acessibilidade e o incentivo à leitura literária nas escolas estaduais\n" +
                                "do subúrbio de Salvador ( Sophia Santos Guimarães da Silva - Colégio\n" +
                                "Cleriston Andrade)",
                        "SALA GOOGLE"
                ),new ItemCronograma(
                        "10h às 12h",
                        "19/10",
                        "APRESENTAÇÃO TEMÁTICA - ESTUDANTES ENSINO MÉDIO",
                        "Mediador: Felipe Canto (UCSAL)\n" +
                                "Artigos (Autores):\n" +
                                "1. A Intolerância ao Candomblé em Salvador - BA nos anos de 2013 a\n" +
                                "2019. Como isso afeta a vida dos praticantes? (Maria Lara Andrade\n" +
                                "dos Santos - Colégio Sesi)\n" +
                                "2. A Arte Drag Queen: O Preconceito Artístico Pressuposto na Sociedade\n" +
                                "Contemporânea Brasileira (Thiago Santos do Amparo - Colégio Sesi)\n" +
                                "3. Festa de Labatut em Pirajá: Uma Celebração Justa? (Maria Eduarda\n" +
                                "Costa de Souza - Colégio Sesi)\n" +
                                "4. Descrições Espaciais Contidas no Livro Quarto de Despejo (Douglas\n" +
                                "Quirino de Oliveira Mota - Colégio Sesi)\n" +
                                "5. A eficiência dos métodos de aprendizagem de uma instituição de\n" +
                                "ensino, localizada na área periférica de Salvador, para a formação de\n" +
                                "novos profissionais (Andressa da Silva Bezerra e Carla Mirelli\n" +
                                "Cachoeira - Colégio Cleriston Andrade)\n" +
                                "6. Moradias em áreas de risco na capital baiana, a carência de vistorias e\n" +
                                "manutenção nesses locais e a consequência de optar morar em uma\n" +
                                "região perigosa (Thales Alencar Mota e Emilly Quirino Oliveira -\n" +
                                "Colégio Cleriston Andrade)\n" +
                                "7. Os impactos do desenvolvimento da construção dos Condomínios\n" +
                                "Residenciais Horto Bela Vista na região do Cabula (Albert Santos\n" +
                                "Calmon Gonzaga - Colégio Sesi)",
                        "BIBLIOTECA\n"
                ),new ItemCronograma(
                        "10h às 12h",
                        "19/10",
                        "APRESENTAÇÃO TEMÁTICA - ESTUDANTES ENSINO MÉDIO",
                        "Mediadores: Ícaro Sales (UCSAL) e Pollyanna Sampaio (UCSAL)\n" +
                                "Artigos (Autores):\n" +
                                "1. Juventude pós-pandemia: reflexos no comportamento e convivência\n" +
                                "familiar de jovens após a pandemia de COVID-19 (Raíssa da\n" +
                                "Conceição Pessoa e Beatriz Costa do Rosário - Colégio Cleriston\n" +
                                "Andrade)\n" +
                                "2. Valorização do Projeto de Vida nas Escolas (Gabriel Gomes Silva e\n" +
                                "Nicole Evelyn Rosa dos Santos Souza - Colégio Cleriston Andrade)\n" +
                                "3. Qualidade do Ambiente Desenvolvimento Escala Home (Douglas\n" +
                                "Freitas Lima e Anderson Nogueira Nascimento - Colégio Cleriston\n" +
                                "Andrade)\n" +
                                "4. A Perspectiva dos Cidadãos sobre a saúde pública na cidade de\n" +
                                "Salvador (Guilherme Rogério de Jesus e Evelly Oliveira de Jesus -\n" +
                                "Colégio Cleriston Andrade)\n" +
                                "5. A influência do acompanhamento psicológico na vida dos estudantes\n" +
                                "em escolas brasileiras (Eliene Alves Reis- Colégio Cleriston Andrade)\n" +
                                "6. A indisciplina no âmbito escolar por parte de discentes do ensino\n" +
                                "médio e fundamental em escolas estaduais da Bahia (Wellington\n" +
                                "Sobral Pinto - Colégio Cleriston Andrade)",
                        "SALA A 124"
                ), new ItemCronograma(
                        "10h às 12h",
                        "19/10",
                        "APRESENTAÇÃO TEMÁTICA - ESTUDANTES ENSINO MÉDIO",
                        "Mediadora: Milena Damasceno (UCSAL)\n" +
                                "Artigos (Autores):\n" +
                                "1. Religião e Violência Doméstica: Estudo de caso com mulheres-vítimas\n" +
                                "religiosas e não religiosas (Gabriela da Silva de Lima e Júlia da\n" +
                                "Conceição Santos - Colégio Cleriston Andrade)\n" +
                                "2. Assédio sexual e moral contra as mulheres no ambiente escolar: Um\n" +
                                "estudo feito diretamente com membros do CECA (Nicole Pereira Silva\n" +
                                "e Evelyn Yasmin Leal - Colégio Cleriston Andrade)\n" +
                                "3. A precarização do trabalho no porto das sardinhas: os desafios das\n" +
                                "mulheres/ mães solo no seu ofício de labor insalubre na baía de\n" +
                                "itapagipe, Salvador - BA - (Leonardo de Jesus Cruz de Souza - Colégio\n" +
                                "Sesi)\n" +
                                "4. O Instagram e o Tik tok como ferramentas de pressão estética sobre\n" +
                                "os adolescentes do Subúrbio Ferroviário de Salvador (Ana Carolina\n" +
                                "Correia e Noemi dos Santos Onofre - Colégio Cleriston Andrade)\n",
                        "SALA A 126"),
                new ItemCronograma(
                        "12h às 13h30",
                        "19/10",
                        "ALMOÇO ",
                        "",
                        "VILA UNIVERSITÁRIA"
                ),new ItemCronograma(
                        "13h30 ás 16h30",
                        "19/10",
                        "UCSAL DE PORTAS ABERTAS",
                        "Tour pelo Campus: Biblioteca, Sala Google, UNIENF, UNAFISIO, Serviço Escola\n" +
                                "Psicologia, Estúdios, Secretaria de Cursos, ECOA",
                        "AUDITÓRIO TÉRREO - BLOCO A"
                )
        );
    }
}
