# 2. Branchs

Para este ejercicio, se debe crear un archivo `nombre_apellido.txt`, dentro de la carpeta `2.branchs`.

En este archivo, se va a guardar las respuestas teóricas y algunos resultados de los mismos.

## Ejercicio 2

### 2.1. Preguntas

1. ¿Qué es un branch?
2. ¿Por qué pueden ser útiles los branches?
3. ¿Cómo se crea una branch?
4. ¿Cómo se cambia a una branch?
5. ¿Cómo se elimina una branch?
6. ¿Cómo se crea una branch y se cambia a ella en un solo paso? 
7. ¿Qué es un merge? 
8. ¿Cómo se realiza un merge? 
9. ¿Que es un tag? 
10. ¿Cómo se crea un tag?

### 2.2. Ejercicio Práctico

Antes de continuar con el ejercicio, se debe agregar un alias para facilitar la visualización de los branches.

```bash
git config --global alias.graph "log --all --graph --decorate --oneline"

# Pruebe el comando
git graph
```


1. [] Crear una branch `ejercicio2_vuestro_usuario_github`. (Puede usar el comando `git branch ejercicio2_vuestro_usuario_github main`).
2. Moverse a la branch `ejercicio2_vuestro_usuario_github`. (Puede usar el comando `git checkout`).
3. Verificar que se encuentra en la branch `ejercicio2_vuestro_usuario_github`. (Puede usar el comando `git branch`). 
4. Agregarle el condimento `albahaca` **arriba del queso** al archivo `2.branchs/pizza.txt` y "commitee" los cambios. 
5. Agregarle el condimento `` **arriba de la albahaca** al archivo `2.branchs/pizza.txt` y "commitee" los cambios.
6. Correr el comando `git graph` y observar el resultado. ¿Qué observa?
7. Quedate en la branch `ejercicio2_vuestro_usuario_github`.
8. Crear una branch `anana`. (Puede usar el comando `git checkout -b anana`).
9. Agregarle el condimento `anana` **debajo del queso** al archivo `2.branchs/pizza.txt` y "commitee" los cambios.
10. Correr el comando `git graph` y observar el resultado. ¿Qué observa?
11. Vuelva a la branch `ejercicio2_vuestro_usuario_github`.
12. Agregue el condimento `cebolla` **debajo de la salsa** al archivo `2.branchs/pizza.txt` y "commitee" los cambios.
13. Correr el comando `git graph` y observar el resultado. ¿Qué observa?
14. Haga un merge de la branch `anana` a la branch `ejercicio2_vuestro_usuario_github`. (Puede usar el comando `git merge anana`).
15. Correr el comando `git graph` y observar el resultado. ¿Qué observa?
16. ¿Qué branches están "mergeadas" a ejercicio2_vuestro_usuario_github? (Puede usar el comando `git branch --merged`).
17. Crear un tag `pizza` en el último commit. (Puede usar el comando `git tag -a pizza -m "Receta de la pizza.""`).
18. Ver los tags creados. (Puede usar el comando `git tag`).
19. Ver el tag `pizza`. (Puede usar el comando `git show pizza`).


## Finalizado

Una vez finalizado el ejercicio, recuerde guardar sus cambios en `nombre_apellido.txt` y subirlos a **su** repositorio remoto en la rama ejercicio2_vuestro_usuario_github. Este archivo (`README.md`) y `pizza.txt` tienen que mantenerse sin ningún cambio.

Para volver a `sandwich.txt` a su estado original, debe buscar el commit que lo contiene y correr el comando:
```bash
git checkout [commit ID] -- 2.branchs/pizza.txt

# ó

git checkout [commit ID] -- pizza.txt

# dependiendo de donde esté ubicado
```


