
# Sistema de Cadastro de Usuários

Uma API RESTful desenvolvida em **Spring Boot** para gerenciar usuários. Este sistema permite adicionar, editar, listar e excluir usuários, integração com banco de dados.

---

## 📋 Funcionalidades

- **CRUD de Usuários**: 
  - Adicionar, listar, editar e excluir usuários.

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem**: Java 17+
- **Framework**: Spring Boot
- **Banco de Dados**: MySQL 
- **Ferramentas de Construção**: Maven 
- **Dependências**:
  - Spring Web
  - Spring Data JDBC
  - MySQL Driver

---

### Pré-requisitos

1. **Java 17+** instalado.
2. **Banco de Dados** MySQL configurado (opcional se usar H2).
3. **IDE** com suporte a Maven/Gradle (IntelliJ IDEA, Eclipse, etc.).

### Configuração

1. Clone o repositório:
   ```bash
   git clone https://github.com/peseoaar/api-crud.git
   ```

2. Configure o arquivo `application.properties` com os dados do banco de dados:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_banco
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
   spring.jpa.hibernate.ddl-auto=update
   ```


3. Compile e inicie o projeto:
   - Com Maven:
     ```bash
     ./mvn spring-boot:run
     ```
   - Com Gradle:
     ```bash
     ./gradle bootRun
     ```

4. Acesse a API em `http://localhost:8080`.

---

## 🔗 Endpoints Disponíveis

### Usuários
| Método | Endpoint           | Descrição                         |
|--------|--------------------|-----------------------------------|
| GET    | `/usuarios`           | Lista todos os usuários        |
| GET    | `/usuarios/{id}`      | Consulta um usuário específico |
| POST   | `/usuarios`           | Adiciona um novo usuário       |
| PUT    | `/usuarios/{id}`      | Edita um usuário existente     |
| DELETE | `/usuarios/{id}`      | Exclui um usuário              |

### Exportação
| Método | Endpoint           | Descrição                                |
|--------|--------------------|------------------------------------------|
| GET    | `/users/export`    | Exporta a lista de usuários em formato CSV |

---

## 🧪 Testes

1. **Testes Manuais**:
   - Use ferramentas como Postman para testar os endpoints.
---

## 📂 Estrutura do Projeto

```plaintext
src/main/java/com/seuusuario/cadastro
├── controller       # Endpoints da API
├── model            # Classes de modelo (ex.: User)
├── repository       # Interfaces de acesso ao banco de dados
├── service          # Lógica de negócios
```



