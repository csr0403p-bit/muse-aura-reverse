package X;

import java.util.Iterator;

/* renamed from: X.ElJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7341ElJ implements Iterator {
    public int A00 = -1;
    public Iterator A01;
    public boolean A02;
    public final /* synthetic */ AbstractC7339ElH A03;

    @Override // java.util.Iterator
    public final Object next() {
        this.A02 = true;
        int i = this.A00 + 1;
        this.A00 = i;
        AbstractC7339ElH abstractC7339ElH = this.A03;
        if (i < abstractC7339ElH.A00) {
            return abstractC7339ElH.A04[i];
        }
        Iterator itA0n = this.A01;
        if (itA0n == null) {
            itA0n = AnonymousClass002.A0n(abstractC7339ElH.A01);
            this.A01 = itA0n;
        }
        return itA0n.next();
    }

    public C7341ElJ(AbstractC7339ElH abstractC7339ElH) {
        this.A03 = abstractC7339ElH;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.A00 + 1;
        AbstractC7339ElH abstractC7339ElH = this.A03;
        if (i >= abstractC7339ElH.A00) {
            if (abstractC7339ElH.A01.isEmpty()) {
                return false;
            }
            Iterator itA0n = this.A01;
            if (itA0n == null) {
                itA0n = AnonymousClass002.A0n(abstractC7339ElH.A01);
                this.A01 = itA0n;
            }
            if (!itA0n.hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        Iterator itA0n;
        if (!this.A02) {
            throw C3cG.A0Q("remove() was called before next()");
        }
        this.A02 = false;
        AbstractC7339ElH abstractC7339ElH = this.A03;
        abstractC7339ElH.A03();
        int i = this.A00;
        if (i < abstractC7339ElH.A00) {
            this.A00 = i - 1;
            abstractC7339ElH.A03();
            Object[] objArr = abstractC7339ElH.A04;
            System.arraycopy(objArr, i + 1, objArr, i, (abstractC7339ElH.A00 - i) - 1);
            abstractC7339ElH.A00--;
            if (abstractC7339ElH.A01.isEmpty()) {
                return;
            }
            itA0n = AbstractC7339ElH.A00(abstractC7339ElH).entrySet().iterator();
            abstractC7339ElH.A04[abstractC7339ElH.A00] = new C7342ElK(abstractC7339ElH, C3cH.A0l(itA0n));
            abstractC7339ElH.A00++;
        } else {
            itA0n = this.A01;
            if (itA0n == null) {
                itA0n = AnonymousClass002.A0n(abstractC7339ElH.A01);
                this.A01 = itA0n;
            }
        }
        itA0n.remove();
    }
}
