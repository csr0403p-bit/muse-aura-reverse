package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.skills.viewmodel.SkillPermissionMethodUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectorPermissionSectionsKt$SkillPermissionGroupSection$1$1$1$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ SkillPermissionMethodUiModel $method;
    public final /* synthetic */ G0U<String, Unit> $onMenuRequested;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectorPermissionSectionsKt$SkillPermissionGroupSection$1$1$1$1$2$1(G0U<? super String, Unit> g0u, SkillPermissionMethodUiModel skillPermissionMethodUiModel) {
        super(0);
        this.$onMenuRequested = g0u;
        this.$method = skillPermissionMethodUiModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onMenuRequested.invoke(this.$method.key);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
