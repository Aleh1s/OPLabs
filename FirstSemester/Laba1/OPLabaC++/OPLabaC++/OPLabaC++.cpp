#include <iostream>
using namespace std;
int main()
{
    float a = 0;
    float b = 0;
    float S = 0;
    while (true) {
        cout << "Write first leg: " << endl;
        cin >> a;
        cout << "Write second leg: " << endl;
        cin >> b;
        if (a > 0 && b > 0) {
            S = 0.5 * a * b;
            cout << "Area of the triangle - " << S << " cm^2" << endl;
        }
        else if (a <= 0 && b <= 0) {
            cout << "The first and second legs should be more than zero";
            break;
        }
        else if (a <= 0) {
            cout << "The first leg should be more than zero" << endl;
            break;
        }
        else if (b <= 0) {
            cout << "The second leg should be more than zero" << endl;
            break;
        }
    }
}
