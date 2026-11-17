package com.facebook.aura.email.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
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
/* loaded from: classes4.dex */
public final /* synthetic */ class EmailReplyTargetJson$$serializer implements C9cd<EmailReplyTargetJson> {
    public static final EmailReplyTargetJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final EmailReplyTargetJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        String str = null;
        String strA0q = null;
        String str2 = null;
        String strA0o = null;
        String strA0n = null;
        String strA0l = null;
        String strA0p = null;
        String strA0m = null;
        String strA0k = null;
        String strA0j = null;
        String strA0i = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new EmailReplyTargetJson(i, strA8f, strA0i, strA0j, strA0k, strA0l, strA0m, strA0n, strA0o, str2, strA0p, strA0q, str, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0i = C3cI.A0i(c9iZ, c9j4A55);
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
                    strA0m = C3cI.A0m(c9iZ, c9j4A55);
                    i |= 32;
                    break;
                case 6:
                    strA0n = C3cI.A0n(c9iZ, c9j4A55);
                    i |= 64;
                    break;
                case 7:
                    strA0o = C3cI.A0o(c9iZ, c9j4A55);
                    i |= 128;
                    break;
                case 8:
                    str2 = (String) C3cI.A0U(c9iZ, c9j4A55);
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
                    str = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 11);
                    i |= 2048;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        EmailReplyTargetJson$$serializer emailReplyTargetJson$$serializer = new EmailReplyTargetJson$$serializer();
        INSTANCE = emailReplyTargetJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.email.model.EmailReplyTargetJson", emailReplyTargetJson$$serializer, 12);
        c9iKA1C.A08("type", true);
        c9iKA1C.A08("message_id", true);
        c9iKA1C.A08("messageId", true);
        c9iKA1C.A08("messageID", true);
        c9iKA1C.A08("action", true);
        c9iKA1C.A08("sender_name", true);
        c9iKA1C.A08("senderName", true);
        c9iKA1C.A08("sender", true);
        c9iKA1C.A08("from_name", true);
        c9iKA1C.A08("fromName", true);
        c9iKA1C.A08("from", true);
        c9iKA1C.A08("subject", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, EmailReplyTargetJson emailReplyTargetJson) {
        AnonymousClass003.A0u(interfaceC07789is, emailReplyTargetJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        EmailReplyTargetJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_email_model_model(emailReplyTargetJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
