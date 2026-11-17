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
public final class HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$4$1$2$1$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $passwordLabel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$4$1$2$1$3(String str) {
        super(2);
        this.$passwordLabel = str;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            AuraTextInputDefaults auraTextInputDefaults = AuraTextInputDefaults.INSTANCE;
            String strA01 = this.$passwordLabel;
            if (strA01 == null) {
                bfm.AgE(1776142336);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ea8);
            } else {
                bfm.AgE(1776140879);
            }
            AnonymousClass001.A1D(bfm);
            AnonymousClass007.A13(bfm, auraTextInputDefaults, strA01);
            return;
        }
        bfm.Afo();
    }
}
