# T1 - Listas FIFO
## Estrutura De Dados
### Season 3
#### Unifebe

Escreva um programa que permita implementar uma lista Fifo com alocação estática de memória. Cada nodo da lista conterá o número de matricula e o nome de um funcionário. O programa deve apresentar ao usuário o seguinte menu:

## Tabela de opções

| Nº | Nome | Descrição |
|:--:|:--|:--|
| 1 | Inserir | pede o número de matricula, o nome do funcionário e coloca na lista |
| 2 | Retirar | retira o funcionário da lista e mostra o nome do mesmo |
| 3 | Mostrar | mostra o número de matricula de todos os funcionários |
| 4 | Onde está | pede o número de matricula e diz em que posição da fila está o funcionário (Não é a posição do array) |
| 5 | Quem é | pede o número de matricula e informa o nome deste funcionário |
| 6 | Cabeça | mostra o nome do funcionário que está na cabeça da fila |
| 7 | Detonar | destrói a lista |
| 8 | Quantos | diz quantos funcionários estão na lista |
| 9 | Vazar | Pica a mula! |

## Observações
1. A capacidade máxima da fila é de 20 funcionários;
2. O menu é mostrado sucessivamente até que a opção 9 seja selecionada;
3. Para cada opção no menu, deve existir um método especifico;
4. Somente o método main e o método correspondente a opção 3 do menu podem fazer I/O;

## Compilando e rodando o código

```bash
C:\path\to\project
λ javac -cp ./source/*.java -d ./build

C:\path\to\project\source
λ cd ..\build

C:\path\to\project\build
λ java VehicleTester
```
