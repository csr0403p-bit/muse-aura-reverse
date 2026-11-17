package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.navigation.key.VmReconnectConfirmSheetKey;
import com.facebook.aura.vmdisabled.content.VmRecoverySheetsKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$VmDisabledEntryProviderKt$lambda$345039729$1 extends AbstractC7559F3s implements G0W<VmReconnectConfirmSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$VmDisabledEntryProviderKt$lambda$345039729$1 INSTANCE = new ComposableSingletons$VmDisabledEntryProviderKt$lambda$345039729$1();

    public ComposableSingletons$VmDisabledEntryProviderKt$lambda$345039729$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(VmReconnectConfirmSheetKey vmReconnectConfirmSheetKey, BFM bfm, Integer num) {
        invoke(vmReconnectConfirmSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(VmReconnectConfirmSheetKey vmReconnectConfirmSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(vmReconnectConfirmSheetKey, 0);
        VmRecoverySheetsKt.VmReconnectSheetRoute(vmReconnectConfirmSheetKey.flowType, vmReconnectConfirmSheetKey.preview, null, bfm, 0, 4);
    }
}
