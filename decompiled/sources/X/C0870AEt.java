package X;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.AEt, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0870AEt {
    public final C0860A6h A00;
    public final Map<String, AutoCloseable> A01;
    public final Set<AutoCloseable> A02;
    public volatile boolean A03;

    public static final void A00(AutoCloseable autoCloseable) throws Exception {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final void A01(AutoCloseable autoCloseable) {
        if (this.A03) {
            A00(autoCloseable);
            return;
        }
        synchronized (this.A00) {
            this.A02.add(autoCloseable);
        }
    }

    public final void A02(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseablePut;
        if (this.A03) {
            A00(autoCloseable);
            return;
        }
        synchronized (this.A00) {
            autoCloseablePut = this.A01.put(str, autoCloseable);
        }
        A00(autoCloseablePut);
    }

    public C0870AEt(C3UX c3ux) {
        this.A00 = new C0860A6h();
        this.A01 = C3cG.A0j();
        this.A02 = C3cG.A0k();
        A02("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", new BLL(c3ux.AEA()));
    }

    public C0870AEt(C3UX c3ux, AutoCloseable... autoCloseableArr) {
        C7384Etj.A0Y(autoCloseableArr, 1);
        this.A00 = new C0860A6h();
        this.A01 = C3cG.A0j();
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        this.A02 = linkedHashSetA0k;
        A02("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", new BLL(c3ux.AEA()));
        linkedHashSetA0k.addAll(Arrays.asList(autoCloseableArr));
    }

    public C0870AEt(AutoCloseable... autoCloseableArr) {
        C7384Etj.A0Y(autoCloseableArr, 0);
        this.A00 = new C0860A6h();
        this.A01 = C3cG.A0j();
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        this.A02 = linkedHashSetA0k;
        linkedHashSetA0k.addAll(Arrays.asList(autoCloseableArr));
    }

    public C0870AEt() {
        this.A00 = new C0860A6h();
        this.A01 = new LinkedHashMap();
        this.A02 = new LinkedHashSet();
    }
}
