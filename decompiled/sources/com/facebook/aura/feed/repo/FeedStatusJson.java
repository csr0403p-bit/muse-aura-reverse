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
import X.C9j1;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class FeedStatusJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Long freshest_generated_at_ms;
    public final String next_edition_kind;
    public final Long next_scheduled_at_ms;
    public final String prompt_id;
    public final boolean refresh_in_progress;
    public final String run_id;
    public final Long started_at_ms;
    public final String trigger;

    /* loaded from: classes2.dex */
    public final class Companion {
        public final C9hr<FeedStatusJson> serializer() {
            return FeedStatusJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public FeedStatusJson() {
        this(null, false, null, null, null, null, null, null);
    }

    public static /* synthetic */ FeedStatusJson copy$default(FeedStatusJson feedStatusJson, String str, boolean z, String str2, String str3, Long l, Long l2, String str4, Long l3, int i, Object obj) {
        String str5 = str;
        boolean z2 = z;
        String str6 = str2;
        String str7 = str3;
        Long l4 = l;
        Long l5 = l2;
        String str8 = str4;
        Long l6 = l3;
        if ((i & 1) != 0) {
            str5 = feedStatusJson.prompt_id;
        }
        if ((i & 2) != 0) {
            z2 = feedStatusJson.refresh_in_progress;
        }
        if ((i & 4) != 0) {
            str6 = feedStatusJson.run_id;
        }
        if ((i & 8) != 0) {
            str7 = feedStatusJson.trigger;
        }
        if ((i & 16) != 0) {
            l4 = feedStatusJson.started_at_ms;
        }
        if ((i & 32) != 0) {
            l5 = feedStatusJson.next_scheduled_at_ms;
        }
        if ((i & 64) != 0) {
            str8 = feedStatusJson.next_edition_kind;
        }
        if ((i & 128) != 0) {
            l6 = feedStatusJson.freshest_generated_at_ms;
        }
        return new FeedStatusJson(str5, z2, str6, str7, l4, l5, str8, l6);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_feed_repo_repo(FeedStatusJson feedStatusJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || feedStatusJson.prompt_id != null) {
            c9j5.AAP(feedStatusJson.prompt_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || feedStatusJson.refresh_in_progress) {
            c9j5.AA7(c9iZ, 1, feedStatusJson.refresh_in_progress);
        }
        if (zAfR || feedStatusJson.run_id != null) {
            c9j5.AAP(feedStatusJson.run_id, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || feedStatusJson.trigger != null) {
            c9j5.AAP(feedStatusJson.trigger, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || feedStatusJson.started_at_ms != null) {
            c9j5.AAP(feedStatusJson.started_at_ms, C9j1.A00, c9iZ, 4);
        }
        if (zAfR || feedStatusJson.next_scheduled_at_ms != null) {
            c9j5.AAP(feedStatusJson.next_scheduled_at_ms, C9j1.A00, c9iZ, 5);
        }
        if (zAfR || feedStatusJson.next_edition_kind != null) {
            c9j5.AAP(feedStatusJson.next_edition_kind, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || feedStatusJson.freshest_generated_at_ms != null) {
            c9j5.AAP(feedStatusJson.freshest_generated_at_ms, C9j1.A00, c9iZ, 7);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedStatusJson) {
                FeedStatusJson feedStatusJson = (FeedStatusJson) obj;
                if (!C7384Etj.areEqual(this.prompt_id, feedStatusJson.prompt_id) || this.refresh_in_progress != feedStatusJson.refresh_in_progress || !C7384Etj.areEqual(this.run_id, feedStatusJson.run_id) || !C7384Etj.areEqual(this.trigger, feedStatusJson.trigger) || !C7384Etj.areEqual(this.started_at_ms, feedStatusJson.started_at_ms) || !C7384Etj.areEqual(this.next_scheduled_at_ms, feedStatusJson.next_scheduled_at_ms) || !C7384Etj.areEqual(this.next_edition_kind, feedStatusJson.next_edition_kind) || !C7384Etj.areEqual(this.freshest_generated_at_ms, feedStatusJson.freshest_generated_at_ms)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.prompt_id;
    }

    public final boolean component2() {
        return this.refresh_in_progress;
    }

    public final String component3() {
        return this.run_id;
    }

    public final String component4() {
        return this.trigger;
    }

    public final Long component5() {
        return this.started_at_ms;
    }

    public final Long component6() {
        return this.next_scheduled_at_ms;
    }

    public final String component7() {
        return this.next_edition_kind;
    }

    public final Long component8() {
        return this.freshest_generated_at_ms;
    }

    public final FeedStatusJson copy(String str, boolean z, String str2, String str3, Long l, Long l2, String str4, Long l3) {
        return new FeedStatusJson(str, z, str2, str3, l, l2, str4, l3);
    }

    public final Long getFreshest_generated_at_ms() {
        return this.freshest_generated_at_ms;
    }

    public final String getNext_edition_kind() {
        return this.next_edition_kind;
    }

    public final Long getNext_scheduled_at_ms() {
        return this.next_scheduled_at_ms;
    }

    public final String getPrompt_id() {
        return this.prompt_id;
    }

    public final boolean getRefresh_in_progress() {
        return this.refresh_in_progress;
    }

    public final String getRun_id() {
        return this.run_id;
    }

    public final Long getStarted_at_ms() {
        return this.started_at_ms;
    }

    public final String getTrigger() {
        return this.trigger;
    }

    public int hashCode() {
        return ((((((((((C0KA.A01(AnonymousClass006.A0G(this.prompt_id) * 31, this.refresh_in_progress) + AnonymousClass006.A0G(this.run_id)) * 31) + AnonymousClass006.A0G(this.trigger)) * 31) + AnonymousClass006.A0D(this.started_at_ms)) * 31) + AnonymousClass006.A0D(this.next_scheduled_at_ms)) * 31) + AnonymousClass006.A0G(this.next_edition_kind)) * 31) + C06G.A04(this.freshest_generated_at_ms);
    }

    public final FeedStatus toDomain() {
        String str = this.prompt_id;
        if (str == null || str.length() <= 0) {
            str = null;
        }
        boolean z = this.refresh_in_progress;
        String str2 = this.run_id;
        if (str2 == null || str2.length() <= 0) {
            str2 = null;
        }
        String str3 = this.trigger;
        if (str3 == null || str3.length() <= 0) {
            str3 = null;
        }
        Long l = this.started_at_ms;
        Long l2 = this.next_scheduled_at_ms;
        String str4 = this.next_edition_kind;
        return new FeedStatus(str, z, str2, str3, l, l2, str4 != null ? FeedEditionKind.Companion.fromWire(str4) : null, this.freshest_generated_at_ms);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FeedStatusJson(String str, boolean z, String str2, String str3, Long l, Long l2, String str4, Long l3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, AnonymousClass001.A1Q(i, z), (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : l3);
    }

    public /* synthetic */ FeedStatusJson(int i, String str, boolean z, String str2, String str3, Long l, Long l2, String str4, Long l3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.prompt_id = null;
        } else {
            this.prompt_id = str;
        }
        if ((i & 2) == 0) {
            this.refresh_in_progress = false;
        } else {
            this.refresh_in_progress = z;
        }
        if ((i & 4) == 0) {
            this.run_id = null;
        } else {
            this.run_id = str2;
        }
        if ((i & 8) == 0) {
            this.trigger = null;
        } else {
            this.trigger = str3;
        }
        if ((i & 16) == 0) {
            this.started_at_ms = null;
        } else {
            this.started_at_ms = l;
        }
        if ((i & 32) == 0) {
            this.next_scheduled_at_ms = null;
        } else {
            this.next_scheduled_at_ms = l2;
        }
        if ((i & 64) == 0) {
            this.next_edition_kind = null;
        } else {
            this.next_edition_kind = str4;
        }
        if ((i & 128) == 0) {
            this.freshest_generated_at_ms = null;
        } else {
            this.freshest_generated_at_ms = l3;
        }
    }

    public FeedStatusJson(String str, boolean z, String str2, String str3, Long l, Long l2, String str4, Long l3) {
        this.prompt_id = str;
        this.refresh_in_progress = z;
        this.run_id = str2;
        this.trigger = str3;
        this.started_at_ms = l;
        this.next_scheduled_at_ms = l2;
        this.next_edition_kind = str4;
        this.freshest_generated_at_ms = l3;
    }
}
