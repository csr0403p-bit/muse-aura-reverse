package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.G0U;
import android.view.View;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$doubleTapHeart$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ G0U<String, Unit> $react;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;
    public final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$doubleTapHeart$1$1$1(View view, HatchMessageUiModel hatchMessageUiModel, Map<String, String> map, G0U<? super String, Unit> g0u) {
        super(0);
        this.$view = view;
        this.$message = hatchMessageUiModel;
        this.$threadLogMetadata = map;
        this.$react = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$view.performHapticFeedback(6);
        HatchMessageLongPressMenuHostKt.logReactionClick(this.$message, "\u2764\ufe0f", this.$threadLogMetadata);
        this.$react.invoke("\u2764\ufe0f");
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
