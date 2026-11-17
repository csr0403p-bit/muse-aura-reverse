package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C0Yr;
import X.C78g;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.file.repo.HatchDeletedMediaStore;
import com.facebook.aura.library.repo.ArtifactOpenTarget;
import com.facebook.aura.library.repo.UnifiedArtifact;
import com.facebook.aura.library.repo.UnifiedArtifactsRepository;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HatchAuraMarkdownProvidersKt$FileChipWithPreview$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ String $resolvedPreviewPath;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    @DebugMetadata(c = "com.facebook.aura.conversation.view.richcontent.HatchAuraMarkdownProvidersKt$FileChipWithPreview$1$1$2", f = "HatchAuraMarkdownProviders.kt", l = {425}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchAuraMarkdownProvidersKt$FileChipWithPreview$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<String, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ AbstractC3358CGz $session;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AbstractC3358CGz abstractC3358CGz, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$session = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$session, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            boolean z = true;
            if (i == 0) {
                Hwg.A00(obj);
                UnifiedArtifactsRepository companion = UnifiedArtifactsRepository.Companion.getInstance(this.$session);
                this.L$0 = null;
                this.label = 1;
                obj = companion.artifactForOriginalFilePath(str, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            UnifiedArtifact unifiedArtifact = (UnifiedArtifact) obj;
            ArtifactOpenTarget artifactOpenTarget = unifiedArtifact != null ? unifiedArtifact.openTarget : null;
            if ((artifactOpenTarget instanceof ArtifactOpenTarget.Space) || (artifactOpenTarget instanceof ArtifactOpenTarget.SavedSpace) || (artifactOpenTarget instanceof ArtifactOpenTarget.PeerSpace)) {
                z = false;
            } else if (!(artifactOpenTarget instanceof ArtifactOpenTarget.File) && artifactOpenTarget != null) {
                throw new NoWhenBranchMatchedException();
            }
            return Boolean.valueOf(z);
        }

        @Override // X.G0V
        public final Object invoke(String str, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass2) create(str, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAuraMarkdownProvidersKt$FileChipWithPreview$1$1(String str, AbstractC3358CGz abstractC3358CGz) {
        super(1);
        this.$resolvedPreviewPath = str;
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        C78g c78g;
        String str = this.$resolvedPreviewPath;
        AbstractC3358CGz abstractC3358CGz = this.$userSession;
        if (str == null || abstractC3358CGz == null) {
            c78g = new C78g() { // from class: com.facebook.aura.conversation.view.richcontent.HatchAuraMarkdownProvidersKt$FileChipWithPreview$1$1$invoke$$inlined$onDispose$1
                @Override // X.C78g
                public void dispose() {
                }
            };
        } else {
            HatchDeletedMediaStore.Companion.getInstance(abstractC3358CGz).refreshFailedLoadState(str, new AnonymousClass2(abstractC3358CGz, null));
            c78g = new C78g() { // from class: com.facebook.aura.conversation.view.richcontent.HatchAuraMarkdownProvidersKt$FileChipWithPreview$1$1$invoke$$inlined$onDispose$2
                @Override // X.C78g
                public void dispose() {
                }
            };
        }
        return c78g;
    }
}
