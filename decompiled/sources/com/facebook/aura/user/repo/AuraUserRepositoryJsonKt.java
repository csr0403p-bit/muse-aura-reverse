package com.facebook.aura.user.repo;

import X.AnonymousClass003;
import X.C3cG;
import X.C5as;
import X.C5b2;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.activation.data.HatchActivationWaitlistInviteCopy;
import com.facebook.aura.user.provider.AgeCheckLayout;
import com.facebook.aura.user.provider.AgeCheckMethod;
import com.facebook.aura.user.provider.AuraUserData;
import com.facebook.graphql.enums.EnumHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;

/* loaded from: classes2.dex */
public abstract class AuraUserRepositoryJsonKt {
    public static final C5as toAgeConfirmationStatus(String str) {
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            C5as c5as = C5as.A04;
            Enum enumA00 = EnumHelper.A00(upperCase, c5as);
            C7384Etj.A0U(enumA00);
            C5as c5as2 = (C5as) enumA00;
            if (c5as2 != null && c5as2 != c5as) {
                return c5as2;
            }
        }
        return null;
    }

    public static final HatchActivationWaitlistInviteCopy.Screen toDomain(OnboardingScreenCopyJson onboardingScreenCopyJson) {
        String str = null;
        if (onboardingScreenCopyJson == null || C7BY.A0j(onboardingScreenCopyJson.title) || C7BY.A0j(onboardingScreenCopyJson.subtitle)) {
            return null;
        }
        String str2 = onboardingScreenCopyJson.title;
        String str3 = onboardingScreenCopyJson.subtitle;
        String str4 = onboardingScreenCopyJson.disclaimer;
        if (str4 != null && !C7BY.A0j(str4)) {
            str = str4;
        }
        return new HatchActivationWaitlistInviteCopy.Screen(str2, str3, str);
    }

    public static final HatchActivationWaitlistInviteCopy toWaitlistInviteCopy(ActivationStatusesResponseJson activationStatusesResponseJson) {
        C7384Etj.A0Y(activationStatusesResponseJson, 0);
        return new HatchActivationWaitlistInviteCopy(toDomain(activationStatusesResponseJson.waitlist_choice_screen), toDomain(activationStatusesResponseJson.enter_invite_code_screen), toDomain(activationStatusesResponseJson.waitlisted_screen), toDomain(activationStatusesResponseJson.waitlisted_limited_screen), toDomain(activationStatusesResponseJson.name_dialog));
    }

    public static final C5b2 toWaitlistStatus(String str) {
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            C5b2 c5b2 = C5b2.A05;
            Enum enumA00 = EnumHelper.A00(upperCase, c5b2);
            C7384Etj.A0U(enumA00);
            C5b2 c5b22 = (C5b2) enumA00;
            if (c5b22 != null && c5b22 != c5b2) {
                return c5b22;
            }
        }
        return null;
    }

    public static final AuraUserData toAuraUserData(ActivationStatusesResponseJson activationStatusesResponseJson, TosStatusResponseJson tosStatusResponseJson, String str, String str2, String str3) {
        AnonymousClass003.A0u(activationStatusesResponseJson, tosStatusResponseJson);
        Boolean bool = activationStatusesResponseJson.has_hatch_access;
        Boolean bool2 = activationStatusesResponseJson.has_cleared_acquisition;
        Boolean bool3 = activationStatusesResponseJson.invite_code_entry_available;
        Boolean bool4 = activationStatusesResponseJson.waitlist_available;
        Boolean bool5 = activationStatusesResponseJson.has_provisioned_vm;
        C5b2 waitlistStatus = toWaitlistStatus(activationStatusesResponseJson.waitlist_status);
        boolean z = activationStatusesResponseJson.has_redeemed_invite_code;
        boolean z2 = tosStatusResponseJson.has_accepted_tos;
        C5as ageConfirmationStatus = toAgeConfirmationStatus(activationStatusesResponseJson.ccv_status);
        Boolean boolA0P = C3cG.A0P(activationStatusesResponseJson.is_in_geoblocked_region);
        boolean z3 = activationStatusesResponseJson.has_completed_hatch_activation;
        boolean z4 = activationStatusesResponseJson.hatch_wearables_linked;
        boolean z5 = activationStatusesResponseJson.is_nda_required;
        Boolean boolValueOf = Boolean.valueOf(activationStatusesResponseJson.is_vm_type_selection_required);
        boolean z6 = activationStatusesResponseJson.requires_name;
        Boolean bool6 = activationStatusesResponseJson.is_vm_type_plan_required;
        String str4 = activationStatusesResponseJson.name_prefill;
        String str5 = activationStatusesResponseJson.email_address_prefill;
        JsonElement jsonElement = activationStatusesResponseJson.retos;
        AgeCheckLayout ageCheckLayout = null;
        String string = (jsonElement == null || (jsonElement instanceof JsonNull)) ? null : jsonElement.toString();
        List<String> list = activationStatusesResponseJson.age_verification_methods;
        ArrayList arrayListA0h = C3cG.A0h();
        for (String str6 : list) {
            Iterator<AgeCheckMethod> it = AgeCheckMethod.getEntries().iterator();
            while (true) {
                if (it.hasNext()) {
                    AgeCheckMethod next = it.next();
                    if (next.name().equals(str6)) {
                        if (next != null) {
                            arrayListA0h.add(next);
                        }
                    }
                }
            }
        }
        String str7 = activationStatusesResponseJson.age_verification_layout;
        if (str7 != null) {
            Iterator<AgeCheckLayout> it2 = AgeCheckLayout.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                AgeCheckLayout next2 = it2.next();
                if (next2.name().equals(str7)) {
                    ageCheckLayout = next2;
                    break;
                }
            }
            ageCheckLayout = ageCheckLayout;
            if (ageCheckLayout == null) {
                ageCheckLayout = AgeCheckLayout.METHOD_SELECTOR;
            }
        }
        return new AuraUserData(bool, bool2, bool3, bool4, bool5, waitlistStatus, z, z2, ageConfirmationStatus, boolA0P, z3, z4, z5, boolValueOf, z6, bool6, str, str2, str3, str4, str5, string, arrayListA0h, ageCheckLayout);
    }

    public static /* synthetic */ AuraUserData toAuraUserData$default(ActivationStatusesResponseJson activationStatusesResponseJson, TosStatusResponseJson tosStatusResponseJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        return toAuraUserData(activationStatusesResponseJson, tosStatusResponseJson, str, str2, str3);
    }
}
