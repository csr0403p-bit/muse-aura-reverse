package com.facebook.aura.user.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C0881AGi;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes2.dex */
public final class ActivationStatusesResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String age_verification_layout;
    public final List<String> age_verification_methods;
    public final String ccv_status;
    public final String email_address_prefill;
    public final OnboardingScreenCopyJson enter_invite_code_screen;
    public final Boolean has_cleared_acquisition;
    public final boolean has_completed_hatch_activation;
    public final Boolean has_hatch_access;
    public final Boolean has_provisioned_vm;
    public final boolean has_redeemed_invite_code;
    public final String hatch_wearables_comms_consent;
    public final boolean hatch_wearables_linked;
    public final Boolean invite_code_entry_available;
    public final boolean is_in_geoblocked_region;
    public final boolean is_nda_required;
    public final Boolean is_vm_type_plan_required;
    public final boolean is_vm_type_selection_required;
    public final OnboardingScreenCopyJson name_dialog;
    public final String name_prefill;
    public final boolean requires_name;
    public final JsonElement retos;
    public final Boolean waitlist_available;
    public final OnboardingScreenCopyJson waitlist_choice_screen;
    public final String waitlist_status;
    public final OnboardingScreenCopyJson waitlisted_limited_screen;
    public final OnboardingScreenCopyJson waitlisted_screen;

    public final class Companion {
        public final C9hr<ActivationStatusesResponseJson> serializer() {
            return ActivationStatusesResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_user_repo_repo(ActivationStatusesResponseJson activationStatusesResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || activationStatusesResponseJson.has_hatch_access != null) {
            c9j5.AAP(activationStatusesResponseJson.has_hatch_access, C07839ix.A00, c9iZ, 0);
        }
        if (zAfR || activationStatusesResponseJson.has_cleared_acquisition != null) {
            c9j5.AAP(activationStatusesResponseJson.has_cleared_acquisition, C07839ix.A00, c9iZ, 1);
        }
        if (zAfR || activationStatusesResponseJson.invite_code_entry_available != null) {
            c9j5.AAP(activationStatusesResponseJson.invite_code_entry_available, C07839ix.A00, c9iZ, 2);
        }
        if (zAfR || activationStatusesResponseJson.waitlist_available != null) {
            c9j5.AAP(activationStatusesResponseJson.waitlist_available, C07839ix.A00, c9iZ, 3);
        }
        if (zAfR || activationStatusesResponseJson.has_provisioned_vm != null) {
            c9j5.AAP(activationStatusesResponseJson.has_provisioned_vm, C07839ix.A00, c9iZ, 4);
        }
        if (zAfR || activationStatusesResponseJson.waitlist_status != null) {
            c9j5.AAP(activationStatusesResponseJson.waitlist_status, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || activationStatusesResponseJson.has_redeemed_invite_code) {
            c9j5.AA7(c9iZ, 6, activationStatusesResponseJson.has_redeemed_invite_code);
        }
        if (zAfR || activationStatusesResponseJson.ccv_status != null) {
            c9j5.AAP(activationStatusesResponseJson.ccv_status, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || !C3cG.A1L(activationStatusesResponseJson.age_verification_methods)) {
            c9j5.AAQ(activationStatusesResponseJson.age_verification_methods, LenientStringListSerializer.INSTANCE, c9iZ, 8);
        }
        if (zAfR || activationStatusesResponseJson.age_verification_layout != null) {
            c9j5.AAP(activationStatusesResponseJson.age_verification_layout, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || activationStatusesResponseJson.has_completed_hatch_activation) {
            c9j5.AA7(c9iZ, 10, activationStatusesResponseJson.has_completed_hatch_activation);
        }
        if (zAfR || activationStatusesResponseJson.is_in_geoblocked_region) {
            c9j5.AA7(c9iZ, 11, activationStatusesResponseJson.is_in_geoblocked_region);
        }
        if (zAfR || activationStatusesResponseJson.hatch_wearables_linked) {
            c9j5.AA7(c9iZ, 12, activationStatusesResponseJson.hatch_wearables_linked);
        }
        if (zAfR || activationStatusesResponseJson.hatch_wearables_comms_consent != null) {
            c9j5.AAP(activationStatusesResponseJson.hatch_wearables_comms_consent, C07779iq.A01, c9iZ, 13);
        }
        if (zAfR || activationStatusesResponseJson.is_nda_required) {
            c9j5.AA7(c9iZ, 14, activationStatusesResponseJson.is_nda_required);
        }
        if (zAfR || activationStatusesResponseJson.is_vm_type_selection_required) {
            c9j5.AA7(c9iZ, 15, activationStatusesResponseJson.is_vm_type_selection_required);
        }
        if (zAfR || activationStatusesResponseJson.requires_name) {
            c9j5.AA7(c9iZ, 16, activationStatusesResponseJson.requires_name);
        }
        if (zAfR || activationStatusesResponseJson.is_vm_type_plan_required != null) {
            c9j5.AAP(activationStatusesResponseJson.is_vm_type_plan_required, C07839ix.A00, c9iZ, 17);
        }
        if (zAfR || activationStatusesResponseJson.name_prefill != null) {
            c9j5.AAP(activationStatusesResponseJson.name_prefill, C07779iq.A01, c9iZ, 18);
        }
        if (zAfR || activationStatusesResponseJson.email_address_prefill != null) {
            c9j5.AAP(activationStatusesResponseJson.email_address_prefill, C07779iq.A01, c9iZ, 19);
        }
        if (zAfR || activationStatusesResponseJson.waitlist_choice_screen != null) {
            c9j5.AAP(activationStatusesResponseJson.waitlist_choice_screen, OnboardingScreenCopyJson$$serializer.INSTANCE, c9iZ, 20);
        }
        if (zAfR || activationStatusesResponseJson.enter_invite_code_screen != null) {
            c9j5.AAP(activationStatusesResponseJson.enter_invite_code_screen, OnboardingScreenCopyJson$$serializer.INSTANCE, c9iZ, 21);
        }
        if (zAfR || activationStatusesResponseJson.waitlisted_screen != null) {
            c9j5.AAP(activationStatusesResponseJson.waitlisted_screen, OnboardingScreenCopyJson$$serializer.INSTANCE, c9iZ, 22);
        }
        if (zAfR || activationStatusesResponseJson.waitlisted_limited_screen != null) {
            c9j5.AAP(activationStatusesResponseJson.waitlisted_limited_screen, OnboardingScreenCopyJson$$serializer.INSTANCE, c9iZ, 23);
        }
        if (zAfR || activationStatusesResponseJson.retos != null) {
            c9j5.AAP(activationStatusesResponseJson.retos, JsonElementSerializer.A00, c9iZ, 24);
        }
        if (zAfR || activationStatusesResponseJson.name_dialog != null) {
            c9j5.AAP(activationStatusesResponseJson.name_dialog, OnboardingScreenCopyJson$$serializer.INSTANCE, c9iZ, 25);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivationStatusesResponseJson) {
                ActivationStatusesResponseJson activationStatusesResponseJson = (ActivationStatusesResponseJson) obj;
                if (!C7384Etj.areEqual(this.has_hatch_access, activationStatusesResponseJson.has_hatch_access) || !C7384Etj.areEqual(this.has_cleared_acquisition, activationStatusesResponseJson.has_cleared_acquisition) || !C7384Etj.areEqual(this.invite_code_entry_available, activationStatusesResponseJson.invite_code_entry_available) || !C7384Etj.areEqual(this.waitlist_available, activationStatusesResponseJson.waitlist_available) || !C7384Etj.areEqual(this.has_provisioned_vm, activationStatusesResponseJson.has_provisioned_vm) || !C7384Etj.areEqual(this.waitlist_status, activationStatusesResponseJson.waitlist_status) || this.has_redeemed_invite_code != activationStatusesResponseJson.has_redeemed_invite_code || !C7384Etj.areEqual(this.ccv_status, activationStatusesResponseJson.ccv_status) || !C7384Etj.areEqual(this.age_verification_methods, activationStatusesResponseJson.age_verification_methods) || !C7384Etj.areEqual(this.age_verification_layout, activationStatusesResponseJson.age_verification_layout) || this.has_completed_hatch_activation != activationStatusesResponseJson.has_completed_hatch_activation || this.is_in_geoblocked_region != activationStatusesResponseJson.is_in_geoblocked_region || this.hatch_wearables_linked != activationStatusesResponseJson.hatch_wearables_linked || !C7384Etj.areEqual(this.hatch_wearables_comms_consent, activationStatusesResponseJson.hatch_wearables_comms_consent) || this.is_nda_required != activationStatusesResponseJson.is_nda_required || this.is_vm_type_selection_required != activationStatusesResponseJson.is_vm_type_selection_required || this.requires_name != activationStatusesResponseJson.requires_name || !C7384Etj.areEqual(this.is_vm_type_plan_required, activationStatusesResponseJson.is_vm_type_plan_required) || !C7384Etj.areEqual(this.name_prefill, activationStatusesResponseJson.name_prefill) || !C7384Etj.areEqual(this.email_address_prefill, activationStatusesResponseJson.email_address_prefill) || !C7384Etj.areEqual(this.waitlist_choice_screen, activationStatusesResponseJson.waitlist_choice_screen) || !C7384Etj.areEqual(this.enter_invite_code_screen, activationStatusesResponseJson.enter_invite_code_screen) || !C7384Etj.areEqual(this.waitlisted_screen, activationStatusesResponseJson.waitlisted_screen) || !C7384Etj.areEqual(this.waitlisted_limited_screen, activationStatusesResponseJson.waitlisted_limited_screen) || !C7384Etj.areEqual(this.retos, activationStatusesResponseJson.retos) || !C7384Etj.areEqual(this.name_dialog, activationStatusesResponseJson.name_dialog)) {
                }
            }
            return false;
        }
        return true;
    }

    @Serializable(with = LenientStringListSerializer.class)
    public static /* synthetic */ void getAge_verification_methods$annotations() {
    }

    public final Boolean component1() {
        return this.has_hatch_access;
    }

    public final String component10() {
        return this.age_verification_layout;
    }

    public final boolean component11() {
        return this.has_completed_hatch_activation;
    }

    public final boolean component12() {
        return this.is_in_geoblocked_region;
    }

    public final boolean component13() {
        return this.hatch_wearables_linked;
    }

    public final String component14() {
        return this.hatch_wearables_comms_consent;
    }

    public final boolean component15() {
        return this.is_nda_required;
    }

    public final boolean component16() {
        return this.is_vm_type_selection_required;
    }

    public final boolean component17() {
        return this.requires_name;
    }

    public final Boolean component18() {
        return this.is_vm_type_plan_required;
    }

    public final String component19() {
        return this.name_prefill;
    }

    public final Boolean component2() {
        return this.has_cleared_acquisition;
    }

    public final String component20() {
        return this.email_address_prefill;
    }

    public final OnboardingScreenCopyJson component21() {
        return this.waitlist_choice_screen;
    }

    public final OnboardingScreenCopyJson component22() {
        return this.enter_invite_code_screen;
    }

    public final OnboardingScreenCopyJson component23() {
        return this.waitlisted_screen;
    }

    public final OnboardingScreenCopyJson component24() {
        return this.waitlisted_limited_screen;
    }

    public final JsonElement component25() {
        return this.retos;
    }

    public final OnboardingScreenCopyJson component26() {
        return this.name_dialog;
    }

    public final Boolean component3() {
        return this.invite_code_entry_available;
    }

    public final Boolean component4() {
        return this.waitlist_available;
    }

    public final Boolean component5() {
        return this.has_provisioned_vm;
    }

    public final String component6() {
        return this.waitlist_status;
    }

    public final boolean component7() {
        return this.has_redeemed_invite_code;
    }

    public final String component8() {
        return this.ccv_status;
    }

    public final List<String> component9() {
        return this.age_verification_methods;
    }

    public final ActivationStatusesResponseJson copy(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, boolean z, String str2, List<String> list, String str3, boolean z2, boolean z3, boolean z4, String str4, boolean z5, boolean z6, boolean z7, Boolean bool6, String str5, String str6, OnboardingScreenCopyJson onboardingScreenCopyJson, OnboardingScreenCopyJson onboardingScreenCopyJson2, OnboardingScreenCopyJson onboardingScreenCopyJson3, OnboardingScreenCopyJson onboardingScreenCopyJson4, JsonElement jsonElement, OnboardingScreenCopyJson onboardingScreenCopyJson5) {
        C7384Etj.A0Y(list, 8);
        return new ActivationStatusesResponseJson(bool, bool2, bool3, bool4, bool5, str, z, str2, list, str3, z2, z3, z4, str4, z5, z6, z7, bool6, str5, str6, onboardingScreenCopyJson, onboardingScreenCopyJson2, onboardingScreenCopyJson3, onboardingScreenCopyJson4, jsonElement, onboardingScreenCopyJson5);
    }

    public final String getAge_verification_layout() {
        return this.age_verification_layout;
    }

    public final List<String> getAge_verification_methods() {
        return this.age_verification_methods;
    }

    public final String getCcv_status() {
        return this.ccv_status;
    }

    public final String getEmail_address_prefill() {
        return this.email_address_prefill;
    }

    public final OnboardingScreenCopyJson getEnter_invite_code_screen() {
        return this.enter_invite_code_screen;
    }

    public final Boolean getHas_cleared_acquisition() {
        return this.has_cleared_acquisition;
    }

    public final boolean getHas_completed_hatch_activation() {
        return this.has_completed_hatch_activation;
    }

    public final Boolean getHas_hatch_access() {
        return this.has_hatch_access;
    }

    public final Boolean getHas_provisioned_vm() {
        return this.has_provisioned_vm;
    }

    public final boolean getHas_redeemed_invite_code() {
        return this.has_redeemed_invite_code;
    }

    public final String getHatch_wearables_comms_consent() {
        return this.hatch_wearables_comms_consent;
    }

    public final boolean getHatch_wearables_linked() {
        return this.hatch_wearables_linked;
    }

    public final Boolean getInvite_code_entry_available() {
        return this.invite_code_entry_available;
    }

    public final OnboardingScreenCopyJson getName_dialog() {
        return this.name_dialog;
    }

    public final String getName_prefill() {
        return this.name_prefill;
    }

    public final boolean getRequires_name() {
        return this.requires_name;
    }

    public final JsonElement getRetos() {
        return this.retos;
    }

    public final Boolean getWaitlist_available() {
        return this.waitlist_available;
    }

    public final OnboardingScreenCopyJson getWaitlist_choice_screen() {
        return this.waitlist_choice_screen;
    }

    public final String getWaitlist_status() {
        return this.waitlist_status;
    }

    public final OnboardingScreenCopyJson getWaitlisted_limited_screen() {
        return this.waitlisted_limited_screen;
    }

    public final OnboardingScreenCopyJson getWaitlisted_screen() {
        return this.waitlisted_screen;
    }

    public int hashCode() {
        return ((((((((((((((((C0KA.A01(C0KA.A01(C0KA.A01((C0KA.A01(C0KA.A01(C0KA.A01((AnonymousClass005.A0F(this.age_verification_methods, (C0KA.A01(((((((((((AnonymousClass006.A0D(this.has_hatch_access) * 31) + AnonymousClass006.A0D(this.has_cleared_acquisition)) * 31) + AnonymousClass006.A0D(this.invite_code_entry_available)) * 31) + AnonymousClass006.A0D(this.waitlist_available)) * 31) + AnonymousClass006.A0D(this.has_provisioned_vm)) * 31) + AnonymousClass006.A0G(this.waitlist_status)) * 31, this.has_redeemed_invite_code) + AnonymousClass006.A0G(this.ccv_status)) * 31) + AnonymousClass006.A0G(this.age_verification_layout)) * 31, this.has_completed_hatch_activation), this.is_in_geoblocked_region), this.hatch_wearables_linked) + AnonymousClass006.A0G(this.hatch_wearables_comms_consent)) * 31, this.is_nda_required), this.is_vm_type_selection_required), this.requires_name) + AnonymousClass006.A0D(this.is_vm_type_plan_required)) * 31) + AnonymousClass006.A0G(this.name_prefill)) * 31) + AnonymousClass006.A0G(this.email_address_prefill)) * 31) + AnonymousClass006.A0D(this.waitlist_choice_screen)) * 31) + AnonymousClass006.A0D(this.enter_invite_code_screen)) * 31) + AnonymousClass006.A0D(this.waitlisted_screen)) * 31) + AnonymousClass006.A0D(this.waitlisted_limited_screen)) * 31) + AnonymousClass006.A0D(this.retos)) * 31) + C3cH.A02(this.name_dialog);
    }

    public final boolean is_in_geoblocked_region() {
        return this.is_in_geoblocked_region;
    }

    public final boolean is_nda_required() {
        return this.is_nda_required;
    }

    public final Boolean is_vm_type_plan_required() {
        return this.is_vm_type_plan_required;
    }

    public final boolean is_vm_type_selection_required() {
        return this.is_vm_type_selection_required;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ActivationStatusesResponseJson(int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, boolean z, String str2, List list, String str3, boolean z2, boolean z3, boolean z4, String str4, boolean z5, boolean z6, boolean z7, Boolean bool6, String str5, String str6, OnboardingScreenCopyJson onboardingScreenCopyJson, OnboardingScreenCopyJson onboardingScreenCopyJson2, OnboardingScreenCopyJson onboardingScreenCopyJson3, OnboardingScreenCopyJson onboardingScreenCopyJson4, JsonElement jsonElement, OnboardingScreenCopyJson onboardingScreenCopyJson5, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.has_hatch_access = null;
        } else {
            this.has_hatch_access = bool;
        }
        if ((i & 2) == 0) {
            this.has_cleared_acquisition = null;
        } else {
            this.has_cleared_acquisition = bool2;
        }
        if ((i & 4) == 0) {
            this.invite_code_entry_available = null;
        } else {
            this.invite_code_entry_available = bool3;
        }
        if ((i & 8) == 0) {
            this.waitlist_available = null;
        } else {
            this.waitlist_available = bool4;
        }
        if ((i & 16) == 0) {
            this.has_provisioned_vm = null;
        } else {
            this.has_provisioned_vm = bool5;
        }
        if ((i & 32) == 0) {
            this.waitlist_status = null;
        } else {
            this.waitlist_status = str;
        }
        if ((i & 64) == 0) {
            this.has_redeemed_invite_code = false;
        } else {
            this.has_redeemed_invite_code = z;
        }
        if ((i & 128) == 0) {
            this.ccv_status = null;
        } else {
            this.ccv_status = str2;
        }
        if ((i & 256) == 0) {
            this.age_verification_methods = C0881AGi.A00;
        } else {
            this.age_verification_methods = list;
        }
        if ((i & 512) == 0) {
            this.age_verification_layout = null;
        } else {
            this.age_verification_layout = str3;
        }
        if ((i & 1024) == 0) {
            this.has_completed_hatch_activation = false;
        } else {
            this.has_completed_hatch_activation = z2;
        }
        if ((i & 2048) == 0) {
            this.is_in_geoblocked_region = false;
        } else {
            this.is_in_geoblocked_region = z3;
        }
        if ((i & 4096) == 0) {
            this.hatch_wearables_linked = false;
        } else {
            this.hatch_wearables_linked = z4;
        }
        if ((i & 8192) == 0) {
            this.hatch_wearables_comms_consent = null;
        } else {
            this.hatch_wearables_comms_consent = str4;
        }
        if ((i & 16384) == 0) {
            this.is_nda_required = false;
        } else {
            this.is_nda_required = z5;
        }
        if ((32768 & i) == 0) {
            this.is_vm_type_selection_required = false;
        } else {
            this.is_vm_type_selection_required = z6;
        }
        if ((65536 & i) == 0) {
            this.requires_name = false;
        } else {
            this.requires_name = z7;
        }
        if ((131072 & i) == 0) {
            this.is_vm_type_plan_required = null;
        } else {
            this.is_vm_type_plan_required = bool6;
        }
        if ((262144 & i) == 0) {
            this.name_prefill = null;
        } else {
            this.name_prefill = str5;
        }
        if ((524288 & i) == 0) {
            this.email_address_prefill = null;
        } else {
            this.email_address_prefill = str6;
        }
        if ((1048576 & i) == 0) {
            this.waitlist_choice_screen = null;
        } else {
            this.waitlist_choice_screen = onboardingScreenCopyJson;
        }
        if ((2097152 & i) == 0) {
            this.enter_invite_code_screen = null;
        } else {
            this.enter_invite_code_screen = onboardingScreenCopyJson2;
        }
        if ((4194304 & i) == 0) {
            this.waitlisted_screen = null;
        } else {
            this.waitlisted_screen = onboardingScreenCopyJson3;
        }
        if ((8388608 & i) == 0) {
            this.waitlisted_limited_screen = null;
        } else {
            this.waitlisted_limited_screen = onboardingScreenCopyJson4;
        }
        if ((16777216 & i) == 0) {
            this.retos = null;
        } else {
            this.retos = jsonElement;
        }
        if ((i & 33554432) == 0) {
            this.name_dialog = null;
        } else {
            this.name_dialog = onboardingScreenCopyJson5;
        }
    }

    public static /* synthetic */ ActivationStatusesResponseJson copy$default(ActivationStatusesResponseJson activationStatusesResponseJson, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, boolean z, String str2, List list, String str3, boolean z2, boolean z3, boolean z4, String str4, boolean z5, boolean z6, boolean z7, Boolean bool6, String str5, String str6, OnboardingScreenCopyJson onboardingScreenCopyJson, OnboardingScreenCopyJson onboardingScreenCopyJson2, OnboardingScreenCopyJson onboardingScreenCopyJson3, OnboardingScreenCopyJson onboardingScreenCopyJson4, JsonElement jsonElement, OnboardingScreenCopyJson onboardingScreenCopyJson5, int i, Object obj) {
        Boolean bool7 = bool;
        Boolean bool8 = bool2;
        Boolean bool9 = bool3;
        Boolean bool10 = bool4;
        Boolean bool11 = bool5;
        String str7 = str;
        boolean z8 = z;
        String str8 = str2;
        List list2 = list;
        String str9 = str3;
        boolean z9 = z2;
        boolean z10 = z3;
        boolean z11 = z4;
        String str10 = str4;
        boolean z12 = z5;
        boolean z13 = z6;
        boolean z14 = z7;
        OnboardingScreenCopyJson onboardingScreenCopyJson6 = onboardingScreenCopyJson2;
        OnboardingScreenCopyJson onboardingScreenCopyJson7 = onboardingScreenCopyJson3;
        OnboardingScreenCopyJson onboardingScreenCopyJson8 = onboardingScreenCopyJson4;
        JsonElement jsonElement2 = jsonElement;
        Boolean bool12 = bool6;
        String str11 = str5;
        String str12 = str6;
        OnboardingScreenCopyJson onboardingScreenCopyJson9 = onboardingScreenCopyJson;
        OnboardingScreenCopyJson onboardingScreenCopyJson10 = onboardingScreenCopyJson5;
        if ((i & 1) != 0) {
            bool7 = activationStatusesResponseJson.has_hatch_access;
        }
        if ((i & 2) != 0) {
            bool8 = activationStatusesResponseJson.has_cleared_acquisition;
        }
        if ((i & 4) != 0) {
            bool9 = activationStatusesResponseJson.invite_code_entry_available;
        }
        if ((i & 8) != 0) {
            bool10 = activationStatusesResponseJson.waitlist_available;
        }
        if ((i & 16) != 0) {
            bool11 = activationStatusesResponseJson.has_provisioned_vm;
        }
        if ((i & 32) != 0) {
            str7 = activationStatusesResponseJson.waitlist_status;
        }
        if ((i & 64) != 0) {
            z8 = activationStatusesResponseJson.has_redeemed_invite_code;
        }
        if ((i & 128) != 0) {
            str8 = activationStatusesResponseJson.ccv_status;
        }
        if ((i & 256) != 0) {
            list2 = activationStatusesResponseJson.age_verification_methods;
        }
        if ((i & 512) != 0) {
            str9 = activationStatusesResponseJson.age_verification_layout;
        }
        if ((i & 1024) != 0) {
            z9 = activationStatusesResponseJson.has_completed_hatch_activation;
        }
        if ((i & 2048) != 0) {
            z10 = activationStatusesResponseJson.is_in_geoblocked_region;
        }
        if ((i & 4096) != 0) {
            z11 = activationStatusesResponseJson.hatch_wearables_linked;
        }
        if ((i & 8192) != 0) {
            str10 = activationStatusesResponseJson.hatch_wearables_comms_consent;
        }
        if ((i & 16384) != 0) {
            z12 = activationStatusesResponseJson.is_nda_required;
        }
        if ((i & 32768) != 0) {
            z13 = activationStatusesResponseJson.is_vm_type_selection_required;
        }
        if ((i & 65536) != 0) {
            z14 = activationStatusesResponseJson.requires_name;
        }
        if ((i & 131072) != 0) {
            bool12 = activationStatusesResponseJson.is_vm_type_plan_required;
        }
        if ((i & 262144) != 0) {
            str11 = activationStatusesResponseJson.name_prefill;
        }
        if ((i & 524288) != 0) {
            str12 = activationStatusesResponseJson.email_address_prefill;
        }
        if ((i & 1048576) != 0) {
            onboardingScreenCopyJson9 = activationStatusesResponseJson.waitlist_choice_screen;
        }
        if ((i & 2097152) != 0) {
            onboardingScreenCopyJson6 = activationStatusesResponseJson.enter_invite_code_screen;
        }
        if ((i & 4194304) != 0) {
            onboardingScreenCopyJson7 = activationStatusesResponseJson.waitlisted_screen;
        }
        if ((i & 8388608) != 0) {
            onboardingScreenCopyJson8 = activationStatusesResponseJson.waitlisted_limited_screen;
        }
        if ((i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0) {
            jsonElement2 = activationStatusesResponseJson.retos;
        }
        if ((i & 33554432) != 0) {
            onboardingScreenCopyJson10 = activationStatusesResponseJson.name_dialog;
        }
        return activationStatusesResponseJson.copy(bool7, bool8, bool9, bool10, bool11, str7, z8, str8, list2, str9, z9, z10, z11, str10, z12, z13, z14, bool12, str11, str12, onboardingScreenCopyJson9, onboardingScreenCopyJson6, onboardingScreenCopyJson7, onboardingScreenCopyJson8, jsonElement2, onboardingScreenCopyJson10);
    }

    public /* synthetic */ ActivationStatusesResponseJson(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, boolean z, String str2, List list, String str3, boolean z2, boolean z3, boolean z4, String str4, boolean z5, boolean z6, boolean z7, Boolean bool6, String str5, String str6, OnboardingScreenCopyJson onboardingScreenCopyJson, OnboardingScreenCopyJson onboardingScreenCopyJson2, OnboardingScreenCopyJson onboardingScreenCopyJson3, OnboardingScreenCopyJson onboardingScreenCopyJson4, JsonElement jsonElement, OnboardingScreenCopyJson onboardingScreenCopyJson5, int i, C06H c06h) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : bool4, (i & 16) != 0 ? null : bool5, C3cG.A0e(str, i & 32), C3cH.A1M(i, z), C3cG.A0e(str2, i & 128), (i & 256) != 0 ? C0881AGi.A00 : list, C3cG.A0e(str3, i & 512), C3cG.A1K(i & 1024, z2), C3cG.A1K(i & 2048, z3), C3cG.A1K(i & 4096, z4), C3cG.A0e(str4, i & 8192), C3cG.A1K(i & 16384, z5), C3cH.A1L(i, 32768, z6), C3cH.A1L(i, 65536, z7), (i & 131072) != 0 ? null : bool6, C3cI.A0V(i, 262144, str5), C3cI.A0V(i, 524288, str6), (i & 1048576) != 0 ? null : onboardingScreenCopyJson, (i & 2097152) != 0 ? null : onboardingScreenCopyJson2, (i & 4194304) != 0 ? null : onboardingScreenCopyJson3, (i & 8388608) != 0 ? null : onboardingScreenCopyJson4, (i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0 ? null : jsonElement, (i & 33554432) != 0 ? null : onboardingScreenCopyJson5);
    }

    public ActivationStatusesResponseJson(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str, boolean z, String str2, List<String> list, String str3, boolean z2, boolean z3, boolean z4, String str4, boolean z5, boolean z6, boolean z7, Boolean bool6, String str5, String str6, OnboardingScreenCopyJson onboardingScreenCopyJson, OnboardingScreenCopyJson onboardingScreenCopyJson2, OnboardingScreenCopyJson onboardingScreenCopyJson3, OnboardingScreenCopyJson onboardingScreenCopyJson4, JsonElement jsonElement, OnboardingScreenCopyJson onboardingScreenCopyJson5) {
        C7384Etj.A0Y(list, 8);
        this.has_hatch_access = bool;
        this.has_cleared_acquisition = bool2;
        this.invite_code_entry_available = bool3;
        this.waitlist_available = bool4;
        this.has_provisioned_vm = bool5;
        this.waitlist_status = str;
        this.has_redeemed_invite_code = z;
        this.ccv_status = str2;
        this.age_verification_methods = list;
        this.age_verification_layout = str3;
        this.has_completed_hatch_activation = z2;
        this.is_in_geoblocked_region = z3;
        this.hatch_wearables_linked = z4;
        this.hatch_wearables_comms_consent = str4;
        this.is_nda_required = z5;
        this.is_vm_type_selection_required = z6;
        this.requires_name = z7;
        this.is_vm_type_plan_required = bool6;
        this.name_prefill = str5;
        this.email_address_prefill = str6;
        this.waitlist_choice_screen = onboardingScreenCopyJson;
        this.enter_invite_code_screen = onboardingScreenCopyJson2;
        this.waitlisted_screen = onboardingScreenCopyJson3;
        this.waitlisted_limited_screen = onboardingScreenCopyJson4;
        this.retos = jsonElement;
        this.name_dialog = onboardingScreenCopyJson5;
    }

    public ActivationStatusesResponseJson() {
        this(null, null, null, null, null, null, false, null, C0881AGi.A00, null, false, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null);
    }
}
