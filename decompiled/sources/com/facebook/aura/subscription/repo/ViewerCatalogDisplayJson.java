package com.facebook.aura.subscription.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
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
public final class ViewerCatalogDisplayJson extends C06G {
    public static final int $stable = 8;
    public final List<String> highlights;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, ViewerCatalogDisplayJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<ViewerCatalogDisplayJson> serializer() {
            return ViewerCatalogDisplayJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ViewerCatalogDisplayJson) && C7384Etj.areEqual(this.highlights, ((ViewerCatalogDisplayJson) obj).highlights));
    }

    public static /* synthetic */ ViewerCatalogDisplayJson copy$default(ViewerCatalogDisplayJson viewerCatalogDisplayJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = viewerCatalogDisplayJson.highlights;
        }
        return new ViewerCatalogDisplayJson(list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(ViewerCatalogDisplayJson viewerCatalogDisplayJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || viewerCatalogDisplayJson.highlights != null) {
            c9j5.AAP(viewerCatalogDisplayJson.highlights, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
    }

    public final List<String> component1() {
        return this.highlights;
    }

    public final ViewerCatalogDisplayJson copy(List<String> list) {
        return new ViewerCatalogDisplayJson(list);
    }

    public final List<String> getHighlights() {
        return this.highlights;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.highlights);
    }

    public /* synthetic */ ViewerCatalogDisplayJson(int i, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.highlights = null;
        } else {
            this.highlights = list;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ViewerCatalogDisplayJson(List<String> list) {
        this.highlights = list;
    }

    public /* synthetic */ ViewerCatalogDisplayJson(List list, int i, C06H c06h) {
        this((i & 1) != 0 ? null : list);
    }

    public ViewerCatalogDisplayJson() {
        this(null);
    }
}
