package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BFM;
import X.BOD;
import X.BQN;
import X.C0861A6i;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import X.G0W;
import com.facebook.aura.file.view.FolderViewerScreenKt;
import com.facebook.aura.file.view.FolderViewerViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.FolderViewerScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ComposableSingletons$FolderViewerEntryProviderKt$lambda$154437574$1 extends AbstractC7559F3s implements G0W<FolderViewerScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$FolderViewerEntryProviderKt$lambda$154437574$1 INSTANCE = new ComposableSingletons$FolderViewerEntryProviderKt$lambda$154437574$1();

    public ComposableSingletons$FolderViewerEntryProviderKt$lambda$154437574$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(FolderViewerScreenKey folderViewerScreenKey, BFM bfm, Integer num) {
        invoke(folderViewerScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(FolderViewerScreenKey folderViewerScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(folderViewerScreenKey, 0);
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        FolderViewerViewModel.Factory factory = new FolderViewerViewModel.Factory(folderViewerScreenKey.relativePath, AnonymousClass002.A0h(bfm));
        BOD bodA00 = C5wL.A00(bfm);
        if (bodA00 != null) {
            FolderViewerViewModel folderViewerViewModel = (FolderViewerViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), null, new C0861A6i(FolderViewerViewModel.class));
            String str = folderViewerScreenKey.relativePath;
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ComposableSingletons$FolderViewerEntryProviderKt$lambda$154437574$1$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            boolean zA672 = bfm.A67(auraNavigatorA0b);
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new ComposableSingletons$FolderViewerEntryProviderKt$lambda$154437574$1$2$1(auraNavigatorA0b);
                bfm.Ai0(objAaT2);
            }
            FolderViewerScreenKt.FolderViewerScreen(str, folderViewerViewModel, function0, null, (G0V) objAaT2, bfm, FolderViewerViewModel.$stable << 3, 8);
            return;
        }
        throw AnonymousClass001.A0o();
    }
}
