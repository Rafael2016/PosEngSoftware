public class Ordenacao {

    public static void main(String[] args) {

        int vet[] = { 12, 13, 14, 15, 22, 5, 6, 10, 9 };

        // bubbleSort(vet);
        quickSort(vet, 0, vet.length - 1);
        // selectionSort(vet);
        // insertionSort(vet);
        // shellSort(vet);
        // mergeSort(vet, 0, vet.length - 1);
        // heapSort(vet);
        // countingSort(vet);
        // radixSort(vet);
        // bucketSort(vet);
        // bucketSort(vet);

        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }

    }

    /**
     * @BUBBLESORT
     * @param vetor
     * @ordenação por bolhas é assim chamado porque tem a ideia de que os números
     *            maiores vão flutuando como bolhas até chegar na última posição
     */
    public static void bubbleSort(int[] numeros) {

        final int length_numeros = numeros.length;
        int aux;

        for (int i = 0; i < length_numeros - 1; i++) {

            for (int j = 0; j < length_numeros - i - 1; j++) {

                if (numeros[j] > numeros[j + 1]) {

                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;

                }

            }

        }
    }

    /**
     * @QUICSORT
     * @param numeros
     * @param inicio
     * @param fim
     * @ordenação por troca de partição. O Quicksort usa a ideia de uma ordenação
     *            dos elementos por meio de partições.
     */
    public static void quickSort(int[] numeros, int inicio, int fim) {

        if (inicio < fim) {

            int pivo = particionar(inicio, fim, numeros);

            quickSort(numeros, inicio, pivo - 1);
            quickSort(numeros, pivo + 1, fim);

        }

    }

    public static int particionar(int p, int q, int vetor[]) {
        int j = p - 1;
        int temp, aux = vetor[q];

        for (int i = p; i <= q; i++) {
            if (vetor[i] <= aux) {
                j++;
                temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
        return j;
    }

}
