package X;

import X.InterfaceC7751FDd;
import java.util.List;

/* loaded from: classes6.dex */
public final class FCW<T extends InterfaceC7751FDd<?>, State> {
    public final T A00;
    public final State A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FCW) {
                FCW fcw = (FCW) obj;
                if (!C7384Etj.areEqual(this.A00, fcw.A00) || !C7384Etj.areEqual(this.A01, fcw.A01) || !C7384Etj.areEqual(this.A02, fcw.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass006.A0D(this.A00) * 31) + AnonymousClass006.A0D(this.A01)) * 31) + C3cH.A02(this.A02);
    }

    public final String toString() {
        T t = this.A00;
        State state = this.A01;
        List list = this.A02;
        StringBuilder sbA0f = C3cG.A0f(t, "ResolveResult(resolvedNode=");
        sbA0f.append(", resolvedState=");
        sbA0f.append(state);
        return C3cJ.A0L(list, ", appliedStateUpdates=", sbA0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FCW(InterfaceC7751FDd interfaceC7751FDd, Object obj, List list) {
        this.A00 = interfaceC7751FDd;
        this.A01 = obj;
        this.A02 = list;
    }
}
