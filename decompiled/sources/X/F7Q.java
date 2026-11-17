package X;

/* loaded from: classes6.dex */
public final class F7Q implements F70 {
    @Override // X.F70
    public final int AIB(int i) {
        int i2;
        int i3 = i % 10;
        int i4 = 1;
        if (i3 != 1 || i % 100 == 11) {
            i4 = 4;
            if (i3 >= 2 && i3 <= 4 && ((i2 = i % 100) < 12 || i2 > 14)) {
                return 3;
            }
        }
        return i4;
    }
}
