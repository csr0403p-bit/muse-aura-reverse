package X;

import java.util.concurrent.Callable;

/* renamed from: X.Hyn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class CallableC10610Hyn<V> implements Callable {
    public final /* synthetic */ EEO A00;
    public final /* synthetic */ C7403Euh A01;
    public final /* synthetic */ Hx1 A02;
    public final /* synthetic */ String A03;

    public CallableC10610Hyn(EEO eeo, C7403Euh c7403Euh, Hx1 hx1, String str) {
        this.A00 = eeo;
        this.A01 = c7403Euh;
        this.A03 = str;
        this.A02 = hx1;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        try {
            return EEO.A00(this.A00, this.A01, this.A02, this.A03);
        } catch (Exception e) {
            FFI.A01(null, "Failed to read from disk cache", e);
            return null;
        }
    }
}
