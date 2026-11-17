package X;

import android.os.Looper;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;

/* renamed from: X.Diw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5461Diw implements InterfaceC5460Div {
    @Override // X.InterfaceC5460Div
    public final /* synthetic */ void prepare() {
    }

    @Override // X.InterfaceC5460Div
    public final /* synthetic */ void release() {
    }

    @Override // X.InterfaceC5460Div
    public final InterfaceC5547DkP A32(C6154Dwx c6154Dwx, C6014Dtx c6014Dtx) {
        if (c6154Dwx.A0T == null) {
            return null;
        }
        return new C5482DjK(new DrmSession$DrmSessionException(new UnsupportedDrmException(), 6001));
    }

    @Override // X.InterfaceC5460Div
    public final int AEH(C6154Dwx c6154Dwx) {
        return AnonymousClass002.A1X(c6154Dwx.A0T) ? 1 : 0;
    }

    @Override // X.InterfaceC5460Div
    public final /* synthetic */ InterfaceC5532Dk9 AYJ(C6154Dwx c6154Dwx, C6014Dtx c6014Dtx) {
        return InterfaceC5532Dk9.A00;
    }

    @Override // X.InterfaceC5460Div
    public final void Ae4(Looper looper, E6Y e6y) {
    }
}
