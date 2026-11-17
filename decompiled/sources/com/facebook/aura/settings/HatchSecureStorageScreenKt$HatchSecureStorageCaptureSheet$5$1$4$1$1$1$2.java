package com.facebook.aura.settings;

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

/* loaded from: classes.dex */
public final class HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$4$1$1$1$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $usernameLabel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$4$1$1$1$2(String str) {
        super(2);
        this.$usernameLabel = str;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            AuraTextInputDefaults auraTextInputDefaults = AuraTextInputDefaults.INSTANCE;
            String strA01 = this.$usernameLabel;
            if (strA01 == null) {
                bfm.AgE(-574406313);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120eb8);
            } else {
                bfm.AgE(-574407770);
            }
            AnonymousClass001.A1D(bfm);
            AnonymousClass007.A13(bfm, auraTextInputDefaults, strA01);
            return;
        }
        bfm.Afo();
    }
}
