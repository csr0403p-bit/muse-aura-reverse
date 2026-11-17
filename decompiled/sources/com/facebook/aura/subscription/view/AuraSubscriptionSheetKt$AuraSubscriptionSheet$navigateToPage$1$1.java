package com.facebook.aura.subscription.view;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.BN2;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.facebook.aura.navigation.key.AuraSubscriptionPage;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraSubscriptionSheetKt$AuraSubscriptionSheet$navigateToPage$1$1 extends AbstractC7559F3s implements G0U<AuraSubscriptionPage, Unit> {
    public final /* synthetic */ SnapshotStateList<AuraSubscriptionPage> $backStack;
    public final /* synthetic */ BN2 $pageState;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraSubscriptionPage auraSubscriptionPage) {
        C7384Etj.A0Y(auraSubscriptionPage, 0);
        int iIndexOf = this.$backStack.indexOf(auraSubscriptionPage);
        if (iIndexOf < 0) {
            this.$backStack.add(auraSubscriptionPage);
            return;
        }
        while (AnonymousClass002.A0E(this.$backStack) > iIndexOf) {
            this.$pageState.Aay(AuraSubscriptionSheetKt.encodePage((AuraSubscriptionPage) AbstractC0878AGe.A0H(this.$backStack)));
            SnapshotStateList<AuraSubscriptionPage> snapshotStateList = this.$backStack;
            snapshotStateList.remove(AnonymousClass002.A0E(snapshotStateList));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionSheetKt$AuraSubscriptionSheet$navigateToPage$1$1(SnapshotStateList<AuraSubscriptionPage> snapshotStateList, BN2 bn2) {
        super(1);
        this.$backStack = snapshotStateList;
        this.$pageState = bn2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraSubscriptionPage auraSubscriptionPage) {
        invoke2(auraSubscriptionPage);
        return Unit.INSTANCE;
    }
}
