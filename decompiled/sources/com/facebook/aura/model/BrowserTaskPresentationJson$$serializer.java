package com.facebook.aura.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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
import com.facebook.aura.notifications.push.HatchChatNotificationIds;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class BrowserTaskPresentationJson$$serializer implements C9cd<BrowserTaskPresentationJson> {
    public static final int $stable = 0;
    public static final BrowserTaskPresentationJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final BrowserTaskPresentationJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        C2hx c2hx = null;
        int i2 = 0;
        Integer num = null;
        BrowserTaskSiteJson browserTaskSiteJson = null;
        Long l = null;
        BrowserTaskScreenshotJson browserTaskScreenshotJson = null;
        String strA0g = null;
        Long l2 = null;
        BrowserTaskExecutionJson browserTaskExecutionJson = null;
        String strA0f = null;
        BrowserTaskTabJson browserTaskTabJson = null;
        BrowserTaskTabJson browserTaskTabJson2 = null;
        String strA8f = null;
        String strA0h = null;
        String strA0i = null;
        String strA8f2 = null;
        String strA8f3 = null;
        String strA8f4 = null;
        String strA8f5 = null;
        int iA8U = 0;
        int iA8U2 = 0;
        boolean zA8G = false;
        boolean zA8G2 = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new BrowserTaskPresentationJson(i2, strA8f, strA0h, strA0i, strA8f2, strA8f3, iA8U, num, zA8G, iA8U2, l2, l, strA8f4, browserTaskScreenshotJson, browserTaskSiteJson, browserTaskTabJson2, browserTaskTabJson, zA8G2, strA8f5, strA0g, strA0f, browserTaskExecutionJson, c2hx);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    strA0h = C3cH.A0h(c9iZ, c9j4A55);
                    i2 |= 2;
                    continue;
                case 2:
                    strA0i = C3cH.A0i(c9iZ, c9j4A55);
                    i2 |= 4;
                    continue;
                case 3:
                    strA8f2 = c9j4A55.A8f(c9iZ, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    strA8f3 = c9j4A55.A8f(c9iZ, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    iA8U = c9j4A55.A8U(c9iZ, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    num = (Integer) c9j4A55.A8Z(C07729ii.A00, c9iZ, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    zA8G = c9j4A55.A8G(c9iZ, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    iA8U2 = c9j4A55.A8U(c9iZ, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    l2 = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    l = (Long) c9j4A55.A8Z(C9j1.A00, c9iZ, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    strA8f4 = c9j4A55.A8f(c9iZ, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    browserTaskScreenshotJson = (BrowserTaskScreenshotJson) c9j4A55.A8Z(BrowserTaskScreenshotJson$$serializer.INSTANCE, c9iZ, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    browserTaskSiteJson = (BrowserTaskSiteJson) c9j4A55.A8Z(BrowserTaskSiteJson$$serializer.INSTANCE, c9iZ, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    browserTaskTabJson2 = (BrowserTaskTabJson) c9j4A55.A8Z(BrowserTaskTabJson$$serializer.INSTANCE, c9iZ, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    browserTaskTabJson = (BrowserTaskTabJson) c9j4A55.A8Z(BrowserTaskTabJson$$serializer.INSTANCE, c9iZ, 15);
                    i2 |= 32768;
                    continue;
                case 16:
                    zA8G2 = c9j4A55.A8G(c9iZ, 16);
                    i = 65536;
                    break;
                case 17:
                    strA8f5 = c9j4A55.A8f(c9iZ, 17);
                    i = 131072;
                    break;
                case 18:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 18);
                    i = 262144;
                    break;
                case 19:
                    strA0f = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 19);
                    i = 524288;
                    break;
                case 20:
                    browserTaskExecutionJson = (BrowserTaskExecutionJson) c9j4A55.A8Z(BrowserTaskExecutionJson$$serializer.INSTANCE, c9iZ, 20);
                    i2 |= 1048576;
                    continue;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
    }

    static {
        BrowserTaskPresentationJson$$serializer browserTaskPresentationJson$$serializer = new BrowserTaskPresentationJson$$serializer();
        INSTANCE = browserTaskPresentationJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.BrowserTaskPresentationJson", browserTaskPresentationJson$$serializer, 21);
        C3cH.A1G(HatchChatNotificationIds.PARAM_BROWSER_TASK_ID, c9iKA1C, true);
        C3cH.A1H("activity_title", c9iKA1C, true);
        c9iKA1C.A08("display_status", true);
        c9iKA1C.A08("version", true);
        c9iKA1C.A08("queue_position", true);
        c9iKA1C.A08("capacity_blocked", true);
        c9iKA1C.A08("occupied_slots", true);
        c9iKA1C.A08("parked_expires_at_ms", true);
        c9iKA1C.A08("next_parked_expires_at_ms", true);
        c9iKA1C.A08("terminal_reason", true);
        c9iKA1C.A08("latest_screenshot", true);
        c9iKA1C.A08("current_site", true);
        c9iKA1C.A08("active_tab", true);
        c9iKA1C.A08("latest_tab", true);
        c9iKA1C.A08("preview_available", true);
        c9iKA1C.A08("control_owner", true);
        c9iKA1C.A08("node_id", true);
        c9iKA1C.A08("node_name", true);
        c9iKA1C.A08("execution", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C07729ii c07729ii = C07729ii.A00;
        C9hr c9hrA00 = AbstractC07749im.A00(c07729ii);
        C07839ix c07839ix = C07839ix.A00;
        C9j1 c9j1 = C9j1.A00;
        C9hr c9hrA002 = AbstractC07749im.A00(c9j1);
        C9hr c9hrA003 = AbstractC07749im.A00(c9j1);
        C9hr c9hrA004 = AbstractC07749im.A00(BrowserTaskScreenshotJson$$serializer.INSTANCE);
        C9hr c9hrA005 = AbstractC07749im.A00(BrowserTaskSiteJson$$serializer.INSTANCE);
        BrowserTaskTabJson$$serializer browserTaskTabJson$$serializer = BrowserTaskTabJson$$serializer.INSTANCE;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, c07779iq, c07779iq, c07729ii, c9hrA00, c07839ix, c07729ii, c9hrA002, c9hrA003, c07779iq, c9hrA004, c9hrA005, AbstractC07749im.A00(browserTaskTabJson$$serializer), AbstractC07749im.A00(browserTaskTabJson$$serializer), c07839ix, c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(BrowserTaskExecutionJson$$serializer.INSTANCE)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, BrowserTaskPresentationJson browserTaskPresentationJson) {
        AnonymousClass003.A0u(interfaceC07789is, browserTaskPresentationJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        BrowserTaskPresentationJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(browserTaskPresentationJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
