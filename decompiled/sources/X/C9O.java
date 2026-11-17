package X;

import android.text.TextUtils;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.Random;

/* loaded from: classes5.dex */
public final class C9O {
    public static final Random A02 = new Random();
    public F18<String> A00;
    public final EventBuilder A01;

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.AbstractMap, java.util.HashMap] */
    public C9O(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, String str, int i, boolean z) {
        String strA0h;
        EventBuilder eventBuilderMarkEventBuilder = lightweightQuickPerformanceLogger.markEventBuilder(i, A02.nextInt(), str);
        C7384Etj.A0X(eventBuilderMarkEventBuilder);
        this.A01 = eventBuilderMarkEventBuilder;
        if (eventBuilderMarkEventBuilder.isSampled()) {
            if (!z && !C9X.A04()) {
                try {
                    String strA01 = C6Q.A01(new Throwable());
                    C7384Etj.A0U(strA01);
                    String strA00 = C6Q.A00(strA01, 2000);
                    C7384Etj.A0U(strA00);
                    eventBuilderMarkEventBuilder.annotate("UI_UE_KEY_CALLSITE_STACKTRACE", strA00);
                } catch (Exception e) {
                    this.A01.annotate("UI_UE_KEY_CALLSITE_STACKTRACE", FGI.A0M("Stack trace collection failed: ", e.getMessage()));
                }
            }
            this.A01.annotate("UI_UE_KEY_END_POINT", C5V.A04 == null ? "" : C5V.A04.A02);
            this.A01.annotate("UI_UE_KEY_CATEGORY", str);
            this.A01.setActionId((short) 11289);
            ?? A00 = C6R.A00();
            if (C9X.A05()) {
                strA0h = "mobilelab";
            } else {
                strA0h = BV4.A0h(ErrorReportingConstants.REPORT_SOURCE_OVERRIDE_PROP, A00);
                if (strA0h == null) {
                    return;
                }
            }
            if (strA0h.length() != 0) {
                EventBuilder eventBuilder = this.A01;
                eventBuilder.annotate("report_source", strA0h);
                String strA0h2 = BV4.A0h("fb.test_name", A00);
                String strA0h3 = BV4.A0h("fb.test_execution_uuid", A00);
                if (TextUtils.isEmpty(strA0h2) && TextUtils.isEmpty(strA0h3)) {
                    this.A00 = C3147Bzf.A00;
                } else {
                    eventBuilder.annotate(ErrorReportingConstants.REPORT_SOURCE_REF, FGI.A0h("{\"test_name\":\"", strA0h2, "\",\"test_execution_uuid\":\"", strA0h3, "\"}"));
                }
            }
        }
    }
}
