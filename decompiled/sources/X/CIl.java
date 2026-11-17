package X;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Handler;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.internal.zzbx;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public final class CIl implements CDr {
    public final Context A00;
    public final Handler A01;
    public final C3385CIr A02;
    public final C3385CIr A03;
    public final CJK A04;
    public final Set A05;
    public final Set A06;
    public final Executor A07;
    public final AtomicBoolean A08;
    public final AtomicReference A09;
    public final CIw A0A;
    public final CEQ A0B;
    public final CJ0 A0C;
    public final CJ2 A0D;
    public final File A0E;

    private final CSC A00(int i) {
        C3381CIn c3381CIn;
        synchronized (this) {
            AtomicReference atomicReference = this.A09;
            CJN cjn = (CJN) atomicReference.get();
            if (cjn == null) {
                c3381CIn = null;
            } else {
                C3381CIn c3381CIn2 = (C3381CIn) cjn;
                int i2 = c3381CIn2.A00;
                long j = c3381CIn2.A03;
                long j2 = c3381CIn2.A04;
                List<String> listA01 = cjn.A01();
                List list = c3381CIn2.A07;
                c3381CIn = new C3381CIn(null, listA01, list != null ? BV4.A0t(list) : C3cG.A0h(), null, i2, 6, i, j, j2);
            }
            while (!Bs8.A00(cjn, c3381CIn, atomicReference) && atomicReference.get() == cjn) {
            }
        }
        return CSC.A01(new SplitInstallException(i));
    }

    @Override // X.CDr
    public final CSA<Void> A5y(int i) {
        int i2;
        try {
            synchronized (this) {
                AtomicReference atomicReference = this.A09;
                CJN cjn = (CJN) atomicReference.get();
                if (cjn != null) {
                    try {
                        C3381CIn c3381CIn = (C3381CIn) cjn;
                        if (i == c3381CIn.A00 && ((i2 = c3381CIn.A01) == 1 || i2 == 2 || i2 == 8 || i2 == 9 || i2 == 7)) {
                            int i3 = c3381CIn.A02;
                            long j = c3381CIn.A03;
                            long j2 = c3381CIn.A04;
                            List<String> listA01 = cjn.A01();
                            List list = c3381CIn.A07;
                            C3381CIn c3381CIn2 = new C3381CIn(null, listA01, list != null ? BV4.A0t(list) : C3cG.A0h(), null, i, 7, i3, j, j2);
                            while (true) {
                                if (Bs8.A00(cjn, c3381CIn2, atomicReference)) {
                                    this.A01.post(new RunnableC3388CIu(c3381CIn2, this));
                                    break;
                                }
                                if (atomicReference.get() != cjn) {
                                    break;
                                }
                            }
                            return CSC.A02(null);
                        }
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception e2) {
                        throw new zzbx("TunnelExceptions should always be unwrapped to deal with the checked exception underneath, this message should never be seen if TunnelException is used properly.", e2);
                    }
                }
                throw new SplitInstallException(-3);
            }
        } catch (zzbx e3) {
            return CSC.A01(e3.A01());
        }
    }

    @Override // X.CDr
    public final CSA<Void> A8l(List<String> list) {
        return CSC.A01(new SplitInstallException(-5));
    }

    @Override // X.CDr
    public final CSA<Void> A8m(List<String> list) {
        return CSC.A01(new SplitInstallException(-5));
    }

    public CIl(Context context, CEQ ceq, CJK cjk, File file) {
        if (CIy.A00 == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new Bq2());
            CIy.A00 = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        ThreadPoolExecutor threadPoolExecutor2 = CIy.A00;
        CIw cIw = new CIw(context);
        CJ0 cj0 = CJ0.A00;
        this.A01 = C60O.A02();
        this.A09 = BV4.A15();
        this.A05 = Collections.synchronizedSet(C60O.A13());
        this.A06 = Collections.synchronizedSet(C60O.A13());
        this.A08 = C60O.A1E();
        this.A00 = context;
        this.A0E = file;
        this.A04 = cjk;
        this.A0B = ceq;
        this.A07 = threadPoolExecutor2;
        this.A0A = cIw;
        this.A0C = cj0;
        this.A03 = new C3385CIr();
        this.A02 = new C3385CIr();
        this.A0D = EnumC3387CIt.A02;
    }

    private final C7394EuX A01() throws XmlPullParserException, Resources.NotFoundException, PackageManager.NameNotFoundException, IOException {
        try {
            Context context = this.A00;
            C7394EuX c7394EuXA02 = this.A04.A02(((PackageItemInfo) context.getPackageManager().getPackageInfo(context.getPackageName(), 128).applicationInfo).metaData);
            if (c7394EuXA02 != null) {
                return c7394EuXA02;
            }
            throw C3cG.A0Q("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException("App is not found in PackageManager", e);
        }
    }

    public static final void A02(CIl cIl, Integer num, Long l, Long l2, List list, List list2, int i, int i2) {
        List listA01 = list;
        List listA0t = list2;
        synchronized (cIl) {
            AtomicReference atomicReference = cIl.A09;
            CJN cjn = (CJN) atomicReference.get();
            CJN c3381CIn = cjn == null ? new C3381CIn(null, C3cG.A0h(), C3cG.A0h(), null, 0, 0, 0, 0L, 0L) : cjn;
            int iIntValue = num == null ? ((C3381CIn) c3381CIn).A00 : num.intValue();
            long jLongValue = l == null ? ((C3381CIn) c3381CIn).A03 : l.longValue();
            long jLongValue2 = l2 == null ? ((C3381CIn) c3381CIn).A04 : l2.longValue();
            if (list == null) {
                listA01 = c3381CIn.A01();
            }
            if (list2 == null) {
                List list3 = ((C3381CIn) c3381CIn).A07;
                listA0t = list3 != null ? BV4.A0t(list3) : C3cG.A0h();
            }
            C3381CIn c3381CIn2 = new C3381CIn(null, listA01, listA0t, null, iIntValue, i, i2, jLongValue, jLongValue2);
            while (!Bs8.A00(cjn, c3381CIn2, atomicReference)) {
                if (atomicReference.get() != cjn) {
                    return;
                }
            }
            cIl.A01.post(new RunnableC3388CIu(c3381CIn2, cIl));
        }
    }

    @Override // X.CDr
    public final CSA<List<CJN>> AKW() {
        Object obj = this.A09.get();
        return CSC.A02(obj != null ? Collections.singletonList(obj) : Collections.EMPTY_LIST);
    }

    @Override // X.CDr
    public final void Aa1(InterfaceC3390CIx interfaceC3390CIx) {
        C3385CIr c3385CIr = this.A03;
        synchronized (c3385CIr) {
            c3385CIr.A00.add(interfaceC3390CIx);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024f A[PHI: r0
  0x024f: PHI (r0v36 java.lang.Number) = (r0v30 java.lang.Number), (r0v43 java.lang.Number) binds: [B:82:0x021b, B:80:0x020d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.CDr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.CSA<java.lang.Integer> Ag7(X.CEU r25) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CIl.Ag7(X.CEU):X.CSA");
    }

    @Override // X.CDr
    public final Set<String> AGZ() {
        HashSet hashSetA13 = C60O.A13();
        hashSetA13.addAll(this.A04.A03());
        hashSetA13.addAll(this.A05);
        return hashSetA13;
    }

    @Override // X.CDr
    public final boolean Afx(Activity activity, CJN cjn, int i) {
        return false;
    }
}
