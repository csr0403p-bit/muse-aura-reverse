package com.facebook.aura.skills.view;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass007;
import X.BFM;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.input.AuraTextInputDefaults;
import kotlin.Unit;

/* renamed from: com.facebook.aura.skills.view.ComposableSingletons$HatchConnectorSearchScreenKt$lambda$-356070869$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$HatchConnectorSearchScreenKt$lambda$356070869$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchConnectorSearchScreenKt$lambda$356070869$1 INSTANCE = new ComposableSingletons$HatchConnectorSearchScreenKt$lambda$356070869$1();

    public ComposableSingletons$HatchConnectorSearchScreenKt$lambda$356070869$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            AnonymousClass007.A13(bfm, AuraTextInputDefaults.INSTANCE, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e88));
        } else {
            bfm.Afo();
        }
    }
}
