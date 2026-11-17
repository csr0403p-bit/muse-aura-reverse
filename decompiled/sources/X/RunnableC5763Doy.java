package X;

import java.util.Iterator;

/* renamed from: X.Doy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5763Doy implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$39";
    public final /* synthetic */ float A00;
    public final /* synthetic */ C5631DmF A01;

    public RunnableC5763Doy(C5631DmF c5631DmF, float f) {
        this.A00 = f;
        this.A01 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A01);
        while (itA00.hasNext()) {
            BV6.A0a(itA00).onVolumeChanged(this.A00);
        }
    }
}
