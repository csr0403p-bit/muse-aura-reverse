package com.facebook.aura.activation.repo;

import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
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
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class InviteGiftVideoJson$$serializer implements C9cd<InviteGiftVideoJson> {
    public static final InviteGiftVideoJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final InviteGiftVideoJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        String strA8f2 = null;
        int iA8U = 0;
        int iA8U2 = 0;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new InviteGiftVideoJson(i, strA8f, strA8f2, iA8U2, iA8U, (C2hx) null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA8f2 = c9j4A55.A8f(c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                iA8U2 = c9j4A55.A8U(c9iZ, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                iA8U = c9j4A55.A8U(c9iZ, 3);
                i |= 8;
            }
        }
    }

    static {
        InviteGiftVideoJson$$serializer inviteGiftVideoJson$$serializer = new InviteGiftVideoJson$$serializer();
        INSTANCE = inviteGiftVideoJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.activation.repo.InviteGiftVideoJson", inviteGiftVideoJson$$serializer, 4);
        c9iKA1C.A08("url_light", true);
        c9iKA1C.A08("url_dark", true);
        c9iKA1C.A08(HatchWebPageParserKt.WIDTH_ATTR, true);
        c9iKA1C.A08(HatchWebPageParserKt.HEIGHT_ATTR, true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C07729ii c07729ii = C07729ii.A00;
        return new C9hr[]{c07779iq, c07779iq, c07729ii, c07729ii};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, InviteGiftVideoJson inviteGiftVideoJson) {
        AnonymousClass003.A0u(interfaceC07789is, inviteGiftVideoJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        InviteGiftVideoJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo(inviteGiftVideoJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
