package com.facebook.aura.file.view;

import X.AEs;
import X.AEu;
import X.AGI;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BLG;
import X.C1BN;
import X.C3Pi;
import X.C3UX;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.HnJ;
import X.HoC;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.file.view.DirectoryLoadingState;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.library.repo.WorkspaceEntry;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes.dex */
public final class FolderViewerViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<DirectoryLoadingState> _loadingState;
    public final boolean isRoot;
    public HoC loadJob;
    public final C1BN<DirectoryLoadingState> loadingState;
    public final String relativePath;
    public final AbstractC3358CGz userSession;

    public final class Factory extends AuraViewModelFactory<FolderViewerViewModel> {
        public static final int $stable = 8;
        public final String relativePath;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public FolderViewerViewModel create() {
            return new FolderViewerViewModel(this.relativePath, this.userSession);
        }

        public Factory(String str, AbstractC3358CGz abstractC3358CGz) {
            AnonymousClass003.A0u(str, abstractC3358CGz);
            this.relativePath = str;
            this.userSession = abstractC3358CGz;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.view.FolderViewerViewModel$load$1", f = "FolderViewerViewModel.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.FolderViewerViewModel$load$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        /* renamed from: com.facebook.aura.file.view.FolderViewerViewModel$load$1$WhenMappings */
        /* loaded from: classes3.dex */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HatchFileOperations.FileEntryType.values().length];
                try {
                    AnonymousClass002.A13(HatchFileOperations.FileEntryType.DIRECTORY, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(HatchFileOperations.FileEntryType.FILE, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return FolderViewerViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            BLG<DirectoryLoadingState> blg;
            Object error;
            WorkspaceEntry.EntryType entryType;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
                FolderViewerViewModel folderViewerViewModel = FolderViewerViewModel.this;
                String str = folderViewerViewModel.relativePath;
                AbstractC3358CGz abstractC3358CGz = folderViewerViewModel.userSession;
                this.label = 1;
                obj = hatchFileOperations.listDirectory(str, abstractC3358CGz, null, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HatchFileOperations.ListResult listResult = (HatchFileOperations.ListResult) obj;
            if (!(listResult instanceof HatchFileOperations.ListResult.Success)) {
                if (!(listResult instanceof HatchFileOperations.ListResult.Failed)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!(FolderViewerViewModel.this._loadingState.getValue() instanceof DirectoryLoadingState.Success)) {
                    blg = FolderViewerViewModel.this._loadingState;
                    String str2 = ((HatchFileOperations.ListResult.Failed) listResult).message;
                    if (str2 == null) {
                        str2 = "";
                    }
                    error = new DirectoryLoadingState.Error(str2);
                }
                return Unit.INSTANCE;
            }
            FolderViewerViewModel folderViewerViewModel2 = FolderViewerViewModel.this;
            blg = folderViewerViewModel2._loadingState;
            List<HatchFileOperations.FileEntry> list = ((HatchFileOperations.ListResult.Success) listResult).entries;
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            for (HatchFileOperations.FileEntry fileEntry : list) {
                String str3 = fileEntry.name;
                int iOrdinal = fileEntry.type.ordinal();
                if (iOrdinal == 1) {
                    entryType = WorkspaceEntry.EntryType.DIRECTORY;
                } else {
                    if (iOrdinal != 0) {
                        throw new NoWhenBranchMatchedException();
                    }
                    entryType = WorkspaceEntry.EntryType.FILE;
                }
                arrayListA0i.add(new WorkspaceEntry(str3, entryType, folderViewerViewModel2.isRoot ? str3 : FGI.A0U(folderViewerViewModel2.relativePath, CustomConnectorRegisterRepositoryKt.ROOT_PATH, str3), fileEntry.size, fileEntry.modifiedAt));
            }
            error = new DirectoryLoadingState.Success(AGI.A07(arrayListA0i));
            AnonymousClass002.A1I(blg, error);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return FolderViewerViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void load() {
        HtJ htJA13 = AnonymousClass006.A13(this.loadJob);
        this.loadJob = AnonymousClass001.A11(new AnonymousClass1(htJA13), AEu.A00(this));
    }

    public final C1BN<DirectoryLoadingState> getLoadingState() {
        return this.loadingState;
    }

    public FolderViewerViewModel(String str, AbstractC3358CGz abstractC3358CGz) {
        AnonymousClass003.A0u(str, abstractC3358CGz);
        this.relativePath = str;
        this.userSession = abstractC3358CGz;
        C9286GCn c9286GCnA01 = HnJ.A01(DirectoryLoadingState.Loading.INSTANCE);
        this._loadingState = c9286GCnA01;
        this.loadingState = C3Pi.A00(c9286GCnA01);
        this.isRoot = AnonymousClass002.A1M(str.length());
        load();
    }

    public final void refresh() {
        load();
    }
}
