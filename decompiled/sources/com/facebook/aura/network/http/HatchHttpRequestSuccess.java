package com.facebook.aura.network.http;

import X.C06G;
import X.C7384Etj;
import com.facebook.aura.network.transport.HatchHttpResponse;

/* loaded from: classes3.dex */
public final class HatchHttpRequestSuccess extends C06G implements HatchHttpRequestResult {
    public final HatchHttpResponse response;

    public HatchHttpRequestSuccess(HatchHttpResponse hatchHttpResponse) {
        C7384Etj.A0Y(hatchHttpResponse, 0);
        this.response = hatchHttpResponse;
    }

    public final HatchHttpRequestSuccess copy(HatchHttpResponse hatchHttpResponse) {
        C7384Etj.A0Y(hatchHttpResponse, 0);
        return new HatchHttpRequestSuccess(hatchHttpResponse);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof HatchHttpRequestSuccess) && C7384Etj.areEqual(this.response, ((HatchHttpRequestSuccess) obj).response));
    }

    public static /* synthetic */ HatchHttpRequestSuccess copy$default(HatchHttpRequestSuccess hatchHttpRequestSuccess, HatchHttpResponse hatchHttpResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchHttpResponse = hatchHttpRequestSuccess.response;
        }
        C7384Etj.A0Y(hatchHttpResponse, 0);
        return new HatchHttpRequestSuccess(hatchHttpResponse);
    }

    public final HatchHttpResponse component1() {
        return this.response;
    }

    public final HatchHttpResponse getResponse() {
        return this.response;
    }

    public int hashCode() {
        return this.response.hashCode();
    }

    public String toString() {
        return super.toString();
    }
}
