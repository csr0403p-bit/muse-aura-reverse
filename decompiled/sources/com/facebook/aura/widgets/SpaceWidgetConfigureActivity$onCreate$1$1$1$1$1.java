package com.facebook.aura.widgets;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.spaces.repo.SpaceCard;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class SpaceWidgetConfigureActivity$onCreate$1$1$1$1$1 extends C7438Evz implements G0U<SpaceCard, Unit> {
    public SpaceWidgetConfigureActivity$onCreate$1$1$1$1$1(Object obj) {
        super(1, obj, SpaceWidgetConfigureActivity.class, "addSpace", "addSpace(Lcom/facebook/aura/spaces/repo/SpaceCard;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SpaceCard spaceCard) {
        ((SpaceWidgetConfigureActivity) AnonymousClass006.A0o(spaceCard, this)).addSpace(spaceCard);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(SpaceCard spaceCard) {
        invoke2(spaceCard);
        return Unit.INSTANCE;
    }
}
