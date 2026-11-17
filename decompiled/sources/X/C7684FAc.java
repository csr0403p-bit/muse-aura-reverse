package X;

/* renamed from: X.FAc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7684FAc {
    public final F9X A00;
    public final C7674F9s A01;
    public final FDW A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7684FAc)) {
            return false;
        }
        C7684FAc c7684FAc = (C7684FAc) obj;
        if (this.A02 == c7684FAc.A02 && this.A01 == c7684FAc.A01) {
            return BV7.A1X(this.A00, c7684FAc.A00, false);
        }
        return false;
    }

    public final int hashCode() {
        return BV7.A0E(this.A02, this.A00, this.A01);
    }

    public C7684FAc(F9X f9x, C7674F9s c7674F9s, FDW fdw) {
        AnonymousClass003.A0u(fdw, f9x);
        this.A02 = fdw;
        this.A00 = f9x;
        this.A01 = c7674F9s;
    }
}
