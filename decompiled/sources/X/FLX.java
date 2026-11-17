package X;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewParent;
import android.view.autofill.AutofillManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class FLX {
    public static final FLX A00 = new FLX();

    public static final void A01(View view) {
        view.setAutofillHints(null);
        view.setImportantForAutofill(0);
    }

    public static final void A00(Context context, View view, String str) {
        if ("none".equals(str)) {
            view.setImportantForAutofill(2);
            return;
        }
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            view.setAutofillId(autofillManager.getNextAutofillId());
        }
        view.setImportantForAutofill(1);
        view.setAutofillHints(str);
        ((Handler) AbstractC8162FXe.A01.getValue()).post(new FLY(view));
    }

    public static final void A02(View view) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof RecyclerView) {
                ((View) parent).setImportantForAutofill(1);
            }
        }
    }

    public final void A04(Context context, View view, String str) {
        if (view.isAttachedToWindow()) {
            return;
        }
        A00(context, view, str);
    }
}
