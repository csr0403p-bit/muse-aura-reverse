package X;

import android.widget.TextView;
import com.meta.maps.fancypins.FancyPinOverlayView;

/* renamed from: X.Ft6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8889Ft6 extends C7438Evz implements G0V {
    public final int $t;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8889Ft6(Object obj, int i) {
        Class cls;
        String str;
        int i2;
        int i3;
        String str2;
        this.$t = i;
        if (i != 0) {
            cls = FancyPinOverlayView.class;
            str = "pinIdAt(FF)Ljava/lang/String;";
            i2 = 0;
            i3 = 2;
            str2 = "pinIdAt";
        } else {
            cls = C10602HyI.class;
            str = "measureTextWidth(Landroid/widget/TextView;Ljava/lang/String;)I";
            i2 = 0;
            i3 = 2;
            str2 = "measureTextWidth";
        }
        super(i3, obj, cls, str2, str, i2);
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$t != 0) {
            return ((FancyPinOverlayView) this.receiver).pinIdAt(AnonymousClass001.A02(obj), AnonymousClass001.A02(obj2));
        }
        TextView textView = (TextView) obj;
        C7384Etj.A0Y(textView, 0);
        textView.setText((String) obj2);
        textView.measure(-2, -2);
        return Integer.valueOf(textView.getMeasuredWidth());
    }
}
