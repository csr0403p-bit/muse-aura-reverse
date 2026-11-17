package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchScreen;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchInlineImageKt$HatchInlineImage$content$1$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchScreen $inlineImageScreen;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;
    public final /* synthetic */ Function0<Unit> $wrappedOnClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchInlineImageKt$HatchInlineImage$content$1$2$1$1(HatchScreen hatchScreen, Map<String, String> map, Function0<Unit> function0) {
        super(0);
        this.$inlineImageScreen = hatchScreen;
        this.$threadLogMetadata = map;
        this.$wrappedOnClick = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInlineImageKt.logInlineImageClick(this.$inlineImageScreen, this.$threadLogMetadata);
        this.$wrappedOnClick.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
