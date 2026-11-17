package com.facebook.aura.handoff.impl;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.FGI;
import X.G0U;
import android.net.Uri;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* loaded from: classes3.dex */
public final class HandoffLinkVerifier$signedString$sortedQuery$2 extends AbstractC7559F3s implements G0U<String, CharSequence> {
    public final /* synthetic */ Uri $uri;

    @Override // X.G0U
    public final CharSequence invoke(String str) {
        C7384Etj.A0Y(str, 0);
        String strRfc3986Encode = HandoffLinkVerifier.INSTANCE.rfc3986Encode(str);
        HandoffLinkVerifier handoffLinkVerifier = HandoffLinkVerifier.INSTANCE;
        String queryParameter = this.$uri.getQueryParameter(str);
        if (queryParameter == null) {
            queryParameter = "";
        }
        return FGI.A0U(strRfc3986Encode, InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, handoffLinkVerifier.rfc3986Encode(queryParameter));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandoffLinkVerifier$signedString$sortedQuery$2(Uri uri) {
        super(1);
        this.$uri = uri;
    }
}
