package com.facebook.aura.notifications.push;

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
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j1;
import X.C9j4;
import X.C9j5;
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.bloks.data.AuraBloksDataProps;
import com.facebook.aura.browsertask.conversation.BrowserSignInPushPresenterKt;
import com.facebook.aura.model.ReplyAttributionSerializer;
import java.util.Map;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class AuraPushWireJson$$serializer implements C9cd<AuraPushWireJson> {
    public static final AuraPushWireJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final AuraPushWireJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = AuraPushWireJson.$childSerializers;
        String strA8f = null;
        String strA0j = null;
        String strA0s = null;
        String strA0q = null;
        String str = null;
        Long l = null;
        Integer num = null;
        Map map = null;
        String strA0l = null;
        String strA0p = null;
        String strA0k = null;
        long jA8X = 0;
        int i = 0;
        boolean zA8G = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new AuraPushWireJson(i, strA8f, jA8X, strA0j, strA0k, strA0l, l, map, zA8G, str, strA0p, strA0q, num, strA0s, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    jA8X = c9j4A55.A8X(c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    strA0j = C3cI.A0j(c9iZ, c9j4A55);
                    i |= 4;
                    break;
                case 3:
                    strA0k = C3cI.A0k(c9iZ, c9j4A55);
                    i |= 8;
                    break;
                case 4:
                    strA0l = C3cI.A0l(c9iZ, c9j4A55);
                    i |= 16;
                    break;
                case 5:
                    l = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    map = (Map) c9j4A55.A8a(f0cArr[6].getValue(), c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    zA8G = c9j4A55.A8G(c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    str = (String) C3cI.A0U(c9iZ, c9j4A55);
                    i |= 256;
                    break;
                case 9:
                    strA0p = C3cI.A0p(c9iZ, c9j4A55);
                    i |= 512;
                    break;
                case 10:
                    strA0q = C3cI.A0q(c9iZ, c9j4A55);
                    i |= 1024;
                    break;
                case 11:
                    num = (Integer) c9j4A55.A8Z(C07729ii.A00, c9iZ, 11);
                    i |= 2048;
                    break;
                case 12:
                    strA0s = C3cI.A0s(c9iZ, c9j4A55);
                    i |= 4096;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        AuraPushWireJson$$serializer auraPushWireJson$$serializer = new AuraPushWireJson$$serializer();
        INSTANCE = auraPushWireJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.notifications.push.AuraPushWireJson", auraPushWireJson$$serializer, 13);
        boolean zA1X = C60Q.A1X(c9iKA1C);
        C3cH.A1G("time", c9iKA1C, zA1X);
        C60O.A1W(c9iKA1C, zA1X);
        c9iKA1C.A08(ReplyAttributionSerializer.TYPE_MESSAGE, zA1X);
        c9iKA1C.A08("target_uid", zA1X);
        c9iKA1C.A08(AuraBloksDataProps.PARAMS, zA1X);
        c9iKA1C.A08("is_logged_out_push", zA1X);
        c9iKA1C.A08("ndid", zA1X);
        c9iKA1C.A08(BrowserSignInPushPresenterKt.PARAM_COLLAPSE_KEY, zA1X);
        c9iKA1C.A08("notification_type", zA1X);
        c9iKA1C.A08("unread_count", zA1X);
        c9iKA1C.A08("vm_id", zA1X);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = AuraPushWireJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        C9j1 c9j1 = C9j1.A00;
        return new C9hr[]{c07779iq, c9j1, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c9j1), C3cG.A16(f0cArr, 6), C07839ix.A00, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(C07729ii.A00), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, AuraPushWireJson auraPushWireJson) {
        AnonymousClass003.A0u(interfaceC07789is, auraPushWireJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        AuraPushWireJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push(auraPushWireJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
