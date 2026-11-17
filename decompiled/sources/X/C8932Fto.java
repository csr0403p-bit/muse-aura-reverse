package X;

import java.util.function.Predicate;

/* renamed from: X.Fto, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8932Fto implements Predicate {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public C8932Fto(Gt3 gt3, AbstractC10245Gsg abstractC10245Gsg, int i) {
        this.$t = i;
        this.A00 = abstractC10245Gsg;
        this.A01 = gt3;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return this.$t != 0 ? ((AbstractC10245Gsg) this.A00).A03((Gt3) this.A01, (Gt3) obj) : ((AbstractC10245Gsg) this.A00).A05((Gt3) this.A01, (Gt4) obj);
    }
}
