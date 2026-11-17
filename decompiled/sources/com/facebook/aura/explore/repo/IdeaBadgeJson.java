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
/* loaded from: classes4.dex */
public final class IdeaBadgeJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String text;

    public final class Companion {
        public final C9hr<IdeaBadgeJson> serializer() {
            return IdeaBadgeJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_explore_repo_repo(IdeaBadgeJson ideaBadgeJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(ideaBadgeJson.text)) {
            c9j5.AAV(ideaBadgeJson.text, c9iZ, 0);
        }
    }

    public final IdeaBadgeJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new IdeaBadgeJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof IdeaBadgeJson) && C7384Etj.areEqual(this.text, ((IdeaBadgeJson) obj).text));
    }

    public static /* synthetic */ IdeaBadgeJson copy$default(IdeaBadgeJson ideaBadgeJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ideaBadgeJson.text;
        }
        C7384Etj.A0Y(str, 0);
        return new IdeaBadgeJson(str);
    }

    public final String component1() {
        return this.text;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode();
    }

    public /* synthetic */ IdeaBadgeJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.text = "";
        } else {
            this.text = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public IdeaBadgeJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.text = str;
    }

    public /* synthetic */ IdeaBadgeJson(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public IdeaBadgeJson() {
        this("");
    }
}
