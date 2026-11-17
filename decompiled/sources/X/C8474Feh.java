package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: X.Feh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8474Feh {
    public int A00;
    public C8345FcJ A01;
    public C8345FcJ A02;
    public final View A03;
    public final ArrayList<InterfaceC8476Fej> A04 = C3cG.A0h();

    public C8474Feh(ViewGroup viewGroup) {
        View childAt;
        C8345FcJ c8345FcJ = C8345FcJ.A04;
        this.A01 = c8345FcJ;
        this.A02 = c8345FcJ;
        Drawable background = viewGroup.getBackground();
        this.A00 = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        C8475Fei c8475Fei = new C8475Fei(viewGroup.getContext(), viewGroup, this);
        this.A03 = c8475Fei;
        c8475Fei.setVisibility(8);
        c8475Fei.setWillNotDraw(true);
        AbstractC8082FSn.A00(c8475Fei, new I10(this, 2));
        C8490Fex.A01(c8475Fei, new C8477Fek(this));
        int childCount = viewGroup.getChildCount();
        do {
            childCount--;
            if (childCount < 0) {
                viewGroup.addView(c8475Fei, 0);
                return;
            }
            childAt = viewGroup.getChildAt(childCount);
        } while (childAt.isAttachedToWindow() == viewGroup.isAttachedToWindow());
        childAt.addOnAttachStateChangeListener(new I0X(0, viewGroup, c8475Fei));
    }
}
