package com.facebook.aura.agentpermission;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BRg;
import X.C07C;
import X.C1BO;
import X.C2CK;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C78N;
import X.G0V;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.DeliveryCheckoutStopViewModel;
import com.facebook.aura.gateway.DeliveryCheckoutStopRole;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class DeliveryCheckoutSheetsKt {

    /* renamed from: com.facebook.aura.agentpermission.DeliveryCheckoutSheetsKt$DeliveryCheckoutStopSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ DeliveryStopDetailsUiState $details;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DeliveryStopDetailsUiState deliveryStopDetailsUiState) {
            super(3);
            this.$details = deliveryStopDetailsUiState;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                DeliveryStopDetailsKt.DeliveryStopDetails(this.$details, null, bfm, DeliveryStopDetailsUiState.$stable, 2);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.DeliveryCheckoutSheetsKt$DeliveryCheckoutStopSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $approvalId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $stopId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$approvalId = str;
            this.$stopId = str2;
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
            DeliveryCheckoutSheetsKt.DeliveryCheckoutStopSheet(this.$approvalId, this.$stopId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeliveryCheckoutStopRole.values().length];
            try {
                AnonymousClass002.A13(DeliveryCheckoutStopRole.PICKUP, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(DeliveryCheckoutStopRole.DROPOFF, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void DeliveryCheckoutStopSheet(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass3;
        int i3;
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(str, str2);
        bfm.AgG(54618832);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            DeliveryCheckoutStopViewModel.Factory factory = new DeliveryCheckoutStopViewModel.Factory(AnonymousClass002.A0h(bfm), str, str2);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            C1BO c1boA02 = C2CK.A02(bfm, ((DeliveryCheckoutStopViewModel) C3cH.A0H(factory, bodA00, AnonymousClass005.A0Y(bodA00), C3cG.A0x(DeliveryCheckoutStopViewModel.class))).uiState);
            Boolean boolValueOf = Boolean.valueOf(((DeliveryCheckoutStopUiState) c1boA02.getValue()).dismissed);
            boolean zA1J = AnonymousClass003.A1J(bfm, c1boA02, auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA1J || objAaT == C78N.A00) {
                objAaT = new DeliveryCheckoutSheetsKt$DeliveryCheckoutStopSheet$1$1(auraNavigatorA0b, c1boA02);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, boolValueOf);
            DeliveryStopDetailsUiState deliveryStopDetailsUiState = ((DeliveryCheckoutStopUiState) c1boA02.getValue()).details;
            if (deliveryStopDetailsUiState == null) {
                bfm.AgE(-642428464);
                if (((DeliveryCheckoutStopUiState) c1boA02.getValue()).awaitingApproval) {
                    bfm.AgE(349382225);
                    AgentPermissionDecisionSheetKt.AgentPermissionDecisionLoading(bRg2, bfm, (iA0d >> 6) & 14, 0);
                } else {
                    bfm.AgE(-2054003900);
                }
                AnonymousClass006.A1N(bfm);
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new DeliveryCheckoutSheetsKt$DeliveryCheckoutStopSheet$details$1$1(str, str2, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass3);
                }
                return;
            }
            AnonymousClass003.A0l(bfm, 949106927);
            AuraContainer.SecondaryBottomSheet secondaryBottomSheet = AuraContainer.SecondaryBottomSheet.INSTANCE;
            int iOrdinal = deliveryStopDetailsUiState.role.ordinal();
            if (iOrdinal == 0) {
                i3 = R.string._name_removed__res_0x7f1200b6;
            } else {
                if (iOrdinal != zA1a) {
                    throw C3cG.A0q();
                }
                i3 = R.string._name_removed__res_0x7f1200ab;
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(secondaryBottomSheet, bRg2, null, new AuraBottomSheetHeaderConfig(AbstractC2271BQs.A01(bfm, i3), null, null, null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null), ComposableSingletons$DeliveryCheckoutSheetsKt.lambda$1925546103, null, null, false, false, false, null, B1V.A00(bfm, new AnonymousClass2(deliveryStopDetailsUiState), -1672768717), bfm, ((iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 24582, 48, 2020);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(str, str2, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass3);
        }
    }

    public static final /* synthetic */ DeliveryCheckoutStopUiState access$DeliveryCheckoutStopSheet$lambda$0(C1BO c1bo) {
        return (DeliveryCheckoutStopUiState) c1bo.getValue();
    }
}
