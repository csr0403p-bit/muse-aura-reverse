package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationContentKt$DictationBackHandler$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Activity $activity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationContentKt$DictationBackHandler$1$1(Activity activity) {
        super(0);
        this.$activity = activity;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$activity.moveTaskToBack(true)) {
            return;
        }
        this.$activity.finish();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
