package X;

import java.util.Set;

/* renamed from: X.Fx7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9027Fx7 implements InterfaceC9026Fx4<C9046FxU> {
    public double A00;
    public final Fx6<?> A01;
    public final Set<C9012Fwp> A02;

    public C9027Fx7(Fx6<?> fx6) {
        C7384Etj.A0Y(fx6, 0);
        this.A01 = fx6;
        this.A02 = C3cG.A0k();
    }

    @Override // X.InterfaceC9026Fx4
    public final C8990FwS AJ8() {
        Set<C9012Fwp> set = this.A02;
        return new C8990FwS(C9jH.A00, set.isEmpty() ? C9jH.A00 : AnonymousClass006.A10(C9046FxU.A1J.A03(), Double.valueOf(this.A00)), set);
    }

    @Override // X.InterfaceC9026Fx4
    public final /* bridge */ /* synthetic */ void AYb(InterfaceC9011Fwo interfaceC9011Fwo) {
        C9046FxU c9046FxU = (C9046FxU) interfaceC9011Fwo;
        C7384Etj.A0Y(c9046FxU, 0);
        double d = this.A00;
        C9072Fxy c9072Fxy = c9046FxU.A0Y;
        C7384Etj.A0X(c9072Fxy);
        this.A00 = d + (c9072Fxy.A00 * c9072Fxy.A01.A00() * C9019Fww.A00(this.A01, c9046FxU));
        this.A02.add(c9046FxU.A01.A02);
    }
}
