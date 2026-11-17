package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public abstract class CR9 extends CRN implements ListenableFuture {
    public static final CRF A00;
    public static final boolean A03;
    public volatile Object a;
    public volatile CRJ b;
    public volatile CRG c;
    public static final Object A02 = C3cG.A0T();
    public static final CPc A01 = new CPc(CR8.class);

    private final void A04(CRG crg) {
        crg.a = null;
        while (true) {
            CRG crg2 = this.c;
            if (crg2 != CRG.A00) {
                CRG crg3 = null;
                while (crg2 != null) {
                    CRG crg4 = crg2.b;
                    if (crg2.a != null) {
                        crg3 = crg2;
                    } else if (crg3 != null) {
                        crg3.b = crg4;
                        if (crg3.a == null) {
                            break;
                        }
                    } else if (!A00.A04(crg2, crg4, this)) {
                        break;
                    }
                    crg2 = crg4;
                }
                return;
            }
            return;
        }
    }

    static {
        boolean zA1N;
        CRF cre;
        try {
            zA1N = BV5.A1N();
        } catch (SecurityException unused) {
            zA1N = false;
        }
        A03 = zA1N;
        String property = System.getProperty("java.runtime.name", "");
        Throwable e = null;
        if (property == null || property.contains("Android")) {
            try {
                cre = new CRA();
            } catch (Error | Exception e2) {
                e = e2;
                try {
                    cre = new CRC();
                } catch (Error | Exception e3) {
                    e = e3;
                    cre = new CRE();
                }
            }
        } else {
            try {
                cre = new CRC();
            } catch (NoClassDefFoundError unused2) {
                cre = new CRE();
            }
        }
        e = null;
        A00 = cre;
        if (e != null) {
            CPc cPc = A01;
            Logger loggerA00 = cPc.A00();
            Level level = Level.SEVERE;
            loggerA00.log(level, "UnsafeAtomicHelper is broken!", e);
            cPc.A00().log(level, "AtomicReferenceFieldUpdaterAtomicHelper is broken!", e);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if (!(AnonymousClass002.A1X(obj) & (!(obj instanceof CRD)))) {
            CRG crg = this.c;
            CRG crg2 = CRG.A00;
            if (crg != crg2) {
                CRG crg3 = new CRG();
                do {
                    CRF crf = A00;
                    crf.A01(crg3, crg);
                    if (crf.A04(crg, crg3, this)) {
                        do {
                            LockSupport.park(this);
                            if (Thread.interrupted()) {
                                A04(crg3);
                                throw new InterruptedException();
                            }
                            obj = this.a;
                        } while (!(AnonymousClass002.A1X(obj) & (!(obj instanceof CRD))));
                    } else {
                        crg = this.c;
                    }
                } while (crg != crg2);
                obj = this.a;
                obj.getClass();
            } else {
                obj = this.a;
                obj.getClass();
            }
        }
        return CR8.A01(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0107  */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(long r14, java.util.concurrent.TimeUnit r16) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CR9.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
