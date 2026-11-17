package com.facebook.aura.feed.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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
public final class FeedEditionJson extends C06G {
    public static final int $stable = 8;
    public final long generated_at_ms;
    public final String kind;
    public final String run_id;
    public final String title;
    public final List<FeedUnitJson> units;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, AbstractC5321DgF.A02(C79.A01, FeedEditionJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<FeedEditionJson> serializer() {
            return FeedEditionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedEditionJson) {
                FeedEditionJson feedEditionJson = (FeedEditionJson) obj;
                if (!C7384Etj.areEqual(this.kind, feedEditionJson.kind) || !C7384Etj.areEqual(this.title, feedEditionJson.title) || this.generated_at_ms != feedEditionJson.generated_at_ms || !C7384Etj.areEqual(this.run_id, feedEditionJson.run_id) || !C7384Etj.areEqual(this.units, feedEditionJson.units)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeedEditionJson copy$default(FeedEditionJson feedEditionJson, String str, String str2, long j, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedEditionJson.kind;
        }
        if ((i & 2) != 0) {
            str2 = feedEditionJson.title;
        }
        if ((i & 4) != 0) {
            j = feedEditionJson.generated_at_ms;
        }
        if ((i & 8) != 0) {
            str3 = feedEditionJson.run_id;
        }
        if ((i & 16) != 0) {
            list = feedEditionJson.units;
        }
        return feedEditionJson.copy(str, str2, j, str3, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_feed_repo_repo(FeedEditionJson feedEditionJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(feedEditionJson.kind)) {
            c9j5.AAV(feedEditionJson.kind, c9iZ, 0);
        }
        if (zAfR || !"".equals(feedEditionJson.title)) {
            c9j5.AAV(feedEditionJson.title, c9iZ, 1);
        }
        if (zAfR || feedEditionJson.generated_at_ms != 0) {
            c9j5.AAN(c9iZ, 2, feedEditionJson.generated_at_ms);
        }
        if (zAfR || !"".equals(feedEditionJson.run_id)) {
            c9j5.AAV(feedEditionJson.run_id, c9iZ, 3);
        }
        if (zAfR || !C3cG.A1L(feedEditionJson.units)) {
            c9j5.AAQ(feedEditionJson.units, C3cH.A15(f0cArr, 4), c9iZ, 4);
        }
    }

    public final String component1() {
        return this.kind;
    }

    public final String component2() {
        return this.title;
    }

    public final long component3() {
        return this.generated_at_ms;
    }

    public final String component4() {
        return this.run_id;
    }

    public final List<FeedUnitJson> component5() {
        return this.units;
    }

    public final long getGenerated_at_ms() {
        return this.generated_at_ms;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getRun_id() {
        return this.run_id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<FeedUnitJson> getUnits() {
        return this.units;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.units, AnonymousClass005.A0I(this.run_id, AnonymousClass006.A05(this.generated_at_ms, AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.kind))) * 31));
    }

    public FeedEditionJson(String str, String str2, long j, String str3, List<FeedUnitJson> list) {
        AnonymousClass005.A0y(str, str2, str3);
        C7384Etj.A0Y(list, 4);
        this.kind = str;
        this.title = str2;
        this.generated_at_ms = j;
        this.run_id = str3;
        this.units = list;
    }

    public final FeedEditionJson copy(String str, String str2, long j, String str3, List<FeedUnitJson> list) {
        AnonymousClass005.A0y(str, str2, str3);
        C7384Etj.A0Y(list, 4);
        return new FeedEditionJson(str, str2, j, str3, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FeedEditionJson(String str, String str2, long j, String str3, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? C0881AGi.A00 : list);
    }

    public /* synthetic */ FeedEditionJson(int i, String str, String str2, long j, String str3, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.kind = "";
        } else {
            this.kind = str;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.generated_at_ms = 0L;
        } else {
            this.generated_at_ms = j;
        }
        if ((i & 8) == 0) {
            this.run_id = "";
        } else {
            this.run_id = str3;
        }
        if ((i & 16) == 0) {
            this.units = C0881AGi.A00;
        } else {
            this.units = list;
        }
    }

    public FeedEditionJson() {
        this("", "", 0L, "", C0881AGi.A00);
    }
}
