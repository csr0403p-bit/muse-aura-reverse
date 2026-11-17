package com.facebook.aura.navigation.entries;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.library.repo.ArtifactsDataSource;
import com.facebook.aura.navigation.key.SpaceTabScreenKey;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.navigation.entries.ComposableSingletons$SpacesModalEntryProviderKt$lambda$255383627$1$1$1", f = "SpacesModalEntryProvider.kt", l = {R.styleable.maplibre_MapView_maplibre_uiTiltGestures}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ComposableSingletons$SpacesModalEntryProviderKt$lambda$255383627$1$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ SpaceTabScreenKey $key;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$SpacesModalEntryProviderKt$lambda$255383627$1$1$1(AbstractC3358CGz abstractC3358CGz, SpaceTabScreenKey spaceTabScreenKey, HtJ<? super ComposableSingletons$SpacesModalEntryProviderKt$lambda$255383627$1$1$1> htJ) {
        super(2, htJ);
        this.$userSession = abstractC3358CGz;
        this.$key = spaceTabScreenKey;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ComposableSingletons$SpacesModalEntryProviderKt$lambda$255383627$1$1$1(this.$userSession, this.$key, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            ArtifactsDataSource companion = ArtifactsDataSource.Companion.getInstance(this.$userSession);
            String str = this.$key.slug;
            this.label = 1;
            if (companion.touchRecentForSpace(str, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ComposableSingletons$SpacesModalEntryProviderKt$lambda$255383627$1$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
