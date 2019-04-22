//因为倒转后的数字可能超过32位 所以要加判断 比如1111111.....9  倒转后 9....111111111 就会比原来大的多


class Solution {
public:
 int reverse(int x) {
    long  res = 0;
    while(x) {
        res = res*10 + x%10;
        x /= 10;
    }
 return (res<INT_MIN || res>INT_MAX) ? 0 : res;
 }
};
