package com.facebook.aura.vmdisabled.content;

import X.AKH;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
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
import X.BOD;
import X.BOf;
import X.BPg;
import X.BQN;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C07C;
import X.C0861A6i;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1YL;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import com.facebook.aura.vmdisabled.VmReconnectUiState;
import com.facebook.aura.vmdisabled.VmReconnectViewModel;
import com.facebook.aura.vmdisabled.VmRecoveryFlowType;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class VmRecoverySheetsKt {

    /* renamed from: com.facebook.aura.vmdisabled.content.VmRecoverySheetsKt$CloseWithoutContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            VmRecoverySheetsKt.CloseWithoutContent(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.vmdisabled.content.VmRecoverySheetsKt$VmLearnMoreSheetRoute$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $flowType;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$flowType = str;
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
            VmRecoverySheetsKt.VmLearnMoreSheetRoute(this.$flowType, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vmdisabled.content.VmRecoverySheetsKt$VmReconnectButtons$2, reason: invalid class name and case insensitive filesystem */
    public final class C143442 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isReconnecting;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onReconnect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143442(boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$isReconnecting = z;
            this.$onReconnect = function0;
            this.$onCancel = function02;
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
            VmRecoverySheetsKt.VmReconnectButtons(this.$isReconnecting, this.$onReconnect, this.$onCancel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vmdisabled.content.VmRecoverySheetsKt$VmReconnectReviewContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C143452 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143452(BRg bRg, int i, int i2) {
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
            VmRecoverySheetsKt.VmReconnectReviewContent(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vmdisabled.content.VmRecoverySheetsKt$VmReconnectSheetRoute$1, reason: invalid class name and case insensitive filesystem */
    public final class C143461 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $flowType;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $preview;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143461(String str, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$flowType = str;
            this.$preview = z;
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
            VmRecoverySheetsKt.VmReconnectSheetRoute(this.$flowType, this.$preview, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vmdisabled.content.VmRecoverySheetsKt$VmRecoveryLearnMoreSheet$1, reason: invalid class name and case insensitive filesystem */
    public final class C143471 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ VmRecoveryFlowType $flowType;
        public final /* synthetic */ boolean $isHedgedWarning;
        public final /* synthetic */ AuraNavigator $navigator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143471(VmRecoveryFlowType vmRecoveryFlowType, boolean z, AuraNavigator auraNavigator) {
            super(3);
            this.$flowType = vmRecoveryFlowType;
            this.$isHedgedWarning = z;
            this.$navigator = auraNavigator;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                C1062ATq c1062ATq = C10G.A02;
                float f = AuraDimensKt.SpacingLarge;
                BRg bRgA0C = C3U4.A0C(c1062ATq, f, 0.0f, f, AuraDimensKt.SpacingLargePlusMicro);
                C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingMedium);
                VmRecoveryFlowType vmRecoveryFlowType = this.$flowType;
                boolean z = this.$isHedgedWarning;
                AuraNavigator auraNavigator = this.$navigator;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, C2VU.A02, 0);
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
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
                String strA0t = AnonymousClass001.A0t(bfm, HatchAppName.value, VmRecoveryFlowSpecKt.getLearnMoreWhyTitleRes(vmRecoveryFlowType));
                String strA0t2 = AnonymousClass001.A0t(bfm, HatchAppName.value, VmRecoveryFlowSpecKt.getLearnMoreWhyBodyRes(vmRecoveryFlowType));
                AKH<AuraTypography> akh = AuraTypographyKt.LocalAuraTypography;
                VmRecoverySheetsKt.m3146VmSheetSectionFJfuzF0(strA0t, strA0t2, AnonymousClass001.A0g(bfm, akh).title3Medium, null, 28.0f, bfm, RuntimeInternals.IOPRIO_BACKGROUND, 8);
                VmRecoverySheetsKt.m3146VmSheetSectionFJfuzF0(AbstractC2271BQs.A01(bfm, VmRecoveryFlowSpecKt.getLearnMoreCompareTitleRes(vmRecoveryFlowType)), AbstractC2271BQs.A01(bfm, VmRecoveryFlowSpecKt.getLearnMoreCompareBodyRes(vmRecoveryFlowType)), AnonymousClass001.A0g(bfm, akh).bodyMedium, null, 8.0f, bfm, RuntimeInternals.IOPRIO_BACKGROUND, 8);
                if (!z) {
                    bfm.AgE(577794577);
                    String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121124);
                    AuraLabelButtonStyle auraLabelButtonStyleA0h = AnonymousClass006.A0h(bfm);
                    AuraButtonSize auraButtonSize = AuraButtonSize.MEDIUM;
                    BRg bRgA0C2 = C3U4.A0C(c1062ATq, 0.0f, AuraDimensKt.SpacingSmall, 0.0f, 0.0f);
                    boolean zA67 = bfm.A67(auraNavigator);
                    Object objAaT = bfm.AaT();
                    if (zA67 || objAaT == C78N.A00) {
                        objAaT = new VmRecoverySheetsKt$VmRecoveryLearnMoreSheet$1$1$1$1(auraNavigator);
                        bfm.Ai0(objAaT);
                    }
                    AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, bRgA0C2, auraLabelButtonStyleA0h, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, 0, 0, 134201285);
                } else {
                    bfm.AgE(578091774);
                }
                BBI.A0R(bbi, false);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.vmdisabled.content.VmRecoverySheetsKt$VmRecoveryLearnMoreSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C143482 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ VmRecoveryFlowType $flowType;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143482(VmRecoveryFlowType vmRecoveryFlowType, BRg bRg, int i, int i2) {
            super(2);
            this.$flowType = vmRecoveryFlowType;
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
            VmRecoverySheetsKt.VmRecoveryLearnMoreSheet(this.$flowType, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vmdisabled.content.VmRecoverySheetsKt$VmRecoveryReconnectSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C143492 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isReconnecting;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ boolean $preview;
        public final /* synthetic */ VmReconnectViewModel $reconnectViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143492(boolean z, boolean z2, AuraNavigator auraNavigator, VmReconnectViewModel vmReconnectViewModel) {
            super(2);
            this.$isReconnecting = z;
            this.$preview = z2;
            this.$navigator = auraNavigator;
            this.$reconnectViewModel = vmReconnectViewModel;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean z = this.$isReconnecting;
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$reconnectViewModel, AnonymousClass001.A1T(bfm, this.$navigator, bfm.A66(this.$preview)));
                boolean z2 = this.$preview;
                AuraNavigator auraNavigator = this.$navigator;
                VmReconnectViewModel vmReconnectViewModel = this.$reconnectViewModel;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new VmRecoverySheetsKt$VmRecoveryReconnectSheet$2$1$1(z2, auraNavigator, vmReconnectViewModel);
                    bfm.Ai0(objAaT);
                }
                Function0 function0 = (Function0) objAaT;
                AuraNavigator auraNavigator2 = this.$navigator;
                boolean zA67 = bfm.A67(auraNavigator2);
                Object objAaT2 = bfm.AaT();
                if (zA67 || objAaT2 == C78N.A00) {
                    objAaT2 = new VmRecoverySheetsKt$VmRecoveryReconnectSheet$2$2$1(auraNavigator2);
                    bfm.Ai0(objAaT2);
                }
                VmRecoverySheetsKt.VmReconnectButtons(z, function0, (Function0) objAaT2, null, bfm, 0, 8);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.vmdisabled.content.VmRecoverySheetsKt$VmRecoveryReconnectSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $preview;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$preview = z;
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
            VmRecoverySheetsKt.VmRecoveryReconnectSheet(this.$preview, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vmdisabled.content.VmRecoverySheetsKt$VmReviewRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C143502 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $iconRes;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ int $subtitleRes;
        public final /* synthetic */ int $titleRes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143502(int i, int i2, int i3, BRg bRg, int i4, int i5) {
            super(2);
            this.$iconRes = i;
            this.$titleRes = i2;
            this.$subtitleRes = i3;
            this.$modifier = bRg;
            this.$$changed = i4;
            this.$$default = i5;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VmRecoverySheetsKt.VmReviewRow(this.$iconRes, this.$titleRes, this.$subtitleRes, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void VmLearnMoreSheetRoute(String str, BRg bRg, BFM bfm, int i, int i2) {
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1458730308);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            VmRecoveryFlowType vmRecoveryFlowTypeFromWire = VmRecoveryFlowType.Companion.fromWire(str);
            if (vmRecoveryFlowTypeFromWire == null) {
                bfm.AgE(-555356921);
                CloseWithoutContent(bfm, 0);
            } else {
                bfm.AgE(-555319628);
                VmRecoveryLearnMoreSheet(vmRecoveryFlowTypeFromWire, bRg, bfm, iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, bRg, i, i2);
        }
    }

    public static final void VmReconnectSheetRoute(String str, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(527318074);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (VmRecoveryFlowType.Companion.fromWire(str) == null) {
                bfm.AgE(-1657460599);
                CloseWithoutContent(bfm, 0);
            } else {
                bfm.AgE(-1657422562);
                VmRecoveryReconnectSheet(z, bRg2, bfm, (iA0d >> 3) & 126, 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C143461(str, z, bRg2, i, i2);
        }
    }

    public static final void VmReconnectButtons(boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-340107928);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function02);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0n |= 3072;
        } else if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 1171, 1170), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            float f = AuraDimensKt.SpacingLarge;
            BRg bRgA0C = C3U4.A0C(bRgThen, f, 0.0f, f, f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12111b);
            AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
            AuraLabelButtonStyle auraLabelButtonStylePrimary = auraButtonStyles.primary(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.MEDIUM;
            boolean z2 = !z;
            BS0 bs0 = BRg.A00;
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c1062ATq, auraLabelButtonStylePrimary, auraButtonSize, null, false, false, z2, z, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, (iA0n & 14) | ((iA0n << 9) & 57344), 0, 134199749);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingMicroPlusNano);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AnonymousClass001.A0r(bfm), null, c1062ATq, auraButtonStyles.tertiary(null, bfm, 48, 1), auraButtonSize, null, false, false, z2, false, false, null, null, function02, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, (iA0n << 6) & 57344, 0, 134200773);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C143442(z, function0, function02, bRg2, i, i2);
        }
    }

    public static final void VmReconnectReviewContent(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1056022900);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, bRg2) : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            float f = AuraDimensKt.SpacingLarge;
            BRg bRgA07 = C3U4.A07(bRgThen, f);
            C3TH c3th = C2VU.A00;
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f12112f);
            C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).title1Medium;
            long jA0C = C06G.A0C(bfm);
            BS0 bs0 = BRg.A00;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = VmRecoverySheetsKt$VmReconnectReviewContent$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA0v, AnonymousClass001.A0Y(c1062ATq, objAaT, false), jA0C, c1822Arm, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            C01N.A05(bfm, bs0);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12112e), c1062ATq, C06G.A08(bfm), C06G.A0Z(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
            C01N.A08(bfm, bs0, f);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, C2VU.A02, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, c1062ATq);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            VmReviewRow(R.drawable.grid4_wght400_outline_24, R.string._name_removed__res_0x7f12113c, R.string._name_removed__res_0x7f12113b, null, bfm, 0, 8);
            VmReviewRow(R.drawable.check_outline_24_wght400, R.string._name_removed__res_0x7f121140, R.string._name_removed__res_0x7f12113f, null, bfm, 0, 8);
            VmReviewRow(R.drawable.ai_speech_bubble_wght400_outline_24, R.string._name_removed__res_0x7f12113e, R.string._name_removed__res_0x7f12113d, null, bfm, 0, 8);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C143452(bRg2, i, i2);
        }
    }

    public static final void VmRecoveryLearnMoreSheet(VmRecoveryFlowType vmRecoveryFlowType, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-214050371);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, vmRecoveryFlowType) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA08 |= 48;
        } else if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA08), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(AuraContainer.SecondaryBottomSheet.INSTANCE, bRg2, null, null, null, null, null, false, false, false, null, B1V.A00(bfm, new C143471(vmRecoveryFlowType, VmRecoveryFlowSpecKt.isHedgedWarning(vmRecoveryFlowType), AnonymousClass002.A0b(bfm)), 2071510458), bfm, (iA08 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6, 48, 2044);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C143482(vmRecoveryFlowType, bRg2, i, i2);
        }
    }

    public static final void VmRecoveryReconnectSheet(boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1703307485);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0n |= 48;
        } else if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 19, 18), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            VmReconnectViewModel.Factory factory = new VmReconnectViewModel.Factory(abstractC3358CGzA0h);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            VmReconnectViewModel vmReconnectViewModel = (VmReconnectViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), null, new C0861A6i(VmReconnectViewModel.class));
            boolean z2 = ((VmReconnectUiState) C1BO.A07(bfm, vmReconnectViewModel.uiState)).isReconnecting;
            Unit unit = Unit.INSTANCE;
            boolean zA1M = AnonymousClass003.A1M(bfm, vmReconnectViewModel, auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new VmRecoverySheetsKt$VmRecoveryReconnectSheet$1$1(vmReconnectViewModel, auraNavigatorA0b, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, unit);
            AuraBottomSheetContentKt.AuraBottomSheetContent(AuraContainer.SecondaryBottomSheet.INSTANCE, bRg2, null, null, B1V.A00(bfm, new C143492(z2, z, auraNavigatorA0b, vmReconnectViewModel), -1840889462), null, null, !z2, false, true, null, ComposableSingletons$VmRecoverySheetsKt.f312lambda$1987752122, bfm, (iA0n & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 805330950, 48, 1388);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(z, bRg2, i, i2);
        }
    }

    public static final void VmReviewRow(int i, int i2, int i3, BRg bRg, BFM bfm, int i4, int i5) {
        BRg bRg2 = bRg;
        bfm.AgG(1860247723);
        int iA0D = (i4 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i4 : i4;
        if ((i4 & 48) == 0) {
            iA0D |= AnonymousClass004.A0E(bfm, i2);
        }
        if ((i4 & 384) == 0) {
            iA0D |= AnonymousClass004.A0F(bfm, i3);
        }
        int i6 = i5 & 8;
        if (i6 != 0) {
            iA0D |= 3072;
        } else if ((i4 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 1171, 1170), bfm, iA0D)) {
            if (i6 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            float f = AuraDimensKt.SpacingMedium;
            BRg bRgA09 = C3U4.A09(bRgA0R, f);
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, f);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i7 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0K, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i7);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, i, iA0D & 14), AuraIconSize.SMALL, null, C06G.A0A(bfm), null, bfm, AnonymousClass001.A03(), 41);
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, i2), null, C06G.A0C(bfm), C06G.A0T(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, i3), null, C06G.A08(bfm), C06G.A0Y(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            AnonymousClass002.A0y(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C143502(i, i2, i3, bRg2, i4, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* renamed from: VmSheetSection-FJfuzF0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m3146VmSheetSectionFJfuzF0(java.lang.String r25, java.lang.String r26, X.C1822Arm r27, X.BRg r28, float r29, X.BFM r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmdisabled.content.VmRecoverySheetsKt.m3146VmSheetSectionFJfuzF0(java.lang.String, java.lang.String, X.Arm, X.BRg, float, X.BFM, int, int):void");
    }

    public static final void CloseWithoutContent(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1Q(bfm, 633335895, i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new VmRecoverySheetsKt$CloseWithoutContent$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, auraNavigatorA0b);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(i);
        }
    }
}
