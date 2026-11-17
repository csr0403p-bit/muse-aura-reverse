package com.facebook.aura.spaces.conversation;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC05161qu;
import androidx.compose.runtime.MutableState;
import com.facebook.acra.util.minidump.MinidumpReader;
import com.facebook.aura.library.repo.ArtifactOpenTarget;
import com.facebook.aura.library.repo.UnifiedArtifact;
import com.facebook.aura.library.repo.UnifiedArtifactsRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.spaces.conversation.SharedSpaceWidgetRendererKt$SharedSpaceCard$catalogEntry$2$1", f = "SharedSpaceWidgetRenderer.kt", l = {MinidumpReader.MODULE_FULL_SIZE}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class SharedSpaceWidgetRendererKt$SharedSpaceCard$catalogEntry$2$1 extends AbstractC07127nr implements G0V<InterfaceC05161qu<UnifiedArtifact>, HtJ<? super Unit>, Object> {
    public final /* synthetic */ UnifiedArtifact $loaded;
    public final /* synthetic */ UnifiedArtifactsRepository $repository;
    public final /* synthetic */ SharedSpace $space;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedSpaceWidgetRendererKt$SharedSpaceCard$catalogEntry$2$1(UnifiedArtifact unifiedArtifact, UnifiedArtifactsRepository unifiedArtifactsRepository, SharedSpace sharedSpace, HtJ<? super SharedSpaceWidgetRendererKt$SharedSpaceCard$catalogEntry$2$1> htJ) {
        super(2, htJ);
        this.$loaded = unifiedArtifact;
        this.$repository = unifiedArtifactsRepository;
        this.$space = sharedSpace;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        SharedSpaceWidgetRendererKt$SharedSpaceCard$catalogEntry$2$1 sharedSpaceWidgetRendererKt$SharedSpaceCard$catalogEntry$2$1 = new SharedSpaceWidgetRendererKt$SharedSpaceCard$catalogEntry$2$1(this.$loaded, this.$repository, this.$space, htJ);
        sharedSpaceWidgetRendererKt$SharedSpaceCard$catalogEntry$2$1.L$0 = obj;
        return sharedSpaceWidgetRendererKt$SharedSpaceCard$catalogEntry$2$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState = (MutableState) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            obj = this.$loaded;
            if (obj == null) {
                UnifiedArtifactsRepository unifiedArtifactsRepository = this.$repository;
                ArtifactOpenTarget.PeerSpace peerSpace = this.$space.target;
                String str = peerSpace.hostMuse;
                String str2 = peerSpace.spaceId;
                this.L$0 = null;
                this.L$1 = mutableState;
                this.label = 1;
                obj = unifiedArtifactsRepository.artifactForPeerSpace(str, str2, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            mutableState = (MutableState) this.L$1;
            Hwg.A00(obj);
        }
        mutableState.Af8(obj);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(InterfaceC05161qu<UnifiedArtifact> interfaceC05161qu, HtJ<? super Unit> htJ) {
        return ((SharedSpaceWidgetRendererKt$SharedSpaceCard$catalogEntry$2$1) create(interfaceC05161qu, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
