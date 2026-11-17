package androidx.compose.foundation.lazy;

import X.A4A;
import X.AFs;
import X.AGE;
import X.AGG;
import X.AZ3;
import X.AbstractC0871AFr;
import X.AbstractC0878AGe;
import X.Ac3;
import X.Acy;
import X.AdI;
import X.AdJ;
import X.AdT;
import X.Ae4;
import X.AnonymousClass001;
import X.Av9;
import X.BT5;
import X.BU5;
import X.C1057ATe;
import X.C1145Aby;
import X.C1160Acs;
import X.C1161Act;
import X.C1192Adv;
import X.C1229Af7;
import X.C16C;
import X.C1qN;
import X.C2278BSe;
import X.C2282BSi;
import X.C2289BSp;
import X.C2295BSv;
import X.C2A9;
import X.C3UY;
import X.C3cG;
import X.C60B;
import X.C6XV;
import X.C8j3;
import X.EnumC10460Hji;
import X.HtJ;
import X.InterfaceC1072AWd;
import X.InterfaceC1147Ac5;
import X.InterfaceC1180Adj;
import X.InterfaceC1193Adw;
import X.InterfaceC1195AeC;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class LazyListState implements InterfaceC1180Adj {
    public static final AFs<LazyListState, ?> A0Q = AbstractC0871AFr.A00(C2278BSe.A00(47), C2282BSi.A00(1));
    public float A00;
    public C1161Act A01;
    public InterfaceC1147Ac5 A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public int A06;
    public boolean A07;
    public final InterfaceC1180Adj A08;
    public final InterfaceC1072AWd A09;
    public final Ae4 A0A;
    public final AdJ A0B;
    public final Av9 A0C;
    public final C1145Aby A0D;
    public final Acy<C1160Acs> A0E;
    public final A4A A0F;
    public final C1229Af7 A0G;
    public final C1057ATe A0H;
    public final MutableState A0I;
    public final MutableState A0J;
    public final MutableState<C1161Act> A0K;
    public final MutableState<Unit> A0L;
    public final MutableState<Unit> A0M;
    public final InterfaceC1195AeC A0N;
    public final InterfaceC1193Adw A0O;
    public final C1192Adv A0P;

    public final Object A06(int i, int i2, HtJ<? super Unit> htJ) {
        Object objAcF = AcF(C3UY.A02, htJ, new BU5(this, null, i, i2, 0));
        return objAcF != EnumC10460Hji.A02 ? Unit.INSTANCE : objAcF;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/3UY;LX/G0V<-LX/3Q0;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    @Override // X.InterfaceC1180Adj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AcF(X.C3UY r7, X.HtJ r8, X.G0V r9) {
        /*
            r6 = this;
            r3 = 3
            boolean r0 = r8 instanceof X.C2314BTo
            if (r0 == 0) goto L62
            r5 = r8
            X.BTo r5 = (X.C2314BTo) r5
            int r0 = r5.$t
            if (r0 != r3) goto L62
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L62
            int r2 = r2 - r1
            r5.A00 = r2
        L17:
            java.lang.Object r1 = r5.A03
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L2b
            if (r0 == r2) goto L47
            if (r0 != r3) goto L68
            X.Hwg.A00(r1)
        L28:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L2b:
            X.Hwg.A00(r1)
            androidx.compose.runtime.MutableState<X.Act> r0 = r6.A0K
            java.lang.Object r1 = r0.getValue()
            X.Act r0 = X.AZ3.A00
            if (r1 != r0) goto L52
            X.Av9 r0 = r6.A0C
            r5.A01 = r7
            r5.A02 = r9
            r5.A00 = r2
            java.lang.Object r0 = r0.A00(r5)
            if (r0 != r4) goto L52
            return r4
        L47:
            java.lang.Object r9 = r5.A02
            X.G0V r9 = (X.G0V) r9
            java.lang.Object r7 = r5.A01
            X.3UY r7 = (X.C3UY) r7
            X.Hwg.A00(r1)
        L52:
            X.Adj r1 = r6.A08
            r0 = 0
            r5.A01 = r0
            r5.A02 = r0
            r5.A00 = r3
            java.lang.Object r0 = r1.AcF(r7, r5, r9)
            if (r0 != r4) goto L28
            return r4
        L62:
            X.BTo r5 = new X.BTo
            r5.<init>(r6, r8, r3)
            goto L17
        L68:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.AcF(X.3UY, X.HtJ, X.G0V):java.lang.Object");
    }

    public static final void A00(C2A9 c2a9, LazyListState lazyListState, float f) {
        boolean zA1R;
        int iA00;
        int i;
        Ac3 ac3;
        if (lazyListState.A07) {
            Ae4 ae4 = lazyListState.A0A;
            InterfaceC1193Adw interfaceC1193Adw = lazyListState.A0O;
            AdI adI = (AdI) ae4;
            C1161Act c1161Act = (C1161Act) c2a9;
            List<C1160Acs> list = c1161Act.A0D;
            if (!list.isEmpty() && (iA00 = AdI.A00(c2a9, (zA1R = C8j3.A1R((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)))))) >= 0 && iA00 < c1161Act.A05) {
                if (iA00 != adI.A01) {
                    if (adI.A04 != zA1R) {
                        adI.A01 = -1;
                        Ac3 ac32 = adI.A03;
                        if (ac32 != null) {
                            ac32.cancel();
                        }
                        adI.A03 = null;
                    }
                    adI.A04 = zA1R;
                    adI.A01 = iA00;
                    adI.A03 = interfaceC1193Adw.AcC(null, iA00);
                }
                if (zA1R) {
                    C1160Acs c1160Acs = (C1160Acs) ((C16C) AbstractC0878AGe.A0H(list));
                    i = ((((c1160Acs.A02 + c1160Acs.A09) + c1161Act.A04) - c1161Act.A06) > (-f) ? 1 : ((((c1160Acs.A02 + c1160Acs.A09) + c1161Act.A04) - c1161Act.A06) == (-f) ? 0 : -1));
                } else {
                    i = ((c1161Act.A07 - ((C1160Acs) ((C16C) AbstractC0878AGe.A0F(list))).A02) > f ? 1 : ((c1161Act.A07 - ((C1160Acs) ((C16C) AbstractC0878AGe.A0F(list))).A02) == f ? 0 : -1));
                }
                if (i < 0 && (ac3 = adI.A03) != null) {
                    ac3.AQ7();
                }
            }
            adI.A00 = f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C1161Act r8, androidx.compose.foundation.lazy.LazyListState r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.A01(X.Act, androidx.compose.foundation.lazy.LazyListState, boolean, boolean):void");
    }

    public final int A02() {
        return this.A0B.A03.AGd();
    }

    public final int A03() {
        return this.A0B.A04.AGd();
    }

    public final C2A9 A04() {
        return this.A0K.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(int r8, int r9, X.HtJ<? super kotlin.Unit> r10) {
        /*
            r7 = this;
            r3 = 14
            boolean r0 = r10 instanceof X.C2310BTk
            r6 = r7
            if (r0 == 0) goto L26
            r4 = r10
            X.BTk r4 = (X.C2310BTk) r4
            int r0 = r4.$t
            if (r0 != r3) goto L26
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r4.A00 = r2
        L19:
            java.lang.Object r3 = r4.A01
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r4.A00
            r10 = 0
            r0 = 1
            if (r1 == 0) goto L35
            if (r1 != r0) goto L30
            goto L2c
        L26:
            X.BTk r4 = new X.BTk
            r4.<init>(r7, r10, r3)
            goto L19
        L2c:
            X.Hwg.A00(r3)     // Catch: java.lang.Throwable -> L50
            goto L4b
        L30:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L35:
            X.Hwg.A00(r3)
            r7.A05 = r0     // Catch: java.lang.Throwable -> L50
            r7 = 0
            X.BU9 r5 = new X.BU9     // Catch: java.lang.Throwable -> L50
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L50
            r4.A00 = r0     // Catch: java.lang.Throwable -> L50
            X.3UY r0 = X.C3UY.A02     // Catch: java.lang.Throwable -> L50
            java.lang.Object r0 = r6.AcF(r0, r4, r5)     // Catch: java.lang.Throwable -> L50
            if (r0 != r2) goto L4b
            return r2
        L4b:
            r6.A05 = r10
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L50:
            r0 = move-exception
            r6.A05 = r10
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.A05(int, int, X.HtJ):java.lang.Object");
    }

    public final void A07(int i, int i2) {
        if (this.A08.AOz()) {
            AnonymousClass001.A1J(new C60B(this, null, 1), this.A0K.getValue().A0E);
        }
        A08(i, i2, false);
    }

    public final void A08(int i, int i2, boolean z) {
        AdJ adJ = this.A0B;
        if (adJ.A03.AGd() != i || adJ.A04.AGd() != i2) {
            Acy.A02(this.A0E);
        }
        AdJ.A00(adJ, i, i2);
        adJ.A00 = null;
        if (!z) {
            this.A0L.Af8(Unit.INSTANCE);
            return;
        }
        InterfaceC1147Ac5 interfaceC1147Ac5 = this.A02;
        if (interfaceC1147Ac5 != null) {
            interfaceC1147Ac5.ABn();
        }
    }

    @Override // X.InterfaceC1180Adj
    public final float A98(float f) {
        return this.A08.A98(f);
    }

    @Override // X.InterfaceC1180Adj
    public final boolean ADN() {
        return MutableState.A0A(this.A0I);
    }

    @Override // X.InterfaceC1180Adj
    public final boolean ADO() {
        return MutableState.A0A(this.A0J);
    }

    @Override // X.InterfaceC1180Adj
    public final boolean AOz() {
        return this.A08.AOz();
    }

    public LazyListState(Ae4 ae4, int i, int i2) {
        this.A0A = ae4;
        this.A0B = new AdJ(i, i2);
        C1161Act c1161Act = AZ3.A00;
        AGG agg = AGG.A00;
        this.A0K = C3cG.A08(agg, c1161Act);
        this.A09 = new C1qN();
        this.A08 = new C6XV(C2295BSv.A00(this, 30));
        this.A07 = true;
        this.A0N = new C2289BSp(this, 0);
        this.A0C = new Av9();
        this.A0E = new Acy<>();
        this.A0D = new C1145Aby();
        BT5 bt5 = new BT5(this, i, 0);
        C1229Af7 c1229Af7 = new C1229Af7();
        c1229Af7.A04 = bt5;
        this.A0G = c1229Af7;
        this.A0O = new AdT(this);
        this.A0P = new C1192Adv(this);
        this.A0F = new A4A();
        Unit unit = Unit.INSTANCE;
        this.A0L = C3cG.A08(agg, unit);
        AGE age = AGE.A00;
        this.A0J = C3cG.A08(age, false);
        this.A0I = C3cG.A08(age, false);
        this.A0M = C3cG.A08(agg, unit);
        this.A0H = new C1057ATe();
    }

    public LazyListState(int i, int i2) {
        AdI adI = new AdI();
        adI.A01 = -1;
        adI.A02 = -1;
        this(adI, i, i2);
    }

    public LazyListState() {
        AdI adI = new AdI();
        adI.A01 = -1;
        adI.A02 = -1;
        this(adI, 0, 0);
    }
}
