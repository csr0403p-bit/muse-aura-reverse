package X;

import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class FEU<V> implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ FEE<Object, FBB> A02;
    public final /* synthetic */ FBB A03;
    public final /* synthetic */ FDW A04;
    public final /* synthetic */ FCA A05;

    /* JADX WARN: Incorrect types in method signature: (LX/FDW;JLX/FEE<Ljava/lang/Object;LX/FBB;>;LX/FBB;LX/FCA;I)V */
    public FEU(FEE fee, FBB fbb, FDW fdw, FCA fca, int i, long j) {
        this.A04 = fdw;
        this.A01 = j;
        this.A02 = fee;
        this.A03 = fbb;
        this.A05 = fca;
        this.A00 = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return new C8184FYb(this.A02, this.A03, this.A04, this.A05, this.A00, 0, this.A01).invoke();
    }
}
