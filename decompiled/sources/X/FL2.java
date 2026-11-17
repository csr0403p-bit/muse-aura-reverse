package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.bloks.lexer.ParsingException;
import org.maplibre.android.R;

/* loaded from: classes6.dex */
public final class FL2 implements InterfaceC7618F6u {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public View A0B;
    public FL3 A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;

    @Override // X.InterfaceC7618F6u
    public final boolean Acn(FBB fbb, Object obj, int i) {
        C7384Etj.A0Y(obj, 2);
        if (i == 35) {
            Float fA00 = AbstractC10446Hic.A00(fbb, obj, "scale_x");
            if (fA00 == null) {
                return true;
            }
            float fFloatValue = fA00.floatValue();
            this.A07 = fFloatValue;
            View view = this.A0B;
            if (view == null) {
                return true;
            }
            view.setScaleX(fFloatValue);
            return true;
        }
        if (i == 36) {
            Float fA002 = AbstractC10446Hic.A00(fbb, obj, "scale_y");
            if (fA002 == null) {
                return true;
            }
            float fFloatValue2 = fA002.floatValue();
            this.A08 = fFloatValue2;
            View view2 = this.A0B;
            if (view2 == null) {
                return true;
            }
            view2.setScaleY(fFloatValue2);
            return true;
        }
        if (i == 38) {
            try {
                String str = (String) obj;
                this.A09 = str != null ? HiY.A01(str) : 0.0f;
                C7384Etj.A0Y(str, 0);
                this.A0H = AbstractC7607F5u.A1X(str);
            } catch (ParsingException e) {
                FFI.A01(fbb, "Could not parse translation_x value. ", e);
            }
            View view3 = this.A0B;
            if (view3 == null) {
                return true;
            }
            float fA02 = AbstractC7607F5u.A02(view3);
            float f = this.A09;
            view3.setTranslationX(AbstractC7609F5w.A02(f, fA02, f, this.A0H ? 1 : 0));
            return true;
        }
        if (i == 138) {
            Float fA003 = AbstractC10446Hic.A00(fbb, obj, "rotation");
            if (fA003 == null) {
                return true;
            }
            float fFloatValue3 = fA003.floatValue();
            this.A04 = fFloatValue3;
            View view4 = this.A0B;
            if (view4 == null) {
                return true;
            }
            view4.setRotation(fFloatValue3);
            return true;
        }
        if (i == 141) {
            Float fA004 = AbstractC10446Hic.A00(fbb, obj, "alpha");
            if (fA004 == null) {
                return true;
            }
            float fFloatValue4 = fA004.floatValue();
            this.A00 = fFloatValue4;
            View view5 = this.A0B;
            if (view5 == null) {
                return true;
            }
            view5.setAlpha(fFloatValue4);
            return true;
        }
        switch (i) {
            case 40:
                try {
                    String str2 = (String) obj;
                    this.A0A = str2 != null ? HiY.A01(str2) : 0.0f;
                    C7384Etj.A0Y(str2, 0);
                    this.A0I = AbstractC7607F5u.A1X(str2);
                } catch (ParsingException e2) {
                    FFI.A01(fbb, "Could not parse translation_y value. ", e2);
                }
                View view6 = this.A0B;
                if (view6 != null) {
                    float fA03 = AbstractC7607F5u.A03(view6);
                    float f2 = this.A0A;
                    view6.setTranslationY(AbstractC7609F5w.A02(f2, fA03, f2, this.A0I ? 1 : 0));
                    break;
                }
                break;
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                try {
                    String str3 = (String) obj;
                    this.A02 = HiY.A01(str3);
                    C7384Etj.A0Y(str3, 0);
                    this.A0F = AbstractC7607F5u.A1X(str3);
                    this.A0E = true;
                } catch (ParsingException e3) {
                    FFI.A01(fbb, "Could not parse pivot_x value. ", e3);
                }
                View view7 = this.A0B;
                if (view7 != null) {
                    float fA022 = AbstractC7607F5u.A02(view7);
                    float f3 = this.A02;
                    view7.setPivotX(AbstractC7609F5w.A02(f3, fA022, f3, this.A0F ? 1 : 0));
                    break;
                }
                break;
            case 42:
                try {
                    String str4 = (String) obj;
                    this.A03 = HiY.A01(str4);
                    C7384Etj.A0Y(str4, 0);
                    this.A0G = AbstractC7607F5u.A1X(str4);
                    this.A0E = true;
                } catch (ParsingException e4) {
                    FFI.A01(fbb, "Could not parse pivot_y value. ", e4);
                }
                View view8 = this.A0B;
                if (view8 != null) {
                    float fA032 = AbstractC7607F5u.A03(view8);
                    float f4 = this.A03;
                    view8.setPivotY(AbstractC7609F5w.A02(f4, fA032, f4, this.A0G ? 1 : 0));
                    break;
                }
                break;
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                Float fA005 = AbstractC10446Hic.A00(fbb, obj, "camera_distance");
                if (fA005 != null) {
                    this.A01 = fA005.floatValue();
                    View view9 = this.A0B;
                    if (view9 != null) {
                        Context contextA0E = AbstractC7608F5v.A0E(view9);
                        float f5 = this.A01;
                        if (f5 == 0.0f) {
                            f5 = 2.14748365E9f;
                        }
                        float f6 = C60Q.A0B(contextA0E).density;
                        view9.setCameraDistance(f6 * f6 * (-f5) * AbstractC10446Hic.A00);
                        break;
                    }
                }
                break;
            case 44:
                Float fA006 = AbstractC10446Hic.A00(fbb, obj, "rotation_x");
                if (fA006 != null) {
                    float fFloatValue5 = fA006.floatValue();
                    this.A05 = fFloatValue5;
                    View view10 = this.A0B;
                    if (view10 != null) {
                        view10.setRotationX(fFloatValue5);
                        break;
                    }
                }
                break;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                Float fA007 = AbstractC10446Hic.A00(fbb, obj, "rotation_y");
                if (fA007 != null) {
                    float fFloatValue6 = fA007.floatValue();
                    this.A06 = fFloatValue6;
                    View view11 = this.A0B;
                    if (view11 != null) {
                        view11.setRotationY(fFloatValue6);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.FDW r9) {
        /*
            r8 = this;
            r0 = 141(0x8d, float:1.98E-43)
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = r9.A06(r0, r3)
            r8.A00 = r0
            r5 = 0
            r0 = 38
            r6 = 0
            r7 = 1
            r1 = 0
            java.lang.String r2 = r9.A0F(r0)     // Catch: com.instagram.common.bloks.lexer.ParsingException -> L3f
            float r0 = X.HjB.A00(r9, r1, r0)     // Catch: com.instagram.common.bloks.lexer.ParsingException -> L3f
            r8.A09 = r0     // Catch: com.instagram.common.bloks.lexer.ParsingException -> L3f
            if (r2 == 0) goto L23
            boolean r2 = X.AbstractC7607F5u.A1X(r2)     // Catch: com.instagram.common.bloks.lexer.ParsingException -> L3f
            r0 = 1
            if (r2 != 0) goto L24
        L23:
            r0 = 0
        L24:
            r8.A0H = r0     // Catch: com.instagram.common.bloks.lexer.ParsingException -> L3f
            r0 = 40
            java.lang.String r2 = r9.A0F(r0)     // Catch: com.instagram.common.bloks.lexer.ParsingException -> L3f
            float r0 = X.HjB.A00(r9, r1, r0)     // Catch: com.instagram.common.bloks.lexer.ParsingException -> L3f
            r8.A0A = r0     // Catch: com.instagram.common.bloks.lexer.ParsingException -> L3f
            if (r2 == 0) goto L3b
            boolean r2 = X.AbstractC7607F5u.A1X(r2)     // Catch: com.instagram.common.bloks.lexer.ParsingException -> L3f
            r0 = 1
            if (r2 != 0) goto L3c
        L3b:
            r0 = 0
        L3c:
            r8.A0I = r0     // Catch: com.instagram.common.bloks.lexer.ParsingException -> L3f
            goto L45
        L3f:
            r2 = move-exception
            java.lang.String r0 = "Could not parse translation value."
            X.FFI.A01(r5, r0, r2)
        L45:
            r0 = 35
            float r0 = r9.A06(r0, r3)
            r8.A07 = r0
            r0 = 36
            float r0 = r9.A06(r0, r3)
            r8.A08 = r0
            r0 = 138(0x8a, float:1.93E-43)
            float r0 = r9.A06(r0, r1)
            r8.A04 = r0
            r0 = 44
            float r0 = r9.A06(r0, r1)
            r8.A05 = r0
            r0 = 45
            float r0 = r9.A06(r0, r1)
            r8.A06 = r0
            r1 = 43
            r0 = 1151336448(0x44a00000, float:1280.0)
            float r0 = r9.A06(r1, r0)
            r8.A01 = r0
            r0 = 41
            java.lang.String r4 = r9.A0F(r0)     // Catch: com.instagram.common.bloks.lexer.ParsingException -> Laf
            r3 = 42
            java.lang.String r2 = r9.A0F(r3)     // Catch: com.instagram.common.bloks.lexer.ParsingException -> Laf
            if (r4 != 0) goto L87
            if (r2 == 0) goto Lb5
        L87:
            r8.A0E = r7     // Catch: com.instagram.common.bloks.lexer.ParsingException -> Laf
            r1 = 1112014848(0x42480000, float:50.0)
            float r0 = X.HjB.A00(r9, r1, r0)     // Catch: com.instagram.common.bloks.lexer.ParsingException -> Laf
            r8.A02 = r0     // Catch: com.instagram.common.bloks.lexer.ParsingException -> Laf
            float r0 = X.HjB.A00(r9, r1, r3)     // Catch: com.instagram.common.bloks.lexer.ParsingException -> Laf
            r8.A03 = r0     // Catch: com.instagram.common.bloks.lexer.ParsingException -> Laf
            if (r4 == 0) goto La0
            boolean r1 = X.AbstractC7607F5u.A1X(r4)     // Catch: com.instagram.common.bloks.lexer.ParsingException -> Laf
            r0 = 0
            if (r1 == 0) goto La1
        La0:
            r0 = 1
        La1:
            r8.A0F = r0     // Catch: com.instagram.common.bloks.lexer.ParsingException -> Laf
            if (r2 == 0) goto Lab
            boolean r0 = X.AbstractC7607F5u.A1X(r2)     // Catch: com.instagram.common.bloks.lexer.ParsingException -> Laf
            if (r0 == 0) goto Lac
        Lab:
            r6 = 1
        Lac:
            r8.A0G = r6     // Catch: com.instagram.common.bloks.lexer.ParsingException -> Laf
            return
        Laf:
            r1 = move-exception
            java.lang.String r0 = "Could not parse pivot value."
            X.FFI.A01(r5, r0, r1)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FL2.A00(X.FDW):void");
    }
}
