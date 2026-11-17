package com.facebook.aura.file.view;

import X.AEs;
import X.AEu;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C1BN;
import X.C3UX;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.webkit.URLUtil;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.file.view.ContentItemClipboardKt;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentType;
import com.facebook.aura.library.repo.ArtifactSource;
import com.facebook.aura.library.repo.ArtifactsDataSource;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class ContentViewerViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<UiState> _uiState;
    public final Context appContext;
    public final C1BN<UiState> uiState;
    public final AbstractC3358CGz userSession;

    public final class Factory extends AuraViewModelFactory<ContentViewerViewModel> {
        public static final int $stable = 8;
        public final Context appContext;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ContentViewerViewModel create() {
            return new ContentViewerViewModel(this.appContext, this.userSession);
        }

        public Factory(Context context, AbstractC3358CGz abstractC3358CGz) {
            AnonymousClass003.A0u(context, abstractC3358CGz);
            this.appContext = context;
            this.userSession = abstractC3358CGz;
        }
    }

    public interface ShareRoute {

        public final class Media extends C06G implements ShareRoute {
            public static final int $stable = 0;
            public final String mediaUri;
            public final String workspacePath;

            public Media(String str, String str2) {
                C7384Etj.A0Y(str2, 1);
                this.workspacePath = str;
                this.mediaUri = str2;
            }

            public final Media copy(String str, String str2) {
                C7384Etj.A0Y(str2, 1);
                return new Media(str, str2);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Media) {
                        Media media = (Media) obj;
                        if (!C7384Etj.areEqual(this.workspacePath, media.workspacePath) || !C7384Etj.areEqual(this.mediaUri, media.mediaUri)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ Media copy$default(Media media, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = media.workspacePath;
                }
                if ((i & 2) != 0) {
                    str2 = media.mediaUri;
                }
                C7384Etj.A0Y(str2, 1);
                return new Media(str, str2);
            }

            public final String component1() {
                return this.workspacePath;
            }

            public final String component2() {
                return this.mediaUri;
            }

            public final String getMediaUri() {
                return this.mediaUri;
            }

            public final String getWorkspacePath() {
                return this.workspacePath;
            }

            public int hashCode() {
                return AnonymousClass001.A0H(this.mediaUri, AnonymousClass006.A0G(this.workspacePath) * 31);
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class WorkspaceFile extends C06G implements ShareRoute {
            public static final int $stable = 0;
            public final String workspacePath;

            public WorkspaceFile(String str) {
                C7384Etj.A0Y(str, 0);
                this.workspacePath = str;
            }

            public final WorkspaceFile copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new WorkspaceFile(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof WorkspaceFile) && C7384Etj.areEqual(this.workspacePath, ((WorkspaceFile) obj).workspacePath));
            }

            public static /* synthetic */ WorkspaceFile copy$default(WorkspaceFile workspaceFile, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = workspaceFile.workspacePath;
                }
                C7384Etj.A0Y(str, 0);
                return new WorkspaceFile(str);
            }

            public final String component1() {
                return this.workspacePath;
            }

            public final String getWorkspacePath() {
                return this.workspacePath;
            }

            public int hashCode() {
                return this.workspacePath.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }
    }

    public final class UiState extends C06G {
        public static final int $stable = 0;
        public final int currentPage;
        public final boolean hasData;
        public final int initialIndex;
        public final boolean isCopyInProgress;
        public final AHD<ContentItem> items;

        public UiState(AHD<ContentItem> ahd, int i, int i2, boolean z, boolean z2) {
            C7384Etj.A0Y(ahd, 0);
            this.items = ahd;
            this.initialIndex = i;
            this.currentPage = i2;
            this.hasData = z;
            this.isCopyInProgress = z2;
        }

        public final UiState copy(AHD<ContentItem> ahd, int i, int i2, boolean z, boolean z2) {
            C7384Etj.A0Y(ahd, 0);
            return new UiState(ahd, i, i2, z, z2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof UiState) {
                    UiState uiState = (UiState) obj;
                    if (!C7384Etj.areEqual(this.items, uiState.items) || this.initialIndex != uiState.initialIndex || this.currentPage != uiState.currentPage || this.hasData != uiState.hasData || this.isCopyInProgress != uiState.isCopyInProgress) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiState copy$default(UiState uiState, AHD ahd, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                ahd = uiState.items;
            }
            if ((i3 & 2) != 0) {
                i = uiState.initialIndex;
            }
            if ((i3 & 4) != 0) {
                i2 = uiState.currentPage;
            }
            if ((i3 & 8) != 0) {
                z = uiState.hasData;
            }
            if ((i3 & 16) != 0) {
                z2 = uiState.isCopyInProgress;
            }
            return uiState.copy(ahd, i, i2, z, z2);
        }

        public final AHD<ContentItem> component1() {
            return this.items;
        }

        public final int component2() {
            return this.initialIndex;
        }

        public final int component3() {
            return this.currentPage;
        }

        public final boolean component4() {
            return this.hasData;
        }

        public final boolean component5() {
            return this.isCopyInProgress;
        }

        public final int getCurrentPage() {
            return this.currentPage;
        }

        public final boolean getHasData() {
            return this.hasData;
        }

        public final int getInitialIndex() {
            return this.initialIndex;
        }

        public final AHD<ContentItem> getItems() {
            return this.items;
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A01((((AnonymousClass005.A0E(this.items) + this.initialIndex) * 31) + this.currentPage) * 31, this.hasData), this.isCopyInProgress);
        }

        public final boolean isCopyInProgress() {
            return this.isCopyInProgress;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ UiState(AHD ahd, int i, int i2, boolean z, boolean z2, int i3, C06H c06h) {
            this((i3 & 1) != 0 ? AHI.A01 : ahd, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, AnonymousClass005.A1P(i3, z), (i3 & 16) != 0 ? false : z2);
        }

        public UiState() {
            this(AHI.A01, 0, 0, false, false);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.view.ContentViewerViewModel$onArtifactOpened$1", f = "ContentViewerViewModel.kt", l = {84}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.ContentViewerViewModel$onArtifactOpened$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $workspacePath;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$workspacePath = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ContentViewerViewModel.this.new AnonymousClass1(this.$workspacePath, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ArtifactsDataSource companion = ArtifactsDataSource.Companion.getInstance(ContentViewerViewModel.this.userSession);
                ArtifactSource artifactSource = ArtifactSource.LIBRARY;
                String strEnsureWorkspacePrefix = HatchFileUIUtils.INSTANCE.ensureWorkspacePrefix(this.$workspacePath);
                this.label = 1;
                if (companion.touchRecent(artifactSource, strEnsureWorkspacePrefix, this) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.file.view.ContentViewerViewModel$onCopyClick$2", f = "ContentViewerViewModel.kt", l = {109}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.ContentViewerViewModel$onCopyClick$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ContentItem $item;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ContentItem contentItem, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$item = contentItem;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ContentViewerViewModel.this.new AnonymousClass2(this.$item, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            UiState value;
            UiState uiState;
            UiState value2;
            UiState uiState2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    ContentViewerViewModel contentViewerViewModel = ContentViewerViewModel.this;
                    Context context = contentViewerViewModel.appContext;
                    AbstractC3358CGz abstractC3358CGz = contentViewerViewModel.userSession;
                    ContentItem contentItem = this.$item;
                    this.label = 1;
                    if (ContentItemClipboardKt.copyContentItemToClipboard(context, abstractC3358CGz, contentItem, ContentItemClipboardKt.AnonymousClass2.INSTANCE, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                BLG<UiState> blg = ContentViewerViewModel.this._uiState;
                do {
                    value2 = blg.getValue();
                    uiState2 = value2;
                } while (!blg.A6e(value2, uiState2.copy(uiState2.items, uiState2.initialIndex, uiState2.currentPage, uiState2.hasData, false)));
                return Unit.INSTANCE;
            } catch (Throwable th) {
                BLG<UiState> blg2 = ContentViewerViewModel.this._uiState;
                do {
                    value = blg2.getValue();
                    uiState = value;
                } while (!blg2.A6e(value, uiState.copy(uiState.items, uiState.initialIndex, uiState.currentPage, uiState.hasData, false)));
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void onArtifactOpened(String str) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass001.A1J(new AnonymousClass1(str, null), AEu.A00(this));
    }

    public final void onCopyClick(ContentItem contentItem) {
        UiState value;
        UiState uiState;
        C7384Etj.A0Y(contentItem, 0);
        if (this._uiState.getValue().isCopyInProgress) {
            return;
        }
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            uiState = value;
        } while (!blg.A6e(value, uiState.copy(uiState.items, uiState.initialIndex, uiState.currentPage, uiState.hasData, true)));
        AnonymousClass001.A1J(new AnonymousClass2(contentItem, null), AEu.A00(this));
    }

    public final ShareRoute shareRoute(ContentItem contentItem) {
        ShareRoute media;
        C7384Etj.A0Y(contentItem, 0);
        String str = contentItem.workspacePath;
        String str2 = contentItem.imageUri;
        ContentType contentType = contentItem.type;
        boolean z = contentType instanceof ContentType.Image;
        if ((z || (contentType instanceof ContentType.Video)) && str2 != null && str != null) {
            media = new ShareRoute.Media(str, str2);
        } else if (z && str2 != null && URLUtil.isHttpsUrl(str2)) {
            media = new ShareRoute.Media(null, str2);
        } else {
            if (str == null) {
                return null;
            }
            media = new ShareRoute.WorkspaceFile(str);
        }
        return media;
    }

    public final C1BN<UiState> getUiState() {
        return this.uiState;
    }

    public final void onPageChanged(int i) {
        UiState value;
        UiState uiState;
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            uiState = value;
        } while (!blg.A6e(value, uiState.copy(uiState.items, uiState.initialIndex, i, uiState.hasData, uiState.isCopyInProgress)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        r6 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void refreshFromDataHolder() {
        /*
            r9 = this;
            com.facebook.aura.file.view.api.ContentViewerDataHolder r0 = com.facebook.aura.file.view.api.ContentViewerDataHolder.INSTANCE
            X.HxE r0 = r0.consumeItems()
            if (r0 == 0) goto L7f
            A r4 = r0.first
            java.util.List r4 = (java.util.List) r4
            B r0 = r0.second
            int r2 = X.AnonymousClass001.A0F(r0)
            com.facebook.aura.file.repo.HatchDeletedMediaStore$Companion r1 = com.facebook.aura.file.repo.HatchDeletedMediaStore.Companion
            X.CGz r0 = r9.userSession
            com.facebook.aura.file.repo.HatchDeletedMediaStore r6 = r1.getInstance(r0)
            java.lang.Object r5 = X.AbstractC0878AGe.A0A(r2, r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r4.iterator()
        L27:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L4b
            java.lang.Object r2 = r4.next()
            r1 = r2
            com.facebook.aura.file.view.api.ContentItem r1 = (com.facebook.aura.file.view.api.ContentItem) r1
            if (r1 == r5) goto L47
            java.lang.String r0 = r1.workspacePath
            boolean r0 = r6.isHidden(r0)
            if (r0 != 0) goto L27
            java.lang.String r0 = r1.imageUri
            boolean r0 = r6.isHidden(r0)
            if (r0 == 0) goto L47
            goto L27
        L47:
            r3.add(r2)
            goto L27
        L4b:
            java.util.Iterator r1 = r3.iterator()
            r6 = 0
        L50:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5f
            java.lang.Object r0 = r1.next()
            if (r0 != r5) goto L7c
            r0 = 0
            if (r6 >= r0) goto L60
        L5f:
            r6 = 0
        L60:
            X.BLG<com.facebook.aura.file.view.ContentViewerViewModel$UiState> r2 = r9._uiState
        L62:
            java.lang.Object r1 = r2.getValue()
            r4 = r1
            com.facebook.aura.file.view.ContentViewerViewModel$UiState r4 = (com.facebook.aura.file.view.ContentViewerViewModel.UiState) r4
            X.AHD r5 = X.AGI.A07(r3)
            boolean r9 = r4.isCopyInProgress
            r8 = 1
            r7 = r6
            com.facebook.aura.file.view.ContentViewerViewModel$UiState r0 = r4.copy(r5, r6, r7, r8, r9)
            boolean r0 = r2.A6e(r1, r0)
            if (r0 == 0) goto L62
            return
        L7c:
            int r6 = r6 + 1
            goto L50
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.ContentViewerViewModel.refreshFromDataHolder():void");
    }

    public ContentViewerViewModel(Context context, AbstractC3358CGz abstractC3358CGz) {
        boolean zA1b = AnonymousClass004.A1b(context, abstractC3358CGz);
        this.appContext = context;
        this.userSession = abstractC3358CGz;
        C9286GCn c9286GCn = new C9286GCn(new UiState(AHI.A01, zA1b ? 1 : 0, zA1b ? 1 : 0, zA1b, zA1b));
        this._uiState = c9286GCn;
        this.uiState = c9286GCn;
        refreshFromDataHolder();
    }
}
