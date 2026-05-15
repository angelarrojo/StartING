# 1. Commits

Para el primer ejercicio, se debe crear un archivo `nombre_apellido.txt`, dentro de la carpeta `1.commit`.

En este archivo, se va a guardar las respuestas teóricas y algunos resultados de los mismos.

## Ejercicio 1

### 1.1. Preguntas

1. ¿Cómo se inicializa un repositorio local? (que comando se debe ejecutar?)
   git init
2. ¿Cómo hago para que un directorio deje de ser controlado por git? (que comando se debe ejecutar?)
   rm -rf .git
3. Si agrego un archivo a un directorio que ya está siendo controlado por git, ¿está siendo controlado por git?
No
4. ¿Qué comando se utiliza para agregar un archivo al repositorio local?
   git add 
5. ¿Cómo determino que archivos fueron modificados? (que comando se debe ejecutar?)
   git status
6. ¿Qué comando se utiliza para hacer un commit?
   git commit -m
7. En sus propias palabras, ¿qué es un commit?
   Es un comentario que pones de un momento exacto del proyecto para así indicar a otras personas lo que has editado del código

### 1.2. Ejercicio Práctico

1. [] Crear una branch `ejercicio1_vuestro_usuario_github`. (Puede usar el comando `git branch ejercicio1_vuestro_usuario_github main`).
2. Moverse a la branch `ejercicio1_vuestro_usuario_github`. (Puede usar el comando `git checkout`).
3. Crear un archivo `nombre_apellido.txt` si no estaba creado previamente.
4. Agregar a `sandwich.txt` condimentos e ingredientes que le gusten, simulando que es un sandwich que se va a comer.
5. Antes de realizar cualquier acción con git, guarde el estado actual del directorio en el archivo `nombre_apellido.txt`. Para esto, se debe ejecutar el comando `git status` y copiar el resultado en el archivo `nombre_apellido.txt`. Explique que significa la salida del comando.
6. Agregar el archivo `sandwich.txt` al repositorio local. Para esto, se debe ejecutar el comando `git add sandwich.txt`.
7. Explique que cambio en la salida del comando `git status` luego de ejecutar el comando `git add sandwich.txt`.
8. Realizar un commit con el mensaje "Agrego mi sandwich.txt". Para esto, se debe ejecutar el comando `git commit -m "Agrego mi sandwich.txt"`.
9. Explique que cambio en la salida del comando `git status` luego de ejecutar el comando `git commit -m "Agrego mi sandwich.txt"`.
10. Agregar salsas de su preferencia a `sandwich.txt` y realizar un commit con el mensaje "Agrego salsas".
11. Escriba la salida del comando `git log` en el archivo `nombre_apellido.txt`. Y explique que significa. ¿En qué orden aparecen los commits?
12. Pruebe las variaciones del comando `git log` y explique que observa en cada una de ellas.
    12.1. `git log --oneline`
13. Inspeccione diferencias entre los commits, use el comando git diff <hash> <hash> y explique que significa cada uno de los resultados.
    11.1. En Windows, pruebe `git difftool --tool=meld <hash>`
    11.2. En Linux, pruebe `git difftool --tool=opendiff <hash>`
14. Crear un nuevo archivo dentro de la carpeta `1.commit`, llamado `sandwich2.txt`, y agregarle los ingredientes de su sandwich.
15. Agregar el archivo `sandwich2.txt` al repositorio local.
16. Renombrar el archivo `sandwich2.txt` a `sandwich2_feo.txt`. Para esto, se debe ejecutar el comando `git mv sandwich2.txt sandwich2_feo.txt`. Explique que cambio en la salida del comando `git status` luego de hacer un commit con esos cambios y de `git log --oneline`.
17. Borre el archivo `sandwich2_feo.txt`. Para esto, se debe ejecutar el comando `git rm sandwich2_feo.txt`. Explique que cambio en la salida del comando `git status` luego de hacer un commit con esos cambios y de `git log --oneline`.
18. Inspeccione la bitácora usando `git log --stat` y explique lo que ve.

## Finalizado

Una vez finalizado el ejercicio, recuerde guardar sus cambios en `nombre_apellido.txt` y subirlos a **su** repositorio remoto, en la rama ejercicio1_vuestro_usuario_github. Este archivo (`README.md`) y `sandwitch.txt` tienen que mantenerse sin ningún cambio.

Para volver a `sandwich.txt` a su estado original, debe buscar el commit que lo contiene y correr el comando:
```bash
git checkout [commit ID] -- 1.commit/sandwich.txt

# ó

git checkout [commit ID] -- sandwich.txt

# dependiendo de donde esté ubicado
```
