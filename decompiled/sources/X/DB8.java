package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class DB8 implements DB6 {
    public static final DB8 A00 = new DB8();

    @Override // X.DB6
    public final String getName() {
        return "OnResume";
    }

    @Override // X.DB6
    public final DBA install(G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, Function0<Unit> function0) {
        return new DB9(g0u);
    }
}
