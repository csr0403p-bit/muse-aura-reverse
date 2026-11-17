package X;

import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.EXu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6736EXu<E> extends AbstractC6735EXt<Collection<E>> {
    public final AbstractC6735EXt<E> A00;
    public final InterfaceC6739EXx<? extends Collection<E>> A01;

    @Override // X.AbstractC6735EXt
    public final /* bridge */ /* synthetic */ void write(C6733EXr c6733EXr, Object obj) throws IOException {
        Collection collection = (Collection) obj;
        if (collection == null) {
            c6733EXr.A0B();
            return;
        }
        c6733EXr.A07();
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            this.A00.write(c6733EXr, it.next());
        }
        c6733EXr.A09();
    }

    public C6736EXu(AbstractC6735EXt<E> abstractC6735EXt, InterfaceC6739EXx<? extends Collection<E>> interfaceC6739EXx) {
        this.A00 = abstractC6735EXt;
        this.A01 = interfaceC6739EXx;
    }

    @Override // X.AbstractC6735EXt
    public final /* bridge */ /* synthetic */ Object read(EY1 ey1) throws MalformedJsonException {
        if (ey1.A0R() == C79.A0Z) {
            ey1.A0a();
            return null;
        }
        Collection<E> collectionA6t = this.A01.A6t();
        ey1.A0W();
        while (ey1.A0c()) {
            collectionA6t.add(this.A00.read(ey1));
        }
        ey1.A0Y();
        return collectionA6t;
    }
}
