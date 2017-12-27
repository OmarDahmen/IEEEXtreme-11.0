// Score : 36.37%

#include <iostream>
#include <vector>
#include <string>

#define MOD(x, n) ((-1 % 2 < 0) ? ((x) % (n)) >= 0 ? ((x) % (n)) : (n) + ((x) % (n)) : ((x) % (n)))


using namespace std;

int x, y;
int currentlayer = 0;
int outputlayer = 1;
long int iterations;
int map[25][25][2];
void display(int currentlayer);
void tick();
void load();

int main() {
    cin >> x;
    cin >> y;
    cin >> iterations;

    load();
    for (long int j = 0; j < iterations; j++)
    {
        tick();
    }
    display(currentlayer);
    return 0;
}
void load(){
    string temp;
    for (size_t xpos = 0; xpos < x; xpos++)
    {
        cin >> temp;
        for (size_t i = 0; i < y; i++)
        {
            if (temp[i] == '-'){
                map[xpos][i][0] = 0;
            }
            else{
                map[xpos][i][0] = 1;
            }
        }
    }


}
int check(int xPos, int yPos, int layer) {
    int numAdj = 0;
    numAdj = map[MOD((xPos - 1), x)][MOD((yPos - 1), y)][layer] + map[MOD((xPos - 1), x)][MOD((yPos + 1), y)][layer] + map[MOD((xPos - 1), x)][yPos][layer] + map[xPos][MOD((yPos - 1), y)][layer] + map[xPos][MOD((yPos + 1), y)][layer] + map[MOD((xPos + 1), x)][MOD((yPos - 1), y)][layer] + map[MOD((xPos + 1), x)][yPos][layer] + map[MOD((xPos + 1), x)][MOD((yPos + 1), y)][layer];
    if (numAdj == 2)
    {
        return map[xPos][yPos][layer];
    }
    else if (numAdj == 3)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
void tick() {
    for (size_t xpos = 0; xpos < x; xpos++)
    {
        for (size_t i = 0; i < y; i++)
        {
            map[xpos][i][outputlayer] = check(xpos,i, currentlayer);
        }
    }
    int temp = currentlayer;
    currentlayer = outputlayer;
    outputlayer = temp;
}

void display(int currentlayer) {
    for (size_t xpos = 0; xpos < x; xpos++)
    {
        for (size_t i = 0; i < y; i++)
        {
            if (map[xpos][i][currentlayer] == 0){
                cout << '-';
            }
            else{
                cout << '*';
            }

        }
        cout<<endl;
    }
}
