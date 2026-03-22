[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/f8uScxyl)
# Atividade Prática: Listas com Alocação Dinâmica

## Objetivo

Esta atividade visa praticar a manipulação de listas com alocação dinâmica em Java.

## Estrutura do Projeto

- O arquivo `src/lista/Lista.java` contém a estrutura da classe `Lista` com os métodos a serem implementados.
- Para cada questão, você deve implementar a função correspondente no arquivo `Lista.java`.
- O arquivo `Principal.java` de cada pacote de questão (ex: `src/questao00/Principal.java`) deve ser utilizado para testar a função implementada. Crie instâncias da lista, chame o método e imprima o resultado para verificar se está correto.

---

## Questões
0. Crie uma função **estática** que recebe um vetor de inteiros como parâmetro e retorna uma nova instância da lista com os elementos do vetor.
   - **Exemplo:**
     - **Entrada:** `vetor = {1, 2, 3, 4, 5}`
     - **Saída:** `L1 = [1, 2, 3, 4, 5]`

1. Faça uma função para concatenar duas listas numa terceira lista que deverá ser retornada pela função.
   - **Exemplo:**
     - **Entrada:** `L1 = [1, 2, 3]`, `L2 = [4, 5, 6]`
     - **Saída:** `L3 = [1, 2, 3, 4, 5, 6]`

2. Faça uma função para remover os n primeiros elementos de uma lista. A função deve retornar se a operação foi possível ou não.
   - **Exemplo:**
     - **Entrada:** `L1 = [1, 2, 3, 4, 5]`, `n = 3`
     - **Saída:** `L1 = [4, 5]`, `retorno = true`

3. Faça uma função para trocar de posição dois elementos de uma lista. A função deve retornar se a operação foi possível ou não.
   - **Exemplo:**
     - **Entrada:** `L1 = [1, 2, 3, 4, 5]`, `pos1 = 1`, `pos2 = 3`
     - **Saída:** `L1 = [1, 4, 3, 2, 5]`, `retorno = true`

4. Fazer uma função que cópia uma lista L1 em outra lista L2.
   - **Exemplo:**
     - **Entrada:** `L1 = [1, 2, 3]`
     - **Saída:** `L2 = [1, 2, 3]`

5. Fazer uma função para inverter uma lista L1 colocando o resultado em L2.
   - **Exemplo:**
     - **Entrada:** `L1 = [1, 2, 3]`
     - **Saída:** `L2 = [3, 2, 1]`

6. Fazer uma função para inverter uma lista L1 alterando o seu próprio estado.
   - **Exemplo:**
     - **Entrada:** `L1 = [1, 2, 3]`
     - **Saída:** `L1 = [3, 2, 1]`

7. Escreva uma função que verifica se duas listas dadas são iguais.
   - **Exemplos:**
     - **Entrada:** `L1 = [1, 2, 3]`, `L2 = [1, 2, 3]` -> **Saída:** `true`
     - **Entrada:** `L1 = [1, 2, 3]`, `L2 = [1, 2, 4]` -> **Saída:** `false`

8. Crie uma função que remova todos os elementos duplicados de uma lista, mantendo apenas a primeira ocorrência de cada elemento.
    - **Exemplo:**
      - **Entrada:** `L1 = [1, 2, 2, 3, 4, 4, 5]`
      - **Saída:** `L1 = [1, 2, 3, 4, 5]`

9. Implemente uma função que rotacione a lista para a esquerda por um número `k` de posições.
    - **Exemplo:**
      - **Entrada:** `L1 = [1, 2, 3, 4, 5]`, `k = 2`
      - **Saída:** `L1 = [3, 4, 5, 1, 2]`
    
    * Rotacionar a lista é mover os primeiros `k` elementos para o final da lista, mantendo a ordem dos elementos.

10. Escreva uma função que retorne uma nova lista contendo os elementos de um índice `inicio` até um índice `fim`.
    - **Exemplo:**
      - **Entrada:** `L1 = [1, 2, 3, 4, 5]`, `inicio = 1`, `fim = 3`
      - **Saída:** `L2 = [2, 3, 4]`

11. Crie uma função que intercale os elementos de duas listas.
    - **Exemplo:**
      - **Entrada:** `L1 = [1, 2, 3]`, `L2 = [4, 5, 6]`
      - **Saída:** `L3 = [1, 4, 2, 5, 3, 6]`

---

## Atividade Prática: Listas Duplamente Encadeadas

### Estrutura do Projeto

- O arquivo `src/lista/ListaDuplamenteEncadeada.java` contém a estrutura da classe `ListaDuplamenteEncadeada` com os métodos a serem implementados.

### Questões

1.  **Inserir no início:** Implemente o método `inserirNoInicio`.
2.  **Inserir no fim:** Implemente o método `inserirNoFim`.
3.  **Inserir em uma posição específica:** Implemente o método `inserirNaPosicao`.
4.  **Remover do início:** Implemente o método `removerDoInicio`.
5.  **Remover do fim:** Implemente o método `removerDoFim`.
6.  **Remover de uma posição específica:** Implemente o método `removerDaPosicao`.
7.  **Pesquisar por um elemento:** Implemente o método `pesquisarPorValor`.
8.  **Imprimir a lista:** Implemente o método `imprimir`.
9.  **Imprimir a lista no sentido inverso:** Implemente o método `imprimirInverso`.