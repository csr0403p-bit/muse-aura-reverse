package X;

/* renamed from: X.FtP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8907FtP extends HzP {
    public final int $t;
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;

    public static void A01(C8907FtP c8907FtP) {
        c8907FtP.A02 = null;
        c8907FtP.A03 = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8907FtP(int i, HtJ<? super C8907FtP> htJ) {
        super(htJ);
        this.$t = i;
    }

    public static void A00(C8907FtP c8907FtP) {
        c8907FtP.A01 |= Integer.MIN_VALUE;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        switch (this.$t) {
            case 3:
                this.A05 = obj;
                A00(this);
                return AbstractC9777Gfy.A00(this, null, null);
            case 4:
                this.A05 = obj;
                A00(this);
                return AbstractC9777Gfy.A01(this, null, null);
            case 5:
                this.A04 = obj;
                A00(this);
                return ((C10646I0q) this.A05).emit(null, this);
            case 6:
                this.A04 = obj;
                A00(this);
                return ((C10647I0r) this.A05).emit(null, this);
            case 7:
                this.A04 = obj;
                A00(this);
                return ((HwB) this.A05).collect(null, this);
            case 8:
                this.A04 = obj;
                A00(this);
                return ((C10649I0t) this.A05).collect(null, this);
            default:
                this.A04 = obj;
                A00(this);
                return ((C10650I0u) this.A05).collect(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8907FtP(Object obj, HtJ htJ, int i) {
        super(htJ);
        this.$t = i;
        this.A05 = obj;
    }
}
