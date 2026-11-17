package com.facebook.aura.bloks.extensions.visibility;

import X.BV6;
import X.C06H;
import X.C60O;
import X.C7384Etj;
import X.FGI;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public final class AuraImpressionTimeTracker {
    public static final Companion Companion = new Companion();
    public static final String KEY_PREFIX = "bloks/impression-time-tracker/";
    public static final long UNKNOWN_TIME = -2147483648L;
    public final ConcurrentHashMap<String, Long> impressionTimesByKey;

    public final class Companion {
        private final String wrapKey(String str) {
            return FGI.A0M(AuraImpressionTimeTracker.KEY_PREFIX, str);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public AuraImpressionTimeTracker(ConcurrentHashMap<String, Long> concurrentHashMap) {
        C7384Etj.A0Y(concurrentHashMap, 0);
        this.impressionTimesByKey = concurrentHashMap;
    }

    public long getLastImpressionTimeInMs(String str) {
        C7384Etj.A0Y(str, 0);
        Number numberA0j = BV6.A0j(FGI.A0M(KEY_PREFIX, str), this.impressionTimesByKey);
        return numberA0j != null ? numberA0j.longValue() : UNKNOWN_TIME;
    }

    public boolean hasSeenBefore(String str) {
        C7384Etj.A0Y(str, 0);
        return getLastImpressionTimeInMs(str) != UNKNOWN_TIME;
    }

    public void updateImpressionTime(String str) {
        C7384Etj.A0Y(str, 0);
        this.impressionTimesByKey.put(FGI.A0M(KEY_PREFIX, str), C60O.A0k());
    }

    public /* synthetic */ boolean shouldTrackImpressionTimeIndependentlyFromOnAppear() {
        return false;
    }

    /* renamed from: getLastImpressionTimeInMs, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Long m281getLastImpressionTimeInMs(String str) {
        return Long.valueOf(getLastImpressionTimeInMs(str));
    }
}
