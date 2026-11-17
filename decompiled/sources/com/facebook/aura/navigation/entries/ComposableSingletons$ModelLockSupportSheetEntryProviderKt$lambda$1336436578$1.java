package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0W;
import com.facebook.aura.conversation.view.HatchModelLockSupportSheetKt;
import com.facebook.aura.navigation.key.ModelLockSupportSheetKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$ModelLockSupportSheetEntryProviderKt$lambda$-1336436578$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ModelLockSupportSheetEntryProviderKt$lambda$1336436578$1 extends AbstractC7559F3s implements G0W<ModelLockSupportSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ModelLockSupportSheetEntryProviderKt$lambda$1336436578$1 INSTANCE = new ComposableSingletons$ModelLockSupportSheetEntryProviderKt$lambda$1336436578$1();

    public ComposableSingletons$ModelLockSupportSheetEntryProviderKt$lambda$1336436578$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ModelLockSupportSheetKey modelLockSupportSheetKey, BFM bfm, Integer num) {
        invoke(modelLockSupportSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(ModelLockSupportSheetKey modelLockSupportSheetKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            HatchModelLockSupportSheetKt.HatchModelLockSupportSheet(null, bfm, 0, 1);
        } else {
            bfm.Afo();
        }
    }
}
