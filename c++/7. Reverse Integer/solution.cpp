//��Ϊ��ת������ֿ��ܳ���32λ ����Ҫ���ж� ����1111111.....9  ��ת�� 9....111111111 �ͻ��ԭ����Ķ�


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
