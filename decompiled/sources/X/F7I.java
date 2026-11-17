package X;

/* loaded from: classes6.dex */
public final class F7I implements F70 {
    @Override // X.F70
    public final int AIB(int i) {
        int i2 = 1;
        if (i != 1 && i != 11) {
            i2 = 2;
            if (i != 2 && i != 12) {
                i2 = 3;
                if (i < 3) {
                    return 5;
                }
                if (i > 10 && (i < 13 || i > 19)) {
                    return 5;
                }
            }
        }
        return i2;
    }
}
