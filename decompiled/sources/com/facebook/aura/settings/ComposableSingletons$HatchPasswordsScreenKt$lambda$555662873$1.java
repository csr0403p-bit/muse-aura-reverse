package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.card.AuraCardDefaults;
import com.facebook.aura.vds.compose.common.AuraDrawableSourceResource;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;

/* renamed from: com.facebook.aura.settings.ComposableSingletons$HatchPasswordsScreenKt$lambda$-555662873$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$HatchPasswordsScreenKt$lambda$555662873$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchPasswordsScreenKt$lambda$555662873$1 INSTANCE = new ComposableSingletons$HatchPasswordsScreenKt$lambda$555662873$1();

    public ComposableSingletons$HatchPasswordsScreenKt$lambda$555662873$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AuraCardDefaults.INSTANCE.m2480LeadingImagexqIIw2o(new AuraDrawableSourceResource(R.drawable.ic_onepassword_logo), null, null, null, bfm, RuntimeInternals.IOPRIO_BACKGROUND, 14);
        } else {
            bfm.Afo();
        }
    }
}
