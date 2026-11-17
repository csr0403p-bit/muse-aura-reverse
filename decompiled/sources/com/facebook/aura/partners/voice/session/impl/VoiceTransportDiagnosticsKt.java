package com.facebook.aura.partners.voice.session.impl;

import X.AnonymousClass003;
import X.G0U;
import com.facebook.rsys.mediastats.gen.MediaStats;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class VoiceTransportDiagnosticsKt {
    public static final Long sumAvailable(List<? extends MediaStats> list, G0U<? super MediaStats, Long> g0u) {
        AnonymousClass003.A0u(list, g0u);
        Iterator<? extends MediaStats> it = list.iterator();
        boolean z = false;
        long jLongValue = 0;
        while (it.hasNext()) {
            Long lInvoke = g0u.invoke(it.next());
            if (lInvoke != null) {
                jLongValue += lInvoke.longValue();
                z = true;
            }
        }
        if (z) {
            return Long.valueOf(jLongValue);
        }
        return null;
    }
}
