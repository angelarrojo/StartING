# 3. Conflicts

Para este ejercicio, se debe crear un archivo `nombre_apellido.txt`, dentro de la carpeta `1.commit`.

En este archivo, se va a guardar las respuestas teóricas y algunos resultados de los mismos.

## Ejercicio 3

### 3.1. Preguntas

1. ¿Qué es un conflicto? Cuando ocurre? ¿Es bueno o malo?
2. ¿Se puede evitar un conflicto? ¿Cómo?

### 3.2. Ejercicio Práctico

1. [] Crear una branch `ejercicio3_vuestro_usuario_github`. (Puede usar el comando `git branch ejercicio3_vuestro_usuario_github main`).
2. Moverse a la branch `ejercicio3_vuestro_usuario_github`. (Puede usar el comando `git checkout`).
3. Verificar que se encuentra en la branch `ejercicio3_vuestro_usuario_github`. (Puede usar el comando `git branch`).
4. Crear un archivo `nombre_apellido.txt` dentro de la carpeta `3.conflicts`.
5. Crear una nueva branch `suprema` a partir de la branch `ejercicio3_vuestro_usuario_github`. (Puede usar el comando `git checkout -b suprema`).
6. Moverse a la branch `suprema`. (Puede usar el comando `git checkout`).
7. Cambiar el contenido del archivo `3.conflicts/milanesa.txt` donde dice lomo por `pollo`.
8. "Commitear" los cambios. (Puede usar el comando `git commit -am "Cambio de lomo a pollo"`).
9. Moverse a la branch `ejercicio3_vuestro_usuario_github`. (Puede usar el comando `git checkout`).
10. Crear una nueva branch `bife` a partir de la branch `ejercicio3_vuestro_usuario_github`. (Puede usar el comando `git checkout -b bife`).
11. Moverse a la branch `bife`. (Puede usar el comando `git checkout`).
12. Cambiar el contenido del archivo `3.conflicts/milanesa.txt` donde dice lomo por `bife`. 
13. Haga un `git diff ejercicio3_vuestro_usuario_github suprema` y un `git diff ejercicio3_vuestro_usuario_github bife`. ¿Qué observa? 
14. Moverse a la branch `ejercicio3_vuestro_usuario_github`. Corra un `git status`, ¿qué observa?
15. Ejecute `git merge bife`. Funcionó?
16. Ejecute `git merge suprema`. Funcionó?
17. Ejecute `git status`. Que observa?
18. Vea el contenido del archivo `3.conflicts/milanesa.txt`. ¿Qué observa?
19. Aborte el merge. (Puede usar el comando `git merge --abort`).
20. Vuelva a ejecutar `git merge suprema`.
21. Resuelva el conflicto manualmente.

## Finalizado

Una vez finalizado el ejercicio, recuerde guardar sus cambios en `nombre_apellido.txt` y subirlos a **su** repositorio remoto. Este archivo (`README.md`) y `milanesa.txt` tienen que mantenerse sin ningún cambio.

Para volver a `milanesa.txt` a su estado original, debe buscar el commit que lo contiene y correr el comando:
```bash
git checkout [commit ID] -- 3.conflicts/milanesa.txt

# ó

git checkout [commit ID] -- milanesa.txt

# dependiendo de donde esté ubicado
```
