package X;

import kotlin.Unit;

/* renamed from: X.F5l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7598F5l implements Ht9, G0U {
    public final int $t;
    public final int A00;
    public final String A01;

    public C7598F5l(int i, String str, int i2) {
        this.$t = i2;
        this.A00 = i;
        this.A01 = str;
    }

    @Override // X.G0U
    public final Object invoke(Object obj) {
        EIK eikA00;
        try {
            switch (this.$t) {
                case 0:
                    String str = this.A01;
                    int i = this.A00;
                    EIK eikA002 = EJV.A00((EJV) obj, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                    try {
                        eikA002.A5F(1, str);
                        eikA002.A5C(2, i);
                        return eikA002.AgN() ? new ELO(eikA002.ALa(EJ1.A00(eikA002, "work_spec_id")), EIK.A00(eikA002, EJ1.A00(eikA002, "generation")), EIK.A00(eikA002, EJ1.A00(eikA002, "system_id"))) : null;
                    } finally {
                        eikA002.close();
                    }
                case 1:
                    int i2 = this.A00;
                    String str2 = this.A01;
                    eikA00 = EJV.A00((EJV) obj, "UPDATE workspec SET stop_reason=? WHERE id=?");
                    eikA00.A5C(1, i2);
                    eikA00.A5F(2, str2);
                    break;
                default:
                    String str3 = this.A01;
                    int i3 = this.A00;
                    eikA00 = EJV.A00((EJV) obj, "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                    eikA00.A5F(1, str3);
                    eikA00.A5C(2, i3);
                    break;
            }
            eikA00.AgN();
            eikA00.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            eikA00.close();
            throw th;
        }
    }
}
