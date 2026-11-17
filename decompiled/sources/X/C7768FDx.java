package X;

/* renamed from: X.FDx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7768FDx implements FH1 {
    public final FDW A00;

    public final boolean equals(Object obj) {
        return (obj instanceof C7768FDx) && this.A00.A04 == ((C7768FDx) obj).A00.A04;
    }

    @Override // X.FH1
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C7768FDx(FDW fdw) {
        this.A00 = fdw;
    }
}
