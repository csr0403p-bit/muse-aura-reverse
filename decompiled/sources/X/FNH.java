package X;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class FNH implements InterfaceC8038FQp {
    public final int A00;
    public final int A01;
    public final String A02;
    public final /* synthetic */ AbstractC8571FgQ A03;

    public FNH(AbstractC8571FgQ abstractC8571FgQ, String str, int i, int i2) {
        this.A03 = abstractC8571FgQ;
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.InterfaceC8038FQp
    public final boolean ABs(ArrayList<C8573FgU> arrayList, ArrayList<Boolean> arrayList2) {
        AbstractC8571FgQ abstractC8571FgQ = this.A03;
        Fragment fragment = abstractC8571FgQ.A07;
        if (fragment == null || this.A01 >= 0 || this.A02 != null || !AbstractC8571FgQ.A0Q(fragment.getChildFragmentManager(), -1, 0)) {
            return abstractC8571FgQ.A0x(this.A02, arrayList, arrayList2, this.A01, this.A00);
        }
        return false;
    }
}
