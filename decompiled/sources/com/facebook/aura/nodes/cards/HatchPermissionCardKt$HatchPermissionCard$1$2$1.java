package com.facebook.aura.nodes.cards;

import X.AbstractC7559F3s;
import X.G0U;
import android.content.Context;
import com.facebook.aura.navigation.key.PermissionDestination;
import com.facebook.aura.utils.HatchPermissionUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchPermissionCardKt$HatchPermissionCard$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ PermissionDestination $destination;
    public final /* synthetic */ G0U<PermissionDestination, Unit> $managePermission;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchPermissionCardKt$HatchPermissionCard$1$2$1(PermissionDestination permissionDestination, G0U<? super PermissionDestination, Unit> g0u, Context context) {
        super(0);
        this.$destination = permissionDestination;
        this.$managePermission = g0u;
        this.$context = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        PermissionDestination permissionDestination = this.$destination;
        if (permissionDestination != null) {
            this.$managePermission.invoke(permissionDestination);
        } else {
            HatchPermissionUtils.INSTANCE.openAppSettings(this.$context);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
