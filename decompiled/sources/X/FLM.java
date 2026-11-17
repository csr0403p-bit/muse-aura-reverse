package X;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* loaded from: classes6.dex */
public abstract class FLM {
    public static final void A00(Drawable drawable, TextView textView) {
        if (textView.getTextCursorDrawable() != drawable) {
            textView.setTextCursorDrawable(drawable);
        }
    }
}
