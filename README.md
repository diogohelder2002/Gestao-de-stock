# 📦 Sistema de Gestão de Stock e Vendas

Um sistema robusto e intuitivo para gerir o inventário e as vendas de qualquer negócio de retalho. Desenvolvido em Java, esta aplicação oferece controlo total sobre produtos, preços e stock em tempo real.

## 📋 Sobre o Projeto

O **Sistema de Gestão de Stock e Vendas** é uma solução versátil com o objectivo de:
- 📦 Gerir o inventário de produtos
- 💰 Controlar preços e promoções
- 📊 Acompanhar vendas e receitas
- 🔍 Localizar produtos rapidamente
- ⚙️ Manter um registo organizado do stock

## ✨ Funcionalidades

| Funcionalidade | Descrição |
|---|---|
| **1. Adicionar Produto** | Introduza novos produtos com nome, preço e quantidade em stock |
| **2. Listar Produtos** | Visualize todos os produtos registados com os seus detalhes |
| **3. Vender Produto** | Registe vendas e actualize automaticamente o stock |
| **4. Procurar Produto** | Localize um produto específico por nome |
| **5. Remover Produto** | Elimine produtos do sistema |
| **6. Alterar Preço** | Actualize o preço de qualquer produto |
| **7. Ver Totais** | Consulte o valor total de vendas realizadas |
| **8. Sair** | Encerre o programa com segurança |

## 🏗️ Estrutura do Projeto

```
Sistema de gestao/
├── src/
│   └── sistema/
│       ├── Main.java          # Aplicação principal (menu interactivo)
│       ├── Funcoes.java       # Lógica de negócio
│       └── Produto.java       # Modelo de dados
```

### 📄 Componentes

- **Main.java**: Interface de menu interactiva com sistema de validação de entrada
- **Funcoes.java**: Implementação de todas as operações (adicionar, vender, procurar, etc.)
- **Produto.java**: Classe que representa um produto com atributos (nome, preço, stock)

## 🚀 Como Utilizar

### Requisitos Prévios
- Java JDK 8 ou superior
- Terminal/Linha de Comandos

### Compilação e Execução

```bash
# Aceda à pasta do projecto
cd "Sistema de gestao"

# Compile os ficheiros Java
javac src/sistema/*.java

# Execute o programa
java -cp src sistema.Main
```

## 💡 Exemplos de Utilização

### Adicionar um Produto
```
> Digite: 1
> Nome: Gelado de Morango
> Preço: 5.50
> Stock: 20
✓ Produto adicionado com sucesso!
```

### Realizar uma Venda
```
> Digite: 3
> Nome do produto: Gelado de Morango
> Quantidade: 2
✓ Venda realizada! (valor: 11.00)
```

### Procurar um Produto
```
> Digite: 4
> Nome do produto: Gelado de Morango
✓ Produto encontrado
  - Preço: 5.50
  - Stock: 18
```

## 🔧 Tecnologias

- **Linguagem**: Java
- **Estrutura de Dados**: ArrayList (coleção dinâmica)
- **I/O**: Scanner (entrada via console)

## 📝 Características de Implementação

✅ **Validação de Entrada**: O sistema valida as escolhas do menu  
✅ **Procura Insensível a Maiúsculas/Minúsculas**: Procura por produtos independentemente de maiúsculas ou minúsculas  
✅ **Controlo de Stock**: Impede vendas com quantidade insuficiente  
✅ **Rastreamento de Vendas**: Mantém registo do total de vendas  
✅ **Menu Intuitivo**: Interface fácil de utilizar com opções numeradas  

## 🎯 Melhorias Futuras

- 💾 Persistência de dados (guardar em ficheiro)
- 📈 Relatórios detalhados de vendas
- 🏷️ Sistema de categorias para produtos
- 📱 Interface gráfica (GUI)
- 🔐 Sistema de autenticação
- 📊 Gráficos e estatísticas de vendas

## 📄 Licença

Este projeto foi desenvolvido como um exercício de programação Java.

---

**Desenvolvido com ❤️**  
*Última atualização: 24 de março de 2026*

---

# 📦 Stock and Sales Management System

A robust and intuitive system for managing inventory and sales of any retail business. Developed in Java, this application offers full control over products, prices and stock in real time.

## 📋 About the Project

The **Stock and Sales Management System** is a versatile solution designed to:
- 📦 Manage product inventory
- 💰 Control prices and promotions
- 📊 Track sales and revenue
- 🔍 Locate products quickly
- ⚙️ Maintain an organized stock record

## ✨ Features

| Feature | Description |
|---|---|
| **1. Add Product** | Add new products with name, price and stock quantity |
| **2. List Products** | View all registered products with their details |
| **3. Sell Product** | Record sales and automatically update stock |
| **4. Search Product** | Find a specific product by name |
| **5. Remove Product** | Delete products from the system |
| **6. Change Price** | Update the price of any product |
| **7. View Totals** | Check the total value of sales made |
| **8. Exit** | Close the program safely |

## 🏗️ Project Structure

```
Sistema de gestao/
├── src/
│   └── sistema/
│       ├── Main.java          # Main application (interactive menu)
│       ├── Funcoes.java       # Business logic
│       └── Produto.java       # Data model
```

### 📄 Components

- **Main.java**: Interactive menu interface with input validation system
- **Funcoes.java**: Implementation of all operations (add, sell, search, etc.)
- **Produto.java**: Class representing a product with attributes (name, price, stock)

## 🚀 How to Use

### Prerequisites
- Java JDK 8 or higher
- Terminal/Command Line

### Compilation and Execution

```bash
# Navigate to the project folder
cd "Sistema de gestao"

# Compile the Java files
javac src/sistema/*.java

# Run the program
java -cp src sistema.Main
```

## 💡 Usage Examples

### Add a Product
```
> Enter: 1
> Name: Strawberry Ice Cream
> Price: 5.50
> Stock: 20
✓ Product added successfully!
```

### Make a Sale
```
> Enter: 3
> Product name: Strawberry Ice Cream
> Quantity: 2
✓ Sale completed! (value: 11.00)
```

### Search for a Product
```
> Enter: 4
> Product name: Strawberry Ice Cream
✓ Product found
  - Price: 5.50
  - Stock: 18
```

## 🔧 Technologies

- **Language**: Java
- **Data Structure**: ArrayList (dynamic collection)
- **I/O**: Scanner (console input)

## 📝 Implementation Features

✅ **Input Validation**: The system validates menu choices  
✅ **Case-Insensitive Search**: Search for products regardless of uppercase or lowercase  
✅ **Stock Control**: Prevents sales with insufficient quantity  
✅ **Sales Tracking**: Maintains a record of total sales  
✅ **Intuitive Menu**: Easy-to-use interface with numbered options  

## 🎯 Future Improvements

- 💾 Data persistence (save to file)
- 📈 Detailed sales reports
- 🏷️ Product categories system
- 📱 Graphical User Interface (GUI)
- 🔐 Authentication system
- 📊 Sales charts and statistics

## 📄 License

This project was developed as a Java programming exercise.

---

**Developed with ❤️**  
*Last updated: March 24, 2026*
