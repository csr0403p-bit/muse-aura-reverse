package com.facebook.aura.explore.repo;

import X.AnonymousClass006;
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
public final class IdeaCardDetailResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final IdeaCardDetailJson card;

    public final class Companion {
        public final C9hr<IdeaCardDetailResponseJson> serializer() {
            return IdeaCardDetailResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_explore_repo_repo(IdeaCardDetailResponseJson ideaCardDetailResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || ideaCardDetailResponseJson.card != null) {
            c9j5.AAP(ideaCardDetailResponseJson.card, IdeaCardDetailJson$$serializer.INSTANCE, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof IdeaCardDetailResponseJson) && C7384Etj.areEqual(this.card, ((IdeaCardDetailResponseJson) obj).card));
    }

    public /* synthetic */ IdeaCardDetailResponseJson(IdeaCardDetailJson ideaCardDetailJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : ideaCardDetailJson);
    }

    public static /* synthetic */ IdeaCardDetailResponseJson copy$default(IdeaCardDetailResponseJson ideaCardDetailResponseJson, IdeaCardDetailJson ideaCardDetailJson, int i, Object obj) {
        if ((i & 1) != 0) {
            ideaCardDetailJson = ideaCardDetailResponseJson.card;
        }
        return new IdeaCardDetailResponseJson(ideaCardDetailJson);
    }

    public final IdeaCardDetailJson component1() {
        return this.card;
    }

    public final IdeaCardDetailResponseJson copy(IdeaCardDetailJson ideaCardDetailJson) {
        return new IdeaCardDetailResponseJson(ideaCardDetailJson);
    }

    public final IdeaCardDetailJson getCard() {
        return this.card;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.card);
    }

    public final IdeaCardDetail toDomain() {
        IdeaCardDetailJson ideaCardDetailJson = this.card;
        if (ideaCardDetailJson != null) {
            return ideaCardDetailJson.toDomain();
        }
        return null;
    }

    public String toString() {
        return super.toString();
    }

    public IdeaCardDetailResponseJson(IdeaCardDetailJson ideaCardDetailJson) {
        this.card = ideaCardDetailJson;
    }

    public /* synthetic */ IdeaCardDetailResponseJson(int i, IdeaCardDetailJson ideaCardDetailJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.card = null;
        } else {
            this.card = ideaCardDetailJson;
        }
    }

    public IdeaCardDetailResponseJson() {
        this(null);
    }
}
