package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class CO6 extends CO8 {
    public final /* synthetic */ COB zza;

    public CO6(COB cob) {
        this.zza = cob;
    }

    @Override // X.COD, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.zza.get(entry.getKey());
        if (obj2 != null) {
            return BV7.A1X(obj2, entry.getValue(), false);
        }
        return false;
    }

    @Override // X.CO8, java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator it = this.zza.entrySet().iterator();
        int iA01 = 0;
        while (it.hasNext()) {
            iA01 += C60R.A01(it.next());
        }
        return iA01;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return A07().listIterator(0);
    }

    public CO6() {
    }
}
