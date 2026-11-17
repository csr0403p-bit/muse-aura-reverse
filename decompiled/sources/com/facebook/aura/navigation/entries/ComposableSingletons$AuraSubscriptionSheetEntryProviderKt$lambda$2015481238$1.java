package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.G2k;
import com.facebook.aura.activation.view.AuraDisclosureScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$AuraSubscriptionSheetEntryProviderKt$lambda$-2015481238$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$AuraSubscriptionSheetEntryProviderKt$lambda$2015481238$1 extends AbstractC7559F3s implements G2k<BRg, Boolean, Function0<? extends Unit>, BFM, Integer, Unit> {
    public static final ComposableSingletons$AuraSubscriptionSheetEntryProviderKt$lambda$2015481238$1 INSTANCE = new ComposableSingletons$AuraSubscriptionSheetEntryProviderKt$lambda$2015481238$1();

    public ComposableSingletons$AuraSubscriptionSheetEntryProviderKt$lambda$2015481238$1() {
        super(5);
    }

    public final void invoke(BRg bRg, boolean z, Function0<Unit> function0, BFM bfm, int i) {
        AnonymousClass002.A1A(bRg, 0, function0);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            AuraDisclosureScreenKt.MuseAppDisclosureLegalText(z, function0, bRg, bfm, ((iA0d >> 3) & 126) | ((iA0d << 6) & 896), 0);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G2k
    public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, Boolean bool, Function0<? extends Unit> function0, BFM bfm, Integer num) {
        invoke(bRg, AnonymousClass001.A1X(bool), (Function0<Unit>) function0, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
