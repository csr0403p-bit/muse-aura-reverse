package com.facebook.aura.skills.view;

import X.AKQ;
import X.ARD;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0A8;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1DG;
import X.C1YY;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.header.view.HatchBackClickAnalytics;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.permissions.defaults.ConfidentialVmSettingsJsonKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.skills.repo.RecipientPermission;
import com.facebook.aura.skills.viewmodel.RecipientPermissionsUiState;
import com.facebook.aura.skills.viewmodel.RecipientPermissionsViewModel;
import com.facebook.aura.ui.HatchScreenErrorStateKt;
import com.facebook.aura.ui.HatchScreenLoadingStateKt;
import com.facebook.aura.vds.compose.button.AuraButtonAccessibility;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class HatchRecipientPermissionsScreenKt {

    /* renamed from: com.facebook.aura.skills.view.HatchRecipientPermissionsScreenKt$HatchRecipientPermissionsScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ String $connectorName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2) {
            super(4);
            this.$connectorId = str;
            this.$connectorName = str2;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m2159invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m2159invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            String str = this.$connectorId;
            RecipientPermissionsViewModel.Factory factory = new RecipientPermissionsViewModel.Factory(AnonymousClass002.A0h(bfm), this.$connectorId);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            RecipientPermissionsViewModel recipientPermissionsViewModel = (RecipientPermissionsViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), RecipientPermissionsViewModel.class, str);
            C1BO c1boA02 = C2CK.A02(bfm, recipientPermissionsViewModel.uiState);
            BRg bRgA07 = C3U4.A07(C10G.A01, C3cG.A00(bfm, AuraTheme.INSTANCE));
            boolean zA1S = AnonymousClass004.A1S(bfm, this.$connectorName, recipientPermissionsViewModel, AnonymousClass001.A1R(bfm, this.$connectorId, bfm.A65(c1boA02) | AnonymousClass003.A1B(iA04))) | AnonymousClass006.A1V(iA04);
            String str2 = this.$connectorId;
            String str3 = this.$connectorName;
            Object objAaT = bfm.AaT();
            if (zA1S || objAaT == C78N.A00) {
                objAaT = new HatchRecipientPermissionsScreenKt$HatchRecipientPermissionsScreen$2$1$1(f, c1boA02, str2, str3, recipientPermissionsViewModel, f2);
                bfm.Ai0(objAaT);
            }
            C1YY.A01(null, null, null, null, null, bfm, null, bRgA07, (G0U) objAaT, 0, 510, false, false);
        }

        public static final /* synthetic */ RecipientPermissionsUiState access$invoke_i1RSzL4$lambda$0(C1BO c1bo) {
            return (RecipientPermissionsUiState) c1bo.getValue();
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchRecipientPermissionsScreenKt$HatchRecipientPermissionsScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ String $connectorName;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$connectorId = str;
            this.$connectorName = str2;
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
            HatchRecipientPermissionsScreenKt.HatchRecipientPermissionsScreen(this.$connectorId, this.$connectorName, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchRecipientPermissionsScreenKt$RecipientPermissionRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C138552 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ String $connectorName;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ boolean $isRevoking;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRevoke;
        public final /* synthetic */ RecipientPermission $permission;
        public final /* synthetic */ boolean $revokeFailed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138552(RecipientPermission recipientPermission, String str, String str2, boolean z, boolean z2, boolean z3, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$permission = recipientPermission;
            this.$connectorId = str;
            this.$connectorName = str2;
            this.$enabled = z;
            this.$isRevoking = z2;
            this.$revokeFailed = z3;
            this.$onRevoke = function0;
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
            HatchRecipientPermissionsScreenKt.RecipientPermissionRow(this.$permission, this.$connectorId, this.$connectorName, this.$enabled, this.$isRevoking, this.$revokeFailed, this.$onRevoke, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchRecipientPermissionsScreenKt$RecipientPermissionsStatus$2, reason: invalid class name and case insensitive filesystem */
    public final class C138562 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isEmpty;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ boolean $loadFailed;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138562(boolean z, boolean z2, boolean z3, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$isLoading = z;
            this.$loadFailed = z2;
            this.$isEmpty = z3;
            this.$onRetry = function0;
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
            HatchRecipientPermissionsScreenKt.RecipientPermissionsStatus(this.$isLoading, this.$loadFailed, this.$isEmpty, this.$onRetry, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchRecipientPermissionsScreen(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(str, str2);
        bfm.AgG(-419173846);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            HatchBackClickAnalytics hatchBackClickAnalytics = new HatchBackClickAnalytics(HatchSurface.SETTINGS, HatchScreen.PERMISSIONS);
            AuraContainer.SecondaryScreen secondaryScreen = AuraContainer.SecondaryScreen.INSTANCE;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fa8);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchRecipientPermissionsScreenKt$HatchRecipientPermissionsScreen$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(secondaryScreen, bRg2, null, 0L, strA01, str2, (Function0) objAaT, null, zA1b, zA1b, zA1b ? 1 : 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, zA1b ? 1 : 0, null, null, hatchBackClickAnalytics, zA1b, B1V.A00(bfm, new AnonymousClass2(str, str2), -32632891), bfm, AnonymousClass001.A08(iA0d << 12, ((iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6), zA1b ? 1 : 0, (HatchBackClickAnalytics.$stable << 21) | 805306368, 402653068);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, str2, bRg2, i, i2);
        }
    }

    public static final void RecipientPermissionRow(RecipientPermission recipientPermission, String str, String str2, boolean z, boolean z2, boolean z3, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-50332483);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, recipientPermission) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, str2);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0r(bfm, z2);
        }
        if ((196608 & i) == 0) {
            iA0T |= AnonymousClass004.A0s(bfm, z3);
        }
        if ((1572864 & i) == 0) {
            iA0T |= AnonymousClass004.A0Z(bfm, function0);
        }
        int i3 = i2 & 128;
        int iA0k = 12582912;
        if (i3 != 0) {
            iA0T |= iA0k;
        } else if ((12582912 & i) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRg2);
            iA0T |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1D(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0C = C3U4.A0C(C10G.A09(AnonymousClass001.A0R(bRg2), Float.NaN, 64.0f), 16.0f, 0.0f, 8.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(8.0f), bfm, C2VU.A04, 54);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgA0B = C3U4.A0B(c90m.AiP(bs0, 1.0f, true), 0.0f, 14.0f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0B);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            String str3 = recipientPermission.title;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str3, null, 0L, C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16374);
            String str4 = recipientPermission.caption;
            if (str4 == null || str4.equalsIgnoreCase(str) || str4.equalsIgnoreCase(str2)) {
                bfm.AgE(-862128801);
                BBI.A0R(bbi, false);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str4, null, C3cH.A07(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, -862287614).footnoteRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                BBI.A0R(bbi, false);
            }
            String str5 = recipientPermission.modeLabel;
            if (ConfidentialVmSettingsJsonKt.MODE_ALLOW.equals(recipientPermission.mode) || str5 == null) {
                bfm.AgE(-861851041);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str5, null, C3cH.A07(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, -862011776).footnoteRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            }
            BBI.A0R(bbi, false);
            if (z3) {
                bfm.AgE(-861807207);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fa6);
                C1822Arm c1822ArmA0E = C3cH.A0E(bfm, auraTheme);
                long j = auraTheme.getColors(bfm, 6).error;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = HatchRecipientPermissionsScreenKt$RecipientPermissionRow$1$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bs0, objAaT, false), j, c1822ArmA0E, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-861516737);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            if (recipientPermission.revocable) {
                bfm.AgE(102821064);
                long j2 = auraTheme.getColors(bfm, 6).error;
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fa5);
                AuraLabelButtonStyle auraLabelButtonStyleTertiary = AuraButtonStyles.INSTANCE.tertiary(null, bfm, 48, 1);
                AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
                BRg bRgA09 = C10G.A09(bs0, 48.0f, 48.0f);
                AuraButtonAccessibility auraButtonAccessibility = new AuraButtonAccessibility(true, AnonymousClass001.A0t(bfm, recipientPermission.title, R.string._name_removed__res_0x7f120fa7));
                boolean zA64 = bfm.A64(j2);
                Object objAaT2 = bfm.AaT();
                if (zA64 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchRecipientPermissionsScreenKt$RecipientPermissionRow$1$2$1(j2);
                    bfm.Ai0(objAaT2);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA012, null, bRgA09, auraLabelButtonStyleTertiary, auraButtonSize, null, false, false, z, z2, false, null, null, function0, null, null, (Function0) objAaT2, null, null, null, null, auraButtonAccessibility, false, 0, false, 0, bfm, ((iA0T << 18) & 1879048192) | 199680, ((iA0T >> 12) & 14) | (57344 & (iA0T >> 6)), AuraButtonAccessibility.$stable << 6, 129874373);
            } else {
                bfm.AgE(103590825);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138552(recipientPermission, str, str2, z, z2, z3, function0, bRg2, i, i2);
        }
    }

    public static final void RecipientPermissionsStatus(boolean z, boolean z2, boolean z3, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1262564052);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0o(bfm, z2);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0p(bfm, z3);
        }
        if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0n |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 9363, 9362), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            if (z) {
                bfm.AgE(-1243803994);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fa3);
                BRg bRgA04 = C10G.A04(c1062ATq, 96.0f);
                boolean zA65 = bfm.A65(strA01);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchRecipientPermissionsScreenKt$RecipientPermissionsStatus$1$1$1(strA01);
                    bfm.Ai0(objAaT);
                }
                HatchScreenLoadingStateKt.HatchScreenLoadingState(AnonymousClass001.A0Y(bRgA04, objAaT, false), bfm, 0, 0);
            } else if (z2) {
                bfm.AgE(1622457694);
                HatchScreenErrorStateKt.HatchScreenErrorState(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fa2), function0, c1062ATq, HatchSurface.SETTINGS, HatchSubsurface.PERMISSIONS, HatchScreen.PERMISSIONS, null, bfm, ((iA0n >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 224640, 64);
            } else if (z3) {
                bfm.AgE(-1243063435);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fa1);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                C1822Arm c1822ArmA0E = C3cH.A0E(bfm, auraTheme);
                long jA07 = C3cH.A07(bfm, auraTheme);
                BRg bRgA0B = C3U4.A0B(BRg.A00, 16.0f, 16.0f);
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == C78N.A00) {
                    objAaT2 = HatchRecipientPermissionsScreenKt$RecipientPermissionsStatus$1$2$1.INSTANCE;
                    bfm.Ai0(objAaT2);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA012, ARD.A01(bRgA0B, (G0U) objAaT2, false), jA07, c1822ArmA0E, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            } else {
                bfm.AgE(-1242666356);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138562(z, z2, z3, function0, bRg2, i, i2);
        }
    }

    public static final void logRecipientPermissionRevokeClick(RecipientPermission recipientPermission, String str) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.PERMISSIONS, HatchScreen.PERMISSIONS, HatchComponent.PERMISSION_ROW, recipientPermission.actionKey, C3cH.A0m(HatchMetadataKey.PROVIDER.getValue(), str, C3cG.A0r(HatchMetadataKey.PERMISSION_MODE.getValue(), "revoke"), C3cG.A0r(HatchMetadataKey.PERMISSION_KEY.getValue(), "recipients")), null);
    }
}
