package X;

import com.facebook.acra.constants.ErrorReportingConstants;
import java.util.Map;

/* renamed from: X.FWo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8150FWo {
    public Map<String, Object> A00 = BV4.A0u();

    public static void A00(AbstractC8150FWo abstractC8150FWo) {
        abstractC8150FWo.A05("dcp_flow", "purchase");
        abstractC8150FWo.A00.put("dcp_platform", 71);
        abstractC8150FWo.A05(ErrorReportingConstants.APP_NAME_KEY, "");
    }

    public static void A01(AbstractC8150FWo abstractC8150FWo, C6729EXn c6729EXn, String str) {
        abstractC8150FWo.A05("dcp_sub_flow", str);
        abstractC8150FWo.A05("dcp_api_component", "android_pal_iac");
        String str2 = c6729EXn.A04;
        if (str2 != null) {
            abstractC8150FWo.A05("external_product_id", str2);
        }
    }

    public static void A02(AbstractC8150FWo abstractC8150FWo, Object obj, Object obj2) {
        abstractC8150FWo.A00.put(obj, obj2);
    }

    public final void A03(InterfaceC2571Be0 interfaceC2571Be0, String str) {
        Map<String, Object> map = this.A00;
        Object value = interfaceC2571Be0;
        if (interfaceC2571Be0 != null) {
            value = interfaceC2571Be0.getValue();
        }
        map.put(str, value);
    }

    public final void A04(String str, Long l) {
        A02(this, str, l);
    }

    public final void A05(String str, String str2) {
        A02(this, str, str2);
    }
}
