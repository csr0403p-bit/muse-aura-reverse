package androidx.appcompat.widget;

import X.C8165FXh;
import X.FYT;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import java.util.concurrent.ExecutionException;

/* loaded from: classes6.dex */
public class DialogTitle extends C8165FXh {
    @Override // X.C8165FXh, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) throws ExecutionException, InterruptedException {
        int lineCount;
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout == null || (lineCount = layout.getLineCount()) <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0) {
            return;
        }
        setSingleLine(false);
        setMaxLines(2);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, FYT.A0L, R.attr.textAppearanceMedium, R.style.TextAppearance.Medium);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
        super.onMeasure(i, i2);
    }

    public DialogTitle(Context context) {
        super(context);
    }

    public DialogTitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DialogTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.textViewStyle);
    }
}
