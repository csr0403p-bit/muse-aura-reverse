package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.HatchPausedOverlayScreenKey;
import com.facebook.aura.pause.HatchPausedOverlayKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$HatchPausedOverlayEntryProviderKt$lambda$1781879052$1 extends AbstractC7559F3s implements G0W<HatchPausedOverlayScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchPausedOverlayEntryProviderKt$lambda$1781879052$1 INSTANCE = new ComposableSingletons$HatchPausedOverlayEntryProviderKt$lambda$1781879052$1();

    public ComposableSingletons$HatchPausedOverlayEntryProviderKt$lambda$1781879052$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(HatchPausedOverlayScreenKey hatchPausedOverlayScreenKey, BFM bfm, Integer num) {
        invoke(hatchPausedOverlayScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(HatchPausedOverlayScreenKey hatchPausedOverlayScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            HatchPausedOverlayKt.HatchPausedOverlayContent(bfm, 0);
        } else {
            bfm.Afo();
        }
    }
}
