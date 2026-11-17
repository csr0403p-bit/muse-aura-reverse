package com.facebook.aura.localbrowser;

import X.AGH;
import X.AIW;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFI;
import X.C06827l3;
import X.C3cH;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.facebook.aura.browsertask.control.BrowserTaskStopKt;
import com.facebook.aura.settings.HatchDataExportRepositoryKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class LocalBrowserBlockSignals {
    public static final int $stable = 0;
    public static final LocalBrowserBlockSignals INSTANCE = new LocalBrowserBlockSignals();
    public static final Set<Integer> BLOCK_STATUSES = BFI.A0H(new Integer[]{403, 429, Integer.valueOf(BrowserTaskStopKt.HTTP_SERVICE_UNAVAILABLE)});

    public static final boolean vendor$cookie(String str, String str2) {
        C7384Etj.A0Y(str2, 0);
        String strQuote = Pattern.quote(str2);
        C7384Etj.A0U(strQuote);
        return C06827l3.A02(FGI.A0M("(^|[\\s,;])", strQuote)).A07(str);
    }

    private final String vendor(Map<String, String> map, String str) {
        String strA0p;
        if (vendor$cookie(str, "datadome=") || map.containsKey("x-dd-b") || map.containsKey("x-datadome")) {
            return "datadome";
        }
        if (vendor$cookie(str, "_px")) {
            return "perimeterx";
        }
        Set<String> setKeySet = map.keySet();
        if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
            Iterator<String> it = setKeySet.iterator();
            while (it.hasNext()) {
                if (C60O.A1X(AnonymousClass005.A0j(it), "x-px-")) {
                    return "perimeterx";
                }
            }
        }
        if (vendor$cookie(str, "incap_ses_") || vendor$cookie(str, "visid_incap_") || map.containsKey("x-iinfo")) {
            return "imperva";
        }
        if (vendor$cookie(str, "_abck=") || vendor$cookie(str, "bm_sz=") || map.containsKey("akamai-grn") || ((strA0p = C60O.A0p(HatchDataExportRepositoryKt.FAILURE_SERVER, map)) != null && C7BY.A0q(strA0p, "AkamaiGHost", true))) {
            return "akamai";
        }
        if (map.containsKey("cf-ray") || map.containsKey("cf-mitigated") || vendor$cookie(str, "__cf_bm=") || vendor$cookie(str, "cf_clearance=")) {
            return "cloudflare";
        }
        return null;
    }

    public final LocalBrowserBlockSignal detect(Uri uri, WebResourceResponse webResourceResponse) {
        String host;
        AnonymousClass003.A0u(uri, webResourceResponse);
        if (!C60Q.A1W(BLOCK_STATUSES, webResourceResponse.getStatusCode()) || (host = uri.getHost()) == null) {
            return null;
        }
        Locale locale = Locale.ROOT;
        String strA0K = C7BY.A0K("www.", host.toLowerCase(locale));
        if (strA0K == null || strA0K.length() <= 0) {
            return null;
        }
        Map<String, String> responseHeaders = webResourceResponse.getResponseHeaders();
        if (responseHeaders == null) {
            responseHeaders = AGH.A0E();
        }
        LinkedHashMap linkedHashMapA15 = C60O.A15(AIW.A0H(responseHeaders.size()));
        Iterator itA0n = AnonymousClass002.A0n(responseHeaders);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            Object key = entryA0l.getKey();
            C7384Etj.A0U(key);
            linkedHashMapA15.put(((String) key).toLowerCase(locale), entryA0l.getValue());
        }
        String str = (String) linkedHashMapA15.get("set-cookie");
        if (str == null) {
            str = "";
        }
        String strVendor = vendor(linkedHashMapA15, str);
        if (strVendor != null) {
            return new LocalBrowserBlockSignal(strA0K, strVendor, webResourceResponse.getStatusCode());
        }
        return null;
    }
}
