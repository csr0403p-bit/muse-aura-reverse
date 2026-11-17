package X;

import android.os.Build;
import java.util.Set;

/* renamed from: X.DgY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5337DgY {
    public static final Set<String> A00 = C60O.A19("c2.mtk.avc.decoder", "c2.mtk.hevc.decoder");

    public static final boolean A00(String str, boolean z) {
        return z && Build.VERSION.SDK_INT >= 34 && AbstractC0878AGe.A0k(A00, str) && AbstractC5653Dmh.A03(EnumC5618Dlz.A1u);
    }
}
