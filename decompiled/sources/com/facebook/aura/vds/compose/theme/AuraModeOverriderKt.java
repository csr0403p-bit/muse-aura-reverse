package com.facebook.aura.vds.compose.theme;

import X.AKH;
import X.AKJ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C0yB;
import X.G0V;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class AuraModeOverriderKt {

    /* renamed from: com.facebook.aura.vds.compose.theme.AuraModeOverriderKt$AuraModeOverrider$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ ActivityTheme $activityTheme;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ AuraThemeMode $modeOverride;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(ActivityTheme activityTheme, G0V<? super BFM, ? super Integer, Unit> g0v, AuraThemeMode auraThemeMode) {
            super(2);
            this.$activityTheme = activityTheme;
            this.$content = g0v;
            this.$modeOverride = auraThemeMode;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                ActivityTheme activityTheme = this.$activityTheme;
                if (activityTheme == null) {
                    bfm.AgE(271245107);
                } else {
                    bfm.AgE(271245108);
                    ActivityThemeKt.ApplyTheme(this.$modeOverride, activityTheme, bfm, 0);
                }
                AnonymousClass001.A1D(bfm);
                AnonymousClass001.A1H(bfm, this.$content, 0);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.theme.AuraModeOverriderKt$AuraModeOverrider$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ActivityTheme $activityTheme;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ AuraThemeMode $modeOverride;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(AuraThemeMode auraThemeMode, ActivityTheme activityTheme, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$modeOverride = auraThemeMode;
            this.$activityTheme = activityTheme;
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
            AuraModeOverriderKt.AuraModeOverrider(this.$modeOverride, this.$activityTheme, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AuraModeOverrider(AuraThemeMode auraThemeMode, ActivityTheme activityTheme, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        ActivityTheme activityTheme2 = activityTheme;
        AnonymousClass002.A1A(auraThemeMode, 0, g0v);
        bfm.AgG(-1455918358);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, auraThemeMode) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA08 |= 48;
        } else if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0e(bfm, activityTheme2);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0V(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA08), bfm, iA08)) {
            if (i3 != 0) {
                activityTheme2 = null;
            }
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            if (isCurrentMode(auraThemeMode, AnonymousClass001.A0f(bfm, akh))) {
                bfm.AgE(1611111049);
                if (activityTheme2 == null) {
                    bfm.AgE(1611130671);
                } else {
                    bfm.AgE(1611130672);
                    ActivityThemeKt.ApplyTheme(auraThemeMode, activityTheme2, bfm, iA08 & 14);
                }
                AnonymousClass001.A1D(bfm);
                AnonymousClass003.A13(bfm, g0v, iA08 >> 6);
            } else {
                bfm.AgE(1611208761);
                AuraModeOverrideHolder auraModeOverrideHolder = (AuraModeOverrideHolder) bfm.A6v(AuraModeOverrideHolderKt.LocalAuraModeOverrideHolder);
                AuraModeOverride auraModeOverride = auraThemeMode == AuraThemeMode.LIGHT ? auraModeOverrideHolder.light : auraModeOverrideHolder.dark;
                AnonymousClass003.A0p(bfm, new AnonymousClass2(activityTheme2, g0v, auraThemeMode), new AKJ[]{AuraBrushesKt.LocalAuraBrushes.A04(auraModeOverride.brushes), akh.A04(auraModeOverride.colors), AnonymousClass003.A0T(AuraContentColorKt.LocalAuraContentColor, auraModeOverride.contentColor), C0yB.A00.A04(auraModeOverride.indication)}, -1287284474);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(auraThemeMode, activityTheme2, g0v, i, i2);
        }
    }

    public static final boolean isCurrentMode(AuraThemeMode auraThemeMode, AuraColors auraColors) {
        return auraThemeMode == AuraThemeMode.DEFAULT || auraThemeMode == toMode(auraColors.isLight);
    }

    public static final AuraThemeMode toMode(boolean z) {
        return z ? AuraThemeMode.LIGHT : AuraThemeMode.DARK;
    }
}
