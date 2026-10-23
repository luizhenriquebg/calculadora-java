# Calculadora Simples em Java 

Projeto desenvolvido durante estudos de programação em Java para praticar a lógica de orientação a objetos e operações matemáticas básicas.

## Tecnologias Utilizadas

Java

 Funcionalidades Atuais

A aplicação realiza operações matemáticas fundamentais imprimindo os resultados diretamente no console:

Soma (soma)

Subtração (subtracao)

Multiplicação (multiplicacao)

Divisão (divisao)

Porcentagem (porcentagem): calcula n1 * n2 / 100. O primeiro parâmetro (n1) é o valor total e o segundo (n2) é a porcentagem a ser calculada. Exemplo: porcentagem(200, 15) calcula 15% de 200 (resultado: 30).

## Estrutura do Projeto

```
src/
├── calculadora/
│   ├── dominio/
│   │   └── Calculadora.java     # Classe com a lógica das operações
│   └── aplicacao/
│       └── CalculadoraTest.java # Classe principal com o método main
```

## Como Rodar o Projeto

Abra o projeto no seu ambiente de desenvolvimento (IDE como IntelliJ IDEA, Eclipse ou VS Code).

Navegue até o arquivo src/calculadora/aplicacao/CalculadoraTest.java.

Execute (Run) o método main() do arquivo CalculadoraTest.java para ver as operações sendo impressas no console.

## Próximos Passos

[ ] Implementar entrada de dados pelo usuário (Scanner)

[ ] Tratar divisões por zero