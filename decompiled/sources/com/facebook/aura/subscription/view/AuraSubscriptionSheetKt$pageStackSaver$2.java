package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.facebook.aura.navigation.key.AuraSubscriptionPage;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class AuraSubscriptionSheetKt$pageStackSaver$2 extends AbstractC7559F3s implements G0U<ArrayList<String>, SnapshotStateList<AuraSubscriptionPage>> {
    public static final AuraSubscriptionSheetKt$pageStackSaver$2 INSTANCE = new AuraSubscriptionSheetKt$pageStackSaver$2();

    public AuraSubscriptionSheetKt$pageStackSaver$2() {
        super(1);
    }

    @Override // X.G0U
    public final SnapshotStateList<AuraSubscriptionPage> invoke(ArrayList<String> arrayList) {
        C7384Etj.A0Y(arrayList, 0);
        SnapshotStateList<AuraSubscriptionPage> snapshotStateList = new SnapshotStateList();
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayList);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(AuraSubscriptionSheetKt.decodePage(AnonymousClass005.A0j(it)));
        }
        snapshotStateList.addAll(arrayListA0i);
        return snapshotStateList;
    }
}
