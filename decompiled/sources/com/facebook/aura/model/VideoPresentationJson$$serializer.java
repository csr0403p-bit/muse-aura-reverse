package com.facebook.aura.model;

import X.AnonymousClass003;
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
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class VideoPresentationJson$$serializer implements C9cd<VideoPresentationJson> {
    public static final int $stable = 0;
    public static final VideoPresentationJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final VideoPresentationJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = VideoPresentationJson.$childSerializers;
        C2hx c2hx = null;
        List listA0Q = null;
        String strA0v = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new VideoPresentationJson(i, listA0Q, strA0v, c2hx);
            }
            if (iA8N == 0) {
                listA0Q = C3cJ.A0Q(c9iZ, c9j4A55, f0cArr, 0);
                i |= 1;
            } else {
                if (iA8N != 1) {
                    throw C3cG.A17(iA8N);
                }
                strA0v = C3cI.A0v(c9iZ, c9j4A55, 1);
                i |= 2;
            }
        }
    }

    static {
        VideoPresentationJson$$serializer videoPresentationJson$$serializer = new VideoPresentationJson$$serializer();
        INSTANCE = videoPresentationJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.VideoPresentationJson", videoPresentationJson$$serializer, 2);
        c9iKA1C.A08("videos", true);
        c9iKA1C.A08(AgeCheckFunnelLogging.KEY_LAYOUT, true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cH.A1Y(C3cH.A0z(VideoPresentationJson.$childSerializers));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, VideoPresentationJson videoPresentationJson) {
        AnonymousClass003.A0u(interfaceC07789is, videoPresentationJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        VideoPresentationJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(videoPresentationJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
