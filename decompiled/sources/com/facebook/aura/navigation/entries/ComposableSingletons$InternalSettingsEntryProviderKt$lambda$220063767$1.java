package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C60R;
import X.C7384Etj;
import X.G0V;
import X.G0W;
import com.facebook.aura.navigation.key.AuraInternalSettingsScreenKey;
import com.facebook.aura.settings.internal.AuraInternalSettingsRouteKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$InternalSettingsEntryProviderKt$lambda$-220063767$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$InternalSettingsEntryProviderKt$lambda$220063767$1 extends AbstractC7559F3s implements G0W<AuraInternalSettingsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$InternalSettingsEntryProviderKt$lambda$220063767$1 INSTANCE = new ComposableSingletons$InternalSettingsEntryProviderKt$lambda$220063767$1();

    /* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$InternalSettingsEntryProviderKt$lambda$-220063767$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ AuraInternalSettingsScreenKey $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraInternalSettingsScreenKey auraInternalSettingsScreenKey) {
            super(2);
            this.$key = auraInternalSettingsScreenKey;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                AuraInternalSettingsRouteKt.AuraInternalSettingsRoute(this.$key.page, bfm, 0);
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

    public ComposableSingletons$InternalSettingsEntryProviderKt$lambda$220063767$1() {
        super(3);
    }

    public final void invoke(AuraInternalSettingsScreenKey auraInternalSettingsScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(auraInternalSettingsScreenKey, 0);
        C60R.A14(bfm, new AnonymousClass1(auraInternalSettingsScreenKey), 1177184064);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AuraInternalSettingsScreenKey auraInternalSettingsScreenKey, BFM bfm, Integer num) {
        invoke(auraInternalSettingsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
