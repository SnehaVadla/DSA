import java.io.*;
import java.util.*;
public class Main {
    static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return Math.abs(a);
    }
    static long lcm(long a, long b) {
        return a / gcd(a, b) * b; 
    }
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder out = new StringBuilder();
        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();
            long[] p = new long[n];
            long[] s = new long[n];
            for (int i = 0; i < n; i++) p[i] = fs.nextLong();
            for (int i = 0; i < n; i++) s[i] = fs.nextLong();
            if (p[n - 1] != s[0]) {
                out.append("NO
");
                continue;
            }
            long[] b = new long[n];
            for (int i = 0; i < n; i++) b[i] = lcm(p[i], s[i]);
            boolean ok = true;
            long g = 0;
            for (int i = 0; i < n; i++) {
                g = gcd(g, b[i]);
                if (g != p[i]) { ok = false; break; }
            }
            if (ok) {
                g = 0;
                for (int i = n - 1; i >= 0; i--) {
                    g = gcd(g, b[i]);
                    if (g != s[i]) { ok = false; break; }
                }
            }
           out.append(ok ? "YES
" : "NO
");
        }
        System.out.print(out.toString());
    }
static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
        FastScanner(InputStream is) { in = is; }
        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }
        long nextLong() throws IOException {
            int c; do { c = read(); } while (c <= ' ' && c != -1);
            int sign = 1; if (c == '-') { sign = -1; c = read(); }
            long val = 0;
            while (c > ' ') { val = val * 10 + (c - '0'); c = read(); }
            return val * sign;
        }
        int nextInt() throws IOException { return (int) nextLong(); }
    }
}