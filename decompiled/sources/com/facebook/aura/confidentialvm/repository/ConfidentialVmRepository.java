package com.facebook.aura.confidentialvm.repository;

import X.A7A;
import X.A7D;
import X.A7K;
import X.ACW;
import X.ACf;
import X.ACv;
import X.ADB;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC5321DgF;
import X.AbstractC7610F5x;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.BFI;
import X.BLG;
import X.BV4;
import X.BV5;
import X.C06H;
import X.C10362HCh;
import X.C10365HCn;
import X.C10367HCr;
import X.C10371HCv;
import X.C10372HCw;
import X.C10543Hqv;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C78T;
import X.C8838Fqo;
import X.C8j3;
import X.C9286GCn;
import X.C9767GfL;
import X.C9jH;
import X.C9zv;
import X.CFK;
import X.EnumC10364HCl;
import X.EnumC10460Hji;
import X.F0C;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HD2;
import X.HD4;
import X.HD6;
import X.HDA;
import X.HDE;
import X.Hl3;
import X.Hqz;
import X.Hrl;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzP;
import X.InterfaceC10560Hsz;
import X.InterfaceC7549F2g;
import android.app.KeyguardManager;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.facebook.aura.common.appcontext.AuraAppContext;
import com.facebook.aura.composer.dictation.voyager.OggOpusStreamEncoder;
import com.facebook.aura.confidentialvm.network.AuraVestaManagerProvider;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmEscrowResult;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmStefiPath;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmVerifyResult;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.gateway.connection.ConnectionReducerKt;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.network.notary.HatchNotaryTokenCache;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.secure.hatchcvm.HatchCVMException;
import com.facebook.vesta.VestaClient;
import com.facebook.vesta.VestaClientException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class ConfidentialVmRepository implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public static final int MAX_CAUSE_DEPTH = 16;
    public static final int SECRET_BYTE_LENGTH = 32;
    public static final String SECRET_DB_PREFIX = "hatch_cvm_";
    public static final String TAG = "ConfidentialVmRepository";
    public final BLG<Boolean> _recoveryPinPromptVisible;
    public final BLG<Boolean> _supportInvestigatingVisible;
    public final ConcurrentHashMap<String, InterfaceC10560Hsz<Unit>> applyingSnapshots;
    public final AtomicReference<String> loggedReminderPromptId;
    public volatile ConfidentialVmPinReminderContext pinReminderContext;
    public final ConfidentialVmPinStateStore pinStateStore;
    public final C1BN<Boolean> recoveryPinPromptVisible;
    public final F0C secretService$delegate;
    public final F0C secretStore$delegate;
    public final C1BN<Boolean> supportInvestigatingVisible;
    public final AbstractC3358CGz userSession;
    public final ConfidentialVmVestaRegistrationResolver vestaRegistrationResolver;
    public final C3UX writeScope;
    public final AtomicReference<String> wrongGuessReminderId;

    public final class Companion {
        public final void clearPinState(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            new ConfidentialVmPinStateStore(abstractC3358CGz).clear();
        }

        public final ConfidentialVmRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (ConfidentialVmRepository) abstractC3358CGz.A03(ConfidentialVmRepository.class, new ConfidentialVmRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public final void clearStoredSecret(String str) {
            C7384Etj.A0Y(str, 0);
            Context context = AuraAppContext.INSTANCE.getContext();
            if (context != null) {
                String strA0U = FGI.A0U(ConfidentialVmRepository.SECRET_DB_PREFIX, str, ".db");
                String[] strArrDatabaseList = context.databaseList();
                C7384Etj.A0U(strArrDatabaseList);
                if (BFI.A0J(strA0U, strArrDatabaseList)) {
                    try {
                        ACf aCf = new ACf(context, strA0U, null, 1);
                        try {
                            SQLiteDatabase writableDatabase = aCf.getWritableDatabase();
                            C7384Etj.A0U(writableDatabase);
                            new ACW(writableDatabase).A01();
                            aCf.close();
                        } catch (Throwable th) {
                            aCf.close();
                            throw th;
                        }
                    } catch (Exception e) {
                        CFK.A0K(ConfidentialVmRepository.TAG, e, "clearStoredSecret: failed to clear cached secret store");
                    }
                    if (context.deleteDatabase(strA0U)) {
                        return;
                    }
                    CFK.A06(ConfidentialVmRepository.TAG, "clearStoredSecret: failed to delete secret database");
                }
            }
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository", f = "ConfidentialVmRepository.kt", l = {678}, m = "applyAuthenticatedSnapshot", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$applyAuthenticatedSnapshot$1, reason: invalid class name */
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
            return ConfidentialVmRepository.this.applyAuthenticatedSnapshot(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository", f = "ConfidentialVmRepository.kt", l = {661}, m = "applyPinSnapshot", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$applyPinSnapshot$1, reason: invalid class name and case insensitive filesystem */
    public final class C112201 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C112201(HtJ<? super C112201> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmRepository.this.applyPinSnapshot(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$applyPinSnapshot$2", f = "ConfidentialVmRepository.kt", l = {671}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$applyPinSnapshot$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmRepository.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConfidentialVmRepository.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ConfidentialVmRepository confidentialVmRepository = ConfidentialVmRepository.this;
                this.label = 1;
                if (confidentialVmRepository.retryPendingPinUpdate(this) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$applyPinSnapshotAsync$1", f = "ConfidentialVmRepository.kt", l = {631}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$applyPinSnapshotAsync$1, reason: invalid class name and case insensitive filesystem */
    public final class C112211 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ JsonObject $payload;
        public long J$0;
        public int label;
        public final /* synthetic */ ConfidentialVmRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112211(JsonObject jsonObject, ConfidentialVmRepository confidentialVmRepository, HtJ<? super C112211> htJ) {
            super(2, htJ);
            this.$payload = jsonObject;
            this.this$0 = confidentialVmRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C112211(this.$payload, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Throwable {
            long jOptLong;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                jOptLong = JsonObjectExtensionsKt.optLong(this.$payload, "state_revision", 0L);
                ConfidentialVmRepository confidentialVmRepository = this.this$0;
                JsonObject jsonObject = this.$payload;
                this.J$0 = jOptLong;
                this.label = 1;
                obj = confidentialVmRepository.applyPinSnapshot(jsonObject, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                jOptLong = this.J$0;
                Hwg.A00(obj);
            }
            if (obj == ConfidentialVmPinSnapshotResult.APPLIED) {
                CFK.A05(ConfidentialVmRepository.TAG, FGI.A0B(jOptLong, "applyPinSnapshotAsync: applied revision="));
            } else {
                StringBuilder sbA0f = C3cG.A0f(obj, "applyPinSnapshotAsync: not applied, result=");
                sbA0f.append(" revision=");
                sbA0f.append(jOptLong);
                CFK.A06(ConfidentialVmRepository.TAG, sbA0f.toString());
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C112211) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository", f = "ConfidentialVmRepository.kt", l = {346}, m = "awaitMatchingPinState", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$awaitMatchingPinState$1, reason: invalid class name and case insensitive filesystem */
    public final class C112221 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C112221(HtJ<? super C112221> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmRepository.this.awaitMatchingPinState(null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$awaitMatchingPinState$2", f = "ConfidentialVmRepository.kt", l = {349}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$awaitMatchingPinState$2, reason: invalid class name and case insensitive filesystem */
    public final class C112232 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ConfidentialVmPinReminderContext $context;
        public final /* synthetic */ String $key;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112232(ConfidentialVmPinReminderContext confidentialVmPinReminderContext, String str, HtJ<? super C112232> htJ) {
            super(2, htJ);
            this.$context = confidentialVmPinReminderContext;
            this.$key = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmRepository.this.new C112232(this.$context, this.$key, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            InterfaceC10560Hsz<Unit> interfaceC10560Hsz;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i != 0 && i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            while (!ConfidentialVmRepository.this.matchesStoredPinState(this.$context) && (interfaceC10560Hsz = ConfidentialVmRepository.this.applyingSnapshots.get(this.$key)) != null) {
                this.L$0 = null;
                this.label = 1;
                if (C3cG.A0W(interfaceC10560Hsz, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C112232) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$checkReminderPin$2", f = "ConfidentialVmRepository.kt", l = {1034, 1043}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$checkReminderPin$2, reason: invalid class name and case insensitive filesystem */
    public final class C112242 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ConfidentialVmPinVerifyResult>, Object> {
        public final /* synthetic */ String $pin;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112242(String str, HtJ<? super C112242> htJ) {
            super(2, htJ);
            this.$pin = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmRepository.this.new C112242(this.$pin, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r5.label
                r1 = 2
                r3 = 1
                if (r0 == 0) goto L1d
                if (r0 == r3) goto L75
                if (r0 != r1) goto L60
                java.lang.Object r3 = r5.L$1
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r0 = r5.L$0
                java.lang.String r2 = X.C3cG.A0d(r0, r6)
            L16:
                byte[] r6 = (byte[]) r6
                if (r6 != 0) goto L45
                com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifyResult$AuthenticationFailed r0 = com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifyResult.AuthenticationFailed.INSTANCE
                return r0
            L1d:
                X.Hwg.A00(r6)
                com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository r0 = com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.this
                com.facebook.aura.confidentialvm.repository.ConfidentialVmPinStateStore r0 = r0.pinStateStore
                com.facebook.aura.confidentialvm.repository.ConfidentialVmPinState r0 = r0.read()
                if (r0 == 0) goto L65
                java.lang.String r2 = r0.encryptedPinVerifier
                if (r2 == 0) goto L65
                java.lang.String r0 = r5.$pin
                java.lang.String r3 = com.facebook.aura.confidentialvm.repository.ConfidentialVmRepositoryKt.normalizeRecoveryPin(r0)
                if (r3 == 0) goto L81
                com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository r0 = com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.this
                r5.L$0 = r2
                r5.L$1 = r3
                r5.label = r1
                java.lang.Object r6 = com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.access$getStoredSecretBytes(r0, r5)
                if (r6 != r4) goto L16
                return r4
            L45:
                com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto r0 = com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto.INSTANCE     // Catch: java.lang.Throwable -> L5b
                byte[] r1 = r0.deriveKey(r6)     // Catch: java.lang.Throwable -> L5b
                X.C8j3.A1L(r6)
                com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifyResult r4 = r0.verify(r1, r2, r3)     // Catch: java.lang.Throwable -> L56
                X.C8j3.A1L(r1)
                return r4
            L56:
                r0 = move-exception
                X.C8j4.A1T(r1)
                throw r0
            L5b:
                r0 = move-exception
                X.C8j4.A1T(r6)
                throw r0
            L60:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L65:
                com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository r2 = com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.this
                java.lang.String r1 = r5.$pin
                r0 = 0
                r5.L$0 = r0
                r5.label = r3
                java.lang.Object r6 = r2.verifyPinLocally(r1, r5)
                if (r6 != r4) goto L78
                return r4
            L75:
                X.Hwg.A00(r6)
            L78:
                boolean r0 = X.AnonymousClass001.A1X(r6)
                if (r0 == 0) goto L81
                com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifyResult$Match r0 = com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifyResult.Match.INSTANCE
                return r0
            L81:
                com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifyResult$Mismatch r0 = com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifyResult.Mismatch.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112242.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ConfidentialVmPinVerifyResult> htJ) {
            return ((C112242) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository", f = "ConfidentialVmRepository.kt", l = {1434, ConnectionReducerKt.SERVICE_NOTICE_CODE_RESTART}, m = "confirmReminder", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$confirmReminder$1, reason: invalid class name and case insensitive filesystem */
    public final class C112251 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C112251(HtJ<? super C112251> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmRepository.this.confirmReminder(null, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$deleteOrphanedSecret$2", f = "ConfidentialVmRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$deleteOrphanedSecret$2, reason: invalid class name and case insensitive filesystem */
    public final class C112262 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ConfidentialVmStoredEnrollment>, Object> {
        public int label;

        public C112262(HtJ<? super C112262> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmRepository.this.new C112262(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ConfidentialVmStoredEnrollment> htJ) {
            return ConfidentialVmRepository.this.new C112262(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            try {
                A7K secretStore = ConfidentialVmRepository.this.getSecretStore();
                synchronized (secretStore.A03) {
                    secretStore.A02.A01();
                    secretStore.A00 = false;
                }
                CFK.A05(ConfidentialVmRepository.TAG, "getStoredEnrollment: deleted a cached secret with no Vesta escrow");
                return ConfidentialVmStoredEnrollment.NOT_STORED;
            } catch (Exception e) {
                CFK.A0K(ConfidentialVmRepository.TAG, e, "getStoredEnrollment: failed to delete a cached secret with no escrow");
                return ConfidentialVmStoredEnrollment.UNAVAILABLE;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$deriveHostData$2", f = "ConfidentialVmRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$deriveHostData$2, reason: invalid class name and case insensitive filesystem */
    public final class C112272 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super byte[]>, Object> {
        public final /* synthetic */ String $hatchlingId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112272(String str, HtJ<? super C112272> htJ) {
            super(2, htJ);
            this.$hatchlingId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmRepository.this.new C112272(this.$hatchlingId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            try {
                A7A secretService = ConfidentialVmRepository.this.getSecretService();
                String str = this.$hatchlingId;
                C7384Etj.A0Y(str, 0);
                byte[] bArrA01 = secretService.A01(str);
                if (bArrA01 == null) {
                    return null;
                }
                try {
                    return C9zv.A00(bArrA01);
                } finally {
                    C8j3.A1L(bArrA01);
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0K(ConfidentialVmRepository.TAG, e2, "deriveHostData: failed to derive from the stored secret");
                return null;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super byte[]> htJ) {
            return ((C112272) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$discardLegacySecret$2", f = "ConfidentialVmRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$discardLegacySecret$2, reason: invalid class name and case insensitive filesystem */
    public final class C112282 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $hatchlingId;
        public final /* synthetic */ byte[] $rejectedHostData;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112282(String str, byte[] bArr, HtJ<? super C112282> htJ) {
            super(2, htJ);
            this.$hatchlingId = str;
            this.$rejectedHostData = bArr;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmRepository.this.new C112282(this.$hatchlingId, this.$rejectedHostData, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x007c A[Catch: Exception -> 0x0081, CancellationException -> 0x008a, DONT_GENERATE, TRY_ENTER, TryCatch #5 {CancellationException -> 0x008a, Exception -> 0x0081, blocks: (B:5:0x0009, B:6:0x001a, B:19:0x0067, B:20:0x0068, B:27:0x007c, B:30:0x007f, B:31:0x0080), top: B:44:0x0009 }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.String r5 = "ConfidentialVmRepository"
                int r0 = r8.label
                if (r0 != 0) goto L8c
                X.Hwg.A00(r9)
                com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository r0 = com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.this     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                X.A7A r0 = com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.access$getSecretService(r0)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                java.lang.String r3 = r8.$hatchlingId     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                byte[] r8 = r8.$rejectedHostData     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                X.AnonymousClass004.A1b(r3, r8)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                X.A7K r9 = r0.A00     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                java.lang.Object r6 = r9.A03     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                monitor-enter(r6)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                X.ACW r2 = r9.A02     // Catch: java.lang.Throwable -> L7e
                java.lang.String r7 = "hatch_cvm_account_secret"
                X.A7L r0 = r2.A00(r7)     // Catch: java.lang.Throwable -> L7e
                if (r0 == 0) goto L7c
                X.A7M r4 = r0.A01     // Catch: java.lang.Throwable -> L7e
                java.lang.String r1 = r4.A00     // Catch: java.lang.Throwable -> L7e
                java.lang.String r0 = "AES-GCM-256"
                boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L7e
                if (r0 == 0) goto L7c
                java.lang.String r0 = "hatch_cvm_bound:"
                java.lang.String r0 = X.FGI.A0M(r0, r7)     // Catch: java.lang.Throwable -> L7e
                X.A7L r0 = r2.A00(r0)     // Catch: java.lang.Throwable -> L7e
                boolean r0 = X.AnonymousClass002.A1X(r0)     // Catch: java.lang.Throwable -> L7e
                if (r0 != 0) goto L7c
                X.ADo r1 = r9.A01     // Catch: java.lang.Throwable -> L7e
                java.lang.String r0 = r9.A04     // Catch: java.lang.Throwable -> L7e
                byte[] r0 = X.A7K.A03(r0, r7)     // Catch: java.lang.Throwable -> L7e
                byte[] r4 = r1.A01(r4, r0)     // Catch: java.lang.Throwable -> L7e
                boolean r0 = X.A7A.A00(r3, r4, r8)     // Catch: java.lang.Throwable -> L77
                if (r0 != 0) goto L57
                X.C8j3.A1L(r4)     // Catch: java.lang.Throwable -> L7e
                goto L7c
            L57:
                android.database.sqlite.SQLiteDatabase r3 = r2.A00     // Catch: android.database.SQLException -> L6e java.lang.Throwable -> L77
                java.lang.String r2 = "secrets"
                java.lang.String r1 = "id=?"
                java.lang.String[] r0 = new java.lang.String[]{r7}     // Catch: android.database.SQLException -> L6e java.lang.Throwable -> L77
                r3.delete(r2, r1, r0)     // Catch: android.database.SQLException -> L6e java.lang.Throwable -> L77
                X.C8j3.A1L(r4)     // Catch: java.lang.Throwable -> L7e
                monitor-exit(r6)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                java.lang.String r0 = "discardLegacySecret: deleted a legacy account secret the CVM rejected"
                X.CFK.A06(r5, r0)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                goto L87
            L6e:
                r2 = move-exception
                java.lang.String r1 = "Unable to delete secret"
                com.facebook.secure.hatchcvm.HatchCVMException r0 = new com.facebook.secure.hatchcvm.HatchCVMException     // Catch: java.lang.Throwable -> L77
                r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L77
                throw r0     // Catch: java.lang.Throwable -> L77
            L77:
                r0 = move-exception
                X.C8j3.A1L(r4)     // Catch: java.lang.Throwable -> L7e
                throw r0     // Catch: java.lang.Throwable -> L7e
            L7c:
                monitor-exit(r6)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                goto L87
            L7e:
                r0 = move-exception
                monitor-exit(r6)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                throw r0     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
            L81:
                r1 = move-exception
                java.lang.String r0 = "discardLegacySecret: failed; keeping the legacy account secret"
                X.CFK.A0K(r5, r1, r0)
            L87:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L8a:
                r0 = move-exception
                throw r0
            L8c:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112282.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C112282) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$escrowPinUsingStoredOrNewSecret$2", f = "ConfidentialVmRepository.kt", l = {442, 443}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$escrowPinUsingStoredOrNewSecret$2, reason: invalid class name and case insensitive filesystem */
    public final class C112292 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ConfidentialVmEscrowResult>, Object> {
        public final /* synthetic */ String $pin;
        public Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ ConfidentialVmRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112292(String str, ConfidentialVmRepository confidentialVmRepository, HtJ<? super C112292> htJ) {
            super(2, htJ);
            this.$pin = str;
            this.this$0 = confidentialVmRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C112292(this.$pin, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String strNormalizeRecoveryPin;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                strNormalizeRecoveryPin = ConfidentialVmRepositoryKt.normalizeRecoveryPin(this.$pin);
                if (strNormalizeRecoveryPin == null) {
                    return ConfidentialVmEscrowResult.Failure.INSTANCE;
                }
                ConfidentialVmRepository confidentialVmRepository = this.this$0;
                this.L$0 = strNormalizeRecoveryPin;
                this.label = 1;
                obj = confidentialVmRepository.getStoredSecretBytes(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        Hwg.A00(obj);
                    }
                    throw AnonymousClass001.A0n();
                }
                strNormalizeRecoveryPin = C3cG.A0d(this.L$0, obj);
            }
            byte[] bArrGenerateSecret = (byte[]) obj;
            if (bArrGenerateSecret == null || bArrGenerateSecret.length != 32) {
                bArrGenerateSecret = this.this$0.generateSecret();
            }
            ConfidentialVmRepository confidentialVmRepository2 = this.this$0;
            String str = this.$pin;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            obj = confidentialVmRepository2.overwriteVestaEscrow(bArrGenerateSecret, strNormalizeRecoveryPin, str, this);
            return obj == enumC10460Hji ? enumC10460Hji : obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ConfidentialVmEscrowResult> htJ) {
            return ((C112292) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository", f = "ConfidentialVmRepository.kt", l = {815}, m = "fetchLoginState", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$fetchLoginState$1, reason: invalid class name and case insensitive filesystem */
    public final class C112301 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C112301(HtJ<? super C112301> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmRepository.this.fetchLoginState(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$fetchUserInfo$2", f = "ConfidentialVmRepository.kt", l = {1403}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$fetchUserInfo$2, reason: invalid class name and case insensitive filesystem */
    public final class C112312 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ConfidentialVmVestaUserInfoResponseJson>, Object> {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        public C112312(HtJ<? super C112312> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C112312(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ConfidentialVmVestaUserInfoResponseJson> htJ) {
            return new C112312(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1596executeBodylessStefiRequestWithtZkwj4A;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                HatchHttpApi hatchHttpApiA06 = C60O.A06(obj);
                ConfidentialVmStefiPath.VestaUserInfo vestaUserInfo = new ConfidentialVmStefiPath.VestaUserInfo(VestaClient.getApiVersionNative());
                RequestType requestType = RequestType.GET;
                C9jH c9jH = C9jH.A00;
                ConfidentialVmRepository$fetchUserInfo$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 confidentialVmRepository$fetchUserInfo$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 = ConfidentialVmRepository$fetchUserInfo$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 1;
                objM1596executeBodylessStefiRequestWithtZkwj4A = hatchHttpApiA06.m1596executeBodylessStefiRequestWithtZkwj4A(confidentialVmRepository$fetchUserInfo$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1, false, vestaUserInfo, requestType, null, null, c9jH, c9jH, this);
                if (objM1596executeBodylessStefiRequestWithtZkwj4A == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1596executeBodylessStefiRequestWithtZkwj4A = AnonymousClass001.A0q(obj);
            }
            Throwable thA00 = HsJ.A00(objM1596executeBodylessStefiRequestWithtZkwj4A);
            if (thA00 == null) {
                return objM1596executeBodylessStefiRequestWithtZkwj4A;
            }
            CFK.A0K(ConfidentialVmRepository.TAG, thA00, "fetchUserInfo: failed to fetch account state");
            return null;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository", f = "ConfidentialVmRepository.kt", l = {607}, m = "fetchVestaRegistration", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$fetchVestaRegistration$1, reason: invalid class name and case insensitive filesystem */
    public final class C112321 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C112321(HtJ<? super C112321> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmRepository.this.fetchVestaRegistration(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository", f = "ConfidentialVmRepository.kt", l = {533, 548, 551}, m = "getStoredEnrollment", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$getStoredEnrollment$1, reason: invalid class name and case insensitive filesystem */
    public final class C112331 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C112331(HtJ<? super C112331> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmRepository.this.getStoredEnrollment(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$getStoredSecretBytes$2", f = "ConfidentialVmRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$getStoredSecretBytes$2, reason: invalid class name and case insensitive filesystem */
    public final class C112342 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super byte[]>, Object> {
        public int label;

        public C112342(HtJ<? super C112342> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmRepository.this.new C112342(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super byte[]> htJ) {
            return ConfidentialVmRepository.this.new C112342(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            byte[] bArr = null;
            try {
                A7D a7dA00 = A7K.A00(ConfidentialVmRepository.this.getSecretStore(), "hatch_cvm_account_secret");
                if (a7dA00 == null) {
                    return null;
                }
                bArr = a7dA00.A01;
                return bArr;
            } catch (Exception e) {
                CFK.A0K(ConfidentialVmRepository.TAG, e, "getStoredSecretBytes: failed to read cached account secret");
                return bArr;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$hasStoredPinHash$2", f = "ConfidentialVmRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$hasStoredPinHash$2, reason: invalid class name and case insensitive filesystem */
    public final class C112352 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public int label;

        public C112352(HtJ<? super C112352> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmRepository.this.new C112352(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ConfidentialVmRepository.this.new C112352(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean zA1X;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            try {
                zA1X = AnonymousClass002.A1X(ConfidentialVmRepository.this.getSecretStore().A02.A00("hatch_cvm_account_secret_pin_hash"));
            } catch (Exception e) {
                CFK.A0K(ConfidentialVmRepository.TAG, e, "hasStoredPinHash: failed to read cached PIN hash");
                zA1X = false;
            }
            return Boolean.valueOf(zA1X);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$hasStoredSecret$2", f = "ConfidentialVmRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$hasStoredSecret$2, reason: invalid class name and case insensitive filesystem */
    public final class C112362 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public int label;

        public C112362(HtJ<? super C112362> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmRepository.this.new C112362(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ConfidentialVmRepository.this.new C112362(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean zA1X;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            try {
                zA1X = AnonymousClass002.A1X(ConfidentialVmRepository.this.getSecretStore().A02.A00("hatch_cvm_account_secret"));
            } catch (Exception e) {
                CFK.A0K(ConfidentialVmRepository.TAG, e, "hasStoredSecret: failed to read cached account secret");
                zA1X = false;
            }
            return Boolean.valueOf(zA1X);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository", f = "ConfidentialVmRepository.kt", l = {366, 367}, m = "isRecoveryPinPromptEligible", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$isRecoveryPinPromptEligible$1, reason: invalid class name and case insensitive filesystem */
    public final class C112371 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C112371(HtJ<? super C112371> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmRepository.this.isRecoveryPinPromptEligible(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository", f = "ConfidentialVmRepository.kt", l = {OggOpusStreamEncoder.PRE_SKIP_48K, OggOpusStreamEncoder.PRE_SKIP_48K}, m = "onPinReminder", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$onPinReminder$1, reason: invalid class name and case insensitive filesystem */
    public final class C112381 extends HzP {
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C112381(HtJ<? super C112381> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmRepository.this.onPinReminder(null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository", f = "ConfidentialVmRepository.kt", l = {471, 476}, m = "overwriteVestaEscrow", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$overwriteVestaEscrow$1, reason: invalid class name and case insensitive filesystem */
    public final class C112391 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C112391(HtJ<? super C112391> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmRepository.this.overwriteVestaEscrow(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository", f = "ConfidentialVmRepository.kt", l = {1434}, m = "postPinUpdate", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$postPinUpdate$1, reason: invalid class name and case insensitive filesystem */
    public final class C112401 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;
        public /* synthetic */ Object result;

        public C112401(HtJ<? super C112401> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmRepository.this.postPinUpdate(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$promoteLegacySecret$2", f = "ConfidentialVmRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$promoteLegacySecret$2, reason: invalid class name and case insensitive filesystem */
    public final class C112412 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ byte[] $attestedHostData;
        public final /* synthetic */ String $hatchlingId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112412(String str, byte[] bArr, HtJ<? super C112412> htJ) {
            super(2, htJ);
            this.$hatchlingId = str;
            this.$attestedHostData = bArr;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmRepository.this.new C112412(this.$hatchlingId, this.$attestedHostData, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[Catch: Exception -> 0x006e, CancellationException -> 0x0077, DONT_GENERATE, TRY_ENTER, TryCatch #4 {CancellationException -> 0x0077, Exception -> 0x006e, blocks: (B:5:0x0009, B:6:0x001a, B:19:0x005d, B:20:0x005e, B:24:0x0069, B:27:0x006c, B:28:0x006d, B:7:0x001b, B:9:0x0025, B:11:0x0031, B:13:0x0041, B:16:0x0053, B:18:0x005a, B:22:0x0065, B:23:0x0068, B:14:0x004d, B:17:0x0057), top: B:40:0x0009, inners: #3 }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.String r2 = "ConfidentialVmRepository"
                int r0 = r8.label
                if (r0 != 0) goto L79
                X.Hwg.A00(r9)
                com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository r0 = com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.this     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L77
                X.A7A r0 = com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.access$getSecretService(r0)     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L77
                java.lang.String r6 = r8.$hatchlingId     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L77
                byte[] r7 = r8.$attestedHostData     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L77
                X.AnonymousClass003.A0u(r6, r7)     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L77
                X.A7K r5 = r0.A00     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L77
                java.lang.Object r4 = r5.A03     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L77
                monitor-enter(r4)     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L77
                X.ACW r9 = r5.A02     // Catch: java.lang.Throwable -> L6b
                java.lang.String r3 = "hatch_cvm_account_secret"
                X.A7L r0 = r9.A00(r3)     // Catch: java.lang.Throwable -> L6b
                if (r0 == 0) goto L69
                X.A7M r8 = r0.A01     // Catch: java.lang.Throwable -> L6b
                java.lang.String r1 = r8.A00     // Catch: java.lang.Throwable -> L6b
                java.lang.String r0 = "AES-GCM-256"
                boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L6b
                if (r0 == 0) goto L69
                java.lang.String r0 = "hatch_cvm_bound:"
                java.lang.String r0 = X.FGI.A0M(r0, r3)     // Catch: java.lang.Throwable -> L6b
                X.A7L r0 = r9.A00(r0)     // Catch: java.lang.Throwable -> L6b
                boolean r0 = X.AnonymousClass002.A1X(r0)     // Catch: java.lang.Throwable -> L6b
                if (r0 != 0) goto L69
                X.ADo r1 = r5.A01     // Catch: java.lang.Throwable -> L6b
                java.lang.String r0 = r5.A04     // Catch: java.lang.Throwable -> L6b
                byte[] r0 = X.A7K.A03(r0, r3)     // Catch: java.lang.Throwable -> L6b
                byte[] r1 = r1.A01(r8, r0)     // Catch: java.lang.Throwable -> L6b
                boolean r0 = X.A7A.A00(r6, r1, r7)     // Catch: java.lang.Throwable -> L64
                if (r0 != 0) goto L57
                X.C8j3.A1L(r1)     // Catch: java.lang.Throwable -> L6b
                goto L69
            L57:
                X.A7K.A02(r5, r3, r1)     // Catch: java.lang.Throwable -> L64
                X.C8j3.A1L(r1)     // Catch: java.lang.Throwable -> L6b
                monitor-exit(r4)     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L77
                java.lang.String r0 = "promoteLegacySecret: bound the legacy account secret after attestation"
                X.CFK.A05(r2, r0)     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L77
                goto L74
            L64:
                r0 = move-exception
                X.C8j3.A1L(r1)     // Catch: java.lang.Throwable -> L6b
                throw r0     // Catch: java.lang.Throwable -> L6b
            L69:
                monitor-exit(r4)     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L77
                goto L74
            L6b:
                r0 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L77
                throw r0     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L77
            L6e:
                r1 = move-exception
                java.lang.String r0 = "promoteLegacySecret: failed; keeping the legacy account secret"
                X.CFK.A0K(r2, r1, r0)
            L74:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L77:
                r0 = move-exception
                throw r0
            L79:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112412.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C112412) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$readPinState$2", f = "ConfidentialVmRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$readPinState$2, reason: invalid class name and case insensitive filesystem */
    public final class C112422 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ConfidentialVmPinState>, Object> {
        public int label;

        public C112422(HtJ<? super C112422> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmRepository.this.new C112422(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ConfidentialVmPinState> htJ) {
            return ConfidentialVmRepository.this.new C112422(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return ConfidentialVmRepository.this.pinStateStore.read();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository", f = "ConfidentialVmRepository.kt", l = {433, 433}, m = "registerEnrollmentPinIfUnregistered", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$registerEnrollmentPinIfUnregistered$1, reason: invalid class name and case insensitive filesystem */
    public final class C112431 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C112431(HtJ<? super C112431> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmRepository.this.registerEnrollmentPinIfUnregistered(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$registerEnrollmentPinIfUnregistered$2", f = "ConfidentialVmRepository.kt", l = {434}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$registerEnrollmentPinIfUnregistered$2, reason: invalid class name and case insensitive filesystem */
    public final class C112442 extends AbstractC07127nr implements G0U<HtJ<? super ConfidentialVmEscrowResult>, Object> {
        public final /* synthetic */ String $pin;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112442(String str, HtJ<? super C112442> htJ) {
            super(1, htJ);
            this.$pin = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return ConfidentialVmRepository.this.new C112442(this.$pin, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ConfidentialVmRepository confidentialVmRepository = ConfidentialVmRepository.this;
                String str = this.$pin;
                this.label = 1;
                obj = confidentialVmRepository.escrowPinUsingStoredOrNewSecret(str, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super ConfidentialVmEscrowResult> htJ) {
            return ((C112442) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository", f = "ConfidentialVmRepository.kt", l = {571, 575}, m = "resolveEnrollmentStep", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$resolveEnrollmentStep$1, reason: invalid class name and case insensitive filesystem */
    public final class C112451 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C112451(HtJ<? super C112451> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmRepository.this.resolveEnrollmentStep(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository", f = "ConfidentialVmRepository.kt", l = {845}, m = "resolveRvKey", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$resolveRvKey$1, reason: invalid class name and case insensitive filesystem */
    public final class C112461 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C112461(HtJ<? super C112461> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmRepository.this.resolveRvKey(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository", f = "ConfidentialVmRepository.kt", l = {800}, m = "retryPendingPinUpdate", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$retryPendingPinUpdate$1, reason: invalid class name and case insensitive filesystem */
    public final class C112471 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C112471(HtJ<? super C112471> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmRepository.this.retryPendingPinUpdate(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository", f = "ConfidentialVmRepository.kt", l = {753, 763}, m = "sendPinUpdate", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$sendPinUpdate$1, reason: invalid class name and case insensitive filesystem */
    public final class C112481 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C112481(HtJ<? super C112481> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmRepository.this.sendPinUpdate(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository", f = "ConfidentialVmRepository.kt", l = {305}, m = "showRecoveryPinPrompt", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$showRecoveryPinPrompt$1, reason: invalid class name and case insensitive filesystem */
    public final class C112491 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C112491(HtJ<? super C112491> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmRepository.this.showRecoveryPinPrompt(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository", f = "ConfidentialVmRepository.kt", l = {957}, m = "submitReminderPin", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$submitReminderPin$1, reason: invalid class name and case insensitive filesystem */
    public final class C112501 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C112501(HtJ<? super C112501> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmRepository.this.submitReminderPin(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$submitReminderPin$2", f = "ConfidentialVmRepository.kt", l = {964}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$submitReminderPin$2, reason: invalid class name and case insensitive filesystem */
    public final class C112512 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ConfidentialVmPinReminderContext $context;
        public final /* synthetic */ boolean $hadWrongGuess;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112512(ConfidentialVmPinReminderContext confidentialVmPinReminderContext, boolean z, HtJ<? super C112512> htJ) {
            super(2, htJ);
            this.$context = confidentialVmPinReminderContext;
            this.$hadWrongGuess = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmRepository.this.new C112512(this.$context, this.$hadWrongGuess, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ConfidentialVmRepository confidentialVmRepository = ConfidentialVmRepository.this;
                ConfidentialVmPinReminderContext confidentialVmPinReminderContext = this.$context;
                boolean z = this.$hadWrongGuess;
                this.label = 1;
                if (confidentialVmRepository.confirmReminder(confidentialVmPinReminderContext, z, this) == enumC10460Hji) {
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
            return ((C112512) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository", f = "ConfidentialVmRepository.kt", l = {735}, m = "syncPinVerifier", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$syncPinVerifier$1, reason: invalid class name and case insensitive filesystem */
    public final class C112521 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C112521(HtJ<? super C112521> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfidentialVmRepository.this.syncPinVerifier(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$updatePinPreservingStoredSecret$2", f = "ConfidentialVmRepository.kt", l = {451, 453}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$updatePinPreservingStoredSecret$2, reason: invalid class name and case insensitive filesystem */
    public final class C112532 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ConfidentialVmEscrowResult>, Object> {
        public final /* synthetic */ String $pin;
        public Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ ConfidentialVmRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112532(String str, ConfidentialVmRepository confidentialVmRepository, HtJ<? super C112532> htJ) {
            super(2, htJ);
            this.$pin = str;
            this.this$0 = confidentialVmRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C112532(this.$pin, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String strNormalizeRecoveryPin;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                strNormalizeRecoveryPin = ConfidentialVmRepositoryKt.normalizeRecoveryPin(this.$pin);
                if (strNormalizeRecoveryPin != null) {
                    ConfidentialVmRepository confidentialVmRepository = this.this$0;
                    this.L$0 = strNormalizeRecoveryPin;
                    this.label = 1;
                    obj = confidentialVmRepository.getStoredSecretBytes(this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                return ConfidentialVmEscrowResult.Failure.INSTANCE;
            }
            if (i != 1) {
                if (i == 2) {
                    Hwg.A00(obj);
                }
                throw AnonymousClass001.A0n();
            }
            strNormalizeRecoveryPin = C3cG.A0d(this.L$0, obj);
            byte[] bArr = (byte[]) obj;
            if (bArr != null && bArr.length == 32) {
                ConfidentialVmRepository confidentialVmRepository2 = this.this$0;
                String str = this.$pin;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                obj = confidentialVmRepository2.overwriteVestaEscrow(bArr, strNormalizeRecoveryPin, str, this);
                return obj == enumC10460Hji ? enumC10460Hji : obj;
            }
            return ConfidentialVmEscrowResult.Failure.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ConfidentialVmEscrowResult> htJ) {
            return ((C112532) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$verifyPinLocally$2", f = "ConfidentialVmRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$verifyPinLocally$2, reason: invalid class name and case insensitive filesystem */
    public final class C112542 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $pin;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112542(String str, HtJ<? super C112542> htJ) {
            super(2, htJ);
            this.$pin = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmRepository.this.new C112542(this.$pin, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean zIsEqual;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            try {
                A7A secretService = ConfidentialVmRepository.this.getSecretService();
                String str = this.$pin;
                zIsEqual = false;
                C7384Etj.A0Y(str, 0);
                A7D a7dA00 = A7K.A00(secretService.A00, "hatch_cvm_account_secret_pin_hash");
                if (a7dA00 != null) {
                    byte[] bArr = C9zv.A00;
                    try {
                        byte[] bArrDigest = MessageDigest.getInstance(ConfidentialVmPinVerifierCrypto.SHA_256).digest(C3cG.A1S(str));
                        C7384Etj.A0U(bArrDigest);
                        zIsEqual = MessageDigest.isEqual(a7dA00.A01, bArrDigest);
                    } catch (GeneralSecurityException e) {
                        throw new HatchCVMException("PIN hashing failed", e);
                    }
                }
            } catch (Exception e2) {
                CFK.A0K(ConfidentialVmRepository.TAG, e2, "verifyPinLocally: failed to read cached PIN hash");
                zIsEqual = false;
            }
            return Boolean.valueOf(zIsEqual);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C112542) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$verifyRecoveryPin$2", f = "ConfidentialVmRepository.kt", l = {498}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$verifyRecoveryPin$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes6.dex */
    public final class C112552 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ConfidentialVmVerifyResult>, Object> {
        public final /* synthetic */ String $pin;
        public Object L$0;
        public int label;
        public final /* synthetic */ ConfidentialVmRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112552(String str, ConfidentialVmRepository confidentialVmRepository, HtJ<? super C112552> htJ) {
            super(2, htJ);
            this.$pin = str;
            this.this$0 = confidentialVmRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C112552(this.$pin, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws JSONException, VestaClientException {
            byte[] bytes;
            C10543Hqv c10543HqvA0z;
            byte[] bArr;
            int iBeginLoginNative;
            byte[] bArrDecodeSecret;
            Object objAwaitResult = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objAwaitResult);
                String strNormalizeRecoveryPin = ConfidentialVmRepositoryKt.normalizeRecoveryPin(this.$pin);
                if (strNormalizeRecoveryPin != null) {
                    C10371HCv manager = AuraVestaManagerProvider.INSTANCE.getManager();
                    Hl3 hl3 = Hl3.A02;
                    String strA0j = BV5.A0j();
                    ACv aCv = new ACv();
                    C10367HCr c10367HCr = new C10367HCr(new HDA(manager.A01, manager.A02, VestaClient.getApiVersionNative()), hl3);
                    HD4 hd4 = new HD4(manager.A00);
                    LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = hd4.A01;
                    int i2 = hd4.A00;
                    lightweightQuickPerformanceLogger.markerStartWithCancelPolicy(536546360, false, i2, -1L, TimeUnit.NANOSECONDS);
                    lightweightQuickPerformanceLogger.markerAnnotate(536546360, i2, "use_case", "hatch");
                    String strValueOf = String.valueOf(false);
                    lightweightQuickPerformanceLogger.markerAnnotate(536546360, i2, "post_login_register_enabled", strValueOf);
                    lightweightQuickPerformanceLogger.markerAnnotate(536546360, i2, "pq_enabled", strValueOf);
                    lightweightQuickPerformanceLogger.markerAnnotate(536546360, i2, "pq_registration_enabled", strValueOf);
                    lightweightQuickPerformanceLogger.markerAnnotate(536546360, i2, "is_pq_registered", strValueOf);
                    C10365HCn c10365HCn = new C10365HCn(aCv, hd4, manager);
                    lightweightQuickPerformanceLogger.markerAnnotate(536546360, i2, "request_uuid", strA0j);
                    try {
                        Charset charsetForName = Charset.forName(HatchWebPageParserKt.UTF_8);
                        C7384Etj.A0U(charsetForName);
                        bytes = strNormalizeRecoveryPin.getBytes(charsetForName);
                        c10543HqvA0z = C3cG.A0z();
                        bArr = new byte[8192];
                        iBeginLoginNative = VestaClient.beginLoginNative(bytes, 1, bArr);
                    } catch (VestaClientException e) {
                        CFK.A08("VestaLoginModule", FGI.A0M("Unexpected Vesta client exception on beginLogin, error code: ", e.error.name()), e);
                        String strA0a = AnonymousClass007.A0a("VestaClientException: ", e.error);
                        AbstractC7610F5x.A1B(e, hd4);
                        C10365HCn.A00(HD2.A08, c10367HCr, c10365HCn, strA0a);
                    }
                    if (iBeginLoginNative != 0) {
                        throw new VestaClientException(iBeginLoginNative);
                    }
                    byte[][] nativeResults = VestaClient.parseNativeResults(bArr);
                    byte[] bArr2 = nativeResults[0];
                    byte[] bArr3 = nativeResults[1];
                    C7384Etj.A0T(bArr2);
                    C7384Etj.A0T(bArr3);
                    lightweightQuickPerformanceLogger.markerAnnotate(536546360, i2, "login_path", "legacy_only");
                    lightweightQuickPerformanceLogger.markerPoint(536546360, i2, "init_and_begin_login_vesta_client");
                    lightweightQuickPerformanceLogger.markerPoint(536546360, i2, "init_and_begin_login_network_start");
                    lightweightQuickPerformanceLogger.markerAnnotate(536546360, i2, "init_and_begin_login_network_start", "debug_logging_begin");
                    HDA hda = c10367HCr.A02;
                    String str = c10367HCr.A03.useCaseName;
                    C10372HCw c10372HCw = new C10372HCw(hd4, c10367HCr, c10365HCn, strA0j, c10543HqvA0z, bArr3, bytes);
                    C7384Etj.A0Y(str, 0);
                    String strEncodeToString = Base64.encodeToString(bArr2, 8);
                    C7384Etj.A0U(strEncodeToString);
                    Integer numValueOf = Integer.valueOf(hda.A00);
                    Hqz hqz = hda.A01;
                    HDE hde = new HDE(c10372HCw, hda);
                    Executor executor = hda.A02;
                    C9767GfL c9767GfL = C9767GfL.A00;
                    JSONObject jSONObjectA18 = BV4.A18();
                    jSONObjectA18.put("base64url_encoded_opaque_l1", strEncodeToString);
                    C9767GfL.A00(numValueOf, 1, strA0j, jSONObjectA18);
                    hqz.A00.post("/hatch/vesta-auth/begin-login", C3cG.A1S(C60O.A0o(jSONObjectA18)), new C10362HCh("BEGIN LOGIN", new C8838Fqo(c9767GfL, 24), new C8838Fqo(hde, 26), new C8838Fqo(hde, 25)), executor);
                    this.L$0 = null;
                    this.label = 1;
                    objAwaitResult = ConfidentialVmRepositoryKt.awaitResult(aCv, this);
                    if (objAwaitResult == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                return ConfidentialVmVerifyResult.Failure.INSTANCE;
            }
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(objAwaitResult);
            Hrl hrl = (Hrl) objAwaitResult;
            if (hrl instanceof HD6) {
                this.this$0.vestaRegistrationResolver.markRegistered();
                String str2 = ((HD6) hrl).A00;
                if (str2 != null && (bArrDecodeSecret = this.this$0.decodeSecret(str2)) != null && this.this$0.persistEnrollment(bArrDecodeSecret, this.$pin)) {
                    return ConfidentialVmVerifyResult.Success.INSTANCE;
                }
            } else {
                if (hrl instanceof ADB) {
                    return this.this$0.toVerifyResult((ADB) hrl);
                }
                if (hrl != null) {
                    throw C3cG.A0q();
                }
            }
            return ConfidentialVmVerifyResult.Failure.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ConfidentialVmVerifyResult> htJ) {
            return ((C112552) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ConfidentialVmRepository(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        this.secretStore$delegate = AbstractC5321DgF.A03(new ConfidentialVmRepository$secretStore$2(this));
        this.secretService$delegate = AbstractC5321DgF.A03(new ConfidentialVmRepository$secretService$2(this));
        this.vestaRegistrationResolver = new ConfidentialVmVestaRegistrationResolver(new ConfidentialVmRepository$vestaRegistrationResolver$1(this));
        C9286GCn c9286GCnA14 = C3cG.A14(false);
        this._recoveryPinPromptVisible = c9286GCnA14;
        this.recoveryPinPromptVisible = C3cG.A11(c9286GCnA14);
        C9286GCn c9286GCnA142 = C3cG.A14(false);
        this._supportInvestigatingVisible = c9286GCnA142;
        this.supportInvestigatingVisible = C3cG.A11(c9286GCnA142);
        this.pinStateStore = new ConfidentialVmPinStateStore(abstractC3358CGz);
        this.loggedReminderPromptId = new AtomicReference<>(null);
        this.applyingSnapshots = C60O.A1C();
        this.wrongGuessReminderId = new AtomicReference<>(null);
        this.writeScope = C78T.A01(C3cG.A0v(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] decodeSecret(String str) {
        try {
            C7384Etj.A0Y(str, 0);
            byte[] bArrDecode = Base64.decode(str.replace('-', '+').replace('_', '/'), 2);
            if (bArrDecode.length == 32) {
                return bArrDecode;
            }
            return null;
        } catch (IllegalArgumentException e) {
            CFK.A0K(TAG, e, "decodeSecret: malformed recovery secret");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasInterruptedCause(Throwable th) {
        int i = 0;
        while (!(th instanceof InterruptedException)) {
            if (th == null || (th = th.getCause()) == null || (i = i + 1) >= 16) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* renamed from: mintSshAccessTokens-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m446mintSshAccessTokensgIAlus(java.lang.String r14, X.HtJ<? super X.HsJ<com.facebook.aura.network.notary.MintedNotaryTokens>> r15) {
        /*
            r13 = this;
            r3 = r15
            boolean r0 = r15 instanceof com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$mintSshAccessTokens$1
            if (r0 == 0) goto L64
            r15 = r3
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$mintSshAccessTokens$1 r15 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$mintSshAccessTokens$1) r15
            int r2 = r15.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L64
            int r2 = r2 - r1
            r15.label = r2
        L13:
            java.lang.Object r1 = r15.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r15.label
            r11 = 1
            if (r0 == 0) goto L2f
            if (r0 != r11) goto L6a
            java.lang.Object r1 = X.AnonymousClass001.A0q(r1)
        L22:
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L2e
            com.facebook.aura.confidentialvm.repository.MintSshAccessTokensResponseJson r1 = (com.facebook.aura.confidentialvm.repository.MintSshAccessTokensResponseJson) r1
            com.facebook.aura.network.notary.MintedNotaryTokens r1 = r1.toDomain()
        L2e:
            return r1
        L2f:
            com.facebook.aura.network.http.HatchHttpApi r3 = X.C60O.A06(r1)
            java.lang.String r0 = "https://api.muse.ai/ssh-access/tokens"
            com.facebook.aura.network.api.StefiHatchPath$Raw r7 = new com.facebook.aura.network.api.StefiHatchPath$Raw
            r7.<init>(r0)
            com.facebook.aura.confidentialvm.repository.MintSshAccessTokensRequestJson r8 = new com.facebook.aura.confidentialvm.repository.MintSshAccessTokensRequestJson
            r8.<init>(r14)
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.POST
            X.9jH r10 = X.C9jH.A00
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$mintSshAccessTokens-gIAlu-s$$inlined$executeStefiRequest-tZkwj4A$default$1 r4 = com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$mintSshAccessTokensgIAlus$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$mintSshAccessTokens-gIAlu-s$$inlined$executeStefiRequest-tZkwj4A$default$2 r5 = com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$mintSshAccessTokensgIAlus$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE
            r6 = 0
            r12 = 0
            r15.L$0 = r12
            r15.L$1 = r12
            r15.L$2 = r12
            r15.L$3 = r12
            r15.L$4 = r12
            r15.L$5 = r12
            r15.I$0 = r11
            r15.I$1 = r6
            r15.label = r11
            r13 = r6
            r14 = r12
            java.lang.Object r1 = r3.m1604executeStefiRequestWithjLovISM(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r1 != r2) goto L22
            return r2
        L64:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$mintSshAccessTokens$1 r15 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$mintSshAccessTokens$1
            r15.<init>(r13, r3)
            goto L13
        L6a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.m446mintSshAccessTokensgIAlus(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final void applyOperatorSshStatus(JsonObject jsonObject) {
        BLG<Boolean> blg;
        boolean z;
        C7384Etj.A0Y(jsonObject, 0);
        int iOptInt = JsonObjectExtensionsKt.optInt(jsonObject, AuraDeeplinkRouteMapper.STATUS_ROUTE, 0);
        if (iOptInt == 1) {
            blg = this._supportInvestigatingVisible;
            z = false;
        } else if (iOptInt != 2) {
            CFK.A06(TAG, FGI.A0H("applyOperatorSshStatus: ignoring unknown status=", iOptInt));
            return;
        } else {
            blg = this._supportInvestigatingVisible;
            z = true;
        }
        AnonymousClass002.A1I(blg, z);
    }

    public final void applyPinSnapshotAsync(JsonObject jsonObject) {
        C7384Etj.A0Y(jsonObject, 0);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C112211(jsonObject, this, null), this.writeScope);
    }

    public final void dismissRecoveryPinPrompt() {
        this.pinReminderContext = null;
        AnonymousClass003.A14(this._recoveryPinPromptVisible, false);
    }

    /* loaded from: classes.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ConfidentialVmVestaRegistration.values().length];
            try {
                AnonymousClass005.A0v(ConfidentialVmVestaRegistration.REGISTERED, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(ConfidentialVmVestaRegistration.UNAVAILABLE, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(ConfidentialVmVestaRegistration.NOT_REGISTERED, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ConfidentialVmStoredEnrollment.values().length];
            try {
                AnonymousClass005.A0v(ConfidentialVmStoredEnrollment.STORED, iArr2, 1);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass005.A0v(ConfidentialVmStoredEnrollment.UNAVAILABLE, iArr2, 2);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass005.A0v(ConfidentialVmStoredEnrollment.NOT_STORED, iArr2, 3);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ConfidentialVmPinStateApplyResult.values().length];
            try {
                AnonymousClass005.A0v(ConfidentialVmPinStateApplyResult.APPLIED, iArr3, 1);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass005.A0v(ConfidentialVmPinStateApplyResult.IGNORED_LOWER_REVISION, iArr3, 2);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass005.A0v(ConfidentialVmPinStateApplyResult.IDEMPOTENT, iArr3, 3);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass002.A16(ConfidentialVmPinStateApplyResult.STORAGE_FAILURE, iArr3);
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object applyAuthenticatedSnapshot(com.facebook.aura.confidentialvm.repository.ConfidentialVmPinState r8, X.HtJ<? super com.facebook.aura.confidentialvm.repository.ConfidentialVmPinSnapshotResult> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.AnonymousClass1
            if (r0 == 0) goto L3a
            r6 = r9
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$applyAuthenticatedSnapshot$1 r6 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r5 = r6.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L2c
            if (r0 != r4) goto L8b
            java.lang.Object r8 = r6.L$0
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinState r8 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmPinState) r8
            X.Hwg.A00(r5)
        L25:
            byte[] r5 = (byte[]) r5
            if (r5 != 0) goto L40
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinSnapshotResult r1 = com.facebook.aura.confidentialvm.repository.ConfidentialVmPinSnapshotResult.MISSING_SECRET
            return r1
        L2c:
            X.Hwg.A00(r5)
            r6.L$0 = r8
            r6.label = r4
            java.lang.Object r5 = r7.getStoredSecretBytes(r6)
            if (r5 != r1) goto L25
            return r1
        L3a:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$applyAuthenticatedSnapshot$1 r6 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$applyAuthenticatedSnapshot$1
            r6.<init>(r9)
            goto L12
        L40:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto r2 = com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto.INSTANCE     // Catch: java.lang.Throwable -> L86
            byte[] r1 = r2.deriveKey(r5)     // Catch: java.lang.Throwable -> L86
            X.C8j3.A1L(r5)
            java.lang.String r0 = r8.encryptedPinVerifier     // Catch: java.lang.Throwable -> L81
            boolean r0 = r2.authenticates(r1, r0)     // Catch: java.lang.Throwable -> L81
            X.C8j3.A1L(r1)
            if (r0 != 0) goto L57
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinSnapshotResult r1 = com.facebook.aura.confidentialvm.repository.ConfidentialVmPinSnapshotResult.AUTHENTICATION_FAILED
            return r1
        L57:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinStateStore r0 = r7.pinStateStore
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinStateApplyResult r0 = r0.applySnapshot(r8)
            int r1 = r0.ordinal()
            if (r1 == r3) goto L79
            if (r1 == r4) goto L76
            r0 = 2
            if (r1 == r0) goto L73
            r0 = 3
            if (r1 != r0) goto L6e
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinSnapshotResult r1 = com.facebook.aura.confidentialvm.repository.ConfidentialVmPinSnapshotResult.STORAGE_FAILURE
            return r1
        L6e:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L73:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinSnapshotResult r1 = com.facebook.aura.confidentialvm.repository.ConfidentialVmPinSnapshotResult.IDEMPOTENT
            return r1
        L76:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinSnapshotResult r1 = com.facebook.aura.confidentialvm.repository.ConfidentialVmPinSnapshotResult.IGNORED_LOWER_REVISION
            return r1
        L79:
            long r0 = r8.stateRevision
            r7.dismissSupersededReminder(r0)
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinSnapshotResult r1 = com.facebook.aura.confidentialvm.repository.ConfidentialVmPinSnapshotResult.APPLIED
            return r1
        L81:
            r0 = move-exception
            X.C8j3.A1L(r1)
            throw r0
        L86:
            r0 = move-exception
            X.C8j3.A1L(r5)
            throw r0
        L8b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.applyAuthenticatedSnapshot(com.facebook.aura.confidentialvm.repository.ConfidentialVmPinState, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitMatchingPinState(com.facebook.aura.confidentialvm.repository.ConfidentialVmPinReminderContext r7, long r8, X.HtJ<? super java.lang.Boolean> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112221
            if (r0 == 0) goto L62
            r5 = r10
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$awaitMatchingPinState$1 r5 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112221) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L62
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L3c
            if (r0 != r3) goto L68
            java.lang.Object r7 = r5.L$0
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinReminderContext r7 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmPinReminderContext) r7
            X.Hwg.A00(r1)
        L24:
            boolean r0 = r6.matchesStoredPinState(r7)
            if (r0 != 0) goto L6d
            long r1 = r7.stateRevision
            java.lang.String r0 = "onPinReminder: no state for revision="
            java.lang.String r1 = X.FGI.A0B(r1, r0)
            java.lang.String r0 = "ConfidentialVmRepository"
            X.CFK.A06(r0, r1)
            java.lang.Boolean r4 = X.AnonymousClass001.A0h()
            return r4
        L3c:
            X.Hwg.A00(r1)
            boolean r0 = r6.matchesStoredPinState(r7)
            if (r0 != 0) goto L6d
            long r1 = r7.stateRevision
            java.lang.String r0 = r7.updateId
            java.lang.String r2 = com.facebook.aura.confidentialvm.repository.ConfidentialVmRepositoryKt.pinSnapshotKey(r1, r0)
            r1 = 0
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$awaitMatchingPinState$2 r0 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$awaitMatchingPinState$2
            r0.<init>(r7, r2, r1)
            r5.L$0 = r7
            r5.L$1 = r1
            r5.J$0 = r8
            r5.label = r3
            java.lang.Object r0 = X.GAX.A01(r5, r0, r8)
            if (r0 != r4) goto L24
            return r4
        L62:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$awaitMatchingPinState$1 r5 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$awaitMatchingPinState$1
            r5.<init>(r10)
            goto L12
        L68:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L6d:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.awaitMatchingPinState(com.facebook.aura.confidentialvm.repository.ConfidentialVmPinReminderContext, long, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object confirmReminder(com.facebook.aura.confidentialvm.repository.ConfidentialVmPinReminderContext r32, boolean r33, X.HtJ<? super kotlin.Unit> r34) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.confirmReminder(com.facebook.aura.confidentialvm.repository.ConfidentialVmPinReminderContext, boolean, X.HtJ):java.lang.Object");
    }

    private final void dismissSupersededReminder(long j) {
        ConfidentialVmPinReminderContext confidentialVmPinReminderContext = this.pinReminderContext;
        if (confidentialVmPinReminderContext == null || j <= confidentialVmPinReminderContext.stateRevision) {
            return;
        }
        dismissRecoveryPinPrompt();
    }

    /* renamed from: executeOperatorSshRequest-0E7RQCE, reason: not valid java name */
    private final /* synthetic */ <Res> Object m445executeOperatorSshRequest0E7RQCE(JarvisPath jarvisPath, RequestType requestType, HtJ<? super HsJ<? extends Res>> htJ) {
        Throwable thA00 = HsJ.A00(((HsJ) m447operatorSshAuthorization0E7RQCE(HatchNotaryTokenCache.Companion.getInstance(this.userSession), jarvisPath, htJ)).value);
        if (thA00 != null) {
            return C3cG.A0s(thA00);
        }
        C7384Etj.A0P();
        throw F60.createAndThrow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchVestaRegistration(X.HtJ<? super com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112321
            if (r0 == 0) goto L33
            r4 = r6
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$fetchVestaRegistration$1 r4 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112321) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L33
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L27
            if (r1 != r0) goto L43
            X.Hwg.A00(r3)
        L20:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaUserInfoResponseJson r3 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaUserInfoResponseJson) r3
            if (r3 != 0) goto L39
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration r2 = com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration.UNAVAILABLE
            return r2
        L27:
            X.Hwg.A00(r3)
            r4.label = r0
            java.lang.Object r3 = r5.fetchUserInfo(r4)
            if (r3 != r2) goto L20
            return r2
        L33:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$fetchVestaRegistration$1 r4 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$fetchVestaRegistration$1
            r4.<init>(r6)
            goto L12
        L39:
            boolean r0 = r3.is_registered
            if (r0 == 0) goto L40
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration r2 = com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration.REGISTERED
            return r2
        L40:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration r2 = com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration.NOT_REGISTERED
            return r2
        L43:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.fetchVestaRegistration(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] generateSecret() {
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final A7A getSecretService() {
        return (A7A) this.secretService$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final A7K getSecretStore() {
        return (A7K) this.secretStore$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDeviceLocked() {
        KeyguardManager keyguardManager;
        Context context = AuraAppContext.INSTANCE.getContext();
        return (context == null || (keyguardManager = (KeyguardManager) context.getSystemService(KeyguardManager.class)) == null || !keyguardManager.isDeviceLocked()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object isRecoveryPinPromptEligible(X.HtJ<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112371
            if (r0 == 0) goto L50
            r5 = r7
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$isRecoveryPinPromptEligible$1 r5 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112371) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r0 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r3 = 2
            r2 = 1
            if (r1 == 0) goto L24
            if (r1 == r2) goto L3e
            if (r1 != r3) goto L56
            X.Hwg.A00(r0)
        L23:
            return r0
        L24:
            X.Hwg.A00(r0)
            com.facebook.aura.confidentialvm.session.ConfidentialSessionGate$Companion r1 = com.facebook.aura.confidentialvm.session.ConfidentialSessionGate.Companion
            X.CGz r0 = r6.userSession
            com.facebook.aura.confidentialvm.session.ConfidentialSessionGate r0 = r1.getInstance(r0)
            boolean r0 = r0.isConfidentialVm()
            if (r0 == 0) goto L5b
            r5.label = r2
            java.lang.Object r0 = r6.hasStoredSecret(r5)
            if (r0 != r4) goto L41
            return r4
        L3e:
            X.Hwg.A00(r0)
        L41:
            boolean r0 = X.AnonymousClass001.A1X(r0)
            if (r0 == 0) goto L5b
            r5.label = r3
            java.lang.Object r0 = r6.hasStoredPinHash(r5)
            if (r0 != r4) goto L23
            return r4
        L50:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$isRecoveryPinPromptEligible$1 r5 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$isRecoveryPinPromptEligible$1
            r5.<init>(r7)
            goto L12
        L56:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L5b:
            java.lang.Boolean r0 = X.AnonymousClass001.A0h()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.isRecoveryPinPromptEligible(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean matchesStoredPinState(ConfidentialVmPinReminderContext confidentialVmPinReminderContext) {
        ConfidentialVmPinState confidentialVmPinState = this.pinStateStore.read();
        if (confidentialVmPinState == null || confidentialVmPinState.stateRevision != confidentialVmPinReminderContext.stateRevision) {
            return false;
        }
        return C8j3.A1W(confidentialVmPinState.updateId, confidentialVmPinReminderContext.updateId, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* renamed from: operatorSshAuthorization-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m447operatorSshAuthorization0E7RQCE(com.facebook.aura.network.notary.HatchNotaryTokenCache r6, com.facebook.aura.network.api.JarvisPath r7, X.HtJ<? super X.HsJ<com.facebook.aura.network.notary.NotaryAuthorization>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$operatorSshAuthorization$1
            if (r0 == 0) goto L3a
            r4 = r8
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$operatorSshAuthorization$1 r4 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$operatorSshAuthorization$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L22
            if (r0 != r2) goto L40
            java.lang.Object r0 = X.AnonymousClass001.A0q(r1)
        L21:
            return r0
        L22:
            X.Hwg.A00(r1)
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$operatorSshAuthorization$2 r1 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$operatorSshAuthorization$2
            r1.<init>(r5)
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.label = r2
            java.lang.String r0 = "https://api.muse.ai/ssh-access/tokens"
            java.lang.Object r0 = r6.m1608authorizationHeaderBWLJW6A(r0, r7, r1, r4)
            if (r0 != r3) goto L21
            return r3
        L3a:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$operatorSshAuthorization$1 r4 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$operatorSshAuthorization$1
            r4.<init>(r5, r8)
            goto L12
        L40:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.m447operatorSshAuthorization0E7RQCE(com.facebook.aura.network.notary.HatchNotaryTokenCache, com.facebook.aura.network.api.JarvisPath, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object overwriteVestaEscrow(byte[] r13, java.lang.String r14, java.lang.String r15, X.HtJ<? super com.facebook.aura.confidentialvm.repository.ConfidentialVmEscrowResult> r16) {
        /*
            r12 = this;
            r4 = r16
            r9 = r14
            boolean r0 = r4 instanceof com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112391
            if (r0 == 0) goto L93
            r3 = r4
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$overwriteVestaEscrow$1 r3 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112391) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L93
            int r2 = r2 - r1
            r3.label = r2
        L15:
            java.lang.Object r0 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r4 = r3.label
            r5 = 1
            r1 = 2
            if (r4 == 0) goto L29
            if (r4 == r5) goto L61
            if (r4 != r1) goto L9a
            X.Hwg.A00(r0)
        L26:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmEscrowResult$Success r0 = com.facebook.aura.confidentialvm.repository.ConfidentialVmEscrowResult.Success.INSTANCE
            return r0
        L29:
            X.Hwg.A00(r0)
            java.lang.String r10 = android.util.Base64.encodeToString(r13, r1)
            X.F0C r0 = com.facebook.aura.confidentialvm.network.AuraVestaManagerProvider.manager$delegate
            java.lang.Object r6 = r0.getValue()
            X.HCv r6 = (X.C10371HCv) r6
            X.CGz r0 = r12.userSession
            X.CH0 r0 = (X.CH0) r0
            java.lang.String r8 = r0.A01
            X.C7384Etj.A0X(r10)
            X.Hl3 r7 = X.Hl3.A02
            java.util.UUID r0 = X.AbstractC7535F0i.A00()
            java.lang.String r11 = r0.toString()
            r4 = 0
            X.ACv r0 = r6.A00(r7, r8, r9, r10, r11)
            r3.L$0 = r13
            r3.L$1 = r14
            r3.L$2 = r15
            r3.L$3 = r4
            r3.label = r5
            java.lang.Object r0 = com.facebook.aura.confidentialvm.repository.ConfidentialVmRepositoryKt.awaitResult(r0, r3)
            if (r0 != r2) goto L70
            return r2
        L61:
            java.lang.Object r15 = r3.L$2
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r9 = r3.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r13 = r3.L$0
            byte[] r13 = (byte[]) r13
            X.Hwg.A00(r0)
        L70:
            boolean r0 = r0 instanceof X.ADV
            if (r0 == 0) goto L9f
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistrationResolver r0 = r12.vestaRegistrationResolver
            r0.markRegistered()
            boolean r0 = r12.persistEnrollment(r13, r15)
            if (r0 == 0) goto L9f
            r0 = 0
            r3.L$0 = r0
            r3.L$1 = r0
            r3.L$2 = r0
            r3.L$3 = r0
            r3.L$4 = r0
            r3.label = r1
            java.lang.Object r0 = r12.syncPinVerifier(r13, r9, r3)
            if (r0 != r2) goto L26
            return r2
        L93:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$overwriteVestaEscrow$1 r3 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$overwriteVestaEscrow$1
            r3.<init>(r4)
            goto L15
        L9a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L9f:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmEscrowResult$Failure r0 = com.facebook.aura.confidentialvm.repository.ConfidentialVmEscrowResult.Failure.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.overwriteVestaEscrow(byte[], java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean persistEnrollment(byte[] bArr, String str) {
        try {
            A7K secretStore = getSecretStore();
            C7384Etj.A0Y(bArr, 0);
            A7K.A02(secretStore, "hatch_cvm_account_secret", bArr);
            try {
                A7A secretService = getSecretService();
                C7384Etj.A0Y(str, 0);
                A7K a7k = secretService.A00;
                byte[] bArr2 = C9zv.A00;
                try {
                    byte[] bArrDigest = MessageDigest.getInstance(ConfidentialVmPinVerifierCrypto.SHA_256).digest(C3cG.A1S(str));
                    C7384Etj.A0U(bArrDigest);
                    A7K.A02(a7k, "hatch_cvm_account_secret_pin_hash", bArrDigest);
                    return true;
                } catch (GeneralSecurityException e) {
                    throw new HatchCVMException("PIN hashing failed", e);
                }
            } catch (Exception e2) {
                CFK.A0K(TAG, e2, "persistEnrollment: failed to cache optional PIN hash");
                return true;
            }
        } catch (Exception e3) {
            CFK.A0K(TAG, e3, "persistEnrollment: failed to cache account secret");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object postPinUpdate(com.facebook.aura.confidentialvm.repository.PinUpdateRequestJson r27, X.HtJ<? super com.facebook.aura.confidentialvm.repository.ConfidentialVmPinMutationOutcome> r28) {
        /*
            r26 = this;
            r3 = r28
            boolean r0 = r3 instanceof com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112401
            r5 = r26
            if (r0 == 0) goto L85
            r4 = r3
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$postPinUpdate$1 r4 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112401) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L85
            int r2 = r2 - r1
            r4.label = r2
        L16:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 != r1) goto L8b
            java.lang.Object r0 = X.AnonymousClass001.A0q(r3)
        L25:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinMutationOutcome r2 = com.facebook.aura.confidentialvm.repository.ConfidentialVmPinReminderJsonKt.toPinMutationOutcome(r0)
            return r2
        L2a:
            X.Hwg.A00(r3)
            com.facebook.aura.network.http.HatchHttpApi r6 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.confidentialvm.repository.ConfidentialVmJarvisPath$PinReminderUpdate r10 = com.facebook.aura.confidentialvm.repository.ConfidentialVmJarvisPath.PinReminderUpdate.INSTANCE
            com.facebook.aura.network.http.RequestType r12 = com.facebook.aura.network.http.RequestType.POST
            X.CGz r13 = r5.userSession
            r9 = 0
            X.HxE[] r0 = new X.HxE[r9]
            java.util.Set r17 = X.AnonymousClass004.A18()
            X.9jH r20 = X.C9jH.A00
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$postPinUpdate$$inlined$executeJarvisRequest-Z6QaZII$default$1 r7 = com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$postPinUpdate$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$postPinUpdate$$inlined$executeJarvisRequest-Z6QaZII$default$2 r8 = com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$postPinUpdate$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r14 = 0
            r4.L$0 = r14
            r4.L$1 = r14
            r4.L$2 = r14
            r4.L$3 = r14
            r4.L$4 = r14
            r4.L$5 = r14
            r4.L$6 = r14
            r4.L$7 = r14
            r4.L$8 = r14
            r4.I$0 = r1
            r4.I$1 = r1
            r4.I$2 = r9
            r4.I$3 = r1
            r4.I$4 = r9
            r4.I$5 = r9
            r4.I$6 = r9
            r4.label = r1
            r11 = r27
            r15 = r14
            r19 = r1
            r21 = r14
            r22 = r9
            r23 = r1
            r24 = r9
            r25 = r9
            r26 = r14
            r27 = r9
            r28 = r4
            r18 = r1
            r16 = r0
            java.lang.Object r0 = r6.m1599executeJarvisRequestWithFof5HsY(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            if (r0 != r2) goto L25
            return r2
        L85:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$postPinUpdate$1 r4 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$postPinUpdate$1
            r4.<init>(r3)
            goto L16
        L8b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.postPinUpdate(com.facebook.aura.confidentialvm.repository.PinUpdateRequestJson, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object retryPendingPinUpdate(X.HtJ<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            java.lang.String r7 = "retryPendingPinUpdate: re-sending update_id="
            boolean r0 = r9 instanceof com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112471
            if (r0 == 0) goto L26
            r6 = r9
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$retryPendingPinUpdate$1 r6 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112471) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r6.label = r2
        L14:
            java.lang.Object r5 = r6.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r6.label
            java.lang.String r3 = "ConfidentialVmRepository"
            r2 = 1
            if (r0 == 0) goto L35
            if (r0 != r2) goto L30
            java.lang.Object r1 = r6.L$0
            com.facebook.aura.confidentialvm.repository.PinUpdateRequestJson r1 = (com.facebook.aura.confidentialvm.repository.PinUpdateRequestJson) r1
            goto L2c
        L26:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$retryPendingPinUpdate$1 r6 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$retryPendingPinUpdate$1
            r6.<init>(r9)
            goto L14
        L2c:
            X.Hwg.A00(r5)     // Catch: java.util.concurrent.CancellationException -> L52 java.lang.Exception -> L54
            goto L60
        L30:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L35:
            X.Hwg.A00(r5)
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinStateStore r0 = r8.pinStateStore
            com.facebook.aura.confidentialvm.repository.PinUpdateRequestJson r1 = r0.readPendingUpdate()
            if (r1 == 0) goto L60
            java.lang.String r0 = r1.update_id     // Catch: java.util.concurrent.CancellationException -> L52 java.lang.Exception -> L54
            X.C3cG.A1G(r7, r0, r3)     // Catch: java.util.concurrent.CancellationException -> L52 java.lang.Exception -> L54
            java.lang.String r0 = "retryPendingPinUpdate"
            r6.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L52 java.lang.Exception -> L54
            r6.label = r2     // Catch: java.util.concurrent.CancellationException -> L52 java.lang.Exception -> L54
            java.lang.Object r0 = r8.sendPinUpdate(r1, r0, r6)     // Catch: java.util.concurrent.CancellationException -> L52 java.lang.Exception -> L54
            if (r0 != r4) goto L60
            return r4
        L52:
            r0 = move-exception
            throw r0
        L54:
            r2 = move-exception
            java.lang.String r1 = r1.update_id
            java.lang.String r0 = "retryPendingPinUpdate: replay threw for update_id="
            java.lang.String r0 = X.FGI.A0M(r0, r1)
            X.CFK.A0K(r3, r2, r0)
        L60:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.retryPendingPinUpdate(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendPinUpdate(com.facebook.aura.confidentialvm.repository.PinUpdateRequestJson r8, java.lang.String r9, X.HtJ<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.sendPinUpdate(com.facebook.aura.confidentialvm.repository.PinUpdateRequestJson, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object syncPinVerifier(byte[] r12, java.lang.String r13, X.HtJ<? super kotlin.Unit> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112521
            if (r0 == 0) goto L1e
            r2 = r14
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$syncPinVerifier$1 r2 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112521) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L1e
            int r3 = r3 - r1
            r2.label = r3
        L12:
            java.lang.Object r4 = r2.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r2.label
            r3 = 1
            if (r0 == 0) goto L2d
            if (r0 != r3) goto L28
            goto L24
        L1e:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$syncPinVerifier$1 r2 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$syncPinVerifier$1
            r2.<init>(r14)
            goto L12
        L24:
            X.Hwg.A00(r4)     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            goto L81
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r4)
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto r0 = com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto.INSTANCE     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            byte[] r5 = r0.deriveKey(r12)     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            java.lang.String r8 = r0.seal(r5, r13)     // Catch: java.lang.Throwable -> L74
            r4 = 0
            r7 = r4
            X.C8j3.A1L(r5)     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            java.util.UUID r0 = X.AbstractC7535F0i.A00()     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinStateStore r0 = r11.pinStateStore     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinState r0 = r0.read()     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            if (r0 == 0) goto L51
            java.lang.String r7 = r0.updateId     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
        L51:
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            com.facebook.aura.confidentialvm.repository.PinUpdateRequestJson r5 = new com.facebook.aura.confidentialvm.repository.PinUpdateRequestJson     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            r5.<init>(r6, r7, r8, r9)     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinStateStore r0 = r11.pinStateStore     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            r0.writePendingUpdate(r5)     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            java.lang.String r0 = "syncPinVerifier"
            r2.L$0 = r4     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            r2.L$1 = r4     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            r2.L$2 = r4     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            r2.L$3 = r4     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            r2.L$4 = r4     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            r2.label = r3     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            java.lang.Object r0 = r11.sendPinUpdate(r5, r0, r2)     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            if (r0 != r1) goto L81
            return r1
        L74:
            r0 = move-exception
            X.C8j4.A1T(r5)     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
            throw r0     // Catch: java.lang.Exception -> L79 java.util.concurrent.CancellationException -> L84
        L79:
            r2 = move-exception
            java.lang.String r1 = "syncPinVerifier: could not sync the PIN verifier"
            java.lang.String r0 = "ConfidentialVmRepository"
            X.CFK.A0K(r0, r2, r1)
        L81:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L84:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.syncPinVerifier(byte[], java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConfidentialVmVerifyResult toVerifyResult(ADB adb) {
        ConfidentialVmVerifyResult confidentialVmVerifyResult;
        ConfidentialVmVerifyResult wrongPin;
        Integer num;
        Integer num2;
        EnumC10364HCl enumC10364HCl = adb.A00;
        boolean z = false;
        if (enumC10364HCl == EnumC10364HCl.A08) {
            num = adb.A02;
            num2 = adb.A01;
        } else {
            EnumC10364HCl enumC10364HCl2 = EnumC10364HCl.A05;
            if (enumC10364HCl != enumC10364HCl2 || (num = adb.A02) == null || num.intValue() <= 0) {
                if (enumC10364HCl == EnumC10364HCl.A03) {
                    confidentialVmVerifyResult = ConfidentialVmVerifyResult.PermanentlyLocked.INSTANCE;
                } else {
                    if (enumC10364HCl == enumC10364HCl2) {
                        wrongPin = new ConfidentialVmVerifyResult.WrongPin(adb.A01);
                        return wrongPin;
                    }
                    confidentialVmVerifyResult = ConfidentialVmVerifyResult.Failure.INSTANCE;
                }
                return confidentialVmVerifyResult;
            }
            num2 = adb.A01;
            z = true;
        }
        wrongPin = new ConfidentialVmVerifyResult.LockedOut(num, num2, z);
        return wrongPin;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object applyPinSnapshot(kotlinx.serialization.json.JsonObject r10, X.HtJ<? super com.facebook.aura.confidentialvm.repository.ConfidentialVmPinSnapshotResult> r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112201
            if (r0 == 0) goto L25
            r7 = r11
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$applyPinSnapshot$1 r7 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112201) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r3 = r7.result
            X.Hji r8 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r4 = 0
            r6 = 1
            if (r0 == 0) goto L30
            if (r0 != r6) goto L2b
            java.lang.Object r5 = r7.L$3
            X.Hsz r5 = (X.InterfaceC10560Hsz) r5
            java.lang.Object r2 = r7.L$2
            goto L64
        L25:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$applyPinSnapshot$1 r7 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$applyPinSnapshot$1
            r7.<init>(r11)
            goto L12
        L2b:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
            throw r1
        L30:
            X.Hwg.A00(r3)
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Exception -> L8c
            com.facebook.aura.confidentialvm.repository.PinStateJson$$serializer r0 = com.facebook.aura.confidentialvm.repository.PinStateJson$$serializer.INSTANCE     // Catch: java.lang.Exception -> L8c
            java.lang.Object r0 = r1.A01(r0, r10)     // Catch: java.lang.Exception -> L8c
            com.facebook.aura.confidentialvm.repository.PinStateJson r0 = (com.facebook.aura.confidentialvm.repository.PinStateJson) r0     // Catch: java.lang.Exception -> L8c
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinState r3 = com.facebook.aura.confidentialvm.repository.ConfidentialVmPinReminderJsonKt.toDomain(r0)     // Catch: java.lang.Exception -> L8c
            long r1 = r3.stateRevision
            java.lang.String r0 = r3.updateId
            java.lang.String r2 = com.facebook.aura.confidentialvm.repository.ConfidentialVmRepositoryKt.pinSnapshotKey(r1, r0)
            X.GAt r5 = new X.GAt
            r5.<init>(r4)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.Hsz<kotlin.Unit>> r0 = r9.applyingSnapshots
            r0.put(r2, r5)
            r7.L$0 = r4     // Catch: java.lang.Throwable -> L80
            r7.L$1 = r4     // Catch: java.lang.Throwable -> L80
            r7.L$2 = r2     // Catch: java.lang.Throwable -> L80
            r7.L$3 = r5     // Catch: java.lang.Throwable -> L80
            r7.label = r6     // Catch: java.lang.Throwable -> L80
            java.lang.Object r3 = r9.applyAuthenticatedSnapshot(r3, r7)     // Catch: java.lang.Throwable -> L80
            if (r3 != r8) goto L67
            return r8
        L64:
            X.Hwg.A00(r3)     // Catch: java.lang.Throwable -> L7e
        L67:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinSnapshotResult r3 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmPinSnapshotResult) r3     // Catch: java.lang.Throwable -> L7e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.Hsz<kotlin.Unit>> r0 = r9.applyingSnapshots
            r0.remove(r2, r5)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            X.C3cG.A1F(r5, r0)
            X.3UX r1 = r9.writeScope
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$applyPinSnapshot$2 r0 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$applyPinSnapshot$2
            r0.<init>(r4)
            X.AnonymousClass001.A1J(r0, r1)
            return r3
        L7e:
            r1 = move-exception
            goto L81
        L80:
            r1 = move-exception
        L81:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.Hsz<kotlin.Unit>> r0 = r9.applyingSnapshots
            r0.remove(r2, r5)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            X.C3cG.A1F(r5, r0)
            throw r1
        L8c:
            r2 = move-exception
            java.lang.String r1 = "applyPinSnapshot: undecodable pin.updated payload"
            java.lang.String r0 = "ConfidentialVmRepository"
            X.CFK.A0K(r0, r2, r1)
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinSnapshotResult r0 = com.facebook.aura.confidentialvm.repository.ConfidentialVmPinSnapshotResult.MALFORMED
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.applyPinSnapshot(kotlinx.serialization.json.JsonObject, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.vestaRegistrationResolver.close();
        Hxb.A03(null, this.writeScope);
        this.pinReminderContext = null;
        this.wrongGuessReminderId.set(null);
        BLG<Boolean> blg = this._recoveryPinPromptVisible;
        Boolean boolA0h = AnonymousClass001.A0h();
        AnonymousClass001.A1E(blg, null, boolA0h);
        AnonymousClass001.A1E(this._supportInvestigatingVisible, null, boolA0h);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* renamed from: disableOperatorSsh-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m449disableOperatorSshIoAF18A(X.HtJ<? super X.HsJ<kotlin.Unit>> r31) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.m449disableOperatorSshIoAF18A(X.HtJ):java.lang.Object");
    }

    public final void dismissSupportInvestigating() {
        AnonymousClass004.A1D(false, this._supportInvestigatingVisible);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* renamed from: enableOperatorSsh-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m450enableOperatorSshIoAF18A(X.HtJ<? super X.HsJ<kotlin.Unit>> r31) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.m450enableOperatorSshIoAF18A(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchLoginState(X.HtJ<? super com.facebook.aura.confidentialvm.repository.ConfidentialVmLoginState> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112301
            if (r0 == 0) goto L3a
            r4 = r6
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$fetchLoginState$1 r4 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112301) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L42
            X.Hwg.A00(r3)
        L20:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaUserInfoResponseJson r3 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaUserInfoResponseJson) r3
            if (r3 == 0) goto L40
            java.lang.Integer r2 = r3.attempts_remaining
            java.lang.Integer r1 = r3.login_timeout_remaining_secs
            com.facebook.aura.confidentialvm.repository.ConfidentialVmLoginState r0 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmLoginState
            r0.<init>(r2, r1)
            return r0
        L2e:
            X.Hwg.A00(r3)
            r4.label = r0
            java.lang.Object r3 = r5.fetchUserInfo(r4)
            if (r3 != r2) goto L20
            return r2
        L3a:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$fetchLoginState$1 r4 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$fetchLoginState$1
            r4.<init>(r6)
            goto L12
        L40:
            r0 = 0
            return r0
        L42:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.fetchLoginState(X.HtJ):java.lang.Object");
    }

    public final ConfidentialVmPinReminderContext getPinReminderContext() {
        return this.pinReminderContext;
    }

    public final C1BN<Boolean> getRecoveryPinPromptVisible() {
        return this.recoveryPinPromptVisible;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getStoredEnrollment(X.HtJ<? super com.facebook.aura.confidentialvm.repository.ConfidentialVmStoredEnrollment> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112331
            if (r0 == 0) goto L6b
            r7 = r10
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$getStoredEnrollment$1 r7 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112331) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6b
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r1 = r7.result
            X.Hji r8 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r6 = 3
            r5 = 1
            r4 = 2
            r3 = 0
            if (r0 == 0) goto L28
            if (r0 == r5) goto L3b
            if (r0 == r4) goto L50
            if (r0 != r6) goto L71
            X.Hwg.A00(r1)
        L27:
            return r1
        L28:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$getStoredEnrollment$stored$1 r0 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$getStoredEnrollment$stored$1
            r0.<init>(r9, r1)
            r7.label = r5
            java.lang.Object r1 = X.GAo.A00(r7, r2, r0)
            if (r1 != r8) goto L3e
            return r8
        L3b:
            X.Hwg.A00(r1)
        L3e:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmStoredEnrollment r0 = com.facebook.aura.confidentialvm.repository.ConfidentialVmStoredEnrollment.STORED
            if (r1 != r0) goto L27
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistrationResolver r1 = r9.vestaRegistrationResolver
            r0 = 0
            r7.L$0 = r0
            r7.label = r4
            java.lang.Object r1 = r1.resolveUncached(r7)
            if (r1 != r8) goto L53
            return r8
        L50:
            X.Hwg.A00(r1)
        L53:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration r1 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration) r1
            int r0 = r1.ordinal()
            if (r0 == r3) goto L7e
            if (r0 == r4) goto L7b
            if (r0 != r5) goto L76
            r0 = 0
            r7.L$0 = r0
            r7.label = r6
            java.lang.Object r1 = r9.deleteOrphanedSecret(r7)
            if (r1 != r8) goto L27
            return r8
        L6b:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$getStoredEnrollment$1 r7 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$getStoredEnrollment$1
            r7.<init>(r10)
            goto L12
        L71:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L76:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L7b:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmStoredEnrollment r1 = com.facebook.aura.confidentialvm.repository.ConfidentialVmStoredEnrollment.UNAVAILABLE
            return r1
        L7e:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmStoredEnrollment r1 = com.facebook.aura.confidentialvm.repository.ConfidentialVmStoredEnrollment.STORED
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.getStoredEnrollment(X.HtJ):java.lang.Object");
    }

    public final C1BN<Boolean> getSupportInvestigatingVisible() {
        return this.supportInvestigatingVisible;
    }

    public final Object getVestaRegistration(HtJ<? super ConfidentialVmVestaRegistration> htJ) {
        return this.vestaRegistrationResolver.resolve(htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onPinReminder(com.facebook.aura.confidentialvm.repository.ConfidentialVmPinReminderContext r7, long r8, X.HtJ<? super java.lang.Boolean> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112381
            if (r0 == 0) goto L6e
            r5 = r10
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$onPinReminder$1 r5 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112381) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6e
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L42
            if (r0 == r1) goto L52
            if (r0 != r2) goto L74
            java.lang.Object r7 = r5.L$0
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinReminderContext r7 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmPinReminderContext) r7
            X.Hwg.A00(r4)
        L27:
            boolean r0 = X.AnonymousClass001.A1X(r4)
            if (r0 == 0) goto L79
            r6.pinReminderContext = r7
            X.BLG<java.lang.Boolean> r0 = r6._recoveryPinPromptVisible
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            X.AnonymousClass002.A1I(r0, r3)
            com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger r2 = com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger.INSTANCE
            java.lang.String r1 = r7.reminderId
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r0 = r6.loggedReminderPromptId
            r2.logRecoveryPinReminderPromptView(r1, r0)
            return r3
        L42:
            X.Hwg.A00(r4)
            r5.L$0 = r7
            r5.J$0 = r8
            r5.label = r1
            java.lang.Object r4 = r6.isRecoveryPinPromptEligible(r5)
            if (r4 != r3) goto L5b
            return r3
        L52:
            long r8 = r5.J$0
            java.lang.Object r7 = r5.L$0
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinReminderContext r7 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmPinReminderContext) r7
            X.Hwg.A00(r4)
        L5b:
            boolean r0 = X.AnonymousClass001.A1X(r4)
            if (r0 == 0) goto L79
            r5.L$0 = r7
            r5.J$0 = r8
            r5.label = r2
            java.lang.Object r4 = r6.awaitMatchingPinState(r7, r8, r5)
            if (r4 != r3) goto L27
            return r3
        L6e:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$onPinReminder$1 r5 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$onPinReminder$1
            r5.<init>(r10)
            goto L12
        L74:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L79:
            java.lang.Boolean r3 = X.AnonymousClass001.A0h()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.onPinReminder(com.facebook.aura.confidentialvm.repository.ConfidentialVmPinReminderContext, long, X.HtJ):java.lang.Object");
    }

    public final Object refreshVestaRegistration(HtJ<? super ConfidentialVmVestaRegistration> htJ) {
        return this.vestaRegistrationResolver.resolveFresh(htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object registerEnrollmentPinIfUnregistered(java.lang.String r7, X.HtJ<? super com.facebook.aura.confidentialvm.repository.ConfidentialVmEscrowResult> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112431
            if (r0 == 0) goto L24
            r5 = r8
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$registerEnrollmentPinIfUnregistered$1 r5 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112431) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 == r1) goto L3f
            if (r0 != r2) goto L2a
            X.Hwg.A00(r4)
            return r4
        L24:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$registerEnrollmentPinIfUnregistered$1 r5 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$registerEnrollmentPinIfUnregistered$1
            r5.<init>(r8)
            goto L12
        L2a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2f:
            X.Hwg.A00(r4)
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistrationResolver r0 = r6.vestaRegistrationResolver
            r5.L$0 = r7
            r5.label = r1
            java.lang.Object r4 = r0.resolveFresh(r5)
            if (r4 != r3) goto L45
        L3e:
            return r3
        L3f:
            java.lang.Object r0 = r5.L$0
            java.lang.String r7 = X.C3cG.A0d(r0, r4)
        L45:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration r4 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration) r4
            r1 = 0
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$registerEnrollmentPinIfUnregistered$2 r0 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$registerEnrollmentPinIfUnregistered$2
            r0.<init>(r7, r1)
            r5.L$0 = r1
            r5.label = r2
            java.lang.Object r0 = com.facebook.aura.confidentialvm.repository.ConfidentialVmRepositoryKt.registerEnrollmentPinAfterRegistrationCheck(r4, r0, r5)
            if (r0 == r3) goto L3e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.registerEnrollmentPinIfUnregistered(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolveEnrollmentStep(X.HtJ<? super com.facebook.aura.confidentialvm.repository.ConfidentialVmEnrollmentStep> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112451
            if (r0 == 0) goto L59
            r6 = r8
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$resolveEnrollmentStep$1 r6 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112451) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r5 = r6.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r3 = 1
            r2 = 0
            r1 = 2
            if (r0 == 0) goto L33
            if (r0 == r3) goto L3f
            if (r0 != r1) goto L67
            X.Hwg.A00(r5)
        L24:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration r5 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistration) r5
            int r0 = r5.ordinal()
            if (r0 == r2) goto L64
            if (r0 == r1) goto L71
            if (r0 != r3) goto L5f
            com.facebook.aura.confidentialvm.repository.ConfidentialVmEnrollmentStep r4 = com.facebook.aura.confidentialvm.repository.ConfidentialVmEnrollmentStep.CREATE_PIN
            return r4
        L33:
            X.Hwg.A00(r5)
            r6.label = r3
            java.lang.Object r5 = r7.getStoredEnrollment(r6)
            if (r5 != r4) goto L42
            return r4
        L3f:
            X.Hwg.A00(r5)
        L42:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmStoredEnrollment r5 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmStoredEnrollment) r5
            int r0 = r5.ordinal()
            if (r0 == r3) goto L74
            if (r0 == r1) goto L71
            if (r0 != r2) goto L6c
            r6.label = r1
            com.facebook.aura.confidentialvm.repository.ConfidentialVmVestaRegistrationResolver r0 = r7.vestaRegistrationResolver
            java.lang.Object r5 = r0.resolve(r6)
            if (r5 != r4) goto L24
            return r4
        L59:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$resolveEnrollmentStep$1 r6 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$resolveEnrollmentStep$1
            r6.<init>(r8)
            goto L12
        L5f:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L64:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmEnrollmentStep r4 = com.facebook.aura.confidentialvm.repository.ConfidentialVmEnrollmentStep.ENTER_EXISTING_PIN
            return r4
        L67:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L6c:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L71:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmEnrollmentStep r4 = com.facebook.aura.confidentialvm.repository.ConfidentialVmEnrollmentStep.UNAVAILABLE
            return r4
        L74:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmEnrollmentStep r4 = com.facebook.aura.confidentialvm.repository.ConfidentialVmEnrollmentStep.USE_STORED_SECRET
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.resolveEnrollmentStep(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolveRvKey(java.lang.String r8, X.HtJ<? super com.facebook.aura.confidentialvm.repository.ConfidentialVmRvKeyResolution> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112461
            if (r0 == 0) goto L23
            r6 = r9
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$resolveRvKey$1 r6 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112461) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L29
            if (r0 != r3) goto L82
            java.lang.Object r2 = r6.L$1
            X.Hqv r2 = (X.C10543Hqv) r2
            goto L43
        L23:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$resolveRvKey$1 r6 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$resolveRvKey$1
            r6.<init>(r9)
            goto L12
        L29:
            X.Hqv r2 = X.C3cG.A10(r1)
            X.78T r1 = X.AnonymousClass001.A0y()     // Catch: java.lang.Throwable -> L77
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$resolveRvKey$terminalResult$1 r0 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$resolveRvKey$terminalResult$1     // Catch: java.lang.Throwable -> L77
            r0.<init>(r2, r7, r8, r4)     // Catch: java.lang.Throwable -> L77
            r6.L$0 = r4     // Catch: java.lang.Throwable -> L77
            r6.L$1 = r2     // Catch: java.lang.Throwable -> L77
            r6.label = r3     // Catch: java.lang.Throwable -> L77
            java.lang.Object r1 = X.GAo.A00(r6, r1, r0)     // Catch: java.lang.Throwable -> L77
            if (r1 != r5) goto L46
            return r5
        L43:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L77
        L46:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRvKeyResolution r1 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmRvKeyResolution) r1     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L54
            T r0 = r2.element
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L53
            X.C8j4.A1T(r0)
        L53:
            return r1
        L54:
            T r1 = r2.element     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L70
            byte[] r1 = (byte[]) r1     // Catch: java.lang.Throwable -> L77
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRvKey r0 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmRvKey     // Catch: java.lang.Throwable -> L77
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L77
            r2.element = r4     // Catch: java.lang.Throwable -> L77
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRvKeyResolution$Available r5 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmRvKeyResolution$Available     // Catch: java.lang.Throwable -> L77
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L77
            T r0 = r2.element
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L6f
            X.C8j4.A1T(r0)
        L6f:
            return r5
        L70:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)     // Catch: java.lang.Throwable -> L77
            throw r0     // Catch: java.lang.Throwable -> L77
        L77:
            r1 = move-exception
            T r0 = r2.element
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L86
            X.C8j4.A1T(r0)
            throw r1
        L82:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
        L86:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.resolveRvKey(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object showRecoveryPinPrompt(X.HtJ<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112491
            if (r0 == 0) goto L3d
            r4 = r6
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$showRecoveryPinPrompt$1 r4 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112491) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r0 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L2a
            if (r1 != r2) goto L43
            java.lang.Object r1 = r4.L$0
            X.BLG r1 = (X.BLG) r1
            X.Hwg.A00(r0)
        L24:
            r1.Af8(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L2a:
            X.Hwg.A00(r0)
            r0 = 0
            r5.pinReminderContext = r0
            X.BLG<java.lang.Boolean> r1 = r5._recoveryPinPromptVisible
            r4.L$0 = r1
            r4.label = r2
            java.lang.Object r0 = r5.isRecoveryPinPromptEligible(r4)
            if (r0 != r3) goto L24
            return r3
        L3d:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$showRecoveryPinPrompt$1 r4 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$showRecoveryPinPrompt$1
            r4.<init>(r6)
            goto L12
        L43:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.showRecoveryPinPrompt(X.HtJ):java.lang.Object");
    }

    public final void showSupportInvestigating() {
        AnonymousClass004.A1D(true, this._supportInvestigatingVisible);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object submitReminderPin(java.lang.String r7, X.HtJ<? super com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifyResult> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112501
            if (r0 == 0) goto L76
            r4 = r8
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$submitReminderPin$1 r4 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.C112501) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L76
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r0 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r2 = r4.label
            r1 = 1
            if (r2 == 0) goto L63
            if (r2 != r1) goto L7c
            java.lang.Object r5 = r4.L$1
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinReminderContext r5 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmPinReminderContext) r5
            X.Hwg.A00(r0)
        L24:
            if (r5 == 0) goto L45
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifyResult$Match r1 = com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifyResult.Match.INSTANCE
            boolean r1 = X.C7384Etj.areEqual(r0, r1)
            if (r1 == 0) goto L46
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r1 = r6.wrongGuessReminderId
            java.lang.Object r2 = r1.get()
            java.lang.String r1 = r5.reminderId
            boolean r4 = X.C7384Etj.areEqual(r2, r1)
            X.3UX r3 = r6.writeScope
            r2 = 0
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$submitReminderPin$2 r1 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$submitReminderPin$2
            r1.<init>(r5, r4, r2)
            X.AnonymousClass001.A1J(r1, r3)
        L45:
            return r0
        L46:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifyResult$Mismatch r1 = com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifyResult.Mismatch.INSTANCE
            boolean r1 = X.C7384Etj.areEqual(r0, r1)
            if (r1 == 0) goto L56
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r2 = r6.wrongGuessReminderId
            java.lang.String r1 = r5.reminderId
            r2.set(r1)
            return r0
        L56:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifyResult$AuthenticationFailed r1 = com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifyResult.AuthenticationFailed.INSTANCE
            boolean r1 = X.C7384Etj.areEqual(r0, r1)
            if (r1 != 0) goto L45
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L63:
            X.Hwg.A00(r0)
            com.facebook.aura.confidentialvm.repository.ConfidentialVmPinReminderContext r5 = r6.pinReminderContext
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r5
            r4.label = r1
            java.lang.Object r0 = r6.checkReminderPin(r7, r4)
            if (r0 != r3) goto L24
            return r3
        L76:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$submitReminderPin$1 r4 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository$submitReminderPin$1
            r4.<init>(r8)
            goto L12
        L7c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository.submitReminderPin(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object checkReminderPin(String str, HtJ<? super ConfidentialVmPinVerifyResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C112242(str, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object deleteOrphanedSecret(HtJ<? super ConfidentialVmStoredEnrollment> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C112262(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object escrowPinUsingStoredOrNewSecret(String str, HtJ<? super ConfidentialVmEscrowResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C112292(str, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchUserInfo(HtJ<? super ConfidentialVmVestaUserInfoResponseJson> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C112312(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getStoredSecretBytes(HtJ<? super byte[]> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C112342(null));
    }

    /* renamed from: sendOperatorSshRequest-BWLJW6A, reason: not valid java name */
    private final /* synthetic */ <Res> Object m448sendOperatorSshRequestBWLJW6A(JarvisPath jarvisPath, RequestType requestType, Map<String, String> map, HtJ<? super HsJ<? extends Res>> htJ) {
        C7384Etj.A0P();
        throw F60.createAndThrow();
    }

    public final Object deriveHostData(String str, HtJ<? super byte[]> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C112272(str, null));
    }

    public final Object discardLegacySecret(String str, byte[] bArr, HtJ<? super Unit> htJ) {
        Object objA00 = GAo.A00(htJ, AnonymousClass001.A0y(), new C112282(str, bArr, null));
        return objA00 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA00;
    }

    public final Object hasStoredPinHash(HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C112352(null));
    }

    public final Object hasStoredSecret(HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C112362(null));
    }

    public final Object promoteLegacySecret(String str, byte[] bArr, HtJ<? super Unit> htJ) {
        Object objA00 = GAo.A00(htJ, AnonymousClass001.A0y(), new C112412(str, bArr, null));
        return objA00 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA00;
    }

    public final Object readPinState(HtJ<? super ConfidentialVmPinState> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C112422(null));
    }

    public final Object updatePinPreservingStoredSecret(String str, HtJ<? super ConfidentialVmEscrowResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C112532(str, this, null));
    }

    public final Object verifyPinLocally(String str, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C112542(str, null));
    }

    public final Object verifyRecoveryPin(String str, HtJ<? super ConfidentialVmVerifyResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C112552(str, this, null));
    }
}
