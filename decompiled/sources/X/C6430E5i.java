package X;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.common.Timeline;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.E5i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6430E5i {
    public boolean A01;
    public CXB A02;
    public final InterfaceC6459E6s A03;
    public final InterfaceC6436E5o A04;
    public final E65 A05;
    public final E6Y A09;
    public InterfaceC6437E5p A00 = new C6429E5h(new Random(), new int[0]);
    public final IdentityHashMap<InterfaceC6006Dtp, C6431E5j> A0A = new IdentityHashMap<>();
    public final Map<Object, C6431E5j> A0B = BV4.A0u();
    public final List<C6431E5j> A07 = C3cG.A0h();
    public final HashMap<C6431E5j, C6433E5l> A06 = BV4.A0u();
    public final Set<C6431E5j> A08 = C60O.A13();

    public static void A03(C6430E5i c6430E5i, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            List<C6431E5j> list = c6430E5i.A07;
            C6431E5j c6431E5jRemove = list.remove(i3);
            c6430E5i.A0B.remove(c6431E5jRemove.A03);
            int i4 = -c6431E5jRemove.A02.A01.A02();
            for (int i5 = i3; i5 < list.size(); i5++) {
                list.get(i5).A00 += i4;
            }
            c6431E5jRemove.A01 = true;
            if (c6430E5i.A01) {
                c6430E5i.A01(c6431E5jRemove);
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (IILjava/util/List<LX/Dnm;>;)Landroidx/media3/common/Timeline; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.media3.common.Timeline A07(java.util.List r4, int r5, int r6) {
        /*
            r3 = this;
            r2 = 0
            if (r5 < 0) goto Le
            if (r5 > r6) goto Le
            java.util.List<X.E5j> r0 = r3.A07
            int r1 = r0.size()
            r0 = 1
            if (r6 <= r1) goto Lf
        Le:
            r0 = 0
        Lf:
            X.C1G.A07(r0)
            int r1 = r4.size()
            int r0 = r6 - r5
            if (r1 != r0) goto L1b
            r2 = 1
        L1b:
            X.C1G.A07(r2)
            r1 = r5
        L1f:
            if (r1 >= r6) goto L2e
            java.util.List<X.E5j> r0 = r3.A07
            r0.get(r1)
            int r0 = r1 - r5
            r4.get(r0)
            int r1 = r1 + 1
            goto L1f
        L2e:
            androidx.media3.common.Timeline r0 = r3.A04()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6430E5i.A07(java.util.List, int, int):androidx.media3.common.Timeline");
    }

    private void A00() {
        Iterator<C6431E5j> it = this.A08.iterator();
        while (it.hasNext()) {
            C6431E5j next = it.next();
            if (next.A04.isEmpty()) {
                C6433E5l c6433E5l = this.A06.get(next);
                if (c6433E5l != null) {
                    c6433E5l.A02.A91(c6433E5l.A01);
                }
                it.remove();
            }
        }
    }

    private void A01(C6431E5j c6431E5j) {
        if (c6431E5j.A01 && c6431E5j.A04.isEmpty()) {
            C6433E5l c6433E5lRemove = this.A06.remove(c6431E5j);
            c6433E5lRemove.getClass();
            C6433E5l c6433E5l = c6433E5lRemove;
            InterfaceC6009Dts interfaceC6009Dts = c6433E5l.A02;
            interfaceC6009Dts.AaJ(c6433E5l.A01);
            C6466E7g c6466E7g = c6433E5l.A00;
            interfaceC6009Dts.Aap(c6466E7g);
            interfaceC6009Dts.Aao(c6466E7g);
            this.A08.remove(c6431E5j);
        }
    }

    private void A02(C6431E5j c6431E5j) {
        C6004Dtn c6004Dtn = c6431E5j.A02;
        InterfaceC6025DuK interfaceC6025DuK = new InterfaceC6025DuK() { // from class: X.E5k
            @Override // X.InterfaceC6025DuK
            public final void AW1(Timeline timeline, InterfaceC6009Dts interfaceC6009Dts) {
                this.A00.A04.AUk();
            }
        };
        C6466E7g c6466E7g = new C6466E7g(c6431E5j, this);
        this.A06.put(c6431E5j, new C6433E5l(c6466E7g, interfaceC6025DuK, c6004Dtn));
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        c6004Dtn.A3W(new Handler(looperMyLooper, null), c6466E7g);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper2, null);
        CopyOnWriteArrayList<C6023DuI> copyOnWriteArrayList = ((AbstractC6011Dtu) c6004Dtn).A03.A02;
        C6023DuI c6023DuI = new C6023DuI();
        c6023DuI.A00 = handler;
        c6023DuI.A01 = c6466E7g;
        copyOnWriteArrayList.add(c6023DuI);
        c6004Dtn.AYS(this.A02, this.A09, interfaceC6025DuK);
    }

    public final Timeline A04() {
        List<C6431E5j> list = this.A07;
        if (list.isEmpty()) {
            return Timeline.A00;
        }
        int iA02 = 0;
        for (int i = 0; i < list.size(); i++) {
            C6431E5j c6431E5j = list.get(i);
            c6431E5j.A00 = iA02;
            iA02 += c6431E5j.A02.A01.A02();
        }
        return new C6428E5g(this.A00, list);
    }

    public final Timeline A05(InterfaceC6437E5p interfaceC6437E5p) {
        int size = this.A07.size();
        C6429E5h c6429E5h = (C6429E5h) interfaceC6437E5p;
        if (c6429E5h.A02.length != size) {
            interfaceC6437E5p = new C6429E5h(new Random(c6429E5h.A00.nextLong()), new int[0]).A6P(0, size);
        }
        this.A00 = interfaceC6437E5p;
        return A04();
    }

    public final C6003Dtm A08(Dy6 dy6, InterfaceC5538DkF interfaceC5538DkF, long j) {
        Object obj = dy6.A04;
        Timeline timeline = Timeline.A00;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Dy6 dy6A01 = dy6.A01(pair.second);
        C6431E5j c6431E5j = (C6431E5j) BV6.A0l(obj2, this.A0B);
        this.A08.add(c6431E5j);
        C6433E5l c6433E5l = this.A06.get(c6431E5j);
        if (c6433E5l != null) {
            c6433E5l.A02.A9x(c6433E5l.A01);
        }
        c6431E5j.A04.add(dy6A01);
        C6003Dtm c6003DtmA7x = c6431E5j.A02.A7x(dy6A01, interfaceC5538DkF, j);
        this.A0A.put(c6003DtmA7x, c6431E5j);
        A00();
        return c6003DtmA7x;
    }

    public final void A09() {
        HashMap<C6431E5j, C6433E5l> map = this.A06;
        Iterator itA0x = BV5.A0x(map);
        while (itA0x.hasNext()) {
            C6433E5l c6433E5l = (C6433E5l) itA0x.next();
            try {
                c6433E5l.A02.AaJ(c6433E5l.A01);
            } catch (RuntimeException e) {
                CNC.A05("MediaSourceList", "Failed to release child source.", e);
            }
            InterfaceC6009Dts interfaceC6009Dts = c6433E5l.A02;
            C6466E7g c6466E7g = c6433E5l.A00;
            interfaceC6009Dts.Aap(c6466E7g);
            interfaceC6009Dts.Aao(c6466E7g);
        }
        map.clear();
        this.A08.clear();
        this.A01 = false;
    }

    public final void A0A(CXB cxb) {
        C1G.A08(!this.A01);
        this.A02 = cxb;
        int i = 0;
        while (true) {
            List<C6431E5j> list = this.A07;
            if (i >= list.size()) {
                this.A01 = true;
                return;
            }
            C6431E5j c6431E5j = list.get(i);
            A02(c6431E5j);
            this.A08.add(c6431E5j);
            i++;
        }
    }

    public final void A0B(InterfaceC6006Dtp interfaceC6006Dtp) {
        IdentityHashMap<InterfaceC6006Dtp, C6431E5j> identityHashMap = this.A0A;
        C6431E5j c6431E5jRemove = identityHashMap.remove(interfaceC6006Dtp);
        c6431E5jRemove.getClass();
        C6431E5j c6431E5j = c6431E5jRemove;
        c6431E5j.A02.AaI(interfaceC6006Dtp);
        c6431E5j.A04.remove(((C6003Dtm) interfaceC6006Dtp).A05);
        if (!identityHashMap.isEmpty()) {
            A00();
        }
        A01(c6431E5j);
    }

    public C6430E5i(InterfaceC6459E6s interfaceC6459E6s, InterfaceC6436E5o interfaceC6436E5o, E65 e65, E6Y e6y) {
        this.A09 = e6y;
        this.A04 = interfaceC6436E5o;
        this.A05 = e65;
        this.A03 = interfaceC6459E6s;
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/List<LX/E5j;>;LX/E5p;)Landroidx/media3/common/Timeline; */
    public final Timeline A06(InterfaceC6437E5p interfaceC6437E5p, List list, int i) {
        int iA02;
        List<C6431E5j> list2;
        if (!list.isEmpty()) {
            this.A00 = interfaceC6437E5p;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                C6431E5j c6431E5j = (C6431E5j) list.get(i2 - i);
                if (i2 > 0) {
                    C6431E5j c6431E5j2 = this.A07.get(i2 - 1);
                    iA02 = c6431E5j2.A00 + c6431E5j2.A02.A01.A02();
                } else {
                    iA02 = 0;
                }
                c6431E5j.A00 = iA02;
                c6431E5j.A01 = false;
                c6431E5j.A04.clear();
                int iA022 = c6431E5j.A02.A01.A02();
                int i3 = i2;
                while (true) {
                    list2 = this.A07;
                    if (i3 >= list2.size()) {
                        break;
                    }
                    list2.get(i3).A00 += iA022;
                    i3++;
                }
                list2.add(i2, c6431E5j);
                this.A0B.put(c6431E5j.A03, c6431E5j);
                if (this.A01) {
                    A02(c6431E5j);
                    if (this.A0A.isEmpty()) {
                        this.A08.add(c6431E5j);
                    } else {
                        C6433E5l c6433E5l = this.A06.get(c6431E5j);
                        if (c6433E5l != null) {
                            c6433E5l.A02.A91(c6433E5l.A01);
                        }
                    }
                }
            }
        }
        return A04();
    }
}
