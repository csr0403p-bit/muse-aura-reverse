package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.3cA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3cA extends AbstractC7559F3s implements G0V {
    public final int $t;
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3cA(Object obj, C04921Xv c04921Xv, C1AI c1ai, HWA hwa, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
        super(2);
        this.$t = i2;
        this.A02 = obj;
        this.A04 = c04921Xv;
        this.A05 = c1ai;
        this.A03 = hwa;
        this.A00 = g0v;
        this.A01 = i;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                C0mt.A00(AnonymousClass005.A0P(obj, obj2), (BRg) this.A03, (BA2) this.A05, (Function0) this.A04, (G0V) this.A02, AnonymousClass011.A00(this.A00), this.A01);
                break;
            case 1:
                C1AF.A00((C04921Xv) this.A02, (C1AI) this.A04, (HWA) this.A05, AnonymousClass005.A0P(obj, obj2), (G0V) this.A03, AnonymousClass011.A00(this.A00), this.A01);
                break;
            default:
                C1hc.A00(AnonymousClass005.A0P(obj, obj2), (BRg) this.A03, (C1he) this.A02, (C1hd) this.A05, (G0U) this.A04, AnonymousClass011.A00(this.A00), this.A01);
                break;
        }
        return Unit.INSTANCE;
    }
}
