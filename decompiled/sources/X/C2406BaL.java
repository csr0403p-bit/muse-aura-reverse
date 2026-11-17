package X;

import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BaL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2406BaL {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    public final void A00(List<BjC> list) {
        if ((this.A02 || this.A01 || this.A00) && list != null) {
            Iterator<BjC> it = list.iterator();
            while (it.hasNext()) {
                it.next().A02();
            }
            AbstractC2875Bni.A01("ForceCloseDeferrableSurface", "deferrableSurface closed");
        }
    }

    public C2406BaL(C2511Bch c2511Bch, C2511Bch c2511Bch2) {
        this.A02 = c2511Bch2.A03(TextureViewIsClosedQuirk.class);
        this.A01 = c2511Bch.A03(PreviewOrientationIncorrectQuirk.class);
        this.A00 = c2511Bch.A03(ConfigureSurfaceToSecondarySessionFailQuirk.class);
    }
}
