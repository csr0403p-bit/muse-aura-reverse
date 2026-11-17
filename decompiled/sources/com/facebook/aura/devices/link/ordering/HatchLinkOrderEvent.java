package com.facebook.aura.devices.link.ordering;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes4.dex */
public interface HatchLinkOrderEvent {

    public final class ActivationTimedOut implements HatchLinkOrderEvent {
        public static final int $stable = 0;
        public static final ActivationTimedOut INSTANCE = new ActivationTimedOut();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ActivationTimedOut);
        }

        public String toString() {
            return "ActivationTimedOut";
        }

        public int hashCode() {
            return 861013244;
        }
    }

    public final class AddAddressPressed extends C06G implements HatchLinkOrderEvent {
        public static final int $stable = HatchLinkOrderInput.$stable;
        public final HatchLinkOrderInput input;

        public AddAddressPressed(HatchLinkOrderInput hatchLinkOrderInput) {
            C7384Etj.A0Y(hatchLinkOrderInput, 0);
            this.input = hatchLinkOrderInput;
        }

        public final AddAddressPressed copy(HatchLinkOrderInput hatchLinkOrderInput) {
            C7384Etj.A0Y(hatchLinkOrderInput, 0);
            return new AddAddressPressed(hatchLinkOrderInput);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof AddAddressPressed) && C7384Etj.areEqual(this.input, ((AddAddressPressed) obj).input));
        }

        public static /* synthetic */ AddAddressPressed copy$default(AddAddressPressed addAddressPressed, HatchLinkOrderInput hatchLinkOrderInput, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchLinkOrderInput = addAddressPressed.input;
            }
            C7384Etj.A0Y(hatchLinkOrderInput, 0);
            return new AddAddressPressed(hatchLinkOrderInput);
        }

        public final HatchLinkOrderInput component1() {
            return this.input;
        }

        public final HatchLinkOrderInput getInput() {
            return this.input;
        }

        public int hashCode() {
            return this.input.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class AddressSelected extends C06G implements HatchLinkOrderEvent {
        public static final int $stable = 0;
        public final String id;

        public AddressSelected(String str) {
            C7384Etj.A0Y(str, 0);
            this.id = str;
        }

        public final AddressSelected copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new AddressSelected(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof AddressSelected) && C7384Etj.areEqual(this.id, ((AddressSelected) obj).id));
        }

        public static /* synthetic */ AddressSelected copy$default(AddressSelected addressSelected, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = addressSelected.id;
            }
            C7384Etj.A0Y(str, 0);
            return new AddressSelected(str);
        }

        public final String component1() {
            return this.id;
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class BackPressed extends C06G implements HatchLinkOrderEvent {
        public static final int $stable = HatchLinkOrderInput.$stable;
        public final HatchLinkOrderInput input;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof BackPressed) && C7384Etj.areEqual(this.input, ((BackPressed) obj).input));
        }

        public /* synthetic */ BackPressed(HatchLinkOrderInput hatchLinkOrderInput, int i, C06H c06h) {
            this((i & 1) != 0 ? null : hatchLinkOrderInput);
        }

        public static /* synthetic */ BackPressed copy$default(BackPressed backPressed, HatchLinkOrderInput hatchLinkOrderInput, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchLinkOrderInput = backPressed.input;
            }
            return new BackPressed(hatchLinkOrderInput);
        }

        public final HatchLinkOrderInput component1() {
            return this.input;
        }

        public final BackPressed copy(HatchLinkOrderInput hatchLinkOrderInput) {
            return new BackPressed(hatchLinkOrderInput);
        }

        public final HatchLinkOrderInput getInput() {
            return this.input;
        }

        public int hashCode() {
            return AnonymousClass006.A0D(this.input);
        }

        public String toString() {
            return super.toString();
        }

        public BackPressed(HatchLinkOrderInput hatchLinkOrderInput) {
            this.input = hatchLinkOrderInput;
        }

        public BackPressed() {
            this(null);
        }
    }

    public final class ContinuePressed implements HatchLinkOrderEvent {
        public static final int $stable = 0;
        public static final ContinuePressed INSTANCE = new ContinuePressed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ContinuePressed);
        }

        public String toString() {
            return "ContinuePressed";
        }

        public int hashCode() {
            return -1386168660;
        }
    }

    public final class DetailsPrepared extends C06G implements HatchLinkOrderEvent {
        public static final int $stable = 0;
        public final HatchLinkOrderBlockReason blockReason;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof DetailsPrepared) && this.blockReason == ((DetailsPrepared) obj).blockReason);
        }

        public static /* synthetic */ DetailsPrepared copy$default(DetailsPrepared detailsPrepared, HatchLinkOrderBlockReason hatchLinkOrderBlockReason, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchLinkOrderBlockReason = detailsPrepared.blockReason;
            }
            return new DetailsPrepared(hatchLinkOrderBlockReason);
        }

        public final HatchLinkOrderBlockReason component1() {
            return this.blockReason;
        }

        public final DetailsPrepared copy(HatchLinkOrderBlockReason hatchLinkOrderBlockReason) {
            return new DetailsPrepared(hatchLinkOrderBlockReason);
        }

        public final HatchLinkOrderBlockReason getBlockReason() {
            return this.blockReason;
        }

        public int hashCode() {
            return AnonymousClass006.A0D(this.blockReason);
        }

        public DetailsPrepared(HatchLinkOrderBlockReason hatchLinkOrderBlockReason) {
            this.blockReason = hatchLinkOrderBlockReason;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class EditAddressPressed extends C06G implements HatchLinkOrderEvent {
        public static final int $stable = HatchLinkOrderInput.$stable;
        public final String id;
        public final HatchLinkOrderInput input;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof EditAddressPressed) {
                    EditAddressPressed editAddressPressed = (EditAddressPressed) obj;
                    if (!C7384Etj.areEqual(this.id, editAddressPressed.id) || !C7384Etj.areEqual(this.input, editAddressPressed.input)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ EditAddressPressed copy$default(EditAddressPressed editAddressPressed, String str, HatchLinkOrderInput hatchLinkOrderInput, int i, Object obj) {
            if ((i & 1) != 0) {
                str = editAddressPressed.id;
            }
            if ((i & 2) != 0) {
                hatchLinkOrderInput = editAddressPressed.input;
            }
            AnonymousClass003.A0u(str, hatchLinkOrderInput);
            return new EditAddressPressed(str, hatchLinkOrderInput);
        }

        public final String component1() {
            return this.id;
        }

        public final HatchLinkOrderInput component2() {
            return this.input;
        }

        public final String getId() {
            return this.id;
        }

        public final HatchLinkOrderInput getInput() {
            return this.input;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.input, AnonymousClass001.A0G(this.id));
        }

        public EditAddressPressed(String str, HatchLinkOrderInput hatchLinkOrderInput) {
            AnonymousClass003.A0u(str, hatchLinkOrderInput);
            this.id = str;
            this.input = hatchLinkOrderInput;
        }

        public final EditAddressPressed copy(String str, HatchLinkOrderInput hatchLinkOrderInput) {
            AnonymousClass003.A0u(str, hatchLinkOrderInput);
            return new EditAddressPressed(str, hatchLinkOrderInput);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class EligibilityResolved extends C06G implements HatchLinkOrderEvent {
        public static final int $stable = 0;
        public final HatchLinkOrderBlockReason blockReason;
        public final boolean isTestOrder;
        public final boolean offersPlans;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof EligibilityResolved) {
                    EligibilityResolved eligibilityResolved = (EligibilityResolved) obj;
                    if (this.blockReason != eligibilityResolved.blockReason || this.offersPlans != eligibilityResolved.offersPlans || this.isTestOrder != eligibilityResolved.isTestOrder) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ EligibilityResolved copy$default(EligibilityResolved eligibilityResolved, HatchLinkOrderBlockReason hatchLinkOrderBlockReason, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchLinkOrderBlockReason = eligibilityResolved.blockReason;
            }
            if ((i & 2) != 0) {
                z = eligibilityResolved.offersPlans;
            }
            if ((i & 4) != 0) {
                z2 = eligibilityResolved.isTestOrder;
            }
            return new EligibilityResolved(hatchLinkOrderBlockReason, z, z2);
        }

        public final HatchLinkOrderBlockReason component1() {
            return this.blockReason;
        }

        public final boolean component2() {
            return this.offersPlans;
        }

        public final boolean component3() {
            return this.isTestOrder;
        }

        public final EligibilityResolved copy(HatchLinkOrderBlockReason hatchLinkOrderBlockReason, boolean z, boolean z2) {
            return new EligibilityResolved(hatchLinkOrderBlockReason, z, z2);
        }

        public final HatchLinkOrderBlockReason getBlockReason() {
            return this.blockReason;
        }

        public final boolean getOffersPlans() {
            return this.offersPlans;
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A01(AnonymousClass006.A0D(this.blockReason) * 31, this.offersPlans), this.isTestOrder);
        }

        public final boolean isTestOrder() {
            return this.isTestOrder;
        }

        public EligibilityResolved(HatchLinkOrderBlockReason hatchLinkOrderBlockReason, boolean z, boolean z2) {
            this.blockReason = hatchLinkOrderBlockReason;
            this.offersPlans = z;
            this.isTestOrder = z2;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class SaveAddressPressed extends C06G implements HatchLinkOrderEvent {
        public static final int $stable = HatchLinkOrderInput.$stable;
        public final HatchLinkOrderInput input;

        public SaveAddressPressed(HatchLinkOrderInput hatchLinkOrderInput) {
            C7384Etj.A0Y(hatchLinkOrderInput, 0);
            this.input = hatchLinkOrderInput;
        }

        public final SaveAddressPressed copy(HatchLinkOrderInput hatchLinkOrderInput) {
            C7384Etj.A0Y(hatchLinkOrderInput, 0);
            return new SaveAddressPressed(hatchLinkOrderInput);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof SaveAddressPressed) && C7384Etj.areEqual(this.input, ((SaveAddressPressed) obj).input));
        }

        public static /* synthetic */ SaveAddressPressed copy$default(SaveAddressPressed saveAddressPressed, HatchLinkOrderInput hatchLinkOrderInput, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchLinkOrderInput = saveAddressPressed.input;
            }
            C7384Etj.A0Y(hatchLinkOrderInput, 0);
            return new SaveAddressPressed(hatchLinkOrderInput);
        }

        public final HatchLinkOrderInput component1() {
            return this.input;
        }

        public final HatchLinkOrderInput getInput() {
            return this.input;
        }

        public int hashCode() {
            return this.input.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class SavedDetailsLoaded extends C06G implements HatchLinkOrderEvent {
        public static final int $stable = HatchLinkSavedDetails.$stable;
        public final HatchLinkSavedDetails details;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof SavedDetailsLoaded) && C7384Etj.areEqual(this.details, ((SavedDetailsLoaded) obj).details));
        }

        public static /* synthetic */ SavedDetailsLoaded copy$default(SavedDetailsLoaded savedDetailsLoaded, HatchLinkSavedDetails hatchLinkSavedDetails, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchLinkSavedDetails = savedDetailsLoaded.details;
            }
            return new SavedDetailsLoaded(hatchLinkSavedDetails);
        }

        public final HatchLinkSavedDetails component1() {
            return this.details;
        }

        public final SavedDetailsLoaded copy(HatchLinkSavedDetails hatchLinkSavedDetails) {
            return new SavedDetailsLoaded(hatchLinkSavedDetails);
        }

        public final HatchLinkSavedDetails getDetails() {
            return this.details;
        }

        public int hashCode() {
            return AnonymousClass006.A0D(this.details);
        }

        public SavedDetailsLoaded(HatchLinkSavedDetails hatchLinkSavedDetails) {
            this.details = hatchLinkSavedDetails;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class SubmitFinished extends C06G implements HatchLinkOrderEvent {
        public static final int $stable = 8;
        public final HatchLinkOrderResult result;

        public SubmitFinished(HatchLinkOrderResult hatchLinkOrderResult) {
            C7384Etj.A0Y(hatchLinkOrderResult, 0);
            this.result = hatchLinkOrderResult;
        }

        public final SubmitFinished copy(HatchLinkOrderResult hatchLinkOrderResult) {
            C7384Etj.A0Y(hatchLinkOrderResult, 0);
            return new SubmitFinished(hatchLinkOrderResult);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof SubmitFinished) && C7384Etj.areEqual(this.result, ((SubmitFinished) obj).result));
        }

        public static /* synthetic */ SubmitFinished copy$default(SubmitFinished submitFinished, HatchLinkOrderResult hatchLinkOrderResult, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchLinkOrderResult = submitFinished.result;
            }
            C7384Etj.A0Y(hatchLinkOrderResult, 0);
            return new SubmitFinished(hatchLinkOrderResult);
        }

        public final HatchLinkOrderResult component1() {
            return this.result;
        }

        public final HatchLinkOrderResult getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class SubmitPressed extends C06G implements HatchLinkOrderEvent {
        public static final int $stable = HatchLinkOrderInput.$stable;
        public final HatchLinkOrderInput input;

        public SubmitPressed(HatchLinkOrderInput hatchLinkOrderInput) {
            C7384Etj.A0Y(hatchLinkOrderInput, 0);
            this.input = hatchLinkOrderInput;
        }

        public final SubmitPressed copy(HatchLinkOrderInput hatchLinkOrderInput) {
            C7384Etj.A0Y(hatchLinkOrderInput, 0);
            return new SubmitPressed(hatchLinkOrderInput);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof SubmitPressed) && C7384Etj.areEqual(this.input, ((SubmitPressed) obj).input));
        }

        public static /* synthetic */ SubmitPressed copy$default(SubmitPressed submitPressed, HatchLinkOrderInput hatchLinkOrderInput, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchLinkOrderInput = submitPressed.input;
            }
            C7384Etj.A0Y(hatchLinkOrderInput, 0);
            return new SubmitPressed(hatchLinkOrderInput);
        }

        public final HatchLinkOrderInput component1() {
            return this.input;
        }

        public final HatchLinkOrderInput getInput() {
            return this.input;
        }

        public int hashCode() {
            return this.input.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class SubscriptionActivated extends C06G implements HatchLinkOrderEvent {
        public static final int $stable = 0;
        public final boolean isTestOrder;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof SubscriptionActivated) && this.isTestOrder == ((SubscriptionActivated) obj).isTestOrder);
        }

        public static /* synthetic */ SubscriptionActivated copy$default(SubscriptionActivated subscriptionActivated, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = subscriptionActivated.isTestOrder;
            }
            return new SubscriptionActivated(z);
        }

        public final boolean component1() {
            return this.isTestOrder;
        }

        public final SubscriptionActivated copy(boolean z) {
            return new SubscriptionActivated(z);
        }

        public int hashCode() {
            return this.isTestOrder ? 1231 : 1237;
        }

        public final boolean isTestOrder() {
            return this.isTestOrder;
        }

        public SubscriptionActivated(boolean z) {
            this.isTestOrder = z;
        }

        public String toString() {
            return super.toString();
        }
    }
}
