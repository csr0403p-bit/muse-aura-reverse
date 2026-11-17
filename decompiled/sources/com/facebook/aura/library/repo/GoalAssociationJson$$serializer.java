package com.facebook.aura.library.repo;

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
import kotlin.Deprecated;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class GoalAssociationJson$$serializer implements C9cd<GoalAssociationJson> {
    public static final GoalAssociationJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final GoalAssociationJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        String strA0w = null;
        String strA0p = null;
        String str = null;
        String strA0n = null;
        String strA0w2 = null;
        String strA0o = null;
        JsonObject jsonObject = null;
        String strA0l = null;
        String strA0k = null;
        String strA0h = null;
        String strA0i = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new GoalAssociationJson(i, strA8f, strA0h, strA0i, strA0k, strA0l, jsonObject, strA0n, strA0o, str, strA0p, strA0w, strA0w2, (C2hx) null);
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
                    jsonObject = (JsonObject) c9j4A55.A8Z(JsonObjectSerializer.A01, c9iZ, 5);
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
                    str = (String) C3cI.A0U(c9iZ, c9j4A55);
                    i |= 256;
                    break;
                case 9:
                    strA0p = C3cI.A0p(c9iZ, c9j4A55);
                    i |= 512;
                    break;
                case 10:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 10);
                    i |= 1024;
                    break;
                case 11:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 11);
                    i |= 2048;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        GoalAssociationJson$$serializer goalAssociationJson$$serializer = new GoalAssociationJson$$serializer();
        INSTANCE = goalAssociationJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.library.repo.GoalAssociationJson", goalAssociationJson$$serializer, 12);
        c9iKA1C.A08("association_id", true);
        c9iKA1C.A08("associationId", true);
        c9iKA1C.A08("id", true);
        c9iKA1C.A08("association_type", true);
        c9iKA1C.A08("associationType", true);
        c9iKA1C.A08("details", true);
        c9iKA1C.A08("image_url", true);
        c9iKA1C.A08("imageUrl", true);
        c9iKA1C.A08("created_at", true);
        c9iKA1C.A08("createdAt", true);
        c9iKA1C.A08("updated_at", true);
        c9iKA1C.A08("updatedAt", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(JsonObjectSerializer.A01), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, GoalAssociationJson goalAssociationJson) {
        AnonymousClass003.A0u(interfaceC07789is, goalAssociationJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        GoalAssociationJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(goalAssociationJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
