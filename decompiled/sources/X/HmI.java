package X;

import android.view.View;
import java.util.Comparator;

/* loaded from: classes6.dex */
public final class HmI implements Comparator<View> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(View view, View view2) {
        float z = view.getZ();
        float z2 = view2.getZ();
        if (z > z2) {
            return -1;
        }
        return C8j3.A1R((z > z2 ? 1 : (z == z2 ? 0 : -1))) ? 1 : 0;
    }
}
