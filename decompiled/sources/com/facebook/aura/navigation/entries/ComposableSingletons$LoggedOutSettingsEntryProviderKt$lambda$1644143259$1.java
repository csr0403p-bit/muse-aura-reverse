package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C60R;
import X.C7384Etj;
import X.G0V;
import X.G0W;
import com.facebook.aura.navigation.key.LoggedOutInternalSettingsScreenKey;
import com.facebook.aura.settings.internal.AuraInternalSettingsRouteKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$1644143259$1 extends AbstractC7559F3s implements G0W<LoggedOutInternalSettingsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$1644143259$1 INSTANCE = new ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$1644143259$1();

    /* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$1644143259$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ LoggedOutInternalSettingsScreenKey $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LoggedOutInternalSettingsScreenKey loggedOutInternalSettingsScreenKey) {
            super(2);
            this.$key = loggedOutInternalSettingsScreenKey;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                AuraInternalSettingsRouteKt.AuraLoggedOutInternalSettingsRoute(this.$key.page, bfm, 0);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public ComposableSingletons$LoggedOutSettingsEntryProviderKt$lambda$1644143259$1() {
        super(3);
    }

    public final void invoke(LoggedOutInternalSettingsScreenKey loggedOutInternalSettingsScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(loggedOutInternalSettingsScreenKey, 0);
        C60R.A14(bfm, new AnonymousClass1(loggedOutInternalSettingsScreenKey), -292182748);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(LoggedOutInternalSettingsScreenKey loggedOutInternalSettingsScreenKey, BFM bfm, Integer num) {
        invoke(loggedOutInternalSettingsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
