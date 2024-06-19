# **Projeto Banco**

Este projeto simula um sistema bancário básico com funcionalidades de conta corrente e conta poupança. 
O projeto é desenvolvido em Java e utiliza a biblioteca Lombok para simplificar a criação de getters, setters e métodos toString.

## **Estrutura do Projeto**

### **O projeto consiste nas seguintes classes:**

Conta: Classe base que representa uma conta genérica.
ContaCorrente: Subclasse de Conta que representa uma conta corrente.
ContaPoupanca: Subclasse de Conta que representa uma conta poupança.
Banco: Classe principal que contém o método main para executar o programa.

### **Classe Conta**

**A classe Conta contém os seguintes atributos e métodos:**

numeroDaConta: String que representa o número da conta.
saldo: double que representa o saldo da conta.

### **Métodos:**

depositar(double valorDoDeposito): Adiciona o valor do depósito ao saldo, se o valor for positivo.

sacar(double valorDoSaque): Deduz o valor do saque do saldo, se o saldo for suficiente e o valor do saque for positivo.

transferir(double valor, Conta contaDestino): Transfere um valor para outra conta, deduzindo do saldo da conta atual e adicionando ao saldo da conta de destino.

### Classe ContaCorrente

A classe ContaCorrente é uma subclasse de Conta e herda todos os atributos e métodos da classe base. Ela é utilizada para representar uma conta corrente.

### Classe ContaPoupanca

A classe ContaPoupanca é uma subclasse de Conta e herda todos os atributos e métodos da classe base. Ela é utilizada para representar uma conta poupança.

### Classe Banco

A classe Banco contém o método main que executa o programa. No método main, são realizadas as seguintes operações:

Criação de uma conta corrente com saldo inicial de 2000.0.

Criação de uma conta poupança com saldo inicial de 300.0.

Depósito de 400.0 na conta corrente.

Saque de 150.0 da conta poupança.

Transferência de 250.0 da conta corrente para a conta poupança.

Impressão dos saldos das contas antes e após cada operação.

### **Requisitos:**

Java JDK 8 ou superior

Lombok
