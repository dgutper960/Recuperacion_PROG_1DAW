### En este método tenemos:
- if ------------------------> 0(n)
- print -------------------> 0(n)
- return -----------------> 0(n)
- llamada recursiva--> 0(1^n)
- print -------------------> 0(n)
- llamada recursiva--> 0(1^n)


**_Por lo que tenemos un total de 0(n)*3 + 0(1^n)*2_** 

Lo que teniendo en cuenta que los órdenes lineales son despreciables frente a los factoriales,
vamos a tener un orden de complejidad exponencial de **O(2^n)**
subiendo la complejidad en demasía a medida que suben los datos de entrada

### Respecto a la pregunta adicional:
¿Serías capaz de resolver el juego de las torres de Hanoi mediante iteración? ¿cual tiene
una complejidad de orden menor? ¿Cuál de los dos algoritmos piensas que es más
sencillo? ¿Cuál de las implementaciones te parece más adecuada y por qué?

Sin haber realizado el código, en teoría, la resolución iterativa, 
debería ser de menor orden de complejidad, ya que de base, en el
caso recursivo ya partimos de una situación mala de por sí. Además de que 
la recursividad suele ser más costosa que la iteración a nivel de recursos, a la vez que más compleja a nivel de lógica de programación. 
De todas formas la única manera de averiguarlo es sacar el código y hacer el cálculo.