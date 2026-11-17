package com.facebook.aura.commands.alarm;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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
import com.facebook.aura.feed.repo.FeedRepositoryKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class ShadowAlarm$$serializer implements C9cd<ShadowAlarm> {
    public static final ShadowAlarm$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ShadowAlarm deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0w = null;
        Recurrence recurrence = null;
        String strA8f = null;
        String strA0h = null;
        String strA8f2 = null;
        long jA8X = 0;
        long jA8X2 = 0;
        int iA8U = 0;
        int i = 0;
        boolean zA8G = false;
        boolean zA8G2 = false;
        int iA8U2 = 0;
        int iA8U3 = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new ShadowAlarm(i, strA8f, strA0h, iA8U3, iA8U2, jA8X, strA8f2, zA8G2, zA8G, recurrence, jA8X2, iA8U, strA0w, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i |= 2;
                    break;
                case 2:
                    iA8U3 = c9j4A55.A8U(c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    iA8U2 = c9j4A55.A8U(c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    jA8X = c9j4A55.A8X(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    strA8f2 = c9j4A55.A8f(c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    zA8G2 = c9j4A55.A8G(c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    zA8G = c9j4A55.A8G(c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    recurrence = (Recurrence) c9j4A55.A8Z(Recurrence$$serializer.INSTANCE, c9iZ, 8);
                    i |= 256;
                    break;
                case 9:
                    jA8X2 = c9j4A55.A8X(c9iZ, 9);
                    i |= 512;
                    break;
                case 10:
                    iA8U = c9j4A55.A8U(c9iZ, 10);
                    i |= 1024;
                    break;
                case 11:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 11);
                    i |= 2048;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        ShadowAlarm$$serializer shadowAlarm$$serializer = new ShadowAlarm$$serializer();
        INSTANCE = shadowAlarm$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.commands.alarm.ShadowAlarm", shadowAlarm$$serializer, 12);
        C3cI.A1P("id", c9iKA1C, false);
        c9iKA1C.A08("hour", false);
        c9iKA1C.A08("minute", false);
        c9iKA1C.A08("triggerTimeMs", false);
        c9iKA1C.A08("days", true);
        c9iKA1C.A08("vibrate", true);
        c9iKA1C.A08("inApp", true);
        c9iKA1C.A08("recurrence", true);
        c9iKA1C.A08("anchorMs", true);
        c9iKA1C.A08("firedCount", true);
        c9iKA1C.A08(FeedRepositoryKt.TIMEZONE_PARAM, true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C07729ii c07729ii = C07729ii.A00;
        C9j1 c9j1 = C9j1.A00;
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07779iq, c07779iq, c07729ii, c07729ii, c9j1, c07779iq, c07839ix, c07839ix, AbstractC07749im.A00(Recurrence$$serializer.INSTANCE), c9j1, c07729ii, AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ShadowAlarm shadowAlarm) {
        AnonymousClass003.A0u(interfaceC07789is, shadowAlarm);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ShadowAlarm.write$Self$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm(shadowAlarm, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
