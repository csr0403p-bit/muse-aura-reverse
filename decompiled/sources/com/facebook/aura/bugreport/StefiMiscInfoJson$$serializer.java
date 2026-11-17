package com.facebook.aura.bugreport;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C5hV;
import X.C60Q;
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
import com.facebook.acra.constants.ErrorReportingConstants;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class StefiMiscInfoJson$$serializer implements C9cd<StefiMiscInfoJson> {
    public static final int $stable = 0;
    public static final StefiMiscInfoJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final StefiMiscInfoJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0f = null;
        int i2 = 0;
        String strA0g = null;
        Long l = null;
        String strA0g2 = null;
        String strA0g3 = null;
        Boolean bool = null;
        Long l2 = null;
        Long l3 = null;
        String strA0s = null;
        String strA0r = null;
        String strA0q = null;
        String str = null;
        String strA8f = null;
        String strA0h = null;
        String strA0o = null;
        String strA8f2 = null;
        String strA8f3 = null;
        Boolean bool2 = null;
        boolean zA8G = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new StefiMiscInfoJson(i2, strA8f, strA0h, zA8G, strA0o, strA8f2, strA8f3, strA0g3, strA0g2, str, strA0g, strA0q, strA0r, strA0s, l, l3, l2, bool, bool2, strA0f, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i2 |= 2;
                    continue;
                case 2:
                    zA8G = c9j4A55.A8G(c9iZ, 2);
                    i2 |= 4;
                    continue;
                case 3:
                    strA0o = C60Q.A0o(c9iZ, c9j4A55);
                    i2 |= 8;
                    continue;
                case 4:
                    strA8f2 = c9j4A55.A8f(c9iZ, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    strA8f3 = c9j4A55.A8f(c9iZ, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    strA0g3 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    strA0g2 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    str = (String) C3cI.A0U(c9iZ, c9j4A55);
                    i2 |= 256;
                    continue;
                case 9:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    strA0q = C3cI.A0q(c9iZ, c9j4A55);
                    i2 |= 1024;
                    continue;
                case 11:
                    strA0r = C3cI.A0r(c9iZ, c9j4A55);
                    i2 |= 2048;
                    continue;
                case 12:
                    strA0s = C3cI.A0s(c9iZ, c9j4A55);
                    i2 |= 4096;
                    continue;
                case 13:
                    l = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    l3 = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    l2 = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 15);
                    i = 32768;
                    break;
                case 16:
                    bool = (Boolean) c9j4A55.A8Z(C07839ix.A00, c9iZ, 16);
                    i = 65536;
                    break;
                case 17:
                    bool2 = (Boolean) c9j4A55.A8Z(C07839ix.A00, c9iZ, 17);
                    i = 131072;
                    break;
                case 18:
                    strA0f = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 18);
                    i = 262144;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
    }

    static {
        StefiMiscInfoJson$$serializer stefiMiscInfoJson$$serializer = new StefiMiscInfoJson$$serializer();
        INSTANCE = stefiMiscInfoJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.bugreport.StefiMiscInfoJson", stefiMiscInfoJson$$serializer, 19);
        c9iKA1C.A08("bug_category_group", false);
        c9iKA1C.A08("bug_category_label", false);
        c9iKA1C.A08("app_only_report", false);
        c9iKA1C.A08("app_source", false);
        c9iKA1C.A08("bug_tags", false);
        c9iKA1C.A08(ErrorReportingConstants.ENDPOINT, false);
        c9iKA1C.A08("hatchery_vm_id", true);
        c9iKA1C.A08("vm_type", true);
        c9iKA1C.A08("message_id", true);
        c9iKA1C.A08("session_id", true);
        c9iKA1C.A08("model_name", true);
        c9iKA1C.A08("hatch_category", true);
        c9iKA1C.A08("voice_shared_call_id", true);
        c9iKA1C.A08("voice_call_started_at_ms", true);
        c9iKA1C.A08("voice_call_connected_at_ms", true);
        c9iKA1C.A08("voice_call_ended_at_ms", true);
        c9iKA1C.A08("voice_call_is_active", true);
        c9iKA1C.A08("agent_initiated", true);
        c9iKA1C.A08("agent_feedback_id", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C07839ix c07839ix = C07839ix.A00;
        C9hr c9hrA00 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA002 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA003 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA004 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA005 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA006 = AbstractC07749im.A00(c07779iq);
        C9hr c9hrA007 = AbstractC07749im.A00(c07779iq);
        C9j1 c9j1 = C9j1.A00;
        return new C9hr[]{c07779iq, c07779iq, c07839ix, c07779iq, c07779iq, c07779iq, c9hrA00, c9hrA002, c9hrA003, c9hrA004, c9hrA005, c9hrA006, c9hrA007, AbstractC07749im.A00(c9j1), AbstractC07749im.A00(c9j1), AbstractC07749im.A00(c9j1), AbstractC07749im.A00(c07839ix), AbstractC07749im.A00(c07839ix), AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, StefiMiscInfoJson stefiMiscInfoJson) {
        AnonymousClass003.A0u(interfaceC07789is, stefiMiscInfoJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        StefiMiscInfoJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_bugreport_bugreport(stefiMiscInfoJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
