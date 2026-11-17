package com.facebook.aura.skills.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.skills.repo.RecipientPermission;
import com.facebook.aura.skills.viewmodel.RecipientPermissionGroup;
import com.facebook.aura.skills.viewmodel.RecipientPermissionsUiState;
import com.facebook.aura.skills.viewmodel.RecipientPermissionsViewModel;
import com.facebook.aura.ui.HatchLazySectionScope;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchRecipientPermissionsScreenKt$HatchRecipientPermissionsScreen$2$1$1$2$2 extends AbstractC7559F3s implements G0U<HatchLazySectionScope, Unit> {
    public final /* synthetic */ String $connectorId;
    public final /* synthetic */ String $connectorName;
    public final /* synthetic */ RecipientPermissionGroup $group;
    public final /* synthetic */ RecipientPermissionsViewModel $recipientPermissionsViewModel;
    public final /* synthetic */ C1BO<RecipientPermissionsUiState> $state$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchLazySectionScope hatchLazySectionScope) {
        C7384Etj.A0Y(hatchLazySectionScope, 0);
        AHD<RecipientPermission> ahd = this.$group.permissions;
        String str = this.$connectorId;
        String str2 = this.$connectorName;
        RecipientPermissionsViewModel recipientPermissionsViewModel = this.$recipientPermissionsViewModel;
        C1BO<RecipientPermissionsUiState> c1bo = this.$state$delegate;
        for (RecipientPermission recipientPermission : ahd) {
            hatchLazySectionScope.item(recipientPermission.permissionId, null, AnonymousClass001.A0M(new HatchRecipientPermissionsScreenKt$HatchRecipientPermissionsScreen$2$1$1$2$2$1$1(recipientPermission, str, str2, recipientPermissionsViewModel, c1bo), 945835418));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRecipientPermissionsScreenKt$HatchRecipientPermissionsScreen$2$1$1$2$2(RecipientPermissionGroup recipientPermissionGroup, String str, String str2, RecipientPermissionsViewModel recipientPermissionsViewModel, C1BO<RecipientPermissionsUiState> c1bo) {
        super(1);
        this.$group = recipientPermissionGroup;
        this.$connectorId = str;
        this.$connectorName = str2;
        this.$recipientPermissionsViewModel = recipientPermissionsViewModel;
        this.$state$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchLazySectionScope hatchLazySectionScope) {
        invoke2(hatchLazySectionScope);
        return Unit.INSTANCE;
    }
}
