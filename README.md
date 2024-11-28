# projetojava

# Projeto de Programação Orientada a Objetos - Sistema de Gerenciamento

## Descrição
Este projeto implementa um sistema de gerenciamento utilizando os conceitos de **Programação Orientada a Objetos (POO)** em Java. Foram desenvolvidos três sistemas distintos:
1. **Clínica Médica**: Gerencia pacientes, médicos e consultas.
2. **Eventos**: Gerencia eventos, participantes e locais.
3. **Restaurante**: Gerencia mesas, pedidos e itens do pedido.

Além disso, o projeto aplica:
- **Encapsulamento** para proteger os dados.
- **Herança e Polimorfismo** para criar uma estrutura modular e reutilizável.

## Funcionalidades
### Clínica Médica
- Cadastro de pacientes e médicos.
- Agendamento e realização de consultas.
- Atualização do histórico médico dos pacientes.

### Eventos
- Cadastro de eventos, participantes e locais.
- Verificação de lotação e geração de relatórios de participantes.

### Restaurante
- Gerenciamento de mesas, pedidos e itens do pedido.
- Cálculo do total a pagar e liberação de mesas.

## Exemplo de Uso
O arquivo `Main.java` contém exemplos de como usar o sistema. Aqui está um exemplo simples:
```java
Gerenciador<Paciente> gerenciadorPacientes = new Gerenciador<>();
gerenciadorPacientes.cadastrar(new Paciente("P001", "João", 25, "Nenhum"));
gerenciadorPacientes.listar();
``
