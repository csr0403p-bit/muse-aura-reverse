package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C1805ArO;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchTelegramSettingsScreenKt$TelegramOnboardingContent$2$1$1 extends AbstractC7559F3s implements G0U<C1805ArO, Unit> {
    public final /* synthetic */ MutableState<C1805ArO> $tokenValue$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C1805ArO c1805ArO) {
        C7384Etj.A0Y(c1805ArO, 0);
        this.$tokenValue$delegate.Af8(c1805ArO);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTelegramSettingsScreenKt$TelegramOnboardingContent$2$1$1(MutableState<C1805ArO> mutableState) {
        super(1);
        this.$tokenValue$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C1805ArO c1805ArO) {
        invoke2(c1805ArO);
        return Unit.INSTANCE;
    }
}
