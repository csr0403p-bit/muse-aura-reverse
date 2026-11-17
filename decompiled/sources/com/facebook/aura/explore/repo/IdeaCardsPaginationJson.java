package com.facebook.aura.explore.repo;

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
/* loaded from: classes2.dex */
public final class IdeaCardsPaginationJson extends C06G {
    public static final Companion Companion = new Companion();
    public final boolean hasNextPage;
    public final String nextCursor;

    public final class Companion {
        public final C9hr<IdeaCardsPaginationJson> serializer() {
            return IdeaCardsPaginationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_explore_repo_repo(IdeaCardsPaginationJson ideaCardsPaginationJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || ideaCardsPaginationJson.nextCursor != null) {
            c9j5.AAP(ideaCardsPaginationJson.nextCursor, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || ideaCardsPaginationJson.hasNextPage) {
            c9j5.AA7(c9iZ, 1, ideaCardsPaginationJson.hasNextPage);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdeaCardsPaginationJson) {
                IdeaCardsPaginationJson ideaCardsPaginationJson = (IdeaCardsPaginationJson) obj;
                if (!C7384Etj.areEqual(this.nextCursor, ideaCardsPaginationJson.nextCursor) || this.hasNextPage != ideaCardsPaginationJson.hasNextPage) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ IdeaCardsPaginationJson copy$default(IdeaCardsPaginationJson ideaCardsPaginationJson, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ideaCardsPaginationJson.nextCursor;
        }
        if ((i & 2) != 0) {
            z = ideaCardsPaginationJson.hasNextPage;
        }
        return new IdeaCardsPaginationJson(str, z);
    }

    public final String component1() {
        return this.nextCursor;
    }

    public final boolean component2() {
        return this.hasNextPage;
    }

    public final IdeaCardsPaginationJson copy(String str, boolean z) {
        return new IdeaCardsPaginationJson(str, z);
    }

    public final boolean getHasNextPage() {
        return this.hasNextPage;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass006.A0G(this.nextCursor) * 31, this.hasNextPage);
    }

    public IdeaCardsPaginationJson(String str, boolean z) {
        this.nextCursor = str;
        this.hasNextPage = z;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ IdeaCardsPaginationJson(int i, String str, boolean z, C2hx c2hx) {
        this.nextCursor = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.hasNextPage = false;
        } else {
            this.hasNextPage = z;
        }
    }

    public /* synthetic */ IdeaCardsPaginationJson(String str, boolean z, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str), AnonymousClass001.A1Q(i, z));
    }

    public IdeaCardsPaginationJson() {
        this(null, false);
    }
}
