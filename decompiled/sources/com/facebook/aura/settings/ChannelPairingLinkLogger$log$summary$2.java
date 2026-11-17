package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C7384Etj;
import X.G0U;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ChannelPairingLinkLogger$log$summary$2 extends AbstractC7559F3s implements G0U<Map.Entry<? extends String, ? extends String>, CharSequence> {
    public static final ChannelPairingLinkLogger$log$summary$2 INSTANCE = new ChannelPairingLinkLogger$log$summary$2();

    public ChannelPairingLinkLogger$log$summary$2() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(Map.Entry<String, String> entry) {
        C7384Etj.A0Y(entry, 0);
        String key = entry.getKey();
        String value = entry.getValue();
        StringBuilder sb = new StringBuilder();
        sb.append((Object) key);
        return AnonymousClass006.A0y(value, InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, sb);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends String, ? extends String> entry) {
        return invoke2((Map.Entry<String, String>) entry);
    }
}
