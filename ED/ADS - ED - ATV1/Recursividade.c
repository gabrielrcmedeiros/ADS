#include <stdio.h>

int calcular_potencia(int x, int y) {
    
    if (y == 0) {
        return 1;
    }
    
    return x * calcular_potencia(x, y - 1);
}

int main() {
    int base = 2;
    int expoente = 5;
    
    int resultado = calcular_potencia(base, expoente);
    
    printf("%d elevado a %d é igual a: %d\n", base, expoente, resultado);
    
    return 0;
}