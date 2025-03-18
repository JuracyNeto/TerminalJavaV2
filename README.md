# # Simulador de Terminal em Java

Este projeto implementa um terminal de comandos básico em Java, permitindo a execução de comandos como `cd` (mudar diretório), `cat` (ler arquivos) e outros. Ele simula um ambiente de linha de comando interativo com suporte a um histórico de comandos.

## 📌 Funcionalidades

- **Interface de Linha de Comando (CLI)**
- **Comando `cat`** para exibir o conteúdo de arquivos de texto
- **Comando `cd`** para navegar entre diretórios
- **Comando `echo`** para adicionar texto a arquivos
- **Comando `ls`** para listar arquivos e diretórios
- **Comando `mkdir`** para criar diretórios
- **Comando `touch`** para criar arquivos
- **Comando `rm`** para remover arquivos e diretórios
- **Comando `pwd`** para exibir o diretório atual
- **Comando `history`** para visualizar o histórico de comandos
- **Gerenciamento de diretórios e arquivos**

---

## 📜 Como Usar

1. **Compilar o projeto:**
   ```sh
   javac *.java
   ```
2. **Executar o terminal:**
   ```sh
   java Terminal
   ```
3. **Usar os comandos disponíveis:**
   - `cd <diretório>` → Muda para o diretório especificado
   - `cat <arquivo>` → Exibe o conteúdo de um arquivo
   - `echo "texto" <arquivo>` → Adiciona texto a um arquivo
   - `ls` → Lista arquivos no diretório atual
   - `mkdir <nome>` → Cria um novo diretório
   - `touch <arquivo>` → Cria um novo arquivo
   - `rm <arquivo/diretório>` → Remove um arquivo ou diretório
   - `pwd` → Exibe o diretório atual
   - `history` → Exibe o histórico de comandos
   - `exit` → Fecha o terminal

---

## 🛠 Estrutura do Código

O projeto é composto pelas seguintes classes:

### 🔹 `Terminal`
Classe principal que gerencia a entrada do usuário e exibe o prompt formatado.

- Captura os comandos digitados e os repassa para `CommandHandler`.
- Mantém um loop contínuo até o usuário digitar `exit`.

### 🔹 `Command`
Interface para padronizar a execução dos comandos.

```java
public interface Command {
    void execute(String[] args);
}
```

### 🔹 `CommandHandler`
Responsável por interpretar e executar os comandos digitados pelo usuário.

- Mantém um **mapa de comandos** (`Map<String, Command>`) para registrar e chamar os comandos dinamicamente.
- Quando o usuário digita um comando, ele é buscado no mapa e executado.

### 🔹 `DirectoryManager`
Gerencia operações de diretórios, incluindo a criação e mudança de diretórios.

- **`changeDirectory(String caminho)`** → Altera o diretório atual.
- **`createDirectory(String nome)`** → Cria um novo diretório.

### 🔹 `FileManager`
Gerencia operações de arquivos, incluindo criação e manipulação.

- **`createFile(String nome)`** → Cria um novo arquivo no diretório atual.

### 🔹 Comandos Implementados

- **`CatCommand`** → Exibe o conteúdo de um arquivo.
- **`CdCommand`** → Permite navegar entre diretórios.
- **`EchoCommand`** → Adiciona texto a um arquivo.
- **`LsCommand`** → Lista arquivos e diretórios.
- **`MkdirCommand`** → Cria diretórios.
- **`PwdCommand`** → Exibe o diretório atual.
- **`RmCommand`** → Remove arquivos e diretórios.
- **`TouchCommand`** → Cria arquivos.
- **`HistoryCommand`** → Exibe o histórico de comandos.
- **`HistoryManager`** → Gerencia o armazenamento e recuperação do histórico de comandos.

---

## 🚀 Melhorias Futuras
- Implementar autocompletar de comandos.
- Adicionar suporte a execução de scripts.
- Melhorar o sistema de permissões para manipulação de arquivos.

---

## 📌 Conclusão
Este simulador de terminal oferece uma base sólida para aprender sobre a implementação de **linha de comando em Java**, uso de **interfaces**, manipulação de **arquivos e diretórios** e personalização com **histórico de comandos**. Explore e expanda com novos recursos! 🚀

