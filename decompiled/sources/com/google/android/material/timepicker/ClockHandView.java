package com.google.android.material.timepicker;

import X.AbstractC7607F5u;
import X.AnonymousClass002;
import X.C3cG;
import X.FX0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.aura.R;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class ClockHandView extends View {
    public double A00;
    public float A01;
    public int A02;
    public boolean A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final Paint A07;
    public final RectF A08;
    public final List<OnRotateListener> A09;

    public ClockHandView(Context context) {
        this(context, null);
    }

    public static void A00(ClockHandView clockHandView, float f) {
        clockHandView.A01 = f % 360.0f;
        clockHandView.A00 = Math.toRadians(r9 - 90.0f);
        int height = clockHandView.getHeight() / 2;
        float width = clockHandView.getWidth() / 2;
        float f2 = clockHandView.A02;
        double d = clockHandView.A00;
        float fCos = width + (((float) Math.cos(d)) * f2);
        float fSin = height + (f2 * ((float) Math.sin(d)));
        RectF rectF = clockHandView.A08;
        float f3 = clockHandView.A05;
        rectF.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        Iterator<OnRotateListener> it = clockHandView.A09.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException("currentHandRotation");
        }
        clockHandView.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        float width = getWidth() / 2;
        float f = this.A02;
        double d = this.A00;
        float fCos = (f * ((float) Math.cos(d))) + width;
        float f2 = height;
        float fSin = (f * ((float) Math.sin(d))) + f2;
        Paint paint = this.A07;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.A05, paint);
        double d2 = this.A00;
        double dSin = Math.sin(d2);
        double dCos = Math.cos(d2);
        paint.setStrokeWidth(this.A06);
        canvas.drawLine(width, f2, r4 + ((int) (dCos * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(width, f2, this.A04, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A00(this, this.A01);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked != 0) {
            z = (actionMasked == 1 || actionMasked == 2) ? this.A03 : false;
            z2 = false;
        } else {
            this.A03 = false;
            z = false;
            z2 = true;
        }
        boolean z3 = this.A03;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean zA1L = AnonymousClass002.A1L((this.A01 > f ? 1 : (this.A01 == f ? 0 : -1)));
        if (z2) {
            boolean z4 = zA1L;
            this.A03 = z3 | z4;
            return true;
        }
        if (!zA1L) {
        }
        A00(this, f);
        this.A03 = z3 | z4;
        return true;
        if (!z) {
            this.A03 = z3 | z4;
            return true;
        }
        A00(this, f);
        this.A03 = z3 | z4;
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A09 = C3cG.A0h();
        Paint paintA0T = AbstractC7607F5u.A0T();
        this.A07 = paintA0T;
        this.A08 = AbstractC7607F5u.A0Y();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FX0.A03, i, R.style._name_removed__res_0x7f13011b);
        this.A02 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.A05 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.A06 = getResources().getDimensionPixelSize(R.dimen._name_removed__res_0x7f07000e);
        this.A04 = r1.getDimensionPixelSize(R.dimen._name_removed__res_0x7f070004);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paintA0T.setAntiAlias(true);
        paintA0T.setColor(color);
        A00(this, 0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr._name_removed__res_0x7f0403c7);
    }
}
