package com.facebook.aura.sharedcontent;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BLG;
import X.BLL;
import X.C1BN;
import X.C22I;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.C3pd;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.C9290GCr;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.R;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.common.url.HatchUrl;
import com.facebook.aura.sharedcontent.ResolveResult;
import com.facebook.aura.sharedcontent.SaveResult;
import com.facebook.aura.sharedcontent.SharedContentEffect;
import com.facebook.aura.sharedcontent.SharedContentUiState;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class SharedContentViewModel extends AEs {
    public static final int $stable = 8;
    public final C3Em<SharedContentEffect> _effects;
    public final BLG<SharedContentUiState> _uiState;
    public final C22I<SharedContentEffect> effects;
    public final SharedContentRepository repository;
    public final String shareKey;
    public final String slug;
    public final C1BN<SharedContentUiState> uiState;

    @DebugMetadata(c = "com.facebook.aura.sharedcontent.SharedContentViewModel$1", f = "SharedContentViewModel.kt", l = {71}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharedcontent.SharedContentViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SharedContentViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SharedContentViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            BLG<SharedContentUiState> blg;
            int i;
            Object error;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i2 = this.label;
            if (i2 == 0) {
                Hwg.A00(obj);
                SharedContentViewModel sharedContentViewModel = SharedContentViewModel.this;
                blg = sharedContentViewModel._uiState;
                SharedContentRepository sharedContentRepository = sharedContentViewModel.repository;
                String str = sharedContentViewModel.slug;
                String str2 = sharedContentViewModel.shareKey;
                this.L$0 = blg;
                this.label = 1;
                obj = sharedContentRepository.resolveSharedUrl(str, str2, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i2 != 1) {
                    throw AnonymousClass001.A0n();
                }
                blg = (BLG) this.L$0;
                Hwg.A00(obj);
            }
            ResolveResult resolveResult = (ResolveResult) obj;
            if (resolveResult instanceof ResolveResult.Space) {
                ResolveResult.Space space = (ResolveResult.Space) resolveResult;
                error = new SharedContentUiState.Loaded(SharedContentType.SPACE, space.slug, space.displayName, space.webViewUrl, false, false, space.injectIabHeader);
            } else if (resolveResult instanceof ResolveResult.Artifact) {
                ResolveResult.Artifact artifact = (ResolveResult.Artifact) resolveResult;
                error = new SharedContentUiState.Loaded(SharedContentType.ARTIFACT, artifact.slug, artifact.displayName, artifact.webViewUrl, false, false, false);
            } else {
                if (C7384Etj.areEqual(resolveResult, ResolveResult.Invalid.INSTANCE)) {
                    i = R.string._name_removed__res_0x7f120f86;
                } else {
                    if (!(resolveResult instanceof ResolveResult.Failed)) {
                        throw C3cG.A0q();
                    }
                    i = R.string._name_removed__res_0x7f120f85;
                }
                error = new SharedContentUiState.Error(i);
            }
            AnonymousClass002.A1I(blg, error);
            return Unit.INSTANCE;
        }
    }

    public final class Factory extends AuraViewModelFactory<SharedContentViewModel> {
        public static final int $stable = 8;
        public final String shareKey;
        public final String slug;

        public Factory(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            this.slug = str;
            this.shareKey = str2;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public SharedContentViewModel create() {
            return new SharedContentViewModel(this.slug, this.shareKey, new SharedContentRepository());
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharedcontent.SharedContentViewModel$onSaveClicked$2", f = "SharedContentViewModel.kt", l = {107, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 116}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharedcontent.SharedContentViewModel$onSaveClicked$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ SharedContentUiState.Loaded $loaded;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SharedContentUiState.Loaded loaded, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$loaded = loaded;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SharedContentViewModel.this.new AnonymousClass2(this.$loaded, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            SharedContentUiState value;
            SharedContentUiState sharedContentUiState;
            C3Em<SharedContentEffect> c3Em;
            SharedContentEffect saveFailed;
            SharedContentUiState.Loaded loaded;
            SharedContentUiState.Loaded loadedCopy;
            SharedContentUiState value2;
            SharedContentUiState sharedContentUiState2;
            SharedContentUiState.Loaded loaded2;
            SharedContentUiState.Loaded loadedCopy2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SharedContentRepository sharedContentRepository = SharedContentViewModel.this.repository;
                String str = this.$loaded.slug;
                this.label = 1;
                obj = sharedContentRepository.saveSpace(str, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            SaveResult saveResult = (SaveResult) obj;
            if (C7384Etj.areEqual(saveResult, SaveResult.Success.INSTANCE)) {
                BLG<SharedContentUiState> blg = SharedContentViewModel.this._uiState;
                do {
                    value2 = blg.getValue();
                    sharedContentUiState2 = value2;
                    if ((sharedContentUiState2 instanceof SharedContentUiState.Loaded) && (loaded2 = (SharedContentUiState.Loaded) sharedContentUiState2) != null && (loadedCopy2 = loaded2.copy(loaded2.type, loaded2.slug, loaded2.displayName, loaded2.webViewUrl, true, false, loaded2.injectIabHeader)) != null) {
                        sharedContentUiState2 = loadedCopy2;
                    }
                } while (!blg.A6e(value2, sharedContentUiState2));
                c3Em = SharedContentViewModel.this._effects;
                saveFailed = SharedContentEffect.SavedToHatch.INSTANCE;
                this.L$0 = null;
                this.label = 2;
            } else {
                if (!(saveResult instanceof SaveResult.Failed)) {
                    throw C3cG.A0q();
                }
                BLG<SharedContentUiState> blg2 = SharedContentViewModel.this._uiState;
                do {
                    value = blg2.getValue();
                    sharedContentUiState = value;
                    if ((sharedContentUiState instanceof SharedContentUiState.Loaded) && (loaded = (SharedContentUiState.Loaded) sharedContentUiState) != null && (loadedCopy = loaded.copy(loaded.type, loaded.slug, loaded.displayName, loaded.webViewUrl, loaded.isSaved, false, loaded.injectIabHeader)) != null) {
                        sharedContentUiState = loadedCopy;
                    }
                } while (!blg2.A6e(value, sharedContentUiState));
                c3Em = SharedContentViewModel.this._effects;
                saveFailed = new SharedContentEffect.SaveFailed(((SaveResult.Failed) saveResult).message);
                this.L$0 = null;
                this.label = 3;
            }
            if (c3Em.emit(saveFailed, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharedcontent.SharedContentViewModel$onShareClicked$1", f = "SharedContentViewModel.kt", l = {97}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharedcontent.SharedContentViewModel$onShareClicked$1, reason: invalid class name and case insensitive filesystem */
    public final class C136501 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C136501(HtJ<? super C136501> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SharedContentViewModel.this.new C136501(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SharedContentViewModel.this.new C136501(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SharedContentViewModel sharedContentViewModel = SharedContentViewModel.this;
                C3Em<SharedContentEffect> c3Em = sharedContentViewModel._effects;
                SharedContentEffect.ShareUrl shareUrl = new SharedContentEffect.ShareUrl(HatchUrl.INSTANCE.sharedContentUrl(sharedContentViewModel.slug, sharedContentViewModel.shareKey));
                this.label = 1;
                if (c3Em.emit(shareUrl, this) == enumC10460Hji) {
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
    }

    public SharedContentViewModel(String str, String str2, SharedContentRepository sharedContentRepository) {
        AnonymousClass002.A1A(str, 0, sharedContentRepository);
        this.slug = str;
        this.shareKey = str2;
        this.repository = sharedContentRepository;
        C9286GCn c9286GCnA01 = HnJ.A01(SharedContentUiState.Loading.INSTANCE);
        this._uiState = c9286GCnA01;
        this.uiState = C3cG.A11(c9286GCnA01);
        Integer num = C79.A00;
        C9290GCr c9290GCrA12 = C3cG.A12(num, 0, 1);
        this._effects = c9290GCrA12;
        this.effects = C3pd.A00(c9290GCrA12);
        BLL bllA00 = AEu.A00(this);
        GAo.A02(num, C6ys.A00, new AnonymousClass1(null), bllA00);
    }

    public final C22I<SharedContentEffect> getEffects() {
        return this.effects;
    }

    public final C1BN<SharedContentUiState> getUiState() {
        return this.uiState;
    }

    public final void onSaveClicked() {
        SharedContentUiState.Loaded loaded;
        SharedContentUiState value;
        SharedContentUiState sharedContentUiState;
        SharedContentUiState.Loaded loaded2;
        SharedContentUiState.Loaded loadedCopy;
        SharedContentUiState value2 = this._uiState.getValue();
        if (!(value2 instanceof SharedContentUiState.Loaded) || (loaded = (SharedContentUiState.Loaded) value2) == null || loaded.type != SharedContentType.SPACE || loaded.saveInFlight || loaded.isSaved) {
            return;
        }
        BLG<SharedContentUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            sharedContentUiState = value;
            if ((sharedContentUiState instanceof SharedContentUiState.Loaded) && (loaded2 = (SharedContentUiState.Loaded) sharedContentUiState) != null && (loadedCopy = loaded2.copy(loaded2.type, loaded2.slug, loaded2.displayName, loaded2.webViewUrl, loaded2.isSaved, true, loaded2.injectIabHeader)) != null) {
                sharedContentUiState = loadedCopy;
            }
        } while (!blg.A6e(value, sharedContentUiState));
        AnonymousClass001.A1J(new AnonymousClass2(loaded, null), AEu.A00(this));
    }

    public final void onShareClicked() {
        AnonymousClass001.A1J(new C136501(null), AEu.A00(this));
    }
}
