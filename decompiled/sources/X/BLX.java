package X;

import kotlin.Deprecated;

@Deprecated(message = "Providing `OverscrollConfiguration` through `LocalOverscrollConfiguration` to disable / configure overscroll has been replaced with `LocalOverscrollFactory` and `rememberPlatformOverscrollFactory`. To disable overscroll, instead of `LocalOverscrollConfiguration provides null`, use `LocalOverscrollFactory provides null`. To change the glow color / padding, instead of `LocalOverscrollConfiguration provides OverscrollConfiguration(myColor, myPadding)`, use `LocalOverscrollFactory provides rememberPlatformOverscrollFactory(myColor, myPadding)`")
/* loaded from: classes4.dex */
public final class BLX {
    public final long A00;
    public final C3TQ A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().equals(obj != null ? obj.getClass() : null)) {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
                BLX blx = (BLX) obj;
                long j = this.A00;
                long j2 = blx.A00;
                long j3 = B6A.A01;
                if (j != j2 || !this.A01.equals(blx.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = B6A.A01;
        return AnonymousClass005.A0G(this.A01, C3cI.A01(j));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("OverscrollConfiguration(glowColor=");
        AnonymousClass005.A0m(this.A00, sbA0x);
        sbA0x.append(", drawPadding=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    public /* synthetic */ BLX() {
        long jA0U = C8j3.A0U(4284900966L);
        C1DP c1dp = new C1DP(0.0f, 0.0f, 0.0f, 0.0f);
        this.A00 = jA0U;
        this.A01 = c1dp;
    }
}
