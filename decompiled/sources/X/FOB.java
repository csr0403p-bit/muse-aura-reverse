package X;

import android.util.ArrayMap;
import androidx.fragment.app.Fragment;
import com.facebook.aura.bloks.common.cds.bottomsheet.AuraRealityLabsCdsBottomSheetFragment;
import java.util.Map;

/* loaded from: classes6.dex */
public final class FOB {
    public C5303Dfm A00;
    public FOA A01;
    public FND A02;
    public final Fragment A03;
    public final Map A04 = new ArrayMap(FND.A00.size());
    public final FOC A05;
    public final C7967FMy A06;

    public static final HxE A00(FOB fob, FND fnd) {
        String str;
        FOD fod = new FOD();
        if (fnd == FND.A02) {
            Fragment fragment = fob.A03;
            if (fragment instanceof AuraRealityLabsCdsBottomSheetFragment) {
                HxE hxEA0r = C3cG.A0r(new FOA((AuraRealityLabsCdsBottomSheetFragment) fragment), fod);
                fob.A04.put(fnd, hxEA0r);
                return hxEA0r;
            }
            str = "The fallback bloks behavior was not used, because the fragment does not implement CDSBloksBottomSheet";
        } else {
            str = "";
        }
        StringBuilder sbA0f = C3cG.A0f(fnd, "There is no corresponding behavior factory for type: ");
        sbA0f.append(".");
        throw C8j3.A0w(str, sbA0f);
    }

    public FOB(Fragment fragment, C7967FMy c7967FMy) {
        this.A03 = fragment;
        this.A06 = c7967FMy;
        FOC foc = new FOC(this);
        this.A05 = foc;
        FOF.A00.A01();
        fragment.mLifecycleRegistry.A04(foc);
    }
}
