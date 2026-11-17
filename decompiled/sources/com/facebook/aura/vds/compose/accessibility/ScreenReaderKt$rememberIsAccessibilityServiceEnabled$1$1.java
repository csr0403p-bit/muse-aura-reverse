package com.facebook.aura.vds.compose.accessibility;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ScreenReaderKt$rememberIsAccessibilityServiceEnabled$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AccessibilityManager $accessibilityManager;
    public final /* synthetic */ MutableState<Boolean> $isEnabled$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenReaderKt$rememberIsAccessibilityServiceEnabled$1$1(AccessibilityManager accessibilityManager, MutableState<Boolean> mutableState) {
        super(1);
        this.$accessibilityManager = accessibilityManager;
        this.$isEnabled$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        AccessibilityManager accessibilityManager = this.$accessibilityManager;
        final ScreenReaderKt$rememberIsAccessibilityServiceEnabled$1$1$update$1 screenReaderKt$rememberIsAccessibilityServiceEnabled$1$1$update$1 = new ScreenReaderKt$rememberIsAccessibilityServiceEnabled$1$1$update$1(accessibilityManager, this.$isEnabled$delegate);
        final AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: com.facebook.aura.vds.compose.accessibility.ScreenReaderKt$rememberIsAccessibilityServiceEnabled$1$1$stateListener$1
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                screenReaderKt$rememberIsAccessibilityServiceEnabled$1$1$update$1.invoke();
            }
        };
        final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: com.facebook.aura.vds.compose.accessibility.ScreenReaderKt$rememberIsAccessibilityServiceEnabled$1$1$touchExplorationListener$1
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                screenReaderKt$rememberIsAccessibilityServiceEnabled$1$1$update$1.invoke();
            }
        };
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(accessibilityStateChangeListener);
        }
        AccessibilityManager accessibilityManager2 = this.$accessibilityManager;
        if (accessibilityManager2 != null) {
            accessibilityManager2.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        AccessibilityManager accessibilityManager3 = this.$accessibilityManager;
        final Function0<Unit> function0AddServicesStateChangeListener = (accessibilityManager3 == null || Build.VERSION.SDK_INT < 33) ? null : ScreenReaderKt.addServicesStateChangeListener(accessibilityManager3, screenReaderKt$rememberIsAccessibilityServiceEnabled$1$1$update$1);
        screenReaderKt$rememberIsAccessibilityServiceEnabled$1$1$update$1.invoke();
        final AccessibilityManager accessibilityManager4 = this.$accessibilityManager;
        return new C78g() { // from class: com.facebook.aura.vds.compose.accessibility.ScreenReaderKt$rememberIsAccessibilityServiceEnabled$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                AccessibilityManager accessibilityManager5 = accessibilityManager4;
                if (accessibilityManager5 != null) {
                    accessibilityManager5.removeAccessibilityStateChangeListener(accessibilityStateChangeListener);
                }
                AccessibilityManager accessibilityManager6 = accessibilityManager4;
                if (accessibilityManager6 != null) {
                    accessibilityManager6.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                }
                Function0 function0 = function0AddServicesStateChangeListener;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        };
    }
}
