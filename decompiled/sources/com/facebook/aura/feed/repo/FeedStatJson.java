package com.facebook.aura.feed.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class FeedStatJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String label;
    public final String value;

    public final class Companion {
        public final C9hr<FeedStatJson> serializer() {
            return FeedStatJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_feed_repo_repo(FeedStatJson feedStatJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(feedStatJson.label)) {
            c9j5.AAV(feedStatJson.label, c9iZ, 0);
        }
        if (zAfR || !"".equals(feedStatJson.value)) {
            c9j5.AAV(feedStatJson.value, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedStatJson) {
                FeedStatJson feedStatJson = (FeedStatJson) obj;
                if (!C7384Etj.areEqual(this.label, feedStatJson.label) || !C7384Etj.areEqual(this.value, feedStatJson.value)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FeedStatJson copy$default(FeedStatJson feedStatJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedStatJson.label;
        }
        if ((i & 2) != 0) {
            str2 = feedStatJson.value;
        }
        AnonymousClass003.A0u(str, str2);
        return new FeedStatJson(str, str2);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.value;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.value, AnonymousClass001.A0G(this.label));
    }

    public final FeedStat toDomain() {
        return new FeedStat(this.label, this.value);
    }

    public FeedStatJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.label = str;
        this.value = str2;
    }

    public final FeedStatJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new FeedStatJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FeedStatJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public /* synthetic */ FeedStatJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.label = "";
        } else {
            this.label = str;
        }
        if ((i & 2) == 0) {
            this.value = "";
        } else {
            this.value = str2;
        }
    }

    public FeedStatJson() {
        this("", "");
    }
}
