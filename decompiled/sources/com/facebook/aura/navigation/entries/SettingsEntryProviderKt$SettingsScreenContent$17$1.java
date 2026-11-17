package com.facebook.aura.navigation.entries;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.logout.accountcenter.AuraAccountCenterSessionValidator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.navigation.entries.SettingsEntryProviderKt$SettingsScreenContent$17$1", f = "SettingsEntryProvider.kt", l = {113}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class SettingsEntryProviderKt$SettingsScreenContent$17$1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
    public int label;

    public SettingsEntryProviderKt$SettingsScreenContent$17$1(HtJ<? super SettingsEntryProviderKt$SettingsScreenContent$17$1> htJ) {
        super(1, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new SettingsEntryProviderKt$SettingsScreenContent$17$1(htJ);
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super Unit> htJ) {
        return new SettingsEntryProviderKt$SettingsScreenContent$17$1(htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AuraAccountCenterSessionValidator auraAccountCenterSessionValidator = AuraAccountCenterSessionValidator.INSTANCE;
            this.label = 1;
            if (auraAccountCenterSessionValidator.validateSession(this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }
}
