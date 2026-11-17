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
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1U;
import X.B1V;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1DG;
import X.C1DP;
import X.C1YY;
import X.C2CK;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.header.view.HatchBackClickAnalytics;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.navigation.key.SecureStorageCustomConnectorDetailsScreenKey;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraDimensions;
import com.facebook.aura.vds.compose.theme.AuraDimensionsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchCustomConnectorDetailsScreenKt {

    /* renamed from: com.facebook.aura.settings.HatchCustomConnectorDetailsScreenKt$HatchCustomConnectorDetailsScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isDisconnecting;
        public final /* synthetic */ SecureStorageCustomConnectorDetailsScreenKey $key;
        public final /* synthetic */ String $passwordMask;
        public final /* synthetic */ MutableState<Boolean> $showDeleteConfirmation$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SecureStorageCustomConnectorDetailsScreenKey secureStorageCustomConnectorDetailsScreenKey, String str, boolean z, MutableState<Boolean> mutableState) {
            super(4);
            this.$key = secureStorageCustomConnectorDetailsScreenKey;
            this.$passwordMask = str;
            this.$isDisconnecting = z;
            this.$showDeleteConfirmation$delegate = mutableState;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1947invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1947invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            C1062ATq c1062ATq = C10G.A01;
            SecureStorageCustomConnectorDetailsScreenKey secureStorageCustomConnectorDetailsScreenKey = this.$key;
            String str = this.$passwordMask;
            boolean z = this.$isDisconnecting;
            MutableState<Boolean> mutableState = this.$showDeleteConfirmation$delegate;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C90l c90l = C90l.A00;
            C1062ATq c1062ATq2 = C10G.A02;
            BRg bRgAiP = c90l.AiP(c1062ATq2, 1.0f, true);
            AKH<AuraDimensions> akh = AuraDimensionsKt.LocalAuraDimensions;
            C1DP c1dp = new C1DP(C06G.A01(bfm, akh), 0.0f, C06G.A01(bfm, akh), C06G.A01(bfm, akh));
            boolean zA1W = AnonymousClass002.A1W(bfm, str, bfm.A67(secureStorageCustomConnectorDetailsScreenKey), AnonymousClass004.A1F(iA04));
            Object objAaT = bfm.AaT();
            if (zA1W || objAaT == C78N.A00) {
                objAaT = new HatchCustomConnectorDetailsScreenKt$HatchCustomConnectorDetailsScreen$2$1$1$1(f, secureStorageCustomConnectorDetailsScreenKey, str);
                bfm.Ai0(objAaT);
            }
            C1YY.A01(null, null, null, c1dp, null, bfm, null, bRgAiP, (G0U) objAaT, 0, 506, false, false);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e99);
            AuraLabelButtonStyle auraLabelButtonStyleDestructive = AuraButtonStyles.INSTANCE.destructive(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
            BRg bRgA0C = C3U4.A0C(c1062ATq2, C06G.A01(bfm, akh), 0.0f, C06G.A01(bfm, akh), f2 + C06G.A01(bfm, akh));
            boolean z2 = !z;
            boolean zA65 = bfm.A65(mutableState);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchCustomConnectorDetailsScreenKt$HatchCustomConnectorDetailsScreen$2$1$2$1(mutableState);
                bfm.Ai0(objAaT2);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, bRgA0C, auraLabelButtonStyleDestructive, auraButtonSize, null, false, false, z2, z, false, null, null, (Function0) objAaT2, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, 0, 0, 134199749);
            BBI.A0R(bbi, true);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchCustomConnectorDetailsScreenKt$HatchCustomConnectorDetailsScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $cancelLabel;
        public final /* synthetic */ String $deleteLabel;
        public final /* synthetic */ SecureStorageCustomConnectorDetailsScreenKey $key;
        public final /* synthetic */ MutableState<Boolean> $showDeleteConfirmation$delegate;
        public final /* synthetic */ HatchCustomConnectorDetailsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, MutableState<Boolean> mutableState, HatchCustomConnectorDetailsViewModel hatchCustomConnectorDetailsViewModel, SecureStorageCustomConnectorDetailsScreenKey secureStorageCustomConnectorDetailsScreenKey, String str2) {
            super(2);
            this.$deleteLabel = str;
            this.$showDeleteConfirmation$delegate = mutableState;
            this.$viewModel = hatchCustomConnectorDetailsViewModel;
            this.$key = secureStorageCustomConnectorDetailsScreenKey;
            this.$cancelLabel = str2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$cancelLabel, AnonymousClass001.A1T(bfm, this.$key, AnonymousClass001.A1T(bfm, this.$viewModel, AnonymousClass001.A1R(bfm, this.$showDeleteConfirmation$delegate, bfm.A65(this.$deleteLabel)))));
                String str = this.$deleteLabel;
                String str2 = this.$cancelLabel;
                HatchCustomConnectorDetailsViewModel hatchCustomConnectorDetailsViewModel = this.$viewModel;
                SecureStorageCustomConnectorDetailsScreenKey secureStorageCustomConnectorDetailsScreenKey = this.$key;
                MutableState<Boolean> mutableState = this.$showDeleteConfirmation$delegate;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchCustomConnectorDetailsScreenKt$HatchCustomConnectorDetailsScreen$3$1$1(str, str2, hatchCustomConnectorDetailsViewModel, secureStorageCustomConnectorDetailsScreenKey, mutableState);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchCustomConnectorDetailsScreenKt$HatchCustomConnectorDetailsScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SecureStorageCustomConnectorDetailsScreenKey $key;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onDisconnected;
        public final /* synthetic */ HatchCustomConnectorDetailsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(SecureStorageCustomConnectorDetailsScreenKey secureStorageCustomConnectorDetailsScreenKey, HatchCustomConnectorDetailsViewModel hatchCustomConnectorDetailsViewModel, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$key = secureStorageCustomConnectorDetailsScreenKey;
            this.$viewModel = hatchCustomConnectorDetailsViewModel;
            this.$onBack = function0;
            this.$onDisconnected = function02;
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
            HatchCustomConnectorDetailsScreenKt.HatchCustomConnectorDetailsScreen(this.$key, this.$viewModel, this.$onBack, this.$onDisconnected, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchCustomConnectorDetailsScreen(SecureStorageCustomConnectorDetailsScreenKey secureStorageCustomConnectorDetailsScreenKey, HatchCustomConnectorDetailsViewModel hatchCustomConnectorDetailsViewModel, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(secureStorageCustomConnectorDetailsScreenKey, 0);
        AnonymousClass005.A11(hatchCustomConnectorDetailsViewModel, function0, function02, 1);
        bfm.AgG(-1901774133);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, secureStorageCustomConnectorDetailsScreenKey) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(hatchCustomConnectorDetailsViewModel, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, function02);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1BO c1boA02 = C2CK.A02(bfm, hatchCustomConnectorDetailsViewModel.uiState);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120eaa);
            boolean zAreEqual = C7384Etj.areEqual(((CustomConnectorDetailsUiState) c1boA02.getValue()).disconnectingConnectorName, secureStorageCustomConnectorDetailsScreenKey.name);
            boolean zA65 = bfm.A65(secureStorageCustomConnectorDetailsScreenKey.name);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = AnonymousClass005.A0S(bfm, false);
            }
            MutableState mutableState = (MutableState) objAaT;
            String str = secureStorageCustomConnectorDetailsScreenKey.name;
            boolean zA1S = AnonymousClass001.A1S(bfm, secureStorageCustomConnectorDetailsScreenKey, (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA0T & 64) != 0 && bfm.A67(hatchCustomConnectorDetailsViewModel))) | AnonymousClass003.A1E(iA0T);
            Object objAaT2 = bfm.AaT();
            if (zA1S || objAaT2 == C78N.A00) {
                objAaT2 = new HatchCustomConnectorDetailsScreenKt$HatchCustomConnectorDetailsScreen$1$1(hatchCustomConnectorDetailsViewModel, secureStorageCustomConnectorDetailsScreenKey, function02, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A1A(bfm, objAaT2, hatchCustomConnectorDetailsViewModel, str);
            BRg bRg3 = bRg2;
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.SecondaryScreen.INSTANCE, bRg3, null, 0L, secureStorageCustomConnectorDetailsScreenKey.host, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e98), function0, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, new HatchBackClickAnalytics(HatchSurface.SETTINGS, HatchScreen.SECURE_STORAGE_DETAIL), false, B1V.A00(bfm, new AnonymousClass2(secureStorageCustomConnectorDetailsScreenKey, strA01, zAreEqual, mutableState), -1789173360), bfm, AnonymousClass001.A05(iA0T << 12, ((iA0T >> 9) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6), 0, C06G.A02(), 402653068);
            if (MutableState.A0A(mutableState)) {
                bfm.AgE(-836022194);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e99);
                String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ed6);
                String strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e96);
                String strA0t = AnonymousClass001.A0t(bfm, secureStorageCustomConnectorDetailsScreenKey.host, R.string._name_removed__res_0x7f120e95);
                B1U b1uA00 = B1V.A00(bfm, new AnonymousClass3(strA012, mutableState, hatchCustomConnectorDetailsViewModel, secureStorageCustomConnectorDetailsScreenKey, strA013), 688453535);
                boolean zA652 = bfm.A65(mutableState);
                Object objAaT3 = bfm.AaT();
                if (zA652 || objAaT3 == C78N.A00) {
                    objAaT3 = new HatchCustomConnectorDetailsScreenKt$HatchCustomConnectorDetailsScreen$4$1(mutableState);
                    bfm.Ai0(objAaT3);
                }
                AuraAlertDialogKt.AuraAlertDialog((BRg) null, strA014, strA0t, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) b1uA00, (Function0<Unit>) objAaT3, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, 196608, 0, 1945);
            } else {
                bfm.AgE(-834783465);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(secureStorageCustomConnectorDetailsScreenKey, hatchCustomConnectorDetailsViewModel, function0, function02, bRg2, i, i2);
        }
    }
}
