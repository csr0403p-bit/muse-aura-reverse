package com.facebook.aura.conversation.search;

import X.AbstractC7559F3s;
import X.G0W;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConversationSearchScreenKt$searchResultRows$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ com.facebook.aura.conversation.data.HatchSearchHit $hit;
    public final /* synthetic */ G0W<com.facebook.aura.conversation.data.HatchSearchHit, String, String, Unit> $onResultClick;
    public final /* synthetic */ String $threadNavigationTitle;
    public final /* synthetic */ String $threadSessionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConversationSearchScreenKt$searchResultRows$2$1$1$1(G0W<? super com.facebook.aura.conversation.data.HatchSearchHit, ? super String, ? super String, Unit> g0w, com.facebook.aura.conversation.data.HatchSearchHit hatchSearchHit, String str, String str2) {
        super(0);
        this.$onResultClick = g0w;
        this.$hit = hatchSearchHit;
        this.$threadSessionId = str;
        this.$threadNavigationTitle = str2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onResultClick.invoke(this.$hit, this.$threadSessionId, this.$threadNavigationTitle);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
