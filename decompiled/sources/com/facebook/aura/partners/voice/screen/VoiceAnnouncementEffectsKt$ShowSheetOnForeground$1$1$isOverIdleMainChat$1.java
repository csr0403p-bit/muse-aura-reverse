package com.facebook.aura.partners.voice.screen;

import X.AXN;
import X.AbstractC7559F3s;
import X.C1HY;
import X.C1Ny;
import android.view.View;
import com.facebook.aura.navigation.HatchSidePanelController;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$isOverIdleMainChat$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ C1Ny $imeInsets;
    public final /* synthetic */ C1HY $lifecycleOwner;
    public final /* synthetic */ HatchSidePanelController $sidePanelController;
    public final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$isOverIdleMainChat$1(C1HY c1hy, View view, HatchSidePanelController hatchSidePanelController, C1Ny c1Ny, AXN axn) {
        super(0);
        this.$lifecycleOwner = c1hy;
        this.$view = view;
        this.$sidePanelController = hatchSidePanelController;
        this.$imeInsets = c1Ny;
        this.$density = axn;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke() {
        /*
            r2 = this;
            X.1HY r0 = r2.$lifecycleOwner
            X.F2N r0 = r0.getLifecycle()
            X.Dfm r0 = (X.C5303Dfm) r0
            X.Huf r1 = r0.A01
            X.Huf r0 = X.EnumC10573Huf.A05
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L35
            android.view.View r0 = r2.$view
            boolean r0 = r0.hasWindowFocus()
            if (r0 == 0) goto L35
            com.facebook.aura.navigation.HatchSidePanelController r0 = r2.$sidePanelController
            com.facebook.aura.navigation.HatchSidePanelContentKey r0 = r0.getContentKey()
            if (r0 != 0) goto L35
            com.facebook.aura.navigation.HatchSidePanelController r0 = r2.$sidePanelController
            com.facebook.aura.navigation.HatchSidePanelContentKey r0 = r0.getOpenDragContentKey()
            if (r0 != 0) goto L35
            X.1Ny r1 = r2.$imeInsets
            X.AXN r0 = r2.$density
            int r1 = r1.ACy(r0)
            r0 = 1
            if (r1 == 0) goto L36
        L35:
            r0 = 0
        L36:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$isOverIdleMainChat$1.invoke():java.lang.Boolean");
    }
}
