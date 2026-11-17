package com.facebook.aura.partners.voice.screen;

import X.C7384Etj;
import android.view.View;
import androidx.activity.ComponentActivity;
import com.facebook.aura.partners.voice.api.HatchSystemPipRuntime;

/* loaded from: classes2.dex */
public final class SystemPipExpansionLayout {
    public final ComponentActivity activity;
    public final Runnable fallback;
    public final View.OnLayoutChangeListener listener;
    public boolean pending;
    public final View view;

    public SystemPipExpansionLayout(ComponentActivity componentActivity) {
        C7384Etj.A0Y(componentActivity, 0);
        this.activity = componentActivity;
        View decorView = componentActivity.getWindow().getDecorView();
        C7384Etj.A0U(decorView);
        this.view = decorView;
        this.fallback = new Runnable() { // from class: com.facebook.aura.partners.voice.screen.SystemPipExpansionLayout$fallback$1
            @Override // java.lang.Runnable
            public final void run() {
                this.this$0.complete();
            }
        };
        this.listener = new View.OnLayoutChangeListener() { // from class: com.facebook.aura.partners.voice.screen.SystemPipExpansionLayout$listener$1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.this$0.complete();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void complete() {
        if (this.pending) {
            cancel();
            if (this.activity.isInPictureInPictureMode() || this.activity.isFinishing()) {
                return;
            }
            HatchSystemPipRuntime.INSTANCE.markPipExpanded();
        }
    }

    public final void awaitLayout() {
        if (this.pending) {
            return;
        }
        this.pending = true;
        this.view.addOnLayoutChangeListener(this.listener);
        this.view.requestLayout();
        if (this.view.postDelayed(this.fallback, 500L)) {
            return;
        }
        complete();
    }

    public final void cancel() {
        this.view.removeOnLayoutChangeListener(this.listener);
        this.view.removeCallbacks(this.fallback);
        this.pending = false;
    }

    public final boolean getPending() {
        return this.pending;
    }
}
