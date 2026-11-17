package com.facebook.aura.partners.voice.session.impl;

import X.AnonymousClass003;
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
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class CallJoinResultJson$$serializer implements C9cd<CallJoinResultJson> {
    public static final CallJoinResultJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final CallJoinResultJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA8f = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new CallJoinResultJson(i, strA8f, (C2hx) null);
            }
            if (iA8N != 0) {
                throw C3cG.A17(iA8N);
            }
            strA8f = c9j4A55.A8f(c9iZ, 0);
            i = 1;
        }
    }

    static {
        CallJoinResultJson$$serializer callJoinResultJson$$serializer = new CallJoinResultJson$$serializer();
        INSTANCE = callJoinResultJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.partners.voice.session.impl.CallJoinResultJson", callJoinResultJson$$serializer, 1);
        c9iKA1C.A08("payload_b64", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9cd
    public /* bridge */ C9hr<?>[] typeParametersSerializers() {
        return C5hV.A00;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return C3cG.A1Z();
    }

    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, CallJoinResultJson callJoinResultJson) {
        AnonymousClass003.A0u(interfaceC07789is, callJoinResultJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        CallJoinResultJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(callJoinResultJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
