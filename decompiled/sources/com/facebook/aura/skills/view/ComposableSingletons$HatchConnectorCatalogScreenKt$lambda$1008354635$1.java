package com.facebook.aura.skills.view;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass037;
import X.BFM;
import X.BRg;
import X.C3U4;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.skills.view.ComposableSingletons$HatchConnectorCatalogScreenKt$lambda$-1008354635$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$HatchConnectorCatalogScreenKt$lambda$1008354635$1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchConnectorCatalogScreenKt$lambda$1008354635$1 INSTANCE = new ComposableSingletons$HatchConnectorCatalogScreenKt$lambda$1008354635$1();

    public ComposableSingletons$HatchConnectorCatalogScreenKt$lambda$1008354635$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
        invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            HatchConnectorCatalogComponentsKt.ConnectorCatalogSectionHeader(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ad8), C3U4.A04(BRg.A00, AuraDimensKt.SpacingMedium), null, bfm, 0, 4);
        } else {
            bfm.Afo();
        }
    }
}
