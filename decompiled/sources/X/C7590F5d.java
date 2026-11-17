package X;

import android.os.CancellationSignal;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.room.util.DBUtil__DBUtil_androidKt;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.facebook.aura.opengraph.HatchOpenGraphRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.F5d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7590F5d implements Ht9, G0U {
    public final int $t;
    public final Object A00;

    public C7590F5d(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    public static final void A01(StringBuilder sb, int i) {
        if (i > 0) {
            ArrayList arrayListA11 = C60O.A11(i);
            int i2 = 0;
            do {
                arrayListA11.add(HatchOpenGraphRepository.UNKNOWN_HOST);
                i2++;
            } while (i2 < i);
            sb.append(C3cH.A0e(",", arrayListA11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        EIE eie;
        double dA02;
        long jA05;
        int iA0F;
        Executor executorA04;
        Runnable runnable;
        switch (this.$t) {
            case 1:
            case 2:
                ((CancellationSignal) this.A00).cancel();
                return Unit.INSTANCE;
            case 3:
                final C4288CsU c4288CsU = (C4288CsU) this.A00;
                final GetCredentialException getCredentialException = (GetCredentialException) obj;
                C7384Etj.A0Y(getCredentialException, 1);
                executorA04 = c4288CsU.A04();
                runnable = new Runnable() { // from class: X.CtH
                    public static final String __redex_internal_original_name = "CredentialProviderBeginSignInController$$ExternalSyntheticLambda5";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C4288CsU c4288CsU2 = c4288CsU;
                        c4288CsU2.A03().AT2(getCredentialException);
                    }
                };
                break;
            case 4:
                final C4289CsX c4289CsX = (C4289CsX) this.A00;
                final GetCredentialException getCredentialException2 = (GetCredentialException) obj;
                C7384Etj.A0Y(getCredentialException2, 1);
                executorA04 = c4289CsX.A04();
                runnable = new Runnable() { // from class: X.CtN
                    public static final String __redex_internal_original_name = "CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda19";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C4289CsX c4289CsX2 = c4289CsX;
                        c4289CsX2.A03().AT2(getCredentialException2);
                    }
                };
                break;
            case 5:
                EIO eio = (EIO) this.A00;
                EI3 ei3 = (EI3) obj;
                C7384Etj.A0Y(ei3, 1);
                eio.A00 = ei3;
                return Unit.INSTANCE;
            case 6:
                EIN.createConnectionManager$lambda$2((EIN) this.A00, (EIQ) obj);
                throw F60.createAndThrow();
            case 7:
                return ((Function0) this.A00).invoke();
            case 8:
                G0U g0u = (G0U) this.A00;
                EIK eik = (EIK) obj;
                C7384Etj.A0Y(eik, 1);
                g0u.invoke(new EIH(eik));
                return Unit.INSTANCE;
            case 9:
                EIE eie2 = (EIE) this.A00;
                EIK eik2 = (EIK) obj;
                TreeMap<Integer, EIE> treeMap = EIE.A07;
                C7384Etj.A0Y(eik2, 1);
                int i = eie2.A00;
                if (1 <= i) {
                    int i2 = 1;
                    while (true) {
                        int i3 = eie2.A02[i2];
                        if (i3 == 1) {
                            eik2.A5D(i2);
                        } else if (i3 == 2) {
                            eik2.A5C(i2, eie2.A03[i2]);
                        } else if (i3 == 3) {
                            eik2.A5B(i2, eie2.A01[i2]);
                        } else if (i3 == 4) {
                            String str2 = eie2.A04[i2];
                            if (str2 == null) {
                                throw C60O.A0i("Required value was null.");
                            }
                            eik2.A5F(i2, str2);
                        } else if (i3 == 5) {
                            byte[] bArr = eie2.A05[i2];
                            if (bArr == null) {
                                throw C60O.A0i("Required value was null.");
                            }
                            eik2.A5A(i2, bArr);
                        }
                        if (i2 != i) {
                            i2++;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 10:
                EIF eif = (EIF) this.A00;
                WorkDatabase workDatabase = (WorkDatabase) obj;
                C7384Etj.A0Y(workDatabase, 1);
                BpS<List<EKM>, List<EKN>> bpS = EKE.A0P;
                EII value = ((WorkDatabase_Impl) workDatabase).A02.getValue();
                C7384Etj.A0Y(eif, 0);
                ArrayList arrayListA0h = C3cG.A0h();
                StringBuilder sbA0x = C60O.A0x("SELECT * FROM workspec");
                List<EnumC6619EKm> list = eif.A01;
                String str3 = " AND";
                if (list.isEmpty()) {
                    str = " WHERE";
                } else {
                    ArrayList arrayListA0m = AnonymousClass002.A0m(list);
                    Iterator<EnumC6619EKm> it = list.iterator();
                    while (it.hasNext()) {
                        C60Q.A1P(arrayListA0m, EKH.A00(it.next()));
                    }
                    A00(" WHERE state IN (", ")", sbA0x, arrayListA0m);
                    arrayListA0h.addAll(arrayListA0m);
                    str = " AND";
                }
                List<UUID> list2 = eif.A00;
                if (!list2.isEmpty()) {
                    ArrayList arrayListA0m2 = AnonymousClass002.A0m(list2);
                    Iterator<UUID> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayListA0m2.add(it2.next().toString());
                    }
                    A00(str.concat(" id IN ("), ")", sbA0x, list2);
                    arrayListA0h.addAll(arrayListA0m2);
                    str = " AND";
                }
                List<String> list3 = eif.A02;
                if (list3.isEmpty()) {
                    str3 = str;
                } else {
                    A00(str.concat(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN ("), "))", sbA0x, list3);
                    arrayListA0h.addAll(list3);
                }
                List<String> list4 = eif.A03;
                if (!list4.isEmpty()) {
                    A00(str3.concat(" id IN (SELECT work_spec_id FROM workname WHERE name IN ("), "))", sbA0x, list4);
                    arrayListA0h.addAll(list4);
                }
                String strA0v = AnonymousClass001.A0v(";", sbA0x);
                Object[] array = arrayListA0h.toArray(new Object[0]);
                final C6598EJa c6598EJa = (C6598EJa) value;
                int length = array != null ? array.length : 0;
                TreeMap<Integer, EIE> treeMap2 = EIE.A07;
                synchronized (treeMap2) {
                    Map.Entry<Integer, EIE> entryCeilingEntry = treeMap2.ceilingEntry(Integer.valueOf(length));
                    if (entryCeilingEntry != null) {
                        treeMap2.remove(entryCeilingEntry.getKey());
                        eie = entryCeilingEntry.getValue();
                        eie.A06 = strA0v;
                        eie.A00 = length;
                    } else {
                        eie = new EIE(length);
                        eie.A06 = strA0v;
                        eie.A00 = length;
                    }
                }
                if (array != null) {
                    int length2 = array.length;
                    int i4 = 0;
                    while (i4 < length2) {
                        Object obj2 = array[i4];
                        i4++;
                        if (obj2 == null) {
                            eie.A5D(i4);
                        } else if (obj2 instanceof byte[]) {
                            byte[] bArr2 = (byte[]) obj2;
                            C7384Etj.A0Y(bArr2, 1);
                            eie.A5A(i4, bArr2);
                        } else {
                            if (obj2 instanceof Float) {
                                dA02 = AnonymousClass001.A02(obj2);
                            } else if (obj2 instanceof Double) {
                                dA02 = BV6.A00(obj2);
                            } else {
                                if (obj2 instanceof Long) {
                                    jA05 = C3cG.A05(obj2);
                                } else {
                                    if (obj2 instanceof Integer) {
                                        iA0F = AnonymousClass001.A0F(obj2);
                                    } else if (obj2 instanceof Short) {
                                        iA0F = ((Number) obj2).shortValue();
                                    } else if (obj2 instanceof Byte) {
                                        iA0F = ((Number) obj2).byteValue();
                                    } else if (obj2 instanceof String) {
                                        String str4 = (String) obj2;
                                        C7384Etj.A0Y(str4, 1);
                                        eie.A5E(i4, str4);
                                    } else {
                                        if (!(obj2 instanceof Boolean)) {
                                            StringBuilder sbA0f = C3cG.A0f(obj2, "Cannot bind ");
                                            sbA0f.append(" at index ");
                                            sbA0f.append(i4);
                                            throw C8j3.A0w(" Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String", sbA0f);
                                        }
                                        jA05 = BV5.A06(AnonymousClass001.A1X(obj2) ? 1 : 0);
                                    }
                                    jA05 = iA0F;
                                }
                                eie.A5C(i4, jA05);
                            }
                            eie.A5B(i4, dA02);
                        }
                    }
                }
                final EIG eig = new EIG(eie.AKr(), new C7590F5d(eie, 9));
                final String str5 = eig.A00;
                Object objApply = bpS.apply(DBUtil__DBUtil_androidKt.A01(c6598EJa.A00, new G0U() { // from class: X.EKR
                    @Override // X.G0U
                    public final Object invoke(Object obj3) {
                        String str6 = str5;
                        EIG eig2 = eig;
                        C6598EJa c6598EJa2 = c6598EJa;
                        EJV ejv = (EJV) obj3;
                        EIK eikA00 = EJV.A00(ejv, str6);
                        try {
                            eig2.A01.invoke(eikA00);
                            C7384Etj.A0Y(eikA00, 0);
                            int iA00 = EJ0.A00(eikA00, "id");
                            int iA002 = EJ0.A00(eikA00, "state");
                            int iA003 = EJ0.A00(eikA00, "output");
                            int iA004 = EJ0.A00(eikA00, "initial_delay");
                            int iA005 = EJ0.A00(eikA00, "interval_duration");
                            int iA006 = EJ0.A00(eikA00, "flex_duration");
                            int iA007 = EJ0.A00(eikA00, "run_attempt_count");
                            int iA008 = EJ0.A00(eikA00, "backoff_policy");
                            int iA009 = EJ0.A00(eikA00, "backoff_delay_duration");
                            int iA0010 = EJ0.A00(eikA00, "last_enqueue_time");
                            int iA0011 = EJ0.A00(eikA00, "period_count");
                            int iA0012 = EJ0.A00(eikA00, "generation");
                            int iA0013 = EJ0.A00(eikA00, "next_schedule_time_override");
                            int iA0014 = EJ0.A00(eikA00, "stop_reason");
                            int iA0015 = EJ0.A00(eikA00, "worker_class_name");
                            int iA0016 = EJ0.A00(eikA00, "required_network_type");
                            int iA0017 = EJ0.A00(eikA00, "required_network_request");
                            int iA0018 = EJ0.A00(eikA00, "requires_charging");
                            int iA0019 = EJ0.A00(eikA00, "requires_device_idle");
                            int iA0020 = EJ0.A00(eikA00, "requires_battery_not_low");
                            int iA0021 = EJ0.A00(eikA00, "requires_storage_not_low");
                            int iA0022 = EJ0.A00(eikA00, "trigger_content_update_delay");
                            int iA0023 = EJ0.A00(eikA00, "trigger_max_content_delay");
                            int iA0024 = EJ0.A00(eikA00, "content_uri_triggers");
                            DQd dQd = new DQd(0);
                            DQd dQd2 = new DQd(0);
                            while (eikA00.AgN()) {
                                DQZ.A02(dQd, eikA00, iA00);
                                DQZ.A02(dQd2, eikA00, iA00);
                            }
                            eikA00.reset();
                            C6598EJa.A01(dQd, ejv, c6598EJa2);
                            C6598EJa.A00(dQd2, ejv, c6598EJa2);
                            ArrayList arrayListA0h2 = C3cG.A0h();
                            while (eikA00.AgN()) {
                                if (iA00 == -1) {
                                    throw C3cG.A0Q("Missing value for a NON-NULL column 'id', found NULL value instead.");
                                }
                                String strALa = eikA00.ALa(iA00);
                                if (iA002 == -1) {
                                    throw C3cG.A0Q("Missing value for a NON-NULL column 'state', found NULL value instead.");
                                }
                                EnumC6619EKm enumC6619EKmA02 = EIK.A02(eikA00, iA002);
                                if (iA003 == -1) {
                                    throw C3cG.A0Q("Missing value for a NON-NULL column 'output', found NULL value instead.");
                                }
                                BzB bzBA01 = EIK.A01(eikA00, iA003);
                                long j = iA004 == -1 ? 0L : eikA00.getLong(iA004);
                                long j2 = iA005 == -1 ? 0L : eikA00.getLong(iA005);
                                long j3 = iA006 == -1 ? 0L : eikA00.getLong(iA006);
                                boolean z = false;
                                int iA0025 = iA007 == -1 ? 0 : EIK.A00(eikA00, iA007);
                                if (iA008 == -1) {
                                    throw C3cG.A0Q("Missing value for a NON-NULL column 'backoff_policy', found NULL value instead.");
                                }
                                Integer numA07 = EIK.A07(eikA00, iA008);
                                long j4 = iA009 == -1 ? 0L : eikA00.getLong(iA009);
                                long j5 = iA0010 == -1 ? 0L : eikA00.getLong(iA0010);
                                int iA0026 = iA0011 == -1 ? 0 : EIK.A00(eikA00, iA0011);
                                int iA0027 = iA0012 == -1 ? 0 : EIK.A00(eikA00, iA0012);
                                long j6 = iA0013 == -1 ? 0L : eikA00.getLong(iA0013);
                                int iA0028 = iA0014 == -1 ? 0 : EIK.A00(eikA00, iA0014);
                                if (iA0015 == -1) {
                                    throw C3cG.A0Q("Missing value for a NON-NULL column 'worker_class_name', found NULL value instead.");
                                }
                                String strALa2 = eikA00.ALa(iA0015);
                                if (iA0016 == -1) {
                                    throw C3cG.A0Q("Missing value for a NON-NULL column 'required_network_type', found NULL value instead.");
                                }
                                Integer numA06 = EIK.A06(eikA00, iA0016);
                                if (iA0017 == -1) {
                                    throw C3cG.A0Q("Missing value for a NON-NULL column 'required_network_request', found NULL value instead.");
                                }
                                C7417EvK c7417EvKA03 = EIK.A03(eikA00, iA0017);
                                boolean zA1U = iA0018 == -1 ? false : BV7.A1U(eikA00.getLong(iA0018));
                                boolean zA1U2 = iA0019 == -1 ? false : BV7.A1U(eikA00.getLong(iA0019));
                                boolean zA1U3 = iA0020 == -1 ? false : BV7.A1U(eikA00.getLong(iA0020));
                                if (iA0021 != -1 && EIK.A00(eikA00, iA0021) != 0) {
                                    z = true;
                                }
                                long j7 = iA0022 == -1 ? 0L : eikA00.getLong(iA0022);
                                long j8 = iA0023 == -1 ? 0L : eikA00.getLong(iA0023);
                                if (iA0024 == -1) {
                                    throw C3cG.A0Q("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                                }
                                EKL ekl = new EKL(c7417EvKA03, numA06, EIK.A08(eikA00, iA0024), j7, j8, zA1U, zA1U2, zA1U3, z);
                                Object objA0L = AbstractC2258BHp.A0L(eikA00.ALa(iA00), dQd);
                                C7384Etj.A0U(objA0L);
                                Object objA0L2 = AbstractC2258BHp.A0L(eikA00.ALa(iA00), dQd2);
                                C7384Etj.A0U(objA0L2);
                                arrayListA0h2.add(new EKM(ekl, bzBA01, enumC6619EKmA02, numA07, strALa, strALa2, (List) objA0L, (List) objA0L2, iA0025, iA0026, iA0027, iA0028, j, j2, j3, j4, j5, j6));
                            }
                            return arrayListA0h2;
                        } finally {
                            eikA00.close();
                        }
                    }
                }, true, false));
                C7384Etj.A0U(objApply);
                return objApply;
            case 11:
                return ((C7587F5a) ((Function0) this.A00)).invoke();
            default:
                ((Future) this.A00).cancel(false);
                return Unit.INSTANCE;
        }
        executorA04.execute(runnable);
        return Unit.INSTANCE;
    }

    public static void A00(String str, String str2, StringBuilder sb, List list) {
        sb.append(str);
        A01(sb, list.size());
        sb.append(str2);
    }
}
