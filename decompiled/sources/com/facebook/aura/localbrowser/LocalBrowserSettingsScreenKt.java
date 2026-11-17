package com.facebook.aura.localbrowser;

import X.AbstractC2271BQs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.ApQ;
import X.B6A;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BOD;
import X.BQN;
import X.BRg;
import X.C06H;
import X.C0861A6i;
import X.C0881AGi;
import X.C1822Arm;
import X.C1BO;
import X.C1YL;
import X.C2CK;
import X.C5wL;
import X.C78N;
import X.G0U;
import X.G0V;
import X.InterfaceC7353EnQ;
import com.facebook.aura.R;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.localbrowser.LocalBrowserSettingsViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class LocalBrowserSettingsScreenKt {
    public static final void BrowserEnabledSetting(BRg bRg, BFM bfm, final int i, final int i2) {
        final BRg bRg2 = bRg;
        bfm.AgG(-1285108765);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            LocalBrowserSettingsViewModel.Factory factory = new LocalBrowserSettingsViewModel.Factory(AnonymousClass002.A0h(bfm), AnonymousClass002.A0H(bfm));
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            LocalBrowserSettingsViewModel localBrowserSettingsViewModel = (LocalBrowserSettingsViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), null, new C0861A6i(LocalBrowserSettingsViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, localBrowserSettingsViewModel.browserEnabled);
            AuraCardType.Toggle toggle = AuraCardType.Toggle.INSTANCE;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c84);
            C0881AGi c0881AGi = C0881AGi.A00;
            AuraCardContent auraCardContent = new AuraCardContent(new ApQ(strA01, c0881AGi), auraIconAndHeadlineStyle, (BO6) null, (B6A) null, AnonymousClass006.A0Z(bfm, c0881AGi, R.string._name_removed__res_0x7f120c85), (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097132, (C06H) null);
            boolean zA0F = C1BO.A0F(c1boA02);
            boolean zA67 = bfm.A67(localBrowserSettingsViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new LocalBrowserSettingsScreenKt$BrowserEnabledSetting$1$1(localBrowserSettingsViewModel);
                bfm.Ai0(objAaT);
            }
            AuraCardKt.m2484AuraCardjQVUvHA(bRgA0R, auraCardStyleCardStyleForSettings, auraCardContent, toggle, null, null, null, Boolean.valueOf(zA0F), (G0U) ((InterfaceC7353EnQ) objAaT), null, false, false, null, null, 0L, false, null, null, bfm, 3072, 0, 261744);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.localbrowser.LocalBrowserSettingsScreenKt$$ExternalSyntheticLambda2
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    BRg bRg3 = bRg2;
                    int i4 = i;
                    int i5 = i2;
                    AnonymousClass001.A0F(obj2);
                    LocalBrowserSettingsScreenKt.BrowserEnabledSetting(bRg3, (BFM) obj, AnonymousClass011.A00(i4), i5);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void LocalBrowserSettingsScreen(BRg bRg, BFM bfm, final int i, final int i2) {
        final BRg bRg2 = bRg;
        bfm.AgG(-1930994572);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            final AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            AuraContainer.SecondaryScreen secondaryScreen = AuraContainer.SecondaryScreen.INSTANCE;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c9f);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserSettingsScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        auraNavigatorA0b.back();
                        return Unit.INSTANCE;
                    }
                };
                bfm.Ai0(objAaT);
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(secondaryScreen, bRg2, null, 0L, strA01, null, (Function0) objAaT, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, ComposableSingletons$LocalBrowserSettingsScreenKt.f75lambda$266688199, bfm, ((iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6, 0, 805306368, 536870828);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.localbrowser.LocalBrowserSettingsScreenKt$$ExternalSyntheticLambda1
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    BRg bRg3 = bRg2;
                    int i4 = i;
                    int i5 = i2;
                    AnonymousClass001.A0F(obj2);
                    LocalBrowserSettingsScreenKt.LocalBrowserSettingsScreen(bRg3, (BFM) obj, AnonymousClass011.A00(i4), i5);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static /* synthetic */ Unit $r8$lambda$nR4E1_wP5T6_vljZyztAKKuuYYI(AuraNavigator auraNavigator) {
        auraNavigator.back();
        return Unit.INSTANCE;
    }

    public static final Unit BrowserEnabledSetting$lambda$2(BRg bRg, int i, int i2, BFM bfm, int i3) {
        BrowserEnabledSetting(bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit LocalBrowserSettingsScreen$lambda$0$0(AuraNavigator auraNavigator) {
        auraNavigator.back();
        return Unit.INSTANCE;
    }

    public static final Unit LocalBrowserSettingsScreen$lambda$1(BRg bRg, int i, int i2, BFM bfm, int i3) {
        LocalBrowserSettingsScreen(bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }
}
