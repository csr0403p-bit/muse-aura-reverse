package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import java.util.Map;

/* renamed from: X.Fdl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8422Fdl extends AbstractC8429Fds {
    public static final String[] A05 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property<C8423Fdm, PointF> A04 = new I09(0);
    public static final Property<C8423Fdm, PointF> A01 = new I09(1);
    public static final Property<View, PointF> A00 = new I09(2);
    public static final Property<View, PointF> A03 = new I09(3);
    public static final Property<View, PointF> A02 = new I09(4);

    public static void A00(Hi2 hi2) {
        View view = hi2.A00;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        Map<String, Object> map = hi2.A02;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }
}
