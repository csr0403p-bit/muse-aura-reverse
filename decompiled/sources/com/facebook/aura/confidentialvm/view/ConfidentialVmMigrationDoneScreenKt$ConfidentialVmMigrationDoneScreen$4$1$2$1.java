package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.BRg;
import X.C7384Etj;
import X.C7438Evz;
import X.G0U;
import android.graphics.drawable.Drawable;
import com.facebook.aura.R;
import com.facebook.aura.confidentialvm.model.ConfidentialVmMigrationDoneViewModel;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ConfidentialVmMigrationDoneScreenKt$ConfidentialVmMigrationDoneScreen$4$1$2$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ ConfidentialVmMigrationDoneViewModel $viewModel;

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmMigrationDoneScreenKt$ConfidentialVmMigrationDoneScreen$4$1$2$1$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements Function0<Unit> {
        public AnonymousClass1(Object obj) {
            super(0, obj, ConfidentialVmMigrationDoneViewModel.class, "onOkClick", "onOkClick()V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((ConfidentialVmMigrationDoneViewModel) this.receiver).onOkClick();
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
        auraButtonGroupScope.primaryButton(R.string._name_removed__res_0x7f120233, (Object[]) null, (Drawable) null, true, false, AuraButtonGroupsKt.DEFAULT_PRIMARY_BUTTON_ID, (Function0<Unit>) new AnonymousClass1(this.$viewModel), (String) null, (BRg) BRg.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmMigrationDoneScreenKt$ConfidentialVmMigrationDoneScreen$4$1$2$1(ConfidentialVmMigrationDoneViewModel confidentialVmMigrationDoneViewModel) {
        super(1);
        this.$viewModel = confidentialVmMigrationDoneViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
