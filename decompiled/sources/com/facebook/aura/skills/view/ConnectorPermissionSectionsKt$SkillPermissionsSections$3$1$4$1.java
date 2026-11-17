package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.skills.viewmodel.SkillPermissionMethodUiModel;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ConnectorPermissionSectionsKt$SkillPermissionsSections$3$1$4$1 extends AbstractC7559F3s implements G0U<SkillPermissionMethodUiModel, Unit> {
    public final /* synthetic */ G0U<String, Unit> $requestAdditionalAccess;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SkillPermissionMethodUiModel skillPermissionMethodUiModel) {
        C7384Etj.A0Y(skillPermissionMethodUiModel, 0);
        this.$requestAdditionalAccess.invoke(skillPermissionMethodUiModel.key);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectorPermissionSectionsKt$SkillPermissionsSections$3$1$4$1(G0U<? super String, Unit> g0u) {
        super(1);
        this.$requestAdditionalAccess = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(SkillPermissionMethodUiModel skillPermissionMethodUiModel) {
        invoke2(skillPermissionMethodUiModel);
        return Unit.INSTANCE;
    }
}
