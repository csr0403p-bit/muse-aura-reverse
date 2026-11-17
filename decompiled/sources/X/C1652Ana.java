package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Ana, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1652Ana implements InterfaceC1482Ajp {
    public static final C1652Ana A00 = new C1652Ana();

    @Override // X.InterfaceC1482Ajp
    public final Object AB1(long j, final Function0<Unit> function0) {
        Runnable runnable = new Runnable() { // from class: X.Anc
            public static final String __redex_internal_original_name = "Actual_androidKt$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                function0.invoke();
            }
        };
        AbstractC1653Anb.A00.postDelayed(runnable, j);
        return runnable;
    }

    @Override // X.InterfaceC1482Ajp
    public final void Aan(Object obj) {
        Runnable runnable;
        if (!(obj instanceof Runnable) || (runnable = (Runnable) obj) == null) {
            return;
        }
        AbstractC1653Anb.A00.removeCallbacks(runnable);
    }
}
