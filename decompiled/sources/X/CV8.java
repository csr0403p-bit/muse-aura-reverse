package X;

import java.util.Map;

/* loaded from: classes5.dex */
public final class CV8 extends InheritableThreadLocal<Map<String, String>> {
    public final /* synthetic */ CV7 A00;

    public CV8(CV7 cv7) {
        this.A00 = cv7;
    }

    @Override // java.lang.InheritableThreadLocal
    public final /* bridge */ /* synthetic */ Map<String, String> childValue(Map<String, String> map) {
        Map<String, String> map2 = map;
        if (map2 == null) {
            return null;
        }
        return BV4.A0w(map2);
    }
}
