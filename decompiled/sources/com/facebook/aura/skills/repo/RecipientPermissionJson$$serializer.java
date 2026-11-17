package com.facebook.aura.skills.repo;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
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
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.aura.model.InternalLinkActionCardPresentationKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class RecipientPermissionJson$$serializer implements C9cd<RecipientPermissionJson> {
    public static final RecipientPermissionJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final RecipientPermissionJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        RecipientPermissionTargetJson recipientPermissionTargetJson = null;
        String strA0n = null;
        RecipientPermissionDisplayJson recipientPermissionDisplayJson = null;
        String strA0m = null;
        String strA0l = null;
        String strA0k = null;
        String strA8f = null;
        String strA0h = null;
        String strA0i = null;
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new RecipientPermissionJson(i, strA8f, strA0h, strA0i, strA0k, strA0l, strA0m, strA0n, zA8G, recipientPermissionDisplayJson, recipientPermissionTargetJson, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    strA0i = C3cH.A0i(c9iZ, c9j4A55);
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
                    zA8G = c9j4A55.A8G(c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    recipientPermissionDisplayJson = (RecipientPermissionDisplayJson) c9j4A55.A8Z(RecipientPermissionDisplayJson$$serializer.INSTANCE, c9iZ, 8);
                    i |= 256;
                    break;
                case 9:
                    recipientPermissionTargetJson = (RecipientPermissionTargetJson) c9j4A55.A8Z(RecipientPermissionTargetJson$$serializer.INSTANCE, c9iZ, 9);
                    i |= 512;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        RecipientPermissionJson$$serializer recipientPermissionJson$$serializer = new RecipientPermissionJson$$serializer();
        INSTANCE = recipientPermissionJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.skills.repo.RecipientPermissionJson", recipientPermissionJson$$serializer, 10);
        c9iKA1C.A08("permission_id", true);
        C3cI.A1P("kind", c9iKA1C, true);
        c9iKA1C.A08(InternalLinkActionCardPresentationKt.INTERNAL_LINK_TYPE_CONNECTOR, true);
        C3cH.A1E("connector_action", c9iKA1C, true);
        c9iKA1C.A08(PhotosSearchHandlerKt.PARAM_SOURCE, true);
        c9iKA1C.A08("revocable", true);
        c9iKA1C.A08("display", true);
        c9iKA1C.A08("target", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), C07839ix.A00, AbstractC07749im.A00(RecipientPermissionDisplayJson$$serializer.INSTANCE), AbstractC07749im.A00(RecipientPermissionTargetJson$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, RecipientPermissionJson recipientPermissionJson) {
        AnonymousClass003.A0u(interfaceC07789is, recipientPermissionJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        RecipientPermissionJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(recipientPermissionJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
