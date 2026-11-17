package com.facebook.aura.network.transport;

import X.C7384Etj;
import java.util.Map;

/* loaded from: classes5.dex */
public interface HatchHttpRequestAttemptObserver {

    public abstract class DefaultImpls {
        @Deprecated
        public static void onTransportTimings(HatchHttpRequestAttemptObserver hatchHttpRequestAttemptObserver, HatchHttpTransportTimings hatchHttpTransportTimings) {
            C7384Etj.A0Y(hatchHttpTransportTimings, 1);
        }
    }

    Map<String, String> getExtraHeaders();

    void onAfterResponseReceived(long j);

    void onBeforeRequestSent(long j);

    void onCancelled();

    void onCompleted(HatchHttpResponse hatchHttpResponse);

    void onFailed(Throwable th);

    void onTransportTimings(HatchHttpTransportTimings hatchHttpTransportTimings);

    /* renamed from: com.facebook.aura.network.transport.HatchHttpRequestAttemptObserver$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static void $default$onTransportTimings(HatchHttpRequestAttemptObserver hatchHttpRequestAttemptObserver, HatchHttpTransportTimings hatchHttpTransportTimings) {
        }

        public static /* synthetic */ void access$onTransportTimings$jd(HatchHttpRequestAttemptObserver hatchHttpRequestAttemptObserver, HatchHttpTransportTimings hatchHttpTransportTimings) {
        }
    }
}
