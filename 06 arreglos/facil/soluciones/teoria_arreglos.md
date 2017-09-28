

### longitud de un arreglo

- ¿Cómo saber cuantos elementos tiene un arreglo?
- sol: ``nombre_arreglo.length;``


### Instanciar un arreglo

- ¿Cuál de las dos formas de instanciar un arreglo es válida?:
	sol: ambas

### Instanciar un arreglo con elementos

- ¿Cómo inicializar un arreglo con valores sin necesidad de especificar el indice de cada elemento? es decir no se quiere hacer lo siguiente:
Sol:
	``
	  int a[] = {1,2,3};
  	``
  	o también:
  	``
	  int a[] = new int[]{1,2,3};
  	``

### ¿Dónde está la bolita?

Se tiene el siguiente código:

¿Qué tiene el arreglo despues de la ultima linea?

```
	a[a[a[2]]] = 0; // 2 1 0
	a[a[1]] = 2; // 2 2 0
	a[a[2]+2] = 3; // 2 2 3
```

Sol : 2 2 3
