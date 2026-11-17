package com.facebook.aura.opengraph;

import X.AnonymousClass005;
import X.C7384Etj;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class HatchWebPageMetadataKt {
    public static final int approximateSizeChars(HatchWebPageMetadata hatchWebPageMetadata) {
        C7384Etj.A0Y(hatchWebPageMetadata, 0);
        String str = hatchWebPageMetadata.title;
        int length = 0;
        int length2 = str != null ? str.length() : 0;
        String str2 = hatchWebPageMetadata.description;
        int length3 = length2 + (str2 != null ? str2.length() : 0);
        String str3 = hatchWebPageMetadata.siteName;
        int length4 = length3 + (str3 != null ? str3.length() : 0);
        String str4 = hatchWebPageMetadata.canonicalUrl;
        int length5 = length4 + (str4 != null ? str4.length() : 0);
        String str5 = hatchWebPageMetadata.faviconUrl;
        int length6 = length5 + (str5 != null ? str5.length() : 0);
        Iterator it = hatchWebPageMetadata.imageCandidates.iterator();
        while (it.hasNext()) {
            length += AnonymousClass005.A0j(it).length();
        }
        return length6 + length;
    }
}
