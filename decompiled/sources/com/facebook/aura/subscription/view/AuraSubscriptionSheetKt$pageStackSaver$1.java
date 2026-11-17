package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C1bi;
import X.C7384Etj;
import X.G0V;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.facebook.aura.navigation.key.AuraSubscriptionPage;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class AuraSubscriptionSheetKt$pageStackSaver$1 extends AbstractC7559F3s implements G0V<C1bi, SnapshotStateList<AuraSubscriptionPage>, ArrayList<String>> {
    public static final AuraSubscriptionSheetKt$pageStackSaver$1 INSTANCE = new AuraSubscriptionSheetKt$pageStackSaver$1();

    public AuraSubscriptionSheetKt$pageStackSaver$1() {
        super(2);
    }

    @Override // X.G0V
    public final ArrayList<String> invoke(C1bi c1bi, SnapshotStateList<AuraSubscriptionPage> snapshotStateList) {
        C7384Etj.A0Y(snapshotStateList, 1);
        ArrayList arrayListA0i = AnonymousClass003.A0i(snapshotStateList);
        Iterator it = snapshotStateList.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(AuraSubscriptionSheetKt.encodePage((AuraSubscriptionPage) it.next()));
        }
        return new ArrayList<>(arrayListA0i);
    }
}
