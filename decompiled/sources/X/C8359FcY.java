package X;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: X.FcY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8359FcY {
    public InterfaceC8370Fck A00 = new InterfaceC8370Fck() { // from class: X.Fcj
        @Override // X.InterfaceC8370Fck
        public final boolean shouldKeepOnScreen() {
            return false;
        }
    };
    public InterfaceC8368Fci A01;
    public C8364Fcd A02;
    public boolean A03;
    public Drawable A04;
    public Integer A05;
    public Integer A06;
    public final Activity A07;

    public void A03(InterfaceC8370Fck interfaceC8370Fck) {
        this.A00 = interfaceC8370Fck;
        View viewFindViewById = this.A07.findViewById(R.id.content);
        viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC10643I0n(0, viewFindViewById, this));
    }

    public void A04(InterfaceC8368Fci interfaceC8368Fci) {
        float dimension;
        int iIntValue;
        this.A01 = interfaceC8368Fci;
        Activity activity = this.A07;
        C8364Fcd c8364Fcd = new C8364Fcd(activity);
        Integer num = this.A06;
        Integer num2 = this.A05;
        ViewGroup viewGroupA00 = c8364Fcd.A00.A00();
        if (num != null && (iIntValue = num.intValue()) != 0) {
            viewGroupA00.setBackgroundResource(iIntValue);
        } else if (num2 != null) {
            viewGroupA00.setBackgroundColor(num2.intValue());
        } else {
            viewGroupA00.setBackground(AbstractC7607F5u.A0a(activity).getBackground());
        }
        Drawable drawable = this.A04;
        if (drawable != null) {
            ImageView imageView = (ImageView) viewGroupA00.findViewById(com.facebook.aura.R.id.splashscreen_icon_view);
            if (this.A03) {
                Drawable drawableA00 = FWf.A00(imageView.getContext(), com.facebook.aura.R.drawable.icon_background);
                dimension = imageView.getResources().getDimension(com.facebook.aura.R.dimen._name_removed__res_0x7f07007c) * 0.6666667f;
                if (drawableA00 != null) {
                    imageView.setBackground(new HlM(drawableA00, dimension));
                }
            } else {
                dimension = imageView.getResources().getDimension(com.facebook.aura.R.dimen._name_removed__res_0x7f07007b) * 0.6666667f;
            }
            imageView.setImageDrawable(new HlM(drawable, dimension));
        }
        viewGroupA00.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC8365Fce(this, c8364Fcd));
    }

    public C8359FcY(Activity activity) {
        this.A07 = activity;
    }

    public void A02() {
        int i;
        TypedValue typedValueA0Z = AbstractC7607F5u.A0Z();
        Activity activity = this.A07;
        Resources.Theme theme = activity.getTheme();
        if (theme.resolveAttribute(com.facebook.aura.R.attr._name_removed__res_0x7f040621, typedValueA0Z, true)) {
            this.A06 = Integer.valueOf(typedValueA0Z.resourceId);
            this.A05 = Integer.valueOf(typedValueA0Z.data);
        }
        if (theme.resolveAttribute(com.facebook.aura.R.attr._name_removed__res_0x7f04061f, typedValueA0Z, true)) {
            this.A04 = FWf.A00(activity, typedValueA0Z.resourceId);
        }
        if (theme.resolveAttribute(com.facebook.aura.R.attr._name_removed__res_0x7f0404e8, typedValueA0Z, true)) {
            this.A03 = typedValueA0Z.resourceId == com.facebook.aura.R.dimen._name_removed__res_0x7f07007c;
        }
        if (!theme.resolveAttribute(com.facebook.aura.R.attr._name_removed__res_0x7f040465, typedValueA0Z, true) || (i = typedValueA0Z.resourceId) == 0) {
            return;
        }
        activity.setTheme(i);
    }
}
