package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import com.facebook.aura.sharesheet.HatchIdeaShareAction;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$ideaListSection$1$1$8$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Map<String, String> $impressionMetadata;
    public final /* synthetic */ HatchIdeaShareAction $share;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchIdeasTabScreenKt$ideaListSection$1$1$8$1$1(Map<String, String> map, HatchIdeaShareAction hatchIdeaShareAction) {
        super(0);
        this.$impressionMetadata = map;
        this.$share = hatchIdeaShareAction;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchIdeasTabScreenKt.logIdeaRowShareClick(this.$impressionMetadata);
        this.$share.onClick.invoke(null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
