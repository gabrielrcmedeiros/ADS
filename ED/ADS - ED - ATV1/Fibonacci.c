#include <stdio.h>

int fibonacci(int n) {

    if (n == 0) {
        return 0;
    } else if (n == 1) {
        return 1;
    }
    

    return fibonacci(n - 1) + fibonacci(n - 2);
}

int main() {
    int termos = 14; 
    
    printf("Sequencia de Fibonacci com %d termos:\n", termos);
    
    for (int i = 0; i < termos; i++) {
        printf("%d", fibonacci(i));
        
        if (i < termos - 1) {
            printf(", ");
        }
    }
    printf("\n");
    
    return 0;
}