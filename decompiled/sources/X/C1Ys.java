package X;

import kotlin.Unit;

/* renamed from: X.1Ys, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Ys extends AbstractC7559F3s implements G0V {
    public final int $t;
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;
    public final boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1Ys(Object obj, C07C c07c, boolean z, BRg bRg, APu aPu, APt aPt, String str, G0W<? super C1Cd, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
        super(2);
        this.$t = i;
        this.A06 = z;
        this.A08 = i2;
        this.A05 = bRg;
        this.A03 = obj;
        this.A04 = c07c;
        this.A07 = aPt;
        this.A02 = aPu;
        this.A00 = str;
        this.A01 = g0w;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$t;
        BFM bfmA0P = AnonymousClass005.A0P(obj, obj2);
        Object obj3 = this.A06;
        if (i != 0) {
            boolean z = this.A08;
            BRg bRg = (BRg) this.A05;
            AbstractC04661Bq.A06((APu) this.A03, (APt) this.A04, (C07C) obj3, bfmA0P, bRg, this.A07, (G0W) this.A02, AnonymousClass011.A00(this.A00), this.A01, z);
        } else {
            boolean z2 = this.A08;
            BRg bRg2 = (BRg) this.A05;
            AbstractC04661Bq.A07((APu) this.A03, (APt) this.A04, (C08R) obj3, bfmA0P, bRg2, this.A07, (G0W) this.A02, AnonymousClass011.A00(this.A00), this.A01, z2);
        }
        return Unit.INSTANCE;
    }
}
