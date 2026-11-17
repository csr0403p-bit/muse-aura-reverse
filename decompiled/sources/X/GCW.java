package X;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes6.dex */
public final class GCW implements GCR {
    public Object A00 = AbstractC9276GCd.A0D;
    public GBL<? super Boolean> A01;
    public final /* synthetic */ GCV<E> A02;

    public GCW(GCV gcv) {
        this.A02 = gcv;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [E, java.lang.Object] */
    public final E A00() throws Throwable {
        ?? r1 = this.A00;
        HrH hrH = AbstractC9276GCd.A0D;
        if (r1 == hrH) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.A00 = hrH;
        if (r1 != AbstractC9276GCd.A04) {
            return r1;
        }
        Throwable thA04 = GCV.A04(this.A02);
        StackTraceElement stackTraceElement = Hl6.A00;
        throw thA04;
    }

    public final Object A01(HtJ<? super Boolean> htJ) throws Throwable {
        GCY gcyA06;
        boolean z;
        Object obj;
        GCW gcw = this;
        Object obj2 = gcw.A00;
        boolean z2 = true;
        if (obj2 == AbstractC9276GCd.A0D || obj2 == AbstractC9276GCd.A04) {
            GCV<E> gcv = gcw.A02;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GCV.A0A;
            GCY gcy = (GCY) atomicReferenceFieldUpdater.get(gcv);
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = GCV.A06;
                if (GCV.A0G(gcv, atomicLongFieldUpdater.get(gcv), true)) {
                    gcw.A00 = AbstractC9276GCd.A04;
                    Throwable th = (Throwable) GCV.A07.get(gcv);
                    if (th != null) {
                        StackTraceElement stackTraceElement = Hl6.A00;
                        throw th;
                    }
                    z2 = false;
                } else {
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = GCV.A05;
                    long andIncrement = atomicLongFieldUpdater2.getAndIncrement(gcv);
                    long j = AbstractC9276GCd.A01;
                    long j2 = andIncrement / j;
                    int i = (int) (andIncrement % j);
                    if (((GCK) gcy).A00 != j2) {
                        gcyA06 = GCV.A06(gcv, gcy, j2);
                        if (gcyA06 == null) {
                            continue;
                        }
                    } else {
                        gcyA06 = gcy;
                    }
                    C8942Fty c8942Fty = null;
                    Object objA01 = GCV.A01(null, gcv, gcyA06, i, andIncrement);
                    HrH hrH = AbstractC9276GCd.A0H;
                    if (objA01 == hrH) {
                        throw new IllegalStateException("unreachable");
                    }
                    HrH hrH2 = AbstractC9276GCd.A08;
                    if (objA01 == hrH2) {
                        if (andIncrement < gcv.A0H()) {
                            gcyA06.A01();
                        }
                        gcy = gcyA06;
                    } else {
                        HrH hrH3 = AbstractC9276GCd.A0I;
                        if (objA01 == hrH3) {
                            GBL<? super Boolean> gblA00 = GBO.A00(C7Bm.A02(htJ));
                            try {
                                gcw.A01 = gblA00;
                                Object objA012 = GCV.A01(gcw, gcv, gcyA06, i, andIncrement);
                                if (objA012 == hrH) {
                                    gcw.AO3(gcyA06, i);
                                } else if (objA012 == hrH2) {
                                    if (andIncrement < gcv.A0H()) {
                                        gcyA06.A01();
                                    }
                                    GCY gcy2 = (GCY) atomicReferenceFieldUpdater.get(gcv);
                                    while (true) {
                                        if (GCV.A0G(gcv, atomicLongFieldUpdater.get(gcv), true)) {
                                            GBL<? super Boolean> gbl = gcw.A01;
                                            C7384Etj.A0X(gbl);
                                            gcw.A01 = null;
                                            gcw.A00 = AbstractC9276GCd.A04;
                                            Throwable th2 = (Throwable) GCV.A07.get(gcv);
                                            gbl.resumeWith(th2 == null ? false : new C10571Hud(th2));
                                        } else {
                                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(gcv);
                                            long j3 = andIncrement2 / j;
                                            i = (int) (andIncrement2 % j);
                                            if (((GCK) gcy2).A00 != j3) {
                                                gcyA06 = GCV.A06(gcv, gcy2, j3);
                                                if (gcyA06 == null) {
                                                }
                                            } else {
                                                gcyA06 = gcy2;
                                            }
                                            objA012 = GCV.A01(gcw, gcv, gcyA06, i, andIncrement2);
                                            if (objA012 == hrH) {
                                                if (!(gcw instanceof GCR)) {
                                                    gcw = null;
                                                }
                                                if (gcw != null) {
                                                }
                                            } else if (objA012 == hrH2) {
                                                if (andIncrement2 < gcv.A0H()) {
                                                    gcyA06.A01();
                                                }
                                                gcy2 = gcyA06;
                                            } else {
                                                if (objA012 == hrH3) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                gcyA06.A01();
                                                gcw.A00 = objA012;
                                                gcw.A01 = null;
                                                z = true;
                                                obj = gcv.A00;
                                                if (obj != null) {
                                                }
                                            }
                                        }
                                    }
                                    gblA00.Abe(z, c8942Fty);
                                } else {
                                    gcyA06.A01();
                                    gcw.A00 = objA012;
                                    gcw.A01 = null;
                                    z = true;
                                    obj = gcv.A00;
                                    if (obj != null) {
                                        c8942Fty = new C8942Fty(0, objA012, obj);
                                    }
                                    gblA00.Abe(z, c8942Fty);
                                }
                                return gblA00.A0F();
                            } catch (Throwable th3) {
                                gblA00.A0J();
                                throw th3;
                            }
                        }
                        gcyA06.A01();
                        gcw.A00 = objA01;
                    }
                }
            }
        }
        return Boolean.valueOf(z2);
    }

    @Override // X.GCR
    public final void AO3(GCK<?> gck, int i) {
        GBL<? super Boolean> gbl = this.A01;
        if (gbl != null) {
            gbl.AO3(gck, i);
        }
    }
}
