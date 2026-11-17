package com.facebook.aura.settings;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.app.Activity;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.settings.HatchDataPrivacySettingsViewModel$resetHatch$1$3$2", f = "HatchDataPrivacySettingsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchDataPrivacySettingsViewModel$resetHatch$1$3$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Activity $activity;
    public int label;
    public final /* synthetic */ HatchDataPrivacySettingsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDataPrivacySettingsViewModel$resetHatch$1$3$2(HatchDataPrivacySettingsViewModel hatchDataPrivacySettingsViewModel, Activity activity, HtJ<? super HatchDataPrivacySettingsViewModel$resetHatch$1$3$2> htJ) {
        super(2, htJ);
        this.this$0 = hatchDataPrivacySettingsViewModel;
        this.$activity = activity;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchDataPrivacySettingsViewModel$resetHatch$1$3$2(this.this$0, this.$activity, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        HatchGatewayPrefsStore.Companion.getInstance(this.this$0.userSession).clearVMForFullReset(this.$activity, "Reset Hatch");
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchDataPrivacySettingsViewModel$resetHatch$1$3$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
