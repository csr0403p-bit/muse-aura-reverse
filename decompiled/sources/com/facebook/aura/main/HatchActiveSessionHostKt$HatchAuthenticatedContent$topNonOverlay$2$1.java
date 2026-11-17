package com.facebook.aura.main;

import X.AbstractC7559F3s;
import androidx.navigation3.runtime.NavBackStack;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraOverlayNavKey;
import java.util.ListIterator;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchActiveSessionHostKt$HatchAuthenticatedContent$topNonOverlay$2$1 extends AbstractC7559F3s implements Function0<AuraNavKey> {
    public final /* synthetic */ NavBackStack<AuraNavKey> $backStack;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchActiveSessionHostKt$HatchAuthenticatedContent$topNonOverlay$2$1(NavBackStack<AuraNavKey> navBackStack) {
        super(0);
        this.$backStack = navBackStack;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AuraNavKey invoke() {
        Object objPrevious;
        NavBackStack<AuraNavKey> navBackStack = this.$backStack;
        ListIterator listIterator = navBackStack.listIterator(navBackStack.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (!(objPrevious instanceof AuraOverlayNavKey) && !(objPrevious instanceof AuraBottomSheetNavKey)) {
                break;
            }
        }
        return (AuraNavKey) objPrevious;
    }
}
