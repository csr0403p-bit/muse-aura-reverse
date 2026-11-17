package X;

import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Bau, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2419Bau implements InterfaceC2420Baw {
    public static final Map<Integer, C2421Bax> A03;
    public final InterfaceC2544BdV A00;
    public final C2511Bch A01;
    public final InterfaceC2420Baw A02;

    @Override // X.InterfaceC2420Baw
    public final boolean ANG(int i) {
        if (!this.A02.ANG(i)) {
            return false;
        }
        C2421Bax c2421Bax = (C2421Bax) BV5.A0f(A03, i);
        if (c2421Bax == null) {
            return true;
        }
        Iterator it = this.A01.A02(VideoQualityQuirk.class).iterator();
        while (it.hasNext()) {
            VideoQualityQuirk videoQualityQuirk = (VideoQualityQuirk) it.next();
            if (videoQualityQuirk != null && videoQualityQuirk.AOv(this.A00, c2421Bax) && (!(videoQualityQuirk instanceof SurfaceProcessingQuirk) || !((SurfaceProcessingQuirk) videoQualityQuirk).AiX())) {
                return false;
            }
        }
        return true;
    }

    static {
        HashMap mapA0u = BV4.A0u();
        A03 = mapA0u;
        mapA0u.put(BV4.A0W(), C2421Bax.A02);
        mapA0u.put(8, C2421Bax.A06);
        mapA0u.put(6, C2421Bax.A00);
        mapA0u.put(5, C2421Bax.A01);
        mapA0u.put(BV4.A0Z(), C2421Bax.A05);
        mapA0u.put(BV4.A0V(), C2421Bax.A03);
    }

    public C2419Bau(InterfaceC2544BdV interfaceC2544BdV, InterfaceC2420Baw interfaceC2420Baw, C2511Bch c2511Bch) {
        this.A02 = interfaceC2420Baw;
        this.A00 = interfaceC2544BdV;
        this.A01 = c2511Bch;
    }

    @Override // X.InterfaceC2420Baw
    public final InterfaceC2523Bcu ACK(int i) {
        if (ANG(i)) {
            return this.A02.ACK(i);
        }
        return null;
    }
}
