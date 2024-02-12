# Segundo Projeto Prático de Gerência

Será descrito aqui o enunciado do ``Segundo Projeto Prático`` da disciplina.

## Enunciado

Faça a modelagem de domínio e de arquitetura de um sistema de ``blog``. O sistema deverá ser capaz de comportar múltiplos usuários. Cada usuário será capaz de realizar ``posts``. Um ``post`` deve conter um título, autor, conteúdo e data de postagem. Em seguida, utilizando ``Arquitetura Limpa``, implemente a ``camada de domínio`` e os ``casos de uso`` do ``backend`` do sistema modelado aplicando princípios ``SOLID``. O ``backend`` deve ser uma ``API REST`` que exponha ``endpoints`` para:

1. Criação de novo usuário
2. Criação de novo ``post``
3. Listagem de todos os ``posts``
4. Listagem de todos os ``posts`` de um usuário específico
5. Exibição de um ``post`` específico

**OBS: Não precisa implementar a camada de persistência e de controle.**

## Regras do sistema

1. Um usuário deve possuir um nome, email, senha e nickname.
2. Um ``post`` deve possuir um título, autor, conteúdo e data de postagem. O autor deve ser um nickname referente a um usuário que já esteja cadastrado no sistema.
3. O conteúdo de um ``post`` deve ser limitado a 250 caracteres máximos.
4. A data de postagem deve ser gerada automaticamente no momento da criação do ``post``.
5. O título de um ``post`` deve ser limitado a 50 caracteres máximos.

## Regras

- O projeto pode ser desenvolvido em grupos de até duas pessoas. 
- A entrega será realizada na aula do dia ``23-02-2024``. 
- Será imprescindível que os membros do grupo expliquem o código.
- A avaliação será realizada em cima da apresentação da aplicação, dos modelos e do domínio individual de cada membro sobre o que foi desenvolvido.
- A linguagem de programação é livre.
- A aplicação que apresentar testes unitários receberá 20% de bônus na nota final.