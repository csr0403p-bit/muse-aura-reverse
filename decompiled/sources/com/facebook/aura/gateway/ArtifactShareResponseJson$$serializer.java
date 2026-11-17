package com.facebook.aura.gateway;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cI;
import X.C5hV;
import X.C60Q;
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
import com.facebook.aura.pairs.PairsInviteMailboxKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class ArtifactShareResponseJson$$serializer implements C9cd<ArtifactShareResponseJson> {
    public static final int $stable = 0;
    public static final ArtifactShareResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ArtifactShareResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        C2hx c2hx = null;
        ArtifactSharePayloadJson artifactSharePayloadJson = null;
        String strA8f = null;
        String strA0v = null;
        FsErrorJson fsErrorJson = null;
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new ArtifactShareResponseJson(i, zA8G, artifactSharePayloadJson, strA8f, strA0v, fsErrorJson, c2hx);
            }
            if (iA8N == 0) {
                zA8G = c9j4A55.A8G(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                artifactSharePayloadJson = (ArtifactSharePayloadJson) c9j4A55.A8Z(ArtifactSharePayloadJson$$serializer.INSTANCE, c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                strA8f = c9j4A55.A8f(c9iZ, 2);
                i |= 4;
            } else if (iA8N == 3) {
                strA0v = C3cI.A0v(c9iZ, c9j4A55, 3);
                i |= 8;
            } else {
                if (iA8N != 4) {
                    throw C3cG.A17(iA8N);
                }
                fsErrorJson = (FsErrorJson) c9j4A55.A8Z(FsErrorJson$$serializer.INSTANCE, c9iZ, 4);
                i |= 16;
            }
        }
    }

    static {
        ArtifactShareResponseJson$$serializer artifactShareResponseJson$$serializer = new ArtifactShareResponseJson$$serializer();
        INSTANCE = artifactShareResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.ArtifactShareResponseJson", artifactShareResponseJson$$serializer, 5);
        c9iKA1C.A08(PairsInviteMailboxKt.OUTCOME_OK, true);
        C3cI.A1N("result", c9iKA1C, true);
        C60Q.A1N("share_type", c9iKA1C, true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07839ix c07839ix = C07839ix.A00;
        C9hr c9hrA00 = AbstractC07749im.A00(ArtifactSharePayloadJson$$serializer.INSTANCE);
        C07779iq c07779iq = C07779iq.A01;
        return C3cI.A1b(FsErrorJson$$serializer.INSTANCE, c07839ix, c9hrA00, c07779iq, AbstractC07749im.A00(c07779iq));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ArtifactShareResponseJson artifactShareResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, artifactShareResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ArtifactShareResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(artifactShareResponseJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
