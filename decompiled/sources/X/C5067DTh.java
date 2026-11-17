package X;

/* renamed from: X.DTh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5067DTh<TResult> {
    public final C5066DTg<TResult> A00 = new C5066DTg<>();

    public final void A00(Exception exc) {
        boolean z;
        C5066DTg<TResult> c5066DTg = this.A00;
        Object obj = c5066DTg.A05;
        synchronized (obj) {
            z = false;
            if (!c5066DTg.A04) {
                z = true;
                c5066DTg.A04 = true;
                c5066DTg.A00 = exc;
                obj.notifyAll();
                C5066DTg.A01(c5066DTg);
            }
        }
        if (!z) {
            throw C3cG.A0Q("Cannot set the error on a completed task.");
        }
    }
}
