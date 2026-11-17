package X;

/* loaded from: classes6.dex */
public final class F7J implements F70 {
    @Override // X.F70
    public final int AIB(int i) {
        int i2 = i % 100;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                i3 = 3;
                if (i2 < 3 || i2 > 4) {
                    return 5;
                }
            }
        }
        return i3;
    }
}
