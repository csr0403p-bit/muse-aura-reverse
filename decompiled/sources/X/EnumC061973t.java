package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.73t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC061973t {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC061973t[] A01;
    public static final EnumC061973t A02;
    public static final EnumC061973t A03;
    public static final EnumC061973t A04;
    public static final EnumC061973t A05;
    public static final EnumC061973t A06;
    public static final EnumC061973t A07;
    public static final EnumC061973t A08;
    public static final EnumC061973t A09;
    public static final EnumC061973t A0A;
    public static final EnumC061973t A0B;
    public final String pointName;

    static {
        EnumC061973t enumC061973t = new EnumC061973t("WEBVIEW_SETUP_START", 0, "webview_setup_start");
        A0B = enumC061973t;
        EnumC061973t enumC061973t2 = new EnumC061973t("WEBVIEW_SETUP_END", 1, "webview_setup_end");
        A0A = enumC061973t2;
        EnumC061973t enumC061973t3 = new EnumC061973t("SESSION_COOKIE_EXCHANGE_START", 2, "session_cookie_exchange_start");
        A08 = enumC061973t3;
        EnumC061973t enumC061973t4 = new EnumC061973t("SESSION_COOKIE_EXCHANGE_END", 3, "session_cookie_exchange_end");
        A05 = enumC061973t4;
        EnumC061973t enumC061973t5 = new EnumC061973t("SESSION_COOKIE_RECEIVED", 4, "session_cookie_received");
        A09 = enumC061973t5;
        EnumC061973t enumC061973t6 = new EnumC061973t("SESSION_COOKIE_EXCHANGE_FAIL", 5, "session_cookie_exchange_fail");
        A06 = enumC061973t6;
        EnumC061973t enumC061973t7 = new EnumC061973t("SESSION_COOKIE_EXCHANGE_EMPTY", 6, "session_cookie_exchange_empty");
        A04 = enumC061973t7;
        EnumC061973t enumC061973t8 = new EnumC061973t("SESSION_COOKIE_EXCHANGE_SKIPPED", 7, "session_cookie_exchange_skipped");
        A07 = enumC061973t8;
        EnumC061973t enumC061973t9 = new EnumC061973t("COOKIE_SETUP_NAVIGATION_DISPATCH_START", 8, "cookie_setup_navigation_dispatch_start");
        A03 = enumC061973t9;
        EnumC061973t enumC061973t10 = new EnumC061973t("COOKIE_SETUP_NAVIGATION_DISPATCH_END", 9, "cookie_setup_navigation_dispatch_end");
        A02 = enumC061973t10;
        EnumC061973t[] enumC061973tArr = {enumC061973t, enumC061973t2, enumC061973t3, enumC061973t4, enumC061973t5, enumC061973t6, enumC061973t7, enumC061973t8, enumC061973t9, enumC061973t10};
        A01 = enumC061973tArr;
        A00 = C3cG.A0w(enumC061973tArr);
    }

    public static EnumC061973t valueOf(String str) {
        return (EnumC061973t) Enum.valueOf(EnumC061973t.class, str);
    }

    public static EnumC061973t[] values() {
        return (EnumC061973t[]) A01.clone();
    }

    public EnumC061973t(String str, int i, String str2) {
        this.pointName = str2;
    }
}
