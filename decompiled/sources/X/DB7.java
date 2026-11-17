package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class DB7 implements DB6 {
    public static final DB7 A00 = new DB7();

    @Override // X.DB6
    public final String getName() {
        return "OnPreDraw";
    }

    @Override // X.DB6
    public final DBA install(G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, Function0<Unit> function0) {
        return new DBF(g0u);
    }
}
