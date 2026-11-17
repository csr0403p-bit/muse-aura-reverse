package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConnectionsSheetKey;
import com.facebook.aura.navigation.key.PairsHistoryScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsSheetScreenKt$ConnectionsConversationRow$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ PairsHistoryScreenKey $conversation;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onOpen;

    /* renamed from: com.facebook.aura.pairs.ConnectionsSheetScreenKt$ConnectionsConversationRow$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(AuraNavKey auraNavKey) {
            C7384Etj.A0Y(auraNavKey, 0);
            return Boolean.valueOf(auraNavKey instanceof ConnectionsSheetKey);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsSheetScreenKt$ConnectionsConversationRow$1$1(Function0<Unit> function0, AuraNavigator auraNavigator, PairsHistoryScreenKey pairsHistoryScreenKey) {
        super(0);
        this.$onOpen = function0;
        this.$navigator = auraNavigator;
        this.$conversation = pairsHistoryScreenKey;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onOpen.invoke();
        this.$navigator.popAll(AnonymousClass1.INSTANCE);
        this.$navigator.navigate((AuraNavKey) this.$conversation, false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
