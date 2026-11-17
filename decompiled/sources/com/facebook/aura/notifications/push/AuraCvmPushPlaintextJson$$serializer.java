package com.facebook.aura.notifications.push;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
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
import com.facebook.aura.wearablebroadcast.MetaAiAppBroadcastSender;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public final /* synthetic */ class AuraCvmPushPlaintextJson$$serializer implements C9cd<AuraCvmPushPlaintextJson> {
    public static final AuraCvmPushPlaintextJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final AuraCvmPushPlaintextJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0v = null;
        String strA0v2 = null;
        String strA8f = null;
        AuraCvmPushPlaintextDataJson auraCvmPushPlaintextDataJson = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new AuraCvmPushPlaintextJson(i, strA0v, strA0v2, strA8f, auraCvmPushPlaintextDataJson, (C2hx) null);
            }
            if (iA8N == 0) {
                strA0v = C3cI.A0v(c9iZ, c9j4A55, 0);
                i |= 1;
            } else if (iA8N == 1) {
                strA0v2 = C3cI.A0v(c9iZ, c9j4A55, 1);
                i |= 2;
            } else if (iA8N == 2) {
                strA8f = c9j4A55.A8f(c9iZ, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                auraCvmPushPlaintextDataJson = (AuraCvmPushPlaintextDataJson) c9j4A55.A8a(AuraCvmPushPlaintextDataJson$$serializer.INSTANCE, c9iZ, 3);
                i |= 8;
            }
        }
    }

    static {
        AuraCvmPushPlaintextJson$$serializer auraCvmPushPlaintextJson$$serializer = new AuraCvmPushPlaintextJson$$serializer();
        INSTANCE = auraCvmPushPlaintextJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.notifications.push.AuraCvmPushPlaintextJson", auraCvmPushPlaintextJson$$serializer, 4);
        boolean zA1R = C3cG.A1R(c9iKA1C);
        c9iKA1C.A08(MetaAiAppBroadcastSender.EXTRA_BODY, zA1R);
        c9iKA1C.A08("notification_type", zA1R);
        c9iKA1C.A08("data", zA1R);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), c07779iq, AuraCvmPushPlaintextDataJson$$serializer.INSTANCE};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, AuraCvmPushPlaintextJson auraCvmPushPlaintextJson) {
        AnonymousClass003.A0u(interfaceC07789is, auraCvmPushPlaintextJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        AuraCvmPushPlaintextJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push(auraCvmPushPlaintextJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
