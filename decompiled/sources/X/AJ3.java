package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AJ3<K, V> extends AbstractC0891AGs<Map.Entry<? extends K, ? extends V>> implements BQI<Map.Entry<? extends K, ? extends V>> {
    public final C0952AJf<K, V> A00;

    @Override // X.AbstractC0890AGr, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return AbstractC0931AIi.A00(C8j4.A15(obj), this.A00);
        }
        return false;
    }

    @Override // X.AbstractC0890AGr, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        C0956AJj<K, V> c0956AJj = this.A00.A00;
        C7384Etj.A0Y(c0956AJj, 0);
        AJH[] ajhArr = new AJH[8];
        int i = 0;
        do {
            ajhArr[i] = new AJI();
            i++;
        } while (i < 8);
        return new AJ4(c0956AJj, ajhArr);
    }

    public AJ3(C0952AJf<K, V> c0952AJf) {
        this.A00 = c0952AJf;
    }
}
