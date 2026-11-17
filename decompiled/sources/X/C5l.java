package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C5l {
    public static final /* synthetic */ C5l[] A00;
    public static final C5l A01;
    public static final C5l A02;
    public static final C5l A03;
    public static final C5l A04;
    public static final C5l A05;
    public static final C5l A06;
    public static final C5l A07;
    public static final C5l A08;
    public static final C5l A09;
    public static final C5l A0A;
    public static final C5l A0B;
    public static final C5l A0C;
    public static final C5l A0D;
    public final String mName;
    public final boolean mSupplementary;

    static {
        C5l c5l = new C5l("ANR", 0, "anr", false);
        A01 = c5l;
        C5l c5lA00 = A00("ANR_APP_DEATH", "anr_app_death", 1, false);
        A02 = c5lA00;
        C5l c5lA002 = A00("ANR_APP_DEATH_EARLY", "anr_app_death_early", 2, false);
        C5l c5lA003 = A00("APP_LIFECYCLE", "app_lifecycle", 3, true);
        A03 = c5lA003;
        C5l c5lA004 = A00("ATTRIBUTION_ID", "attribution_id", 4, true);
        C5l c5lA005 = A00("JAVA", "java", 5, false);
        A06 = c5lA005;
        C5l c5lA006 = A00("JAVA_DETECT", "java_detect", 6, true);
        C5l c5lA007 = A00("JAVA_APP_DEATH", "java_app_death", 7, false);
        C5l c5lA008 = A00("JAVA_APP_DEATH_EARLY", "java_app_death_early", 8, false);
        C5l c5lA009 = A00("JAVASCRIPT", "javascript", 9, false);
        C5l c5lA0010 = A00("NATIVE", "native", 10, false);
        A07 = c5lA0010;
        C5l c5lA0011 = A00("NATIVE_APP_DEATH_EARLY", "native_app_death_early", 11, false);
        C5l c5lA0012 = A00("HELIUM_RENDERER_CRASH", "helium_renderer_crash", 12, false);
        C5l c5lA0013 = A00("LIGHT_MOBILE_CONFIG", "light_mobile_config", 13, true);
        C5l c5lA0014 = A00("MOBILE_CONFIG", "mobile_config", 14, true);
        C5l c5lA0015 = A00("NAVIGATION", "navigation", 15, true);
        A08 = c5lA0015;
        C5l c5lA0016 = A00("PERIODIC_MEMORY", "periodic_memory", 16, true);
        A0A = c5lA0016;
        C5l c5lA0017 = A00("PERIODIC_MEMORY_PRESSURE", "periodic_memory_pressure", 17, true);
        C5l c5lA0018 = A00("PERIODIC_THERMAL", "periodic_thermal", 18, true);
        C5l c5lA0019 = A00("LATE_STARTUP", "late_startup", 19, true);
        C5l c5lA0020 = A00("AFTER_STARTUP", "after_startup", 20, true);
        C5l c5lA0021 = A00("REPORT_SOURCE", "report_source", 21, true);
        C5l c5lA0022 = A00("SOFT_ERROR", "soft_error", 22, false);
        A0B = c5lA0022;
        C5l c5lA0023 = A00("STARTUP", "startup", 23, true);
        A0C = c5lA0023;
        C5l c5lA0024 = A00("UNEXPLAINED", "unexplained", 24, false);
        A0D = c5lA0024;
        C5l c5lA0025 = A00("UNEXPLAINED_APP_DEATH_EARLY", "unexplained_app_death_early", 25, false);
        C5l c5lA0026 = A00("TEST_CRASH", "test", 26, false);
        C5l c5lA0027 = A00("BUG_REPORT", "bug_report", 27, false);
        A04 = c5lA0027;
        C5l c5lA0028 = A00("CUSTOM_DATA", "custom_data", 28, true);
        A05 = c5lA0028;
        C5l c5lA0029 = A00("FOREGROUND_TRANSITION", "foreground_transition", 29, true);
        C5l c5lA0030 = A00("USER_PERCEPTIBLE_SCOPE", "user_perceptible_scope", 30, true);
        C5l c5lA0031 = A00("USER_CHANGE", "user_change", 31, true);
        C5l c5lA0032 = A00("PERIODIC_BATTERY", "periodic_battery", 32, true);
        A09 = c5lA0032;
        C5l c5lA0033 = A00("MEMORY_TRIM", "memory_trim", 33, true);
        C5l c5lA0034 = A00("BACKGROUND", "background", 34, true);
        C5l c5lA0035 = A00("MEMORY_RED", "memory_red", 35, true);
        C5l[] c5lArr = new C5l[36];
        System.arraycopy(new C5l[]{c5l, c5lA00, c5lA002, c5lA003, c5lA004, c5lA005, c5lA006, c5lA007, c5lA008, c5lA009, c5lA0010, c5lA0011, c5lA0012, c5lA0013, c5lA0014, c5lA0015, c5lA0016, c5lA0017, c5lA0018, c5lA0019, c5lA0020, c5lA0021, c5lA0022, c5lA0023, c5lA0024, c5lA0025, c5lA0026}, 0, c5lArr, 0, 27);
        System.arraycopy(new C5l[]{c5lA0027, c5lA0028, c5lA0029, c5lA0030, c5lA0031, c5lA0032, c5lA0033, c5lA0034, c5lA0035}, 0, c5lArr, 27, 9);
        A00 = c5lArr;
    }

    public static C5l A00(String str, String str2, int i, boolean z) {
        return new C5l(str, i, str2, z);
    }

    public static C5l valueOf(String str) {
        return (C5l) Enum.valueOf(C5l.class, str);
    }

    public static C5l[] values() {
        return (C5l[]) A00.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.mName;
    }

    public C5l(String str, int i, String str2, boolean z) {
        this.mName = str2;
        this.mSupplementary = z;
    }
}
