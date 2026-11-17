package com.facebook.aura.sharesheet;

import X.AbstractC7559F3s;
import android.content.Context;
import com.facebook.aura.navigation.key.ShareType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchShareSheetKt$HatchShareSheet$3$8$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ ShareType $shareType;
    public final /* synthetic */ String $uri;
    public final /* synthetic */ HatchShareSheetViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetKt$HatchShareSheet$3$8$1$1(HatchShareSheetViewModel hatchShareSheetViewModel, Context context, String str, ShareType shareType) {
        super(0);
        this.$viewModel = hatchShareSheetViewModel;
        this.$context = context;
        this.$uri = str;
        this.$shareType = shareType;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchShareSheetViewModel hatchShareSheetViewModel = this.$viewModel;
        Context context = this.$context;
        String str = this.$uri;
        String str2 = str;
        if (!HatchShareSheetModelsKt.isPublishLinkShare(this.$shareType)) {
            str2 = null;
        }
        hatchShareSheetViewModel.shareToFacebookFeed(context, str, null, str2);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
