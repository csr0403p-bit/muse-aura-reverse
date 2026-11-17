package com.facebook.aura.file.view;

import X.AGI;
import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BGK;
import X.BO6;
import X.BQI;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.library.repo.WorkspaceEntry;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class FolderViewerScreenKt$FolderViewerScreen$5$onToggleFolder$1$1 extends AbstractC7559F3s implements G0U<WorkspaceEntry, Unit> {
    public final /* synthetic */ MutableState<String> $collapsingPath$delegate;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ MutableState<BQI<String>> $expandedFolders$delegate;
    public final /* synthetic */ MutableState<BO6<String, AHD<WorkspaceEntry>>> $folderContents$delegate;
    public final /* synthetic */ MutableState<String> $justExpandedPath$delegate;
    public final /* synthetic */ MutableState<BQI<String>> $loadingFolders$delegate;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    @DebugMetadata(c = "com.facebook.aura.file.view.FolderViewerScreenKt$FolderViewerScreen$5$onToggleFolder$1$1$1", f = "FolderViewerScreen.kt", l = {198}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.FolderViewerScreenKt$FolderViewerScreen$5$onToggleFolder$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ MutableState<BQI<String>> $expandedFolders$delegate;
        public final /* synthetic */ MutableState<BO6<String, AHD<WorkspaceEntry>>> $folderContents$delegate;
        public final /* synthetic */ String $folderPath;
        public final /* synthetic */ MutableState<String> $justExpandedPath$delegate;
        public final /* synthetic */ MutableState<BQI<String>> $loadingFolders$delegate;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* renamed from: com.facebook.aura.file.view.FolderViewerScreenKt$FolderViewerScreen$5$onToggleFolder$1$1$1$WhenMappings */
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, AbstractC3358CGz abstractC3358CGz, MutableState<BQI<String>> mutableState, MutableState<BO6<String, AHD<WorkspaceEntry>>> mutableState2, MutableState<BQI<String>> mutableState3, MutableState<String> mutableState4, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$folderPath = str;
            this.$userSession = abstractC3358CGz;
            this.$loadingFolders$delegate = mutableState;
            this.$folderContents$delegate = mutableState2;
            this.$expandedFolders$delegate = mutableState3;
            this.$justExpandedPath$delegate = mutableState4;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$folderPath, this.$userSession, this.$loadingFolders$delegate, this.$folderContents$delegate, this.$expandedFolders$delegate, this.$justExpandedPath$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            WorkspaceEntry.EntryType entryType;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
                String str = this.$folderPath;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
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
            MutableState<BQI<String>> mutableState = this.$loadingFolders$delegate;
            mutableState.Af8(AGI.A09(BGK.A04(this.$folderPath, mutableState.getValue())));
            if (listResult instanceof HatchFileOperations.ListResult.Success) {
                List<HatchFileOperations.FileEntry> list = ((HatchFileOperations.ListResult.Success) listResult).entries;
                String str2 = this.$folderPath;
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
                    arrayListA0i.add(new WorkspaceEntry(str3, entryType, FGI.A0U(str2, CustomConnectorRegisterRepositoryKt.ROOT_PATH, str3), fileEntry.size, fileEntry.modifiedAt));
                }
                AHD ahdA07 = AGI.A07(arrayListA0i);
                MutableState<BO6<String, AHD<WorkspaceEntry>>> mutableState2 = this.$folderContents$delegate;
                mutableState2.Af8(AGI.A08(AnonymousClass006.A11(this.$folderPath, ahdA07, mutableState2.getValue())));
                MutableState<BQI<String>> mutableState3 = this.$expandedFolders$delegate;
                mutableState3.Af8(AGI.A09(BGK.A02(this.$folderPath, mutableState3.getValue())));
                this.$justExpandedPath$delegate.Af8(this.$folderPath);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WorkspaceEntry workspaceEntry) {
        MutableState<String> mutableState;
        C7384Etj.A0Y(workspaceEntry, 0);
        String str = workspaceEntry.relativePath;
        if (this.$expandedFolders$delegate.getValue().contains(str)) {
            MutableState<BQI<String>> mutableState2 = this.$expandedFolders$delegate;
            mutableState2.Af8(AGI.A09(BGK.A04(str, mutableState2.getValue())));
            this.$justExpandedPath$delegate.Af8(null);
            mutableState = this.$collapsingPath$delegate;
        } else {
            if (!this.$folderContents$delegate.getValue().containsKey(str)) {
                MutableState<BQI<String>> mutableState3 = this.$loadingFolders$delegate;
                mutableState3.Af8(AGI.A09(BGK.A02(str, mutableState3.getValue())));
                AnonymousClass001.A1J(new AnonymousClass1(str, this.$userSession, this.$loadingFolders$delegate, this.$folderContents$delegate, this.$expandedFolders$delegate, this.$justExpandedPath$delegate, null), this.$coroutineScope);
                return;
            }
            MutableState<BQI<String>> mutableState4 = this.$expandedFolders$delegate;
            mutableState4.Af8(AGI.A09(BGK.A02(str, mutableState4.getValue())));
            mutableState = this.$justExpandedPath$delegate;
        }
        mutableState.Af8(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderViewerScreenKt$FolderViewerScreen$5$onToggleFolder$1$1(C3UX c3ux, MutableState<BQI<String>> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<BO6<String, AHD<WorkspaceEntry>>> mutableState4, MutableState<BQI<String>> mutableState5, AbstractC3358CGz abstractC3358CGz) {
        super(1);
        this.$coroutineScope = c3ux;
        this.$expandedFolders$delegate = mutableState;
        this.$justExpandedPath$delegate = mutableState2;
        this.$collapsingPath$delegate = mutableState3;
        this.$folderContents$delegate = mutableState4;
        this.$loadingFolders$delegate = mutableState5;
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(WorkspaceEntry workspaceEntry) {
        invoke2(workspaceEntry);
        return Unit.INSTANCE;
    }
}
