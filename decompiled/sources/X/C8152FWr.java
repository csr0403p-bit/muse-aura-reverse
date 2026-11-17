package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.facebook.aura.R;
import com.google.android.material.button.MaterialButton;

/* renamed from: X.FWr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8152FWr {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public ColorStateList A07;
    public ColorStateList A08;
    public ColorStateList A09;
    public PorterDuff.Mode A0A;
    public Drawable A0B;
    public LayerDrawable A0C;
    public FXK A0D;
    public boolean A0F;
    public final MaterialButton A0I;
    public boolean A0H = false;
    public boolean A0E = false;
    public boolean A0G = false;

    public static void A03(C8152FWr c8152FWr) {
        FX9 fx9A00 = A00(c8152FWr, false);
        FX9 fx9A002 = A00(c8152FWr, true);
        if (fx9A00 != null) {
            float f = c8152FWr.A06;
            ColorStateList colorStateList = c8152FWr.A09;
            fx9A00.A00.A04 = f;
            fx9A00.invalidateSelf();
            fx9A00.A0A(colorStateList);
            if (fx9A002 != null) {
                float f2 = c8152FWr.A06;
                int iA01 = c8152FWr.A0H ? FWM.A01(c8152FWr.A0I, R.attr._name_removed__res_0x7f040139) : 0;
                fx9A002.A00.A04 = f2;
                fx9A002.invalidateSelf();
                fx9A002.A0A(ColorStateList.valueOf(iA01));
            }
        }
    }

    public static FX9 A00(C8152FWr c8152FWr, boolean z) {
        LayerDrawable layerDrawable = c8152FWr.A0C;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (FX9) ((LayerDrawable) ((DrawableWrapper) c8152FWr.A0C.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    private final InterfaceC8153FWv A01() {
        LayerDrawable layerDrawable = this.A0C;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        int numberOfLayers = this.A0C.getNumberOfLayers();
        LayerDrawable layerDrawable2 = this.A0C;
        return (InterfaceC8153FWv) (numberOfLayers > 2 ? layerDrawable2.getDrawable(2) : layerDrawable2.getDrawable(1));
    }

    public static void A02(C8152FWr c8152FWr) {
        MaterialButton materialButton = c8152FWr.A0I;
        FX9 fx9 = new FX9(c8152FWr.A0D);
        fx9.A00.A0J = new FXB(materialButton.getContext());
        FX9.A04(fx9);
        fx9.setTintList(c8152FWr.A07);
        PorterDuff.Mode mode = c8152FWr.A0A;
        if (mode != null) {
            fx9.setTintMode(mode);
        }
        float f = c8152FWr.A06;
        ColorStateList colorStateList = c8152FWr.A09;
        fx9.A00.A04 = f;
        fx9.invalidateSelf();
        fx9.A0A(colorStateList);
        FX9 fx92 = new FX9(c8152FWr.A0D);
        fx92.setTint(0);
        float f2 = c8152FWr.A06;
        int iA01 = c8152FWr.A0H ? FWM.A01(materialButton, R.attr._name_removed__res_0x7f040139) : 0;
        fx92.A00.A04 = f2;
        fx92.invalidateSelf();
        fx92.A0A(ColorStateList.valueOf(iA01));
        FX9 fx93 = new FX9(c8152FWr.A0D);
        c8152FWr.A0B = fx93;
        fx93.setTint(-1);
        ColorStateList colorStateListValueOf = c8152FWr.A08;
        if (colorStateListValueOf == null) {
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateListValueOf, new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{fx92, fx9}), c8152FWr.A03, c8152FWr.A05, c8152FWr.A04, c8152FWr.A02), c8152FWr.A0B);
        c8152FWr.A0C = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        FX9 fx9A00 = A00(c8152FWr, false);
        if (fx9A00 != null) {
            fx9A00.A08(c8152FWr.A01);
        }
    }

    public static void A04(C8152FWr c8152FWr, int i, int i2) {
        MaterialButton materialButton = c8152FWr.A0I;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = c8152FWr.A05;
        int i4 = c8152FWr.A02;
        c8152FWr.A02 = i2;
        c8152FWr.A05 = i;
        if (!c8152FWr.A0E) {
            A02(c8152FWr);
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void A05(FXK fxk) {
        this.A0D = fxk;
        if (A00(this, false) != null) {
            A00(this, false).setShapeAppearanceModel(fxk);
        }
        if (A00(this, true) != null) {
            A00(this, true).setShapeAppearanceModel(fxk);
        }
        if (A01() != null) {
            A01().setShapeAppearanceModel(fxk);
        }
    }

    public C8152FWr(MaterialButton materialButton, FXK fxk) {
        this.A0I = materialButton;
        this.A0D = fxk;
    }
}
