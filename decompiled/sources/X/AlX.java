package X;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AlX implements InterfaceC2238BCj {
    public C0918AHu<BBb, AlY> A00;
    public C0917AHt<BKv> A01;
    public C0917AHt<InterfaceC1560Ala> A02;
    public AbstractC0916AHs<InterfaceC1560Ala> A03;
    public C0910AHm<InterfaceC1560Ala> A04;
    public InterfaceC1490Ajx A05;
    public ArrayList<C0910AHm<InterfaceC1560Ala>> A06;
    public Set<InterfaceC1559AlZ> A07;
    public final C0910AHm<Object> A08;
    public final C0910AHm<InterfaceC1560Ala> A09;
    public final C0910AHm<Function0<Unit>> A0A;

    public final void A01() {
        this.A07 = null;
        this.A05 = null;
        C0910AHm<InterfaceC1560Ala> c0910AHm = this.A09;
        c0910AHm.A09();
        this.A02.A06();
        this.A04 = c0910AHm;
        this.A08.A09();
        this.A0A.A09();
        this.A01 = null;
        this.A00 = null;
        this.A06 = null;
    }

    public static final boolean A00(InterfaceC1560Ala interfaceC1560Ala, C0910AHm<InterfaceC1560Ala> c0910AHm) {
        InterfaceC1560Ala[] interfaceC1560AlaArr = c0910AHm.A01;
        int i = c0910AHm.A00;
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC1559AlZ interfaceC1559AlZ = ((BAU) interfaceC1560AlaArr[i2]).A01;
            if (interfaceC1559AlZ instanceof AlY) {
                C0910AHm<InterfaceC1560Ala> c0910AHm2 = ((AlY) interfaceC1559AlZ).A00;
                if (c0910AHm2.A0I(interfaceC1560Ala) || A00(interfaceC1560Ala, c0910AHm2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void A02() {
        Set<InterfaceC1559AlZ> set = this.A07;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator<InterfaceC1559AlZ> it = set.iterator();
            while (it.hasNext()) {
                InterfaceC1559AlZ next = it.next();
                it.remove();
                next.onAbandoned();
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03() {
        /*
            r6 = this;
            java.util.Set<X.AlZ> r5 = r6.A07
            if (r5 == 0) goto L8d
            r0 = 0
            r6.A03 = r0
            X.AHm<java.lang.Object> r4 = r6.A08
            int r0 = r4.A00
            if (r0 == 0) goto L53
            java.lang.String r0 = "Compose:onForgotten"
            android.os.Trace.beginSection(r0)
            X.AHt<X.BKv> r3 = r6.A01     // Catch: java.lang.Throwable -> L88
            int r1 = r4.A00     // Catch: java.lang.Throwable -> L88
        L16:
            int r1 = r1 + (-1)
            r0 = -1
            if (r0 >= r1) goto L50
            T[] r0 = r4.A01     // Catch: java.lang.Throwable -> L88
            r2 = r0[r1]     // Catch: java.lang.Throwable -> L88
            boolean r0 = r2 instanceof X.InterfaceC1560Ala     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L30
            r0 = r2
            X.Ala r0 = (X.InterfaceC1560Ala) r0     // Catch: java.lang.Throwable -> L4a
            X.BAU r0 = (X.BAU) r0     // Catch: java.lang.Throwable -> L4a
            X.AlZ r0 = r0.A01     // Catch: java.lang.Throwable -> L4a
            r5.remove(r0)     // Catch: java.lang.Throwable -> L4a
            r0.onForgotten()     // Catch: java.lang.Throwable -> L4a
        L30:
            boolean r0 = r2 instanceof X.BKv     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L16
            if (r3 == 0) goto L43
            boolean r0 = r3.A05(r2)     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L43
            r0 = r2
            X.BKv r0 = (X.BKv) r0     // Catch: java.lang.Throwable -> L4a
            r0.AVE()     // Catch: java.lang.Throwable -> L4a
            goto L16
        L43:
            r0 = r2
            X.BKv r0 = (X.BKv) r0     // Catch: java.lang.Throwable -> L4a
            r0.ASU()     // Catch: java.lang.Throwable -> L4a
            goto L16
        L4a:
            r1 = move-exception
            X.Ajx r0 = r6.A05     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L83
            goto L80
        L50:
            android.os.Trace.endSection()
        L53:
            X.AHm<X.Ala> r1 = r6.A09
            int r0 = r1.A00
            if (r0 == 0) goto L8d
            java.lang.String r0 = "Compose:onRemembered"
            android.os.Trace.beginSection(r0)
            java.util.Set<X.AlZ> r5 = r6.A07     // Catch: java.lang.Throwable -> L88
            if (r5 == 0) goto L84
            T[] r4 = r1.A01     // Catch: java.lang.Throwable -> L88
            int r3 = r1.A00     // Catch: java.lang.Throwable -> L88
            r1 = 0
        L67:
            if (r1 >= r3) goto L84
            r2 = r4[r1]     // Catch: java.lang.Throwable -> L88
            X.Ala r2 = (X.InterfaceC1560Ala) r2     // Catch: java.lang.Throwable -> L88
            r0 = r2
            X.BAU r0 = (X.BAU) r0     // Catch: java.lang.Throwable -> L88
            X.AlZ r0 = r0.A01     // Catch: java.lang.Throwable -> L88
            r5.remove(r0)     // Catch: java.lang.Throwable -> L88
            r0.onRemembered()     // Catch: java.lang.Throwable -> L7b
            int r1 = r1 + 1
            goto L67
        L7b:
            r1 = move-exception
            X.Ajx r0 = r6.A05     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L83
        L80:
            r0.A4s(r2, r1)     // Catch: java.lang.Throwable -> L88
        L83:
            throw r1     // Catch: java.lang.Throwable -> L88
        L84:
            android.os.Trace.endSection()
            return
        L88:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AlX.A03():void");
    }

    public final void A04() {
        C0910AHm<Function0<Unit>> c0910AHm = this.A0A;
        if (c0910AHm.A00 != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Function0<Unit>[] function0Arr = c0910AHm.A01;
                int i = c0910AHm.A00;
                for (int i2 = 0; i2 < i; i2++) {
                    function0Arr[i2].invoke();
                }
                c0910AHm.A09();
            } finally {
                Trace.endSection();
            }
        }
    }

    @Override // X.InterfaceC2238BCj
    public final void ABp(InterfaceC1560Ala interfaceC1560Ala) {
        if (!this.A02.A05(interfaceC1560Ala)) {
            AbstractC0916AHs<InterfaceC1560Ala> abstractC0916AHs = this.A03;
            if (abstractC0916AHs == null || !abstractC0916AHs.A05(interfaceC1560Ala)) {
                this.A08.A0G(interfaceC1560Ala);
                return;
            }
            return;
        }
        this.A02.A0C(interfaceC1560Ala);
        if (!this.A04.A0I(interfaceC1560Ala)) {
            C0910AHm<InterfaceC1560Ala> c0910AHm = this.A09;
            if (!c0910AHm.A0I(interfaceC1560Ala)) {
                A00(interfaceC1560Ala, c0910AHm);
            }
        }
        Set<InterfaceC1559AlZ> set = this.A07;
        if (set != null) {
            set.add(((BAU) interfaceC1560Ala).A01);
        }
    }

    public AlX() {
        C0910AHm<InterfaceC1560Ala> c0910AHmA02 = C0910AHm.A02(new InterfaceC1560Ala[16], 0);
        this.A09 = c0910AHmA02;
        this.A02 = C0917AHt.A02();
        this.A04 = c0910AHmA02;
        this.A08 = C0910AHm.A02(new Object[16], 0);
        this.A0A = C0910AHm.A02(new Function0[16], 0);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Set<LX/AlZ;>;LX/Ajx;)V */
    public final void A05(InterfaceC1490Ajx interfaceC1490Ajx, Set set) {
        A01();
        this.A07 = set;
        this.A05 = interfaceC1490Ajx;
    }
}
