package X;

import android.widget.RemoteViews;
import com.facebook.aura.R;
import java.util.Map;

/* renamed from: X.75a, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C75a {
    public static final int A00(RemoteViews remoteViews, C75P c75p, Integer num, int i, int i2) {
        int iIntValue;
        if (i == -1) {
            throw C60O.A0i("viewStubId must not be View.NO_ID");
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            int iIncrementAndGet = c75p.A0C.incrementAndGet();
            Map<C061673p, C064275z> map = AbstractC062575d.A05;
            if (iIncrementAndGet >= 500) {
                throw C3cG.A0Q("There are too many views");
            }
            iIntValue = R.id.glance_view_id_000 + iIncrementAndGet;
        }
        if (iIntValue != -1) {
            remoteViews.setInt(i, "setInflatedId", iIntValue);
        }
        if (i2 != 0) {
            remoteViews.setInt(i, "setLayoutResource", i2);
        }
        remoteViews.setViewVisibility(i, 0);
        return iIntValue;
    }
}
