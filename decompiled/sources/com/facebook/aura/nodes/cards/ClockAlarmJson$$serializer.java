package com.facebook.aura.nodes.cards;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
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
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class ClockAlarmJson$$serializer implements C9cd<ClockAlarmJson> {
    public static final int $stable = 0;
    public static final ClockAlarmJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ClockAlarmJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        Integer numA0N = null;
        Integer numA0N2 = null;
        String strA0v = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new ClockAlarmJson(i, numA0N, numA0N2, strA0v, (C2hx) null);
            }
            if (iA8N == 0) {
                numA0N = C3cI.A0N(c9iZ, c9j4A55, 0);
                i |= 1;
            } else if (iA8N == 1) {
                numA0N2 = C3cI.A0N(c9iZ, c9j4A55, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                strA0v = C3cI.A0v(c9iZ, c9j4A55, 2);
                i |= 4;
            }
        }
    }

    static {
        ClockAlarmJson$$serializer clockAlarmJson$$serializer = new ClockAlarmJson$$serializer();
        INSTANCE = clockAlarmJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.nodes.cards.ClockAlarmJson", clockAlarmJson$$serializer, 3);
        c9iKA1C.A08("hour", true);
        C3cI.A1P("minute", c9iKA1C, true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        C07729ii c07729ii = C07729ii.A00;
        return C3cG.A1b(C07779iq.A01, AbstractC07749im.A00(c07729ii), AbstractC07749im.A00(c07729ii));
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
    public final void serialize(InterfaceC07789is interfaceC07789is, ClockAlarmJson clockAlarmJson) {
        AnonymousClass003.A0u(interfaceC07789is, clockAlarmJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ClockAlarmJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_cards_cards(clockAlarmJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
