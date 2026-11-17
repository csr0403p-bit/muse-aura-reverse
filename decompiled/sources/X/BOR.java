package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class BOR implements G0U<View, Iterator<? extends View>> {
    public static final BOR A00 = new BOR();

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Iterator<? extends View> invoke(View view) {
        ViewGroup viewGroup;
        View view2 = view;
        if (!(view2 instanceof ViewGroup) || (viewGroup = (ViewGroup) view2) == null) {
            return null;
        }
        return new BT4(viewGroup);
    }
}
