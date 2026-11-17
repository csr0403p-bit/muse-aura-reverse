package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchCodeBlockKt$HatchCodeBlock$2$1$5$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ String $language;
    public final /* synthetic */ Function0<Unit> $onSeeMoreClick;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCodeBlockKt$HatchCodeBlock$2$1$5$1$1(String str, boolean z, Map<String, String> map, Function0<Unit> function0) {
        super(0);
        this.$language = str;
        this.$isPrimaryThread = z;
        this.$threadLogMetadata = map;
        this.$onSeeMoreClick = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchCodeBlockKt.logCodeSeeMoreClick(this.$language, this.$isPrimaryThread, this.$threadLogMetadata);
        this.$onSeeMoreClick.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
