package com.facebook.aura.pairs;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C5hV;
import X.C60Q;
import X.C60R;
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
import java.util.List;
import kotlin.Deprecated;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.JsonPrimitiveSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class TrustedCircleSourceJson$$serializer implements C9cd<TrustedCircleSourceJson> {
    public static final int $stable = 0;
    public static final TrustedCircleSourceJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final TrustedCircleSourceJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = TrustedCircleSourceJson.$childSerializers;
        String strA8f = null;
        Boolean boolA0M = null;
        String strA0w = null;
        Boolean boolA0M2 = null;
        JsonPrimitive jsonPrimitive = null;
        List list = null;
        String strA0i = null;
        String strA0o = null;
        String strA8f2 = null;
        String strA8f3 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new TrustedCircleSourceJson(i, strA8f, strA0i, list, strA0o, jsonPrimitive, strA8f2, strA8f3, boolA0M2, boolA0M, strA0w, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0i = C3cI.A0i(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    list = (List) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 2);
                    i |= 4;
                    break;
                case 3:
                    strA0o = C60Q.A0o(c9iZ, c9j4A55);
                    i |= 8;
                    break;
                case 4:
                    jsonPrimitive = (JsonPrimitive) c9j4A55.A8a(JsonPrimitiveSerializer.A01, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    strA8f2 = c9j4A55.A8f(c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    strA8f3 = c9j4A55.A8f(c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    boolA0M2 = C3cI.A0M(c9iZ, c9j4A55, 7);
                    i |= 128;
                    break;
                case 8:
                    boolA0M = C3cI.A0M(c9iZ, c9j4A55, 8);
                    i |= 256;
                    break;
                case 9:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 9);
                    i |= 512;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        TrustedCircleSourceJson$$serializer trustedCircleSourceJson$$serializer = new TrustedCircleSourceJson$$serializer();
        INSTANCE = trustedCircleSourceJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.pairs.TrustedCircleSourceJson", trustedCircleSourceJson$$serializer, 10);
        c9iKA1C.A08("name", false);
        boolean zA1Y = C3cI.A1Y(c9iKA1C);
        c9iKA1C.A08("profile_pic_url", false);
        C60R.A1R(c9iKA1C, false);
        c9iKA1C.A08("is_direct", zA1Y);
        c9iKA1C.A08("is_hatch_onboarded", zA1Y);
        c9iKA1C.A08("account_center_key", zA1Y);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = TrustedCircleSourceJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA11 = C3cH.A11(f0cArr);
        JsonPrimitiveSerializer jsonPrimitiveSerializer = JsonPrimitiveSerializer.A01;
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07779iq, c9hrA00, c9hrA11, c07779iq, jsonPrimitiveSerializer, c07779iq, c07779iq, AbstractC07749im.A00(c07839ix), AbstractC07749im.A00(c07839ix), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, TrustedCircleSourceJson trustedCircleSourceJson) {
        AnonymousClass003.A0u(interfaceC07789is, trustedCircleSourceJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        TrustedCircleSourceJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(trustedCircleSourceJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
