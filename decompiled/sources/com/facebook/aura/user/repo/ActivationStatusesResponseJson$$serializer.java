package com.facebook.aura.user.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import com.facebook.aura.user.provider.AuraViewerDataProviderKt;
import java.util.List;
import kotlin.Deprecated;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class ActivationStatusesResponseJson$$serializer implements C9cd<ActivationStatusesResponseJson> {
    public static final ActivationStatusesResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ActivationStatusesResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        OnboardingScreenCopyJson onboardingScreenCopyJson = null;
        OnboardingScreenCopyJson onboardingScreenCopyJson2 = null;
        String str = null;
        JsonElement jsonElement = null;
        OnboardingScreenCopyJson onboardingScreenCopyJson3 = null;
        String str2 = null;
        OnboardingScreenCopyJson onboardingScreenCopyJson4 = null;
        OnboardingScreenCopyJson onboardingScreenCopyJson5 = null;
        String str3 = null;
        String str4 = null;
        Boolean bool = null;
        String str5 = null;
        List list = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        String str6 = null;
        int i2 = 0;
        boolean zA8G = false;
        boolean zA8G2 = false;
        boolean zA8G3 = false;
        boolean zA8G4 = false;
        boolean zA8G5 = false;
        boolean zA8G6 = false;
        boolean zA8G7 = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ActivationStatusesResponseJson(i2, bool2, bool3, bool4, bool5, bool6, str6, zA8G2, str, list, str5, zA8G6, zA8G5, zA8G7, str2, zA8G, zA8G3, zA8G4, bool, str4, str3, onboardingScreenCopyJson, onboardingScreenCopyJson2, onboardingScreenCopyJson5, onboardingScreenCopyJson4, jsonElement, onboardingScreenCopyJson3, (C2hx) null);
                case 0:
                    bool2 = (Boolean) c9j4A55.A8Z(C07839ix.A00, c9iZ, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    bool3 = (Boolean) c9j4A55.A8Z(C07839ix.A00, c9iZ, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    bool4 = (Boolean) c9j4A55.A8Z(C07839ix.A00, c9iZ, 2);
                    i2 |= 4;
                    continue;
                case 3:
                    bool5 = (Boolean) c9j4A55.A8Z(C07839ix.A00, c9iZ, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    bool6 = (Boolean) c9j4A55.A8Z(C07839ix.A00, c9iZ, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    str6 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    zA8G2 = c9j4A55.A8G(c9iZ, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    str = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    list = (List) c9j4A55.A8a(LenientStringListSerializer.INSTANCE, c9iZ, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    str5 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    zA8G6 = c9j4A55.A8G(c9iZ, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    zA8G5 = c9j4A55.A8G(c9iZ, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    zA8G7 = c9j4A55.A8G(c9iZ, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    str2 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    zA8G = c9j4A55.A8G(c9iZ, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    zA8G3 = c9j4A55.A8G(c9iZ, 15);
                    i = 32768;
                    break;
                case 16:
                    zA8G4 = c9j4A55.A8G(c9iZ, 16);
                    i = 65536;
                    break;
                case 17:
                    bool = (Boolean) c9j4A55.A8Z(C07839ix.A00, c9iZ, 17);
                    i = 131072;
                    break;
                case 18:
                    str4 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 18);
                    i = 262144;
                    break;
                case 19:
                    str3 = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 19);
                    i = 524288;
                    break;
                case 20:
                    onboardingScreenCopyJson = (OnboardingScreenCopyJson) c9j4A55.A8Z(OnboardingScreenCopyJson$$serializer.INSTANCE, c9iZ, 20);
                    i = 1048576;
                    break;
                case 21:
                    onboardingScreenCopyJson2 = (OnboardingScreenCopyJson) c9j4A55.A8Z(OnboardingScreenCopyJson$$serializer.INSTANCE, c9iZ, 21);
                    i = 2097152;
                    break;
                case 22:
                    onboardingScreenCopyJson5 = (OnboardingScreenCopyJson) c9j4A55.A8Z(OnboardingScreenCopyJson$$serializer.INSTANCE, c9iZ, 22);
                    i = 4194304;
                    break;
                case 23:
                    onboardingScreenCopyJson4 = (OnboardingScreenCopyJson) c9j4A55.A8Z(OnboardingScreenCopyJson$$serializer.INSTANCE, c9iZ, 23);
                    i = 8388608;
                    break;
                case 24:
                    jsonElement = (JsonElement) c9j4A55.A8Z(JsonElementSerializer.A00, c9iZ, 24);
                    i = HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES;
                    break;
                case 25:
                    onboardingScreenCopyJson3 = (OnboardingScreenCopyJson) c9j4A55.A8Z(OnboardingScreenCopyJson$$serializer.INSTANCE, c9iZ, 25);
                    i = 33554432;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
    }

    static {
        ActivationStatusesResponseJson$$serializer activationStatusesResponseJson$$serializer = new ActivationStatusesResponseJson$$serializer();
        INSTANCE = activationStatusesResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.user.repo.ActivationStatusesResponseJson", activationStatusesResponseJson$$serializer, 26);
        c9iKA1C.A08(AuraViewerDataProviderKt.KEY_HAS_HATCH_ACCESS, true);
        c9iKA1C.A08(AuraViewerDataProviderKt.KEY_HAS_CLEARED_ACQUISITION, true);
        c9iKA1C.A08(AuraViewerDataProviderKt.KEY_INVITE_CODE_ENTRY_AVAILABLE, true);
        c9iKA1C.A08(AuraViewerDataProviderKt.KEY_WAITLIST_AVAILABLE, true);
        c9iKA1C.A08(AuraViewerDataProviderKt.KEY_HAS_PROVISIONED_VM, true);
        c9iKA1C.A08(AuraViewerDataProviderKt.KEY_WAITLIST_STATUS, true);
        c9iKA1C.A08(AuraViewerDataProviderKt.KEY_HAS_REDEEMED_INVITE_CODE, true);
        c9iKA1C.A08(AgeCheckFunnelLogging.KEY_CCV_STATUS, true);
        c9iKA1C.A08(AuraViewerDataProviderKt.KEY_AGE_VERIFICATION_METHODS, true);
        c9iKA1C.A08(AuraViewerDataProviderKt.KEY_AGE_VERIFICATION_LAYOUT, true);
        c9iKA1C.A08(AuraViewerDataProviderKt.KEY_HAS_COMPLETED_HATCH_ACTIVATION, true);
        c9iKA1C.A08("is_in_geoblocked_region", true);
        c9iKA1C.A08("hatch_wearables_linked", true);
        c9iKA1C.A08("hatch_wearables_comms_consent", true);
        c9iKA1C.A08(AuraViewerDataProviderKt.KEY_IS_NDA_REQUIRED, true);
        c9iKA1C.A08(AuraViewerDataProviderKt.KEY_IS_VM_TYPE_SELECTION_REQUIRED, true);
        c9iKA1C.A08(AuraViewerDataProviderKt.KEY_REQUIRES_NAME, true);
        c9iKA1C.A08(AuraViewerDataProviderKt.KEY_IS_VM_TYPE_PLAN_REQUIRED, true);
        c9iKA1C.A08(AuraViewerDataProviderKt.KEY_NAME_PREFILL, true);
        c9iKA1C.A08(AuraViewerDataProviderKt.KEY_EMAIL_PREFILL, true);
        c9iKA1C.A08("waitlist_choice_screen", true);
        c9iKA1C.A08("enter_invite_code_screen", true);
        c9iKA1C.A08("waitlisted_screen", true);
        c9iKA1C.A08("waitlisted_limited_screen", true);
        c9iKA1C.A08("retos", true);
        c9iKA1C.A08("name_dialog", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07839ix c07839ix = C07839ix.A00;
        C9hr c9hrA00 = AbstractC07749im.A00(c07839ix);
        C9hr c9hrA002 = AbstractC07749im.A00(c07839ix);
        C9hr c9hrA003 = AbstractC07749im.A00(c07839ix);
        C9hr c9hrA004 = AbstractC07749im.A00(c07839ix);
        C9hr c9hrA005 = AbstractC07749im.A00(c07839ix);
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA006 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA007 = AbstractC07749im.A00(c07779iq);
        LenientStringListSerializer lenientStringListSerializer = LenientStringListSerializer.INSTANCE;
        C9hr c9hrA008 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA009 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA0010 = AbstractC07749im.A00(c07839ix);
        C9hr c9hrA0011 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA0012 = AbstractC07749im.A00(c07779iq);
        OnboardingScreenCopyJson$$serializer onboardingScreenCopyJson$$serializer = OnboardingScreenCopyJson$$serializer.INSTANCE;
        return new C9hr[]{c9hrA00, c9hrA002, c9hrA003, c9hrA004, c9hrA005, c9hrA006, c07839ix, c9hrA007, lenientStringListSerializer, c9hrA008, c07839ix, c07839ix, c07839ix, c9hrA009, c07839ix, c07839ix, c07839ix, c9hrA0010, c9hrA0011, c9hrA0012, AbstractC07749im.A00(onboardingScreenCopyJson$$serializer), AbstractC07749im.A00(onboardingScreenCopyJson$$serializer), AbstractC07749im.A00(onboardingScreenCopyJson$$serializer), AbstractC07749im.A00(onboardingScreenCopyJson$$serializer), AbstractC07749im.A00(JsonElementSerializer.A00), AbstractC07749im.A00(OnboardingScreenCopyJson$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ActivationStatusesResponseJson activationStatusesResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, activationStatusesResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ActivationStatusesResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_user_repo_repo(activationStatusesResponseJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
