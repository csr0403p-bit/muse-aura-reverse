package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.CFK;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;

/* loaded from: classes.dex */
public final class HatchScreenErrorStateKt$HatchScreenErrorState$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ String $message;
    public final /* synthetic */ HatchScreen $screen;
    public final /* synthetic */ HatchSubsurface $subsurface;
    public final /* synthetic */ HatchSurface $surface;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchScreenErrorStateKt$HatchScreenErrorState$1$1(HatchScreen hatchScreen, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, String str) {
        super(1);
        this.$screen = hatchScreen;
        this.$surface = hatchSurface;
        this.$subsurface = hatchSubsurface;
        this.$message = str;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        HatchScreen hatchScreen = this.$screen;
        String value = hatchScreen != null ? hatchScreen.getValue() : null;
        HatchSurface hatchSurface = this.$surface;
        String value2 = hatchSurface != null ? hatchSurface.getValue() : null;
        HatchSubsurface hatchSubsurface = this.$subsurface;
        CFK.A0H(HatchScreenErrorStateKt.TAG, "Error screen shown: screen=%s surface=%s subsurface=%s message=%s", value, value2, hatchSubsurface != null ? hatchSubsurface.getValue() : null, this.$message);
        return new C78g() { // from class: com.facebook.aura.ui.HatchScreenErrorStateKt$HatchScreenErrorState$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
