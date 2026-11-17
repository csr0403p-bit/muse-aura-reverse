package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.sharesheet.HatchIdeaShareAction;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$4$1$1$1$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchSurface $analyticsSurface;
    public final /* synthetic */ Map<String, String> $impressionMetadata;
    public final /* synthetic */ HatchIdeaShareAction $share;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$4$1$1$1$2$1$1(HatchSurface hatchSurface, Map<String, String> map, HatchIdeaShareAction hatchIdeaShareAction) {
        super(0);
        this.$analyticsSurface = hatchSurface;
        this.$impressionMetadata = map;
        this.$share = hatchIdeaShareAction;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ExploreIdeaCardDetailSheetKt.logIdeaDetailClick(this.$analyticsSurface, null, HatchComponent.SHARE_BUTTON, this.$impressionMetadata);
        this.$share.onClick.invoke(null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
