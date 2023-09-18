-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 18-Set-2023 às 04:41
-- Versão do servidor: 10.4.22-MariaDB
-- versão do PHP: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

--
-- Banco de dados: `descomplica_filmeflix`
--
CREATE DATABASE IF NOT EXISTS `descomplica_filmeflix` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `descomplica_filmeflix`;

--
-- Truncar tabela antes do insert `atores`
--

TRUNCATE TABLE `atores`;
--
-- Extraindo dados da tabela `atores`
--

INSERT INTO `atores` (`id`, `nome`, `sobrenome`, `data_nascimento`, `biografia`, `created_at`, `updated_at`) VALUES
(2, 'Arnold', 'Schwarzenegger', '1947-07-30', 'ghytfhjythu', '2023-08-24 21:14:25', '2023-08-24 21:14:25'),
(3, 'Clint', 'Eastwood', '1930-05-31', 'tsgrgreg', '2023-08-24 21:18:09', '2023-08-24 21:18:09'),
(4, 'Shfudshif', 'OISf9duj', '1986-05-16', 'ASFIOHJad9fjc90dsjf903jk4dfjwoaifdjf\nfe90wafij0f\nsafjds90dsa fwj 90afjew90fjs0a', '2023-08-31 23:43:27', '2023-08-31 23:43:27');

--
-- Truncar tabela antes do insert `avaliacoes`
--

TRUNCATE TABLE `avaliacoes`;
--
-- Extraindo dados da tabela `avaliacoes`
--

INSERT INTO `avaliacoes` (`id`, `id_usuario`, `id_filme`, `id_playlist`, `nota`, `critica`, `created_at`, `updated_at`) VALUES
(2, 2, 1, NULL, 4, 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum facilisis aliquam lorem id porta. Praesent vitae fermentum diam. Nulla consectetur convallis rhoncus. Cras rutrum ligula quis magna semper, nec accumsan ipsum eleifend. Nunc nec sem ultricies risus congue vehicula ac vitae lorem. In condimentum facilisis dolor non lacinia. Proin tempus mattis nunc sit amet tempus. Mauris lacinia risus nisl, nec pharetra risus fringilla id. Phasellus eget semper enim. Fusce sed justo commodo, scelerisque mi et, bibendum ipsum. Sed hendrerit non urna in vestibulum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae;\r\n\r\nNulla congue eget mi id vehicula. Aliquam vulputate commodo augue, in dapibus felis elementum at. In hac habitasse platea dictumst. Aliquam maximus venenatis ex in posuere. Phasellus accumsan, tellus vitae ultricies placerat, purus mauris ullamcorper erat, ac tincidunt eros enim in mi. In hac habitasse platea dictumst. Cras posuere nisl ', '2023-08-24 21:00:13', '2023-08-24 22:27:26'),
(3, 4, 1, NULL, 5, 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam tincidunt malesuada quam, sed euismod magna fringilla vitae. Curabitur viverra molestie metus eu tristique. Praesent laoreet egestas luctus. Integer gravida nisl eros, eget tempus ipsum dictum non. In venenatis dolor sit amet tristique hendrerit. Nulla efficitur velit nulla, eu suscipit ex accumsan ultricies. Nulla et dignissim mauris. Nullam hendrerit molestie quam sit amet iaculis.\r\n\r\nCurabitur nibh magna, consequat eget fringilla eget, laoreet in dolor. Nunc neque purus, porta sit amet rutrum sit amet, euismod et ante. Cras sit amet ligula tellus. Praesent ut turpis a erat molestie venenatis. Quisque tincidunt ipsum scelerisque felis bibendum, sed ornare ligula feugiat. Aenean varius elit neque, at efficitur sem sollicitudin sagittis. Pellentesque finibus imperdiet scelerisque. Praesent aliquet placerat turpis, rutrum dictum leo porttitor quis. Integer mattis sapien at velit gravida efficitur. Vivamus eu molestie erat, non', '2023-08-24 21:00:33', '2023-08-24 22:27:47'),
(7, 3, 1, NULL, 1, 'agsdfsadvsd', '2023-08-26 18:59:21', '2023-08-26 18:59:21');

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
(1, 'Titanic', 1997, 'Jack Dawson (Leonardo DiCaprio) é um jovem aventureiro que, na mesa de jogo, ganha uma passagem para a primeira viagem do transatlântico Titanic. Trata-se de um luxuoso e imponente navio, anunciado na época como inafundável, que parte para os Estados Unidos. Nele está também Rose DeWitt Bukater (Kate Winslet), a jovem noiva de Caledon Hockley (Billy Zane). Rose está descontente com sua vida, já que sente-se sufocada pelos costumes da elite e não ama Caledon. Entretanto, ela precisa se casar com ele para manter o bom nome da família, que está falida. Um dia, desesperada, Rose ameaça se atirar do Titanic, mas Jack consegue demovê-la da ideia. Pelo ato ele é convidado a jantar na primeira classe, onde começa a se tornar mais próximo de Rose. Logo eles se apaixonam, despertando a fúria de Caledon. A situação fica ainda mais complicada quando o Titanic se choca com um iceberg, provocando algo que ninguém imaginava ser possível: o naufrágio do navio.', 1020, 'https://rukminim2.flixcart.com/image/850/1000/kz5vwy80/poster/0/h/k/medium-titanic-movie-matte-finish-poster-butcute11852-original-imagb8cen3fmffau.jpeg?q=90', 'w2p9UR9LE1Y', 1, 12, '2023-08-21 19:18:48', '2023-09-18 02:15:48'),
(2, 'Ligadas pelo Desejo', 1996, 'Corky (Gina Gershon) é um ex-presidiária lésbica que arranja um emprego como encanadora em um prédio. Lá ela conhece Caesar (Joe Pantoliano), que trabalha fazendo lavagem de dinheiro para a máfia, e sua namorada Violet (Jennifer Tilly). As duas mulheres começam, então, um romance, e planejam roubar 2 milhões de dólares que estão sob os cuidados de Caesar, antes que ele os devolva para seu chefe. Mas o plano começa a dar errado quando ele tem uma reação inesperada.\r\n\r\n', 148, 'http://dvdslist.com.br/wp-content/uploads/LigadasPeloDesejo.jpg', 'QKoTQXYWS1k', 1, 16, '2023-08-21 19:18:48', '2023-09-18 02:15:59'),
(3, 'A Lista de Schindler\n', 1993, 'O alemão Oskar Schindler viu na mão de obra judia uma solução barata e viável para lucrar com negócios durante a guerra. Com sua forte influência dentro do partido nazista, foi fácil conseguir as autorizações e abrir uma fábrica. O que poderia parecer uma atitude de um homem não muito bondoso, transformou-se em um dos maiores casos de amor à vida da História, pois este alemão abdicou de toda sua fortuna para salvar a vida de mais de mil judeus em plena luta contra o extermínio alemão.', 153, 'https://play-lh.googleusercontent.com/bJbvOM2-mFj-I7owcRqDUvC8BJy9D6AvtJHWBcrluB0tBK1-1cbRHO8ob0v5nAIbFsDcZA', 'GAf0nGq_FXQ', 1, 14, '2023-08-21 19:18:48', '2023-09-18 02:16:25'),
(4, 'Matrix', 1999, 'O jovem programador Thomas Anderson é atormentado por estranhos pesadelos em que está sempre conectado por cabos a um imenso sistema de computadores do futuro. À medida que o sonho se repete, ele começa a desconfiar da realidade. Thomas conhece os misteriosos Morpheus e Trinity e descobre que é vítima de um sistema inteligente e artificial chamado Matrix, que manipula a mente das pessoas e cria a ilusão de um mundo real enquanto usa os cérebros e corpos dos indivíduos para produzir energia.', 141, 'https://cdn-cosmos.bluesoft.com.br/products/883313448451', '2KnZac176Hs', 1, 14, '2023-08-21 19:18:48', '2023-09-18 02:16:27'),
(5, 'Blade: O Caçador de Vampiros', 1998, 'O herói Blade, metade mortal e metade imortal, parte em busca do vampiro responsável pela morte de sua mãe. Blade quer eliminá-lo do mundo dos vampiros e em um mundo tecnologicamente avançado, Blade lutará para capturar aquele que quer destruir a vida humana.', 156, 'https://musicimage.xboxlive.com/catalog/video.movie.8D6KGWZL58KR/image?locale=pt-br&mode=crop&purposes=BoxArt&q=90&h=300&w=200&format=jpg', 'WXvwkSR5808', 1, 14, '2023-08-21 19:18:48', '2023-09-18 02:16:36'),
(6, 'O Resgate do Soldado Ryan', 1998, 'Durante a Segunda Guerra Mundial, o capitão John Miller leva seus homens para trás das linhas inimigas para encontrar o soldado James Ryan, cujos três irmãos foram mortos em combate. Cercados pela brutal realidade da guerra, cada homem embarca em uma jornada pessoal e descobre sua própria força para triunfar sobre um futuro incerto com honra, decência e coragem.', 140, 'https://br.web.img3.acsta.net/c_310_420/medias/nmedia/18/96/07/36/20443914.jpg', 'WdHJ_nLRjIA', 1, 14, '2023-08-21 19:18:48', '2023-09-18 02:16:48'),
(13, 'Barbie', 2023, 'O filme Barbie chega às plataformas digitais nesta terça-feira (12), com disponibilização para aluguel ou compra online nas plataformas Amazon Prime Video, Apple TV, Microsoft e Google Play Filmes. Lançada em 20 de julho nos cinemas, a produção segue ampliando seus recordes, inclusive desbancando Harry Potter e as Relíquias da Morte e tornando-se a maior bilheteria da Warner em 100 anos de estúdio. Para quem é assinante do HBO Max, o diretor-presidente da Warner Bros, David Zaslav, afirmou que o longa chegará ao catálogo do streaming no final de 2023.\n\nNa trama, a boneca que representa um ideal de ser perfeito entra em uma crise em que passa a questionar a própria existência. Estrelado por Margot Robbie (Eu, Tonya) e Ryan Gosling (La La Land: Cantando Estações), Barbie conta com direção e co-criação de Greta Gerwig, juntamente com Noah Baumbach.', 1, 'https://classic.exame.com/wp-content/uploads/2023/07/barbie.jpg?quality=70&strip=info&w=1024', 'Ujs1Ud7k49M', 1, 12, '2023-09-16 02:09:51', '2023-09-18 02:16:55'),
(14, 'Gladiador', 2000, 'Maximus é um poderoso general romano, amado pelo povo e pelo imperador Marcus Aurelius. Antes de sua morte, o Imperador desperta a ira de seu filho Commodus ao tornar pública a sua predileção em deixar o trono para Maximus. Sedento pelo poder, Commodus mata seu pai, assume a coroa e ordena a morte de Maximus, que consegue fugir antes de ser pego, e passa a se esconder como um escravo e gladiador enquanto vai atrás de vingança.\n', 0, 'https://br.web.img3.acsta.net/r_1280_720/medias/nmedia/18/68/64/41/19254510.jpg', 'cXg62-t8BWs', 1, 16, '2023-09-16 02:14:27', '2023-09-18 02:17:03'),
(15, 'Jurassic Park', 1993, 'Um parque construído por um milionário (Richard Attenborough) tem como habitantes dinossauros diversos, extintos a sessenta e cinco milhões de anos. Isto é possível por ter sido encontrado um inseto fossilizado, que tinha sugado sangue destes dinossauros, de onde pôde-se isolar o DNA, o código químico da vida, e, a partir deste ponto, recriá-los em laboratório. Mas, o que parecia ser um sonho se torna um pesadelo, quando a experiência sai do controle de seus criadores.', 0, 'https://boraassistir.com.br/media/images/thumbs/meta/1652807789.jpg', 'fLDR-YYK7jQ', 1, 12, '2023-09-16 02:18:43', '2023-09-18 02:17:07'),
(16, 'Supernatural 1ª Temporada', 2005, 'Os irmãos Sam e Dean Winchester perderam sua mãe há mais de 20 anos, em um incêndio envolto em mistérios. Desde então, os jovens viveram na estrada com o pai, John, que trabalha como caçador de criaturas sobrenaturais, profissão cujas habilidades tentou ensinar a seus filhos.\n\nQuando John desaparece em uma dessas viagens, os irmãos se vem obrigados a entrar para esse mundo de vez, em busca do pai. Nesse caminho, Sam e Dean se deparam com demônios e fantasmas, e salvam pessoas inocentes das ameaças dessas criaturas, enquanto juntam pistas sobre o paredero de seu pai.\n\nSam começa a desenvolver habilidade psíquicas e a ter visões misteriosas sem explicação. Quando finalmente encontram seu pai, Sam e Dean descobrem a verdade sobre como sua mãe morreu. Ela foi assassinada por um demônio de olhos amarelos (Azazel), que só pode ser morto por uma arma lendária criada por um homem chamado Samuel Colt.', 2, 'https://s.aficionados.com.br/imagens/season-1_cke.jpg', '31A0DqX6jHI', 1, 10, '2023-09-16 03:01:48', '2023-09-18 02:19:32'),
(17, 'Supernatural 2ª Temporada', 2006, 'Dean e Sam tentam lidar com a morte de John, enquanto seguem em sua busca por Azazel, responsável pela morte de Mary e Jessica Moore, namorada de Sam na primeira temporada. Os novos episódios apresentam os novos aliados dos irmãos Winchesters: Ellen, Jo e Ash.\n\nAzazel revela parte de seu plano, reúne todos e mata Sam. Para trazer o irmão de volta, Dean faz um pacto com o Demônio da Encruzilhada, prometendo sua alma em troca dentro de um ano. Dean finalmente mata Azazel, mas uma porta se abre e a Fúria é libertada.', 0, 'https://s.aficionados.com.br/imagens/season-2_cke.jpg', '31A0DqX6jHI', 1, 10, '2023-09-16 03:01:48', '2023-09-18 02:19:37'),
(18, 'Supernatural 3ª Temporada', 2007, 'A trama do terceiro ano da série gira em torno das tentativas dos irmãos Winchesters de salvar Dean de seu pacto, enquanto tentam deter os demônios que escaparam do inferno. Entre as novas personagens estão Ruby, um novo potencial interesse romântico de Sam que se diz capaz de ajudar Dean, e Bela Tabolt, uma vendedora de objetos ocultos.\n\nAo descobrir que a demônio Lilith é a responsável por manter o contrato de Dean, os irmãos e Ruby tentam matá-la. Primeiro demônio criado por Lúcifer, Lilith é extremamente poderosa, ficando abaixo apenas do próprio diabo. As habilidades misteriosas de Sam, contudo, parecem ter um efeito sobre ela. Antes que possam impedir, o contrato de Dean expira e sua alma é levada.', 0, 'https://s.aficionados.com.br/imagens/season-3_cke.jpg', '31A0DqX6jHI', 1, 10, '2023-09-16 03:01:48', '2023-09-18 02:19:45'),
(19, 'Supernatural 4ª Temporada', 2008, 'Um anjo chamado Castiel resgata Dean do inferno e o traz de volta à vida na Terra. Os irmãos Winchesters passam a trabalhar juntos com Castiel para impedir o plano de Lilith de quebrar os 66 selos que impedem o retorno de Lúcifer.\n\nCom a proximidade de entre Sam e Ruby, o relacionamento entre ele e Dean sofre uma tensão, principalmente após Sam beber o sangue de demônio e manifestar seu lado demoníaco, tudo com o objetivo de ganhar forças para enfrentar Lilith.\n\nSam consegue rastrear Lilith e a mata. Contudo, Lilith e Ruby estavam enganando o caçador, e Lilith era o último selo a ser quebrado. Dean chega e mata Ruby, mas a prisão de Lúcifer se abre.', 0, 'https://s.aficionados.com.br/imagens/season-4_cke.jpg', '31A0DqX6jHI', 1, 10, '2023-09-16 03:01:48', '2023-09-18 02:19:48'),
(20, 'Supernatural 5ª Temporada', 2009, 'A trama do quinto ano da série gira em torno da luta para impedir Lúcifer e o Apocalipse. Entre batalhas contra diferentes anjos e demônios, Dean e Sam lutam contra seus destinos de se tornarem receptáculos de Miguel e Lúcifer respectivamente.\n\nA temporada também ficou marcada pelo desenvolvimento de diferentes relacionamentos. Enquanto Sam e Dean parecem seguir se distanciando, Castiel se rebela contra o Céu por Dean, e Bobby também demonstra grande amizade por Castiel.', 0, 'https://s.aficionados.com.br/imagens/season-5_cke.jpg', '31A0DqX6jHI', 1, 10, '2023-09-16 03:01:48', '2023-09-18 02:19:51'),
(21, 'Supernatural 6ª Temporada', 2010, 'Uma temporada com grandes emoções, sua trama se passa um ano após os acontecimentos da quinta temporada. Dean está levando uma vida feliz e calma ao lado de Lisa e Ben Braeden, até que Sam retorna ao mundo dos vivos e faz com que o irmão volte a acompanhá-lo na batalha contra o sobrenatural.\n\nSam estava trabalhando com Samuel Campbell para caçar e capturar os monstros Alfas. Para recuperar sua filha, contudo, Samuel estava seguindo ordens de Crowley, que queria usar os Alfas para localizar o Purgatório e usar a vastidão de almas lá presas.\n\nCastiel trai o suposto acordo que tinha com Crowley para dividirem as almas do Purgatório, impede que ele abra as portas do local e, agora, cheio de poder, diz que não é mais apenas um anjo, mas sim o novo Deus.', 0, 'https://s.aficionados.com.br/imagens/season-6_cke.jpg', '31A0DqX6jHI', 1, 10, '2023-09-16 03:01:48', '2023-09-18 02:19:53'),
(22, 'Supernatural 7ª Temporada', 2011, 'Dean e Sam ainda tentam se recuperar da perda de um amigo. O emocional dois dois ainda segue abalado por motivos individuais: Sam segue perturbado por lembranças do inferno; já Sam guarda um segredo que pode separar os irmãos de uma vez por todas.\n\nEnquanto isso, o jogo parece virar fazendo dos irmãos a caça em vez de os caçadores. Isso porque criaturas mais malignas que os demônios, chamadas de Leviatãs, têm um terrível plano para a humanidade.\n\nApós absorver as almas do Purgatório, Castiel sofre por decisões erradas e segue tentando punir todos os malfeitores do mundo. Contudo, pela primeira vez, os irmãos Winchesters percebem que talvez deva ver o ex amigo como um inimigo.', 0, 'https://s.aficionados.com.br/imagens/season-7_cke.jpg', '31A0DqX6jHI', 1, 10, '2023-09-16 03:01:48', '2023-09-18 02:19:56'),
(23, 'Supernatural 8ª Temporada', 2012, 'Os novos episódios têm início com o improvável retorno de Dean à vida depois de um ano no Purgatório. O caçador, contudo, volta sem Castiel, mas na companhia de um misterioso parceiro de armas, cuja razão para fuga pode esconder mais informações.\n\nEnquanto Sam tenta conciliar a vida que construiu na ausência de Dean com o retorno às atividades como caçador, os irmãos partem na missão de encontrar as tábuas dos anjos e dos demônios, que supostamente teriam instruções sobre como fechar os portões do inferno.\n\nNa luta contra demônios como Crowley e Abaddon - que seguem disputando o título que um dia já pertenceu a Lúcifer - Sam e Dean terão um reencontro inesperado que os levará a descobertas chocantes sobre seu passado.', 0, 'https://s.aficionados.com.br/imagens/season-8_cke.jpg', '31A0DqX6jHI', 1, 10, '2023-09-16 03:01:48', '2023-09-18 02:19:59'),
(24, 'Supernatural 9ª Temporada', 2013, 'Metatron, o anjo escolhido por Deus para escrever sua Palavra, deixou o paraíso após o sumiço de seu senhor, com medo de os arcanjos tentarem roubar a Palavra de Deus. Para vingar essa fuga, contudo, é ele quem usa a Palavra para reconstruir o Paraíso e se tornar uma espécie de deus para os humanos. Para tanto, ele expulsa todos os anjos para a Terra, o que vai render várias rebeliões.\n\nApós o sacrifício que fez na temporada anterior, Sam está entre a vida e a morte. Para salvar Sam, Dean vai contra o pedido do irmão (o que pode abalar para sempre sua relação) e, em uma manobra arriscada, alia-se a Crowley.\n\nSurgem duas facções angelicais, que brigam entre si e tentam caçar Castiel. Castiel, por sua vez, forma um exército para tentar deter o novo vilão celestial. Em meio à nova relação com Crowley, Dean e Sam tentarão transformá-lo em um ser humano novamente.', 0, 'https://s.aficionados.com.br/imagens/season-9_cke.jpg', '31A0DqX6jHI', 1, 10, '2023-09-16 03:01:48', '2023-09-18 02:20:02'),
(25, 'Supernatural 10ª Temporada', 2014, 'A luta contra Metatron resultou na morte de Dean. O caçador, contudo, volta à vida como um demônio após ser ressuscitado pela Marca de Caim. Como novo aliado de Crowley, ele desaparece ao seguir uma vida de crueldades e sem arrependimentos. o 10º ano da série, portanto, tem início com Sam em sua busca desesperada pelo irmão.\n\nMesmo com seus poderes enfraquecidos e com anjos desonestos à solta, Castiel tenta \"reorganizar\" o Céu, enquanto ainda precisa lidar com um reencontro do seu passado e com o tempo de sua mortalidade.\n\nA misteriosa bruxa Rowena está entre os personagens novos. Dean e Sam precisarão se juntar a novos, velhos e muito improváveis aliados.', 0, 'https://s.aficionados.com.br/imagens/season-10_cke.jpg', '31A0DqX6jHI', 1, 10, '2023-09-16 03:01:48', '2023-09-18 02:20:05'),
(26, 'Supernatural 11ª Temporada', 2015, 'Com a remoção da marca da Caim no braço de Dean, Escuridão (Amara), um entidade mais antiga que Deus, acaba sendo libertada. Irmã de Deus, Amara tem fortes ressentimentos com seu irmão, que a prendeu para evitar a destruição total que ela poderia causar.\n\nDean acaba descobrindo uma inesperada ligação com Amara (Escuridão). Sam, Dean e Castiel não vão medir esforços para salvar o mundo, chegando até mesmo a buscar um acordo com Lúcifer.\n\nApós ser enfeitiçado por Rowena, contudo, Castiel fica descontrolado e se isola. Por não conseguir ajudar como antes, ele toma uma decisão que pode afetar todos de forma irremediável.', 0, 'https://s.aficionados.com.br/imagens/season-11_cke.jpg', '31A0DqX6jHI', 1, 10, '2023-09-16 03:01:48', '2023-09-18 02:20:08'),
(27, 'Supernatural 12ª Temporada', 2016, 'Como presente para Dean, Amara/Escuridão ressuscitou Mary Winchester. Contudo, o retorno da matriarca dos Winchesters não é só alegrias. Enquanto a caçadora tenta se adaptar à nova realidade em que foi inserida anos depois de sua morte, entre conflitos pessoais e com seus filhos, a família precisa enfrentar os Homens das Letras Britânicos.\n\nOs novos vilões se destacam por serem cruéis e imprevisíveis, com uma sede por mortes que ameaçam tanto o filho de Lúcifer quanto a mãe de Sam e Dean. Além disso, Sam é capturado e torturado por seus pecados passados, o que faz com que Dean, Mary e Castiel precisem de um plano para resgatá-lo.', 0, 'https://s.aficionados.com.br/imagens/season-12_cke.jpg', '31A0DqX6jHI', 1, 10, '2023-09-16 03:01:48', '2023-09-18 02:20:10'),
(28, 'Supernatural 13ª Temporada', 2017, 'Os acontecimentos da temporada anterior fizeram com que Dean e Sam perdessem vários de seus aliados, algo que ainda tentam superar. O maior baque para os irmãos, contudo, foi o sequestro de sua mãe, mantida viva como refém de Lúcifer.\n\nJack, filho de Lúcifer, involuntariamente traz Castiel de volta à vida. Ainda tentando provar aos irmãos Winchesters que ele é uma boa pessoa, Jack tenta resgatar Mary com a ajuda de Castiel.', 0, 'https://s.aficionados.com.br/imagens/season-13.jpg', '31A0DqX6jHI', 1, 10, '2023-09-16 03:01:48', '2023-09-18 02:20:14'),
(29, 'Supernatural 14ª Temporada', 2018, 'Dean segue desaparecido. Para tentar encontrá-lo, Castiel acaba fazendo um acordo com o demônio Kip, que deseja fazer um acordo com Sam para se tornar o novo Rei do Inferno. Jack, que perdeu sua graça na temporada anterior, tenta se adaptar à vida como humano.\n\nUma série de desaparecimentos misteriosos estão sendo investigados por Sam e Charlie. Nick segue um perigoso caminho ao procurar respostas para as mortes de sua esposa e de seu filho.\n\nSam e Dean se deparam com um aliado inesperado. Enquanto isso, Castiel faz um grande sacrifício para salvar o Céu de um perigoso ataque.\n\nA temporada foi marcada ainda por contar com o 300º episódio da série, que teve a participação de Jeffrey Dean Morgan, de volta ao papel de John Winchester.', 0, 'https://s.aficionados.com.br/imagens/season-14_cke.jpg', '31A0DqX6jHI', 1, 10, '2023-09-16 03:01:48', '2023-09-18 02:20:16'),
(30, 'Supernatural 15ª Temporada', 2019, 'A jornada épica dos irmãos Winchester chega ao fim quando Supernatural entra em sua temporada final. Sam (Jared Padalecki) e Dean (Jensen Ackles) lutaram contra demônios e anjos, criaturas míticas e monstros, em uma busca aparentemente interminável para salvar o mundo. Mas na batalha final, eles enfrentam o próprio Deus (Rob Benedict), recusando-se a matar seu filho nefilim substituto, Jack (Alexander Calvert), e trazendo assim a decisão de Deus de acabar com essa realidade de uma vez por todas.', 0, 'https://s.aficionados.com.br/imagens/season-15_cke.jpg', '31A0DqX6jHI', 1, 10, '2023-09-16 03:01:48', '2023-09-18 02:20:18');

--
-- Truncar tabela antes do insert `filmes_atores`
--

TRUNCATE TABLE `filmes_atores`;
--
-- Extraindo dados da tabela `filmes_atores`
--

INSERT INTO `filmes_atores` (`id_filme`, `id_ator`) VALUES
(1, 2),
(1, 3);

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
(1, 2),
(1, 3),
(1, 4),
(13, 9),
(14, 2),
(14, 3),
(15, 1),
(15, 10);

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
(1, 'Denilson Alves', 'denilson', '$2a$10$O0jCvaGpLpVSE/kwCZ5RWuZCJDMoIjy.QZ1yyBk4morwSS5dlWUC6', 'denilson@gmail.com', 'Masculino', NULL, '2023-08-13', 1, '2023-08-13 02:23:22', '2023-09-16 16:04:14'),
(2, 'João Carlos', 'juca', '$2a$10$dces8VLBoEQlEiZOVfpkJuxk1senc381jx5jxd2hXZBO8n2oMDiru', 'juca@gmail.com', 'Masculino', NULL, '2023-08-14', 2, '2023-08-14 01:55:42', '2023-09-16 16:04:18'),
(3, 'Paula', 'paula88', '$2a$10$4n5IVkyn0D84RVX.Z9SwLewwWcJzwMO/hfxezXJj/qw5p.grCp5ly', 'paula@gmail.com', 'Feminino', NULL, '2023-08-07', 2, '2023-08-17 03:12:03', '2023-09-16 16:04:23'),
(4, 'Claudio', 'claudinho', '$2a$10$O968NJ5O.eiHpbmGF5ReGOEdeG6RXzjfQ4qZbYO9dDzUcI3a2nXym', 'claudinho@gmail.com', 'Masculino', NULL, '2023-08-02', 2, '2023-08-17 03:12:28', '2023-09-16 16:04:27');
COMMIT;
