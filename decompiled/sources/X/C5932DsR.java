package X;

import android.os.SystemClock;
import android.util.Log;
import android.util.LruCache;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.DsR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5932DsR implements InterfaceC5756Dor {
    public C5723DoI A00;
    public C5723DoI A01;
    public DwL A02;
    public DwL A03;
    public final DsS A04;
    public final WeakReference<C5625Dm8> A05;
    public final C5933DsT A06 = new C5933DsT(new Object() { // from class: X.DvM
    }, new DwM());
    public final HeroPlayerSetting A07;
    public static final AtomicBoolean A09 = C60O.A1E();
    public static final LruCache<String, String> A08 = new LruCache<>(200);

    @Override // X.InterfaceC5756Dor
    public final void ASc(C5723DoI c5723DoI, long j, String str, List<String> list, boolean z) {
        A02(null, null);
        String str2 = c5723DoI.mimeType;
        if (str2 != null) {
            boolean zA1L = AnonymousClass002.A1L(str2.contains("video") ? 1 : 0);
            boolean z2 = str2.contains("audio");
            if (zA1L || z2) {
                C7384Etj.A0Y(c5723DoI.mimeType, 1);
                C5966Dt7 c5966Dt7A00 = A00(new C6122DwK());
                this.A05.get();
                this.A04.A06(new C6074DvE(c5966Dt7A00));
                if (zA1L) {
                    this.A01 = c5723DoI;
                }
                if (z2) {
                    this.A00 = c5723DoI;
                }
            }
        }
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void ATQ() {
    }

    @Override // X.InterfaceC5756Dor
    public final void ATq(byte[] bArr, String str, long j, long j2) {
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void AUb() {
    }

    @Override // X.InterfaceC5756Dor
    public final void AUc(C5623Dm6 c5623Dm6, Dq8 dq8, C6060Duv c6060Duv, C5790DpZ c5790DpZ, String str) {
        A02(c5623Dm6, null);
        this.A04.A01(new C5934DsU(c5623Dm6, dq8, c6060Duv, c5790DpZ, str));
    }

    @Override // X.InterfaceC5756Dor
    public final void AUx() {
    }

    @Override // X.InterfaceC5756Dor
    public final void AXF() {
    }

    private C5966Dt7 A00(C6122DwK c6122DwK) {
        C6122DwK c6122DwK2;
        C6122DwK c6122DwK3;
        C5723DoI c5723DoI = this.A01;
        if (c5723DoI == null) {
            c6122DwK2 = null;
        } else {
            C7384Etj.A0Y(c5723DoI.mimeType, 1);
            c6122DwK2 = new C6122DwK();
        }
        C5723DoI c5723DoI2 = this.A00;
        if (c5723DoI2 == null) {
            c6122DwK3 = null;
        } else {
            C7384Etj.A0Y(c5723DoI2.mimeType, 1);
            c6122DwK3 = new C6122DwK();
        }
        return new C5966Dt7(this.A03, this.A02, c6122DwK2, c6122DwK3, c6122DwK);
    }

    private C5937DsX A01() {
        List<C5995Dtc> list;
        C5995Dtc c5995Dtc;
        ArrayList arrayListA0t;
        C5933DsT c5933DsT = this.A06;
        synchronized (c5933DsT) {
            if (c5933DsT.A02 >= 0) {
                AbstractC3426CMt.A02("StallTimeCalculation", "Must call .end() first");
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - 1800000;
            while (true) {
                list = c5933DsT.A09;
                if (!list.isEmpty()) {
                    C5995Dtc c5995Dtc2 = list.get(0);
                    if (c5995Dtc2.A01 + c5995Dtc2.A00 > jElapsedRealtime) {
                        break;
                    }
                    list.remove(0);
                } else {
                    break;
                }
            }
            c5995Dtc = c5933DsT.A04;
            arrayListA0t = BV4.A0t(list);
            if (!arrayListA0t.isEmpty()) {
                Iterator itA0N = C7384Etj.A0N(arrayListA0t);
                while (itA0N.hasNext()) {
                    itA0N.next();
                }
                C7384Etj.A0U(arrayListA0t.get(0));
            }
        }
        DwI dwI = new DwI();
        C6121DwJ c6121DwJ = c5995Dtc != null ? new C6121DwJ() : null;
        LinkedList linkedListA0y = BV4.A0y();
        Iterator it = arrayListA0t.iterator();
        while (it.hasNext()) {
            it.next();
            linkedListA0y.add(new C6121DwJ());
        }
        return new C5937DsX(c6121DwJ, dwI, linkedListA0y);
    }

    private Integer A02(C5623Dm6 c5623Dm6, Integer num) {
        C5625Dm8 c5625Dm8 = this.A05.get();
        DmR dmR = c5625Dm8 != null ? c5625Dm8.A0H.A07 : null;
        if (dmR != null) {
            int iOrdinal = dmR.A03.A0A.ordinal();
            if (iOrdinal == 2) {
                return C79.A0K;
            }
            if (iOrdinal == 0) {
                return C79.A01;
            }
            if (iOrdinal == 1) {
                return C79.A0C;
            }
            if (iOrdinal == 5) {
                return C79.A0W;
            }
        } else {
            if (c5623Dm6 != null) {
                String str = c5623Dm6.A0i;
                try {
                    num = AbstractC5716Dnz.A00(str);
                    return num;
                } catch (IllegalArgumentException | NullPointerException e) {
                    Log.w("VideoStateLogging", FGI.A0M("Unknown streaming format: ", str), e);
                }
            }
            if (num != null) {
                return num;
            }
        }
        return C79.A00;
    }

    @Override // X.InterfaceC5756Dor
    public final void ATa(C5892DrZ c5892DrZ) {
        this.A05.get();
        this.A04.A04(new C5941Dsb(c5892DrZ));
    }

    @Override // X.InterfaceC5756Dor
    public final void AX3(Dq8 dq8, C5623Dm6 c5623Dm6, String str, String str2, String str3, String str4, long j, boolean z) {
        this.A06.A01();
        C5937DsX c5937DsXA01 = A01();
        A02(null, A02(c5623Dm6, null));
        this.A04.A00(new C5939DsZ(c5623Dm6, c5937DsXA01, str, str3));
    }

    @Override // X.InterfaceC5756Dor
    public final void AX4(C6060Duv c6060Duv, Dq8 dq8, C5623Dm6 c5623Dm6, Integer num, String str, String str2, String str3, boolean z, boolean z2) {
        C5625Dm8 c5625Dm8 = this.A05.get();
        if (c5625Dm8 != null) {
            c5625Dm8.A0D();
        }
        C5937DsX c5937DsX = new C5937DsX(null, new DwI(), Collections.EMPTY_LIST);
        A02(null, num);
        this.A04.A02(new C5942Dsc(A00(null), c5937DsX));
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void AXD(C6060Duv c6060Duv, Dq8 dq8, C5623Dm6 c5623Dm6, Integer num, String str, String str2, String str3, String str4, String str5, long j, long j2, boolean z, boolean z2) {
        C5625Dm8 c5625Dm8 = this.A05.get();
        if (c5625Dm8 != null) {
            c5625Dm8.A0D();
        }
        C5937DsX c5937DsX = new C5937DsX(null, new DwI(), Collections.EMPTY_LIST);
        A02(null, num);
        this.A04.A03(new C5938DsY(c5623Dm6, A00(null), c5937DsX));
    }

    @Override // X.InterfaceC5756Dor
    public final void AXE(C5623Dm6 c5623Dm6) {
        DmR dmR;
        String str;
        A09.compareAndSet(false, true);
        WeakReference<C5625Dm8> weakReference = this.A05;
        C5625Dm8 c5625Dm8 = weakReference.get();
        long jA0D = c5625Dm8 != null ? c5625Dm8.A0D() : -1L;
        C5933DsT c5933DsT = this.A06;
        c5933DsT.A00();
        synchronized (c5933DsT) {
            if (jA0D == -1) {
                if (c5933DsT.A02 < 0) {
                    c5933DsT.A02 = SystemClock.elapsedRealtime();
                }
            } else if (c5933DsT.A02 < 0) {
                c5933DsT.A02 = SystemClock.elapsedRealtime();
            }
        }
        C5625Dm8 c5625Dm82 = weakReference.get();
        if (c5625Dm82 != null && (dmR = c5625Dm82.A0H.A07) != null && (str = dmR.A03.A0Q) != null) {
            LruCache<String, String> lruCache = A08;
            synchronized (lruCache) {
                lruCache.get(str);
            }
        }
        A02(null, null);
        weakReference.get();
        this.A04.A07(new C6073DvD(null));
    }

    @Override // X.InterfaceC5756Dor
    public final void AXI(Dq8 dq8, C5623Dm6 c5623Dm6, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2) {
        DmR dmR;
        String str8;
        boolean z3;
        C5625Dm8 c5625Dm8 = this.A05.get();
        if (c5625Dm8 == null || (dmR = c5625Dm8.A0H.A07) == null || (str8 = dmR.A03.A0Q) == null) {
            return;
        }
        this.A06.A01();
        C5937DsX c5937DsXA01 = A01();
        LruCache<String, String> lruCache = A08;
        synchronized (lruCache) {
            z3 = lruCache.get(str8) == null;
            lruCache.put(str8, str8);
        }
        A02(c5623Dm6, null);
        C5966Dt7 c5966Dt7A00 = A00(null);
        if (z3) {
            this.A04.A08(new C5936DsW(dq8, c5623Dm6, c5966Dt7A00, c5937DsXA01));
        } else {
            this.A04.A09(new C5935DsV(dq8, c5623Dm6, c5966Dt7A00, c5937DsXA01));
        }
        this.A03 = new DwL();
        this.A02 = new DwL();
    }

    @Override // X.InterfaceC5756Dor
    public final void AXP(C5790DpZ c5790DpZ) {
        this.A05.get();
        this.A04.A05(new C5940Dsa(c5790DpZ));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.DvM] */
    public C5932DsR(C5625Dm8 c5625Dm8, HeroPlayerSetting heroPlayerSetting, Set set) {
        this.A04 = new DsS(set);
        this.A07 = heroPlayerSetting;
        this.A05 = BV4.A0q(c5625Dm8);
    }

    @Override // X.InterfaceC5756Dor
    public final void ARl(int i) {
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void ARq(C5723DoI c5723DoI) {
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void ASi(C5919Ds4 c5919Ds4) {
    }

    @Override // X.InterfaceC5756Dor
    public final void ATp(boolean z) {
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void ATs(C5841DqX c5841DqX) {
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void AUB(Object obj) {
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void AUK(byte[] bArr) {
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void AUd(EnumC2375BWj enumC2375BWj) {
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void AWK(C6060Duv c6060Duv) {
    }

    @Override // X.InterfaceC5756Dor
    public final void AWL(boolean z) {
    }

    @Override // X.InterfaceC5756Dor
    public final void AWZ(List<DwN> list) {
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void AXB(C5790DpZ c5790DpZ) {
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void AXJ(C5623Dm6 c5623Dm6) {
    }

    @Override // X.InterfaceC5756Dor
    public final void onCues(List<DXC> list) {
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void onIsLoadingChanged(boolean z) {
    }

    @Override // X.InterfaceC5756Dor
    public final void onVolumeChanged(float f) {
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void ARz(String str, long j) {
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void ASF(String str, boolean z) {
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void ASG(String str, boolean z) {
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void ATS(String str, long j) {
    }

    @Override // X.InterfaceC5756Dor
    public final void AUI(byte[] bArr, long j) {
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void AUU(String str, String str2) {
    }

    @Override // X.InterfaceC5756Dor
    public final void AUw(C5623Dm6 c5623Dm6, String str) {
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void AVg(long j, long j2) {
    }

    @Override // X.InterfaceC5756Dor
    public final void AVh(long j, String str) {
    }

    @Override // X.InterfaceC5756Dor
    public final void AX8(String str, String str2) {
    }

    @Override // X.InterfaceC5756Dor
    public final void AXL(boolean z, boolean z2) {
    }

    @Override // X.InterfaceC5756Dor
    public final void ASV(String str, boolean z, long j) {
    }

    @Override // X.InterfaceC5756Dor
    public final void AUg(C5623Dm6 c5623Dm6, float f, long j) {
    }

    @Override // X.InterfaceC5756Dor
    public final void AXG(int i, int i2, float f) {
    }

    @Override // X.InterfaceC5756Dor
    public final /* synthetic */ void onImfEventEmsgReceived(byte[] bArr, String str, long j) {
    }

    @Override // X.InterfaceC5756Dor
    public final void AT7(C5790DpZ c5790DpZ, String str, String str2, String str3, long j) {
    }

    @Override // X.InterfaceC5756Dor
    public final void ATm(String str, long j, long j2, long j3, long j4) {
    }

    @Override // X.InterfaceC5756Dor
    public final void AW9(Dq8 dq8, C5623Dm6 c5623Dm6, String str, long j, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC5756Dor
    public final void AWG(C5623Dm6 c5623Dm6, long j, long j2, boolean z, boolean z2, boolean z3) {
    }

    /* JADX WARN: Incorrect types in method signature: (LX/DoI;LX/DoI;JLjava/lang/String;Ljava/util/List<Ljava/lang/String;>;Ljava/lang/String;LX/DpZ;)V */
    @Override // X.InterfaceC5756Dor
    public final void AWc(C5790DpZ c5790DpZ, C5723DoI c5723DoI, C5723DoI c5723DoI2, String str, String str2, List list, long j) {
    }
}
