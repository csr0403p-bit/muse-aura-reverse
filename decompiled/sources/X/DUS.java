package X;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* loaded from: classes5.dex */
public final class DUS<FieldDescriptorType> extends DUQ<FieldDescriptorType, Object> {
    @Override // X.DUQ, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put(null, obj2);
    }

    @Override // X.DUQ
    public final void A05() {
        if (!this.A02) {
            if (0 < this.A00.size()) {
                this.A00.get(0).getKey();
                throw BV4.A0a("isRepeated");
            }
            Iterator it = (this.A01.isEmpty() ? C21.A00 : this.A01.entrySet()).iterator();
            if (it.hasNext()) {
                C3cH.A0l(it).getKey();
                throw BV4.A0a("isRepeated");
            }
        }
        super.A05();
    }

    public DUS(int i) {
        super(i);
    }
}
