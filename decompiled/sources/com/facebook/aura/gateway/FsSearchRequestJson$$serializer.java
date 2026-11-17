package com.facebook.aura.gateway;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C5hV;
import X.C60O;
import X.C60Q;
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
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class FsSearchRequestJson$$serializer implements C9cd<FsSearchRequestJson> {
    public static final int $stable = 0;
    public static final FsSearchRequestJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final FsSearchRequestJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = FsSearchRequestJson.$childSerializers;
        String strA0w = null;
        FsSearchNameJson fsSearchNameJson = null;
        List list = null;
        Integer numA0X = null;
        Integer numA0X2 = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new FsSearchRequestJson(i, strA0w, fsSearchNameJson, list, numA0X, numA0X2, (C2hx) null);
            }
            if (iA8N == 0) {
                strA0w = C3cI.A0w(c9iZ, c9j4A55, 0);
                i |= 1;
            } else if (iA8N == 1) {
                fsSearchNameJson = (FsSearchNameJson) c9j4A55.A8Z(FsSearchNameJson$$serializer.INSTANCE, c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                list = (List) C3cJ.A0G(c9iZ, c9j4A55, f0cArr, 2);
                i |= 4;
            } else if (iA8N == 3) {
                numA0X = C60Q.A0X(c9iZ, c9j4A55, 3);
                i |= 8;
            } else {
                if (iA8N != 4) {
                    throw C3cG.A17(iA8N);
                }
                numA0X2 = C60Q.A0X(c9iZ, c9j4A55, 4);
                i |= 16;
            }
        }
    }

    static {
        FsSearchRequestJson$$serializer fsSearchRequestJson$$serializer = new FsSearchRequestJson$$serializer();
        INSTANCE = fsSearchRequestJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.gateway.FsSearchRequestJson", fsSearchRequestJson$$serializer, 5);
        C60O.A1T("path", c9iKA1C, true);
        c9iKA1C.A08("extensions", true);
        c9iKA1C.A08(PhotosSearchHandlerKt.PARAM_LIMIT, true);
        c9iKA1C.A08(PhotosSearchHandlerKt.PARAM_OFFSET, true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = FsSearchRequestJson.$childSerializers;
        C9hr c9hrA15 = C3cG.A15();
        C9hr c9hrA00 = AbstractC07749im.A00(FsSearchNameJson$$serializer.INSTANCE);
        C9hr c9hrA14 = C3cH.A14(f0cArr, 2);
        C07729ii c07729ii = C07729ii.A00;
        return C3cI.A1b(c07729ii, c9hrA15, c9hrA00, c9hrA14, AbstractC07749im.A00(c07729ii));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, FsSearchRequestJson fsSearchRequestJson) {
        AnonymousClass003.A0u(interfaceC07789is, fsSearchRequestJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        FsSearchRequestJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(fsSearchRequestJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
