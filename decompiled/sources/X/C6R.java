package X;

import android.text.TextUtils;
import com.facebook.acra.constants.ErrorReportingConstants;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class C6R {
    public static Map<String, String> A00() {
        HashMap mapA0u = BV4.A0u();
        A01("ig.ig_server_rev_hash", mapA0u);
        String strA02 = AbstractC3459COf.A02(ErrorReportingConstants.REPORT_SOURCE_OVERRIDE_PROP);
        if (TextUtils.isEmpty(strA02)) {
            strA02 = System.getProperty(ErrorReportingConstants.REPORT_SOURCE_OVERRIDE_PROP);
        }
        if (!TextUtils.isEmpty(strA02)) {
            mapA0u.put(ErrorReportingConstants.REPORT_SOURCE_OVERRIDE_PROP, strA02);
            A01("fb.testing.build_target", mapA0u);
            A01("fb.test_name", mapA0u);
            A01("fb.test_execution_uuid", mapA0u);
        }
        A01("fb.maui_command_id", mapA0u);
        return mapA0u;
    }

    public static void A01(String str, AbstractMap abstractMap) {
        String strA02 = AbstractC3459COf.A02(str);
        if (TextUtils.isEmpty(strA02)) {
            strA02 = System.getProperty(str);
        }
        if (TextUtils.isEmpty(strA02)) {
            return;
        }
        abstractMap.put(str, strA02);
    }
}
