package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0W;
import com.facebook.aura.checkpoint.view.HatchCheckpointOverlayKt;
import com.facebook.aura.navigation.key.HatchCheckpointOverlayScreenKey;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ComposableSingletons$HatchCheckpointOverlayEntryProviderKt$lambda$380279998$1 extends AbstractC7559F3s implements G0W<HatchCheckpointOverlayScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchCheckpointOverlayEntryProviderKt$lambda$380279998$1 INSTANCE = new ComposableSingletons$HatchCheckpointOverlayEntryProviderKt$lambda$380279998$1();

    public ComposableSingletons$HatchCheckpointOverlayEntryProviderKt$lambda$380279998$1() {
        super(3);
    }

    public final void invoke(HatchCheckpointOverlayScreenKey hatchCheckpointOverlayScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            HatchCheckpointOverlayKt.HatchCheckpointOverlayContent(null, bfm, 0, 1);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(HatchCheckpointOverlayScreenKey hatchCheckpointOverlayScreenKey, BFM bfm, Integer num) {
        invoke(hatchCheckpointOverlayScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
