package com.facebook.aura.main;

import X.AbstractC7559F3s;
import androidx.navigation3.runtime.NavBackStack;
import com.facebook.aura.navigation.AuraContentAreaNavKey;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraOverlayNavKey;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSidePanelDockStateKt$rememberHatchSidePanelDockState$hasWindowOverlay$2$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ NavBackStack<AuraNavKey> $backStack;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSidePanelDockStateKt$rememberHatchSidePanelDockState$hasWindowOverlay$2$1(NavBackStack<AuraNavKey> navBackStack) {
        super(0);
        this.$backStack = navBackStack;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        NavBackStack<AuraNavKey> navBackStack = this.$backStack;
        boolean z = false;
        if (!(navBackStack instanceof Collection) || !navBackStack.isEmpty()) {
            Iterator it = navBackStack.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if ((next instanceof AuraOverlayNavKey) && !(next instanceof AuraContentAreaNavKey)) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
