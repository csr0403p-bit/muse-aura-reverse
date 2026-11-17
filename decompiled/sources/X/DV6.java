package X;

import android.content.Context;
import android.os.Trace;
import com.facebook.debug.tracer.Tracer;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.google.common.collect.MapMakerInternalMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public final class DV6 implements InterfaceC6035DuU {
    public static final C06827l3 A0S = C06827l3.A02("[,;= ]");
    public Map A00;
    public final HeroPlayerSetting A01;
    public final Context A02;
    public final DF1 A03;
    public final DVI A04;
    public final DV7 A05;
    public final DFE A06;
    public final InterfaceC6083DvN A07;
    public final InterfaceC4887DDb A08;
    public final DDR A09;
    public final C5092DXa A0A;
    public final DVD A0B;
    public final DVE A0C;
    public final InterfaceC6097Dvc A0D;
    public final InterfaceC6095Dva A0E;
    public final InterfaceC6093DvY A0F;
    public final BZQ A0G;
    public final C5596Dlb A0H;
    public final InterfaceC6113Dvs A0I;
    public final List<String> A0J;
    public final List<String> A0K;
    public final List<String> A0L;
    public final List<String> A0M;
    public final Map A0N;
    public final Map<String, String> A0O;
    public final Queue A0P;
    public final AtomicReference<DVC> A0Q;
    public final AtomicReference<Boolean> A0R;

    @Override // X.InterfaceC6035DuU
    public final void A5J(String str) {
        C7384Etj.A0Y(str, 0);
        Tracer.A01("UnifiedPrefetchManager.boostOngoingPrefetchPriorityForVideo");
        try {
            if (this.A01.gen.use_cache_manager_to_boost_prefetch_priority) {
                DDR ddr = this.A09;
                Tracer.A01("CacheManager.boostOngoingPrefetchPriority");
                try {
                    Map<String, C1J> map = ddr.A08;
                    if (map != null) {
                        synchronized (map) {
                            Iterator itA0n = AnonymousClass002.A0n(map);
                            while (itA0n.hasNext()) {
                                C3cH.A0l(itA0n).getValue();
                            }
                        }
                    }
                } finally {
                    Tracer.A00();
                }
            } else {
                DV7 dv7 = this.A05;
                ReentrantLock reentrantLock = dv7.A03;
                reentrantLock.lock();
                try {
                    Iterator itA0N = C7384Etj.A0N(dv7.A01);
                    if (itA0N.hasNext()) {
                        C7384Etj.A0U(itA0N.next());
                        throw BV4.A0a("getMTask");
                    }
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
        } finally {
            Tracer.A00();
        }
    }

    @Override // X.InterfaceC6035DuU
    public final void A60(String str, String str2, boolean z) {
        AnonymousClass003.A0u(str, str2);
        Tracer.A01("UnifiedPrefetchManager.cancelPrefetchForVideo");
        try {
            DV7 dv7 = this.A05;
            LinkedList linkedListA0y = BV4.A0y();
            ReentrantLock reentrantLock = dv7.A03;
            reentrantLock.lock();
            try {
                ListIterator listIterator = dv7.A02.listIterator();
                C7384Etj.A0U(listIterator);
                if (listIterator.hasNext()) {
                    C7384Etj.A0U(listIterator.next());
                    throw BV4.A0U();
                }
                reentrantLock.unlock();
                int size = linkedListA0y.size();
                DVD dvd = this.A0B;
                if (dvd != null) {
                    dvd.A00.A0H.A5s(new DEU(str, str2, size > 0));
                }
                if (z) {
                    reentrantLock.lock();
                    Iterator itA0N = C7384Etj.A0N(dv7.A01);
                    if (itA0N.hasNext()) {
                        C7384Etj.A0U(itA0N.next());
                        throw BV4.A0a("getMTask");
                    }
                    reentrantLock.unlock();
                }
                if (this.A01.enableCancelFollowupPrefetch) {
                    reentrantLock.lock();
                    Iterator itA0N2 = C7384Etj.A0N(dv7.A01);
                    if (itA0N2.hasNext()) {
                        C7384Etj.A0U(itA0N2.next());
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        } finally {
            Tracer.A00();
        }
    }

    public DV6(Context context, DF1 df1, DVI dvi, DFE dfe, InterfaceC6083DvN interfaceC6083DvN, InterfaceC4887DDb interfaceC4887DDb, DDR ddr, C5092DXa c5092DXa, DVD dvd, DVE dve, InterfaceC6097Dvc interfaceC6097Dvc, InterfaceC6095Dva interfaceC6095Dva, InterfaceC6093DvY interfaceC6093DvY, BZQ bzq, C5596Dlb c5596Dlb, HeroPlayerSetting heroPlayerSetting, InterfaceC6113Dvs interfaceC6113Dvs, Map map, ScheduledExecutorService scheduledExecutorService, AtomicReference atomicReference) {
        List listA1A;
        List listA1A2;
        List listA1A3;
        List listA1A4;
        this.A09 = ddr;
        this.A0A = c5092DXa;
        this.A0O = map;
        this.A01 = heroPlayerSetting;
        this.A06 = dfe;
        this.A0I = interfaceC6113Dvs;
        this.A02 = context;
        this.A0G = bzq;
        this.A0B = dvd;
        this.A0C = dve;
        this.A03 = df1;
        this.A07 = interfaceC6083DvN;
        this.A0D = interfaceC6097Dvc;
        this.A05 = new DV7(new DVB(this), scheduledExecutorService);
        if (heroPlayerSetting.gen.enable_prefetch_to_playback_promotion) {
            this.A00 = new MapMakerInternalMap(null, C5074DUn.A00, MapMakerInternalMap.Strength.A02, -1, -1);
        }
        Trace.beginSection("UnifiedPrefetchManager.init");
        try {
            AtomicReference<Boolean> atomicReferenceA15 = BV4.A15();
            this.A0R = atomicReferenceA15;
            atomicReferenceA15.set(false);
            this.A0Q = atomicReference;
            this.A0N = BV4.A0u();
            this.A0H = c5596Dlb;
            String str = heroPlayerSetting.prefetchTagBlockList;
            C7384Etj.A0T(str);
            List listA14 = BV7.A14(str, ";");
            if (!listA14.isEmpty()) {
                ListIterator listIteratorA0n = C3cG.A0n(listA14);
                while (listIteratorA0n.hasPrevious()) {
                    if (BV7.A0M(listIteratorA0n) != 0) {
                        listA1A = BV8.A1A(listA14, listIteratorA0n);
                        break;
                    }
                }
                listA1A = C0881AGi.A00;
            } else {
                listA1A = C0881AGi.A00;
            }
            this.A0L = BV8.A1B(listA1A);
            String str2 = this.A01.adaptivePrefetchTagBlockList;
            C7384Etj.A0T(str2);
            List listA142 = BV7.A14(str2, ";");
            if (!listA142.isEmpty()) {
                ListIterator listIteratorA0n2 = C3cG.A0n(listA142);
                while (listIteratorA0n2.hasPrevious()) {
                    if (BV7.A0M(listIteratorA0n2) != 0) {
                        listA1A2 = BV8.A1A(listA142, listIteratorA0n2);
                        break;
                    }
                }
                listA1A2 = C0881AGi.A00;
            } else {
                listA1A2 = C0881AGi.A00;
            }
            this.A0J = BV8.A1B(listA1A2);
            String str3 = this.A01.gen.dcc_prefetch_tag_blocklist;
            List listA143 = BV7.A14(str3 == null ? "" : str3, ";");
            if (!listA143.isEmpty()) {
                ListIterator listIteratorA0n3 = C3cG.A0n(listA143);
                while (listIteratorA0n3.hasPrevious()) {
                    if (BV7.A0M(listIteratorA0n3) != 0) {
                        listA1A3 = BV8.A1A(listA143, listIteratorA0n3);
                        break;
                    }
                }
                listA1A3 = C0881AGi.A00;
            } else {
                listA1A3 = C0881AGi.A00;
            }
            this.A0K = BV8.A1B(listA1A3);
            String str4 = this.A01.autogenSettings.grootPrefetchSuboriginBlocklist;
            C7384Etj.A0T(str4);
            List listA144 = BV7.A14(str4, ";");
            if (!listA144.isEmpty()) {
                ListIterator listIteratorA0n4 = C3cG.A0n(listA144);
                while (listIteratorA0n4.hasPrevious()) {
                    if (BV7.A0M(listIteratorA0n4) != 0) {
                        listA1A4 = BV8.A1A(listA144, listIteratorA0n4);
                        break;
                    }
                }
                listA1A4 = C0881AGi.A00;
            } else {
                listA1A4 = C0881AGi.A00;
            }
            this.A0M = BV8.A1B(listA1A4);
            DVC dvc = this.A0Q.get();
            if (this.A01.disableSecondPhasePrefetchOnAppScrolling && dvc != null) {
                dvc.A00.add(this);
            }
            this.A0P = BV4.A0s();
            DVA.A02.A00.add(new DVH());
            this.A04 = dvi;
            this.A08 = interfaceC4887DDb;
            this.A0E = interfaceC6095Dva;
            this.A0F = interfaceC6093DvY;
        } finally {
            Trace.endSection();
        }
    }
}
