package com.facebook.aura.analytics.hatch;

import X.AbstractC06907md;
import X.BFI;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.CFK;
import X.DCl;
import X.F2V;
import X.FGI;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class HatchInstallReferrerParams {
    public static final int $stable = 0;
    public static final String APP_MANAGER_SENTINEL_PREFIX = "appmanager_";
    public static final String HAS_CUSTOM_DATA_PARAM = "has_custom_data";
    public static final HatchInstallReferrerParams INSTANCE = new HatchInstallReferrerParams();
    public static final String TAG = "HatchInstallReferrerParams";

    private final boolean isRealValue(String str) {
        return (str == null || str.length() <= 0 || str.startsWith(APP_MANAGER_SENTINEL_PREFIX)) ? false : true;
    }

    public final String decodedValue(String str, String str2) throws UnsupportedEncodingException {
        List listA0h;
        Object next;
        String strA0Q;
        C7384Etj.A0Y(str2, 1);
        String string = null;
        if (str != null && (listA0h = C7BY.A0h(str, new char[1], '&')) != null) {
            Iterator it = listA0h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String str3 = (String) next;
                if (str2.equals(C7BY.A0S(str3, str3, '='))) {
                    break;
                }
            }
            String str4 = (String) next;
            if (str4 != null && (strA0Q = C7BY.A0Q(str4, "", '=')) != null) {
                try {
                    String strDecode = URLDecoder.decode(strA0Q, DCl.A05.name());
                    C7384Etj.A0U(strDecode);
                    string = C7BY.A0F(strDecode).toString();
                    return string;
                } catch (IllegalArgumentException e) {
                    CFK.A0D(TAG, "Rejecting malformed install referrer param: %s", e, str2);
                }
            }
        }
        return string;
    }

    public final String encodedParam(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        if (str2 == null || !INSTANCE.isRealValue(str2)) {
            return null;
        }
        return FGI.A0U(str, InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, URLEncoder.encode(str2, DCl.A05.name()));
    }

    public final List<String> utmParams(F2V f2v) {
        C7384Etj.A0Y(f2v, 0);
        return BFI.A0F(new String[]{encodedParam("utm_source", f2v.A04), encodedParam("utm_medium", f2v.A03), encodedParam("utm_campaign", f2v.A00), encodedParam("utm_content", f2v.A01), INSTANCE.isRealValue(f2v.A02) ? "has_custom_data=1" : null});
    }

    public final String without(String str, String str2) {
        List listA0h;
        C7384Etj.A0Y(str2, 1);
        if (str == null || (listA0h = C7BY.A0h(str, new char[1], '&')) == null) {
            return null;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : listA0h) {
            String str3 = (String) obj;
            if (!str2.equals(C7BY.A0S(str3, str3, '='))) {
                arrayListA0h.add(obj);
            }
        }
        return AbstractC06907md.A01("&", arrayListA0h, null);
    }
}
