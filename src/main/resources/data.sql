-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 19-Jan-2024 às 22:17
-- Versão do servidor: 10.4.22-MariaDB
-- versão do PHP: 7.4.27

SET FOREIGN_KEY_CHECKS=0;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

--
-- Banco de dados: `descomplica_filmeflix`
--

--
-- Truncar tabela antes do insert `atores`
--

TRUNCATE TABLE `atores`;
--
-- Extraindo dados da tabela `atores`
--

INSERT INTO `atores` (`id`, `nome`, `sobrenome`, `data_nascimento`, `biografia`, `created_at`, `updated_at`) VALUES
(5, 'Leonardo', 'DiCaprio', '1974-11-11', NULL, '2023-09-19 19:52:17', '2023-09-19 19:52:17'),
(6, 'Kate', 'Winslet', '1975-10-05', NULL, '2023-09-19 19:52:17', '2023-09-19 19:52:17'),
(7, 'Billy', 'Zane', '1966-02-24', NULL, '2023-09-19 19:52:17', '2023-09-19 19:52:17'),
(8, 'Liam', 'Neeson', '1952-06-07', NULL, '2023-09-19 19:58:35', '2023-09-19 19:58:35'),
(9, 'Ben', 'Kingsley', '1943-12-31', NULL, '2023-09-19 19:58:35', '2023-09-19 19:58:35'),
(10, 'Ralph', 'Fiennes', '1962-12-22', NULL, '2023-09-19 19:58:35', '2023-09-19 19:58:35'),
(11, 'Keanu', 'Reeves', '1964-09-02', NULL, '2023-09-19 20:01:02', '2023-09-19 20:01:02'),
(12, 'Laurence', 'Fishburne', '1961-06-30', NULL, '2023-09-19 20:01:02', '2023-09-19 20:01:02'),
(13, 'Carrie-Anne', 'Moss', '1967-08-21', NULL, '2023-09-19 20:01:02', '2023-09-19 20:01:02'),
(14, 'Wesley', 'Snipes', '1962-07-31', NULL, '2023-09-19 20:03:23', '2023-09-19 20:03:23'),
(15, 'Stephen', 'Dorff', '1973-07-29', NULL, '2023-09-19 20:03:23', '2023-09-19 20:03:23'),
(16, 'Kristoffer', 'Kristofferson', '1936-06-22', NULL, '2023-09-19 20:03:23', '2023-09-19 20:03:23'),
(17, 'Jared', 'Padalecki', '1982-07-19', NULL, '2023-09-19 20:05:55', '2023-09-19 20:05:55'),
(18, 'Jensen', 'Ackles', '1978-03-01', NULL, '2023-09-19 20:05:55', '2023-09-19 20:05:55'),
(19, 'Misha', 'Collins', '1974-07-20', NULL, '2023-09-19 20:05:55', '2023-09-19 20:05:55');

--
-- Truncar tabela antes do insert `avaliacoes`
--

TRUNCATE TABLE `avaliacoes`;
--
-- Extraindo dados da tabela `avaliacoes`
--

INSERT INTO `avaliacoes` (`id`, `id_usuario`, `id_filme`, `id_playlist`, `nota`, `critica`, `created_at`, `updated_at`) VALUES
(11, 1, 1, NULL, 4, 'Um dos meus filmes favoritos! Tudo nesse filme é impecável. O desenvolvimento é incrível, eles entram no navio para fazer um cruzeiro e acontece tudo o que aconteceu. Atuações maravilhosas, não é a toa que a Kate Winslet ganhou vários prêmios. Inclusive, tem uma cena deletada que se passa no começo do filme, que é necessário bater palmas para tanto talento. Também não se pode desmerecer os outros atores, pois todos fizeram um ótimo trabalho.\r\n\r\nA trilha sonora também é perfeita. Além da emoção que os atores passam, temos uma música belíssima de fundo, emocionando ainda mais. Eu recomendo que os fãs assistam as cenas deletadas, vale muito a pena e provavelmente você vai se emocionar mais.', '2023-09-18 18:32:44', '2023-09-18 18:32:44'),
(12, 4, 1, NULL, 5, 'Titanic é uns dos melhores filmes da história dos cinemas! \r\nEu amo esse filme em tudo, desde a produção do filme até a sua linda história contada de forma incrível! A Trilha Sonora Original do filme é de surpreender, eu me emociono todas vezes que escuto as trilhas sonoras do filme toda vez que assisto sem tirar a linda canção original My Heart Will Go On cantada pela cantora Celine Dion que é linda demais. Titanic conquistou 11 Oscar Incluindo o de Melhor Diretor e Melhor Filme!\r\n\r\nO filme Titanic é um clássico que será lembrado para sempre,vale realmente assistir!!!!', '2023-09-18 18:32:44', '2023-09-18 18:32:44'),
(13, 2, 1, NULL, 3, 'Gosto muito do filme, mas não tinha necessidade de pôr o filme em 3D, assim não precisaria mudar a dublagem dos protagonistas, fui assistir sem saber dessa informação, logo foi uma decepção, na minha opnião isso fez uma grande diferença, os personagens parecem não passar tanta emoção quanto na primeira dublagem, e eu sempre admirei a dublagem brasileira, mas infelizmente não foi interessante essa mudança, teria sido melhor ter assistido legendado.', '2023-09-18 18:33:43', '2023-09-18 18:33:43'),
(14, 6, 1, NULL, 5, 'O melhor filme da minha vida desde que me entendo por gente. Sempre fui fã de romance, mais esse foi além das minhas expectativas. Sinceramente não tenho facilidade até hoje de aceitar o que aconteceu com o Jack. Se eu ver esse filme 1000x eu choro as 1000. O que mais me marcou e me marca até hoje são as falas da Rose: \"O Coração de uma mulher é um oceano de segredos, mas agora sabem, que existiu um Jack Dawson, e que ele me salvou, de todas as formas que uma pessoa pode ser salva, e eu não tenho nenhum retrato dele, agora ele existe apenas em minha memória.”  O meu sonho fazer um aniversário tema Titanic... para muitos é \"brega\" mais o que sinto por este filme é tão intenso que não me preocupo com o que as pessoas pensam. Enfim, este filme é tudo pra mim, eu vejo ele pelo menos 1x ao ano. Rs. Love, love, love, Rose&Jack Forever❤️', '2023-09-18 18:39:34', '2023-09-18 18:39:34'),
(15, 5, 1, NULL, 4, 'Filme incrível, o misto de emoções que eu senti nesse filme eu nunca tinha sentido em outro filme. Dicaprio e Winslet fizeram um trabalho espetacular.', '2023-09-18 18:39:34', '2023-09-18 18:39:34'),
(16, 1, 3, NULL, 4, 'Sempre tive curiosidade em assistir esse filme, e só agora que consegui...\r\nÉ muuito bom, mostra uma das tantas faces que teve durante a guerra, mas uma das melhores, apesar de acontecer em meio a tanta crueldade e desumanidade. Mas mostra que a bondade não tem distinção, não tem nacionalidade e muito menos, provém apenas dos humildes e menos favorecidos. Pra quem gosta do gênero, é um prato cheio.', '2023-09-18 18:42:15', '2023-09-18 18:42:15'),
(17, 4, 3, NULL, 5, 'Não tem como você assistir a esse filme e sair a mesma pessoa. Em 3h15min, Spielberg e um brilhante elenco te levam a um período sombrio da história da humanidade. Sem ser emotivo, as lágrimas descem ao ver, de forma crua, a crueldade dos nazistas contra o povo judeu. Vencedor de 7 Oscars, incluindo Melhor Diretor e Melhor Filme, vale cada minuto assistido. Você sairá impactado, não somente com as qualidades técnicas e atuação do elenco, mas também pela história que é triste, sombria e, infelizmente, verdadeira\r\n', '2023-09-18 18:42:15', '2023-09-18 18:42:15'),
(18, 2, 3, NULL, 4, 'Uma Historia real que marcou a humanidade para sempre. Infelizmente a humanidade não estará livre de poderes absurdos do tipo Nazista. A repercussão pendura até hoje por se tratar de uma guerra mundial. Quando acontece isoladamente com tem acontecido em alguns países, como é o caso da Venezuela, Congo e recentemente na Guatemala passa desapercebido. Quanto a reportagem sobre a lista de schindler foi muito boa.', '2023-09-18 18:42:15', '2023-09-18 18:42:15'),
(19, 5, 3, NULL, 5, 'Sensacional...\r\n\r\nJá assisti inúmeras vezes e não canso de apreciar essa obra prima, os atores não atuaram neste filme, eles encorporaram os personagens, se não soubesse que é um filme, diria que é um documentário real da época.\r\n\r\nO melhor de todos os tempos.', '2023-09-18 18:44:10', '2023-09-18 18:44:10'),
(20, 6, 3, NULL, 4, 'Todo ser humano deveria assistir a essa obra. Schindler estava longe de ser um bom moço, mas a humanidade que habita em todos nós sussurrou mais forte em seus ouvidos. Assista e lute todos os dias de suas vidas para que nenhum tipo de genocídio ou repressão que destrói o que é certo aconteça novamente.', '2023-09-18 18:44:10', '2023-09-18 18:44:10'),
(21, 6, 4, NULL, 5, 'Além de ser uma incrível produção de Hollywood, a trama cinematográfica trouxe novos elementos que nunca tinham sido implementados nos cinemas. Tendo as irmãs Wachowski como produtoras que criaram um mundo repleto de uma atmosfera rica em elementos históricos, artísticos, filosóficos onde a ficção se choca com a realidade o tempo todo. Uma vez contemplada essa obra-prima ainda hoje nos deparamos com perguntas como: \"Será que estamos vivendo dentro de uma Matrix ou isso realmente é a realidade do mundo real.\"', '2023-09-18 18:48:14', '2023-09-18 18:48:14'),
(22, 5, 4, NULL, 4, 'Para a geração nascida em 80 foi um marco, muitos afirmando que seria um dos melhores de todos os tempos. Não vejo tanto. Um bom filme (que virou saga), com uma visão de mundo até filosófica e interessante (outros reduzem como outra teoria de conspiração). Já valeria pelos efeitos e vai além com tudo isso acima.', '2023-09-18 18:48:14', '2023-09-18 18:48:14'),
(23, 2, 4, NULL, 5, 'Esse gênero de ficção cientifica, foi um verdadeiro divisor de águas, para o cinema mundial. Primeiramente me cativou pela bela elaboração do enredo, onde tem muito conteúdo em referencias filosóficas, nomes, símbolos, tudo foi e é uma grande obra-prima da sétima arte.\r\n\r\nParabéns a Lana e Lilly Washowsky.', '2023-09-18 18:48:14', '2023-09-18 18:48:14'),
(24, 6, 5, NULL, 2, 'O filme é bom mas tem muitas cenas nojentas e forçadas demais, o que torna o filme mentiroso demais e um tanto ridículo em algumas partes , principalmente nas partes da vampira obesa que nem consegue se levantar , a parte que ele pega carona no trem em alta velocidade com apenas um braço e segurando a mulher com o outro aquilo foi totalmente ridículo e os vampiros explodindo kkkkkkkkk muito exagerado', '2023-09-18 18:58:48', '2023-09-18 18:58:48'),
(25, 4, 5, NULL, 3, 'Mesmo com sua vasta galeria de heróis, constituída por personagens como o Homem-Aranha e os X-Men, coube a Blade ser o verdadeiro pontapé dos filmes da Marvel, que nunca havia conseguido emplacar um sucesso no cinema. Aliás, graças ao bom desempenho do longa, que arrecadou quase três vezes o valor investido, a editora percebeu que a venda dos direitos de seus personagens evitaria a falência na década de 90. Dito isso, fica evidente a importância de Blade para a Marvel e para a indústria do entretenimento, iniciando a febre pelos filmes baseados em quadrinhos.\r\n\r\nNa obra, Blade (Wesley Snipes), metade homem e metade vampiro, busca vingar a morte de sua mãe eliminando o mundo dos vampiros. No entanto, o guerreiro precisará lidar com Deacon Frost (Stephen Dorff), o líder de um grupo que pretende eliminar a raça humana através de um ritual.\r\n\r\nVisto duas décadas depois, percebemos que o tempo não foi tão benevolente com Blade. O primeiro elemento que salta aos olhos quando nos deparamos com o quão datado o longa tornou-se, é o uso de efeitos visuais. Todo efeito criado por computador exala artificialidade, tornando impossível a completa imersão do público naquele universo. O que é lastimável, visto que a direção de arte é competente em criar ambientes atrativos, priorizando o uso de cores neutras para decorar os cenários de maneira minimalista e moderna, transmitindo a elegância, imponência e sensualidade dos vampiros, como pode ser visto na sala de reunião dos vampiros ou no apartamento de Deacon Frost.\r\n\r\nO figurino segue a mesma estratégia, inclusive no uniforme de Blade, vestindo os personagens com cores neutras e criando um universo que remete ao noir, uma estratégia inteligente, visto que protagonista é uma espécie de anti-herói. A boa utilização desses dois elementos técnicos pode ser reparada na sequência inicial, por exemplo, que, aliado ao uso dinâmico da edição, cria no clube dos vampiros um local ameaçador, principalmente quando o sangue começa a jorrar do sistema hidráulico, mas atrativo e pulsante.', '2023-09-18 18:58:48', '2023-09-18 18:59:34');

--
-- Truncar tabela antes do insert `contatos`
--

TRUNCATE TABLE `contatos`;
--
-- Truncar tabela antes do insert `enderecos`
--

TRUNCATE TABLE `enderecos`;
--
-- Truncar tabela antes do insert `estados`
--

TRUNCATE TABLE `estados`;
--
-- Extraindo dados da tabela `estados`
--

INSERT INTO `estados` (`id`, `uf`, `nome`) VALUES
(1, 'AC', 'Acre'),
(2, 'AL', 'Alagoas'),
(3, 'AM', 'Amazonas'),
(4, 'AP', 'Amapá'),
(5, 'BA', 'Bahia'),
(6, 'CE', 'Ceará'),
(7, 'DF', 'Distrito Federal'),
(8, 'ES', 'Espírito Santo'),
(9, 'GO', 'Goiás'),
(10, 'MA', 'Maranhão'),
(11, 'MG', 'Minas Gerais'),
(12, 'MS', 'Mato Grosso do Sul'),
(13, 'MT', 'Mato Grosso'),
(14, 'PA', 'Pará'),
(15, 'PB', 'Paraíba'),
(16, 'PE', 'Pernambuco'),
(17, 'PI', 'Piauí'),
(18, 'PR', 'Paraná'),
(19, 'RJ', 'Rio de Janeiro'),
(20, 'RN', 'Rio Grande do Norte'),
(21, 'RO', 'Rondônia'),
(22, 'RR', 'Roraima'),
(23, 'RS', 'Rio Grande do Sul'),
(24, 'SC', 'Santa Catarina'),
(25, 'SE', 'Sergipe'),
(26, 'SP', 'São Paulo'),
(27, 'TO', 'Tocantins');

--
-- Truncar tabela antes do insert `filmes`
--

TRUNCATE TABLE `filmes`;
--
-- Extraindo dados da tabela `filmes`
--

INSERT INTO `filmes` (`id`, `titulo`, `ano_publicacao`, `descricao`, `numero_visualizacoes`, `link_imagem`, `link_filme`, `id_plataforma`, `classificacao_indicativa`, `created_at`, `updated_at`) VALUES
(1, 'Titanic', 1997, 'Jack Dawson (Leonardo DiCaprio) é um jovem aventureiro que, na mesa de jogo, ganha uma passagem para a primeira viagem do transatlântico Titanic. Trata-se de um luxuoso e imponente navio, anunciado na época como inafundável, que parte para os Estados Unidos. Nele está também Rose DeWitt Bukater (Kate Winslet), a jovem noiva de Caledon Hockley (Billy Zane). Rose está descontente com sua vida, já que sente-se sufocada pelos costumes da elite e não ama Caledon. Entretanto, ela precisa se casar com ele para manter o bom nome da família, que está falida. Um dia, desesperada, Rose ameaça se atirar do Titanic, mas Jack consegue demovê-la da ideia. Pelo ato ele é convidado a jantar na primeira classe, onde começa a se tornar mais próximo de Rose. Logo eles se apaixonam, despertando a fúria de Caledon. A situação fica ainda mais complicada quando o Titanic se choca com um iceberg, provocando algo que ninguém imaginava ser possível: o naufrágio do navio.', 5473, 'https://rukminim2.flixcart.com/image/850/1000/kz5vwy80/poster/0/h/k/medium-titanic-movie-matte-finish-poster-butcute11852-original-imagb8cen3fmffau.jpeg?q=90', 'w2p9UR9LE1Y', 1, 12, '2023-08-21 19:18:48', '2023-09-18 18:55:26'),
(2, 'Ligadas pelo Desejo', 1996, 'Corky (Gina Gershon) é um ex-presidiária lésbica que arranja um emprego como encanadora em um prédio. Lá ela conhece Caesar (Joe Pantoliano), que trabalha fazendo lavagem de dinheiro para a máfia, e sua namorada Violet (Jennifer Tilly). As duas mulheres começam, então, um romance, e planejam roubar 2 milhões de dólares que estão sob os cuidados de Caesar, antes que ele os devolva para seu chefe. Mas o plano começa a dar errado quando ele tem uma reação inesperada.\r\n\r\n', 7580, 'http://dvdslist.com.br/wp-content/uploads/LigadasPeloDesejo.jpg', 'QKoTQXYWS1k', 1, 16, '2023-08-21 19:18:48', '2023-09-18 18:55:26'),
(3, 'A Lista de Schindler\n', 1993, 'O alemão Oskar Schindler viu na mão de obra judia uma solução barata e viável para lucrar com negócios durante a guerra. Com sua forte influência dentro do partido nazista, foi fácil conseguir as autorizações e abrir uma fábrica. O que poderia parecer uma atitude de um homem não muito bondoso, transformou-se em um dos maiores casos de amor à vida da História, pois este alemão abdicou de toda sua fortuna para salvar a vida de mais de mil judeus em plena luta contra o extermínio alemão.', 2490, 'https://play-lh.googleusercontent.com/bJbvOM2-mFj-I7owcRqDUvC8BJy9D6AvtJHWBcrluB0tBK1-1cbRHO8ob0v5nAIbFsDcZA', 'GAf0nGq_FXQ', 1, 14, '2023-08-21 19:18:48', '2023-09-18 18:55:26'),
(4, 'Matrix', 1999, 'O jovem programador Thomas Anderson é atormentado por estranhos pesadelos em que está sempre conectado por cabos a um imenso sistema de computadores do futuro. À medida que o sonho se repete, ele começa a desconfiar da realidade. Thomas conhece os misteriosos Morpheus e Trinity e descobre que é vítima de um sistema inteligente e artificial chamado Matrix, que manipula a mente das pessoas e cria a ilusão de um mundo real enquanto usa os cérebros e corpos dos indivíduos para produzir energia.', 6717, 'https://cdn-cosmos.bluesoft.com.br/products/883313448451', '2KnZac176Hs', 1, 14, '2023-08-21 19:18:48', '2023-09-18 18:55:26'),
(5, 'Blade: O Caçador de Vampiros', 1998, 'O herói Blade, metade mortal e metade imortal, parte em busca do vampiro responsável pela morte de sua mãe. Blade quer eliminá-lo do mundo dos vampiros e em um mundo tecnologicamente avançado, Blade lutará para capturar aquele que quer destruir a vida humana.', 7103, 'https://musicimage.xboxlive.com/catalog/video.movie.8D6KGWZL58KR/image?locale=pt-br&mode=crop&purposes=BoxArt&q=90&h=300&w=200&format=jpg', 'WXvwkSR5808', 1, 14, '2023-08-21 19:18:48', '2023-09-18 18:55:26'),
(6, 'O Resgate do Soldado Ryan', 1998, 'Durante a Segunda Guerra Mundial, o capitão John Miller leva seus homens para trás das linhas inimigas para encontrar o soldado James Ryan, cujos três irmãos foram mortos em combate. Cercados pela brutal realidade da guerra, cada homem embarca em uma jornada pessoal e descobre sua própria força para triunfar sobre um futuro incerto com honra, decência e coragem.', 5371, 'https://br.web.img3.acsta.net/c_310_420/medias/nmedia/18/96/07/36/20443914.jpg', 'WdHJ_nLRjIA', 1, 14, '2023-08-21 19:18:48', '2023-09-18 18:55:26'),
(13, 'Barbie', 2023, 'O filme Barbie chega às plataformas digitais nesta terça-feira (12), com disponibilização para aluguel ou compra online nas plataformas Amazon Prime Video, Apple TV, Microsoft e Google Play Filmes. Lançada em 20 de julho nos cinemas, a produção segue ampliando seus recordes, inclusive desbancando Harry Potter e as Relíquias da Morte e tornando-se a maior bilheteria da Warner em 100 anos de estúdio. Para quem é assinante do HBO Max, o diretor-presidente da Warner Bros, David Zaslav, afirmou que o longa chegará ao catálogo do streaming no final de 2023.\n\nNa trama, a boneca que representa um ideal de ser perfeito entra em uma crise em que passa a questionar a própria existência. Estrelado por Margot Robbie (Eu, Tonya) e Ryan Gosling (La La Land: Cantando Estações), Barbie conta com direção e co-criação de Greta Gerwig, juntamente com Noah Baumbach.', 4549, 'https://classic.exame.com/wp-content/uploads/2023/07/barbie.jpg?quality=70&strip=info&w=1024', 'Ujs1Ud7k49M', 1, 12, '2023-09-16 02:09:51', '2023-09-18 18:55:26'),
(14, 'Gladiador', 2000, 'Maximus é um poderoso general romano, amado pelo povo e pelo imperador Marcus Aurelius. Antes de sua morte, o Imperador desperta a ira de seu filho Commodus ao tornar pública a sua predileção em deixar o trono para Maximus. Sedento pelo poder, Commodus mata seu pai, assume a coroa e ordena a morte de Maximus, que consegue fugir antes de ser pego, e passa a se esconder como um escravo e gladiador enquanto vai atrás de vingança.\n', 5626, 'https://br.web.img3.acsta.net/r_1280_720/medias/nmedia/18/68/64/41/19254510.jpg', 'cXg62-t8BWs', 1, 16, '2023-09-16 02:14:27', '2023-09-18 18:55:26'),
(15, 'Jurassic Park', 1993, 'Um parque construído por um milionário (Richard Attenborough) tem como habitantes dinossauros diversos, extintos a sessenta e cinco milhões de anos. Isto é possível por ter sido encontrado um inseto fossilizado, que tinha sugado sangue destes dinossauros, de onde pôde-se isolar o DNA, o código químico da vida, e, a partir deste ponto, recriá-los em laboratório. Mas, o que parecia ser um sonho se torna um pesadelo, quando a experiência sai do controle de seus criadores.', 4490, 'https://boraassistir.com.br/media/images/thumbs/meta/1652807789.jpg', 'fLDR-YYK7jQ', 1, 12, '2023-09-16 02:18:43', '2023-09-18 18:55:26'),
(16, 'Supernatural 1ª Temporada', 2005, 'Os irmãos Sam e Dean Winchester perderam sua mãe há mais de 20 anos, em um incêndio envolto em mistérios. Desde então, os jovens viveram na estrada com o pai, John, que trabalha como caçador de criaturas sobrenaturais, profissão cujas habilidades tentou ensinar a seus filhos.\n\nQuando John desaparece em uma dessas viagens, os irmãos se vem obrigados a entrar para esse mundo de vez, em busca do pai. Nesse caminho, Sam e Dean se deparam com demônios e fantasmas, e salvam pessoas inocentes das ameaças dessas criaturas, enquanto juntam pistas sobre o paredero de seu pai.\n\nSam começa a desenvolver habilidade psíquicas e a ter visões misteriosas sem explicação. Quando finalmente encontram seu pai, Sam e Dean descobrem a verdade sobre como sua mãe morreu. Ela foi assassinada por um demônio de olhos amarelos (Azazel), que só pode ser morto por uma arma lendária criada por um homem chamado Samuel Colt.', 4570, 'https://s.aficionados.com.br/imagens/season-1_cke.jpg', '31A0DqX6jHI', 1, 10, '2023-09-16 03:01:48', '2023-09-18 18:55:26'),
(17, 'Supernatural 2ª Temporada', 2006, 'Dean e Sam tentam lidar com a morte de John, enquanto seguem em sua busca por Azazel, responsável pela morte de Mary e Jessica Moore, namorada de Sam na primeira temporada. Os novos episódios apresentam os novos aliados dos irmãos Winchesters: Ellen, Jo e Ash.\n\nAzazel revela parte de seu plano, reúne todos e mata Sam. Para trazer o irmão de volta, Dean faz um pacto com o Demônio da Encruzilhada, prometendo sua alma em troca dentro de um ano. Dean finalmente mata Azazel, mas uma porta se abre e a Fúria é libertada.', 8380, 'https://s.aficionados.com.br/imagens/season-2_cke.jpg', '31A0DqX6jHI', 1, 10, '2023-09-16 03:01:48', '2023-09-18 18:55:26'),
(18, 'Supernatural 3ª Temporada', 2007, 'A trama do terceiro ano da série gira em torno das tentativas dos irmãos Winchesters de salvar Dean de seu pacto, enquanto tentam deter os demônios que escaparam do inferno. Entre as novas personagens estão Ruby, um novo potencial interesse romântico de Sam que se diz capaz de ajudar Dean, e Bela Tabolt, uma vendedora de objetos ocultos.\n\nAo descobrir que a demônio Lilith é a responsável por manter o contrato de Dean, os irmãos e Ruby tentam matá-la. Primeiro demônio criado por Lúcifer, Lilith é extremamente poderosa, ficando abaixo apenas do próprio diabo. As habilidades misteriosas de Sam, contudo, parecem ter um efeito sobre ela. Antes que possam impedir, o contrato de Dean expira e sua alma é levada.', 9192, 'https://s.aficionados.com.br/imagens/season-3_cke.jpg', '31A0DqX6jHI', 1, 10, '2023-09-16 03:01:48', '2023-09-18 18:55:26'),
(19, 'Supernatural 4ª Temporada', 2008, 'Um anjo chamado Castiel resgata Dean do inferno e o traz de volta à vida na Terra. Os irmãos Winchesters passam a trabalhar juntos com Castiel para impedir o plano de Lilith de quebrar os 66 selos que impedem o retorno de Lúcifer.\n\nCom a proximidade de entre Sam e Ruby, o relacionamento entre ele e Dean sofre uma tensão, principalmente após Sam beber o sangue de demônio e manifestar seu lado demoníaco, tudo com o objetivo de ganhar forças para enfrentar Lilith.\n\nSam consegue rastrear Lilith e a mata. Contudo, Lilith e Ruby estavam enganando o caçador, e Lilith era o último selo a ser quebrado. Dean chega e mata Ruby, mas a prisão de Lúcifer se abre.', 1816, 'https://s.aficionados.com.br/imagens/season-4_cke.jpg', '31A0DqX6jHI', 1, 10, '2023-09-16 03:01:48', '2023-09-18 18:55:26'),
(20, 'Supernatural 5ª Temporada', 2009, 'A trama do quinto ano da série gira em torno da luta para impedir Lúcifer e o Apocalipse. Entre batalhas contra diferentes anjos e demônios, Dean e Sam lutam contra seus destinos de se tornarem receptáculos de Miguel e Lúcifer respectivamente.\n\nA temporada também ficou marcada pelo desenvolvimento de diferentes relacionamentos. Enquanto Sam e Dean parecem seguir se distanciando, Castiel se rebela contra o Céu por Dean, e Bobby também demonstra grande amizade por Castiel.', 7508, 'https://s.aficionados.com.br/imagens/season-5_cke.jpg', '31A0DqX6jHI', 1, 10, '2023-09-16 03:01:48', '2023-09-18 18:55:26'),
(21, 'Supernatural 6ª Temporada', 2010, 'Uma temporada com grandes emoções, sua trama se passa um ano após os acontecimentos da quinta temporada. Dean está levando uma vida feliz e calma ao lado de Lisa e Ben Braeden, até que Sam retorna ao mundo dos vivos e faz com que o irmão volte a acompanhá-lo na batalha contra o sobrenatural.\n\nSam estava trabalhando com Samuel Campbell para caçar e capturar os monstros Alfas. Para recuperar sua filha, contudo, Samuel estava seguindo ordens de Crowley, que queria usar os Alfas para localizar o Purgatório e usar a vastidão de almas lá presas.\n\nCastiel trai o suposto acordo que tinha com Crowley para dividirem as almas do Purgatório, impede que ele abra as portas do local e, agora, cheio de poder, diz que não é mais apenas um anjo, mas sim o novo Deus.', 4094, 'https://s.aficionados.com.br/imagens/season-6_cke.jpg', '31A0DqX6jHI', 1, 10, '2023-09-16 03:01:48', '2023-09-18 18:55:26'),
(22, 'Supernatural 7ª Temporada', 2011, 'Dean e Sam ainda tentam se recuperar da perda de um amigo. O emocional dois dois ainda segue abalado por motivos individuais: Sam segue perturbado por lembranças do inferno; já Sam guarda um segredo que pode separar os irmãos de uma vez por todas.\n\nEnquanto isso, o jogo parece virar fazendo dos irmãos a caça em vez de os caçadores. Isso porque criaturas mais malignas que os demônios, chamadas de Leviatãs, têm um terrível plano para a humanidade.\n\nApós absorver as almas do Purgatório, Castiel sofre por decisões erradas e segue tentando punir todos os malfeitores do mundo. Contudo, pela primeira vez, os irmãos Winchesters percebem que talvez deva ver o ex amigo como um inimigo.', 5945, 'https://s.aficionados.com.br/imagens/season-7_cke.jpg', '31A0DqX6jHI', 1, 10, '2023-09-16 03:01:48', '2023-09-18 18:55:26'),
(23, 'Supernatural 8ª Temporada', 2012, 'Os novos episódios têm início com o improvável retorno de Dean à vida depois de um ano no Purgatório. O caçador, contudo, volta sem Castiel, mas na companhia de um misterioso parceiro de armas, cuja razão para fuga pode esconder mais informações.\n\nEnquanto Sam tenta conciliar a vida que construiu na ausência de Dean com o retorno às atividades como caçador, os irmãos partem na missão de encontrar as tábuas dos anjos e dos demônios, que supostamente teriam instruções sobre como fechar os portões do inferno.\n\nNa luta contra demônios como Crowley e Abaddon - que seguem disputando o título que um dia já pertenceu a Lúcifer - Sam e Dean terão um reencontro inesperado que os levará a descobertas chocantes sobre seu passado.', 7444, 'https://s.aficionados.com.br/imagens/season-8_cke.jpg', '31A0DqX6jHI', 1, 10, '2023-09-16 03:01:48', '2023-09-18 18:55:26'),
(24, 'Supernatural 9ª Temporada', 2013, 'Metatron, o anjo escolhido por Deus para escrever sua Palavra, deixou o paraíso após o sumiço de seu senhor, com medo de os arcanjos tentarem roubar a Palavra de Deus. Para vingar essa fuga, contudo, é ele quem usa a Palavra para reconstruir o Paraíso e se tornar uma espécie de deus para os humanos. Para tanto, ele expulsa todos os anjos para a Terra, o que vai render várias rebeliões.\n\nApós o sacrifício que fez na temporada anterior, Sam está entre a vida e a morte. Para salvar Sam, Dean vai contra o pedido do irmão (o que pode abalar para sempre sua relação) e, em uma manobra arriscada, alia-se a Crowley.\n\nSurgem duas facções angelicais, que brigam entre si e tentam caçar Castiel. Castiel, por sua vez, forma um exército para tentar deter o novo vilão celestial. Em meio à nova relação com Crowley, Dean e Sam tentarão transformá-lo em um ser humano novamente.', 9385, 'https://s.aficionados.com.br/imagens/season-9_cke.jpg', '31A0DqX6jHI', 1, 10, '2023-09-16 03:01:48', '2023-09-18 18:55:26'),
(25, 'Supernatural 10ª Temporada', 2014, 'A luta contra Metatron resultou na morte de Dean. O caçador, contudo, volta à vida como um demônio após ser ressuscitado pela Marca de Caim. Como novo aliado de Crowley, ele desaparece ao seguir uma vida de crueldades e sem arrependimentos. o 10º ano da série, portanto, tem início com Sam em sua busca desesperada pelo irmão.\n\nMesmo com seus poderes enfraquecidos e com anjos desonestos à solta, Castiel tenta \"reorganizar\" o Céu, enquanto ainda precisa lidar com um reencontro do seu passado e com o tempo de sua mortalidade.\n\nA misteriosa bruxa Rowena está entre os personagens novos. Dean e Sam precisarão se juntar a novos, velhos e muito improváveis aliados.', 5593, 'https://s.aficionados.com.br/imagens/season-10_cke.jpg', '31A0DqX6jHI', 1, 10, '2023-09-16 03:01:48', '2023-09-18 18:55:26'),
(26, 'Supernatural 11ª Temporada', 2015, 'Com a remoção da marca da Caim no braço de Dean, Escuridão (Amara), um entidade mais antiga que Deus, acaba sendo libertada. Irmã de Deus, Amara tem fortes ressentimentos com seu irmão, que a prendeu para evitar a destruição total que ela poderia causar.\n\nDean acaba descobrindo uma inesperada ligação com Amara (Escuridão). Sam, Dean e Castiel não vão medir esforços para salvar o mundo, chegando até mesmo a buscar um acordo com Lúcifer.\n\nApós ser enfeitiçado por Rowena, contudo, Castiel fica descontrolado e se isola. Por não conseguir ajudar como antes, ele toma uma decisão que pode afetar todos de forma irremediável.', 7812, 'https://s.aficionados.com.br/imagens/season-11_cke.jpg', '31A0DqX6jHI', 1, 10, '2023-09-16 03:01:48', '2023-09-18 18:55:26'),
(27, 'Supernatural 12ª Temporada', 2016, 'Como presente para Dean, Amara/Escuridão ressuscitou Mary Winchester. Contudo, o retorno da matriarca dos Winchesters não é só alegrias. Enquanto a caçadora tenta se adaptar à nova realidade em que foi inserida anos depois de sua morte, entre conflitos pessoais e com seus filhos, a família precisa enfrentar os Homens das Letras Britânicos.\n\nOs novos vilões se destacam por serem cruéis e imprevisíveis, com uma sede por mortes que ameaçam tanto o filho de Lúcifer quanto a mãe de Sam e Dean. Além disso, Sam é capturado e torturado por seus pecados passados, o que faz com que Dean, Mary e Castiel precisem de um plano para resgatá-lo.', 3281, 'https://s.aficionados.com.br/imagens/season-12_cke.jpg', '31A0DqX6jHI', 1, 10, '2023-09-16 03:01:48', '2023-09-18 18:55:26'),
(28, 'Supernatural 13ª Temporada', 2017, 'Os acontecimentos da temporada anterior fizeram com que Dean e Sam perdessem vários de seus aliados, algo que ainda tentam superar. O maior baque para os irmãos, contudo, foi o sequestro de sua mãe, mantida viva como refém de Lúcifer.\n\nJack, filho de Lúcifer, involuntariamente traz Castiel de volta à vida. Ainda tentando provar aos irmãos Winchesters que ele é uma boa pessoa, Jack tenta resgatar Mary com a ajuda de Castiel.', 9970, 'https://s.aficionados.com.br/imagens/season-13.jpg', '31A0DqX6jHI', 1, 10, '2023-09-16 03:01:48', '2023-09-18 18:55:26'),
(29, 'Supernatural 14ª Temporada', 2018, 'Dean segue desaparecido. Para tentar encontrá-lo, Castiel acaba fazendo um acordo com o demônio Kip, que deseja fazer um acordo com Sam para se tornar o novo Rei do Inferno. Jack, que perdeu sua graça na temporada anterior, tenta se adaptar à vida como humano.\n\nUma série de desaparecimentos misteriosos estão sendo investigados por Sam e Charlie. Nick segue um perigoso caminho ao procurar respostas para as mortes de sua esposa e de seu filho.\n\nSam e Dean se deparam com um aliado inesperado. Enquanto isso, Castiel faz um grande sacrifício para salvar o Céu de um perigoso ataque.\n\nA temporada foi marcada ainda por contar com o 300º episódio da série, que teve a participação de Jeffrey Dean Morgan, de volta ao papel de John Winchester.', 3009, 'https://s.aficionados.com.br/imagens/season-14_cke.jpg', '31A0DqX6jHI', 1, 10, '2023-09-16 03:01:48', '2023-09-18 18:55:26'),
(30, 'Supernatural 15ª Temporada', 2019, 'A jornada épica dos irmãos Winchester chega ao fim quando Supernatural entra em sua temporada final. Sam (Jared Padalecki) e Dean (Jensen Ackles) lutaram contra demônios e anjos, criaturas míticas e monstros, em uma busca aparentemente interminável para salvar o mundo. Mas na batalha final, eles enfrentam o próprio Deus (Rob Benedict), recusando-se a matar seu filho nefilim substituto, Jack (Alexander Calvert), e trazendo assim a decisão de Deus de acabar com essa realidade de uma vez por todas.', 2132, 'https://s.aficionados.com.br/imagens/season-15_cke.jpg', '31A0DqX6jHI', 1, 10, '2023-09-16 03:01:48', '2023-09-18 18:55:26');

--
-- Truncar tabela antes do insert `filmes_atores`
--

TRUNCATE TABLE `filmes_atores`;
--
-- Extraindo dados da tabela `filmes_atores`
--

INSERT INTO `filmes_atores` (`id_filme`, `id_ator`) VALUES
(1, 5),
(1, 6),
(1, 7),
(3, 8),
(3, 9),
(3, 10),
(4, 11),
(4, 12),
(4, 13),
(5, 14),
(5, 15),
(5, 16),
(16, 17),
(16, 18),
(16, 19),
(17, 17),
(17, 18),
(17, 19),
(18, 17),
(18, 18),
(18, 19),
(19, 17),
(19, 18),
(19, 19),
(20, 17),
(20, 18),
(20, 19),
(21, 17),
(21, 18),
(21, 19),
(22, 17),
(22, 18),
(22, 19),
(23, 17),
(23, 18),
(23, 19),
(24, 17),
(24, 18),
(24, 19),
(25, 17),
(25, 18),
(25, 19),
(26, 17),
(26, 18),
(26, 19),
(27, 17),
(27, 18),
(27, 19),
(28, 17),
(28, 18),
(28, 19),
(29, 17),
(29, 18),
(29, 19),
(30, 17),
(30, 18),
(30, 19);

--
-- Truncar tabela antes do insert `generos`
--

TRUNCATE TABLE `generos`;
--
-- Extraindo dados da tabela `generos`
--

INSERT INTO `generos` (`id`, `genero`) VALUES
(1, 'Terror'),
(2, 'Ação'),
(3, 'Drama'),
(4, 'Romance'),
(5, 'Ficção Científica'),
(6, 'Documentário'),
(7, 'Jogos'),
(8, 'Esporte'),
(9, 'Comédia'),
(10, 'Aventura');

--
-- Truncar tabela antes do insert `generos_filmes`
--

TRUNCATE TABLE `generos_filmes`;
--
-- Extraindo dados da tabela `generos_filmes`
--

INSERT INTO `generos_filmes` (`id_filme`, `id_genero`) VALUES
(1, 3),
(1, 4),
(2, 2),
(2, 4),
(3, 3),
(4, 2),
(4, 5),
(5, 1),
(5, 2),
(6, 2),
(6, 3),
(13, 9),
(14, 2),
(14, 3),
(15, 1),
(15, 10),
(16, 1),
(16, 3),
(16, 10),
(17, 1),
(17, 3),
(17, 10),
(18, 1),
(18, 3),
(18, 10),
(19, 1),
(19, 3),
(19, 10),
(20, 1),
(20, 3),
(20, 10),
(21, 1),
(21, 3),
(21, 10),
(22, 1),
(22, 3),
(22, 10),
(23, 1),
(23, 3),
(23, 10),
(24, 1),
(24, 3),
(24, 10),
(25, 1),
(25, 3),
(25, 10),
(26, 1),
(26, 3),
(26, 10),
(27, 1),
(27, 3),
(27, 10),
(28, 1),
(28, 3),
(28, 10),
(29, 1),
(29, 3),
(29, 10),
(30, 1),
(30, 3),
(30, 10);

--
-- Truncar tabela antes do insert `perfis`
--

TRUNCATE TABLE `perfis`;
--
-- Extraindo dados da tabela `perfis`
--

INSERT INTO `perfis` (`id`, `descricao`) VALUES
(1, 'ADMIN'),
(2, 'USUARIO');

--
-- Truncar tabela antes do insert `plataformas`
--

TRUNCATE TABLE `plataformas`;
--
-- Extraindo dados da tabela `plataformas`
--

INSERT INTO `plataformas` (`id`, `nome`, `link_prefixo`, `created_at`, `updated_at`) VALUES
(1, 'Youtube', 'https://www.youtube.com/embed/', '2023-08-21 02:10:41', '2023-08-22 23:06:18'),
(2, 'Dailymotion', 'https://www.dailymotion.com/embed/video/', '2023-08-21 02:10:41', '2023-08-22 23:06:21');

--
-- Truncar tabela antes do insert `playlists`
--

TRUNCATE TABLE `playlists`;
--
-- Extraindo dados da tabela `playlists`
--

INSERT INTO `playlists` (`id`, `id_usuario`, `nome`, `descricao`, `link_imagem`, `created_at`, `updated_at`) VALUES
(7, 3, 'Supernatural - Série Completa', 'A série segue os irmãos Sam Winchester e Dean Winchester que viajam por toda a América em um Chevrolet Impala 1967 preto investigando e combatendo eventos paranormais e outras ocorrências inexplicáveis, muitas delas baseadas em lendas urbanas americanas e folclore, assim como diferentes criaturas sobrenaturais.', 'https://i0.wp.com/cinestera.com.br/wp-content/uploads/2019/03/supernatural-18-08-10-img00.jpg?fit=726%2C408&ssl=1', '2023-09-16 03:12:42', '2023-09-16 03:12:42');

--
-- Truncar tabela antes do insert `playlists_filmes`
--

TRUNCATE TABLE `playlists_filmes`;
--
-- Extraindo dados da tabela `playlists_filmes`
--

INSERT INTO `playlists_filmes` (`id_filme`, `id_playlist`, `created_at`) VALUES
(16, 7, '2023-09-16 03:12:42'),
(17, 7, '2023-09-16 03:12:42'),
(18, 7, '2023-09-16 03:12:42'),
(19, 7, '2023-09-16 03:12:42'),
(20, 7, '2023-09-16 03:12:42'),
(21, 7, '2023-09-16 03:12:42'),
(22, 7, '2023-09-16 03:12:42'),
(23, 7, '2023-09-16 03:12:42'),
(24, 7, '2023-09-16 03:12:42'),
(25, 7, '2023-09-16 03:12:42'),
(26, 7, '2023-09-16 03:12:42'),
(27, 7, '2023-09-16 03:12:42'),
(28, 7, '2023-09-16 03:12:42'),
(29, 7, '2023-09-16 03:12:42'),
(30, 7, '2023-09-16 03:12:42');

--
-- Truncar tabela antes do insert `usuarios`
--

TRUNCATE TABLE `usuarios`;
--
-- Extraindo dados da tabela `usuarios`
--

INSERT INTO `usuarios` (`id`, `nome`, `apelido`, `senha`, `email`, `genero`, `link_avatar`, `data_nascimento`, `id_perfil`, `created_at`, `updated_at`) VALUES
(1, 'Denilson Alves', 'denilson', '$2a$10$O0jCvaGpLpVSE/kwCZ5RWuZCJDMoIjy.QZ1yyBk4morwSS5dlWUC6', 'denilson@gmail.com', 'Masculino', NULL, '1981-02-13', 1, '2023-08-13 02:23:22', '2023-09-18 18:34:44'),
(2, 'João Carlos', 'juca', '$2a$10$dces8VLBoEQlEiZOVfpkJuxk1senc381jx5jxd2hXZBO8n2oMDiru', 'juca@gmail.com', 'Masculino', NULL, '1979-01-14', 2, '2023-08-14 01:55:42', '2023-09-18 18:34:54'),
(3, 'Paula', 'paula88', '$2a$10$4n5IVkyn0D84RVX.Z9SwLewwWcJzwMO/hfxezXJj/qw5p.grCp5ly', 'paula@gmail.com', 'Feminino', NULL, '1988-08-02', 2, '2023-08-17 03:12:03', '2023-09-18 18:35:02'),
(4, 'Claudio', 'claudinho', '$2a$10$O968NJ5O.eiHpbmGF5ReGOEdeG6RXzjfQ4qZbYO9dDzUcI3a2nXym', 'claudinho@gmail.com', 'Masculino', NULL, '1991-06-23', 2, '2023-08-17 03:12:28', '2023-09-18 18:35:14'),
(5, 'Genílson', 'genilson1993', '$2a$10$4n5IVkyn0D84RVX.Z9SwLewwWcJzwMO/hfxezXJj/qw5p.grCp5ly', 'genilson1993@gmail.com', 'Masculino', NULL, '1993-08-17', 2, '2023-08-17 03:12:03', '2023-09-16 16:04:23'),
(6, 'Luana', 'luana2001', '$2a$10$4n5IVkyn0D84RVX.Z9SwLewwWcJzwMO/hfxezXJj/qw5p.grCp5ly', 'luana2001@gmail.com', 'Feminino', NULL, '2001-04-17', 2, '2023-08-17 03:12:03', '2023-09-16 16:04:23');
SET FOREIGN_KEY_CHECKS=1;
COMMIT;
