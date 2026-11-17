package X;

/* loaded from: classes5.dex */
public interface EJV extends AutoCloseable {
    static EIK A00(EJV ejv, String str) {
        C7384Etj.A0Y(ejv, 3);
        return ejv.AYO(str);
    }

    boolean ANT();

    EIK AYO(String str);

    @Override // java.lang.AutoCloseable
    void close();

    static EIK A01(Object obj, String str) {
        EJV ejv = (EJV) obj;
        C7384Etj.A0Y(ejv, 2);
        return ejv.AYO(str);
    }
}
