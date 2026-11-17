package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import com.facebook.aura.skills.repo.RecipientPermission;
import com.facebook.aura.skills.viewmodel.RecipientPermissionsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchRecipientPermissionsScreenKt$HatchRecipientPermissionsScreen$2$1$1$2$2$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $connectorId;
    public final /* synthetic */ RecipientPermission $permission;
    public final /* synthetic */ RecipientPermissionsViewModel $recipientPermissionsViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRecipientPermissionsScreenKt$HatchRecipientPermissionsScreen$2$1$1$2$2$1$1$1$1(RecipientPermission recipientPermission, String str, RecipientPermissionsViewModel recipientPermissionsViewModel) {
        super(0);
        this.$permission = recipientPermission;
        this.$connectorId = str;
        this.$recipientPermissionsViewModel = recipientPermissionsViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchRecipientPermissionsScreenKt.logRecipientPermissionRevokeClick(this.$permission, this.$connectorId);
        this.$recipientPermissionsViewModel.revoke(this.$permission);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
