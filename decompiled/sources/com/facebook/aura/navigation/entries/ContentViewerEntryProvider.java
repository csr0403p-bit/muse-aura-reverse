package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C5rn;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.AuraNavEntryProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.ContentViewerScreenKey;
import com.facebook.aura.navigation.key.ContentViewerTarget;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ContentViewerEntryProvider implements AuraNavEntryProvider {
    public static final int $stable = 0;
    public static final ContentViewerEntryProvider INSTANCE = new ContentViewerEntryProvider();

    /* renamed from: com.facebook.aura.navigation.entries.ContentViewerEntryProvider$provideEntry$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<ContentViewerScreenKey, Map<String, ? extends Object>> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final Map<String, Object> invoke(ContentViewerScreenKey contentViewerScreenKey) {
            C7384Etj.A0Y(contentViewerScreenKey, 0);
            return !(contentViewerScreenKey.target instanceof ContentViewerTarget.Artifact) ? ContentViewerEntryProviderKt.mediaViewerTransitionMetadata : contentViewerScreenKey.usesPushTransition ? AuraTransitionsKt.pushTransitionMetadata : AuraTransitionsKt.fadeTransitionMetadata;
        }
    }

    @Override // com.facebook.aura.navigation.AuraNavEntryProvider
    public void provideEntry(C5rn<AuraNavKey> c5rn) {
        C7384Etj.A0Y(c5rn, 0);
        c5rn.A00(new G0U<ContentViewerScreenKey, Object>() { // from class: com.facebook.aura.navigation.entries.ContentViewerEntryProvider$provideEntry$$inlined$entry$default$1
            @Override // X.G0U
            public final Object invoke(ContentViewerScreenKey contentViewerScreenKey) {
                return contentViewerScreenKey.toString();
            }
        }, AnonymousClass1.INSTANCE, ComposableSingletons$ContentViewerEntryProviderKt.f123lambda$992759791, C3cG.A0x(ContentViewerScreenKey.class));
    }
}
