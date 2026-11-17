package com.facebook.aura.nodes.cards;

import X.AbstractC07749im;
import X.AnonymousClass003;
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
import com.facebook.aura.shopping.repo.MarketplaceDetailsNormalizationKt;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class CalendarCardEventJson$$serializer implements C9cd<CalendarCardEventJson> {
    public static final int $stable = 0;
    public static final CalendarCardEventJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final CalendarCardEventJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0w = null;
        Long lA0Q = null;
        String strA0w2 = null;
        Long lA0Q2 = null;
        Long lA0Q3 = null;
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new CalendarCardEventJson(i, lA0Q, strA0w2, lA0Q2, lA0Q3, zA8G, strA0w, (C2hx) null);
                case 0:
                    lA0Q = C3cI.A0Q(c9iZ, c9j4A55, 0);
                    i |= 1;
                    break;
                case 1:
                    strA0w2 = C3cI.A0w(c9iZ, c9j4A55, 1);
                    i |= 2;
                    break;
                case 2:
                    lA0Q2 = C3cI.A0Q(c9iZ, c9j4A55, 2);
                    i |= 4;
                    break;
                case 3:
                    lA0Q3 = C3cI.A0Q(c9iZ, c9j4A55, 3);
                    i |= 8;
                    break;
                case 4:
                    zA8G = c9j4A55.A8G(c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    strA0w = C3cI.A0w(c9iZ, c9j4A55, 5);
                    i |= 32;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        CalendarCardEventJson$$serializer calendarCardEventJson$$serializer = new CalendarCardEventJson$$serializer();
        INSTANCE = calendarCardEventJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.nodes.cards.CalendarCardEventJson", calendarCardEventJson$$serializer, 6);
        C3cH.A1G("event_id", c9iKA1C, true);
        c9iKA1C.A08("start_time", true);
        c9iKA1C.A08("end_time", true);
        c9iKA1C.A08("all_day", true);
        c9iKA1C.A08(MarketplaceDetailsNormalizationKt.LOCATION_VARIANT_LABEL, true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C9j1 c9j1 = C9j1.A00;
        C9hr c9hrA00 = AbstractC07749im.A00(c9j1);
        C07779iq c07779iq = C07779iq.A01;
        return new C9hr[]{c9hrA00, AbstractC07749im.A00(c07779iq), AbstractC07749im.A00(c9j1), AbstractC07749im.A00(c9j1), C07839ix.A00, AbstractC07749im.A00(c07779iq)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, CalendarCardEventJson calendarCardEventJson) {
        AnonymousClass003.A0u(interfaceC07789is, calendarCardEventJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        CalendarCardEventJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_cards_cards(calendarCardEventJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
