package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.Don, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5752Don implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$18";
    public final /* synthetic */ C5631DmF A00;
    public final /* synthetic */ List A01;

    public RunnableC5752Don(C5631DmF c5631DmF, List list) {
        this.A01 = list;
        this.A00 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A00);
        while (itA00.hasNext()) {
            BV6.A0a(itA00).onCues(this.A01);
        }
    }
}
