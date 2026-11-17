package com.facebook.aura.file.viewmodel;

import X.A6J;
import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC08429uh;
import X.AbstractC3358CGz;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C78T;
import X.C7BY;
import X.C9286GCn;
import X.C9uG;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC08439ui;
import android.net.Uri;
import com.facebook.aura.file.repo.ArtifactDeployHolder;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.file.view.ArtifactFileActionMenuKt;
import com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState;
import com.facebook.aura.gateway.HatchArtifactPublishLogger;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.opengraph.HatchOpenGraphRepository;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class HatchPublishArtifactViewModel extends AEs {
    public static final Companion Companion = new Companion();
    public static final String TAG = "HatchPublishArtifactVM";
    public final BLG<HatchPublishBottomSheetState> _uiState;
    public final ArtifactDeployHolder deployHolder;
    public final String filePath;
    public final boolean hasPendingChangesHint;
    public final String initialDeployedUrl;
    public final String initialFileName;
    public final String projectDir;
    public final C1BN<HatchPublishBottomSheetState> uiState;
    public final String url;
    public final AbstractC3358CGz userSession;

    public final class Factory implements InterfaceC08439ui {
        public final String fileName;
        public final boolean hasPendingChangesHint;
        public final String initialDeployedUrl;
        public final String url;
        public final AbstractC3358CGz userSession;

        @Override // X.InterfaceC08439ui
        public <T extends AEs> T create(Class<T> cls) {
            return new HatchPublishArtifactViewModel(this.userSession, this.url, this.fileName, this.initialDeployedUrl, this.hasPendingChangesHint);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str, String str2, String str3, boolean z) {
            AnonymousClass005.A0x(abstractC3358CGz, str, str2);
            this.userSession = abstractC3358CGz;
            this.url = str;
            this.fileName = str2;
            this.initialDeployedUrl = str3;
            this.hasPendingChangesHint = z;
        }

        @Override // X.InterfaceC08439ui
        public /* bridge */ <T extends AEs> T create(C9uG<T> c9uG, A6J a6j) {
            return (T) AbstractC08429uh.A00(this, a6j, c9uG);
        }

        @Override // X.InterfaceC08439ui
        public /* bridge */ <T extends AEs> T create(Class<T> cls, A6J a6j) {
            return (T) InterfaceC08439ui.A00(this, cls);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel$loadInitialState$2", f = "HatchPublishArtifactViewModel.kt", l = {90, 93, 94}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel$loadInitialState$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ boolean $hasPendingChanges;
        public Object L$0;
        public Object L$1;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel$loadInitialState$2$1", f = "HatchPublishArtifactViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel$loadInitialState$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ HatchPublishBottomSheetState $newState;
            public int label;
            public final /* synthetic */ HatchPublishArtifactViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HatchPublishArtifactViewModel hatchPublishArtifactViewModel, HatchPublishBottomSheetState hatchPublishBottomSheetState, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.this$0 = hatchPublishArtifactViewModel;
                this.$newState = hatchPublishBottomSheetState;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, this.$newState, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                this.this$0._uiState.Af8(this.$newState);
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, boolean z, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$fileName = str;
            this.$hasPendingChanges = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchPublishArtifactViewModel.this.new AnonymousClass2(this.$fileName, this.$hasPendingChanges, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0054 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0072 A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r5 = 3
                r6 = 2
                r3 = 1
                if (r0 == 0) goto L15
                if (r0 == r3) goto L35
                if (r0 == r6) goto L55
                if (r0 != r5) goto L73
                X.Hwg.A00(r8)
            L12:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            L15:
                X.Hwg.A00(r8)
                com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel r0 = com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel.this
                com.facebook.aura.file.repo.ArtifactDeployHolder r1 = r0.deployHolder
                java.lang.String r0 = r0.projectDir
                com.facebook.aura.gateway.HatchFileOperations$FetchArtifactUrlResult r8 = r1.peekCachedStatus(r0)
                if (r8 != 0) goto L43
                com.facebook.aura.gateway.HatchFileOperations r2 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
                com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel r0 = com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel.this
                java.lang.String r1 = r0.projectDir
                X.CGz r0 = r0.userSession
                r7.label = r3
                java.lang.Object r8 = r2.fetchArtifactUrl(r1, r0, r7)
                if (r8 != r4) goto L38
                return r4
            L35:
                X.Hwg.A00(r8)
            L38:
                com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel r0 = com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel.this
                com.facebook.aura.gateway.HatchFileOperations$FetchArtifactUrlResult r8 = (com.facebook.aura.gateway.HatchFileOperations.FetchArtifactUrlResult) r8
                com.facebook.aura.file.repo.ArtifactDeployHolder r1 = r0.deployHolder
                java.lang.String r0 = r0.projectDir
                r1.cacheStatus(r0, r8)
            L43:
                com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel r3 = com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel.this
                java.lang.String r2 = r7.$fileName
                boolean r1 = r7.$hasPendingChanges
                r0 = 0
                r7.L$0 = r0
                r7.label = r6
                java.lang.Object r8 = com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel.access$resolveFetchedState(r3, r8, r2, r1, r7)
                if (r8 != r4) goto L58
                return r4
            L55:
                X.Hwg.A00(r8)
            L58:
                com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState r8 = (com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState) r8
                X.78T r3 = X.C3cG.A0v()
                com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel r2 = com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel.this
                r1 = 0
                com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel$loadInitialState$2$1 r0 = new com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel$loadInitialState$2$1
                r0.<init>(r2, r8, r1)
                r7.L$0 = r1
                r7.L$1 = r1
                r7.label = r5
                java.lang.Object r0 = X.GAo.A00(r7, r3, r0)
                if (r0 != r4) goto L12
                return r4
            L73:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel$publishArtifact$1", f = "HatchPublishArtifactViewModel.kt", l = {152, 155, 165}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel$publishArtifact$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchPublishBottomSheetState $state;
        public Object L$0;
        public int label;
        public final /* synthetic */ HatchPublishArtifactViewModel this$0;

        @DebugMetadata(c = "com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel$publishArtifact$1$1", f = "HatchPublishArtifactViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel$publishArtifact$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01611 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ HatchFileOperations.ShareArtifactResult $result;
            public final /* synthetic */ HatchPublishBottomSheetState $state;
            public int label;
            public final /* synthetic */ HatchPublishArtifactViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01611(HatchPublishArtifactViewModel hatchPublishArtifactViewModel, HatchPublishBottomSheetState hatchPublishBottomSheetState, HatchFileOperations.ShareArtifactResult shareArtifactResult, HtJ<? super C01611> htJ) {
                super(2, htJ);
                this.this$0 = hatchPublishArtifactViewModel;
                this.$state = hatchPublishBottomSheetState;
                this.$result = shareArtifactResult;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C01611(this.this$0, this.$state, this.$result, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                this.this$0.deployHolder.onPublished(this.$state.getProjectDir(), ((HatchFileOperations.ShareArtifactResult.Success) this.$result).url);
                AnonymousClass002.A1I(this.this$0._uiState, new HatchPublishBottomSheetState.Success(this.$state.getFileName(), this.$state.getProjectDir(), ((HatchFileOperations.ShareArtifactResult.Success) this.$result).url));
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((C01611) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel$publishArtifact$1$2", f = "HatchPublishArtifactViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel$publishArtifact$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ HatchFileOperations.ShareArtifactResult $result;
            public final /* synthetic */ HatchPublishBottomSheetState $state;
            public int label;
            public final /* synthetic */ HatchPublishArtifactViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(HatchFileOperations.ShareArtifactResult shareArtifactResult, HatchPublishArtifactViewModel hatchPublishArtifactViewModel, HatchPublishBottomSheetState hatchPublishBottomSheetState, HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
                this.$result = shareArtifactResult;
                this.this$0 = hatchPublishArtifactViewModel;
                this.$state = hatchPublishBottomSheetState;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass2(this.$result, this.this$0, this.$state, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                CFK.A04(HatchPublishArtifactViewModel.TAG, FGI.A0M("Artifact publish failed: ", ((HatchFileOperations.ShareArtifactResult.Failed) this.$result).reason));
                AnonymousClass002.A1I(this.this$0._uiState, new HatchPublishBottomSheetState.Failed(this.$state.getFileName(), this.$state.getProjectDir(), HatchPublishBottomSheetState.RetryAction.DEPLOY));
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchPublishBottomSheetState hatchPublishBottomSheetState, HatchPublishArtifactViewModel hatchPublishArtifactViewModel, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$state = hatchPublishBottomSheetState;
            this.this$0 = hatchPublishArtifactViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$state, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objA00;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A08(HatchPublishArtifactViewModel.TAG, FGI.A0M("Failed to publish artifact for ", this.$state.getProjectDir()), e2);
                AnonymousClass002.A1I(this.this$0._uiState, new HatchPublishBottomSheetState.Failed(this.$state.getFileName(), this.$state.getProjectDir(), HatchPublishBottomSheetState.RetryAction.DEPLOY));
            }
            if (i == 0) {
                Hwg.A00(obj);
                HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
                String projectDir = this.$state.getProjectDir();
                AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
                this.label = 1;
                obj = hatchFileOperations.shareArtifact(projectDir, abstractC3358CGz, this);
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
            HatchFileOperations.ShareArtifactResult shareArtifactResult = (HatchFileOperations.ShareArtifactResult) obj;
            if (shareArtifactResult instanceof HatchFileOperations.ShareArtifactResult.Success) {
                C78T c78tA0v = C3cG.A0v();
                C01611 c01611 = new C01611(this.this$0, this.$state, shareArtifactResult, null);
                this.L$0 = null;
                this.label = 2;
                objA00 = GAo.A00(this, c78tA0v, c01611);
            } else {
                if (!(shareArtifactResult instanceof HatchFileOperations.ShareArtifactResult.Failed)) {
                    throw C3cG.A0q();
                }
                C78T c78tA0v2 = C3cG.A0v();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(shareArtifactResult, this.this$0, this.$state, null);
                this.L$0 = null;
                this.label = 3;
                objA00 = GAo.A00(this, c78tA0v2, anonymousClass2);
            }
            if (objA00 == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel", f = "HatchPublishArtifactViewModel.kt", l = {105}, m = "resolveFetchedState", v = 2)
    /* renamed from: com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel$resolveFetchedState$1, reason: invalid class name and case insensitive filesystem */
    public final class C119931 extends HzP {
        public Object L$0;
        public Object L$1;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C119931(HtJ<? super C119931> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchPublishArtifactViewModel.this.resolveFetchedState(null, null, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel$unpublishArtifact$3", f = "HatchPublishArtifactViewModel.kt", l = {227, 231, 246}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel$unpublishArtifact$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchPublishBottomSheetState $state;
        public long J$0;
        public long J$1;
        public Object L$0;
        public int label;
        public final /* synthetic */ HatchPublishArtifactViewModel this$0;

        @DebugMetadata(c = "com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel$unpublishArtifact$3$1", f = "HatchPublishArtifactViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel$unpublishArtifact$3$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ long $elapsedMs;
            public final /* synthetic */ HatchFileOperations.RemoveArtifactResult $result;
            public final /* synthetic */ HatchPublishBottomSheetState $state;
            public int label;
            public final /* synthetic */ HatchPublishArtifactViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HatchPublishBottomSheetState hatchPublishBottomSheetState, HatchFileOperations.RemoveArtifactResult removeArtifactResult, long j, HatchPublishArtifactViewModel hatchPublishArtifactViewModel, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.$state = hatchPublishBottomSheetState;
                this.$result = removeArtifactResult;
                this.$elapsedMs = j;
                this.this$0 = hatchPublishArtifactViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.$state, this.$result, this.$elapsedMs, this.this$0, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                HatchArtifactPublishLogger.INSTANCE.logUnpublishSuccess("PublishArtifactViewModel", this.$state.getProjectDir(), ((HatchFileOperations.RemoveArtifactResult.Success) this.$result).destroyed, this.$elapsedMs);
                this.this$0.deployHolder.onUnpublished(this.$state.getProjectDir());
                AnonymousClass002.A1I(this.this$0._uiState, new HatchPublishBottomSheetState.Unpublished(this.$state.getFileName(), this.$state.getProjectDir()));
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel$unpublishArtifact$3$2", f = "HatchPublishArtifactViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel$unpublishArtifact$3$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ long $elapsedMs;
            public final /* synthetic */ HatchFileOperations.RemoveArtifactResult $result;
            public final /* synthetic */ HatchPublishBottomSheetState $state;
            public int label;
            public final /* synthetic */ HatchPublishArtifactViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(HatchPublishBottomSheetState hatchPublishBottomSheetState, HatchFileOperations.RemoveArtifactResult removeArtifactResult, long j, HatchPublishArtifactViewModel hatchPublishArtifactViewModel, HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
                this.$state = hatchPublishBottomSheetState;
                this.$result = removeArtifactResult;
                this.$elapsedMs = j;
                this.this$0 = hatchPublishArtifactViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass2(this.$state, this.$result, this.$elapsedMs, this.this$0, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                HatchArtifactPublishLogger.INSTANCE.logUnpublishFailed("PublishArtifactViewModel", this.$state.getProjectDir(), ((HatchFileOperations.RemoveArtifactResult.Failed) this.$result).reason, this.$elapsedMs, AnonymousClass006.A10("fileName", this.$state.getFileName()));
                AnonymousClass002.A1I(this.this$0._uiState, new HatchPublishBottomSheetState.Failed(this.$state.getFileName(), this.$state.getProjectDir(), HatchPublishBottomSheetState.RetryAction.UNPUBLISH));
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            long jNow;
            Object objA00;
            Object objRemoveArtifact = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A08(HatchPublishArtifactViewModel.TAG, FGI.A0M("Failed to unpublish artifact for ", this.$state.getProjectDir()), e2);
                AnonymousClass002.A1I(this.this$0._uiState, new HatchPublishBottomSheetState.Failed(this.$state.getFileName(), this.$state.getProjectDir(), HatchPublishBottomSheetState.RetryAction.UNPUBLISH));
            }
            if (i == 0) {
                Hwg.A00(obj);
                jNow = HatchArtifactPublishLogger.clock.now();
                HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
                String projectDir = this.$state.getProjectDir();
                AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
                this.J$0 = jNow;
                this.label = 1;
                objRemoveArtifact = hatchFileOperations.removeArtifact(projectDir, abstractC3358CGz, this);
                if (objRemoveArtifact == enumC10460Hji) {
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
                jNow = this.J$0;
                Hwg.A00(obj);
            }
            HatchFileOperations.RemoveArtifactResult removeArtifactResult = (HatchFileOperations.RemoveArtifactResult) objRemoveArtifact;
            long jNow2 = HatchArtifactPublishLogger.clock.now() - jNow;
            if (removeArtifactResult instanceof HatchFileOperations.RemoveArtifactResult.Success) {
                C78T c78tA0v = C3cG.A0v();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$state, removeArtifactResult, jNow2, this.this$0, null);
                this.L$0 = null;
                this.J$0 = jNow;
                this.J$1 = jNow2;
                this.label = 2;
                objA00 = GAo.A00(this, c78tA0v, anonymousClass1);
            } else {
                if (!(removeArtifactResult instanceof HatchFileOperations.RemoveArtifactResult.Failed)) {
                    throw C3cG.A0q();
                }
                C78T c78tA0v2 = C3cG.A0v();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$state, removeArtifactResult, jNow2, this.this$0, null);
                this.L$0 = null;
                this.J$0 = jNow;
                this.J$1 = jNow2;
                this.label = 3;
                objA00 = GAo.A00(this, c78tA0v2, anonymousClass2);
            }
            if (objA00 == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchPublishBottomSheetState hatchPublishBottomSheetState, HatchPublishArtifactViewModel hatchPublishArtifactViewModel, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$state = hatchPublishBottomSheetState;
            this.this$0 = hatchPublishArtifactViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass3(this.$state, this.this$0, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HatchPublishArtifactViewModel(AbstractC3358CGz abstractC3358CGz, String str, String str2, String str3, boolean z) {
        int iA1Z = AnonymousClass005.A1Z(abstractC3358CGz, str, str2);
        this.userSession = abstractC3358CGz;
        this.url = str;
        this.initialFileName = str2;
        this.initialDeployedUrl = str3;
        this.hasPendingChangesHint = z;
        this.deployHolder = ArtifactDeployHolder.Companion.getInstance(abstractC3358CGz);
        String strResolveProjectDir = resolveProjectDir(str);
        this.projectDir = strResolveProjectDir;
        this.filePath = resolveFilePath(str);
        if (C7BY.A0j(str2)) {
            char[] cArr = new char[iA1Z];
            cArr[0] = '/';
            String strA0Z = C7BY.A0Z(strResolveProjectDir, cArr);
            str2 = C7BY.A0V(strA0Z, CustomConnectorRegisterRepositoryKt.ROOT_PATH, strA0Z);
        }
        C9286GCn c9286GCnA14 = C3cG.A14(new HatchPublishBottomSheetState.Loading(str2, strResolveProjectDir));
        this._uiState = c9286GCnA14;
        this.uiState = c9286GCnA14;
        loadInitialState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolveFetchedState(com.facebook.aura.gateway.HatchFileOperations.FetchArtifactUrlResult r8, java.lang.String r9, boolean r10, X.HtJ<? super com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState> r11) {
        /*
            r7 = this;
            r6 = r9
            boolean r0 = r11 instanceof com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel.C119931
            if (r0 == 0) goto L7a
            r5 = r11
            com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel$resolveFetchedState$1 r5 = (com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel.C119931) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7a
            int r2 = r2 - r1
            r5.label = r2
        L13:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L5e
            if (r0 != r3) goto L80
            boolean r10 = r5.Z$0
            java.lang.Object r6 = r5.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r8 = r5.L$0
            com.facebook.aura.gateway.HatchFileOperations$FetchArtifactUrlResult r8 = (com.facebook.aura.gateway.HatchFileOperations.FetchArtifactUrlResult) r8
            X.Hwg.A00(r1)
        L2b:
            com.facebook.aura.gateway.HatchFileOperations$StatResult r1 = (com.facebook.aura.gateway.HatchFileOperations.StatResult) r1
            boolean r0 = r1 instanceof com.facebook.aura.gateway.HatchFileOperations.StatResult.Success
            r3 = 0
            if (r0 == 0) goto L44
            com.facebook.aura.gateway.HatchFileOperations$StatResult$Success r1 = (com.facebook.aura.gateway.HatchFileOperations.StatResult.Success) r1
            if (r1 == 0) goto L44
            com.facebook.aura.gateway.HatchFileOperations$FileEntry r0 = r1.entry
            if (r0 == 0) goto L44
            java.lang.String r1 = r0.modifiedAt
            if (r1 == 0) goto L44
            com.facebook.aura.gateway.HatchFileOperations r0 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
            java.lang.Long r3 = r0.parseIso8601ToMs(r1)
        L44:
            if (r10 != 0) goto L8f
            com.facebook.aura.gateway.HatchFileOperations r2 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
            r1 = r8
            com.facebook.aura.gateway.HatchFileOperations$FetchArtifactUrlResult$Success r1 = (com.facebook.aura.gateway.HatchFileOperations.FetchArtifactUrlResult.Success) r1
            java.lang.String r0 = r1.lastUpdated
            boolean r0 = r2.fileModifiedAfterDeploy(r0, r3)
            if (r0 != 0) goto L8f
            java.lang.String r2 = r7.projectDir
            java.lang.String r1 = r1.url
            r0 = 0
            com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState$UpToDate r5 = new com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState$UpToDate
            r5.<init>(r6, r2, r1, r0)
            return r5
        L5e:
            X.Hwg.A00(r1)
            boolean r0 = r8 instanceof com.facebook.aura.gateway.HatchFileOperations.FetchArtifactUrlResult.Success
            if (r0 == 0) goto L85
            com.facebook.aura.gateway.HatchFileOperations r2 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
            java.lang.String r1 = r7.filePath
            X.CGz r0 = r7.userSession
            r5.L$0 = r8
            r5.L$1 = r9
            r5.Z$0 = r10
            r5.label = r3
            java.lang.Object r1 = r2.statFile(r1, r0, r5)
            if (r1 != r4) goto L2b
            return r4
        L7a:
            com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel$resolveFetchedState$1 r5 = new com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel$resolveFetchedState$1
            r5.<init>(r11)
            goto L13
        L80:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L85:
            boolean r0 = r8 instanceof com.facebook.aura.gateway.HatchFileOperations.FetchArtifactUrlResult.Failed
            if (r0 == 0) goto La6
            if (r10 == 0) goto L9d
            java.lang.String r7 = r7.projectDir
            r8 = 0
            goto L95
        L8f:
            java.lang.String r7 = r7.projectDir
            com.facebook.aura.gateway.HatchFileOperations$FetchArtifactUrlResult$Success r8 = (com.facebook.aura.gateway.HatchFileOperations.FetchArtifactUrlResult.Success) r8
            java.lang.String r8 = r8.url
        L95:
            r9 = 0
            com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState$HasChanges r5 = new com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState$HasChanges
            r10 = r9
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        L9d:
            java.lang.String r2 = r7.projectDir
            r1 = 0
            com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState$Ready r0 = new com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState$Ready
            r0.<init>(r9, r2, r1)
            return r0
        La6:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel.resolveFetchedState(com.facebook.aura.gateway.HatchFileOperations$FetchArtifactUrlResult, java.lang.String, boolean, X.HtJ):java.lang.Object");
    }

    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchPublishBottomSheetState.RetryAction.values().length];
            try {
                AnonymousClass002.A13(HatchPublishBottomSheetState.RetryAction.UNPUBLISH, iArr);
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void loadInitialState() {
        /*
            r9 = this;
            X.BLG<com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState> r0 = r9._uiState
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState r0 = (com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState) r0
            java.lang.String r5 = r0.getFileName()
            com.facebook.aura.file.repo.ArtifactDeployHolder r1 = r9.deployHolder
            java.lang.String r0 = r9.projectDir
            com.facebook.aura.file.repo.ArtifactDeploySnapshot r1 = r1.consumeAll(r0)
            java.lang.String r7 = r1.publishedUrl
            if (r7 == 0) goto L26
            X.BLG<com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState> r2 = r9._uiState
            java.lang.String r6 = r9.projectDir
        L1c:
            r0 = 0
            com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState$UpToDate r4 = new com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState$UpToDate
            r4.<init>(r5, r6, r7, r0)
        L22:
            X.AnonymousClass002.A1I(r2, r4)
            return
        L26:
            boolean r0 = r1.unpublished
            if (r0 == 0) goto L35
            X.BLG<com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState> r2 = r9._uiState
            java.lang.String r1 = r9.projectDir
            r0 = 0
            com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState$Ready r4 = new com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState$Ready
            r4.<init>(r5, r1, r0)
            goto L22
        L35:
            boolean r0 = r1.edited
            if (r0 != 0) goto L3e
            boolean r0 = r9.hasPendingChangesHint
            r4 = 0
            if (r0 == 0) goto L3f
        L3e:
            r4 = 1
        L3f:
            java.lang.String r7 = r9.initialDeployedUrl
            if (r7 == 0) goto L51
            X.BLG<com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState> r2 = r9._uiState
            java.lang.String r6 = r9.projectDir
            if (r4 == 0) goto L1c
            r8 = 0
            com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState$HasChanges r4 = new com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState$HasChanges
            r9 = r8
            r4.<init>(r5, r6, r7, r8, r9)
            goto L22
        L51:
            X.BLL r3 = X.AEu.A00(r9)
            X.78T r2 = X.AnonymousClass001.A0y()
            r1 = 0
            com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel$loadInitialState$2 r0 = new com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel$loadInitialState$2
            r0.<init>(r5, r4, r1)
            X.AnonymousClass001.A1I(r2, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel.loadInitialState():void");
    }

    private final String resolveFilePath(String str) {
        return HatchFileUIUtils.INSTANCE.ensureWorkspacePrefix(resolveRelativePath(str));
    }

    private final String resolveProjectDir(String str) {
        return HatchFileOperations.INSTANCE.resolveProjectDirFromPath(resolveRelativePath(str));
    }

    private final String resolveRelativePath(String str) {
        String strA00 = AnonymousClass000.A00(20);
        if (C7BY.A0q(str, strA00, false)) {
            String strA0U = C7BY.A0U(str, strA00, str);
            String strDecode = Uri.decode(C7BY.A0W(strA0U, HatchOpenGraphRepository.UNKNOWN_HOST, strA0U));
            C7384Etj.A0U(strDecode);
            return strDecode;
        }
        if (!AnonymousClass005.A1a(str, ArtifactFileActionMenuKt.SANDBOX_REFERENCE_PREFIX)) {
            return C7BY.A0W(str, HatchOpenGraphRepository.UNKNOWN_HOST, str);
        }
        String strA0K = C7BY.A0K(ArtifactFileActionMenuKt.SANDBOX_REFERENCE_PREFIX, str);
        return C7BY.A0W(strA0K, HatchOpenGraphRepository.UNKNOWN_HOST, strA0K);
    }

    public final C1BN<HatchPublishBottomSheetState> getUiState() {
        return this.uiState;
    }

    public final void publishArtifact() {
        HtJ htJ;
        HatchPublishBottomSheetState hatchPublishBottomSheetStateCopy;
        HatchPublishBottomSheetState value = this._uiState.getValue();
        if (value instanceof HatchPublishBottomSheetState.Ready) {
            HatchPublishBottomSheetState.Ready ready = (HatchPublishBottomSheetState.Ready) value;
            if (ready.isPublishing) {
                return;
            }
            htJ = null;
            hatchPublishBottomSheetStateCopy = ready.copy(ready.fileName, ready.projectDir, true);
        } else {
            if (!(value instanceof HatchPublishBottomSheetState.HasChanges)) {
                return;
            }
            HatchPublishBottomSheetState.HasChanges hasChanges = (HatchPublishBottomSheetState.HasChanges) value;
            if (hasChanges.isPublishing) {
                return;
            }
            htJ = null;
            hatchPublishBottomSheetStateCopy = hasChanges.copy(hasChanges.fileName, hasChanges.projectDir, hasChanges.url, true, hasChanges.isUnpublishing);
        }
        HatchPublishBottomSheetState hatchPublishBottomSheetState = hatchPublishBottomSheetStateCopy;
        this._uiState.Af8(hatchPublishBottomSheetState);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(hatchPublishBottomSheetState, this, htJ), AEu.A00(this));
    }

    public final void retryPublishArtifact() {
        HatchPublishBottomSheetState.Failed failed;
        HatchPublishBottomSheetState.RetryAction retryAction;
        HatchPublishBottomSheetState value = this._uiState.getValue();
        if ((value instanceof HatchPublishBottomSheetState.Failed) && (failed = (HatchPublishBottomSheetState.Failed) value) != null && (retryAction = failed.retryAction) != null && retryAction.ordinal() == 1) {
            unpublishArtifact();
        } else {
            AnonymousClass002.A1I(this._uiState, new HatchPublishBottomSheetState.Ready(value.getFileName(), value.getProjectDir(), false));
            publishArtifact();
        }
    }

    public final void unpublishArtifact() {
        HatchPublishBottomSheetState.HasChanges hasChanges;
        HatchPublishBottomSheetState value;
        String str;
        String str2;
        String str3;
        HatchPublishBottomSheetState value2 = this._uiState.getValue();
        HatchArtifactPublishLogger.INSTANCE.logUnpublishStarted("PublishArtifactViewModel", value2.getProjectDir(), value2.getFileName(), C3cH.A0m("filePath", this.filePath, C3cG.A0r("stateType", C60O.A0n(value2)), C3cG.A0r("url", this.url)));
        if (value2 instanceof HatchPublishBottomSheetState.UpToDate) {
            BLG<HatchPublishBottomSheetState> blg = this._uiState;
            do {
                value = blg.getValue();
                HatchPublishBottomSheetState.UpToDate upToDate = (HatchPublishBottomSheetState.UpToDate) value2;
                str = upToDate.fileName;
                str2 = upToDate.projectDir;
                str3 = upToDate.url;
                AnonymousClass005.A0x(str, str2, str3);
            } while (!blg.A6e(value, new HatchPublishBottomSheetState.UpToDate(str, str2, str3, true)));
        } else if (value2 instanceof HatchPublishBottomSheetState.HasChanges) {
            BLG<HatchPublishBottomSheetState> blg2 = this._uiState;
            do {
                hasChanges = (HatchPublishBottomSheetState.HasChanges) value2;
            } while (!blg2.A6e(blg2.getValue(), hasChanges.copy(hasChanges.fileName, hasChanges.projectDir, hasChanges.url, hasChanges.isPublishing, true)));
        }
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass3(value2, this, null), AEu.A00(this));
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
