package com.facebook.aura.feed.repo;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class FeedRegenerateResultJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean already_in_progress;
    public final String run_id;

    public final class Companion {
        public final C9hr<FeedRegenerateResultJson> serializer() {
            return FeedRegenerateResultJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_feed_repo_repo(FeedRegenerateResultJson feedRegenerateResultJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || feedRegenerateResultJson.run_id != null) {
            c9j5.AAP(feedRegenerateResultJson.run_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || feedRegenerateResultJson.already_in_progress) {
            c9j5.AA7(c9iZ, 1, feedRegenerateResultJson.already_in_progress);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedRegenerateResultJson) {
                FeedRegenerateResultJson feedRegenerateResultJson = (FeedRegenerateResultJson) obj;
                if (!C7384Etj.areEqual(this.run_id, feedRegenerateResultJson.run_id) || this.already_in_progress != feedRegenerateResultJson.already_in_progress) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FeedRegenerateResultJson copy$default(FeedRegenerateResultJson feedRegenerateResultJson, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedRegenerateResultJson.run_id;
        }
        if ((i & 2) != 0) {
            z = feedRegenerateResultJson.already_in_progress;
        }
        return new FeedRegenerateResultJson(str, z);
    }

    public final String component1() {
        return this.run_id;
    }

    public final boolean component2() {
        return this.already_in_progress;
    }

    public final FeedRegenerateResultJson copy(String str, boolean z) {
        return new FeedRegenerateResultJson(str, z);
    }

    public final boolean getAlready_in_progress() {
        return this.already_in_progress;
    }

    public final String getRun_id() {
        return this.run_id;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass006.A0G(this.run_id) * 31, this.already_in_progress);
    }

    public final FeedRegenerateResult toDomain() {
        String str = this.run_id;
        if (str == null || str.length() <= 0) {
            str = null;
        }
        return new FeedRegenerateResult(str, this.already_in_progress);
    }

    public FeedRegenerateResultJson(String str, boolean z) {
        this.run_id = str;
        this.already_in_progress = z;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FeedRegenerateResultJson(int i, String str, boolean z, C2hx c2hx) {
        this.run_id = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.already_in_progress = false;
        } else {
            this.already_in_progress = z;
        }
    }

    public /* synthetic */ FeedRegenerateResultJson(String str, boolean z, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str), AnonymousClass001.A1Q(i, z));
    }

    public FeedRegenerateResultJson() {
        this(null, false);
    }
}
