package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.PopupWindow;

/* loaded from: classes6.dex */
public final class FLU {
    public final PopupWindow A00;

    public FLU(Context context) {
        PopupWindow popupWindow = new PopupWindow(context);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setContentView(new FGE(context));
        popupWindow.setInputMethodMode(1);
        this.A00 = popupWindow;
    }
}
