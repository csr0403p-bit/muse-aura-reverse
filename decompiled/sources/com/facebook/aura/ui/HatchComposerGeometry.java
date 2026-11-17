package com.facebook.aura.ui;

import X.AbstractC0878AGe;
import X.C0981AMm;
import X.C1DG;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class HatchComposerGeometry {
    public static final int $stable = 0;
    public final C0981AMm<Object, C1DG> clearances = new C0981AMm<>();

    public final void clearBottomClearance$fbandroid_express_aura_java_com_facebook_aura_ui_ui(Object obj) {
        C7384Etj.A0Y(obj, 0);
        this.clearances.remove(obj);
    }

    /* renamed from: updateBottomClearance-D5KLDUw$fbandroid_express_aura_java_com_facebook_aura_ui_ui, reason: not valid java name */
    public final void m2314x8c755d2d(float f, Object obj) {
        C7384Etj.A0Y(obj, 1);
        this.clearances.put(obj, new C1DG(f));
    }

    /* renamed from: getBottomClearance-lTKBWiU, reason: not valid java name */
    public final C1DG m2313getBottomClearancelTKBWiU() {
        return (C1DG) AbstractC0878AGe.A07(this.clearances.values());
    }
}
