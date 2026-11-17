package com.facebook.aura.vds.compose.theme;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass011;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class AuraThemeProviderKt {
    public static final AuraModeOverrideHolder modeOverrideHolder = new AuraModeOverrideHolder(new AuraModeOverride(AuraBrushesKt.auraBrushesLight, AuraColorsKt.auraColorsLight, BaseColors.BLACK, AuraIndicationKt.auraIndicationLight), new AuraModeOverride(AuraBrushesKt.auraBrushesDark, AuraColorsKt.auraColorsDark, BaseColors.WHITE, AuraIndicationKt.auraIndicationDark));

    /* renamed from: com.facebook.aura.vds.compose.theme.AuraThemeProviderKt$AuraThemeProvider$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0V<? super BFM, ? super Integer, Unit> g0v) {
            super(2);
            this.$content = g0v;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                AuraTypographyKt.ProvideAuraTextStyle(AuraOptimisticAi2TypographyKt.auraOptimisticAi2Typography.subheadlineRegular, this.$content, bfm, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.theme.AuraThemeProviderKt$AuraThemeProvider$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraColors $colorsOverride;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ float $fontScale;
        public final /* synthetic */ boolean $useLightTheme;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(boolean z, float f, AuraColors auraColors, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$useLightTheme = z;
            this.$fontScale = f;
            this.$colorsOverride = auraColors;
            this.$content = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraThemeProviderKt.AuraThemeProvider(this.$useLightTheme, this.$fontScale, this.$colorsOverride, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraThemeProvider(boolean r17, float r18, com.facebook.aura.vds.compose.theme.AuraColors r19, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r20, X.BFM r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.theme.AuraThemeProviderKt.AuraThemeProvider(boolean, float, com.facebook.aura.vds.compose.theme.AuraColors, X.G0V, X.BFM, int, int):void");
    }

    public static final AuraModeOverrideHolder getModeOverrideHolder() {
        return modeOverrideHolder;
    }
}
