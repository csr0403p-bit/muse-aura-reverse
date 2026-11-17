package com.facebook.aura.spaces.share;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavigator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$closeSheet$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AtomicBoolean $buttonClosed;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$closeSheet$1$1(AtomicBoolean atomicBoolean, AuraNavigator auraNavigator) {
        super(0);
        this.$buttonClosed = atomicBoolean;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$buttonClosed.set(true);
        this.$navigator.back();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
