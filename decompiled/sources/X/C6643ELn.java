package X;

/* renamed from: X.ELn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6643ELn extends AbstractC6554EEq {
    @Override // X.AbstractC6554EEq
    public final void migrate(EJV ejv) {
        C7384Etj.A0Y(ejv, 0);
        EIW.A00(ejv, "ALTER TABLE `WorkSpec` ADD COLUMN `backoff_on_system_interruptions` INTEGER DEFAULT NULL");
    }

    public C6643ELn() {
        super(23, 24);
    }
}
