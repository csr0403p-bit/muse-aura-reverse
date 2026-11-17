package X;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class EWA {
    public Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Map<String, C6701EWd> A06;

    public EWA(Integer num, String str, String str2, String str3, String str4, String str5, Map map) {
        this.A02 = str;
        this.A03 = str2;
        this.A06 = map;
        this.A01 = str3;
        this.A04 = str4;
        this.A05 = str5;
        TimeUnit.SECONDS.toMillis(2147483647L);
        this.A00 = num;
    }

    public static EWA A00(Integer num, String str, String str2, String str3, String str4, String str5, List list) {
        HashMap mapA0u = BV4.A0u();
        for (Object obj : list) {
            System.currentTimeMillis();
            C6701EWd c6701EWd = new C6701EWd();
            TimeUnit.SECONDS.toMillis(2147483647L);
            mapA0u.put(obj, c6701EWd);
        }
        System.currentTimeMillis();
        return new EWA(num, str, str2, str5, str3, str4, mapA0u);
    }
}
