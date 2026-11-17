package com.facebook.aura.devices.link.ordering;

import X.AHD;
import X.AHG;
import X.AHH;
import X.AHI;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0943AIw;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import com.facebook.aura.checkout.ui.HatchAddressSuggestion;

/* loaded from: classes4.dex */
public final class HatchLinkOrderFormState extends C06G {
    public static final int $stable;
    public final HatchLinkOrderInput addressEntryOriginalInput;
    public final String addressEntryOriginalSelectedAddressId;
    public final AHD<HatchAddressSuggestion> addressSuggestions;
    public final HatchLinkOrderBlockReason blockReason;
    public final String editingAddressId;
    public final HatchLinkOrderInput input;
    public final AHG<HatchLinkOrderField> invalidFields;
    public final boolean isCheckingEligibility;
    public final boolean isLoadingSavedDetails;
    public final boolean isTestOrder;
    public final AHH<HatchLinkSavedAddress> localAddresses;
    public final boolean offersPlans;
    public final HatchLinkOrder order;
    public final HatchLinkPostPurchaseState postPurchase;
    public final HatchLinkSavedDetails savedDetails;
    public final String selectedAddressId;
    public final HatchLinkOrderStep step;
    public final HatchLinkOrderSubmitError submitError;

    /* JADX WARN: Multi-variable type inference failed */
    public HatchLinkOrderFormState(HatchLinkPostPurchaseState hatchLinkPostPurchaseState, HatchLinkOrderStep hatchLinkOrderStep, HatchLinkOrderInput hatchLinkOrderInput, HatchLinkSavedDetails hatchLinkSavedDetails, AHH<HatchLinkSavedAddress> ahh, String str, HatchLinkOrderInput hatchLinkOrderInput2, String str2, String str3, boolean z, boolean z2, AHG<? extends HatchLinkOrderField> ahg, HatchLinkOrderBlockReason hatchLinkOrderBlockReason, boolean z3, boolean z4, HatchLinkOrderSubmitError hatchLinkOrderSubmitError, HatchLinkOrder hatchLinkOrder, AHD<HatchAddressSuggestion> ahd) {
        AnonymousClass005.A11(hatchLinkOrderStep, hatchLinkOrderInput, hatchLinkSavedDetails, 1);
        C7384Etj.A0Y(ahh, 4);
        C3cI.A1I(ahg, 11, ahd);
        this.postPurchase = hatchLinkPostPurchaseState;
        this.step = hatchLinkOrderStep;
        this.input = hatchLinkOrderInput;
        this.savedDetails = hatchLinkSavedDetails;
        this.localAddresses = ahh;
        this.selectedAddressId = str;
        this.addressEntryOriginalInput = hatchLinkOrderInput2;
        this.addressEntryOriginalSelectedAddressId = str2;
        this.editingAddressId = str3;
        this.isLoadingSavedDetails = z;
        this.isCheckingEligibility = z2;
        this.invalidFields = ahg;
        this.blockReason = hatchLinkOrderBlockReason;
        this.offersPlans = z3;
        this.isTestOrder = z4;
        this.submitError = hatchLinkOrderSubmitError;
        this.order = hatchLinkOrder;
        this.addressSuggestions = ahd;
    }

    public final HatchLinkOrderFormState copy(HatchLinkPostPurchaseState hatchLinkPostPurchaseState, HatchLinkOrderStep hatchLinkOrderStep, HatchLinkOrderInput hatchLinkOrderInput, HatchLinkSavedDetails hatchLinkSavedDetails, AHH<HatchLinkSavedAddress> ahh, String str, HatchLinkOrderInput hatchLinkOrderInput2, String str2, String str3, boolean z, boolean z2, AHG<? extends HatchLinkOrderField> ahg, HatchLinkOrderBlockReason hatchLinkOrderBlockReason, boolean z3, boolean z4, HatchLinkOrderSubmitError hatchLinkOrderSubmitError, HatchLinkOrder hatchLinkOrder, AHD<HatchAddressSuggestion> ahd) {
        AnonymousClass005.A11(hatchLinkOrderStep, hatchLinkOrderInput, hatchLinkSavedDetails, 1);
        C7384Etj.A0Y(ahh, 4);
        C3cI.A1I(ahg, 11, ahd);
        return new HatchLinkOrderFormState(hatchLinkPostPurchaseState, hatchLinkOrderStep, hatchLinkOrderInput, hatchLinkSavedDetails, ahh, str, hatchLinkOrderInput2, str2, str3, z, z2, ahg, hatchLinkOrderBlockReason, z3, z4, hatchLinkOrderSubmitError, hatchLinkOrder, ahd);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchLinkOrderFormState) {
                HatchLinkOrderFormState hatchLinkOrderFormState = (HatchLinkOrderFormState) obj;
                if (!C7384Etj.areEqual(this.postPurchase, hatchLinkOrderFormState.postPurchase) || this.step != hatchLinkOrderFormState.step || !C7384Etj.areEqual(this.input, hatchLinkOrderFormState.input) || !C7384Etj.areEqual(this.savedDetails, hatchLinkOrderFormState.savedDetails) || !C7384Etj.areEqual(this.localAddresses, hatchLinkOrderFormState.localAddresses) || !C7384Etj.areEqual(this.selectedAddressId, hatchLinkOrderFormState.selectedAddressId) || !C7384Etj.areEqual(this.addressEntryOriginalInput, hatchLinkOrderFormState.addressEntryOriginalInput) || !C7384Etj.areEqual(this.addressEntryOriginalSelectedAddressId, hatchLinkOrderFormState.addressEntryOriginalSelectedAddressId) || !C7384Etj.areEqual(this.editingAddressId, hatchLinkOrderFormState.editingAddressId) || this.isLoadingSavedDetails != hatchLinkOrderFormState.isLoadingSavedDetails || this.isCheckingEligibility != hatchLinkOrderFormState.isCheckingEligibility || !C7384Etj.areEqual(this.invalidFields, hatchLinkOrderFormState.invalidFields) || this.blockReason != hatchLinkOrderFormState.blockReason || this.offersPlans != hatchLinkOrderFormState.offersPlans || this.isTestOrder != hatchLinkOrderFormState.isTestOrder || this.submitError != hatchLinkOrderFormState.submitError || !C7384Etj.areEqual(this.order, hatchLinkOrderFormState.order) || !C7384Etj.areEqual(this.addressSuggestions, hatchLinkOrderFormState.addressSuggestions)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        int i = HatchAddressSuggestion.$stable | HatchLinkOrder.$stable;
        int i2 = HatchLinkOrderInput.$stable;
        $stable = i | i2 | HatchLinkSavedAddress.$stable | HatchLinkSavedDetails.$stable | i2;
    }

    public static /* synthetic */ HatchLinkOrderFormState copy$default(HatchLinkOrderFormState hatchLinkOrderFormState, HatchLinkPostPurchaseState hatchLinkPostPurchaseState, HatchLinkOrderStep hatchLinkOrderStep, HatchLinkOrderInput hatchLinkOrderInput, HatchLinkSavedDetails hatchLinkSavedDetails, AHH ahh, String str, HatchLinkOrderInput hatchLinkOrderInput2, String str2, String str3, boolean z, boolean z2, AHG ahg, HatchLinkOrderBlockReason hatchLinkOrderBlockReason, boolean z3, boolean z4, HatchLinkOrderSubmitError hatchLinkOrderSubmitError, HatchLinkOrder hatchLinkOrder, AHD ahd, int i, Object obj) {
        HatchLinkPostPurchaseState hatchLinkPostPurchaseState2 = hatchLinkPostPurchaseState;
        HatchLinkOrderStep hatchLinkOrderStep2 = hatchLinkOrderStep;
        HatchLinkOrderInput hatchLinkOrderInput3 = hatchLinkOrderInput;
        HatchLinkSavedDetails hatchLinkSavedDetails2 = hatchLinkSavedDetails;
        AHH ahh2 = ahh;
        String str4 = str;
        HatchLinkOrderInput hatchLinkOrderInput4 = hatchLinkOrderInput2;
        String str5 = str2;
        String str6 = str3;
        boolean z5 = z;
        boolean z6 = z2;
        AHG ahg2 = ahg;
        HatchLinkOrderBlockReason hatchLinkOrderBlockReason2 = hatchLinkOrderBlockReason;
        boolean z7 = z3;
        boolean z8 = z4;
        HatchLinkOrderSubmitError hatchLinkOrderSubmitError2 = hatchLinkOrderSubmitError;
        HatchLinkOrder hatchLinkOrder2 = hatchLinkOrder;
        AHD ahd2 = ahd;
        if ((i & 1) != 0) {
            hatchLinkPostPurchaseState2 = hatchLinkOrderFormState.postPurchase;
        }
        if ((i & 2) != 0) {
            hatchLinkOrderStep2 = hatchLinkOrderFormState.step;
        }
        if ((i & 4) != 0) {
            hatchLinkOrderInput3 = hatchLinkOrderFormState.input;
        }
        if ((i & 8) != 0) {
            hatchLinkSavedDetails2 = hatchLinkOrderFormState.savedDetails;
        }
        if ((i & 16) != 0) {
            ahh2 = hatchLinkOrderFormState.localAddresses;
        }
        if ((i & 32) != 0) {
            str4 = hatchLinkOrderFormState.selectedAddressId;
        }
        if ((i & 64) != 0) {
            hatchLinkOrderInput4 = hatchLinkOrderFormState.addressEntryOriginalInput;
        }
        if ((i & 128) != 0) {
            str5 = hatchLinkOrderFormState.addressEntryOriginalSelectedAddressId;
        }
        if ((i & 256) != 0) {
            str6 = hatchLinkOrderFormState.editingAddressId;
        }
        if ((i & 512) != 0) {
            z5 = hatchLinkOrderFormState.isLoadingSavedDetails;
        }
        if ((i & 1024) != 0) {
            z6 = hatchLinkOrderFormState.isCheckingEligibility;
        }
        if ((i & 2048) != 0) {
            ahg2 = hatchLinkOrderFormState.invalidFields;
        }
        if ((i & 4096) != 0) {
            hatchLinkOrderBlockReason2 = hatchLinkOrderFormState.blockReason;
        }
        if ((i & 8192) != 0) {
            z7 = hatchLinkOrderFormState.offersPlans;
        }
        if ((i & 16384) != 0) {
            z8 = hatchLinkOrderFormState.isTestOrder;
        }
        if ((i & 32768) != 0) {
            hatchLinkOrderSubmitError2 = hatchLinkOrderFormState.submitError;
        }
        if ((i & 65536) != 0) {
            hatchLinkOrder2 = hatchLinkOrderFormState.order;
        }
        if ((i & 131072) != 0) {
            ahd2 = hatchLinkOrderFormState.addressSuggestions;
        }
        String str7 = str4;
        HatchLinkOrderInput hatchLinkOrderInput5 = hatchLinkOrderInput4;
        String str8 = str5;
        return hatchLinkOrderFormState.copy(hatchLinkPostPurchaseState2, hatchLinkOrderStep2, hatchLinkOrderInput3, hatchLinkSavedDetails2, ahh2, str7, hatchLinkOrderInput5, str8, str6, z5, z6, ahg2, hatchLinkOrderBlockReason2, z7, z8, hatchLinkOrderSubmitError2, hatchLinkOrder2, ahd2);
    }

    public final HatchLinkPostPurchaseState component1() {
        return this.postPurchase;
    }

    public final boolean component10() {
        return this.isLoadingSavedDetails;
    }

    public final boolean component11() {
        return this.isCheckingEligibility;
    }

    public final AHG<HatchLinkOrderField> component12() {
        return this.invalidFields;
    }

    public final HatchLinkOrderBlockReason component13() {
        return this.blockReason;
    }

    public final boolean component14() {
        return this.offersPlans;
    }

    public final boolean component15() {
        return this.isTestOrder;
    }

    public final HatchLinkOrderSubmitError component16() {
        return this.submitError;
    }

    public final HatchLinkOrder component17() {
        return this.order;
    }

    public final AHD<HatchAddressSuggestion> component18() {
        return this.addressSuggestions;
    }

    public final HatchLinkOrderStep component2() {
        return this.step;
    }

    public final HatchLinkOrderInput component3() {
        return this.input;
    }

    public final HatchLinkSavedDetails component4() {
        return this.savedDetails;
    }

    public final AHH<HatchLinkSavedAddress> component5() {
        return this.localAddresses;
    }

    public final String component6() {
        return this.selectedAddressId;
    }

    public final HatchLinkOrderInput component7() {
        return this.addressEntryOriginalInput;
    }

    public final String component8() {
        return this.addressEntryOriginalSelectedAddressId;
    }

    public final String component9() {
        return this.editingAddressId;
    }

    public final HatchLinkOrderInput getAddressEntryOriginalInput() {
        return this.addressEntryOriginalInput;
    }

    public final String getAddressEntryOriginalSelectedAddressId() {
        return this.addressEntryOriginalSelectedAddressId;
    }

    public final AHD<HatchAddressSuggestion> getAddressSuggestions() {
        return this.addressSuggestions;
    }

    public final HatchLinkOrderBlockReason getBlockReason() {
        return this.blockReason;
    }

    public final String getEditingAddressId() {
        return this.editingAddressId;
    }

    public final HatchLinkOrderInput getInput() {
        return this.input;
    }

    public final AHG<HatchLinkOrderField> getInvalidFields() {
        return this.invalidFields;
    }

    public final AHH<HatchLinkSavedAddress> getLocalAddresses() {
        return this.localAddresses;
    }

    public final boolean getOffersPlans() {
        return this.offersPlans;
    }

    public final HatchLinkOrder getOrder() {
        return this.order;
    }

    public final HatchLinkPostPurchaseState getPostPurchase() {
        return this.postPurchase;
    }

    public final HatchLinkSavedDetails getSavedDetails() {
        return this.savedDetails;
    }

    public final String getSelectedAddressId() {
        return this.selectedAddressId;
    }

    public final boolean getShowOrderInfoSheet() {
        if (this.offersPlans) {
            return true;
        }
        if (this.blockReason != null || this.isCheckingEligibility) {
            return false;
        }
        if (this.step != HatchLinkOrderStep.INFO) {
            return isContinuing() && this.postPurchase == null;
        }
        return true;
    }

    public final HatchLinkOrderStep getStep() {
        return this.step;
    }

    public final HatchLinkOrderSubmitError getSubmitError() {
        return this.submitError;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.addressSuggestions, (((C0KA.A01(C0KA.A01((AnonymousClass005.A0F(this.invalidFields, C0KA.A01(C0KA.A01((((((((AnonymousClass005.A0F(this.localAddresses, AnonymousClass005.A0F(this.savedDetails, AnonymousClass005.A0F(this.input, AnonymousClass005.A0F(this.step, AnonymousClass006.A0D(this.postPurchase) * 31)))) + AnonymousClass006.A0G(this.selectedAddressId)) * 31) + AnonymousClass006.A0D(this.addressEntryOriginalInput)) * 31) + AnonymousClass006.A0G(this.addressEntryOriginalSelectedAddressId)) * 31) + AnonymousClass006.A0G(this.editingAddressId)) * 31, this.isLoadingSavedDetails), this.isCheckingEligibility)) + AnonymousClass006.A0D(this.blockReason)) * 31, this.offersPlans), this.isTestOrder) + AnonymousClass006.A0D(this.submitError)) * 31) + C3cH.A02(this.order)) * 31);
    }

    public final boolean isCheckingEligibility() {
        return this.isCheckingEligibility;
    }

    public final boolean isContinuing() {
        return this.step == HatchLinkOrderStep.DETAILS && this.isLoadingSavedDetails;
    }

    public final boolean isLoadingSavedDetails() {
        return this.isLoadingSavedDetails;
    }

    public final boolean isTestOrder() {
        return this.isTestOrder;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchLinkOrderFormState(HatchLinkPostPurchaseState hatchLinkPostPurchaseState, HatchLinkOrderStep hatchLinkOrderStep, HatchLinkOrderInput hatchLinkOrderInput, HatchLinkSavedDetails hatchLinkSavedDetails, AHH ahh, String str, HatchLinkOrderInput hatchLinkOrderInput2, String str2, String str3, boolean z, boolean z2, AHG ahg, HatchLinkOrderBlockReason hatchLinkOrderBlockReason, boolean z3, boolean z4, HatchLinkOrderSubmitError hatchLinkOrderSubmitError, HatchLinkOrder hatchLinkOrder, AHD ahd, int i, C06H c06h) {
        this((i & 1) != 0 ? null : hatchLinkPostPurchaseState, (i & 2) != 0 ? HatchLinkOrderStep.INFO : hatchLinkOrderStep, (i & 4) != 0 ? HatchLinkOrderStateMachineKt.EMPTY_INPUT : hatchLinkOrderInput, (i & 8) != 0 ? new HatchLinkSavedDetails(AHI.A01) : hatchLinkSavedDetails, (i & 16) != 0 ? AHI.A01 : ahh, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : hatchLinkOrderInput2, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : str3, C3cG.A1K(i & 512, z), C3cG.A1K(i & 1024, z2), (i & 2048) != 0 ? C0943AIw.A03 : ahg, (i & 4096) != 0 ? null : hatchLinkOrderBlockReason, C3cG.A1K(i & 8192, z3), C3cG.A1K(i & 16384, z4), (i & 32768) != 0 ? null : hatchLinkOrderSubmitError, (i & 65536) != 0 ? null : hatchLinkOrder, (i & 131072) != 0 ? AHI.A01 : ahd);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchLinkOrderFormState() {
        boolean z = false;
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 262143, 0 == true ? 1 : 0);
    }
}
