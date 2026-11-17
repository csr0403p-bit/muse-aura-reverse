package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C07C;
import X.G0W;
import kotlin.Unit;

/* renamed from: com.facebook.aura.settings.ComposableSingletons$HatchDataPrivacySettingsScreenKt$lambda$-400081326$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$HatchDataPrivacySettingsScreenKt$lambda$400081326$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchDataPrivacySettingsScreenKt$lambda$400081326$1 INSTANCE = new ComposableSingletons$HatchDataPrivacySettingsScreenKt$lambda$400081326$1();

    public ComposableSingletons$HatchDataPrivacySettingsScreenKt$lambda$400081326$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            HatchDataPrivacySettingsScreenKt.PrivacyNoticeCard(null, bfm, 0, 1);
        } else {
            bfm.Afo();
        }
    }
}
