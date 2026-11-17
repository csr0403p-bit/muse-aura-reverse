package X;

import android.util.Range;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;

/* renamed from: X.Bam, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2412Bam {
    public final Range<Integer> A00;

    public C2412Bam(C2511Bch c2511Bch) {
        AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk = (AeFpsRangeLegacyQuirk) c2511Bch.A01(AeFpsRangeLegacyQuirk.class);
        this.A00 = aeFpsRangeLegacyQuirk == null ? null : aeFpsRangeLegacyQuirk.A00;
    }
}
