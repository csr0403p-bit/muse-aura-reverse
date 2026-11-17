package X;

import java.util.Collection;

/* loaded from: classes4.dex */
public final class AJB extends AbstractC0890AGr implements Collection, BOA {
    public final C0952AJf<K, V> A00;

    @Override // X.AbstractC0890AGr, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    public AJB(C0952AJf<K, V> c0952AJf) {
        this.A00 = c0952AJf;
    }
}
