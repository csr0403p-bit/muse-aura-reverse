package X;

import com.facebook.privacy.zone.api.ZonedValue;
import java.util.Map;

/* loaded from: classes5.dex */
public final class DL1 {
    public ZonedValue<DL1> A00;
    public Long A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public Map<String, Object> A06;
    public Map<String, DL6> A07;

    public final void A00(Object obj, String str) {
        Map mapA0u = this.A06;
        if (mapA0u == null) {
            mapA0u = BV4.A0u();
            this.A06 = mapA0u;
        }
        mapA0u.put(str, obj);
    }
}
