package com.facebook.aura.bloks.bottomsheet;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraBloksBottomSheetContentKt$AuraBloksBottomSheetContent$2$1$3$1 extends AbstractC7559F3s implements G0U<CoordinatorLayout, Unit> {
    public final /* synthetic */ AuraBloksBottomSheetData $bottomSheetData;
    public final /* synthetic */ Context $context;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CoordinatorLayout coordinatorLayout) {
        ViewGroup viewGroup;
        C7384Etj.A0Y(coordinatorLayout, 0);
        coordinatorLayout.removeAllViews();
        View view = this.$bottomSheetData.content.getView(this.$context);
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            viewGroup.removeView(view);
        }
        coordinatorLayout.addView(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBloksBottomSheetContentKt$AuraBloksBottomSheetContent$2$1$3$1(AuraBloksBottomSheetData auraBloksBottomSheetData, Context context) {
        super(1);
        this.$bottomSheetData = auraBloksBottomSheetData;
        this.$context = context;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(CoordinatorLayout coordinatorLayout) {
        invoke2(coordinatorLayout);
        return Unit.INSTANCE;
    }
}
