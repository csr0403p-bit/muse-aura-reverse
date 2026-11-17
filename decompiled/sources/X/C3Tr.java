package X;

/* renamed from: X.3Tr, reason: invalid class name */
/* loaded from: classes.dex */
public interface C3Tr {
    Object AIX();

    int AQM(int i);

    int AQO(int i);

    int AQo(int i);

    int AQq(int i);

    static int A00(C3Tr c3Tr, int i) {
        int iAQO = c3Tr.AQO(Integer.MAX_VALUE);
        if (i == Integer.MAX_VALUE || (i = i - iAQO) >= 0) {
            return i;
        }
        return 0;
    }
}
