### longitud de un arreglo

- ¿Cómo saber cuantos elementos tiene un arreglo?


### Instanciar un arreglo

- ¿Cuál de las dos formas de instanciar un arreglo es válida?:
	- `` int a[] = new int[3]; ``
	- `` int[] a = new int[3]; ``

### Agregar elementos a un arreglo

- ¿Cómo inicializar un arreglo con valores sin necesidad de especificar el indice de cada elemento? es decir no se quiere hacer lo siguiente:

	```
	  a[0] = 1;
	  a[1] = 2;
	  a[2] = 3;
  	```

### ¿Dónde está la bolita?

Se tiene el siguiente código:

```
	int a[] = new int[3];
	a[0] = 2;
	a[1] = 1;
	a[2] = 0;
	a[a[a[2]]] = 0;
	a[a[1]] = 2;
	a[a[2]+2] = 3;
```

¿Qué tiene el arreglo despues de la última linea?
