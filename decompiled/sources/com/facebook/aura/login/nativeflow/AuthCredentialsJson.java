package com.facebook.aura.login.nativeflow;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AuthCredentialsJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final String abra_access_token;
    public final String abra_user_id;
    public final String account_email;
    public final String account_name;
    public final String account_photo;
    public final boolean account_selection_required;
    public final List<AuthAccountSelectionAccountJson> accounts;
    public final AuthAttestationRequestJson attestation_request;
    public final String auth_state;
    public final boolean checkpoint_required;
    public final String checkpoint_resume_token;
    public final String checkpoint_url;
    public final String completion_handle;
    public final String contact_point;
    public final String disclosure_presentation;
    public final String frl_access_token;
    public final String frl_account_id;
    public final boolean linking_failed;
    public final String login_contact_point;
    public final boolean muse_link_transparency;
    public final String notice_body;
    public final String notice_title;
    public final AuthNtpUpsellJson ntp_upsell;
    public final AuthNtpUpsellChoiceJson ntp_upsell_choice;
    public final AuthNtpUpsellPendingJson ntp_upsell_pending;
    public final boolean reactivation_required;
    public final String reactivation_token;
    public final String refresh_token;
    public final String registration_state;
    public final boolean requires_birthday;
    public final boolean requires_consent;
    public final boolean requires_name;
    public final String scheduled_deletion_date;
    public final String selection_state;
    public final boolean show_muse_transparency;
    public final String suspended_at;
    public final AuthTosJson tos;
    public final List<AuthTosConsentItemJson> tos_consent_items;
    public final AuthTosConsentScreenJson tos_consent_screen;
    public final AuthTwoFactorDeclineJson two_factor_decline;
    public final String two_factor_landing_presentation;
    public final AuthTwoFactorLinkingJson two_factor_linking;
    public final AuthTwoFactorMetaAccountJson two_factor_meta_account;
    public final List<TwoFactorMethodJson> two_factor_methods;
    public final String two_factor_profile_pic_url;
    public final boolean two_factor_required;
    public final String two_factor_source_app;
    public final String two_factor_state;

    public final class Companion {
        public final C9hr<AuthCredentialsJson> serializer() {
            return AuthCredentialsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        F0C<C9hr<Object>>[] f0cArr = new F0C[48];
        Integer num = C79.A01;
        System.arraycopy(new F0C[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(num, AuthCredentialsJson$Companion$$childSerializers$1.INSTANCE), null, null, null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(num, AuthCredentialsJson$Companion$$childSerializers$2.INSTANCE)}, 0, f0cArr, 0, 27);
        System.arraycopy(new F0C[]{null, null, null, null, AbstractC5321DgF.A02(num, AuthCredentialsJson$Companion$$childSerializers$3.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}, 0, f0cArr, 27, 21);
        $childSerializers = f0cArr;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthCredentialsJson) {
                AuthCredentialsJson authCredentialsJson = (AuthCredentialsJson) obj;
                if (!C7384Etj.areEqual(this.registration_state, authCredentialsJson.registration_state) || !C7384Etj.areEqual(this.abra_access_token, authCredentialsJson.abra_access_token) || !C7384Etj.areEqual(this.abra_user_id, authCredentialsJson.abra_user_id) || !C7384Etj.areEqual(this.frl_access_token, authCredentialsJson.frl_access_token) || !C7384Etj.areEqual(this.frl_account_id, authCredentialsJson.frl_account_id) || !C7384Etj.areEqual(this.refresh_token, authCredentialsJson.refresh_token) || !C7384Etj.areEqual(this.auth_state, authCredentialsJson.auth_state) || !C7384Etj.areEqual(this.contact_point, authCredentialsJson.contact_point) || this.linking_failed != authCredentialsJson.linking_failed || !C7384Etj.areEqual(this.notice_title, authCredentialsJson.notice_title) || !C7384Etj.areEqual(this.notice_body, authCredentialsJson.notice_body) || this.requires_birthday != authCredentialsJson.requires_birthday || this.requires_name != authCredentialsJson.requires_name || this.requires_consent != authCredentialsJson.requires_consent || !C7384Etj.areEqual(this.disclosure_presentation, authCredentialsJson.disclosure_presentation) || !C7384Etj.areEqual(this.tos_consent_items, authCredentialsJson.tos_consent_items) || !C7384Etj.areEqual(this.tos_consent_screen, authCredentialsJson.tos_consent_screen) || !C7384Etj.areEqual(this.completion_handle, authCredentialsJson.completion_handle) || !C7384Etj.areEqual(this.ntp_upsell, authCredentialsJson.ntp_upsell) || !C7384Etj.areEqual(this.ntp_upsell_choice, authCredentialsJson.ntp_upsell_choice) || !C7384Etj.areEqual(this.ntp_upsell_pending, authCredentialsJson.ntp_upsell_pending) || !C7384Etj.areEqual(this.login_contact_point, authCredentialsJson.login_contact_point) || !C7384Etj.areEqual(this.tos, authCredentialsJson.tos) || !C7384Etj.areEqual(this.attestation_request, authCredentialsJson.attestation_request) || this.account_selection_required != authCredentialsJson.account_selection_required || !C7384Etj.areEqual(this.selection_state, authCredentialsJson.selection_state) || !C7384Etj.areEqual(this.accounts, authCredentialsJson.accounts) || this.muse_link_transparency != authCredentialsJson.muse_link_transparency || this.show_muse_transparency != authCredentialsJson.show_muse_transparency || this.two_factor_required != authCredentialsJson.two_factor_required || !C7384Etj.areEqual(this.two_factor_state, authCredentialsJson.two_factor_state) || !C7384Etj.areEqual(this.two_factor_methods, authCredentialsJson.two_factor_methods) || !C7384Etj.areEqual(this.two_factor_source_app, authCredentialsJson.two_factor_source_app) || !C7384Etj.areEqual(this.two_factor_decline, authCredentialsJson.two_factor_decline) || !C7384Etj.areEqual(this.two_factor_linking, authCredentialsJson.two_factor_linking) || !C7384Etj.areEqual(this.two_factor_profile_pic_url, authCredentialsJson.two_factor_profile_pic_url) || !C7384Etj.areEqual(this.two_factor_landing_presentation, authCredentialsJson.two_factor_landing_presentation) || !C7384Etj.areEqual(this.two_factor_meta_account, authCredentialsJson.two_factor_meta_account) || this.checkpoint_required != authCredentialsJson.checkpoint_required || !C7384Etj.areEqual(this.checkpoint_url, authCredentialsJson.checkpoint_url) || !C7384Etj.areEqual(this.checkpoint_resume_token, authCredentialsJson.checkpoint_resume_token) || !C7384Etj.areEqual(this.account_name, authCredentialsJson.account_name) || !C7384Etj.areEqual(this.account_email, authCredentialsJson.account_email) || !C7384Etj.areEqual(this.account_photo, authCredentialsJson.account_photo) || !C7384Etj.areEqual(this.suspended_at, authCredentialsJson.suspended_at) || this.reactivation_required != authCredentialsJson.reactivation_required || !C7384Etj.areEqual(this.reactivation_token, authCredentialsJson.reactivation_token) || !C7384Etj.areEqual(this.scheduled_deletion_date, authCredentialsJson.scheduled_deletion_date)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.registration_state;
    }

    public final String component10() {
        return this.notice_title;
    }

    public final String component11() {
        return this.notice_body;
    }

    public final boolean component12() {
        return this.requires_birthday;
    }

    public final boolean component13() {
        return this.requires_name;
    }

    public final boolean component14() {
        return this.requires_consent;
    }

    public final String component15() {
        return this.disclosure_presentation;
    }

    public final List<AuthTosConsentItemJson> component16() {
        return this.tos_consent_items;
    }

    public final AuthTosConsentScreenJson component17() {
        return this.tos_consent_screen;
    }

    public final String component18() {
        return this.completion_handle;
    }

    public final AuthNtpUpsellJson component19() {
        return this.ntp_upsell;
    }

    public final String component2() {
        return this.abra_access_token;
    }

    public final AuthNtpUpsellChoiceJson component20() {
        return this.ntp_upsell_choice;
    }

    public final AuthNtpUpsellPendingJson component21() {
        return this.ntp_upsell_pending;
    }

    public final String component22() {
        return this.login_contact_point;
    }

    public final AuthTosJson component23() {
        return this.tos;
    }

    public final AuthAttestationRequestJson component24() {
        return this.attestation_request;
    }

    public final boolean component25() {
        return this.account_selection_required;
    }

    public final String component26() {
        return this.selection_state;
    }

    public final List<AuthAccountSelectionAccountJson> component27() {
        return this.accounts;
    }

    public final boolean component28() {
        return this.muse_link_transparency;
    }

    public final boolean component29() {
        return this.show_muse_transparency;
    }

    public final String component3() {
        return this.abra_user_id;
    }

    public final boolean component30() {
        return this.two_factor_required;
    }

    public final String component31() {
        return this.two_factor_state;
    }

    public final List<TwoFactorMethodJson> component32() {
        return this.two_factor_methods;
    }

    public final String component33() {
        return this.two_factor_source_app;
    }

    public final AuthTwoFactorDeclineJson component34() {
        return this.two_factor_decline;
    }

    public final AuthTwoFactorLinkingJson component35() {
        return this.two_factor_linking;
    }

    public final String component36() {
        return this.two_factor_profile_pic_url;
    }

    public final String component37() {
        return this.two_factor_landing_presentation;
    }

    public final AuthTwoFactorMetaAccountJson component38() {
        return this.two_factor_meta_account;
    }

    public final boolean component39() {
        return this.checkpoint_required;
    }

    public final String component4() {
        return this.frl_access_token;
    }

    public final String component40() {
        return this.checkpoint_url;
    }

    public final String component41() {
        return this.checkpoint_resume_token;
    }

    public final String component42() {
        return this.account_name;
    }

    public final String component43() {
        return this.account_email;
    }

    public final String component44() {
        return this.account_photo;
    }

    public final String component45() {
        return this.suspended_at;
    }

    public final boolean component46() {
        return this.reactivation_required;
    }

    public final String component47() {
        return this.reactivation_token;
    }

    public final String component48() {
        return this.scheduled_deletion_date;
    }

    public final String component5() {
        return this.frl_account_id;
    }

    public final String component6() {
        return this.refresh_token;
    }

    public final String component7() {
        return this.auth_state;
    }

    public final String component8() {
        return this.contact_point;
    }

    public final boolean component9() {
        return this.linking_failed;
    }

    public final String getAbra_access_token() {
        return this.abra_access_token;
    }

    public final String getAbra_user_id() {
        return this.abra_user_id;
    }

    public final String getAccount_email() {
        return this.account_email;
    }

    public final String getAccount_name() {
        return this.account_name;
    }

    public final String getAccount_photo() {
        return this.account_photo;
    }

    public final boolean getAccount_selection_required() {
        return this.account_selection_required;
    }

    public final List<AuthAccountSelectionAccountJson> getAccounts() {
        return this.accounts;
    }

    public final AuthAttestationRequestJson getAttestation_request() {
        return this.attestation_request;
    }

    public final String getAuth_state() {
        return this.auth_state;
    }

    public final boolean getCheckpoint_required() {
        return this.checkpoint_required;
    }

    public final String getCheckpoint_resume_token() {
        return this.checkpoint_resume_token;
    }

    public final String getCheckpoint_url() {
        return this.checkpoint_url;
    }

    public final String getCompletion_handle() {
        return this.completion_handle;
    }

    public final String getContact_point() {
        return this.contact_point;
    }

    public final String getDisclosure_presentation() {
        return this.disclosure_presentation;
    }

    public final String getFrl_access_token() {
        return this.frl_access_token;
    }

    public final String getFrl_account_id() {
        return this.frl_account_id;
    }

    public final boolean getLinking_failed() {
        return this.linking_failed;
    }

    public final String getLogin_contact_point() {
        return this.login_contact_point;
    }

    public final boolean getMuse_link_transparency() {
        return this.muse_link_transparency;
    }

    public final String getNotice_body() {
        return this.notice_body;
    }

    public final String getNotice_title() {
        return this.notice_title;
    }

    public final AuthNtpUpsellJson getNtp_upsell() {
        return this.ntp_upsell;
    }

    public final AuthNtpUpsellChoiceJson getNtp_upsell_choice() {
        return this.ntp_upsell_choice;
    }

    public final AuthNtpUpsellPendingJson getNtp_upsell_pending() {
        return this.ntp_upsell_pending;
    }

    public final boolean getReactivation_required() {
        return this.reactivation_required;
    }

    public final String getReactivation_token() {
        return this.reactivation_token;
    }

    public final String getRefresh_token() {
        return this.refresh_token;
    }

    public final String getRegistration_state() {
        return this.registration_state;
    }

    public final boolean getRequires_birthday() {
        return this.requires_birthday;
    }

    public final boolean getRequires_consent() {
        return this.requires_consent;
    }

    public final boolean getRequires_name() {
        return this.requires_name;
    }

    public final String getScheduled_deletion_date() {
        return this.scheduled_deletion_date;
    }

    public final String getSelection_state() {
        return this.selection_state;
    }

    public final boolean getShow_muse_transparency() {
        return this.show_muse_transparency;
    }

    public final String getSuspended_at() {
        return this.suspended_at;
    }

    public final AuthTosJson getTos() {
        return this.tos;
    }

    public final List<AuthTosConsentItemJson> getTos_consent_items() {
        return this.tos_consent_items;
    }

    public final AuthTosConsentScreenJson getTos_consent_screen() {
        return this.tos_consent_screen;
    }

    public final AuthTwoFactorDeclineJson getTwo_factor_decline() {
        return this.two_factor_decline;
    }

    public final String getTwo_factor_landing_presentation() {
        return this.two_factor_landing_presentation;
    }

    public final AuthTwoFactorLinkingJson getTwo_factor_linking() {
        return this.two_factor_linking;
    }

    public final AuthTwoFactorMetaAccountJson getTwo_factor_meta_account() {
        return this.two_factor_meta_account;
    }

    public final List<TwoFactorMethodJson> getTwo_factor_methods() {
        return this.two_factor_methods;
    }

    public final String getTwo_factor_profile_pic_url() {
        return this.two_factor_profile_pic_url;
    }

    public final boolean getTwo_factor_required() {
        return this.two_factor_required;
    }

    public final String getTwo_factor_source_app() {
        return this.two_factor_source_app;
    }

    public final String getTwo_factor_state() {
        return this.two_factor_state;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.scheduled_deletion_date, AnonymousClass005.A0I(this.reactivation_token, C0KA.A01(AnonymousClass005.A0I(this.suspended_at, AnonymousClass005.A0I(this.account_photo, AnonymousClass005.A0I(this.account_email, AnonymousClass005.A0I(this.account_name, AnonymousClass005.A0I(this.checkpoint_resume_token, AnonymousClass005.A0I(this.checkpoint_url, C0KA.A01((AnonymousClass005.A0I(this.two_factor_landing_presentation, (((((((AnonymousClass005.A0F(this.two_factor_methods, AnonymousClass005.A0I(this.two_factor_state, C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.accounts, AnonymousClass005.A0I(this.selection_state, C0KA.A01((((AnonymousClass005.A0I(this.login_contact_point, (((((AnonymousClass005.A0I(this.completion_handle, (AnonymousClass005.A0F(this.tos_consent_items, AnonymousClass005.A0I(this.disclosure_presentation, C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.notice_body, AnonymousClass005.A0I(this.notice_title, C0KA.A01(AnonymousClass005.A0I(this.contact_point, AnonymousClass005.A0I(this.auth_state, AnonymousClass005.A0I(this.refresh_token, AnonymousClass005.A0I(this.frl_account_id, AnonymousClass005.A0I(this.frl_access_token, AnonymousClass005.A0I(this.abra_user_id, AnonymousClass005.A0I(this.abra_access_token, AnonymousClass001.A0G(this.registration_state)))))))), this.linking_failed))), this.requires_birthday), this.requires_name), this.requires_consent))) + AnonymousClass006.A0D(this.tos_consent_screen)) * 31) + AnonymousClass006.A0D(this.ntp_upsell)) * 31) + AnonymousClass006.A0D(this.ntp_upsell_choice)) * 31) + AnonymousClass006.A0D(this.ntp_upsell_pending)) * 31) + AnonymousClass006.A0D(this.tos)) * 31) + AnonymousClass006.A0D(this.attestation_request)) * 31, this.account_selection_required))), this.muse_link_transparency), this.show_muse_transparency), this.two_factor_required))) + AnonymousClass006.A0G(this.two_factor_source_app)) * 31) + AnonymousClass006.A0D(this.two_factor_decline)) * 31) + AnonymousClass006.A0D(this.two_factor_linking)) * 31) + AnonymousClass006.A0G(this.two_factor_profile_pic_url)) * 31) + C3cH.A02(this.two_factor_meta_account)) * 31, this.checkpoint_required))))))), this.reactivation_required)));
    }

    public String toString() {
        return super.toString();
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthCredentialsJson authCredentialsJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(authCredentialsJson.registration_state)) {
            c9j5.AAV(authCredentialsJson.registration_state, c9iZ, 0);
        }
        if (zAfR || !"".equals(authCredentialsJson.abra_access_token)) {
            c9j5.AAV(authCredentialsJson.abra_access_token, c9iZ, 1);
        }
        if (zAfR || !"".equals(authCredentialsJson.abra_user_id)) {
            c9j5.AAV(authCredentialsJson.abra_user_id, c9iZ, 2);
        }
        if (zAfR || !"".equals(authCredentialsJson.frl_access_token)) {
            c9j5.AAV(authCredentialsJson.frl_access_token, c9iZ, 3);
        }
        if (zAfR || !"".equals(authCredentialsJson.frl_account_id)) {
            c9j5.AAV(authCredentialsJson.frl_account_id, c9iZ, 4);
        }
        if (zAfR || !"".equals(authCredentialsJson.refresh_token)) {
            c9j5.AAV(authCredentialsJson.refresh_token, c9iZ, 5);
        }
        if (zAfR || !"".equals(authCredentialsJson.auth_state)) {
            c9j5.AAV(authCredentialsJson.auth_state, c9iZ, 6);
        }
        if (zAfR || !"".equals(authCredentialsJson.contact_point)) {
            c9j5.AAV(authCredentialsJson.contact_point, c9iZ, 7);
        }
        if (zAfR || authCredentialsJson.linking_failed) {
            c9j5.AA7(c9iZ, 8, authCredentialsJson.linking_failed);
        }
        if (zAfR || !"".equals(authCredentialsJson.notice_title)) {
            c9j5.AAV(authCredentialsJson.notice_title, c9iZ, 9);
        }
        if (zAfR || !"".equals(authCredentialsJson.notice_body)) {
            c9j5.AAV(authCredentialsJson.notice_body, c9iZ, 10);
        }
        if (zAfR || authCredentialsJson.requires_birthday) {
            c9j5.AA7(c9iZ, 11, authCredentialsJson.requires_birthday);
        }
        if (zAfR || authCredentialsJson.requires_name) {
            c9j5.AA7(c9iZ, 12, authCredentialsJson.requires_name);
        }
        if (zAfR || !authCredentialsJson.requires_consent) {
            c9j5.AA7(c9iZ, 13, authCredentialsJson.requires_consent);
        }
        if (zAfR || !"".equals(authCredentialsJson.disclosure_presentation)) {
            c9j5.AAV(authCredentialsJson.disclosure_presentation, c9iZ, 14);
        }
        if (zAfR || !C3cG.A1L(authCredentialsJson.tos_consent_items)) {
            c9j5.AAQ(authCredentialsJson.tos_consent_items, C3cH.A15(f0cArr, 15), c9iZ, 15);
        }
        if (zAfR || authCredentialsJson.tos_consent_screen != null) {
            c9j5.AAP(authCredentialsJson.tos_consent_screen, AuthTosConsentScreenJson$$serializer.INSTANCE, c9iZ, 16);
        }
        if (zAfR || !"".equals(authCredentialsJson.completion_handle)) {
            c9j5.AAV(authCredentialsJson.completion_handle, c9iZ, 17);
        }
        if (zAfR || authCredentialsJson.ntp_upsell != null) {
            c9j5.AAP(authCredentialsJson.ntp_upsell, AuthNtpUpsellJson$$serializer.INSTANCE, c9iZ, 18);
        }
        if (zAfR || authCredentialsJson.ntp_upsell_choice != null) {
            c9j5.AAP(authCredentialsJson.ntp_upsell_choice, AuthNtpUpsellChoiceJson$$serializer.INSTANCE, c9iZ, 19);
        }
        if (zAfR || authCredentialsJson.ntp_upsell_pending != null) {
            c9j5.AAP(authCredentialsJson.ntp_upsell_pending, AuthNtpUpsellPendingJson$$serializer.INSTANCE, c9iZ, 20);
        }
        if (zAfR || !"".equals(authCredentialsJson.login_contact_point)) {
            c9j5.AAV(authCredentialsJson.login_contact_point, c9iZ, 21);
        }
        if (zAfR || authCredentialsJson.tos != null) {
            c9j5.AAP(authCredentialsJson.tos, AuthTosJson$$serializer.INSTANCE, c9iZ, 22);
        }
        if (zAfR || authCredentialsJson.attestation_request != null) {
            c9j5.AAP(authCredentialsJson.attestation_request, AuthAttestationRequestJson$$serializer.INSTANCE, c9iZ, 23);
        }
        if (zAfR || authCredentialsJson.account_selection_required) {
            c9j5.AA7(c9iZ, 24, authCredentialsJson.account_selection_required);
        }
        if (zAfR || !"".equals(authCredentialsJson.selection_state)) {
            c9j5.AAV(authCredentialsJson.selection_state, c9iZ, 25);
        }
        if (zAfR || !C3cG.A1L(authCredentialsJson.accounts)) {
            c9j5.AAQ(authCredentialsJson.accounts, C3cH.A15(f0cArr, 26), c9iZ, 26);
        }
        if (zAfR || authCredentialsJson.muse_link_transparency) {
            c9j5.AA7(c9iZ, 27, authCredentialsJson.muse_link_transparency);
        }
        if (zAfR || authCredentialsJson.show_muse_transparency) {
            c9j5.AA7(c9iZ, 28, authCredentialsJson.show_muse_transparency);
        }
        if (zAfR || authCredentialsJson.two_factor_required) {
            c9j5.AA7(c9iZ, 29, authCredentialsJson.two_factor_required);
        }
        if (zAfR || !"".equals(authCredentialsJson.two_factor_state)) {
            c9j5.AAV(authCredentialsJson.two_factor_state, c9iZ, 30);
        }
        if (zAfR || !C3cG.A1L(authCredentialsJson.two_factor_methods)) {
            c9j5.AAQ(authCredentialsJson.two_factor_methods, C3cH.A15(f0cArr, 31), c9iZ, 31);
        }
        if (zAfR || authCredentialsJson.two_factor_source_app != null) {
            c9j5.AAP(authCredentialsJson.two_factor_source_app, C07779iq.A01, c9iZ, 32);
        }
        if (zAfR || authCredentialsJson.two_factor_decline != null) {
            c9j5.AAP(authCredentialsJson.two_factor_decline, AuthTwoFactorDeclineJson$$serializer.INSTANCE, c9iZ, 33);
        }
        if (zAfR || authCredentialsJson.two_factor_linking != null) {
            c9j5.AAP(authCredentialsJson.two_factor_linking, AuthTwoFactorLinkingJson$$serializer.INSTANCE, c9iZ, 34);
        }
        if (zAfR || authCredentialsJson.two_factor_profile_pic_url != null) {
            c9j5.AAP(authCredentialsJson.two_factor_profile_pic_url, C07779iq.A01, c9iZ, 35);
        }
        if (zAfR || !"".equals(authCredentialsJson.two_factor_landing_presentation)) {
            c9j5.AAV(authCredentialsJson.two_factor_landing_presentation, c9iZ, 36);
        }
        if (zAfR || authCredentialsJson.two_factor_meta_account != null) {
            c9j5.AAP(authCredentialsJson.two_factor_meta_account, AuthTwoFactorMetaAccountJson$$serializer.INSTANCE, c9iZ, 37);
        }
        if (zAfR || authCredentialsJson.checkpoint_required) {
            c9j5.AA7(c9iZ, 38, authCredentialsJson.checkpoint_required);
        }
        if (zAfR || !"".equals(authCredentialsJson.checkpoint_url)) {
            c9j5.AAV(authCredentialsJson.checkpoint_url, c9iZ, 39);
        }
        if (zAfR || !"".equals(authCredentialsJson.checkpoint_resume_token)) {
            c9j5.AAV(authCredentialsJson.checkpoint_resume_token, c9iZ, 40);
        }
        if (zAfR || !"".equals(authCredentialsJson.account_name)) {
            c9j5.AAV(authCredentialsJson.account_name, c9iZ, 41);
        }
        if (zAfR || !"".equals(authCredentialsJson.account_email)) {
            c9j5.AAV(authCredentialsJson.account_email, c9iZ, 42);
        }
        if (zAfR || !"".equals(authCredentialsJson.account_photo)) {
            c9j5.AAV(authCredentialsJson.account_photo, c9iZ, 43);
        }
        if (zAfR || !"".equals(authCredentialsJson.suspended_at)) {
            c9j5.AAV(authCredentialsJson.suspended_at, c9iZ, 44);
        }
        if (zAfR || authCredentialsJson.reactivation_required) {
            c9j5.AA7(c9iZ, 45, authCredentialsJson.reactivation_required);
        }
        if (zAfR || !"".equals(authCredentialsJson.reactivation_token)) {
            c9j5.AAV(authCredentialsJson.reactivation_token, c9iZ, 46);
        }
        if (zAfR || !"".equals(authCredentialsJson.scheduled_deletion_date)) {
            c9j5.AAV(authCredentialsJson.scheduled_deletion_date, c9iZ, 47);
        }
    }

    public AuthCredentialsJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, boolean z2, boolean z3, boolean z4, String str11, List<AuthTosConsentItemJson> list, AuthTosConsentScreenJson authTosConsentScreenJson, String str12, AuthNtpUpsellJson authNtpUpsellJson, AuthNtpUpsellChoiceJson authNtpUpsellChoiceJson, AuthNtpUpsellPendingJson authNtpUpsellPendingJson, String str13, AuthTosJson authTosJson, AuthAttestationRequestJson authAttestationRequestJson, boolean z5, String str14, List<AuthAccountSelectionAccountJson> list2, boolean z6, boolean z7, boolean z8, String str15, List<TwoFactorMethodJson> list3, String str16, AuthTwoFactorDeclineJson authTwoFactorDeclineJson, AuthTwoFactorLinkingJson authTwoFactorLinkingJson, String str17, String str18, AuthTwoFactorMetaAccountJson authTwoFactorMetaAccountJson, boolean z9, String str19, String str20, String str21, String str22, String str23, String str24, boolean z10, String str25, String str26) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        AnonymousClass005.A0z(str6, str7, str8);
        C3cH.A18(str9, str10);
        C7384Etj.A0Y(str11, 14);
        C3cI.A1I(list, 15, str12);
        C7384Etj.A0Y(str13, 21);
        C7384Etj.A0Y(str14, 25);
        C7384Etj.A0Y(list2, 26);
        C7384Etj.A0Y(str15, 30);
        C7384Etj.A0Y(list3, 31);
        C7384Etj.A0Y(str18, 36);
        C7384Etj.A0Y(str19, 39);
        C3cH.A19(str20, str21, str22, 40);
        C7384Etj.A0Y(str23, 43);
        C7384Etj.A0Y(str24, 44);
        C7384Etj.A0Y(str25, 46);
        C7384Etj.A0Y(str26, 47);
        this.registration_state = str;
        this.abra_access_token = str2;
        this.abra_user_id = str3;
        this.frl_access_token = str4;
        this.frl_account_id = str5;
        this.refresh_token = str6;
        this.auth_state = str7;
        this.contact_point = str8;
        this.linking_failed = z;
        this.notice_title = str9;
        this.notice_body = str10;
        this.requires_birthday = z2;
        this.requires_name = z3;
        this.requires_consent = z4;
        this.disclosure_presentation = str11;
        this.tos_consent_items = list;
        this.tos_consent_screen = authTosConsentScreenJson;
        this.completion_handle = str12;
        this.ntp_upsell = authNtpUpsellJson;
        this.ntp_upsell_choice = authNtpUpsellChoiceJson;
        this.ntp_upsell_pending = authNtpUpsellPendingJson;
        this.login_contact_point = str13;
        this.tos = authTosJson;
        this.attestation_request = authAttestationRequestJson;
        this.account_selection_required = z5;
        this.selection_state = str14;
        this.accounts = list2;
        this.muse_link_transparency = z6;
        this.show_muse_transparency = z7;
        this.two_factor_required = z8;
        this.two_factor_state = str15;
        this.two_factor_methods = list3;
        this.two_factor_source_app = str16;
        this.two_factor_decline = authTwoFactorDeclineJson;
        this.two_factor_linking = authTwoFactorLinkingJson;
        this.two_factor_profile_pic_url = str17;
        this.two_factor_landing_presentation = str18;
        this.two_factor_meta_account = authTwoFactorMetaAccountJson;
        this.checkpoint_required = z9;
        this.checkpoint_url = str19;
        this.checkpoint_resume_token = str20;
        this.account_name = str21;
        this.account_email = str22;
        this.account_photo = str23;
        this.suspended_at = str24;
        this.reactivation_required = z10;
        this.reactivation_token = str25;
        this.scheduled_deletion_date = str26;
    }

    public final AuthCredentialsJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, boolean z2, boolean z3, boolean z4, String str11, List<AuthTosConsentItemJson> list, AuthTosConsentScreenJson authTosConsentScreenJson, String str12, AuthNtpUpsellJson authNtpUpsellJson, AuthNtpUpsellChoiceJson authNtpUpsellChoiceJson, AuthNtpUpsellPendingJson authNtpUpsellPendingJson, String str13, AuthTosJson authTosJson, AuthAttestationRequestJson authAttestationRequestJson, boolean z5, String str14, List<AuthAccountSelectionAccountJson> list2, boolean z6, boolean z7, boolean z8, String str15, List<TwoFactorMethodJson> list3, String str16, AuthTwoFactorDeclineJson authTwoFactorDeclineJson, AuthTwoFactorLinkingJson authTwoFactorLinkingJson, String str17, String str18, AuthTwoFactorMetaAccountJson authTwoFactorMetaAccountJson, boolean z9, String str19, String str20, String str21, String str22, String str23, String str24, boolean z10, String str25, String str26) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        AnonymousClass005.A0z(str6, str7, str8);
        C3cH.A18(str9, str10);
        C7384Etj.A0Y(str11, 14);
        C3cI.A1I(list, 15, str12);
        C7384Etj.A0Y(str13, 21);
        C7384Etj.A0Y(str14, 25);
        C7384Etj.A0Y(list2, 26);
        C7384Etj.A0Y(str15, 30);
        C7384Etj.A0Y(list3, 31);
        C7384Etj.A0Y(str18, 36);
        C7384Etj.A0Y(str19, 39);
        C3cH.A19(str20, str21, str22, 40);
        C7384Etj.A0Y(str23, 43);
        C7384Etj.A0Y(str24, 44);
        C7384Etj.A0Y(str25, 46);
        C7384Etj.A0Y(str26, 47);
        return new AuthCredentialsJson(str, str2, str3, str4, str5, str6, str7, str8, z, str9, str10, z2, z3, z4, str11, list, authTosConsentScreenJson, str12, authNtpUpsellJson, authNtpUpsellChoiceJson, authNtpUpsellPendingJson, str13, authTosJson, authAttestationRequestJson, z5, str14, list2, z6, z7, z8, str15, list3, str16, authTwoFactorDeclineJson, authTwoFactorLinkingJson, str17, str18, authTwoFactorMetaAccountJson, z9, str19, str20, str21, str22, str23, str24, z10, str25, str26);
    }

    public static /* synthetic */ AuthCredentialsJson copy$default(AuthCredentialsJson authCredentialsJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, boolean z2, boolean z3, boolean z4, String str11, List list, AuthTosConsentScreenJson authTosConsentScreenJson, String str12, AuthNtpUpsellJson authNtpUpsellJson, AuthNtpUpsellChoiceJson authNtpUpsellChoiceJson, AuthNtpUpsellPendingJson authNtpUpsellPendingJson, String str13, AuthTosJson authTosJson, AuthAttestationRequestJson authAttestationRequestJson, boolean z5, String str14, List list2, boolean z6, boolean z7, boolean z8, String str15, List list3, String str16, AuthTwoFactorDeclineJson authTwoFactorDeclineJson, AuthTwoFactorLinkingJson authTwoFactorLinkingJson, String str17, String str18, AuthTwoFactorMetaAccountJson authTwoFactorMetaAccountJson, boolean z9, String str19, String str20, String str21, String str22, String str23, String str24, boolean z10, String str25, String str26, int i, int i2, Object obj) {
        String str27 = str;
        String str28 = str2;
        String str29 = str3;
        String str30 = str4;
        String str31 = str5;
        String str32 = str6;
        String str33 = str7;
        String str34 = str8;
        boolean z11 = z;
        String str35 = str9;
        String str36 = str10;
        boolean z12 = z2;
        boolean z13 = z3;
        boolean z14 = z4;
        String str37 = str11;
        List list4 = list2;
        boolean z15 = z6;
        boolean z16 = z7;
        boolean z17 = z8;
        String str38 = str15;
        List list5 = list3;
        boolean z18 = z9;
        String str39 = str22;
        String str40 = str23;
        String str41 = str24;
        boolean z19 = z10;
        String str42 = str25;
        List list6 = list;
        AuthTosConsentScreenJson authTosConsentScreenJson2 = authTosConsentScreenJson;
        String str43 = str12;
        AuthNtpUpsellJson authNtpUpsellJson2 = authNtpUpsellJson;
        AuthNtpUpsellChoiceJson authNtpUpsellChoiceJson2 = authNtpUpsellChoiceJson;
        AuthNtpUpsellPendingJson authNtpUpsellPendingJson2 = authNtpUpsellPendingJson;
        String str44 = str13;
        AuthTosJson authTosJson2 = authTosJson;
        AuthAttestationRequestJson authAttestationRequestJson2 = authAttestationRequestJson;
        boolean z20 = z5;
        String str45 = str14;
        String str46 = str16;
        AuthTwoFactorDeclineJson authTwoFactorDeclineJson2 = authTwoFactorDeclineJson;
        AuthTwoFactorLinkingJson authTwoFactorLinkingJson2 = authTwoFactorLinkingJson;
        String str47 = str17;
        String str48 = str18;
        AuthTwoFactorMetaAccountJson authTwoFactorMetaAccountJson2 = authTwoFactorMetaAccountJson;
        String str49 = str19;
        String str50 = str20;
        String str51 = str21;
        String str52 = str26;
        if ((i & 1) != 0) {
            str27 = authCredentialsJson.registration_state;
        }
        if ((i & 2) != 0) {
            str28 = authCredentialsJson.abra_access_token;
        }
        if ((i & 4) != 0) {
            str29 = authCredentialsJson.abra_user_id;
        }
        if ((i & 8) != 0) {
            str30 = authCredentialsJson.frl_access_token;
        }
        if ((i & 16) != 0) {
            str31 = authCredentialsJson.frl_account_id;
        }
        if ((i & 32) != 0) {
            str32 = authCredentialsJson.refresh_token;
        }
        if ((i & 64) != 0) {
            str33 = authCredentialsJson.auth_state;
        }
        if ((i & 128) != 0) {
            str34 = authCredentialsJson.contact_point;
        }
        if ((i & 256) != 0) {
            z11 = authCredentialsJson.linking_failed;
        }
        if ((i & 512) != 0) {
            str35 = authCredentialsJson.notice_title;
        }
        if ((i & 1024) != 0) {
            str36 = authCredentialsJson.notice_body;
        }
        if ((i & 2048) != 0) {
            z12 = authCredentialsJson.requires_birthday;
        }
        if ((i & 4096) != 0) {
            z13 = authCredentialsJson.requires_name;
        }
        if ((i & 8192) != 0) {
            z14 = authCredentialsJson.requires_consent;
        }
        if ((i & 16384) != 0) {
            str37 = authCredentialsJson.disclosure_presentation;
        }
        if ((i & 32768) != 0) {
            list6 = authCredentialsJson.tos_consent_items;
        }
        if ((i & 65536) != 0) {
            authTosConsentScreenJson2 = authCredentialsJson.tos_consent_screen;
        }
        if ((i & 131072) != 0) {
            str43 = authCredentialsJson.completion_handle;
        }
        if ((i & 262144) != 0) {
            authNtpUpsellJson2 = authCredentialsJson.ntp_upsell;
        }
        if ((i & 524288) != 0) {
            authNtpUpsellChoiceJson2 = authCredentialsJson.ntp_upsell_choice;
        }
        if ((i & 1048576) != 0) {
            authNtpUpsellPendingJson2 = authCredentialsJson.ntp_upsell_pending;
        }
        if ((i & 2097152) != 0) {
            str44 = authCredentialsJson.login_contact_point;
        }
        if ((i & 4194304) != 0) {
            authTosJson2 = authCredentialsJson.tos;
        }
        if ((i & 8388608) != 0) {
            authAttestationRequestJson2 = authCredentialsJson.attestation_request;
        }
        if ((i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0) {
            z20 = authCredentialsJson.account_selection_required;
        }
        if ((i & 33554432) != 0) {
            str45 = authCredentialsJson.selection_state;
        }
        if ((i & 67108864) != 0) {
            list4 = authCredentialsJson.accounts;
        }
        if ((i & 134217728) != 0) {
            z15 = authCredentialsJson.muse_link_transparency;
        }
        if ((i & 268435456) != 0) {
            z16 = authCredentialsJson.show_muse_transparency;
        }
        if ((i & 536870912) != 0) {
            z17 = authCredentialsJson.two_factor_required;
        }
        if ((i & 1073741824) != 0) {
            str38 = authCredentialsJson.two_factor_state;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            list5 = authCredentialsJson.two_factor_methods;
        }
        if ((i2 & 1) != 0) {
            str46 = authCredentialsJson.two_factor_source_app;
        }
        if ((i2 & 2) != 0) {
            authTwoFactorDeclineJson2 = authCredentialsJson.two_factor_decline;
        }
        if ((i2 & 4) != 0) {
            authTwoFactorLinkingJson2 = authCredentialsJson.two_factor_linking;
        }
        if ((i2 & 8) != 0) {
            str47 = authCredentialsJson.two_factor_profile_pic_url;
        }
        if ((i2 & 16) != 0) {
            str48 = authCredentialsJson.two_factor_landing_presentation;
        }
        if ((i2 & 32) != 0) {
            authTwoFactorMetaAccountJson2 = authCredentialsJson.two_factor_meta_account;
        }
        if ((i2 & 64) != 0) {
            z18 = authCredentialsJson.checkpoint_required;
        }
        if ((i2 & 128) != 0) {
            str49 = authCredentialsJson.checkpoint_url;
        }
        if ((i2 & 256) != 0) {
            str50 = authCredentialsJson.checkpoint_resume_token;
        }
        if ((i2 & 512) != 0) {
            str51 = authCredentialsJson.account_name;
        }
        if ((i2 & 1024) != 0) {
            str39 = authCredentialsJson.account_email;
        }
        if ((i2 & 2048) != 0) {
            str40 = authCredentialsJson.account_photo;
        }
        if ((i2 & 4096) != 0) {
            str41 = authCredentialsJson.suspended_at;
        }
        if ((i2 & 8192) != 0) {
            z19 = authCredentialsJson.reactivation_required;
        }
        if ((i2 & 16384) != 0) {
            str42 = authCredentialsJson.reactivation_token;
        }
        if ((i2 & 32768) != 0) {
            str52 = authCredentialsJson.scheduled_deletion_date;
        }
        return authCredentialsJson.copy(str27, str28, str29, str30, str31, str32, str33, str34, z11, str35, str36, z12, z13, z14, str37, list6, authTosConsentScreenJson2, str43, authNtpUpsellJson2, authNtpUpsellChoiceJson2, authNtpUpsellPendingJson2, str44, authTosJson2, authAttestationRequestJson2, z20, str45, list4, z15, z16, z17, str38, list5, str46, authTwoFactorDeclineJson2, authTwoFactorLinkingJson2, str47, str48, authTwoFactorMetaAccountJson2, z18, str49, str50, str51, str39, str40, str41, z19, str42, str52);
    }

    public /* synthetic */ AuthCredentialsJson(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, boolean z2, boolean z3, boolean z4, String str11, List list, AuthTosConsentScreenJson authTosConsentScreenJson, String str12, AuthNtpUpsellJson authNtpUpsellJson, AuthNtpUpsellChoiceJson authNtpUpsellChoiceJson, AuthNtpUpsellPendingJson authNtpUpsellPendingJson, String str13, AuthTosJson authTosJson, AuthAttestationRequestJson authAttestationRequestJson, boolean z5, String str14, List list2, boolean z6, boolean z7, boolean z8, String str15, List list3, String str16, AuthTwoFactorDeclineJson authTwoFactorDeclineJson, AuthTwoFactorLinkingJson authTwoFactorLinkingJson, String str17, String str18, AuthTwoFactorMetaAccountJson authTwoFactorMetaAccountJson, boolean z9, String str19, String str20, String str21, String str22, String str23, String str24, boolean z10, String str25, String str26, C2hx c2hx) {
        boolean z11 = z4;
        List list4 = list;
        List list5 = list2;
        List list6 = list3;
        if ((i & 1) == 0) {
            this.registration_state = "";
        } else {
            this.registration_state = str;
        }
        if ((i & 2) == 0) {
            this.abra_access_token = "";
        } else {
            this.abra_access_token = str2;
        }
        if ((i & 4) == 0) {
            this.abra_user_id = "";
        } else {
            this.abra_user_id = str3;
        }
        if ((i & 8) == 0) {
            this.frl_access_token = "";
        } else {
            this.frl_access_token = str4;
        }
        if ((i & 16) == 0) {
            this.frl_account_id = "";
        } else {
            this.frl_account_id = str5;
        }
        if ((i & 32) == 0) {
            this.refresh_token = "";
        } else {
            this.refresh_token = str6;
        }
        if ((i & 64) == 0) {
            this.auth_state = "";
        } else {
            this.auth_state = str7;
        }
        if ((i & 128) == 0) {
            this.contact_point = "";
        } else {
            this.contact_point = str8;
        }
        if ((i & 256) == 0) {
            this.linking_failed = false;
        } else {
            this.linking_failed = z;
        }
        if ((i & 512) == 0) {
            this.notice_title = "";
        } else {
            this.notice_title = str9;
        }
        if ((i & 1024) == 0) {
            this.notice_body = "";
        } else {
            this.notice_body = str10;
        }
        if ((i & 2048) == 0) {
            this.requires_birthday = false;
        } else {
            this.requires_birthday = z2;
        }
        if ((i & 4096) == 0) {
            this.requires_name = false;
        } else {
            this.requires_name = z3;
        }
        this.requires_consent = (i & 8192) == 0 ? true : z11;
        if ((i & 16384) == 0) {
            this.disclosure_presentation = "";
        } else {
            this.disclosure_presentation = str11;
        }
        this.tos_consent_items = (i & 32768) == 0 ? C0881AGi.A00 : list4;
        if ((65536 & i) == 0) {
            this.tos_consent_screen = null;
        } else {
            this.tos_consent_screen = authTosConsentScreenJson;
        }
        if ((131072 & i) == 0) {
            this.completion_handle = "";
        } else {
            this.completion_handle = str12;
        }
        if ((262144 & i) == 0) {
            this.ntp_upsell = null;
        } else {
            this.ntp_upsell = authNtpUpsellJson;
        }
        if ((524288 & i) == 0) {
            this.ntp_upsell_choice = null;
        } else {
            this.ntp_upsell_choice = authNtpUpsellChoiceJson;
        }
        if ((1048576 & i) == 0) {
            this.ntp_upsell_pending = null;
        } else {
            this.ntp_upsell_pending = authNtpUpsellPendingJson;
        }
        if ((2097152 & i) == 0) {
            this.login_contact_point = "";
        } else {
            this.login_contact_point = str13;
        }
        if ((4194304 & i) == 0) {
            this.tos = null;
        } else {
            this.tos = authTosJson;
        }
        if ((8388608 & i) == 0) {
            this.attestation_request = null;
        } else {
            this.attestation_request = authAttestationRequestJson;
        }
        if ((16777216 & i) == 0) {
            this.account_selection_required = false;
        } else {
            this.account_selection_required = z5;
        }
        if ((33554432 & i) == 0) {
            this.selection_state = "";
        } else {
            this.selection_state = str14;
        }
        this.accounts = (67108864 & i) == 0 ? C0881AGi.A00 : list5;
        if ((134217728 & i) == 0) {
            this.muse_link_transparency = false;
        } else {
            this.muse_link_transparency = z6;
        }
        if ((268435456 & i) == 0) {
            this.show_muse_transparency = false;
        } else {
            this.show_muse_transparency = z7;
        }
        if ((536870912 & i) == 0) {
            this.two_factor_required = false;
        } else {
            this.two_factor_required = z8;
        }
        if ((1073741824 & i) == 0) {
            this.two_factor_state = "";
        } else {
            this.two_factor_state = str15;
        }
        this.two_factor_methods = (i & Integer.MIN_VALUE) == 0 ? C0881AGi.A00 : list6;
        if ((i2 & 1) == 0) {
            this.two_factor_source_app = null;
        } else {
            this.two_factor_source_app = str16;
        }
        if ((i2 & 2) == 0) {
            this.two_factor_decline = null;
        } else {
            this.two_factor_decline = authTwoFactorDeclineJson;
        }
        if ((i2 & 4) == 0) {
            this.two_factor_linking = null;
        } else {
            this.two_factor_linking = authTwoFactorLinkingJson;
        }
        if ((i2 & 8) == 0) {
            this.two_factor_profile_pic_url = null;
        } else {
            this.two_factor_profile_pic_url = str17;
        }
        if ((i2 & 16) == 0) {
            this.two_factor_landing_presentation = "";
        } else {
            this.two_factor_landing_presentation = str18;
        }
        if ((i2 & 32) == 0) {
            this.two_factor_meta_account = null;
        } else {
            this.two_factor_meta_account = authTwoFactorMetaAccountJson;
        }
        if ((i2 & 64) == 0) {
            this.checkpoint_required = false;
        } else {
            this.checkpoint_required = z9;
        }
        if ((i2 & 128) == 0) {
            this.checkpoint_url = "";
        } else {
            this.checkpoint_url = str19;
        }
        if ((i2 & 256) == 0) {
            this.checkpoint_resume_token = "";
        } else {
            this.checkpoint_resume_token = str20;
        }
        if ((i2 & 512) == 0) {
            this.account_name = "";
        } else {
            this.account_name = str21;
        }
        if ((i2 & 1024) == 0) {
            this.account_email = "";
        } else {
            this.account_email = str22;
        }
        if ((i2 & 2048) == 0) {
            this.account_photo = "";
        } else {
            this.account_photo = str23;
        }
        if ((i2 & 4096) == 0) {
            this.suspended_at = "";
        } else {
            this.suspended_at = str24;
        }
        if ((i2 & 8192) == 0) {
            this.reactivation_required = false;
        } else {
            this.reactivation_required = z10;
        }
        if ((i2 & 16384) == 0) {
            this.reactivation_token = "";
        } else {
            this.reactivation_token = str25;
        }
        if ((i2 & 32768) == 0) {
            this.scheduled_deletion_date = "";
        } else {
            this.scheduled_deletion_date = str26;
        }
    }

    public /* synthetic */ AuthCredentialsJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, boolean z2, boolean z3, boolean z4, String str11, List list, AuthTosConsentScreenJson authTosConsentScreenJson, String str12, AuthNtpUpsellJson authNtpUpsellJson, AuthNtpUpsellChoiceJson authNtpUpsellChoiceJson, AuthNtpUpsellPendingJson authNtpUpsellPendingJson, String str13, AuthTosJson authTosJson, AuthAttestationRequestJson authAttestationRequestJson, boolean z5, String str14, List list2, boolean z6, boolean z7, boolean z8, String str15, List list3, String str16, AuthTwoFactorDeclineJson authTwoFactorDeclineJson, AuthTwoFactorLinkingJson authTwoFactorLinkingJson, String str17, String str18, AuthTwoFactorMetaAccountJson authTwoFactorMetaAccountJson, boolean z9, String str19, String str20, String str21, String str22, String str23, String str24, boolean z10, String str25, String str26, int i, int i2, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, C3cG.A1K(i & 256, z), (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, C3cG.A1K(i & 2048, z2), C3cG.A1K(i & 4096, z3), (i & 8192) != 0 ? true : z4, (i & 16384) != 0 ? "" : str11, (i & 32768) != 0 ? C0881AGi.A00 : list, (i & 65536) != 0 ? null : authTosConsentScreenJson, (i & 131072) != 0 ? "" : str12, (i & 262144) != 0 ? null : authNtpUpsellJson, (i & 524288) != 0 ? null : authNtpUpsellChoiceJson, (i & 1048576) != 0 ? null : authNtpUpsellPendingJson, (i & 2097152) != 0 ? "" : str13, (i & 4194304) != 0 ? null : authTosJson, (i & 8388608) != 0 ? null : authAttestationRequestJson, C3cH.A1L(i, HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES, z5), (i & 33554432) != 0 ? "" : str14, (i & 67108864) != 0 ? C0881AGi.A00 : list2, C3cH.A1L(i, 134217728, z6), C3cH.A1L(i, 268435456, z7), C3cH.A1L(i, 536870912, z8), (i & 1073741824) != 0 ? "" : str15, (i & Integer.MIN_VALUE) != 0 ? C0881AGi.A00 : list3, (i2 & 1) != 0 ? null : str16, (i2 & 2) != 0 ? null : authTwoFactorDeclineJson, (i2 & 4) != 0 ? null : authTwoFactorLinkingJson, (i2 & 8) != 0 ? null : str17, (i2 & 16) != 0 ? "" : str18, (i2 & 32) == 0 ? authTwoFactorMetaAccountJson : null, C3cH.A1M(i2, z9), (i2 & 128) != 0 ? "" : str19, (i2 & 256) != 0 ? "" : str20, (i2 & 512) != 0 ? "" : str21, (i2 & 1024) != 0 ? "" : str22, (i2 & 2048) != 0 ? "" : str23, (i2 & 4096) != 0 ? "" : str24, C3cG.A1K(i2 & 8192, z10), (i2 & 16384) != 0 ? "" : str25, (i2 & 32768) != 0 ? "" : str26);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AuthCredentialsJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this("", "", "", "", "", "", "", "", false, "", "", false, false, true, "", c0881AGi, null, "", null, null, null, "", null, null, false, "", c0881AGi, false, false, false, "", c0881AGi, null, null, null, null, "", null, false, "", "", "", "", "", "", false, "", "");
    }
}
