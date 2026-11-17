package com.facebook.aura.spaces.menu;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC05161qu;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.library.repo.UnifiedArtifact;
import com.facebook.aura.library.repo.UnifiedArtifactsRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.spaces.menu.SpaceContextMenuKt$rememberSpaceIsPinned$resolved$2$1", f = "SpaceContextMenu.kt", l = {564}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class SpaceContextMenuKt$rememberSpaceIsPinned$resolved$2$1 extends AbstractC07127nr implements G0V<InterfaceC05161qu<Boolean>, HtJ<? super Unit>, Object> {
    public final /* synthetic */ UnifiedArtifact $loaded;
    public final /* synthetic */ UnifiedArtifactsRepository $repository;
    public final /* synthetic */ String $slug;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceContextMenuKt$rememberSpaceIsPinned$resolved$2$1(UnifiedArtifact unifiedArtifact, UnifiedArtifactsRepository unifiedArtifactsRepository, String str, HtJ<? super SpaceContextMenuKt$rememberSpaceIsPinned$resolved$2$1> htJ) {
        super(2, htJ);
        this.$loaded = unifiedArtifact;
        this.$repository = unifiedArtifactsRepository;
        this.$slug = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        SpaceContextMenuKt$rememberSpaceIsPinned$resolved$2$1 spaceContextMenuKt$rememberSpaceIsPinned$resolved$2$1 = new SpaceContextMenuKt$rememberSpaceIsPinned$resolved$2$1(this.$loaded, this.$repository, this.$slug, htJ);
        spaceContextMenuKt$rememberSpaceIsPinned$resolved$2$1.L$0 = obj;
        return spaceContextMenuKt$rememberSpaceIsPinned$resolved$2$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        UnifiedArtifact unifiedArtifact;
        MutableState mutableState = (MutableState) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            unifiedArtifact = this.$loaded;
            if (unifiedArtifact == null) {
                UnifiedArtifactsRepository unifiedArtifactsRepository = this.$repository;
                String str = this.$slug;
                this.L$0 = null;
                this.L$1 = mutableState;
                this.label = 1;
                obj = unifiedArtifactsRepository.artifactForSpaceSlug(str, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            mutableState.Af8(boolValueOf);
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        mutableState = (MutableState) this.L$1;
        Hwg.A00(obj);
        unifiedArtifact = (UnifiedArtifact) obj;
        Boolean boolValueOf = unifiedArtifact == null ? null : Boolean.valueOf(unifiedArtifact.isPinned);
        mutableState.Af8(boolValueOf);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(InterfaceC05161qu<Boolean> interfaceC05161qu, HtJ<? super Unit> htJ) {
        return ((SpaceContextMenuKt$rememberSpaceIsPinned$resolved$2$1) create(interfaceC05161qu, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
