package com.facebook.aura.vds.compose.accessibility;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class ScreenReaderKt$rememberIsScreenReaderEnabled$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AccessibilityManager $accessibilityManager;
    public final /* synthetic */ MutableState<Boolean> $isEnabled$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenReaderKt$rememberIsScreenReaderEnabled$1$1(AccessibilityManager accessibilityManager, MutableState<Boolean> mutableState) {
        super(1);
        this.$accessibilityManager = accessibilityManager;
        this.$isEnabled$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final AccessibilityManager accessibilityManager = this.$accessibilityManager;
        final MutableState<Boolean> mutableState = this.$isEnabled$delegate;
        final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: com.facebook.aura.vds.compose.accessibility.ScreenReaderKt$rememberIsScreenReaderEnabled$1$1$listener$1
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                MutableState<Boolean> mutableState2 = mutableState;
                AccessibilityManager accessibilityManager2 = accessibilityManager;
                boolean z2 = true;
                if (!Boolean.getBoolean("is_accessibility_enabled") && (accessibilityManager2 == null || !accessibilityManager2.isTouchExplorationEnabled())) {
                    z2 = false;
                }
                MutableState.A09(z2, mutableState2);
            }
        };
        if (accessibilityManager != null) {
            accessibilityManager.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        MutableState<Boolean> mutableState2 = this.$isEnabled$delegate;
        AccessibilityManager accessibilityManager2 = this.$accessibilityManager;
        boolean z = true;
        if (!Boolean.getBoolean("is_accessibility_enabled") && (accessibilityManager2 == null || !accessibilityManager2.isTouchExplorationEnabled())) {
            z = false;
        }
        MutableState.A09(z, mutableState2);
        final AccessibilityManager accessibilityManager3 = this.$accessibilityManager;
        return new C78g() { // from class: com.facebook.aura.vds.compose.accessibility.ScreenReaderKt$rememberIsScreenReaderEnabled$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                AccessibilityManager accessibilityManager4 = accessibilityManager3;
                if (accessibilityManager4 != null) {
                    accessibilityManager4.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                }
            }
        };
    }
}
