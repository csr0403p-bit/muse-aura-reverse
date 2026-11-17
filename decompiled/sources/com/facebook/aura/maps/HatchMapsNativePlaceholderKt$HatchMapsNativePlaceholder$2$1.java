package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import com.facebook.voltron.api.ActionQueryCalculator$UndefinedModuleException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchMapsNativePlaceholderKt$HatchMapsNativePlaceholder$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public static final HatchMapsNativePlaceholderKt$HatchMapsNativePlaceholder$2$1 INSTANCE = new HatchMapsNativePlaceholderKt$HatchMapsNativePlaceholder$2$1();

    public HatchMapsNativePlaceholderKt$HatchMapsNativePlaceholder$2$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() throws ActionQueryCalculator$UndefinedModuleException {
        HatchMapsNativeModule.INSTANCE.load();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() throws ActionQueryCalculator$UndefinedModuleException {
        HatchMapsNativeModule.INSTANCE.load();
    }
}
