package X;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class GDB {
    public static final G0U<Object, Object> A00 = new I17(2);
    public static final G0V<Object, Object, Boolean> A01 = new I16(19);

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/20Q<+TT;>;LX/G0U<-TT;+Ljava/lang/Object;>;LX/G0V<Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Boolean;>;)LX/20Q<TT;>; */
    public static final C20Q A00(G0U g0u, G0V g0v, C20Q c20q) {
        if (c20q instanceof GDA) {
            GDA gda = (GDA) c20q;
            if (gda.A00 == g0u && gda.A01 == g0v) {
                return c20q;
            }
        }
        return new GDA(g0u, g0v, c20q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> C20Q<T> A01(C20Q<? extends T> c20q) {
        return !(c20q instanceof C1BN) ? A00(A00, A01, c20q) : c20q;
    }
}
