package X;

/* loaded from: classes6.dex */
public final class F7G implements F70 {
    @Override // X.F70
    public final int AIB(int i) {
        int i2;
        if (i != 1) {
            return (i == 0 || ((i2 = i % 100) >= 1 && i2 <= 19)) ? 3 : 5;
        }
        return 1;
    }
}
