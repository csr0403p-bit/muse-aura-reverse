package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.BRg;
import X.BS0;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.navigation.key.SecureStorageCustomConnectorDetailsScreenKey;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchCustomConnectorDetailsScreenKt$HatchCustomConnectorDetailsScreen$3$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ String $cancelLabel;
    public final /* synthetic */ String $deleteLabel;
    public final /* synthetic */ SecureStorageCustomConnectorDetailsScreenKey $key;
    public final /* synthetic */ MutableState<Boolean> $showDeleteConfirmation$delegate;
    public final /* synthetic */ HatchCustomConnectorDetailsViewModel $viewModel;

    /* renamed from: com.facebook.aura.settings.HatchCustomConnectorDetailsScreenKt$HatchCustomConnectorDetailsScreen$3$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ SecureStorageCustomConnectorDetailsScreenKey $key;
        public final /* synthetic */ MutableState<Boolean> $showDeleteConfirmation$delegate;
        public final /* synthetic */ HatchCustomConnectorDetailsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchCustomConnectorDetailsViewModel hatchCustomConnectorDetailsViewModel, SecureStorageCustomConnectorDetailsScreenKey secureStorageCustomConnectorDetailsScreenKey, MutableState<Boolean> mutableState) {
            super(0);
            this.$viewModel = hatchCustomConnectorDetailsViewModel;
            this.$key = secureStorageCustomConnectorDetailsScreenKey;
            this.$showDeleteConfirmation$delegate = mutableState;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SecureStorageLogging.INSTANCE.customConnectorDeleteConfirmTapped();
            MutableState.A09(false, this.$showDeleteConfirmation$delegate);
            this.$viewModel.disconnect(this.$key.name);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchCustomConnectorDetailsScreenKt$HatchCustomConnectorDetailsScreen$3$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ MutableState<Boolean> $showDeleteConfirmation$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MutableState<Boolean> mutableState) {
            super(0);
            this.$showDeleteConfirmation$delegate = mutableState;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SecureStorageLogging.INSTANCE.customConnectorDeleteCancelTapped();
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
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$viewModel, this.$key, this.$showDeleteConfirmation$delegate);
        BS0 bs0 = BRg.A00;
        auraButtonGroupScope.destructiveButton(str, null, true, false, AuraButtonGroupsKt.DEFAULT_DESTRUCTIVE_BUTTON_ID, anonymousClass1, null, bs0);
        auraButtonGroupScope.secondaryButton(this.$cancelLabel, null, true, false, AuraButtonGroupsKt.DEFAULT_SECONDARY_BUTTON_ID, new AnonymousClass2(this.$showDeleteConfirmation$delegate), null, bs0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCustomConnectorDetailsScreenKt$HatchCustomConnectorDetailsScreen$3$1$1(String str, String str2, HatchCustomConnectorDetailsViewModel hatchCustomConnectorDetailsViewModel, SecureStorageCustomConnectorDetailsScreenKey secureStorageCustomConnectorDetailsScreenKey, MutableState<Boolean> mutableState) {
        super(1);
        this.$deleteLabel = str;
        this.$cancelLabel = str2;
        this.$viewModel = hatchCustomConnectorDetailsViewModel;
        this.$key = secureStorageCustomConnectorDetailsScreenKey;
        this.$showDeleteConfirmation$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
