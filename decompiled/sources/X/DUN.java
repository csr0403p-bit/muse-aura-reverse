package X;

import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* loaded from: classes5.dex */
public final class DUN<FieldDescriptorType> extends DUL<FieldDescriptorType, Object> {
    @Override // X.DUL
    public final void A05() {
        if (!this.A02) {
            if (0 < this.A00.size()) {
                this.A00.get(0).getKey();
                throw BV4.A0a("isRepeated");
            }
            Iterator it = (this.A01.isEmpty() ? Collections.EMPTY_SET : this.A01.entrySet()).iterator();
            if (it.hasNext()) {
                C3cH.A0l(it).getKey();
                throw BV4.A0a("isRepeated");
            }
        }
        super.A05();
    }
}
