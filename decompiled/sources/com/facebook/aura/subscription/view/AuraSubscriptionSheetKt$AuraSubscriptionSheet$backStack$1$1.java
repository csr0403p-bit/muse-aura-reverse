package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.facebook.aura.navigation.key.AuraSubscriptionPage;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraSubscriptionSheetKt$AuraSubscriptionSheet$backStack$1$1 extends AbstractC7559F3s implements Function0<SnapshotStateList<AuraSubscriptionPage>> {
    public final /* synthetic */ AuraSubscriptionPage $initialPage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionSheetKt$AuraSubscriptionSheet$backStack$1$1(AuraSubscriptionPage auraSubscriptionPage) {
        super(0);
        this.$initialPage = auraSubscriptionPage;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final SnapshotStateList<AuraSubscriptionPage> invoke() {
        AuraSubscriptionPage[] auraSubscriptionPageArr = {this.$initialPage};
        SnapshotStateList<AuraSubscriptionPage> snapshotStateList = new SnapshotStateList();
        snapshotStateList.addAll(Collections.singletonList(auraSubscriptionPageArr[0]));
        return snapshotStateList;
    }
}
