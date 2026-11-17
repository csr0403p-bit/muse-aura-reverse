package X;

import kotlin.Unit;

/* loaded from: classes6.dex */
public final class GB2 extends GB6 {
    public static final String __redex_internal_original_name = "EventLoopImplBase$DelayedResumeTask";
    public final Hm1<Unit> A00;
    public final /* synthetic */ GB4 A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0005: IPUT (r4 I:long), (r1 I:X.GB6) (LINE:5) X.GB6.A01 long, block:B:2:0x0000 */
    public GB2(Hm1 hm1, long j, Hm1<? super Unit> hm12) {
        long j2;
        this.A01 = j;
        super.A01 = j2;
        super.A00 = -1;
        this.A00 = hm1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.Abi(Unit.INSTANCE, this.A01);
    }

    @Override // X.GB6
    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(super.toString());
        return C8j3.A14(this.A00, sbA0w);
    }
}
