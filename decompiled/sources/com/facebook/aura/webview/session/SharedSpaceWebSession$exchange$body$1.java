package com.facebook.aura.webview.session;

import X.AbstractC7559F3s;
import X.C60O;
import X.C7384Etj;
import X.FGI;
import X.G0U;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.net.URLEncoder;
import java.util.Map;

/* loaded from: classes3.dex */
public final class SharedSpaceWebSession$exchange$body$1 extends AbstractC7559F3s implements G0U<Map.Entry<? extends String, ? extends String>, CharSequence> {
    public static final SharedSpaceWebSession$exchange$body$1 INSTANCE = new SharedSpaceWebSession$exchange$body$1();

    public SharedSpaceWebSession$exchange$body$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(Map.Entry<String, String> entry) {
        C7384Etj.A0Y(entry, 0);
        return FGI.A0U(C60O.A0t(entry), InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, URLEncoder.encode(entry.getValue(), HatchWebPageParserKt.UTF_8));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends String, ? extends String> entry) {
        return invoke2((Map.Entry<String, String>) entry);
    }
}
