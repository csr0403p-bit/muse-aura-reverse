package X;

/* loaded from: classes6.dex */
public final class F7S implements F70 {
    @Override // X.F70
    public final int AIB(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i >= 3) {
            if (i <= 6) {
                return 3;
            }
            if (i <= 10) {
                return 4;
            }
        }
        return 5;
    }
}
