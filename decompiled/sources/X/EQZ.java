package X;

/* loaded from: classes5.dex */
public abstract class EQZ {
    public static final EQa A00 = new EQa(C7455EwY.A00);

    public static final String A00(Class<?> cls) {
        String str;
        EQa eQa = A00;
        EQV eqv = eQa.A00;
        synchronized (eqv) {
            String strInvoke = eqv.get(cls);
            if (strInvoke == null) {
                strInvoke = eQa.A01.invoke(cls);
                if (strInvoke.length() < 5) {
                    strInvoke = FGI.A0U("<cls>", cls.getName(), "</cls>");
                }
                eqv.put(cls, strInvoke);
            }
            str = strInvoke;
        }
        return str;
    }
}
