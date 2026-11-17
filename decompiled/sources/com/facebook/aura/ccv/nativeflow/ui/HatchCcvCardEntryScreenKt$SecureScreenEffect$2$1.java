package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;

/* loaded from: classes3.dex */
public final class HatchCcvCardEntryScreenKt$SecureScreenEffect$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Activity $activity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCcvCardEntryScreenKt$SecureScreenEffect$2$1(Activity activity) {
        super(1);
        this.$activity = activity;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        Window window;
        Window window2;
        WindowManager.LayoutParams attributes;
        Activity activity = this.$activity;
        final boolean z = false;
        if ((((activity == null || (window2 = activity.getWindow()) == null || (attributes = window2.getAttributes()) == null) ? 0 : attributes.flags) & 8192) != 0) {
            z = true;
        } else {
            Activity activity2 = this.$activity;
            if (activity2 != null && (window = activity2.getWindow()) != null) {
                window.addFlags(8192);
            }
        }
        final Activity activity3 = this.$activity;
        return new C78g() { // from class: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryScreenKt$SecureScreenEffect$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                Activity activity4;
                Window window3;
                if (z || (activity4 = activity3) == null || (window3 = activity4.getWindow()) == null) {
                    return;
                }
                window3.clearFlags(8192);
            }
        };
    }
}
