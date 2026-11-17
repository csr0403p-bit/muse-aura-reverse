package X;

/* loaded from: classes5.dex */
public abstract class CPh {
    public int A00(AbstractC3476CPj<?> state) {
        int i;
        synchronized (state) {
            CPh cPh = AbstractC3476CPj.A00;
            i = state.remaining - 1;
            state.remaining = i;
        }
        return i;
    }
}
