package X;

import kotlin.Unit;

/* loaded from: classes6.dex */
public final class FXy implements Runnable {
    public static final String __redex_internal_original_name = "ResumeUndispatchedRunnable";
    public final Hm1<Unit> A00;
    public final GBK A01;

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.Abi(Unit.INSTANCE, this.A01);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GBK;LX/Hm1<-Lkotlin/Unit;>;)V */
    public FXy(Hm1 hm1, GBK gbk) {
        this.A01 = gbk;
        this.A00 = hm1;
    }
}
