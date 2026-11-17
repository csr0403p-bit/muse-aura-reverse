package X;

import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebookpay.logging.FBPayLoggerData;
import java.util.Map;

/* loaded from: classes5.dex */
public final class EVP implements EVe {
    public final C8ee<?> A00;
    public final InterfaceC7539F0o A01;
    public final Map<String, Map<String, String>> A02;

    public EVP(C8ee<?> c8ee) {
        C7384Etj.A0Y(c8ee, 0);
        this.A00 = c8ee;
        this.A01 = C9u.A00;
        this.A02 = BV5.A14();
    }

    public static final String A00(Map<String, ? extends Object> map) {
        if (map.containsKey("logger_data")) {
            FBPayLoggerData fBPayLoggerData = (FBPayLoggerData) map.get("logger_data");
            if (fBPayLoggerData == null) {
                throw BV4.A0U();
            }
            String str = fBPayLoggerData.A01;
            if (str != null && str.length() != 0) {
                return str;
            }
        }
        return BV4.A0i("external_session_id", map);
    }

    public static final String A01(Map<String, ? extends Object> map) {
        if (map.containsKey("logger_data")) {
            FBPayLoggerData fBPayLoggerData = (FBPayLoggerData) map.get("logger_data");
            if (fBPayLoggerData == null) {
                throw BV4.A0U();
            }
            String str = fBPayLoggerData.A06;
            if (str != null && str.length() != 0) {
                return str;
            }
        }
        return BV4.A0i(PhotosSearchHandlerKt.PARAM_SOURCE, map);
    }

    public static void A02(AbstractC6676EOt abstractC6676EOt, String str, String str2, Map map) {
        abstractC6676EOt.A03("external_session_id", A00(map));
        abstractC6676EOt.A03("flow_name", str);
        abstractC6676EOt.A03("context_id", str2);
        abstractC6676EOt.A03("flow_step", (String) map.get("flow_step"));
    }

    public static void A05(AbstractC6676EOt abstractC6676EOt, Map map) {
        Boolean bool = (Boolean) map.get("is_free");
        if (bool != null) {
            abstractC6676EOt.A00.A3P("is_free", bool);
        }
    }

    public static void A06(EVS evs, EVP evp, String str, String str2) {
        evs.A03("event_type", "client");
        if (str.startsWith("payflows_")) {
            str = str.substring(9);
        }
        evs.A03("event_name", str);
        evs.A03("client_time", String.valueOf(evp.A01.now()));
        evs.A00.A3b("logging_service_id", Integer.valueOf(evp.hashCode()));
        evs.A03("session_id", str2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0226 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02aa  */
    @Override // X.EVe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void APv(java.lang.String r17, java.util.Map<java.lang.String, ? extends java.lang.Object> r18) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EVP.APv(java.lang.String, java.util.Map):void");
    }

    public static void A03(AbstractC6676EOt abstractC6676EOt, String str, Map map) {
        String str2 = (String) map.get(str);
        if (str2 == null || str2.length() == 0) {
            return;
        }
        abstractC6676EOt.A03(str, str2);
    }

    public static void A04(AbstractC6676EOt abstractC6676EOt, String str, Map map) {
        abstractC6676EOt.A03(str, (String) map.get(str));
    }
}
