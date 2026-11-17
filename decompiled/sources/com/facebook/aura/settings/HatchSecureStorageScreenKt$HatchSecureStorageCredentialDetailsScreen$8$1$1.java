package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.BRg;
import X.BS0;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.navigation.key.SecureStorageCredentialDetailsScreenKey;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$8$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ String $cancelLabel;
    public final /* synthetic */ String $deleteLabel;
    public final /* synthetic */ SecureStorageCredentialDetailsScreenKey $key;
    public final /* synthetic */ MutableState<Boolean> $showDeleteConfirmation$delegate;
    public final /* synthetic */ HatchCredentialsViewModel $viewModel;

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$8$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ SecureStorageCredentialDetailsScreenKey $key;
        public final /* synthetic */ MutableState<Boolean> $showDeleteConfirmation$delegate;
        public final /* synthetic */ HatchCredentialsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey, HatchCredentialsViewModel hatchCredentialsViewModel, MutableState<Boolean> mutableState) {
            super(0);
            this.$key = secureStorageCredentialDetailsScreenKey;
            this.$viewModel = hatchCredentialsViewModel;
            this.$showDeleteConfirmation$delegate = mutableState;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SecureStorageLogging.INSTANCE.deleteConfirmTapped(this.$key.id);
            MutableState.A09(false, this.$showDeleteConfirmation$delegate);
            this.$viewModel.deleteCredential(this.$key.id);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$8$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ SecureStorageCredentialDetailsScreenKey $key;
        public final /* synthetic */ MutableState<Boolean> $showDeleteConfirmation$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey, MutableState<Boolean> mutableState) {
            super(0);
            this.$key = secureStorageCredentialDetailsScreenKey;
            this.$showDeleteConfirmation$delegate = mutableState;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SecureStorageLogging.INSTANCE.deleteCancelTapped(this.$key.id);
            MutableState.A09(false, this.$showDeleteConfirmation$delegate);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupScope auraButtonGroupScope) {
        C7384Etj.A0Y(auraButtonGroupScope, 0);
        String str = this.$deleteLabel;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$key, this.$viewModel, this.$showDeleteConfirmation$delegate);
        BS0 bs0 = BRg.A00;
        auraButtonGroupScope.destructiveButton(str, null, true, false, AuraButtonGroupsKt.DEFAULT_DESTRUCTIVE_BUTTON_ID, anonymousClass1, null, bs0);
        auraButtonGroupScope.secondaryButton(this.$cancelLabel, null, true, false, AuraButtonGroupsKt.DEFAULT_SECONDARY_BUTTON_ID, new AnonymousClass2(this.$key, this.$showDeleteConfirmation$delegate), null, bs0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSecureStorageScreenKt$HatchSecureStorageCredentialDetailsScreen$8$1$1(String str, String str2, SecureStorageCredentialDetailsScreenKey secureStorageCredentialDetailsScreenKey, HatchCredentialsViewModel hatchCredentialsViewModel, MutableState<Boolean> mutableState) {
        super(1);
        this.$deleteLabel = str;
        this.$cancelLabel = str2;
        this.$key = secureStorageCredentialDetailsScreenKey;
        this.$viewModel = hatchCredentialsViewModel;
        this.$showDeleteConfirmation$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
