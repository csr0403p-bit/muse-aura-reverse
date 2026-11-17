package com.facebook.aura.skills.view;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C3U4;
import X.C3UX;
import X.C78N;
import X.C78e;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.DisconnectConfirmationSheetKey;
import com.facebook.aura.navigation.key.HatchSkillDetailScreenKey;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.skills.connect.SkillLookupSheetContentKt;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.viewmodel.HatchConnectorLookupViewModel;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class DisconnectConfirmationSheetKt {

    /* renamed from: com.facebook.aura.skills.view.DisconnectConfirmationSheetKt$DisconnectConfirmationContent$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $learnMoreUrl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchSkillOAuthOrigin $origin;
        public final /* synthetic */ DisconnectConfirmationSheetKey $sheetKey;
        public final /* synthetic */ Skill $skill;
        public final /* synthetic */ HatchSkillDetailScreenKey $sourceSkillKey;
        public final /* synthetic */ HatchConnectorLookupViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Skill skill, HatchConnectorLookupViewModel hatchConnectorLookupViewModel, String str, DisconnectConfirmationSheetKey disconnectConfirmationSheetKey, HatchSkillDetailScreenKey hatchSkillDetailScreenKey, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, BRg bRg, int i, int i2) {
            super(2);
            this.$skill = skill;
            this.$viewModel = hatchConnectorLookupViewModel;
            this.$learnMoreUrl = str;
            this.$sheetKey = disconnectConfirmationSheetKey;
            this.$sourceSkillKey = hatchSkillDetailScreenKey;
            this.$origin = hatchSkillOAuthOrigin;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            DisconnectConfirmationSheetKt.DisconnectConfirmationContent(this.$skill, this.$viewModel, this.$learnMoreUrl, this.$sheetKey, this.$sourceSkillKey, this.$origin, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.skills.view.DisconnectConfirmationSheetKt$DisconnectConfirmationSheet$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<Skill, HatchConnectorLookupViewModel, BFM, Integer, Unit> {
        public final /* synthetic */ String $learnMoreUrl;
        public final /* synthetic */ DisconnectConfirmationSheetKey $navKey;

        public final void invoke(Skill skill, HatchConnectorLookupViewModel hatchConnectorLookupViewModel, BFM bfm, int i) {
            AnonymousClass003.A0u(skill, hatchConnectorLookupViewModel);
            String str = this.$learnMoreUrl;
            DisconnectConfirmationSheetKey disconnectConfirmationSheetKey = this.$navKey;
            DisconnectConfirmationSheetKt.DisconnectConfirmationContent(skill, hatchConnectorLookupViewModel, str, disconnectConfirmationSheetKey, disconnectConfirmationSheetKey.sourceSkillKey, disconnectConfirmationSheetKey.origin, null, bfm, i & 126, 64);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, DisconnectConfirmationSheetKey disconnectConfirmationSheetKey) {
            super(4);
            this.$learnMoreUrl = str;
            this.$navKey = disconnectConfirmationSheetKey;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(Skill skill, HatchConnectorLookupViewModel hatchConnectorLookupViewModel, BFM bfm, Integer num) {
            invoke(skill, hatchConnectorLookupViewModel, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.DisconnectConfirmationSheetKt$DisconnectConfirmationSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $learnMoreUrl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ DisconnectConfirmationSheetKey $navKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DisconnectConfirmationSheetKey disconnectConfirmationSheetKey, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$navKey = disconnectConfirmationSheetKey;
            this.$learnMoreUrl = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            DisconnectConfirmationSheetKt.DisconnectConfirmationSheet(this.$navKey, this.$learnMoreUrl, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void DisconnectConfirmationSheet(DisconnectConfirmationSheetKey disconnectConfirmationSheetKey, String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(disconnectConfirmationSheetKey, str);
        bfm.AgG(1807277194);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, disconnectConfirmationSheetKey) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, str);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            SkillLookupSheetContentKt.SkillLookupSheetContent(disconnectConfirmationSheetKey.identifier, bRg2, zA1b, null, B1V.A00(bfm, new AnonymousClass1(str, disconnectConfirmationSheetKey), 113634380), bfm, ((iA0T >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | RuntimeInternals.IOPRIO_BACKGROUND, 12);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(disconnectConfirmationSheetKey, str, bRg2, i, i2);
        }
    }

    public static final void DisconnectConfirmationContent(Skill skill, HatchConnectorLookupViewModel hatchConnectorLookupViewModel, String str, DisconnectConfirmationSheetKey disconnectConfirmationSheetKey, HatchSkillDetailScreenKey hatchSkillDetailScreenKey, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1972637919);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, skill) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, hatchConnectorLookupViewModel);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, disconnectConfirmationSheetKey);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0X(bfm, hatchSkillDetailScreenKey);
        }
        if ((196608 & i) == 0) {
            iA0T |= AnonymousClass004.A0H(bfm, hatchSkillOAuthOrigin.ordinal());
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA0T |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0T |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT, obj);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = AnonymousClass005.A0R(bfm, false);
            }
            MutableState mutableState = (MutableState) objAaT2;
            String str2 = skill.id;
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = DisconnectConfirmationSheetKt$DisconnectConfirmationContent$1$1.INSTANCE;
                bfm.Ai0(objAaT3);
            }
            C78e.A05(bfm, str2, (G0U) objAaT3);
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            AuraTypography auraTypographyA0f = AnonymousClass002.A0f(bfm);
            String str3 = skill.displayName;
            if (str3.length() == 0) {
                str3 = skill.id;
            }
            bfm.A6v(AndroidCompositionLocals_androidKt.A01);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA0C = C3U4.A0C(bRg2.then(c1062ATq), 24.0f, 0.0f, 24.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            boolean zIsOptimizedSite = skill.isOptimizedSite();
            int i4 = R.string._name_removed__res_0x7f120acf;
            if (zIsOptimizedSite) {
                i4 = R.string._name_removed__res_0x7f120b94;
            }
            String strA0t = AnonymousClass001.A0t(bfm, str3, i4);
            C1822Arm c1822Arm = auraTypographyA0f.title3Emphasized;
            long j = auraColorsA0c.primaryText;
            BS0 bs0 = BRg.A00;
            AuraTextKt.m2639AuraTextUY9GdpU(strA0t, C3U4.A0B(bs0, 0.0f, 16.0f), j, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
            boolean zIsOptimizedSite2 = skill.isOptimizedSite();
            int i5 = R.string._name_removed__res_0x7f120acd;
            if (zIsOptimizedSite2) {
                i5 = R.string._name_removed__res_0x7f120b93;
            }
            String strA0w = AnonymousClass006.A0w(bfm, HatchAppName.value, str3, i5);
            AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ace);
            ApQ apQA04 = AnonymousClass006.A0X(strA0w).A04();
            bfm.AgE(-825526966);
            AuraTextKt.m2640AuraTextVmYn7U0(apQA04, null, auraColorsA0c.primaryText, auraTypographyA0f.subheadlineRegular, null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 32754);
            BBI.A0R(bbi, false);
            C01N.A08(bfm, bs0, 32.0f);
            boolean zIsOptimizedSite3 = skill.isOptimizedSite();
            int i6 = R.string._name_removed__res_0x7f120acc;
            if (zIsOptimizedSite3) {
                i6 = R.string._name_removed__res_0x7f120b92;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i6);
            AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
            AuraLabelButtonStyle auraLabelButtonStyleDestructive = auraButtonStyles.destructive(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
            boolean zA0A = MutableState.A0A(mutableState);
            int i7 = iA0T & 458752;
            boolean zA1V = AnonymousClass005.A1V(bfm, skill, auraNavigatorA0b, hatchSkillDetailScreenKey, AnonymousClass005.A1S(bfm, c3ux, hatchConnectorLookupViewModel, disconnectConfirmationSheetKey) | AnonymousClass002.A1Q(i7, 131072));
            Object objAaT4 = bfm.AaT();
            if (zA1V || objAaT4 == obj) {
                objAaT4 = new DisconnectConfirmationSheetKt$DisconnectConfirmationContent$2$2$1(c3ux, mutableState, hatchConnectorLookupViewModel, disconnectConfirmationSheetKey, hatchSkillOAuthOrigin, skill, auraNavigatorA0b, hatchSkillDetailScreenKey);
                bfm.Ai0(objAaT4);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c1062ATq, auraLabelButtonStyleDestructive, auraButtonSize, null, false, false, false, zA0A, false, null, null, (Function0) objAaT4, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134200261);
            C01N.A08(bfm, bs0, 8.0f);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ac9);
            AuraLabelButtonStyle auraLabelButtonStyleTertiary = auraButtonStyles.tertiary(null, bfm, 48, 1);
            boolean zA1V2 = AnonymousClass002.A1V(bfm, auraNavigatorA0b, bfm.A67(skill), i7 == 131072);
            Object objAaT5 = bfm.AaT();
            if (zA1V2 || objAaT5 == obj) {
                objAaT5 = new DisconnectConfirmationSheetKt$DisconnectConfirmationContent$2$3$1(hatchSkillOAuthOrigin, skill, auraNavigatorA0b);
                bfm.Ai0(objAaT5);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA012, null, c1062ATq, auraLabelButtonStyleTertiary, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT5, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134201285);
            C01N.A04(bfm, bbi, bs0, 16.0f, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(skill, hatchConnectorLookupViewModel, str, disconnectConfirmationSheetKey, hatchSkillDetailScreenKey, hatchSkillOAuthOrigin, bRg2, i, i2);
        }
    }
}
