package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: X.FdR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8410FdR extends Drawable.ConstantState {
    public int A00;
    public int A01;
    public ColorStateList A02;
    public Bitmap A04;
    public Paint A05;
    public PorterDuff.Mode A06;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public ColorStateList A03 = null;
    public PorterDuff.Mode A07 = C8406FdN.A08;
    public C8408FdP A08 = new C8408FdP();

    public final void A00(int i, int i2) {
        this.A04.eraseColor(0);
        Canvas canvas = new Canvas(this.A04);
        C8408FdP c8408FdP = this.A08;
        C8408FdP.A00(canvas, C8408FdP.A0G, c8408FdP.A0F, c8408FdP, i, i2);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.A01;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C8406FdN(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C8406FdN(this);
    }
}
