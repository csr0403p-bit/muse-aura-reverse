package com.facebook.aura.network.transport.cache;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.G0U;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HatchHttpCacheKey$build$varyHeaders$3 extends AbstractC7559F3s implements G0U<Map.Entry<? extends String, ? extends String>, CharSequence> {
    public static final HatchHttpCacheKey$build$varyHeaders$3 INSTANCE = new HatchHttpCacheKey$build$varyHeaders$3();

    public HatchHttpCacheKey$build$varyHeaders$3() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(Map.Entry<String, String> entry) {
        C7384Etj.A0Y(entry, 0);
        return AnonymousClass006.A0y(entry.getValue(), InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, C3cG.A0g(C60Q.A0g(C60O.A0t(entry))));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends String, ? extends String> entry) {
        return invoke2((Map.Entry<String, String>) entry);
    }
}
