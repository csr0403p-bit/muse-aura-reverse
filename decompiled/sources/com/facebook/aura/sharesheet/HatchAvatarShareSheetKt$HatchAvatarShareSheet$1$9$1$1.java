package com.facebook.aura.sharesheet;

import X.AbstractC7559F3s;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchAvatarShareSheetKt$HatchAvatarShareSheet$1$9$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $shareText;
    public final /* synthetic */ String $uri;
    public final /* synthetic */ HatchShareSheetViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAvatarShareSheetKt$HatchAvatarShareSheet$1$9$1$1(HatchShareSheetViewModel hatchShareSheetViewModel, Context context, String str, String str2) {
        super(0);
        this.$viewModel = hatchShareSheetViewModel;
        this.$context = context;
        this.$uri = str;
        this.$shareText = str2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.shareToX(this.$context, this.$uri, this.$shareText);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
