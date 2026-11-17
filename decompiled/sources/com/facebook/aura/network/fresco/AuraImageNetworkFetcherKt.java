package com.facebook.aura.network.fresco;

import X.AbstractC2159Azp;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BFI;
import X.C7384Etj;
import X.C7BY;
import android.net.Uri;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import com.facebook.aura.network.api.HatchUrlSegments;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class AuraImageNetworkFetcherKt {
    public static final Set<String> RAW_FALLBACK_IMAGE_EXTENSIONS = BFI.A0H(new String[]{"png", "jpg", "jpeg", "gif", "webp", "heic"});
    public static final String TAG = "AuraImageNetworkFetcher";

    public static final Uri httpsUpgrade(Uri uri) {
        C7384Etj.A0Y(uri, 0);
        Uri.Builder builderScheme = uri.buildUpon().scheme("https");
        if (uri.getPort() == 80) {
            String encodedAuthority = uri.getEncodedAuthority();
            builderScheme.encodedAuthority(encodedAuthority != null ? C7BY.A0L(":80", encodedAuthority) : null);
        }
        Uri uriBuild = builderScheme.build();
        C7384Etj.A0U(uriBuild);
        return uriBuild;
    }

    public static final boolean isCleartextUri(Uri uri) {
        C7384Etj.A0Y(uri, 0);
        return AuraDeeplinkHandlerActivity.HTTP.equalsIgnoreCase(uri.getScheme());
    }

    public static final boolean isImageUri(Uri uri) {
        C7384Etj.A0Y(uri, 0);
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        return RAW_FALLBACK_IMAGE_EXTENSIONS.contains(AnonymousClass001.A0u(C7BY.A0R(C7BY.A0R(path, path, '/'), "", '.')));
    }

    public static final boolean isThumbnailUri(Uri uri) {
        C7384Etj.A0Y(uri, 0);
        String path = uri.getPath();
        return path != null && C7BY.A0q(path, HatchUrlSegments.FS_THUMBNAIL_SEGMENT, false);
    }

    public static final Uri rawUriFor(Uri uri) {
        C7384Etj.A0Y(uri, 0);
        String path = uri.getPath();
        if (path == null || !C7BY.A0q(path, HatchUrlSegments.FS_THUMBNAIL_SEGMENT, false)) {
            return null;
        }
        Uri.Builder builderClearQuery = uri.buildUpon().path(AbstractC2159Azp.A0z(path, HatchUrlSegments.FS_THUMBNAIL_SEGMENT, AnonymousClass000.A00(20))).clearQuery();
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            if (!HatchUrlSegments.THUMBNAIL_SIZE_PARAM.equals(strA0j)) {
                Iterator<String> it2 = uri.getQueryParameters(strA0j).iterator();
                while (it2.hasNext()) {
                    builderClearQuery.appendQueryParameter(strA0j, AnonymousClass005.A0j(it2));
                }
            }
        }
        return builderClearQuery.build();
    }
}
