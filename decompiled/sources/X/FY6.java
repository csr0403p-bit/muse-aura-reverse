package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* loaded from: classes6.dex */
public final class FY6 {
    public ColorStateList A00 = null;
    public PorterDuff.Mode A01 = null;
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04;
    public final CheckedTextView A05;

    public final void A00() {
        CheckedTextView checkedTextView = this.A05;
        Drawable checkMarkDrawable = checkedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.A02 || this.A03) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.A02) {
                    drawableMutate.setTintList(this.A00);
                }
                if (this.A03) {
                    drawableMutate.setTintMode(this.A01);
                }
                AbstractC7610F5x.A18(drawableMutate, checkedTextView);
                checkedTextView.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public FY6(CheckedTextView checkedTextView) {
        this.A05 = checkedTextView;
    }
}
