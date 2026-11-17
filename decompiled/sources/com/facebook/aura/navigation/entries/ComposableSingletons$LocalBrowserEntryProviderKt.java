package com.facebook.aura.navigation.entries;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.B1V;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.browsertask.screen.BrowserTaskScreensKt;
import com.facebook.aura.localbrowser.LocalBrowserSettingsScreenKt;
import com.facebook.aura.navigation.key.LocalBrowserScreenKey;
import com.facebook.aura.navigation.key.LocalBrowserSettingsScreenKey;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class ComposableSingletons$LocalBrowserEntryProviderKt {
    public static final ComposableSingletons$LocalBrowserEntryProviderKt INSTANCE = new ComposableSingletons$LocalBrowserEntryProviderKt();

    /* renamed from: lambda$-750974563, reason: not valid java name */
    public static G0W<LocalBrowserScreenKey, BFM, Integer, Unit> f145lambda$750974563 = B1V.A01(new G0W() { // from class: com.facebook.aura.navigation.entries.ComposableSingletons$LocalBrowserEntryProviderKt$$ExternalSyntheticLambda0
        @Override // X.G0W
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$LocalBrowserEntryProviderKt.lambda__750974563$lambda$0((LocalBrowserScreenKey) obj, (BFM) obj2, AnonymousClass001.A0F(obj3));
        }
    }, -750974563, false);

    /* renamed from: lambda$-451061815, reason: not valid java name */
    public static G0W<LocalBrowserSettingsScreenKey, BFM, Integer, Unit> f144lambda$451061815 = B1V.A01(new G0W() { // from class: com.facebook.aura.navigation.entries.ComposableSingletons$LocalBrowserEntryProviderKt$$ExternalSyntheticLambda1
        @Override // X.G0W
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$LocalBrowserEntryProviderKt.lambda__451061815$lambda$0((LocalBrowserSettingsScreenKey) obj, (BFM) obj2, AnonymousClass001.A0F(obj3));
        }
    }, -451061815, false);

    public static final Unit lambda__750974563$lambda$0(LocalBrowserScreenKey localBrowserScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(localBrowserScreenKey, 0);
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? bfm.A65(localBrowserScreenKey) : bfm.A67(localBrowserScreenKey) ? 4 : 2;
        }
        if (bfm.AfS(i & 1, AnonymousClass002.A1P(i & 19, 18))) {
            BrowserTaskScreensKt.LocalBrowserTaskScreen(localBrowserScreenKey.taskId, localBrowserScreenKey.initialTakeover, null, bfm, 0, 4);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__451061815$lambda$0(LocalBrowserSettingsScreenKey localBrowserSettingsScreenKey, BFM bfm, int i) {
        if (bfm.AfS(i & 1, AnonymousClass002.A1P(i & 17, 16))) {
            LocalBrowserSettingsScreenKt.LocalBrowserSettingsScreen(null, bfm, 0, 1);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: getLambda$-451061815$fbandroid_express_aura_java_com_facebook_aura_localbrowser_entries_entries, reason: not valid java name */
    public final G0W<LocalBrowserSettingsScreenKey, BFM, Integer, Unit> m1528x3449e025() {
        return f144lambda$451061815;
    }

    /* renamed from: getLambda$-750974563$fbandroid_express_aura_java_com_facebook_aura_localbrowser_entries_entries, reason: not valid java name */
    public final G0W<LocalBrowserScreenKey, BFM, Integer, Unit> m1529xea1eccb8() {
        return f145lambda$750974563;
    }
}
