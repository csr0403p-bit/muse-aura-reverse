package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.StatusSettingsScreenKey;
import com.facebook.aura.utils.HatchUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusPillKt$StatusPillContent$2$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillKt$StatusPillContent$2$3$1(AuraNavigator auraNavigator, Function0<Unit> function0) {
        super(0);
        this.$navigator = auraNavigator;
        this.$onClick = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (HatchUtil.INSTANCE.isViewerEmployee()) {
            this.$navigator.navigate((AuraNavKey) StatusSettingsScreenKey.INSTANCE, false);
        } else {
            this.$onClick.invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
