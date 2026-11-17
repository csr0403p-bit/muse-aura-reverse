package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.PermissionDestination;
import com.facebook.aura.navigation.key.PermissionDetailScreenKey;
import com.facebook.aura.settings.PermissionDetailScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$PermissionDetailEntryProviderKt$lambda$-614102170$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$PermissionDetailEntryProviderKt$lambda$614102170$1 extends AbstractC7559F3s implements G0W<PermissionDetailScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$PermissionDetailEntryProviderKt$lambda$614102170$1 INSTANCE = new ComposableSingletons$PermissionDetailEntryProviderKt$lambda$614102170$1();

    public ComposableSingletons$PermissionDetailEntryProviderKt$lambda$614102170$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(PermissionDetailScreenKey permissionDetailScreenKey, BFM bfm, Integer num) {
        invoke(permissionDetailScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(PermissionDetailScreenKey permissionDetailScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(permissionDetailScreenKey, 0);
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        PermissionDestination permissionDestination = permissionDetailScreenKey.destination;
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$PermissionDetailEntryProviderKt$lambda$614102170$1$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        PermissionDetailScreenKt.PermissionDetailScreen(permissionDestination, (Function0) objAaT, bfm, 0);
    }
}
