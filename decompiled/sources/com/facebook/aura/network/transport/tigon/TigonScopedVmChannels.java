package com.facebook.aura.network.transport.tigon;

import X.ADq;
import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C10571Hud;
import X.C3cG;
import X.C7BY;
import X.CFK;
import com.facebook.aura.network.api.HatchVmHostsKt;
import com.facebook.aura.network.tigon.AuraTigonServiceProvider;
import com.facebook.aura.network.transport.HatchScopedVmChannel;
import java.net.URI;
import java.util.concurrent.ConcurrentSkipListSet;

/* loaded from: classes5.dex */
public final class TigonScopedVmChannels {
    public static final TigonScopedVmChannels INSTANCE = new TigonScopedVmChannels();
    public static final ConcurrentSkipListSet<Integer> freeSlots = new ConcurrentSkipListSet<>(AbstractC0878AGe.A0X(new ADq(0, 3)));

    public final HatchScopedVmChannel open(String str, String str2, String str3) {
        Object objA0s;
        AnonymousClass005.A0x(str, str2, str3);
        try {
            objA0s = new URI(AnonymousClass002.A0l(str)).getHost();
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        String str4 = (String) objA0s;
        if (str4 != null && !C7BY.A0j(str2) && HatchVmHostsKt.isMetaAiVmHost(str4)) {
            ConcurrentSkipListSet<Integer> concurrentSkipListSet = freeSlots;
            Integer numPollFirst = concurrentSkipListSet.pollFirst();
            if (numPollFirst != null) {
                try {
                    TigonScopedVmChannel tigonScopedVmChannel = new TigonScopedVmChannel(AuraTigonServiceProvider.INSTANCE.getScopedVmChannelResources(numPollFirst.intValue()), str4, str2, new TigonScopedVmChannels$open$channel$1(numPollFirst));
                    try {
                        tigonScopedVmChannel.connect(AnonymousClass002.A0l(str), str3);
                        return tigonScopedVmChannel;
                    } catch (Throwable th2) {
                        tigonScopedVmChannel.close();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    concurrentSkipListSet.add(numPollFirst);
                    throw th3;
                }
            }
            CFK.A06(TigonScopedVmChannelKt.TAG, "No free scoped VM channel");
        }
        return null;
    }
}
