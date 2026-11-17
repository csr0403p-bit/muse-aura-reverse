package com.facebook.aura.library.repo;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.library.repo.ArtifactsDataSource$touchRecentForSpace$source$1", f = "ArtifactsDataSource.kt", l = {106}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class ArtifactsDataSource$touchRecentForSpace$source$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ArtifactSource>, Object> {
    public final /* synthetic */ String $slug;
    public int label;
    public final /* synthetic */ ArtifactsDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArtifactsDataSource$touchRecentForSpace$source$1(ArtifactsDataSource artifactsDataSource, String str, HtJ<? super ArtifactsDataSource$touchRecentForSpace$source$1> htJ) {
        super(2, htJ);
        this.this$0 = artifactsDataSource;
        this.$slug = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ArtifactsDataSource$touchRecentForSpace$source$1(this.this$0, this.$slug, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            ArtifactsDataSource$touchRecentForSpace$source$1$invokeSuspend$$inlined$mapNotNull$1 artifactsDataSource$touchRecentForSpace$source$1$invokeSuspend$$inlined$mapNotNull$1 = new ArtifactsDataSource$touchRecentForSpace$source$1$invokeSuspend$$inlined$mapNotNull$1(this.this$0.items, this.$slug);
            this.label = 1;
            obj = AbstractC9777Gfy.A02(artifactsDataSource$touchRecentForSpace$source$1$invokeSuspend$$inlined$mapNotNull$1, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super ArtifactSource> htJ) {
        return ((ArtifactsDataSource$touchRecentForSpace$source$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
