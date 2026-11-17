package X;

/* renamed from: X.ELm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6642ELm extends AbstractC6554EEq {
    @Override // X.AbstractC6554EEq
    public final void migrate(EJV ejv) {
        C7384Etj.A0Y(ejv, 0);
        EIW.A00(ejv, "ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
    }

    public C6642ELm() {
        super(22, 23);
    }
}
