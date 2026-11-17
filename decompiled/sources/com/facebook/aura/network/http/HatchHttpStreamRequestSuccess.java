package com.facebook.aura.network.http;

import X.C7384Etj;
import com.facebook.aura.network.transport.HatchHttpResponseStream;

/* loaded from: classes3.dex */
public final class HatchHttpStreamRequestSuccess implements HatchHttpStreamRequestResult {
    public final HatchHttpResponseStream response;

    public HatchHttpStreamRequestSuccess(HatchHttpResponseStream hatchHttpResponseStream) {
        C7384Etj.A0Y(hatchHttpResponseStream, 0);
        this.response = hatchHttpResponseStream;
    }

    public final HatchHttpResponseStream getResponse() {
        return this.response;
    }
}
