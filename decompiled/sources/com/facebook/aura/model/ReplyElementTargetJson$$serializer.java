package com.facebook.aura.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C5hV;
import X.C60P;
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
/* loaded from: classes3.dex */
public final /* synthetic */ class ReplyElementTargetJson$$serializer implements C9cd<ReplyElementTargetJson> {
    public static final int $stable = 0;
    public static final ReplyElementTargetJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ReplyElementTargetJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0g = null;
        String strA0g2 = null;
        String strA0g3 = null;
        String strA0g4 = null;
        Boolean bool = null;
        String strA0g5 = null;
        String strA0g6 = null;
        String strA0g7 = null;
        String strA0g8 = null;
        String strA0r = null;
        String strA0g9 = null;
        Boolean bool2 = null;
        String strA0f = null;
        String strA8f = null;
        String strA0w = null;
        String strA0j = null;
        Integer num = null;
        String strA0l = null;
        String strA0m = null;
        String strA0n = null;
        String strA0o = null;
        String str = null;
        String strA0p = null;
        int i2 = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ReplyElementTargetJson(i2, strA8f, strA0w, strA0j, num, strA0l, strA0m, strA0n, strA0o, str, strA0p, strA0g9, strA0r, strA0g8, strA0g, strA0g7, strA0g6, strA0g5, strA0g3, strA0g4, strA0g2, strA0f, bool2, bool, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    strA0j = C3cI.A0j(c9iZ, c9j4A55);
                    i2 |= 4;
                    continue;
                case 3:
                    num = (Integer) c9j4A55.A8Z(StrictReplyIndexSerializer.INSTANCE, c9iZ, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    strA0l = C3cI.A0l(c9iZ, c9j4A55);
                    i2 |= 16;
                    continue;
                case 5:
                    strA0m = C3cI.A0m(c9iZ, c9j4A55);
                    i2 |= 32;
                    continue;
                case 6:
                    strA0n = C3cI.A0n(c9iZ, c9j4A55);
                    i2 |= 64;
                    continue;
                case 7:
                    strA0o = C3cI.A0o(c9iZ, c9j4A55);
                    i2 |= 128;
                    continue;
                case 8:
                    str = (String) C3cI.A0U(c9iZ, c9j4A55);
                    i2 |= 256;
                    continue;
                case 9:
                    strA0p = C3cI.A0p(c9iZ, c9j4A55);
                    i2 |= 512;
                    continue;
                case 10:
                    strA0g9 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    strA0r = C3cI.A0r(c9iZ, c9j4A55);
                    i2 |= 2048;
                    continue;
                case 12:
                    strA0g8 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    strA0g7 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    strA0g6 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 15);
                    i = 32768;
                    break;
                case 16:
                    strA0g5 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 16);
                    i = 65536;
                    break;
                case 17:
                    strA0g3 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 17);
                    i = 131072;
                    break;
                case 18:
                    strA0g4 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 18);
                    i = 262144;
                    break;
                case 19:
                    strA0g2 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 19);
                    i = 524288;
                    break;
                case 20:
                    strA0f = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 20);
                    i = 1048576;
                    break;
                case 21:
                    bool2 = (Boolean) c9j4A55.A8Z(C07839ix.A00, c9iZ, 21);
                    i = 2097152;
                    break;
                case 22:
                    bool = (Boolean) c9j4A55.A8Z(C07839ix.A00, c9iZ, 22);
                    i = 4194304;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
    }

    static {
        ReplyElementTargetJson$$serializer replyElementTargetJson$$serializer = new ReplyElementTargetJson$$serializer();
        INSTANCE = replyElementTargetJson$$serializer;
        C9iK c9iKA1T = C60P.A1T("com.facebook.aura.model.ReplyElementTargetJson", replyElementTargetJson$$serializer, 23);
        c9iKA1T.A08("widget_id", true);
        c9iKA1T.A08("widgetId", true);
        c9iKA1T.A08("index", true);
        c9iKA1T.A08("element_key", true);
        c9iKA1T.A08("elementKey", true);
        c9iKA1T.A08("message_id", true);
        c9iKA1T.A08("messageId", true);
        c9iKA1T.A08("citation_id", true);
        c9iKA1T.A08("citationId", true);
        c9iKA1T.A08("entity_kind", true);
        c9iKA1T.A08("entityKind", true);
        c9iKA1T.A08("entity_id", true);
        c9iKA1T.A08("entityId", true);
        c9iKA1T.A08("element_kind", true);
        c9iKA1T.A08("elementKind", true);
        c9iKA1T.A08("reply_to_text", true);
        C3cH.A1G("replyToText", c9iKA1T, true);
        c9iKA1T.A08("image_url", true);
        c9iKA1T.A08("imageUrl", true);
        c9iKA1T.A08("is_unavailable", true);
        c9iKA1T.A08("isUnavailable", true);
        descriptor = c9iKA1T;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA003 = AbstractC07749im.A00(StrictReplyIndexSerializer.INSTANCE);
        C9hr c9hrA004 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA005 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA006 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA007 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA008 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA009 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA0010 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA0011 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA0012 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA0013 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA0014 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA0015 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA0016 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA0017 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA0018 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA0019 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA0020 = AbstractC07749im.A00(c07779iq);
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07779iq, c9hrA00, c9hrA002, c9hrA003, c9hrA004, c9hrA005, c9hrA006, c9hrA007, c9hrA008, c9hrA009, c9hrA0010, c9hrA0011, c9hrA0012, c9hrA0013, c9hrA0014, c9hrA0015, c9hrA0016, c9hrA0017, c9hrA0018, c9hrA0019, c9hrA0020, AbstractC07749im.A00(c07839ix), AbstractC07749im.A00(c07839ix)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ReplyElementTargetJson replyElementTargetJson) {
        AnonymousClass003.A0u(interfaceC07789is, replyElementTargetJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ReplyElementTargetJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(replyElementTargetJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
