package X;

/* loaded from: classes5.dex */
public abstract class DR1<T> extends AbstractC7489Ext<T> {
    public T A00;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AnonymousClass002.A1X(this.A00);
    }

    @Override // java.util.Iterator
    public final T next() {
        Object objAI3;
        Object obj;
        T t = this.A00;
        if (t == null) {
            throw C8j3.A1D();
        }
        if (this instanceof C6495E8z) {
            objAI3 = (T) ((E8b) t).AI4();
            obj = ((C6495E8z) this).A00.A00;
        } else {
            objAI3 = ((E8b) t).AI3();
            obj = ((E90) this).A00.A00;
        }
        if (objAI3 == obj) {
            objAI3 = (T) null;
        }
        this.A00 = (T) objAI3;
        return t;
    }
}
