package X;

import com.facebook.pando.PandoRealtimeInfoJNI;

/* loaded from: classes6.dex */
public final class HZA {
    public final PandoRealtimeInfoJNI forSubscription(String str) {
        C7384Etj.A0Y(str, 0);
        return new PandoRealtimeInfoJNI(str);
    }

    public final PandoRealtimeInfoJNI forLiveQuery(String str) {
        return new PandoRealtimeInfoJNI(str, "");
    }

    public final PandoRealtimeInfoJNI forLiveQuery(String str, String str2) {
        C7384Etj.A0Y(str2, 1);
        return new PandoRealtimeInfoJNI(str, str2);
    }
}
