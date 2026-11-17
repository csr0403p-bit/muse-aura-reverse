package X;

import com.facebook.aura.accountcenter.MC;
import com.facebook.aura.browsertask.control.BrowserTaskStopKt;
import com.facebook.aura.common.video.HatchTransportHttpDataSourceKt;
import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7Ji, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7Ji {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ C7Ji[] A01;
    public final int code;
    public final String message;

    static {
        C7Ji c7Ji = new C7Ji("SWITCH_PROTOCOL", 0, FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE, "Switching Protocols");
        C7Ji c7Ji2 = new C7Ji("OK", 1, 200, "OK");
        C7Ji c7Ji3 = new C7Ji("CREATED", 2, 201, "Created");
        C7Ji c7Ji4 = new C7Ji("ACCEPTED", 3, 202, "Accepted");
        C7Ji c7Ji5 = new C7Ji("NO_CONTENT", 4, HatchWidgetWebViewKt.HTTP_NO_CONTENT, "No Content");
        C7Ji c7Ji6 = new C7Ji("PARTIAL_CONTENT", 5, HatchTransportHttpDataSourceKt.HTTP_PARTIAL_CONTENT, "Partial Content");
        C7Ji c7Ji7 = new C7Ji("MULTI_STATUS", 6, 207, "Multi-Status");
        C7Ji c7Ji8 = new C7Ji("REDIRECT", 7, 301, "Moved Permanently");
        C7Ji c7Ji9 = new C7Ji("FOUND", 8, 302, "Found");
        C7Ji c7Ji10 = new C7Ji("REDIRECT_SEE_OTHER", 9, 303, "See Other");
        C7Ji c7Ji11 = new C7Ji("NOT_MODIFIED", 10, 304, "Not Modified");
        C7Ji c7Ji12 = new C7Ji("TEMPORARY_REDIRECT", 11, 307, "Temporary Redirect");
        C7Ji c7Ji13 = new C7Ji("BAD_REQUEST", 12, 400, "Bad Request");
        C7Ji c7Ji14 = new C7Ji("UNAUTHORIZED", 13, 401, "Unauthorized");
        C7Ji c7Ji15 = new C7Ji("FORBIDDEN", 14, 403, "Forbidden");
        C7Ji c7Ji16 = new C7Ji("NOT_FOUND", 15, 404, "Not Found");
        C7Ji c7Ji17 = new C7Ji("METHOD_NOT_ALLOWED", 16, 405, "Method Not Allowed");
        C7Ji c7Ji18 = new C7Ji("NOT_ACCEPTABLE", 17, MC.mwa_accounts_center_3p_link.__CONFIG__, "Not Acceptable");
        C7Ji c7Ji19 = new C7Ji("REQUEST_TIMEOUT", 18, 408, "Request Timeout");
        C7Ji c7Ji20 = new C7Ji("CONFLICT", 19, 409, "Conflict");
        C7Ji c7Ji21 = new C7Ji("GONE", 20, 410, "Gone");
        C7Ji c7Ji22 = new C7Ji("LENGTH_REQUIRED", 21, 411, "Length Required");
        C7Ji c7Ji23 = new C7Ji("PRECONDITION_FAILED", 22, 412, "Precondition Failed");
        C7Ji c7Ji24 = new C7Ji("PAYLOAD_TOO_LARGE", 23, 413, "Payload Too Large");
        C7Ji c7Ji25 = new C7Ji("UNSUPPORTED_MEDIA_TYPE", 24, 415, "Unsupported Media Type");
        C7Ji c7Ji26 = new C7Ji("RANGE_NOT_SATISFIABLE", 25, HatchTransportHttpDataSourceKt.HTTP_RANGE_NOT_SATISFIABLE, "Requested Range Not Satisfiable");
        C7Ji c7Ji27 = new C7Ji("EXPECTATION_FAILED", 26, 417, "Expectation Failed");
        C7Ji c7Ji28 = new C7Ji("TOO_MANY_REQUESTS", 27, 429, "Too Many Requests");
        C7Ji c7Ji29 = new C7Ji("INTERNAL_ERROR", 28, 500, "Internal Server Error");
        C7Ji c7Ji30 = new C7Ji("NOT_IMPLEMENTED", 29, 501, "Not Implemented");
        C7Ji c7Ji31 = new C7Ji("SERVICE_UNAVAILABLE", 30, BrowserTaskStopKt.HTTP_SERVICE_UNAVAILABLE, "Service Unavailable");
        C7Ji c7Ji32 = new C7Ji("UNSUPPORTED_HTTP_VERSION", 31, 505, "HTTP Version Not Supported");
        C7Ji[] c7JiArr = new C7Ji[32];
        System.arraycopy(new C7Ji[]{c7Ji, c7Ji2, c7Ji3, c7Ji4, c7Ji5, c7Ji6, c7Ji7, c7Ji8, c7Ji9, c7Ji10, c7Ji11, c7Ji12, c7Ji13, c7Ji14, c7Ji15, c7Ji16, c7Ji17, c7Ji18, c7Ji19, c7Ji20, c7Ji21, c7Ji22, c7Ji23, c7Ji24, c7Ji25, c7Ji26, c7Ji27}, 0, c7JiArr, 0, 27);
        System.arraycopy(new C7Ji[]{c7Ji28, c7Ji29, c7Ji30, c7Ji31, c7Ji32}, 0, c7JiArr, 27, 5);
        A01 = c7JiArr;
        A00 = C3cG.A0w(c7JiArr);
    }

    public static C7Ji valueOf(String str) {
        return (C7Ji) Enum.valueOf(C7Ji.class, str);
    }

    public static C7Ji[] values() {
        return (C7Ji[]) A01.clone();
    }

    public C7Ji(String str, int i, int i2, String str2) {
        this.code = i2;
        this.message = str2;
    }
}
