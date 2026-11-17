package X;

import android.view.View;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class Hi2 {
    public View A00;
    public final Map<String, Object> A02 = BV4.A0u();
    public final ArrayList<AbstractC8429Fds> A01 = C3cG.A0h();

    public final boolean equals(Object obj) {
        if (obj instanceof Hi2) {
            Hi2 hi2 = (Hi2) obj;
            if (this.A00 == hi2.A00 && this.A02.equals(hi2.A02)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A00) + this.A02.hashCode();
    }

    public final String toString() {
        StringBuilder sbA0g = C3cG.A0g(FGI.A0U("TransitionValues@", Integer.toHexString(hashCode()), ":\n"));
        sbA0g.append("    view = ");
        sbA0g.append(this.A00);
        String strA0M = FGI.A0M(AnonymousClass001.A0v(PairsDiscretionDocument.TERMINATOR, sbA0g), "    values:");
        Map<String, Object> map = this.A02;
        Iterator itA11 = BV5.A11(map);
        while (itA11.hasNext()) {
            String strA0j = AnonymousClass005.A0j(itA11);
            StringBuilder sbA0g2 = C3cG.A0g(strA0M);
            sbA0g2.append("    ");
            sbA0g2.append(strA0j);
            sbA0g2.append(": ");
            sbA0g2.append(map.get(strA0j));
            strA0M = AnonymousClass001.A0v(PairsDiscretionDocument.TERMINATOR, sbA0g2);
        }
        return strA0M;
    }

    @Deprecated
    public Hi2() {
    }

    public Hi2(View view) {
        this.A00 = view;
    }
}
