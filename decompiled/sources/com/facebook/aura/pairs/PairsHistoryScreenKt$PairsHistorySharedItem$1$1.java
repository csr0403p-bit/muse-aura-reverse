package com.facebook.aura.pairs;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class PairsHistoryScreenKt$PairsHistorySharedItem$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onOpen;
    public final /* synthetic */ ConnectionsSharedLinkTarget $target;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsHistoryScreenKt$PairsHistorySharedItem$1$1(Function0<Unit> function0, ConnectionsSharedLinkTarget connectionsSharedLinkTarget, AbstractC3358CGz abstractC3358CGz, AuraNavigator auraNavigator) {
        super(0);
        this.$onOpen = function0;
        this.$target = connectionsSharedLinkTarget;
        this.$userSession = abstractC3358CGz;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onOpen.invoke();
        PairsHistoryScreenKt.open(this.$target, this.$userSession, this.$navigator);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
