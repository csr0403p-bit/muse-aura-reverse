package com.facebook.aura.explore.repo;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class IdeaCardsViewerStateJson extends C06G {
    public static final Companion Companion = new Companion();
    public final boolean hasBuiltIdea;

    public final class Companion {
        public final C9hr<IdeaCardsViewerStateJson> serializer() {
            return IdeaCardsViewerStateJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_explore_repo_repo(IdeaCardsViewerStateJson ideaCardsViewerStateJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || ideaCardsViewerStateJson.hasBuiltIdea) {
            c9j5.AA7(c9iZ, 0, ideaCardsViewerStateJson.hasBuiltIdea);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof IdeaCardsViewerStateJson) && this.hasBuiltIdea == ((IdeaCardsViewerStateJson) obj).hasBuiltIdea);
    }

    public static /* synthetic */ IdeaCardsViewerStateJson copy$default(IdeaCardsViewerStateJson ideaCardsViewerStateJson, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = ideaCardsViewerStateJson.hasBuiltIdea;
        }
        return new IdeaCardsViewerStateJson(z);
    }

    public final boolean component1() {
        return this.hasBuiltIdea;
    }

    public final IdeaCardsViewerStateJson copy(boolean z) {
        return new IdeaCardsViewerStateJson(z);
    }

    public final boolean getHasBuiltIdea() {
        return this.hasBuiltIdea;
    }

    public int hashCode() {
        return this.hasBuiltIdea ? 1231 : 1237;
    }

    public /* synthetic */ IdeaCardsViewerStateJson(int i, boolean z, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.hasBuiltIdea = false;
        } else {
            this.hasBuiltIdea = z;
        }
    }

    public String toString() {
        return super.toString();
    }

    public IdeaCardsViewerStateJson(boolean z) {
        this.hasBuiltIdea = z;
    }

    public /* synthetic */ IdeaCardsViewerStateJson(boolean z, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z));
    }

    public IdeaCardsViewerStateJson() {
        this(false);
    }
}
