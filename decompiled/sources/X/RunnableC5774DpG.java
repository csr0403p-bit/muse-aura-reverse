package X;

import java.util.Iterator;

/* renamed from: X.DpG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5774DpG implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$46";
    public final /* synthetic */ long A00;
    public final /* synthetic */ C5631DmF A01;
    public final /* synthetic */ String A02;

    public RunnableC5774DpG(C5631DmF c5631DmF, String str, long j) {
        this.A02 = str;
        this.A00 = j;
        this.A01 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A01);
        while (itA00.hasNext()) {
            BV6.A0a(itA00).ATS(this.A02, this.A00);
        }
    }
}
