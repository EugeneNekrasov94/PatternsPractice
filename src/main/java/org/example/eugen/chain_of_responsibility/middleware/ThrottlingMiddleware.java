package org.example.eugen.chain_of_responsibility.middleware;

/**
 * ���������� ������� ���� ������������ ������ ��-������.
 */
public class ThrottlingMiddleware extends Middleware {
    private int requestPerMinute;
    private int request;
    private long currentTime;

    public ThrottlingMiddleware(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }

    /**
     * �������� ��������, ����� checkNext() ����� �������� ��� � ������ �����
     * ������, ��� � � �������� ��� � �����.
     *
     * ��� ��� ��� ���� ������� �������� �� ��������� � ���������� � �����.
     * ��������, ������� ���� ����� ���������� ��� ��������� �������� ����� �
     * ��������� ���� �������� � �����.
     */
    public boolean check(String email, String password) {
        if (System.currentTimeMillis() > currentTime + 60_000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }

        request++;

        if (request > requestPerMinute) {
            System.out.println("Request limit exceeded!");
            System.exit(0);
        }
        return checkNext(email, password);
    }
}