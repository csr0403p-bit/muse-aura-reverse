package com.facebook.aura.startup.coordinator;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.gateway.HatchSessionItem;

/* loaded from: classes3.dex */
public final class HatchTabPrefetchCoordinatorStartupJob$prefetchSideChatHistories$sessions$1 extends AbstractC7559F3s implements G0U<HatchSessionItem, Boolean> {
    public static final HatchTabPrefetchCoordinatorStartupJob$prefetchSideChatHistories$sessions$1 INSTANCE = new HatchTabPrefetchCoordinatorStartupJob$prefetchSideChatHistories$sessions$1();

    public HatchTabPrefetchCoordinatorStartupJob$prefetchSideChatHistories$sessions$1() {
        super(1);
    }

    @Override // X.G0U
    public final Boolean invoke(HatchSessionItem hatchSessionItem) {
        C7384Etj.A0Y(hatchSessionItem, 0);
        return Boolean.valueOf(hatchSessionItem.isThread);
    }
}
