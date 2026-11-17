package com.facebook.aura.agentpermission;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BQN;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C2CK;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.FGI;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.CheckoutInfoTitle;
import com.facebook.aura.agentpermission.CheckoutInfoUiState;
import com.facebook.aura.agentpermission.CheckoutInfoViewModel;
import com.facebook.aura.gateway.CheckoutInfo;
import com.facebook.aura.gateway.CheckoutInfoSection;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class CheckoutInfoSheetKt {

    /* renamed from: com.facebook.aura.agentpermission.CheckoutInfoSheetKt$CheckoutInfoContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ CheckoutInfo $info;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CheckoutInfo checkoutInfo, BRg bRg, int i, int i2) {
            super(2);
            this.$info = checkoutInfo;
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
            CheckoutInfoSheetKt.CheckoutInfoContent(this.$info, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutInfoSheetKt$CheckoutInfoError$2, reason: invalid class name and case insensitive filesystem */
    public final class C108032 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $canRetry;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108032(Function0<Unit> function0, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$onRetry = function0;
            this.$canRetry = z;
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
            CheckoutInfoSheetKt.CheckoutInfoError(this.$onRetry, this.$canRetry, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutInfoSheetKt$CheckoutInfoLoading$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BRg bRg, int i, int i2) {
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
            CheckoutInfoSheetKt.CheckoutInfoLoading(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutInfoSheetKt$CheckoutInfoPrefetch$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $approvalId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, int i) {
            super(2);
            this.$approvalId = str;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            CheckoutInfoSheetKt.CheckoutInfoPrefetch(this.$approvalId, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutInfoSheetKt$CheckoutInfoSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C108042 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ CheckoutInfoSection $section;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108042(CheckoutInfoSection checkoutInfoSection, BRg bRg, int i, int i2) {
            super(2);
            this.$section = checkoutInfoSection;
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
            CheckoutInfoSheetKt.CheckoutInfoSection(this.$section, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutInfoSheetKt$CheckoutInfoSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C108052 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<CheckoutInfoUiState> $uiState$delegate;
        public final /* synthetic */ CheckoutInfoViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C108052(CheckoutInfoViewModel checkoutInfoViewModel, C1BO<? extends CheckoutInfoUiState> c1bo) {
            super(3);
            this.$viewModel = checkoutInfoViewModel;
            this.$uiState$delegate = c1bo;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            CheckoutInfoUiState value = this.$uiState$delegate.getValue();
            if (!(value instanceof CheckoutInfoUiState.Error)) {
                if (value instanceof CheckoutInfoUiState.Loading) {
                    bfm.AgE(-1404762912);
                    CheckoutInfoSheetKt.CheckoutInfoLoading(null, bfm, 0, 1);
                } else {
                    if (!(value instanceof CheckoutInfoUiState.Content)) {
                        AnonymousClass004.A1A(bfm, -1404769995);
                        throw C3cG.A0q();
                    }
                    bfm.AgE(-1404760918);
                    CheckoutInfoSheetKt.CheckoutInfoContent(((CheckoutInfoUiState.Content) value).info, null, bfm, CheckoutInfo.$stable, 2);
                }
                AnonymousClass002.A19(bfm);
                return;
            }
            bfm.AgE(-1404767748);
            CheckoutInfoViewModel checkoutInfoViewModel = this.$viewModel;
            boolean zA67 = bfm.A67(checkoutInfoViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new CheckoutInfoSheetKt$CheckoutInfoSheet$2$1$1(checkoutInfoViewModel);
                bfm.Ai0(objAaT);
            }
            CheckoutInfoSheetKt.CheckoutInfoError((Function0) ((InterfaceC7353EnQ) objAaT), ((CheckoutInfoUiState.Error) value).canRetry, null, bfm, 0, 4);
            AnonymousClass001.A1D(bfm);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutInfoSheetKt$CheckoutInfoSheet$3, reason: invalid class name and case insensitive filesystem */
    public final class C108063 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $approvalId;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108063(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$approvalId = str;
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
            CheckoutInfoSheetKt.CheckoutInfoSheet(this.$approvalId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void CheckoutInfoPrefetch(String str, BFM bfm, int i) {
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-382747921);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            String strA0M = FGI.A0M("checkout-info-", str);
            CheckoutInfoViewModel.Factory factory = new CheckoutInfoViewModel.Factory(AnonymousClass002.A0h(bfm), str);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), strA0M, C3cG.A0x(CheckoutInfoViewModel.class));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, i);
        }
    }

    public static final void CheckoutInfoError(Function0<Unit> function0, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(27310302);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA09 = C3U4.A09(bRgA0Q.then(c1062ATq), AuraDimensKt.SpacingLarge);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingMedium, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120087);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0B = C3cH.A0B(bfm, auraTheme);
            long jA06 = C3cH.A06(bfm, auraTheme);
            BS0 bs0 = BRg.A00;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = CheckoutInfoSheetKt$CheckoutInfoError$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bs0, objAaT, false), jA06, c1822ArmA0B, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            if (z) {
                bfm.AgE(575458987);
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120154), null, c1062ATq, AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1), AuraButtonSize.MEDIUM, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, (iA0T << 12) & 57344, 0, 134201285);
            } else {
                bfm.AgE(575713838);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108032(function0, z, bRgA0Q, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CheckoutInfoSection(com.facebook.aura.gateway.CheckoutInfoSection r34, X.BRg r35, X.BFM r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.CheckoutInfoSheetKt.CheckoutInfoSection(com.facebook.aura.gateway.CheckoutInfoSection, X.BRg, X.BFM, int, int):void");
    }

    public static final void CheckoutInfoSheet(String str, BRg bRg, BFM bfm, int i, int i2) {
        String strA0e;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1861173752);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
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
            String strA0M = FGI.A0M("checkout-info-", str);
            CheckoutInfoViewModel.Factory factory = new CheckoutInfoViewModel.Factory(AnonymousClass002.A0h(bfm), str);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            CheckoutInfoViewModel checkoutInfoViewModel = (CheckoutInfoViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), CheckoutInfoViewModel.class, strA0M);
            C1BO c1boA02 = C2CK.A02(bfm, checkoutInfoViewModel.uiState);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            AuraContainer.PrimaryBottomSheet primaryBottomSheet = AuraContainer.PrimaryBottomSheet.INSTANCE;
            CheckoutInfoTitle title = ((CheckoutInfoUiState) c1boA02.getValue()).getTitle();
            if (title instanceof CheckoutInfoTitle.Resource) {
                bfm.AgE(-1881560316);
                strA0e = AnonymousClass003.A0e(bfm, ((CheckoutInfoTitle.Resource) title).id);
            } else {
                if (!(title instanceof CheckoutInfoTitle.Server)) {
                    throw AnonymousClass005.A0k(bfm, -1881562961);
                }
                AnonymousClass003.A0l(bfm, -1881557587);
                strA0e = ((CheckoutInfoTitle.Server) title).value;
            }
            AuraBottomSheetHeaderConfig auraBottomSheetHeaderConfig = new AuraBottomSheetHeaderConfig(strA0e, null, null, null, null, AuraBottomSheetHeaderConfig.Style.LARGE_START_ALIGNED, null);
            boolean zA1M = AnonymousClass003.A1M(bfm, checkoutInfoViewModel, auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new CheckoutInfoSheetKt$CheckoutInfoSheet$1$1(checkoutInfoViewModel, auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(primaryBottomSheet, bRg2, null, auraBottomSheetHeaderConfig, null, null, (Function0) objAaT, false, false, false, null, B1V.A00(bfm, new C108052(checkoutInfoViewModel, c1boA02), 1209710059), bfm, (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6, 48, 1972);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108063(str, bRg2, i, i2);
        }
    }

    public static final void CheckoutInfoContent(CheckoutInfo checkoutInfo, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-337407055);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(checkoutInfo, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg);
            float f = AuraDimensKt.SpacingLarge;
            BRg bRgA0C = C3U4.A0C(bRgA0R, f, 0.0f, f, f);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, f, 0);
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
            bfm.AgE(730573560);
            Iterator<CheckoutInfoSection> it = checkoutInfo.sections.iterator();
            while (it.hasNext()) {
                CheckoutInfoSection(it.next(), null, bfm, CheckoutInfoSection.$stable, 2);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(checkoutInfo, bRg, i, i2);
        }
    }

    public static final void CheckoutInfoLoading(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(612709162);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120088);
            BRg bRgA09 = C3U4.A09(AnonymousClass001.A0R(bRg), AuraDimensKt.SpacingLarge);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new CheckoutInfoSheetKt$CheckoutInfoLoading$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA09, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(C10G.A07(BRg.A00, 24.0f), null, 0L, bfm, 6, 6);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(bRg, i, i2);
        }
    }

    public static final /* synthetic */ CheckoutInfoUiState access$CheckoutInfoSheet$lambda$0(C1BO c1bo) {
        return (CheckoutInfoUiState) c1bo.getValue();
    }
}
