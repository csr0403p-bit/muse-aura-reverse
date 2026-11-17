package com.facebook.aura.bloks.bottomsheet;

import X.C7384Etj;
import X.C7729FCg;
import X.FGJ;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes6.dex */
public final class AuraBloksBottomSheetComponentContent implements AuraBloksBottomSheetContentInterface {
    public static final int $stable = 8;
    public final C7729FCg bloksHostingComponent;
    public View view;

    public AuraBloksBottomSheetComponentContent(C7729FCg c7729FCg) {
        C7384Etj.A0Y(c7729FCg, 0);
        this.bloksHostingComponent = c7729FCg;
    }

    public final C7729FCg getBloksHostingComponent() {
        return this.bloksHostingComponent;
    }

    public final View getView() {
        return this.view;
    }

    @Override // com.facebook.aura.bloks.bottomsheet.AuraBloksBottomSheetContentInterface
    public Boolean isDarkMode() {
        return Boolean.valueOf(this.bloksHostingComponent.A02().A05);
    }

    @Override // com.facebook.aura.bloks.bottomsheet.AuraBloksBottomSheetContentInterface
    public boolean onBackPressed() {
        return false;
    }

    @Override // com.facebook.aura.bloks.bottomsheet.AuraBloksBottomSheetContentInterface
    public void onCreate(Context context) {
    }

    @Override // com.facebook.aura.bloks.bottomsheet.AuraBloksBottomSheetContentInterface
    public void onDestroy() {
        this.bloksHostingComponent.A03();
    }

    @Override // com.facebook.aura.bloks.bottomsheet.AuraBloksBottomSheetContentInterface
    public void onDestroyView() {
        this.bloksHostingComponent.A04();
    }

    public final void setView(View view) {
        this.view = view;
    }

    @Override // com.facebook.aura.bloks.bottomsheet.AuraBloksBottomSheetContentInterface
    public View getView(Context context) {
        C7384Etj.A0Y(context, 0);
        View view = this.view;
        if (view == null) {
            FGJ fgj = new FGJ(context);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.addView(fgj, new FrameLayout.LayoutParams(-1, -2));
            this.bloksHostingComponent.A05(fgj);
            this.view = frameLayout;
            return frameLayout;
        }
        return view;
    }
}
