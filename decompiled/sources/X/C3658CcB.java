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
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.CcB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3658CcB extends AbstractC3512CRm {
    public static final CAC A05 = CAC.A00;
    public boolean A00 = true;
    public final CcE A01;
    public final C3695Cct A02;
    public final CcF A03;
    public final Cc5 A04;

    public C3658CcB(C3695Cct c3695Cct, C3104ByR c3104ByR, CcF ccF) {
        CRy.A04(c3104ByR, "ImageLabelerOptions can not be null");
        this.A03 = ccF;
        this.A02 = c3695Cct;
        this.A01 = new CcE(Float.valueOf(0.6f));
        this.A04 = new Cc5((Context) C3555CTs.A00().A02(Context.class));
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [X.CSC] */
    public static final void A00(EnumC10410Hbh enumC10410Hbh, C3665CcL c3665CcL, C3658CcB c3658CcB, long j) {
        final long jA04 = C3cG.A04(j);
        final C3695Cct c3695Cct = c3658CcB.A02;
        EnumC10421Hbu enumC10421Hbu = EnumC10421Hbu.A2j;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Map map = c3695Cct.A07;
        if (map.get(enumC10421Hbu) == null || jElapsedRealtime - C3cG.A05(map.get(enumC10421Hbu)) > 30000) {
            BV4.A1I(enumC10421Hbu, map, jElapsedRealtime);
            C3713CdC c3713CdC = new C3713CdC();
            c3713CdC.A01 = EnumC3721CdK.TYPE_THIN;
            Long lValueOf = Long.valueOf(jA04 & LinkEncryptedPairingKt.LINK_COUNTER_MAX);
            Boolean boolValueOf = Boolean.valueOf(c3658CcB.A00);
            Boolean boolA0i = AnonymousClass001.A0i();
            C4842D8n c4842D8n = new C4842D8n(enumC10410Hbh, boolValueOf, boolA0i, boolA0i, lValueOf);
            int i = c3665CcL.A03;
            c3713CdC.A03 = new CcG(new C3660CcD(i != -1 ? i != 35 ? i != 17 ? EnumC3668CcP.UNKNOWN_FORMAT : EnumC3668CcP.NV21 : EnumC3668CcP.YUV_420_888 : EnumC3668CcP.BITMAP, Integer.valueOf(CAC.A00(c3665CcL) & Integer.MAX_VALUE)), c4842D8n, c3658CcB.A01);
            RunnableC3697Ccv.A00(enumC10421Hbu, new C3716CdF(c3713CdC, 0), c3695Cct);
        }
        final C3659CcC c3659CcC = new C3659CcC(enumC10410Hbh, c3658CcB.A01, Boolean.valueOf(c3658CcB.A00));
        final C3662CcI c3662CcI = C3662CcI.A00;
        final EnumC10421Hbu enumC10421Hbu2 = EnumC10421Hbu.A1p;
        EnumC3664CcK.A01.execute(new Runnable() { // from class: X.Ccz
            public static final String __redex_internal_original_name = "zznm";

            @Override // java.lang.Runnable
            public final void run() {
                final C3695Cct c3695Cct2 = c3695Cct;
                final EnumC10421Hbu enumC10421Hbu3 = enumC10421Hbu2;
                Object obj = c3659CcC;
                long j2 = jA04;
                final C3662CcI c3662CcI2 = c3662CcI;
                Map map2 = c3695Cct2.A08;
                if (!map2.containsKey(enumC10421Hbu3)) {
                    map2.put(enumC10421Hbu3, new C3715CdE());
                }
                InterfaceC3751Cdo interfaceC3751Cdo = (InterfaceC3751Cdo) map2.get(enumC10421Hbu3);
                Long lValueOf2 = Long.valueOf(j2);
                Ce3 ce3 = (Ce3) interfaceC3751Cdo;
                Map map3 = ce3.A01;
                Collection collection = (Collection) map3.get(obj);
                if (collection == null) {
                    ArrayList arrayListA11 = C60O.A11(3);
                    if (!arrayListA11.add(lValueOf2)) {
                        throw BV4.A0N("New Collection violated the Collection spec");
                    }
                    ce3.A00++;
                    map3.put(obj, arrayListA11);
                } else if (collection.add(lValueOf2)) {
                    ce3.A00++;
                }
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                Map map4 = c3695Cct2.A07;
                if (map4.get(enumC10421Hbu3) == null || jElapsedRealtime2 - C3cG.A05(map4.get(enumC10421Hbu3)) > 30000) {
                    BV4.A1I(enumC10421Hbu3, map4, jElapsedRealtime2);
                    EnumC3664CcK.A01.execute(new Runnable() { // from class: X.Cd0
                        public static final String __redex_internal_original_name = "zznn";

                        @Override // java.lang.Runnable
                        public final void run() {
                            C3695Cct c3695Cct3 = c3695Cct2;
                            EnumC10421Hbu enumC10421Hbu4 = enumC10421Hbu3;
                            Map map5 = c3695Cct3.A08;
                            InterfaceC3751Cdo interfaceC3751Cdo2 = (InterfaceC3738Cdb) map5.get(enumC10421Hbu4);
                            if (interfaceC3751Cdo2 != null) {
                                AbstractC3760Cdx abstractC3760Cdx = (AbstractC3760Cdx) interfaceC3751Cdo2;
                                Set c3764Ce1 = abstractC3760Cdx.A01;
                                if (c3764Ce1 == null) {
                                    Ce3 ce32 = (Ce3) abstractC3760Cdx;
                                    c3764Ce1 = new C3764Ce1(ce32, ce32.A01);
                                    abstractC3760Cdx.A01 = c3764Ce1;
                                }
                                for (Object obj2 : c3764Ce1) {
                                    Ce3 ce33 = (Ce3) interfaceC3751Cdo2;
                                    Collection collectionA11 = (Collection) ce33.A01.get(obj2);
                                    if (collectionA11 == null) {
                                        collectionA11 = C60O.A11(3);
                                    }
                                    ArrayList arrayListA0t = BV4.A0t(ce33.A00(obj2, collectionA11));
                                    Collections.sort(arrayListA0t);
                                    Iterator it = arrayListA0t.iterator();
                                    long jA0Y = 0;
                                    while (it.hasNext()) {
                                        jA0Y += BV7.A0Y(it);
                                    }
                                    Long lValueOf3 = Long.valueOf((jA0Y / arrayListA0t.size()) & LinkEncryptedPairingKt.LINK_COUNTER_MAX);
                                    Long lValueOf4 = Long.valueOf(C3695Cct.A00(arrayListA0t, 100.0d) & LinkEncryptedPairingKt.LINK_COUNTER_MAX);
                                    Long lValueOf5 = Long.valueOf(C3695Cct.A00(arrayListA0t, 75.0d) & LinkEncryptedPairingKt.LINK_COUNTER_MAX);
                                    D9Y d9y = new D9Y(lValueOf4, Long.valueOf(C3695Cct.A00(arrayListA0t, 0.0d) & LinkEncryptedPairingKt.LINK_COUNTER_MAX), lValueOf3, Long.valueOf(C3695Cct.A00(arrayListA0t, 25.0d) & LinkEncryptedPairingKt.LINK_COUNTER_MAX), Long.valueOf(C3695Cct.A00(arrayListA0t, 50.0d) & LinkEncryptedPairingKt.LINK_COUNTER_MAX), lValueOf5);
                                    int size = arrayListA0t.size();
                                    C3713CdC c3713CdC2 = new C3713CdC();
                                    c3713CdC2.A01 = EnumC3721CdK.TYPE_THIN;
                                    c3713CdC2.A00 = new C3728CdR((C3659CcC) obj2, d9y, Integer.valueOf(size & Integer.MAX_VALUE));
                                    RunnableC3697Ccv.A00(enumC10421Hbu4, new C3716CdF(c3713CdC2, 0), c3695Cct3);
                                }
                                map5.remove(enumC10421Hbu4);
                            }
                        }
                    });
                }
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        final Cc5 cc5 = c3658CcB.A04;
        int i2 = enumC10410Hbh.zzX;
        long j2 = jCurrentTimeMillis - jA04;
        synchronized (cc5) {
            final long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            AtomicLong atomicLong = cc5.A01;
            if (atomicLong.get() == -1 || jElapsedRealtime2 - atomicLong.get() > 1800000) {
                cc5.A00.APt(new TelemetryData(0, Arrays.asList(new MethodInvocation(null, null, 24305, i2, 0, 0, -1, j2, jCurrentTimeMillis)))).A0E(new CSP() { // from class: X.CcA
                    @Override // X.CSP
                    public final void onFailure(Exception exc) {
                        Cc5 cc52 = cc5;
                        cc52.A01.set(jElapsedRealtime2);
                    }
                });
            }
        }
    }
}
