package com.facebook.aura.shopping.model;

import X.AbstractC0878AGe;
import X.C06827l3;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import android.net.Uri;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class ShoppingMerchantKt {
    public static final List<String> StrippedHostPrefixes = Arrays.asList("www.", "m.");
    public static final C06827l3 ShoppingDomainRegex = C06827l3.A02("^[a-z0-9-]+(\\.[a-z0-9-]+)+$");

    public static final String domainOf(Uri uri) {
        String strA0Z;
        String next;
        String strA0K;
        String host = uri.getHost();
        if (host != null && (strA0Z = C7BY.A0Z(C60Q.A0j(host), '.')) != null) {
            Iterator<String> it = StrippedHostPrefixes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String str = next;
                C7384Etj.A0Y(str, 1);
                if (strA0Z.startsWith(str)) {
                    break;
                }
            }
            String str2 = next;
            if (str2 != null && (strA0K = C7BY.A0K(str2, strA0Z)) != null) {
                strA0Z = strA0K;
            }
            if (ShoppingDomainRegex.A08(strA0Z)) {
                return strA0Z;
            }
        }
        return null;
    }

    public static final Uri parseWebUri(String str) {
        Uri uri;
        String strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(str);
        if (strTrimToNonEmpty != null && (uri = Uri.parse(strTrimToNonEmpty)) != null) {
            Set setA19 = C60O.A19(AuraDeeplinkHandlerActivity.HTTP, "https");
            String scheme = uri.getScheme();
            if (AbstractC0878AGe.A0k(setA19, scheme != null ? C60Q.A0j(scheme) : null)) {
                return uri;
            }
        }
        return null;
    }

    public static final String shoppingDomainOf(String str) {
        Uri webUri = parseWebUri(str);
        if (webUri != null) {
            return domainOf(webUri);
        }
        return null;
    }

    public static final String shoppingProductUrlOf(String str) {
        String strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(str);
        if (strTrimToNonEmpty == null || parseWebUri(strTrimToNonEmpty) == null) {
            return null;
        }
        return strTrimToNonEmpty;
    }
}
