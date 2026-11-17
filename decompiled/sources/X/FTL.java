package X;

import android.view.View;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.util.List;

/* loaded from: classes6.dex */
public final class FTL {
    public int A00;
    public int A01;
    public int A03;
    public int A04;
    public int A05;
    public int A07;
    public int A08;
    public boolean A0A;
    public boolean A0B = true;
    public int A02 = 0;
    public int A06 = 0;
    public List<FTV> A09 = null;

    public static final void A00(View view, FTL ftl) {
        int iA0E;
        int iA0E2;
        int size = ftl.A09.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                View view3 = ftl.A09.get(i2).A0I;
                FTf fTfA0m = AbstractC7607F5u.A0m(view3);
                if (view3 != view) {
                    FTV ftv = fTfA0m.A00;
                    if (!AnonymousClass002.A1L(ftv.A00 & 8) && (iA0E2 = (AbstractC7609F5w.A0E(ftv) - ftl.A01) * ftl.A03) >= 0 && iA0E2 < i) {
                        view2 = view3;
                        if (iA0E2 == 0) {
                            break;
                        } else {
                            i = iA0E2;
                        }
                    }
                }
                i2++;
            } else if (view2 == null) {
                iA0E = -1;
            }
        }
        iA0E = AbstractC7609F5w.A0E(AbstractC7607F5u.A0m(view2).A00);
        ftl.A01 = iA0E;
    }

    public final View A01(FTR ftr) {
        List<FTV> list = this.A09;
        if (list == null) {
            View view = ftr.A07(this.A01, LinkEncryptedPairingKt.LINK_COUNTER_MAX).A0I;
            this.A01 += this.A03;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = this.A09.get(i).A0I;
            FTV ftv = AbstractC7607F5u.A0m(view2).A00;
            if (!AnonymousClass002.A1L(ftv.A00 & 8) && this.A01 == AbstractC7609F5w.A0E(ftv)) {
                A00(view2, this);
                return view2;
            }
        }
        return null;
    }
}
