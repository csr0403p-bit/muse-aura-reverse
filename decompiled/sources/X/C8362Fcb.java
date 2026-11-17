package X;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Fcb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8362Fcb {
    public final Activity A00;
    public final F0C A01 = C5322DgG.A01((Function0) new Hil(this, 6));

    public ViewGroup A00() {
        return (ViewGroup) this.A01.getValue();
    }

    public void A01() {
        ViewGroup viewGroup;
        View rootView = this.A00.findViewById(R.id.content).getRootView();
        if (!(rootView instanceof ViewGroup) || (viewGroup = (ViewGroup) rootView) == null) {
            return;
        }
        viewGroup.addView((View) this.A01.getValue());
    }

    public C8362Fcb(Activity activity) {
        this.A00 = activity;
    }

    public void A02() {
        ViewGroup viewGroup;
        ViewParent parent = A00().getParent();
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        viewGroup.removeView(A00());
    }
}
