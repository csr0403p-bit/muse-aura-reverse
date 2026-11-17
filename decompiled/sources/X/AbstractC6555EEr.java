package X;

/* renamed from: X.EEr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6555EEr {
    public void onCreate(EJV ejv) {
        C7384Etj.A0Y(ejv, 0);
    }

    public void onDestructiveMigration(EJV ejv) {
        C7384Etj.A0Y(ejv, 0);
    }

    public abstract void onOpen(EI3 ei3);

    public void onOpen(EJV ejv) {
        C7384Etj.A0Y(ejv, 0);
        if (ejv instanceof EI7) {
            onOpen(((EI7) ejv).A00);
        }
    }

    public void onCreate(EI3 ei3) {
    }

    public void onDestructiveMigration(EI3 ei3) {
    }
}
