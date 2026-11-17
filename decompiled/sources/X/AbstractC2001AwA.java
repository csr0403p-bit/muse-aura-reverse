package X;

import android.graphics.RectF;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;

/* renamed from: X.AwA, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2001AwA {
    /* JADX WARN: Incorrect types in method signature: (LX/Aw8;Landroid/graphics/RectF;ILX/G0V<-Landroid/graphics/RectF;-Landroid/graphics/RectF;Ljava/lang/Boolean;>;)[I */
    public static final int[] A01(RectF rectF, C1999Aw8 c1999Aw8, final G0V g0v, int i) {
        Layout layout = c1999Aw8.A09;
        CharSequence text = layout.getText();
        return layout.getRangeForRect(rectF, i == 1 ? Ay1.A00(new C2016AwU(c1999Aw8.A08(), text)) : new GraphemeClusterSegmentFinder(text, c1999Aw8.A0A), new Layout.TextInclusionStrategy() { // from class: X.Axz
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return AbstractC2001AwA.A00(rectF2, rectF3, g0v);
            }
        });
    }

    public static final boolean A00(RectF rectF, RectF rectF2, G0V g0v) {
        return AnonymousClass001.A1X(g0v.invoke(rectF, rectF2));
    }
}
