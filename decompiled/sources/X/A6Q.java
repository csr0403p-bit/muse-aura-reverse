package X;

import android.os.Bundle;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class A6Q {
    public Bundle A00;
    public boolean A01;
    public boolean A03;
    public final A6I A04;
    public final Function0<Unit> A07;
    public final A6S A05 = new A6S();
    public final Map<String, A6F> A06 = C3cG.A0j();
    public boolean A02 = true;

    public A6Q(A6I a6i, Function0<Unit> function0) {
        this.A04 = a6i;
        this.A07 = function0;
    }

    public final void A00() {
        A6I a6i = this.A04;
        if (C8j3.A0m(a6i) != EnumC10573Huf.A04) {
            throw C3cG.A0Q("Restarter must be created only during owner's initialization stage");
        }
        if (this.A01) {
            throw C3cG.A0Q("SavedStateRegistry was already attached.");
        }
        this.A07.invoke();
        a6i.getLifecycle().A04(new C2290BSq(this, 2));
        this.A01 = true;
    }
}
