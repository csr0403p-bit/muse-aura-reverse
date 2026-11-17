package com.facebook.aura.pause;

import X.C20Q;
import X.C20Z;
import X.HtJ;
import X.HzP;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class HatchPauseEnrollmentFlowStore$getEnrollment$$inlined$map$1 implements C20Q<EnrollmentData> {
    public final /* synthetic */ String $hatchlingId$inlined;
    public final /* synthetic */ C20Q $this_unsafeTransform$inlined;
    public final /* synthetic */ HatchPauseEnrollmentFlowStore this$0;

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$getEnrollment$$inlined$map$1", f = "HatchPauseEnrollmentFlowStore.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "collect", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$getEnrollment$$inlined$map$1$1, reason: invalid class name */
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
            return HatchPauseEnrollmentFlowStore$getEnrollment$$inlined$map$1.this.collect(null, this);
        }
    }

    /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$getEnrollment$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2<T> implements C20Z {
        public final /* synthetic */ String $hatchlingId$inlined;
        public final /* synthetic */ C20Z $this_unsafeFlow;
        public final /* synthetic */ HatchPauseEnrollmentFlowStore this$0;

        @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$getEnrollment$$inlined$map$1$2", f = "HatchPauseEnrollmentFlowStore.kt", l = {217}, m = "emit", v = 2)
        /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$getEnrollment$$inlined$map$1$2$1, reason: invalid class name */
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

        public AnonymousClass2(C20Z c20z, HatchPauseEnrollmentFlowStore hatchPauseEnrollmentFlowStore, String str) {
            this.$this_unsafeFlow = c20z;
            this.this$0 = hatchPauseEnrollmentFlowStore;
            this.$hatchlingId$inlined = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
        @Override // X.C20Z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r10, X.HtJ r11) {
            /*
                r9 = this;
                boolean r0 = r11 instanceof com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$getEnrollment$$inlined$map$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L6b
                r7 = r11
                com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$getEnrollment$$inlined$map$1$2$1 r7 = (com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$getEnrollment$$inlined$map$1.AnonymousClass2.AnonymousClass1) r7
                int r2 = r7.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L6b
                int r2 = r2 - r1
                r7.label = r2
            L12:
                java.lang.Object r1 = r7.result
                X.Hji r6 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r8 = 1
                if (r0 == 0) goto L23
                if (r0 != r8) goto L71
                X.Hwg.A00(r1)
            L20:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L23:
                X.Hwg.A00(r1)
                X.20Z r5 = r9.$this_unsafeFlow
                androidx.datastore.preferences.core.Preferences r10 = (androidx.datastore.preferences.core.Preferences) r10
                com.facebook.aura.pause.HatchPauseEnrollmentFlowStore r1 = r9.this$0
                java.lang.String r0 = r9.$hatchlingId$inlined
                X.6JZ r0 = com.facebook.aura.pause.HatchPauseEnrollmentFlowStore.access$enrollmentKey(r1, r0)
                java.lang.Object r2 = r10.A06(r0)
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L69
                X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson
                com.facebook.aura.pause.EnrollmentDataJson$$serializer r0 = com.facebook.aura.pause.EnrollmentDataJson$$serializer.INSTANCE
                java.lang.Object r4 = r1.A00(r2, r0)
                com.facebook.aura.pause.EnrollmentDataJson r4 = (com.facebook.aura.pause.EnrollmentDataJson) r4
                java.lang.String r3 = r4.keyId
                java.lang.String r1 = r4.encryptedPassphrase
                r0 = 2
                byte[] r2 = android.util.Base64.decode(r1, r0)
                X.C7384Etj.A0U(r2)
                boolean r0 = r4.requiresBiometric
                com.facebook.aura.pause.EnrollmentData r1 = new com.facebook.aura.pause.EnrollmentData
                r1.<init>(r3, r2, r0)
            L57:
                r0 = 0
                r7.L$0 = r0
                r7.L$1 = r0
                r7.L$2 = r0
                r7.L$3 = r0
                r7.label = r8
                java.lang.Object r0 = r5.emit(r1, r7)
                if (r0 != r6) goto L20
                return r6
            L69:
                r1 = 0
                goto L57
            L6b:
                com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$getEnrollment$$inlined$map$1$2$1 r7 = new com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$getEnrollment$$inlined$map$1$2$1
                r7.<init>(r11)
                goto L12
            L71:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$getEnrollment$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, X.HtJ):java.lang.Object");
        }
    }

    public HatchPauseEnrollmentFlowStore$getEnrollment$$inlined$map$1(C20Q c20q, HatchPauseEnrollmentFlowStore hatchPauseEnrollmentFlowStore, String str) {
        this.$this_unsafeTransform$inlined = c20q;
        this.this$0 = hatchPauseEnrollmentFlowStore;
        this.$hatchlingId$inlined = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    @Override // X.C20Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(X.C20Z<? super com.facebook.aura.pause.EnrollmentData> r8, X.HtJ r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$getEnrollment$$inlined$map$1.AnonymousClass1
            if (r0 == 0) goto L41
            r6 = r9
            com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$getEnrollment$$inlined$map$1$1 r6 = (com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$getEnrollment$$inlined$map$1.AnonymousClass1) r6
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
            com.facebook.aura.pause.HatchPauseEnrollmentFlowStore r2 = r7.this$0
            java.lang.String r0 = r7.$hatchlingId$inlined
            com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$getEnrollment$$inlined$map$1$2 r1 = new com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$getEnrollment$$inlined$map$1$2
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
            com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$getEnrollment$$inlined$map$1$1 r6 = new com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$getEnrollment$$inlined$map$1$1
            r6.<init>(r9)
            goto L12
        L47:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pause.HatchPauseEnrollmentFlowStore$getEnrollment$$inlined$map$1.collect(X.20Z, X.HtJ):java.lang.Object");
    }
}
