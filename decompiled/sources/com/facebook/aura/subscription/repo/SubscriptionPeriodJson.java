package com.facebook.aura.subscription.repo;

import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C8j4;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class SubscriptionPeriodJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final long end;
    public final long start;

    public final class Companion {
        public final C9hr<SubscriptionPeriodJson> serializer() {
            return SubscriptionPeriodJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(SubscriptionPeriodJson subscriptionPeriodJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || subscriptionPeriodJson.start != 0) {
            c9j5.AAN(c9iZ, 0, subscriptionPeriodJson.start);
        }
        if (zAfR || subscriptionPeriodJson.end != 0) {
            c9j5.AAN(c9iZ, 1, subscriptionPeriodJson.end);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SubscriptionPeriodJson) {
                SubscriptionPeriodJson subscriptionPeriodJson = (SubscriptionPeriodJson) obj;
                if (this.start != subscriptionPeriodJson.start || this.end != subscriptionPeriodJson.end) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SubscriptionPeriodJson copy$default(SubscriptionPeriodJson subscriptionPeriodJson, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = subscriptionPeriodJson.start;
        }
        if ((i & 2) != 0) {
            j2 = subscriptionPeriodJson.end;
        }
        return new SubscriptionPeriodJson(j, j2);
    }

    public final long component1() {
        return this.start;
    }

    public final long component2() {
        return this.end;
    }

    public final SubscriptionPeriodJson copy(long j, long j2) {
        return new SubscriptionPeriodJson(j, j2);
    }

    public final long getEnd() {
        return this.end;
    }

    public final long getStart() {
        return this.start;
    }

    public int hashCode() {
        return C8j4.A0B(this.end, AnonymousClass005.A07(this.start));
    }

    public SubscriptionPeriodJson(long j, long j2) {
        this.start = j;
        this.end = j2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SubscriptionPeriodJson(int i, long j, long j2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.start = 0L;
        } else {
            this.start = j;
        }
        if ((i & 2) == 0) {
            this.end = 0L;
        } else {
            this.end = j2;
        }
    }

    public /* synthetic */ SubscriptionPeriodJson(long j, long j2, int i, C06H c06h) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2);
    }

    public SubscriptionPeriodJson() {
        this(0L, 0L);
    }
}
