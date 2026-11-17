package com.facebook.aura.explore.repo;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class IdeaSectionPresentationJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String layout;

    public final class Companion {
        public final C9hr<IdeaSectionPresentationJson> serializer() {
            return IdeaSectionPresentationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_explore_repo_repo(IdeaSectionPresentationJson ideaSectionPresentationJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(ideaSectionPresentationJson.layout)) {
            c9j5.AAV(ideaSectionPresentationJson.layout, c9iZ, 0);
        }
    }

    public final IdeaSectionPresentationJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new IdeaSectionPresentationJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof IdeaSectionPresentationJson) && C7384Etj.areEqual(this.layout, ((IdeaSectionPresentationJson) obj).layout));
    }

    public static /* synthetic */ IdeaSectionPresentationJson copy$default(IdeaSectionPresentationJson ideaSectionPresentationJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ideaSectionPresentationJson.layout;
        }
        C7384Etj.A0Y(str, 0);
        return new IdeaSectionPresentationJson(str);
    }

    public final String component1() {
        return this.layout;
    }

    public final String getLayout() {
        return this.layout;
    }

    public int hashCode() {
        return this.layout.hashCode();
    }

    public /* synthetic */ IdeaSectionPresentationJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.layout = "";
        } else {
            this.layout = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public IdeaSectionPresentationJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.layout = str;
    }

    public /* synthetic */ IdeaSectionPresentationJson(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public IdeaSectionPresentationJson() {
        this("");
    }
}
