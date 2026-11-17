package com.facebook.aura.browsertask.view;

import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C11U;
import X.C2CK;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.ui.HatchInlineBannerKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class BrowserTakeoverBannerKt {
    public static final void BrowserTakeoverBanner(final boolean z, final Function0<Unit> function0, BRg bRg, BFM bfm, final int i, final int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(function0, 1);
        bfm.AgG(-1128505831);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = HatchIdentityProvider.Companion.getInstance(abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            final HatchIdentityProvider hatchIdentityProvider = (HatchIdentityProvider) objAaT;
            HatchInlineBannerKt.m2318HatchInlineBannerKBbEK2Q(AnonymousClass001.A0t(bfm, C2CK.A02(bfm, hatchIdentityProvider.aiIdentityName).getValue(), R.string._name_removed__res_0x7f12018b), B1V.A00(bfm, new G0V() { // from class: com.facebook.aura.browsertask.view.BrowserTakeoverBannerKt$$ExternalSyntheticLambda0
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    return BrowserTakeoverBannerKt.BrowserTakeoverBanner$lambda$2(hatchIdentityProvider, (BFM) obj, AnonymousClass001.A0F(obj2));
                }
            }, -837495616), bRg2, null, B1V.A00(bfm, new G0V() { // from class: com.facebook.aura.browsertask.view.BrowserTakeoverBannerKt$$ExternalSyntheticLambda1
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    return BrowserTakeoverBannerKt.BrowserTakeoverBanner$lambda$3(z, function0, (BFM) obj, AnonymousClass001.A0F(obj2));
                }
            }, 1332375683), AnonymousClass002.A0e(bfm).pill, 0L, 0.0f, null, 0.0f, 0.0f, null, 0L, 0, null, 0L, 0, bfm, (iA0n & 896) | 24624, 0, 131016);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRg2;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.browsertask.view.BrowserTakeoverBannerKt$$ExternalSyntheticLambda2
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    boolean z2 = z;
                    Function0 function02 = function0;
                    BRg bRg4 = bRg3;
                    int i4 = i;
                    BrowserTakeoverBannerKt.BrowserTakeoverBanner(z2, function02, bRg4, (BFM) obj, AnonymousClass011.A02(obj2, i4), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit BrowserTakeoverBanner$lambda$2(HatchIdentityProvider hatchIdentityProvider, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            AuraImageKt.AuraImage(hatchIdentityProvider.rememberDefaultAvatarSource(null, bfm, HatchIdentityProvider.$stable << 3, 1), C11U.A02(BRg.A00, 36.0f), null, null, false, false, null, false, null, bfm, 384, 504);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final Unit BrowserTakeoverBanner$lambda$3(boolean z, Function0 function0, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201b4), null, null, AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1), AuraButtonSize.MEDIUM, null, false, false, z, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, 0, 0, 134200781);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final Unit BrowserTakeoverBanner$lambda$4(boolean z, Function0 function0, BRg bRg, int i, int i2, BFM bfm, int i3) {
        BrowserTakeoverBanner(z, function0, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }
}
