package X;

/* renamed from: X.ELj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6639ELj extends AbstractC6554EEq {
    @Override // X.AbstractC6554EEq
    public final void migrate(EJV ejv) {
        C7384Etj.A0Y(ejv, 0);
        EIW.A00(ejv, "ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        EIW.A00(ejv, "ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }

    public C6639ELj() {
        super(17, 18);
    }
}
