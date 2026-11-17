package X;

import java.util.function.Function;

/* renamed from: X.I0x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10653I0x implements Function {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public C10653I0x(int i, C c, GD4 gd4) {
        this.$t = i;
        this.A00 = c;
        this.A01 = gd4;
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        if (this.$t != 0) {
            return Boolean.valueOf(((AbstractC10243Gse) this.A00).A02.A05((Gt3) this.A01, (Gt4) obj));
        }
        GD4 gd4 = (GD4) this.A00;
        String strMo29getIdentifierDnvc6hM = gd4.mo29getIdentifierDnvc6hM();
        C7384Etj.A0Y(strMo29getIdentifierDnvc6hM, 0);
        return new GD0(GD9.A00, gd4, (GD4) this.A01, strMo29getIdentifierDnvc6hM);
    }
}
