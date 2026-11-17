package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BFM;
import X.BQN;
import X.C0861A6i;
import X.C78N;
import X.G0W;
import androidx.activity.ComponentActivity;
import com.facebook.aura.library.model.HatchLibraryViewModel;
import com.facebook.aura.library.view.MediaGalleryScreenKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.MediaGalleryScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ComposableSingletons$MediaGalleryEntryProviderKt$lambda$2022910672$1 extends AbstractC7559F3s implements G0W<MediaGalleryScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$MediaGalleryEntryProviderKt$lambda$2022910672$1 INSTANCE = new ComposableSingletons$MediaGalleryEntryProviderKt$lambda$2022910672$1();

    public ComposableSingletons$MediaGalleryEntryProviderKt$lambda$2022910672$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(MediaGalleryScreenKey mediaGalleryScreenKey, BFM bfm, Integer num) {
        invoke(mediaGalleryScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(MediaGalleryScreenKey mediaGalleryScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            HatchLibraryViewModel.Factory factory = new HatchLibraryViewModel.Factory(AnonymousClass002.A0h(bfm));
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            HatchLibraryViewModel hatchLibraryViewModel = (HatchLibraryViewModel) BQN.A00(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), null, new C0861A6i(HatchLibraryViewModel.class));
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ComposableSingletons$MediaGalleryEntryProviderKt$lambda$2022910672$1$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            MediaGalleryScreenKt.MediaGalleryScreen(hatchLibraryViewModel, (Function0) objAaT, null, bfm, HatchLibraryViewModel.$stable, 4);
            return;
        }
        bfm.Afo();
    }
}
