package X;

import android.view.View;
import com.facebook.aura.R;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class BDV {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void A01(View view) {
        C7384Etj.A0Y(view, 0);
        BOZ bozA0C = BL3.A0C(new C2321BTv(view, null, 4, 42));
        while (bozA0C.hasNext()) {
            ArrayList<BDY> arrayList = A00((View) bozA0C.next()).A00;
            for (int iA0E = AnonymousClass002.A0E(arrayList); -1 < iA0E; iA0E--) {
                ((BDX) arrayList.get(iA0E)).A00.A0C();
            }
        }
    }

    public static final BDW A00(View view) {
        BDW bdw = (BDW) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (bdw != null) {
            return bdw;
        }
        BDW bdw2 = new BDW();
        view.setTag(R.id.pooling_container_listener_holder_tag, bdw2);
        return bdw2;
    }
}
