package androidx.compose.foundation.lazy.grid;

import X.A4A;
import X.AFs;
import X.AGE;
import X.AGG;
import X.AbstractC0871AFr;
import X.AbstractC0878AGe;
import X.AbstractC1061ATk;
import X.AbstractC1182Adl;
import X.Ac3;
import X.Acy;
import X.Ad0;
import X.Ad2;
import X.Ad5;
import X.Ad7;
import X.AdE;
import X.Ae5;
import X.Ae6;
import X.Ae7;
import X.AnonymousClass001;
import X.Av9;
import X.BT5;
import X.BU5;
import X.C00r;
import X.C0910AHm;
import X.C1057ATe;
import X.C1145Aby;
import X.C1176Adf;
import X.C1191Adu;
import X.C1229Af7;
import X.C1qN;
import X.C2278BSe;
import X.C2282BSi;
import X.C2289BSp;
import X.C2295BSv;
import X.C3UY;
import X.C3cG;
import X.C6XV;
import X.C8j3;
import X.C8j5;
import X.EnumC10460Hji;
import X.EnumC1108AYu;
import X.F60;
import X.HtJ;
import X.InterfaceC1072AWd;
import X.InterfaceC1147Ac5;
import X.InterfaceC1180Adj;
import X.InterfaceC1187Adq;
import X.InterfaceC1195AeC;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class LazyGridState implements InterfaceC1180Adj {
    public static final AFs<LazyGridState, ?> A0O = AbstractC0871AFr.A00(C2278BSe.A00(49), C2282BSi.A00(3));
    public float A00;
    public Ad2 A01;
    public InterfaceC1147Ac5 A02;
    public boolean A03;
    public int A04;
    public boolean A05;
    public final InterfaceC1180Adj A06;
    public final InterfaceC1072AWd A07;
    public final Ae7 A08;
    public final C1176Adf A09;
    public final Av9 A0A;
    public final C1145Aby A0B;
    public final Acy<Ad0> A0C;
    public final A4A A0D;
    public final C1229Af7 A0E;
    public final C1057ATe A0F;
    public final MutableState A0G;
    public final MutableState A0H;
    public final MutableState<Ad2> A0I;
    public final MutableState<Unit> A0J;
    public final MutableState<Unit> A0K;
    public final InterfaceC1195AeC A0L;
    public final InterfaceC1187Adq A0M;
    public final C1191Adu A0N;

    /* JADX WARN: Incorrect types in method signature: (IILX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    public static final Object A00(LazyGridState lazyGridState, HtJ htJ, int i) {
        Object objAcF = lazyGridState.AcF(C3UY.A02, htJ, new BU5(lazyGridState, null, i, 0, 1));
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
            r3 = 4
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
            androidx.compose.runtime.MutableState<X.Ad2> r0 = r6.A0I
            java.lang.Object r1 = r0.getValue()
            X.Ad2 r0 = X.Ad7.A00
            if (r1 != r0) goto L52
            X.Av9 r0 = r6.A0A
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
            X.Adj r1 = r6.A06
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridState.AcF(X.3UY, X.HtJ, X.G0V):java.lang.Object");
    }

    public static final void A01(Ae5 ae5, LazyGridState lazyGridState, float f) {
        if (lazyGridState.A05) {
            Ae7 ae7 = lazyGridState.A08;
            InterfaceC1187Adq interfaceC1187Adq = lazyGridState.A0M;
            AdE adE = (AdE) ae7;
            Ad2 ad2 = (Ad2) ae5;
            List<Ad0> list = ad2.A0D;
            if (!list.isEmpty()) {
                int i = 0;
                boolean zA1R = C8j3.A1R((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)));
                int iA00 = AdE.A00(ae5, zA1R);
                int i2 = zA1R ? ((Ad0) ((Ae6) AbstractC0878AGe.A0H(list))).A08 + 1 : ((Ad0) ((Ae6) AbstractC0878AGe.A0F(list))).A08 - 1;
                if (i2 >= 0 && i2 < ad2.A06) {
                    if (iA00 != adE.A01 && iA00 >= 0) {
                        if (adE.A03 != zA1R) {
                            C0910AHm<Ac3> c0910AHm = adE.A04;
                            Ac3[] ac3Arr = c0910AHm.A01;
                            int i3 = c0910AHm.A00;
                            for (int i4 = 0; i4 < i3; i4++) {
                                ac3Arr[i4].cancel();
                            }
                        }
                        adE.A03 = zA1R;
                        adE.A01 = iA00;
                        C0910AHm<Ac3> c0910AHm2 = adE.A04;
                        c0910AHm2.A09();
                        c0910AHm2.A0E(interfaceC1187Adq.Ac9(iA00), c0910AHm2.A00);
                    }
                    if (zA1R) {
                        Ae6 ae6 = (Ae6) AbstractC0878AGe.A0H(list);
                        EnumC1108AYu enumC1108AYu = ad2.A09;
                        if (((AbstractC1182Adl.A00(enumC1108AYu, ae6) + ((int) C8j5.A0F(((Ad0) ae6).A0B, enumC1108AYu, EnumC1108AYu.A03))) + ad2.A04) - ad2.A07 < (-f)) {
                            C0910AHm<Ac3> c0910AHm3 = adE.A04;
                            Ac3[] ac3Arr2 = c0910AHm3.A01;
                            int i5 = c0910AHm3.A00;
                            while (i < i5) {
                                ac3Arr2[i].AQ7();
                                i++;
                            }
                        }
                    } else if (ad2.A08 - AbstractC1182Adl.A00(ad2.A09, (Ae6) AbstractC0878AGe.A0F(list)) < f) {
                        C0910AHm<Ac3> c0910AHm4 = adE.A04;
                        Ac3[] ac3Arr3 = c0910AHm4.A01;
                        int i6 = c0910AHm4.A00;
                        while (i < i6) {
                            ac3Arr3[i].AQ7();
                            i++;
                        }
                    }
                }
            }
            adE.A00 = f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.Ad2 r8, androidx.compose.foundation.lazy.grid.LazyGridState r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridState.A02(X.Ad2, androidx.compose.foundation.lazy.grid.LazyGridState, boolean, boolean):void");
    }

    public final void A03(int i, int i2, boolean z) {
        C1176Adf c1176Adf = this.A09;
        C00r c00r = c1176Adf.A03;
        if (c00r.AGd() != i || c1176Adf.A04.AGd() != i2) {
            Acy.A02(this.A0C);
        }
        if (i < 0.0f) {
            AbstractC1061ATk.A00("Index should be non-negative");
            throw F60.createAndThrow();
        }
        c00r.AdX(i);
        c1176Adf.A02.A00(i);
        c1176Adf.A04.AdX(i2);
        c1176Adf.A00 = null;
        if (!z) {
            this.A0J.Af8(Unit.INSTANCE);
            return;
        }
        InterfaceC1147Ac5 interfaceC1147Ac5 = this.A02;
        if (interfaceC1147Ac5 != null) {
            interfaceC1147Ac5.ABn();
        }
    }

    @Override // X.InterfaceC1180Adj
    public final float A98(float f) {
        return this.A06.A98(f);
    }

    @Override // X.InterfaceC1180Adj
    public final boolean ADN() {
        return MutableState.A0A(this.A0G);
    }

    @Override // X.InterfaceC1180Adj
    public final boolean ADO() {
        return MutableState.A0A(this.A0H);
    }

    @Override // X.InterfaceC1180Adj
    public final boolean AOz() {
        return this.A06.AOz();
    }

    public LazyGridState(Ae7 ae7, int i, int i2) {
        this.A08 = ae7;
        this.A09 = new C1176Adf(i, i2);
        Ad2 ad2 = Ad7.A00;
        AGG agg = AGG.A00;
        this.A0I = C3cG.A08(agg, ad2);
        this.A07 = new C1qN();
        this.A06 = new C6XV(C2295BSv.A00(this, 34));
        this.A05 = true;
        this.A0L = new C2289BSp(this, 1);
        this.A0A = new Av9();
        this.A0C = new Acy<>();
        this.A0B = new C1145Aby();
        BT5 bt5 = new BT5(this, i, 1);
        C1229Af7 c1229Af7 = new C1229Af7();
        c1229Af7.A04 = bt5;
        this.A0E = c1229Af7;
        this.A0M = new Ad5(this);
        this.A0N = new C1191Adu(this);
        this.A0D = new A4A();
        Unit unit = Unit.INSTANCE;
        this.A0K = C3cG.A08(agg, unit);
        this.A0J = C3cG.A08(agg, unit);
        Boolean boolA0h = AnonymousClass001.A0h();
        AGE age = AGE.A00;
        this.A0H = C3cG.A08(age, boolA0h);
        this.A0G = C3cG.A08(age, boolA0h);
        this.A0F = new C1057ATe();
    }

    public LazyGridState() {
        this(new AdE(2), 0, 0);
    }
}
