package com.facebook.aura.commands.calendar;

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
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.shopping.repo.MarketplaceDetailsNormalizationKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class CalendarEventPayloadJson$$serializer implements C9cd<CalendarEventPayloadJson> {
    public static final CalendarEventPayloadJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final CalendarEventPayloadJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        C2hx c2hx = null;
        String strA0g = null;
        String strA0g2 = null;
        String strA0g3 = null;
        String strA0g4 = null;
        String strA0g5 = null;
        String strA0g6 = null;
        String str = null;
        String strA0f = null;
        String strA0f2 = null;
        String strA0f3 = null;
        String strA0u = null;
        String strA0f4 = null;
        String strA8f = null;
        String strA8f2 = null;
        String strA0i = null;
        String strA0o = null;
        String strA8f3 = null;
        String strA8f4 = null;
        String strA8f5 = null;
        String strA8f6 = null;
        int i2 = 0;
        boolean zA8G = false;
        boolean zA8G2 = false;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new CalendarEventPayloadJson(i2, strA8f, strA8f2, strA0i, strA0o, zA8G, strA8f3, strA8f4, strA8f5, str, strA0g6, strA0g5, strA0g2, strA0g3, strA0g, strA0f4, strA0u, strA0g4, zA8G2, strA0f3, strA0f2, strA8f6, strA0f, c2hx);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    strA8f2 = c9j4A55.A8f(c9iZ, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    strA0i = C3cH.A0i(c9iZ, c9j4A55);
                    i2 |= 4;
                    continue;
                case 3:
                    strA0o = C60Q.A0o(c9iZ, c9j4A55);
                    i2 |= 8;
                    continue;
                case 4:
                    zA8G = c9j4A55.A8G(c9iZ, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    strA8f3 = c9j4A55.A8f(c9iZ, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    strA8f4 = c9j4A55.A8f(c9iZ, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    strA8f5 = c9j4A55.A8f(c9iZ, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    str = (String) C3cI.A0U(c9iZ, c9j4A55);
                    i2 |= 256;
                    continue;
                case 9:
                    strA0g6 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    strA0g5 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    strA0g2 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    strA0g3 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    strA0g = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    strA0f4 = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    strA0u = C3cI.A0u(c9iZ, c9j4A55);
                    i = 32768;
                    break;
                case 16:
                    strA0g4 = C3cH.A0g(C07779iq.A01, c9iZ, c9j4A55, 16);
                    i = 65536;
                    break;
                case 17:
                    zA8G2 = c9j4A55.A8G(c9iZ, 17);
                    i = 131072;
                    break;
                case 18:
                    strA0f3 = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 18);
                    i = 262144;
                    break;
                case 19:
                    strA0f2 = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 19);
                    i = 524288;
                    break;
                case 20:
                    strA8f6 = c9j4A55.A8f(c9iZ, 20);
                    i = 1048576;
                    break;
                case 21:
                    strA0f = C3cH.A0f(C07779iq.A01, c9iZ, c9j4A55, 21);
                    i = 2097152;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
    }

    static {
        CalendarEventPayloadJson$$serializer calendarEventPayloadJson$$serializer = new CalendarEventPayloadJson$$serializer();
        INSTANCE = calendarEventPayloadJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.commands.calendar.CalendarEventPayloadJson", calendarEventPayloadJson$$serializer, 22);
        C3cH.A1G("event_id", c9iKA1C, true);
        c9iKA1C.A08("start_date", true);
        c9iKA1C.A08("end_date", true);
        c9iKA1C.A08("is_all_day", true);
        c9iKA1C.A08("calendar_name", true);
        c9iKA1C.A08("calendar_id", true);
        c9iKA1C.A08("availability", true);
        c9iKA1C.A08(MarketplaceDetailsNormalizationKt.LOCATION_VARIANT_LABEL, true);
        c9iKA1C.A08("notes", true);
        c9iKA1C.A08("time_zone", true);
        c9iKA1C.A08("start_local_date", true);
        c9iKA1C.A08("end_local_date", true);
        c9iKA1C.A08("start_local", true);
        c9iKA1C.A08("end_local", true);
        c9iKA1C.A08("start_weekday", true);
        c9iKA1C.A08("end_weekday", true);
        c9iKA1C.A08("is_recurring", true);
        C3cI.A1N("occurrence_date", c9iKA1C, true);
        c9iKA1C.A08(AuraDeeplinkRouteMapper.STATUS_ROUTE, true);
        c9iKA1C.A08("calendar_color", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07779iq c07779iq = C07779iq.A01;
        C07839ix c07839ix = C07839ix.A00;
        return new C9hr[]{c07779iq, c07779iq, c07779iq, c07779iq, c07839ix, c07779iq, c07779iq, c07779iq, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), c07839ix, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c07779iq), c07779iq, AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, CalendarEventPayloadJson calendarEventPayloadJson) {
        AnonymousClass003.A0u(interfaceC07789is, calendarEventPayloadJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        CalendarEventPayloadJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_commands_calendar_calendar(calendarEventPayloadJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
