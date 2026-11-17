package com.facebook.aura.spacesharing.impl;

import X.AbstractC7559F3s;
import android.content.Context;
import com.facebook.aura.file.actions.HatchShare;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SavedSpaceAudienceScreenKt$SavedSpaceAudienceScreen$4$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $shareUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedSpaceAudienceScreenKt$SavedSpaceAudienceScreen$4$1$2$1(String str, Context context) {
        super(0);
        this.$shareUrl = str;
        this.$context = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String str = this.$shareUrl;
        if (str != null) {
            HatchShare.INSTANCE.shareUrl(this.$context, str, null, null);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
