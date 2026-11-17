package X;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class Cc0 extends AbstractC3512CRm {
    public static final AtomicBoolean A06 = BV4.A12(true);
    public static final CAC A07 = CAC.A00;
    public boolean A00;
    public final C3696Ccu A01;
    public final Cc1 A02 = new Cc1();
    public final C4209CqH A03;
    public final Cc6 A04;
    public final C3656Cc4 A05;

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r25v0 X.Cc0) */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.CSC] */
    public static final synchronized void A00(EnumC10409Hbg enumC10409Hbg, C3665CcL c3665CcL, Cc0 cc0, int i, int i2, long j) {
        synchronized (cc0) {
            final long jA04 = C3cG.A04(j);
            final C3696Ccu c3696Ccu = cc0.A01;
            EnumC10420Hbt enumC10420Hbt = EnumC10420Hbt.A1I;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (C3696Ccu.A01(enumC10420Hbt, c3696Ccu, jElapsedRealtime)) {
                BV4.A1I(enumC10420Hbt, c3696Ccu.A07, jElapsedRealtime);
                Long lValueOf = Long.valueOf(jA04 & LinkEncryptedPairingKt.LINK_COUNTER_MAX);
                Boolean boolValueOf = Boolean.valueOf(A06.get());
                Boolean boolA0i = AnonymousClass001.A0i();
                C4841D8m c4841D8m = new C4841D8m(enumC10409Hbg, boolValueOf, boolA0i, boolA0i, lValueOf);
                Cbx cbxA00 = Cbw.A00();
                Integer numValueOf = Integer.valueOf(BV6.A02(i) & Integer.MAX_VALUE);
                Integer numValueOf2 = Integer.valueOf(BV6.A02(i2) & Integer.MAX_VALUE);
                int i3 = c3665CcL.A03;
                C3827CfF c3827CfF = new C3827CfF(cbxA00, new Cc2(i3 != -1 ? i3 != 35 ? i3 != 17 ? EnumC3667CcO.UNKNOWN_FORMAT : EnumC3667CcO.NV21 : EnumC3667CcO.YUV_420_888 : EnumC3667CcO.BITMAP, Integer.valueOf(CAC.A00(c3665CcL) & Integer.MAX_VALUE)), c4841D8m, numValueOf, numValueOf2);
                C3712CdB c3712CdB = new C3712CdB();
                c3712CdB.A01 = cc0.A00 ? EnumC3720CdJ.TYPE_THICK : EnumC3720CdJ.TYPE_THIN;
                c3712CdB.A03 = c3827CfF;
                RunnableC3698Ccw.A00(enumC10420Hbt, new C3717CdG(c3712CdB, 0), c3696Ccu);
            }
            final C3826CfE c3826CfE = new C3826CfE(Cbw.A00(), enumC10409Hbg, Boolean.valueOf(A06.get()), Integer.valueOf(BV6.A02(i) & Integer.MAX_VALUE), Integer.valueOf(BV6.A02(i2) & Integer.MAX_VALUE));
            final C3657Cc8 c3657Cc8 = new C3657Cc8(cc0);
            final EnumC10420Hbt enumC10420Hbt2 = EnumC10420Hbt.A1o;
            EnumC3664CcK.A01.execute(new Runnable() { // from class: X.Ccx
                public static final String __redex_internal_original_name = "zzny";

                @Override // java.lang.Runnable
                public final void run() {
                    final C3696Ccu c3696Ccu2 = c3696Ccu;
                    final EnumC10420Hbt enumC10420Hbt3 = enumC10420Hbt2;
                    Object obj = c3826CfE;
                    long j2 = jA04;
                    final C3657Cc8 c3657Cc82 = c3657Cc8;
                    Map map = c3696Ccu2.A08;
                    if (!map.containsKey(enumC10420Hbt3)) {
                        map.put(enumC10420Hbt3, new C3714CdD());
                    }
                    InterfaceC3748Cdl interfaceC3748Cdl = (InterfaceC3748Cdl) map.get(enumC10420Hbt3);
                    Long lValueOf2 = Long.valueOf(j2);
                    AbstractC3759Cdw abstractC3759Cdw = (AbstractC3759Cdw) interfaceC3748Cdl;
                    Map map2 = abstractC3759Cdw.A01;
                    Collection collection = (Collection) map2.get(obj);
                    if (collection == null) {
                        ArrayList arrayListA11 = C60O.A11(3);
                        if (!arrayListA11.add(lValueOf2)) {
                            throw BV4.A0N("New Collection violated the Collection spec");
                        }
                        abstractC3759Cdw.A00++;
                        map2.put(obj, arrayListA11);
                    } else if (collection.add(lValueOf2)) {
                        abstractC3759Cdw.A00++;
                    }
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (C3696Ccu.A01(enumC10420Hbt3, c3696Ccu2, jElapsedRealtime2)) {
                        BV4.A1I(enumC10420Hbt3, c3696Ccu2.A07, jElapsedRealtime2);
                        EnumC3664CcK.A01.execute(new Runnable() { // from class: X.Ccy
                            public static final String __redex_internal_original_name = "zznz";

                            @Override // java.lang.Runnable
                            public final void run() {
                                C3696Ccu c3696Ccu3 = c3696Ccu2;
                                EnumC10420Hbt enumC10420Hbt4 = enumC10420Hbt3;
                                C3657Cc8 c3657Cc83 = c3657Cc82;
                                Map map3 = c3696Ccu3.A08;
                                Object obj2 = (InterfaceC3733CdW) map3.get(enumC10420Hbt4);
                                if (obj2 != null) {
                                    AbstractC3753Cdq abstractC3753Cdq = (AbstractC3753Cdq) obj2;
                                    Set c3757Cdu = abstractC3753Cdq.A01;
                                    if (c3757Cdu == null) {
                                        AbstractC3759Cdw abstractC3759Cdw2 = (AbstractC3759Cdw) abstractC3753Cdq;
                                        c3757Cdu = new C3757Cdu(abstractC3759Cdw2, abstractC3759Cdw2.A01);
                                        abstractC3753Cdq.A01 = c3757Cdu;
                                    }
                                    for (Object obj3 : c3757Cdu) {
                                        AbstractC3759Cdw abstractC3759Cdw3 = (AbstractC3759Cdw) obj2;
                                        Collection collectionA11 = (Collection) abstractC3759Cdw3.A01.get(obj3);
                                        if (collectionA11 == null) {
                                            collectionA11 = C60O.A11(3);
                                        }
                                        ArrayList arrayListA0t = BV4.A0t(abstractC3759Cdw3.A00(obj3, collectionA11));
                                        Collections.sort(arrayListA0t);
                                        Iterator it = arrayListA0t.iterator();
                                        long jA0Y = 0;
                                        while (it.hasNext()) {
                                            jA0Y += BV7.A0Y(it);
                                        }
                                        Long lValueOf3 = Long.valueOf((jA0Y / arrayListA0t.size()) & LinkEncryptedPairingKt.LINK_COUNTER_MAX);
                                        D9X d9x = new D9X(Long.valueOf(C3696Ccu.A00(arrayListA0t, 100.0d) & LinkEncryptedPairingKt.LINK_COUNTER_MAX), Long.valueOf(C3696Ccu.A00(arrayListA0t, 0.0d) & LinkEncryptedPairingKt.LINK_COUNTER_MAX), lValueOf3, Long.valueOf(C3696Ccu.A00(arrayListA0t, 25.0d) & LinkEncryptedPairingKt.LINK_COUNTER_MAX), Long.valueOf(C3696Ccu.A00(arrayListA0t, 50.0d) & LinkEncryptedPairingKt.LINK_COUNTER_MAX), Long.valueOf(C3696Ccu.A00(arrayListA0t, 75.0d) & LinkEncryptedPairingKt.LINK_COUNTER_MAX));
                                        int size = arrayListA0t.size();
                                        Cc0 cc02 = c3657Cc83.A00;
                                        C3826CfE c3826CfE2 = (C3826CfE) obj3;
                                        C3712CdB c3712CdB2 = new C3712CdB();
                                        c3712CdB2.A01 = cc02.A00 ? EnumC3720CdJ.TYPE_THICK : EnumC3720CdJ.TYPE_THIN;
                                        c3712CdB2.A00 = new C3726CdP(c3826CfE2, d9x, Integer.valueOf(size & Integer.MAX_VALUE));
                                        RunnableC3698Ccw.A00(enumC10420Hbt4, new C3717CdG(c3712CdB2, 0), c3696Ccu3);
                                    }
                                    map3.remove(enumC10420Hbt4);
                                }
                            }
                        });
                    }
                }
            });
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z = cc0.A00;
            long j2 = jCurrentTimeMillis - jA04;
            final C3656Cc4 c3656Cc4 = cc0.A05;
            int i4 = true != z ? 24303 : 24304;
            int i5 = enumC10409Hbg.zzX;
            synchronized (c3656Cc4) {
                final long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                AtomicLong atomicLong = c3656Cc4.A01;
                if (atomicLong.get() == -1 || jElapsedRealtime2 - atomicLong.get() > 1800000) {
                    c3656Cc4.A00.APt(new TelemetryData(0, Arrays.asList(new MethodInvocation(null, null, i4, i5, 0, 0, -1, j2, jCurrentTimeMillis)))).A0E(new CSP() { // from class: X.Cc3
                        @Override // X.CSP
                        public final void onFailure(Exception exc) {
                            C3656Cc4 c3656Cc42 = c3656Cc4;
                            c3656Cc42.A01.set(jElapsedRealtime2);
                        }
                    });
                }
            }
        }
    }

    public Cc0(C3696Ccu c3696Ccu, C4209CqH c4209CqH, Cc6 cc6) {
        CRy.A04(c4209CqH, "FaceDetectorOptions can not be null");
        this.A03 = c4209CqH;
        this.A01 = c3696Ccu;
        this.A04 = cc6;
        this.A05 = new C3656Cc4((Context) C3555CTs.A00().A02(Context.class));
    }
}
