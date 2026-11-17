package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.C10G;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.common.AuraDrawableSourceResource;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.settings.ComposableSingletons$HatchMessengerSettingsScreenKt$lambda$-306314587$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$HatchMessengerSettingsScreenKt$lambda$306314587$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchMessengerSettingsScreenKt$lambda$306314587$1 INSTANCE = new ComposableSingletons$HatchMessengerSettingsScreenKt$lambda$306314587$1();

    public ComposableSingletons$HatchMessengerSettingsScreenKt$lambda$306314587$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AuraImageKt.AuraImage(new AuraDrawableSourceResource(R.drawable.app_icon_messenger_squircle), C10G.A07(BRg.A00, 56.0f), null, null, false, false, null, false, null, bfm, 432, 504);
        } else {
            bfm.Afo();
        }
    }
}
