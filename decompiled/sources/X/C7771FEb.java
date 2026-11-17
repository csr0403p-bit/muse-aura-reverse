package X;

import kotlin.jvm.functions.Function0;

/* renamed from: X.FEb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7771FEb extends AbstractC7559F3s implements Function0<FEE<Object, FBB>> {
    public final /* synthetic */ FDW $child;
    public final /* synthetic */ InterfaceC7780FEk $context;
    public final /* synthetic */ FCA $evaluationContext;
    public final /* synthetic */ FEE<Object, FBB> $previousResult;
    public final /* synthetic */ long $sizeConstraints;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/FDW;JLX/FEE<Ljava/lang/Object;LX/FBB;>;LX/FEk;LX/FCA;)V */
    public C7771FEb(FEE fee, FDW fdw, FCA fca, InterfaceC7780FEk interfaceC7780FEk, long j) {
        super(0);
        this.$child = fdw;
        this.$sizeConstraints = j;
        this.$previousResult = fee;
        this.$context = interfaceC7780FEk;
        this.$evaluationContext = fca;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ FEE<Object, FBB> invoke() {
        FEC fec = FEC.A00;
        FDW fdw = this.$child;
        long j = this.$sizeConstraints;
        FEE<Object, FBB> fee = this.$previousResult;
        InterfaceC7780FEk interfaceC7780FEk = this.$context;
        FBB fbbAJW = interfaceC7780FEk.AJW();
        if (fbbAJW != null) {
            return fec.A05(fee, fbbAJW, fdw, this.$evaluationContext, interfaceC7780FEk.AH0(), j);
        }
        throw BV4.A0U();
    }
}
