package com.facebook.aura.partners.accountlinking.nativeauthlogging;

import X.AnonymousClass003;
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
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class NativeAuthWaEligibilityFlagsJson$$serializer implements C9cd<NativeAuthWaEligibilityFlagsJson> {
    public static final NativeAuthWaEligibilityFlagsJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final NativeAuthWaEligibilityFlagsJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        int i = 0;
        boolean zA8G = false;
        boolean zA8G2 = false;
        boolean zA8G3 = false;
        boolean zA8G4 = false;
        boolean zA8G5 = false;
        boolean zA8G6 = false;
        boolean zA8G7 = false;
        boolean zA8G8 = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new NativeAuthWaEligibilityFlagsJson(i, zA8G, zA8G8, zA8G7, zA8G5, zA8G6, zA8G4, zA8G3, zA8G2, (C2hx) null);
                case 0:
                    zA8G = c9j4A55.A8G(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    zA8G8 = c9j4A55.A8G(c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    zA8G7 = c9j4A55.A8G(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    zA8G5 = c9j4A55.A8G(c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    zA8G6 = c9j4A55.A8G(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    zA8G4 = c9j4A55.A8G(c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    zA8G3 = c9j4A55.A8G(c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    zA8G2 = c9j4A55.A8G(c9iZ, 7);
                    i |= 128;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        NativeAuthWaEligibilityFlagsJson$$serializer nativeAuthWaEligibilityFlagsJson$$serializer = new NativeAuthWaEligibilityFlagsJson$$serializer();
        INSTANCE = nativeAuthWaEligibilityFlagsJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.partners.accountlinking.nativeauthlogging.NativeAuthWaEligibilityFlagsJson", nativeAuthWaEligibilityFlagsJson$$serializer, 8);
        c9iKA1C.A08("is_eligible_to_link_to_linked_fb", true);
        c9iKA1C.A08("is_eligible_to_link_to_unlinked_fb", true);
        c9iKA1C.A08("is_eligible_to_link_to_linked_ig", true);
        c9iKA1C.A08("is_eligible_to_link_to_unlinked_ig", true);
        c9iKA1C.A08("is_eligible_to_link_to_linked_rl", true);
        c9iKA1C.A08("is_eligible_to_link_to_unlinked_rl", true);
        c9iKA1C.A08("is_eligible_to_link_to_linked_th", true);
        c9iKA1C.A08("is_eligible_to_link_to_unlinked_th", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07839ix, c07839ix, c07839ix, c07839ix, c07839ix, c07839ix, c07839ix, c07839ix};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, NativeAuthWaEligibilityFlagsJson nativeAuthWaEligibilityFlagsJson) {
        AnonymousClass003.A0u(interfaceC07789is, nativeAuthWaEligibilityFlagsJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        NativeAuthWaEligibilityFlagsJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_accountlinking_nativeauthlogging_nativeauthlogging(nativeAuthWaEligibilityFlagsJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
