package androidx.appcompat.view.menu;

import X.AbstractC7607F5u;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C8140FWd;
import X.C8252FaX;
import X.FYT;
import X.InterfaceC8332Fbz;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.facebook.aura.R;

/* loaded from: classes6.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC8332Fbz, AbsListView.SelectionBoundsAdjuster {
    public ImageView A00;
    public LinearLayout A01;
    public TextView A02;
    public C8252FaX A03;
    public int A04;
    public Context A05;
    public Drawable A06;
    public Drawable A07;
    public LayoutInflater A08;
    public CheckBox A09;
    public ImageView A0A;
    public ImageView A0B;
    public RadioButton A0C;
    public TextView A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;

    public void setIcon(Drawable drawable) {
        boolean z = true;
        if (!this.A0E) {
            z = false;
            if (!this.A0G) {
                return;
            }
        }
        if (this.A00 == null) {
            if (drawable == null && !this.A0G) {
                return;
            }
            ImageView imageView = (ImageView) getInflater().inflate(R.layout._name_removed__res_0x7f0d000c, (ViewGroup) this, false);
            this.A00 = imageView;
            LinearLayout linearLayout = this.A01;
            if (linearLayout != null) {
                linearLayout.addView(imageView, 0);
            } else {
                addView(imageView, 0);
            }
        }
        if (drawable == null && !this.A0G) {
            this.A00.setVisibility(8);
            return;
        }
        ImageView imageView2 = this.A00;
        if (!z) {
            drawable = null;
        }
        imageView2.setImageDrawable(drawable);
        if (this.A00.getVisibility() != 0) {
            this.A00.setVisibility(0);
        }
    }

    private LayoutInflater getInflater() {
        LayoutInflater layoutInflater = this.A08;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        this.A08 = layoutInflaterFrom;
        return layoutInflaterFrom;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.A0B;
        if (imageView != null) {
            imageView.setVisibility(AbstractC7609F5w.A06(z ? 1 : 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0132  */
    @Override // X.InterfaceC8332Fbz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ANf(X.C8252FaX r10) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.ANf(X.FaX):void");
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.A0A;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        rect.top += AbstractC7610F5x.A0K(this.A0A, AbstractC7607F5u.A0e(this.A0A));
    }

    @Override // X.InterfaceC8332Fbz
    public C8252FaX getItemData() {
        return this.A03;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.A00 != null && this.A0G) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = this.A00.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        CompoundButton compoundButton3;
        if (!z && this.A0C == null && this.A09 == null) {
            return;
        }
        if ((this.A03.A02 & 4) != 0) {
            if (this.A0C == null) {
                A01();
            }
            compoundButton = this.A0C;
            compoundButton3 = this.A09;
            compoundButton2 = compoundButton3;
        } else {
            if (this.A09 == null) {
                A00();
            }
            compoundButton = this.A09;
            compoundButton2 = compoundButton;
            compoundButton3 = this.A0C;
        }
        if (!z) {
            if (compoundButton2 != null) {
                compoundButton2.setVisibility(8);
            }
            RadioButton radioButton = this.A0C;
            if (radioButton != null) {
                radioButton.setVisibility(8);
                return;
            }
            return;
        }
        compoundButton.setChecked(this.A03.isChecked());
        if (compoundButton.getVisibility() != 0) {
            compoundButton.setVisibility(0);
        }
        if (compoundButton3 == null || compoundButton3.getVisibility() == 8) {
            return;
        }
        compoundButton3.setVisibility(8);
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.A03.A02 & 4) != 0) {
            if (this.A0C == null) {
                A01();
            }
            compoundButton = this.A0C;
        } else {
            if (this.A09 == null) {
                A00();
            }
            compoundButton = this.A09;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.A0E = z;
        this.A0G = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setGroupDividerEnabled(boolean r3) {
        /*
            r2 = this;
            android.widget.ImageView r1 = r2.A0A
            if (r1 == 0) goto L10
            boolean r0 = r2.A0F
            if (r0 != 0) goto Lb
            r0 = 0
            if (r3 != 0) goto Ld
        Lb:
            r0 = 8
        Ld:
            r1.setVisibility(r0)
        L10:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.setGroupDividerEnabled(boolean):void");
    }

    public void setTitle(CharSequence charSequence) {
        int i;
        TextView textView;
        TextView textView2 = this.A0D;
        if (charSequence != null) {
            textView2.setText(charSequence);
            if (this.A0D.getVisibility() == 0) {
                return;
            }
            textView = this.A0D;
            i = 0;
        } else {
            i = 8;
            if (textView2.getVisibility() == 8) {
                return;
            } else {
                textView = this.A0D;
            }
        }
        textView.setVisibility(i);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr._name_removed__res_0x7f04034a);
    }

    private void A00() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout._name_removed__res_0x7f0d000b, (ViewGroup) this, false);
        this.A09 = checkBox;
        LinearLayout linearLayout = this.A01;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    private void A01() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout._name_removed__res_0x7f0d000e, (ViewGroup) this, false);
        this.A0C = radioButton;
        LinearLayout linearLayout = this.A01;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.A06);
        TextView textView = (TextView) findViewById(R.id.title);
        this.A0D = textView;
        int i = this.A04;
        if (i != -1) {
            textView.setTextAppearance(this.A05, i);
        }
        this.A02 = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.A0B = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.A07);
        }
        this.A0A = (ImageView) findViewById(R.id.group_divider);
        this.A01 = (LinearLayout) findViewById(R.id.content);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C8140FWd c8140FWdA00 = C8140FWd.A00(getContext(), attributeSet, FYT.A0H, i, 0);
        this.A06 = c8140FWdA00.A02(5);
        TypedArray typedArray = c8140FWdA00.A02;
        this.A04 = typedArray.getResourceId(1, -1);
        this.A0G = typedArray.getBoolean(7, false);
        this.A05 = context;
        this.A07 = c8140FWdA00.A02(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr._name_removed__res_0x7f0401b6, 0);
        this.A0F = typedArrayObtainStyledAttributes.hasValue(0);
        typedArray.recycle();
        typedArrayObtainStyledAttributes.recycle();
    }
}
