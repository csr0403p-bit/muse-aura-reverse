package X;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AFy implements AFx {
    public final Function0<Unit> A00;
    public final /* synthetic */ AFx A01;

    @Override // X.AFx
    public final boolean A5t(Object obj) {
        return this.A01.A5t(obj);
    }

    @Override // X.AFx
    public final Object A71(String str) {
        return this.A01.A71(str);
    }

    @Override // X.AFx
    public final Map<String, List<Object>> AXs() {
        return this.A01.AXs();
    }

    @Override // X.AFx
    public final AG2 Aa3(String str, Function0<? extends Object> function0) {
        return this.A01.Aa3(str, function0);
    }

    public AFy(AFx aFx, Function0<Unit> function0) {
        this.A01 = aFx;
        this.A00 = function0;
    }
}
