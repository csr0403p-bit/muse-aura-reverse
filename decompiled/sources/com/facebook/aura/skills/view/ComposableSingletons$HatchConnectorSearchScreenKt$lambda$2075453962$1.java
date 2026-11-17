package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0V;
import com.facebook.aura.vds.compose.input.AuraTextInputDefaults;
import kotlin.Unit;

/* renamed from: com.facebook.aura.skills.view.ComposableSingletons$HatchConnectorSearchScreenKt$lambda$-2075453962$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$HatchConnectorSearchScreenKt$lambda$2075453962$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchConnectorSearchScreenKt$lambda$2075453962$1 INSTANCE = new ComposableSingletons$HatchConnectorSearchScreenKt$lambda$2075453962$1();

    public ComposableSingletons$HatchConnectorSearchScreenKt$lambda$2075453962$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            AuraTextInputDefaults.INSTANCE.LeadingSearchIcon(null, bfm, 48, 1);
        } else {
            bfm.Afo();
        }
    }
}
