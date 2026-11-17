package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Fgu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8593Fgu {
    public boolean A00;
    public final Object A01;
    public final Function0<Unit> A02;
    public final Runnable A03;
    public final List<Function0<Unit>> A04;
    public final Executor A05;

    public C8593Fgu(Executor executor, Function0<Unit> function0) {
        C7384Etj.A0Y(executor, 0);
        this.A05 = executor;
        this.A02 = function0;
        this.A01 = C3cG.A0T();
        this.A04 = C3cG.A0h();
        this.A03 = new Runnable() { // from class: X.Fh9
            public static final String __redex_internal_original_name = "FullyDrawnReporter$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                C8593Fgu c8593Fgu = this.A00;
                synchronized (c8593Fgu.A01) {
                    if (!c8593Fgu.A00) {
                        c8593Fgu.A02.invoke();
                        c8593Fgu.A00();
                    }
                }
            }
        };
    }

    public final void A00() {
        synchronized (this.A01) {
            this.A00 = true;
            List<Function0<Unit>> list = this.A04;
            Iterator<Function0<Unit>> it = list.iterator();
            while (it.hasNext()) {
                it.next().invoke();
            }
            list.clear();
        }
    }
}
