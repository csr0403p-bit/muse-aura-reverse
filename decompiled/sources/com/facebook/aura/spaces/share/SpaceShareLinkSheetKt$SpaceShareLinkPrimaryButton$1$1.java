package com.facebook.aura.spaces.share;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class SpaceShareLinkSheetKt$SpaceShareLinkPrimaryButton$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ boolean $loading;
    public final /* synthetic */ Function0<Unit> $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceShareLinkSheetKt$SpaceShareLinkPrimaryButton$1$1(boolean z, boolean z2, Function0<Unit> function0) {
        super(0);
        this.$enabled = z;
        this.$loading = z2;
        this.$onClick = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (!this.$enabled || this.$loading) {
            return;
        }
        this.$onClick.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
