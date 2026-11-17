package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.aura.R;

/* renamed from: X.Faa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8254Faa implements InterfaceC8333Fc0 {
    public int A00;
    public int A01;
    public Drawable A02;
    public Drawable A03;
    public Drawable A04;
    public Drawable A05;
    public View A06;
    public Window.Callback A07;
    public C8243FaJ A08;
    public Toolbar A09;
    public CharSequence A0A;
    public CharSequence A0B;
    public CharSequence A0C;
    public boolean A0D;
    public boolean A0E;

    public static void A00(C8254Faa c8254Faa) {
        Drawable drawable;
        int i = c8254Faa.A01;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = c8254Faa.A04) == null) {
            drawable = c8254Faa.A03;
        }
        c8254Faa.A09.setLogo(drawable);
    }

    @Override // X.InterfaceC8333Fc0
    public final void AdJ(int i) {
        View view;
        CharSequence charSequence;
        Drawable drawable;
        int i2 = this.A01 ^ i;
        this.A01 = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    CharSequence charSequence2 = this.A0A;
                    boolean zIsEmpty = TextUtils.isEmpty(charSequence2);
                    Toolbar toolbar = this.A09;
                    if (zIsEmpty) {
                        toolbar.setNavigationContentDescription(this.A00);
                    } else {
                        toolbar.setNavigationContentDescription(charSequence2);
                    }
                }
                int i3 = this.A01 & 4;
                Toolbar toolbar2 = this.A09;
                if (i3 != 0) {
                    drawable = this.A05;
                    if (drawable == null) {
                        drawable = this.A02;
                    }
                } else {
                    drawable = null;
                }
                toolbar2.setNavigationIcon(drawable);
            }
            if ((i2 & 3) != 0) {
                A00(this);
            }
            if ((i2 & 8) != 0) {
                int i4 = i & 8;
                Toolbar toolbar3 = this.A09;
                if (i4 != 0) {
                    toolbar3.setTitle(this.A0C);
                    charSequence = this.A0B;
                } else {
                    charSequence = null;
                    toolbar3.setTitle((CharSequence) null);
                }
                toolbar3.setSubtitle(charSequence);
            }
            if ((i2 & 16) == 0 || (view = this.A06) == null) {
                return;
            }
            int i5 = i & 16;
            Toolbar toolbar4 = this.A09;
            if (i5 != 0) {
                toolbar4.addView(view);
            } else {
                toolbar4.removeView(view);
            }
        }
    }

    @Override // X.InterfaceC8333Fc0
    public final void setWindowTitle(CharSequence charSequence) {
        if (this.A0E) {
            return;
        }
        this.A0C = charSequence;
        if ((this.A01 & 8) != 0) {
            this.A09.setTitle(charSequence);
        }
    }

    public C8254Faa(Toolbar toolbar, boolean z) {
        int i;
        Drawable drawable;
        this.A00 = 0;
        this.A09 = toolbar;
        CharSequence charSequence = toolbar.A0F;
        this.A0C = charSequence;
        this.A0B = toolbar.A0E;
        this.A0E = AnonymousClass002.A1X(charSequence);
        this.A05 = toolbar.getNavigationIcon();
        C8140FWd c8140FWdA00 = C8140FWd.A00(toolbar.getContext(), null, FYT.A00, R.attr._name_removed__res_0x7f040007, 0);
        this.A02 = c8140FWdA00.A02(15);
        if (z) {
            TypedArray typedArray = c8140FWdA00.A02;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.A0E = true;
                this.A0C = text;
                if ((this.A01 & 8) != 0) {
                    Toolbar toolbar2 = this.A09;
                    toolbar2.setTitle(text);
                    if (this.A0E) {
                        AbstractC8060FRo.A0A(toolbar2.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.A0B = text2;
                if ((this.A01 & 8) != 0) {
                    this.A09.setSubtitle(text2);
                }
            }
            Drawable drawableA02 = c8140FWdA00.A02(20);
            if (drawableA02 != null) {
                this.A04 = drawableA02;
                A00(this);
            }
            Drawable drawableA022 = c8140FWdA00.A02(17);
            if (drawableA022 != null) {
                this.A03 = drawableA022;
                A00(this);
            }
            if (this.A05 == null && (drawable = this.A02) != null) {
                this.A05 = drawable;
                this.A09.setNavigationIcon((this.A01 & 4) != 0 ? drawable : null);
            }
            AdJ(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(this.A09.getContext()).inflate(resourceId, (ViewGroup) this.A09, false);
                View view = this.A06;
                if (view != null && (this.A01 & 16) != 0) {
                    this.A09.removeView(view);
                }
                this.A06 = viewInflate;
                if (viewInflate != null && (this.A01 & 16) != 0) {
                    this.A09.addView(viewInflate);
                }
                AdJ(this.A01 | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = this.A09.getLayoutParams();
                layoutParams.height = layoutDimension;
                this.A09.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                Toolbar toolbar3 = this.A09;
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                C10449Hii c10449Hii = toolbar3.A0B;
                if (c10449Hii == null) {
                    c10449Hii = new C10449Hii();
                    toolbar3.A0B = c10449Hii;
                }
                c10449Hii.A00(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Toolbar toolbar4 = this.A09;
                Context context = toolbar4.getContext();
                toolbar4.A03 = resourceId2;
                TextView textView = toolbar4.A08;
                if (textView != null) {
                    textView.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Toolbar toolbar5 = this.A09;
                Context context2 = toolbar5.getContext();
                toolbar5.A02 = resourceId3;
                TextView textView2 = toolbar5.A07;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                this.A09.setPopupTheme(resourceId4);
            }
        } else {
            Toolbar toolbar6 = this.A09;
            if (toolbar6.getNavigationIcon() != null) {
                this.A02 = toolbar6.getNavigationIcon();
                i = 15;
            } else {
                i = 11;
            }
            this.A01 = i;
        }
        c8140FWdA00.A02.recycle();
        if (R.string._name_removed__res_0x7f12000f != this.A00) {
            this.A00 = R.string._name_removed__res_0x7f12000f;
            if (TextUtils.isEmpty(this.A09.getNavigationContentDescription())) {
                int i2 = this.A00;
                String string = i2 == 0 ? null : this.A09.getContext().getString(i2);
                this.A0A = string;
                if ((this.A01 & 4) != 0) {
                    boolean zIsEmpty = TextUtils.isEmpty(string);
                    Toolbar toolbar7 = this.A09;
                    if (zIsEmpty) {
                        toolbar7.setNavigationContentDescription(this.A00);
                    } else {
                        toolbar7.setNavigationContentDescription(this.A0A);
                    }
                }
            }
        }
        this.A0A = this.A09.getNavigationContentDescription();
        this.A09.setNavigationOnClickListener(new I0Y(this));
    }
}
