package X;

import java.util.Iterator;

/* renamed from: X.GhQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9804GhQ extends AbstractC9787Ggw implements Iterable {
    public abstract boolean equals(Object obj);

    public abstract String toString();

    public final AbstractC9804GhQ A02(String str) {
        if ((this instanceof AbstractC9806GhU) || !(this instanceof C9809Ghf)) {
            return null;
        }
        return ((C9809Ghf) this)._children.get(str);
    }

    public final Integer A03() {
        return this instanceof C9816Gi3 ? C79.A0Z : this instanceof C9788Ggx ? C79.A0Y : this instanceof AbstractC9789Ggy ? C79.A0T : this instanceof Gh1 ? C79.A0P : this instanceof C9814Ghy ? C79.A0C : this instanceof C9811Ghl ? C79.A01 : this instanceof C9809Ghf ? C79.A0W : C79.A00;
    }

    public final Iterator<AbstractC9804GhQ> A04() {
        return this instanceof C9809Ghf ? BV5.A10(((C9809Ghf) this)._children) : this instanceof C9805GhS ? ((C9805GhS) this)._children.listIterator() : AbstractC9855Gj3.A00;
    }

    public final void A05() {
        if (this instanceof C9809Ghf) {
            ((C9809Ghf) this)._children.size();
        } else if (this instanceof C9805GhS) {
            ((C9805GhS) this)._children.size();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<AbstractC9804GhQ> iterator() {
        return A04();
    }
}
