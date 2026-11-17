package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.Hkl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C10474Hkl {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(C10474Hkl.class, "_handled$volatile");
    public final Throwable A00;
    public volatile /* synthetic */ int _handled$volatile;

    public C10474Hkl(Throwable th, boolean z) {
        this.A00 = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        AbstractC7609F5w.A1L(sbA0w, this);
        sbA0w.append('[');
        sbA0w.append(this.A00);
        return BV5.A0o(sbA0w);
    }
}
