package com.facebook.aura.onboarding;

import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import java.util.Map;

/* loaded from: classes3.dex */
public final class PublicAssetFetchResult extends C06G {
    public final boolean succeeded;
    public final Map<String, String> urls;

    public PublicAssetFetchResult(Map<String, String> map, boolean z) {
        C7384Etj.A0Y(map, 0);
        this.urls = map;
        this.succeeded = z;
    }

    public final PublicAssetFetchResult copy(Map<String, String> map, boolean z) {
        C7384Etj.A0Y(map, 0);
        return new PublicAssetFetchResult(map, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PublicAssetFetchResult) {
                PublicAssetFetchResult publicAssetFetchResult = (PublicAssetFetchResult) obj;
                if (!C7384Etj.areEqual(this.urls, publicAssetFetchResult.urls) || this.succeeded != publicAssetFetchResult.succeeded) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PublicAssetFetchResult copy$default(PublicAssetFetchResult publicAssetFetchResult, Map map, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            map = publicAssetFetchResult.urls;
        }
        if ((i & 2) != 0) {
            z = publicAssetFetchResult.succeeded;
        }
        C7384Etj.A0Y(map, 0);
        return new PublicAssetFetchResult(map, z);
    }

    public final Map<String, String> component1() {
        return this.urls;
    }

    public final boolean component2() {
        return this.succeeded;
    }

    public final boolean getSucceeded() {
        return this.succeeded;
    }

    public final Map<String, String> getUrls() {
        return this.urls;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0E(this.urls), this.succeeded);
    }

    public String toString() {
        return super.toString();
    }
}
