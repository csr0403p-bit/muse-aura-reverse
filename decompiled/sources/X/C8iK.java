package X;

import java.util.Collections;
import kotlin.Unit;

/* renamed from: X.8iK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8iK implements Ht9, G0U {
    public final int $t;
    public final String A00;

    public C8iK(String str, int i) {
        this.$t = i;
        this.A00 = str;
    }

    @Override // X.G0U
    public final Object invoke(Object obj) {
        if (this.$t == 0) {
            ((C060973i) ((InterfaceC061373m) obj)).A00.put(AbstractC061473n.A00, Collections.singletonList(this.A00));
            return Unit.INSTANCE;
        }
        String str = this.A00;
        String str2 = (String) obj;
        C7384Etj.A0Y(str2, 1);
        return C7BY.A0j(str2) ? str2.length() >= str.length() ? str2 : str : FGI.A0M(str, str2);
    }
}
