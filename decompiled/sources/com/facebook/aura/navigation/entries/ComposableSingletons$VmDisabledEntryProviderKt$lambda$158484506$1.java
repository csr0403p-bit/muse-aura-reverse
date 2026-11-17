package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.navigation.key.VmLearnMoreSheetKey;
import com.facebook.aura.vmdisabled.content.VmRecoverySheetsKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$VmDisabledEntryProviderKt$lambda$-158484506$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$VmDisabledEntryProviderKt$lambda$158484506$1 extends AbstractC7559F3s implements G0W<VmLearnMoreSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$VmDisabledEntryProviderKt$lambda$158484506$1 INSTANCE = new ComposableSingletons$VmDisabledEntryProviderKt$lambda$158484506$1();

    public ComposableSingletons$VmDisabledEntryProviderKt$lambda$158484506$1() {
        super(3);
    }

    public final void invoke(VmLearnMoreSheetKey vmLearnMoreSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(vmLearnMoreSheetKey, 0);
        VmRecoverySheetsKt.VmLearnMoreSheetRoute(vmLearnMoreSheetKey.flowType, null, bfm, 0, 2);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(VmLearnMoreSheetKey vmLearnMoreSheetKey, BFM bfm, Integer num) {
        invoke(vmLearnMoreSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
