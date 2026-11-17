package X;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class BLA implements InterfaceC2349BUy, C1DN {
    public final /* synthetic */ Function0 A00;

    @Override // X.C1DN
    public final /* synthetic */ long AO0() {
        return ((B6A) this.A00.invoke()).A00;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C1DN) && (obj instanceof InterfaceC2349BUy)) {
            return this.A00.equals(((InterfaceC2349BUy) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC2349BUy
    public final Ht9<?> getFunctionDelegate() {
        return this.A00;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public BLA(Function0 function0) {
        this.A00 = function0;
    }
}
