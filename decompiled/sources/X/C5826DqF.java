package X;

import java.lang.ref.WeakReference;

/* renamed from: X.DqF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5826DqF implements DlP {
    public static final C5826DqF A00 = new C5826DqF();

    @Override // X.DlP
    public final void APy(String str) {
        C5622Dm5 c5622Dm5;
        C7384Etj.A0Y(str, 0);
        WeakReference<C5622Dm5> weakReference = C5617Dly.A0l;
        if (weakReference == null || (c5622Dm5 = weakReference.get()) == null) {
            return;
        }
        c5622Dm5.AXQ("MANIFEST", "FALLBACK_TRIGGERED", str);
    }
}
