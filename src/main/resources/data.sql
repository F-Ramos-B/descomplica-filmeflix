-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 28-Ago-2023 às 20:24
-- Versão do servidor: 10.4.22-MariaDB
-- versão do PHP: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

--
-- Banco de dados: `descomplica_filmeflix`
--

--
-- Extraindo dados da tabela `atores`
--

INSERT INTO `atores` (`id`, `nome`, `sobrenome`, `data_nascimento`, `biografia`, `created_at`, `updated_at`) VALUES
(2, 'Arnold', 'Schwarzenegger', '1947-07-30', 'ghytfhjythu', '2023-08-24 21:14:25', '2023-08-24 21:14:25'),
(3, 'Clint', 'Eastwood', '1930-05-31', 'tsgrgreg', '2023-08-24 21:18:09', '2023-08-24 21:18:09');

--
-- Extraindo dados da tabela `avaliacoes`
--

INSERT INTO `avaliacoes` (`id`, `id_usuario`, `id_filme`, `id_playlist`, `nota`, `critica`, `created_at`, `updated_at`) VALUES
(2, 2, 1, NULL, 4, 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum facilisis aliquam lorem id porta. Praesent vitae fermentum diam. Nulla consectetur convallis rhoncus. Cras rutrum ligula quis magna semper, nec accumsan ipsum eleifend. Nunc nec sem ultricies risus congue vehicula ac vitae lorem. In condimentum facilisis dolor non lacinia. Proin tempus mattis nunc sit amet tempus. Mauris lacinia risus nisl, nec pharetra risus fringilla id. Phasellus eget semper enim. Fusce sed justo commodo, scelerisque mi et, bibendum ipsum. Sed hendrerit non urna in vestibulum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae;\r\n\r\nNulla congue eget mi id vehicula. Aliquam vulputate commodo augue, in dapibus felis elementum at. In hac habitasse platea dictumst. Aliquam maximus venenatis ex in posuere. Phasellus accumsan, tellus vitae ultricies placerat, purus mauris ullamcorper erat, ac tincidunt eros enim in mi. In hac habitasse platea dictumst. Cras posuere nisl ', '2023-08-24 21:00:13', '2023-08-24 22:27:26'),
(3, 4, 1, NULL, 5, 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam tincidunt malesuada quam, sed euismod magna fringilla vitae. Curabitur viverra molestie metus eu tristique. Praesent laoreet egestas luctus. Integer gravida nisl eros, eget tempus ipsum dictum non. In venenatis dolor sit amet tristique hendrerit. Nulla efficitur velit nulla, eu suscipit ex accumsan ultricies. Nulla et dignissim mauris. Nullam hendrerit molestie quam sit amet iaculis.\r\n\r\nCurabitur nibh magna, consequat eget fringilla eget, laoreet in dolor. Nunc neque purus, porta sit amet rutrum sit amet, euismod et ante. Cras sit amet ligula tellus. Praesent ut turpis a erat molestie venenatis. Quisque tincidunt ipsum scelerisque felis bibendum, sed ornare ligula feugiat. Aenean varius elit neque, at efficitur sem sollicitudin sagittis. Pellentesque finibus imperdiet scelerisque. Praesent aliquet placerat turpis, rutrum dictum leo porttitor quis. Integer mattis sapien at velit gravida efficitur. Vivamus eu molestie erat, non', '2023-08-24 21:00:33', '2023-08-24 22:27:47'),
(7, 3, 1, NULL, 1, 'agsdfsadvsd', '2023-08-26 18:59:21', '2023-08-26 18:59:21');

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
-- Extraindo dados da tabela `filmes`
--

INSERT INTO `filmes` (`id`, `titulo`, `descricao`, `numero_visualizacoes`, `link_imagem`, `link_filme`, `id_plataforma`, `classificacao_indicativa`, `created_at`, `updated_at`) VALUES
(1, 'Ataque dos ETs de Varginha', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum vitae sem eget mi varius auctor quis ut sapien. Nulla nulla ante, pulvinar quis lacus in, accumsan pretium nisl. Quisque scelerisque quam sed consectetur efficitur. Donec vehicula, tellus eu suscipit scelerisque, dolor diam cursus diam, vel faucibus odio lectus sed quam. Suspendisse efficitur pulvinar arcu, aliquam blandit lacus congue in. Nam non orci elementum, tincidunt ligula et, porta erat. Fusce vel molestie nibh. Nulla rh', 153, 'https://s2-g1.glbimg.com/CJKiIY0mkzEijUth7BiwRaZaj4A=/0x0:1280x960/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2023/y/P/lBjRbHQsynRPfDpo3MzQ/nave-et-de-varginha.jpeg', 'JHPc9vzE_CI', 1, 14, '2023-08-21 19:18:48', '2023-08-27 00:15:07'),
(2, 'Ataque dos ETs de Varginha', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum vitae sem eget mi varius auctor quis ut sapien. Nulla nulla ante, pulvinar quis lacus in, accumsan pretium nisl. Quisque scelerisque quam sed consectetur efficitur. Donec vehicula, tellus eu suscipit scelerisque, dolor diam cursus diam, vel faucibus odio lectus sed quam. Suspendisse efficitur pulvinar arcu, aliquam blandit lacus congue in. Nam non orci elementum, tincidunt ligula et, porta erat. Fusce vel molestie nibh. Nulla rh', 140, 'https://s2-g1.glbimg.com/CJKiIY0mkzEijUth7BiwRaZaj4A=/0x0:1280x960/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2023/y/P/lBjRbHQsynRPfDpo3MzQ/nave-et-de-varginha.jpeg', 'JHPc9vzE_CI', 1, 14, '2023-08-21 19:18:48', '2023-08-27 00:15:07'),
(3, 'Ataque dos ETs de Varginha', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum vitae sem eget mi varius auctor quis ut sapien. Nulla nulla ante, pulvinar quis lacus in, accumsan pretium nisl. Quisque scelerisque quam sed consectetur efficitur. Donec vehicula, tellus eu suscipit scelerisque, dolor diam cursus diam, vel faucibus odio lectus sed quam. Suspendisse efficitur pulvinar arcu, aliquam blandit lacus congue in. Nam non orci elementum, tincidunt ligula et, porta erat. Fusce vel molestie nibh. Nulla rh', 140, 'https://s2-g1.glbimg.com/CJKiIY0mkzEijUth7BiwRaZaj4A=/0x0:1280x960/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2023/y/P/lBjRbHQsynRPfDpo3MzQ/nave-et-de-varginha.jpeg', 'JHPc9vzE_CI', 1, 14, '2023-08-21 19:18:48', '2023-08-27 00:15:07'),
(4, 'Ataque dos ETs de Varginha', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum vitae sem eget mi varius auctor quis ut sapien. Nulla nulla ante, pulvinar quis lacus in, accumsan pretium nisl. Quisque scelerisque quam sed consectetur efficitur. Donec vehicula, tellus eu suscipit scelerisque, dolor diam cursus diam, vel faucibus odio lectus sed quam. Suspendisse efficitur pulvinar arcu, aliquam blandit lacus congue in. Nam non orci elementum, tincidunt ligula et, porta erat. Fusce vel molestie nibh. Nulla rh', 139, 'https://s2-g1.glbimg.com/CJKiIY0mkzEijUth7BiwRaZaj4A=/0x0:1280x960/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2023/y/P/lBjRbHQsynRPfDpo3MzQ/nave-et-de-varginha.jpeg', 'JHPc9vzE_CI', 1, 14, '2023-08-21 19:18:48', '2023-08-27 00:15:07'),
(5, 'Ataque dos ETs de Varginha', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum vitae sem eget mi varius auctor quis ut sapien. Nulla nulla ante, pulvinar quis lacus in, accumsan pretium nisl. Quisque scelerisque quam sed consectetur efficitur. Donec vehicula, tellus eu suscipit scelerisque, dolor diam cursus diam, vel faucibus odio lectus sed quam. Suspendisse efficitur pulvinar arcu, aliquam blandit lacus congue in. Nam non orci elementum, tincidunt ligula et, porta erat. Fusce vel molestie nibh. Nulla rh', 140, 'https://s2-g1.glbimg.com/CJKiIY0mkzEijUth7BiwRaZaj4A=/0x0:1280x960/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2023/y/P/lBjRbHQsynRPfDpo3MzQ/nave-et-de-varginha.jpeg', 'JHPc9vzE_CI', 1, 14, '2023-08-21 19:18:48', '2023-08-27 00:15:07'),
(6, 'Ataque dos ETs de Varginha', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum vitae sem eget mi varius auctor quis ut sapien. Nulla nulla ante, pulvinar quis lacus in, accumsan pretium nisl. Quisque scelerisque quam sed consectetur efficitur. Donec vehicula, tellus eu suscipit scelerisque, dolor diam cursus diam, vel faucibus odio lectus sed quam. Suspendisse efficitur pulvinar arcu, aliquam blandit lacus congue in. Nam non orci elementum, tincidunt ligula et, porta erat. Fusce vel molestie nibh. Nulla rh', 139, 'https://s2-g1.glbimg.com/CJKiIY0mkzEijUth7BiwRaZaj4A=/0x0:1280x960/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2023/y/P/lBjRbHQsynRPfDpo3MzQ/nave-et-de-varginha.jpeg', 'JHPc9vzE_CI', 1, 14, '2023-08-21 19:18:48', '2023-08-27 00:15:07');

--
-- Extraindo dados da tabela `filmes_atores`
--

INSERT INTO `filmes_atores` (`id_filme`, `id_ator`) VALUES
(1, 2),
(1, 3);

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
-- Extraindo dados da tabela `generos_filmes`
--

INSERT INTO `generos_filmes` (`id_filme`, `id_genero`) VALUES
(1, 2),
(1, 3),
(1, 4);

--
-- Extraindo dados da tabela `perfis`
--

INSERT INTO `perfis` (`id`, `descricao`) VALUES
(1, 'ADMIN'),
(2, 'USUARIO');

--
-- Extraindo dados da tabela `plataformas`
--

INSERT INTO `plataformas` (`id`, `nome`, `link_prefixo`, `created_at`, `updated_at`) VALUES
(1, 'Youtube', 'https://www.youtube.com/embed/', '2023-08-21 02:10:41', '2023-08-22 23:06:18'),
(2, 'Dailymotion', 'https://www.dailymotion.com/embed/video/', '2023-08-21 02:10:41', '2023-08-22 23:06:21');

--
-- Extraindo dados da tabela `usuarios`
--

INSERT INTO `usuarios` (`id`, `nome`, `apelido`, `senha`, `email`, `genero`, `link_avatar`, `data_nascimento`, `id_perfil`, `created_at`, `updated_at`) VALUES
(1, 'Denilson Alves', 'denilson', '$2a$10$O0jCvaGpLpVSE/kwCZ5RWuZCJDMoIjy.QZ1yyBk4morwSS5dlWUC6', 'string', 'string', NULL, '2023-08-13', 1, '2023-08-13 02:23:22', '2023-08-24 22:17:42'),
(2, 'João Carlos', 'juca', '$2a$10$dces8VLBoEQlEiZOVfpkJuxk1senc381jx5jxd2hXZBO8n2oMDiru', 'string', 'string', NULL, '2023-08-14', 2, '2023-08-14 01:55:42', '2023-08-24 22:17:36'),
(3, 'tyu', 'fhg', '$2a$10$4n5IVkyn0D84RVX.Z9SwLewwWcJzwMO/hfxezXJj/qw5p.grCp5ly', 'prof1@email.com', 'fty', NULL, '2023-08-07', 2, '2023-08-17 03:12:03', '2023-08-17 03:12:03'),
(4, 'Claudio', 'claudinho', '$2a$10$O968NJ5O.eiHpbmGF5ReGOEdeG6RXzjfQ4qZbYO9dDzUcI3a2nXym', 'prof1@egmail.com', 'werads', NULL, '2023-08-02', 2, '2023-08-17 03:12:28', '2023-08-24 22:18:01');
COMMIT;
