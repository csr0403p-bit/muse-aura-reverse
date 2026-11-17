package com.facebook.aura.main;

import X.AbstractC7559F3s;
import androidx.navigation3.runtime.NavBackStack;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.HatchSidePanelController;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchActiveSessionHostKt$HatchActiveSessionHost$foregroundHeaderState$1$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ NavBackStack<AuraNavKey> $backStack;
    public final /* synthetic */ HatchSidePanelController $sidePanelController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchActiveSessionHostKt$HatchActiveSessionHost$foregroundHeaderState$1$1(NavBackStack<AuraNavKey> navBackStack, HatchSidePanelController hatchSidePanelController) {
        super(0);
        this.$backStack = navBackStack;
        this.$sidePanelController = hatchSidePanelController;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[EDGE_INSN: B:24:0x0034->B:14:0x0034 BREAK  A[LOOP:0: B:18:0x003e->B:25:?]] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke() {
        /*
            r2 = this;
            androidx.navigation3.runtime.NavBackStack<com.facebook.aura.navigation.AuraNavKey> r1 = r2.$backStack
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L3a
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L3a
        Lc:
            androidx.navigation3.runtime.NavBackStack<com.facebook.aura.navigation.AuraNavKey> r0 = r2.$backStack
            java.lang.Object r0 = X.AbstractC0878AGe.A0I(r0)
            boolean r0 = r0 instanceof com.facebook.aura.navigation.AuraBottomSheetNavKey
            if (r0 != 0) goto L34
            com.facebook.aura.navigation.HatchSidePanelController r0 = r2.$sidePanelController
            com.facebook.aura.navigation.HatchSidePanelContentKey r0 = r0.getContentKey()
            if (r0 != 0) goto L34
            com.facebook.aura.navigation.HatchSidePanelController r0 = r2.$sidePanelController
            com.facebook.aura.navigation.HatchSidePanelContentKey r0 = r0.getOpenDragContentKey()
            if (r0 != 0) goto L34
            com.facebook.aura.navigation.HatchSidePanelController r0 = r2.$sidePanelController
            X.00q r0 = r0.revealOffsetPx$delegate
            float r1 = r0.AFn()
            r0 = 0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 1
            if (r1 == 0) goto L35
        L34:
            r0 = 0
        L35:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L3a:
            java.util.Iterator r1 = r1.iterator()
        L3e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lc
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof com.facebook.aura.navigation.AuraOverlayNavKey
            if (r0 == 0) goto L3e
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.main.HatchActiveSessionHostKt$HatchActiveSessionHost$foregroundHeaderState$1$1.invoke():java.lang.Boolean");
    }
}
