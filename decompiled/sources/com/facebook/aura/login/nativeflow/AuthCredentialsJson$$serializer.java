package com.facebook.aura.login.nativeflow;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j4;
import X.C9j5;
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.analytics.hatch.caa.HatchCaaErrorType;
import com.facebook.aura.auth.strategies.AuraBloksLoginStrategyKt;
import com.facebook.aura.messenger.skills.read.model.PinErrorKt;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import com.facebook.aura.user.provider.AuraViewerDataProviderKt;
import java.util.List;
import kotlin.Deprecated;
import org.maplibre.android.R;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class AuthCredentialsJson$$serializer implements C9cd<AuthCredentialsJson> {
    public static final AuthCredentialsJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final AuthCredentialsJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = AuthCredentialsJson.$childSerializers;
        int i2 = 0;
        String strA0g = null;
        AuthTwoFactorLinkingJson authTwoFactorLinkingJson = null;
        AuthNtpUpsellPendingJson authNtpUpsellPendingJson = null;
        AuthNtpUpsellJson authNtpUpsellJson = null;
        AuthTwoFactorMetaAccountJson authTwoFactorMetaAccountJson = null;
        AuthTwoFactorDeclineJson authTwoFactorDeclineJson = null;
        String strA0g2 = null;
        List list = null;
        AuthAttestationRequestJson authAttestationRequestJson = null;
        AuthTosJson authTosJson = null;
        AuthNtpUpsellChoiceJson authNtpUpsellChoiceJson = null;
        List list2 = null;
        String strA8f = null;
        String strA0h = null;
        String strA0i = null;
        String strA8f2 = null;
        String strA8f3 = null;
        String strA8f4 = null;
        String strA8f5 = null;
        String strA8f6 = null;
        String strA8f7 = null;
        String strA8f8 = null;
        String strA8f9 = null;
        String strA8f10 = null;
        String strA8f11 = null;
        String strA8f12 = null;
        String strA8f13 = null;
        String strA8f14 = null;
        String strA8f15 = null;
        String strA8f16 = null;
        String strA8f17 = null;
        String strA8f18 = null;
        String strA8f19 = null;
        String strA8f20 = null;
        String strA8f21 = null;
        String strA8f22 = null;
        List list3 = null;
        AuthTosConsentScreenJson authTosConsentScreenJson = null;
        int i3 = 0;
        boolean zA8G = false;
        boolean zA8G2 = false;
        boolean zA8G3 = false;
        boolean zA8G4 = false;
        boolean zA8G5 = false;
        boolean zA8G6 = false;
        boolean zA8G7 = false;
        boolean zA8G8 = false;
        boolean zA8G9 = false;
        boolean zA8G10 = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new AuthCredentialsJson(i3, i2, strA8f, strA0h, strA0i, strA8f2, strA8f3, strA8f4, strA8f5, strA8f6, zA8G9, strA8f7, strA8f8, zA8G10, zA8G5, zA8G6, strA8f9, list3, authTosConsentScreenJson, strA8f10, authNtpUpsellJson, authNtpUpsellChoiceJson, authNtpUpsellPendingJson, strA8f11, authTosJson, authAttestationRequestJson, zA8G, strA8f12, list, zA8G2, zA8G4, zA8G7, strA8f13, list2, strA0g2, authTwoFactorDeclineJson, authTwoFactorLinkingJson, strA0g, strA8f14, authTwoFactorMetaAccountJson, zA8G3, strA8f15, strA8f16, strA8f17, strA8f18, strA8f19, strA8f20, zA8G8, strA8f21, strA8f22, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i3 |= 1;
                    continue;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i3 |= 2;
                    continue;
                case 2:
                    strA0i = C3cH.A0i(c9iZ, c9j4A55);
                    i3 |= 4;
                    continue;
                case 3:
                    strA8f2 = c9j4A55.A8f(c9iZ, 3);
                    i3 |= 8;
                    continue;
                case 4:
                    strA8f3 = c9j4A55.A8f(c9iZ, 4);
                    i3 |= 16;
                    continue;
                case 5:
                    strA8f4 = c9j4A55.A8f(c9iZ, 5);
                    i3 |= 32;
                    continue;
                case 6:
                    strA8f5 = c9j4A55.A8f(c9iZ, 6);
                    i3 |= 64;
                    continue;
                case 7:
                    strA8f6 = c9j4A55.A8f(c9iZ, 7);
                    i3 |= 128;
                    continue;
                case 8:
                    zA8G9 = c9j4A55.A8G(c9iZ, 8);
                    i3 |= 256;
                    continue;
                case 9:
                    strA8f7 = c9j4A55.A8f(c9iZ, 9);
                    i3 |= 512;
                    continue;
                case 10:
                    strA8f8 = c9j4A55.A8f(c9iZ, 10);
                    i3 |= 1024;
                    continue;
                case 11:
                    zA8G10 = c9j4A55.A8G(c9iZ, 11);
                    i3 |= 2048;
                    continue;
                case 12:
                    zA8G5 = c9j4A55.A8G(c9iZ, 12);
                    i3 |= 4096;
                    continue;
                case 13:
                    zA8G6 = c9j4A55.A8G(c9iZ, 13);
                    i3 |= 8192;
                    continue;
                case 14:
                    strA8f9 = c9j4A55.A8f(c9iZ, 14);
                    i3 |= 16384;
                    continue;
                case 15:
                    list3 = (List) c9j4A55.A8a(f0cArr[15].getValue(), c9iZ, 15);
                    i = 32768;
                    break;
                case 16:
                    authTosConsentScreenJson = (AuthTosConsentScreenJson) c9j4A55.A8Z(AuthTosConsentScreenJson$$serializer.INSTANCE, c9iZ, 16);
                    i = 65536;
                    break;
                case 17:
                    strA8f10 = c9j4A55.A8f(c9iZ, 17);
                    i = 131072;
                    break;
                case 18:
                    authNtpUpsellJson = (AuthNtpUpsellJson) c9j4A55.A8Z(AuthNtpUpsellJson$$serializer.INSTANCE, c9iZ, 18);
                    i = 262144;
                    break;
                case 19:
                    authNtpUpsellChoiceJson = (AuthNtpUpsellChoiceJson) c9j4A55.A8Z(AuthNtpUpsellChoiceJson$$serializer.INSTANCE, c9iZ, 19);
                    i = 524288;
                    break;
                case 20:
                    authNtpUpsellPendingJson = (AuthNtpUpsellPendingJson) c9j4A55.A8Z(AuthNtpUpsellPendingJson$$serializer.INSTANCE, c9iZ, 20);
                    i = 1048576;
                    break;
                case 21:
                    strA8f11 = c9j4A55.A8f(c9iZ, 21);
                    i = 2097152;
                    break;
                case 22:
                    authTosJson = (AuthTosJson) c9j4A55.A8Z(AuthTosJson$$serializer.INSTANCE, c9iZ, 22);
                    i = 4194304;
                    break;
                case 23:
                    authAttestationRequestJson = (AuthAttestationRequestJson) c9j4A55.A8Z(AuthAttestationRequestJson$$serializer.INSTANCE, c9iZ, 23);
                    i = 8388608;
                    break;
                case 24:
                    zA8G = c9j4A55.A8G(c9iZ, 24);
                    i = HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES;
                    break;
                case 25:
                    strA8f12 = c9j4A55.A8f(c9iZ, 25);
                    i = 33554432;
                    break;
                case 26:
                    list = (List) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 26);
                    i = 67108864;
                    break;
                case 27:
                    zA8G2 = c9j4A55.A8G(c9iZ, 27);
                    i = 134217728;
                    break;
                case 28:
                    zA8G4 = c9j4A55.A8G(c9iZ, 28);
                    i = 268435456;
                    break;
                case 29:
                    zA8G7 = c9j4A55.A8G(c9iZ, 29);
                    i = 536870912;
                    break;
                case 30:
                    strA8f13 = c9j4A55.A8f(c9iZ, 30);
                    i = 1073741824;
                    break;
                case 31:
                    list2 = (List) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 31);
                    i = Integer.MIN_VALUE;
                    break;
                case 32:
                    strA0g2 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 32);
                    i2 |= 1;
                    continue;
                case 33:
                    authTwoFactorDeclineJson = (AuthTwoFactorDeclineJson) c9j4A55.A8Z(AuthTwoFactorDeclineJson$$serializer.INSTANCE, c9iZ, 33);
                    i2 |= 2;
                    continue;
                case 34:
                    authTwoFactorLinkingJson = (AuthTwoFactorLinkingJson) c9j4A55.A8Z(AuthTwoFactorLinkingJson$$serializer.INSTANCE, c9iZ, 34);
                    i2 |= 4;
                    continue;
                case 35:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 35);
                    i2 |= 8;
                    continue;
                case 36:
                    strA8f14 = c9j4A55.A8f(c9iZ, 36);
                    i2 |= 16;
                    continue;
                case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                    authTwoFactorMetaAccountJson = (AuthTwoFactorMetaAccountJson) c9j4A55.A8Z(AuthTwoFactorMetaAccountJson$$serializer.INSTANCE, c9iZ, 37);
                    i2 |= 32;
                    continue;
                case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                    zA8G3 = c9j4A55.A8G(c9iZ, 38);
                    i2 |= 64;
                    continue;
                case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                    strA8f15 = c9j4A55.A8f(c9iZ, 39);
                    i2 |= 128;
                    continue;
                case 40:
                    strA8f16 = c9j4A55.A8f(c9iZ, 40);
                    i2 |= 256;
                    continue;
                case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                    strA8f17 = c9j4A55.A8f(c9iZ, 41);
                    i2 |= 512;
                    continue;
                case 42:
                    strA8f18 = c9j4A55.A8f(c9iZ, 42);
                    i2 |= 1024;
                    continue;
                case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                    strA8f19 = c9j4A55.A8f(c9iZ, 43);
                    i2 |= 2048;
                    continue;
                case 44:
                    strA8f20 = c9j4A55.A8f(c9iZ, 44);
                    i2 |= 4096;
                    continue;
                case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                    zA8G8 = c9j4A55.A8G(c9iZ, 45);
                    i2 |= 8192;
                    continue;
                case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                    strA8f21 = c9j4A55.A8f(c9iZ, 46);
                    i2 |= 16384;
                    continue;
                case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                    strA8f22 = c9j4A55.A8f(c9iZ, 47);
                    i2 |= 32768;
                    continue;
                default:
                    throw C3cG.A17(iA8N);
            }
            i3 |= i;
        }
    }

    static {
        AuthCredentialsJson$$serializer authCredentialsJson$$serializer = new AuthCredentialsJson$$serializer();
        INSTANCE = authCredentialsJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.login.nativeflow.AuthCredentialsJson", authCredentialsJson$$serializer, 48);
        c9iKA1C.A08("registration_state", true);
        c9iKA1C.A08("abra_access_token", true);
        c9iKA1C.A08("abra_user_id", true);
        c9iKA1C.A08(AuraBloksLoginStrategyKt.FRL_ACCESS_TOKEN_KEY, true);
        c9iKA1C.A08("frl_account_id", true);
        c9iKA1C.A08("refresh_token", true);
        c9iKA1C.A08("auth_state", true);
        c9iKA1C.A08("contact_point", true);
        c9iKA1C.A08("linking_failed", true);
        c9iKA1C.A08("notice_title", true);
        c9iKA1C.A08("notice_body", true);
        c9iKA1C.A08("requires_birthday", true);
        c9iKA1C.A08(AuraViewerDataProviderKt.KEY_REQUIRES_NAME, true);
        c9iKA1C.A08("requires_consent", true);
        c9iKA1C.A08("disclosure_presentation", true);
        c9iKA1C.A08("tos_consent_items", true);
        c9iKA1C.A08("tos_consent_screen", true);
        c9iKA1C.A08("completion_handle", true);
        c9iKA1C.A08("ntp_upsell", true);
        c9iKA1C.A08("ntp_upsell_choice", true);
        c9iKA1C.A08("ntp_upsell_pending", true);
        c9iKA1C.A08("login_contact_point", true);
        c9iKA1C.A08("tos", true);
        c9iKA1C.A08("attestation_request", true);
        c9iKA1C.A08("account_selection_required", true);
        c9iKA1C.A08("selection_state", true);
        c9iKA1C.A08("accounts", true);
        c9iKA1C.A08("muse_link_transparency", true);
        c9iKA1C.A08("show_muse_transparency", true);
        c9iKA1C.A08(PinErrorKt.ERROR_CODE_TWO_FACTOR_REQUIRED, true);
        c9iKA1C.A08("two_factor_state", true);
        c9iKA1C.A08("two_factor_methods", true);
        c9iKA1C.A08("two_factor_source_app", true);
        c9iKA1C.A08("two_factor_decline", true);
        c9iKA1C.A08("two_factor_linking", true);
        c9iKA1C.A08("two_factor_profile_pic_url", true);
        c9iKA1C.A08("two_factor_landing_presentation", true);
        c9iKA1C.A08("two_factor_meta_account", true);
        c9iKA1C.A08("checkpoint_required", true);
        c9iKA1C.A08("checkpoint_url", true);
        c9iKA1C.A08("checkpoint_resume_token", true);
        c9iKA1C.A08("account_name", true);
        c9iKA1C.A08("account_email", true);
        c9iKA1C.A08("account_photo", true);
        c9iKA1C.A08("suspended_at", true);
        c9iKA1C.A08(HatchCaaErrorType.REACTIVATION_REQUIRED, true);
        c9iKA1C.A08("reactivation_token", true);
        c9iKA1C.A08("scheduled_deletion_date", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = AuthCredentialsJson.$childSerializers;
        C9hr<?>[] c9hrArr = new C9hr[48];
        C07779iq c07779iq = C07779iq.A01;
        C07839ix c07839ix = C07839ix.A00;
        System.arraycopy(new C9hr[]{c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07839ix, c07779iq, c07779iq, c07839ix, c07839ix, c07839ix, c07779iq, C3cG.A16(f0cArr, 15), AbstractC07749im.A00(AuthTosConsentScreenJson$$serializer.INSTANCE), c07779iq, AbstractC07749im.A00(AuthNtpUpsellJson$$serializer.INSTANCE), AbstractC07749im.A00(AuthNtpUpsellChoiceJson$$serializer.INSTANCE), AbstractC07749im.A00(AuthNtpUpsellPendingJson$$serializer.INSTANCE), c07779iq, AbstractC07749im.A00(AuthTosJson$$serializer.INSTANCE), AbstractC07749im.A00(AuthAttestationRequestJson$$serializer.INSTANCE), c07839ix, c07779iq, C3cG.A16(f0cArr, 26)}, 0, c9hrArr, 0, 27);
        System.arraycopy(new C9hr[]{c07839ix, c07839ix, c07839ix, c07779iq, C3cG.A16(f0cArr, 31), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(AuthTwoFactorDeclineJson$$serializer.INSTANCE), AbstractC07749im.A00(AuthTwoFactorLinkingJson$$serializer.INSTANCE), AbstractC07749im.A00(c07779iq), c07779iq, AbstractC07749im.A00(AuthTwoFactorMetaAccountJson$$serializer.INSTANCE), c07839ix, c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07839ix, c07779iq, c07779iq}, 0, c9hrArr, 27, 21);
        return c9hrArr;
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9cd
    public /* bridge */ C9hr<?>[] typeParametersSerializers() {
        return C5hV.A00;
    }

    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, AuthCredentialsJson authCredentialsJson) {
        AnonymousClass003.A0u(interfaceC07789is, authCredentialsJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        AuthCredentialsJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(authCredentialsJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
