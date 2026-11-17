package com.facebook.aura.nodes.datasource;

import X.AnonymousClass003;
import X.C07729ii;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j1;
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class ChunkPolicyJson$$serializer implements C9cd<ChunkPolicyJson> {
    public static final ChunkPolicyJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ChunkPolicyJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        long jA8X = 0;
        long jA8X2 = 0;
        int iA8U = 0;
        boolean zA8G = false;
        int i = 0;
        int iA8U2 = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new ChunkPolicyJson(i, jA8X, iA8U, iA8U2, jA8X2, zA8G, (C2hx) null);
            }
            if (iA8N == 0) {
                jA8X = c9j4A55.A8X(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                iA8U = c9j4A55.A8U(c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                iA8U2 = c9j4A55.A8U(c9iZ, 2);
                i |= 4;
            } else if (iA8N == 3) {
                jA8X2 = c9j4A55.A8X(c9iZ, 3);
                i |= 8;
            } else {
                if (iA8N != 4) {
                    throw C3cG.A17(iA8N);
                }
                zA8G = c9j4A55.A8G(c9iZ, 4);
                i |= 16;
            }
        }
    }

    static {
        ChunkPolicyJson$$serializer chunkPolicyJson$$serializer = new ChunkPolicyJson$$serializer();
        INSTANCE = chunkPolicyJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.nodes.datasource.ChunkPolicyJson", chunkPolicyJson$$serializer, 5);
        c9iKA1C.A08("chunk_days", false);
        c9iKA1C.A08("max_chunk_bytes", false);
        c9iKA1C.A08("max_chunks", false);
        c9iKA1C.A08("max_total_bytes", false);
        c9iKA1C.A08("may_bisect", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C9j1 c9j1 = C9j1.A00;
        C07729ii c07729ii = C07729ii.A00;
        return new C9hr[]{c9j1, c07729ii, c07729ii, c9j1, C07839ix.A00};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ChunkPolicyJson chunkPolicyJson) {
        AnonymousClass003.A0u(interfaceC07789is, chunkPolicyJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ChunkPolicyJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_datasource_datasource(chunkPolicyJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
