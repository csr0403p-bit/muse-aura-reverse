package com.facebook.aura.common.ui;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import android.view.View;

/* loaded from: classes2.dex */
public final class KeepScreenOnKt$KeepScreenOn$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeepScreenOnKt$KeepScreenOn$1$1(boolean z, View view) {
        super(1);
        this.$enabled = z;
        this.$view = view;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$enabled) {
            KeepScreenOnKt.acquireKeepScreenOn(this.$view);
        }
        final boolean z = this.$enabled;
        final View view = this.$view;
        return new C78g() { // from class: com.facebook.aura.common.ui.KeepScreenOnKt$KeepScreenOn$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                if (z) {
                    KeepScreenOnKt.releaseKeepScreenOn(view);
                }
            }
        };
    }
}
