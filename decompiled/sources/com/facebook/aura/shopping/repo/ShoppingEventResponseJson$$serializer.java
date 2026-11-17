package com.facebook.aura.shopping.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
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
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class ShoppingEventResponseJson$$serializer implements C9cd<ShoppingEventResponseJson> {
    public static final ShoppingEventResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ShoppingEventResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        String strA8f2 = null;
        String strA0w = null;
        String strA0w2 = null;
        String strA0w3 = null;
        Boolean boolA0M = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ShoppingEventResponseJson(i, strA8f, strA8f2, strA0w, strA0w2, strA0w3, boolA0M, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA8f2 = c9j4A55.A8f(c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 2);
                    i |= 4;
                    break;
                case 3:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 3);
                    i |= 8;
                    break;
                case 4:
                    strA0w3 = C3cI.A0w(c9iZ, c9j4A55, 4);
                    i |= 16;
                    break;
                case 5:
                    boolA0M = C3cI.A0M(c9iZ, c9j4A55, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ShoppingEventResponseJson$$serializer shoppingEventResponseJson$$serializer = new ShoppingEventResponseJson$$serializer();
        INSTANCE = shoppingEventResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.shopping.repo.ShoppingEventResponseJson", shoppingEventResponseJson$$serializer, 6);
        c9iKA1C.A08("type", true);
        c9iKA1C.A08("product_id", true);
        c9iKA1C.A08("stream_owner_message_id", true);
        c9iKA1C.A08("channel", true);
        c9iKA1C.A08("session_id", true);
        c9iKA1C.A08("is_thread", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(C07839ix.A00)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ShoppingEventResponseJson shoppingEventResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, shoppingEventResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ShoppingEventResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(shoppingEventResponseJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
