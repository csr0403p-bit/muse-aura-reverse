package com.facebook.aura.status.repo;

import X.AbstractC3358CGz;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.HtJ;
import X.HzP;
import X.InterfaceC7549F2g;
import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import com.facebook.aura.gateway.VmAuthTokenKt;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public final class MemoryDataSource implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final BLG<MemoryData> _data;
    public final C1BN<MemoryData> data;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.status.repo.MemoryDataSource", f = "MemoryDataSource.kt", l = {58}, m = "loadContent", v = 2)
    /* renamed from: com.facebook.aura.status.repo.MemoryDataSource$loadContent$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MemoryDataSource.this.loadContent(false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.repo.MemoryDataSource", f = "MemoryDataSource.kt", l = {AuraWaitlistConfettiKt.StandardParticleCount}, m = "saveContent", v = 2)
    /* renamed from: com.facebook.aura.status.repo.MemoryDataSource$saveContent$1, reason: invalid class name and case insensitive filesystem */
    public final class C140241 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C140241(HtJ<? super C140241> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MemoryDataSource.this.saveContent(null, this);
        }
    }

    public final Object refresh(HtJ<? super Unit> htJ) {
        Object objLoadContent = loadContent(true, htJ);
        return objLoadContent != EnumC10460Hji.A02 ? Unit.INSTANCE : objLoadContent;
    }

    public final void updateLocalContent(String str) {
        MemoryData value;
        MemoryData memoryData;
        C7384Etj.A0Y(str, 0);
        BLG<MemoryData> blg = this._data;
        do {
            value = blg.getValue();
            memoryData = value;
        } while (!blg.A6e(value, memoryData.copy(str, memoryData.isLoading, memoryData.isSaving, memoryData.error, memoryData.lastUpdated)));
    }

    public final class Companion {
        public final MemoryDataSource getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (MemoryDataSource) abstractC3358CGz.A03(MemoryDataSource.class, new MemoryDataSource$Companion$getInstance$1(abstractC3358CGz));
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public final void clear() {
        C9286GCn.A00(null, new MemoryData("", false, false, null, null), (C9286GCn) this._data);
    }

    public final C1BN<MemoryData> getData() {
        return this.data;
    }

    public final boolean isConnected() {
        return (C7BY.A0j(HatchGatewayPrefsStore.Companion.getInstance(this.userSession).getGatewayUrl()) || C7BY.A0j(VmAuthTokenKt.vmBoundAuthToken(this.userSession))) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadContent(boolean r12, X.HtJ<? super kotlin.Unit> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.facebook.aura.status.repo.MemoryDataSource.AnonymousClass1
            if (r0 == 0) goto Ld3
            r3 = r13
            com.facebook.aura.status.repo.MemoryDataSource$loadContent$1 r3 = (com.facebook.aura.status.repo.MemoryDataSource.AnonymousClass1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Ld3
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r5 = r3.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r7 = 1
            if (r0 == 0) goto La3
            if (r0 != r7) goto Lda
            X.Hwg.A00(r5)
        L20:
            java.lang.String r5 = (java.lang.String) r5
            X.BLG<com.facebook.aura.status.repo.MemoryData> r3 = r11._data
            java.lang.String r1 = "MemoryDataSource"
            if (r5 != 0) goto L85
            java.lang.Object r0 = r3.getValue()
            com.facebook.aura.status.repo.MemoryData r0 = (com.facebook.aura.status.repo.MemoryData) r0
            java.lang.String r0 = r0.content
            int r0 = r0.length()
            if (r0 <= 0) goto L5a
            java.lang.String r0 = "Load failed, preserving existing content"
            X.CFK.A06(r1, r0)
            X.BLG<com.facebook.aura.status.repo.MemoryData> r2 = r11._data
        L3d:
            java.lang.Object r1 = r2.getValue()
            r3 = r1
            com.facebook.aura.status.repo.MemoryData r3 = (com.facebook.aura.status.repo.MemoryData) r3
            r5 = 0
            java.lang.String r4 = r3.content
            boolean r6 = r3.isSaving
            com.facebook.aura.status.repo.StatusError r7 = r3.error
            java.lang.Long r8 = r3.lastUpdated
            com.facebook.aura.status.repo.MemoryData r0 = r3.copy(r4, r5, r6, r7, r8)
            boolean r0 = r2.A6e(r1, r0)
            if (r0 == 0) goto L3d
        L57:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L5a:
            boolean r0 = r11.isConnected()
            if (r0 != 0) goto L7d
            com.facebook.aura.status.repo.StatusError$MissingCredentials r7 = com.facebook.aura.status.repo.StatusError.MissingCredentials.INSTANCE
        L62:
            X.BLG<com.facebook.aura.status.repo.MemoryData> r2 = r11._data
        L64:
            java.lang.Object r1 = r2.getValue()
            r3 = r1
            com.facebook.aura.status.repo.MemoryData r3 = (com.facebook.aura.status.repo.MemoryData) r3
            r5 = 0
            java.lang.String r4 = r3.content
            boolean r6 = r3.isSaving
            java.lang.Long r8 = r3.lastUpdated
            com.facebook.aura.status.repo.MemoryData r0 = r3.copy(r4, r5, r6, r7, r8)
            boolean r0 = r2.A6e(r1, r0)
            if (r0 == 0) goto L64
            goto L57
        L7d:
            java.lang.String r0 = "Failed to read memory file"
            com.facebook.aura.status.repo.StatusError$ApiError r7 = new com.facebook.aura.status.repo.StatusError$ApiError
            r7.<init>(r0)
            goto L62
        L85:
            java.lang.Object r2 = r3.getValue()
            r4 = r2
            com.facebook.aura.status.repo.MemoryData r4 = (com.facebook.aura.status.repo.MemoryData) r4
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r9 = X.C3cG.A0S(r0)
            r8 = 0
            r6 = 0
            boolean r7 = r4.isSaving
            com.facebook.aura.status.repo.MemoryData r0 = r4.copy(r5, r6, r7, r8, r9)
            boolean r0 = r3.A6e(r2, r0)
            if (r0 == 0) goto L85
            goto L57
        La3:
            X.Hwg.A00(r5)
            if (r12 != 0) goto Lc2
            X.BLG<com.facebook.aura.status.repo.MemoryData> r2 = r11._data
        Laa:
            java.lang.Object r1 = r2.getValue()
            r5 = r1
            com.facebook.aura.status.repo.MemoryData r5 = (com.facebook.aura.status.repo.MemoryData) r5
            r9 = 0
            java.lang.String r6 = r5.content
            boolean r8 = r5.isSaving
            java.lang.Long r10 = r5.lastUpdated
            com.facebook.aura.status.repo.MemoryData r0 = r5.copy(r6, r7, r8, r9, r10)
            boolean r0 = r2.A6e(r1, r0)
            if (r0 == 0) goto Laa
        Lc2:
            com.facebook.aura.gateway.HatchFileOperations r2 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
            X.CGz r1 = r11.userSession
            r3.Z$0 = r12
            r3.label = r7
            java.lang.String r0 = "MEMORY.md"
            java.lang.Object r5 = r2.readFile(r0, r1, r3)
            if (r5 != r4) goto L20
            return r4
        Ld3:
            com.facebook.aura.status.repo.MemoryDataSource$loadContent$1 r3 = new com.facebook.aura.status.repo.MemoryDataSource$loadContent$1
            r3.<init>(r13)
            goto L12
        Lda:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.repo.MemoryDataSource.loadContent(boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveContent(java.lang.String r16, X.HtJ<? super java.lang.Boolean> r17) {
        /*
            r15 = this;
            r4 = r17
            r5 = r16
            boolean r0 = r4 instanceof com.facebook.aura.status.repo.MemoryDataSource.C140241
            r1 = r15
            if (r0 == 0) goto Lc1
            r11 = r4
            com.facebook.aura.status.repo.MemoryDataSource$saveContent$1 r11 = (com.facebook.aura.status.repo.MemoryDataSource.C140241) r11
            int r3 = r11.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto Lc1
            int r3 = r3 - r2
            r11.label = r3
        L17:
            java.lang.Object r3 = r11.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r11.label
            r7 = 1
            if (r0 == 0) goto L8c
            if (r0 != r7) goto Lcd
            java.lang.Object r5 = r11.L$0
            java.lang.String r5 = (java.lang.String) r5
            X.Hwg.A00(r3)
        L29:
            com.facebook.aura.gateway.HatchFileOperations$WriteResult r3 = (com.facebook.aura.gateway.HatchFileOperations.WriteResult) r3
            boolean r0 = r3 instanceof com.facebook.aura.gateway.HatchFileOperations.WriteResult.Success
            if (r0 == 0) goto L54
            X.BLG<com.facebook.aura.status.repo.MemoryData> r3 = r1._data
        L31:
            java.lang.Object r2 = r3.getValue()
            r8 = r2
            com.facebook.aura.status.repo.MemoryData r8 = (com.facebook.aura.status.repo.MemoryData) r8
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r13 = X.C3cG.A0S(r0)
            r12 = 0
            r11 = 0
            boolean r10 = r8.isLoading
            r9 = r5
            com.facebook.aura.status.repo.MemoryData r0 = r8.copy(r9, r10, r11, r12, r13)
            boolean r0 = r3.A6e(r2, r0)
            if (r0 == 0) goto L31
        L4f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        L54:
            boolean r0 = r3 instanceof com.facebook.aura.gateway.HatchFileOperations.WriteResult.Failed
            if (r0 == 0) goto Lc8
            com.facebook.aura.gateway.HatchFileOperations$WriteResult$Failed r3 = (com.facebook.aura.gateway.HatchFileOperations.WriteResult.Failed) r3
            java.lang.String r2 = r3.message
            r0 = 51
            java.lang.String r0 = X.C60N.A00(r0)
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L86
            com.facebook.aura.status.repo.StatusError$MissingCredentials r7 = com.facebook.aura.status.repo.StatusError.MissingCredentials.INSTANCE
        L6a:
            X.BLG<com.facebook.aura.status.repo.MemoryData> r2 = r1._data
        L6c:
            java.lang.Object r1 = r2.getValue()
            r3 = r1
            com.facebook.aura.status.repo.MemoryData r3 = (com.facebook.aura.status.repo.MemoryData) r3
            r6 = 0
            java.lang.String r4 = r3.content
            boolean r5 = r3.isLoading
            java.lang.Long r8 = r3.lastUpdated
            com.facebook.aura.status.repo.MemoryData r0 = r3.copy(r4, r5, r6, r7, r8)
            boolean r0 = r2.A6e(r1, r0)
            if (r0 == 0) goto L6c
            r7 = 0
            goto L4f
        L86:
            com.facebook.aura.status.repo.StatusError$SaveError r7 = new com.facebook.aura.status.repo.StatusError$SaveError
            r7.<init>(r2)
            goto L6a
        L8c:
            X.Hwg.A00(r3)
            X.BLG<com.facebook.aura.status.repo.MemoryData> r4 = r15._data
        L91:
            java.lang.Object r3 = r4.getValue()
            r12 = r3
            com.facebook.aura.status.repo.MemoryData r12 = (com.facebook.aura.status.repo.MemoryData) r12
            r10 = 0
            java.lang.String r13 = r12.content
            boolean r14 = r12.isLoading
            java.lang.Long r0 = r12.lastUpdated
            r15 = r7
            r16 = r10
            r17 = r0
            com.facebook.aura.status.repo.MemoryData r0 = r12.copy(r13, r14, r15, r16, r17)
            boolean r0 = r4.A6e(r3, r0)
            if (r0 == 0) goto L91
            com.facebook.aura.gateway.HatchFileOperations r3 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
            X.CGz r6 = r1.userSession
            r11.L$0 = r5
            r11.label = r7
            java.lang.String r4 = "MEMORY.md"
            r8 = 0
            r9 = r7
            java.lang.Object r3 = r3.writeFile(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r3 != r2) goto L29
            return r2
        Lc1:
            com.facebook.aura.status.repo.MemoryDataSource$saveContent$1 r11 = new com.facebook.aura.status.repo.MemoryDataSource$saveContent$1
            r11.<init>(r4)
            goto L17
        Lc8:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        Lcd:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.repo.MemoryDataSource.saveContent(java.lang.String, X.HtJ):java.lang.Object");
    }

    public MemoryDataSource(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        C9286GCn c9286GCnA14 = C3cG.A14(new MemoryData("", false, false, null, null));
        this._data = c9286GCnA14;
        this.data = C3cG.A11(c9286GCnA14);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        clear();
    }

    public /* synthetic */ MemoryDataSource(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
