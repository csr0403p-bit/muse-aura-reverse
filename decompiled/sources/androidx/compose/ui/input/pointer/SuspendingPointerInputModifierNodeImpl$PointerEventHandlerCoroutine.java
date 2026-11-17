package androidx.compose.ui.input.pointer;

import X.ASU;
import X.AXN;
import X.AaN;
import X.AbstractC1414Aij;
import X.AbstractC1499Ak6;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C1247Afe;
import X.C6ys;
import X.C78T;
import X.C7Bm;
import X.EnumC1080AXj;
import X.GBL;
import X.Hm1;
import X.HtJ;
import X.InterfaceC1074AXb;

/* loaded from: classes4.dex */
public final class SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine<R> implements InterfaceC1074AXb, AXN, HtJ<R> {
    public Hm1<? super C1247Afe> A01;
    public final HtJ<R> A02;
    public final /* synthetic */ AaN A04;
    public final /* synthetic */ AaN A05;
    public EnumC1080AXj A00 = EnumC1080AXj.A04;
    public final C78T A03 = C6ys.A00;

    /* JADX WARN: Multi-variable type inference failed */
    public SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine(AaN aaN, HtJ<? super R> htJ) {
        this.A04 = aaN;
        this.A05 = aaN;
        this.A02 = htJ;
    }

    @Override // X.AXN
    public final float AEm() {
        return AbstractC1414Aij.A08(this.A05).AEm();
    }

    @Override // X.InterfaceC1074AXb
    public final long AFT() {
        AaN aaN = this.A04;
        long jA03 = ASU.A03(aaN, AbstractC1414Aij.A04(aaN).A0E.AHo());
        long j = aaN.A00;
        return AnonymousClass005.A0L(Math.max(0.0f, AnonymousClass001.A00(jA03) - ((int) (j >> 32))) / 2.0f, Math.max(0.0f, AnonymousClass001.A01(jA03, 4294967295L) - ((int) (j & 4294967295L))) / 2.0f);
    }

    @Override // X.C0dm
    public final float AFo() {
        return AbstractC1414Aij.A08(this.A05).AFo();
    }

    @Override // X.AXN
    public final int Abr(float f) {
        return ASU.A01(this.A05, f);
    }

    @Override // X.C0dm
    public final float Agw(long j) {
        return AbstractC1499Ak6.A00(this.A05, j);
    }

    @Override // X.AXN
    public final float Agx(float f) {
        return f / AbstractC1414Aij.A08(this.A05).AEm();
    }

    @Override // X.AXN
    public final float Agy(int i) {
        return i / AbstractC1414Aij.A08(this.A05).AEm();
    }

    @Override // X.AXN
    public final long Agz(long j) {
        return ASU.A02(this.A05, j);
    }

    @Override // X.AXN
    public final float Ah3(long j) {
        return ASU.A00(j, this.A05);
    }

    @Override // X.AXN
    public final float Ah4(float f) {
        return f * AbstractC1414Aij.A08(this.A05).AEm();
    }

    @Override // X.AXN
    public final long Ah6(long j) {
        return ASU.A03(this.A05, j);
    }

    @Override // X.C0dm
    public final long Ah7(float f) {
        return AbstractC1499Ak6.A01(this.A05, f);
    }

    @Override // X.AXN
    public final long Ah8(float f) {
        return AXN.A02(this.A05, f);
    }

    @Override // X.AXN
    public final long Ah9(int i) {
        return AXN.A03(this.A05, i);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(JLX/G0V<-LX/AXb;-LX/HtJ<-TT;>;+Ljava/lang/Object;>;LX/HtJ<-TT;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    @Override // X.InterfaceC1074AXb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AiT(X.HtJ r11, X.G0V r12, long r13) {
        /*
            r10 = this;
            r4 = 16
            boolean r0 = r11 instanceof X.C2312BTm
            if (r0 == 0) goto Le
            r0 = r11
            X.BTm r0 = (X.C2312BTm) r0
            int r1 = r0.$t
            r0 = 1
            if (r1 == r4) goto Lf
        Le:
            r0 = 0
        Lf:
            r7 = r10
            if (r0 == 0) goto L30
            r3 = r11
            X.BTm r3 = (X.C2312BTm) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L30
            int r2 = r2 - r1
            r3.A00 = r2
        L20:
            java.lang.Object r1 = r3.A02
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r3.A00
            r2 = 1
            if (r0 == 0) goto L3f
            if (r0 != r2) goto L3a
            java.lang.Object r5 = r3.A01
            X.HoC r5 = (X.HoC) r5
            goto L36
        L30:
            X.BTm r3 = new X.BTm
            r3.<init>(r10, r11, r4)
            goto L20
        L36:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L84
            goto L7e
        L3a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L3f:
            X.Hwg.A00(r1)
            r5 = 0
            r10 = r13
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 > 0) goto L61
            X.Hm1<? super X.Afe> r5 = r7.A01
            if (r5 == 0) goto L61
            java.lang.String r1 = "Timed out waiting for "
            java.lang.String r0 = " ms"
            java.lang.String r1 = X.FGI.A0J(r1, r13, r0)
            androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r0 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
            r0.<init>(r1)
            X.Hud r0 = X.C3cG.A0s(r0)
            r5.resumeWith(r0)
        L61:
            X.AaN r0 = r7.A04
            X.3UX r0 = r0.getCoroutineScope()
            r8 = 0
            r9 = 9
            X.BU3 r6 = new X.BU3
            r6.<init>(r7, r8, r9, r10)
            X.Hqc r5 = X.AnonymousClass001.A11(r6, r0)
            r3.A01 = r5     // Catch: java.lang.Throwable -> L84
            r3.A00 = r2     // Catch: java.lang.Throwable -> L84
            java.lang.Object r1 = r12.invoke(r7, r3)     // Catch: java.lang.Throwable -> L84
            if (r1 != r4) goto L7e
            return r4
        L7e:
            androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r0 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.A00
            r5.A5w(r0)
            return r1
        L84:
            r1 = move-exception
            androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r0 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.A00
            r5.A5w(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine.AiT(X.HtJ, X.G0V, long):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(JLX/G0V<-LX/AXb;-LX/HtJ<-TT;>;+Ljava/lang/Object;>;LX/HtJ<-TT;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    @Override // X.InterfaceC1074AXb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AiU(X.HtJ r6, X.G0V r7, long r8) {
        /*
            r5 = this;
            r3 = 23
            boolean r0 = r6 instanceof X.C2310BTk
            if (r0 == 0) goto Le
            r0 = r6
            X.BTk r0 = (X.C2310BTk) r0
            int r1 = r0.$t
            r0 = 1
            if (r1 == r3) goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L2b
            r4 = r6
            X.BTk r4 = (X.C2310BTk) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2b
            int r2 = r2 - r1
            r4.A00 = r2
        L1f:
            java.lang.Object r3 = r4.A01
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L3a
            if (r1 != r0) goto L35
            goto L31
        L2b:
            X.BTk r4 = new X.BTk
            r4.<init>(r5, r6, r3)
            goto L1f
        L31:
            X.Hwg.A00(r3)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L47
            return r3
        L35:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L3a:
            X.Hwg.A00(r3)
            r4.A00 = r0     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L47
            java.lang.Object r0 = r5.AiT(r4, r7, r8)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L47
            if (r0 != r2) goto L46
            return r2
        L46:
            return r0
        L47:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine.AiU(X.HtJ, X.G0V, long):java.lang.Object");
    }

    @Override // X.HtJ
    public final C78T getContext() {
        return this.A03;
    }

    @Override // X.HtJ
    public final void resumeWith(Object obj) {
        AaN aaN = this.A04;
        synchronized (aaN.A09) {
            aaN.A08.A0I(this);
        }
        this.A02.resumeWith(obj);
    }

    @Override // X.InterfaceC1074AXb
    public final Object A4z(EnumC1080AXj enumC1080AXj, HtJ<? super C1247Afe> htJ) {
        GBL gblA03 = C7Bm.A03(htJ);
        this.A00 = enumC1080AXj;
        this.A01 = gblA03;
        return gblA03.A0F();
    }
}
