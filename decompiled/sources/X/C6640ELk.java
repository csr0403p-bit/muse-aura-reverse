package X;

/* renamed from: X.ELk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6640ELk extends AbstractC6554EEq {
    @Override // X.AbstractC6554EEq
    public final void migrate(EJV ejv) {
        C7384Etj.A0Y(ejv, 0);
        EIW.A00(ejv, "ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }

    public C6640ELk() {
        super(18, 19);
    }
}
