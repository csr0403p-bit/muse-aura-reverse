package com.facebook.aura.explore.repo;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class IdeaCardShareResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final IdeaCardDetailJson card;
    public final String shareUrl;
    public final String shareableIdeaId;

    public final class Companion {
        public final C9hr<IdeaCardShareResponseJson> serializer() {
            return IdeaCardShareResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public IdeaCardShareResponseJson(String str, String str2, IdeaCardDetailJson ideaCardDetailJson) {
        C7384Etj.A0Y(str, 0);
        this.shareableIdeaId = str;
        this.shareUrl = str2;
        this.card = ideaCardDetailJson;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_explore_repo_repo(IdeaCardShareResponseJson ideaCardShareResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(ideaCardShareResponseJson.shareableIdeaId)) {
            c9j5.AAV(ideaCardShareResponseJson.shareableIdeaId, c9iZ, 0);
        }
        if (zAfR || ideaCardShareResponseJson.shareUrl != null) {
            c9j5.AAP(ideaCardShareResponseJson.shareUrl, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || ideaCardShareResponseJson.card != null) {
            c9j5.AAP(ideaCardShareResponseJson.card, IdeaCardDetailJson$$serializer.INSTANCE, c9iZ, 2);
        }
    }

    public final IdeaCardShareResponseJson copy(String str, String str2, IdeaCardDetailJson ideaCardDetailJson) {
        C7384Etj.A0Y(str, 0);
        return new IdeaCardShareResponseJson(str, str2, ideaCardDetailJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdeaCardShareResponseJson) {
                IdeaCardShareResponseJson ideaCardShareResponseJson = (IdeaCardShareResponseJson) obj;
                if (!C7384Etj.areEqual(this.shareableIdeaId, ideaCardShareResponseJson.shareableIdeaId) || !C7384Etj.areEqual(this.shareUrl, ideaCardShareResponseJson.shareUrl) || !C7384Etj.areEqual(this.card, ideaCardShareResponseJson.card)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ IdeaCardShareResponseJson copy$default(IdeaCardShareResponseJson ideaCardShareResponseJson, String str, String str2, IdeaCardDetailJson ideaCardDetailJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ideaCardShareResponseJson.shareableIdeaId;
        }
        if ((i & 2) != 0) {
            str2 = ideaCardShareResponseJson.shareUrl;
        }
        if ((i & 4) != 0) {
            ideaCardDetailJson = ideaCardShareResponseJson.card;
        }
        return ideaCardShareResponseJson.copy(str, str2, ideaCardDetailJson);
    }

    public final String component1() {
        return this.shareableIdeaId;
    }

    public final String component2() {
        return this.shareUrl;
    }

    public final IdeaCardDetailJson component3() {
        return this.card;
    }

    public final IdeaCardDetailJson getCard() {
        return this.card;
    }

    public final String getShareUrl() {
        return this.shareUrl;
    }

    public final String getShareableIdeaId() {
        return this.shareableIdeaId;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.shareableIdeaId) + AnonymousClass006.A0G(this.shareUrl)) * 31) + C06G.A04(this.card);
    }

    public final IdeaCardShareResult toDomain() {
        if (C7BY.A0j(this.shareableIdeaId)) {
            throw new IllegalArgumentException("Missing idea share result");
        }
        IdeaCardDetailJson ideaCardDetailJson = this.card;
        if (ideaCardDetailJson == null) {
            throw new IllegalArgumentException("Missing idea share card");
        }
        IdeaCardDetail domain = ideaCardDetailJson.toDomain();
        if (C7BY.A0j(domain.title)) {
            throw new IllegalArgumentException("Missing idea share title");
        }
        String str = this.shareableIdeaId;
        String str2 = this.shareUrl;
        if (str2 == null) {
            str2 = "";
        }
        return new IdeaCardShareResult(str, str2, domain.title, domain.summary, domain.iconUrl, domain.iconMimeType);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ IdeaCardShareResponseJson(String str, String str2, IdeaCardDetailJson ideaCardDetailJson, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : ideaCardDetailJson);
    }

    public /* synthetic */ IdeaCardShareResponseJson(int i, String str, String str2, IdeaCardDetailJson ideaCardDetailJson, C2hx c2hx) {
        this.shareableIdeaId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.shareUrl = null;
        } else {
            this.shareUrl = str2;
        }
        if ((i & 4) == 0) {
            this.card = null;
        } else {
            this.card = ideaCardDetailJson;
        }
    }

    public IdeaCardShareResponseJson() {
        this("", null, null);
    }
}
