package com.facebook.aura.navigation;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C0Yr;
import X.C1971Avc;
import X.C78g;
import X.G0U;
import android.view.Window;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;

/* loaded from: classes4.dex */
public final class BottomSheetSceneStrategyKt$SystemBarsModeEffect$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Window $dialogWindow;
    public final /* synthetic */ AuraThemeMode $mode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetSceneStrategyKt$SystemBarsModeEffect$2$1(Window window, AuraThemeMode auraThemeMode) {
        super(1);
        this.$dialogWindow = window;
        this.$mode = auraThemeMode;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        Window window = this.$dialogWindow;
        if (window != null) {
            boolean zA1Z = AnonymousClass002.A1Z(this.$mode, AuraThemeMode.LIGHT);
            C1971Avc c1971Avc = new C1971Avc(window.getDecorView(), window);
            c1971Avc.A01(zA1Z);
            c1971Avc.A00(zA1Z);
        }
        return new C78g() { // from class: com.facebook.aura.navigation.BottomSheetSceneStrategyKt$SystemBarsModeEffect$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
