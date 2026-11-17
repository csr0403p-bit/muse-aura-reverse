package androidx.compose.animation.core;

import X.AGE;
import X.AOH;
import X.AOP;
import X.AOR;
import X.AOV;
import X.AOW;
import X.AOY;
import X.AOZ;
import X.ATD;
import X.Ab3;
import X.AnonymousClass006;
import X.BBO;
import X.BUK;
import X.C00q;
import X.C0912AHo;
import X.C2292BSs;
import X.C2295BSv;
import X.C3UZ;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C8j3;
import X.C9258GBl;
import X.EnumC10460Hji;
import X.G0U;
import X.Hm1;
import X.HtJ;
import X.Hxb;
import X.InterfaceC0999AOh;
import X.InterfaceC2261BLa;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class SeekableTransitionState<S> extends AOH<S> {
    public float A00;
    public long A01;
    public long A02;
    public AOV A03;
    public AOP<S> A04;
    public BBO A05;
    public S A06;
    public Hm1<? super S> A07;
    public final C0912AHo<AOV> A08;
    public final AOZ A09;
    public final C00q A0A;
    public final MutableState A0B;
    public final MutableState A0C;
    public final Function0<Unit> A0D;
    public final G0U<Long, Unit> A0E;
    public final G0U<Long, Unit> A0F;
    public final InterfaceC2261BLa A0G;
    public static final AOW A0I = AOW.A00(0.0f);
    public static final AOW A0H = AOW.A00(1.0f);

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0069, code lost:
    
        if (X.AvW.A01(r0, r7) == r8) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(androidx.compose.animation.core.SeekableTransitionState r9, X.HtJ r10) {
        /*
            r3 = 0
            boolean r0 = r10 instanceof X.C2310BTk
            if (r0 == 0) goto L2c
            r7 = r10
            X.BTk r7 = (X.C2310BTk) r7
            int r0 = r7.$t
            if (r0 != r3) goto L2c
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2c
            int r2 = r2 - r1
            r7.A00 = r2
        L17:
            java.lang.Object r1 = r7.A01
            X.Hji r8 = X.EnumC10460Hji.A02
            int r0 = r7.A00
            r6 = 2
            r5 = 1
            r3 = -9223372036854775808
            if (r0 == 0) goto L32
            if (r0 == r5) goto L66
            if (r0 == r6) goto L66
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2c:
            X.BTk r7 = new X.BTk
            r7.<init>(r9, r10, r3)
            goto L17
        L32:
            X.Hwg.A00(r1)
            X.AHo<X.AOV> r0 = r9.A08
            int r0 = r0.A00
            if (r0 != 0) goto L42
            X.AOV r0 = r9.A03
            if (r0 != 0) goto L42
        L3f:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L42:
            X.78T r0 = r7.getContext()
            float r1 = androidx.compose.animation.core.SuspendAnimationKt.A00(r0)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L55
            A05(r9)
        L52:
            r9.A01 = r3
            goto L3f
        L55:
            long r1 = r9.A01
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L69
            X.G0U<java.lang.Long, kotlin.Unit> r0 = r9.A0F
            r7.A00 = r5
            java.lang.Object r0 = X.AvW.A01(r0, r7)
        L63:
            if (r0 != r8) goto L69
            return r8
        L66:
            X.Hwg.A00(r1)
        L69:
            X.AHo<X.AOV> r0 = r9.A08
            int r0 = r0.A00
            if (r0 != 0) goto L73
            X.AOV r0 = r9.A03
            if (r0 == 0) goto L52
        L73:
            r7.A00 = r6
            X.78T r0 = r7.getContext()
            float r1 = androidx.compose.animation.core.SuspendAnimationKt.A00(r0)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L88
            A05(r9)
        L85:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L63
        L88:
            r9.A00 = r1
            X.G0U<java.lang.Long, kotlin.Unit> r0 = r9.A0E
            java.lang.Object r0 = X.AvW.A01(r0, r7)
            if (r0 != r8) goto L85
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.A01(androidx.compose.animation.core.SeekableTransitionState, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(androidx.compose.animation.core.SeekableTransitionState r7, X.HtJ r8) {
        /*
            r3 = 0
            boolean r0 = r8 instanceof X.C2312BTm
            if (r0 == 0) goto L65
            r6 = r8
            X.BTm r6 = (X.C2312BTm) r6
            int r0 = r6.$t
            if (r0 != r3) goto L65
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L65
            int r2 = r2 - r1
            r6.A00 = r2
        L17:
            java.lang.Object r0 = r6.A02
            X.Hji r5 = X.EnumC10460Hji.A02
            int r2 = r6.A00
            r4 = 2
            r3 = 0
            r1 = 1
            if (r2 == 0) goto L34
            if (r2 == r1) goto L4a
            if (r2 != r4) goto L77
            java.lang.Object r2 = r6.A01
            X.Hwg.A00(r0)
        L2b:
            boolean r0 = X.C7384Etj.areEqual(r0, r2)
            if (r0 == 0) goto L6b
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L34:
            X.Hwg.A00(r0)
            androidx.compose.runtime.MutableState r0 = r7.A0C
            java.lang.Object r2 = r0.getValue()
            X.BLa r0 = r7.A0G
            r6.A01 = r2
            r6.A00 = r1
            java.lang.Object r0 = r0.APs(r3, r6)
            if (r0 != r5) goto L4f
            return r5
        L4a:
            java.lang.Object r2 = r6.A01
            X.Hwg.A00(r0)
        L4f:
            r6.A01 = r2
            r6.A00 = r4
            X.GBL r1 = X.C7Bm.A04(r6)
            r7.A07 = r1
            X.BLa r0 = r7.A0G
            r0.Ahe(r3)
            java.lang.Object r0 = r1.A0F()
            if (r0 != r5) goto L2b
            return r5
        L65:
            X.BTm r6 = new X.BTm
            r6.<init>(r7, r8, r3)
            goto L17
        L6b:
            r0 = -9223372036854775808
            r7.A01 = r0
            java.lang.String r1 = "targetState while waiting for composition"
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r1)
            throw r0
        L77:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.A02(androidx.compose.animation.core.SeekableTransitionState, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(androidx.compose.animation.core.SeekableTransitionState r8, X.HtJ r9) {
        /*
            r7 = 1
            boolean r0 = r9 instanceof X.C2312BTm
            if (r0 == 0) goto L87
            r6 = r9
            X.BTm r6 = (X.C2312BTm) r6
            int r0 = r6.$t
            if (r0 != r7) goto L87
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L87
            int r2 = r2 - r1
            r6.A00 = r2
        L17:
            java.lang.Object r2 = r6.A02
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.A00
            r1 = 2
            r4 = 0
            if (r0 == 0) goto L46
            if (r0 == r7) goto L5c
            if (r0 != r1) goto L8d
            java.lang.Object r3 = r6.A01
            X.Hwg.A00(r2)
        L2a:
            boolean r0 = X.C7384Etj.areEqual(r2, r3)
            if (r0 != 0) goto L6e
            r0 = -9223372036854775808
            r8.A01 = r0
            java.lang.String r0 = "snapTo() was canceled because state was changed to "
            java.lang.StringBuilder r1 = X.C3cG.A0f(r2, r0)
            java.lang.String r0 = " instead of "
            java.lang.String r1 = X.AnonymousClass006.A0y(r3, r0, r1)
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r1)
            throw r0
        L46:
            X.Hwg.A00(r2)
            androidx.compose.runtime.MutableState r0 = r8.A0C
            java.lang.Object r3 = r0.getValue()
            X.BLa r0 = r8.A0G
            r6.A01 = r3
            r6.A00 = r7
            java.lang.Object r0 = r0.APs(r4, r6)
            if (r0 != r5) goto L61
            return r5
        L5c:
            java.lang.Object r3 = r6.A01
            X.Hwg.A00(r2)
        L61:
            S r0 = r8.A06
            boolean r0 = X.C7384Etj.areEqual(r3, r0)
            if (r0 == 0) goto L71
            X.BLa r0 = r8.A0G
            r0.Ahe(r4)
        L6e:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L71:
            r6.A01 = r3
            r6.A00 = r1
            X.GBL r1 = X.C7Bm.A04(r6)
            r8.A07 = r1
            X.BLa r0 = r8.A0G
            r0.Ahe(r4)
            java.lang.Object r2 = r1.A0F()
            if (r2 != r5) goto L2a
            return r5
        L87:
            X.BTm r6 = new X.BTm
            r6.<init>(r8, r9, r7)
            goto L17
        L8d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.A03(androidx.compose.animation.core.SeekableTransitionState, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: (FTS;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    public final Object A0C(Object obj, HtJ htJ, float f) {
        if (0.0f > f || f > 1.0f) {
            StringBuilder sbA0g = C3cG.A0g("Expecting fraction between 0 and 1. Got ");
            sbA0g.append(f);
            throw C60O.A0i(sbA0g.toString());
        }
        AOP<S> aop = this.A04;
        if (aop != null) {
            Object value = this.A0C.getValue();
            Object objA00 = Hxb.A00(new BUK(C3UZ.A02, this.A09, null, new SeekableTransitionState$seekTo$3(this, aop, obj, value, null, f)), htJ);
            if (objA00 == EnumC10460Hji.A02) {
                return objA00;
            }
        }
        return Unit.INSTANCE;
    }

    public static final void A04(AOV aov, long j) {
        float fA03;
        long j2 = aov.A03 + j;
        aov.A03 = j2;
        long j3 = aov.A01;
        if (j2 >= j3) {
            aov.A00 = 1.0f;
            return;
        }
        InterfaceC0999AOh<AOW> interfaceC0999AOh = aov.A06;
        if (interfaceC0999AOh != null) {
            AOW aow = aov.A05;
            AOW aow2 = A0H;
            AOW aow3 = aov.A04;
            if (aow3 == null) {
                aow3 = A0I;
            }
            fA03 = ATD.A03(((AOW) interfaceC0999AOh.getValueFromNanos(j2, aow, aow2, aow3)).A00, 0.0f, 1.0f);
        } else {
            float f = j2 / j3;
            fA03 = C8j3.A03(aov.A05.A00, 1.0f - f, f, 1.0f);
        }
        aov.A00 = fA03;
    }

    public static final void A05(SeekableTransitionState seekableTransitionState) {
        AOP<S> aop = seekableTransitionState.A04;
        if (aop != null) {
            aop.A04();
        }
        seekableTransitionState.A08.A06();
        if (seekableTransitionState.A03 != null) {
            seekableTransitionState.A03 = null;
            seekableTransitionState.A0A.AdS(1.0f);
            A07(seekableTransitionState);
        }
    }

    public static final void A06(SeekableTransitionState seekableTransitionState) {
        AOP<S> aop = seekableTransitionState.A04;
        if (aop != null) {
            AOV aov = seekableTransitionState.A03;
            if (aov != null) {
                aov.A02 = seekableTransitionState.A02;
                seekableTransitionState.A08.A09(aov);
                aop.A0A(aov);
            } else if (seekableTransitionState.A02 > 0) {
                C00q c00q = seekableTransitionState.A0A;
                if (c00q.AFn() != 1.0f) {
                    if (!MutableState.A0B(seekableTransitionState.A0C, seekableTransitionState.A0B.getValue())) {
                        aov = new AOV();
                        aov.A00 = c00q.AFn();
                        long j = seekableTransitionState.A02;
                        aov.A02 = j;
                        aov.A01 = Ab3.A03(j * (1.0d - c00q.AFn()));
                        aov.A05.A00 = c00q.AFn();
                        aov.A02 = seekableTransitionState.A02;
                        seekableTransitionState.A08.A09(aov);
                        aop.A0A(aov);
                    }
                }
            }
            seekableTransitionState.A03 = null;
        }
    }

    public static final void A07(SeekableTransitionState seekableTransitionState) {
        AOP<S> aop = seekableTransitionState.A04;
        if (aop != null) {
            aop.A08(Ab3.A03(seekableTransitionState.A0A.AFn() * C3cG.A05(aop.A09.getValue())));
        }
    }

    @Override // X.AOH
    public final S A09() {
        return (S) this.A0B.getValue();
    }

    @Override // X.AOH
    public final S A0A() {
        return (S) this.A0C.getValue();
    }

    @Override // X.AOH
    public final void A0B(AOP<S> aop) {
        AOP<S> aop2 = this.A04;
        if (aop2 == null || C7384Etj.areEqual(aop, aop2)) {
            this.A04 = aop;
        } else {
            StringBuilder sbA0x = C60O.A0x("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: ");
            sbA0x.append(this.A04);
            throw C3cG.A0Q(AnonymousClass006.A0y(aop, ", new instance: ", sbA0x));
        }
    }

    public final void A0D(BBO bbo) {
        AOY aoy;
        if (C7384Etj.areEqual(this.A05, bbo)) {
            return;
        }
        BBO bbo2 = this.A05;
        if (bbo2 != null) {
            bbo2.A02(this);
        }
        BBO bbo3 = this.A05;
        if (bbo3 != null && (aoy = bbo3.A00) != null) {
            aoy.dispose();
        }
        this.A05 = bbo;
        if (bbo != null) {
            bbo.A00 = Snapshot.A01(bbo.A09);
        }
        BBO bbo4 = this.A05;
        if (bbo4 != null) {
            bbo4.A03(this, this.A0D, AOR.A00);
        }
    }

    public SeekableTransitionState(S s) {
        AGE age = AGE.A00;
        this.A0C = C3cG.A08(age, s);
        this.A0B = C3cG.A08(age, s);
        this.A06 = s;
        this.A0D = C2292BSs.A00(this, 2);
        this.A0A = new ParcelableSnapshotMutableFloatState(0.0f);
        this.A0G = new C9258GBl();
        this.A09 = new AOZ();
        this.A01 = Long.MIN_VALUE;
        this.A08 = C0912AHo.A00();
        this.A0F = C2295BSv.A00(this, 0);
        this.A0E = C2295BSv.A00(this, 1);
    }
}
