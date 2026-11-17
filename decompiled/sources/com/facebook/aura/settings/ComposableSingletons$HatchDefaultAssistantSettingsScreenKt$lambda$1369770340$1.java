package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C07C;
import X.C10G;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$HatchDefaultAssistantSettingsScreenKt$lambda$1369770340$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchDefaultAssistantSettingsScreenKt$lambda$1369770340$1 INSTANCE = new ComposableSingletons$HatchDefaultAssistantSettingsScreenKt$lambda$1369770340$1();

    public ComposableSingletons$HatchDefaultAssistantSettingsScreenKt$lambda$1369770340$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            HatchDefaultAssistantSettingsScreenKt.DefaultAssistantSideChatToggle(C10G.A02, bfm, 6, 0);
        } else {
            bfm.Afo();
        }
    }
}
