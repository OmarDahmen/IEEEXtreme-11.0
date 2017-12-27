// Score : 8%

#include <iostream>
#include <malloc.h>
#include <stdio.h>

using namespace std;

int main() {
    int d;
    cin >> d;
    int length[5] = {1, 1, 1, 1, 1};
    int produits[5] = {1, 1, 1, 1, 1};
    int size = 1;
    for (int i = 0; i < d; i++) {
        cin >> length[i];
        produits[i] = size;
        size *= length[i];
    }
    int *array = (int *)malloc(sizeof(int) * size);
    for (int i = 0; i < size; i++) {
        cin >> array[i];
    }
    int q;
    cin >> q;
    for(; q > 0; q--) {
        int sum = 0;
        int l[5] = {0, 0, 0, 0, 0};
        int r[5] = {0, 0, 0, 0, 0};
        for (int i = 0; i < d; i++) {
            cin >> l[i];
            l[i]--;
        }
        for (int i = 0; i < d; i++) {
            cin >> r[i];
            r[i]--;
        }
        for (int i = l[0]; i <= r[0]; i++) {
            int offi = i * produits[0];
            for (int j = l[1]; j <= r[1]; j++) {
                int offj = j * produits[1] + offi;
                for (int k = l[2]; k <= r[2]; k++) {
                    int offk = k * produits[2] + offj;
                    for (int m = l[3]; m <= r[3]; m++) {
                        int offm = m * produits[3] + offk;
                        for (int n = l[4]; n <= r[4]; n++) {
                            sum += *(array + offm + n * produits[4]);
                        }
                    }
                }
            }
        }
        std::cout << sum << endl;
    }
    return 0;
}
