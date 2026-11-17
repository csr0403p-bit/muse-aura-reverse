package com.facebook.aura.sharedcontent;

import X.AbstractC7559F3s;
import android.content.Context;
import com.facebook.aura.browser.HatchReportContentKt;
import com.facebook.aura.sharedcontent.SharedContentUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchSharedContentScreenKt$SharedContentOverflowAction$1$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ SharedContentUiState.Loaded $loaded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSharedContentScreenKt$SharedContentOverflowAction$1$3$1(Context context, SharedContentUiState.Loaded loaded) {
        super(0);
        this.$context = context;
        this.$loaded = loaded;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchReportContentKt.openReportContentForm(this.$context, this.$loaded.slug);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
