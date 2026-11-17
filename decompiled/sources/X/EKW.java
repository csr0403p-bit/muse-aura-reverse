package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class EKW implements ELY, InterfaceC6635ELf, EMu {
    public static final String A0E = EK9.A01("GreedyScheduler");
    public Boolean A00;
    public boolean A01;
    public C6628EKx A02;
    public final Context A03;
    public final EKi A04;
    public final EKU A05;
    public final EN7 A0A;
    public final C6624EKt A0B;
    public final C6625EKu A0C;
    public final ENP A0D;
    public final Map<C6630ELa, HoC> A07 = BV4.A0u();
    public final Object A06 = C3cG.A0T();
    public final ELR A09 = new ELK(new EK8());
    public final Map<C6630ELa, C6648ELz> A08 = BV4.A0u();

    @Override // X.ELY
    public final boolean ANB() {
        return false;
    }

    @Override // X.InterfaceC6635ELf
    public final void ATA(C6630ELa id, boolean needsReschedule) {
        HoC hoCRemove;
        EMx eMxAaX = this.A09.AaX(id);
        if (eMxAaX != null) {
            this.A0B.A00(eMxAaX);
        }
        Object obj = this.A06;
        synchronized (obj) {
            hoCRemove = this.A07.remove(id);
        }
        if (hoCRemove != null) {
            EK9.A00().A02(A0E, AnonymousClass007.A0a("Stopping tracking for ", id));
            hoCRemove.A5w(null);
        }
        if (needsReschedule) {
            return;
        }
        synchronized (obj) {
            this.A08.remove(id);
        }
    }

    @Override // X.ELY
    public final void Ac8(EKE... workSpecs) {
        long jMax;
        EK9 ek9A00;
        String str;
        StringBuilder sb;
        String str2;
        Boolean boolValueOf = this.A00;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(CGO.A00(this.A03, this.A04));
            this.A00 = boolValueOf;
        }
        if (!boolValueOf.booleanValue()) {
            EK9.A00();
            Log.i(A0E, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.A01) {
            this.A05.A02(this);
            this.A01 = true;
        }
        HashSet hashSetA13 = C60O.A13();
        HashSet hashSetA132 = C60O.A13();
        for (EKE eke : workSpecs) {
            C6630ELa c6630ELaA00 = AbstractC6646ELq.A00(eke);
            ELR elr = this.A09;
            if (!elr.A73(c6630ELaA00)) {
                synchronized (this.A06) {
                    C6630ELa c6630ELaA002 = AbstractC6646ELq.A00(eke);
                    Map<C6630ELa, C6648ELz> map = this.A08;
                    C6648ELz c6648ELz = map.get(c6630ELaA002);
                    if (c6648ELz == null) {
                        c6648ELz = new C6648ELz(eke.A02, System.currentTimeMillis());
                        map.put(c6630ELaA002, c6648ELz);
                    }
                    jMax = c6648ELz.A01 + (Math.max((eke.A02 - c6648ELz.A00) - 5, 0) * 30000);
                }
                long jMax2 = Math.max(eke.A01(), jMax);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (eke.A0E == EnumC6619EKm.A04) {
                    if (jCurrentTimeMillis < jMax2) {
                        C6628EKx c6628EKx = this.A02;
                        if (c6628EKx != null) {
                            Map<String, Runnable> map2 = c6628EKx.A02;
                            String str3 = eke.A0O;
                            Runnable runnableRemove = map2.remove(str3);
                            if (runnableRemove != null) {
                                ((C6633ELd) c6628EKx.A00).A00.removeCallbacks(runnableRemove);
                            }
                            RunnableC6627EKw runnableC6627EKw = new RunnableC6627EKw(c6628EKx, eke);
                            map2.put(str3, runnableC6627EKw);
                            ((C6633ELd) c6628EKx.A00).A00.postDelayed(runnableC6627EKw, jMax2 - System.currentTimeMillis());
                        }
                    } else if (!EKL.A09.equals(eke.A0B)) {
                        EKL ekl = eke.A0B;
                        if (ekl.A07) {
                            ek9A00 = EK9.A00();
                            str = A0E;
                            sb = new StringBuilder("Ignoring ");
                            sb.append(eke);
                            str2 = ". Requires device idle.";
                        } else if (ekl.A04.isEmpty()) {
                            hashSetA13.add(eke);
                            hashSetA132.add(eke.A0O);
                        } else {
                            ek9A00 = EK9.A00();
                            str = A0E;
                            sb = new StringBuilder("Ignoring ");
                            sb.append(eke);
                            str2 = ". Requires ContentUri triggers.";
                        }
                        sb.append(str2);
                        ek9A00.A02(str, sb.toString());
                    } else if (!elr.A73(AbstractC6646ELq.A00(eke))) {
                        EK9.A00().A02(A0E, FGI.A0M("Starting work for ", eke.A0O));
                        EMx eMxAhB = elr.AhB(AbstractC6646ELq.A00(eke));
                        this.A0B.A01(eMxAhB);
                        EN7 en7 = this.A0A;
                        C7384Etj.A0Y(eMxAhB, 1);
                        EL6 el6 = (EL6) en7;
                        ((C6616EKj) el6.A01).A01.execute(new EKV(null, eMxAhB, el6));
                    }
                }
            }
        }
        synchronized (this.A06) {
            if (!hashSetA13.isEmpty()) {
                BV4.A1E(EK9.A00(), "Starting tracking for ", TextUtils.join(",", hashSetA132), A0E);
                Iterator it = hashSetA13.iterator();
                while (it.hasNext()) {
                    EKE eke2 = (EKE) it.next();
                    C6630ELa c6630ELaA003 = AbstractC6646ELq.A00(eke2);
                    Map<C6630ELa, HoC> map3 = this.A07;
                    if (!map3.containsKey(c6630ELaA003)) {
                        C6625EKu c6625EKu = this.A0C;
                        GBK gbk = ((C6616EKj) this.A0D).A04;
                        C7384Etj.A0Y(c6625EKu, 0);
                        C7384Etj.A0Y(eke2, 1);
                        C7384Etj.A0Y(gbk, 2);
                        map3.put(c6630ELaA003, GAo.A02(C79.A00, C6ys.A00, new EZB(this, eke2, c6625EKu, null, 6), Hxb.A02(gbk)));
                    }
                }
            }
        }
    }

    @Override // X.ELY
    public final void cancel(String workSpecId) {
        Runnable runnableRemove;
        Boolean boolValueOf = this.A00;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(CGO.A00(this.A03, this.A04));
            this.A00 = boolValueOf;
        }
        if (!boolValueOf.booleanValue()) {
            EK9.A00();
            Log.i(A0E, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.A01) {
            this.A05.A02(this);
            this.A01 = true;
        }
        BV4.A1E(EK9.A00(), "Cancelling work ID ", workSpecId, A0E);
        C6628EKx c6628EKx = this.A02;
        if (c6628EKx != null && (runnableRemove = c6628EKx.A02.remove(workSpecId)) != null) {
            ((C6633ELd) c6628EKx.A00).A00.removeCallbacks(runnableRemove);
        }
        for (EMx eMx : this.A09.AaY(workSpecId)) {
            this.A0B.A00(eMx);
            EN7 en7 = this.A0A;
            C7384Etj.A0Y(eMx, 1);
            en7.AgU(eMx, -512);
        }
    }

    public EKW(Context context, EKi configuration, EKU trackers, EN7 processor, ELC workLauncher, ENP taskExecutor) {
        this.A03 = context;
        ENJ enj = configuration.A03;
        this.A02 = new C6628EKx(configuration.A01, enj, this);
        this.A0B = new C6624EKt(enj, processor);
        this.A0D = taskExecutor;
        this.A0C = new C6625EKu(workLauncher);
        this.A04 = configuration;
        this.A05 = trackers;
        this.A0A = processor;
    }

    @Override // X.EMu
    public final void ASQ(ENN workSpec, EKE state) {
        C6630ELa c6630ELaA00 = AbstractC6646ELq.A00(state);
        if (!(workSpec instanceof EN9)) {
            EK9.A00().A02(A0E, AnonymousClass007.A0a("Constraints not met: Cancelling work ID ", c6630ELaA00));
            EMx eMxAaX = this.A09.AaX(c6630ELaA00);
            if (eMxAaX != null) {
                this.A0B.A00(eMxAaX);
                this.A0A.AgU(eMxAaX, ((C6645ELp) workSpec).A00);
                return;
            }
            return;
        }
        ELR elr = this.A09;
        if (elr.A73(c6630ELaA00)) {
            return;
        }
        EK9.A00().A02(A0E, AnonymousClass007.A0a("Constraints met: Scheduling work ID ", c6630ELaA00));
        EMx eMxAhB = elr.AhB(c6630ELaA00);
        this.A0B.A01(eMxAhB);
        EN7 en7 = this.A0A;
        C7384Etj.A0Y(eMxAhB, 1);
        EL6 el6 = (EL6) en7;
        ENP enp = el6.A01;
        ((C6616EKj) enp).A01.execute(new EKV(null, eMxAhB, el6));
    }
}
