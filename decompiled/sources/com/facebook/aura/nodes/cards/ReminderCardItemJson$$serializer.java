package com.facebook.aura.nodes.cards;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07729ii;
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
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class ReminderCardItemJson$$serializer implements C9cd<ReminderCardItemJson> {
    public static final int $stable = 0;
    public static final ReminderCardItemJson$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final ReminderCardItemJson deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        String strA0v = null;
        Integer numA0N = null;
        Integer numA0N2 = null;
        Long lA0P = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new ReminderCardItemJson(i, strA0v, numA0N, numA0N2, lA0P, (C2hx) null);
            }
            if (iA8N == 0) {
                strA0v = C3cI.A0v(c9iZ, c9j4A55, 0);
                i |= 1;
            } else if (iA8N == 1) {
                numA0N = C3cI.A0N(c9iZ, c9j4A55, 1);
                i |= 2;
            } else if (iA8N == 2) {
                numA0N2 = C3cI.A0N(c9iZ, c9j4A55, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw C3cG.A17(iA8N);
                }
                lA0P = C3cI.A0P(c9iZ, c9j4A55, 3);
                i |= 8;
            }
        }
    }

    static {
        ReminderCardItemJson$$serializer reminderCardItemJson$$serializer = new ReminderCardItemJson$$serializer();
        INSTANCE = reminderCardItemJson$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.nodes.cards.ReminderCardItemJson", reminderCardItemJson$$serializer, 4);
        boolean zA1Y = C3cI.A1Y(c9iKA1C);
        c9iKA1C.A08("hour", zA1Y);
        c9iKA1C.A08("minute", zA1Y);
        c9iKA1C.A08("trigger_time_ms", zA1Y);
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
        C9hr c9hrA15 = C3cG.A15();
        C07729ii c07729ii = C07729ii.A00;
        return C3cH.A1a(C9j1.A00, c9hrA15, AbstractC07749im.A00(c07729ii), AbstractC07749im.A00(c07729ii));
    }

    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, ReminderCardItemJson reminderCardItemJson) {
        AnonymousClass003.A0u(interfaceC07789is, reminderCardItemJson);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        ReminderCardItemJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_cards_cards(reminderCardItemJson, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
