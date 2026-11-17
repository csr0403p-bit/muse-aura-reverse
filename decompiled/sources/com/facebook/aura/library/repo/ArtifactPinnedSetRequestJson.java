package com.facebook.aura.library.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07799it;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ArtifactPinnedSetRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String item_key;
    public final Double pinned_order;
    public final String source;

    public final class Companion {
        public final C9hr<ArtifactPinnedSetRequestJson> serializer() {
            return ArtifactPinnedSetRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(ArtifactPinnedSetRequestJson artifactPinnedSetRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(artifactPinnedSetRequestJson.source, c9iZ, 0);
        c9j5.AAV(artifactPinnedSetRequestJson.item_key, c9iZ, 1);
        if (c9j5.AfR() || artifactPinnedSetRequestJson.pinned_order != null) {
            c9j5.AAP(artifactPinnedSetRequestJson.pinned_order, C07799it.A00, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ArtifactPinnedSetRequestJson) {
                ArtifactPinnedSetRequestJson artifactPinnedSetRequestJson = (ArtifactPinnedSetRequestJson) obj;
                if (!C7384Etj.areEqual(this.source, artifactPinnedSetRequestJson.source) || !C7384Etj.areEqual(this.item_key, artifactPinnedSetRequestJson.item_key) || !C7384Etj.areEqual(this.pinned_order, artifactPinnedSetRequestJson.pinned_order)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ArtifactPinnedSetRequestJson copy$default(ArtifactPinnedSetRequestJson artifactPinnedSetRequestJson, String str, String str2, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = artifactPinnedSetRequestJson.source;
        }
        if ((i & 2) != 0) {
            str2 = artifactPinnedSetRequestJson.item_key;
        }
        if ((i & 4) != 0) {
            d = artifactPinnedSetRequestJson.pinned_order;
        }
        return artifactPinnedSetRequestJson.copy(str, str2, d);
    }

    public final String component1() {
        return this.source;
    }

    public final String component2() {
        return this.item_key;
    }

    public final Double component3() {
        return this.pinned_order;
    }

    public final String getItem_key() {
        return this.item_key;
    }

    public final Double getPinned_order() {
        return this.pinned_order;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.item_key, AnonymousClass001.A0G(this.source)) + AnonymousClass006.A0D(this.pinned_order);
    }

    public ArtifactPinnedSetRequestJson(String str, String str2, Double d) {
        AnonymousClass003.A0u(str, str2);
        this.source = str;
        this.item_key = str2;
        this.pinned_order = d;
    }

    public final ArtifactPinnedSetRequestJson copy(String str, String str2, Double d) {
        AnonymousClass003.A0u(str, str2);
        return new ArtifactPinnedSetRequestJson(str, str2, d);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ArtifactPinnedSetRequestJson(int i, String str, String str2, Double d, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(ArtifactPinnedSetRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.source = str;
        this.item_key = str2;
        this.pinned_order = (i & 4) == 0 ? null : d;
    }

    public /* synthetic */ ArtifactPinnedSetRequestJson(String str, String str2, Double d, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : d);
    }
}
