package X;

import com.facebook.common.util.TriState;

/* renamed from: X.EUy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6691EUy<T> implements InterfaceC7028EeZ<T> {
    public boolean A00;

    /* JADX WARN: Code restructure failed: missing block: B:180:0x02c0, code lost:
    
        if (X.C6988Edo.A04(r3) != false) goto L181;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x044e A[Catch: IOException -> 0x0596, IOException -> 0x059f, all -> 0x05a8, PHI: r0
  0x044e: PHI (r0v89 int) = (r0v88 int), (r0v88 int), (r0v99 int) binds: [B:294:0x044c, B:270:0x040e, B:267:0x0408] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {IOException -> 0x0596, blocks: (B:251:0x03dd, B:253:0x03e1, B:255:0x03e8, B:257:0x03f2, B:258:0x03f8, B:397:0x058e, B:398:0x0595, B:302:0x045e, B:303:0x046d, B:304:0x046f, B:295:0x044e, B:274:0x0416, B:276:0x041e, B:277:0x0420, B:289:0x043b, B:291:0x0441, B:292:0x0443, B:293:0x0449, B:301:0x045b, B:300:0x0458), top: B:466:0x03dd }] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0576 A[Catch: all -> 0x0655, TRY_ENTER, TryCatch #13 {all -> 0x0655, blocks: (B:5:0x000d, B:6:0x0012, B:24:0x005b, B:26:0x0061, B:27:0x0065, B:453:0x064b, B:361:0x0517, B:364:0x0521, B:366:0x0525, B:368:0x052e, B:370:0x0532, B:378:0x0550, B:381:0x055d, B:383:0x056a, B:452:0x0648, B:436:0x0615, B:388:0x0576, B:389:0x057d, B:416:0x05b5, B:420:0x05c1, B:421:0x05c8, B:423:0x05d4, B:426:0x05dc, B:437:0x0619, B:434:0x0610, B:438:0x061c, B:440:0x0620, B:448:0x063d, B:451:0x0644, B:454:0x064c, B:442:0x062c, B:443:0x0633, B:446:0x0638, B:382:0x0560), top: B:484:0x0007, inners: #0, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0620 A[Catch: all -> 0x0655, TryCatch #13 {all -> 0x0655, blocks: (B:5:0x000d, B:6:0x0012, B:24:0x005b, B:26:0x0061, B:27:0x0065, B:453:0x064b, B:361:0x0517, B:364:0x0521, B:366:0x0525, B:368:0x052e, B:370:0x0532, B:378:0x0550, B:381:0x055d, B:383:0x056a, B:452:0x0648, B:436:0x0615, B:388:0x0576, B:389:0x057d, B:416:0x05b5, B:420:0x05c1, B:421:0x05c8, B:423:0x05d4, B:426:0x05dc, B:437:0x0619, B:434:0x0610, B:438:0x061c, B:440:0x0620, B:448:0x063d, B:451:0x0644, B:454:0x064c, B:442:0x062c, B:443:0x0633, B:446:0x0638, B:382:0x0560), top: B:484:0x0007, inners: #0, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x063d A[Catch: all -> 0x0655, TRY_ENTER, TRY_LEAVE, TryCatch #13 {all -> 0x0655, blocks: (B:5:0x000d, B:6:0x0012, B:24:0x005b, B:26:0x0061, B:27:0x0065, B:453:0x064b, B:361:0x0517, B:364:0x0521, B:366:0x0525, B:368:0x052e, B:370:0x0532, B:378:0x0550, B:381:0x055d, B:383:0x056a, B:452:0x0648, B:436:0x0615, B:388:0x0576, B:389:0x057d, B:416:0x05b5, B:420:0x05c1, B:421:0x05c8, B:423:0x05d4, B:426:0x05dc, B:437:0x0619, B:434:0x0610, B:438:0x061c, B:440:0x0620, B:448:0x063d, B:451:0x0644, B:454:0x064c, B:442:0x062c, B:443:0x0633, B:446:0x0638, B:382:0x0560), top: B:484:0x0007, inners: #0, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:462:0x062c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r16v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.EeM, X.EeM<X.Edo>] */
    /* JADX WARN: Type inference failed for: r4v13, types: [X.EeV] */
    /* JADX WARN: Type inference failed for: r4v14, types: [X.EeN, X.EeV] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.EeV] */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.EeV, X.Ef2] */
    /* JADX WARN: Type inference failed for: r4v6, types: [X.Eew] */
    /* JADX WARN: Type inference failed for: r4v9, types: [X.EeT, X.EeV] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A03(T r16, int r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6691EUy.A03(java.lang.Object, int):void");
    }

    public abstract void A04(float f);

    @Override // X.InterfaceC7028EeZ
    public final synchronized void AS7() {
        InterfaceC7028EeZ interfaceC7028EeZ;
        if (!this.A00) {
            this.A00 = true;
            try {
                if (this instanceof C7188Ehy) {
                    AbstractC7187Ehx<K, T>.Multiplexer.ForwardingConsumer forwardingConsumer = (C7188Ehy) this;
                    try {
                        C7267Ejs.A00();
                        C7186Ehw c7186Ehw = forwardingConsumer.A00;
                        synchronized (c7186Ehw) {
                            if (c7186Ehw.A03 == forwardingConsumer) {
                                c7186Ehw.A03 = null;
                                c7186Ehw.A02 = null;
                                C7186Ehw.A05(c7186Ehw.A04);
                                c7186Ehw.A04 = null;
                                C7186Ehw.A04(TriState.A03, c7186Ehw);
                            }
                        }
                        C7267Ejs.A00();
                    } catch (Throwable th) {
                        C7267Ejs.A00();
                        throw th;
                    }
                } else if (this instanceof AbstractC7024EeV) {
                    AbstractC7024EeV abstractC7024EeV = (AbstractC7024EeV) this;
                    if (abstractC7024EeV instanceof C7075EfZ) {
                        C7075EfZ c7075EfZ = (C7075EfZ) abstractC7024EeV;
                        ((AbstractC7024EeV) c7075EfZ).A00.AS7();
                        C7075EfZ.A00(c7075EfZ);
                    } else {
                        if (abstractC7024EeV instanceof AbstractC7043Eep) {
                            AbstractC7043Eep abstractC7043Eep = (AbstractC7043Eep) abstractC7024EeV;
                            AbstractC7043Eep.A02(abstractC7043Eep, true);
                            interfaceC7028EeZ = ((AbstractC7024EeV) abstractC7043Eep).A00;
                        } else {
                            interfaceC7028EeZ = abstractC7024EeV.A00;
                        }
                        interfaceC7028EeZ.AS7();
                    }
                } else {
                    AbstractC7199EiC<T> abstractC7199EiC = ((C7201EiF) this).A00;
                    synchronized (abstractC7199EiC) {
                        try {
                            CVn.A03(abstractC7199EiC.A05());
                        } finally {
                        }
                    }
                }
            } catch (Exception e) {
                A00(e);
            }
        }
    }

    @Override // X.InterfaceC7028EeZ
    public final synchronized void AUL(T t, int i) {
        if (!this.A00) {
            this.A00 = BV8.A1Y(i);
            try {
                A03(t, i);
            } catch (Exception e) {
                A00(e);
            }
        }
    }

    @Override // X.InterfaceC7028EeZ
    public final synchronized void AV9(float f) {
        if (!this.A00) {
            try {
                A04(f);
            } catch (Exception e) {
                A00(e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0015 A[Catch: Exception -> 0x00e1, all -> 0x00e7, TRY_LEAVE, TryCatch #4 {Exception -> 0x00e1, blocks: (B:7:0x000a, B:8:0x0011, B:10:0x0015, B:32:0x006f, B:37:0x0077, B:38:0x007a, B:39:0x007b, B:41:0x007f, B:43:0x0086, B:45:0x0098, B:46:0x009c, B:48:0x00a0, B:49:0x00ab, B:51:0x00af, B:52:0x00b7, B:54:0x00bb, B:55:0x00c9, B:56:0x00cc, B:58:0x00db), top: B:71:0x000a, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b A[Catch: Exception -> 0x00e1, all -> 0x00e7, TryCatch #4 {Exception -> 0x00e1, blocks: (B:7:0x000a, B:8:0x0011, B:10:0x0015, B:32:0x006f, B:37:0x0077, B:38:0x007a, B:39:0x007b, B:41:0x007f, B:43:0x0086, B:45:0x0098, B:46:0x009c, B:48:0x00a0, B:49:0x00ab, B:51:0x00af, B:52:0x00b7, B:54:0x00bb, B:55:0x00c9, B:56:0x00cc, B:58:0x00db), top: B:71:0x000a, outer: #2 }] */
    @Override // X.InterfaceC7028EeZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void onFailure(java.lang.Throwable r9) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6691EUy.onFailure(java.lang.Throwable):void");
    }

    private final void A00(Exception exc) {
        Class<?> cls = getClass();
        CFL cfl = AbstractC3422CMk.A00;
        if (CFL.A02(cfl)) {
            cfl.Aj8(cls.getSimpleName(), "unhandled exception", exc);
        }
    }
}
