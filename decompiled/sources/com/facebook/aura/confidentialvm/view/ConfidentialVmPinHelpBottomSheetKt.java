package com.facebook.aura.confidentialvm.view;

import X.AKQ;
import X.ARD;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B1V;
import X.B6A;
import X.B81;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C07C;
import X.C0881AGi;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1731ApS;
import X.C1736ApY;
import X.C1809ArT;
import X.C1822Arm;
import X.C1824Aro;
import X.C1D8;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C78N;
import X.C7BY;
import X.C90l;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.base.ComponentsKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ConfidentialVmPinHelpBottomSheetKt {
    public static final float BULLET_SIZE = 3.0f;
    public static final String SETTINGS_PATH_PLACEHOLDER = "%1$s";

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmPinHelpBottomSheetKt$ChangePinContent$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onBack = function0;
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
            ConfidentialVmPinHelpBottomSheetKt.ChangePinContent(this.$onBack, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmPinHelpBottomSheetKt$ChangePinStep$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ApQ $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ApQ apQ, BRg bRg, int i, int i2) {
            super(2);
            this.$text = apQ;
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
            ConfidentialVmPinHelpBottomSheetKt.ChangePinStep(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmPinHelpBottomSheetKt$ChangePinStepsCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C112682 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112682(BRg bRg, int i, int i2) {
            super(2);
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
            ConfidentialVmPinHelpBottomSheetKt.ChangePinStepsCard(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmPinHelpBottomSheetKt$ConfidentialVmPinHelpBottomSheet$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(BRg bRg, int i, int i2) {
            super(2);
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
            ConfidentialVmPinHelpBottomSheetKt.ConfidentialVmPinHelpBottomSheet(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmPinHelpBottomSheetKt$PinHelpContent$1, reason: invalid class name and case insensitive filesystem */
    public final class C112691 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ Function0<Unit> $onSetNewPin;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112691(Function0<Unit> function0, AuraNavigator auraNavigator) {
            super(3);
            this.$onSetNewPin = function0;
            this.$navigator = auraNavigator;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                C1062ATq c1062ATq = C10G.A02;
                float f = AuraDimensKt.SpacingLarge;
                BRg bRgA0C = C3U4.A0C(c1062ATq, f, AuraDimensKt.SpacingSmall, f, f);
                Function0<Unit> function0 = this.$onSetNewPin;
                AuraNavigator auraNavigator = this.$navigator;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0C);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function02);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                C90l c90l = C90l.A00;
                G0V<BFM, Integer, Unit> g0v = ComposableSingletons$ConfidentialVmPinHelpBottomSheetKt.lambda$1255943437;
                boolean zA65 = bfm.A65(function0);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new ConfidentialVmPinHelpBottomSheetKt$PinHelpContent$1$1$1$1(function0);
                    bfm.Ai0(objAaT);
                }
                HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, g0v, 0L, (G0U) objAaT, bfm, 390, 5);
                ComponentsKt.m2403AuraVerticalSpacer8Feqmps(AuraDimensKt.SpacingMedium, bfm, 0);
                G0V<BFM, Integer, Unit> g0v2 = ComposableSingletons$ConfidentialVmPinHelpBottomSheetKt.f24lambda$1510425482;
                boolean zA67 = bfm.A67(auraNavigator);
                Object objAaT2 = bfm.AaT();
                if (zA67 || objAaT2 == C78N.A00) {
                    objAaT2 = new ConfidentialVmPinHelpBottomSheetKt$PinHelpContent$1$1$2$1(auraNavigator);
                    bfm.Ai0(objAaT2);
                }
                HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, g0v2, 0L, (G0U) objAaT2, bfm, 390, 5);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmPinHelpBottomSheetKt$PinHelpContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C112702 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onSetNewPin;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112702(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onSetNewPin = function0;
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
            ConfidentialVmPinHelpBottomSheetKt.PinHelpContent(this.$onSetNewPin, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmPinHelpBottomSheetKt$PinHelpRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C112712 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $destructive;
        public final /* synthetic */ int $iconRes;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112712(int i, String str, Function0<Unit> function0, BRg bRg, boolean z, int i2, int i3) {
            super(2);
            this.$iconRes = i;
            this.$title = str;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$destructive = z;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmPinHelpBottomSheetKt.PinHelpRow(this.$iconRes, this.$title, this.$onClick, this.$modifier, this.$destructive, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmPinHelpBottomSheetKt$PinHelpSectionHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C112722 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112722(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
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
            ConfidentialVmPinHelpBottomSheetKt.PinHelpSectionHeader(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PinHelpPage.values().length];
            try {
                AnonymousClass002.A13(PinHelpPage.HELP, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(PinHelpPage.CHANGE_PIN, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void ChangePinContent(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(643820744);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(null, bRg2, null, new AuraBottomSheetHeaderConfig(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12077b), null, AuraBottomSheetHeaderConfig.AccessoryButton.Companion.back(function0), null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null), null, null, null, false, false, false, null, ComposableSingletons$ConfidentialVmPinHelpBottomSheetKt.f23lambda$1365585723, bfm, iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 48, 2037);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(function0, bRg2, i, i2);
        }
    }

    public static final void ChangePinStep(ApQ apQ, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(995611766);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, apQ) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass002.A0W(bfm, C2VU.A05);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            BS0 bs0 = BRg.A00;
            C1b8.A04(bfm, C11U.A02(C3U4.A0C(bs0, 0.0f, AuraDimensKt.SpacingXsmall, AuraDimensKt.SpacingSmall, 0.0f), BULLET_SIZE), C06G.A0C(bfm));
            AuraTextKt.m2640AuraTextVmYn7U0(apQ, c90m.AiP(bs0, 1.0f, true), C06G.A0C(bfm), C06G.A0Z(bfm), null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 32752);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(apQ, bRg2, i, i2);
        }
    }

    public static final void ChangePinStepsCard(BRg bRg, BFM bfm, int i, int i2) {
        int iA02;
        BRg bRg2 = bRg;
        bfm.AgG(1353206774);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120786);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12077a);
            C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
            int iA0B = C7BY.A0B(strA012, "%1$s", 0, false);
            if (iA0B < 0) {
                c1731ApSA0W.A0E(strA012);
                c1731ApSA0W.A0E(InviteCodeScratcherKt.CODE_SEPARATOR);
                C1736ApY c1736ApY = C1736ApY.A01;
                long j = B6A.A07;
                long j2 = C1809ArT.A01;
                iA02 = c1731ApSA0W.A02(new C1824Aro(null, null, null, null, null, c1736ApY, null, null, null, null, null, j, j2, j2, j));
                try {
                    c1731ApSA0W.A0E(strA01);
                } finally {
                }
            } else {
                AnonymousClass005.A0s(c1731ApSA0W, strA012, 0, iA0B);
                C1736ApY c1736ApY2 = C1736ApY.A01;
                long j3 = B6A.A07;
                long j4 = C1809ArT.A01;
                iA02 = c1731ApSA0W.A02(new C1824Aro(null, null, null, null, null, c1736ApY2, null, null, null, null, null, j3, j4, j4, j3));
                try {
                    c1731ApSA0W.A0E(strA01);
                    c1731ApSA0W.A06(iA02);
                    c1731ApSA0W.A0E(strA012.substring(iA0B + 4));
                } finally {
                }
            }
            ApQ apQA04 = c1731ApSA0W.A04();
            BRg bRgA0P = C06G.A0P(bfm, AnonymousClass001.A0R(bRg2), C1D8.A00(AnonymousClass002.A0d(bfm).sectionCornerRadius));
            float f = AuraDimensKt.SpacingSmall;
            float f2 = AuraDimensKt.SpacingMedium;
            BRg bRgA0C = C3U4.A0C(bRgA0P, f, f2, AuraDimensKt.SpacingLarge, f2);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, f2, 0);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120778);
            C0881AGi c0881AGi = C0881AGi.A00;
            ChangePinStep(new ApQ(strA0v, c0881AGi), null, bfm, 0, 2);
            ChangePinStep(apQA04, null, bfm, 0, 2);
            ChangePinStep(AnonymousClass006.A0Z(bfm, c0881AGi, R.string._name_removed__res_0x7f120779), null, bfm, 0, 2);
            ChangePinStep(AnonymousClass006.A0Z(bfm, c0881AGi, R.string._name_removed__res_0x7f120777), null, bfm, 0, 2);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C112682(bRg2, i, i2);
        }
    }

    public static final void PinHelpContent(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(531549625);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(AuraContainer.SecondaryBottomSheet.INSTANCE, bRg2, null, new AuraBottomSheetHeaderConfig(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120781), null, null, null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null), null, null, null, false, false, false, null, B1V.A00(bfm, new C112691(function0, AnonymousClass002.A0b(bfm)), 475827446), bfm, (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6, 48, 2036);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C112702(function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PinHelpRow(int r35, java.lang.String r36, kotlin.jvm.functions.Function0<kotlin.Unit> r37, X.BRg r38, boolean r39, X.BFM r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.view.ConfidentialVmPinHelpBottomSheetKt.PinHelpRow(int, java.lang.String, kotlin.jvm.functions.Function0, X.BRg, boolean, X.BFM, int, int):void");
    }

    public static final void PinHelpSectionHeader(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-148419285);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).footnoteMedium;
            long jA08 = C06G.A08(bfm);
            BRg bRgA0B = C3U4.A0B(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingMedium, AuraDimensKt.SpacingXsmall);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ConfidentialVmPinHelpBottomSheetKt$PinHelpSectionHeader$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, ARD.A01(bRgA0B, (G0U) objAaT, false), jA08, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C112722(str, bRg2, i, i2);
        }
    }

    public static final void ConfidentialVmPinHelpBottomSheet(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(913507339);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = ConfidentialVmPinHelpBottomSheetKt$ConfidentialVmPinHelpBottomSheet$page$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT, objArr);
            boolean zA1Z = AnonymousClass006.A1Z(mutableStateA0N.getValue(), PinHelpPage.HELP);
            boolean zA65 = bfm.A65(mutableStateA0N);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == obj) {
                objAaT2 = new ConfidentialVmPinHelpBottomSheetKt$ConfidentialVmPinHelpBottomSheet$1$1(mutableStateA0N);
                bfm.Ai0(objAaT2);
            }
            B81.A00(zA1Z, (Function0) objAaT2, bfm, 0, 0);
            Unit unit = Unit.INSTANCE;
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = ConfidentialVmPinHelpBottomSheetKt$ConfidentialVmPinHelpBottomSheet$2$1.INSTANCE;
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A17(bfm, objAaT3, unit);
            int iOrdinal = ((PinHelpPage) mutableStateA0N.getValue()).ordinal();
            if (iOrdinal == 0) {
                boolean zA1Y = AnonymousClass001.A1Y(mutableStateA0N, bfm, 1707236189);
                Object objAaT4 = bfm.AaT();
                if (zA1Y || objAaT4 == obj) {
                    objAaT4 = new ConfidentialVmPinHelpBottomSheetKt$ConfidentialVmPinHelpBottomSheet$3$1(mutableStateA0N);
                    bfm.Ai0(objAaT4);
                }
                PinHelpContent((Function0) objAaT4, bRg, bfm, (iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
            } else {
                if (iOrdinal != 1) {
                    throw AnonymousClass005.A0k(bfm, 1707234881);
                }
                boolean zA1Y2 = AnonymousClass001.A1Y(mutableStateA0N, bfm, 1707244022);
                Object objAaT5 = bfm.AaT();
                if (zA1Y2 || objAaT5 == obj) {
                    objAaT5 = new ConfidentialVmPinHelpBottomSheetKt$ConfidentialVmPinHelpBottomSheet$4$1(mutableStateA0N);
                    bfm.Ai0(objAaT5);
                }
                ChangePinContent((Function0) objAaT5, bRg, bfm, (iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(bRg, i, i2);
        }
    }
}
