package com.facebook.aura.network.api;

import X.AbstractC0878AGe;
import X.AbstractC2159Azp;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C06827l3;
import X.C06847l8;
import X.C06H;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class CloudflareImageUrl {
    public static final Companion Companion = new Companion();
    public static final C06827l3 hostPattern = C06827l3.A02("([a-z0-9]+(?:-[a-z0-9]+)*)(\\.managed)?\\.cf\\.metaaiusercontent\\.com");
    public final String hostLabel;
    public final boolean managed;
    public final String shareKey;
    public final String shortcode;
    public final Uri uri;

    public final class Companion {
        public final CloudflareImageUrl parse(Uri uri) {
            String strOnlyValue;
            String strOnlyValue2;
            C7384Etj.A0Y(uri, 0);
            if (C60Q.A1R(uri) && uri.getUserInfo() == null && C60R.A1T(uri, new Integer[]{-1, 443})) {
                C06827l3 c06827l3 = CloudflareImageUrl.hostPattern;
                String host = uri.getHost();
                if (host == null) {
                    host = "";
                }
                C06847l8 c06847l8A06 = c06827l3.A06(host);
                if (c06847l8A06 != null) {
                    String str = c06847l8A06.AG1().get(1);
                    boolean zA1N = AnonymousClass002.A1N(c06847l8A06.AG1().get(2).length());
                    if (C7BY.A0k(str, '-')) {
                        return new CloudflareImageUrl(uri, str, zA1N, null, str);
                    }
                    int length = str.length();
                    if (3 <= length && length < 27 && C06827l3.A02("(?:[0-9a-wyz]|x[0a-z])+").A08(str) && (strOnlyValue = onlyValue(uri, "hatch_share")) != null && (strOnlyValue2 = onlyValue(uri, "share_key")) != null && C06827l3.A02("[A-Za-z0-9-]{1,200}").A08(strOnlyValue) && strOnlyValue.endsWith(FGI.A0M("-", str)) && C06827l3.A02("[A-Za-z0-9_-]{43}").A08(strOnlyValue2)) {
                        return new CloudflareImageUrl(uri, strOnlyValue, zA1N, strOnlyValue2, str);
                    }
                }
            }
            return null;
        }

        private final String onlyValue(Uri uri, String str) {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            ArrayList arrayListA0s = C60Q.A0s(queryParameterNames);
            for (String str2 : queryParameterNames) {
                if (AbstractC2159Azp.A12(str2, str, true)) {
                    arrayListA0s.add(str2);
                }
            }
            if (!C7384Etj.areEqual(AbstractC0878AGe.A0K(arrayListA0s), str)) {
                return null;
            }
            List<String> queryParameters = uri.getQueryParameters(str);
            C7384Etj.A0U(queryParameters);
            return (String) AbstractC0878AGe.A0K(queryParameters);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final boolean getManaged() {
        return this.managed;
    }

    public final String getShareKey() {
        return this.shareKey;
    }

    public final String getShortcode() {
        return this.shortcode;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final Uri unsignedUri() {
        Uri.Builder builderFragment = this.uri.buildUpon().clearQuery().fragment(null);
        Iterator<String> it = this.uri.getQueryParameterNames().iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            if (!"viewer_assertion".equals(strA0j)) {
                Iterator<String> it2 = this.uri.getQueryParameters(strA0j).iterator();
                while (it2.hasNext()) {
                    builderFragment.appendQueryParameter(strA0j, AnonymousClass005.A0j(it2));
                }
            }
        }
        Uri uriBuild = builderFragment.build();
        C7384Etj.A0U(uriBuild);
        return uriBuild;
    }

    public final Uri managedUri() {
        Uri uriBuild = unsignedUri().buildUpon().authority(FGI.A0M(this.hostLabel, ".managed.cf.metaaiusercontent.com")).build();
        C7384Etj.A0U(uriBuild);
        return uriBuild;
    }

    public /* synthetic */ CloudflareImageUrl(Uri uri, String str, boolean z, String str2, String str3, C06H c06h) {
        this(uri, str, z, str2, str3);
    }

    public CloudflareImageUrl(Uri uri, String str, boolean z, String str2, String str3) {
        this.uri = uri;
        this.shortcode = str;
        this.managed = z;
        this.shareKey = str2;
        this.hostLabel = str3;
    }
}
