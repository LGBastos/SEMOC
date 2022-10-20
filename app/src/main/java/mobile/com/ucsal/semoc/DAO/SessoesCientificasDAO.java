package mobile.com.ucsal.semoc.DAO;

import java.io.Serializable;
import java.util.Arrays;

import mobile.com.ucsal.semoc.model.ItemCronograma;

public class SessoesCientificasDAO extends MasterDAO implements Serializable {
    public SessoesCientificasDAO(){
        this.lista =  Arrays.asList(
                new ItemCronograma(
                        "09h às 12h",
                        "19/10",
                        "TEMA - BIOÉTICA E SAÚDE\n",
                        "Mediador: Rafael Verdival (UCSAL)\n" +
                                "Artigos (Autores):\n" +
                                "1. Direito Médico: A inadequação dos regimes jurídicos aplicados na relação\n" +
                                "paciente médico (Leonardo Morbeck Carvalho Moreira; Alessandro Timbó Nilo)\n" +
                                "2. Variação latitudinal da reprodução e a fecundidade de tedania ignis (Carla Juliana\n" +
                                "Souza Dias; Emilio de Lanna)\n" +
                                "3. Propranolol e Metimazol no tratamento da tireotoxicose (Thaís Almeida Miranda;\n" +
                                "Ively Paixão Santos; Laíle Roberta Souza Costa; Thassila Nogueira Pitanga)\n",
                        "SALA A118b"
                ),
                new ItemCronograma(
                        "09h às 12h",
                        "19/10",
                        "TEMA - COMUNIDADES TRADICIONAIS E FAMÍLIA",
                        "Mediador: Profa. Dra. Cristiane Cavalcante Moreira (UNEB)\n" +
                                "Artigos (Autores):\n" +
                                "1. Mudanças e permanências na rotina familiar durante a pandemia COVID-19\n" +
                                "(Sumaia Midlej Pimentel Sá; Juliana Viana Freitas)\n" +
                                "2. Os impactos da pandemia COVID-19 nas famílias de pessoas com deficiência\n" +
                                "(Juliana Viana Freitas; Sumaia Midlej Pimentel Sá; Daniele de Sá Sacramento\n" +
                                "Santana; Lissandra Carla Neri dos Santos; Taine Moura da Silva)\n" +
                                "3. Luto familiar diante da chegada do filho com deficiência: modificações na família e\n" +
                                "o experienciar da maternidade atípica (Matheus Wisdom Pedro de Jesus; Sueli\n" +
                                "Ribeiro Mota Souza)\n" +
                                "4. Atividades motoras-esportivas e deficiência: um estudo comparativo sobre as\n" +
                                "crenças das famílias (Lorenzo Cioni; Anderson Spavier Alves)\n" +
                                "*Intervalo*\n" +
                                "5. Inclusão escolar: acesso, permanência e aprendizado dos alunos com\n" +
                                "necessidades educacionais especiais (Daniele de Sá Sacramento Santana; Raildes da\n" +
                                "Cruz Alves)\n" +
                                "6. Os filhos de meus filhos: avosidade e transgeracionalidade em narrativas\n" +
                                "autobiográficas (Cinthia Barreto Santos Souza)\n" +
                                "7. Relacionamento fraterno em fase adulta: dinâmica e significado (Joana D'Arc Silva\n" +
                                "Santos; Elaine Pedreira Rabinovich)\n",
                        "SALA A120a"
                ),
                new ItemCronograma(
                        "09h às 12h",
                        "19/10",
                        "TEMA - POVOS TRADICIONAIS E TERRITÓRIO",
                        "Mediador: Profa. Dra. Cristina Maria Macedo de Alencar (UCSAL)\n" +
                                "Artigos (Autores):\n" +
                                "1. Usucapião e o direito a terra: conflitualidades rurais no município de São\n" +
                                "Felipe-BA (Felix Souza Santos)\n" +
                                "2. A disputa territorial entre a comunidade quilombola Rio dos Macacos e a marinha\n" +
                                "brasileira (Juliane Silva Santos; Mariana Oliveira Conceição; Filipe Mateus Lima\n" +
                                "Guimarães Trindade)\n" +
                                "3. Ocupação e formação da rua do SOS: um estudo de caso no bairro da Fazenda\n" +
                                "Grande do Retiro (Ana Clara da Anunciação Gomes; Mariana Oliveira Conceição)\n" +
                                "4. Conflitos no centro antigo e a ameaça da permanência de territórios populares: o\n" +
                                "caso do Tororó em Salvador-BA (Felipe Santos do Canto; Liana Viveiros)\n" +
                                "*Intervalo*\n" +
                                "5. Território em resistência: a ocupação Carlos Marighella (Salvador-BA) (Camille\n" +
                                "Oliveira Silva Gama; Aparecida Netto Teixeira)\n" +
                                "6. Políticas públicas de urbanização de favelas em áreas de borda marítima: estudo\n" +
                                "das comunidades de Mirante do Bonfim/Pedra furada e Vilamar (Salvador-BA)\n" +
                                "(Aparecida Netto Teixeira; Lanay Souza Fernandes)\n" +
                                "7. Remoção involuntária e racismo fundiário (Nadeje Martins da Rocha; Laila Nazem\n" +
                                "Mourad; Aparecida Netto Teixeira)\n" +
                                "8. A vulnerabilidade da mulher no mercado camelô da cidade de Santo Antônio de\n" +
                                "Jesus-BA (Jussara Alves Soares Argolo, Débora Carol Luz da Porciuncula, Laila Nazem\n" +
                                "Mourad)",
                        "SALA DE ATOS"
                ),
                new ItemCronograma(
                        "18h30 às 21h",
                        "19/10",
                        "TEMA - DIVERSIDADE E ALTERIDADE",
                        "Mediador: Profa. Ivone Pires Ferreira (UCSAL)\n" +
                                "Artigos (Autores):\n" +
                                "1. Desconstruindo barreiras na Universidade: um relato de experiência (Cristiane\n" +
                                "Cavalcanti Moreira; Juliana Viana Freitas; Sumaia Midlej Pimentel Sá; Angela da Silva\n" +
                                "Borges; Beatriz Cerqueira da Silva; Luis Carlos da Silva Passos)\n" +
                                "2. Epístola, segundo Rubião Bovary, aos sobreviventes: um estudo psicossocial sobre\n" +
                                "o negrogay (Antonio José de Souza; Elaine Pedreira Rabinovich)\n" +
                                "3. Violência doméstica contra mulher e os 16 anos da lei Maria da Penha (Tâmara de\n" +
                                "Souza Pinho; Teresa Cristina Ferreira de Oliveira)\n" +
                                "4. As mudanças na mobilidade urbana de salvador: uma análise da implantação do\n" +
                                "veículo leve sobre trilhos - VLT (monotrilho) e seus impactos socioambientais\n" +
                                "(Matheus Sousa dos Santos; Augusto César Copque; Messias Arcanjo dos Santos\n" +
                                "Mauricio)\n" +
                                "5. Canabidiol vs. Oxicodona: uma análise comparativa no tratamento de dores\n" +
                                "crônicas (Isabella dos Santos Sampaio; Leila Mota Nascimento da Silva; Thassila\n" +
                                "Nogueira Pitanga)\n",
                        "SALA DE ATOS"
                ),
                new ItemCronograma(
                        "18h30 às 21h",
                        "19/10",
                        "TEMA - METODOLOGIA, ENSINO E PESQUISA",
                        "Mediador: Diana Leia Silva (UCSAL)\n" +
                                "Artigos (Autores):\n" +
                                "1. Formação de docentes-pesquisadores indígenas no Brasil (Alfons Heinrich\n" +
                                "Altmicks; Anayme Aparecida Canton Altmicks)\n" +
                                "2. O professor e a educação inclusiva: notas sobre as condições de trabalho docente\n" +
                                "na rede pública de ensino (Karla Cilene Santos Sousa)\n" +
                                "3. Florim: visibilidade e inclusão na cena literária (Isabele Brotas do Rosário Macedo,\n" +
                                "Liliane Vasconcelos)\n" +
                                "4. Estudo e avaliação do desempenho de concreto dosado pelo método de Faury\n" +
                                "(José Marcílio Ladeia Vilasboas; Daiane Damasceno Félix; Juliana Araujo Magalhães)\n" +
                                "*Intervalo*\n" +
                                "5. Educação inclusiva pós isolamento social: a importância da linguagem para a\n" +
                                "prática pedagógica (Flávia Maria Cruz da França; Liliane Vasconcelos)\n" +
                                "6. Resíduos de serviços de saúde: educação ambiental para o curso de graduação em\n" +
                                "fisioterapia (Rejeane Santos da Conceição; Ana Paula Mendes Geitenes; Cristina Mª.\n" +
                                "D. F. Marchi)\n" +
                                "7. Educação e diversidade: o processo de transculturação na língua portuguesa\n" +
                                "(Lílian Magalhães Santos Lima; Liliane Vasconcelos)",
                        "SALA A118b"
                ),
                new ItemCronograma(
                        "20/10",
                        "9h às 12h",
                        "TEMA - RACISMO AMBIENTAL E REFUGIADOS AMBIENTAIS",
                        "Mediador: Jane de Jesus Soares (UCSAL)\n" +
                                "Artigos (Autores):\n" +
                                "1. Trânsito de Pirajá - uma análise social dos engarrafamentos na periferia de\n" +
                                "Salvador (Ana Leticia Vieira Santos Duarte; Leticia da Silva Ribeiro; Filipe Mateus\n" +
                                "Lima Guimarães Trindade)\n" +
                                "2. Incineração de resíduos sólidos: entrelaces com a educação inclusiva e o racismo\n" +
                                "ambiental (Joilson Santos Santana; Cristina Maria Dacach Fernandez Marchi)\n" +
                                "3. Desafios e oportunidades de uma perspectiva inclusiva: proposta de participação\n" +
                                "de catadores em pós-graduação lato sensu sobre manejo dos resíduos sólidos\n" +
                                "(Mirela Carvalho Ribeiro Bohana; Patricia Carla Barbosa Pimentel; Cristina Maria\n" +
                                "Dacach Fernandez Marchi)",
                        "SALA A118b"
                ),
                new ItemCronograma(
                        "20/10",
                        "9h às 12h",
                        "TEMA - EDUCAÇÃO INCLUSIVA",
                        "Mediador: Cesar Oliveira Carneiro (UCSAL)\n" +
                                "Artigos (Autores):\n" +
                                "1. Educação inclusiva: uma análise crítica do ordenamento jurídico brasileiro na\n" +
                                "inclusão escolar das pessoas com autismo (Maely Passos Boeri Valadão)\n" +
                                "2. A formação profissional na fundação da Criança e do Adolescente – FUNDAC\n" +
                                "(Liana Almeida de Arantes; Cinara Agda Lisboa de Souza; Ana Maria Fraguas Garcia)\n" +
                                "3. O princípio da diversidade e a educação em direitos humanos (Ailana Freitas\n" +
                                "Rocha; Luanda Almeida Reis da Silva)\n" +
                                "4. Espaço cultural e educativo Acervo da Laje (Maria Luiza de Farias Ribeiro Altmicks;\n" +
                                "Alfons Heinrich Altmicks)\n" +
                                "*Intervalo*\n" +
                                "5. Descrições espaciais contidas do livro quarto de despejo (Douglas Quirino de\n" +
                                "Oliveira Mota; Filipe Mateus Lima Guimarães Trindade; Mariana Oliveira Conceição)\n" +
                                "6. O programa institucional de bolsas de iniciação científica na Universidade Católica\n" +
                                "do Salvador (Yasmin Borges Pereira de Santana; Alfons Heinrich Altmicks)",
                        "SALA DE ATOS"
                ),
                new ItemCronograma(
                        "20/10",
                        "9h às 12h",
                        "TEMA - MEIO AMBIENTE E QUESTÕES SANITÁRIAS",
                        "Mediador: Prof. Me. Fernando Guerra (UCSAL)\n" +
                                "Artigos (Autores):\n" +
                                "1. Engenharia sustentável: o uso da prototipagem no controle da qualidade do\n" +
                                "processo de produção (Izabela da Silva Reis; Fernando Barreto Nunes Filho)\n" +
                                "2. Engenharia sustentável: práticas ESG na implementação do empreendimento\n" +
                                "imobiliário Beach Class Salvador (Silviane Ferreira de Jesus; Kilcy Costa Ferraz)\n" +
                                "3. Glaucus atlanticus mollusca; glaucidae: levantamento de ocorrências no Brasil\n" +
                                "(Isabela Maria dos Reis Santos; Eder Carvalho da Silva; Bianca Faustino Tavares;\n" +
                                "Samela Rodrigues Bitencourt; Tarcísio Mário Lemos; Vitor Lopes Fernandes dos\n" +
                                "Santos)\n" +
                                "4. Engenharia sustentável: a importância do esgotamento sanitário no combate ao\n" +
                                "COVID-19, no município de Serrinha-BA (Maria Juliana Barbosa Aragão Borges;\n" +
                                "Murilo Sales Gama; Fernando Barreto Nunes Filho)",
                        "SALA A120a"
                )
        );
    }
}
