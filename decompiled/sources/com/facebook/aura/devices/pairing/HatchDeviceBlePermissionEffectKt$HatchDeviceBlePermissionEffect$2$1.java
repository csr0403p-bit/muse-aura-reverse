package com.facebook.aura.devices.pairing;

import X.AbstractC7559F3s;
import X.C7OU;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchDeviceBlePermissionEffectKt$HatchDeviceBlePermissionEffect$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C7OU<String[], Map<String, Boolean>> $blePermissionLauncher;
    public final /* synthetic */ String[] $blePermissions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDeviceBlePermissionEffectKt$HatchDeviceBlePermissionEffect$2$1(C7OU<String[], Map<String, Boolean>> c7ou, String[] strArr) {
        super(0);
        this.$blePermissionLauncher = c7ou;
        this.$blePermissions = strArr;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        A01(null, this.$blePermissions);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
