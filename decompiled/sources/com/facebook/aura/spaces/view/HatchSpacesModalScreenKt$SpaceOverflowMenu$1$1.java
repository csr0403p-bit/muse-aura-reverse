package com.facebook.aura.spaces.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.library.repo.ArtifactSource;
import com.facebook.aura.library.repo.ArtifactsDataSource;
import com.facebook.aura.spaces.model.AuraNavBarViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSpacesModalScreenKt$SpaceOverflowMenu$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ArtifactsDataSource $artifactsDataSource;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ boolean $isPinned;
    public final /* synthetic */ boolean $isShared;
    public final /* synthetic */ AuraNavBarViewModel $navBarViewModel;
    public final /* synthetic */ String $slug;
    public final /* synthetic */ String $spaceItemId;

    @DebugMetadata(c = "com.facebook.aura.spaces.view.HatchSpacesModalScreenKt$SpaceOverflowMenu$1$1$1", f = "HatchSpacesModalScreen.kt", l = {779}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.view.HatchSpacesModalScreenKt$SpaceOverflowMenu$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ArtifactsDataSource $artifactsDataSource;
        public final /* synthetic */ String $slug;
        public final /* synthetic */ ArtifactSource $source;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ArtifactsDataSource artifactsDataSource, ArtifactSource artifactSource, String str, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$artifactsDataSource = artifactsDataSource;
            this.$source = artifactSource;
            this.$slug = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$artifactsDataSource, this.$source, this.$slug, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ArtifactsDataSource artifactsDataSource = this.$artifactsDataSource;
                ArtifactSource artifactSource = this.$source;
                String str = this.$slug;
                this.label = 1;
                if (artifactsDataSource.unpin(artifactSource, str, this) == enumC10460Hji) {
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
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.view.HatchSpacesModalScreenKt$SpaceOverflowMenu$1$1$2", f = "HatchSpacesModalScreen.kt", l = {782}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.view.HatchSpacesModalScreenKt$SpaceOverflowMenu$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ArtifactsDataSource $artifactsDataSource;
        public final /* synthetic */ String $slug;
        public final /* synthetic */ ArtifactSource $source;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ArtifactsDataSource artifactsDataSource, ArtifactSource artifactSource, String str, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$artifactsDataSource = artifactsDataSource;
            this.$source = artifactSource;
            this.$slug = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$artifactsDataSource, this.$source, this.$slug, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ArtifactsDataSource artifactsDataSource = this.$artifactsDataSource;
                ArtifactSource artifactSource = this.$source;
                String str = this.$slug;
                this.label = 1;
                if (artifactsDataSource.pinToTop(artifactSource, str, this) == enumC10460Hji) {
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
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSpacesModalScreenKt$SpaceOverflowMenu$1$1(boolean z, boolean z2, AuraNavBarViewModel auraNavBarViewModel, String str, C3UX c3ux, ArtifactsDataSource artifactsDataSource, String str2) {
        super(0);
        this.$isShared = z;
        this.$isPinned = z2;
        this.$navBarViewModel = auraNavBarViewModel;
        this.$spaceItemId = str;
        this.$coroutineScope = c3ux;
        this.$artifactsDataSource = artifactsDataSource;
        this.$slug = str2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        C3UX c3ux;
        G0V anonymousClass2;
        ArtifactSource artifactSource = this.$isShared ? ArtifactSource.SAVED_SPACE : ArtifactSource.SPACE;
        boolean z = this.$isPinned;
        AuraNavBarViewModel auraNavBarViewModel = this.$navBarViewModel;
        String str = this.$spaceItemId;
        if (z) {
            auraNavBarViewModel.unpinItem(str);
            c3ux = this.$coroutineScope;
            anonymousClass2 = new AnonymousClass1(this.$artifactsDataSource, artifactSource, this.$slug, null);
        } else {
            auraNavBarViewModel.pinItem(str);
            c3ux = this.$coroutineScope;
            anonymousClass2 = new AnonymousClass2(this.$artifactsDataSource, artifactSource, this.$slug, null);
        }
        AnonymousClass001.A1J(anonymousClass2, c3ux);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
