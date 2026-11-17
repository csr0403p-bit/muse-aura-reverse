package com.facebook.aura.sharesheet;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchShareSheetKt$HatchShareSheet$3$1$1 extends C7438Evz implements Function0<Unit> {
    public HatchShareSheetKt$HatchShareSheet$3$1$1(Object obj) {
        super(0, obj, HatchShareSheetViewModel.class, "cancelShare", "cancelShare$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((HatchShareSheetViewModel) this.receiver).cancelShare$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
