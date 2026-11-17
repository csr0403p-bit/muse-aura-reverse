package X;

/* renamed from: X.ELl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6641ELl extends AbstractC6554EEq {
    @Override // X.AbstractC6554EEq
    public final void migrate(EJV ejv) {
        C7384Etj.A0Y(ejv, 0);
        EIW.A00(ejv, "ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
    }

    public C6641ELl() {
        super(20, 21);
    }
}
