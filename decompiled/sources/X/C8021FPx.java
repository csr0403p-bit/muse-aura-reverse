package X;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/* renamed from: X.FPx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8021FPx {
    public static boolean guardUnmeasuredGlobalRect;
    public static boolean skipIteratorCalls;
    public static boolean skipScanWhenRegistryEmpty;
    public static boolean stopWhenActivityDestroyed;
    public HuA A00;
    public FQB A01;
    public final FC1 A03;
    public final LinkedHashMap<Integer, Runnable> A04 = C3cG.A0j();
    public final Hi1 A02 = new Hi1(this);

    public final void A00(View view, C8020FPu<?, ?> c8020FPu) {
        WeakHashMap<View, FQ6> weakHashMap = FQ6.A01;
        FQ6 fq6 = weakHashMap.get(view);
        if (fq6 == null) {
            fq6 = new FQ6(view);
            weakHashMap.put(view, fq6);
        }
        FQB fqb = this.A01;
        if (fqb != null) {
            C8022FPy c8022FPy = fqb.A01;
            synchronized (c8022FPy) {
                c8022FPy.A01.put(fq6, c8020FPu);
            }
        }
    }

    public C8021FPx(HuA huA, FC1 fc1) {
        this.A03 = fc1;
        this.A00 = huA;
    }
}
