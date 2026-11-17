package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;

/* renamed from: X.FXf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8163FXf {
    public Typeface A02;
    public C8142FWg A03;
    public C8142FWg A04;
    public C8142FWg A05;
    public C8142FWg A06;
    public C8142FWg A07;
    public C8142FWg A08;
    public C8142FWg A09;
    public boolean A0B;
    public final TextView A0C;
    public final C8181FXx A0D;
    public int A01 = 0;
    public int A00 = -1;
    public String A0A = null;

    public static C8142FWg A02(Context context, C8139FWc c8139FWc, int i) {
        ColorStateList colorStateListA02;
        synchronized (c8139FWc) {
            colorStateListA02 = c8139FWc.A00.A02(context, i);
        }
        if (colorStateListA02 == null) {
            return null;
        }
        C8142FWg c8142FWg = new C8142FWg();
        c8142FWg.A02 = true;
        c8142FWg.A00 = colorStateListA02;
        return c8142FWg;
    }

    public static ColorStateList A00(C8163FXf c8163FXf) {
        C8142FWg c8142FWg = c8163FXf.A08;
        if (c8142FWg != null) {
            return c8142FWg.A00;
        }
        return null;
    }

    public static PorterDuff.Mode A01(C8163FXf c8163FXf) {
        C8142FWg c8142FWg = c8163FXf.A08;
        if (c8142FWg != null) {
            return c8142FWg.A01;
        }
        return null;
    }

    private void A03(Drawable drawable, C8142FWg c8142FWg) {
        if (drawable == null || c8142FWg == null) {
            return;
        }
        C8137FWa.A01(drawable, c8142FWg, this.A0C.getDrawableState());
    }

    public static final void A04(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        AqT.A00(editorInfo, textView.getText());
    }

    private void A05(boolean z) {
        Typeface typeface = this.A02;
        if (typeface != null) {
            int i = this.A00;
            TextView textView = this.A0C;
            if (i == -1) {
                textView.setTypeface(typeface, this.A01);
            } else {
                textView.setTypeface(typeface);
            }
        } else if (z) {
            this.A0C.setTypeface(null);
        }
        String str = this.A0A;
        if (str != null) {
            AbstractC8086FSr.A00(this.A0C, str);
        }
    }

    private boolean A06(Context context, C8140FWd c8140FWd) {
        String string;
        Typeface typefaceCreate;
        Typeface typefaceA01;
        Typeface typeface;
        int i = this.A01;
        TypedArray typedArray = c8140FWd.A02;
        this.A01 = typedArray.getInt(2, i);
        int i2 = typedArray.getInt(11, -1);
        this.A00 = i2;
        if (i2 != -1) {
            this.A01 &= 2;
        }
        if (typedArray.hasValue(13)) {
            this.A0A = typedArray.getString(13);
        }
        if (typedArray.hasValue(10) || typedArray.hasValue(12)) {
            this.A02 = null;
            int i3 = typedArray.hasValue(12) ? 12 : 10;
            int i4 = this.A00;
            int i5 = this.A01;
            if (!context.isRestricted()) {
                FY7 fy7 = new FY7(this, BV4.A0q(this.A0C), i4, i5);
                try {
                    int i6 = this.A01;
                    int resourceId = typedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        TypedValue typedValueA0Z = c8140FWd.A00;
                        if (typedValueA0Z == null) {
                            typedValueA0Z = AbstractC7607F5u.A0Z();
                            c8140FWd.A00 = typedValueA0Z;
                        }
                        Context context2 = c8140FWd.A01;
                        if (!context2.isRestricted() && (typefaceA01 = CMG.A01(context2, typedValueA0Z, fy7, resourceId, i6, true, false)) != null) {
                            if (this.A00 != -1) {
                                typefaceA01 = Typeface.create(Typeface.create(typefaceA01, 0), this.A00, AnonymousClass002.A1L(this.A01 & 2));
                            }
                            this.A02 = typefaceA01;
                        }
                    }
                    this.A0B = AnonymousClass002.A1Y(this.A02);
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.A02 == null && (string = typedArray.getString(i3)) != null) {
                if (this.A00 != -1) {
                    typefaceCreate = Typeface.create(Typeface.create(string, 0), this.A00, (this.A01 & 2) != 0);
                } else {
                    typefaceCreate = Typeface.create(string, this.A01);
                }
                this.A02 = typefaceCreate;
            }
        } else {
            if (typedArray.hasValue(1)) {
                this.A0B = false;
                int i7 = typedArray.getInt(1, 1);
                if (i7 == 1) {
                    typefaceCreate = Typeface.SANS_SERIF;
                } else if (i7 == 2) {
                    typefaceCreate = Typeface.SERIF;
                } else if (i7 == 3) {
                    typefaceCreate = Typeface.MONOSPACE;
                }
            } else {
                int i8 = this.A00;
                if (i8 == -1 || (typeface = this.A02) == null) {
                    return false;
                }
                typefaceCreate = Typeface.create(typeface, i8, (this.A01 & 2) != 0);
            }
            this.A02 = typefaceCreate;
        }
        return true;
    }

    public final void A07() {
        if (this.A05 != null || this.A09 != null || this.A06 != null || this.A03 != null) {
            Drawable[] compoundDrawables = this.A0C.getCompoundDrawables();
            A03(compoundDrawables[0], this.A05);
            A03(compoundDrawables[1], this.A09);
            A03(compoundDrawables[2], this.A06);
            A03(compoundDrawables[3], this.A03);
        }
        if (this.A07 == null && this.A04 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.A0C.getCompoundDrawablesRelative();
        A03(compoundDrawablesRelative[0], this.A07);
        A03(compoundDrawablesRelative[2], this.A04);
    }

    public final void A08(Context context, int i) {
        C8140FWd c8140FWd = new C8140FWd(context, context.obtainStyledAttributes(i, FYT.A0L));
        TypedArray typedArray = c8140FWd.A02;
        if (typedArray.hasValue(14)) {
            this.A0C.setAllCaps(typedArray.getBoolean(14, false));
        }
        if (typedArray.hasValue(0) && typedArray.getDimensionPixelSize(0, -1) == 0) {
            this.A0C.setTextSize(0, 0.0f);
        }
        boolean zA06 = A06(context, c8140FWd);
        typedArray.recycle();
        A05(zA06);
    }

    public final void A09(ColorStateList colorStateList) {
        C8142FWg c8142FWg = this.A08;
        if (c8142FWg == null) {
            c8142FWg = new C8142FWg();
            this.A08 = c8142FWg;
        }
        c8142FWg.A00 = colorStateList;
        c8142FWg.A02 = AnonymousClass002.A1X(colorStateList);
        this.A05 = c8142FWg;
        this.A09 = c8142FWg;
        this.A06 = c8142FWg;
        this.A03 = c8142FWg;
        this.A07 = c8142FWg;
        this.A04 = c8142FWg;
    }

    public final void A0A(PorterDuff.Mode mode) {
        C8142FWg c8142FWg = this.A08;
        if (c8142FWg == null) {
            c8142FWg = new C8142FWg();
            this.A08 = c8142FWg;
        }
        c8142FWg.A01 = mode;
        c8142FWg.A03 = AnonymousClass002.A1X(mode);
        this.A05 = c8142FWg;
        this.A09 = c8142FWg;
        this.A06 = c8142FWg;
        this.A03 = c8142FWg;
        this.A07 = c8142FWg;
        this.A04 = c8142FWg;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B(android.util.AttributeSet r29, int r30) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1074
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8163FXf.A0B(android.util.AttributeSet, int):void");
    }

    public C8163FXf(TextView textView) {
        this.A0C = textView;
        this.A0D = new C8181FXx(textView);
    }
}
