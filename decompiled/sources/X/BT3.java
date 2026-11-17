package X;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class BT3 implements Ht9, Function0 {
    public final int $t;
    public final int A00;
    public final Object A01;

    public BT3(Object obj, int i, int i2) {
        this.$t = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                int i = this.A00;
                Object obj = this.A01;
                C1088AXy c1088AXy = AZ1.A01;
                C9kj c9kj = new C9kj(0.0f, i);
                c9kj.A00 = AbstractC1798ArH.A06(obj);
                return c9kj;
            case 1:
                C1871Asl.A04((C1871Asl) this.A01, this.A00);
                return AnonymousClass001.A0i();
            default:
                AvA avA = (AvA) this.A01;
                return Integer.valueOf(avA.A05.A03.A09(this.A00));
        }
    }
}
