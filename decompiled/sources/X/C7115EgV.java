package X;

import android.graphics.Bitmap;

/* renamed from: X.EgV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7115EgV implements InterfaceC6522EBw {
    public int A00;
    public int A01;
    public final C7125Egf A02 = new C7125Egf(0);
    public final InterfaceC3590CVw A03;

    /* JADX WARN: Multi-variable type inference failed */
    private synchronized void A00(int i) {
        Object objPollLast;
        while (this.A00 > i) {
            C7125Egf c7125Egf = this.A02;
            C7119EgZ<T> c7119EgZ = c7125Egf.A00;
            synchronized (c7119EgZ) {
                try {
                    C7124Ege<T> c7124Ege = c7119EgZ.A01;
                    if (c7124Ege == 0) {
                        objPollLast = null;
                    } else {
                        objPollLast = c7124Ege.A03.pollLast();
                        if (c7124Ege.A03.isEmpty()) {
                            C7119EgZ.A00(c7124Ege, c7119EgZ);
                            c7119EgZ.A02.remove(c7124Ege.A00);
                        }
                        if (objPollLast != null) {
                            synchronized (c7125Egf) {
                                try {
                                    c7125Egf.A01.remove(objPollLast);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Bitmap bitmap = (Bitmap) objPollLast;
            if (bitmap == null) {
                break;
            }
            this.A00 -= bitmap.getAllocationByteCount();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x006e A[Catch: all -> 0x008b, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0006, B:6:0x0009, B:7:0x000d, B:10:0x0018, B:22:0x003b, B:50:0x008a, B:29:0x0046, B:31:0x004a, B:33:0x0052, B:34:0x0058, B:41:0x006e, B:44:0x0075, B:45:0x007f, B:35:0x005c, B:37:0x0062, B:18:0x0036), top: B:57:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    @Override // X.InterfaceC6523EBx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ android.graphics.Bitmap get(int r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.A00     // Catch: java.lang.Throwable -> L8b
            r4 = 0
            if (r0 <= r4) goto L9
            r6.A00(r4)     // Catch: java.lang.Throwable -> L8b
        L9:
            X.Egf r5 = r6.A02     // Catch: java.lang.Throwable -> L8b
            X.EgZ<T> r2 = r5.A00     // Catch: java.lang.Throwable -> L8b
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L8b
            android.util.SparseArray<X.Ege<T>> r0 = r2.A02     // Catch: java.lang.Throwable -> L88
            java.lang.Object r1 = r0.get(r7)     // Catch: java.lang.Throwable -> L88
            X.Ege r1 = (X.C7124Ege) r1     // Catch: java.lang.Throwable -> L88
            if (r1 != 0) goto L1a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8b
            goto L38
        L1a:
            java.util.LinkedList<I> r0 = r1.A03     // Catch: java.lang.Throwable -> L88
            java.lang.Object r3 = r0.pollFirst()     // Catch: java.lang.Throwable -> L88
            X.Ege<T> r0 = r2.A00     // Catch: java.lang.Throwable -> L88
            if (r0 == r1) goto L36
            X.C7119EgZ.A00(r1, r2)     // Catch: java.lang.Throwable -> L88
            X.Ege<T> r0 = r2.A00     // Catch: java.lang.Throwable -> L88
            if (r0 != 0) goto L30
            r2.A00 = r1     // Catch: java.lang.Throwable -> L88
            r2.A01 = r1     // Catch: java.lang.Throwable -> L88
            goto L36
        L30:
            r1.A01 = r0     // Catch: java.lang.Throwable -> L88
            r0.A02 = r1     // Catch: java.lang.Throwable -> L88
            r2.A00 = r1     // Catch: java.lang.Throwable -> L88
        L36:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8b
            goto L39
        L38:
            r3 = 0
        L39:
            if (r3 == 0) goto L46
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L8b
            java.util.Set<T> r0 = r5.A01     // Catch: java.lang.Throwable -> L43
            r0.remove(r3)     // Catch: java.lang.Throwable -> L43
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L43
            goto L46
        L43:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L43
            goto L8a
        L46:
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch: java.lang.Throwable -> L8b
            if (r3 == 0) goto L72
            boolean r0 = r3.isRecycled()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = "BitmapPoolBackend"
            if (r0 == 0) goto L5c
            java.lang.Object[] r1 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = "Cannot reuse a recycled bitmap: %s"
        L58:
            X.AbstractC3422CMk.A07(r2, r0, r1)     // Catch: java.lang.Throwable -> L8b
            goto L69
        L5c:
            boolean r0 = r3.isMutable()     // Catch: java.lang.Throwable -> L8b
            if (r0 != 0) goto L6b
            java.lang.Object[] r1 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = "Cannot reuse an immutable bitmap: %s"
            goto L58
        L69:
            r0 = 0
            goto L6c
        L6b:
            r0 = 1
        L6c:
            if (r0 == 0) goto L72
            r3.eraseColor(r4)     // Catch: java.lang.Throwable -> L8b
            goto L73
        L72:
            r3 = 0
        L73:
            if (r3 == 0) goto L7f
            int r1 = r3.getAllocationByteCount()     // Catch: java.lang.Throwable -> L8b
            int r0 = r6.A00     // Catch: java.lang.Throwable -> L8b
            int r0 = r0 - r1
            r6.A00 = r0     // Catch: java.lang.Throwable -> L8b
            goto L86
        L7f:
            r1 = 1
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ALPHA_8     // Catch: java.lang.Throwable -> L8b
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r1, r7, r0)     // Catch: java.lang.Throwable -> L8b
        L86:
            monitor-exit(r6)
            return r3
        L88:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L88
        L8a:
            throw r0     // Catch: java.lang.Throwable -> L8b
        L8b:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L8b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7115EgV.get(int):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.InterfaceC6523EBx, X.InterfaceC3587CVm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void Aa9(java.lang.Object r8) {
        /*
            r7 = this;
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            X.Egf r1 = r7.A02
            r0 = 0
            X.C7384Etj.A0Y(r8, r0)
            int r6 = r8.getAllocationByteCount()
            int r0 = r7.A01
            if (r6 > r0) goto L8d
            boolean r0 = r8.isRecycled()
            java.lang.String r2 = "BitmapPoolBackend"
            if (r0 == 0) goto L23
            java.lang.Object[] r1 = new java.lang.Object[]{r8}
            java.lang.String r0 = "Cannot reuse a recycled bitmap: %s"
        L1e:
            X.AbstractC3422CMk.A07(r2, r0, r1)
        L21:
            monitor-enter(r7)
            goto L7d
        L23:
            boolean r0 = r8.isMutable()
            if (r0 != 0) goto L30
            java.lang.Object[] r1 = new java.lang.Object[]{r8}
            java.lang.String r0 = "Cannot reuse an immutable bitmap: %s"
            goto L1e
        L30:
            monitor-enter(r1)
            java.util.Set<T> r0 = r1.A01     // Catch: java.lang.Throwable -> L8a
            boolean r0 = r0.add(r8)     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L21
            X.EgZ<T> r5 = r1.A00
            int r4 = r8.getAllocationByteCount()
            monitor-enter(r5)
            android.util.SparseArray<X.Ege<T>> r3 = r5.A02     // Catch: java.lang.Throwable -> L87
            java.lang.Object r2 = r3.get(r4)     // Catch: java.lang.Throwable -> L87
            X.Ege r2 = (X.C7124Ege) r2     // Catch: java.lang.Throwable -> L87
            if (r2 != 0) goto L60
            java.util.LinkedList r1 = X.BV4.A0y()     // Catch: java.lang.Throwable -> L87
            r0 = 0
            X.Ege r2 = new X.Ege     // Catch: java.lang.Throwable -> L87
            r2.<init>()     // Catch: java.lang.Throwable -> L87
            r2.A02 = r0     // Catch: java.lang.Throwable -> L87
            r2.A00 = r4     // Catch: java.lang.Throwable -> L87
            r2.A03 = r1     // Catch: java.lang.Throwable -> L87
            r2.A01 = r0     // Catch: java.lang.Throwable -> L87
            r3.put(r4, r2)     // Catch: java.lang.Throwable -> L87
        L60:
            java.util.LinkedList<I> r0 = r2.A03     // Catch: java.lang.Throwable -> L87
            r0.addLast(r8)     // Catch: java.lang.Throwable -> L87
            X.Ege<T> r0 = r5.A00     // Catch: java.lang.Throwable -> L87
            if (r0 == r2) goto L7b
            X.C7119EgZ.A00(r2, r5)     // Catch: java.lang.Throwable -> L87
            X.Ege<T> r0 = r5.A00     // Catch: java.lang.Throwable -> L87
            if (r0 != 0) goto L75
            r5.A00 = r2     // Catch: java.lang.Throwable -> L87
            r5.A01 = r2     // Catch: java.lang.Throwable -> L87
            goto L7b
        L75:
            r2.A01 = r0     // Catch: java.lang.Throwable -> L87
            r0.A02 = r2     // Catch: java.lang.Throwable -> L87
            r5.A00 = r2     // Catch: java.lang.Throwable -> L87
        L7b:
            monitor-exit(r5)
            goto L21
        L7d:
            int r0 = r7.A00     // Catch: java.lang.Throwable -> L84
            int r0 = r0 + r6
            r7.A00 = r0     // Catch: java.lang.Throwable -> L84
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L84
            return
        L84:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L84
            throw r0
        L87:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L87
            throw r0
        L8a:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8a
            throw r0
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7115EgV.Aa9(java.lang.Object):void");
    }

    @Override // X.ECU
    public final void AhS(ECR ecr) {
        A00((int) (0.0d * (1.0d - ecr.mSuggestedTrimRatio)));
    }

    public C7115EgV(InterfaceC3590CVw interfaceC3590CVw, int i) {
        this.A01 = i;
        this.A03 = interfaceC3590CVw;
    }
}
