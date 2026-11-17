package com.facebook.aura.network.transport;

import X.C7384Etj;
import java.util.Map;

/* loaded from: classes5.dex */
public interface HatchDuplexResponseHandler {

    /* loaded from: classes3.dex */
    public abstract class DefaultImpls {
        @Deprecated
        public static void onComplete(HatchDuplexResponseHandler hatchDuplexResponseHandler, HatchHttpResponse hatchHttpResponse) {
            C7384Etj.A0Y(hatchHttpResponse, 1);
        }

        @Deprecated
        public static void onResponse(HatchDuplexResponseHandler hatchDuplexResponseHandler, int i, Map<String, String> map) {
            C7384Etj.A0Y(map, 2);
        }
    }

    void onBody(byte[] bArr);

    void onComplete(HatchHttpResponse hatchHttpResponse);

    void onResponse(int i, Map<String, String> map);

    /* renamed from: com.facebook.aura.network.transport.HatchDuplexResponseHandler$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static void $default$onComplete(HatchDuplexResponseHandler hatchDuplexResponseHandler, HatchHttpResponse hatchHttpResponse) {
        }

        public static /* synthetic */ void access$onComplete$jd(HatchDuplexResponseHandler hatchDuplexResponseHandler, HatchHttpResponse hatchHttpResponse) {
        }

        public static void $default$onResponse(HatchDuplexResponseHandler hatchDuplexResponseHandler, int i, Map map) {
        }

        public static /* synthetic */ void access$onResponse$jd(HatchDuplexResponseHandler hatchDuplexResponseHandler, int i, Map map) {
        }
    }
}
