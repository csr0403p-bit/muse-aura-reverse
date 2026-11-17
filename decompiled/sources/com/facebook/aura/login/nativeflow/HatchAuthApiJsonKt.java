package com.facebook.aura.login.nativeflow;

import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C10571Hud;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;
import X.C7BY;
import X.C7Je;
import android.net.Uri;
import com.facebook.aura.json.HatchPasswordCopyJson;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class HatchAuthApiJsonKt {
    public static final String PUBLIC_KEY = "public-key";

    public static final HatchPasswordCopy hatchPasswordCopyOf(HatchPasswordCopyJson hatchPasswordCopyJson, Boolean bool, HatchAuthFlow hatchAuthFlow) {
        Boolean bool2;
        if (hatchPasswordCopyJson == null || (bool2 = hatchPasswordCopyJson.is_f3) == null) {
            return null;
        }
        boolean zBooleanValue = bool2.booleanValue();
        Boolean bool3 = hatchPasswordCopyJson.has_own_password;
        if (bool3 != null) {
            return new HatchPasswordCopy(zBooleanValue, !(bool != null ? bool.booleanValue() : AnonymousClass002.A1Z(hatchAuthFlow, HatchAuthFlow.Login)), bool3.booleanValue(), hatchPasswordCopyJson.source_apps.contains(HatchNtpSourceApp.Facebook.getWireValue()), hatchPasswordCopyJson.source_apps.contains(HatchNtpSourceApp.Instagram.getWireValue()));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a A[PHI: r16
  0x002a: PHI (r16v4 com.facebook.aura.login.nativeflow.HatchItemizedConsent) = 
  (r16v2 com.facebook.aura.login.nativeflow.HatchItemizedConsent)
  (r16v5 com.facebook.aura.login.nativeflow.HatchItemizedConsent)
 binds: [B:36:0x00fb, B:9:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0  */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.facebook.aura.login.nativeflow.HatchAccountSelectionChallenge, com.facebook.aura.login.nativeflow.HatchAttestationRequest, com.facebook.aura.login.nativeflow.HatchCheckpointChallenge, com.facebook.aura.login.nativeflow.HatchDisclosurePresentation, com.facebook.aura.login.nativeflow.HatchItemizedConsent, com.facebook.aura.login.nativeflow.HatchNtpUpsellOffer, com.facebook.aura.login.nativeflow.HatchReactivationChallenge, com.facebook.aura.login.nativeflow.HatchTosDisclosure, com.facebook.aura.login.nativeflow.HatchTwoFactorChallenge, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r39v0 */
    /* JADX WARN: Type inference failed for: r39v1, types: [com.facebook.aura.login.nativeflow.HatchNtpUpsellOffer, java.lang.String] */
    /* JADX WARN: Type inference failed for: r39v2 */
    /* JADX WARN: Type inference failed for: r39v3 */
    /* JADX WARN: Type inference failed for: r42v2, types: [com.facebook.aura.login.nativeflow.HatchTwoFactorMetaAccount, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.facebook.aura.login.nativeflow.HatchAccountSelectionChallenge, com.facebook.aura.login.nativeflow.HatchAttestationRequest, com.facebook.aura.login.nativeflow.HatchCheckpointChallenge, com.facebook.aura.login.nativeflow.HatchDisclosurePresentation, com.facebook.aura.login.nativeflow.HatchItemizedConsent, com.facebook.aura.login.nativeflow.HatchLandingPresentation, com.facebook.aura.login.nativeflow.HatchNtpUpsellOffer, com.facebook.aura.login.nativeflow.HatchReactivationChallenge, com.facebook.aura.login.nativeflow.HatchTosDisclosure, com.facebook.aura.login.nativeflow.HatchTwoFactorChallenge, java.lang.Object, java.lang.String, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.login.nativeflow.HatchAuthCredentials toConfirmOtpCredentials(com.facebook.aura.login.nativeflow.AuthCredentialsJson r70) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApiJsonKt.toConfirmOtpCredentials(com.facebook.aura.login.nativeflow.AuthCredentialsJson):com.facebook.aura.login.nativeflow.HatchAuthCredentials");
    }

    public static final HatchAuthCredentials toCredentials(AuthRegisterCompletionResponseJson authRegisterCompletionResponseJson) {
        C7384Etj.A0Y(authRegisterCompletionResponseJson, 0);
        String str = authRegisterCompletionResponseJson.abra_access_token;
        String str2 = authRegisterCompletionResponseJson.abra_user_id;
        String str3 = authRegisterCompletionResponseJson.frl_access_token;
        String str4 = authRegisterCompletionResponseJson.frl_account_id;
        String str5 = authRegisterCompletionResponseJson.refresh_token;
        if (C7BY.A0j(str5)) {
            str5 = null;
        }
        return new HatchAuthCredentials("", str, str2, str3, str4, false, false, false, HatchDisclosurePresentation.INLINE, null, "", null, null, null, null, null, null, null, null, false, "", "", false, "", "", null, null, str5, HatchLandingPresentation.STANDARD, null);
    }

    public static final HatchSsoAccountInfoResponse toDomain(AuthSsoAccountInfoResponseJson authSsoAccountInfoResponseJson) {
        ArrayList arrayListA0m;
        C7384Etj.A0Y(authSsoAccountInfoResponseJson, 0);
        List<AuthSsoMetaAccountJson> list = authSsoAccountInfoResponseJson.meta_accounts;
        if (list != null) {
            arrayListA0m = AnonymousClass002.A0m(list);
            for (AuthSsoMetaAccountJson authSsoMetaAccountJson : list) {
                String str = authSsoMetaAccountJson.primary_ref;
                List<String> list2 = authSsoMetaAccountJson.member_refs;
                String str2 = authSsoMetaAccountJson.display_label;
                List<AuthSsoLinkedAccountJson> list3 = authSsoMetaAccountJson.linked_accounts;
                ArrayList arrayListA0m2 = AnonymousClass002.A0m(list3);
                Iterator<AuthSsoLinkedAccountJson> it = list3.iterator();
                while (it.hasNext()) {
                    C3cJ.A0t(arrayListA0m2, it);
                }
                boolean z = authSsoMetaAccountJson.one_tap_login_eligible;
                boolean z2 = authSsoMetaAccountJson.has_hatch;
                boolean z3 = authSsoMetaAccountJson.has_meta_ai;
                boolean z4 = authSsoMetaAccountJson.is_f3;
                AuthSsoMuseProfileJson authSsoMuseProfileJson = authSsoMetaAccountJson.muse_profile;
                arrayListA0m.add(new HatchSsoMetaAccount(str, list2, str2, arrayListA0m2, z, z2, z3, z4, authSsoMuseProfileJson != null ? toDomain(authSsoMuseProfileJson) : null, authSsoMetaAccountJson.show_muse_transparency, HatchDisclosurePresentation.Companion.fromWire(authSsoMetaAccountJson.disclosure_presentation), authSsoMetaAccountJson.supersedes_saved_account));
            }
        } else {
            arrayListA0m = null;
        }
        AuthTosJson authTosJson = authSsoAccountInfoResponseJson.tos;
        HatchTosDisclosure disclosure = authTosJson != null ? HatchAuthTosJsonKt.toDisclosure(authTosJson, false) : null;
        String str3 = authSsoAccountInfoResponseJson.zari_candidate_ref;
        if (str3 == null || C7BY.A0j(str3)) {
            str3 = null;
        }
        List<String> list4 = authSsoAccountInfoResponseJson.superseded_saved_account_ids;
        ArrayList arrayListA0h = C3cG.A0h();
        for (String str4 : list4) {
            AnonymousClass006.A1F(str4, str4, arrayListA0h);
        }
        return new HatchSsoAccountInfoResponse(arrayListA0m, disclosure, str3, AbstractC0878AGe.A0g(arrayListA0h), authSsoAccountInfoResponseJson.suppress_tos_clause, HatchLandingPresentation.Companion.fromWire(authSsoAccountInfoResponseJson.landing_presentation));
    }

    public static final HatchNtpUpsellOffer toOffer(AuthNtpUpsellJson authNtpUpsellJson) {
        AuthTosJson authTosJson;
        HatchTosDisclosure disclosure;
        AuthNtpUpsellAccountJson authNtpUpsellAccountJson = authNtpUpsellJson.account;
        if (authNtpUpsellAccountJson != null) {
            String str = authNtpUpsellAccountJson.display_label;
            if (str == null && (str = authNtpUpsellAccountJson.email) == null) {
                str = authNtpUpsellAccountJson.display_name;
            }
            if (!C7BY.A0j(authNtpUpsellJson.link_handle) && !C7BY.A0j(str) && (authTosJson = authNtpUpsellJson.tos) != null && (disclosure = HatchAuthTosJsonKt.toDisclosure(authTosJson, false)) != null) {
                String str2 = authNtpUpsellJson.link_handle;
                String str3 = authNtpUpsellJson.contact_point;
                if (str3 == null || C7BY.A0j(str3)) {
                    str3 = null;
                }
                String str4 = authNtpUpsellAccountJson.source_app;
                if (C7BY.A0j(str4)) {
                    str4 = null;
                }
                String str5 = authNtpUpsellAccountJson.profile_pic_url;
                if (str5 == null || !str5.startsWith(AuraDeeplinkHandlerActivity.HTTP)) {
                    str5 = null;
                }
                List<AuthSsoLinkedAccountJson> list = authNtpUpsellAccountJson.linked_accounts;
                ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                Iterator<AuthSsoLinkedAccountJson> it = list.iterator();
                while (it.hasNext()) {
                    C3cJ.A0t(arrayListA0i, it);
                }
                String str6 = authNtpUpsellAccountJson.display_name;
                return new HatchNtpUpsellOffer(str2, str3, new HatchNtpUpsellAccount(str4, str, str5, arrayListA0i, C7BY.A0j(str6) ? null : str6), disclosure, authNtpUpsellJson.show_muse_transparency, authNtpUpsellJson.is_f3, authNtpUpsellJson.suppress_tos_clause, HatchLandingPresentation.Companion.fromWire(authNtpUpsellJson.landing_presentation));
            }
        }
        return null;
    }

    public static final boolean isItemizedConsentScreen(AuthCredentialsJson authCredentialsJson) {
        return AnonymousClass002.A1Z(HatchDisclosurePresentation.Companion.fromWire(authCredentialsJson.disclosure_presentation), HatchDisclosurePresentation.ITEMIZED_CONSENT_SCREEN);
    }

    public static final HatchAccountSelectionChallenge toAccountSelectionChallenge(AuthCredentialsJson authCredentialsJson) {
        if (!authCredentialsJson.account_selection_required || C7BY.A0j(authCredentialsJson.selection_state)) {
            return null;
        }
        List<AuthAccountSelectionAccountJson> list = authCredentialsJson.accounts;
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        Iterator<AuthAccountSelectionAccountJson> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                int size = arrayListA0m.size();
                boolean z = authCredentialsJson.muse_link_transparency;
                if (size >= (z ? 1 : 2)) {
                    return new HatchAccountSelectionChallenge(authCredentialsJson.selection_state, arrayListA0m, z, authCredentialsJson.show_muse_transparency);
                }
                throw new IllegalArgumentException("Failed requirement.");
            }
            AuthAccountSelectionAccountJson next = it.next();
            if (C7BY.A0j(next.account_ref)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            List<AuthAccountSelectionProfileJson> list2 = next.profiles;
            ArrayList arrayListA0m2 = AnonymousClass002.A0m(list2);
            for (AuthAccountSelectionProfileJson authAccountSelectionProfileJson : list2) {
                if (C7BY.A0j(authAccountSelectionProfileJson.display_name)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                String str = authAccountSelectionProfileJson.platform;
                if (C7BY.A0j(str)) {
                    str = null;
                }
                String str2 = authAccountSelectionProfileJson.display_name;
                String str3 = authAccountSelectionProfileJson.profile_pic_url;
                if (str3 == null || !str3.startsWith(AuraDeeplinkHandlerActivity.HTTP)) {
                    str3 = null;
                }
                arrayListA0m2.add(new HatchAccountSelectionProfile(str, str2, str3));
            }
            if (arrayListA0m2.isEmpty()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            arrayListA0m.add(new HatchAccountSelectionAccount(next.account_ref, arrayListA0m2, HatchAccountStatus.Companion.fromWire(next.account_status)));
        }
    }

    public static final HatchCheckpointChallenge toCheckpointChallenge(AuthCredentialsJson authCredentialsJson) {
        HatchCheckpointUrlPolicy hatchCheckpointUrlPolicy;
        String strSanitizedInitialUrl;
        if (!authCredentialsJson.checkpoint_required || (strSanitizedInitialUrl = (hatchCheckpointUrlPolicy = HatchCheckpointUrlPolicy.INSTANCE).sanitizedInitialUrl(authCredentialsJson.checkpoint_url)) == null) {
            return null;
        }
        String str = authCredentialsJson.account_name;
        String str2 = authCredentialsJson.account_email;
        String str3 = authCredentialsJson.account_photo;
        return new HatchCheckpointChallenge(strSanitizedInitialUrl, str, str2, AnonymousClass005.A1a(str3, AuraDeeplinkHandlerActivity.HTTP) ? str3 : null, toSuspendedOnDate(authCredentialsJson.suspended_at), hatchCheckpointUrlPolicy.sanitizedResumeToken(strSanitizedInitialUrl, authCredentialsJson.checkpoint_resume_token));
    }

    public static final List<HatchNtpUpsellChoiceRow> usableRows(AuthNtpUpsellChoiceJson authNtpUpsellChoiceJson, HatchTosDisclosure hatchTosDisclosure) {
        HatchTwoFactorChallenge hatchTwoFactorChallenge;
        HatchTwoFactorMetaAccount hatchTwoFactorMetaAccount;
        List<AuthNtpUpsellChoiceRowJson> list = authNtpUpsellChoiceJson.accounts;
        ArrayList arrayListA0h = C3cG.A0h();
        for (AuthNtpUpsellChoiceRowJson authNtpUpsellChoiceRowJson : list) {
            AuthNtpUpsellJson authNtpUpsellJson = authNtpUpsellChoiceRowJson.ntp_upsell;
            String str = null;
            HatchNtpUpsellOffer offer = authNtpUpsellJson != null ? toOffer(authNtpUpsellJson) : null;
            if (C7BY.A0j(authNtpUpsellChoiceRowJson.two_factor_state)) {
                hatchTwoFactorChallenge = null;
            } else {
                String str2 = authNtpUpsellChoiceRowJson.two_factor_state;
                List<TwoFactorMethodJson> list2 = authNtpUpsellChoiceRowJson.two_factor_methods;
                ArrayList arrayListA0m = AnonymousClass002.A0m(list2);
                Iterator<TwoFactorMethodJson> it = list2.iterator();
                while (it.hasNext()) {
                    arrayListA0m.add(toDomain(it.next()));
                }
                hatchTwoFactorChallenge = new HatchTwoFactorChallenge(str2, arrayListA0m, HatchTwoFactorSourceApp.Companion.fromWire(authNtpUpsellChoiceRowJson.two_factor_source_app), null);
            }
            boolean z = hatchTwoFactorChallenge != null && (authNtpUpsellChoiceRowJson.is_f3 || hatchTwoFactorChallenge.sourceApp == HatchTwoFactorSourceApp.Meta);
            if (AnonymousClass002.A1Y(offer) != (hatchTwoFactorChallenge == null) && (!z || hatchTosDisclosure != null)) {
                HatchTwoFactorSourceApp hatchTwoFactorSourceAppFromWire = HatchTwoFactorSourceApp.Companion.fromWire(authNtpUpsellChoiceRowJson.source_app);
                if (z) {
                    String str3 = hatchTosDisclosure != null ? hatchTosDisclosure.contentVersion : null;
                    String str4 = hatchTwoFactorChallenge.state;
                    List<HatchTwoFactorMethod> list3 = hatchTwoFactorChallenge.methods;
                    HatchTwoFactorSourceApp hatchTwoFactorSourceApp = hatchTwoFactorChallenge.sourceApp;
                    AnonymousClass003.A0u(str4, list3);
                    hatchTwoFactorChallenge = new HatchTwoFactorChallenge(str4, list3, hatchTwoFactorSourceApp, str3);
                }
                String str5 = authNtpUpsellChoiceRowJson.profile_pic_url;
                if (str5 == null || C7BY.A0j(str5)) {
                    str5 = null;
                }
                if (z) {
                    String str6 = authNtpUpsellChoiceRowJson.display_label;
                    if (str6 != null && !C7BY.A0j(str6)) {
                        str = str6;
                    }
                    List<AuthSsoLinkedAccountJson> list4 = authNtpUpsellChoiceRowJson.linked_accounts;
                    ArrayList arrayListA0m2 = AnonymousClass002.A0m(list4);
                    Iterator<AuthSsoLinkedAccountJson> it2 = list4.iterator();
                    while (it2.hasNext()) {
                        C3cJ.A0t(arrayListA0m2, it2);
                    }
                    hatchTwoFactorMetaAccount = new HatchTwoFactorMetaAccount(str, arrayListA0m2);
                } else {
                    hatchTwoFactorMetaAccount = null;
                }
                arrayListA0h.add(new HatchNtpUpsellChoiceRow(hatchTwoFactorSourceAppFromWire, offer, hatchTwoFactorChallenge, str5, hatchTwoFactorMetaAccount));
            }
        }
        return arrayListA0h;
    }

    public static final List<HatchNtpUpsellChoiceRow> toChoice(AuthNtpUpsellChoiceJson authNtpUpsellChoiceJson, HatchTosDisclosure hatchTosDisclosure) {
        List<HatchNtpUpsellChoiceRow> listUsableRows = usableRows(authNtpUpsellChoiceJson, hatchTosDisclosure);
        if (listUsableRows.size() <= 1) {
            return null;
        }
        return listUsableRows;
    }

    public static final LocalDate toDeletionDate(String str) {
        try {
            return Instant.parse(str).atZone(ZoneId.systemDefault()).toLocalDate();
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    public static final HatchNtpUpsellOffer toLoneOffer(AuthNtpUpsellChoiceJson authNtpUpsellChoiceJson, HatchTosDisclosure hatchTosDisclosure) {
        HatchNtpUpsellChoiceRow hatchNtpUpsellChoiceRow = (HatchNtpUpsellChoiceRow) AbstractC0878AGe.A0K(usableRows(authNtpUpsellChoiceJson, hatchTosDisclosure));
        if (hatchNtpUpsellChoiceRow != null) {
            return hatchNtpUpsellChoiceRow.offer;
        }
        return null;
    }

    public static final LocalDate toSuspendedOnDate(String str) {
        try {
            return Instant.parse(str).atZone(ZoneOffset.UTC).toLocalDate();
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static final HatchTwoFactorMethodType toTwoFactorMethodType(String str) {
        switch (str.hashCode()) {
            case -1384765706:
                if (str.equals("ADMIN_CODES")) {
                    return HatchTwoFactorMethodType.ADMIN_CODES;
                }
                break;
            case -274258212:
                if (str.equals("RECOVERY_CODES")) {
                    return HatchTwoFactorMethodType.RECOVERY_CODES;
                }
                break;
            case 82233:
                if (str.equals("SMS")) {
                    return HatchTwoFactorMethodType.SMS;
                }
                break;
            case 2581047:
                if (str.equals("TOTP")) {
                    return HatchTwoFactorMethodType.TOTP;
                }
                break;
        }
        return HatchTwoFactorMethodType.UNKNOWN;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.login.nativeflow.HatchAuthCredentials toCredentials(com.facebook.aura.login.nativeflow.AuthCredentialsJson r47, com.facebook.aura.login.nativeflow.HatchItemizedConsent r48) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApiJsonKt.toCredentials(com.facebook.aura.login.nativeflow.AuthCredentialsJson, com.facebook.aura.login.nativeflow.HatchItemizedConsent):com.facebook.aura.login.nativeflow.HatchAuthCredentials");
    }

    public static final HatchMuseProfile toDomain(AuthSsoMuseProfileJson authSsoMuseProfileJson) {
        String strA0l;
        String str;
        Object objA0s;
        String scheme;
        String host;
        String str2 = authSsoMuseProfileJson.name;
        if (str2 == null || (strA0l = AnonymousClass002.A0l(str2)) == null || strA0l.length() <= 0 || (str = authSsoMuseProfileJson.profile_picture_url) == null || C7BY.A0j(str)) {
            return null;
        }
        try {
            objA0s = C7Je.A01(str);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        Uri uri = (Uri) objA0s;
        if (uri == null) {
            return null;
        }
        String scheme2 = uri.getScheme();
        if (((scheme2 == null || !scheme2.equalsIgnoreCase(AuraDeeplinkHandlerActivity.HTTP)) && ((scheme = uri.getScheme()) == null || !scheme.equalsIgnoreCase("https"))) || (host = uri.getHost()) == null || C7BY.A0j(host)) {
            return null;
        }
        return new HatchMuseProfile(strA0l, str);
    }

    public static final HatchAuthCredentials toCredentials(AuthCredentialsJson authCredentialsJson) {
        HatchItemizedConsent hatchItemizedConsentItemizedConsentFrom;
        C7384Etj.A0Y(authCredentialsJson, 0);
        if (isItemizedConsentScreen(authCredentialsJson)) {
            hatchItemizedConsentItemizedConsentFrom = HatchAuthTosJsonKt.itemizedConsentFrom(authCredentialsJson.tos_consent_items, authCredentialsJson.tos_consent_screen);
        } else {
            hatchItemizedConsentItemizedConsentFrom = null;
        }
        return toCredentials(authCredentialsJson, hatchItemizedConsentItemizedConsentFrom);
    }

    public static final HatchTwoFactorMethod toDomain(TwoFactorMethodJson twoFactorMethodJson) {
        String str = twoFactorMethodJson.method_id;
        HatchTwoFactorMethodType twoFactorMethodType = toTwoFactorMethodType(twoFactorMethodJson.method_type);
        String str2 = twoFactorMethodJson.label;
        String str3 = twoFactorMethodJson.display_contact_point;
        Integer num = null;
        if (str3 == null || C7BY.A0j(str3)) {
            str3 = null;
        }
        int i = twoFactorMethodJson.code_length;
        Integer numValueOf = Integer.valueOf(i);
        if (i > 0) {
            num = numValueOf;
        }
        return new HatchTwoFactorMethod(str, twoFactorMethodType, str2, str3, num);
    }

    public static final HatchSsoLinkedAccount toDomain(AuthSsoLinkedAccountJson authSsoLinkedAccountJson) {
        String str = authSsoLinkedAccountJson.platform;
        String str2 = null;
        if (str == null || C7BY.A0j(str)) {
            str = null;
        }
        String str3 = authSsoLinkedAccountJson.profile_pic_url;
        if (str3 == null || !str3.startsWith(AuraDeeplinkHandlerActivity.HTTP)) {
            str3 = null;
        }
        String str4 = authSsoLinkedAccountJson.display_name;
        if (str4 != null && !C7BY.A0j(str4)) {
            str2 = str4;
        }
        return new HatchSsoLinkedAccount(str, str3, str2);
    }
}
