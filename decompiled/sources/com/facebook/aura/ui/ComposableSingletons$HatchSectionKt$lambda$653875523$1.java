package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass037;
import X.BFM;
import X.G0W;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.base.ComponentsKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$HatchSectionKt$lambda$653875523$1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchSectionKt$lambda$653875523$1 INSTANCE = new ComposableSingletons$HatchSectionKt$lambda$653875523$1();

    public ComposableSingletons$HatchSectionKt$lambda$653875523$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
        invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            ComponentsKt.m2403AuraVerticalSpacer8Feqmps(AuraDimensKt.SpacingLargePlusMicro, bfm, 0);
        } else {
            bfm.Afo();
        }
    }
}
