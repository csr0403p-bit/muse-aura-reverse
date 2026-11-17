package androidx.room.coroutines;

import X.A6B;
import X.AIG;
import X.AII;
import X.AIM;
import X.AbstractC0878AGe;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.BV4;
import X.C27i;
import X.C3cF;
import X.C3cH;
import X.C60O;
import X.C78T;
import X.C8eM;
import X.C8iN;
import X.CU7;
import X.EJR;
import X.EJU;
import X.EJV;
import X.FGI;
import X.GCI;
import X.GCQ;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class Pool {
    public int A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final AIG<EJR> A04;
    public final Function0<EJV> A05;
    public final EJR[] A06;
    public final ReentrantLock A07 = new ReentrantLock();
    public final C8eM A08;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.HtJ<? super X.EJR> r7) {
        /*
            r6 = this;
            r4 = 1
            boolean r0 = r7 instanceof X.C7057Ef4
            if (r0 == 0) goto L25
            r3 = r7
            X.Ef4 r3 = (X.C7057Ef4) r3
            int r0 = r3.$t
            if (r0 != r4) goto L25
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r3.A00 = r2
        L17:
            java.lang.Object r2 = r3.A01
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r3.A00
            if (r0 == 0) goto L30
            if (r0 != r4) goto L2b
            X.Hwg.A00(r2)
            goto L3e
        L25:
            X.Ef4 r3 = new X.Ef4
            r3.<init>(r6, r7, r4)
            goto L17
        L2b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L30:
            X.Hwg.A00(r2)
            X.8eM r0 = r6.A08
            r3.A00 = r4
            java.lang.Object r0 = r0.A2u(r3)
            if (r0 != r1) goto L3e
            return r1
        L3e:
            java.util.concurrent.locks.ReentrantLock r4 = r6.A07     // Catch: java.lang.Throwable -> L8c
            r4.lock()     // Catch: java.lang.Throwable -> L8c
            boolean r0 = r6.A01     // Catch: java.lang.Throwable -> L87
            if (r0 != 0) goto L7b
            X.AIG<X.EJR> r5 = r6.A04     // Catch: java.lang.Throwable -> L87
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L71
            int r1 = r6.A00     // Catch: java.lang.Throwable -> L87
            int r0 = r6.A02     // Catch: java.lang.Throwable -> L87
            if (r1 >= r0) goto L71
            kotlin.jvm.functions.Function0<X.EJV> r0 = r6.A05     // Catch: java.lang.Throwable -> L87
            java.lang.Object r1 = r0.invoke()     // Catch: java.lang.Throwable -> L87
            X.EJV r1 = (X.EJV) r1     // Catch: java.lang.Throwable -> L87
            int r0 = r6.A03     // Catch: java.lang.Throwable -> L87
            X.EJR r3 = new X.EJR     // Catch: java.lang.Throwable -> L87
            r3.<init>(r1, r0)     // Catch: java.lang.Throwable -> L87
            X.EJR[] r2 = r6.A06     // Catch: java.lang.Throwable -> L87
            int r1 = r6.A00     // Catch: java.lang.Throwable -> L87
            int r0 = r1 + 1
            r6.A00 = r0     // Catch: java.lang.Throwable -> L87
            r2[r1] = r3     // Catch: java.lang.Throwable -> L87
            r5.addLast(r3)     // Catch: java.lang.Throwable -> L87
        L71:
            java.lang.Object r0 = r5.removeLast()     // Catch: java.lang.Throwable -> L87
            X.EJR r0 = (X.EJR) r0     // Catch: java.lang.Throwable -> L87
            r4.unlock()     // Catch: java.lang.Throwable -> L8c
            return r0
        L7b:
            java.lang.String r1 = "Connection pool is closed"
            r0 = 21
            X.EJB.A00(r1, r0)     // Catch: java.lang.Throwable -> L87
            X.F60 r0 = X.F60.createAndThrow()     // Catch: java.lang.Throwable -> L87
            throw r0     // Catch: java.lang.Throwable -> L87
        L87:
            r0 = move-exception
            r4.unlock()     // Catch: java.lang.Throwable -> L8c
            throw r0     // Catch: java.lang.Throwable -> L8c
        L8c:
            r1 = move-exception
            X.8eM r0 = r6.A08
            r0.release()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.Pool.A00(X.HtJ):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Incorrect types in method signature: (JLkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/HtJ<-LX/EJR;>;)Ljava/lang/Object; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c A[Catch: all -> 0x007a, TryCatch #1 {all -> 0x007a, blocks: (B:28:0x0068, B:30:0x006c, B:32:0x0072, B:37:0x0079), top: B:45:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0062 -> B:26:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.HtJ r9, kotlin.jvm.functions.Function0 r10, long r11) {
        /*
            r8 = this;
            r6 = 1
            boolean r0 = r9 instanceof X.C2316BTq
            if (r0 == 0) goto Ld
            r0 = r9
            X.BTq r0 = (X.C2316BTq) r0
            int r1 = r0.$t
            r0 = 1
            if (r1 == r6) goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L34
            r5 = r9
            X.BTq r5 = (X.C2316BTq) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L34
            int r2 = r2 - r1
            r5.A00 = r2
        L1e:
            java.lang.Object r1 = r5.A04
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r4 = 0
            if (r0 == 0) goto L45
            if (r0 != r6) goto L40
            long r11 = r5.A01
            java.lang.Object r3 = r5.A03
            X.Hqv r3 = (X.C10543Hqv) r3
            java.lang.Object r10 = r5.A02
            kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
            goto L3a
        L34:
            X.BTq r5 = new X.BTq
            r5.<init>(r8, r9)
            goto L1e
        L3a:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L3e
            goto L65
        L3e:
            r1 = move-exception
            goto L68
        L40:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
            throw r1
        L45:
            X.Hwg.A00(r1)
        L48:
            X.Hqv r3 = X.C3cG.A0z()
            r0 = 2
            X.EZB r2 = new X.EZB     // Catch: java.lang.Throwable -> L67
            r2.<init>(r8, r3, r4, r0)     // Catch: java.lang.Throwable -> L67
            r5.A02 = r10     // Catch: java.lang.Throwable -> L67
            r5.A03 = r3     // Catch: java.lang.Throwable -> L67
            r5.A01 = r11     // Catch: java.lang.Throwable -> L67
            r5.A00 = r6     // Catch: java.lang.Throwable -> L67
            long r0 = X.C7Bq.A00(r11)     // Catch: java.lang.Throwable -> L67
            java.lang.Object r0 = X.GAX.A00(r5, r2, r0)     // Catch: java.lang.Throwable -> L67
            if (r0 != r7) goto L65
            goto L77
        L65:
            r1 = r4
            goto L68
        L67:
            r1 = move-exception
        L68:
            boolean r0 = r1 instanceof kotlinx.coroutines.TimeoutCancellationException     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L70
            r10.invoke()     // Catch: java.lang.Throwable -> L7a
            goto L48
        L70:
            if (r1 != 0) goto L79
            T r0 = r3.element     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L48
            goto L78
        L77:
            return r7
        L78:
            return r0
        L79:
            throw r1     // Catch: java.lang.Throwable -> L7a
        L7a:
            r1 = move-exception
            T r0 = r3.element
            X.EJR r0 = (X.EJR) r0
            if (r0 == 0) goto L84
            r8.A03(r0)
        L84:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.Pool.A01(X.HtJ, kotlin.jvm.functions.Function0, long):java.lang.Object");
    }

    public final void A02() {
        ReentrantLock reentrantLock = this.A07;
        reentrantLock.lock();
        try {
            this.A01 = true;
            for (EJR ejr : this.A06) {
                if (ejr != null) {
                    ejr.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void A03(EJR ejr) {
        ReentrantLock reentrantLock = this.A07;
        reentrantLock.lock();
        try {
            this.A04.addLast(ejr);
            reentrantLock.unlock();
            this.A08.release();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void A04(StringBuilder sb) {
        int i;
        ReentrantLock reentrantLock = this.A07;
        reentrantLock.lock();
        try {
            AII aiiA17 = AIM.A17();
            AIG<EJR> aig = this.A04;
            int size = aig.size();
            for (int i2 = 0; i2 < size; i2++) {
                aiiA17.add(aig.get(i2));
            }
            AII aiiA18 = AIM.A18(aiiA17);
            StringBuilder sbA0w = C60O.A0w();
            sbA0w.append('\t');
            sbA0w.append(super.toString());
            sbA0w.append(" (");
            BV4.A1O(sb, sbA0w);
            sb.append(FGI.A0I(C3cF.A00(2), this.A02, ", "));
            sb.append(FGI.A0I("permits=", Math.max(GCI.A02.get(this.A08), 0), ", "));
            StringBuilder sbA0w2 = C60O.A0w();
            sbA0w2.append("queue=(size=");
            sbA0w2.append(aiiA18.size());
            sbA0w2.append(")[");
            sbA0w2.append(C3cH.A0e(", ", aiiA18));
            sbA0w2.append(']');
            BV4.A1O(sb, sbA0w2);
            sb.append(")");
            sb.append('\n');
            EJR[] ejrArr = this.A06;
            int length = ejrArr.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                EJR ejr = ejrArr[i4];
                i3++;
                sb.append(FGI.A0W("\t\t[", "] - ", ejr != null ? ejr.toString() : null, i3));
                sb.append('\n');
                if (ejr != null) {
                    C78T c78t = ejr.A01;
                    if (c78t == null && ejr.A00 == null) {
                        sb.append("\t\tStatus: Free connection");
                        sb.append('\n');
                    } else {
                        sb.append("\t\tStatus: Acquired connection");
                        sb.append('\n');
                        if (c78t != null) {
                            sb.append(AnonymousClass007.A0a("\t\tCoroutine: ", c78t));
                            sb.append('\n');
                        }
                        Throwable th = ejr.A00;
                        if (th != null) {
                            sb.append("\t\tAcquired:");
                            sb.append('\n');
                            Iterator it = AbstractC0878AGe.A0Z(A6B.A02(new C8iN(CU7.A00(th), 1)), 1).iterator();
                            while (it.hasNext()) {
                                sb.append(FGI.A0M("\t\t", AnonymousClass005.A0j(it)));
                                sb.append('\n');
                            }
                        }
                    }
                    EJU eju = ejr.A02;
                    if (eju != null) {
                        synchronized (eju.A07) {
                            i = eju.A01;
                        }
                        sb.append(FGI.A0H("\t\tPrepared Statement Cache Size: ", i));
                        sb.append('\n');
                    } else {
                        continue;
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Incorrect types in method signature: (ILkotlin/jvm/functions/Function0<+LX/EJV;>;I)V */
    public Pool(int i, int i2, Function0 function0) {
        this.A02 = i;
        this.A05 = function0;
        this.A03 = i2;
        this.A06 = new EJR[i];
        int i3 = GCQ.A00;
        this.A08 = new C27i(i);
        AIG<EJR> aig = new AIG<>();
        aig.A01 = new Object[i];
        this.A04 = aig;
    }
}
