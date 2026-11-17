package com.facebook.aura.spaces.view;

import X.AEs;
import X.AEu;
import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.AnonymousClass441;
import X.BLL;
import X.C05663ul;
import X.C1BN;
import X.C3Ej;
import X.C3Ek;
import X.HtJ;
import X.HzP;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.library.repo.UnifiedArtifact;
import com.facebook.aura.library.repo.UnifiedArtifactKt;
import com.facebook.aura.library.repo.UnifiedArtifactsRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class SpaceMetadataViewModel extends AEs {
    public static final int $stable = 8;
    public final C1BN<String> catalogSpaceId;
    public final C1BN<UnifiedArtifactsRepository.SpaceLookupResult> lookup;
    public final UnifiedArtifactsRepository repository;
    public final String slug;

    public final class Factory extends AuraViewModelFactory<SpaceMetadataViewModel> {
        public static final int $stable = 8;
        public final String slug;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public SpaceMetadataViewModel create() {
            return new SpaceMetadataViewModel(this.userSession, this.slug);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            this.userSession = abstractC3358CGz;
            this.slug = str;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.view.SpaceMetadataViewModel", f = "SpaceMetadataViewModel.kt", l = {48}, m = "lookUp", v = 2)
    /* renamed from: com.facebook.aura.spaces.view.SpaceMetadataViewModel$lookUp$2, reason: invalid class name */
    public final class AnonymousClass2 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpaceMetadataViewModel.this.lookUp(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object lookUp(X.HtJ<? super com.facebook.aura.library.repo.UnifiedArtifactsRepository.SpaceLookupResult> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.spaces.view.SpaceMetadataViewModel.AnonymousClass2
            if (r0 == 0) goto L1e
            r4 = r6
            com.facebook.aura.spaces.view.SpaceMetadataViewModel$lookUp$2 r4 = (com.facebook.aura.spaces.view.SpaceMetadataViewModel.AnonymousClass2) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 != r2) goto L24
            goto L39
        L1e:
            com.facebook.aura.spaces.view.SpaceMetadataViewModel$lookUp$2 r4 = new com.facebook.aura.spaces.view.SpaceMetadataViewModel$lookUp$2
            r4.<init>(r6)
            goto L12
        L24:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L29:
            X.Hwg.A00(r1)
            com.facebook.aura.library.repo.UnifiedArtifactsRepository r1 = r5.repository     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L49
            java.lang.String r0 = r5.slug     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L49
            r4.label = r2     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L49
            java.lang.Object r1 = r1.lookUpSpaceBySlug(r0, r4)     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L49
            if (r1 != r3) goto L3c
            return r3
        L39:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L49
        L3c:
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$SpaceLookupResult r1 = (com.facebook.aura.library.repo.UnifiedArtifactsRepository.SpaceLookupResult) r1     // Catch: java.lang.Exception -> L3f java.util.concurrent.CancellationException -> L49
            return r1
        L3f:
            java.lang.String r1 = "SpaceMetadataViewModel"
            java.lang.String r0 = "Unable to load space metadata"
            X.CFK.A06(r1, r0)
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$SpaceLookupResult$Failed r0 = com.facebook.aura.library.repo.UnifiedArtifactsRepository.SpaceLookupResult.Failed.INSTANCE
            return r0
        L49:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.view.SpaceMetadataViewModel.lookUp(X.HtJ):java.lang.Object");
    }

    public final C1BN<String> getCatalogSpaceId() {
        return this.catalogSpaceId;
    }

    public final C1BN<UnifiedArtifactsRepository.SpaceLookupResult> getLookup() {
        return this.lookup;
    }

    public SpaceMetadataViewModel(AbstractC3358CGz abstractC3358CGz, String str) {
        AnonymousClass003.A0u(abstractC3358CGz, str);
        this.slug = str;
        UnifiedArtifactsRepository companion = UnifiedArtifactsRepository.Companion.getInstance(abstractC3358CGz);
        this.repository = companion;
        C05663ul c05663ul = new C05663ul(new SpaceMetadataViewModel$lookup$1(this, null));
        BLL bllA00 = AEu.A00(this);
        C3Ej c3Ej = C3Ek.A01;
        this.lookup = AnonymousClass441.A00(null, bllA00, c05663ul, c3Ej);
        SpaceMetadataViewModel$special$$inlined$map$1 spaceMetadataViewModel$special$$inlined$map$1 = new SpaceMetadataViewModel$special$$inlined$map$1(companion.items, this);
        BLL bllA002 = AEu.A00(this);
        UnifiedArtifact unifiedArtifactFindSpaceBySlug = UnifiedArtifactKt.findSpaceBySlug(companion.items.getValue(), str);
        this.catalogSpaceId = AnonymousClass441.A00(unifiedArtifactFindSpaceBySlug != null ? unifiedArtifactFindSpaceBySlug.spaceId : null, bllA002, spaceMetadataViewModel$special$$inlined$map$1, c3Ej);
    }
}
