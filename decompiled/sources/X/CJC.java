package X;

/* loaded from: classes5.dex */
public final class CJC implements CFD, CEQ {
    public static final Object A02 = C3cG.A0T();
    public volatile CFD A00;
    public volatile Object A01 = A02;

    @Override // X.CFD
    public final Object AjF() {
        Object objAjF;
        Object obj = this.A01;
        Object obj2 = A02;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            objAjF = this.A01;
            if (objAjF == obj2) {
                objAjF = this.A00.AjF();
                Object obj3 = this.A01;
                if (obj3 != obj2 && obj3 != objAjF) {
                    StringBuilder sbA0f = C3cG.A0f(obj3, "Scoped provider was invoked recursively returning different results: ");
                    sbA0f.append(" & ");
                    sbA0f.append(objAjF);
                    throw BV8.A0m(". This is likely due to a circular dependency.", sbA0f);
                }
                this.A01 = objAjF;
                this.A00 = null;
            }
        }
        return objAjF;
    }

    public CJC(CFD cfd) {
        this.A00 = cfd;
    }
}
