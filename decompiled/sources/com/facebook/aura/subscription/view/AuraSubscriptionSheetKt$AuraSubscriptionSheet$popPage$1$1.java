package com.facebook.aura.subscription.view;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.BN2;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.facebook.aura.navigation.key.AuraSubscriptionPage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraSubscriptionSheetKt$AuraSubscriptionSheet$popPage$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ SnapshotStateList<AuraSubscriptionPage> $backStack;
    public final /* synthetic */ BN2 $pageState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionSheetKt$AuraSubscriptionSheet$popPage$1$1(SnapshotStateList<AuraSubscriptionPage> snapshotStateList, BN2 bn2) {
        super(0);
        this.$backStack = snapshotStateList;
        this.$pageState = bn2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$backStack.size() > 1) {
            this.$pageState.Aay(AuraSubscriptionSheetKt.encodePage((AuraSubscriptionPage) AbstractC0878AGe.A0H(this.$backStack)));
            SnapshotStateList<AuraSubscriptionPage> snapshotStateList = this.$backStack;
            snapshotStateList.remove(AnonymousClass002.A0E(snapshotStateList));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
