package X;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public final class FJQ<ContentType> implements FJI {
    public static final FJQ<ContentType> A00 = new FJQ<>();

    @Override // X.FJI
    public final /* bridge */ /* synthetic */ Object A4G(Context context) {
        C7384Etj.A0Y(context, 0);
        try {
            FL4 fl4 = new FL4(context, (AttributeSet) null);
            fl4.setBackgroundResource(R.color.transparent);
            return fl4;
        } catch (NullPointerException e) {
            String message = e.getMessage();
            if (message == null || !C7BY.A0q(message, "ConstantState.newDrawable", false)) {
                throw e;
            }
            View viewInflate = LayoutInflater.from(context).inflate(com.facebook.aura.R.layout._name_removed__res_0x7f0d0145, (ViewGroup) null, false);
            C7384Etj.A0Z(viewInflate, "null cannot be cast to non-null type com.facebook.primitive.textinput.TextInputView");
            return viewInflate;
        }
    }
}
