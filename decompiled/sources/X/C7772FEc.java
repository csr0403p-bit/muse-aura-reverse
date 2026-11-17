package X;

import kotlin.jvm.functions.Function0;

/* renamed from: X.FEc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7772FEc extends AbstractC7559F3s implements Function0<FEE<Object, FBB>> {
    public final /* synthetic */ FDW $child;
    public final /* synthetic */ FEE<Object, FBB> $previousResult;
    public final /* synthetic */ long $sizeConstraints;
    public final /* synthetic */ C7773FEd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/FDW;JLX/FEE<Ljava/lang/Object;LX/FBB;>;LX/FEd;)V */
    public C7772FEc(C7773FEd c7773FEd, FEE fee, FDW fdw, long j) {
        super(0);
        this.$child = fdw;
        this.$sizeConstraints = j;
        this.$previousResult = fee;
        this.this$0 = c7773FEd;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ FEE<Object, FBB> invoke() {
        FEC fec = FEC.A00;
        FDW fdw = this.$child;
        long j = this.$sizeConstraints;
        FEE<Object, FBB> fee = this.$previousResult;
        C7773FEd c7773FEd = this.this$0;
        FBB fbb = c7773FEd.A02;
        if (fbb != null) {
            return fec.A05(fee, fbb, fdw, c7773FEd.A03, c7773FEd.A01, j);
        }
        throw BV4.A0U();
    }
}
