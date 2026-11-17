package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.BRg;
import X.C60R;
import X.C78N;
import X.G0V;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ColorsScreenKey;
import com.facebook.aura.settings.internal.HatchColorsScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ComposableSingletons$InternalSettingsEntryProviderKt$lambda$1482765239$1 extends AbstractC7559F3s implements G0W<ColorsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$InternalSettingsEntryProviderKt$lambda$1482765239$1 INSTANCE = new ComposableSingletons$InternalSettingsEntryProviderKt$lambda$1482765239$1();

    /* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$InternalSettingsEntryProviderKt$lambda$1482765239$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ AuraNavigator $navigator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraNavigator auraNavigator) {
            super(2);
            this.$navigator = auraNavigator;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                bfm.Afo();
                return;
            }
            boolean zA67 = bfm.A67(this.$navigator);
            AuraNavigator auraNavigator = this.$navigator;
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ComposableSingletons$InternalSettingsEntryProviderKt$lambda$1482765239$1$1$1$1(auraNavigator);
                bfm.Ai0(objAaT);
            }
            HatchColorsScreenKt.HatchColorsScreen((Function0) objAaT, (BRg) null, bfm, 0, 2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public ComposableSingletons$InternalSettingsEntryProviderKt$lambda$1482765239$1() {
        super(3);
    }

    public final void invoke(ColorsScreenKey colorsScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            C60R.A14(bfm, new AnonymousClass1(AnonymousClass002.A0b(bfm)), 1423767168);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ColorsScreenKey colorsScreenKey, BFM bfm, Integer num) {
        invoke(colorsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
