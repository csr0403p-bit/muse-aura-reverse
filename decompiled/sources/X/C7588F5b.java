package X;

import com.facebook.aura.maps.model.HatchMapSceneKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Unit;

/* renamed from: X.F5b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7588F5b implements Ht9, G0U {
    public final int $t;

    public C7588F5b(int i) {
        this.$t = i;
    }

    public static EIK A00(Object obj, String str) {
        EJV ejv = (EJV) obj;
        C7384Etj.A0Y(ejv, 1);
        return ejv.AYO(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x09e1: INVOKE (r1 I:X.EIK) INTERFACE call: X.EIK.close():void A[MD:():void (m)] (LINE:2529), block:B:181:0x09e1 */
    @Override // X.G0U
    public final Object invoke(Object obj) {
        EIK eikA00;
        ArrayList arrayListA0h;
        try {
            try {
                switch (this.$t) {
                    case 0:
                        EIK eik = (EIK) obj;
                        C7384Etj.A0Y(eik, 0);
                        return Boolean.valueOf(eik.AgN());
                    case 1:
                        EIK eik2 = (EIK) obj;
                        C7384Etj.A0Y(eik2, 0);
                        AIY aiy = new AIY();
                        while (eik2.AgN()) {
                            C60Q.A1P(aiy, EIK.A00(eik2, 0));
                        }
                        return AIX.A00(aiy);
                    case 2:
                        Map.Entry entry = (Map.Entry) obj;
                        BzB bzB = BzB.A01;
                        C7384Etj.A0Y(entry, 0);
                        String strA0t = C60O.A0t(entry);
                        Object value = entry.getValue();
                        if (value instanceof Object[]) {
                            value = Arrays.toString((Object[]) value);
                            C7384Etj.A0U(value);
                        }
                        return AnonymousClass006.A0y(value, " : ", C3cG.A0g(strA0t));
                    case 3:
                        eikA00 = A00(obj, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                        arrayListA0h = C3cG.A0h();
                        while (eikA00.AgN()) {
                            EIK.A0A(eikA00, arrayListA0h);
                        }
                        break;
                    case 4:
                        EIK eikA002 = A00(obj, "DELETE FROM WorkProgress");
                        eikA002.AgN();
                        eikA002.close();
                        return Unit.INSTANCE;
                    case 5:
                        eikA00 = A00(obj, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                        int iA00 = EJ1.A00(eikA00, "id");
                        int iA002 = EJ1.A00(eikA00, "state");
                        int iA003 = EJ1.A00(eikA00, "worker_class_name");
                        int iA004 = EJ1.A00(eikA00, "input_merger_class_name");
                        int iA005 = EJ1.A00(eikA00, "input");
                        int iA006 = EJ1.A00(eikA00, "output");
                        int iA007 = EJ1.A00(eikA00, "initial_delay");
                        int iA008 = EJ1.A00(eikA00, "interval_duration");
                        int iA009 = EJ1.A00(eikA00, "flex_duration");
                        int iA0010 = EJ1.A00(eikA00, "run_attempt_count");
                        int iA0011 = EJ1.A00(eikA00, "backoff_policy");
                        int iA0012 = EJ1.A00(eikA00, "backoff_delay_duration");
                        int iA0013 = EJ1.A00(eikA00, "last_enqueue_time");
                        int iA0014 = EJ1.A00(eikA00, "minimum_retention_duration");
                        int iA0015 = EJ1.A00(eikA00, "schedule_requested_at");
                        int iA0016 = EJ1.A00(eikA00, "run_in_foreground");
                        int iA0017 = EJ1.A00(eikA00, "out_of_quota_policy");
                        int iA0018 = EJ1.A00(eikA00, "period_count");
                        int iA0019 = EJ1.A00(eikA00, "generation");
                        int iA0020 = EJ1.A00(eikA00, "next_schedule_time_override");
                        int iA0021 = EJ1.A00(eikA00, "next_schedule_time_override_generation");
                        int iA0022 = EJ1.A00(eikA00, "stop_reason");
                        int iA0023 = EJ1.A00(eikA00, "trace_tag");
                        int iA0024 = EJ1.A00(eikA00, "backoff_on_system_interruptions");
                        int iA0025 = EJ1.A00(eikA00, "required_network_type");
                        int iA0026 = EJ1.A00(eikA00, "required_network_request");
                        int iA0027 = EJ1.A00(eikA00, "requires_charging");
                        int iA0028 = EJ1.A00(eikA00, "requires_device_idle");
                        int iA0029 = EJ1.A00(eikA00, "requires_battery_not_low");
                        int iA0030 = EJ1.A00(eikA00, "requires_storage_not_low");
                        int iA0031 = EJ1.A00(eikA00, "trigger_content_update_delay");
                        int iA0032 = EJ1.A00(eikA00, "trigger_max_content_delay");
                        int iA0033 = EJ1.A00(eikA00, "content_uri_triggers");
                        arrayListA0h = C3cG.A0h();
                        while (eikA00.AgN()) {
                            String strALa = eikA00.ALa(iA00);
                            EnumC6619EKm enumC6619EKmA02 = EIK.A02(eikA00, iA002);
                            String strALa2 = eikA00.ALa(iA003);
                            String strALa3 = eikA00.ALa(iA004);
                            BzB bzBA01 = EIK.A01(eikA00, iA005);
                            BzB bzBA012 = EIK.A01(eikA00, iA006);
                            long j = eikA00.getLong(iA007);
                            long j2 = eikA00.getLong(iA008);
                            long j3 = eikA00.getLong(iA009);
                            int iA0034 = EIK.A00(eikA00, iA0010);
                            Integer numA07 = EIK.A07(eikA00, iA0011);
                            long j4 = eikA00.getLong(iA0012);
                            long j5 = eikA00.getLong(iA0013);
                            long j6 = eikA00.getLong(iA0014);
                            long j7 = eikA00.getLong(iA0015);
                            boolean zA1U = BV7.A1U(eikA00.getLong(iA0016));
                            Integer numA02 = EKH.A02(EIK.A00(eikA00, iA0017));
                            int iA0035 = EIK.A00(eikA00, iA0018);
                            int iA0036 = EIK.A00(eikA00, iA0019);
                            long j8 = eikA00.getLong(iA0020);
                            int iA0037 = EIK.A00(eikA00, iA0021);
                            int iA0038 = EIK.A00(eikA00, iA0022);
                            String strALa4 = eikA00.isNull(iA0023) ? null : eikA00.ALa(iA0023);
                            Integer numA05 = eikA00.isNull(iA0024) ? null : EIK.A05(eikA00, iA0024);
                            arrayListA0h.add(new EKE(new EKL(EIK.A03(eikA00, iA0026), EIK.A06(eikA00, iA0025), EIK.A08(eikA00, iA0033), eikA00.getLong(iA0031), eikA00.getLong(iA0032), BV7.A1U(eikA00.getLong(iA0027)), BV7.A1U(eikA00.getLong(iA0028)), BV7.A1U(eikA00.getLong(iA0029)), BV7.A1U(eikA00.getLong(iA0030))), bzBA01, bzBA012, enumC6619EKmA02, numA05 != null ? Boolean.valueOf(AnonymousClass002.A1L(numA05.intValue())) : null, numA07, numA02, strALa, strALa2, strALa3, strALa4, iA0034, iA0035, iA0036, iA0037, iA0038, j, j2, j3, j4, j5, j6, j7, j8, zA1U));
                        }
                        break;
                    case 6:
                        EIK eikA003 = A00(obj, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                        int iA0039 = eikA003.AgN() ? EIK.A00(eikA003, 0) : 0;
                        eikA003.close();
                        return Integer.valueOf(iA0039);
                    case 7:
                        EIK eikA004 = A00(obj, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                        boolean z = false;
                        if (eikA004.AgN() && EIK.A00(eikA004, 0) != 0) {
                            z = true;
                        }
                        eikA004.close();
                        return Boolean.valueOf(z);
                    case 8:
                        eikA00 = EJV.A01(obj, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
                        eikA00.A5C(1, 200L);
                        int iA0040 = EJ1.A00(eikA00, "id");
                        int iA0041 = EJ1.A00(eikA00, "state");
                        int iA0042 = EJ1.A00(eikA00, "worker_class_name");
                        int iA0043 = EJ1.A00(eikA00, "input_merger_class_name");
                        int iA0044 = EJ1.A00(eikA00, "input");
                        int iA0045 = EJ1.A00(eikA00, "output");
                        int iA0046 = EJ1.A00(eikA00, "initial_delay");
                        int iA0047 = EJ1.A00(eikA00, "interval_duration");
                        int iA0048 = EJ1.A00(eikA00, "flex_duration");
                        int iA0049 = EJ1.A00(eikA00, "run_attempt_count");
                        int iA0050 = EJ1.A00(eikA00, "backoff_policy");
                        int iA0051 = EJ1.A00(eikA00, "backoff_delay_duration");
                        int iA0052 = EJ1.A00(eikA00, "last_enqueue_time");
                        int iA0053 = EJ1.A00(eikA00, "minimum_retention_duration");
                        int iA0054 = EJ1.A00(eikA00, "schedule_requested_at");
                        int iA0055 = EJ1.A00(eikA00, "run_in_foreground");
                        int iA0056 = EJ1.A00(eikA00, "out_of_quota_policy");
                        int iA0057 = EJ1.A00(eikA00, "period_count");
                        int iA0058 = EJ1.A00(eikA00, "generation");
                        int iA0059 = EJ1.A00(eikA00, "next_schedule_time_override");
                        int iA0060 = EJ1.A00(eikA00, "next_schedule_time_override_generation");
                        int iA0061 = EJ1.A00(eikA00, "stop_reason");
                        int iA0062 = EJ1.A00(eikA00, "trace_tag");
                        int iA0063 = EJ1.A00(eikA00, "backoff_on_system_interruptions");
                        int iA0064 = EJ1.A00(eikA00, "required_network_type");
                        int iA0065 = EJ1.A00(eikA00, "required_network_request");
                        int iA0066 = EJ1.A00(eikA00, "requires_charging");
                        int iA0067 = EJ1.A00(eikA00, "requires_device_idle");
                        int iA0068 = EJ1.A00(eikA00, "requires_battery_not_low");
                        int iA0069 = EJ1.A00(eikA00, "requires_storage_not_low");
                        int iA0070 = EJ1.A00(eikA00, "trigger_content_update_delay");
                        int iA0071 = EJ1.A00(eikA00, "trigger_max_content_delay");
                        int iA0072 = EJ1.A00(eikA00, "content_uri_triggers");
                        arrayListA0h = C3cG.A0h();
                        while (eikA00.AgN()) {
                            String strALa5 = eikA00.ALa(iA0040);
                            EnumC6619EKm enumC6619EKmA022 = EIK.A02(eikA00, iA0041);
                            String strALa6 = eikA00.ALa(iA0042);
                            String strALa7 = eikA00.ALa(iA0043);
                            BzB bzBA013 = EIK.A01(eikA00, iA0044);
                            BzB bzBA014 = EIK.A01(eikA00, iA0045);
                            long j9 = eikA00.getLong(iA0046);
                            long j10 = eikA00.getLong(iA0047);
                            long j11 = eikA00.getLong(iA0048);
                            int iA0073 = EIK.A00(eikA00, iA0049);
                            Integer numA072 = EIK.A07(eikA00, iA0050);
                            long j12 = eikA00.getLong(iA0051);
                            long j13 = eikA00.getLong(iA0052);
                            long j14 = eikA00.getLong(iA0053);
                            long j15 = eikA00.getLong(iA0054);
                            boolean zA1U2 = BV7.A1U(eikA00.getLong(iA0055));
                            Integer numA022 = EKH.A02(EIK.A00(eikA00, iA0056));
                            int iA0074 = EIK.A00(eikA00, iA0057);
                            int iA0075 = EIK.A00(eikA00, iA0058);
                            long j16 = eikA00.getLong(iA0059);
                            int iA0076 = EIK.A00(eikA00, iA0060);
                            int iA0077 = EIK.A00(eikA00, iA0061);
                            String strALa8 = eikA00.isNull(iA0062) ? null : eikA00.ALa(iA0062);
                            Integer numA052 = eikA00.isNull(iA0063) ? null : EIK.A05(eikA00, iA0063);
                            arrayListA0h.add(new EKE(new EKL(EIK.A03(eikA00, iA0065), EIK.A06(eikA00, iA0064), EIK.A08(eikA00, iA0072), eikA00.getLong(iA0070), eikA00.getLong(iA0071), BV7.A1U(eikA00.getLong(iA0066)), BV7.A1U(eikA00.getLong(iA0067)), BV7.A1U(eikA00.getLong(iA0068)), BV7.A1U(eikA00.getLong(iA0069))), bzBA013, bzBA014, enumC6619EKmA022, numA052 != null ? Boolean.valueOf(AnonymousClass002.A1L(numA052.intValue())) : null, numA072, numA022, strALa5, strALa6, strALa7, strALa8, iA0073, iA0074, iA0075, iA0076, iA0077, j9, j10, j11, j12, j13, j14, j15, j16, zA1U2));
                        }
                        break;
                    case 9:
                        EJV ejv = (EJV) obj;
                        C7384Etj.A0Y(ejv, 1);
                        EIK eikAYO = ejv.AYO("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                        eikAYO.AgN();
                        int iA0078 = EJZ.A00(ejv);
                        eikAYO.close();
                        return Integer.valueOf(iA0078);
                    case 10:
                        eikA00 = EJV.A01(obj, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
                        eikA00.A5C(1, 20L);
                        int iA0079 = EJ1.A00(eikA00, "id");
                        int iA0080 = EJ1.A00(eikA00, "state");
                        int iA0081 = EJ1.A00(eikA00, "worker_class_name");
                        int iA0082 = EJ1.A00(eikA00, "input_merger_class_name");
                        int iA0083 = EJ1.A00(eikA00, "input");
                        int iA0084 = EJ1.A00(eikA00, "output");
                        int iA0085 = EJ1.A00(eikA00, "initial_delay");
                        int iA0086 = EJ1.A00(eikA00, "interval_duration");
                        int iA0087 = EJ1.A00(eikA00, "flex_duration");
                        int iA0088 = EJ1.A00(eikA00, "run_attempt_count");
                        int iA0089 = EJ1.A00(eikA00, "backoff_policy");
                        int iA0090 = EJ1.A00(eikA00, "backoff_delay_duration");
                        int iA0091 = EJ1.A00(eikA00, "last_enqueue_time");
                        int iA0092 = EJ1.A00(eikA00, "minimum_retention_duration");
                        int iA0093 = EJ1.A00(eikA00, "schedule_requested_at");
                        int iA0094 = EJ1.A00(eikA00, "run_in_foreground");
                        int iA0095 = EJ1.A00(eikA00, "out_of_quota_policy");
                        int iA0096 = EJ1.A00(eikA00, "period_count");
                        int iA0097 = EJ1.A00(eikA00, "generation");
                        int iA0098 = EJ1.A00(eikA00, "next_schedule_time_override");
                        int iA0099 = EJ1.A00(eikA00, "next_schedule_time_override_generation");
                        int iA00100 = EJ1.A00(eikA00, "stop_reason");
                        int iA00101 = EJ1.A00(eikA00, "trace_tag");
                        int iA00102 = EJ1.A00(eikA00, "backoff_on_system_interruptions");
                        int iA00103 = EJ1.A00(eikA00, "required_network_type");
                        int iA00104 = EJ1.A00(eikA00, "required_network_request");
                        int iA00105 = EJ1.A00(eikA00, "requires_charging");
                        int iA00106 = EJ1.A00(eikA00, "requires_device_idle");
                        int iA00107 = EJ1.A00(eikA00, "requires_battery_not_low");
                        int iA00108 = EJ1.A00(eikA00, "requires_storage_not_low");
                        int iA00109 = EJ1.A00(eikA00, "trigger_content_update_delay");
                        int iA00110 = EJ1.A00(eikA00, "trigger_max_content_delay");
                        int iA00111 = EJ1.A00(eikA00, "content_uri_triggers");
                        arrayListA0h = C3cG.A0h();
                        while (eikA00.AgN()) {
                            String strALa9 = eikA00.ALa(iA0079);
                            EnumC6619EKm enumC6619EKmA023 = EIK.A02(eikA00, iA0080);
                            String strALa10 = eikA00.ALa(iA0081);
                            String strALa11 = eikA00.ALa(iA0082);
                            BzB bzBA015 = EIK.A01(eikA00, iA0083);
                            BzB bzBA016 = EIK.A01(eikA00, iA0084);
                            long j17 = eikA00.getLong(iA0085);
                            long j18 = eikA00.getLong(iA0086);
                            long j19 = eikA00.getLong(iA0087);
                            int iA00112 = EIK.A00(eikA00, iA0088);
                            Integer numA073 = EIK.A07(eikA00, iA0089);
                            long j20 = eikA00.getLong(iA0090);
                            long j21 = eikA00.getLong(iA0091);
                            long j22 = eikA00.getLong(iA0092);
                            long j23 = eikA00.getLong(iA0093);
                            boolean zA1U3 = BV7.A1U(eikA00.getLong(iA0094));
                            Integer numA023 = EKH.A02(EIK.A00(eikA00, iA0095));
                            int iA00113 = EIK.A00(eikA00, iA0096);
                            int iA00114 = EIK.A00(eikA00, iA0097);
                            long j24 = eikA00.getLong(iA0098);
                            int iA00115 = EIK.A00(eikA00, iA0099);
                            int iA00116 = EIK.A00(eikA00, iA00100);
                            String strALa12 = eikA00.isNull(iA00101) ? null : eikA00.ALa(iA00101);
                            Integer numA053 = eikA00.isNull(iA00102) ? null : EIK.A05(eikA00, iA00102);
                            arrayListA0h.add(new EKE(new EKL(EIK.A03(eikA00, iA00104), EIK.A06(eikA00, iA00103), EIK.A08(eikA00, iA00111), eikA00.getLong(iA00109), eikA00.getLong(iA00110), BV7.A1U(eikA00.getLong(iA00105)), BV7.A1U(eikA00.getLong(iA00106)), BV7.A1U(eikA00.getLong(iA00107)), BV7.A1U(eikA00.getLong(iA00108))), bzBA015, bzBA016, enumC6619EKmA023, numA053 != null ? Boolean.valueOf(AnonymousClass002.A1L(numA053.intValue())) : null, numA073, numA023, strALa9, strALa10, strALa11, strALa12, iA00112, iA00113, iA00114, iA00115, iA00116, j17, j18, j19, j20, j21, j22, j23, j24, zA1U3));
                        }
                        break;
                    case 11:
                        eikA00 = A00(obj, "SELECT * FROM workspec WHERE state=1");
                        int iA00117 = EJ1.A00(eikA00, "id");
                        int iA00118 = EJ1.A00(eikA00, "state");
                        int iA00119 = EJ1.A00(eikA00, "worker_class_name");
                        int iA00120 = EJ1.A00(eikA00, "input_merger_class_name");
                        int iA00121 = EJ1.A00(eikA00, "input");
                        int iA00122 = EJ1.A00(eikA00, "output");
                        int iA00123 = EJ1.A00(eikA00, "initial_delay");
                        int iA00124 = EJ1.A00(eikA00, "interval_duration");
                        int iA00125 = EJ1.A00(eikA00, "flex_duration");
                        int iA00126 = EJ1.A00(eikA00, "run_attempt_count");
                        int iA00127 = EJ1.A00(eikA00, "backoff_policy");
                        int iA00128 = EJ1.A00(eikA00, "backoff_delay_duration");
                        int iA00129 = EJ1.A00(eikA00, "last_enqueue_time");
                        int iA00130 = EJ1.A00(eikA00, "minimum_retention_duration");
                        int iA00131 = EJ1.A00(eikA00, "schedule_requested_at");
                        int iA00132 = EJ1.A00(eikA00, "run_in_foreground");
                        int iA00133 = EJ1.A00(eikA00, "out_of_quota_policy");
                        int iA00134 = EJ1.A00(eikA00, "period_count");
                        int iA00135 = EJ1.A00(eikA00, "generation");
                        int iA00136 = EJ1.A00(eikA00, "next_schedule_time_override");
                        int iA00137 = EJ1.A00(eikA00, "next_schedule_time_override_generation");
                        int iA00138 = EJ1.A00(eikA00, "stop_reason");
                        int iA00139 = EJ1.A00(eikA00, "trace_tag");
                        int iA00140 = EJ1.A00(eikA00, "backoff_on_system_interruptions");
                        int iA00141 = EJ1.A00(eikA00, "required_network_type");
                        int iA00142 = EJ1.A00(eikA00, "required_network_request");
                        int iA00143 = EJ1.A00(eikA00, "requires_charging");
                        int iA00144 = EJ1.A00(eikA00, "requires_device_idle");
                        int iA00145 = EJ1.A00(eikA00, "requires_battery_not_low");
                        int iA00146 = EJ1.A00(eikA00, "requires_storage_not_low");
                        int iA00147 = EJ1.A00(eikA00, "trigger_content_update_delay");
                        int iA00148 = EJ1.A00(eikA00, "trigger_max_content_delay");
                        int iA00149 = EJ1.A00(eikA00, "content_uri_triggers");
                        arrayListA0h = C3cG.A0h();
                        while (eikA00.AgN()) {
                            String strALa13 = eikA00.ALa(iA00117);
                            EnumC6619EKm enumC6619EKmA024 = EIK.A02(eikA00, iA00118);
                            String strALa14 = eikA00.ALa(iA00119);
                            String strALa15 = eikA00.ALa(iA00120);
                            BzB bzBA017 = EIK.A01(eikA00, iA00121);
                            BzB bzBA018 = EIK.A01(eikA00, iA00122);
                            long j25 = eikA00.getLong(iA00123);
                            long j26 = eikA00.getLong(iA00124);
                            long j27 = eikA00.getLong(iA00125);
                            int iA00150 = EIK.A00(eikA00, iA00126);
                            Integer numA074 = EIK.A07(eikA00, iA00127);
                            long j28 = eikA00.getLong(iA00128);
                            long j29 = eikA00.getLong(iA00129);
                            long j30 = eikA00.getLong(iA00130);
                            long j31 = eikA00.getLong(iA00131);
                            boolean zA1U4 = BV7.A1U(eikA00.getLong(iA00132));
                            Integer numA024 = EKH.A02(EIK.A00(eikA00, iA00133));
                            int iA00151 = EIK.A00(eikA00, iA00134);
                            int iA00152 = EIK.A00(eikA00, iA00135);
                            long j32 = eikA00.getLong(iA00136);
                            int iA00153 = EIK.A00(eikA00, iA00137);
                            int iA00154 = EIK.A00(eikA00, iA00138);
                            String strALa16 = eikA00.isNull(iA00139) ? null : eikA00.ALa(iA00139);
                            Integer numA054 = eikA00.isNull(iA00140) ? null : EIK.A05(eikA00, iA00140);
                            arrayListA0h.add(new EKE(new EKL(EIK.A03(eikA00, iA00142), EIK.A06(eikA00, iA00141), EIK.A08(eikA00, iA00149), eikA00.getLong(iA00147), eikA00.getLong(iA00148), BV7.A1U(eikA00.getLong(iA00143)), BV7.A1U(eikA00.getLong(iA00144)), BV7.A1U(eikA00.getLong(iA00145)), BV7.A1U(eikA00.getLong(iA00146))), bzBA017, bzBA018, enumC6619EKmA024, numA054 != null ? Boolean.valueOf(AnonymousClass002.A1L(numA054.intValue())) : null, numA074, numA024, strALa13, strALa14, strALa15, strALa16, iA00150, iA00151, iA00152, iA00153, iA00154, j25, j26, j27, j28, j29, j30, j31, j32, zA1U4));
                        }
                        break;
                    case 12:
                        eikA00 = A00(obj, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
                        int iA00155 = EJ1.A00(eikA00, "id");
                        int iA00156 = EJ1.A00(eikA00, "state");
                        int iA00157 = EJ1.A00(eikA00, "worker_class_name");
                        int iA00158 = EJ1.A00(eikA00, "input_merger_class_name");
                        int iA00159 = EJ1.A00(eikA00, "input");
                        int iA00160 = EJ1.A00(eikA00, "output");
                        int iA00161 = EJ1.A00(eikA00, "initial_delay");
                        int iA00162 = EJ1.A00(eikA00, "interval_duration");
                        int iA00163 = EJ1.A00(eikA00, "flex_duration");
                        int iA00164 = EJ1.A00(eikA00, "run_attempt_count");
                        int iA00165 = EJ1.A00(eikA00, "backoff_policy");
                        int iA00166 = EJ1.A00(eikA00, "backoff_delay_duration");
                        int iA00167 = EJ1.A00(eikA00, "last_enqueue_time");
                        int iA00168 = EJ1.A00(eikA00, "minimum_retention_duration");
                        int iA00169 = EJ1.A00(eikA00, "schedule_requested_at");
                        int iA00170 = EJ1.A00(eikA00, "run_in_foreground");
                        int iA00171 = EJ1.A00(eikA00, "out_of_quota_policy");
                        int iA00172 = EJ1.A00(eikA00, "period_count");
                        int iA00173 = EJ1.A00(eikA00, "generation");
                        int iA00174 = EJ1.A00(eikA00, "next_schedule_time_override");
                        int iA00175 = EJ1.A00(eikA00, "next_schedule_time_override_generation");
                        int iA00176 = EJ1.A00(eikA00, "stop_reason");
                        int iA00177 = EJ1.A00(eikA00, "trace_tag");
                        int iA00178 = EJ1.A00(eikA00, "backoff_on_system_interruptions");
                        int iA00179 = EJ1.A00(eikA00, "required_network_type");
                        int iA00180 = EJ1.A00(eikA00, "required_network_request");
                        int iA00181 = EJ1.A00(eikA00, "requires_charging");
                        int iA00182 = EJ1.A00(eikA00, "requires_device_idle");
                        int iA00183 = EJ1.A00(eikA00, "requires_battery_not_low");
                        int iA00184 = EJ1.A00(eikA00, "requires_storage_not_low");
                        int iA00185 = EJ1.A00(eikA00, "trigger_content_update_delay");
                        int iA00186 = EJ1.A00(eikA00, "trigger_max_content_delay");
                        int iA00187 = EJ1.A00(eikA00, "content_uri_triggers");
                        arrayListA0h = C3cG.A0h();
                        while (eikA00.AgN()) {
                            String strALa17 = eikA00.ALa(iA00155);
                            EnumC6619EKm enumC6619EKmA025 = EIK.A02(eikA00, iA00156);
                            String strALa18 = eikA00.ALa(iA00157);
                            String strALa19 = eikA00.ALa(iA00158);
                            BzB bzBA019 = EIK.A01(eikA00, iA00159);
                            BzB bzBA0110 = EIK.A01(eikA00, iA00160);
                            long j33 = eikA00.getLong(iA00161);
                            long j34 = eikA00.getLong(iA00162);
                            long j35 = eikA00.getLong(iA00163);
                            int iA00188 = EIK.A00(eikA00, iA00164);
                            Integer numA075 = EIK.A07(eikA00, iA00165);
                            long j36 = eikA00.getLong(iA00166);
                            long j37 = eikA00.getLong(iA00167);
                            long j38 = eikA00.getLong(iA00168);
                            long j39 = eikA00.getLong(iA00169);
                            boolean zA1U5 = BV7.A1U(eikA00.getLong(iA00170));
                            Integer numA025 = EKH.A02(EIK.A00(eikA00, iA00171));
                            int iA00189 = EIK.A00(eikA00, iA00172);
                            int iA00190 = EIK.A00(eikA00, iA00173);
                            long j40 = eikA00.getLong(iA00174);
                            int iA00191 = EIK.A00(eikA00, iA00175);
                            int iA00192 = EIK.A00(eikA00, iA00176);
                            String strALa20 = eikA00.isNull(iA00177) ? null : eikA00.ALa(iA00177);
                            Integer numA055 = eikA00.isNull(iA00178) ? null : EIK.A05(eikA00, iA00178);
                            arrayListA0h.add(new EKE(new EKL(EIK.A03(eikA00, iA00180), EIK.A06(eikA00, iA00179), EIK.A08(eikA00, iA00187), eikA00.getLong(iA00185), eikA00.getLong(iA00186), BV7.A1U(eikA00.getLong(iA00181)), BV7.A1U(eikA00.getLong(iA00182)), BV7.A1U(eikA00.getLong(iA00183)), BV7.A1U(eikA00.getLong(iA00184))), bzBA019, bzBA0110, enumC6619EKmA025, numA055 != null ? Boolean.valueOf(AnonymousClass002.A1L(numA055.intValue())) : null, numA075, numA025, strALa17, strALa18, strALa19, strALa20, iA00188, iA00189, iA00190, iA00191, iA00192, j33, j34, j35, j36, j37, j38, j39, j40, zA1U5));
                        }
                        break;
                    case 13:
                        Map.Entry entry2 = (Map.Entry) obj;
                        C7384Etj.A0Y(entry2, 0);
                        String strA0t2 = C60O.A0t(entry2);
                        Object value2 = entry2.getValue();
                        StringBuilder sbA0w = C60O.A0w();
                        AbstractC3195C2t.A00(sbA0w, strA0t2);
                        sbA0w.append(HatchMapSceneKt.ARTIFACT_ID_SEPARATOR);
                        return C8j3.A14(value2, sbA0w);
                    default:
                        return null;
                }
                eikA00.close();
                return arrayListA0h;
            } catch (Throwable th) {
                throw th;
            }
        } finally {
            obj.close();
        }
    }
}
