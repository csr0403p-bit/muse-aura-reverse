package com.facebook.aura.email.repo;

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
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class EmailPermissionMethodJson$$serializer implements C9cd<EmailPermissionMethodJson> {
    public static final EmailPermissionMethodJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final EmailPermissionMethodJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = EmailPermissionMethodJson.$childSerializers;
        String strA8f = null;
        String strA8f2 = null;
        String strA8f3 = null;
        List list = null;
        JsonElement jsonElementA17 = null;
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new EmailPermissionMethodJson(i, strA8f2, strA8f3, list, jsonElementA17, strA8f, zA8G, (C2hx) null);
                case 0:
                    strA8f2 = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA8f3 = c9j4A55.A8f(c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    list = (List) C3cJ.A0G(c9iZ, c9j4A55, f0cArr, 2);
                    i |= 4;
                    break;
                case 3:
                    jsonElementA17 = C3cI.A17(c9iZ, c9j4A55, 3);
                    i |= 8;
                    break;
                case 4:
                    strA8f = c9j4A55.A8f(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    zA8G = c9j4A55.A8G(c9iZ, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        EmailPermissionMethodJson$$serializer emailPermissionMethodJson$$serializer = new EmailPermissionMethodJson$$serializer();
        INSTANCE = emailPermissionMethodJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.email.repo.EmailPermissionMethodJson", emailPermissionMethodJson$$serializer, 6);
        C3cH.A1E("key", c9iKA1C, true);
        c9iKA1C.A08("mode_options", true);
        C3cI.A1P("mode_source", c9iKA1C, true);
        c9iKA1C.A08("restricted", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = EmailPermissionMethodJson.$childSerializers;
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, C3cH.A14(f0cArr, 2), AbstractC07749im.A00(JsonElementSerializer.A00), c07779iq, C07839ix.A00};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, EmailPermissionMethodJson emailPermissionMethodJson) {
        AnonymousClass003.A0u(interfaceC07789is, emailPermissionMethodJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        EmailPermissionMethodJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(emailPermissionMethodJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
