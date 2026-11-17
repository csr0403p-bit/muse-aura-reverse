package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;

@Deprecated(level = Hs1.A02, message = "This is internal API and may be removed in the future releases")
/* loaded from: classes6.dex */
public abstract class GBM implements HoC {
    public volatile /* synthetic */ Object _parentHandle$volatile;
    public volatile /* synthetic */ Object _state$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A01 = AtomicReferenceFieldUpdater.newUpdater(GBM.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A00 = AtomicReferenceFieldUpdater.newUpdater(GBM.class, Object.class, "_parentHandle$volatile");

    private final void A08(Throwable th, GC1 gc1) {
        gc1.A04(new C9265GBs(4), 4);
        Object obj = GBT.A00.get(gc1);
        C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (GBT gbtA02 = (GBT) obj; !C7384Etj.areEqual(gbtA02, gc1); gbtA02 = gbtA02.A02()) {
            if ((gbtA02 instanceof GBP) && ((GBP) gbtA02).A07()) {
                try {
                    ((GBP) gbtA02).A06(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        CU7.A01(completionHandlerException, th2);
                    } else {
                        StringBuilder sb = new StringBuilder("Exception in completion handler ");
                        sb.append(gbtA02);
                        sb.append(" for ");
                        sb.append(this);
                        completionHandlerException = new CompletionHandlerException(sb.toString(), th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            if (!(this instanceof GAq)) {
                throw completionHandlerException;
            }
            HwS.A00(((GAq) this).A00, completionHandlerException);
        }
        A0B(th);
    }

    @Override // X.HoC
    public final C3b6<HoC> ADc() {
        return new C2308BTi(new GBR(null, this), 1);
    }

    @Override // X.C78T
    public final /* bridge */ <R> R fold(R r, G0V<? super R, ? super C78X, ? extends R> g0v) {
        C7384Etj.A0Y(g0v, 2);
        return g0v.invoke(r, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A00(java.lang.Object r4, X.GBM r5) {
        /*
            boolean r0 = r4 instanceof X.C9257GBk
            r3 = -1
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L19
            r0 = r4
            X.GBk r0 = (X.C9257GBk) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L29
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = X.GBM.A01
            X.GBk r0 = X.AbstractC9251GBe.A00
        L12:
            boolean r0 = X.AbstractC5217DdT.A00(r5, r4, r0, r1)
            if (r0 != 0) goto L25
            return r3
        L19:
            boolean r0 = r4 instanceof X.C9264GBr
            if (r0 == 0) goto L29
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = X.GBM.A01
            r0 = r4
            X.GBr r0 = (X.C9264GBr) r0
            X.GC1 r0 = r0.A00
            goto L12
        L25:
            r5.A0I()
            return r2
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GBM.A00(java.lang.Object, X.GBM):int");
    }

    private final Object A01(Object obj, Object obj2) {
        boolean z;
        HrH hrH;
        if (!(obj instanceof InterfaceC9269GBw)) {
            return AbstractC9251GBe.A02;
        }
        if ((!(obj instanceof C9257GBk) && !(obj instanceof GBP)) || (obj instanceof C9254GBh) || (obj2 instanceof C10474Hkl)) {
            InterfaceC9269GBw interfaceC9269GBw = (InterfaceC9269GBw) obj;
            GC1 gc1A06 = A06(interfaceC9269GBw);
            if (gc1A06 != null) {
                GBS gbs = interfaceC9269GBw instanceof GBS ? (GBS) interfaceC9269GBw : null;
                if (gbs == null) {
                    gbs = new GBS(null, gc1A06);
                }
                synchronized (gbs) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = GBS.A01;
                    if (atomicIntegerFieldUpdater.get(gbs) == 1) {
                        hrH = AbstractC9251GBe.A02;
                    } else {
                        atomicIntegerFieldUpdater.set(gbs, 1);
                        if (gbs == interfaceC9269GBw || AbstractC5217DdT.A00(this, interfaceC9269GBw, gbs, A01)) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GBS.A03;
                            boolean z2 = atomicReferenceFieldUpdater.get(gbs) != null;
                            C10474Hkl c10474Hkl = obj2 instanceof C10474Hkl ? (C10474Hkl) obj2 : null;
                            if (c10474Hkl != null) {
                                gbs.A00(c10474Hkl.A00);
                            }
                            Throwable th = z2 ? null : (Throwable) atomicReferenceFieldUpdater.get(gbs);
                            if (th != null) {
                                A08(th, gc1A06);
                            }
                            C9254GBh c9254GBhA05 = A05(gc1A06);
                            if (c9254GBhA05 == null || !A0A(obj2, c9254GBhA05, gbs, this)) {
                                gc1A06.A04(new C9265GBs(2), 2);
                                C9254GBh c9254GBhA052 = A05(gc1A06);
                                if (c9254GBhA052 == null || !A0A(obj2, c9254GBhA052, gbs, this)) {
                                    return A02(obj2, gbs, this);
                                }
                            }
                            return AbstractC9251GBe.A04;
                        }
                        hrH = AbstractC9251GBe.A03;
                    }
                    return hrH;
                }
            }
        } else {
            InterfaceC9269GBw interfaceC9269GBw2 = (InterfaceC9269GBw) obj;
            if (AbstractC5217DdT.A00(this, interfaceC9269GBw2, obj2 instanceof InterfaceC9269GBw ? new C9271GBy((InterfaceC9269GBw) obj2) : obj2, A01)) {
                A0K(obj2);
                A07(obj2, interfaceC9269GBw2);
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return obj2;
            }
        }
        return AbstractC9251GBe.A03;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a7 A[PHI: r3
  0x00a7: PHI (r3v5 java.lang.Throwable) = (r3v3 java.lang.Throwable), (r3v1 java.lang.Throwable) binds: [B:49:0x00a5, B:27:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b1 A[Catch: all -> 0x0135, TryCatch #0 {, blocks: (B:8:0x000d, B:10:0x001a, B:11:0x0020, B:13:0x0028, B:21:0x0045, B:23:0x004b, B:24:0x004e, B:26:0x005a, B:28:0x0060, B:52:0x00aa, B:54:0x00b1, B:55:0x00c2, B:57:0x00c8, B:59:0x00d0, B:61:0x00d4, B:63:0x00da, B:29:0x006a, B:30:0x006e, B:32:0x0074, B:34:0x007c, B:36:0x0080, B:38:0x008b, B:39:0x008f, B:41:0x0095, B:43:0x009b, B:48:0x00a3, B:14:0x002d, B:16:0x0031, B:17:0x003b, B:19:0x003f, B:80:0x0121, B:81:0x0134), top: B:85:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(java.lang.Object r7, X.GBS r8, X.GBM r9) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GBM.A02(java.lang.Object, X.GBS, X.GBM):java.lang.Object");
    }

    public static final String A03(Object obj) {
        return obj instanceof GBS ? GBS.A03.get(obj) != null ? "Cancelling" : GBS.A01.get(obj) == 1 ? "Completing" : "Active" : obj instanceof InterfaceC9269GBw ? !((InterfaceC9269GBw) obj).isActive() ? "New" : "Active" : obj instanceof C10474Hkl ? "Cancelled" : "Completed";
    }

    private final Throwable A04(Object obj) {
        if (obj == null || (obj instanceof Throwable)) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(A0F(), null, this) : th;
        }
        GBM gbm = (GBM) obj;
        Object obj2 = A01.get(gbm);
        Throwable th2 = null;
        if (obj2 instanceof GBS) {
            th2 = (Throwable) GBS.A03.get(obj2);
        } else if (obj2 instanceof C10474Hkl) {
            th2 = ((C10474Hkl) obj2).A00;
        } else if (obj2 instanceof InterfaceC9269GBw) {
            StringBuilder sb = new StringBuilder("Cannot be cancelling child in this state: ");
            sb.append(obj2);
            throw new IllegalStateException(sb.toString());
        }
        if (th2 instanceof CancellationException) {
            Throwable th3 = th2;
            if (th2 != null) {
                return th3;
            }
        }
        return new JobCancellationException(FGI.A0M("Parent job is ", A03(obj2)), th2, gbm);
    }

    private final void A07(Object obj, InterfaceC9269GBw interfaceC9269GBw) {
        CompletionHandlerException completionHandlerException;
        C10474Hkl c10474Hkl;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A00;
        HsS hsS = (HsS) atomicReferenceFieldUpdater.get(this);
        if (hsS != null) {
            hsS.dispose();
            atomicReferenceFieldUpdater.set(this, HsE.A00);
        }
        Throwable th = null;
        if ((obj instanceof C10474Hkl) && (c10474Hkl = (C10474Hkl) obj) != null) {
            th = c10474Hkl.A00;
        }
        if (interfaceC9269GBw instanceof GBP) {
            try {
                ((GBP) interfaceC9269GBw).A06(th);
                return;
            } catch (Throwable th2) {
                StringBuilder sb = new StringBuilder("Exception in completion handler ");
                sb.append(interfaceC9269GBw);
                sb.append(" for ");
                sb.append(this);
                completionHandlerException = new CompletionHandlerException(sb.toString(), th2);
                if (!(this instanceof GAq)) {
                    throw completionHandlerException;
                }
            }
        } else {
            GC1 gc1AH7 = interfaceC9269GBw.AH7();
            if (gc1AH7 == null) {
                return;
            }
            gc1AH7.A04(new C9265GBs(1), 1);
            Object obj2 = GBT.A00.get(gc1AH7);
            C7384Etj.A0Z(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            completionHandlerException = null;
            for (GBT gbtA02 = (GBT) obj2; !C7384Etj.areEqual(gbtA02, gc1AH7); gbtA02 = gbtA02.A02()) {
                if (gbtA02 instanceof GBP) {
                    try {
                        ((GBP) gbtA02).A06(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            CU7.A01(completionHandlerException, th3);
                        } else {
                            StringBuilder sb2 = new StringBuilder("Exception in completion handler ");
                            sb2.append(gbtA02);
                            sb2.append(" for ");
                            sb2.append(this);
                            completionHandlerException = new CompletionHandlerException(sb2.toString(), th3);
                        }
                    }
                }
            }
            if (completionHandlerException == null) {
                return;
            }
            if (!(this instanceof GAq)) {
                throw completionHandlerException;
            }
        }
        HwS.A00(((GAq) this).A00, completionHandlerException);
    }

    private final void A09(GBP gbp) {
        GC1 gc1 = new GC1();
        GBT.A01.set(gc1, gbp);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GBT.A00;
        atomicReferenceFieldUpdater.set(gc1, gbp);
        while (true) {
            if (atomicReferenceFieldUpdater.get(gbp) != gbp) {
                break;
            } else if (AbstractC5217DdT.A00(gbp, gbp, gc1, atomicReferenceFieldUpdater)) {
                GBT.A01(gc1, gbp);
                break;
            }
        }
        AbstractC5217DdT.A00(this, gbp, gbp.A02(), A01);
    }

    public static final boolean A0A(Object obj, C9254GBh c9254GBh, GBS gbs, GBM gbm) {
        while (HzS.A01(c9254GBh.A00, new C9249GBc(obj, c9254GBh, gbs, gbm), false) == HsE.A00) {
            c9254GBh = A05(c9254GBh);
            if (c9254GBh == null) {
                return false;
            }
        }
        return true;
    }

    public final Object A0C() throws Throwable {
        Object obj = A01.get(this);
        if (obj instanceof InterfaceC9269GBw) {
            throw C3cG.A0Q("This job has not completed yet");
        }
        if (obj instanceof C10474Hkl) {
            throw ((C10474Hkl) obj).A00;
        }
        return AbstractC9251GBe.A00(obj);
    }

    public final Object A0D(Object obj) {
        Object objA01;
        C10474Hkl c10474Hkl;
        do {
            objA01 = A01(A01.get(this), obj);
            if (objA01 == AbstractC9251GBe.A02) {
                StringBuilder sb = new StringBuilder("Job ");
                sb.append(this);
                sb.append(" is already complete or completing, but is being completed with ");
                sb.append(obj);
                String string = sb.toString();
                Throwable th = null;
                if ((obj instanceof C10474Hkl) && (c10474Hkl = (C10474Hkl) obj) != null) {
                    th = c10474Hkl.A00;
                }
                throw new IllegalStateException(string, th);
            }
        } while (objA01 == AbstractC9251GBe.A03);
        return objA01;
    }

    public final Object A0E(HtJ<Object> htJ) {
        Object obj;
        do {
            obj = A01.get(this);
            if (!(obj instanceof InterfaceC9269GBw)) {
                if (obj instanceof C10474Hkl) {
                    throw ((C10474Hkl) obj).A00;
                }
                return AbstractC9251GBe.A00(obj);
            }
        } while (A00(obj, this) < 0);
        String str = GBL.__redex_internal_original_name;
        C9247GBa c9247GBa = new C9247GBa(C7Bm.A02(htJ), this);
        c9247GBa.A0I();
        GBO.A01(new GB8(HzS.A01(this, new GBZ(c9247GBa), true)), c9247GBa);
        return c9247GBa.A0F();
    }

    public String A0F() {
        return "Job was cancelled";
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        r6.A06(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0002 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.HsS A0G(X.GBP r6, boolean r7) {
        /*
            r5 = this;
            r6.A00 = r5
        L2:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = X.GBM.A01
            java.lang.Object r3 = r4.get(r5)
            boolean r0 = r3 instanceof X.C9257GBk
            if (r0 == 0) goto L28
            r2 = r3
            X.GBk r2 = (X.C9257GBk) r2
            boolean r0 = r2.A00
            if (r0 == 0) goto L1a
            boolean r0 = X.AbstractC5217DdT.A00(r5, r3, r6, r4)
        L17:
            if (r0 == 0) goto L2
            return r6
        L1a:
            X.GC1 r1 = new X.GC1
            r1.<init>()
            X.GBr r0 = new X.GBr
            r0.<init>(r1)
            X.AbstractC5217DdT.A00(r5, r2, r0, r4)
            goto L2
        L28:
            boolean r0 = r3 instanceof X.InterfaceC9269GBw
            r2 = 0
            if (r0 == 0) goto L41
            r2 = r3
            X.GBw r2 = (X.InterfaceC9269GBw) r2
            X.GC1 r1 = r2.AH7()
            if (r1 != 0) goto L52
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode"
            X.C7384Etj.A0Z(r3, r0)
            X.GBP r3 = (X.GBP) r3
            r5.A09(r3)
            goto L2
        L41:
            if (r7 == 0) goto L6b
            java.lang.Object r1 = r4.get(r5)
            boolean r0 = r1 instanceof X.C10474Hkl
            if (r0 == 0) goto L68
            X.Hkl r1 = (X.C10474Hkl) r1
            if (r1 == 0) goto L68
            java.lang.Throwable r2 = r1.A00
            goto L68
        L52:
            boolean r0 = r6.A07()
            if (r0 == 0) goto L6e
            boolean r0 = r2 instanceof X.GBS
            if (r0 == 0) goto L70
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.GBS.A03
            java.lang.Object r2 = r0.get(r2)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            if (r2 == 0) goto L70
            if (r7 == 0) goto L6b
        L68:
            r6.A06(r2)
        L6b:
            X.HsE r0 = X.HsE.A00
            return r0
        L6e:
            r0 = 1
            goto L71
        L70:
            r0 = 5
        L71:
            boolean r0 = r1.A04(r6, r0)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GBM.A0G(X.GBP, boolean):X.HsS");
    }

    public final C9284GCl A0H() {
        GAh gAh = GAh.A00;
        C0862A6j.A02(gAh, 3);
        GAv gAv = GAv.A00;
        C0862A6j.A02(gAv, 3);
        return new C9284GCl(this, gAh, gAv, null);
    }

    public void A0I() {
    }

    public void A0J(Object obj) {
    }

    public void A0K(Object obj) {
    }

    public final void A0M(HoC hoC) {
        if (hoC != null) {
            hoC.Afv();
            InterfaceC10488Hlm interfaceC10488HlmA4q = hoC.A4q(this);
            A00.set(this, interfaceC10488HlmA4q);
            if (!AOG()) {
                return;
            } else {
                interfaceC10488HlmA4q.dispose();
            }
        }
        A00.set(this, HsE.A00);
    }

    public boolean A0N() {
        return true;
    }

    public boolean A0O() {
        return false;
    }

    public boolean A0P() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ab, code lost:
    
        r1 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b A[PHI: r1
  0x003b: PHI (r1v1 java.lang.Object) = (r1v0 java.lang.Object), (r1v15 java.lang.Object) binds: [B:3:0x0008, B:12:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0Q(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GBM.A0Q(java.lang.Object):boolean");
    }

    public final boolean A0R(Object obj) {
        Object objA01;
        do {
            objA01 = A01(A01.get(this), obj);
            if (objA01 == AbstractC9251GBe.A02) {
                return false;
            }
            if (objA01 == AbstractC9251GBe.A04) {
                return true;
            }
        } while (objA01 == AbstractC9251GBe.A03);
        A0J(objA01);
        return true;
    }

    public boolean A0S(Throwable th) {
        return (th instanceof CancellationException) || (A0Q(th) && A0N());
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        return r4;
     */
    @Override // X.HoC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC10488Hlm A4q(X.GBM r7) {
        /*
            r6 = this;
            X.GBh r4 = new X.GBh
            r4.<init>(r7)
            r4.A00 = r6
        L7:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = X.GBM.A01
            java.lang.Object r3 = r5.get(r6)
            boolean r0 = r3 instanceof X.C9257GBk
            if (r0 == 0) goto L2d
            r2 = r3
            X.GBk r2 = (X.C9257GBk) r2
            boolean r0 = r2.A00
            if (r0 == 0) goto L1f
            boolean r0 = X.AbstractC5217DdT.A00(r6, r3, r4, r5)
            if (r0 == 0) goto L7
        L1e:
            return r4
        L1f:
            X.GC1 r1 = new X.GC1
            r1.<init>()
            X.GBr r0 = new X.GBr
            r0.<init>(r1)
            X.AbstractC5217DdT.A00(r6, r2, r0, r5)
            goto L7
        L2d:
            boolean r0 = r3 instanceof X.InterfaceC9269GBw
            r2 = 0
            if (r0 == 0) goto L73
            r0 = r3
            X.GBw r0 = (X.InterfaceC9269GBw) r0
            X.GC1 r1 = r0.AH7()
            if (r1 != 0) goto L46
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode"
            X.C7384Etj.A0Z(r3, r0)
            X.GBP r3 = (X.GBP) r3
            r6.A09(r3)
            goto L7
        L46:
            r0 = 7
            boolean r0 = r1.A04(r4, r0)
            if (r0 != 0) goto L1e
            r0 = 3
            boolean r3 = r1.A04(r4, r0)
            java.lang.Object r1 = r5.get(r6)
            boolean r0 = r1 instanceof X.GBS
            if (r0 == 0) goto L68
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.GBS.A03
            java.lang.Object r2 = r0.get(r1)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
        L62:
            r4.A06(r2)
            if (r3 == 0) goto L84
            return r4
        L68:
            boolean r0 = r1 instanceof X.C10474Hkl
            if (r0 == 0) goto L62
            X.Hkl r1 = (X.C10474Hkl) r1
            if (r1 == 0) goto L62
            java.lang.Throwable r2 = r1.A00
            goto L62
        L73:
            java.lang.Object r1 = r5.get(r6)
            boolean r0 = r1 instanceof X.C10474Hkl
            if (r0 == 0) goto L81
            X.Hkl r1 = (X.C10474Hkl) r1
            if (r1 == 0) goto L81
            java.lang.Throwable r2 = r1.A00
        L81:
            r4.A06(r2)
        L84:
            X.HsE r0 = X.HsE.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GBM.A4q(X.GBM):X.Hlm");
    }

    @Override // X.HoC
    public void A5w(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(A0F(), null, this);
        }
        A0L(cancellationException);
    }

    @Override // X.HoC
    public final CancellationException ADQ() {
        CancellationException cancellationException;
        CancellationException cancellationException2;
        Object obj = A01.get(this);
        if (obj instanceof GBS) {
            Throwable th = (Throwable) GBS.A03.get(obj);
            if (th != null) {
                return (!(th instanceof CancellationException) || (cancellationException2 = (CancellationException) th) == null) ? new JobCancellationException(FGI.A0M(C3cI.A0Y(this), " is cancelling"), th, this) : cancellationException2;
            }
            throw AbstractC7607F5u.A10(this, "Job is still new or active: ");
        }
        if (obj instanceof InterfaceC9269GBw) {
            throw AbstractC7607F5u.A10(this, "Job is still new or active: ");
        }
        if (!(obj instanceof C10474Hkl)) {
            return new JobCancellationException(FGI.A0M(C3cI.A0Y(this), " has completed normally"), null, this);
        }
        Throwable th2 = ((C10474Hkl) obj).A00;
        return (!(th2 instanceof CancellationException) || (cancellationException = (CancellationException) th2) == null) ? new JobCancellationException(A0F(), th2, this) : cancellationException;
    }

    @Override // X.HoC
    public final C9283GCk AIE() {
        GAg gAg = GAg.A00;
        C0862A6j.A02(gAg, 3);
        return new C9283GCk(this, gAg);
    }

    @Override // X.HoC
    public final HsS AO5(G0U<? super Throwable, Unit> g0u) {
        return A0G(new GAb(g0u), true);
    }

    /* JADX WARN: Incorrect types in method signature: (ZZLX/G0U<-Ljava/lang/Throwable;Lkotlin/Unit;>;)LX/HsS; */
    @Override // X.HoC
    public final HsS AO6(G0U g0u, boolean z, boolean z2) {
        return A0G(z ? new Hm2(g0u) : new GAb(g0u), z2);
    }

    @Override // X.HoC
    public final boolean AOG() {
        return !(A01.get(this) instanceof InterfaceC9269GBw);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    @Override // X.HoC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object APQ(X.HtJ<? super kotlin.Unit> r4) {
        /*
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.GBM.A01
            java.lang.Object r1 = r0.get(r3)
            boolean r0 = r1 instanceof X.InterfaceC9269GBw
            if (r0 != 0) goto L14
            X.78T r0 = r4.getContext()
            X.HzS.A05(r0)
        L11:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L14:
            int r0 = A00(r1, r3)
            if (r0 < 0) goto L0
            java.lang.String r0 = X.GBL.__redex_internal_original_name
            X.HtJ r0 = X.C7Bm.A02(r4)
            r1 = 1
            X.GBL r2 = new X.GBL
            r2.<init>(r1, r0)
            r2.A0I()
            X.GAc r0 = new X.GAc
            r0.<init>(r2)
            X.HsS r1 = X.HzS.A01(r3, r0, r1)
            X.GB8 r0 = new X.GB8
            r0.<init>(r1)
            X.GBO.A01(r0, r2)
            java.lang.Object r1 = r2.A0F()
            X.Hji r0 = X.EnumC10460Hji.A02
            if (r1 == r0) goto L44
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L44:
            if (r1 != r0) goto L11
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GBM.APQ(X.HtJ):java.lang.Object");
    }

    @Override // X.HoC
    public final void Afv() {
        int iA00;
        do {
            iA00 = A00(A01.get(this), this);
            if (iA00 == 0) {
                return;
            }
        } while (iA00 != 1);
    }

    @Override // X.C78X
    public final C78I<?> getKey() {
        return HoC.A00;
    }

    @Override // X.HoC
    public final boolean isActive() {
        Object obj = A01.get(this);
        return (obj instanceof InterfaceC9269GBw) && ((InterfaceC9269GBw) obj).isActive();
    }

    @Override // X.HoC
    public final boolean isCancelled() {
        Object obj = A01.get(this);
        if (obj instanceof C10474Hkl) {
            return true;
        }
        return (obj instanceof GBS) && GBS.A03.get(obj) != null;
    }

    public static final C9254GBh A05(GBT gbt) {
        while (gbt.A03()) {
            GBT gbtA00 = GBT.A00(gbt);
            if (gbtA00 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GBT.A01;
                Object obj = atomicReferenceFieldUpdater.get(gbt);
                while (true) {
                    gbtA00 = (GBT) obj;
                    if (gbtA00.A03()) {
                        obj = atomicReferenceFieldUpdater.get(gbtA00);
                    }
                }
            }
            gbt = gbtA00;
        }
        while (true) {
            gbt = gbt.A02();
            if (!gbt.A03()) {
                if (gbt instanceof C9254GBh) {
                    return (C9254GBh) gbt;
                }
                if (gbt instanceof GC1) {
                    return null;
                }
            }
        }
    }

    private final GC1 A06(InterfaceC9269GBw interfaceC9269GBw) {
        GC1 gc1AH7 = interfaceC9269GBw.AH7();
        if (gc1AH7 != null) {
            return gc1AH7;
        }
        if (interfaceC9269GBw instanceof C9257GBk) {
            return new GC1();
        }
        if (interfaceC9269GBw instanceof GBP) {
            A09((GBP) interfaceC9269GBw);
            return null;
        }
        StringBuilder sb = new StringBuilder("State should have list: ");
        sb.append(interfaceC9269GBw);
        throw new IllegalStateException(sb.toString());
    }

    private final boolean A0B(Throwable th) {
        if (!A0P()) {
            boolean z = th instanceof CancellationException;
            InterfaceC10488Hlm interfaceC10488Hlm = (InterfaceC10488Hlm) A00.get(this);
            if (interfaceC10488Hlm == null || interfaceC10488Hlm == HsE.A00) {
                return z;
            }
            if (!interfaceC10488Hlm.A6D(th) && !z) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C78X, X.C78T
    public final /* bridge */ <E extends C78X> E get(C78I<E> c78i) {
        return (E) C78W.A00(this, c78i);
    }

    @Override // X.C78T
    public final /* bridge */ C78T minusKey(C78I<?> c78i) {
        return C78W.A01(this, c78i);
    }

    @Override // X.C78T
    public final /* bridge */ C78T plus(C78T c78t) {
        return C78W.A02(this, c78t);
    }

    public final String toString() {
        String strA0Y;
        StringBuilder sbA0w = C60O.A0w();
        if (this instanceof GAY) {
            GAY gay = (GAY) this;
            StringBuilder sbA0w2 = C60O.A0w();
            AbstractC7609F5w.A1L(sbA0w2, gay);
            sbA0w2.append("(timeMillis=");
            sbA0w2.append(gay.A00);
            strA0Y = AnonymousClass006.A0z(sbA0w2);
        } else {
            strA0Y = C3cI.A0Y(this);
        }
        sbA0w.append(strA0Y);
        sbA0w.append('{');
        sbA0w.append(A03(A01.get(this)));
        return FGI.A0O(C8j3.A15(sbA0w), BV7.A0x(this), '@');
    }

    public void A0L(Throwable th) {
        A0Q(th);
    }
}
