package com.facebook.aura.navigation.entries;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BFM;
import X.BOD;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C78N;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ImportMemoryToHatchScreenKey;
import com.facebook.aura.settings.importmemory.HatchImportMemoryToHatchScreenKt;
import com.facebook.aura.settings.importmemory.HatchImportMemoryToHatchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ComposableSingletons$ImportMemoryToHatchEntryProviderKt$lambda$389433477$1 extends AbstractC7559F3s implements G0W<ImportMemoryToHatchScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ImportMemoryToHatchEntryProviderKt$lambda$389433477$1 INSTANCE = new ComposableSingletons$ImportMemoryToHatchEntryProviderKt$lambda$389433477$1();

    public ComposableSingletons$ImportMemoryToHatchEntryProviderKt$lambda$389433477$1() {
        super(3);
    }

    public final void invoke(ImportMemoryToHatchScreenKey importMemoryToHatchScreenKey, BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            bfm.Afo();
            return;
        }
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$ImportMemoryToHatchEntryProviderKt$lambda$389433477$1$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        Function0 function0 = (Function0) objAaT;
        HatchImportMemoryToHatchViewModel.Factory factory = new HatchImportMemoryToHatchViewModel.Factory(abstractC3358CGzA0h);
        BOD bodA00 = C5wL.A00(bfm);
        if (bodA00 == null) {
            throw AnonymousClass001.A0o();
        }
        HatchImportMemoryToHatchScreenKt.HatchImportMemoryToHatchScreen(function0, (HatchImportMemoryToHatchViewModel) C3cH.A0H(factory, bodA00, AnonymousClass005.A0Y(bodA00), C3cG.A0x(HatchImportMemoryToHatchViewModel.class)), null, bfm, HatchImportMemoryToHatchViewModel.$stable << 3, 4);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ImportMemoryToHatchScreenKey importMemoryToHatchScreenKey, BFM bfm, Integer num) {
        invoke(importMemoryToHatchScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
