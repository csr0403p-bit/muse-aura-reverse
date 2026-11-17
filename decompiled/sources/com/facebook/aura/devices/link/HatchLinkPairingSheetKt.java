package com.facebook.aura.devices.link;

import X.AKL;
import X.AKO;
import X.AbstractC1798ArH;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BRg;
import X.C1BO;
import X.C2CK;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C8j4;
import X.C8j5;
import X.G0U;
import X.G0V;
import X.InterfaceC7353EnQ;
import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.devices.pairing.HatchDeviceBlePermissionEffectKt;
import com.facebook.aura.devices.pairing.HatchDeviceFamily;
import com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt;
import com.facebook.aura.devices.pairing.HatchDevicePairingStateExtKt;
import com.facebook.aura.devices.pairing.HatchDevicePairingStep;
import com.facebook.aura.devices.pairing.HatchDevicePairingStrings;
import com.facebook.aura.devices.pairing.HatchDevicePairingSuccessHandler;
import com.facebook.aura.devices.pairing.HatchDevicePairingViewModel;
import com.facebook.aura.devices.pairing.HatchDevicePairingViewState;
import com.facebook.aura.devices.pairing.HatchDiscoveredDevice;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.navigation.key.HatchLinkActivePairingSheetKey;
import com.facebook.aura.navigation.key.HatchLinkPairingPurpose;
import com.facebook.aura.navigation.key.HatchLinkPairingSheetKey;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.settings.HatchConnectedDevicesViewModel;
import com.facebook.aura.settings.HatchPendingPairAgain;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.utils.HatchPermissionDeniedDialogKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchLinkPairingSheetKt {

    /* renamed from: com.facebook.aura.devices.link.HatchLinkPairingSheetKt$HatchLinkActivePairingSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $fromDeeplink;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchLinkPairingPurpose $pairingPurpose;
        public final /* synthetic */ String $presentationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchLinkPairingPurpose hatchLinkPairingPurpose, boolean z, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$pairingPurpose = hatchLinkPairingPurpose;
            this.$fromDeeplink = z;
            this.$presentationId = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLinkPairingSheetKt.HatchLinkActivePairingSheet(this.$pairingPurpose, this.$fromDeeplink, this.$presentationId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.devices.link.HatchLinkPairingSheetKt$HatchLinkActivePairingSheet$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $fromDeeplink;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchLinkPairingPurpose $pairingPurpose;
        public final /* synthetic */ String $presentationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(HatchLinkPairingPurpose hatchLinkPairingPurpose, boolean z, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$pairingPurpose = hatchLinkPairingPurpose;
            this.$fromDeeplink = z;
            this.$presentationId = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLinkPairingSheetKt.HatchLinkActivePairingSheet(this.$pairingPurpose, this.$fromDeeplink, this.$presentationId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.devices.link.HatchLinkPairingSheetKt$HatchLinkPairingSheet$11, reason: invalid class name */
    public final class AnonymousClass11 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $fromDeeplink;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchLinkPairingPurpose $pairingPurpose;
        public final /* synthetic */ String $presentationId;
        public final /* synthetic */ String $setUpAgainAddress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(HatchLinkPairingPurpose hatchLinkPairingPurpose, boolean z, String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$pairingPurpose = hatchLinkPairingPurpose;
            this.$fromDeeplink = z;
            this.$presentationId = str;
            this.$setUpAgainAddress = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLinkPairingSheetKt.HatchLinkPairingSheet(this.$pairingPurpose, this.$fromDeeplink, this.$presentationId, this.$setUpAgainAddress, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.devices.link.HatchLinkPairingSheetKt$HatchLinkPairingSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $fromDeeplink;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchLinkPairingPurpose $pairingPurpose;
        public final /* synthetic */ String $presentationId;
        public final /* synthetic */ String $setUpAgainAddress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchLinkPairingPurpose hatchLinkPairingPurpose, boolean z, String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$pairingPurpose = hatchLinkPairingPurpose;
            this.$fromDeeplink = z;
            this.$presentationId = str;
            this.$setUpAgainAddress = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLinkPairingSheetKt.HatchLinkPairingSheet(this.$pairingPurpose, this.$fromDeeplink, this.$presentationId, this.$setUpAgainAddress, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchLinkActivePairingSheet(HatchLinkPairingPurpose hatchLinkPairingPurpose, boolean z, String str, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass8;
        BRg bRg2 = bRg;
        AnonymousClass002.A1A(hatchLinkPairingPurpose, 0, str);
        bfm.AgG(-118497607);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, hatchLinkPairingPurpose) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, str);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA08 |= 3072;
        } else if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA08), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BBI bbi = (BBI) bfm;
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            Context contextA01 = AKO.A01(bbi);
            AbstractC3358CGz abstractC3358CGzA06 = AKO.A06(LocalUserSessionKt.LocalUserSession, bbi);
            HatchDevicePairingViewModel.Factory factory = new HatchDevicePairingViewModel.Factory(AnonymousClass001.A0I(contextA01), abstractC3358CGzA06, HatchDeviceFamily.HATCH_LINK);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            HatchDevicePairingViewModel hatchDevicePairingViewModel = (HatchDevicePairingViewModel) C3cH.A0H(factory, bodA00, AnonymousClass005.A0Y(bodA00), C3cG.A0x(HatchDevicePairingViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, hatchDevicePairingViewModel.uiState);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AbstractC1798ArH.A05(bbi, false);
            }
            MutableState mutableState = (MutableState) objAaT;
            int i4 = iA08 & 14;
            boolean zA17 = AnonymousClass003.A17(i4);
            Object objAaT2 = bfm.AaT();
            if (zA17 || objAaT2 == obj) {
                objAaT2 = new HatchDevicePairingSuccessHandler(AnonymousClass002.A1Z(hatchLinkPairingPurpose, HatchLinkPairingPurpose.NEW_PAIRING));
                BBI.A0O(bbi, objAaT2);
            }
            HatchDevicePairingSuccessHandler hatchDevicePairingSuccessHandler = (HatchDevicePairingSuccessHandler) objAaT2;
            HatchConnectedDevicesViewModel.Factory factory2 = new HatchConnectedDevicesViewModel.Factory(contextA01, abstractC3358CGzA06);
            Object objA07 = AKO.A07(AKL.A00, bbi);
            C7384Etj.A0Z(objA07, AnonymousClass000.A00(6));
            ComponentActivity componentActivity = (ComponentActivity) objA07;
            HatchConnectedDevicesViewModel hatchConnectedDevicesViewModel = (HatchConnectedDevicesViewModel) C3cH.A0H(factory2, componentActivity, AnonymousClass003.A0Z(componentActivity), C3cG.A0x(HatchConnectedDevicesViewModel.class));
            int i5 = iA08 & 896;
            boolean zA1I = AnonymousClass004.A1I(iA08) | (i4 == 4) | AnonymousClass002.A1Q(i5, 256);
            Object objAaT3 = bfm.AaT();
            if (zA1I || objAaT3 == obj) {
                objAaT3 = new HatchLinkActivePairingSheetKey(hatchLinkPairingPurpose, z, str);
                BBI.A0O(bbi, objAaT3);
            }
            HatchLinkActivePairingSheetKey hatchLinkActivePairingSheetKey = (HatchLinkActivePairingSheetKey) objAaT3;
            boolean zEquals = str.equals(((HatchDevicePairingViewState) c1boA02.getValue()).pairingPresentationId);
            Object[] objArr = {hatchDevicePairingViewModel, auraNavigatorA05, str, hatchLinkActivePairingSheetKey};
            boolean zA1Y = AnonymousClass005.A1Y(bfm, hatchLinkActivePairingSheetKey, hatchDevicePairingViewModel, bfm.A67(auraNavigatorA05), AnonymousClass002.A1Q(i5, 256));
            Object objAaT4 = bfm.AaT();
            if (zA1Y || objAaT4 == obj) {
                objAaT4 = new HatchLinkPairingSheetKt$HatchLinkActivePairingSheet$1$1(auraNavigatorA05, hatchLinkActivePairingSheetKey, hatchDevicePairingViewModel, str);
                BBI.A0O(bbi, objAaT4);
            }
            C78e.A07(bfm, (G0U) objAaT4, objArr);
            if (!zEquals) {
                bfm.AgE(302621415);
                AuraNavKey auraNavKeyCurrentKey = auraNavigatorA05.currentKey(true);
                boolean zA1S = AnonymousClass005.A1S(bfm, auraNavKeyCurrentKey, hatchLinkActivePairingSheetKey, auraNavigatorA05);
                Object objAaT5 = bfm.AaT();
                if (zA1S || objAaT5 == obj) {
                    objAaT5 = new HatchLinkPairingSheetKt$HatchLinkActivePairingSheet$2$1(auraNavKeyCurrentKey, hatchLinkActivePairingSheetKey, auraNavigatorA05);
                    BBI.A0O(bbi, objAaT5);
                }
                C78e.A01(bfm, auraNavigatorA05, auraNavKeyCurrentKey, hatchLinkActivePairingSheetKey, (G0U) objAaT5);
                bBbAAc = AnonymousClass001.A0L(bfm, bbi);
                if (bBbAAc != null) {
                    anonymousClass8 = new AnonymousClass3(hatchLinkPairingPurpose, z, str, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass8);
                }
                return;
            }
            bfm.AgE(302838601);
            BBI.A0R(bbi, false);
            Boolean boolValueOf = Boolean.valueOf(C8j4.A1W(c1boA02));
            HatchDevicePairingStep hatchDevicePairingStepA0g = C8j4.A0g(c1boA02);
            Boolean boolValueOf2 = Boolean.valueOf(MutableState.A0A(mutableState));
            boolean zA1J = AnonymousClass003.A1J(bfm, c1boA02, auraNavigatorA05);
            Object objAaT6 = bfm.AaT();
            if (zA1J || objAaT6 == obj) {
                objAaT6 = new HatchLinkPairingSheetKt$HatchLinkActivePairingSheet$4$1(auraNavigatorA05, mutableState, c1boA02);
                BBI.A0O(bbi, objAaT6);
            }
            C78e.A01(bfm, boolValueOf, hatchDevicePairingStepA0g, boolValueOf2, (G0U) objAaT6);
            Object[] objArr2 = {hatchDevicePairingViewModel, str, Boolean.valueOf(C8j4.A1W(c1boA02)), C8j4.A0g(c1boA02)};
            boolean zA1J2 = AnonymousClass003.A1J(bfm, c1boA02, hatchDevicePairingViewModel) | AnonymousClass002.A1Q(i5, 256);
            Object objAaT7 = bfm.AaT();
            if (zA1J2 || objAaT7 == obj) {
                objAaT7 = new HatchLinkPairingSheetKt$HatchLinkActivePairingSheet$5$1(hatchDevicePairingViewModel, str, c1boA02);
                BBI.A0O(bbi, objAaT7);
            }
            C78e.A07(bfm, (G0U) objAaT7, objArr2);
            HatchDevicePairingViewState hatchDevicePairingViewState = (HatchDevicePairingViewState) c1boA02.getValue();
            HatchDevicePairingStrings hatchDevicePairingStrings = HatchDevicePairingStrings.HATCH_LINK;
            boolean zA67 = bfm.A67(hatchDevicePairingViewModel);
            Object objAaT8 = bfm.AaT();
            if (zA67 || objAaT8 == obj) {
                objAaT8 = new HatchLinkPairingSheetKt$HatchLinkActivePairingSheet$6$1(hatchDevicePairingViewModel);
                BBI.A0O(bbi, objAaT8);
            }
            Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT8);
            boolean zA1V = AnonymousClass005.A1V(bfm, hatchConnectedDevicesViewModel, hatchDevicePairingViewModel, auraNavigatorA05, AnonymousClass003.A1N(bfm, hatchDevicePairingSuccessHandler, c1boA02));
            Object objAaT9 = bfm.AaT();
            if (zA1V || objAaT9 == obj) {
                objAaT9 = new HatchLinkPairingSheetKt$HatchLinkActivePairingSheet$7$1(hatchDevicePairingSuccessHandler, hatchConnectedDevicesViewModel, hatchDevicePairingViewModel, auraNavigatorA05, c1boA02, mutableState);
                BBI.A0O(bbi, objAaT9);
            }
            HatchDevicePairingBottomSheetsKt.HatchDevicePairingBottomSheets(hatchDevicePairingViewState, hatchDevicePairingViewModel, hatchDevicePairingStrings, bRg2, false, function0, null, (Function0) objAaT9, bfm, HatchDevicePairingViewState.$stable | RuntimeInternals.IOPRIO_BACKGROUND | (HatchDevicePairingViewModel.$stable << 3) | (HatchDevicePairingStrings.$stable << 6) | (iA08 & 7168), 64);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass8 = new AnonymousClass8(hatchLinkPairingPurpose, z, str, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass8);
        }
    }

    public static final void HatchLinkPairingSheet(HatchLinkPairingPurpose hatchLinkPairingPurpose, boolean z, String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass11;
        Function0 function0;
        BRg bRg2 = bRg;
        AnonymousClass002.A1A(hatchLinkPairingPurpose, 0, str);
        bfm.AgG(2057878978);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, hatchLinkPairingPurpose) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0g(bfm, str2);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA08 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA08 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA08), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BBI bbi = (BBI) bfm;
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            Context contextA01 = AKO.A01(bbi);
            HatchDevicePairingViewModel.Factory factory = new HatchDevicePairingViewModel.Factory(AnonymousClass001.A0I(contextA01), AKO.A06(LocalUserSessionKt.LocalUserSession, bbi), HatchDeviceFamily.HATCH_LINK);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            HatchDevicePairingViewModel hatchDevicePairingViewModel = (HatchDevicePairingViewModel) C3cH.A0H(factory, bodA00, AnonymousClass005.A0Y(bodA00), C3cG.A0x(HatchDevicePairingViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, hatchDevicePairingViewModel.uiState);
            int i4 = iA08 & 14;
            boolean zA17 = AnonymousClass003.A17(i4);
            int i5 = iA08 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            int i6 = iA08 & 896;
            int i7 = iA08 & 7168;
            boolean zA1Q = AnonymousClass002.A1Q(i7, 2048) | zA17 | (i5 == 32) | AnonymousClass002.A1Q(i6, 256);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = new HatchLinkPairingSheetKey(hatchLinkPairingPurpose, z, str, str2);
                BBI.A0O(bbi, objAaT);
            }
            HatchLinkPairingSheetKey hatchLinkPairingSheetKey = (HatchLinkPairingSheetKey) objAaT;
            boolean zA1Q2 = AnonymousClass002.A1Q(i5, 32) | AnonymousClass003.A17(i4) | AnonymousClass003.A19(i6);
            Object objAaT2 = bfm.AaT();
            if (zA1Q2 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchLinkActivePairingSheetKey(hatchLinkPairingPurpose, z, str);
                BBI.A0O(bbi, objAaT2);
            }
            HatchLinkActivePairingSheetKey hatchLinkActivePairingSheetKey = (HatchLinkActivePairingSheetKey) objAaT2;
            Object objAaT3 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT3 == obj) {
                objAaT3 = AbstractC1798ArH.A08(false);
                BBI.A0O(bbi, objAaT3);
            }
            MutableState mutableState = (MutableState) objAaT3;
            MutableState mutableState2 = (MutableState) C8j5.A0U(bfm, bbi, obj, false);
            boolean zA1Q3 = AnonymousClass002.A1Q(i6, 256);
            Object objAaT4 = bfm.AaT();
            if (zA1Q3 || objAaT4 == obj) {
                objAaT4 = HatchPendingPairAgain.autoSelectTarget;
                HatchPendingPairAgain.autoSelectTarget = null;
                bfm.Ai0(objAaT4);
            }
            String str3 = (String) objAaT4;
            boolean zA1Q4 = AnonymousClass002.A1Q(i6, 256);
            Object objAaT5 = bfm.AaT();
            if (zA1Q4 || objAaT5 == obj) {
                objAaT5 = AbstractC1798ArH.A05(bbi, false);
            }
            MutableState mutableState3 = (MutableState) objAaT5;
            boolean zA67 = bfm.A67(hatchDevicePairingViewModel) | AnonymousClass002.A1Q(i6, 256);
            Object objAaT6 = bfm.AaT();
            if (zA67 || objAaT6 == obj) {
                objAaT6 = new HatchLinkPairingSheetKt$HatchLinkPairingSheet$requestBlePermissions$1$1(hatchDevicePairingViewModel, str, mutableState);
                BBI.A0O(bbi, objAaT6);
            }
            Function0<Unit> function0HatchDeviceBlePermissionEffect = HatchDeviceBlePermissionEffectKt.HatchDeviceBlePermissionEffect(false, (G0U) objAaT6, bfm, 6, 0);
            Object[] objArr = {hatchDevicePairingViewModel, auraNavigatorA05, hatchLinkPairingSheetKey, hatchLinkActivePairingSheetKey};
            boolean zA1V = AnonymousClass005.A1V(bfm, auraNavigatorA05, hatchLinkPairingSheetKey, hatchLinkActivePairingSheetKey, AnonymousClass002.A1V(bfm, hatchDevicePairingViewModel, AnonymousClass003.A18(i5) | bfm.A67(contextA01), AnonymousClass002.A1Q(i4, 4)) | AnonymousClass003.A19(i6) | AnonymousClass002.A1Q(i7, 2048));
            Object objAaT7 = bfm.AaT();
            if (zA1V || objAaT7 == obj) {
                objAaT7 = new HatchLinkPairingSheetKt$HatchLinkPairingSheet$1$1(contextA01, z, hatchLinkPairingPurpose, hatchDevicePairingViewModel, str, str2, auraNavigatorA05, hatchLinkPairingSheetKey, hatchLinkActivePairingSheetKey);
                BBI.A0O(bbi, objAaT7);
            }
            C78e.A07(bfm, (G0U) objAaT7, objArr);
            if (!str.equals(((HatchDevicePairingViewState) c1boA02.getValue()).pairingPresentationId)) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass11 = new AnonymousClass2(hatchLinkPairingPurpose, z, str, str2, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass11);
                }
                return;
            }
            Boolean boolValueOf = Boolean.valueOf(C8j4.A1W(c1boA02));
            Boolean boolValueOf2 = Boolean.valueOf(((HatchDevicePairingViewState) c1boA02.getValue()).getBlePermissionsGranted());
            boolean zA1T = AnonymousClass001.A1T(bfm, hatchLinkActivePairingSheetKey, AnonymousClass005.A1X(bfm, function0HatchDeviceBlePermissionEffect, auraNavigatorA05, AnonymousClass003.A1J(bfm, c1boA02, hatchDevicePairingViewModel), AnonymousClass002.A1Q(i6, 256)));
            Object objAaT8 = bfm.AaT();
            if (zA1T || objAaT8 == obj) {
                objAaT8 = new HatchLinkPairingSheetKt$HatchLinkPairingSheet$3$1(hatchDevicePairingViewModel, str, function0HatchDeviceBlePermissionEffect, auraNavigatorA05, hatchLinkActivePairingSheetKey, c1boA02, mutableState2);
                BBI.A0O(bbi, objAaT8);
            }
            AnonymousClass001.A19(bfm, objAaT8, boolValueOf, boolValueOf2);
            C1BO c1boA022 = C2CK.A02(bfm, hatchDevicePairingViewModel.claimedDeviceDestination);
            Object value = c1boA022.getValue();
            boolean zA1O = C3cH.A1O(bfm, c1boA022, hatchDevicePairingViewModel, auraNavigatorA05);
            Object objAaT9 = bfm.AaT();
            if (zA1O || objAaT9 == obj) {
                objAaT9 = new HatchLinkPairingSheetKt$HatchLinkPairingSheet$4$1(c1boA022, hatchDevicePairingViewModel, auraNavigatorA05);
                BBI.A0O(bbi, objAaT9);
            }
            AnonymousClass001.A17(bfm, objAaT9, value);
            List<HatchDiscoveredDevice> discoveredDevices = ((HatchDevicePairingViewState) c1boA02.getValue()).getDiscoveredDevices();
            boolean zA1T2 = AnonymousClass001.A1T(bfm, hatchDevicePairingViewModel, AnonymousClass005.A1R(bfm, str3, mutableState3, c1boA02));
            Object objAaT10 = bfm.AaT();
            if (zA1T2 || objAaT10 == obj) {
                objAaT10 = new HatchLinkPairingSheetKt$HatchLinkPairingSheet$5$1(str3, hatchDevicePairingViewModel, mutableState3, c1boA02);
                BBI.A0O(bbi, objAaT10);
            }
            AnonymousClass001.A19(bfm, objAaT10, str3, discoveredDevices);
            Boolean boolValueOf3 = Boolean.valueOf(C8j4.A1W(c1boA02));
            HatchDevicePairingStep hatchDevicePairingStepA0g = C8j4.A0g(c1boA02);
            boolean zA1O2 = C3cH.A1O(bfm, c1boA02, auraNavigatorA05, hatchLinkActivePairingSheetKey);
            Object objAaT11 = bfm.AaT();
            if (zA1O2 || objAaT11 == obj) {
                objAaT11 = new HatchLinkPairingSheetKt$HatchLinkPairingSheet$6$1(auraNavigatorA05, hatchLinkActivePairingSheetKey, c1boA02);
                BBI.A0O(bbi, objAaT11);
            }
            C78e.A01(bfm, boolValueOf3, hatchDevicePairingStepA0g, hatchLinkPairingPurpose, (G0U) objAaT11);
            Object[] objArr2 = {hatchDevicePairingViewModel, str, Boolean.valueOf(C8j4.A1W(c1boA02)), C8j4.A0g(c1boA02)};
            boolean zA1J = AnonymousClass003.A1J(bfm, c1boA02, hatchDevicePairingViewModel) | AnonymousClass002.A1Q(i6, 256);
            Object objAaT12 = bfm.AaT();
            if (zA1J || objAaT12 == obj) {
                objAaT12 = new HatchLinkPairingSheetKt$HatchLinkPairingSheet$7$1(hatchDevicePairingViewModel, str, c1boA02);
                BBI.A0O(bbi, objAaT12);
            }
            C78e.A07(bfm, (G0U) objAaT12, objArr2);
            HatchDevicePairingViewState hatchDevicePairingViewState = (HatchDevicePairingViewState) c1boA02.getValue();
            HatchDevicePairingStrings hatchDevicePairingStrings = HatchDevicePairingStrings.HATCH_LINK;
            boolean zIsDeviceSelectionStep = HatchDevicePairingStateExtKt.isDeviceSelectionStep(C8j4.A0g(c1boA02));
            boolean zA672 = bfm.A67(hatchDevicePairingViewModel);
            Object objAaT13 = bfm.AaT();
            if (zA672 || objAaT13 == obj) {
                objAaT13 = new HatchLinkPairingSheetKt$HatchLinkPairingSheet$8$1(hatchDevicePairingViewModel);
                BBI.A0O(bbi, objAaT13);
            }
            InterfaceC7353EnQ interfaceC7353EnQ = (InterfaceC7353EnQ) objAaT13;
            if (((HatchDevicePairingViewState) c1boA02.getValue()).getBlePermissionsGranted()) {
                bfm.AgE(-85973285);
                BBI.A0R(bbi, false);
                function0 = null;
            } else {
                boolean zA1Z = AnonymousClass001.A1Z(hatchDevicePairingViewModel, bfm, -85948918) | AnonymousClass002.A1Q(i6, 256);
                Object objAaT14 = bfm.AaT();
                if (zA1Z || objAaT14 == obj) {
                    objAaT14 = new HatchLinkPairingSheetKt$HatchLinkPairingSheet$9$1(hatchDevicePairingViewModel, str, mutableState);
                    BBI.A0O(bbi, objAaT14);
                }
                function0 = (Function0) objAaT14;
                BBI.A0R(bbi, false);
            }
            HatchDevicePairingBottomSheetsKt.HatchDevicePairingBottomSheets(hatchDevicePairingViewState, hatchDevicePairingViewModel, hatchDevicePairingStrings, bRg2, zIsDeviceSelectionStep, (Function0) interfaceC7353EnQ, function0, null, bfm, HatchDevicePairingViewState.$stable | (HatchDevicePairingViewModel.$stable << 3) | (HatchDevicePairingStrings.$stable << 6) | ((iA08 >> 3) & 7168), 128);
            if (MutableState.A0A(mutableState)) {
                bfm.AgE(-85752471);
                String strA0v = AnonymousClass006.A0v(bfm, R.string.device_pairing_permission_title);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string.device_pairing_permission_body);
                Object objAaT15 = bfm.AaT();
                if (objAaT15 == obj) {
                    objAaT15 = new HatchLinkPairingSheetKt$HatchLinkPairingSheet$10$1(mutableState);
                    BBI.A0O(bbi, objAaT15);
                }
                HatchPermissionDeniedDialogKt.HatchPermissionDeniedDialog(strA0v, strA01, (Function0) objAaT15, null, AbstractC2271BQs.A01(bfm, R.string.device_pairing_permission_open_settings), null, null, null, null, bfm, 384, 488);
            } else {
                bfm.AgE(-85392096);
            }
            BBI.A0R(bbi, false);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass11 = new AnonymousClass11(hatchLinkPairingPurpose, z, str, str2, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass11);
        }
    }

    public static final /* synthetic */ HatchDevicePairingViewState access$HatchLinkActivePairingSheet$lambda$0(C1BO c1bo) {
        return (HatchDevicePairingViewState) c1bo.getValue();
    }

    public static final /* synthetic */ HatchDevicePairingViewState access$HatchLinkPairingSheet$lambda$0(C1BO c1bo) {
        return (HatchDevicePairingViewState) c1bo.getValue();
    }

    public static final /* synthetic */ AuraNavKey access$HatchLinkPairingSheet$lambda$16(C1BO c1bo) {
        return (AuraNavKey) c1bo.getValue();
    }
}
