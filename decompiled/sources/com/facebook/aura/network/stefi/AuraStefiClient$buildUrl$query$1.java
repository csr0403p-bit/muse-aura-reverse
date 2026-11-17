package com.facebook.aura.network.stefi;

import X.AbstractC7559F3s;
import X.C60O;
import X.C7384Etj;
import X.FGI;
import X.G0U;
import android.net.Uri;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AuraStefiClient$buildUrl$query$1 extends AbstractC7559F3s implements G0U<Map.Entry<? extends String, ? extends String>, CharSequence> {
    public static final AuraStefiClient$buildUrl$query$1 INSTANCE = new AuraStefiClient$buildUrl$query$1();

    public AuraStefiClient$buildUrl$query$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(Map.Entry<String, String> entry) {
        C7384Etj.A0Y(entry, 0);
        return FGI.A0U(Uri.encode(C60O.A0t(entry)), InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, Uri.encode(entry.getValue()));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends String, ? extends String> entry) {
        return invoke2((Map.Entry<String, String>) entry);
    }
}
