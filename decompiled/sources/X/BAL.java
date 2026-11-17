package X;

import android.R;
import android.view.View;
import android.view.Window;

/* loaded from: classes4.dex */
public abstract class BAL implements BAG {
    public final void A00(Window window) {
        View viewFindViewById = window.findViewById(R.id.statusBarBackground);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(4);
        }
    }
}
