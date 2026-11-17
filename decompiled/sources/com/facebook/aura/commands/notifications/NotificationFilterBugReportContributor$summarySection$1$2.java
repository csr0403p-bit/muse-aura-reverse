package com.facebook.aura.commands.notifications;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C3cG;
import X.G0U;
import android.os.Bundle;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* loaded from: classes3.dex */
public final class NotificationFilterBugReportContributor$summarySection$1$2 extends AbstractC7559F3s implements G0U<String, CharSequence> {
    public final /* synthetic */ Bundle $restrictions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationFilterBugReportContributor$summarySection$1$2(Bundle bundle) {
        super(1);
        this.$restrictions = bundle;
    }

    @Override // X.G0U
    public final CharSequence invoke(String str) {
        return AnonymousClass006.A0y(this.$restrictions.get(str), InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, C3cG.A0g(str));
    }
}
