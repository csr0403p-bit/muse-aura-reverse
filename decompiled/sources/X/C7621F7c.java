package X;

/* renamed from: X.F7c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7621F7c implements F70 {
    @Override // X.F70
    public final int AIB(int i) {
        if (i == 1) {
            return 1;
        }
        int i2 = i % 10;
        if (i2 < 2 || i2 > 4) {
            return 4;
        }
        int i3 = i % 100;
        return (i3 < 12 || i3 > 14) ? 3 : 4;
    }
}
