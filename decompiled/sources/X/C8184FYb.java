package X;

import kotlin.jvm.functions.Function0;

/* renamed from: X.FYb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8184FYb extends AbstractC7559F3s implements Function0 {
    public final int $t;
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x000c: IPUT (r5 I:java.lang.Object), (r1 I:X.FYb) (LINE:12) X.FYb.A03 java.lang.Object, block:B:5:0x000c */
    public C8184FYb(FEE fee, FDW fdw, long j, FEE<Object, FBB> fee2, FBB fbb, FCA fca, int i) {
        Object obj;
        super(0);
        this.$t = fbb;
        if (fbb != 0) {
            this.A05 = j;
            this.A01 = fca;
            this.A04 = fee;
            this.A02 = fdw;
        } else {
            this.A02 = j;
            this.A01 = fca;
            this.A04 = fee;
            this.A05 = fdw;
        }
        this.A03 = obj;
        this.A00 = fee2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        FDW fdw;
        long j;
        FEE fee;
        Object obj;
        int i = this.$t;
        FEC fec = FEC.A00;
        if (i != 0) {
            fdw = (FDW) this.A05;
            j = this.A01;
            fee = (FEE) this.A04;
            obj = this.A02;
        } else {
            fdw = (FDW) this.A02;
            j = this.A01;
            fee = (FEE) this.A04;
            obj = this.A05;
        }
        return fec.A05(fee, (FBB) obj, fdw, (FCA) this.A03, this.A00, j);
    }
}
