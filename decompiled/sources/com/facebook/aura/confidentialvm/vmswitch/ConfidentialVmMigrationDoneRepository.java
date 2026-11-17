package com.facebook.aura.confidentialvm.vmswitch;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.C06H;
import X.C0881AGi;
import X.C7384Etj;
import X.CFK;
import X.CH0;
import X.G0V;
import X.HtJ;
import X.HzP;
import X.InterfaceC7549F2g;
import com.facebook.aura.gateway.HatchGatewayStateSnapshot;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class ConfidentialVmMigrationDoneRepository implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public static final long MAX_AGE_MS = 604800000;
    public static final String MODE_CONFIDENTIAL = "confidential";
    public static final String MODE_STANDARD = "standard";
    public static final long RETRY_INTERVAL_MS = 60000;
    public static final String TAG = "ConfidentialVmMigrationDoneRepository";
    public final ConfidentialVmCheckpointStore<ConfidentialVmMigrationDoneRecord> store;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationDoneRepository", f = "ConfidentialVmMigrationDoneRepository.kt", l = {103}, m = "awaitConnectedTo", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationDoneRepository$awaitConnectedTo$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmMigrationDoneRepository.this.awaitConnectedTo(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationDoneRepository$awaitConnectedTo$2", f = "ConfidentialVmMigrationDoneRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationDoneRepository$awaitConnectedTo$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<HatchGatewayStateSnapshot, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $destinationEnvId;
        public final /* synthetic */ HatchGatewayPrefsStore $prefs;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchGatewayPrefsStore hatchGatewayPrefsStore, String str, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$prefs = hatchGatewayPrefsStore;
            this.$destinationEnvId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$prefs, this.$destinationEnvId, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            /*
                r2 = this;
                java.lang.Object r1 = r2.L$0
                com.facebook.aura.gateway.HatchGatewayStateSnapshot r1 = (com.facebook.aura.gateway.HatchGatewayStateSnapshot) r1
                int r0 = r2.label
                if (r0 != 0) goto L26
                X.Hwg.A00(r3)
                com.facebook.aura.gateway.HatchGatewayConnectionState r0 = r1.connection
                boolean r0 = r0 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Connected
                if (r0 == 0) goto L20
                com.facebook.aura.gateway.store.HatchGatewayPrefsStore r0 = r2.$prefs
                java.lang.String r1 = X.C3cG.A0a(r0)
                java.lang.String r0 = r2.$destinationEnvId
                boolean r1 = X.C7384Etj.areEqual(r1, r0)
                r0 = 1
                if (r1 != 0) goto L21
            L20:
                r0 = 0
            L21:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            L26:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationDoneRepository.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(HatchGatewayStateSnapshot hatchGatewayStateSnapshot, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass2) create(hatchGatewayStateSnapshot, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationDoneRepository", f = "ConfidentialVmMigrationDoneRepository.kt", l = {59, 159, 79}, m = "awaitPending", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationDoneRepository$awaitPending$1, reason: invalid class name and case insensitive filesystem */
    public final class C113031 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public C113031(HtJ<? super C113031> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmMigrationDoneRepository.this.awaitPending(this);
        }
    }

    public final void record$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_vmswitch_vmswitch(String str, String str2, boolean z) {
        C7384Etj.A0Y(str, 0);
        if (this.store.write(new ConfidentialVmMigrationDoneRecord(str, str2, z, System.currentTimeMillis()))) {
            return;
        }
        CFK.A06(TAG, "Could not record the completed migration");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitConnectedTo(java.lang.String r8, X.HtJ<? super java.lang.String> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationDoneRepository.AnonymousClass1
            if (r0 == 0) goto L51
            r6 = r9
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationDoneRepository$awaitConnectedTo$1 r6 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationDoneRepository.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L29
            if (r0 != r4) goto L57
            java.lang.Object r3 = r6.L$1
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore r3 = (com.facebook.aura.gateway.store.HatchGatewayPrefsStore) r3
            X.Hwg.A00(r1)
        L24:
            java.lang.String r5 = r3.getGatewayUrl()
            return r5
        L29:
            X.Hwg.A00(r1)
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore$Companion r1 = com.facebook.aura.gateway.store.HatchGatewayPrefsStore.Companion
            X.CGz r0 = r7.userSession
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore r3 = r1.getInstance(r0)
            com.facebook.aura.gateway.service.HatchGatewayServiceManager r1 = com.facebook.aura.gateway.service.HatchGatewayServiceManager.INSTANCE
            X.CGz r0 = r7.userSession
            com.facebook.aura.gateway.HatchGatewayConnection r0 = r1.getGateway(r0)
            X.1BN<com.facebook.aura.gateway.HatchGatewayStateSnapshot> r2 = r0.gatewayState
            r1 = 0
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationDoneRepository$awaitConnectedTo$2 r0 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationDoneRepository$awaitConnectedTo$2
            r0.<init>(r3, r8, r1)
            r6.L$0 = r1
            r6.L$1 = r3
            r6.label = r4
            java.lang.Object r0 = X.AbstractC9777Gfy.A00(r6, r0, r2)
            if (r0 != r5) goto L24
            return r5
        L51:
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationDoneRepository$awaitConnectedTo$1 r6 = new com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationDoneRepository$awaitConnectedTo$1
            r6.<init>(r9)
            goto L12
        L57:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationDoneRepository.awaitConnectedTo(java.lang.String, X.HtJ):java.lang.Object");
    }

    private final ConfidentialVmMigrationDone migrationDoneFor(ConfidentialVmMigrationDoneRecord confidentialVmMigrationDoneRecord, VmMigrationJson vmMigrationJson) {
        if (vmMigrationJson != null) {
            if (confidentialVmMigrationDoneRecord.migrationId == null || !(!r2.equals(vmMigrationJson.migration_id))) {
                String str = vmMigrationJson.to_mode;
                boolean z = MODE_CONFIDENTIAL.equals(str) ? true : MODE_STANDARD.equals(str) ? false : confidentialVmMigrationDoneRecord.isConfidentialVm;
                List list = vmMigrationJson.connectors_disconnected;
                if (list == null) {
                    list = C0881AGi.A00;
                }
                List list2 = vmMigrationJson.channels_disconnected;
                if (list2 == null) {
                    list2 = C0881AGi.A00;
                }
                return new ConfidentialVmMigrationDone(z, list, list2);
            }
        }
        CFK.A05(TAG, "This VM's latest migration is not the one this device ran");
        this.store.clear();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x011e -> B:16:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitPending(X.HtJ<? super com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationDone> r27) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationDoneRepository.awaitPending(X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
    }

    public final void dismiss() {
        this.store.clear();
    }

    public final class Companion {
        public final ConfidentialVmMigrationDoneRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (ConfidentialVmMigrationDoneRepository) abstractC3358CGz.A03(ConfidentialVmMigrationDoneRepository.class, new ConfidentialVmMigrationDoneRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ConfidentialVmMigrationDoneRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.store = ConfidentialVmMigrationDoneRecord.Companion.store(((CH0) abstractC3358CGz).A01);
    }

    public /* synthetic */ ConfidentialVmMigrationDoneRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
