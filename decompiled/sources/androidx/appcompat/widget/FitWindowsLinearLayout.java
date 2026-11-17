package androidx.appcompat.widget;

import X.FTI;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes6.dex */
public class FitWindowsLinearLayout extends LinearLayout {
    public FTI A00;

    public void setOnFitSystemWindowsListener(FTI fti) {
        this.A00 = fti;
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
