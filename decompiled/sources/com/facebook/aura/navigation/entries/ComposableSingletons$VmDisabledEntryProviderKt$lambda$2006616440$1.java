package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.key.VmResetConfirmSheetKey;
import com.facebook.aura.settings.ResetConfirmSheetKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$VmDisabledEntryProviderKt$lambda$-2006616440$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$VmDisabledEntryProviderKt$lambda$2006616440$1 extends AbstractC7559F3s implements G0W<VmResetConfirmSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$VmDisabledEntryProviderKt$lambda$2006616440$1 INSTANCE = new ComposableSingletons$VmDisabledEntryProviderKt$lambda$2006616440$1();

    public ComposableSingletons$VmDisabledEntryProviderKt$lambda$2006616440$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(VmResetConfirmSheetKey vmResetConfirmSheetKey, BFM bfm, Integer num) {
        invoke(vmResetConfirmSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(VmResetConfirmSheetKey vmResetConfirmSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(vmResetConfirmSheetKey, 0);
        ResetConfirmSheetKt.ResetConfirmSheet(HatchSurface.VM_DISCONNECTED, null, vmResetConfirmSheetKey.preview, bfm, 6, 2);
    }
}
