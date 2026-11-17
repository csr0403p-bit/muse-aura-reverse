package com.facebook.aura.vds.compose.theme;

import X.AKH;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.B6A;
import X.BFM;
import X.C7384Etj;
import X.HDi;
import X.HxS;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class AuraAdaptiveColorsKt {
    public static final long adaptiveAmbientShadow(AuraColors auraColors, BFM bfm, int i) {
        long jA04;
        Object objA6v = bfm.A6v(AuraContainerKt.LocalAuraContainer);
        if (C7384Etj.areEqual(objA6v, AuraContainer.PrimaryBottomSheet.INSTANCE) || C7384Etj.areEqual(objA6v, AuraContainer.Card.INSTANCE)) {
            bfm.AgE(984759178);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            if (AnonymousClass001.A0f(bfm, akh).isLight) {
                long j = AnonymousClass006.A0i(bfm, akh, 984760845).onLight;
                jA04 = HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.5f);
            } else {
                jA04 = AnonymousClass006.A0i(bfm, akh, 984762402).onLight;
            }
            AnonymousClass002.A19(bfm);
        } else {
            jA04 = AnonymousClass003.A0c(bfm, 984763585).shadow;
        }
        AnonymousClass002.A19(bfm);
        return jA04;
    }

    public static final long adaptiveFill(AuraColors auraColors, BFM bfm, int i) {
        long j;
        int i2;
        Object objA6v = bfm.A6v(AuraContainerKt.LocalAuraContainer);
        if (C7384Etj.areEqual(objA6v, AuraContainer.PrimaryScreen.INSTANCE)) {
            j = AnonymousClass003.A0c(bfm, 1879514973).secondaryElevated;
        } else {
            if (C7384Etj.areEqual(objA6v, AuraContainer.SecondaryScreen.INSTANCE)) {
                i2 = 1879517268;
            } else if (C7384Etj.areEqual(objA6v, AuraContainer.PrimaryBottomSheet.INSTANCE) || C7384Etj.areEqual(objA6v, AuraContainer.Card.INSTANCE)) {
                bfm.AgE(1879519939);
                AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
                j = AnonymousClass001.A0f(bfm, akh).isLight ? AnonymousClass006.A0i(bfm, akh, 1879521365).highlight : AnonymousClass006.A0i(bfm, akh, 1879522388).elevated;
                AnonymousClass002.A19(bfm);
            } else {
                boolean zAreEqual = C7384Etj.areEqual(objA6v, AuraContainer.SecondaryBottomSheet.INSTANCE);
                i2 = 1879524564;
                if (!zAreEqual) {
                    AnonymousClass004.A1A(bfm, 1879512757);
                    throw new NoWhenBranchMatchedException();
                }
            }
            j = AnonymousClass003.A0c(bfm, i2).elevated;
        }
        AnonymousClass002.A19(bfm);
        return j;
    }

    public static final long adaptiveSecondaryFill(AuraColors auraColors, BFM bfm, int i) {
        Object objA6v = bfm.A6v(AuraContainerKt.LocalAuraContainer);
        AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
        long j = (AnonymousClass001.A0f(bfm, akh).isLight && ((objA6v instanceof AuraContainer.SecondaryScreen) || (objA6v instanceof AuraContainer.SecondaryBottomSheet))) ? AnonymousClass006.A0i(bfm, akh, -895424542).elevated : AnonymousClass006.A0i(bfm, akh, -895423469).secondaryButtonBackground;
        AnonymousClass002.A19(bfm);
        return j;
    }

    public static final long adaptiveSpotShadow(AuraColors auraColors, BFM bfm, int i) {
        long j;
        Object objA6v = bfm.A6v(AuraContainerKt.LocalAuraContainer);
        if (C7384Etj.areEqual(objA6v, AuraContainer.PrimaryBottomSheet.INSTANCE) || C7384Etj.areEqual(objA6v, AuraContainer.Card.INSTANCE)) {
            bfm.AgE(725423454);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            j = AnonymousClass001.A0f(bfm, akh).isLight ? AnonymousClass006.A0i(bfm, akh, 725424881).shadow : AnonymousClass006.A0i(bfm, akh, 725425810).onLight;
            AnonymousClass002.A19(bfm);
        } else {
            j = AnonymousClass003.A0c(bfm, 725426993).shadow;
        }
        AnonymousClass002.A19(bfm);
        return j;
    }
}
