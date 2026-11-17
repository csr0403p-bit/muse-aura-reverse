package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C1BO;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import com.facebook.aura.skills.repo.RecipientPermission;
import com.facebook.aura.skills.viewmodel.RecipientPermissionsUiState;
import com.facebook.aura.skills.viewmodel.RecipientPermissionsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchRecipientPermissionsScreenKt$HatchRecipientPermissionsScreen$2$1$1$2$2$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $connectorId;
    public final /* synthetic */ String $connectorName;
    public final /* synthetic */ RecipientPermission $permission;
    public final /* synthetic */ RecipientPermissionsViewModel $recipientPermissionsViewModel;
    public final /* synthetic */ C1BO<RecipientPermissionsUiState> $state$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRecipientPermissionsScreenKt$HatchRecipientPermissionsScreen$2$1$1$2$2$1$1(RecipientPermission recipientPermission, String str, String str2, RecipientPermissionsViewModel recipientPermissionsViewModel, C1BO<RecipientPermissionsUiState> c1bo) {
        super(2);
        this.$permission = recipientPermission;
        this.$connectorId = str;
        this.$connectorName = str2;
        this.$recipientPermissionsViewModel = recipientPermissionsViewModel;
        this.$state$delegate = c1bo;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            RecipientPermission recipientPermission = this.$permission;
            String str = this.$connectorId;
            String str2 = this.$connectorName;
            if (!this.$state$delegate.getValue().isLoading && this.$state$delegate.getValue().revokingPermissionId == null) {
                z = true;
            }
            boolean zAreEqual = C7384Etj.areEqual(this.$state$delegate.getValue().revokingPermissionId, this.$permission.permissionId);
            boolean zAreEqual2 = C7384Etj.areEqual(this.$state$delegate.getValue().failedRevokePermissionId, this.$permission.permissionId);
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$recipientPermissionsViewModel, AnonymousClass001.A1R(bfm, this.$connectorId, bfm.A67(this.$permission)));
            RecipientPermission recipientPermission2 = this.$permission;
            String str3 = this.$connectorId;
            RecipientPermissionsViewModel recipientPermissionsViewModel = this.$recipientPermissionsViewModel;
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new HatchRecipientPermissionsScreenKt$HatchRecipientPermissionsScreen$2$1$1$2$2$1$1$1$1(recipientPermission2, str3, recipientPermissionsViewModel);
                bfm.Ai0(objAaT);
            }
            HatchRecipientPermissionsScreenKt.RecipientPermissionRow(recipientPermission, str, str2, z, zAreEqual, zAreEqual2, (Function0) objAaT, null, bfm, 0, 128);
            return;
        }
        bfm.Afo();
    }
}
