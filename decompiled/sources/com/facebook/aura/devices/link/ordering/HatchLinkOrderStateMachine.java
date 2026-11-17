package com.facebook.aura.devices.link.ordering;

import X.AGI;
import X.AHG;
import X.AIX;
import X.AIY;
import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06827l3;
import X.C0943AIw;
import X.C0944AIx;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.C8j3;
import android.telephony.PhoneNumberUtils;
import android.util.Patterns;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderEffect;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderEvent;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderResult;
import com.facebook.aura.payments.cardvalidation.HatchCardFieldState;
import com.facebook.aura.payments.cardvalidation.HatchCardValidator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class HatchLinkOrderStateMachine {
    public static final int $stable = 0;
    public static final int MAX_EMAIL_LENGTH = 254;
    public static final int MAX_PHONE_LENGTH = 32;
    public static final HatchLinkOrderStateMachine INSTANCE = new HatchLinkOrderStateMachine();
    public static final C06827l3 PHONE_SEPARATORS = C06827l3.A02("[\\s()\\-.]");

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[PHI: r7
  0x004f: PHI (r7v3 com.facebook.aura.devices.link.ordering.HatchLinkOrderInput) = 
  (r7v0 com.facebook.aura.devices.link.ordering.HatchLinkOrderInput)
  (r7v4 com.facebook.aura.devices.link.ordering.HatchLinkOrderInput)
 binds: [B:14:0x004d, B:12:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053 A[PHI: r7
  0x0053: PHI (r7v2 com.facebook.aura.devices.link.ordering.HatchLinkOrderInput) = 
  (r7v0 com.facebook.aura.devices.link.ordering.HatchLinkOrderInput)
  (r7v3 com.facebook.aura.devices.link.ordering.HatchLinkOrderInput)
 binds: [B:14:0x004d, B:16:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.devices.link.ordering.HatchLinkOrderTransition loadedSavedDetails(com.facebook.aura.devices.link.ordering.HatchLinkOrderFormState r23, com.facebook.aura.devices.link.ordering.HatchLinkSavedDetails r24) {
        /*
            r22 = this;
            r3 = 0
            r4 = r23
            r8 = r24
            if (r24 != 0) goto L2e
            r23 = 261631(0x3fdff, float:3.66623E-40)
            r5 = 0
            r14 = 0
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r12 = r5
            r13 = r5
            r15 = r14
            r16 = r5
            r17 = r5
            r18 = r14
            r19 = r14
            r20 = r5
            r21 = r5
            r22 = r5
            r24 = r5
            com.facebook.aura.devices.link.ordering.HatchLinkOrderFormState r0 = com.facebook.aura.devices.link.ordering.HatchLinkOrderFormState.copy$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            com.facebook.aura.devices.link.ordering.HatchLinkOrderTransition r0 = X.C8j3.A0p(r0, r5)
            return r0
        L2e:
            X.AHD<com.facebook.aura.devices.link.ordering.HatchLinkSavedAddress> r0 = r8.addresses
            java.lang.Object r2 = X.AbstractC0878AGe.A0G(r0)
            com.facebook.aura.devices.link.ordering.HatchLinkOrderStateMachine r1 = com.facebook.aura.devices.link.ordering.HatchLinkOrderStateMachine.INSTANCE
            com.facebook.aura.devices.link.ordering.HatchLinkOrderInput r0 = r4.input
            boolean r0 = r1.hasAddress(r0)
            if (r0 == 0) goto L3f
            r2 = r3
        L3f:
            com.facebook.aura.devices.link.ordering.HatchLinkSavedAddress r2 = (com.facebook.aura.devices.link.ordering.HatchLinkSavedAddress) r2
            if (r2 == 0) goto L4b
            com.facebook.aura.devices.link.ordering.HatchLinkOrderInput r0 = r4.input
            com.facebook.aura.devices.link.ordering.HatchLinkOrderInput r7 = r1.withAddress(r0, r2)
            if (r7 != 0) goto L4f
        L4b:
            com.facebook.aura.devices.link.ordering.HatchLinkOrderInput r7 = r4.input
            if (r2 == 0) goto L53
        L4f:
            java.lang.String r10 = r2.id
            if (r10 != 0) goto L55
        L53:
            java.lang.String r10 = r4.selectedAddressId
        L55:
            r23 = 261587(0x3fdd3, float:3.66561E-40)
            r5 = 0
            r14 = 0
            r6 = r5
            r9 = r5
            r11 = r5
            r12 = r5
            r13 = r5
            r15 = r14
            r16 = r5
            r17 = r5
            r18 = r14
            r19 = r14
            r20 = r5
            r21 = r5
            r22 = r5
            r24 = r5
            com.facebook.aura.devices.link.ordering.HatchLinkOrderFormState r0 = com.facebook.aura.devices.link.ordering.HatchLinkOrderFormState.copy$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            com.facebook.aura.devices.link.ordering.HatchLinkOrderTransition r0 = X.C8j3.A0p(r0, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.link.ordering.HatchLinkOrderStateMachine.loadedSavedDetails(com.facebook.aura.devices.link.ordering.HatchLinkOrderFormState, com.facebook.aura.devices.link.ordering.HatchLinkSavedDetails):com.facebook.aura.devices.link.ordering.HatchLinkOrderTransition");
    }

    private final HatchLinkOrderInput normalizeAddress(HatchLinkOrderInput hatchLinkOrderInput) {
        String strNormalizedUsStateCode = HatchLinkOrderStateMachineKt.normalizedUsStateCode(hatchLinkOrderInput.state);
        if (strNormalizedUsStateCode == null) {
            strNormalizedUsStateCode = AnonymousClass002.A0l(hatchLinkOrderInput.state);
        }
        return HatchLinkOrderInput.copy$default(hatchLinkOrderInput, null, null, null, null, null, null, null, strNormalizedUsStateCode, null, 383, null);
    }

    public final AHG<HatchLinkOrderField> validate(HatchLinkOrderStep hatchLinkOrderStep, HatchLinkOrderInput hatchLinkOrderInput) {
        C7384Etj.A0Y(hatchLinkOrderStep, 0);
        C7384Etj.A0Y(hatchLinkOrderInput, 1);
        int iOrdinal = hatchLinkOrderStep.ordinal();
        if (iOrdinal == 2) {
            return validateAddress(hatchLinkOrderInput);
        }
        if (iOrdinal != 1) {
            return C0943AIw.A03;
        }
        AIY aiy = new AIY();
        if (C7BY.A0j(hatchLinkOrderInput.firstName)) {
            aiy.add(HatchLinkOrderField.FIRST_NAME);
        }
        if (C7BY.A0j(hatchLinkOrderInput.lastName)) {
            aiy.add(HatchLinkOrderField.LAST_NAME);
        }
        HatchLinkOrderStateMachine hatchLinkOrderStateMachine = INSTANCE;
        aiy.addAll(hatchLinkOrderStateMachine.validateAddress(hatchLinkOrderInput));
        if (!hatchLinkOrderStateMachine.isPlausibleEmail(hatchLinkOrderInput.email)) {
            aiy.add(HatchLinkOrderField.EMAIL);
        }
        if (!hatchLinkOrderStateMachine.isPlausiblePhone(hatchLinkOrderInput.phone)) {
            aiy.add(HatchLinkOrderField.PHONE);
        }
        return AGI.A0H(AIX.A00(aiy));
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[HatchLinkOrderStep.values().length];
            try {
                AnonymousClass005.A0v(HatchLinkOrderStep.ADDRESS_ENTRY, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(HatchLinkOrderStep.SUBMITTING, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(HatchLinkOrderStep.DETAILS, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchLinkOrderStep.INFO, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(HatchLinkOrderStep.CONFIRMED, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HatchLinkOrderDetailsPreparation.values().length];
            try {
                AnonymousClass005.A0v(HatchLinkOrderDetailsPreparation.NOT_STARTED, iArr2, 1);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass005.A0v(HatchLinkOrderDetailsPreparation.IN_PROGRESS, iArr2, 2);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass005.A0v(HatchLinkOrderDetailsPreparation.COMPLETE, iArr2, 3);
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private final HatchLinkOrderTransition activationTimedOut(HatchLinkOrderFormState hatchLinkOrderFormState) {
        HatchLinkOrderFormState hatchLinkOrderFormStateCopy$default = hatchLinkOrderFormState;
        HatchLinkPostPurchaseState hatchLinkPostPurchaseState = hatchLinkOrderFormStateCopy$default.postPurchase;
        if ((hatchLinkPostPurchaseState != null ? hatchLinkPostPurchaseState.activation : null) == HatchLinkSubscriptionActivation.WAITING) {
            hatchLinkOrderFormStateCopy$default = HatchLinkOrderFormState.copy$default(hatchLinkOrderFormStateCopy$default, hatchLinkPostPurchaseState.copy(HatchLinkSubscriptionActivation.TIMED_OUT, hatchLinkPostPurchaseState.continueRequested, hatchLinkPostPurchaseState.detailsPreparation), null, null, null, null, null, null, null, null, false, false, null, null, false, false, null, null, null, 262142, null);
        }
        return C8j3.A0p(hatchLinkOrderFormStateCopy$default, null);
    }

    private final HatchLinkOrderTransition cancelAddressEntry(HatchLinkOrderFormState hatchLinkOrderFormState) {
        HatchLinkOrderStep hatchLinkOrderStep = HatchLinkOrderStep.DETAILS;
        HatchLinkOrderInput hatchLinkOrderInput = hatchLinkOrderFormState.addressEntryOriginalInput;
        if (hatchLinkOrderInput == null) {
            hatchLinkOrderInput = hatchLinkOrderFormState.input;
        }
        return C8j3.A0p(HatchLinkOrderFormState.copy$default(hatchLinkOrderFormState, null, hatchLinkOrderStep, hatchLinkOrderInput, null, null, hatchLinkOrderFormState.addressEntryOriginalSelectedAddressId, null, null, null, false, false, hatchLinkOrderFormState.invalidFields.Aak(HatchLinkOrderStateMachineKt.ADDRESS_FIELDS), null, false, false, null, null, null, 226841, null), null);
    }

    private final HatchLinkOrderInput clearAddress(HatchLinkOrderInput hatchLinkOrderInput) {
        return hatchLinkOrderInput.copy(hatchLinkOrderInput.firstName, hatchLinkOrderInput.lastName, hatchLinkOrderInput.email, hatchLinkOrderInput.phone, "", "", "", "", "");
    }

    private final HatchLinkOrderTransition continueFromInfo(HatchLinkOrderFormState hatchLinkOrderFormState) {
        if (hatchLinkOrderFormState.step == HatchLinkOrderStep.INFO && hatchLinkOrderFormState.blockReason == null && !hatchLinkOrderFormState.isCheckingEligibility) {
            HatchLinkPostPurchaseState hatchLinkPostPurchaseState = hatchLinkOrderFormState.postPurchase;
            if (hatchLinkPostPurchaseState == null) {
                return C8j3.A0p(HatchLinkOrderFormState.copy$default(hatchLinkOrderFormState, null, HatchLinkOrderStep.DETAILS, null, null, null, null, null, null, null, false, false, null, null, false, false, null, null, null, 262141, null), null);
            }
            HatchLinkSubscriptionActivation hatchLinkSubscriptionActivation = hatchLinkPostPurchaseState.activation;
            if (hatchLinkSubscriptionActivation != HatchLinkSubscriptionActivation.TIMED_OUT && hatchLinkSubscriptionActivation != HatchLinkSubscriptionActivation.TIMEOUT_HANDLED) {
                return preparePostPurchaseDetails(HatchLinkOrderFormState.copy$default(hatchLinkOrderFormState, hatchLinkPostPurchaseState.copy(hatchLinkSubscriptionActivation, true, hatchLinkPostPurchaseState.detailsPreparation), null, null, null, null, null, null, null, null, false, false, null, null, false, false, null, null, null, 262142, null));
            }
        }
        return C8j3.A0p(hatchLinkOrderFormState, null);
    }

    private final HatchLinkOrderTransition detailsPrepared(HatchLinkOrderFormState hatchLinkOrderFormState, HatchLinkOrderBlockReason hatchLinkOrderBlockReason) {
        HatchLinkPostPurchaseState hatchLinkPostPurchaseState = hatchLinkOrderFormState.postPurchase;
        if ((hatchLinkPostPurchaseState != null ? hatchLinkPostPurchaseState.detailsPreparation : null) != HatchLinkOrderDetailsPreparation.IN_PROGRESS) {
            return C8j3.A0p(hatchLinkOrderFormState, null);
        }
        return C8j3.A0p(HatchLinkOrderFormState.copy$default(hatchLinkOrderFormState, hatchLinkPostPurchaseState.copy(hatchLinkPostPurchaseState.activation, hatchLinkPostPurchaseState.continueRequested, HatchLinkOrderDetailsPreparation.COMPLETE), HatchLinkOrderStep.DETAILS, null, null, null, null, null, null, null, AnonymousClass002.A1Y(hatchLinkOrderBlockReason), false, null, hatchLinkOrderBlockReason, false, false, null, null, null, 257532, null), hatchLinkOrderBlockReason == null ? HatchLinkOrderEffect.LoadSavedDetails.INSTANCE : null);
    }

    private final HatchLinkOrderTransition editAddress(HatchLinkOrderFormState hatchLinkOrderFormState, String str, HatchLinkOrderInput hatchLinkOrderInput) {
        Object next;
        C0943AIw c0943AIwA5T;
        HatchLinkOrderStep hatchLinkOrderStep = hatchLinkOrderFormState.step;
        HatchLinkOrderStep hatchLinkOrderStep2 = HatchLinkOrderStep.DETAILS;
        if (hatchLinkOrderStep == hatchLinkOrderStep2) {
            Iterator it = AbstractC0878AGe.A0P(hatchLinkOrderFormState.localAddresses, hatchLinkOrderFormState.savedDetails.addresses).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(((HatchLinkSavedAddress) next).id, str)) {
                    break;
                }
            }
            HatchLinkSavedAddress hatchLinkSavedAddress = (HatchLinkSavedAddress) next;
            if (hatchLinkSavedAddress != null) {
                HatchLinkOrderStep hatchLinkOrderStep3 = HatchLinkOrderStep.ADDRESS_ENTRY;
                String str2 = hatchLinkOrderFormState.selectedAddressId;
                String str3 = hatchLinkSavedAddress.id;
                HatchLinkOrderInput hatchLinkOrderInputWithAddress = withAddress(hatchLinkOrderInput, hatchLinkSavedAddress);
                AHG<HatchLinkOrderField> ahg = hatchLinkOrderFormState.invalidFields;
                AHG<HatchLinkOrderField> ahgValidate = validate(hatchLinkOrderStep2, hatchLinkOrderInput);
                C0943AIw c0943AIw = (C0943AIw) ahg;
                C7384Etj.A0Y(ahgValidate, 0);
                if (ahgValidate.isEmpty()) {
                    c0943AIwA5T = C0943AIw.A03;
                } else {
                    C0944AIx c0944AIx = new C0944AIx(c0943AIw);
                    c0944AIx.retainAll(ahgValidate);
                    c0943AIwA5T = c0944AIx.A5T();
                }
                return C8j3.A0p(HatchLinkOrderFormState.copy$default(hatchLinkOrderFormState, null, hatchLinkOrderStep3, hatchLinkOrderInputWithAddress, null, null, null, hatchLinkOrderInput, str2, str3, false, false, c0943AIwA5T.Aak(HatchLinkOrderStateMachineKt.ADDRESS_FIELDS), null, false, false, null, null, null, 226873, null), null);
            }
        }
        return C8j3.A0p(hatchLinkOrderFormState, null);
    }

    private final HatchLinkOrderTransition eligibilityResolved(HatchLinkOrderFormState hatchLinkOrderFormState, HatchLinkOrderBlockReason hatchLinkOrderBlockReason, boolean z, boolean z2) {
        if (hatchLinkOrderFormState.isCheckingEligibility) {
            return C8j3.A0p(HatchLinkOrderFormState.copy$default(hatchLinkOrderFormState, null, null, null, null, null, null, null, null, null, AnonymousClass002.A1Y(hatchLinkOrderBlockReason), false, null, hatchLinkOrderBlockReason, z, z2, null, null, null, 231935, null), hatchLinkOrderBlockReason == null ? HatchLinkOrderEffect.LoadSavedDetails.INSTANCE : null);
        }
        return C8j3.A0p(hatchLinkOrderFormState, null);
    }

    private final boolean hasAddress(HatchLinkOrderInput hatchLinkOrderInput) {
        return (C7BY.A0j(hatchLinkOrderInput.street1) && C7BY.A0j(hatchLinkOrderInput.street2) && C7BY.A0j(hatchLinkOrderInput.city) && C7BY.A0j(hatchLinkOrderInput.state) && C7BY.A0j(hatchLinkOrderInput.postalCode)) ? false : true;
    }

    private final HatchLinkOrderTransition preparePostPurchaseDetails(HatchLinkOrderFormState hatchLinkOrderFormState) {
        boolean z;
        HatchLinkSubscriptionActivation hatchLinkSubscriptionActivation;
        HatchLinkPostPurchaseState hatchLinkPostPurchaseState = hatchLinkOrderFormState.postPurchase;
        if (hatchLinkPostPurchaseState != null && hatchLinkOrderFormState.step == HatchLinkOrderStep.INFO && (z = hatchLinkPostPurchaseState.continueRequested) && (hatchLinkSubscriptionActivation = hatchLinkPostPurchaseState.activation) == HatchLinkSubscriptionActivation.ACTIVE) {
            int iOrdinal = hatchLinkPostPurchaseState.detailsPreparation.ordinal();
            if (iOrdinal == 0) {
                return C8j3.A0p(HatchLinkOrderFormState.copy$default(hatchLinkOrderFormState, new HatchLinkPostPurchaseState(hatchLinkSubscriptionActivation, z, HatchLinkOrderDetailsPreparation.IN_PROGRESS), null, null, null, null, null, null, null, null, false, false, null, null, false, false, null, null, null, 262142, null), HatchLinkOrderEffect.PrepareDetails.INSTANCE);
            }
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return C8j3.A0p(HatchLinkOrderFormState.copy$default(hatchLinkOrderFormState, null, HatchLinkOrderStep.DETAILS, null, null, null, null, null, null, null, false, false, null, null, false, false, null, null, null, 262141, null), null);
                }
                throw C3cG.A0q();
            }
        }
        return C8j3.A0p(hatchLinkOrderFormState, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.devices.link.ordering.HatchLinkOrderTransition saveAddress(com.facebook.aura.devices.link.ordering.HatchLinkOrderFormState r23, com.facebook.aura.devices.link.ordering.HatchLinkOrderInput r24) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.link.ordering.HatchLinkOrderStateMachine.saveAddress(com.facebook.aura.devices.link.ordering.HatchLinkOrderFormState, com.facebook.aura.devices.link.ordering.HatchLinkOrderInput):com.facebook.aura.devices.link.ordering.HatchLinkOrderTransition");
    }

    private final HatchLinkOrderTransition selectAddress(HatchLinkOrderFormState hatchLinkOrderFormState, String str) {
        Object next;
        Iterator it = AbstractC0878AGe.A0P(hatchLinkOrderFormState.localAddresses, hatchLinkOrderFormState.savedDetails.addresses).iterator();
        do {
            next = null;
            if (!it.hasNext()) {
                break;
            }
            next = it.next();
        } while (!C7384Etj.areEqual(((HatchLinkSavedAddress) next).id, str));
        HatchLinkSavedAddress hatchLinkSavedAddress = (HatchLinkSavedAddress) next;
        return hatchLinkSavedAddress == null ? C8j3.A0p(hatchLinkOrderFormState, null) : C8j3.A0p(HatchLinkOrderFormState.copy$default(hatchLinkOrderFormState, null, HatchLinkOrderStep.DETAILS, withAddress(hatchLinkOrderFormState.input, hatchLinkSavedAddress), null, null, hatchLinkSavedAddress.id, null, null, null, false, false, hatchLinkOrderFormState.invalidFields.Aak(HatchLinkOrderStateMachineKt.ADDRESS_FIELDS), null, false, false, null, null, null, 227097, null), null);
    }

    private final HatchLinkOrderTransition subscriptionActivated(HatchLinkOrderFormState hatchLinkOrderFormState, boolean z) {
        HatchLinkPostPurchaseState hatchLinkPostPurchaseState = hatchLinkOrderFormState.postPurchase;
        return (hatchLinkPostPurchaseState != null ? hatchLinkPostPurchaseState.activation : null) != HatchLinkSubscriptionActivation.WAITING ? C8j3.A0p(hatchLinkOrderFormState, null) : preparePostPurchaseDetails(HatchLinkOrderFormState.copy$default(hatchLinkOrderFormState, hatchLinkPostPurchaseState.copy(HatchLinkSubscriptionActivation.ACTIVE, hatchLinkPostPurchaseState.continueRequested, hatchLinkPostPurchaseState.detailsPreparation), null, null, null, null, null, null, null, null, false, false, null, null, false, z, null, null, null, 245758, null));
    }

    private final AHG<HatchLinkOrderField> validateAddress(HatchLinkOrderInput hatchLinkOrderInput) {
        AIY aiy = new AIY();
        if (C7BY.A0j(hatchLinkOrderInput.street1)) {
            aiy.add(HatchLinkOrderField.STREET1);
        }
        if (C7BY.A0j(hatchLinkOrderInput.city)) {
            aiy.add(HatchLinkOrderField.CITY);
        }
        if (HatchLinkOrderStateMachineKt.normalizedUsStateCode(hatchLinkOrderInput.state) == null) {
            aiy.add(HatchLinkOrderField.STATE);
        }
        if (!C7384Etj.areEqual(HatchCardValidator.INSTANCE.usPostalCode(hatchLinkOrderInput.postalCode), HatchCardFieldState.Valid.INSTANCE)) {
            aiy.add(HatchLinkOrderField.POSTAL_CODE);
        }
        return AGI.A0H(AIX.A00(aiy));
    }

    private final HatchLinkOrderInput withAddress(HatchLinkOrderInput hatchLinkOrderInput, HatchLinkSavedAddress hatchLinkSavedAddress) {
        return hatchLinkOrderInput.copy(hatchLinkOrderInput.firstName, hatchLinkOrderInput.lastName, hatchLinkOrderInput.email, hatchLinkOrderInput.phone, hatchLinkSavedAddress.street1, hatchLinkSavedAddress.street2, hatchLinkSavedAddress.city, hatchLinkSavedAddress.state, hatchLinkSavedAddress.postalCode);
    }

    public final HatchLinkOrderTransition reduce(HatchLinkOrderFormState hatchLinkOrderFormState, HatchLinkOrderEvent hatchLinkOrderEvent) {
        C0943AIw c0943AIwA5T;
        C7384Etj.A0Y(hatchLinkOrderFormState, 0);
        C7384Etj.A0Y(hatchLinkOrderEvent, 1);
        if (hatchLinkOrderEvent instanceof HatchLinkOrderEvent.SubscriptionActivated) {
            return subscriptionActivated(hatchLinkOrderFormState, ((HatchLinkOrderEvent.SubscriptionActivated) hatchLinkOrderEvent).isTestOrder);
        }
        if (hatchLinkOrderEvent.equals(HatchLinkOrderEvent.ActivationTimedOut.INSTANCE)) {
            return activationTimedOut(hatchLinkOrderFormState);
        }
        if (hatchLinkOrderEvent instanceof HatchLinkOrderEvent.EligibilityResolved) {
            HatchLinkOrderEvent.EligibilityResolved eligibilityResolved = (HatchLinkOrderEvent.EligibilityResolved) hatchLinkOrderEvent;
            return eligibilityResolved(hatchLinkOrderFormState, eligibilityResolved.blockReason, eligibilityResolved.offersPlans, eligibilityResolved.isTestOrder);
        }
        if (hatchLinkOrderEvent instanceof HatchLinkOrderEvent.DetailsPrepared) {
            return detailsPrepared(hatchLinkOrderFormState, ((HatchLinkOrderEvent.DetailsPrepared) hatchLinkOrderEvent).blockReason);
        }
        if (hatchLinkOrderEvent instanceof HatchLinkOrderEvent.SavedDetailsLoaded) {
            return loadedSavedDetails(hatchLinkOrderFormState, ((HatchLinkOrderEvent.SavedDetailsLoaded) hatchLinkOrderEvent).details);
        }
        if (hatchLinkOrderEvent instanceof HatchLinkOrderEvent.AddressSelected) {
            return selectAddress(hatchLinkOrderFormState, ((HatchLinkOrderEvent.AddressSelected) hatchLinkOrderEvent).id);
        }
        if (hatchLinkOrderEvent instanceof HatchLinkOrderEvent.AddAddressPressed) {
            HatchLinkOrderStep hatchLinkOrderStep = HatchLinkOrderStep.ADDRESS_ENTRY;
            HatchLinkOrderEvent.AddAddressPressed addAddressPressed = (HatchLinkOrderEvent.AddAddressPressed) hatchLinkOrderEvent;
            HatchLinkOrderInput hatchLinkOrderInput = addAddressPressed.input;
            String str = hatchLinkOrderFormState.selectedAddressId;
            HatchLinkOrderInput hatchLinkOrderInputClearAddress = clearAddress(hatchLinkOrderInput);
            AHG<HatchLinkOrderField> ahg = hatchLinkOrderFormState.invalidFields;
            AHG<HatchLinkOrderField> ahgValidate = validate(HatchLinkOrderStep.DETAILS, addAddressPressed.input);
            C0943AIw c0943AIw = (C0943AIw) ahg;
            C7384Etj.A0Y(ahgValidate, 0);
            if (ahgValidate.isEmpty()) {
                c0943AIwA5T = C0943AIw.A03;
            } else {
                C0944AIx c0944AIx = new C0944AIx(c0943AIw);
                c0944AIx.retainAll(ahgValidate);
                c0943AIwA5T = c0944AIx.A5T();
            }
            return C8j3.A0p(HatchLinkOrderFormState.copy$default(hatchLinkOrderFormState, null, hatchLinkOrderStep, hatchLinkOrderInputClearAddress, null, null, null, hatchLinkOrderInput, str, null, false, false, c0943AIwA5T.Aak(HatchLinkOrderStateMachineKt.ADDRESS_FIELDS), null, false, false, null, null, null, 226841, null), null);
        }
        if (hatchLinkOrderEvent instanceof HatchLinkOrderEvent.EditAddressPressed) {
            HatchLinkOrderEvent.EditAddressPressed editAddressPressed = (HatchLinkOrderEvent.EditAddressPressed) hatchLinkOrderEvent;
            return editAddress(hatchLinkOrderFormState, editAddressPressed.id, editAddressPressed.input);
        }
        if (hatchLinkOrderEvent instanceof HatchLinkOrderEvent.SaveAddressPressed) {
            return saveAddress(hatchLinkOrderFormState, ((HatchLinkOrderEvent.SaveAddressPressed) hatchLinkOrderEvent).input);
        }
        if (hatchLinkOrderEvent.equals(HatchLinkOrderEvent.ContinuePressed.INSTANCE)) {
            return continueFromInfo(hatchLinkOrderFormState);
        }
        if (hatchLinkOrderEvent instanceof HatchLinkOrderEvent.BackPressed) {
            int iOrdinal = hatchLinkOrderFormState.step.ordinal();
            if (iOrdinal == 2) {
                return cancelAddressEntry(hatchLinkOrderFormState);
            }
            if (iOrdinal != 3) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 0 || iOrdinal == 4) {
                        return C8j3.A0p(hatchLinkOrderFormState, HatchLinkOrderEffect.Dismiss.INSTANCE);
                    }
                    throw C3cG.A0q();
                }
                HatchLinkOrderStep hatchLinkOrderStep2 = HatchLinkOrderStep.INFO;
                HatchLinkOrderInput hatchLinkOrderInput2 = ((HatchLinkOrderEvent.BackPressed) hatchLinkOrderEvent).input;
                if (hatchLinkOrderInput2 == null) {
                    hatchLinkOrderInput2 = hatchLinkOrderFormState.input;
                }
                HatchLinkPostPurchaseState hatchLinkPostPurchaseState = hatchLinkOrderFormState.postPurchase;
                return C8j3.A0p(HatchLinkOrderFormState.copy$default(hatchLinkOrderFormState, hatchLinkPostPurchaseState != null ? hatchLinkPostPurchaseState.copy(hatchLinkPostPurchaseState.activation, false, hatchLinkPostPurchaseState.detailsPreparation) : null, hatchLinkOrderStep2, hatchLinkOrderInput2, null, null, null, null, null, null, false, false, null, null, false, false, null, null, null, 262136, null), null);
            }
        } else {
            if (!(hatchLinkOrderEvent instanceof HatchLinkOrderEvent.SubmitPressed)) {
                if (!(hatchLinkOrderEvent instanceof HatchLinkOrderEvent.SubmitFinished)) {
                    throw C3cG.A0q();
                }
                HatchLinkOrderResult hatchLinkOrderResult = ((HatchLinkOrderEvent.SubmitFinished) hatchLinkOrderEvent).result;
                if (hatchLinkOrderResult instanceof HatchLinkOrderResult.Success) {
                    return C8j3.A0p(HatchLinkOrderFormState.copy$default(hatchLinkOrderFormState, null, HatchLinkOrderStep.CONFIRMED, null, null, null, null, null, null, null, false, false, null, null, false, false, null, ((HatchLinkOrderResult.Success) hatchLinkOrderResult).order, null, 196605, null), null);
                }
                if (hatchLinkOrderResult instanceof HatchLinkOrderResult.Blocked) {
                    return C8j3.A0p(HatchLinkOrderFormState.copy$default(hatchLinkOrderFormState, null, HatchLinkOrderStep.DETAILS, null, null, null, null, null, null, null, false, false, null, ((HatchLinkOrderResult.Blocked) hatchLinkOrderResult).reason, false, false, null, null, null, 225277, null), null);
                }
                if (hatchLinkOrderResult instanceof HatchLinkOrderResult.Rejected) {
                    return C8j3.A0p(HatchLinkOrderFormState.copy$default(hatchLinkOrderFormState, null, HatchLinkOrderStep.DETAILS, null, null, null, null, null, null, null, false, false, null, null, false, false, ((HatchLinkOrderResult.Rejected) hatchLinkOrderResult).error, null, null, 229373, null), null);
                }
                if (hatchLinkOrderResult instanceof HatchLinkOrderResult.Failed) {
                    return C8j3.A0p(HatchLinkOrderFormState.copy$default(hatchLinkOrderFormState, null, HatchLinkOrderStep.DETAILS, null, null, null, null, null, null, null, false, false, null, null, false, false, ((HatchLinkOrderResult.Failed) hatchLinkOrderResult).error, null, null, 229373, null), null);
                }
                throw C3cG.A0q();
            }
            if (hatchLinkOrderFormState.step == HatchLinkOrderStep.DETAILS) {
                HatchLinkOrderInput hatchLinkOrderInputNormalizeAddress = normalizeAddress(((HatchLinkOrderEvent.SubmitPressed) hatchLinkOrderEvent).input);
                AHG<HatchLinkOrderField> ahgValidate2 = validate(hatchLinkOrderFormState.step, hatchLinkOrderInputNormalizeAddress);
                return !ahgValidate2.isEmpty() ? C8j3.A0p(HatchLinkOrderFormState.copy$default(hatchLinkOrderFormState, null, null, hatchLinkOrderInputNormalizeAddress, null, null, null, null, null, null, false, false, ahgValidate2, null, false, false, null, null, null, 227323, null), null) : C8j3.A0p(HatchLinkOrderFormState.copy$default(hatchLinkOrderFormState, null, HatchLinkOrderStep.SUBMITTING, hatchLinkOrderInputNormalizeAddress, null, null, null, null, null, null, false, false, C0943AIw.A03, null, false, false, null, null, null, 227321, null), HatchLinkOrderEffect.Submit.INSTANCE);
            }
        }
        return C8j3.A0p(hatchLinkOrderFormState, null);
    }

    private final boolean isPlausibleEmail(String str) {
        String strA0l = AnonymousClass002.A0l(str);
        return strA0l.length() <= 254 && Patterns.EMAIL_ADDRESS.matcher(strA0l).matches();
    }

    private final boolean isPlausiblePhone(String str) {
        String strA03;
        String strA0K;
        int length;
        String strA0l = AnonymousClass002.A0l(str);
        if (strA0l.length() > 32 || (length = (strA0K = C7BY.A0K("+", (strA03 = PHONE_SEPARATORS.A03(strA0l, "")))).length()) <= 0) {
            return false;
        }
        int i = 0;
        do {
            char cCharAt = strA0K.charAt(i);
            if ('0' > cCharAt || cCharAt >= ':') {
                return false;
            }
            i++;
        } while (i < length);
        return PhoneNumberUtils.formatNumberToE164(strA03, "US") != null;
    }

    private final List<HatchLinkSavedAddress> replacing(List<HatchLinkSavedAddress> list, HatchLinkSavedAddress hatchLinkSavedAddress) {
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        for (HatchLinkSavedAddress hatchLinkSavedAddress2 : list) {
            if (C7384Etj.areEqual(hatchLinkSavedAddress2.id, hatchLinkSavedAddress.id)) {
                hatchLinkSavedAddress2 = hatchLinkSavedAddress;
            }
            arrayListA0i.add(hatchLinkSavedAddress2);
        }
        return arrayListA0i;
    }
}
