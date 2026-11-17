package X;

import kotlin.Unit;

/* renamed from: X.8i7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8i7 implements Ht9, G0V {
    public final int $t;
    public final int A00;
    public final int A01;
    public final Object A02;

    public C8i7(Object obj, int i, int i2, int i3) {
        this.$t = i3;
        this.A02 = obj;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.G0V
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$t;
        Object obj3 = this.A02;
        if (i != 0) {
            int i2 = this.A00;
            C72N.A01((C76B) obj3, (BFM) obj, AnonymousClass011.A00(i2), this.A01);
        } else {
            int i3 = this.A00;
            BPb.A01((BRg) obj3, (BFM) obj, AnonymousClass011.A00(i3), this.A01);
        }
        return Unit.INSTANCE;
    }
}
