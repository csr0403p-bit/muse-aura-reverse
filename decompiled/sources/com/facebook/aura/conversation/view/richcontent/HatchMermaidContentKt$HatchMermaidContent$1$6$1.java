package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchMermaidContentKt$HatchMermaidContent$1$6$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onExpandClick;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMermaidContentKt$HatchMermaidContent$1$6$1(Map<String, String> map, Function0<Unit> function0) {
        super(0);
        this.$threadLogMetadata = map;
        this.$onExpandClick = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchMermaidContentKt.logDiagramExpandClick(this.$threadLogMetadata);
        this.$onExpandClick.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
