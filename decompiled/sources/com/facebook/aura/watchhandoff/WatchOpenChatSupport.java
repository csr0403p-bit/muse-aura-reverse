package com.facebook.aura.watchhandoff;

import X.A3q;
import X.AbstractC4267Crq;
import X.AnonymousClass003;
import X.C4182Cos;
import X.C4276Cs4;
import X.C4278Cs8;
import X.C60O;
import X.C7384Etj;
import X.CSZ;
import X.F0C;
import X.InterfaceC3641Caw;
import X.InterfaceC4097CmR;
import android.content.Context;
import com.facebook.aura.watchlink.WatchLinkClient;
import com.google.android.gms.wearable.internal.zzhg;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public final class WatchOpenChatSupport {
    public static final int $stable = 0;
    public static final WatchOpenChatSupport INSTANCE = new WatchOpenChatSupport();
    public static volatile Set<String> nodes = A3q.A00;

    public final void refresh(Context context) {
        C7384Etj.A0Y(context, 0);
        C4276Cs4 c4276Cs4 = C4276Cs4.A02;
        new C4182Cos(context, C4278Cs8.A00, AbstractC4267Crq.A00, c4276Cs4).A05(WatchLinkClient.OPEN_CHAT_CAPABILITY, 0).A06(new CSZ() { // from class: com.facebook.aura.watchhandoff.WatchOpenChatSupport.refresh.1
            @Override // X.CSZ
            public final void onSuccess(InterfaceC4097CmR interfaceC4097CmR) {
                Set<InterfaceC3641Caw> setAI8 = interfaceC4097CmR.AI8();
                C7384Etj.A0U(setAI8);
                HashSet hashSetA13 = C60O.A13();
                Iterator<InterfaceC3641Caw> it = setAI8.iterator();
                while (it.hasNext()) {
                    hashSetA13.add(((zzhg) it.next()).A00);
                }
                WatchOpenChatSupport.nodes = hashSetA13;
            }
        }, F0C.A05());
    }

    public final boolean supports(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        refresh(context);
        return nodes.contains(str);
    }
}
