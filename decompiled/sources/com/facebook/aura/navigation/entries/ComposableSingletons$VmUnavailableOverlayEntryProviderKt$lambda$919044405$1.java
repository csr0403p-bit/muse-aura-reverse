package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.VmUnavailableOverlayScreenKey;
import com.facebook.aura.vmavailability.content.VmUnavailableOverlayContentKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$VmUnavailableOverlayEntryProviderKt$lambda$-919044405$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$VmUnavailableOverlayEntryProviderKt$lambda$919044405$1 extends AbstractC7559F3s implements G0W<VmUnavailableOverlayScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$VmUnavailableOverlayEntryProviderKt$lambda$919044405$1 INSTANCE = new ComposableSingletons$VmUnavailableOverlayEntryProviderKt$lambda$919044405$1();

    public ComposableSingletons$VmUnavailableOverlayEntryProviderKt$lambda$919044405$1() {
        super(3);
    }

    public final void invoke(VmUnavailableOverlayScreenKey vmUnavailableOverlayScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            VmUnavailableOverlayContentKt.VmUnavailableOverlayContent(null, bfm, 0, 1);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(VmUnavailableOverlayScreenKey vmUnavailableOverlayScreenKey, BFM bfm, Integer num) {
        invoke(vmUnavailableOverlayScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
