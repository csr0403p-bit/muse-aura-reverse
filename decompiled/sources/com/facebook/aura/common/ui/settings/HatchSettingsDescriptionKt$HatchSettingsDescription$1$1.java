package com.facebook.aura.common.ui.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSettingsDescriptionKt$HatchSettingsDescription$1$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ Function0<Unit> $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSettingsDescriptionKt$HatchSettingsDescription$1$1(Function0<Unit> function0) {
        super(1);
        this.$onClick = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        AnonymousClass005.A0w(num);
        this.$onClick.invoke();
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        this.$onClick.invoke();
    }
}
