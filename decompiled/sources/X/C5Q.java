package X;

import com.facebook.acra.constants.ReportField;
import java.util.Set;

/* loaded from: classes5.dex */
public final class C5Q {
    public final String A00;
    public final String A01;
    public static final Set<String> A0Q = C60O.A13();
    public static final C5Q A02 = new C5Q("anr_report_file", "__", false);
    public static final C5Q A0L = new C5Q("minidump_file", "", false);
    public static final C5Q A05 = new C5Q(ReportField.APP_PROCESS_FILE, "");
    public static final C5Q A07 = new C5Q("blackbox_trace_file", "_r_");
    public static final C5Q A06 = new C5Q("blackbox_fnrel_trace_file", "_r_");
    public static final C5Q A09 = new C5Q("bluetooth_secure_traffic_file", "");
    public static final C5Q A08 = new C5Q("bluetooth_insecure_traffic_file", "");
    public static final C5Q A0A = new C5Q(ReportField.CORE_DUMP, "");
    public static final C5Q A0B = new C5Q(ReportField.FAT_MINIDUMP, "");
    public static final C5Q A0C = new C5Q("fury_traces_file", "_r_");
    public static final C5Q A0K = new C5Q("logcat_file", "");
    public static final C5Q A0G = new C5Q("hsr_log_file", "");
    public static final C5Q A0H = new C5Q("hsr_rhi_pso_inflight_file", "");
    public static final C5Q A0I = new C5Q("hsr_rhi_pso_slots_file", "");
    public static final C5Q A0J = new C5Q("stack_trace", "", false);
    public static final C5Q A0F = new C5Q("hsr_assert_msg_file", "", false);
    public static final C5Q A0E = new C5Q("aftermath_json", "");
    public static final C5Q A0D = new C5Q("aftermath_binary_nv-gpudmp", "");
    public static final C5Q A0M = new C5Q("msys_crash_reporter_file", "");
    public static final C5Q A0N = new C5Q("properties_file", "");
    public static final C5Q A0O = new C5Q("report_source_file", "");
    public static final C5Q A0P = new C5Q("system_health_file", "");
    public static final C5Q A03 = new C5Q("app_connectivity_report", "");
    public static final C5Q A04 = new C5Q("app_media_import_report", "");

    public C5Q(String str, String str2) {
        this(str, str2, true);
    }

    public final String toString() {
        return this.A00;
    }

    public C5Q(String str, String str2, boolean z) {
        this.A00 = str;
        this.A01 = str2;
        if (!z) {
            A0Q.add(str);
        }
    }
}
