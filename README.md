# Seccion 4
Entregar el código en Git, diagrama de flujo, diagrama de clases, pseudocódigo de los siguientes ejercicios:  `src/main/java `
1. **Transformaciones de Imágenes 2D (Sencillas)**
2. **Aplicador de Kernel (Convolución)**

---

## Pseudocodigo
<details>
  <summary><strong>Ejercicio 7</strong></summary>
  
```
// Clase MAIN

Defininir cat como Caracter y matriz[11,11]

Matriz original (foto)

Escribir "Normal - photo"
Escribir ""

Para i = 1 Hasta 11
    Para j = 1 Hasta 11
        Escribir Sin Saltar cat[i,j]
    FinPara
    Escribir ""
FinPara

// Rotar matriz
catRotate = Rotar(cat)

Escribir ""
Escribir "Rotate - photo"
Escribir ""

Para i = 1 Hasta 11
    Para j = 1 Hasta 11
        Escribir Sin Saltar catRotate[i,j]
    FinPara
    Escribir ""
FinPara

// Flip vertical
catFlip = Flip(cat)

Escribir ""
Escribir "Flip vertical - photo"
Escribir ""

Para i = 1 Hasta 11
    Para j = 1 Hasta 11
        Escribir Sin Saltar catFlip[i,j]
    FinPara
    Escribir ""
FinPara

// Transpuesta
catTrans = Transponer(cat)

Escribir ""
Escribir "Transpose - photo"
Escribir ""

Para i = 1 Hasta 11
    Para j = 1 Hasta 11
        Escribir Sin Saltar catTrans[i,j]
    FinPara
    Escribir ""
FinPara

// FUNCIONES
// rotar 90 grados
Funcion rot = Rotar(mat)
Dimension rot[11,11]

Para i = 1 Hasta 11
    Para j = 1 Hasta 11
        rot[11-j+1,i] = mat[i,j]
    FinPara
FinPara
FinFuncion

// flip vertical
Funcion flip = Flip(mat)
Dimension flip[11,11]

Para i = 1 Hasta 11
    Para j = 1 Hasta 11
        flip[11-i+1,j] = mat[i,j]
    FinPara
FinPara
FinFuncion

// transpuesta
Funcion trans = Transponer(mat)
    Dimension trans[11,11]

    Para i = 1 Hasta 11
        Para j = 1 Hasta 11
            trans[j,i] = mat[i,j]
        FinPara
    FinPara
FinFuncion


FIN CLASE
FIN PROGRAMA

```

</details>
<details>
  <summary><strong>Ejercicio 8</strong></summary>

```
// MAIN

Defininir photo como Entero y matriz[6,6]

Matriz original (foto)

Escribir "Photo"
Escribir ""

Para i = 1 Hasta 6
    Para j = 1 Hasta 6
        Escribir Sin Saltar photo[i,j], " "
    FinPara
    Escribir ""
FinPara

// Kernel 3x3 (efecto 3D)
Definir kernel Como Entero y matriz[3,3]

Escribir ""
Escribir "Aplicador de Kernel"
Escribir ""

photoNew = Convolucion(photo, kernel)

Para i = 1 Hasta 4
    Para j = 1 Hasta 4
        Escribir Sin Saltar photoNew[i,j], " "
    FinPara
    Escribir ""
FinPara


// FUNCIONES
// convolucion
Funcion photoNew = Convolucion(photo, kernel)

Definir exit, tempK, tempL Como Entero
Dimension photoNew[4,4]

Para i = 1 Hasta 4
    Para j = 1 Hasta 4
        exit = 0
        tempK = 1

        Para k = i Hasta i + 2
            tempL = 1
            Para l = j Hasta j + 2
                exit = exit + photo[k,l] * kernel[tempK,tempL]
                tempL = tempL + 1
            FinPara
            tempK = tempK + 1
        FinPara

            photoNew[i,j] = exit
        FinPara
    FinPara
FinFuncion

FIN CLASE
FIN PROGRAMA

```
</details>
