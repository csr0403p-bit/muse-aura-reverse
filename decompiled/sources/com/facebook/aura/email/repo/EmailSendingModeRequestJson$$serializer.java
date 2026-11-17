package com.facebook.aura.email.repo;

import X.AnonymousClass003;
import X.C07779iq;
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
import com.facebook.aura.model.InternalLinkActionCardPresentationKt;
import java.util.Map;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class EmailSendingModeRequestJson$$serializer implements C9cd<EmailSendingModeRequestJson> {
    public static final EmailSendingModeRequestJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final EmailSendingModeRequestJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = EmailSendingModeRequestJson.$childSerializers;
        String strA8f = null;
        Map map = null;
        String strA8f2 = null;
        String strA8f3 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new EmailSendingModeRequestJson(i, strA8f, map, strA8f2, strA8f3, null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                map = (Map) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 1);
                i |= 2;
            } else if (iA8N == 2) {
                strA8f2 = c9j4A55.A8f(c9iZ, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                strA8f3 = c9j4A55.A8f(c9iZ, 3);
                i |= 8;
            }
        }
    }

    static {
        EmailSendingModeRequestJson$$serializer emailSendingModeRequestJson$$serializer = new EmailSendingModeRequestJson$$serializer();
        INSTANCE = emailSendingModeRequestJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.email.repo.EmailSendingModeRequestJson", emailSendingModeRequestJson$$serializer, 4);
        c9iKA1C.A08(InternalLinkActionCardPresentationKt.INTERNAL_LINK_TYPE_CONNECTOR, false);
        c9iKA1C.A08("actions", false);
        C3cI.A1Q("actor", c9iKA1C, false);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = EmailSendingModeRequestJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, C3cH.A10(f0cArr), c07779iq, c07779iq};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, EmailSendingModeRequestJson emailSendingModeRequestJson) {
        AnonymousClass003.A0u(interfaceC07789is, emailSendingModeRequestJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        EmailSendingModeRequestJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(emailSendingModeRequestJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
