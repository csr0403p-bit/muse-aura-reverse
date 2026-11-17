package com.facebook.aura.spaces.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C0861A6i;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC05161qu;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.library.repo.UnifiedArtifactsRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.spaces.view.HatchSpacesModalScreenKt$HatchSpacesModalScreen$lookup$2$1", f = "HatchSpacesModalScreen.kt", l = {234}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchSpacesModalScreenKt$HatchSpacesModalScreen$lookup$2$1 extends AbstractC07127nr implements G0V<InterfaceC05161qu<UnifiedArtifactsRepository.SpaceLookupResult>, HtJ<? super Unit>, Object> {
    public final /* synthetic */ UnifiedArtifactsRepository $artifactsRepository;
    public final /* synthetic */ String $slug;
    public final /* synthetic */ boolean $useNavigationArtifact;
    public long J$0;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSpacesModalScreenKt$HatchSpacesModalScreen$lookup$2$1(boolean z, UnifiedArtifactsRepository unifiedArtifactsRepository, String str, HtJ<? super HatchSpacesModalScreenKt$HatchSpacesModalScreen$lookup$2$1> htJ) {
        super(2, htJ);
        this.$useNavigationArtifact = z;
        this.$artifactsRepository = unifiedArtifactsRepository;
        this.$slug = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchSpacesModalScreenKt$HatchSpacesModalScreen$lookup$2$1 hatchSpacesModalScreenKt$HatchSpacesModalScreen$lookup$2$1 = new HatchSpacesModalScreenKt$HatchSpacesModalScreen$lookup$2$1(this.$useNavigationArtifact, this.$artifactsRepository, this.$slug, htJ);
        hatchSpacesModalScreenKt$HatchSpacesModalScreen$lookup$2$1.L$0 = obj;
        return hatchSpacesModalScreenKt$HatchSpacesModalScreen$lookup$2$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState = (MutableState) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$useNavigationArtifact) {
                obj = null;
                mutableState.Af8(obj);
                return Unit.INSTANCE;
            }
            long jNanoTime = System.nanoTime();
            UnifiedArtifactsRepository unifiedArtifactsRepository = this.$artifactsRepository;
            String str = this.$slug;
            this.L$0 = mutableState;
            this.J$0 = jNanoTime;
            this.label = 1;
            obj = unifiedArtifactsRepository.lookUpSpaceBySlug(str, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        System.nanoTime();
        C0861A6i.A01(obj.getClass());
        mutableState.Af8(obj);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(InterfaceC05161qu<UnifiedArtifactsRepository.SpaceLookupResult> interfaceC05161qu, HtJ<? super Unit> htJ) {
        return ((HatchSpacesModalScreenKt$HatchSpacesModalScreen$lookup$2$1) create(interfaceC05161qu, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
