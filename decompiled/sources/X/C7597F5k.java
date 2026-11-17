package X;

import kotlin.Unit;

/* renamed from: X.F5k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7597F5k implements Ht9, G0U {
    public final int $t;
    public final long A00;
    public final String A01;

    public C7597F5k(long j, String str, int i) {
        this.$t = i;
        this.A00 = j;
        this.A01 = str;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0038: INVOKE (r1 I:X.EIK) INTERFACE call: X.EIK.close():void A[MD:():void (m)] (LINE:56), block:B:12:0x0038 */
    @Override // X.G0U
    public final Object invoke(Object obj) {
        EIK eikClose;
        try {
            if (this.$t == 0) {
                long j = this.A00;
                String str = this.A01;
                EJV ejv = (EJV) obj;
                EIK eikA00 = EJV.A00(ejv, "UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                eikA00.A5C(1, j);
                return EIK.A04(ejv, eikA00, str, 2);
            }
            long j2 = this.A00;
            String str2 = this.A01;
            EIK eikA002 = EJV.A00((EJV) obj, "UPDATE workspec SET last_enqueue_time=? WHERE id=?");
            eikA002.A5C(1, j2);
            eikA002.A5F(2, str2);
            eikA002.AgN();
            eikA002.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            eikClose.close();
            throw th;
        }
    }
}
