package com.facebook.aura.spaces.share;

import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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
import java.util.Map;
import kotlin.Deprecated;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class SpaceShareLinkAudienceRequestJson$$serializer implements C9cd<SpaceShareLinkAudienceRequestJson> {
    public static final int $stable = 0;
    public static final SpaceShareLinkAudienceRequestJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final SpaceShareLinkAudienceRequestJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = SpaceShareLinkAudienceRequestJson.$childSerializers;
        String strA8f = null;
        JsonElement jsonElement = null;
        List listA0Q = null;
        Map map = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new SpaceShareLinkAudienceRequestJson(i, strA8f, jsonElement, listA0Q, map, (C2hx) null);
            }
            if (iA8N == 0) {
                strA8f = c9j4A55.A8f(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                jsonElement = (JsonElement) c9j4A55.A8a(JsonElementSerializer.A00, c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                map = (Map) C3cJ.A0G(c9iZ, c9j4A55, f0cArr, 3);
                i |= 8;
            }
        }
    }

    static {
        SpaceShareLinkAudienceRequestJson$$serializer spaceShareLinkAudienceRequestJson$$serializer = new SpaceShareLinkAudienceRequestJson$$serializer();
        INSTANCE = spaceShareLinkAudienceRequestJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.spaces.share.SpaceShareLinkAudienceRequestJson", spaceShareLinkAudienceRequestJson$$serializer, 4);
        c9iKA1C.A08("visibility", false);
        c9iKA1C.A08("expected_revision", false);
        c9iKA1C.A08("recipient_principals", false);
        c9iKA1C.A08("recipient_permissions", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = SpaceShareLinkAudienceRequestJson.$childSerializers;
        return new C9hr[]{C07779iq.A01, JsonElementSerializer.A00, C3cH.A11(f0cArr), C3cH.A14(f0cArr, 3)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, SpaceShareLinkAudienceRequestJson spaceShareLinkAudienceRequestJson) {
        AnonymousClass003.A0u(interfaceC07789is, spaceShareLinkAudienceRequestJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        SpaceShareLinkAudienceRequestJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_spaces_share_share(spaceShareLinkAudienceRequestJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
