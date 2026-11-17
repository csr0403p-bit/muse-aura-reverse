package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebookpay.logging.FBPayLoggerData;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class EVQ {
    public static final String A01(Map<String, ? extends Object> map) {
        if (map.containsKey("logger_data")) {
            FBPayLoggerData fBPayLoggerData = (FBPayLoggerData) map.get("logger_data");
            if (fBPayLoggerData == null) {
                throw BV4.A0U();
            }
            String str = fBPayLoggerData.A02;
            if (str != null && str.length() != 0) {
                return str;
            }
        }
        Object obj = map.get("flow_name");
        if (obj == null) {
            throw BV4.A0U();
        }
        return (String) obj;
    }

    public static final String A02(Map<String, ? extends Object> map) {
        if (map.containsKey("logger_data")) {
            FBPayLoggerData fBPayLoggerData = (FBPayLoggerData) map.get("logger_data");
            if (fBPayLoggerData == null) {
                throw BV4.A0U();
            }
            String strA01 = fBPayLoggerData.A01();
            if (strA01 != null && strA01.length() != 0) {
                return strA01;
            }
        }
        Object obj = map.get("session_id");
        if (obj == null) {
            throw BV4.A0U();
        }
        return (String) obj;
    }

    public static final String A00() {
        String strLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s_%s_%s", "upl", String.valueOf(System.currentTimeMillis()), BV5.A0j());
        C7384Etj.A0U(strLocaleSafe);
        return strLocaleSafe;
    }
}
