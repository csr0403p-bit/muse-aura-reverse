package com.facebook.aura.confidentialvm.view.setup;

import X.AKQ;
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
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1DG;
import X.C1YL;
import X.C3U4;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.confidentialvm.model.ConfidentialVmEnrollmentChoiceViewModel;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmValueProps;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderStateMachine;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.navigation.key.RegisterPinEntryPoint;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ConfidentialVmEncryptionOnboardingScreenKt {

    /* renamed from: com.facebook.aura.confidentialvm.view.setup.ConfidentialVmEncryptionOnboardingScreenKt$ConfidentialVmEncryptionOfferPage$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ String $availabilityNotice;
        public final /* synthetic */ String $errorMessage;
        public final /* synthetic */ String $learnMoreUrl;
        public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $legalText;
        public final /* synthetic */ Function0<Unit> $onLearnMoreClick;
        public final /* synthetic */ Function0<Unit> $onSkipClick;
        public final /* synthetic */ Function0<Unit> $onTryClick;
        public final /* synthetic */ String $title;
        public final /* synthetic */ ConfidentialVmValueProps $valueProps;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(ConfidentialVmValueProps confidentialVmValueProps, String str, String str2, String str3, String str4, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
            super(4);
            this.$valueProps = confidentialVmValueProps;
            this.$title = str;
            this.$learnMoreUrl = str2;
            this.$errorMessage = str3;
            this.$availabilityNotice = str4;
            this.$legalText = g0w;
            this.$onTryClick = function0;
            this.$onSkipClick = function02;
            this.$onLearnMoreClick = function03;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m480invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m480invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS, 128), bfm, i)) {
                ConfidentialVmEncryptionOnboardingScreenKt.EncryptionContent(this.$valueProps, this.$title, this.$learnMoreUrl, this.$errorMessage, this.$availabilityNotice, this.$legalText, this.$onTryClick, this.$onSkipClick, this.$onLearnMoreClick, null, bfm, 0, 512);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.setup.ConfidentialVmEncryptionOnboardingScreenKt$ConfidentialVmEncryptionOfferPage$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $availabilityNotice;
        public final /* synthetic */ String $errorMessage;
        public final /* synthetic */ String $learnMoreUrl;
        public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $legalText;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onLearnMoreClick;
        public final /* synthetic */ Function0<Unit> $onSkipClick;
        public final /* synthetic */ Function0<Unit> $onTryClick;
        public final /* synthetic */ String $title;
        public final /* synthetic */ ConfidentialVmValueProps $valueProps;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(String str, String str2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, BRg bRg, String str3, String str4, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, ConfidentialVmValueProps confidentialVmValueProps, int i, int i2, int i3) {
            super(2);
            this.$title = str;
            this.$learnMoreUrl = str2;
            this.$onBack = function0;
            this.$onTryClick = function02;
            this.$onSkipClick = function03;
            this.$onLearnMoreClick = function04;
            this.$modifier = bRg;
            this.$errorMessage = str3;
            this.$availabilityNotice = str4;
            this.$legalText = g0w;
            this.$valueProps = confidentialVmValueProps;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmEncryptionOnboardingScreenKt.ConfidentialVmEncryptionOfferPage(this.$title, this.$learnMoreUrl, this.$onBack, this.$onTryClick, this.$onSkipClick, this.$onLearnMoreClick, this.$modifier, this.$errorMessage, this.$availabilityNotice, this.$legalText, this.$valueProps, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.setup.ConfidentialVmEncryptionOnboardingScreenKt$ConfidentialVmEncryptionOnboardingScreen$14, reason: invalid class name */
    public final class AnonymousClass14 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ RegisterPinEntryPoint $entryPoint;
        public final /* synthetic */ String $learnMoreUrl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConfidentialVmEnrollmentChoiceViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass14(RegisterPinEntryPoint registerPinEntryPoint, String str, BRg bRg, ConfidentialVmEnrollmentChoiceViewModel confidentialVmEnrollmentChoiceViewModel, int i, int i2) {
            super(2);
            this.$entryPoint = registerPinEntryPoint;
            this.$learnMoreUrl = str;
            this.$modifier = bRg;
            this.$viewModel = confidentialVmEnrollmentChoiceViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmEncryptionOnboardingScreenKt.ConfidentialVmEncryptionOnboardingScreen(this.$entryPoint, this.$learnMoreUrl, this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.setup.ConfidentialVmEncryptionOnboardingScreenKt$ConfidentialVmEncryptionOnboardingScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ RegisterPinEntryPoint $entryPoint;
        public final /* synthetic */ String $learnMoreUrl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConfidentialVmEnrollmentChoiceViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(RegisterPinEntryPoint registerPinEntryPoint, String str, BRg bRg, ConfidentialVmEnrollmentChoiceViewModel confidentialVmEnrollmentChoiceViewModel, int i, int i2) {
            super(2);
            this.$entryPoint = registerPinEntryPoint;
            this.$learnMoreUrl = str;
            this.$modifier = bRg;
            this.$viewModel = confidentialVmEnrollmentChoiceViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmEncryptionOnboardingScreenKt.ConfidentialVmEncryptionOnboardingScreen(this.$entryPoint, this.$learnMoreUrl, this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.setup.ConfidentialVmEncryptionOnboardingScreenKt$ConfidentialVmEncryptionOnboardingScreen$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ RegisterPinEntryPoint $entryPoint;
        public final /* synthetic */ String $learnMoreUrl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConfidentialVmEnrollmentChoiceViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(RegisterPinEntryPoint registerPinEntryPoint, String str, BRg bRg, ConfidentialVmEnrollmentChoiceViewModel confidentialVmEnrollmentChoiceViewModel, int i, int i2) {
            super(2);
            this.$entryPoint = registerPinEntryPoint;
            this.$learnMoreUrl = str;
            this.$modifier = bRg;
            this.$viewModel = confidentialVmEnrollmentChoiceViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmEncryptionOnboardingScreenKt.ConfidentialVmEncryptionOnboardingScreen(this.$entryPoint, this.$learnMoreUrl, this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.setup.ConfidentialVmEncryptionOnboardingScreenKt$ConfidentialVmEncryptionOnboardingScreen$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ RegisterPinEntryPoint $entryPoint;
        public final /* synthetic */ String $learnMoreUrl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConfidentialVmEnrollmentChoiceViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(RegisterPinEntryPoint registerPinEntryPoint, String str, BRg bRg, ConfidentialVmEnrollmentChoiceViewModel confidentialVmEnrollmentChoiceViewModel, int i, int i2) {
            super(2);
            this.$entryPoint = registerPinEntryPoint;
            this.$learnMoreUrl = str;
            this.$modifier = bRg;
            this.$viewModel = confidentialVmEnrollmentChoiceViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmEncryptionOnboardingScreenKt.ConfidentialVmEncryptionOnboardingScreen(this.$entryPoint, this.$learnMoreUrl, this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.setup.ConfidentialVmEncryptionOnboardingScreenKt$EncryptionContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C112912 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $availabilityNotice;
        public final /* synthetic */ String $errorMessage;
        public final /* synthetic */ String $learnMoreUrl;
        public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $legalText;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onLearnMoreClick;
        public final /* synthetic */ Function0<Unit> $onSkipClick;
        public final /* synthetic */ Function0<Unit> $onTryClick;
        public final /* synthetic */ String $title;
        public final /* synthetic */ ConfidentialVmValueProps $valueProps;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C112912(ConfidentialVmValueProps confidentialVmValueProps, String str, String str2, String str3, String str4, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, int i, int i2) {
            super(2);
            this.$valueProps = confidentialVmValueProps;
            this.$title = str;
            this.$learnMoreUrl = str2;
            this.$errorMessage = str3;
            this.$availabilityNotice = str4;
            this.$legalText = g0w;
            this.$onTryClick = function0;
            this.$onSkipClick = function02;
            this.$onLearnMoreClick = function03;
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
            ConfidentialVmEncryptionOnboardingScreenKt.EncryptionContent(this.$valueProps, this.$title, this.$learnMoreUrl, this.$errorMessage, this.$availabilityNotice, this.$legalText, this.$onTryClick, this.$onSkipClick, this.$onLearnMoreClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.setup.ConfidentialVmEncryptionOnboardingScreenKt$EncryptionFooter$2, reason: invalid class name and case insensitive filesystem */
    public final class C112922 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $errorMessage;
        public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $legalText;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onSkipClick;
        public final /* synthetic */ Function0<Unit> $onTryClick;
        public final /* synthetic */ String $skipText;
        public final /* synthetic */ String $tryText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C112922(String str, String str2, String str3, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$tryText = str;
            this.$skipText = str2;
            this.$errorMessage = str3;
            this.$legalText = g0w;
            this.$onTryClick = function0;
            this.$onSkipClick = function02;
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
            ConfidentialVmEncryptionOnboardingScreenKt.EncryptionFooter(this.$tryText, this.$skipText, this.$errorMessage, this.$legalText, this.$onTryClick, this.$onSkipClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ConfidentialVmEncryptionOfferPage(java.lang.String r62, java.lang.String r63, kotlin.jvm.functions.Function0<kotlin.Unit> r64, kotlin.jvm.functions.Function0<kotlin.Unit> r65, kotlin.jvm.functions.Function0<kotlin.Unit> r66, kotlin.jvm.functions.Function0<kotlin.Unit> r67, X.BRg r68, java.lang.String r69, java.lang.String r70, X.G0W<? super X.BRg, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r71, com.facebook.aura.confidentialvm.repository.ConfidentialVmValueProps r72, X.BFM r73, int r74, int r75, int r76) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.view.setup.ConfidentialVmEncryptionOnboardingScreenKt.ConfidentialVmEncryptionOfferPage(java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, java.lang.String, java.lang.String, X.G0W, com.facebook.aura.confidentialvm.repository.ConfidentialVmValueProps, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ConfidentialVmEncryptionOnboardingScreen(com.facebook.aura.navigation.key.RegisterPinEntryPoint r37, java.lang.String r38, X.BRg r39, com.facebook.aura.confidentialvm.model.ConfidentialVmEnrollmentChoiceViewModel r40, X.BFM r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.view.setup.ConfidentialVmEncryptionOnboardingScreenKt.ConfidentialVmEncryptionOnboardingScreen(com.facebook.aura.navigation.key.RegisterPinEntryPoint, java.lang.String, X.BRg, com.facebook.aura.confidentialvm.model.ConfidentialVmEnrollmentChoiceViewModel, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void EncryptionContent(com.facebook.aura.confidentialvm.repository.ConfidentialVmValueProps r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, X.G0W<? super X.BRg, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r53, kotlin.jvm.functions.Function0<kotlin.Unit> r54, kotlin.jvm.functions.Function0<kotlin.Unit> r55, kotlin.jvm.functions.Function0<kotlin.Unit> r56, X.BRg r57, X.BFM r58, int r59, int r60) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.view.setup.ConfidentialVmEncryptionOnboardingScreenKt.EncryptionContent(com.facebook.aura.confidentialvm.repository.ConfidentialVmValueProps, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.G0W, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    public static final void EncryptionFooter(String str, String str2, String str3, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1570607718);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str3);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0w);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function0);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, function02);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA0d |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0d |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 599187, 599186), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, i4);
            if (g0w == null) {
                bfm.AgE(-870225864);
            } else {
                bfm.AgE(-997903127);
                BS0 bs0 = BRg.A00;
                float f = AuraDimensKt.SpacingLarge;
                AnonymousClass001.A1G(C3U4.A0C(bs0, f, AuraDimensKt.SpacingSmall, f, 0.0f), bfm, g0w, (iA0d >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
            }
            BBI.A0R(bbi, false);
            if (str3 != null) {
                C1822Arm c1822Arm = AnonymousClass006.A0k(bfm, -870078644).caption1Regular;
                long j2 = AnonymousClass002.A0c(bfm).destructiveText;
                BRg bRgA07 = C3U4.A07(c1062ATq, AuraDimensKt.SpacingLarge);
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = ConfidentialVmEncryptionOnboardingScreenKt$EncryptionFooter$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(str3, AnonymousClass001.A0Y(bRgA07, objAaT, false), j2, c1822Arm, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, (iA0d >> 6) & 14, 0, 16304);
            } else {
                bfm.AgE(-869717122);
            }
            BBI.A0R(bbi, false);
            BS0 bs02 = BRg.A00;
            boolean zA1M = AnonymousClass005.A1M(iA0d) | AnonymousClass003.A1B(iA0d) | AnonymousClass003.A1C(iA0d) | AnonymousClass007.A1I(iA0d);
            Object objAaT2 = bfm.AaT();
            if (zA1M || objAaT2 == C78N.A00) {
                objAaT2 = new ConfidentialVmEncryptionOnboardingScreenKt$EncryptionFooter$1$2$1(str, function0, str2, function02);
                bfm.Ai0(objAaT2);
            }
            AuraButtonGroupsKt.m2454AuraButtonGroupFLdL6rA(bs02, null, null, null, null, null, null, false, (G0U) objAaT2, bfm, 6, HatchLinkOrderStateMachine.MAX_EMAIL_LENGTH);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C112922(str, str2, str3, g0w, function0, function02, bRg2, i, i2);
        }
    }
}
