CREATE TABLE `perfis` (
  `id` integer PRIMARY KEY,
  `descricao` varchar(20)
);

CREATE TABLE `usuarios` (
  `id` integer PRIMARY KEY AUTO_INCREMENT,
  `nome` varchar(100),
  `apelido` varchar(30),
  `senha` varchar(100),
  `email` varchar(50),
  `genero` varchar(50),
  `link_avatar` varchar(250),
  `data_nascimento` date,
  `id_perfil` integer,
  `created_at` timestamp DEFAULT (now()),
  `updated_at` timestamp DEFAULT (now()) ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE `enderecos` (
  `id` integer PRIMARY KEY AUTO_INCREMENT,
  `id_usuario` integer,
  `cep` varchar(8),
  `logradouro` varchar(50),
  `complemento` varchar(50),
  `bairro` varchar(50),
  `cidade` varchar(50),
  `id_uf` integer,
  `created_at` timestamp DEFAULT (now()),
  `updated_at` timestamp DEFAULT (now()) ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE `estados` (
  `id` integer PRIMARY KEY,
  `uf` varchar(2),
  `nome` varchar(50)
);

CREATE TABLE `contatos` (
  `id` integer PRIMARY KEY AUTO_INCREMENT,
  `id_usuario` integer,
  `ddd` varchar(2),
  `numero` varchar(20),
  `created_at` timestamp DEFAULT (now()),
  `updated_at` timestamp DEFAULT (now()) ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE `filmes` (
  `id` integer PRIMARY KEY AUTO_INCREMENT,
  `titulo` varchar(50),
  `descricao` varchar(500),
  `numero_visualizacoes` integer,
  `link_imagem` varchar(255),
  `link_filme` varchar(255),
  `id_plataforma` integer,
  `classificacao_indicativa` integer,
  `created_at` timestamp DEFAULT (now()),
  `updated_at` timestamp DEFAULT (now()) ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE `generos` (
  `id` integer PRIMARY KEY,
  `genero` varchar(50)
);

CREATE TABLE `generos_filmes` (
  `id_filme` integer,
  `id_genero` integer,
  PRIMARY KEY (`id_filme`, `id_genero`)
);

CREATE TABLE `plataformas` (
  `id` integer PRIMARY KEY AUTO_INCREMENT,
  `nome` varchar(50),
  `link_prefixo` varchar(255),
  `created_at` timestamp DEFAULT (now()),
  `updated_at` timestamp DEFAULT (now()) ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE `atores` (
  `id` integer PRIMARY KEY AUTO_INCREMENT,
  `nome` varchar(50),
  `sobrenome` varchar(500),
  `data_nascimento` date,
  `biografia` varchar(500),
  `created_at` timestamp DEFAULT (now()),
  `updated_at` timestamp DEFAULT (now()) ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE `filmes_atores` (
  `id_filme` integer,
  `id_ator` integer,
  PRIMARY KEY (`id_filme`, `id_ator`)
);

CREATE TABLE `avaliacoes` (
  `id` integer PRIMARY KEY AUTO_INCREMENT,
  `id_usuario` integer,
  `id_filme` integer,
  `id_playlist` integer,
  `nota` integer,
  `critica` varchar(1000),
  `data_hora_avaliacao` timestamp,
  `created_at` timestamp DEFAULT (now()),
  `updated_at` timestamp DEFAULT (now()) ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE `playlists` (
  `id` integer PRIMARY KEY AUTO_INCREMENT,
  `nome` varchar(20),
  `avaliacao` int,
  `data_hora_avaliacao` timestamp,
  `created_at` timestamp DEFAULT (now()),
  `updated_at` timestamp DEFAULT (now()) ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE `playlists_filmes` (
  `id_filme` integer,
  `id_playlist` integer,
  `created_at` timestamp DEFAULT (now()),
  PRIMARY KEY (`id_filme`, `id_playlist`)
);

ALTER TABLE `contatos` ADD FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id`);

ALTER TABLE `enderecos` ADD FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id`);

ALTER TABLE `filmes_atores` ADD FOREIGN KEY (`id_filme`) REFERENCES `filmes` (`id`);

ALTER TABLE `filmes_atores` ADD FOREIGN KEY (`id_ator`) REFERENCES `atores` (`id`);

ALTER TABLE `avaliacoes` ADD FOREIGN KEY (`id_filme`) REFERENCES `filmes` (`id`);

ALTER TABLE `avaliacoes` ADD FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id`);

ALTER TABLE `usuarios` ADD FOREIGN KEY (`id_perfil`) REFERENCES `perfis` (`id`);

ALTER TABLE `enderecos` ADD FOREIGN KEY (`id_uf`) REFERENCES `estados` (`id`);

ALTER TABLE `filmes` ADD FOREIGN KEY (`id_plataforma`) REFERENCES `plataformas` (`id`);

ALTER TABLE `avaliacoes` ADD FOREIGN KEY (`id_playlist`) REFERENCES `playlists` (`id`);

ALTER TABLE `playlists_filmes` ADD FOREIGN KEY (`id_filme`) REFERENCES `filmes` (`id`);

ALTER TABLE `playlists_filmes` ADD FOREIGN KEY (`id_playlist`) REFERENCES `playlists` (`id`);

ALTER TABLE `generos_filmes` ADD FOREIGN KEY (`id_filme`) REFERENCES `filmes` (`id`);

ALTER TABLE `generos_filmes` ADD FOREIGN KEY (`id_genero`) REFERENCES `generos` (`id`);
