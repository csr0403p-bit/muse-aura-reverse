package com.facebook.aura.settings;

import X.AKH;
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
import X.AxM;
import X.B1V;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C07C;
import X.C1515AkP;
import X.C1DG;
import X.C1er;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.HtJ;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraDimensions;
import com.facebook.aura.vds.compose.theme.AuraDimensionsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchActivationSettingsScreenKt {

    /* renamed from: com.facebook.aura.settings.HatchActivationSettingsScreenKt$ActivationLogOutConfirmationDialog$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $cancelText;
        public final /* synthetic */ String $confirmText;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Function0<Unit> function0, String str2, Function0<Unit> function02) {
            super(2);
            this.$confirmText = str;
            this.$onConfirm = function0;
            this.$cancelText = str2;
            this.$onDismiss = function02;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDismiss, AnonymousClass001.A1R(bfm, this.$cancelText, AnonymousClass001.A1R(bfm, this.$onConfirm, bfm.A65(this.$confirmText))));
                String str = this.$confirmText;
                Function0<Unit> function0 = this.$onConfirm;
                String str2 = this.$cancelText;
                Function0<Unit> function02 = this.$onDismiss;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchActivationSettingsScreenKt$ActivationLogOutConfirmationDialog$1$1$1(str, function0, str2, function02);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchActivationSettingsScreenKt$ActivationLogOutConfirmationDialog$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, Function0<Unit> function02, int i) {
            super(2);
            this.$onDismiss = function0;
            this.$onConfirm = function02;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchActivationSettingsScreenKt.ActivationLogOutConfirmationDialog(this.$onDismiss, this.$onConfirm, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchActivationSettingsScreenKt$ActivationLogOutSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C134712 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ C07C $this_ActivationLogOutSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134712(C07C c07c, Function0<Unit> function0, int i) {
            super(2);
            this.$this_ActivationLogOutSection = c07c;
            this.$onClick = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchActivationSettingsScreenKt.ActivationLogOutSection(this.$this_ActivationLogOutSection, this.$onClick, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchActivationSettingsScreenKt$ActivationSettingsLinksSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C134722 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onDataPrivacySettingsClick;
        public final /* synthetic */ Function0<Unit> $onHelpSupportSettingsClick;
        public final /* synthetic */ Function0<Unit> $onLegalSafetySettingsClick;
        public final /* synthetic */ C07C $this_ActivationSettingsLinksSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134722(C07C c07c, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i) {
            super(2);
            this.$this_ActivationSettingsLinksSection = c07c;
            this.$onHelpSupportSettingsClick = function0;
            this.$onDataPrivacySettingsClick = function02;
            this.$onLegalSafetySettingsClick = function03;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchActivationSettingsScreenKt.ActivationSettingsLinksSection(this.$this_ActivationSettingsLinksSection, this.$onHelpSupportSettingsClick, this.$onDataPrivacySettingsClick, this.$onLegalSafetySettingsClick, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchActivationSettingsScreenKt$HatchActivationSettingsScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C134732 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onClose;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134732(Function0<Unit> function0) {
            super(2);
            this.$onClose = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                AnonymousClass005.A0o(bfm, BOf.A00(bfm, R.drawable.x_wght400_outline_24, 0), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120027), this.$onClose);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchActivationSettingsScreenKt$HatchActivationSettingsScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onDataPrivacySettingsClick;
        public final /* synthetic */ Function0<Unit> $onHelpSupportSettingsClick;
        public final /* synthetic */ Function0<Unit> $onInternalSettingsClick;
        public final /* synthetic */ Function0<Unit> $onLegalSafetySettingsClick;
        public final /* synthetic */ Function0<Unit> $onLogOutClick;
        public final /* synthetic */ G0U<HtJ<? super Unit>, Object> $onValidateSessionAfterAccountCenter;
        public final /* synthetic */ MutableState<Boolean> $showLogoutDialog$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, G0U<? super HtJ<? super Unit>, ? extends Object> g0u, Function0<Unit> function05, MutableState<Boolean> mutableState) {
            super(4);
            this.$onLogOutClick = function0;
            this.$onHelpSupportSettingsClick = function02;
            this.$onDataPrivacySettingsClick = function03;
            this.$onLegalSafetySettingsClick = function04;
            this.$onValidateSessionAfterAccountCenter = g0u;
            this.$onInternalSettingsClick = function05;
            this.$showLogoutDialog$delegate = mutableState;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1933invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1933invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            BRg bRgA0M = AnonymousClass006.A0M(bfm);
            AKH<AuraDimensions> akh = AuraDimensionsKt.LocalAuraDimensions;
            BRg bRgA07 = C3U4.A07(bRgA0M, C06G.A01(bfm, akh));
            Function0<Unit> function0 = this.$onHelpSupportSettingsClick;
            Function0<Unit> function02 = this.$onDataPrivacySettingsClick;
            Function0<Unit> function03 = this.$onLegalSafetySettingsClick;
            G0U<HtJ<? super Unit>, Object> g0u = this.$onValidateSessionAfterAccountCenter;
            Function0<Unit> function04 = this.$onInternalSettingsClick;
            Function0<Unit> function05 = this.$onLogOutClick;
            MutableState<Boolean> mutableState = this.$showLogoutDialog$delegate;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function06 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function06);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C90l c90l = C90l.A00;
            C01N.A08(bfm, bs0, f);
            HatchActivationSettingsScreenKt.ActivationSettingsLinksSection(c90l, function0, function02, function03, bfm, 6);
            if (g0u != null) {
                bfm.AgE(1518967100);
                HatchSettingsScreenKt.AccountsCenterSection(c90l, g0u, bfm, 6);
            } else {
                bfm.AgE(1519040136);
            }
            BBI.A0R(bbi, false);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            boolean zA65 = bfm.A65(contextA0H);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = AnonymousClass001.A0j(bfm, AuraInstallSourceDetector.INSTANCE.isInternalToolingAllowed(contextA0H));
            }
            boolean zA1X = AnonymousClass001.A1X(objAaT);
            if (function04 == null || !zA1X) {
                bfm.AgE(1519779176);
            } else {
                bfm.AgE(1519356336);
                C01N.A02(bfm, akh, bs0);
                boolean zA652 = bfm.A65(function04);
                Object objAaT2 = bfm.AaT();
                if (zA652 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchActivationSettingsScreenKt$HatchActivationSettingsScreen$3$1$1$1(function04);
                    bfm.Ai0(objAaT2);
                }
                HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objAaT2, bfm, 6, 7);
            }
            BBI.A0R(bbi, false);
            if (function05 != null) {
                bfm.AgE(1519818422);
                C01N.A02(bfm, akh, bs0);
                Object objAaT3 = bfm.AaT();
                if (objAaT3 == C78N.A00) {
                    objAaT3 = new HatchActivationSettingsScreenKt$HatchActivationSettingsScreen$3$1$2$1(mutableState);
                    bfm.Ai0(objAaT3);
                }
                HatchActivationSettingsScreenKt.ActivationLogOutSection(c90l, (Function0) objAaT3, bfm, 54);
            } else {
                bfm.AgE(1519958728);
            }
            BBI.A0R(bbi, false);
            C01N.A04(bfm, bbi, bs0, f2, true);
            if (MutableState.A0A((MutableState) this.$showLogoutDialog$delegate)) {
                bfm.AgE(1174236650);
                MutableState<Boolean> mutableState2 = this.$showLogoutDialog$delegate;
                Object objAaT4 = bfm.AaT();
                Object obj = C78N.A00;
                if (objAaT4 == obj) {
                    objAaT4 = new HatchActivationSettingsScreenKt$HatchActivationSettingsScreen$3$2$1(mutableState2);
                    bfm.Ai0(objAaT4);
                }
                Function0 function07 = (Function0) objAaT4;
                boolean zA653 = bfm.A65(this.$onLogOutClick);
                Function0<Unit> function08 = this.$onLogOutClick;
                MutableState<Boolean> mutableState3 = this.$showLogoutDialog$delegate;
                Object objAaT5 = bfm.AaT();
                if (zA653 || objAaT5 == obj) {
                    objAaT5 = new HatchActivationSettingsScreenKt$HatchActivationSettingsScreen$3$3$1(function08, mutableState3);
                    bfm.Ai0(objAaT5);
                }
                HatchActivationSettingsScreenKt.ActivationLogOutConfirmationDialog(function07, (Function0) objAaT5, bfm, 6);
            } else {
                bfm.AgE(1174859378);
            }
            BBI.A0R(bbi, false);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchActivationSettingsScreenKt$HatchActivationSettingsScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClose;
        public final /* synthetic */ Function0<Unit> $onDataPrivacySettingsClick;
        public final /* synthetic */ Function0<Unit> $onHelpSupportSettingsClick;
        public final /* synthetic */ Function0<Unit> $onInternalSettingsClick;
        public final /* synthetic */ Function0<Unit> $onLegalSafetySettingsClick;
        public final /* synthetic */ Function0<Unit> $onLogOutClick;
        public final /* synthetic */ G0U<Boolean, Unit> $onSettingsVisibilityChanged;
        public final /* synthetic */ G0U<HtJ<? super Unit>, Object> $onValidateSessionAfterAccountCenter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, G0U<? super HtJ<? super Unit>, ? extends Object> g0u, BRg bRg, G0U<? super Boolean, Unit> g0u2, Function0<Unit> function06, int i, int i2) {
            super(2);
            this.$onClose = function0;
            this.$onLogOutClick = function02;
            this.$onHelpSupportSettingsClick = function03;
            this.$onDataPrivacySettingsClick = function04;
            this.$onLegalSafetySettingsClick = function05;
            this.$onValidateSessionAfterAccountCenter = g0u;
            this.$modifier = bRg;
            this.$onSettingsVisibilityChanged = g0u2;
            this.$onInternalSettingsClick = function06;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchActivationSettingsScreenKt.HatchActivationSettingsScreen(this.$onClose, this.$onLogOutClick, this.$onHelpSupportSettingsClick, this.$onDataPrivacySettingsClick, this.$onLegalSafetySettingsClick, this.$onValidateSessionAfterAccountCenter, this.$modifier, this.$onSettingsVisibilityChanged, this.$onInternalSettingsClick, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchActivationSettingsScreen(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, G0U<? super HtJ<? super Unit>, ? extends Object> g0u, BRg bRg, G0U<? super Boolean, Unit> g0u2, Function0<Unit> function06, BFM bfm, int i, int i2) {
        Function0<Unit> function07;
        BRg bRg2 = bRg;
        G0U<? super Boolean, Unit> g0u3 = g0u2;
        AnonymousClass002.A1A(function0, 0, function03);
        C7384Etj.A0Y(function05, 4);
        bfm.AgG(221350933);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function03);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, function04);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0X(bfm, function05);
        }
        if ((196608 & i) == 0) {
            iA0T |= AnonymousClass002.A02(AnonymousClass004.A1R(bfm, g0u, 262144, i) ? 1 : 0);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA0T |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0T |= iA0j;
        }
        int i4 = i2 & 128;
        int iA0a = 12582912;
        if (i4 != 0) {
            iA0T |= iA0a;
        } else if ((12582912 & i) == 0) {
            iA0a = AnonymousClass004.A0a(bfm, g0u3);
            iA0T |= iA0a;
        }
        int i5 = i2 & 256;
        int iA0b = 100663296;
        if (i5 != 0) {
            iA0T |= iA0b;
        } else if ((100663296 & i) == 0) {
            iA0b = AnonymousClass004.A0b(bfm, function06);
            iA0T |= iA0b;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1G(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                g0u3 = null;
            }
            function07 = i5 == 0 ? function06 : null;
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            MutableState mutableStateA00 = C1er.A00(bfm, g0u3);
            Unit unit = Unit.INSTANCE;
            boolean zA65 = bfm.A65(mutableStateA00);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == obj) {
                objAaT2 = new HatchActivationSettingsScreenKt$HatchActivationSettingsScreen$1$1(mutableStateA00);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, unit);
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.SecondaryScreen.INSTANCE, bRg2, null, 0L, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f61), null, null, null, false, false, 0, null, B1V.A00(bfm, new C134732(function0), 2127285228), null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new AnonymousClass3(function02, function03, function04, function05, g0u, function07, mutableState), 1053056752), bfm, ((iA0T >> 15) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6, 384, 805306368, 536866796);
        } else {
            bfm.Afo();
            function07 = function06;
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(function0, function02, function03, function04, function05, g0u, bRg2, g0u3, function07, i, i2);
        }
    }

    public static final void logSettingsClick(HatchScreen hatchScreen, HatchComponent hatchComponent) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.TAB_SETTINGS, hatchScreen, hatchComponent, null, null, null);
    }

    public static final void ActivationLogOutConfirmationDialog(Function0<Unit> function0, Function0<Unit> function02, BFM bfm, int i) {
        bfm.AgG(-1630426895);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, function0) : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            AuraAlertDialogKt.AuraAlertDialog((BRg) null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120702), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f35), (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) B1V.A00(bfm, new AnonymousClass1(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120702), function02, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ed6), function0), -1653470912), function0, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, ((iA0T << 18) & 3670016) | 196608, 0, 1945);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, function02, i);
        }
    }

    public static final void ActivationLogOutSection(C07C c07c, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(1466083745);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            boolean zA1O = AnonymousClass001.A1O(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new HatchActivationSettingsScreenKt$ActivationLogOutSection$1$1(function0);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A0p(c07c, bfm, objAaT, iA0d);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C134712(c07c, function0, i);
        }
    }

    public static final void ActivationSettingsLinksSection(C07C c07c, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BFM bfm, int i) {
        bfm.AgG(-1110773259);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function02);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function03);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            boolean zA1C = AnonymousClass003.A1C(iA0d) | AnonymousClass003.A1D(iA0d) | ((iA0d & 7168) == 2048);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = new HatchActivationSettingsScreenKt$ActivationSettingsLinksSection$1$1(function02, function0, function03);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A0p(c07c, bfm, objAaT, iA0d);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C134722(c07c, function0, function02, function03, i);
        }
    }
}
