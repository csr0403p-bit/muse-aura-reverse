package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class NativeLoginPicker$showRememberedMuseProfiles$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Map<String, HatchMuseProfile> $rememberedMuseProfiles;
    public final /* synthetic */ NativeLoginPicker<S, D> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginPicker$showRememberedMuseProfiles$1$1(NativeLoginPicker<S, D> nativeLoginPicker, Map<String, HatchMuseProfile> map) {
        super(0);
        this.this$0 = nativeLoginPicker;
        this.$rememberedMuseProfiles = map;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.rememberedMuseProfiles = this.$rememberedMuseProfiles;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
