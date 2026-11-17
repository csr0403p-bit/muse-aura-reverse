package com.facebook.aura.sharesheet;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchShareSheetKt$HatchShareSheet$4$1$3$1 extends AbstractC7559F3s implements G0U<HatchShareRecipient, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $payload;
    public final /* synthetic */ HatchShareSheetViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchShareRecipient hatchShareRecipient) {
        C7384Etj.A0Y(hatchShareRecipient, 0);
        this.$viewModel.shareToRecipient(this.$context, this.$payload, hatchShareRecipient);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetKt$HatchShareSheet$4$1$3$1(HatchShareSheetViewModel hatchShareSheetViewModel, Context context, String str) {
        super(1);
        this.$viewModel = hatchShareSheetViewModel;
        this.$context = context;
        this.$payload = str;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchShareRecipient hatchShareRecipient) {
        invoke2(hatchShareRecipient);
        return Unit.INSTANCE;
    }
}
