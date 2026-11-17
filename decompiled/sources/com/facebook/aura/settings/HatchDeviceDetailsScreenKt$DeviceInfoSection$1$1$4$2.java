package com.facebook.aura.settings;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C07C;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.nodes.json.NodeListEntry;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchDeviceDetailsScreenKt$DeviceInfoSection$1$1$4$2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ NodeListEntry $linkDevice;
    public final /* synthetic */ String $naText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDeviceDetailsScreenKt$DeviceInfoSection$1$1$4$2(NodeListEntry nodeListEntry, String str) {
        super(3);
        this.$linkDevice = nodeListEntry;
        this.$naText = str;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            String strA01 = AbstractC2271BQs.A01(bfm, R.string.device_details_firmware);
            String str = this.$linkDevice.version;
            if (str.length() == 0) {
                str = this.$naText;
            }
            HatchDeviceDetailsScreenKt.HatchSettingsValueRow(strA01, str, null, null, bfm, 0, 12);
            return;
        }
        bfm.Afo();
    }
}
