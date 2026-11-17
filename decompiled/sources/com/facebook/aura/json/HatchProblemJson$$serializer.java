package com.facebook.aura.json;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
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
import com.facebook.aura.activation.repo.InviteCodeServerErrorKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class HatchProblemJson$$serializer implements C9cd<HatchProblemJson> {
    public static final HatchProblemJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final HatchProblemJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        HatchPasswordCopyJson hatchPasswordCopyJson = null;
        Boolean boolA0M = null;
        String strA8f = null;
        String strA0h = null;
        String strA0i = null;
        String strA8f2 = null;
        String strA8f3 = null;
        String strA8f4 = null;
        int iA8U = 0;
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new HatchProblemJson(i, strA8f, strA0h, strA0i, iA8U, zA8G, strA8f2, boolA0M, hatchPasswordCopyJson, strA8f3, strA8f4, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA0i = C3cH.A0i(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    iA8U = c9j4A55.A8U(c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    zA8G = c9j4A55.A8G(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    strA8f2 = c9j4A55.A8f(c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    boolA0M = C3cI.A0M(c9iZ, c9j4A55, 6);
                    i |= 64;
                    break;
                case 7:
                    hatchPasswordCopyJson = (HatchPasswordCopyJson) c9j4A55.A8Z(HatchPasswordCopyJson$$serializer.INSTANCE, c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    strA8f3 = c9j4A55.A8f(c9iZ, 8);
                    i |= 256;
                    break;
                case 9:
                    strA8f4 = c9j4A55.A8f(c9iZ, 9);
                    i |= 512;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        HatchProblemJson$$serializer hatchProblemJson$$serializer = new HatchProblemJson$$serializer();
        INSTANCE = hatchProblemJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.json.HatchProblemJson", hatchProblemJson$$serializer, 10);
        C3cH.A1G("type", c9iKA1C, true);
        C3cH.A1H(InviteCodeServerErrorKt.SERVER_ERROR_DETAIL_FIELD, c9iKA1C, true);
        c9iKA1C.A08("password_login_available", true);
        c9iKA1C.A08("auth_state", true);
        c9iKA1C.A08("has_muse_account", true);
        c9iKA1C.A08("password_copy", true);
        c9iKA1C.A08("checkpoint_url", true);
        c9iKA1C.A08("error_code", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C07729ii c07729ii = C07729ii.A00;
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, c07729ii, c07839ix, c07779iq, AbstractC07749im.A00(c07839ix), AbstractC07749im.A00(HatchPasswordCopyJson$$serializer.INSTANCE), c07779iq, c07779iq};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, HatchProblemJson hatchProblemJson) {
        AnonymousClass003.A0u(interfaceC07789is, hatchProblemJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        HatchProblemJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_json_json(hatchProblemJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
