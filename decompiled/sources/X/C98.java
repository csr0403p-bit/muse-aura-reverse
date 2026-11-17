package X;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes5.dex */
public final class C98 {
    public static AbstractC3225C4i A00;
    public static Executor A01;
    public static List<C9E> A02;
    public static final AbstractC3225C4i A03;

    static {
        C99 c99 = new C99();
        A03 = c99;
        A00 = c99;
        A01 = Executors.newSingleThreadExecutor();
        A02 = C3cG.A0h();
    }

    public static synchronized void A00(final AbstractC3225C4i abstractC3225C4i) {
        if (A00 != abstractC3225C4i) {
            A00 = abstractC3225C4i;
            List<C9E> list = A02;
            for (final C9E c9e : list) {
                A01.execute(new Runnable() { // from class: X.C9C
                    public static final String __redex_internal_original_name = "GlobalPropertiesCreator$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C9E c9e2 = c9e;
                        AbstractC3225C4i abstractC3225C4i2 = abstractC3225C4i;
                        AbstractC3225C4i abstractC3225C4i3 = C98.A00;
                        c9e2.AVp(abstractC3225C4i2);
                    }
                });
            }
            list.clear();
        }
    }

    public static synchronized void A01(final C9E c9e) {
        final AbstractC3225C4i abstractC3225C4i = A00;
        if (abstractC3225C4i != A03) {
            A01.execute(new Runnable() { // from class: X.C9D
                public static final String __redex_internal_original_name = "GlobalPropertiesCreator$$ExternalSyntheticLambda1";

                @Override // java.lang.Runnable
                public final void run() {
                    C9E c9e2 = c9e;
                    AbstractC3225C4i abstractC3225C4i2 = abstractC3225C4i;
                    AbstractC3225C4i abstractC3225C4i3 = C98.A00;
                    c9e2.AVp(abstractC3225C4i2);
                }
            });
        } else {
            List<C9E> list = A02;
            if (list.size() == 150) {
                CFK.A06("Lacrima", "Too many callbacks before setInstance is called, skipping");
            }
            if (list.size() <= 150) {
                list.add(c9e);
            }
        }
    }
}
