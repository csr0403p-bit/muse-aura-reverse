package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import com.facebook.aura.maps.HatchPlaceDetailsSheetKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchPlaceDetailsSheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ComposableSingletons$HatchPlaceDetailsSheetEntryProviderKt$lambda$354320166$1 extends AbstractC7559F3s implements G0W<HatchPlaceDetailsSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchPlaceDetailsSheetEntryProviderKt$lambda$354320166$1 INSTANCE = new ComposableSingletons$HatchPlaceDetailsSheetEntryProviderKt$lambda$354320166$1();

    public ComposableSingletons$HatchPlaceDetailsSheetEntryProviderKt$lambda$354320166$1() {
        super(3);
    }

    public final void invoke(HatchPlaceDetailsSheetKey hatchPlaceDetailsSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(hatchPlaceDetailsSheetKey, 0);
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        String str = hatchPlaceDetailsSheetKey.presentationId;
        String str2 = hatchPlaceDetailsSheetKey.artifactId;
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$HatchPlaceDetailsSheetEntryProviderKt$lambda$354320166$1$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        HatchPlaceDetailsSheetKt.HatchPlaceDetailsSheet(str, str2, (Function0) objAaT, null, bfm, 0, 8);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(HatchPlaceDetailsSheetKey hatchPlaceDetailsSheetKey, BFM bfm, Integer num) {
        invoke(hatchPlaceDetailsSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
