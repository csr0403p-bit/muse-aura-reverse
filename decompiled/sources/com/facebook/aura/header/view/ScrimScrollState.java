package com.facebook.aura.header.view;

import X.AFs;
import X.ATD;
import X.C00q;
import X.C06H;
import X.C0872AFu;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;

/* loaded from: classes4.dex */
public final class ScrimScrollState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final C00q offsetPxState = new ParcelableSnapshotMutableFloatState(0.0f);
    public final float thresholdPx;

    public final class Companion {
        public final AFs<ScrimScrollState, Float> Saver(float f) {
            return new C0872AFu(ScrimScrollState$Companion$Saver$1.INSTANCE, new ScrimScrollState$Companion$Saver$2(f));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final void addDelta(float f) {
        if (f != 0.0f) {
            setOffset(this.offsetPxState.AFn() + f);
        }
    }

    public final void setOffset(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f != this.offsetPxState.AFn()) {
            this.offsetPxState.AdS(f);
        }
    }

    public final float getOffsetPx() {
        return this.offsetPxState.AFn();
    }

    public final float getProgress() {
        if (this.thresholdPx > 0.0f) {
            return ATD.A02(this.offsetPxState.AFn(), this.thresholdPx);
        }
        return 1.0f;
    }

    public final float getThresholdPx$fbandroid_express_aura_java_com_facebook_aura_header_view_view() {
        return this.thresholdPx;
    }

    public ScrimScrollState(float f) {
        this.thresholdPx = f;
    }
}
