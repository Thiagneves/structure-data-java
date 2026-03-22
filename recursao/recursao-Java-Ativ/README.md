[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/gcug420L)
# Atividade Prática: Recursão

## Objetivo

Esta atividade tem como objetivo praticar o conceito de recursão.

## Orientações

Esta atividade foca no conceito de **recursão**. A recursão é uma técnica de programação onde uma função chama a si mesma para resolver um problema. É importante definir um caso base para evitar chamadas infinitas.

1.  Cada uma das questões deve ser entregue dentro de um pacote. Exemplo: `questao01`, `questao02`, ..., `questaoXX`.
2.  Dentro de cada pacote deve haver uma classe chamada `Principal` que deverá ter o método `main`.
3.  **Para todas as atividades, utilize a classe `Principal` para criar as funções e executar os testes**.

---

## Questões

1.  **Fatorial**: Crie uma função recursiva que calcule o fatorial de um número inteiro não negativo `N`. O fatorial de `N` (denotado por `N!`) é o produto de todos os inteiros positivos de 1 a `N`.
    *   **Exemplo**: `fatorial(5)` deve retornar `120` (pois 5 * 4 * 3 * 2 * 1 = 120).
    *   **Caso base**: `fatorial(0)` é 1.

2.  **Fibonacci**: A sequência de Fibonacci é uma série de números onde cada número é a soma dos dois anteriores. Os dois primeiros números da sequência são 0 e 1. Crie uma função recursiva que retorne o N-ésimo termo da sequência de Fibonacci.
    *   **Exemplo**: `fibonacci(7)` deve retornar `13` (a sequência é 0, 1, 1, 2, 3, 5, 8, 13, ...).
    *   **Casos base**: `fibonacci(0)` é 0 e `fibonacci(1)` é 1.

3.  **Somatório**: Crie uma função recursiva que calcule o somatório dos números de 1 até `N`.
    *   **Exemplo**: `somatorio(5)` deve retornar `15` (pois 1 + 2 + 3 + 4 + 5 = 15).
    *   **Caso base**: `somatorio(1)` é 1.

4.  **Potência**: Crie uma função recursiva que calcule `k^n` (k elevado a n), onde `k` e `n` são inteiros positivos. Utilize apenas multiplicações.
    *   **Exemplo**: `potencia(2, 5)` deve retornar `32`.
    *   **Caso base**: `potencia(k, 0)` é 1.

5.  **Inverter Número**: Crie uma função recursiva para inverter um número inteiro.
    *   **Exemplo**: `inverter(123)` deve retornar `321`.
    *   **Dica**: Use o operador de módulo (%) para obter o último dígito e a divisão inteira para remover o último dígito.

6.  **Soma de Vetor**: Crie uma função recursiva para calcular a soma de todos os elementos de um vetor de inteiros.
    *   **Exemplo**: Para o vetor `{1, 2, 3, 4, 5}`, a função deve retornar `15`.
    *   **Dica**: A função pode receber o vetor e o índice do elemento atual como parâmetros.

7.  **Inverter Vetor**: Crie uma função recursiva para inverter a ordem dos elementos de um vetor.
    *   **Exemplo**: O vetor `{1, 2, 3, 4, 5}` deve se tornar `{5, 4, 3, 2, 1}`.
    *   **Dica**: A função pode receber o vetor e dois índices (início e fim) como parâmetros.

8.  **Contagem de Dígitos**: Crie uma função recursiva que conte o número de ocorrências de um dígito `K` em um número natural `N`.
    *   **Exemplo**: `contarDigito(762021192, 2)` deve retornar `3`.
    *   **Dica**: Verifique o último dígito e depois chame a função para o restante do número.

9.  **Máximo Divisor Comum (MDC)**: Utilize o algoritmo de Euclides para criar uma função recursiva que encontre o máximo divisor comum (MDC) entre dois números inteiros.
    *   **Algoritmo**: `mdc(x, y)` é `x` se `y` for 0; caso contrário, é `mdc(y, x % y)`.
    *   **Exemplo**: `mdc(48, 18)` deve retornar `6`.

10. **Multiplicação por Somas**: Crie uma função recursiva que calcule a multiplicação de dois números naturais através de somas sucessivas.
    *   **Exemplo**: `multiplicar(5, 3)` deve retornar `15` (equivalente a 5 + 5 + 5).
    *   **Dica**: `multiplicar(a, b)` é `a + multiplicar(a, b-1)`.

11. **Verificador de Palíndromo**: Crie uma função recursiva que verifique se uma string é um palíndromo (lê-se da mesma forma de trás para frente).
    *   **Exemplo**: `isPalindromo("arara")` deve retornar `true`.
    *   **Dica**: Compare o primeiro e o último caractere e depois verifique o restante da string.

12. **Impressão de Números**:
    *   a) Crie uma função recursiva que imprima todos os números naturais de 0 até `N` em ordem crescente.
    *   b) Crie uma função recursiva que imprima todos os números naturais de `N` até 0 em ordem decrescente.

13. **Soma dos Dígitos**: Crie uma função recursiva que calcule a soma dos dígitos de um número inteiro.
    *   **Exemplo**: `somaDigitos(123)` deve retornar `6`.
    *   **Dica**: Some o último dígito com a soma dos dígitos do restante do número.
