package com.facebook.aura.composer.camera;

import X.AbstractC7559F3s;
import X.G0U;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchInAppCameraKt$rememberHatchInAppCameraLauncher$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<G0U<? super File, Unit>, Unit> $launch;
    public final /* synthetic */ G0U<File, Unit> $onPhotoCaptured;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchInAppCameraKt$rememberHatchInAppCameraLauncher$1$1(G0U<? super G0U<? super File, Unit>, Unit> g0u, G0U<? super File, Unit> g0u2) {
        super(0);
        this.$launch = g0u;
        this.$onPhotoCaptured = g0u2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$launch.invoke(this.$onPhotoCaptured);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
