package X;

import java.util.List;

/* renamed from: X.DoH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5722DoH implements Runnable {
    public static final String __redex_internal_original_name = "GrootPlayerLogger$logCompleteEvent$1";
    public final /* synthetic */ C5643DmX A00;
    public final /* synthetic */ C6060Duv A01;
    public final /* synthetic */ Dq8 A02;
    public final /* synthetic */ C5623Dm6 A03;
    public final /* synthetic */ List<C3067Bwp> A04;

    public RunnableC5722DoH(C5643DmX c5643DmX, C6060Duv c6060Duv, Dq8 dq8, C5623Dm6 c5623Dm6, List list) {
        this.A04 = list;
        this.A00 = c5643DmX;
        this.A03 = c5623Dm6;
        this.A02 = dq8;
        this.A01 = c6060Duv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<C3067Bwp> list = this.A04;
        if (list != null) {
            C3066Bwo.A02(list, 0, list.size());
        }
    }
}
