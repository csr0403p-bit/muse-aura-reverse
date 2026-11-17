package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.AgR, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1281AgR {
    public final Function0<AaC> A00;
    public final Hm1<Unit> A01;

    public final String toString() {
        Hm1<Unit> hm1 = this.A01;
        C1282AgS c1282AgS = (C1282AgS) hm1.getContext().get(C1282AgS.A01);
        String str = c1282AgS != null ? c1282AgS.A00 : null;
        StringBuilder sbA0x = C60O.A0x("Request@");
        String string = Integer.toString(hashCode(), 16);
        C7384Etj.A0U(string);
        sbA0x.append(string);
        sbA0x.append(str != null ? FGI.A0U("[", str, "](") : "(");
        sbA0x.append("currentBounds()=");
        sbA0x.append(this.A00.invoke());
        sbA0x.append(", continuation=");
        return AnonymousClass007.A0Z(hm1, sbA0x);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1281AgR(Function0<AaC> function0, Hm1<? super Unit> hm1) {
        this.A00 = function0;
        this.A01 = hm1;
    }
}
