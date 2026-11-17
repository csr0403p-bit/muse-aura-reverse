package X;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes5.dex */
public final class DOS<K, V> extends AbstractC5001DNd<Map.Entry<K, V>> {
    public final /* synthetic */ DOR A00;

    public DOS(final DOR this$0) {
        this.A00 = this$0;
    }

    @Override // X.DNX, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new F4F(this, this.A00.A00.iterator(), 1);
    }
}
