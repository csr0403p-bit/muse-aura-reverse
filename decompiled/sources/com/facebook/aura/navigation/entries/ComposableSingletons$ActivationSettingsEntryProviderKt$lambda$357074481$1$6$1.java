package com.facebook.aura.navigation.entries;

import X.AnonymousClass001;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.vmavailability.VmUnavailableViewModel;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class ComposableSingletons$ActivationSettingsEntryProviderKt$lambda$357074481$1$6$1 extends C7438Evz implements G0U<Boolean, Unit> {
    public ComposableSingletons$ActivationSettingsEntryProviderKt$lambda$357074481$1$6$1(Object obj) {
        super(1, obj, VmUnavailableViewModel.class, "onSettingsVisibilityChanged", "onSettingsVisibilityChanged(Z)V", 0);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((VmUnavailableViewModel) this.receiver).onSettingsVisibilityChanged(z);
    }
}
