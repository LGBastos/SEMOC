package mobile.com.ucsal.semoc.DAO;

import java.io.Serializable;
import java.util.Arrays;

import mobile.com.ucsal.semoc.model.ItemCronograma;

public class MesaRedondaDAO extends MasterDAO implements Serializable {
    public MesaRedondaDAO() {
        this.lista =  Arrays.asList(new ItemCronograma("18h30 às 21h", "17/10",
                        "ABERTURA\n"
                        ,"Profa. Dra. Roberta Gontijo - Reitora\n" +
                        "Prof. Dr. Deivid Carvalho Lorenzo - Pró Reitor de Graduação\n" +
                        "Profa. Dra. Silvana Sá de Carvalho\n\n" +
                        "CONFERÊNCIA DE ABERTURA\n\n" +
                        "Profa. Dra. Theresinha Guimarães Miranda (UFBA)\n" +
                        "Prof. Dr. João Danilo Batista de Oliveira (UNEB e CEE-BA)\n" +
                        "Alexandre Carvalho Baroni (SJDHDS-BA)\n" +
                        "Moderação: Matheus Martins de Oliveira (UCSAL e OAB-BA)","AUDITÓRIO TÉRREO - BLOCO A"),
                new ItemCronograma("09h30 às 12h",
                        "18/10",
                        "EIXO 2: DIVERSIDADE, ALTERIDADE E EDUCAÇÃO INCLUSIVA\n",
                        "Mesa-redonda: A Jurisdição Constitucional e a Defesa das Constituições Normativas\n" +
                                "Coordenação: Prof. Dr. Dirley da Cunha Júnior (UCSAL)\n" +
                                "Participantes:\n" +
                                "Profa. Me. Ana Cláudia Gusmão Cunha (UCSAL)\n" +
                                "Prof. Me. André Quadros Côrtes (UCSAL)\n" +
                                "Eugênia Vilk Sturaro (UCSAL)\n" +
                                "Moderação: Me. Andrea Boczar (UCSAL)\n",
                        "AUDITÓRIO TERREO - BLOCO A"
                ),
                new ItemCronograma(
                        "09h30 às 12h",
                        "18/10",
                        "EIXO 2: DIVERSIDADE, ALTERIDADE E EDUCAÇÃO INCLUSIVA",
                        "Mesa-redonda: Acessibilidade em Escolas Municipais: ir, estar e voltar\n" +
                                "Coordenação: Matheus Martins de Oliveira (UCSAL)\n" +
                                "Participantes:\n" +
                                "Me. Nadjane Crisóstomo Prado (UCSAL)\n" +
                                "Silvânia Mendes Libório Leão (UNIME)\n" +
                                "Valdirene Santos de Sena (UCSAL)\n" +
                                "Moderação: Me. Milton Silva Vasconcellos (UCSAL)",
                        "SALA 201 BLOCO B"
                ),
                new ItemCronograma(
                        "09h30 às 12h",
                        "18/10",
                        "EIXO 3 - POVOS TRADICIONAIS E O DIREITO AO TERRITÓRIO",
                        "Mesa-redonda: Povos tradicionais e o direito ao território\n" +
                                "Coordenação: Débora Carol Luz da Porciuncula\n" +
                                "Participantes:\n" +
                                "Dona Donana, Mãe espiritual do Quilombo Quingoma\n" +
                                "Prof. Dr. Paulo Rosa Torres (Universidade Estadual de Feira de Santana)\n" +
                                "Prof. Dr. Gregório Mesa Cuadros (Universidad Nacional de Colombia)\n" +
                                "Sra. Rita Ferreira (MSTB)\n" +
                                "Moderação: Prof. Dr. Manuel Vitor Portugal Gonçalves e Profa. Me. Vinnie Mayana\n" +
                                "Lima Ramos\n",
                        "ONLINE - YouTube - UCSAL Oficial"
                ),
                new ItemCronograma(
                        "14h às 16h30",
                        "18/10",
                        "EIXO 4 : EDUCAÇÃO BIOÉTICA E DIREITO UNIVERSAL À VIDA\n",
                        "Mesa redonda: O Olhar na História para Identificar os Caminhos da Ciência\n" +
                                "Coordenação: Profa. Dra. Kátia Oliver de Sá (UCSAL)\n" +
                                "Participantes:\n" +
                                "Me. Stela Gleide Oliveira Santana Lago (UCSAL)\n" +
                                "Me. Marcella Pinto de Almeida (UCSAL)\n" +
                                "Me. Ademir Silva (UNEB)\n",
                        "AUDITÓRIO TÉRREO - BLOCO A"
                ),
                new ItemCronograma(
                        "18h30 às 21h",
                        "18/10",
                        "EIXO 2 - DIVERSIDADE, ALTERIDADE E EDUCAÇÃO INCLUSIVA",
                        "Mesa redonda: O PIBID e a Residência Pedagógica na UCSAL: Desafios e experiências\n" +
                                "da Inclusão na Educação Básica e a Formação de Professores\n" +
                                "Coordenação: Profa. Dra. Liliane Vasconcelos (UCSAL) e Profa. Me. Alessandra\n" +
                                "Carvalho(UCSAL)\n" +
                                "Participantes:\n" +
                                "Prof. Me. Eduardo Bertussi (UCSAL)\n" +
                                "Prof. Me. João Luciano Gomes (UCSAL)\n" +
                                "Prof. Me. José Abbade (UCSAL)\n" +
                                "Profa. Dra. Luciana Martins (UCSAL)\n" +
                                "Profa. Dra. Rujane Mota Alves (UCSAL)\n" +
                                "Profa. Esp. Jucy Silva (CEEBC/STEVE BIKO)\n" +
                                "Profa. Dra. Josenilda Pinto Mesquita (UCSAL)\n" +
                                "Profa. Me. Luciene dos Reis Santos (CEEBC/FAMEC)\n" +
                                "Profa. Me. Odete Amanda Guerreiro Rodrigues Martinez (UCSAL)\n" +
                                "Profa.Me. Anna Paola Misi (UCSAL)",
                        "AUDITÓRIO TÉRREO - BLOCO A"
                ),
                new ItemCronograma(
                        "18h30 às 21h",
                        "18/10",
                        "EIXO 2 - DIVERSIDADE, ALTERIDADE E EDUCAÇÃO INCLUSIVA\n",
                        "Mesa-redonda: Instrumentos democráticos por uma educação inclusiva e efetiva\n" +
                                "Coordenação: Claudio Queiroz (UCSAL)\n" +
                                "Participantes:\n" +
                                "Lívia Mesquita Borges (SERDOWN)\n" +
                                "Lucas Teles Oliveira (OAB-BA)\n" +
                                "Silvanete Brandão (COMPED-SSA)\n" +
                                "Josenita Luz (MLPCDI-LF)\n" +
                                "Moderação: Camilla Mota (OAB-LF)\n",
                        "AUDITÓRIO DA PÓS"
                ),
                new ItemCronograma(
                        "18h30 às 21h",
                        "18/10",
                        "EIXO 1: RACISMO AMBIENTAL, REFUGIADOS AMBIENTAIS, POLÍTICAS PÚBLICAS E\n" +
                                "INCLUSÃO SOCIAL\n",
                        "Mesa-redonda: Instrumentos democráticos por uma educação inclusiva e efetiva\n" +
                                "Coordenação: Claudio Queiroz (UCSAL)\n" +
                                "Participantes:\n" +
                                "Lívia Mesquita Borges (SERDOWN)\n" +
                                "Lucas Teles Oliveira (OAB-BA)\n" +
                                "Silvanete Brandão (COMPED-SSA)\n" +
                                "Josenita Luz (MLPCDI-LF)\n" +
                                "Moderação: Camilla Mota (OAB-LF)\n",
                        "SALA 201 BLOCO B"
                ),
                new ItemCronograma(
                        "09h30 às 12h",
                        "19/10",
                        "EIXO 3 - POVOS TRADICIONAIS E O DIREITO AO TERRITÓRIO",
                        "Mesa-redonda: Direito à moradia e violações na pandemia de COVID-19\n" +
                                "Coordenação: Profa. Dra. Liana Viveiros (UCSAL)\n" +
                                "Participantes:\n" +
                                "Profa. Dra. Adriana Nogueira Vieira Lima (UEFS)\n" +
                                "Gilson Santiago Macedo Júnior (Rede Nordeste de\n" +
                                "Monitoramento e Incidência em Conflitos Fundiários Urbanos)\n" +
                                "Guillem Domingo (Observatori de Drets Econòmics, Socials i Culturals - ODESC)\n" +
                                "Maura Cristina da Silva (Articulação do Centro Antigo de\n" +
                                "Salvador/ Campanha Despejo Zero - Bahia)\n" +
                                "Prof. Dr. Raúl Márquez Porras (Universidad de Barcelona)",
                        "Online Youtube - UCSAL Oficial"
                ),
                new ItemCronograma(
                        "09h30 ás 12h",
                        "19/10",
                        "EIXO 4 : EDUCAÇÃO BIOÉTICA E DIREITO UNIVERSAL À VIDA",
                        "Mesa-redonda: Criminologia Crítica na América Latina: Punitivismo e Direitos\n" +
                                "Humanos\n" +
                                "Coordenação: Prof. Dr. Fábio Roque (UCSAL) e Profa. Dra. Fernanda Ravazzano\n" +
                                "(UCSAL)\n" +
                                "Participantes:\n" +
                                "Kalita Paixão (UCSAL)\n" +
                                "João de Melo Cruz Filho (UCSAL)\n" +
                                "Jocimar Sol de Macedo (UCSAL)\n" +
                                "Revardiere Assunção (UCSAL)",
                        "AUDITÓRIO TERREO - BLOCO B"
                ),
                new ItemCronograma(
                        "09h30 às 12h",
                        "19/10",
                        "EIXO 2 - DIVERSIDADE, ALTERIDADE E EDUCAÇÃO INCLUSIVA",
                        "Mesa-redonda: Inclusão educacional das pessoas com deficiência e boas práticas\n" +
                                "Coordenação: Profa. Me. Lea Maria Medeiros (UCSAL)\n" +
                                "Participantes:\n" +
                                "Silvia Bezerra Pereira (UCSAL)\n" +
                                "Marcos Filipe de Carvalho (UNEB)\n" +
                                "Prof. Me. Carlos Coutinho (UCSAL)",
                        "SALA 201 BLOCO B"
                ),
                new ItemCronograma(
                        "09h30 às 12h",
                        "19/10",
                        "EIXO 5: O PAPEL DA COMUNIDADE E DA FAMÍLIA NA EDUCAÇÃO INCLUSIVA",
                        "Mesa-redonda: Famílias e Educação: Novos olhares e reflexões sobre inclusão social\n" +
                                "Coordenação: Profa. Dra. Livia Alessandra Fialho da Costa (UCSAL)\n" +
                                "Participantes:\n" +
                                "Olgair Marques da Silva (UCSAL)\n" +
                                "Sandra Alves Moura de Jesus (UCSAL)\n" +
                                "Anderson dos Santos Dias (UCSAL)\n" +
                                "Me. Jane de Jesus Soares (UCSAL)\n" +
                                "Me. Cesar Oliveira Carneiro (UCSAL)",
                        "AUDITÓRIO DA PÓS"
                ),
                new ItemCronograma(
                        "14h às 16h30",
                        "19/10",
                        "EIXO 5: O PAPEL DA COMUNIDADE E DA FAMÍLIA NA EDUCAÇÃO INCLUSIVA",
                        "Mesa redonda: A pessoa com deficiência no ensino superior: desafios e conquistas\n" +
                                "Coordenação: Profa. Dra. Sumaia Midlej Pimentel Sá (UCSAL)\n" +
                                "Participantes:\n" +
                                "Profa. Dra. Juliana Viana Freitas (UNEB e Faculdade Santa Casa)\n" +
                                "Profa. Dra. Claudia Paranhos de Jesus Portela (UNEB)\n" +
                                "Jornalista Marcelo Cavalcanti Moita (SECOM/PMS)",
                        "AUDITÓRIO TERREO - BLOCO A"
                ),
                new ItemCronograma(
                        "18h30 ás 21h",
                        "19/10",
                        "EIXO 3: POVOS TRADICIONAIS E O DIREITO AO TERRITÓRIO",
                        "Mesa-redonda: A questão racial na educação e a luta por direitos\n" +
                                "Coordenação: Profa. Me. Germana Pinheiro (UCSAL)\n" +
                                "Participantes:\n" +
                                "Rudolf Specht (UCSAL)\n" +
                                "Me. Jonata William (UFBA)\n" +
                                "Me. Dandara Pinho (UFF)\n" +
                                "Moderação: Liz Felix (UCSAL)\n",
                        "AUDITÓRIO TÉRREO - BLOCO A"
                ),
                new ItemCronograma(
                        "18h30 às 21h",
                        "19/10",
                        "EIXO 2 - DIVERSIDADE, ALTERIDADE E EDUCAÇÃO INCLUSIVA",
                        "Mesa-redonda: A figura do poliedro em tempos de crise: o processo de inclusão e\n" +
                                "diálogo fraterno\n" +
                                "Coordenação: Prof. Dr. Pe Jairo de Jesus Menezes (UCSAL)\n" +
                                "Participantes:\n" +
                                "Profa. Dra. Iracema Vasconcelos (UCSAL)\n" +
                                "Giovane Souza Cruz (UCSAL)\n" +
                                "Esp. Sergio Esteban González Martínez (UCSAL)",
                        "AUDITÓRIO DA PÓS"
                ),
                new ItemCronograma(
                        "09h30 às 12h",
                        "20/10",
                        "EIXO 3 - POVOS TRADICIONAIS E O DIREITO AO TERRITÓRIO",
                        "Mesa-redonda: As cidades digitais, o Governo eletrônico e a participação popular\n" +
                                "Coordenação: Prof. Dra. Silvana Sá de Carvalho (UCSAL)\n" +
                                "Participantes:\n" +
                                "Profa. Dra. Mariana Lameira de Souza (UMINHO)\n" +
                                "Prof. Dr. Arnaldo Bispo de Jesus (UCSAL)\n" +
                                "Me. Ricardo Marques Carrera (UCSAL)\n" +
                                "Prof. Me. Rubens Mario Ribeiro Pacheco (Moderniza Consultoria Empresarial/UNEB)",
                        "ONLINE Youtube - UCSAL Oficial"
                ),
                new ItemCronograma(
                        "09h30 às 12h",
                        "20/10",
                        "EIXO 4 - EDUCAÇÃO BIOÉTICA E DIREITO UNIVERSAL À VIDA",
                        "Mesa-redonda: Bioética e Relação Médico-Paciente\n" +
                                "Coordenação: Profa. Dra. Ana Thereza Meirelles (UCSAL)\n" +
                                "Participantes:\n" +
                                "Júlia Sousa (UCSAL)\n" +
                                "Adriana Zollinguer (UCSAL)\n" +
                                "Jacira Dantas (UCSAL)\n" +
                                "Henrique Princhak (UCSAL)\n" +
                                "Bruno Gil (UCSAL)",
                        "AUDITORIO TERRO - BLOCO A"
                ),
                new ItemCronograma(
                        "09h30 ás 12h",
                        "20/10",
                        "EIXO 1 - RACISMO AMBIENTAL, REFUGIADOS AMBIENTAIS, POLÍTICAS PÚBLICAS E\n" +
                                "INCLUSÃO SOCIAL\n",
                        "Mesa redonda: Racismo Ambiental, Refugiados Ambientais, Políticas Públicas e\n" +
                                "Inclusão Social\n" +
                                "Coordenação: Profa. Dra. Julie Sarah Lourau Alves da Silva (UCSAL)\n" +
                                "Participantes:\n" +
                                "Prof. Dr. Maitu Abibo Buanango (Faculdade de Ciências de Saúde da Universidade de\n" +
                                "Zambeze, Moçambique)\n" +
                                "Prof. Dr. Farã Cafacaiã Vaz (UFRS)\n" +
                                "Prof. Dr. Bas’Ilele Malomalo (UNILAB/UCSAL)",
                        "AUDITÓRIO DA PÓS"
                ),
                new ItemCronograma(
                        "18h30 às 21h",
                        "20/10",
                        "EIXO 2: DIVERSIDADE, ALTERIDADE E EDUCAÇÃO INCLUSIVA",
                        "Mesa-redonda: Paradigmas, Constituição e Educação para e pelos Direitos Humanos\n" +
                                "Coordenação: Prof. Dr. Deivid Carvalho Lorenzo (UCSAL)\n" +
                                "Participantes:\n" +
                                "Maria Tereza de Jesus Damasceno Rodrigues (UCSAL)\n" +
                                "Maria Carolina Dannemann Sampaio (UCSAL)\n" +
                                "Rodrigo Bastos de Araujo (UCSAL)\n" +
                                "Matheus Martins de Oliveira (UCSAL)\n" +
                                "Moderação: Licia Ferreira Reis (UCSAL)",
                        "ONLINE Youtube - UCSAL Oficial"
                ),
                new ItemCronograma(
                        "18h30 às 21h",
                        "20/10",
                        "EIXO 1: RACISMO AMBIENTAL, REFUGIADOS AMBIENTAIS, POLÍTICAS PÚBLICAS E\n" +
                                "INCLUSÃO SOCIAL",
                        "Mesa-redonda: Constituição, Política e Instituições Judiciais\n" +
                                "Coordenação: Prof. Dr. Alexandre Douglas Zaidan (UCSAL)\n" +
                                "Participantes:\n" +
                                "Gabriel Antonio Pereira Santos (UCSAL)\n" +
                                "Florisvaldo Pasquinha (UCSAL)\n" +
                                "Marcus Vinicius Lopes (UCSAL)\n" +
                                "Gabriel Muniz Carletto (UCSAL)\n" +
                                "Érica Silva Teixeira (UNIFACS)\n" +
                                "Thaís Fazzio (ALBA)\n",
                        "AUDITÓRIO DA PÓS"
                )
        );
    }


}
