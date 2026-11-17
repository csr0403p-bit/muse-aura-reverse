package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BFM;
import X.C07C;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.ui.HatchSectionScope;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7$4$1$1$4$1$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ CredentialAgentPermission $displayedAgentPermission;
    public final /* synthetic */ MutableState<CredentialAgentPermission> $editableAgentPermission$delegate;
    public final /* synthetic */ MutableState<Boolean> $isEditing$delegate;
    public final /* synthetic */ C1BO<SecureStorageCredentialDetailsUiState> $uiState$delegate;

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7$4$1$1$4$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ CredentialAgentPermission $displayedAgentPermission;
        public final /* synthetic */ MutableState<CredentialAgentPermission> $editableAgentPermission$delegate;
        public final /* synthetic */ MutableState<Boolean> $isEditing$delegate;
        public final /* synthetic */ C1BO<SecureStorageCredentialDetailsUiState> $uiState$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CredentialAgentPermission credentialAgentPermission, MutableState<CredentialAgentPermission> mutableState, MutableState<Boolean> mutableState2, C1BO<SecureStorageCredentialDetailsUiState> c1bo) {
            super(3);
            this.$displayedAgentPermission = credentialAgentPermission;
            this.$editableAgentPermission$delegate = mutableState;
            this.$isEditing$delegate = mutableState2;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.C07C r11, X.BFM r12, int r13) {
            /*
                r10 = this;
                r0 = r13 & 17
                r9 = 16
                r8 = 0
                boolean r0 = X.AnonymousClass002.A1P(r0, r9)
                r7 = r12
                boolean r0 = X.AnonymousClass001.A1b(r0, r12, r13)
                if (r0 == 0) goto L62
                r0 = 2131889807(0x7f120e8f, float:1.9414288E38)
                java.lang.String r2 = X.AbstractC2271BQs.A01(r12, r0)
                com.facebook.aura.settings.CredentialAgentPermission r1 = r10.$displayedAgentPermission
                com.facebook.aura.settings.CredentialAgentPermission r0 = com.facebook.aura.settings.CredentialAgentPermission.ALLOW_FOR_ORIGIN
                boolean r3 = X.AnonymousClass002.A1Z(r1, r0)
                androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r10.$isEditing$delegate
                boolean r0 = androidx.compose.runtime.MutableState.A0A(r0)
                if (r0 == 0) goto L40
                X.1BO<com.facebook.aura.settings.SecureStorageCredentialDetailsUiState> r0 = r10.$uiState$delegate
                java.lang.Object r0 = r0.getValue()
                com.facebook.aura.settings.SecureStorageCredentialDetailsUiState r0 = (com.facebook.aura.settings.SecureStorageCredentialDetailsUiState) r0
                boolean r0 = r0.isUpdating
                if (r0 != 0) goto L40
                X.1BO<com.facebook.aura.settings.SecureStorageCredentialDetailsUiState> r0 = r10.$uiState$delegate
                java.lang.Object r0 = r0.getValue()
                com.facebook.aura.settings.SecureStorageCredentialDetailsUiState r0 = (com.facebook.aura.settings.SecureStorageCredentialDetailsUiState) r0
                boolean r0 = r0.isDeleting
                r4 = 1
                if (r0 == 0) goto L41
            L40:
                r4 = 0
            L41:
                androidx.compose.runtime.MutableState<com.facebook.aura.settings.CredentialAgentPermission> r0 = r10.$editableAgentPermission$delegate
                boolean r0 = r12.A65(r0)
                androidx.compose.runtime.MutableState<com.facebook.aura.settings.CredentialAgentPermission> r1 = r10.$editableAgentPermission$delegate
                java.lang.Object r5 = r12.AaT()
                if (r0 != 0) goto L53
                java.lang.Object r0 = X.C78N.A00
                if (r5 != r0) goto L5b
            L53:
                com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7$4$1$1$4$1$1$1$1$1$1 r5 = new com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7$4$1$1$4$1$1$1$1$1$1
                r5.<init>(r1)
                r12.Ai0(r5)
            L5b:
                kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
                r6 = 0
                com.facebook.aura.settings.HatchSecureStorageScreenKt.CredentialAgentPermissionRow(r2, r3, r4, r5, r6, r7, r8, r9)
                return
            L62:
                r12.Afo()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7$4$1$1$4$1$1$1.AnonymousClass1.invoke(X.07C, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7$4$1$1$4$1$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ CredentialAgentPermission $displayedAgentPermission;
        public final /* synthetic */ MutableState<CredentialAgentPermission> $editableAgentPermission$delegate;
        public final /* synthetic */ MutableState<Boolean> $isEditing$delegate;
        public final /* synthetic */ C1BO<SecureStorageCredentialDetailsUiState> $uiState$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CredentialAgentPermission credentialAgentPermission, MutableState<CredentialAgentPermission> mutableState, MutableState<Boolean> mutableState2, C1BO<SecureStorageCredentialDetailsUiState> c1bo) {
            super(3);
            this.$displayedAgentPermission = credentialAgentPermission;
            this.$editableAgentPermission$delegate = mutableState;
            this.$isEditing$delegate = mutableState2;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.C07C r11, X.BFM r12, int r13) {
            /*
                r10 = this;
                r0 = r13 & 17
                r9 = 16
                r8 = 0
                boolean r0 = X.AnonymousClass002.A1P(r0, r9)
                r7 = r12
                boolean r0 = X.AnonymousClass001.A1b(r0, r12, r13)
                if (r0 == 0) goto L62
                r0 = 2131889806(0x7f120e8e, float:1.9414286E38)
                java.lang.String r2 = X.AbstractC2271BQs.A01(r12, r0)
                com.facebook.aura.settings.CredentialAgentPermission r1 = r10.$displayedAgentPermission
                com.facebook.aura.settings.CredentialAgentPermission r0 = com.facebook.aura.settings.CredentialAgentPermission.ASK
                boolean r3 = X.AnonymousClass002.A1Z(r1, r0)
                androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r10.$isEditing$delegate
                boolean r0 = androidx.compose.runtime.MutableState.A0A(r0)
                if (r0 == 0) goto L40
                X.1BO<com.facebook.aura.settings.SecureStorageCredentialDetailsUiState> r0 = r10.$uiState$delegate
                java.lang.Object r0 = r0.getValue()
                com.facebook.aura.settings.SecureStorageCredentialDetailsUiState r0 = (com.facebook.aura.settings.SecureStorageCredentialDetailsUiState) r0
                boolean r0 = r0.isUpdating
                if (r0 != 0) goto L40
                X.1BO<com.facebook.aura.settings.SecureStorageCredentialDetailsUiState> r0 = r10.$uiState$delegate
                java.lang.Object r0 = r0.getValue()
                com.facebook.aura.settings.SecureStorageCredentialDetailsUiState r0 = (com.facebook.aura.settings.SecureStorageCredentialDetailsUiState) r0
                boolean r0 = r0.isDeleting
                r4 = 1
                if (r0 == 0) goto L41
            L40:
                r4 = 0
            L41:
                androidx.compose.runtime.MutableState<com.facebook.aura.settings.CredentialAgentPermission> r0 = r10.$editableAgentPermission$delegate
                boolean r0 = r12.A65(r0)
                androidx.compose.runtime.MutableState<com.facebook.aura.settings.CredentialAgentPermission> r1 = r10.$editableAgentPermission$delegate
                java.lang.Object r5 = r12.AaT()
                if (r0 != 0) goto L53
                java.lang.Object r0 = X.C78N.A00
                if (r5 != r0) goto L5b
            L53:
                com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7$4$1$1$4$1$1$1$2$1$1 r5 = new com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7$4$1$1$4$1$1$1$2$1$1
                r5.<init>(r1)
                r12.Ai0(r5)
            L5b:
                kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
                r6 = 0
                com.facebook.aura.settings.HatchSecureStorageScreenKt.CredentialAgentPermissionRow(r2, r3, r4, r5, r6, r7, r8, r9)
                return
            L62:
                r12.Afo()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7$4$1$1$4$1$1$1.AnonymousClass2.invoke(X.07C, X.BFM, int):void");
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass1(this.$displayedAgentPermission, this.$editableAgentPermission$delegate, this.$isEditing$delegate, this.$uiState$delegate), -162513571);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass2(this.$displayedAgentPermission, this.$editableAgentPermission$delegate, this.$isEditing$delegate, this.$uiState$delegate), -649650810);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$7$4$1$1$4$1$1$1(CredentialAgentPermission credentialAgentPermission, MutableState<CredentialAgentPermission> mutableState, MutableState<Boolean> mutableState2, C1BO<SecureStorageCredentialDetailsUiState> c1bo) {
        super(1);
        this.$displayedAgentPermission = credentialAgentPermission;
        this.$editableAgentPermission$delegate = mutableState;
        this.$isEditing$delegate = mutableState2;
        this.$uiState$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
