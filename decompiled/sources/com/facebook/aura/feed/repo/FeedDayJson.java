package com.facebook.aura.feed.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class FeedDayJson extends C06G {
    public static final int $stable = 8;
    public final List<FeedEditionJson> editions;
    public final String local_date;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1W(C79.A01, null, FeedDayJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<FeedDayJson> serializer() {
            return FeedDayJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedDayJson) {
                FeedDayJson feedDayJson = (FeedDayJson) obj;
                if (!C7384Etj.areEqual(this.local_date, feedDayJson.local_date) || !C7384Etj.areEqual(this.editions, feedDayJson.editions)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FeedDayJson copy$default(FeedDayJson feedDayJson, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedDayJson.local_date;
        }
        if ((i & 2) != 0) {
            list = feedDayJson.editions;
        }
        AnonymousClass003.A0u(str, list);
        return new FeedDayJson(str, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_feed_repo_repo(FeedDayJson feedDayJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(feedDayJson.local_date)) {
            c9j5.AAV(feedDayJson.local_date, c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(feedDayJson.editions)) {
            c9j5.AAQ(feedDayJson.editions, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
    }

    public final String component1() {
        return this.local_date;
    }

    public final List<FeedEditionJson> component2() {
        return this.editions;
    }

    public final List<FeedEditionJson> getEditions() {
        return this.editions;
    }

    public final String getLocal_date() {
        return this.local_date;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.editions, AnonymousClass001.A0G(this.local_date));
    }

    public FeedDayJson(String str, List<FeedEditionJson> list) {
        AnonymousClass003.A0u(str, list);
        this.local_date = str;
        this.editions = list;
    }

    public final FeedDayJson copy(String str, List<FeedEditionJson> list) {
        AnonymousClass003.A0u(str, list);
        return new FeedDayJson(str, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FeedDayJson(int i, String str, List list, C2hx c2hx) {
        this.local_date = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.editions = C0881AGi.A00;
        } else {
            this.editions = list;
        }
    }

    public /* synthetic */ FeedDayJson(String str, List list, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), C3cI.A11(list, i));
    }

    public FeedDayJson() {
        this("", C0881AGi.A00);
    }
}
