package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.3cD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3cD extends AbstractC7559F3s implements G0V {
    public final int $t;
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3cD(C1DH c1dh, Function0<Unit> function0, BRg bRg, boolean z, C1DM c1dm, C04791Xh c04791Xh, C04881Xr c04881Xr, C1DH c1dh2, C3TQ c3tq, InterfaceC1072AWd interfaceC1072AWd, G0W<? super C08R, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
        super(2);
        this.$t = i;
        this.A09 = c1dh2;
        this.A08 = c04791Xh;
        this.A0B = i2;
        this.A0A = c04881Xr;
        this.A03 = z;
        this.A06 = c1dm;
        this.A02 = c1dh;
        this.A05 = bRg;
        this.A07 = function0;
        this.A04 = c3tq;
        this.A00 = interfaceC1072AWd;
        this.A01 = g0w;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$t != 0) {
            BFM bfmA0P = AnonymousClass005.A0P(obj, obj2);
            Function0 function0 = (Function0) this.A09;
            BRg bRg = (BRg) this.A08;
            boolean z = this.A0B;
            C1DM c1dm = (C1DM) this.A0A;
            C04791Xh c04791Xh = (C04791Xh) this.A03;
            C04881Xr c04881Xr = (C04881Xr) this.A06;
            AbstractC04841Xn.A01((C1DH) this.A02, (InterfaceC1072AWd) this.A07, (C3TQ) this.A05, c04791Xh, c04881Xr, bfmA0P, bRg, c1dm, function0, (G0W) this.A04, AnonymousClass011.A00(this.A00), this.A01, z);
        } else {
            BFM bfmA0P2 = AnonymousClass005.A0P(obj, obj2);
            Function0 function02 = (Function0) this.A09;
            BRg bRg2 = (BRg) this.A08;
            boolean z2 = this.A0B;
            C1DM c1dm2 = (C1DM) this.A0A;
            C04791Xh c04791Xh2 = (C04791Xh) this.A03;
            C04881Xr c04881Xr2 = (C04881Xr) this.A06;
            AbstractC04841Xn.A00((C1DH) this.A02, (InterfaceC1072AWd) this.A07, (C3TQ) this.A05, c04791Xh2, c04881Xr2, bfmA0P2, bRg2, c1dm2, function02, (G0W) this.A04, AnonymousClass011.A00(this.A00), this.A01, z2);
        }
        return Unit.INSTANCE;
    }
}
