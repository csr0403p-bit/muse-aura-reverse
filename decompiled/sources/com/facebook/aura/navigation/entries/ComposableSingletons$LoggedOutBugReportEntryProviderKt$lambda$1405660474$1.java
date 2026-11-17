package com.facebook.aura.navigation.entries;

import X.AKO;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BBI;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import com.facebook.aura.bugreport.ShakeToReportBottomSheetKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.navigation.key.ShakeToReportBottomSheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$LoggedOutBugReportEntryProviderKt$lambda$1405660474$1 extends AbstractC7559F3s implements G0W<ShakeToReportBottomSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$LoggedOutBugReportEntryProviderKt$lambda$1405660474$1 INSTANCE = new ComposableSingletons$LoggedOutBugReportEntryProviderKt$lambda$1405660474$1();

    public ComposableSingletons$LoggedOutBugReportEntryProviderKt$lambda$1405660474$1() {
        super(3);
    }

    public final void invoke(ShakeToReportBottomSheetKey shakeToReportBottomSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(shakeToReportBottomSheetKey, 0);
        BBI bbi = (BBI) bfm;
        AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
        boolean zA1M = AnonymousClass003.A1M(bfm, auraNavigatorA05, shakeToReportBottomSheetKey);
        Object objAaT = bfm.AaT();
        if (zA1M || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$LoggedOutBugReportEntryProviderKt$lambda$1405660474$1$1$1(auraNavigatorA05, shakeToReportBottomSheetKey);
            BBI.A0O(bbi, objAaT);
        }
        ShakeToReportBottomSheetKt.ShakeToReportBottomSheet((Function0) objAaT, null, bfm, 0, 2);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ShakeToReportBottomSheetKey shakeToReportBottomSheetKey, BFM bfm, Integer num) {
        invoke(shakeToReportBottomSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
