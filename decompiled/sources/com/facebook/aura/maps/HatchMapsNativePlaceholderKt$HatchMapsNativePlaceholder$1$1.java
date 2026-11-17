package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.voltron.api.ActionQueryCalculator$UndefinedModuleException;

/* loaded from: classes3.dex */
public final class HatchMapsNativePlaceholderKt$HatchMapsNativePlaceholder$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public static final HatchMapsNativePlaceholderKt$HatchMapsNativePlaceholder$1$1 INSTANCE = new HatchMapsNativePlaceholderKt$HatchMapsNativePlaceholder$1$1();

    public HatchMapsNativePlaceholderKt$HatchMapsNativePlaceholder$1$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final C78g invoke2(C0Yr c0Yr) throws ActionQueryCalculator$UndefinedModuleException {
        HatchMapsNativeModule.INSTANCE.load();
        return new HatchMapsNativePlaceholderKt$HatchMapsNativePlaceholder$1$1$invoke$$inlined$onDispose$1();
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C78g invoke(C0Yr c0Yr) throws ActionQueryCalculator$UndefinedModuleException {
        HatchMapsNativeModule.INSTANCE.load();
        return new HatchMapsNativePlaceholderKt$HatchMapsNativePlaceholder$1$1$invoke$$inlined$onDispose$1();
    }
}
