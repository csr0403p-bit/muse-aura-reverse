package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$openCamera$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $isDictating;
    public final /* synthetic */ Function0<Unit> $launchCamera;
    public final /* synthetic */ Function0<Unit> $onEndDictation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$openCamera$1$1(boolean z, Function0<Unit> function0, Function0<Unit> function02) {
        super(0);
        this.$isDictating = z;
        this.$onEndDictation = function0;
        this.$launchCamera = function02;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$isDictating) {
            this.$onEndDictation.invoke();
        }
        Function0<Unit> function0 = this.$launchCamera;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
