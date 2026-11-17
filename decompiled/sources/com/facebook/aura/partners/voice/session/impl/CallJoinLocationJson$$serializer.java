package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07799it;
import X.C2hx;
import X.C3cG;
import X.C3cI;
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
import com.facebook.aura.gateway.service.GeofenceEventWorker;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class CallJoinLocationJson$$serializer implements C9cd<CallJoinLocationJson> {
    public static final CallJoinLocationJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final CallJoinLocationJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        Long lA0P = null;
        double dA8M = 0.0d;
        Long lA0P2 = null;
        double dA8M2 = 0.0d;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new CallJoinLocationJson(i, dA8M2, dA8M, lA0P, lA0P2, (C2hx) null);
            }
            if (iA8N == 0) {
                dA8M2 = c9j4A55.A8M(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                dA8M = c9j4A55.A8M(c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                lA0P = C3cI.A0P(c9iZ, c9j4A55, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                lA0P2 = C3cI.A0P(c9iZ, c9j4A55, 3);
                i |= 8;
            }
        }
    }

    static {
        CallJoinLocationJson$$serializer callJoinLocationJson$$serializer = new CallJoinLocationJson$$serializer();
        INSTANCE = callJoinLocationJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.partners.voice.session.impl.CallJoinLocationJson", callJoinLocationJson$$serializer, 4);
        C9iK.A06(c9iKA1C, false);
        c9iKA1C.A08(GeofenceEventWorker.KEY_FIX_TIMESTAMP_MS, true);
        c9iKA1C.A08("upload_timestamp_ms", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07799it c07799it = C07799it.A00;
        C9j1 c9j1 = C9j1.A00;
        return new C9hr[]{c07799it, c07799it, AbstractC07749im.A00(c9j1), AbstractC07749im.A00(c9j1)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, CallJoinLocationJson callJoinLocationJson) {
        AnonymousClass003.A0u(interfaceC07789is, callJoinLocationJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        CallJoinLocationJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(callJoinLocationJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
