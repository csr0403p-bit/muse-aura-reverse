package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: classes6.dex */
public final class FXK {
    public FXF A00;
    public FXF A01;
    public FXF A02;
    public FXF A03;
    public FXN A04;
    public FXN A05;
    public FXN A06;
    public FXN A07;
    public FZU A08;
    public FZU A09;
    public FZU A0A;
    public FZU A0B;

    public static FXL A02(Context context, AttributeSet attributeSet, int i, int i2) {
        C8149FWn c8149FWn = new C8149FWn(0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FX0.A0D, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return A03(context, c8149FWn, resourceId, resourceId2);
    }

    public static FXN A01(int i) {
        return i != 0 ? i != 1 ? new FYE() : new FXJ() : new FYE();
    }

    public static FXL A03(Context context, FXF fxf, int i, int i2) throws Resources.NotFoundException {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, FX0.A0I);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            FXF fxfA00 = A00(typedArrayObtainStyledAttributes, fxf, 5);
            FXF fxfA002 = A00(typedArrayObtainStyledAttributes, fxfA00, 8);
            FXF fxfA003 = A00(typedArrayObtainStyledAttributes, fxfA00, 9);
            FXF fxfA004 = A00(typedArrayObtainStyledAttributes, fxfA00, 7);
            FXF fxfA005 = A00(typedArrayObtainStyledAttributes, fxfA00, 6);
            FXL fxl = new FXL();
            fxl.A06 = A01(i4);
            fxl.A02 = fxfA002;
            fxl.A07 = A01(i5);
            fxl.A03 = fxfA003;
            fxl.A05 = A01(i6);
            fxl.A01 = fxfA004;
            fxl.A04 = A01(i7);
            fxl.A00 = fxfA005;
            return fxl;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A04(android.graphics.RectF r7) {
        /*
            r6 = this;
            X.FZU r0 = r6.A09
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<X.FZU> r1 = X.FZU.class
            boolean r0 = r0.equals(r1)
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L35
            X.FZU r0 = r6.A0A
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            X.FZU r0 = r6.A0B
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            X.FZU r0 = r6.A08
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.equals(r1)
            r3 = 1
            if (r0 != 0) goto L36
        L35:
            r3 = 0
        L36:
            X.FXF r0 = r6.A02
            float r1 = r0.AE9(r7)
            X.FXF r0 = r6.A03
            float r0 = r0.AE9(r7)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L5b
            X.FXF r0 = r6.A00
            float r0 = r0.AE9(r7)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L5b
            X.FXF r0 = r6.A01
            float r0 = r0.AE9(r7)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 1
            if (r0 == 0) goto L5c
        L5b:
            r2 = 0
        L5c:
            X.FXN r0 = r6.A07
            boolean r0 = r0 instanceof X.FYE
            if (r0 == 0) goto L75
            X.FXN r0 = r6.A06
            boolean r0 = r0 instanceof X.FYE
            if (r0 == 0) goto L75
            X.FXN r0 = r6.A05
            boolean r0 = r0 instanceof X.FYE
            if (r0 == 0) goto L75
            X.FXN r0 = r6.A04
            boolean r1 = r0 instanceof X.FYE
            r0 = 1
            if (r1 != 0) goto L76
        L75:
            r0 = 0
        L76:
            if (r3 == 0) goto L7d
            if (r2 == 0) goto L7d
            if (r0 == 0) goto L7d
            return r5
        L7d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FXK.A04(android.graphics.RectF):boolean");
    }

    public FXK() {
        this.A06 = new FYE();
        this.A07 = new FYE();
        this.A05 = new FYE();
        this.A04 = new FYE();
        this.A02 = new C8149FWn(0.0f);
        this.A03 = new C8149FWn(0.0f);
        this.A01 = new C8149FWn(0.0f);
        this.A00 = new C8149FWn(0.0f);
        this.A0B = new FZU();
        this.A0A = new FZU();
        this.A08 = new FZU();
        this.A09 = new FZU();
    }

    public static FXF A00(TypedArray typedArray, FXF fxf, int i) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return fxf;
        }
        int i2 = typedValuePeekValue.type;
        return i2 == 5 ? new C8149FWn(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new FXM(typedValuePeekValue.getFraction(1.0f, 1.0f)) : fxf;
    }

    public FXK(FXL fxl) {
        this.A06 = fxl.A06;
        this.A07 = fxl.A07;
        this.A05 = fxl.A05;
        this.A04 = fxl.A04;
        this.A02 = fxl.A02;
        this.A03 = fxl.A03;
        this.A01 = fxl.A01;
        this.A00 = fxl.A00;
        this.A0B = fxl.A0B;
        this.A0A = fxl.A0A;
        this.A08 = fxl.A08;
        this.A09 = fxl.A09;
    }
}
