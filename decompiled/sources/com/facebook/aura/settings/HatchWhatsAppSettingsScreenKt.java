package com.facebook.aura.settings;

import X.AKH;
import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AbstractC8407FdO;
import X.AcQ;
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
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1SA;
import X.C1YL;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.Context;
import android.content.res.Resources;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.login.nativeflow.NativeLoginAccountResolverKt;
import com.facebook.aura.settings.WhatsAppConnectDisclosure;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraDimensions;
import com.facebook.aura.vds.compose.theme.AuraDimensionsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class HatchWhatsAppSettingsScreenKt {

    /* renamed from: com.facebook.aura.settings.HatchWhatsAppSettingsScreenKt$HatchWhatsAppSettingsScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $initialIsLinked;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $needsAttention;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ HatchWhatsAppViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Function0<Unit> function0, boolean z, BRg bRg, boolean z2, HatchWhatsAppViewModel hatchWhatsAppViewModel, int i, int i2) {
            super(2);
            this.$onBack = function0;
            this.$initialIsLinked = z;
            this.$modifier = bRg;
            this.$needsAttention = z2;
            this.$viewModel = hatchWhatsAppViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchWhatsAppSettingsScreenKt.HatchWhatsAppSettingsScreen(this.$onBack, this.$initialIsLinked, this.$modifier, this.$needsAttention, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchWhatsAppSettingsScreenKt$WhatsAppConnectedContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
            HatchWhatsAppSettingsScreenKt.WhatsAppConnectedContent(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) throws XmlPullParserException, Resources.NotFoundException, IOException {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchWhatsAppSettingsScreenKt$WhatsAppConnectedScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $needsAttention;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ HatchWhatsAppUiState $uiState;
        public final /* synthetic */ HatchWhatsAppViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Function0<Unit> function0, HatchWhatsAppViewModel hatchWhatsAppViewModel, HatchWhatsAppUiState hatchWhatsAppUiState, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$onBack = function0;
            this.$viewModel = hatchWhatsAppViewModel;
            this.$uiState = hatchWhatsAppUiState;
            this.$modifier = bRg;
            this.$needsAttention = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchWhatsAppSettingsScreenKt.WhatsAppConnectedScreen(this.$onBack, this.$viewModel, this.$uiState, this.$modifier, this.$needsAttention, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchWhatsAppSettingsScreenKt$WhatsAppConsentScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<String> $agentName$delegate;
        public final /* synthetic */ Function0<Unit> $onUpdateNoteShown;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Function0<Unit> function0, C1BO<String> c1bo) {
            super(3);
            this.$onUpdateNoteShown = function0;
            this.$agentName$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                Function0<Unit> function0 = this.$onUpdateNoteShown;
                BS0 bs0 = BRg.A00;
                float f = AuraDimensKt.SpacingXlarge;
                WhatsAppUpdateNoteKt.WhatsAppUpdateNote(function0, C3U4.A0C(bs0, 0.0f, f, 0.0f, 0.0f), bfm, 0, 0);
                WhatsAppConnectDisclaimerKt.WhatsAppConnectDisclaimer(C1BO.A08(this.$agentName$delegate), C3U4.A0C(bs0, 0.0f, f, 0.0f, 0.0f), bfm, 0, 0);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchWhatsAppSettingsScreenKt$WhatsAppConsentScreen$4, reason: invalid class name and case insensitive filesystem */
    public final class C136074 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchWhatsAppUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136074(HatchWhatsAppUiState hatchWhatsAppUiState) {
            super(3);
            this.$uiState = hatchWhatsAppUiState;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                WhatsAppConnectDisclaimerKt.WhatsAppConnectFooter(R.string._name_removed__res_0x7f121167, this.$uiState.disclosure, C3U4.A03(BRg.A00, AuraDimensKt.SpacingSmall), bfm, 0, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchWhatsAppSettingsScreenKt$WhatsAppConsentScreen$5, reason: invalid class name and case insensitive filesystem */
    public final class C136085 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onUpdateNoteShown;
        public final /* synthetic */ HatchWhatsAppUiState $uiState;
        public final /* synthetic */ HatchWhatsAppViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136085(Function0<Unit> function0, HatchWhatsAppViewModel hatchWhatsAppViewModel, HatchWhatsAppUiState hatchWhatsAppUiState, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$onBack = function0;
            this.$viewModel = hatchWhatsAppViewModel;
            this.$uiState = hatchWhatsAppUiState;
            this.$onUpdateNoteShown = function02;
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
            HatchWhatsAppSettingsScreenKt.WhatsAppConsentScreen(this.$onBack, this.$viewModel, this.$uiState, this.$onUpdateNoteShown, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchWhatsAppSettingsScreenKt$WhatsAppOnboardingContent$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $buttonText;
        public final /* synthetic */ WhatsAppConnectDisclosure $disclosure;
        public final /* synthetic */ boolean $isConnecting;
        public final /* synthetic */ Function0<Unit> $onConnect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, WhatsAppConnectDisclosure whatsAppConnectDisclosure, String str, Function0<Unit> function0) {
            super(2);
            this.$isConnecting = z;
            this.$disclosure = whatsAppConnectDisclosure;
            this.$buttonText = str;
            this.$onConnect = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onConnect, AnonymousClass001.A1R(bfm, this.$buttonText, AnonymousClass001.A1T(bfm, this.$disclosure, bfm.A66(this.$isConnecting))));
                boolean z = this.$isConnecting;
                WhatsAppConnectDisclosure whatsAppConnectDisclosure = this.$disclosure;
                String str = this.$buttonText;
                Function0<Unit> function0 = this.$onConnect;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchWhatsAppSettingsScreenKt$WhatsAppOnboardingContent$1$1$1(z, whatsAppConnectDisclosure, str, function0);
                    bfm.Ai0(objAaT);
                }
                AuraButtonGroupsKt.m2454AuraButtonGroupFLdL6rA(null, null, null, null, null, null, null, true, (G0U) objAaT, bfm, 12582912, 127);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchWhatsAppSettingsScreenKt$WhatsAppOnboardingContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C136092 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<String> $agentName$delegate;
        public final /* synthetic */ WhatsAppConnectDisclosure $disclosure;
        public final /* synthetic */ Function0<Unit> $onUpdateNoteShown;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136092(Function0<Unit> function0, WhatsAppConnectDisclosure whatsAppConnectDisclosure, C1BO<String> c1bo) {
            super(3);
            this.$onUpdateNoteShown = function0;
            this.$disclosure = whatsAppConnectDisclosure;
            this.$agentName$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) throws XmlPullParserException, Resources.NotFoundException, IOException {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                HatchWhatsAppSettingsScreenKt.WhatsAppSheetHeader(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ee2), AnonymousClass001.A0t(bfm, C1BO.A08(this.$agentName$delegate), R.string._name_removed__res_0x7f12116a), null, bfm, 0, 4);
                Function0<Unit> function0 = this.$onUpdateNoteShown;
                BS0 bs0 = BRg.A00;
                float f = AuraDimensKt.SpacingXlarge;
                WhatsAppUpdateNoteKt.WhatsAppUpdateNote(function0, C3U4.A0C(bs0, 0.0f, f, 0.0f, 0.0f), bfm, 0, 0);
                WhatsAppConnectDisclaimerKt.WhatsAppConnectDisclaimer(C1BO.A08(this.$agentName$delegate), C3U4.A0C(bs0, 0.0f, f, 0.0f, 0.0f), bfm, 0, 0);
                WhatsAppConnectDisclaimerKt.WhatsAppConnectFooter(R.string._name_removed__res_0x7f121167, this.$disclosure, C3U4.A0C(bs0, 0.0f, f, 0.0f, 0.0f), bfm, 0, 0);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchWhatsAppSettingsScreenKt$WhatsAppOnboardingContent$3, reason: invalid class name and case insensitive filesystem */
    public final class C136103 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ WhatsAppConnectPhase $connectPhase;
        public final /* synthetic */ WhatsAppConnectDisclosure $disclosure;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onConnect;
        public final /* synthetic */ Function0<Unit> $onUpdateNoteShown;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136103(WhatsAppConnectPhase whatsAppConnectPhase, WhatsAppConnectDisclosure whatsAppConnectDisclosure, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$connectPhase = whatsAppConnectPhase;
            this.$disclosure = whatsAppConnectDisclosure;
            this.$onConnect = function0;
            this.$onUpdateNoteShown = function02;
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
            HatchWhatsAppSettingsScreenKt.WhatsAppOnboardingContent(this.$connectPhase, this.$disclosure, this.$onConnect, this.$onUpdateNoteShown, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchWhatsAppSettingsScreenKt$WhatsAppReplaceContent$1, reason: invalid class name and case insensitive filesystem */
    public final class C136111 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ WhatsAppConnectDisclosure $disclosure;
        public final /* synthetic */ boolean $isSwitching;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onReplace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136111(boolean z, WhatsAppConnectDisclosure whatsAppConnectDisclosure, Function0<Unit> function0, Function0<Unit> function02) {
            super(2);
            this.$isSwitching = z;
            this.$disclosure = whatsAppConnectDisclosure;
            this.$onReplace = function0;
            this.$onCancel = function02;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onCancel, AnonymousClass001.A1R(bfm, this.$onReplace, AnonymousClass001.A1T(bfm, this.$disclosure, bfm.A66(this.$isSwitching))));
                boolean z = this.$isSwitching;
                WhatsAppConnectDisclosure whatsAppConnectDisclosure = this.$disclosure;
                Function0<Unit> function0 = this.$onCancel;
                Function0<Unit> function02 = this.$onReplace;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchWhatsAppSettingsScreenKt$WhatsAppReplaceContent$1$1$1(z, whatsAppConnectDisclosure, function0, function02);
                    bfm.Ai0(objAaT);
                }
                AuraButtonGroupsKt.m2454AuraButtonGroupFLdL6rA(null, null, null, null, null, null, null, true, (G0U) objAaT, bfm, 12582912, 127);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchWhatsAppSettingsScreenKt$WhatsAppReplaceContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C136122 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<String> $agentName$delegate;
        public final /* synthetic */ WhatsAppConnectDisclosure $disclosure;
        public final /* synthetic */ Function0<Unit> $onUpdateNoteShown;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136122(Function0<Unit> function0, WhatsAppConnectDisclosure whatsAppConnectDisclosure, C1BO<String> c1bo) {
            super(3);
            this.$onUpdateNoteShown = function0;
            this.$disclosure = whatsAppConnectDisclosure;
            this.$agentName$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) throws XmlPullParserException, Resources.NotFoundException, IOException {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                HatchWhatsAppSettingsScreenKt.WhatsAppSheetHeader(AnonymousClass001.A0t(bfm, C1BO.A08(this.$agentName$delegate), R.string._name_removed__res_0x7f12116e), AnonymousClass001.A0t(bfm, C1BO.A08(this.$agentName$delegate), R.string._name_removed__res_0x7f12116b), null, bfm, 0, 4);
                BS0 bs0 = BRg.A00;
                C01N.A06(bfm, bs0);
                AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, C1BO.A08(this.$agentName$delegate), R.string._name_removed__res_0x7f12116d), null, C06G.A08(bfm), C06G.A0Z(bfm), null, null, C1YL.A00(), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
                Function0<Unit> function0 = this.$onUpdateNoteShown;
                float f = AuraDimensKt.SpacingXlarge;
                WhatsAppUpdateNoteKt.WhatsAppUpdateNote(function0, C3U4.A0C(bs0, 0.0f, f, 0.0f, 0.0f), bfm, 0, 0);
                WhatsAppConnectDisclaimerKt.WhatsAppConnectDisclaimer(C1BO.A08(this.$agentName$delegate), C3U4.A0C(bs0, 0.0f, f, 0.0f, 0.0f), bfm, 0, 0);
                WhatsAppConnectDisclaimerKt.WhatsAppConnectFooter(R.string._name_removed__res_0x7f12116c, this.$disclosure, C3U4.A0C(bs0, 0.0f, f, 0.0f, 0.0f), bfm, 0, 0);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchWhatsAppSettingsScreenKt$WhatsAppReplaceContent$3, reason: invalid class name and case insensitive filesystem */
    public final class C136133 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ WhatsAppConnectDisclosure $disclosure;
        public final /* synthetic */ boolean $isSwitching;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onReplace;
        public final /* synthetic */ Function0<Unit> $onUpdateNoteShown;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136133(boolean z, WhatsAppConnectDisclosure whatsAppConnectDisclosure, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, int i, int i2) {
            super(2);
            this.$isSwitching = z;
            this.$disclosure = whatsAppConnectDisclosure;
            this.$onReplace = function0;
            this.$onCancel = function02;
            this.$onUpdateNoteShown = function03;
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
            HatchWhatsAppSettingsScreenKt.WhatsAppReplaceContent(this.$isSwitching, this.$disclosure, this.$onReplace, this.$onCancel, this.$onUpdateNoteShown, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchWhatsAppSettingsScreenKt$WhatsAppSheetHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C136142 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136142(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$subtitle = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) throws XmlPullParserException, Resources.NotFoundException, IOException {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
            HatchWhatsAppSettingsScreenKt.WhatsAppSheetHeader(this.$title, this.$subtitle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchWhatsAppSettingsScreenKt$WhatsAppSheetLayout$2, reason: invalid class name and case insensitive filesystem */
    public final class C136152 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $buttons;
        public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C136152(G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$buttons = g0v;
            this.$modifier = bRg;
            this.$content = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchWhatsAppSettingsScreenKt.WhatsAppSheetLayout(this.$buttons, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchWhatsAppSettingsScreen(kotlin.jvm.functions.Function0<kotlin.Unit> r27, boolean r28, X.BRg r29, boolean r30, com.facebook.aura.settings.HatchWhatsAppViewModel r31, X.BFM r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchWhatsAppSettingsScreenKt.HatchWhatsAppSettingsScreen(kotlin.jvm.functions.Function0, boolean, X.BRg, boolean, com.facebook.aura.settings.HatchWhatsAppViewModel, X.BFM, int, int):void");
    }

    public static final void WhatsAppConnectedScreen(Function0<Unit> function0, HatchWhatsAppViewModel hatchWhatsAppViewModel, HatchWhatsAppUiState hatchWhatsAppUiState, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        boolean z2 = z;
        BRg bRg2 = bRg;
        bfm.AgG(-490114385);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(hatchWhatsAppViewModel, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass003.A05(AnonymousClass004.A1Z(hatchWhatsAppUiState, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0r(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = false;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            HatchScreen hatchScreen = HatchScreen.CHANNELS_WHATSAPP;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ee2);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12116f);
            AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
            boolean z3 = hatchWhatsAppUiState.showDisconnectDialog;
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121175);
            String strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121174);
            BRg bRgHatchImpression = HatchImpressionModifierKt.hatchImpression(BRg.A00, HatchOrigin.SETTINGS, HatchSurface.SETTINGS, HatchSubsurface.SETTINGS_GENERAL, HatchScreen.SETTINGS_CHANNELS_WHATSAPP, HatchComponent.SETTINGS_SCREEN_VIEW, null, AnonymousClass006.A10("channel", NativeLoginAccountResolverKt.WHATSAPP_USER_ID), null, 500L, 0.0f, null, null, null);
            boolean zA67 = bfm.A67(contextA0H);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchWhatsAppSettingsScreenKt$WhatsAppConnectedScreen$1$1(contextA0H);
                bfm.Ai0(objAaT);
            }
            Function0 function02 = (Function0) objAaT;
            int i5 = iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean z4 = i5 == 32 || ((iA0T & 64) != 0 && bfm.A67(hatchWhatsAppViewModel));
            Object objAaT2 = bfm.AaT();
            if (z4 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchWhatsAppSettingsScreenKt$WhatsAppConnectedScreen$2$1(hatchWhatsAppViewModel);
                bfm.Ai0(objAaT2);
            }
            Function0 function03 = (Function0) objAaT2;
            boolean z5 = i5 == 32 || ((iA0T & 64) != 0 && bfm.A67(hatchWhatsAppViewModel));
            Object objAaT3 = bfm.AaT();
            if (z5 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchWhatsAppSettingsScreenKt$WhatsAppConnectedScreen$3$1(hatchWhatsAppViewModel);
                bfm.Ai0(objAaT3);
            }
            Function0 function04 = (Function0) objAaT3;
            boolean z6 = i5 == 32 || ((iA0T & 64) != 0 && bfm.A67(hatchWhatsAppViewModel));
            Object objAaT4 = bfm.AaT();
            if (z6 || objAaT4 == C78N.A00) {
                objAaT4 = new HatchWhatsAppSettingsScreenKt$WhatsAppConnectedScreen$4$1(hatchWhatsAppViewModel);
                bfm.Ai0(objAaT4);
            }
            ChannelSettingsScreensKt.m1898ChannelConnectedScreenZSrRDQQ(hatchScreen, strA01, strA012, auraButtonSize, z3, strA013, strA014, function0, function02, function03, function04, (Function0) objAaT4, ComposableSingletons$HatchWhatsAppSettingsScreenKt.f257lambda$918611209, bRg2, bRgHatchImpression, 0.0f, null, z2, bfm, ((iA0T << 21) & 29360128) | 3078, (iA0T & 7168) | 384 | ((iA0T << 9) & 29360128), 98304);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(function0, hatchWhatsAppViewModel, hatchWhatsAppUiState, bRg2, z2, i, i2);
        }
    }

    public static final void WhatsAppConsentScreen(Function0<Unit> function0, HatchWhatsAppViewModel hatchWhatsAppViewModel, HatchWhatsAppUiState hatchWhatsAppUiState, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        BRg bRg2 = bRg;
        bfm.AgG(620658582);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(hatchWhatsAppViewModel, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass003.A05(AnonymousClass004.A1Z(hatchWhatsAppUiState, bfm, i) ? 1 : 0);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, function02);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0T), bfm, iA0T)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            boolean zA1Z = AnonymousClass002.A1Z(hatchWhatsAppUiState.connectPhase, WhatsAppConnectPhase.CONNECTING);
            C1BO c1boA02 = C2CK.A02(bfm, AnonymousClass007.A0N(bfm).aiIdentityName);
            if (zA1Z) {
                bfm.AgE(206076641);
                i3 = R.string._name_removed__res_0x7f121173;
            } else {
                bfm.AgE(206156869);
                i3 = R.string._name_removed__res_0x7f1206cb;
            }
            String strA0e = AnonymousClass003.A0e(bfm, i3);
            Unit unit = Unit.INSTANCE;
            int i5 = iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean z = i5 == 32 || ((iA0T & 64) != 0 && bfm.A67(hatchWhatsAppViewModel));
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = new HatchWhatsAppSettingsScreenKt$WhatsAppConsentScreen$1$1(hatchWhatsAppViewModel);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, unit);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ee2);
            String strA0t = AnonymousClass001.A0t(bfm, c1boA02.getValue(), R.string._name_removed__res_0x7f12116a);
            boolean z2 = hatchWhatsAppUiState.disclosure instanceof WhatsAppConnectDisclosure.Loading;
            BRg bRgHatchImpression = HatchImpressionModifierKt.hatchImpression(BRg.A00, HatchOrigin.SETTINGS, HatchSurface.SETTINGS, HatchSubsurface.SETTINGS_GENERAL, HatchScreen.SETTINGS_CHANNELS_WHATSAPP, HatchComponent.SETTINGS_SCREEN_VIEW, null, AnonymousClass006.A10("channel", NativeLoginAccountResolverKt.WHATSAPP_USER_ID), null, 500L, 0.0f, null, null, null);
            boolean z3 = i5 == 32 || ((iA0T & 64) != 0 && bfm.A67(hatchWhatsAppViewModel));
            Object objAaT2 = bfm.AaT();
            if (z3 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchWhatsAppSettingsScreenKt$WhatsAppConsentScreen$2$1(hatchWhatsAppViewModel);
                bfm.Ai0(objAaT2);
            }
            ChannelSettingsScreensKt.m1899ChannelConsentScreenWsuR4So(strA01, strA0t, strA0e, zA1Z, function0, (Function0) objAaT2, ComposableSingletons$HatchWhatsAppSettingsScreenKt.f256lambda$1394677024, bRg2, bRgHatchImpression, z2, 0.0f, null, B1V.A00(bfm, new AnonymousClass3(function02, c1boA02), 1044668925), B1V.A00(bfm, new C136074(hatchWhatsAppUiState), -2068065636), bfm, AnonymousClass001.A0C(iA0T << 9, ((iA0T << 12) & 57344) | 1572864), 3456, 3072);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C136085(function0, hatchWhatsAppViewModel, hatchWhatsAppUiState, function02, bRg2, i, i2);
        }
    }

    public static final void WhatsAppOnboardingContent(WhatsAppConnectPhase whatsAppConnectPhase, WhatsAppConnectDisclosure whatsAppConnectDisclosure, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(whatsAppConnectPhase, 0);
        AnonymousClass005.A11(whatsAppConnectDisclosure, function0, function02, 1);
        bfm.AgG(-970654605);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, whatsAppConnectPhase) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass002.A06(AnonymousClass004.A1Y(whatsAppConnectDisclosure, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0W(bfm, function02);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA08 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA08 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA08), bfm, iA08)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            boolean zA1Z = AnonymousClass002.A1Z(whatsAppConnectPhase, WhatsAppConnectPhase.CONNECTING);
            C1BO c1boA02 = C2CK.A02(bfm, AnonymousClass007.A0N(bfm).aiIdentityName);
            if (zA1Z) {
                bfm.AgE(1243943908);
                i3 = R.string._name_removed__res_0x7f121173;
            } else {
                bfm.AgE(1244024136);
                i3 = R.string._name_removed__res_0x7f1206cb;
            }
            WhatsAppSheetLayout(B1V.A00(bfm, new AnonymousClass1(zA1Z, whatsAppConnectDisclosure, AnonymousClass003.A0e(bfm, i3), function0), 1345875167), bRg2, B1V.A00(bfm, new C136092(function02, whatsAppConnectDisclosure, c1boA02), 1931587085), bfm, ((iA08 >> 9) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 390, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C136103(whatsAppConnectPhase, whatsAppConnectDisclosure, function0, function02, bRg2, i, i2);
        }
    }

    public static final void WhatsAppReplaceContent(boolean z, WhatsAppConnectDisclosure whatsAppConnectDisclosure, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A11(whatsAppConnectDisclosure, function0, function02, 1);
        C7384Etj.A0Y(function03, 4);
        bfm.AgG(-82563249);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass002.A06(AnonymousClass004.A1Y(whatsAppConnectDisclosure, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0W(bfm, function02);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0X(bfm, function03);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0n |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0n |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0n), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            WhatsAppSheetLayout(B1V.A00(bfm, new C136111(z, whatsAppConnectDisclosure, function0, function02), -1292934981), bRg2, B1V.A00(bfm, new C136122(function03, whatsAppConnectDisclosure, C2CK.A02(bfm, AnonymousClass007.A0N(bfm).aiIdentityName)), -1988846487), bfm, ((iA0n >> 12) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 390, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C136133(z, whatsAppConnectDisclosure, function0, function02, function03, bRg2, i, i2);
        }
    }

    public static final void WhatsAppSheetHeader(String str, String str2, BRg bRg, BFM bfm, int i, int i2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        BRg bRg2 = bRg;
        bfm.AgG(-1856790495);
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
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0J = AnonymousClass007.A0J(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0J, akqA04, bRgA01, iA0J);
            AVy aVyA00 = AbstractC8407FdO.A00(bfm, R.drawable.ic_channel_whatsapp);
            BS0 bs0 = BRg.A00;
            C1SA.A00(bfm, null, C10G.A07(bs0, 60.0f), null, aVyA00, null, null, 0.0f, AVy.$stable | 432, 120);
            C1822Arm c1822Arm = C01N.A01(bfm, bs0, AuraDimensKt.SpacingMedium).title2Emphasized;
            long jA0C = C06G.A0C(bfm);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchWhatsAppSettingsScreenKt$WhatsAppSheetHeader$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bs0, objAaT, false), jA0C, c1822Arm, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16304);
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C06G.A08(bfm), C01N.A01(bfm, bs0, AuraDimensKt.SpacingSmall).subheadlineRegular, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, (iA0d >> 3) & 14, 0, 16306);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C136142(str, str2, bRg2, i, i2);
        }
    }

    public static final void WhatsAppSheetLayout(G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1177198747);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g0v) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            AKH<AuraDimensions> akh = AuraDimensionsKt.LocalAuraDimensions;
            BRg bRgA0C = C3U4.A0C(bRgThen, C06G.A01(bfm, akh), 0.0f, C06G.A01(bfm, akh), AuraDimensKt.SpacingMedium);
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, C2VU.A02, 0);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v2 = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v2);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v3 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v3, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90l c90l = C90l.A00;
            BRg bRgA0C2 = C3U4.A0C(AnonymousClass007.A0H(bfm, AnonymousClass001.A0N(c90l, BRg.A00, false), c1062ATq), 0.0f, AuraDimensKt.SpacingMedium, 0.0f, AuraDimensKt.SpacingSmall);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, C2VU.A00, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0C2);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v2);
            BPg.A02(bfm, akqA042, g0v3);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AnonymousClass001.A1G(c90l, bfm, g0w, (((((iA0T << 3) & 7168) | 384) >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6);
            BBI.A0R(bbi, true);
            AnonymousClass004.A1C(bbi, bfm, g0v, iA0T, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C136152(g0v, bRg2, g0w, i, i2);
        }
    }

    public static final void WhatsAppConnectedContent(BFM bfm, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        bfm.AgG(747622694);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            InterfaceC1380AiA interfaceC1380AiAA0J = AnonymousClass007.A0J(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, c1062ATq);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0J, akqA04, bRgA01, iA0J);
            float f = AuraDimensKt.SpacingMedium;
            C01N.A08(bfm, bs0, f);
            C1SA.A00(bfm, null, C10G.A07(bs0, 60.0f), null, AbstractC8407FdO.A00(bfm, R.drawable.ic_channel_whatsapp), null, null, 0.0f, AVy.$stable | 432, 120);
            C01N.A08(bfm, bs0, f);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ee2), null, C06G.A0C(bfm), C06G.A0U(bfm), null, null, C1YL.A00(), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            C01N.A05(bfm, bs0);
            HatchTelegramSettingsScreenKt.StatusIndicator(true, null, false, bfm, 6, 6);
            C01N.A04(bfm, bbi, bs0, f, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(i);
        }
    }
}
