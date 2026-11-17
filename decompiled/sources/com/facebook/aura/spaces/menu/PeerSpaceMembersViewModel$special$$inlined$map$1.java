package com.facebook.aura.spaces.menu;

import X.C20Q;
import X.C20Z;
import X.HtJ;
import X.HzP;
import com.facebook.aura.library.repo.ArtifactItem;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public final class PeerSpaceMembersViewModel$special$$inlined$map$1 implements C20Q<ArtifactItem> {
    public final /* synthetic */ String $hostMuse$inlined;
    public final /* synthetic */ String $spaceId$inlined;
    public final /* synthetic */ C20Q $this_unsafeTransform$inlined;

    @DebugMetadata(c = "com.facebook.aura.spaces.menu.PeerSpaceMembersViewModel$special$$inlined$map$1", f = "PeerSpaceMembersViewModel.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "collect", v = 2)
    /* renamed from: com.facebook.aura.spaces.menu.PeerSpaceMembersViewModel$special$$inlined$map$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PeerSpaceMembersViewModel$special$$inlined$map$1.this.collect(null, this);
        }
    }

    /* renamed from: com.facebook.aura.spaces.menu.PeerSpaceMembersViewModel$special$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2<T> implements C20Z {
        public final /* synthetic */ String $hostMuse$inlined;
        public final /* synthetic */ String $spaceId$inlined;
        public final /* synthetic */ C20Z $this_unsafeFlow;

        @DebugMetadata(c = "com.facebook.aura.spaces.menu.PeerSpaceMembersViewModel$special$$inlined$map$1$2", f = "PeerSpaceMembersViewModel.kt", l = {217}, m = "emit", v = 2)
        /* renamed from: com.facebook.aura.spaces.menu.PeerSpaceMembersViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends HzP {
            public int I$0;
            public Object L$0;
            public Object L$1;
            public Object L$2;
            public Object L$3;
            public Object L$4;
            public int label;
            public /* synthetic */ Object result;

            public AnonymousClass1(HtJ htJ) {
                super(htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(C20Z c20z, String str, String str2) {
            this.$this_unsafeFlow = c20z;
            this.$hostMuse$inlined = str;
            this.$spaceId$inlined = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
        @Override // X.C20Z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r11, X.HtJ r12) {
            /*
                r10 = this;
                boolean r0 = r12 instanceof com.facebook.aura.spaces.menu.PeerSpaceMembersViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L65
                r7 = r12
                com.facebook.aura.spaces.menu.PeerSpaceMembersViewModel$special$$inlined$map$1$2$1 r7 = (com.facebook.aura.spaces.menu.PeerSpaceMembersViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r7
                int r2 = r7.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L65
                int r2 = r2 - r1
                r7.label = r2
            L12:
                java.lang.Object r1 = r7.result
                X.Hji r6 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r8 = 1
                if (r0 == 0) goto L23
                if (r0 != r8) goto L6b
                X.Hwg.A00(r1)
            L20:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L23:
                X.Hwg.A00(r1)
                X.20Z r5 = r10.$this_unsafeFlow
                java.util.Iterator r9 = X.AbstractC7607F5u.A13(r11)
            L2c:
                boolean r0 = r9.hasNext()
                if (r0 == 0) goto L63
                java.lang.Object r4 = r9.next()
                r2 = r4
                com.facebook.aura.library.repo.ArtifactItem r2 = (com.facebook.aura.library.repo.ArtifactItem) r2
                com.facebook.aura.library.repo.ArtifactSource r1 = r2.source
                com.facebook.aura.library.repo.ArtifactSource r0 = com.facebook.aura.library.repo.ArtifactSource.PEER_SPACE
                if (r1 != r0) goto L2c
                java.lang.String r3 = r2.itemKey
                java.lang.String r2 = r10.$hostMuse$inlined
                java.lang.String r1 = r10.$spaceId$inlined
                java.lang.String r0 = ":"
                java.lang.String r0 = X.FGI.A0U(r2, r0, r1)
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L2c
            L51:
                r0 = 0
                r7.L$0 = r0
                r7.L$1 = r0
                r7.L$2 = r0
                r7.L$3 = r0
                r7.label = r8
                java.lang.Object r0 = r5.emit(r4, r7)
                if (r0 != r6) goto L20
                return r6
            L63:
                r4 = 0
                goto L51
            L65:
                com.facebook.aura.spaces.menu.PeerSpaceMembersViewModel$special$$inlined$map$1$2$1 r7 = new com.facebook.aura.spaces.menu.PeerSpaceMembersViewModel$special$$inlined$map$1$2$1
                r7.<init>(r12)
                goto L12
            L6b:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.menu.PeerSpaceMembersViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, X.HtJ):java.lang.Object");
        }
    }

    public PeerSpaceMembersViewModel$special$$inlined$map$1(C20Q c20q, String str, String str2) {
        this.$this_unsafeTransform$inlined = c20q;
        this.$hostMuse$inlined = str;
        this.$spaceId$inlined = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    @Override // X.C20Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(X.C20Z<? super com.facebook.aura.library.repo.ArtifactItem> r8, X.HtJ r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.spaces.menu.PeerSpaceMembersViewModel$special$$inlined$map$1.AnonymousClass1
            if (r0 == 0) goto L41
            r6 = r9
            com.facebook.aura.spaces.menu.PeerSpaceMembersViewModel$special$$inlined$map$1$1 r6 = (com.facebook.aura.spaces.menu.PeerSpaceMembersViewModel$special$$inlined$map$1.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L23
            if (r0 != r4) goto L47
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L23:
            X.Hwg.A00(r1)
            X.20Q r3 = r7.$this_unsafeTransform$inlined
            java.lang.String r2 = r7.$hostMuse$inlined
            java.lang.String r0 = r7.$spaceId$inlined
            com.facebook.aura.spaces.menu.PeerSpaceMembersViewModel$special$$inlined$map$1$2 r1 = new com.facebook.aura.spaces.menu.PeerSpaceMembersViewModel$special$$inlined$map$1$2
            r1.<init>(r8, r2, r0)
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r0
            r6.L$2 = r0
            r6.label = r4
            java.lang.Object r0 = r3.collect(r1, r6)
            if (r0 != r5) goto L20
            return r5
        L41:
            com.facebook.aura.spaces.menu.PeerSpaceMembersViewModel$special$$inlined$map$1$1 r6 = new com.facebook.aura.spaces.menu.PeerSpaceMembersViewModel$special$$inlined$map$1$1
            r6.<init>(r9)
            goto L12
        L47:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.menu.PeerSpaceMembersViewModel$special$$inlined$map$1.collect(X.20Z, X.HtJ):java.lang.Object");
    }
}
