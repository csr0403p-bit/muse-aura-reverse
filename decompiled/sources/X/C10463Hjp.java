package X;

import kotlin.Unit;

/* renamed from: X.Hjp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10463Hjp implements HpO {
    public final G0U<Throwable, Unit> A00;

    @Override // X.HpO
    public final void invoke(Throwable th) {
        this.A00.invoke(th);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("CancelHandler.UserSupplied[");
        AbstractC7609F5w.A1L(sbA0x, this.A00);
        sbA0x.append('@');
        AbstractC7609F5w.A1K(sbA0x, this);
        return BV5.A0o(sbA0x);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10463Hjp(G0U<? super Throwable, Unit> g0u) {
        this.A00 = g0u;
    }
}
