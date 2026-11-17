package com.facebook.aura.feed.repo;

import X.AGI;
import X.AHD;
import X.AbstractC0882AGj;
import X.AbstractC0885AGm;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
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
import X.F60;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class FeedPageJson extends C06G {
    public static final int $stable = 8;
    public final List<FeedDayJson> days;
    public final FeedPaginationJson pagination;
    public final String prompt_id;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cH.A1U(C79.A01, FeedPageJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<FeedPageJson> serializer() {
            return FeedPageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public FeedPageJson(String str, List<FeedDayJson> list, FeedPaginationJson feedPaginationJson) {
        C7384Etj.A0Y(list, 1);
        this.prompt_id = str;
        this.days = list;
        this.pagination = feedPaginationJson;
    }

    public final FeedPageJson copy(String str, List<FeedDayJson> list, FeedPaginationJson feedPaginationJson) {
        C7384Etj.A0Y(list, 1);
        return new FeedPageJson(str, list, feedPaginationJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedPageJson) {
                FeedPageJson feedPageJson = (FeedPageJson) obj;
                if (!C7384Etj.areEqual(this.prompt_id, feedPageJson.prompt_id) || !C7384Etj.areEqual(this.days, feedPageJson.days) || !C7384Etj.areEqual(this.pagination, feedPageJson.pagination)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeedPageJson copy$default(FeedPageJson feedPageJson, String str, List list, FeedPaginationJson feedPaginationJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedPageJson.prompt_id;
        }
        if ((i & 2) != 0) {
            list = feedPageJson.days;
        }
        if ((i & 4) != 0) {
            feedPaginationJson = feedPageJson.pagination;
        }
        return feedPageJson.copy(str, list, feedPaginationJson);
    }

    private final AHD<FeedUnit> units() {
        List<FeedDayJson> list = this.days;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<FeedDayJson> it = list.iterator();
        while (it.hasNext()) {
            List<FeedEditionJson> list2 = it.next().editions;
            ArrayList arrayListA0h2 = C3cG.A0h();
            for (FeedEditionJson feedEditionJson : list2) {
                List<FeedUnitJson> list3 = feedEditionJson.units;
                ArrayList arrayListA0i = AnonymousClass003.A0i(list3);
                int i = 0;
                for (FeedUnitJson feedUnitJson : list3) {
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC0885AGm.A14();
                        throw F60.createAndThrow();
                    }
                    FeedUnitJson feedUnitJson2 = feedUnitJson;
                    String str = feedEditionJson.title;
                    long j = feedEditionJson.generated_at_ms;
                    Long lValueOf = Long.valueOf(j);
                    if (j <= 0) {
                        lValueOf = null;
                    }
                    arrayListA0i.add(feedUnitJson2.toDomain(str, lValueOf, AnonymousClass002.A1M(i)));
                    i = i2;
                }
                AbstractC0882AGj.A0r(arrayListA0i, arrayListA0h2);
            }
            AbstractC0882AGj.A0r(arrayListA0h2, arrayListA0h);
        }
        return AGI.A07(arrayListA0h);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_feed_repo_repo(FeedPageJson feedPageJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || feedPageJson.prompt_id != null) {
            c9j5.AAP(feedPageJson.prompt_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(feedPageJson.days)) {
            c9j5.AAQ(feedPageJson.days, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || feedPageJson.pagination != null) {
            c9j5.AAP(feedPageJson.pagination, FeedPaginationJson$$serializer.INSTANCE, c9iZ, 2);
        }
    }

    public final String component1() {
        return this.prompt_id;
    }

    public final List<FeedDayJson> component2() {
        return this.days;
    }

    public final FeedPaginationJson component3() {
        return this.pagination;
    }

    public final List<FeedDayJson> getDays() {
        return this.days;
    }

    public final FeedPaginationJson getPagination() {
        return this.pagination;
    }

    public final String getPrompt_id() {
        return this.prompt_id;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.days, AnonymousClass006.A0G(this.prompt_id) * 31) + C3cH.A02(this.pagination);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d A[PHI: r2
  0x001d: PHI (r2v2 java.lang.String) = (r2v0 java.lang.String), (r2v3 java.lang.String) binds: [B:20:0x002f, B:11:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.feed.repo.FeedCursorPage toCursorDomain() {
        /*
            r6 = this;
            java.lang.String r5 = r6.prompt_id
            r4 = 0
            if (r5 == 0) goto L32
            int r0 = r5.length()
            if (r0 <= 0) goto L32
        Lb:
            X.AHD r3 = r6.units()
            com.facebook.aura.feed.repo.FeedPaginationJson r1 = r6.pagination
            if (r1 == 0) goto L2e
            java.lang.String r2 = r1.next_cursor
            if (r2 == 0) goto L2e
            int r0 = r2.length()
            if (r0 <= 0) goto L2e
        L1d:
            java.lang.String r1 = r1.prev_cursor
            if (r1 == 0) goto L28
            int r0 = r1.length()
            if (r0 <= 0) goto L28
            r4 = r1
        L28:
            com.facebook.aura.feed.repo.FeedCursorPage r0 = new com.facebook.aura.feed.repo.FeedCursorPage
            r0.<init>(r5, r3, r2, r4)
            return r0
        L2e:
            r2 = r4
            if (r1 == 0) goto L28
            goto L1d
        L32:
            r5 = r4
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.repo.FeedPageJson.toCursorDomain():com.facebook.aura.feed.repo.FeedCursorPage");
    }

    public final FeedPage toDomain() {
        String str = this.prompt_id;
        if (str == null || str.length() <= 0) {
            str = null;
        }
        return new FeedPage(str, units());
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FeedPageJson(int i, String str, List list, FeedPaginationJson feedPaginationJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.prompt_id = null;
        } else {
            this.prompt_id = str;
        }
        if ((i & 2) == 0) {
            this.days = C0881AGi.A00;
        } else {
            this.days = list;
        }
        if ((i & 4) == 0) {
            this.pagination = null;
        } else {
            this.pagination = feedPaginationJson;
        }
    }

    public /* synthetic */ FeedPageJson(String str, List list, FeedPaginationJson feedPaginationJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, C3cI.A11(list, i), (i & 4) != 0 ? null : feedPaginationJson);
    }

    public FeedPageJson() {
        this(null, C0881AGi.A00, null);
    }
}
