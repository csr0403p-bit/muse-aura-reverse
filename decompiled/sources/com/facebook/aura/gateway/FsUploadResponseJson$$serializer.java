package com.facebook.aura.gateway;

import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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
public final /* synthetic */ class FsUploadResponseJson$$serializer implements C9cd<FsUploadResponseJson> {
    public static final int $stable = 0;
    public static final FsUploadResponseJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final FsUploadResponseJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        C2hx c2hx = null;
        String strA8f = null;
        FsErrorJson fsErrorJson = null;
        boolean zA8G = false;
        int iA8U = 0;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new FsUploadResponseJson(i, zA8G, strA8f, iA8U, fsErrorJson, c2hx);
            }
            if (iA8N == 0) {
                zA8G = c9j4A55.A8G(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA8f = c9j4A55.A8f(c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                iA8U = c9j4A55.A8U(c9iZ, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                fsErrorJson = (FsErrorJson) c9j4A55.A8Z(FsErrorJson$$serializer.INSTANCE, c9iZ, 3);
                i |= 8;
            }
        }
    }

    static {
        FsUploadResponseJson$$serializer fsUploadResponseJson$$serializer = new FsUploadResponseJson$$serializer();
        INSTANCE = fsUploadResponseJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.FsUploadResponseJson", fsUploadResponseJson$$serializer, 4);
        c9iKA1C.A08(PairsInviteMailboxKt.OUTCOME_OK, true);
        c9iKA1C.A08("path", true);
        C60Q.A1N("bytes_written", c9iKA1C, true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cH.A1a(FsErrorJson$$serializer.INSTANCE, C07839ix.A00, C07779iq.A01, C07729ii.A00);
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
    public final void serialize(InterfaceC07789is interfaceC07789is, FsUploadResponseJson fsUploadResponseJson) {
        AnonymousClass003.A0u(interfaceC07789is, fsUploadResponseJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        FsUploadResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(fsUploadResponseJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
