package X;

/* loaded from: classes5.dex */
public final class EER<T> {
    public EES<T> A00;
    public volatile T A01;

    public final T A00() {
        T t;
        T t2 = this.A01;
        if (t2 != null) {
            return t2;
        }
        synchronized (this) {
            t = this.A01;
            if (t == null) {
                EES<T> ees = this.A00;
                if (ees == null) {
                    throw C3cG.A0Q("Lazy provider cleared before value initialized");
                }
                t = ees.get();
                if (t != null) {
                    this.A00 = null;
                }
                this.A01 = t;
            }
        }
        return t;
    }
}
