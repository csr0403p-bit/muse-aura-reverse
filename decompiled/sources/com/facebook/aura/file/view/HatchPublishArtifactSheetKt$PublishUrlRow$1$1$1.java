package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C0dx;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchPublishArtifactSheetKt$PublishUrlRow$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C0dx $haptics;
    public final /* synthetic */ Function0<Unit> $onCopy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPublishArtifactSheetKt$PublishUrlRow$1$1$1(Function0<Unit> function0, C0dx c0dx) {
        super(0);
        this.$onCopy = function0;
        this.$haptics = c0dx;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onCopy.invoke();
        this.$haptics.AXr(AuraHaptics.SUCCESS);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
