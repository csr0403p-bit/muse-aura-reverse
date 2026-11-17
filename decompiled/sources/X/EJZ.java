package X;

/* loaded from: classes5.dex */
public abstract class EJZ {
    public static final int A00(EJV ejv) {
        EIK eikAYO = ejv.AYO("SELECT changes()");
        try {
            eikAYO.AgN();
            int iA00 = EIK.A00(eikAYO, 0);
            eikAYO.close();
            return iA00;
        } finally {
        }
    }
}
