package com.facebook.aura.library.repo;

import X.AHD;
import X.AHI;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.FGI;
import X.HtJ;
import X.HzP;
import X.InterfaceC7549F2g;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.gateway.VmAuthTokenKt;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.perf.HatchNavTTRCCoordinator;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class WorkspaceBrowseDataSource implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final BLG<WorkspaceBrowseData> _data;
    public final C1BN<WorkspaceBrowseData> data;
    public final Map<String, AHD<WorkspaceEntry>> directoryCache;
    public final HatchNavTTRCCoordinator navTtrcCoordinator;
    public final List<String> pathStack;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.library.repo.WorkspaceBrowseDataSource", f = "WorkspaceBrowseDataSource.kt", l = {220}, m = "fetchDirectory", v = 2)
    /* renamed from: com.facebook.aura.library.repo.WorkspaceBrowseDataSource$fetchDirectory$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WorkspaceBrowseDataSource.this.fetchDirectory(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.WorkspaceBrowseDataSource", f = "WorkspaceBrowseDataSource.kt", l = {104}, m = "loadEntries", v = 2)
    /* renamed from: com.facebook.aura.library.repo.WorkspaceBrowseDataSource$loadEntries$1, reason: invalid class name and case insensitive filesystem */
    public final class C123391 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C123391(HtJ<? super C123391> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WorkspaceBrowseDataSource.this.loadEntries(null, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.WorkspaceBrowseDataSource", f = "WorkspaceBrowseDataSource.kt", l = {143}, m = "navigateBack", v = 2)
    /* renamed from: com.facebook.aura.library.repo.WorkspaceBrowseDataSource$navigateBack$1, reason: invalid class name and case insensitive filesystem */
    public final class C123401 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C123401(HtJ<? super C123401> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WorkspaceBrowseDataSource.this.navigateBack(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.WorkspaceBrowseDataSource", f = "WorkspaceBrowseDataSource.kt", l = {184}, m = "writeFileContent", v = 2)
    /* renamed from: com.facebook.aura.library.repo.WorkspaceBrowseDataSource$writeFileContent$1, reason: invalid class name and case insensitive filesystem */
    public final class C123411 extends HzP {
        public Object L$0;
        public Object L$1;
        public boolean Z$0;
        public boolean Z$1;
        public boolean Z$2;
        public int label;
        public /* synthetic */ Object result;

        public C123411(HtJ<? super C123411> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WorkspaceBrowseDataSource.this.writeFileContent(null, null, false, false, false, this);
        }
    }

    public final String getRelativePath(WorkspaceEntry workspaceEntry) {
        C7384Etj.A0Y(workspaceEntry, 0);
        String str = this._data.getValue().currentPath;
        int length = str.length();
        String str2 = workspaceEntry.name;
        return length != 0 ? FGI.A0U(str, CustomConnectorRegisterRepositoryKt.ROOT_PATH, str2) : str2;
    }

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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchDirectory(java.lang.String r13, X.HtJ<? super com.facebook.aura.library.repo.WorkspaceBrowseResponse> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.facebook.aura.library.repo.WorkspaceBrowseDataSource.AnonymousClass1
            if (r0 == 0) goto L80
            r5 = r14
            com.facebook.aura.library.repo.WorkspaceBrowseDataSource$fetchDirectory$1 r5 = (com.facebook.aura.library.repo.WorkspaceBrowseDataSource.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L80
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r6 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L6d
            if (r0 != r3) goto Lc9
            java.lang.Object r0 = r5.L$0
            java.lang.String r13 = X.C3cG.A0d(r0, r6)
        L23:
            com.facebook.aura.gateway.HatchFileOperations$ListResult r6 = (com.facebook.aura.gateway.HatchFileOperations.ListResult) r6
            boolean r0 = r6 instanceof com.facebook.aura.gateway.HatchFileOperations.ListResult.Success
            if (r0 == 0) goto L97
            com.facebook.aura.gateway.HatchFileOperations$ListResult$Success r6 = (com.facebook.aura.gateway.HatchFileOperations.ListResult.Success) r6
            java.util.List<com.facebook.aura.gateway.HatchFileOperations$FileEntry> r0 = r6.entries
            java.util.ArrayList r4 = X.AnonymousClass003.A0i(r0)
            java.util.Iterator r5 = r0.iterator()
        L35:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r2 = r5.next()
            com.facebook.aura.gateway.HatchFileOperations$FileEntry r2 = (com.facebook.aura.gateway.HatchFileOperations.FileEntry) r2
            int r0 = r13.length()
            java.lang.String r8 = r2.name
            r10 = r8
            if (r0 == 0) goto L50
            java.lang.String r0 = "/"
            java.lang.String r10 = X.FGI.A0U(r13, r0, r8)
        L50:
            com.facebook.aura.gateway.HatchFileOperations$FileEntryType r0 = r2.type
            int r1 = r0.ordinal()
            if (r1 == r3) goto L6a
            r0 = 0
            if (r1 != r0) goto L86
            com.facebook.aura.library.repo.WorkspaceEntry$EntryType r9 = com.facebook.aura.library.repo.WorkspaceEntry.EntryType.FILE
        L5d:
            java.lang.Long r11 = r2.size
            java.lang.String r12 = r2.modifiedAt
            com.facebook.aura.library.repo.WorkspaceEntry r7 = new com.facebook.aura.library.repo.WorkspaceEntry
            r7.<init>(r8, r9, r10, r11, r12)
            r4.add(r7)
            goto L35
        L6a:
            com.facebook.aura.library.repo.WorkspaceEntry$EntryType r9 = com.facebook.aura.library.repo.WorkspaceEntry.EntryType.DIRECTORY
            goto L5d
        L6d:
            X.Hwg.A00(r6)
            com.facebook.aura.gateway.HatchFileOperations r2 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
            X.CGz r1 = r12.userSession
            r5.L$0 = r13
            r5.label = r3
            r0 = 0
            java.lang.Object r6 = r2.listDirectory(r13, r1, r0, r5)
            if (r6 != r4) goto L23
            return r4
        L80:
            com.facebook.aura.library.repo.WorkspaceBrowseDataSource$fetchDirectory$1 r5 = new com.facebook.aura.library.repo.WorkspaceBrowseDataSource$fetchDirectory$1
            r5.<init>(r14)
            goto L12
        L86:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L8b:
            java.lang.String r2 = r6.path
            X.AHD r1 = X.AGI.A07(r4)
            com.facebook.aura.library.repo.WorkspaceBrowseResponse r0 = new com.facebook.aura.library.repo.WorkspaceBrowseResponse
            r0.<init>(r2, r1)
            return r0
        L97:
            boolean r0 = r6 instanceof com.facebook.aura.gateway.HatchFileOperations.ListResult.Failed
            if (r0 == 0) goto Lc4
            X.BLG<com.facebook.aura.library.repo.WorkspaceBrowseData> r8 = r12._data
        L9d:
            java.lang.Object r7 = r8.getValue()
            r1 = r7
            com.facebook.aura.library.repo.WorkspaceBrowseData r1 = (com.facebook.aura.library.repo.WorkspaceBrowseData) r1
            r0 = r6
            com.facebook.aura.gateway.HatchFileOperations$ListResult$Failed r0 = (com.facebook.aura.gateway.HatchFileOperations.ListResult.Failed) r0
            java.lang.String r0 = r0.message
            com.facebook.aura.library.repo.WorkspaceBrowseError$ApiError r5 = new com.facebook.aura.library.repo.WorkspaceBrowseError$ApiError
            r5.<init>(r0)
            r4 = 0
            X.AHD<com.facebook.aura.library.repo.WorkspaceEntry> r3 = r1.entries
            java.lang.String r2 = r1.currentPath
            boolean r1 = r1.isLoading
            X.AnonymousClass003.A0u(r3, r2)
            com.facebook.aura.library.repo.WorkspaceBrowseData r0 = new com.facebook.aura.library.repo.WorkspaceBrowseData
            r0.<init>(r3, r2, r1, r5)
            boolean r0 = r8.A6e(r7, r0)
            if (r0 == 0) goto L9d
            return r4
        Lc4:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        Lc9:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.WorkspaceBrowseDataSource.fetchDirectory(java.lang.String, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ Object writeFileContent$default(WorkspaceBrowseDataSource workspaceBrowseDataSource, String str, String str2, boolean z, boolean z2, boolean z3, HtJ htJ, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean zA1P = AnonymousClass005.A1P(i, z2);
        if ((i & 16) != 0) {
            z3 = true;
        }
        return workspaceBrowseDataSource.writeFileContent(str, str2, z, zA1P, z3, htJ);
    }

    public final void clearCache() {
        this.directoryCache.clear();
        this.pathStack.clear();
        this.navTtrcCoordinator.clearObservedQuery(HatchNavTTRCSpec.Surface.LIBRARY, HatchNavTTRCSpec.Queries.LIBRARY_DATA);
        AnonymousClass001.A1E(this._data, null, new WorkspaceBrowseData(AHI.A01, "", false, null));
    }

    public final Object fetchFileContent(String str, HtJ<? super String> htJ) {
        return HatchFileOperations.INSTANCE.readFile(str, this.userSession, htJ);
    }

    public final String getAuthToken() {
        return VmAuthTokenKt.vmBoundAuthToken(this.userSession);
    }

    public final String getBaseUrl() {
        return C60O.A0m(HatchGatewayPrefsStore.Companion, this.userSession);
    }

    public final C1BN<WorkspaceBrowseData> getData() {
        return this.data;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadEntries(java.lang.String r16, boolean r17, X.HtJ<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.WorkspaceBrowseDataSource.loadEntries(java.lang.String, boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object navigateBack(X.HtJ<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.library.repo.WorkspaceBrowseDataSource.C123401
            if (r0 == 0) goto L4b
            r5 = r7
            com.facebook.aura.library.repo.WorkspaceBrowseDataSource$navigateBack$1 r5 = (com.facebook.aura.library.repo.WorkspaceBrowseDataSource.C123401) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4b
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L51
            X.Hwg.A00(r1)
        L20:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        L25:
            X.Hwg.A00(r1)
            java.util.List<java.lang.String> r0 = r6.pathStack
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L32
            r3 = 0
            goto L20
        L32:
            java.util.List<java.lang.String> r1 = r6.pathStack
            r2 = 0
            int r0 = X.AnonymousClass002.A0E(r1)
            java.lang.Object r1 = r1.remove(r0)
            java.lang.String r1 = (java.lang.String) r1
            r0 = 0
            r5.L$0 = r0
            r5.label = r3
            java.lang.Object r0 = r6.loadEntries(r1, r2, r5)
            if (r0 != r4) goto L20
            return r4
        L4b:
            com.facebook.aura.library.repo.WorkspaceBrowseDataSource$navigateBack$1 r5 = new com.facebook.aura.library.repo.WorkspaceBrowseDataSource$navigateBack$1
            r5.<init>(r7)
            goto L12
        L51:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.WorkspaceBrowseDataSource.navigateBack(X.HtJ):java.lang.Object");
    }

    public final Object navigateToFolder(String str, HtJ<? super Unit> htJ) {
        String str2 = this._data.getValue().currentPath;
        this.pathStack.add(str2);
        if (str2.length() != 0) {
            str = FGI.A0U(str2, CustomConnectorRegisterRepositoryKt.ROOT_PATH, str);
        }
        Object objLoadEntries = loadEntries(str, false, htJ);
        return objLoadEntries != EnumC10460Hji.A02 ? Unit.INSTANCE : objLoadEntries;
    }

    public final Object refresh(HtJ<? super Unit> htJ) {
        return C3cG.A0U(loadEntries(this._data.getValue().currentPath, true, htJ));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeFileContent(java.lang.String r13, java.lang.String r14, boolean r15, boolean r16, boolean r17, X.HtJ<? super com.facebook.aura.library.repo.WorkspaceBrowseDataSource.WriteResult> r18) {
        /*
            r12 = this;
            r3 = r18
            boolean r0 = r3 instanceof com.facebook.aura.library.repo.WorkspaceBrowseDataSource.C123411
            if (r0 == 0) goto L56
            r11 = r3
            com.facebook.aura.library.repo.WorkspaceBrowseDataSource$writeFileContent$1 r11 = (com.facebook.aura.library.repo.WorkspaceBrowseDataSource.C123411) r11
            int r2 = r11.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r11.label = r2
        L14:
            java.lang.Object r3 = r11.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r11.label
            r0 = 1
            if (r1 == 0) goto L34
            if (r1 != r0) goto L6f
            X.Hwg.A00(r3)
        L22:
            com.facebook.aura.gateway.HatchFileOperations$WriteResult r3 = (com.facebook.aura.gateway.HatchFileOperations.WriteResult) r3
            boolean r0 = r3 instanceof com.facebook.aura.gateway.HatchFileOperations.WriteResult.Success
            if (r0 == 0) goto L5c
            com.facebook.aura.gateway.HatchFileOperations$WriteResult$Success r3 = (com.facebook.aura.gateway.HatchFileOperations.WriteResult.Success) r3
            java.lang.String r1 = r3.path
            int r0 = r3.bytesWritten
            com.facebook.aura.library.repo.WorkspaceBrowseDataSource$WriteResult$Success r2 = new com.facebook.aura.library.repo.WorkspaceBrowseDataSource$WriteResult$Success
            r2.<init>(r1, r0)
            return r2
        L34:
            X.Hwg.A00(r3)
            com.facebook.aura.gateway.HatchFileOperations r3 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
            X.CGz r6 = r12.userSession
            r10 = 0
            r11.L$0 = r10
            r11.L$1 = r10
            r7 = r15
            r11.Z$0 = r15
            r8 = r16
            r11.Z$1 = r8
            r9 = r17
            r11.Z$2 = r9
            r11.label = r0
            r4 = r13
            r5 = r14
            java.lang.Object r3 = r3.writeFile(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r3 != r2) goto L22
            return r2
        L56:
            com.facebook.aura.library.repo.WorkspaceBrowseDataSource$writeFileContent$1 r11 = new com.facebook.aura.library.repo.WorkspaceBrowseDataSource$writeFileContent$1
            r11.<init>(r3)
            goto L14
        L5c:
            boolean r0 = r3 instanceof com.facebook.aura.gateway.HatchFileOperations.WriteResult.Failed
            if (r0 == 0) goto L6a
            com.facebook.aura.gateway.HatchFileOperations$WriteResult$Failed r3 = (com.facebook.aura.gateway.HatchFileOperations.WriteResult.Failed) r3
            java.lang.String r0 = r3.message
            com.facebook.aura.library.repo.WorkspaceBrowseDataSource$WriteResult$Failed r2 = new com.facebook.aura.library.repo.WorkspaceBrowseDataSource$WriteResult$Failed
            r2.<init>(r0)
            return r2
        L6a:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L6f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.WorkspaceBrowseDataSource.writeFileContent(java.lang.String, java.lang.String, boolean, boolean, boolean, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final WorkspaceBrowseDataSource getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (WorkspaceBrowseDataSource) abstractC3358CGz.A03(WorkspaceBrowseDataSource.class, new WorkspaceBrowseDataSource$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public abstract class WriteResult {

        public final class Failed extends WriteResult {
            public final String message;

            public Failed(String str) {
                C7384Etj.A0Y(str, 0);
                this.message = str;
            }

            public final Failed copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new Failed(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Failed) && C7384Etj.areEqual(this.message, ((Failed) obj).message));
            }

            public static /* synthetic */ Failed copy$default(Failed failed, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = failed.message;
                }
                C7384Etj.A0Y(str, 0);
                return new Failed(str);
            }

            public final String component1() {
                return this.message;
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Success extends WriteResult {
            public final int bytesWritten;
            public final String path;

            public Success(String str, int i) {
                C7384Etj.A0Y(str, 0);
                this.path = str;
                this.bytesWritten = i;
            }

            public final Success copy(String str, int i) {
                C7384Etj.A0Y(str, 0);
                return new Success(str, i);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Success) {
                        Success success = (Success) obj;
                        if (!C7384Etj.areEqual(this.path, success.path) || this.bytesWritten != success.bytesWritten) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ Success copy$default(Success success, String str, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = success.path;
                }
                if ((i2 & 2) != 0) {
                    i = success.bytesWritten;
                }
                C7384Etj.A0Y(str, 0);
                return new Success(str, i);
            }

            public final String component1() {
                return this.path;
            }

            public final int component2() {
                return this.bytesWritten;
            }

            public final int getBytesWritten() {
                return this.bytesWritten;
            }

            public final String getPath() {
                return this.path;
            }

            public int hashCode() {
                return AnonymousClass001.A0G(this.path) + this.bytesWritten;
            }

            public String toString() {
                return super.toString();
            }
        }

        public /* synthetic */ WriteResult(C06H c06h) {
        }

        public WriteResult() {
        }
    }

    public WorkspaceBrowseDataSource(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        C9286GCn c9286GCnA14 = C3cG.A14(new WorkspaceBrowseData(AHI.A01, "", false, null));
        this._data = c9286GCnA14;
        this.data = C3cG.A11(c9286GCnA14);
        this.navTtrcCoordinator = HatchNavTTRCCoordinator.Companion.getInstance(abstractC3358CGz);
        this.directoryCache = C3cG.A0j();
        this.pathStack = C3cG.A0h();
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        clearCache();
    }

    public /* synthetic */ WorkspaceBrowseDataSource(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
