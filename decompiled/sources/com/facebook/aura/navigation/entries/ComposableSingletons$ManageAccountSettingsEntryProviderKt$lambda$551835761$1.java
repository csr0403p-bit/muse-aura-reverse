package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ManageAccountSettingsScreenKey;
import com.facebook.aura.partners.voice.infra.VideoConfigJsonKt;
import com.facebook.aura.settings.HatchActivationSettingsScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ComposableSingletons$ManageAccountSettingsEntryProviderKt$lambda$551835761$1 extends AbstractC7559F3s implements G0W<ManageAccountSettingsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ManageAccountSettingsEntryProviderKt$lambda$551835761$1 INSTANCE = new ComposableSingletons$ManageAccountSettingsEntryProviderKt$lambda$551835761$1();

    public ComposableSingletons$ManageAccountSettingsEntryProviderKt$lambda$551835761$1() {
        super(3);
    }

    public final void invoke(ManageAccountSettingsScreenKey manageAccountSettingsScreenKey, BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            bfm.Afo();
            return;
        }
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$ManageAccountSettingsEntryProviderKt$lambda$551835761$1$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        Function0 function0 = (Function0) objAaT;
        Object objAaT2 = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT2 == obj) {
            objAaT2 = ComposableSingletons$ManageAccountSettingsEntryProviderKt$lambda$551835761$1$2$1.INSTANCE;
            bfm.Ai0(objAaT2);
        }
        Function0 function02 = (Function0) objAaT2;
        boolean zA672 = bfm.A67(auraNavigatorA0b);
        Object objAaT3 = bfm.AaT();
        if (zA672 || objAaT3 == obj) {
            objAaT3 = new ComposableSingletons$ManageAccountSettingsEntryProviderKt$lambda$551835761$1$3$1(auraNavigatorA0b);
            bfm.Ai0(objAaT3);
        }
        Function0 function03 = (Function0) objAaT3;
        boolean zA673 = bfm.A67(auraNavigatorA0b);
        Object objAaT4 = bfm.AaT();
        if (zA673 || objAaT4 == obj) {
            objAaT4 = new ComposableSingletons$ManageAccountSettingsEntryProviderKt$lambda$551835761$1$4$1(auraNavigatorA0b);
            bfm.Ai0(objAaT4);
        }
        Function0 function04 = (Function0) objAaT4;
        boolean zA674 = bfm.A67(auraNavigatorA0b);
        Object objAaT5 = bfm.AaT();
        if (zA674 || objAaT5 == obj) {
            objAaT5 = new ComposableSingletons$ManageAccountSettingsEntryProviderKt$lambda$551835761$1$5$1(auraNavigatorA0b);
            bfm.Ai0(objAaT5);
        }
        Function0 function05 = (Function0) objAaT5;
        Object objAaT6 = bfm.AaT();
        if (objAaT6 == obj) {
            objAaT6 = new ComposableSingletons$ManageAccountSettingsEntryProviderKt$lambda$551835761$1$6$1(null);
            bfm.Ai0(objAaT6);
        }
        HatchActivationSettingsScreenKt.HatchActivationSettingsScreen(function0, function02, function03, function04, function05, (G0U) objAaT6, null, null, null, bfm, 48, VideoConfigJsonKt.SOURCE_WIDTH);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ManageAccountSettingsScreenKey manageAccountSettingsScreenKey, BFM bfm, Integer num) {
        invoke(manageAccountSettingsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
