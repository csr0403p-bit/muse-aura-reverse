package X;

/* renamed from: X.CDz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3320CDz<TResult> {
    public final CE0<TResult> A00 = new CE0<>();

    public final void A00(Exception exc) {
        CE0<TResult> ce0 = this.A00;
        Object obj = ce0.A04;
        synchronized (obj) {
            if (ce0.A03) {
                return;
            }
            CE0.A01(ce0);
            ce0.A03 = true;
            ce0.A00 = exc;
            obj.notifyAll();
            CE0.A02(ce0);
        }
    }
}
