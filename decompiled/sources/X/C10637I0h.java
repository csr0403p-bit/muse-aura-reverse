package X;

import android.content.res.Configuration;
import android.graphics.Typeface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.Iterator;

/* renamed from: X.I0h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10637I0h implements BeM {
    public final int $t;
    public final Object A00;

    public C10637I0h(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.BeM
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                ((C8166FXi) this.A00).A03((Typeface) obj);
                break;
            case 1:
                ((C8164FXg) this.A00).A00((Typeface) obj);
                break;
            case 2:
                ((C8165FXh) this.A00).A04((Typeface) obj);
                break;
            case 3:
                FragmentActivity.A04((FragmentActivity) this.A00);
                break;
            case 4:
                FragmentActivity.A04((FragmentActivity) this.A00);
                break;
            case 5:
                AbstractC8571FgQ abstractC8571FgQ = (AbstractC8571FgQ) this.A00;
                Configuration configuration = (Configuration) obj;
                if (AbstractC8571FgQ.A0P(abstractC8571FgQ)) {
                    Iterator itA04 = AbstractC8571FgQ.A04(abstractC8571FgQ);
                    while (itA04.hasNext()) {
                        Fragment fragment = (Fragment) itA04.next();
                        if (fragment != null) {
                            fragment.onConfigurationChanged(configuration);
                        }
                    }
                    break;
                }
                break;
            case 6:
                AbstractC8571FgQ abstractC8571FgQ2 = (AbstractC8571FgQ) this.A00;
                Number number = (Number) obj;
                if (AbstractC8571FgQ.A0P(abstractC8571FgQ2) && number.intValue() == 80) {
                    Iterator itA042 = AbstractC8571FgQ.A04(abstractC8571FgQ2);
                    while (itA042.hasNext()) {
                        Fragment fragment2 = (Fragment) itA042.next();
                        if (fragment2 != null) {
                            fragment2.onLowMemory();
                        }
                    }
                    break;
                }
                break;
            case 7:
                AbstractC8571FgQ abstractC8571FgQ3 = (AbstractC8571FgQ) this.A00;
                if (AbstractC8571FgQ.A0P(abstractC8571FgQ3)) {
                    Iterator itA043 = AbstractC8571FgQ.A04(abstractC8571FgQ3);
                    while (itA043.hasNext()) {
                        itA043.next();
                    }
                    break;
                }
                break;
            case 8:
                AbstractC8571FgQ abstractC8571FgQ4 = (AbstractC8571FgQ) this.A00;
                if (AbstractC8571FgQ.A0P(abstractC8571FgQ4)) {
                    Iterator itA044 = AbstractC8571FgQ.A04(abstractC8571FgQ4);
                    while (itA044.hasNext()) {
                        itA044.next();
                    }
                    break;
                }
                break;
            case 9:
                ((GOY) this.A00).A00((GNM) obj);
                break;
            default:
                GO3.A00((GNM) obj, (GO3) this.A00, C3cG.A0h(), C3cG.A0h());
                break;
        }
    }
}
