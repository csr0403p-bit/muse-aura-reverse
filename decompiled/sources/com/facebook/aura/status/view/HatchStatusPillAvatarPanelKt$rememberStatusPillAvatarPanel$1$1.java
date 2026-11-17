package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusPillAvatarPanelKt$rememberStatusPillAvatarPanel$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Float $dragProgress;
    public final /* synthetic */ float[] $releasedAt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillAvatarPanelKt$rememberStatusPillAvatarPanel$1$1(Float f, float[] fArr) {
        super(0);
        this.$dragProgress = f;
        this.$releasedAt = fArr;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Float f = this.$dragProgress;
        if (f != null) {
            this.$releasedAt[0] = f.floatValue();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
