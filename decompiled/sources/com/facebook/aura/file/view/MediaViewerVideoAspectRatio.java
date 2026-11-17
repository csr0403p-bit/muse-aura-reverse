package com.facebook.aura.file.view;

import X.C00q;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import com.facebook.aura.file.utils.HatchMediaAspectRatios;

/* loaded from: classes.dex */
public final class MediaViewerVideoAspectRatio {
    public boolean hasVideoSize;
    public final String sharedElementKey;
    public final C00q value$delegate;

    public final synchronized void update(float f, boolean z) {
        boolean z2;
        if (Math.abs(f) <= Float.MAX_VALUE && f > 0.0f && (z || !this.hasVideoSize)) {
            if (!this.hasVideoSize) {
                z2 = false;
                if (z) {
                }
                this.hasVideoSize = z2;
                setValue(f);
                HatchMediaAspectRatios.INSTANCE.put(this.sharedElementKey, f);
            }
            z2 = true;
            this.hasVideoSize = z2;
            setValue(f);
            HatchMediaAspectRatios.INSTANCE.put(this.sharedElementKey, f);
        }
    }

    private final void setValue(float f) {
        this.value$delegate.AdS(f);
    }

    public final float getValue() {
        return this.value$delegate.AFn();
    }

    public MediaViewerVideoAspectRatio(String str) {
        this.sharedElementKey = str;
        Float f = HatchMediaAspectRatios.INSTANCE.get(str);
        this.value$delegate = new ParcelableSnapshotMutableFloatState(f != null ? f.floatValue() : 1.0f);
    }
}
