package com.facebook.aura.bloks.bottomsheet;

import X.AbstractC7559F3s;
import X.C8128FUx;
import X.G0U;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes4.dex */
public final class AuraBloksBottomSheetContentKt$AuraBloksBottomSheetContent$2$1$2$1 extends AbstractC7559F3s implements G0U<Context, CoordinatorLayout> {
    public final /* synthetic */ AuraBloksBottomSheetData $bottomSheetData;
    public final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBloksBottomSheetContentKt$AuraBloksBottomSheetContent$2$1$2$1(Context context, AuraBloksBottomSheetData auraBloksBottomSheetData) {
        super(1);
        this.$context = context;
        this.$bottomSheetData = auraBloksBottomSheetData;
    }

    @Override // X.G0U
    public final CoordinatorLayout invoke(Context context) {
        ViewGroup viewGroup;
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(this.$context);
        coordinatorLayout.setLayoutParams(new C8128FUx(-1, -1));
        View view = this.$bottomSheetData.content.getView(this.$context);
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            viewGroup.removeView(view);
        }
        coordinatorLayout.addView(view);
        return coordinatorLayout;
    }
}
