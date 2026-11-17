package com.facebook.aura.modellock;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass441;
import X.BFI;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3Ek;
import X.C3Pi;
import X.C3UX;
import X.C3cG;
import X.C3cJ;
import X.C4JM;
import X.C5322DgG;
import X.C60Q;
import X.C7384Etj;
import X.C78W;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.Ey9;
import X.FGI;
import X.G0U;
import X.G0V;
import X.HnJ;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzC;
import X.InterfaceC7549F2g;
import com.facebook.aura.R;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import com.facebook.aura.conversation.api.ConversationInputBlock;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;
import com.facebook.aura.gateway.HatcheryVMIdUtilsKt;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.json.HatchEnvelopeDecoderKt;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.modellock.ModelLockJarvisPath;
import com.facebook.aura.network.transport.HatchAttachmentFileNameKt;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.toast.api.ToastApi;
import com.facebook.aura.utils.HatchUtil;
import java.io.File;
import java.security.MessageDigest;
import java.util.Collections;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class ModelLockRepository implements ConversationInputBlock, InterfaceC7549F2g {
    public static final String APPEAL_SHA256_HEADER = "X-Appeal-Sha256";
    public static final Companion Companion = new Companion();
    public static final String FALLBACK_FILE_NAME = "data.json";
    public static final int MAX_FILE_NAME_BYTES = 255;
    public static final long SUBMIT_TIMEOUT_SECONDS = 60;
    public final BLG<ActiveLock> activeLock;
    public final C1BN<ModelLockAppealStage> appealStage;
    public final C20Q<Boolean> blockedChanges;
    public final C20Q<ModelLockOwner> lockOwner;
    public final C3UX scope;
    public final SingleFlight submitSingleFlight;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.modellock.ModelLockRepository$1", f = "ModelLockRepository.kt", l = {78}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.modellock.ModelLockRepository$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ModelLockRepository.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ModelLockRepository.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1BN<String> c1bn = ModelLockRepository.this.getPrefsStore().hatcheryVmIdFlow;
                final ModelLockRepository modelLockRepository = ModelLockRepository.this;
                C20Z<? super String> c20z = new C20Z() { // from class: com.facebook.aura.modellock.ModelLockRepository.1.1
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.String r5, X.HtJ<? super kotlin.Unit> r6) {
                        /*
                            r4 = this;
                            com.facebook.aura.modellock.ModelLockRepository r0 = r1
                            com.facebook.aura.gateway.store.HatchGatewayPrefsStore r0 = com.facebook.aura.modellock.ModelLockRepository.access$getPrefsStore(r0)
                            java.lang.String r6 = X.C3cG.A0a(r0)
                            com.facebook.aura.modellock.ModelLockRepository r0 = r1
                            X.BLG<com.facebook.aura.modellock.ModelLockRepository$ActiveLock> r5 = r0.activeLock
                        Le:
                            java.lang.Object r4 = r5.getValue()
                            r3 = r4
                            com.facebook.aura.modellock.ModelLockRepository$ActiveLock r3 = (com.facebook.aura.modellock.ModelLockRepository.ActiveLock) r3
                            r0 = 0
                            if (r3 == 0) goto L23
                            com.facebook.aura.modellock.ModelLockOwner r1 = r3.owner
                            java.lang.String r1 = r1.vmId
                            boolean r2 = X.C7384Etj.areEqual(r1, r6)
                            r1 = r3
                            if (r2 != 0) goto L24
                        L23:
                            r1 = r0
                        L24:
                            boolean r1 = r5.A6e(r4, r1)
                            if (r1 == 0) goto Le
                            if (r3 == 0) goto L32
                            com.facebook.aura.modellock.ModelLockOwner r1 = r3.owner
                            if (r1 == 0) goto L32
                            java.lang.String r0 = r1.vmId
                        L32:
                            boolean r0 = X.C7384Etj.areEqual(r0, r6)
                            if (r0 != 0) goto L3d
                            com.facebook.aura.modellock.ModelLockAppealFiles r0 = com.facebook.aura.modellock.ModelLockAppealFiles.INSTANCE
                            r0.delete()
                        L3d:
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.modellock.ModelLockRepository.AnonymousClass1.C02391.emit(java.lang.String, X.HtJ):java.lang.Object");
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((String) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (c1bn.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public final class ActiveLock extends C06G {
        public final AppealRecord appealRecord;
        public final ModelLockOwner owner;
        public final ModelLockUpdatedJson server;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ActiveLock) {
                    ActiveLock activeLock = (ActiveLock) obj;
                    if (!C7384Etj.areEqual(this.server, activeLock.server) || !C7384Etj.areEqual(this.owner, activeLock.owner) || this.appealRecord != activeLock.appealRecord) {
                    }
                }
                return false;
            }
            return true;
        }

        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AppealRecord.values().length];
                try {
                    AnonymousClass002.A13(AppealRecord.UNAVAILABLE, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(AppealRecord.UNDER_REVIEW, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(AppealRecord.NONE, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ ActiveLock copy$default(ActiveLock activeLock, ModelLockUpdatedJson modelLockUpdatedJson, ModelLockOwner modelLockOwner, AppealRecord appealRecord, int i, Object obj) {
            if ((i & 1) != 0) {
                modelLockUpdatedJson = activeLock.server;
            }
            if ((i & 2) != 0) {
                modelLockOwner = activeLock.owner;
            }
            if ((i & 4) != 0) {
                appealRecord = activeLock.appealRecord;
            }
            return activeLock.copy(modelLockUpdatedJson, modelLockOwner, appealRecord);
        }

        public final ModelLockAppealStage appealStage() {
            ModelLockAppealStage modelLockAppealStagePolledAppealStage = this.server.polledAppealStage();
            ModelLockAppealStage modelLockAppealStage = ModelLockAppealStage.NOT_SUBMITTED;
            if (modelLockAppealStagePolledAppealStage != modelLockAppealStage) {
                return modelLockAppealStagePolledAppealStage;
            }
            int iOrdinal = this.appealRecord.ordinal();
            if (iOrdinal == 1) {
                return ModelLockAppealStage.UNAVAILABLE;
            }
            if (iOrdinal == 2) {
                return ModelLockAppealStage.IN_REVIEW;
            }
            if (iOrdinal == 0) {
                return modelLockAppealStage;
            }
            throw C3cG.A0q();
        }

        public final ModelLockUpdatedJson component1() {
            return this.server;
        }

        public final ModelLockOwner component2() {
            return this.owner;
        }

        public final AppealRecord component3() {
            return this.appealRecord;
        }

        public final AppealRecord getAppealRecord() {
            return this.appealRecord;
        }

        public final ModelLockOwner getOwner() {
            return this.owner;
        }

        public final ModelLockUpdatedJson getServer() {
            return this.server;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.appealRecord, AnonymousClass005.A0F(this.owner, AnonymousClass005.A0E(this.server)));
        }

        public ActiveLock(ModelLockUpdatedJson modelLockUpdatedJson, ModelLockOwner modelLockOwner, AppealRecord appealRecord) {
            AnonymousClass005.A0x(modelLockUpdatedJson, modelLockOwner, appealRecord);
            this.server = modelLockUpdatedJson;
            this.owner = modelLockOwner;
            this.appealRecord = appealRecord;
        }

        public final ActiveLock copy(ModelLockUpdatedJson modelLockUpdatedJson, ModelLockOwner modelLockOwner, AppealRecord appealRecord) {
            AnonymousClass005.A0x(modelLockUpdatedJson, modelLockOwner, appealRecord);
            return new ActiveLock(modelLockUpdatedJson, modelLockOwner, appealRecord);
        }

        public String toString() {
            return super.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class AppealRecord {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ AppealRecord[] $VALUES;
        public static final AppealRecord NONE;
        public static final AppealRecord UNAVAILABLE;
        public static final AppealRecord UNDER_REVIEW;

        static {
            AppealRecord appealRecord = new AppealRecord(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 0);
            NONE = appealRecord;
            AppealRecord appealRecord2 = new AppealRecord("UNAVAILABLE", 1);
            UNAVAILABLE = appealRecord2;
            AppealRecord appealRecord3 = new AppealRecord("UNDER_REVIEW", 2);
            UNDER_REVIEW = appealRecord3;
            AppealRecord[] appealRecordArr = {appealRecord, appealRecord2, appealRecord3};
            $VALUES = appealRecordArr;
            $ENTRIES = C3cG.A0w(appealRecordArr);
        }

        public static Ey9<AppealRecord> getEntries() {
            return $ENTRIES;
        }

        public static AppealRecord valueOf(String str) {
            return (AppealRecord) Enum.valueOf(AppealRecord.class, str);
        }

        public static AppealRecord[] values() {
            return (AppealRecord[]) $VALUES.clone();
        }

        public AppealRecord(String str, int i) {
        }
    }

    /* renamed from: com.facebook.aura.modellock.ModelLockRepository$sha256Hex$1, reason: invalid class name and case insensitive filesystem */
    public final class C127071 extends AbstractC7559F3s implements G0U<Byte, CharSequence> {
        public static final C127071 INSTANCE = new C127071();

        public C127071() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
            return C3cJ.A0K(Byte.valueOf(b.byteValue()));
        }

        public final CharSequence invoke(byte b) {
            return C3cJ.A0K(Byte.valueOf(b));
        }
    }

    /* renamed from: com.facebook.aura.modellock.ModelLockRepository$stageAppealFile$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ ModelLockAppealFile $appealFile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ModelLockAppealFile modelLockAppealFile) {
            super(0);
            this.$appealFile = modelLockAppealFile;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(ModelLockRepository.this.isCurrent(this.$appealFile));
        }
    }

    public final void apply$fbandroid_express_aura_java_com_facebook_aura_modellock_modellock(ModelLockUpdatedJson modelLockUpdatedJson) {
        ActiveLock value;
        ActiveLock activeLock;
        ActiveLock activeLock2;
        ModelLockOwner modelLockOwner;
        C7384Etj.A0Y(modelLockUpdatedJson, 0);
        String strA0a = C3cG.A0a(getPrefsStore());
        Long l = modelLockUpdatedJson.locked_at_ms;
        if (l == null) {
            ActiveLock value2 = this.activeLock.getValue();
            l = (value2 == null || (modelLockOwner = value2.owner) == null || !C7384Etj.areEqual(modelLockOwner.vmId, strA0a)) ? null : modelLockOwner.lockedAtMs;
        }
        ModelLockOwner modelLockOwner2 = new ModelLockOwner(strA0a, l);
        C5322DgG c5322DgG = new C5322DgG(null, new ModelLockRepository$apply$initialRecord$2(this));
        ActiveLock value3 = this.activeLock.getValue();
        if (!C7384Etj.areEqual(value3 != null ? value3.owner : null, modelLockOwner2) || !modelLockUpdatedJson.locked) {
            ModelLockAppealFiles.INSTANCE.delete();
        }
        BLG<ActiveLock> blg = this.activeLock;
        do {
            value = blg.getValue();
            activeLock = value;
            if (!C7384Etj.areEqual(HatcheryVMIdUtilsKt.extractHatcheryVMId(getPrefsStore().getGatewayUrl()), strA0a)) {
                activeLock2 = activeLock;
            } else if (!modelLockUpdatedJson.locked) {
                activeLock2 = null;
            } else if (activeLock == null || !C7384Etj.areEqual(activeLock.owner, modelLockOwner2)) {
                activeLock2 = new ActiveLock(modelLockUpdatedJson, modelLockOwner2, (AppealRecord) c5322DgG.getValue());
            } else {
                String str = modelLockUpdatedJson.appeal_status;
                if (str == null) {
                    str = activeLock.server.appeal_status;
                }
                activeLock2 = activeLock.copy(new ModelLockUpdatedJson(modelLockUpdatedJson.locked, modelLockUpdatedJson.locked_at_ms, str), activeLock.owner, activeLock.appealRecord);
            }
        } while (!blg.A6e(value, activeLock2));
        if (activeLock == null || !modelLockUpdatedJson.restoresAccess()) {
            return;
        }
        ToastApi.INSTANCE.showToast(C4JM.A00().getString(R.string._name_removed__res_0x7f12046f, HatchAppName.value));
    }

    public final boolean isCurrent(ModelLockAppealFile modelLockAppealFile) {
        C7384Etj.A0Y(modelLockAppealFile, 0);
        ActiveLock value = this.activeLock.getValue();
        return C7384Etj.areEqual(value != null ? value.owner : null, modelLockAppealFile.owner);
    }

    public final class Companion {
        public final ModelLockRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (ModelLockRepository) abstractC3358CGz.A03(ModelLockRepository.class, new ModelLockRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ModelLockAppealError.values().length];
            try {
                AnonymousClass002.A13(ModelLockAppealError.PENDING, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ModelLockAppealError.UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: appealFileFrom-gIAlu-s, reason: not valid java name */
    public final Object m1443appealFileFromgIAlus(HatchHttpResponse hatchHttpResponse, ModelLockOwner modelLockOwner) {
        Throwable thA00;
        String value = ModelLockJarvisPath.SafetyAppealFile.INSTANCE.getValue();
        if (hatchHttpResponse == null) {
            thA00 = new NetworkException(FGI.A0M(value, " failed"), -1, null, null, null, null, null);
        } else {
            if (hatchHttpResponse.isSuccessful) {
                try {
                    byte[] bArrBodyBytes = hatchHttpResponse.bodyBytes();
                    if (bArrBodyBytes == null) {
                        throw C60Q.A0U(value, ": no body");
                    }
                    String strSha256Hex = sha256Hex(bArrBodyBytes);
                    String strHeader = hatchHttpResponse.header(APPEAL_SHA256_HEADER);
                    if (strHeader == null) {
                        throw C60Q.A0U(value, ": no X-Appeal-Sha256");
                    }
                    if (!strHeader.equalsIgnoreCase(strSha256Hex)) {
                        throw C60Q.A0U(value, ": body does not match X-Appeal-Sha256");
                    }
                    String strAttachmentFileName = HatchAttachmentFileNameKt.attachmentFileName(hatchHttpResponse);
                    if (strAttachmentFileName == null || C3cG.A1S(strAttachmentFileName).length > 255) {
                        strAttachmentFileName = FALLBACK_FILE_NAME;
                    }
                    return new ModelLockAppealFile(modelLockOwner, strAttachmentFileName, bArrBodyBytes, strSha256Hex);
                } catch (Throwable th) {
                    return C3cG.A0s(th);
                }
            }
            thA00 = HsJ.A00(HatchEnvelopeDecoderKt.decodeEnvelopeWith(hatchHttpResponse, ModelLockRepository$appealFileFromgIAlus$$inlined$decodeEnvelope$default$1.INSTANCE, true, value, Collections.singleton(200), false));
            if (thA00 == null) {
                int i = hatchHttpResponse.statusCode;
                thA00 = new NetworkException(FGI.A0S(value, AnonymousClass000.A00(8), i), i, null, null, null, null, null);
            }
        }
        return C3cG.A0s(thA00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HatchGatewayPrefsStore getPrefsStore() {
        return HatchGatewayPrefsStore.Companion.getInstance(this.userSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hidesComposer(ModelLockAppealStage modelLockAppealStage) {
        return modelLockAppealStage != null && HatchUtil.INSTANCE.getShouldModelLockHideComposer();
    }

    private final void record(AppealRecord appealRecord, ModelLockOwner modelLockOwner) {
        ActiveLock value;
        ActiveLock activeLock;
        ActiveLock activeLockCopy;
        BLG<ActiveLock> blg = this.activeLock;
        do {
            value = blg.getValue();
            activeLock = value;
            if (activeLock != null && C7384Etj.areEqual(activeLock.owner, modelLockOwner) && (activeLockCopy = activeLock.copy(activeLock.server, activeLock.owner, appealRecord)) != null) {
                activeLock = activeLockCopy;
            }
        } while (!blg.A6e(value, activeLock));
    }

    private final String sha256Hex(byte[] bArr) {
        byte[] bArrDigest = MessageDigest.getInstance(ConfidentialVmPinVerifierCrypto.SHA_256).digest(bArr);
        C7384Etj.A0U(bArrDigest);
        return BFI.A0C("", C127071.INSTANCE, bArrDigest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e7  */
    /* renamed from: submit-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1444submit0E7RQCE(com.facebook.aura.modellock.ModelLockAppealFile r28, java.lang.String r29, X.HtJ<? super X.HsJ<kotlin.Unit>> r30) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.modellock.ModelLockRepository.m1444submit0E7RQCE(com.facebook.aura.modellock.ModelLockAppealFile, java.lang.String, X.HtJ):java.lang.Object");
    }

    public final void clear() {
        this.activeLock.Af8(null);
        ModelLockAppealFiles.INSTANCE.delete();
    }

    public final ModelLockOwner currentOwner() {
        ActiveLock value = this.activeLock.getValue();
        if (value != null) {
            return value.owner;
        }
        return null;
    }

    public final void deleteStagedAppealFile() {
        ModelLockAppealFiles.INSTANCE.delete();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* renamed from: fetchAppealFile-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1445fetchAppealFileIoAF18A(X.HtJ<? super X.HsJ<com.facebook.aura.modellock.ModelLockAppealFile>> r19) {
        /*
            r18 = this;
            r3 = r19
            boolean r0 = r3 instanceof com.facebook.aura.modellock.ModelLockRepository$fetchAppealFile$1
            r6 = r18
            if (r0 == 0) goto Lb6
            r5 = r3
            com.facebook.aura.modellock.ModelLockRepository$fetchAppealFile$1 r5 = (com.facebook.aura.modellock.ModelLockRepository$fetchAppealFile$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb6
            int r2 = r2 - r1
            r5.label = r2
        L16:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 2
            r15 = 1
            r9 = 0
            if (r0 == 0) goto L54
            if (r0 == r15) goto L87
            if (r0 != r3) goto Lbd
            java.lang.Object r2 = r5.L$0
            com.facebook.aura.modellock.ModelLockOwner r2 = (com.facebook.aura.modellock.ModelLockOwner) r2
            X.Hwg.A00(r1)
        L2c:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r4 = r1.value
            java.lang.Throwable r3 = X.HsJ.A00(r4)
            if (r3 == 0) goto L53
            boolean r0 = r3 instanceof com.facebook.aura.json.NetworkException
            if (r0 == 0) goto L45
            r0 = r3
            com.facebook.aura.json.NetworkException r0 = (com.facebook.aura.json.NetworkException) r0
            if (r0 == 0) goto L45
            int r0 = r0.httpResponseCode
            java.lang.Integer r9 = X.C3cG.A0R(r0)
        L45:
            java.lang.String r0 = "Appeal file load failed: HTTP "
            java.lang.String r1 = X.AnonymousClass007.A0a(r0, r9)
            java.lang.String r0 = "ModelLockRepository"
            X.CFK.A06(r0, r1)
            r6.recordIfUnavailable(r3, r2)
        L53:
            return r4
        L54:
            X.Hwg.A00(r1)
            X.BLG<com.facebook.aura.modellock.ModelLockRepository$ActiveLock> r0 = r6.activeLock
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.modellock.ModelLockRepository$ActiveLock r0 = (com.facebook.aura.modellock.ModelLockRepository.ActiveLock) r0
            if (r0 == 0) goto Lc7
            com.facebook.aura.modellock.ModelLockOwner r2 = r0.owner
            if (r2 == 0) goto Lc7
            com.facebook.aura.network.http.HatchHttpApi r7 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.modellock.ModelLockJarvisPath$SafetyAppealFile r8 = com.facebook.aura.modellock.ModelLockJarvisPath.SafetyAppealFile.INSTANCE
            com.facebook.aura.network.http.RequestType r10 = com.facebook.aura.network.http.RequestType.GET
            X.CGz r11 = r6.userSession
            r0 = 0
            X.HxE[] r14 = new X.HxE[r0]
            r5.L$0 = r2
            r5.label = r15
            X.9jH r16 = X.AGH.A0E()
            r12 = r9
            r13 = r9
            r17 = r15
            r18 = r15
            r19 = r5
            java.lang.Object r1 = r7.makeJarvisHttpRequestDetailedInternal(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            if (r1 != r4) goto L8e
            return r4
        L87:
            java.lang.Object r2 = r5.L$0
            com.facebook.aura.modellock.ModelLockOwner r2 = (com.facebook.aura.modellock.ModelLockOwner) r2
            X.Hwg.A00(r1)
        L8e:
            com.facebook.aura.network.http.HatchHttpRequestResult r1 = (com.facebook.aura.network.http.HatchHttpRequestResult) r1
            boolean r0 = r1 instanceof com.facebook.aura.network.http.HatchHttpRequestSuccess
            if (r0 == 0) goto Lb0
            com.facebook.aura.network.http.HatchHttpRequestSuccess r1 = (com.facebook.aura.network.http.HatchHttpRequestSuccess) r1
            com.facebook.aura.network.transport.HatchHttpResponse r7 = r1.response
        L98:
            com.facebook.aura.executors.AuraDispatchers r0 = com.facebook.aura.executors.AuraDispatchers.INSTANCE
            X.78T r1 = r0.m764default()
            com.facebook.aura.modellock.ModelLockRepository$fetchAppealFile$2 r0 = new com.facebook.aura.modellock.ModelLockRepository$fetchAppealFile$2
            r0.<init>(r6, r7, r2, r9)
            r5.L$0 = r2
            r5.L$1 = r9
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r1, r0)
            if (r1 != r4) goto L2c
            return r4
        Lb0:
            boolean r0 = r1 instanceof com.facebook.aura.network.http.HatchHttpRequestFailure
            if (r0 == 0) goto Lc2
            r7 = r9
            goto L98
        Lb6:
            com.facebook.aura.modellock.ModelLockRepository$fetchAppealFile$1 r5 = new com.facebook.aura.modellock.ModelLockRepository$fetchAppealFile$1
            r5.<init>(r6, r3)
            goto L16
        Lbd:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        Lc2:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        Lc7:
            java.lang.String r0 = "not locked"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            X.Hud r4 = X.C3cG.A0s(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.modellock.ModelLockRepository.m1445fetchAppealFileIoAF18A(X.HtJ):java.lang.Object");
    }

    public final C1BN<ModelLockAppealStage> getAppealStage() {
        return this.appealStage;
    }

    @Override // com.facebook.aura.conversation.api.ConversationInputBlock
    public C20Q<Boolean> getBlockedChanges() {
        return this.blockedChanges;
    }

    public final C20Q<ModelLockOwner> getLockOwner() {
        return this.lockOwner;
    }

    @Override // com.facebook.aura.conversation.api.ConversationInputBlock
    public boolean isBlocked() {
        return hidesComposer(this.appealStage.getValue());
    }

    public final boolean isLocked() {
        return AnonymousClass002.A1X(this.activeLock.getValue());
    }

    public final Object stageAppealFile(ModelLockAppealFile modelLockAppealFile, HtJ<? super File> htJ) {
        return ModelLockAppealFiles.INSTANCE.stage(modelLockAppealFile, new AnonymousClass2(modelLockAppealFile), htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* renamed from: submitAppeal-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1446submitAppeal0E7RQCE(com.facebook.aura.modellock.ModelLockAppealFile r9, java.lang.String r10, X.HtJ<? super X.HsJ<kotlin.Unit>> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.facebook.aura.modellock.ModelLockRepository$submitAppeal$1
            if (r0 == 0) goto L45
            r7 = r11
            com.facebook.aura.modellock.ModelLockRepository$submitAppeal$1 r7 = (com.facebook.aura.modellock.ModelLockRepository$submitAppeal$1) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r1 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r5 = 1
            if (r0 == 0) goto L25
            if (r0 != r5) goto L4b
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.Hwg.A00(r1)
            X.3UX r4 = r8.scope
            r3 = 0
            com.facebook.aura.modellock.ModelLockRepository$submitAppeal$2 r2 = new com.facebook.aura.modellock.ModelLockRepository$submitAppeal$2
            r2.<init>(r10, r9, r8, r3)
            X.6ys r1 = X.C6ys.A00
            java.lang.Integer r0 = X.C79.A00
            X.Hrx r0 = X.GAo.A01(r0, r1, r2, r4)
            r7.L$0 = r3
            r7.L$1 = r3
            r7.label = r5
            java.lang.Object r1 = r0.A0E(r7)
            if (r1 != r6) goto L20
            return r6
        L45:
            com.facebook.aura.modellock.ModelLockRepository$submitAppeal$1 r7 = new com.facebook.aura.modellock.ModelLockRepository$submitAppeal$1
            r7.<init>(r8, r11)
            goto L12
        L4b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.modellock.ModelLockRepository.m1446submitAppeal0E7RQCE(com.facebook.aura.modellock.ModelLockAppealFile, java.lang.String, X.HtJ):java.lang.Object");
    }

    public ModelLockRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        HzC hzCA03 = C78W.A03();
        this.scope = hzCA03;
        C9286GCn c9286GCnA01 = HnJ.A01(null);
        this.activeLock = c9286GCnA01;
        this.submitSingleFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, false);
        AnonymousClass001.A1J(new AnonymousClass1(null), hzCA03);
        this.lockOwner = new ModelLockRepository$special$$inlined$map$1(c9286GCnA01);
        C3Pi c3PiA00 = AnonymousClass441.A00(null, hzCA03, new ModelLockRepository$special$$inlined$map$2(c9286GCnA01), C3Ek.A00);
        this.appealStage = c3PiA00;
        this.blockedChanges = new ModelLockRepository$special$$inlined$map$3(c3PiA00, this);
    }

    private final void recordIfUnavailable(Throwable th, ModelLockOwner modelLockOwner) {
        if (ModelLockAppealErrorKt.toModelLockAppealError(th) == ModelLockAppealError.UNAVAILABLE) {
            record(AppealRecord.UNAVAILABLE, modelLockOwner);
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        clear();
        Hxb.A03(null, this.scope);
    }

    public /* synthetic */ ModelLockRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
