package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes5.dex */
public final class EVT implements EVe {
    public final EVP A00;

    public static EVV A01(AbstractC6676EOt abstractC6676EOt, AwakeTimeSinceBootClock awakeTimeSinceBootClock, String str, String str2) {
        abstractC6676EOt.A03("session_id", str);
        HVq hVqValueOf = HVq.A0L;
        try {
            Locale locale = Locale.US;
            C7384Etj.A0V(locale);
            hVqValueOf = HVq.valueOf(str2.toUpperCase(locale));
        } catch (Exception unused) {
        }
        abstractC6676EOt.A00(hVqValueOf, "product_type");
        abstractC6676EOt.A00(EnumC7397Eua.ANDROID, "platform");
        abstractC6676EOt.A02("actual_event_time", Long.valueOf(awakeTimeSinceBootClock.now()));
        return new EVV();
    }

    public static void A03(AbstractMap abstractMap, Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getValue() instanceof String) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            C7384Etj.A0Z(value, "null cannot be cast to non-null type kotlin.String");
            abstractMap.put(key, value);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    @Override // X.EVe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void APv(java.lang.String r13, java.util.Map<java.lang.String, ? extends java.lang.Object> r14) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EVT.APv(java.lang.String, java.util.Map):void");
    }

    public EVT(EVP evp) {
        this.A00 = evp;
    }

    private final BY4 A00(Map<String, ? extends Object> map) {
        String str;
        Object obj = map.get("view_name");
        if (obj != null && (obj instanceof String) && (str = (String) obj) != null) {
            try {
                Locale locale = Locale.US;
                C7384Etj.A0V(locale);
                return BY4.valueOf(str.toUpperCase(locale));
            } catch (IllegalArgumentException unused) {
            }
        }
        return BY4.A01;
    }

    public static void A02(Object obj, AbstractMap abstractMap, Map map) {
        if (map.get(obj) != null) {
            abstractMap.put(obj, String.valueOf(map.get(obj)));
        }
    }
}
