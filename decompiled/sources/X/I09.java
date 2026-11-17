package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;

/* loaded from: classes6.dex */
public final class I09 extends Property {
    public final int $t;

    /* JADX WARN: Illegal instructions before constructor call */
    public I09(int i) {
        Class cls;
        String str;
        this.$t = i;
        switch (i) {
            case 0:
            case 3:
                cls = PointF.class;
                str = "topLeft";
                break;
            case 1:
            case 2:
                cls = PointF.class;
                str = "bottomRight";
                break;
            case 4:
                cls = PointF.class;
                str = AgeCheckFunnelLogging.KEY_POSITION;
                break;
            case 5:
                cls = Float.class;
                str = "translationAlpha";
                break;
            default:
                cls = Rect.class;
                str = "clipBounds";
                break;
        }
        super(cls, str);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        switch (this.$t) {
            case 5:
                Property<View, Rect> property = AbstractC8405FdM.A00;
                return Float.valueOf(((View) obj).getTransitionAlpha());
            case 6:
                return ((View) obj).getClipBounds();
            default:
                return null;
        }
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view;
        int left;
        int top;
        int iRound;
        int iRound2;
        C8423Fdm c8423Fdm;
        switch (this.$t) {
            case 0:
                c8423Fdm = (C8423Fdm) obj;
                PointF pointF = (PointF) obj2;
                int iRound3 = Math.round(pointF.x);
                c8423Fdm.A02 = iRound3;
                int iRound4 = Math.round(pointF.y);
                c8423Fdm.A04 = iRound4;
                int i = c8423Fdm.A05 + 1;
                c8423Fdm.A05 = i;
                if (i == c8423Fdm.A01) {
                    View view2 = c8423Fdm.A06;
                    int i2 = c8423Fdm.A03;
                    int i3 = c8423Fdm.A00;
                    Property<View, Rect> property = AbstractC8405FdM.A00;
                    view2.setLeftTopRightBottom(iRound3, iRound4, i2, i3);
                    c8423Fdm.A05 = 0;
                    c8423Fdm.A01 = 0;
                    break;
                }
                break;
            case 1:
                c8423Fdm = (C8423Fdm) obj;
                PointF pointF2 = (PointF) obj2;
                int iRound5 = Math.round(pointF2.x);
                c8423Fdm.A03 = iRound5;
                int iRound6 = Math.round(pointF2.y);
                c8423Fdm.A00 = iRound6;
                int i4 = c8423Fdm.A01 + 1;
                c8423Fdm.A01 = i4;
                if (c8423Fdm.A05 == i4) {
                    View view3 = c8423Fdm.A06;
                    int i5 = c8423Fdm.A02;
                    int i6 = c8423Fdm.A04;
                    Property<View, Rect> property2 = AbstractC8405FdM.A00;
                    view3.setLeftTopRightBottom(i5, i6, iRound5, iRound6);
                    c8423Fdm.A05 = 0;
                    c8423Fdm.A01 = 0;
                    break;
                }
                break;
            case 2:
                view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                left = view.getLeft();
                top = view.getTop();
                iRound = Math.round(pointF3.x);
                iRound2 = Math.round(pointF3.y);
                Property<View, Rect> property3 = AbstractC8405FdM.A00;
                view.setLeftTopRightBottom(left, top, iRound, iRound2);
                break;
            case 3:
                view = (View) obj;
                PointF pointF4 = (PointF) obj2;
                left = Math.round(pointF4.x);
                top = Math.round(pointF4.y);
                iRound = view.getRight();
                iRound2 = view.getBottom();
                Property<View, Rect> property32 = AbstractC8405FdM.A00;
                view.setLeftTopRightBottom(left, top, iRound, iRound2);
                break;
            case 4:
                view = (View) obj;
                PointF pointF5 = (PointF) obj2;
                left = Math.round(pointF5.x);
                top = Math.round(pointF5.y);
                iRound = view.getWidth() + left;
                iRound2 = view.getHeight() + top;
                Property<View, Rect> property322 = AbstractC8405FdM.A00;
                view.setLeftTopRightBottom(left, top, iRound, iRound2);
                break;
            case 5:
                float fA02 = AnonymousClass001.A02(obj2);
                Property<View, Rect> property4 = AbstractC8405FdM.A00;
                ((View) obj).setTransitionAlpha(fA02);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
