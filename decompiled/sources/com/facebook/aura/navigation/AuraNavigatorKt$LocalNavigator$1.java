package com.facebook.aura.navigation;

import X.AbstractC7559F3s;
import X.F60;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraNavigatorKt$LocalNavigator$1 extends AbstractC7559F3s implements Function0<AuraNavigator> {
    public static final AuraNavigatorKt$LocalNavigator$1 INSTANCE = new AuraNavigatorKt$LocalNavigator$1();

    public AuraNavigatorKt$LocalNavigator$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AuraNavigator invoke() {
        throw new IllegalStateException("CompositionLocal not set for AuraNavigator");
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ AuraNavigator invoke() {
        invoke();
        throw F60.createAndThrow();
    }
}
