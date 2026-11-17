package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.network.acs.AcsKeyConfig;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* loaded from: classes6.dex */
public class GCV<E> implements HzR<E> {
    public final G0U<E, Unit> A00;
    public final int A01;
    public final G0W A02;
    public volatile /* synthetic */ Object _closeCause$volatile;
    public volatile /* synthetic */ long bufferEnd$volatile;
    public volatile /* synthetic */ Object bufferEndSegment$volatile;
    public volatile /* synthetic */ Object closeHandler$volatile;
    public volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public volatile /* synthetic */ Object receiveSegment$volatile;
    public volatile /* synthetic */ long receivers$volatile;
    public volatile /* synthetic */ Object sendSegment$volatile;
    public volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    public static final /* synthetic */ AtomicLongFieldUpdater A06 = AtomicLongFieldUpdater.newUpdater(GCV.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater A05 = AtomicLongFieldUpdater.newUpdater(GCV.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater A03 = AtomicLongFieldUpdater.newUpdater(GCV.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater A04 = AtomicLongFieldUpdater.newUpdater(GCV.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A0B = AtomicReferenceFieldUpdater.newUpdater(GCV.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A0A = AtomicReferenceFieldUpdater.newUpdater(GCV.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A08 = AtomicReferenceFieldUpdater.newUpdater(GCV.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A07 = AtomicReferenceFieldUpdater.newUpdater(GCV.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A09 = AtomicReferenceFieldUpdater.newUpdater(GCV.class, Object.class, "closeHandler$volatile");

    /* JADX WARN: Multi-variable type inference failed */
    public GCV(int i, G0U<? super E, Unit> g0u) {
        this.A01 = i;
        this.A00 = g0u;
        if (i < 0) {
            throw new IllegalArgumentException(FGI.A0I("Invalid channel capacity: ", i, ", should be >=0"));
        }
        int i2 = AbstractC9276GCd.A01;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : LinkEncryptedPairingKt.LINK_COUNTER_MAX : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = A03.get(this);
        GCY<Object> gcy = new GCY<>(this, null, 3, 0L);
        this.sendSegment$volatile = gcy;
        this.receiveSegment$volatile = gcy;
        this.bufferEndSegment$volatile = A0B() ? AbstractC9276GCd.A02 : gcy;
        this.A02 = g0u != 0 ? new GY7(this, 1) : null;
        this._closeCause$volatile = AbstractC9276GCd.A0C;
    }

    private final boolean A0F(Throwable th, boolean z) {
        long j;
        long j2;
        int i;
        Object obj;
        long j3;
        long j4;
        if (z) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = A06;
            do {
                j4 = atomicLongFieldUpdater.get(this);
                if (((int) (j4 >> 60)) != 0) {
                    break;
                }
                int i2 = AbstractC9276GCd.A01;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j4, (1 << 60) + (1152921504606846975L & j4)));
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A07;
        boolean zA00 = AbstractC5217DdT.A00(this, AbstractC9276GCd.A0C, th, atomicReferenceFieldUpdater);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = A06;
        if (z) {
            do {
                j3 = atomicLongFieldUpdater2.get(this);
            } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, (3 << 60) + (1152921504606846975L & j3)));
        } else {
            do {
                j = atomicLongFieldUpdater2.get(this);
                int i3 = (int) (j >> 60);
                if (i3 == 0) {
                    j2 = 1152921504606846975L & j;
                    i = 2;
                } else {
                    if (i3 != 1) {
                        break;
                    }
                    j2 = 1152921504606846975L & j;
                    i = 3;
                }
            } while (!atomicLongFieldUpdater2.compareAndSet(this, j, (i << 60) + j2));
        }
        AOF();
        if (zA00) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = A09;
            do {
                obj = atomicReferenceFieldUpdater2.get(this);
            } while (!AbstractC5217DdT.A00(this, obj, obj == null ? AbstractC9276GCd.A05 : AbstractC9276GCd.A06, atomicReferenceFieldUpdater2));
            if (obj != null) {
                C0862A6j.A02(obj, 1);
                ((G0U) obj).invoke(atomicReferenceFieldUpdater.get(this));
            }
        }
        return zA00;
    }

    @Override // X.HxO
    public final boolean A6R(Throwable th) {
        return A0F(th, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0048 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A00(java.lang.Object r9, java.lang.Object r10, X.GCV r11, X.GCY r12, int r13, long r14, boolean r16) {
        /*
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r12.A01
            int r1 = r13 * 2
            r2.set(r1, r9)
            if (r16 != 0) goto L48
            int r4 = r1 + 1
            java.lang.Object r5 = r2.get(r4)
            r3 = 1
            if (r5 != 0) goto L2b
            boolean r0 = r11.A0C(r14)
            r4 = 0
            if (r0 == 0) goto L22
            X.HrH r0 = X.AbstractC9276GCd.A03
            boolean r0 = r12.A0A(r13, r4, r0)
            if (r0 == 0) goto L46
            return r3
        L22:
            if (r10 == 0) goto Lb8
            boolean r0 = r12.A0A(r13, r4, r10)
            if (r0 == 0) goto L46
            goto L6e
        L2b:
            boolean r0 = r5 instanceof X.GCR
            if (r0 == 0) goto L46
            r0 = 0
            r2.set(r1, r0)
            boolean r0 = r11.A0D(r5, r9)
            if (r0 != 0) goto Lba
            X.HrH r1 = X.AbstractC9276GCd.A09
            java.lang.Object r0 = r2.getAndSet(r4, r1)
            if (r0 == r1) goto L44
            r12.A09(r13, r3)
        L44:
            r8 = 5
            return r8
        L46:
            r16 = 0
        L48:
            int r4 = r1 + 1
            java.lang.Object r6 = r2.get(r4)
            r3 = 1
            if (r6 != 0) goto L7c
            boolean r0 = r11.A0C(r14)
            r3 = 0
            if (r0 == 0) goto L64
            if (r16 != 0) goto L70
            X.HrH r0 = X.AbstractC9276GCd.A03
            boolean r0 = r12.A0A(r13, r3, r0)
        L60:
            if (r0 == 0) goto L48
            r8 = 1
        L63:
            return r8
        L64:
            if (r16 != 0) goto L70
            if (r10 == 0) goto Lb8
            boolean r0 = r12.A0A(r13, r3, r10)
            if (r0 == 0) goto L48
        L6e:
            r8 = 2
            return r8
        L70:
            X.HrH r0 = X.AbstractC9276GCd.A0A
            boolean r0 = r12.A0A(r13, r3, r0)
            if (r0 == 0) goto L48
            r12.A05()
            goto L9b
        L7c:
            X.HrH r0 = X.AbstractC9276GCd.A0B
            if (r6 != r0) goto L87
            X.HrH r0 = X.AbstractC9276GCd.A03
            boolean r0 = r12.A0A(r13, r6, r0)
            goto L60
        L87:
            X.HrH r7 = X.AbstractC9276GCd.A09
            r8 = 5
            if (r6 == r7) goto Lc1
            X.HrH r0 = X.AbstractC9276GCd.A0E
            if (r6 == r0) goto Lc1
            X.HrH r5 = X.AbstractC9276GCd.A04
            r0 = 0
            if (r6 != r5) goto L9d
            r2.set(r1, r0)
            r11.AOF()
        L9b:
            r8 = 4
            return r8
        L9d:
            r2.set(r1, r0)
            boolean r0 = r6 instanceof X.C9281GCi
            if (r0 == 0) goto La8
            X.GCi r6 = (X.C9281GCi) r6
            X.GCR r6 = r6.A00
        La8:
            boolean r0 = r11.A0D(r6, r9)
            if (r0 != 0) goto Lba
            java.lang.Object r0 = r2.getAndSet(r4, r7)
            if (r0 == r7) goto L63
            r12.A09(r13, r3)
            return r8
        Lb8:
            r8 = 3
            return r8
        Lba:
            X.HrH r0 = X.AbstractC9276GCd.A07
            r2.set(r4, r0)
            r8 = 0
            return r8
        Lc1:
            r0 = 0
            r2.set(r1, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GCV.A00(java.lang.Object, java.lang.Object, X.GCV, X.GCY, int, long, boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        r10.A08();
        r1 = r4.get(r3);
        r4.set(r3, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00aa, code lost:
    
        if (r9 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ac, code lost:
    
        r0 = r11.A0A(r12, r6, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0042, code lost:
    
        if (r11.A0A(r12, r5, X.AbstractC9276GCd.A07) != false) goto L15;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00ac -> B:8:0x0022). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(java.lang.Object r9, X.GCV r10, X.GCY r11, int r12, long r13) {
        /*
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r11.A01
            int r3 = r12 * 2
            int r2 = r3 + 1
            java.lang.Object r5 = r4.get(r2)
            if (r5 != 0) goto L2a
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.GCV.A06
            long r6 = r0.get(r10)
            r0 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r6 = r6 & r0
            int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r0 < 0) goto L42
            if (r9 == 0) goto Lb2
            boolean r0 = r11.A0A(r12, r5, r9)
        L22:
            if (r0 == 0) goto L42
            r10.A08()
            X.HrH r1 = X.AbstractC9276GCd.A0H
            return r1
        L2a:
            X.HrH r0 = X.AbstractC9276GCd.A03
            if (r5 != r0) goto L42
            X.HrH r0 = X.AbstractC9276GCd.A07
            boolean r0 = r11.A0A(r12, r5, r0)
        L34:
            if (r0 == 0) goto L42
        L36:
            r10.A08()
            java.lang.Object r1 = r4.get(r3)
            r0 = 0
            r4.set(r3, r0)
            return r1
        L42:
            java.lang.Object r6 = r4.get(r2)
            if (r6 == 0) goto L8c
            X.HrH r0 = X.AbstractC9276GCd.A0B
            if (r6 == r0) goto L8c
            X.HrH r0 = X.AbstractC9276GCd.A03
            if (r6 != r0) goto L57
            X.HrH r0 = X.AbstractC9276GCd.A07
            boolean r0 = r11.A0A(r12, r6, r0)
            goto L34
        L57:
            X.HrH r5 = X.AbstractC9276GCd.A0A
            if (r6 == r5) goto La7
            X.HrH r0 = X.AbstractC9276GCd.A0E
            if (r6 == r0) goto La7
            X.HrH r0 = X.AbstractC9276GCd.A04
            if (r6 == r0) goto La4
            X.HrH r0 = X.AbstractC9276GCd.A0F
            if (r6 == r0) goto L42
            X.HrH r0 = X.AbstractC9276GCd.A0G
            boolean r0 = r11.A0A(r12, r6, r0)
            if (r0 == 0) goto L42
            boolean r1 = r6 instanceof X.C9281GCi
            if (r1 == 0) goto L77
            X.GCi r6 = (X.C9281GCi) r6
            X.GCR r6 = r6.A00
        L77:
            boolean r0 = r10.A0E(r6, r11, r12)
            if (r0 == 0) goto L83
            X.HrH r0 = X.AbstractC9276GCd.A07
            r4.set(r2, r0)
            goto L36
        L83:
            r4.set(r2, r5)
            r11.A05()
            if (r1 == 0) goto La7
            goto La4
        L8c:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.GCV.A06
            long r7 = r0.get(r10)
            r0 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r7 = r7 & r0
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 >= 0) goto Laa
            X.HrH r0 = X.AbstractC9276GCd.A0E
            boolean r0 = r11.A0A(r12, r6, r0)
            if (r0 == 0) goto L42
        La4:
            r10.A08()
        La7:
            X.HrH r1 = X.AbstractC9276GCd.A08
            return r1
        Laa:
            if (r9 == 0) goto Lb2
            boolean r0 = r11.A0A(r12, r6, r9)
            goto L22
        Lb2:
            X.HrH r1 = X.AbstractC9276GCd.A0I
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GCV.A01(java.lang.Object, X.GCV, X.GCY, int, long):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: <E:Ljava/lang/Object;>(LX/GCV<TE;>;LX/HtJ<-LX/HoI<+TE;>;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object A02(X.HtJ r16, X.GCV r17) {
        /*
            r3 = r16
            boolean r0 = r3 instanceof X.C9274GCb
            r7 = r17
            if (r0 == 0) goto Lad
            r12 = r3
            X.GCb r12 = (X.C9274GCb) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lad
            int r2 = r2 - r1
            r12.label = r2
        L16:
            java.lang.Object r1 = r12.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r12.label
            r4 = 1
            if (r0 == 0) goto L29
            if (r0 != r4) goto Lb4
            X.Hwg.A00(r1)
            X.HoI r1 = (X.HoI) r1
            java.lang.Object r3 = r1.A00
        L28:
            return r3
        L29:
            X.Hwg.A00(r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.GCV.A0A
            java.lang.Object r8 = r0.get(r7)
            X.GCY r8 = (X.GCY) r8
        L34:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.GCV.A06
            long r0 = r0.get(r7)
            boolean r0 = A0G(r7, r0, r4)
            if (r0 == 0) goto L4e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.GCV.A07
            java.lang.Object r0 = r0.get(r7)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            X.Ho5 r3 = new X.Ho5
            r3.<init>(r0)
            return r3
        L4e:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.GCV.A05
            long r10 = r0.getAndIncrement(r7)
            int r0 = X.AbstractC9276GCd.A01
            long r2 = (long) r0
            long r0 = r10 / r2
            long r2 = r10 % r2
            int r9 = (int) r2
            long r2 = r8.A00
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 == 0) goto L69
            X.GCY r2 = A06(r7, r8, r0)
            if (r2 == 0) goto L34
            r8 = r2
        L69:
            r6 = 0
            java.lang.Object r3 = A01(r6, r7, r8, r9, r10)
            X.HrH r2 = X.AbstractC9276GCd.A0H
            if (r3 == r2) goto Lc0
            X.HrH r2 = X.AbstractC9276GCd.A08
            if (r3 != r2) goto L82
            long r1 = r7.A0H()
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L34
            r8.A01()
            goto L34
        L82:
            X.HrH r2 = X.AbstractC9276GCd.A0I
            if (r3 != r2) goto Lbc
            r12.L$0 = r6
            r12.L$1 = r6
            r12.L$2 = r6
            r12.L$3 = r6
            r12.L$4 = r6
            r2 = 0
            r12.I$0 = r2
            r12.J$0 = r10
            r12.J$1 = r0
            r12.I$1 = r9
            r12.J$2 = r10
            r12.I$2 = r9
            r12.I$3 = r2
            r12.label = r4
            r13 = r7
            r14 = r8
            r15 = r9
            r16 = r10
            java.lang.Object r3 = A03(r12, r13, r14, r15, r16)
            if (r3 != r5) goto L28
            return r5
        Lad:
            X.GCb r12 = new X.GCb
            r12.<init>(r3, r7)
            goto L16
        Lb4:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        Lbc:
            r8.A01()
            return r3
        Lc0:
            java.lang.String r1 = "unexpected"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GCV.A02(X.HtJ, X.GCV):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(X.HtJ r13, X.GCV r14, X.GCY r15, int r16, long r17) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GCV.A03(X.HtJ, X.GCV, X.GCY, int, long):java.lang.Object");
    }

    public static final Throwable A04(GCV gcv) {
        Throwable th = (Throwable) A07.get(gcv);
        return th == null ? new ClosedReceiveChannelException("Channel was closed") : th;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a7, code lost:
    
        if (r6 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a9, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00aa, code lost:
    
        r8.A09(r9, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b2, code lost:
    
        if ((r6 instanceof java.util.ArrayList) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b4, code lost:
    
        ((java.util.AbstractCollection) r6).add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bb, code lost:
    
        r0 = new java.util.ArrayList(4);
        r0.add(r6);
        r0.add(r2);
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0119, code lost:
    
        r0 = (X.GCY) ((X.GCL) X.GCL.A01.get(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0123, code lost:
    
        if (r0 != null) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.GCY<E> A05(long r12) throws kotlinx.coroutines.DispatchException {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GCV.A05(long):X.GCY");
    }

    public static final GCY A06(GCV gcv, GCY gcy, long j) {
        Object objA00;
        boolean z;
        long j2;
        long j3;
        GCY gcy2 = gcy;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A0A;
        int i = AbstractC9276GCd.A01;
        C9279GCg c9279GCg = C9279GCg.A00;
        loop0: while (true) {
            objA00 = GCM.A00(c9279GCg, gcy2, j);
            z = true;
            if (objA00 == GCM.A00) {
                break;
            }
            z = false;
            GCK gckA00 = GCP.A00(objA00);
            while (true) {
                GCK gck = (GCK) atomicReferenceFieldUpdater.get(gcv);
                if (gck.A00 >= gckA00.A00) {
                    break loop0;
                }
                if (gckA00.A08()) {
                    if (AbstractC5217DdT.A00(gcv, gck, gckA00, atomicReferenceFieldUpdater)) {
                        AbstractC7607F5u.A1R(gck);
                        break loop0;
                    }
                    AbstractC7607F5u.A1R(gckA00);
                }
            }
        }
        if (z) {
            gcv.AOF();
            j2 = ((GCK) gcy2).A00 * AbstractC9276GCd.A01;
        } else {
            gcy2 = (GCY) GCP.A00(objA00);
            if (!gcv.A0B() && j <= A03.get(gcv) / AbstractC9276GCd.A01) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = A08;
                while (true) {
                    GCK gck2 = (GCK) atomicReferenceFieldUpdater2.get(gcv);
                    if (gck2.A00 >= ((GCK) gcy2).A00 || !gcy2.A08()) {
                        break;
                    }
                    if (AbstractC5217DdT.A00(gcv, gck2, gcy2, atomicReferenceFieldUpdater2)) {
                        AbstractC7607F5u.A1R(gck2);
                        break;
                    }
                    AbstractC7607F5u.A1R(gcy2);
                }
            }
            long j4 = ((GCK) gcy2).A00;
            if (j4 <= j) {
                return gcy2;
            }
            j2 = j4 * AbstractC9276GCd.A01;
            AtomicLongFieldUpdater atomicLongFieldUpdater = A05;
            do {
                j3 = atomicLongFieldUpdater.get(gcv);
                if (j3 >= j2) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(gcv, j3, j2));
        }
        if (j2 < gcv.A0H()) {
            gcy2.A01();
        }
        return null;
    }

    public static final GCY A07(GCV gcv, GCY gcy, long j) {
        Object objA00;
        boolean z;
        long j2;
        long j3;
        long j4;
        GCY gcy2 = gcy;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A0B;
        int i = AbstractC9276GCd.A01;
        C9279GCg c9279GCg = C9279GCg.A00;
        loop0: while (true) {
            objA00 = GCM.A00(c9279GCg, gcy2, j);
            z = true;
            if (objA00 == GCM.A00) {
                break;
            }
            z = false;
            GCK gckA00 = GCP.A00(objA00);
            while (true) {
                GCK gck = (GCK) atomicReferenceFieldUpdater.get(gcv);
                if (gck.A00 >= gckA00.A00) {
                    break loop0;
                }
                if (gckA00.A08()) {
                    if (AbstractC5217DdT.A00(gcv, gck, gckA00, atomicReferenceFieldUpdater)) {
                        AbstractC7607F5u.A1R(gck);
                        break loop0;
                    }
                    AbstractC7607F5u.A1R(gckA00);
                }
            }
        }
        if (z) {
            gcv.AOF();
            j2 = ((GCK) gcy2).A00 * AbstractC9276GCd.A01;
        } else {
            gcy2 = (GCY) GCP.A00(objA00);
            long j5 = ((GCK) gcy2).A00;
            if (j5 <= j) {
                return gcy2;
            }
            j2 = j5 * AbstractC9276GCd.A01;
            AtomicLongFieldUpdater atomicLongFieldUpdater = A06;
            do {
                j3 = atomicLongFieldUpdater.get(gcv);
                j4 = 1152921504606846975L & j3;
                if (j4 >= j2) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(gcv, j3, (((int) (j3 >> 60)) << 60) + j4));
        }
        if (j2 < A05.get(gcv)) {
            gcy2.A01();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        r7 = X.GCV.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if ((r7.addAndGet(r18, 1) & 4611686018427387904L) == 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if ((r7.get(r18) & 4611686018427387904L) == 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e3, code lost:
    
        if (r17 >= X.GCV.A05.get(r18)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00eb, code lost:
    
        if (r8.A0A(r4, r2, X.AbstractC9276GCd.A0F) == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f1, code lost:
    
        if (A0E(r2, r8, r4) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f3, code lost:
    
        r3.set(r1, X.AbstractC9276GCd.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0151, code lost:
    
        r3.set(r1, X.AbstractC9276GCd.A0A);
        r8.A05();
     */
    /* JADX WARN: Path cross not found for [B:117:?, B:50:0x00db], limit reached: 117 */
    /* JADX WARN: Path cross not found for [B:117:?, B:52:0x00e5], limit reached: 117 */
    /* JADX WARN: Path cross not found for [B:50:0x00db, B:117:?], limit reached: 117 */
    /* JADX WARN: Path cross not found for [B:52:0x00e5, B:117:?], limit reached: 117 */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0032 A[EDGE_INSN: B:88:0x0032->B:12:0x0032 BREAK  A[LOOP:0: B:5:0x0010->B:95:0x0010, LOOP_LABEL: LOOP:0: B:5:0x0010->B:95:0x0010], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x010a -> B:52:0x00e5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A08() {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GCV.A08():void");
    }

    private final void A09(GCR gcr, boolean z) throws DispatchException {
        HtJ htJ;
        Object hoI;
        if (gcr instanceof Hm1) {
            htJ = (HtJ) gcr;
            Throwable thA04 = z ? A04(this) : A0I();
            C7384Etj.A0Y(thA04, 0);
            hoI = C3cG.A0s(thA04);
        } else {
            if (!(gcr instanceof GCS)) {
                if (!(gcr instanceof GCW)) {
                    if (!(gcr instanceof C9273GCa)) {
                        throw AbstractC7607F5u.A10(gcr, "Unexpected waiter: ");
                    }
                    C9273GCa.A00(this, AbstractC9276GCd.A04, (C9273GCa) gcr);
                    return;
                }
                GCW gcw = (GCW) gcr;
                GBL<? super Boolean> gbl = gcw.A01;
                C7384Etj.A0X(gbl);
                gcw.A01 = null;
                gcw.A00 = AbstractC9276GCd.A04;
                Throwable th = (Throwable) A07.get(gcw.A02);
                gbl.resumeWith(th == null ? AnonymousClass001.A0h() : C3cG.A0s(th));
                return;
            }
            htJ = ((GCS) gcr).A00;
            hoI = new HoI(new Ho5((Throwable) A07.get(this)));
        }
        htJ.resumeWith(hoI);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0010, code lost:
    
        continue;
     */
    /* JADX WARN: Incorrect types in method signature: (JLX/GCY<TE;>;)V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.GCK] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.GCK] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0A(X.GCY r8, long r9) {
        /*
            r7 = this;
        L0:
            long r1 = r8.A00
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 >= 0) goto L10
            X.GCL r0 = r8.A00()
            X.GCK r0 = (X.GCK) r0
            if (r0 == 0) goto L10
            r8 = r0
            goto L0
        L10:
            boolean r0 = r8.A03()
            if (r0 == 0) goto L20
            X.GCL r0 = r8.A00()
            X.GCK r0 = (X.GCK) r0
            if (r0 == 0) goto L20
            r8 = r0
            goto L10
        L20:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = X.GCV.A08
        L22:
            java.lang.Object r5 = r6.get(r7)
            X.GCK r5 = (X.GCK) r5
            long r3 = r5.A00
            long r1 = r8.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L3f
            boolean r0 = r8.A08()
            if (r0 == 0) goto L10
            boolean r0 = X.AbstractC5217DdT.A00(r7, r5, r8, r6)
            if (r0 == 0) goto L40
            X.AbstractC7607F5u.A1R(r5)
        L3f:
            return
        L40:
            X.AbstractC7607F5u.A1R(r8)
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GCV.A0A(X.GCY, long):void");
    }

    private final boolean A0B() {
        long j = A03.get(this);
        return j == 0 || j == LinkEncryptedPairingKt.LINK_COUNTER_MAX;
    }

    private final boolean A0C(long j) {
        return j < A03.get(this) || j < A05.get(this) + ((long) this.A01);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.HoI] */
    private final boolean A0D(Object obj, E e) {
        GBL<HoI<? extends E>> gbl;
        int i;
        Object objA02;
        if (obj instanceof C9273GCa) {
            return C9273GCa.A00(this, e, (C9273GCa) obj) == 0;
        }
        C8634Fhl c8634Fhl = null;
        if (obj instanceof GCS) {
            C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            gbl = ((GCS) obj).A00;
            e = new HoI(e);
            if (this.A00 != null) {
                i = 2;
                c8634Fhl = new C8634Fhl(this, i);
            }
            int i2 = AbstractC9276GCd.A01;
            objA02 = gbl.AhY(e, null, c8634Fhl);
        } else if (obj instanceof GCW) {
            C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            GCW gcw = (GCW) obj;
            gbl = gcw.A01;
            C7384Etj.A0X(gbl);
            gcw.A01 = null;
            gcw.A00 = e;
            G0U<E, Unit> g0u = gcw.A02.A00;
            C8942Fty c8942Fty = g0u != null ? new C8942Fty(0, e, g0u) : null;
            int i3 = AbstractC9276GCd.A01;
            objA02 = GBL.A02(true, null, c8942Fty, gbl);
        } else {
            if (!(obj instanceof Hm1)) {
                StringBuilder sb = new StringBuilder("Unexpected receiver type: ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString());
            }
            C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            gbl = (GBL<HoI<? extends E>>) ((Hm1) obj);
            if (this.A00 != null) {
                i = 1;
                c8634Fhl = new C8634Fhl(this, i);
            }
            int i22 = AbstractC9276GCd.A01;
            objA02 = gbl.AhY(e, null, c8634Fhl);
        }
        if (objA02 == null) {
            return false;
        }
        gbl.A6g();
        return true;
    }

    private final boolean A0E(Object obj, GCY<E> gcy, int i) {
        if (obj instanceof Hm1) {
            C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            Hm1 hm1 = (Hm1) obj;
            Unit unit = Unit.INSTANCE;
            int i2 = AbstractC9276GCd.A01;
            if (hm1.AhY(unit, null, null) == null) {
                return false;
            }
            hm1.A6g();
            return true;
        }
        if (!(obj instanceof C9273GCa)) {
            throw AbstractC7607F5u.A10(obj, "Unexpected waiter: ");
        }
        C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        int iA00 = C9273GCa.A00(this, Unit.INSTANCE, (C9273GCa) obj);
        Integer num = iA00 != 0 ? iA00 != 1 ? iA00 != 2 ? C79.A0K : C79.A0C : C79.A01 : C79.A00;
        if (num == C79.A01) {
            gcy.A01.set(i * 2, null);
        }
        return num == C79.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        r0.A01.set(r11 * 2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
    
        r0 = (X.GCY) ((X.GCL) X.GCL.A01.get(r0));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0G(X.GCV r14, long r15, boolean r17) throws kotlinx.coroutines.DispatchException {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GCV.A0G(X.GCV, long, boolean):boolean");
    }

    public final long A0H() {
        return A06.get(this) & 1152921504606846975L;
    }

    public final Throwable A0I() {
        Throwable th = (Throwable) A07.get(this);
        return th == null ? new ClosedSendChannelException("Channel was closed") : th;
    }

    public final void A0J(long j) {
        GCY gcyA06;
        UndeliveredElementException undeliveredElementExceptionA00;
        GCY gcy = (GCY) A0A.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = A05;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.A01 + j2, A03.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j2, 1 + j2)) {
                long j3 = AbstractC9276GCd.A01;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (((GCK) gcy).A00 != j4) {
                    gcyA06 = A06(this, gcy, j4);
                    if (gcyA06 == null) {
                        continue;
                    }
                } else {
                    gcyA06 = gcy;
                }
                Object objA01 = A01(null, this, gcyA06, i, j2);
                if (objA01 != AbstractC9276GCd.A08) {
                    gcyA06.A01();
                    G0U<E, Unit> g0u = this.A00;
                    if (g0u != null && (undeliveredElementExceptionA00 = GCT.A00(objA01, g0u, null)) != null) {
                        throw undeliveredElementExceptionA00;
                    }
                } else if (j2 < A0H()) {
                    gcyA06.A01();
                }
                gcy = gcyA06;
            }
        }
    }

    public final void A0K(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        long j3;
        if (A0B()) {
            return;
        }
        do {
            atomicLongFieldUpdater = A03;
        } while (atomicLongFieldUpdater.get(this) <= j);
        int i = AbstractC9276GCd.A00;
        for (int i2 = 0; i2 < i; i2++) {
            long j4 = atomicLongFieldUpdater.get(this);
            if (j4 == (AcsKeyConfig.UNLIMITED_TOKEN_TTL_MILLIS & A04.get(this)) && j4 == atomicLongFieldUpdater.get(this)) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = A04;
        do {
            j2 = atomicLongFieldUpdater2.get(this);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j2, 4611686018427387904L + (j2 & AcsKeyConfig.UNLIMITED_TOKEN_TTL_MILLIS)));
        while (true) {
            long j5 = atomicLongFieldUpdater.get(this);
            long j6 = atomicLongFieldUpdater2.get(this);
            long j7 = j6 & AcsKeyConfig.UNLIMITED_TOKEN_TTL_MILLIS;
            boolean z = (4611686018427387904L & j6) != 0;
            if (j5 == j7 && j5 == atomicLongFieldUpdater.get(this)) {
                break;
            } else if (!z) {
                atomicLongFieldUpdater2.compareAndSet(this, j6, 4611686018427387904L + j7);
            }
        }
        do {
            j3 = atomicLongFieldUpdater2.get(this);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, j3 & AcsKeyConfig.UNLIMITED_TOKEN_TTL_MILLIS));
    }

    @Override // X.HxV
    public final void A5w(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        A0F(cancellationException, true);
    }

    @Override // X.HxV
    public final C9284GCl AIF() {
        GCZ gcz = GCZ.A00;
        C0862A6j.A02(gcz, 3);
        C9277GCe c9277GCe = C9277GCe.A00;
        C0862A6j.A02(c9277GCe, 3);
        return new C9284GCl(this, gcz, c9277GCe, this.A02);
    }

    @Override // X.HxO
    public final void AO4(G0U<? super Throwable, Unit> g0u) {
        HrH hrH;
        HrH hrH2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A09;
        if (AbstractC5217DdT.A00(this, null, g0u, atomicReferenceFieldUpdater)) {
            return;
        }
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            hrH = AbstractC9276GCd.A05;
            hrH2 = AbstractC9276GCd.A06;
            if (obj != hrH) {
                if (obj != hrH2) {
                    throw AbstractC7607F5u.A10(obj, "Another handler is already registered: ");
                }
                throw C3cG.A0Q("Another handler was already registered and successfully invoked");
            }
        } while (!AbstractC5217DdT.A00(this, hrH, hrH2, atomicReferenceFieldUpdater));
        g0u.invoke(A07.get(this));
    }

    @Override // X.HxO
    public final boolean AOF() {
        return A0G(this, A06.get(this), false);
    }

    @Override // X.HxV
    public final GCW APO() {
        return new GCW(this);
    }

    @Override // X.HxV
    public final Object AZg(HtJ<? super E> htJ) throws Throwable {
        GCY gcyA06;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A0A;
        GCY gcy = (GCY) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = A06;
            if (A0G(this, atomicLongFieldUpdater.get(this), true)) {
                Throwable thA04 = A04(this);
                StackTraceElement stackTraceElement = Hl6.A00;
                throw thA04;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = A05;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(this);
            long j = AbstractC9276GCd.A01;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (((GCK) gcy).A00 != j2) {
                gcyA06 = A06(this, gcy, j2);
                if (gcyA06 == null) {
                    continue;
                }
            } else {
                gcyA06 = gcy;
            }
            C8634Fhl c8634Fhl = null;
            Object objA01 = A01(null, this, gcyA06, i, andIncrement);
            HrH hrH = AbstractC9276GCd.A0H;
            if (objA01 == hrH) {
                throw C3cG.A0Q("unexpected");
            }
            HrH hrH2 = AbstractC9276GCd.A08;
            if (objA01 != hrH2) {
                HrH hrH3 = AbstractC9276GCd.A0I;
                if (objA01 != hrH3) {
                    gcyA06.A01();
                    return objA01;
                }
                GBL gblA00 = GBO.A00(C7Bm.A02(htJ));
                GBL gbl = gblA00;
                try {
                    Object objA012 = A01(gblA00, this, gcyA06, i, andIncrement);
                    if (objA012 == hrH) {
                        gbl.AO3(gcyA06, i);
                    } else {
                        if (objA012 == hrH2) {
                            if (andIncrement < A0H()) {
                                gcyA06.A01();
                            }
                            GCY gcy2 = (GCY) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (A0G(this, atomicLongFieldUpdater.get(this), true)) {
                                    Throwable thA042 = A04(this);
                                    C7384Etj.A0Y(thA042, 0);
                                    gblA00.resumeWith(C3cG.A0s(thA042));
                                    break;
                                }
                                long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(this);
                                long j3 = andIncrement2 / j;
                                i = (int) (andIncrement2 % j);
                                if (((GCK) gcy2).A00 != j3) {
                                    gcyA06 = A06(this, gcy2, j3);
                                    if (gcyA06 == null) {
                                    }
                                } else {
                                    gcyA06 = gcy2;
                                }
                                objA012 = A01(gblA00, this, gcyA06, i, andIncrement2);
                                if (objA012 == hrH) {
                                    if (!(gblA00 instanceof GCR)) {
                                        gbl = null;
                                    }
                                    if (gbl != null) {
                                    }
                                } else if (objA012 == hrH2) {
                                    if (andIncrement2 < A0H()) {
                                        gcyA06.A01();
                                    }
                                    gcy2 = gcyA06;
                                } else {
                                    if (objA012 == hrH3) {
                                        throw C3cG.A0Q("unexpected");
                                    }
                                    gcyA06.A01();
                                    if (this.A00 != null) {
                                        c8634Fhl = new C8634Fhl(this, 1);
                                    }
                                }
                            }
                        } else {
                            gcyA06.A01();
                            if (this.A00 != null) {
                                c8634Fhl = new C8634Fhl(this, 1);
                            }
                        }
                        gblA00.Abe(objA012, c8634Fhl);
                    }
                    return gblA00.A0F();
                } catch (Throwable th) {
                    gblA00.A0J();
                    throw th;
                }
            }
            if (andIncrement < A0H()) {
                gcyA06.A01();
            }
            gcy = gcyA06;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x015f A[Catch: all -> 0x018d, TryCatch #0 {all -> 0x018d, blocks: (B:36:0x00b1, B:44:0x00d1, B:45:0x00da, B:47:0x00f1, B:79:0x015b, B:81:0x015f, B:82:0x0166, B:83:0x0171, B:52:0x00fb, B:59:0x0111, B:60:0x0116, B:74:0x0146, B:88:0x0187, B:89:0x018c, B:78:0x0158, B:65:0x0124, B:69:0x012c, B:70:0x0133, B:71:0x0136, B:87:0x0181, B:72:0x013c, B:75:0x014a, B:76:0x014f, B:77:0x0152), top: B:96:0x00b1 }] */
    @Override // X.HxO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object AcU(E r35, X.HtJ<? super kotlin.Unit> r36) throws kotlinx.coroutines.DispatchException {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GCV.AcU(java.lang.Object, X.HtJ):java.lang.Object");
    }

    @Override // X.HxV
    public final Object AhX() {
        GCR gcr;
        AtomicLongFieldUpdater atomicLongFieldUpdater = A05;
        long j = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = A06;
        long j2 = atomicLongFieldUpdater2.get(this);
        if (!A0G(this, j2, true)) {
            if (j < (j2 & 1152921504606846975L)) {
                Object obj = AbstractC9276GCd.A09;
                GCY gcy = (GCY) A0A.get(this);
                while (!A0G(this, atomicLongFieldUpdater2.get(this), true)) {
                    long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
                    long j3 = AbstractC9276GCd.A01;
                    long j4 = andIncrement / j3;
                    int i = (int) (andIncrement % j3);
                    if (((GCK) gcy).A00 != j4) {
                        GCY gcyA06 = A06(this, gcy, j4);
                        if (gcyA06 != null) {
                            gcy = gcyA06;
                        } else {
                            continue;
                        }
                    }
                    Object objA01 = A01(obj, this, gcy, i, andIncrement);
                    if (objA01 == AbstractC9276GCd.A0H) {
                        if ((obj instanceof GCR) && (gcr = (GCR) obj) != null) {
                            gcr.AO3(gcy, i);
                        }
                        A0K(andIncrement);
                        gcy.A05();
                    } else {
                        if (objA01 != AbstractC9276GCd.A08) {
                            if (objA01 == AbstractC9276GCd.A0I) {
                                throw new IllegalStateException("unexpected");
                            }
                            gcy.A01();
                            return objA01;
                        }
                        if (andIncrement < A0H()) {
                            gcy.A01();
                        }
                    }
                }
            }
            return HoI.A01;
        }
        return new Ho5((Throwable) A07.get(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a2, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    @Override // X.HxO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object AhZ(E r16) throws kotlinx.coroutines.DispatchException {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r7 = X.GCV.A06
            r10 = r15
            long r2 = r7.get(r15)
            r6 = 0
            boolean r0 = A0G(r15, r2, r6)
            if (r0 != 0) goto L1f
            r0 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r2 = r2 & r0
            boolean r0 = r15.A0C(r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L1f
        L1c:
            X.2zT r0 = X.HoI.A01
            return r0
        L1f:
            X.HrH r9 = X.AbstractC9276GCd.A0A
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.GCV.A0B
            java.lang.Object r4 = r0.get(r15)
            X.GCY r4 = (X.GCY) r4
        L29:
            long r0 = r7.getAndIncrement(r10)
            r13 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r13 = r13 & r0
            boolean r15 = A0G(r10, r0, r6)
            int r5 = X.AbstractC9276GCd.A01
            long r2 = (long) r5
            long r0 = r13 / r2
            long r2 = r13 % r2
            int r12 = (int) r2
            long r2 = r4.A00
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 == 0) goto L57
            X.GCY r11 = A07(r10, r4, r0)
            if (r11 != 0) goto L58
            if (r15 == 0) goto L29
        L4d:
            java.lang.Throwable r1 = r10.A0I()
            X.Ho5 r0 = new X.Ho5
            r0.<init>(r1)
            return r0
        L57:
            r11 = r4
        L58:
            r8 = r16
            int r1 = A00(r8, r9, r10, r11, r12, r13, r15)
            r4 = r11
            if (r1 == 0) goto L9d
            r0 = 1
            if (r1 == r0) goto La0
            r0 = 2
            if (r1 == r0) goto L7f
            r0 = 3
            if (r1 == r0) goto L95
            r0 = 4
            if (r1 == r0) goto L71
            r11.A01()
            goto L29
        L71:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.GCV.A05
            long r1 = r0.get(r10)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4d
            r11.A01()
            goto L4d
        L7f:
            if (r15 == 0) goto L85
            r11.A05()
            goto L4d
        L85:
            boolean r0 = r9 instanceof X.GCR
            if (r0 == 0) goto L91
            X.GCR r9 = (X.GCR) r9
            if (r9 == 0) goto L91
            int r12 = r12 + r5
            r9.AO3(r11, r12)
        L91:
            r11.A05()
            goto L1c
        L95:
            java.lang.String r1 = "unexpected"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L9d:
            r11.A01()
        La0:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GCV.AhZ(java.lang.Object):java.lang.Object");
    }

    @Override // X.HxV
    public final Object AZh(HtJ<? super HoI<? extends E>> htJ) {
        return A02(htJ, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0184, code lost:
    
        r6 = (X.GCY) r6.A00();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GCV.toString():java.lang.String");
    }
}
