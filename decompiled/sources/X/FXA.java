package X;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes6.dex */
public final class FXA extends Drawable.ConstantState {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public ColorStateList A0B;
    public ColorStateList A0C;
    public ColorStateList A0D;
    public ColorStateList A0E;
    public ColorFilter A0F;
    public Paint.Style A0G;
    public PorterDuff.Mode A0H;
    public Rect A0I;
    public FXB A0J;
    public FXK A0K;
    public boolean A0L;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        FX9 fx9 = new FX9(this);
        fx9.A02 = true;
        return fx9;
    }
}
