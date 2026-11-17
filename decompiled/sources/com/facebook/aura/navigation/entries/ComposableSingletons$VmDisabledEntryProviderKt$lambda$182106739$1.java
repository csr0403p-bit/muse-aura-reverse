package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.VmDisabledOverlayScreenKey;
import com.facebook.aura.vmdisabled.content.VmDisabledOverlayContentKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$VmDisabledEntryProviderKt$lambda$182106739$1 extends AbstractC7559F3s implements G0W<VmDisabledOverlayScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$VmDisabledEntryProviderKt$lambda$182106739$1 INSTANCE = new ComposableSingletons$VmDisabledEntryProviderKt$lambda$182106739$1();

    public ComposableSingletons$VmDisabledEntryProviderKt$lambda$182106739$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(VmDisabledOverlayScreenKey vmDisabledOverlayScreenKey, BFM bfm, Integer num) {
        invoke(vmDisabledOverlayScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(VmDisabledOverlayScreenKey vmDisabledOverlayScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            VmDisabledOverlayContentKt.VmDisabledOverlayContent(null, bfm, 0, 1);
        } else {
            bfm.Afo();
        }
    }
}
