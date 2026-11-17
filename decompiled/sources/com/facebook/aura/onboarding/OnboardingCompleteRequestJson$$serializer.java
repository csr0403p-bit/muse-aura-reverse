package com.facebook.aura.onboarding;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
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
import com.facebook.aura.feed.repo.FeedRepositoryKt;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class OnboardingCompleteRequestJson$$serializer implements C9cd<OnboardingCompleteRequestJson> {
    public static final OnboardingCompleteRequestJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final OnboardingCompleteRequestJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = OnboardingCompleteRequestJson.$childSerializers;
        String strA8f = null;
        List listA0P = null;
        String strA8f2 = null;
        String strA0w = null;
        String strA0w2 = null;
        String strA0w3 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new OnboardingCompleteRequestJson(i, strA8f, listA0P, strA8f2, strA0w, strA0w2, strA0w3, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 1);
                    i |= 2;
                    break;
                case 2:
                    strA8f2 = c9j4A55.A8f(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 3);
                    i |= 8;
                    break;
                case 4:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 4);
                    i |= 16;
                    break;
                case 5:
                    strA0w3 = C3cI.A0w(c9iZ, c9j4A55, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        OnboardingCompleteRequestJson$$serializer onboardingCompleteRequestJson$$serializer = new OnboardingCompleteRequestJson$$serializer();
        INSTANCE = onboardingCompleteRequestJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.onboarding.OnboardingCompleteRequestJson", onboardingCompleteRequestJson$$serializer, 6);
        c9iKA1C.A08(OnboardingStateManagerKt.PREF_VARIANT, false);
        c9iKA1C.A08("task_selections", false);
        c9iKA1C.A08(FeedRepositoryKt.TIMEZONE_PARAM, false);
        c9iKA1C.A08("assistant_name", true);
        c9iKA1C.A08("vibe", true);
        c9iKA1C.A08("avatar_id", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = OnboardingCompleteRequestJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, C3cH.A10(f0cArr), c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, OnboardingCompleteRequestJson onboardingCompleteRequestJson) {
        AnonymousClass003.A0u(interfaceC07789is, onboardingCompleteRequestJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        OnboardingCompleteRequestJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_onboarding_onboarding(onboardingCompleteRequestJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
