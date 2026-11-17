package X;

import android.os.ext.SdkExtensions;
import java.util.Set;

/* renamed from: X.Fwr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9014Fwr {
    public static final Set<C8993FwW<?>> A00 = BFI.A0H(new C8993FwW[]{C9056Fxe.A07, C9056Fxe.A08, C9056Fxe.A09, C9056Fxe.A0A, C9056Fxe.A0B, C9056Fxe.A0C, C9007Fwk.A06, C9007Fwk.A07, C9007Fwk.A08, C9046FxU.A1J, C9060Fxi.A06, C9060Fxi.A07, C9060Fxi.A08, C9006Fwj.A06, C9006Fwj.A07, C9006Fwj.A08});

    public static final boolean A00(C8993FwW<?> c8993FwW) {
        C7384Etj.A0Y(c8993FwW, 0);
        return SdkExtensions.getExtensionVersion(34) >= 10 || !A00.contains(c8993FwW);
    }
}
