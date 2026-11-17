package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass007;
import X.BFM;
import X.BOf;
import X.C06G;
import X.C08R;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$HatchPermissionsSettingsScreenKt$lambda$206825769$1 extends AbstractC7559F3s implements G0W<C08R, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchPermissionsSettingsScreenKt$lambda$206825769$1 INSTANCE = new ComposableSingletons$HatchPermissionsSettingsScreenKt$lambda$206825769$1();

    public ComposableSingletons$HatchPermissionsSettingsScreenKt$lambda$206825769$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C08R c08r, BFM bfm, Integer num) {
        invoke(c08r, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C08R c08r, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            AnonymousClass007.A0z(bfm, BOf.A00(bfm, R.drawable.aura_check, 0), AuraIconSize.SMALL, C06G.A0C(bfm));
        } else {
            bfm.Afo();
        }
    }
}
