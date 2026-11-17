package X;

/* loaded from: classes5.dex */
public final class F48 extends AbstractC5200DdC {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F48(C4025CkE c4025CkE, C5201DdD c5201DdD, CGw cGw, Integer num, int i) {
        super(num);
        this.$t = i;
        if (i != 0) {
            this.A00 = c4025CkE;
            this.A01 = cGw;
            this.A02 = c5201DdD;
        } else {
            this.A01 = cGw;
            this.A02 = c5201DdD;
            this.A00 = c4025CkE;
        }
    }
}
