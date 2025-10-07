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
    
    int diag1 = 0, diag2 = 0;
    for(int i = 0; i < n; i++) {
        diag1 += arr[i][i];
        diag2 += arr[i][n - 1 - i];
    }
    
    cout << diag1 << ", " << diag2 << endl;
    return 0;
}
