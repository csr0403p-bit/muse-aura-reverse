package X;

import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import com.facebook.aura.model.PairingLauncherPresentationJsonKt;
import com.facebook.aura.permissions.defaults.ConfidentialVmSettingsJsonKt;
import com.facebook.aura.settings.HatchDataExportRepositoryKt;
import com.facebook.aura.shopping.repo.MarketplaceDetailsNormalizationKt;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.tigon.iface.TigonRequest;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.EbY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6876EbY {
    public static final Map<C6788EZx, Integer> A00;
    public static final C6897Ebt[] A01;

    public static final void A00(C6788EZx c6788EZx) {
        int i = 0;
        C7384Etj.A0Y(c6788EZx, 0);
        int iA0C = c6788EZx.A0C();
        while (i < iA0C) {
            int i2 = i + 1;
            byte bA0B = c6788EZx.A0B(i);
            if (65 <= bA0B && bA0B <= 90) {
                throw C7384Etj.A0C(c6788EZx.A07(), "PROTOCOL_ERROR response malformed: mixed case name: ");
            }
            i = i2;
        }
    }

    static {
        C6897Ebt[] c6897EbtArr = new C6897Ebt[61];
        C6897Ebt c6897Ebt = new C6897Ebt("", C6897Ebt.A05);
        C6788EZx c6788EZx = C6897Ebt.A06;
        C6897Ebt c6897Ebt2 = new C6897Ebt(TigonRequest.GET, c6788EZx);
        C6897Ebt c6897Ebt3 = new C6897Ebt("POST", c6788EZx);
        C6788EZx c6788EZx2 = C6897Ebt.A07;
        C6897Ebt c6897Ebt4 = new C6897Ebt(CustomConnectorRegisterRepositoryKt.ROOT_PATH, c6788EZx2);
        C6897Ebt c6897Ebt5 = new C6897Ebt("/index.html", c6788EZx2);
        C6788EZx c6788EZx3 = C6897Ebt.A08;
        C6897Ebt c6897Ebt6 = new C6897Ebt(AuraDeeplinkHandlerActivity.HTTP, c6788EZx3);
        C6897Ebt c6897Ebt7 = new C6897Ebt("https", c6788EZx3);
        C6788EZx c6788EZx4 = C6897Ebt.A04;
        int i = 0;
        System.arraycopy(new C6897Ebt[]{c6897Ebt, c6897Ebt2, c6897Ebt3, c6897Ebt4, c6897Ebt5, c6897Ebt6, c6897Ebt7, new C6897Ebt("200", c6788EZx4), new C6897Ebt("204", c6788EZx4), new C6897Ebt("206", c6788EZx4), new C6897Ebt("304", c6788EZx4), new C6897Ebt("400", c6788EZx4), new C6897Ebt("404", c6788EZx4), new C6897Ebt("500", c6788EZx4), BV6.A0w("accept-charset", ""), BV6.A0w("accept-encoding", "gzip, deflate"), BV6.A0w("accept-language", ""), BV6.A0w("accept-ranges", ""), BV6.A0w(PairingLauncherPresentationJsonKt.ACTION_ACCEPT, ""), BV6.A0w("access-control-allow-origin", ""), BV6.A0w("age", ""), BV6.A0w(ConfidentialVmSettingsJsonKt.MODE_ALLOW, ""), BV6.A0w("authorization", ""), BV6.A0w("cache-control", ""), BV6.A0w("content-disposition", ""), BV6.A0w("content-encoding", ""), BV6.A0w("content-language", "")}, 0, c6897EbtArr, 0, 27);
        System.arraycopy(new C6897Ebt[]{BV6.A0w("content-length", ""), BV6.A0w("content-location", ""), BV6.A0w("content-range", ""), BV6.A0w("content-type", ""), BV6.A0w("cookie", ""), BV6.A0w("date", ""), BV6.A0w("etag", ""), BV6.A0w("expect", ""), BV6.A0w("expires", ""), BV6.A0w("from", ""), BV6.A0w("host", ""), BV6.A0w("if-match", ""), BV6.A0w("if-modified-since", ""), BV6.A0w("if-none-match", ""), BV6.A0w("if-range", ""), BV6.A0w("if-unmodified-since", ""), BV6.A0w("last-modified", ""), BV6.A0w("link", ""), BV6.A0w(MarketplaceDetailsNormalizationKt.LOCATION_VARIANT_LABEL, ""), BV6.A0w("max-forwards", ""), BV6.A0w("proxy-authenticate", ""), BV6.A0w("proxy-authorization", ""), BV6.A0w("range", ""), BV6.A0w("referer", ""), BV6.A0w("refresh", ""), BV6.A0w("retry-after", ""), BV6.A0w(HatchDataExportRepositoryKt.FAILURE_SERVER, "")}, 0, c6897EbtArr, 27, 27);
        System.arraycopy(new C6897Ebt[]{BV6.A0w("set-cookie", ""), BV6.A0w("strict-transport-security", ""), BV6.A0w("transfer-encoding", ""), BV6.A0w("user-agent", ""), BV6.A0w("vary", ""), BV6.A0w(AgeCheckFunnelLogging.KEY_VIA, ""), BV6.A0w("www-authenticate", "")}, 0, c6897EbtArr, 54, 7);
        A01 = c6897EbtArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        int i2 = 0;
        do {
            i++;
            if (!linkedHashMap.containsKey(c6897EbtArr[i2].A01)) {
                C8j4.A1O(c6897EbtArr[i2].A01, linkedHashMap, i2);
            }
            i2 = i;
        } while (i < 61);
        A00 = Collections.unmodifiableMap(linkedHashMap);
    }
}
