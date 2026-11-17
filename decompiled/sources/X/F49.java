package X;

/* loaded from: classes5.dex */
public final class F49 extends AbstractC5200DdC {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F49(C4025CkE c4025CkE, InterfaceC4036Ckc interfaceC4036Ckc, C5201DdD c5201DdD, C4oT c4oT, Integer num, int i) {
        super(num);
        this.$t = i;
        this.A01 = c4025CkE;
        switch (i) {
            case 0:
            case 1:
                this.A03 = c5201DdD;
                this.A00 = interfaceC4036Ckc;
                this.A02 = c4oT;
                break;
            default:
                this.A00 = interfaceC4036Ckc;
                this.A02 = c4oT;
                this.A03 = c5201DdD;
                break;
        }
    }
}
