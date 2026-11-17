package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: classes6.dex */
public final class FWV extends FWX {
    public Drawable A00;
    public ColorStateList A01;
    public PorterDuff.Mode A02;
    public boolean A03;
    public boolean A04;
    public final SeekBar A05;

    @Override // X.FWX
    public final void A02(AttributeSet attributeSet, int i) {
        super.A02(attributeSet, i);
        SeekBar seekBar = this.A05;
        Context context = seekBar.getContext();
        int[] iArr = FYT.A06;
        C8140FWd c8140FWdA00 = C8140FWd.A00(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = c8140FWdA00.A02;
        seekBar.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, 0);
        Drawable drawableA03 = c8140FWdA00.A03(0);
        if (drawableA03 != null) {
            seekBar.setThumb(drawableA03);
        }
        Drawable drawableA02 = c8140FWdA00.A02(1);
        AbstractC7609F5w.A16(this.A00);
        this.A00 = drawableA02;
        if (drawableA02 != null) {
            drawableA02.setCallback(seekBar);
            drawableA02.setLayoutDirection(seekBar.getLayoutDirection());
            AbstractC7610F5x.A18(drawableA02, seekBar);
            A00();
        }
        seekBar.invalidate();
        if (typedArray.hasValue(3)) {
            this.A02 = FWU.A00(this.A02, typedArray.getInt(3, -1));
            this.A04 = true;
        }
        if (typedArray.hasValue(2)) {
            this.A01 = c8140FWdA00.A01(2);
            this.A03 = true;
        }
        typedArray.recycle();
        A00();
    }

    private void A00() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            if (this.A03 || this.A04) {
                Drawable drawableMutate = drawable.mutate();
                this.A00 = drawableMutate;
                if (this.A03) {
                    drawableMutate.setTintList(this.A01);
                }
                if (this.A04) {
                    this.A00.setTintMode(this.A02);
                }
                if (this.A00.isStateful()) {
                    this.A00.setState(this.A05.getDrawableState());
                }
            }
        }
    }

    public FWV(SeekBar seekBar) {
        super(seekBar);
        this.A01 = null;
        this.A02 = null;
        this.A03 = false;
        this.A04 = false;
        this.A05 = seekBar;
    }
}
