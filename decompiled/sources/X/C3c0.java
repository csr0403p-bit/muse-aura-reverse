package X;

import kotlin.Unit;

/* renamed from: X.3c0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3c0 extends AbstractC7559F3s implements G0V {
    public final int $t;
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3c0(Object obj, Object obj2, int i, int i2) {
        super(2);
        this.$t = i2;
        this.A02 = obj;
        this.A01 = obj2;
        this.A00 = i;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$t;
        BFM bfmA0P = AnonymousClass005.A0P(obj, obj2);
        Object obj3 = this.A02;
        if (i != 0) {
            C0yq.A01((C1822Arm) obj3, (G0V) this.A01, bfmA0P, AnonymousClass011.A00(this.A00));
        } else {
            C1XA.A06((C1Wz) obj3, (AbstractC04741Xc) this.A01, bfmA0P, AnonymousClass011.A00(this.A00));
        }
        return Unit.INSTANCE;
    }
}
