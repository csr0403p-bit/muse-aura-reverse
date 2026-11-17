package com.facebook.aura.library.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ArtifactItemRemovedJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String item_key;
    public final String source;

    public final class Companion {
        public final C9hr<ArtifactItemRemovedJson> serializer() {
            return ArtifactItemRemovedJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(ArtifactItemRemovedJson artifactItemRemovedJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(artifactItemRemovedJson.source)) {
            c9j5.AAV(artifactItemRemovedJson.source, c9iZ, 0);
        }
        if (zAfR || !"".equals(artifactItemRemovedJson.item_key)) {
            c9j5.AAV(artifactItemRemovedJson.item_key, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ArtifactItemRemovedJson) {
                ArtifactItemRemovedJson artifactItemRemovedJson = (ArtifactItemRemovedJson) obj;
                if (!C7384Etj.areEqual(this.source, artifactItemRemovedJson.source) || !C7384Etj.areEqual(this.item_key, artifactItemRemovedJson.item_key)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ArtifactItemRemovedJson copy$default(ArtifactItemRemovedJson artifactItemRemovedJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = artifactItemRemovedJson.source;
        }
        if ((i & 2) != 0) {
            str2 = artifactItemRemovedJson.item_key;
        }
        AnonymousClass003.A0u(str, str2);
        return new ArtifactItemRemovedJson(str, str2);
    }

    public final String component1() {
        return this.source;
    }

    public final String component2() {
        return this.item_key;
    }

    public final String getItem_key() {
        return this.item_key;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.item_key, AnonymousClass001.A0G(this.source));
    }

    public ArtifactItemRemovedJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.source = str;
        this.item_key = str2;
    }

    public final ArtifactItemRemovedJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new ArtifactItemRemovedJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ArtifactItemRemovedJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.source = "";
        } else {
            this.source = str;
        }
        if ((i & 2) == 0) {
            this.item_key = "";
        } else {
            this.item_key = str2;
        }
    }

    public /* synthetic */ ArtifactItemRemovedJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public ArtifactItemRemovedJson() {
        this("", "");
    }
}
