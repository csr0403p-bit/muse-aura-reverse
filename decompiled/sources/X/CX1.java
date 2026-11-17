package X;

import java.util.Map;

/* loaded from: classes5.dex */
public final class CX1 {
    public Map<String, String> A00;
    public final Map<String, String> A01 = BV4.A0u();

    public final synchronized Map<String, String> A00() {
        Map<String, String> mapA15;
        mapA15 = this.A00;
        if (mapA15 == null) {
            mapA15 = BV5.A15(this.A01);
            this.A00 = mapA15;
        }
        return mapA15;
    }
}
