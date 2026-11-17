package X;

/* loaded from: classes6.dex */
public final class F7H implements F70 {
    @Override // X.F70
    public final int AIB(int i) {
        int i2 = i % 10;
        if (i2 == 1) {
            return i % 100 != 11 ? 1 : 5;
        }
        if (i2 < 2 || i2 > 4) {
            return 5;
        }
        int i3 = i % 100;
        return (i3 < 12 || i3 > 14) ? 3 : 5;
    }
}
