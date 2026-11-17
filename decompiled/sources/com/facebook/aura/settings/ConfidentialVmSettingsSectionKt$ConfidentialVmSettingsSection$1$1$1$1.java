package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.G0V;
import com.facebook.aura.vds.compose.header.AuraSectionHeaderKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ConfidentialVmSettingsSectionKt$ConfidentialVmSettingsSection$1$1$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmSettingsSectionKt$ConfidentialVmSettingsSection$1$1$1$1(String str) {
        super(2);
        this.$it = str;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AuraSectionHeaderKt.AuraSectionHeader(this.$it, null, null, bfm, 48, 4);
        } else {
            bfm.Afo();
        }
    }
}
