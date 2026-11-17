package com.facebook.aura.appappearance;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.appappearance.HatchAppAppearanceSettingsScreenKt$ChatThemeSection$1$1", f = "HatchAppAppearanceSettingsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchAppAppearanceSettingsScreenKt$ChatThemeSection$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HatchIdentityProvider $identityProvider;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAppAppearanceSettingsScreenKt$ChatThemeSection$1$1(HatchIdentityProvider hatchIdentityProvider, HtJ<? super HatchAppAppearanceSettingsScreenKt$ChatThemeSection$1$1> htJ) {
        super(2, htJ);
        this.$identityProvider = hatchIdentityProvider;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAppAppearanceSettingsScreenKt$ChatThemeSection$1$1(this.$identityProvider, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        this.$identityProvider.ensureChatThemesFetched();
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new HatchAppAppearanceSettingsScreenKt$ChatThemeSection$1$1(this.$identityProvider, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
