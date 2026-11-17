package androidx.appcompat.widget;

import X.FTI;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes6.dex */
public class FitWindowsFrameLayout extends FrameLayout {
    public FTI A00;

    public void setOnFitSystemWindowsListener(FTI fti) {
        this.A00 = fti;
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
