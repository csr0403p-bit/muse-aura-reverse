package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* loaded from: classes6.dex */
public final class HiC {
    public static final HiC A00 = new HiC();

    public static final Activity A00(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return A00(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static final List<Fragment> A02(Activity activity) {
        if (!(activity instanceof FragmentActivity)) {
            return null;
        }
        AbstractC8571FgQ abstractC8571FgQA00 = AbstractC8330Fbx.A00((FragmentActivity) activity);
        C7384Etj.A0U(abstractC8571FgQA00);
        return abstractC8571FgQA00.A0U.A03();
    }

    public static final Object A01(HiC hiC, Class cls, List list) {
        int iA00 = C60O.A00(list);
        if (iA00 < 0) {
            return null;
        }
        while (true) {
            int i = iA00 - 1;
            Fragment fragment = (Fragment) list.get(iA00);
            if (cls.isInstance(fragment)) {
                return cls.cast(fragment);
            }
            if (fragment.isAdded()) {
                List<Fragment> listA03 = fragment.getChildFragmentManager().A0U.A03();
                C7384Etj.A0U(listA03);
                Object objA01 = A01(hiC, cls, listA03);
                if (objA01 != null) {
                    return objA01;
                }
            }
            if (i < 0) {
                return null;
            }
            iA00 = i;
        }
    }
}
