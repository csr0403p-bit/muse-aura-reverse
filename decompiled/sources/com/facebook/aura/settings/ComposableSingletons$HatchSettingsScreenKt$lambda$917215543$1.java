package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C07C;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$HatchSettingsScreenKt$lambda$917215543$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchSettingsScreenKt$lambda$917215543$1 INSTANCE = new ComposableSingletons$HatchSettingsScreenKt$lambda$917215543$1();

    public ComposableSingletons$HatchSettingsScreenKt$lambda$917215543$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            HatchPasswordsScreenKt.PasswordsSettingsRow(null, bfm, 0, 1);
        } else {
            bfm.Afo();
        }
    }
}
