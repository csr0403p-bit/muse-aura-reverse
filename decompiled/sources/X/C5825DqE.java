package X;

import java.lang.ref.WeakReference;

/* renamed from: X.DqE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5825DqE implements InterfaceC6133Dwb {
    public static final C5825DqE A00 = new C5825DqE();

    @Override // X.InterfaceC6133Dwb
    public final void APy(String str) {
        C5622Dm5 c5622Dm5;
        C7384Etj.A0Y(str, 0);
        WeakReference<C5622Dm5> weakReference = C5617Dly.A0l;
        if (weakReference == null || (c5622Dm5 = weakReference.get()) == null) {
            return;
        }
        c5622Dm5.AXQ("MEDIA_CODEC_RENDERER_UPGRADE", "MEDIA_CODEC_RENDERER_SUPPORT_FORMAT_CHANGE", str);
    }
}
