package com.facebook.aura.email.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07799it;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C5hV;
import X.C7384Etj;
import X.C9Y;
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

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class EmailMessageJson$$serializer implements C9cd<EmailMessageJson> {
    public static final EmailMessageJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final EmailMessageJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = EmailMessageJson.$childSerializers;
        String strA8f = null;
        String strA0i = null;
        String strA0g = null;
        EmailAuthenticationJson emailAuthenticationJson = null;
        String strA0s = null;
        List list = null;
        List listA0P = null;
        String strA8f2 = null;
        List list2 = null;
        String strA0f = null;
        String strA0q = null;
        String strA0u = null;
        List list3 = null;
        String strA8f3 = null;
        String strA8f4 = null;
        List list4 = null;
        String strA0f2 = null;
        String strA8f5 = null;
        double dA8M = 0.0d;
        int i2 = 0;
        String strA8f6 = null;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new EmailMessageJson(i2, strA8f, dA8M, strA0i, strA8f2, strA8f6, listA0P, list, strA8f3, strA8f4, strA0g, strA0q, list3, strA0s, emailAuthenticationJson, strA0f, strA0u, list2, list4, strA0f2, strA8f5, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    dA8M = c9j4A55.A8M(c9iZ, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    strA0i = C3cH.A0i(c9iZ, c9j4A55);
                    i2 |= 4;
                    continue;
                case 3:
                    strA8f2 = c9j4A55.A8f(c9iZ, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    strA8f6 = c9j4A55.A8f(c9iZ, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    listA0P = C3cJ.A0P(c9iZ, c9j4A55, f0cArr, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    list = (List) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    strA8f3 = c9j4A55.A8f(c9iZ, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    strA8f4 = c9j4A55.A8f(c9iZ, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    strA0q = C3cI.A0q(c9iZ, c9j4A55);
                    i2 |= 1024;
                    continue;
                case 11:
                    list3 = (List) c9j4A55.A8Z(f0cArr[11].getValue(), c9iZ, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    strA0s = C3cI.A0s(c9iZ, c9j4A55);
                    i2 |= 4096;
                    continue;
                case 13:
                    emailAuthenticationJson = (EmailAuthenticationJson) c9j4A55.A8Z(EmailAuthenticationJson$$serializer.INSTANCE, c9iZ, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    strA0f = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    strA0u = C3cI.A0u(c9iZ, c9j4A55);
                    i = 32768;
                    break;
                case 16:
                    list2 = (List) c9j4A55.A8Z(f0cArr[16].getValue(), c9iZ, 16);
                    i = 65536;
                    break;
                case 17:
                    list4 = (List) C3cJ.A0E(c9iZ, c9j4A55, f0cArr, 17);
                    i = 131072;
                    break;
                case 18:
                    strA0f2 = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 18);
                    i = 262144;
                    break;
                case 19:
                    strA8f5 = c9j4A55.A8f(c9iZ, 19);
                    i = 524288;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
    }

    static {
        EmailMessageJson$$serializer emailMessageJson$$serializer = new EmailMessageJson$$serializer();
        INSTANCE = emailMessageJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.email.repo.EmailMessageJson", emailMessageJson$$serializer, 20);
        c9iKA1C.A08("id", false);
        c9iKA1C.A08("created_at", false);
        c9iKA1C.A08("rfc_message_id", true);
        c9iKA1C.A08("header_from", true);
        c9iKA1C.A08("header_from_name", true);
        c9iKA1C.A08("header_to", true);
        c9iKA1C.A08("header_cc", true);
        c9iKA1C.A08("preview", true);
        c9iKA1C.A08("direction", true);
        c9iKA1C.A08("delivery_status", true);
        c9iKA1C.A08("in_reply_to", true);
        c9iKA1C.A08("references", true);
        c9iKA1C.A08("html_body", true);
        c9iKA1C.A08("sender_authentication", true);
        c9iKA1C.A08("text_body", true);
        c9iKA1C.A08("extracted_text", true);
        c9iKA1C.A08("forwarded_messages", true);
        c9iKA1C.A08(C9Y.BUG_REPORT_ATTACHMENTS_ENDPOINT, true);
        c9iKA1C.A08("attachment_status", true);
        c9iKA1C.A08("subject", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = EmailMessageJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, C07799it.A00, c07779iq, c07779iq, c07779iq, C3cG.A16(f0cArr, 5), C3cG.A16(f0cArr, 6), c07779iq, c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C3cH.A14(f0cArr, 11), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(EmailAuthenticationJson$$serializer.INSTANCE), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C3cH.A14(f0cArr, 16), C3cG.A16(f0cArr, 17), AbstractC07749im.A00(c07779iq), c07779iq};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, EmailMessageJson emailMessageJson) {
        AnonymousClass003.A0u(interfaceC07789is, emailMessageJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        EmailMessageJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(emailMessageJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
