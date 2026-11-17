package X;

import java.util.Collection;

/* loaded from: classes4.dex */
public final class AK0 extends AbstractC0890AGr implements Collection, BOA {
    public final C0953AJg<K, V> A00;

    @Override // X.AbstractC0890AGr, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    public AK0(C0953AJg<K, V> c0953AJg) {
        this.A00 = c0953AJg;
    }
}
