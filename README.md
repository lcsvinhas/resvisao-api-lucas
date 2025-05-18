# 🎸 API de Bandas - Revisão Serratec

Este projeto é uma API REST simples desenvolvida em Java com Spring Boot. Ele permite o gerenciamento de uma lista de bandas, incluindo operações para listar, buscar, adicionar, atualizar e remover bandas.

## 🧱 Estrutura

O projeto contém:

- **Entidade `Banda`**: Representa uma banda com `id`, `nome` e `gênero`.
- **Controller `BandaController`**: Responsável por expor os endpoints REST para manipulação das bandas.

---

## 🚀 Endpoints Disponíveis

### `GET /bandas`
Retorna a lista de todas as bandas disponíveis.

### `GET /bandas/{id}`
Busca uma banda pelo seu ID.

**Exemplo:**  
`GET /bandas/100`

### `GET /bandas/nome?nome={nome}`
Busca uma banda pelo nome (via parâmetro de query).

**Exemplo:**  
`GET /bandas/nome?nome=Djavan`

### `POST /bandas`
Adiciona uma nova banda.

**Corpo da Requisição (JSON):**
```json
{
  "id": 500,
  "nome": "Tears for Fears",
  "genero": "Alternativa"
}
```

### `PUT /bandas/{id}`
Atualiza uma banda existente com base no ID.

**Corpo da Requisição (JSON):**
```json
{
  "nome": "Queen",
  "genero": "Rock"
}
```

### `DELETE /bandas/{id}`
Remove uma banda com base no ID.

---

## 🧪 Dados de Testes Iniciais

A aplicação inicia com uma lista estática de bandas:

| ID   | Nome         | Gênero     |
|------|--------------|------------|
| 100  | Djavan       | Bossa Nova |
| 200  | Lady Gaga    | Pop        |
| 300  | Led Zeppelin | Rock       |
| 400  | Air Supply   | Pop        |

---

## 💡 Observações

- Os dados são armazenados em memória (lista estática). Não há persistência em banco de dados.
- Ideal para fins didáticos e primeiros testes com Spring Boot e APIs REST.

---

## 🛠 Tecnologias Utilizadas

- Java 17
- Spring Boot

---

## 📁 Pacotes

- `org.serratec.backend.entity` - Contém a classe `Banda`.
- `org.serratec.backend.controller` - Contém o controller REST `BandaController`.

---

## 📌 Como Rodar o Projeto

1. Clone o repositório:
   ```
   git clone https://github.com/lcsvinhas/revisao-api-lucas.git
   ```
2. Abra em uma IDE com suporte a Spring Boot (como IntelliJ ou Spring Tools).
3. Execute a aplicação via classe principal.
4. Use ferramentas como Postman, Insomnia ou curl para testar os endpoints (importe o arquivo "revisaoLucas.postman_collection.json").