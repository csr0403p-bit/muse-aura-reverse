package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.F5m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7599F5m implements Ht9, G0U {
    public final int $t;
    public final Object A00;
    public final String A01;

    public C7599F5m(String str, Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
        this.A01 = str;
    }

    @Override // X.G0U
    public final Object invoke(Object obj) {
        EIK eikA00;
        switch (this.$t) {
            case 0:
                BzB bzB = (BzB) this.A00;
                String str = this.A01;
                eikA00 = EJV.A00((EJV) obj, "UPDATE workspec SET output=? WHERE id=?");
                try {
                    eikA00.A5A(1, BzB.A00(bzB));
                    eikA00.A5F(2, str);
                    eikA00.AgN();
                    eikA00.close();
                    return Unit.INSTANCE;
                } finally {
                }
            case 1:
                String str2 = this.A01;
                C6605EJh c6605EJh = (C6605EJh) this.A00;
                EJV ejv = (EJV) obj;
                C7384Etj.A0Y(ejv, 3);
                EIK eikAYO = ejv.AYO("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason, worker_class_name FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    eikAYO.A5F(1, str2);
                    DQd dQd = new DQd(0);
                    DQd dQd2 = new DQd(0);
                    while (eikAYO.AgN()) {
                        DQZ.A02(dQd, eikAYO, 0);
                        DQZ.A02(dQd2, eikAYO, 0);
                    }
                    eikAYO.reset();
                    C6605EJh.A01(dQd, ejv, c6605EJh);
                    C6605EJh.A00(dQd2, ejv, c6605EJh);
                    ArrayList arrayListA0h = C3cG.A0h();
                    while (eikAYO.AgN()) {
                        String strALa = eikAYO.ALa(0);
                        EnumC6619EKm enumC6619EKmA02 = EIK.A02(eikAYO, 1);
                        BzB bzBA01 = EIK.A01(eikAYO, 2);
                        int iA00 = EIK.A00(eikAYO, 3);
                        int iA002 = EIK.A00(eikAYO, 4);
                        long j = eikAYO.getLong(14);
                        long j2 = eikAYO.getLong(15);
                        long j3 = eikAYO.getLong(16);
                        Integer numA07 = EIK.A07(eikAYO, 17);
                        long j4 = eikAYO.getLong(18);
                        long j5 = eikAYO.getLong(19);
                        int iA003 = EIK.A00(eikAYO, 20);
                        long j6 = eikAYO.getLong(21);
                        int iA004 = EIK.A00(eikAYO, 22);
                        String strALa2 = eikAYO.ALa(23);
                        Integer numA06 = EIK.A06(eikAYO, 5);
                        EKL ekl = new EKL(EIK.A03(eikAYO, 6), numA06, EIK.A08(eikAYO, 13), eikAYO.getLong(11), eikAYO.getLong(12), BV7.A1U(eikAYO.getLong(7)), BV7.A1U(eikAYO.getLong(8)), BV7.A1U(eikAYO.getLong(9)), BV7.A1U(eikAYO.getLong(10)));
                        Object objA0L = AbstractC2258BHp.A0L(eikAYO.ALa(0), dQd);
                        C7384Etj.A0U(objA0L);
                        Object objA0L2 = AbstractC2258BHp.A0L(eikAYO.ALa(0), dQd2);
                        C7384Etj.A0U(objA0L2);
                        arrayListA0h.add(new EKM(ekl, bzBA01, enumC6619EKmA02, numA07, strALa, strALa2, (List) objA0L, (List) objA0L2, iA00, iA003, iA002, iA004, j, j2, j3, j4, j5, j6));
                    }
                    return arrayListA0h;
                } finally {
                    eikAYO.close();
                }
            default:
                EnumC6619EKm enumC6619EKm = (EnumC6619EKm) this.A00;
                String str3 = this.A01;
                EJV ejv2 = (EJV) obj;
                eikA00 = EJV.A00(ejv2, "UPDATE workspec SET state=? WHERE id=?");
                try {
                    eikA00.A5C(1, EKH.A00(enumC6619EKm));
                    return EIK.A04(ejv2, eikA00, str3, 2);
                } finally {
                }
        }
    }
}
