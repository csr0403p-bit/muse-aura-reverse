package X;

import java.util.Iterator;

/* renamed from: X.Bfk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class RunnableC2618Bfk implements Runnable {
    public static final String __redex_internal_original_name = "SurfaceProcessorNode$$ExternalSyntheticLambda2";
    public final /* synthetic */ BfJ A00;

    @Override // java.lang.Runnable
    public final void run() {
        BgH bgH = this.A00.A00;
        if (bgH != null) {
            Iterator itA0x = BV5.A0x(bgH);
            while (itA0x.hasNext()) {
                ((BfK) itA0x.next()).A03();
            }
        }
    }

    public /* synthetic */ RunnableC2618Bfk(BfJ bfJ) {
        this.A00 = bfJ;
    }
}
