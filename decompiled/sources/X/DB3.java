package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class DB3 implements DB6 {
    public G0U<? super String, Unit> A00;

    @Override // X.DB6
    public final String getName() {
        return "OnBackgroundComplete";
    }

    @Override // X.DB6
    public final DBA install(G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, Function0<Unit> function0) {
        this.A00 = g0u;
        return DBC.A00;
    }
}
