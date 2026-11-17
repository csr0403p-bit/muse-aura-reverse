package com.facebook.aura.appappearance;

import X.AEs;
import com.facebook.aura.model.HatchContentCache;
import com.facebook.aura.model.HatchContentViewModelData;

/* loaded from: classes2.dex */
public final class HatchRichFormatFullScreenViewModel extends AEs {
    public static final int $stable = 8;
    public HatchContentViewModelData contentViewModelData;

    public final HatchContentViewModelData getContentViewModelData() {
        return this.contentViewModelData;
    }

    public final void loadIfNeeded(String str) {
        if (this.contentViewModelData == null) {
            this.contentViewModelData = HatchContentCache.INSTANCE.getAndDelete(str);
        }
    }
}
