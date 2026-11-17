package com.facebook.aura.email.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
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
import com.facebook.aura.email.view.EmailSettingsScreenKt;
import kotlin.Deprecated;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class EmailMailboxJson$$serializer implements C9cd<EmailMailboxJson> {
    public static final EmailMailboxJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final EmailMailboxJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        JsonElement jsonElementA17 = null;
        String strA0h = null;
        String strA8f2 = null;
        String strA8f3 = null;
        String strA8f4 = null;
        JsonElement jsonElementA172 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new EmailMailboxJson(i, strA8f, strA0h, strA8f2, strA8f3, strA8f4, jsonElementA172, jsonElementA17, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA8f2 = c9j4A55.A8f(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    strA8f3 = c9j4A55.A8f(c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    strA8f4 = c9j4A55.A8f(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    jsonElementA172 = C3cI.A17(c9iZ, c9j4A55, 5);
                    i |= 32;
                    break;
                case 6:
                    jsonElementA17 = C3cI.A17(c9iZ, c9j4A55, 6);
                    i |= 64;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        EmailMailboxJson$$serializer emailMailboxJson$$serializer = new EmailMailboxJson$$serializer();
        INSTANCE = emailMailboxJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.email.repo.EmailMailboxJson", emailMailboxJson$$serializer, 7);
        c9iKA1C.A08("id", false);
        c9iKA1C.A08("environment_id", false);
        c9iKA1C.A08("name", false);
        c9iKA1C.A08("handle", false);
        c9iKA1C.A08(EmailSettingsScreenKt.EMAIL_ADDRESS_CLIP_LABEL, false);
        c9iKA1C.A08("restriction", true);
        c9iKA1C.A08("display", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, AbstractC07749im.A00(jsonElementSerializer), AbstractC07749im.A00(jsonElementSerializer)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, EmailMailboxJson emailMailboxJson) {
        AnonymousClass003.A0u(interfaceC07789is, emailMailboxJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        EmailMailboxJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(emailMailboxJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
