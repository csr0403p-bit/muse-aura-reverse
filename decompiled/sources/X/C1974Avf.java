package X;

import kotlin.jvm.functions.Function0;

/* renamed from: X.Avf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1974Avf implements InterfaceC2349BUy, InterfaceC2267BNn {
    public final /* synthetic */ Function0 A00;

    @Override // X.InterfaceC2267BNn
    public final /* synthetic */ long AYd() {
        return ((AWx) this.A00.invoke()).A00;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC2267BNn) && (obj instanceof InterfaceC2349BUy)) {
            return C7384Etj.areEqual(this.A00, ((InterfaceC2349BUy) obj).getFunctionDelegate());
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

    public C1974Avf(Function0 function0) {
        this.A00 = function0;
    }
}
