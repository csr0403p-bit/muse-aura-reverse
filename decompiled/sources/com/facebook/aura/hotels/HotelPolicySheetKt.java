package com.facebook.aura.hotels;

import X.AKO;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
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
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.hotels.HotelLoadState;
import com.facebook.aura.hotels.HotelPolicyViewModel;
import com.facebook.aura.hotels.policy.HotelTaxesDisclosure;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.session.LocalUserSessionKt;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class HotelPolicySheetKt {

    /* renamed from: com.facebook.aura.hotels.HotelPolicySheetKt$HotelPolicySheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HotelPolicySheetKey $key;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HotelPolicySheetKey hotelPolicySheetKey, BRg bRg, int i, int i2) {
            super(2);
            this.$key = hotelPolicySheetKey;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelPolicySheetKt.HotelPolicySheet(this.$key, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.hotels.HotelPolicySheetKt$HotelPolicySheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HotelPolicySheetKey $key;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HotelPolicySheetKey hotelPolicySheetKey, BRg bRg, int i, int i2) {
            super(2);
            this.$key = hotelPolicySheetKey;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HotelPolicySheetKt.HotelPolicySheet(this.$key, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void HotelPolicySheet(HotelPolicySheetKey hotelPolicySheetKey, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass3;
        HotelLoadState.Loaded loaded;
        HotelSelection hotelSelection;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(hotelPolicySheetKey, 0);
        bfm.AgG(-1189417396);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, hotelPolicySheetKey) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BBI bbi = (BBI) bfm;
            HotelPolicyViewModel.Factory factory = new HotelPolicyViewModel.Factory(hotelPolicySheetKey.selection, AKO.A06(LocalUserSessionKt.LocalUserSession, bbi));
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            C1BO c1boA02 = C2CK.A02(bfm, ((HotelPolicyViewModel) C3cH.A0H(factory, bodA00, AnonymousClass005.A0Y(bodA00), C3cG.A0x(HotelPolicyViewModel.class))).selection);
            HotelLoadState hotelLoadState = (HotelLoadState) c1boA02.getValue();
            HotelPolicyCopy hotelPolicyCopy = (!(hotelLoadState instanceof HotelLoadState.Loaded) || (loaded = (HotelLoadState.Loaded) hotelLoadState) == null || (hotelSelection = (HotelSelection) loaded.value) == null) ? null : hotelPolicyCopy(hotelSelection, hotelPolicySheetKey.policy);
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            Object value = c1boA02.getValue();
            boolean zA1S = AnonymousClass004.A1S(bfm, hotelPolicyCopy, auraNavigatorA05, bfm.A65(c1boA02));
            Object objAaT = bfm.AaT();
            if (zA1S || objAaT == C78N.A00) {
                objAaT = new HotelPolicySheetKt$HotelPolicySheet$1$1(hotelPolicyCopy, auraNavigatorA05, c1boA02, null);
                BBI.A0O(bbi, objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, value);
            if (hotelPolicyCopy == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new AnonymousClass2(hotelPolicySheetKey, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass3);
                }
                return;
            }
            String strA01 = hotelPolicyCopy.title;
            if (strA01 == null) {
                bfm.AgE(-568795853);
                strA01 = AbstractC2271BQs.A01(bfm, hotelPolicyCopy.defaultTitle);
            } else {
                bfm.AgE(-568796349);
            }
            BBI.A0R(bbi, false);
            com.facebook.aura.hotels.policy.HotelPolicySheetKt.HotelPolicySheetContent(strA01, hotelPolicyCopy.text, bRg2, hotelPolicyCopy.termsUrl, bfm, (iA0T << 3) & 896, 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(hotelPolicySheetKey, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass3);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HotelPolicy.values().length];
            try {
                AnonymousClass002.A13(HotelPolicy.CANCELLATION, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HotelPolicy.TAXES_AND_FEES, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ HotelLoadState access$HotelPolicySheet$lambda$0(C1BO c1bo) {
        return (HotelLoadState) c1bo.getValue();
    }

    public static final HotelPolicyCopy hotelPolicyCopy(HotelSelection hotelSelection, HotelPolicy hotelPolicy) {
        String partialRefundPolicy;
        int iOrdinal = hotelPolicy.ordinal();
        if (iOrdinal == 0) {
            HotelCancellation hotelCancellation = hotelSelection.cancellation;
            if (hotelCancellation == null || (partialRefundPolicy = HotelBookingModelsKt.getPartialRefundPolicy(hotelCancellation)) == null) {
                return null;
            }
            return new HotelPolicyCopy(null, R.string._name_removed__res_0x7f120326, partialRefundPolicy, null);
        }
        if (iOrdinal != 1) {
            throw C3cG.A0q();
        }
        HotelTaxesDisclosure hotelTaxesDisclosure = hotelSelection.taxesDisclosure;
        if (hotelTaxesDisclosure != null) {
            return new HotelPolicyCopy(hotelTaxesDisclosure.title, R.string._name_removed__res_0x7f12035c, hotelTaxesDisclosure.text, hotelTaxesDisclosure.termsUrl);
        }
        return null;
    }
}
