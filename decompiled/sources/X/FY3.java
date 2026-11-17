package X;

import android.os.Build;
import android.text.StaticLayout;

/* loaded from: classes6.dex */
public final class FY3 implements InterfaceC2108AyY {
    @Override // X.InterfaceC2108AyY
    public final StaticLayout A7R(FY8 fy8) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(fy8.A0D, 0, fy8.A02, fy8.A0B, fy8.A08);
        builderObtain.setTextDirection(fy8.A0A);
        builderObtain.setAlignment(fy8.A09);
        builderObtain.setMaxLines(fy8.A07);
        builderObtain.setEllipsize(fy8.A0C);
        builderObtain.setEllipsizedWidth(fy8.A01);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(fy8.A0E);
        builderObtain.setBreakStrategy(fy8.A00);
        builderObtain.setHyphenationFrequency(fy8.A03);
        builderObtain.setIndents(null, null);
        builderObtain.setJustificationMode(fy8.A04);
        builderObtain.setUseLineSpacingFromFallbacks(true);
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            FZF.A00(builderObtain, fy8.A05, fy8.A06);
            if (i >= 35) {
                FZN.A00(builderObtain);
            }
        }
        return builderObtain.build();
    }

    @Override // X.InterfaceC2108AyY
    public final boolean AOP(StaticLayout staticLayout, boolean z) {
        return Build.VERSION.SDK_INT >= 33 ? FZF.A01(staticLayout) : z;
    }
}
