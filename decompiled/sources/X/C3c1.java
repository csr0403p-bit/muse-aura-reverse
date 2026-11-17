package X;

import kotlin.Unit;

/* renamed from: X.3c1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3c1 extends AbstractC7559F3s implements G0V {
    public final int $t;
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0008: IPUT (r4 I:int), (r1 I:X.3c1) (LINE:8) X.3c1.A00 int, block:B:2:0x0000 */
    public C3c1(C1822Arm c1822Arm, long j, C1822Arm c1822Arm2, G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
        int i2;
        super(2);
        this.$t = c1822Arm2;
        this.A01 = g0v;
        this.A03 = c1822Arm;
        this.A02 = j;
        this.A00 = i2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$t != 0) {
            AbstractC046219w.A03(AnonymousClass005.A0P(obj, obj2), (C1822Arm) this.A03, (G0V) this.A02, AnonymousClass011.A00(this.A00), this.A01);
        } else {
            C0y1.A00(AnonymousClass005.A0P(obj, obj2), (C1822Arm) this.A03, (G0V) this.A02, AnonymousClass011.A00(this.A00), this.A01);
        }
        return Unit.INSTANCE;
    }
}
