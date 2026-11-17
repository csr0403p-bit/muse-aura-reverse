package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.aura.pairs.PairsAnalyticsKt;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.FdN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8406FdN extends AbstractC8146FWk {
    public static final PorterDuff.Mode A08 = PorterDuff.Mode.SRC_IN;
    public C8410FdR A00;
    public ColorFilter A01;
    public PorterDuffColorFilter A02;
    public boolean A03;
    public boolean A04;
    public final Matrix A05;
    public final Rect A06;
    public final float[] A07;

    private final PorterDuffColorFilter A01(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = super.A00;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.A06;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.A01;
        if (colorFilter == null) {
            colorFilter = this.A02;
        }
        Matrix matrix = this.A05;
        canvas.getMatrix(matrix);
        float[] fArr = this.A07;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(2048, (int) (rect.width() * fAbs));
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C8410FdR c8410FdR = this.A00;
        Bitmap bitmap = c8410FdR.A04;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c8410FdR.A04.getHeight()) {
            c8410FdR.A04 = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c8410FdR.A0A = true;
        }
        boolean z = this.A03;
        C8410FdR c8410FdR2 = this.A00;
        if (!z) {
            c8410FdR2.A00(iMin, iMin2);
        } else if (c8410FdR2.A0A || c8410FdR2.A02 != c8410FdR2.A03 || c8410FdR2.A06 != c8410FdR2.A07 || c8410FdR2.A0B != c8410FdR2.A09 || c8410FdR2.A00 != c8410FdR2.A08.A04) {
            c8410FdR2.A00(iMin, iMin2);
            C8410FdR c8410FdR3 = this.A00;
            c8410FdR3.A02 = c8410FdR3.A03;
            c8410FdR3.A06 = c8410FdR3.A07;
            c8410FdR3.A00 = c8410FdR3.A08.A04;
            c8410FdR3.A0B = c8410FdR3.A09;
            c8410FdR3.A0A = false;
        }
        C8410FdR c8410FdR4 = this.A00;
        if (c8410FdR4.A08.A04 < 255 || colorFilter != null) {
            if (c8410FdR4.A05 == null) {
                Paint paintA0T = AbstractC7607F5u.A0T();
                c8410FdR4.A05 = paintA0T;
                paintA0T.setFilterBitmap(true);
            }
            c8410FdR4.A05.setAlpha(c8410FdR4.A08.A04);
            c8410FdR4.A05.setColorFilter(colorFilter);
            paint = c8410FdR4.A05;
        } else {
            paint = null;
        }
        canvas.drawBitmap(c8410FdR4.A04, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = super.A00;
        return drawable != null ? drawable.getAlpha() : this.A00.A08.A04;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = super.A00;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.A00.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = super.A00;
        return drawable != null ? drawable.getColorFilter() : this.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return new FPD(drawable.getConstantState());
        }
        this.A00.A01 = getChangingConfigurations();
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = super.A00;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.A00.A08.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = super.A00;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.A00.A08.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        int i2;
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C8410FdR c8410FdR = this.A00;
        c8410FdR.A08 = new C8408FdP();
        TypedArray typedArrayA01 = HyY.A01(theme, resources, attributeSet, AbstractC8416FdY.A03);
        C8410FdR c8410FdR2 = this.A00;
        C8408FdP c8408FdP = c8410FdR2.A08;
        int i3 = !HyY.A03("tintMode", xmlPullParser) ? -1 : typedArrayA01.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i3 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i3 != 5) {
            if (i3 != 9) {
                switch (i3) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c8410FdR2.A07 = mode;
        ColorStateList colorStateListA00 = HyY.A00(theme, typedArrayA01, xmlPullParser);
        if (colorStateListA00 != null) {
            c8410FdR2.A03 = colorStateListA00;
        }
        boolean z = c8410FdR2.A09;
        if (HyY.A03("autoMirrored", xmlPullParser)) {
            z = typedArrayA01.getBoolean(5, z);
        }
        c8410FdR2.A09 = z;
        c8408FdP.A03 = A00(typedArrayA01, "viewportWidth", xmlPullParser, c8408FdP.A03, 7);
        float fA00 = A00(typedArrayA01, "viewportHeight", xmlPullParser, c8408FdP.A02, 8);
        c8408FdP.A02 = fA00;
        if (c8408FdP.A03 <= 0.0f) {
            throw new XmlPullParserException(FGI.A0M(typedArrayA01.getPositionDescription(), "<vector> tag requires viewportWidth > 0"));
        }
        if (fA00 <= 0.0f) {
            throw new XmlPullParserException(FGI.A0M(typedArrayA01.getPositionDescription(), "<vector> tag requires viewportHeight > 0"));
        }
        c8408FdP.A01 = typedArrayA01.getDimension(3, c8408FdP.A01);
        float dimension = typedArrayA01.getDimension(2, c8408FdP.A00);
        c8408FdP.A00 = dimension;
        if (c8408FdP.A01 <= 0.0f) {
            throw new XmlPullParserException(FGI.A0M(typedArrayA01.getPositionDescription(), "<vector> tag requires width > 0"));
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(FGI.A0M(typedArrayA01.getPositionDescription(), "<vector> tag requires height > 0"));
        }
        c8408FdP.setAlpha(A00(typedArrayA01, "alpha", xmlPullParser, c8408FdP.getAlpha(), 4));
        String string = typedArrayA01.getString(0);
        if (string != null) {
            c8408FdP.A09 = string;
            c8408FdP.A0E.put(string, c8408FdP);
        }
        typedArrayA01.recycle();
        c8410FdR.A01 = getChangingConfigurations();
        c8410FdR.A0A = true;
        C8410FdR c8410FdR3 = this.A00;
        C8408FdP c8408FdP2 = c8410FdR3.A08;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c8408FdP2.A0F);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C8409FdQ c8409FdQ = (C8409FdQ) arrayDeque.peek();
                if (c8409FdQ != null) {
                    if ("path".equals(name)) {
                        C8412FdT c8412FdT = new C8412FdT();
                        TypedArray typedArrayA012 = HyY.A01(theme, resources, attributeSet, AbstractC8416FdY.A02);
                        c8412FdT.A0B = null;
                        if (HyY.A03("pathData", xmlPullParser)) {
                            String string2 = typedArrayA012.getString(0);
                            if (string2 != null) {
                                ((AbstractC8413FdU) c8412FdT).A02 = string2;
                            }
                            String string3 = typedArrayA012.getString(2);
                            if (string3 != null) {
                                ((AbstractC8413FdU) c8412FdT).A03 = A02(string3);
                            }
                            c8412FdT.A09 = HyY.A02(theme, typedArrayA012, "fillColor", xmlPullParser, 1);
                            c8412FdT.A00 = A00(typedArrayA012, "fillAlpha", xmlPullParser, c8412FdT.A00, 12);
                            int i4 = !HyY.A03("strokeLineCap", xmlPullParser) ? -1 : typedArrayA012.getInt(8, -1);
                            Paint.Cap cap = c8412FdT.A07;
                            if (i4 == 0) {
                                cap = Paint.Cap.BUTT;
                            } else if (i4 == 1) {
                                cap = Paint.Cap.ROUND;
                            } else if (i4 == 2) {
                                cap = Paint.Cap.SQUARE;
                            }
                            c8412FdT.A07 = cap;
                            int i5 = !HyY.A03("strokeLineJoin", xmlPullParser) ? -1 : typedArrayA012.getInt(9, -1);
                            Paint.Join join = c8412FdT.A08;
                            if (i5 == 0) {
                                join = Paint.Join.MITER;
                            } else if (i5 == 1) {
                                join = Paint.Join.ROUND;
                            } else if (i5 == 2) {
                                join = Paint.Join.BEVEL;
                            }
                            c8412FdT.A08 = join;
                            c8412FdT.A02 = A00(typedArrayA012, "strokeMiterLimit", xmlPullParser, c8412FdT.A02, 10);
                            c8412FdT.A0A = HyY.A02(theme, typedArrayA012, "strokeColor", xmlPullParser, 3);
                            c8412FdT.A01 = A00(typedArrayA012, "strokeAlpha", xmlPullParser, c8412FdT.A01, 11);
                            c8412FdT.A03 = A00(typedArrayA012, "strokeWidth", xmlPullParser, c8412FdT.A03, 4);
                            c8412FdT.A04 = A00(typedArrayA012, "trimPathEnd", xmlPullParser, c8412FdT.A04, 6);
                            c8412FdT.A05 = A00(typedArrayA012, "trimPathOffset", xmlPullParser, c8412FdT.A05, 7);
                            c8412FdT.A06 = A00(typedArrayA012, "trimPathStart", xmlPullParser, c8412FdT.A06, 5);
                            int i6 = ((AbstractC8413FdU) c8412FdT).A01;
                            if (HyY.A03("fillType", xmlPullParser)) {
                                i6 = typedArrayA012.getInt(13, i6);
                            }
                            ((AbstractC8413FdU) c8412FdT).A01 = i6;
                        }
                        typedArrayA012.recycle();
                        c8409FdQ.A0C.add(c8412FdT);
                        String str = ((AbstractC8413FdU) c8412FdT).A02;
                        if (str != null) {
                            c8408FdP2.A0E.put(str, c8412FdT);
                        }
                        c8410FdR3.A01 = ((AbstractC8413FdU) c8412FdT).A00 | c8410FdR3.A01;
                        z2 = false;
                    } else {
                        if ("clip-path".equals(name)) {
                            C8418Fda c8418Fda = new C8418Fda();
                            if (HyY.A03("pathData", xmlPullParser)) {
                                TypedArray typedArrayA013 = HyY.A01(theme, resources, attributeSet, AbstractC8416FdY.A00);
                                String string4 = typedArrayA013.getString(0);
                                if (string4 != null) {
                                    c8418Fda.A02 = string4;
                                }
                                String string5 = typedArrayA013.getString(1);
                                if (string5 != null) {
                                    c8418Fda.A03 = A02(string5);
                                }
                                c8418Fda.A01 = !HyY.A03("fillType", xmlPullParser) ? 0 : typedArrayA013.getInt(2, 0);
                                typedArrayA013.recycle();
                            }
                            c8409FdQ.A0C.add(c8418Fda);
                            String str2 = c8418Fda.A02;
                            if (str2 != null) {
                                c8408FdP2.A0E.put(str2, c8418Fda);
                            }
                            i = c8410FdR3.A01;
                            i2 = c8418Fda.A00;
                        } else if (PairsAnalyticsKt.CONNECTION_TYPE_GROUP.equals(name)) {
                            C8409FdQ c8409FdQ2 = new C8409FdQ();
                            TypedArray typedArrayA014 = HyY.A01(theme, resources, attributeSet, AbstractC8416FdY.A01);
                            c8409FdQ2.A09 = null;
                            c8409FdQ2.A02 = A00(typedArrayA014, "rotation", xmlPullParser, c8409FdQ2.A02, 5);
                            c8409FdQ2.A00 = typedArrayA014.getFloat(1, c8409FdQ2.A00);
                            c8409FdQ2.A01 = typedArrayA014.getFloat(2, c8409FdQ2.A01);
                            c8409FdQ2.A03 = A00(typedArrayA014, "scaleX", xmlPullParser, c8409FdQ2.A03, 3);
                            c8409FdQ2.A04 = A00(typedArrayA014, "scaleY", xmlPullParser, c8409FdQ2.A04, 4);
                            c8409FdQ2.A05 = A00(typedArrayA014, "translateX", xmlPullParser, c8409FdQ2.A05, 6);
                            c8409FdQ2.A06 = A00(typedArrayA014, "translateY", xmlPullParser, c8409FdQ2.A06, 7);
                            String string6 = typedArrayA014.getString(0);
                            if (string6 != null) {
                                c8409FdQ2.A08 = string6;
                            }
                            C8409FdQ.A00(c8409FdQ2);
                            typedArrayA014.recycle();
                            c8409FdQ.A0C.add(c8409FdQ2);
                            arrayDeque.push(c8409FdQ2);
                            String str3 = c8409FdQ2.A08;
                            if (str3 != null) {
                                c8408FdP2.A0E.put(str3, c8409FdQ2);
                            }
                            i = c8410FdR3.A01;
                            i2 = c8409FdQ2.A07;
                        }
                        c8410FdR3.A01 = i2 | i;
                    }
                }
            } else if (eventType == 3 && PairsAnalyticsKt.CONNECTION_TYPE_GROUP.equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.A02 = A01(c8410FdR.A03, c8410FdR.A07);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = super.A00;
        return drawable != null ? drawable.isAutoMirrored() : this.A00.A09;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C8410FdR c8410FdR = this.A00;
        if (c8410FdR == null) {
            return false;
        }
        C8408FdP c8408FdP = c8410FdR.A08;
        Boolean boolValueOf = c8408FdP.A08;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(c8408FdP.A0F.A01());
            c8408FdP.A08 = boolValueOf;
        }
        if (boolValueOf.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.A00.A03;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.mutate();
        } else if (!this.A04 && super.mutate() == this) {
            C8410FdR c8410FdR = this.A00;
            C8410FdR c8410FdR2 = new C8410FdR();
            c8410FdR2.A03 = null;
            c8410FdR2.A07 = A08;
            if (c8410FdR != null) {
                c8410FdR2.A01 = c8410FdR.A01;
                C8408FdP c8408FdP = new C8408FdP(c8410FdR.A08);
                c8410FdR2.A08 = c8408FdP;
                Paint paint = c8410FdR.A08.A05;
                if (paint != null) {
                    c8408FdP.A05 = new Paint(paint);
                }
                Paint paint2 = c8410FdR.A08.A06;
                if (paint2 != null) {
                    c8410FdR2.A08.A06 = new Paint(paint2);
                }
                c8410FdR2.A03 = c8410FdR.A03;
                c8410FdR2.A07 = c8410FdR.A07;
                c8410FdR2.A09 = c8410FdR.A09;
            }
            this.A00 = c8410FdR2;
            this.A04 = true;
            return this;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C8410FdR c8410FdR = this.A00;
        ColorStateList colorStateList = c8410FdR.A03;
        if (colorStateList == null || (mode = c8410FdR.A07) == null) {
            z = false;
        } else {
            this.A02 = A01(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C8408FdP c8408FdP = c8410FdR.A08;
        Boolean boolValueOf = c8408FdP.A08;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(c8408FdP.A0F.A01());
            c8408FdP.A08 = boolValueOf;
        }
        if (!boolValueOf.booleanValue()) {
            return z;
        }
        boolean zA02 = c8410FdR.A08.A0F.A02(iArr);
        c8410FdR.A0A |= zA02;
        if (!zA02) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setAlpha(i);
            return;
        }
        C8408FdP c8408FdP = this.A00.A08;
        if (c8408FdP.A04 != i) {
            c8408FdP.A04 = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.A00.A09 = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.A01 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        C8410FdR c8410FdR = this.A00;
        if (c8410FdR.A03 != colorStateList) {
            c8410FdR.A03 = colorStateList;
            this.A02 = A01(colorStateList, c8410FdR.A07);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        C8410FdR c8410FdR = this.A00;
        if (c8410FdR.A07 != mode) {
            c8410FdR.A07 = mode;
            this.A02 = A01(c8410FdR.A03, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = super.A00;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public C8406FdN() {
        this.A03 = true;
        this.A07 = new float[9];
        this.A05 = BV4.A08();
        this.A06 = AbstractC7607F5u.A0X();
        this.A00 = new C8410FdR();
    }

    public static float A00(TypedArray typedArray, String str, XmlPullParser xmlPullParser, float f, int i) {
        return !HyY.A03(str, xmlPullParser) ? f : typedArray.getFloat(i, f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0070 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C8411FdS[] A02(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8406FdN.A02(java.lang.String):X.FdS[]");
    }

    public C8406FdN(C8410FdR c8410FdR) {
        this.A03 = true;
        this.A07 = new float[9];
        this.A05 = BV4.A08();
        this.A06 = AbstractC7607F5u.A0X();
        this.A00 = c8410FdR;
        this.A02 = A01(c8410FdR.A03, c8410FdR.A07);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
