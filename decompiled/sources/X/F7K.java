package X;

/* loaded from: classes6.dex */
public final class F7K implements F70 {
    @Override // X.F70
    public final int AIB(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            return ((i < 0 || i > 10) && i % 10 == 0) ? 4 : 5;
        }
        return 2;
    }
}
