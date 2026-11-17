package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.dsp.core.ColorData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FOV extends FrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public ValueAnimator A04;
    public ViewPropertyAnimator A05;
    public FrameLayout A06;
    public ImageView A07;
    public C7998FOr A08;
    public C7983FOa A09;
    public FOY A0A;
    public boolean A0B;
    public float[] A0C;
    public int A0D;
    public Path A0E;
    public final float A0F;
    public final FOl A0G;
    public final ColorData A0H;
    public final ColorData A0I;
    public final EnumC7951FMh A0J;
    public final InterfaceC10557Hsn A0K;
    public final Function0<Unit> A0L;
    public final boolean A0M;
    public final float[] A0N;

    public static final void A02(Context context, FOV fov) {
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        AbstractC7609F5w.A1S(fArr, 0.0f);
        fov.A0C = fArr;
        EnumC7953FMj enumC7953FMj = fov.A0A.A0B;
        float f = enumC7953FMj.layoutTopMargin;
        float f2 = enumC7953FMj.headerTopMargin;
        fov.A01 = (int) HsH.A00(context, f);
        fov.A0G.A00 = (int) HsH.A00(context, f2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C7384Etj.A0Y(canvas, 0);
        Path path = this.A0E;
        if (path != null) {
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
    }

    public static final void A00(Context context, FOV fov) {
        int i;
        InterfaceC10557Hsn interfaceC10557Hsn = fov.A0K;
        FOY foy = fov.A0A;
        Function0<Unit> function0 = fov.A0L;
        AnonymousClass003.A0x(interfaceC10557Hsn, foy);
        Float f = foy.A0O;
        float fFloatValue = ((f != null ? f.floatValue() : 0.0f) / C60Q.A0B(context).density) + 6.0f;
        boolean zAOJ = interfaceC10557Hsn.AOJ();
        Integer numValueOf = null;
        ColorData colorData = foy.A09;
        if (zAOJ) {
            if (colorData != null) {
                i = colorData.A00;
                numValueOf = Integer.valueOf(i);
            }
        } else if (colorData != null) {
            i = colorData.A01;
            numValueOf = Integer.valueOf(i);
        }
        C7983FOa c7983FOa = new C7983FOa(context, interfaceC10557Hsn, numValueOf, function0, fFloatValue);
        fov.addView(c7983FOa, new FrameLayout.LayoutParams((int) HsH.A00(context, 36.0f + 12.0f), (int) HsH.A00(context, 4.0f + 12.0f)));
        fov.A09 = c7983FOa;
        c7983FOa.setX((AbstractC7607F5u.A02(fov) / 2.0f) - (c7983FOa.A01 / 2));
        c7983FOa.setY(c7983FOa.A00);
    }

    public static final void A01(Context context, FOV fov) {
        fov.A0C = fov.A0N;
        FOY foy = fov.A0A;
        fov.A0B = !(foy.A0L != null ? r0.booleanValue() : foy.A02());
        EnumC7953FMj enumC7953FMj = foy.A0B;
        float f = enumC7953FMj.layoutTopMargin;
        float f2 = enumC7953FMj.headerTopMargin;
        fov.A01 = (int) HsH.A00(context, f);
        fov.A0G.A00 = (int) HsH.A00(context, f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.FOV r7) {
        /*
            X.FMh r1 = r7.A0J
            X.FMh r0 = X.EnumC7951FMh.A05
            r6 = 0
            if (r1 != r0) goto L27
            android.content.Context r0 = r7.getContext()
            X.C7384Etj.A0U(r0)
            X.Hsn r1 = r7.A0K
            r0 = 1
            X.C7384Etj.A0Y(r1, r0)
            boolean r1 = r1.AOJ()
            if (r1 == 0) goto L24
            X.FP5 r0 = X.FP5.A0S
        L1c:
            int r5 = X.FP4.A00(r0, r1)
        L20:
            r7.setSolidBackgroundColor(r5)
            return
        L24:
            X.FP5 r0 = X.FP5.A02
            goto L1c
        L27:
            com.facebook.dsp.core.ColorData r1 = r7.A0H
            X.Hsn r0 = r7.A0K
            int r5 = X.InterfaceC10557Hsn.A00(r1, r0)
            boolean r0 = r7.A0M
            if (r0 == 0) goto L79
            X.FOY r0 = r7.A0A
            boolean r0 = r0.A0X
            if (r0 != 0) goto L79
            X.FOr r0 = r7.A08
            int r4 = r7.indexOfChild(r0)
            X.FOr r0 = r7.A08
            r7.removeView(r0)
            X.FOr r0 = r7.A08
            if (r0 == 0) goto L4c
            int r6 = r0.getVisibility()
        L4c:
            android.content.Context r3 = X.AbstractC7608F5v.A0E(r7)
            float[] r2 = r7.A0C
            if (r2 != 0) goto L5e
            java.lang.String r0 = "cornerRadii"
            X.C7384Etj.A0b(r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L5e:
            float r1 = r7.A0F
            X.FOr r0 = new X.FOr
            r0.<init>(r3, r2, r1, r5)
            r7.A08 = r0
            r0 = -1
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r0, r0)
            X.FOr r0 = r7.A08
            if (r0 == 0) goto L74
            r0.setVisibility(r6)
        L74:
            X.FOr r0 = r7.A08
            r7.addView(r0, r4, r1)
        L79:
            X.FOY r0 = r7.A0A
            com.facebook.dsp.core.ColorData r4 = r0.A0A
            if (r4 == 0) goto L20
            java.lang.Integer r0 = r0.A0P
            android.content.Context r3 = X.AbstractC7608F5v.A0E(r7)
            r2 = 0
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r2) goto L9a
            if (r1 == r0) goto L9d
            r0 = 2
            if (r1 != r0) goto La0
            int r1 = X.C60P.A00(r3)
            r0 = 32
            if (r1 != r0) goto L9d
        L9a:
            int r5 = r4.A00
            goto L20
        L9d:
            int r5 = r4.A01
            goto L20
        La0:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FOV.A03(X.FOV):void");
    }

    private final void setSolidBackgroundColor(int i) {
        this.A0D = i;
        C7985FOc c7985FOc = new C7985FOc();
        Paint paint = c7985FOc.A01;
        if (i != paint.getColor()) {
            paint.setColor(i);
            c7985FOc.invalidateSelf();
        }
        float[] fArr = this.A0C;
        if (fArr == null) {
            C7384Etj.A0b("cornerRadii");
            throw F60.createAndThrow();
        }
        float f = fArr[0];
        float f2 = fArr[2];
        float f3 = fArr[4];
        float f4 = fArr[6];
        float[] fArr2 = c7985FOc.A04;
        fArr2[0] = f;
        int i2 = 1;
        fArr2[1] = f;
        fArr2[2] = f2;
        fArr2[3] = f2;
        fArr2[4] = f3;
        fArr2[5] = f3;
        fArr2[6] = f4;
        fArr2[7] = f4;
        c7985FOc.A00 = true;
        int length = fArr2.length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            float f5 = fArr2[i2];
            if (Float.compare(f, f5) != 0) {
                c7985FOc.A00 = false;
                Path path = c7985FOc.A02;
                path.reset();
                path.addRoundRect(c7985FOc.A03, fArr2, Path.Direction.CW);
                break;
            }
            i2++;
            f = f5;
        }
        c7985FOc.invalidateSelf();
        setBackground(c7985FOc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r1.A0X == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getWindowBackgroundColor() {
        /*
            r2 = this;
            X.FOr r0 = r2.A08
            if (r0 == 0) goto L16
            X.FPW r0 = X.FP4.A00
            boolean r0 = r0.supportXMDSThreeBackground()
            if (r0 == 0) goto L19
            X.FOY r1 = r2.A0A
            boolean r0 = r1.A0S
            if (r0 != 0) goto L19
            boolean r0 = r1.A0X
            if (r0 != 0) goto L19
        L16:
            int r0 = r2.A0D
        L18:
            return r0
        L19:
            X.Hsn r1 = r2.A0K
            r0 = 0
            X.C7384Etj.A0Y(r1, r0)
            boolean r1 = r1.AOJ()
            r0 = -1313795(0xffffffffffebf3fd, float:NaN)
            if (r1 == 0) goto L18
            r0 = -15851474(0xffffffffff0e202e, float:-1.8891746E38)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FOV.getWindowBackgroundColor():int");
    }

    public final void setCustomBackgroundDrawable(Drawable drawable) {
        View view;
        if (drawable == null) {
            C7998FOr c7998FOr = this.A08;
            if (c7998FOr != null) {
                c7998FOr.setVisibility(0);
            }
            ImageView imageView = this.A07;
            if (imageView != null) {
                imageView.setImageDrawable(null);
            }
            view = this.A07;
        } else {
            ImageView imageView2 = this.A07;
            if (imageView2 != null) {
                imageView2.setImageDrawable(drawable);
            }
            ImageView imageView3 = this.A07;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
            }
            view = this.A08;
        }
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;LX/Hsn;LX/FOl;LX/FOY;[FFLcom/facebook/dsp/core/ColorData;Lcom/facebook/dsp/core/ColorData;ZLkotlin/jvm/functions/Function0<Lkotlin/Unit;>;)V */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FOV(android.content.Context r7, X.FOl r8, com.facebook.dsp.core.ColorData r9, com.facebook.dsp.core.ColorData r10, X.FOY r11, X.InterfaceC10557Hsn r12, kotlin.jvm.functions.Function0 r13, float[] r14, float r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FOV.<init>(android.content.Context, X.FOl, com.facebook.dsp.core.ColorData, com.facebook.dsp.core.ColorData, X.FOY, X.Hsn, kotlin.jvm.functions.Function0, float[], float, boolean):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPropertyAnimator viewPropertyAnimator = this.A05;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.A05 = null;
        ValueAnimator valueAnimator = this.A04;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.A04 = null;
        this.A08 = null;
        this.A09 = null;
        ImageView imageView = this.A07;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        this.A07 = null;
        FrameLayout frameLayout = this.A06;
        if (frameLayout != null) {
            frameLayout.setForeground(null);
        }
        this.A06 = null;
        this.A0E = null;
        setForeground(null);
        setBackground(null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), this.A0A.A0J.AMr() ? Integer.MIN_VALUE : 1073741824));
        FOl fOl = this.A0G;
        int measuredWidth = fOl.getMeasuredWidth();
        int measuredHeight = fOl.getMeasuredHeight() + this.A01;
        C7998FOr c7998FOr = this.A08;
        if (c7998FOr != null) {
            c7998FOr.A00(measuredWidth, measuredHeight);
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.A0A.A0B != EnumC7953FMj.A05) {
            Path pathA0V = this.A0E;
            if (pathA0V == null) {
                pathA0V = AbstractC7607F5u.A0V();
            }
            pathA0V.reset();
            RectF rectF = new RectF(0.0f, 0.0f, i, i2);
            float[] fArr = this.A0C;
            if (fArr == null) {
                C7384Etj.A0b("cornerRadii");
                throw F60.createAndThrow();
            }
            pathA0V.addRoundRect(rectF, fArr, Path.Direction.CW);
            this.A0E = pathA0V;
        }
        C7983FOa c7983FOa = this.A09;
        if (c7983FOa != null) {
            c7983FOa.setX((AbstractC7607F5u.A02(this) / 2.0f) - (c7983FOa.A01 / 2));
            c7983FOa.setY(c7983FOa.A00);
        }
    }
}
