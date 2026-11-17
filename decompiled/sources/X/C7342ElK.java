package X;

import java.util.Map;

/* renamed from: X.ElK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7342ElK implements Map.Entry, Comparable {
    public Object A00;
    public final /* synthetic */ AbstractC7339ElH A01;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() == null) {
                    Object obj2 = this.A00;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        if (value == null) {
                        }
                    } else if (obj2.equals(value)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getKey() {
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.A00;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return AnonymousClass006.A0D(this.A00);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.A01.A03();
        Object obj2 = this.A00;
        this.A00 = obj;
        return obj2;
    }

    public final String toString() {
        return FGI.A0M("null=", String.valueOf(this.A00));
    }

    public C7342ElK(AbstractC7339ElH abstractC7339ElH, Map.Entry entry) {
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        Object value = entry.getValue();
        this.A01 = abstractC7339ElH;
        this.A00 = value;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        obj.getClass();
        throw null;
    }

    public C7342ElK(AbstractC7339ElH abstractC7339ElH, Object obj) {
        this.A01 = abstractC7339ElH;
        this.A00 = obj;
    }
}
