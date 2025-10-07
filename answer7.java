#include<iostream>
using namespace std;

int main() {
    int n, m;
    cin >> n >> m;
    int arr[105][105];
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++) {
            cin >> arr[i][j];
        }
    }
    
    int top = 0, bottom = n - 1, left = 0, right = m - 1;
    while(top <= bottom && left <= right) {
        for(int i = left; i <= right; i++) {
            cout << arr[top][i];
            if(!(top == bottom && i == right)) cout << ",";
        }
        top++;
        for(int i = top; i <= bottom; i++) {
            cout << arr[i][right];
            if(!(i == bottom && left == right)) cout << ",";
        }
        right--;
        if(top <= bottom) {
            for(int i = right; i >= left; i--) {
                cout << arr[bottom][i];
                if(!(bottom == top && i == left)) cout << ",";
            }
            bottom--;
        }
        if(left <= right) {
            for(int i = bottom; i >= top; i--) {
                cout << arr[i][left];
                if(!(i == top)) cout << ",";
            }
            left++;
        }
    }
    cout << endl;
    return 0;
}
