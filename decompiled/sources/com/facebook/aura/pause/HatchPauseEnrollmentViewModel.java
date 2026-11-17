package com.facebook.aura.pause;

import X.A6J;
import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC08429uh;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BLG;
import X.BLL;
import X.C06G;
import X.C06H;
import X.C10543Hqv;
import X.C1BN;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C6ys;
import X.C7384Etj;
import X.C78T;
import X.C79;
import X.C9286GCn;
import X.C9uG;
import X.CFK;
import X.DCl;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC08439ui;
import android.security.keystore.UserNotAuthenticatedException;
import com.facebook.aura.analytics.timespent.config.MC;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.hatchlockcrypto.HatchArgon2Hasher;
import com.facebook.aura.hatchlockcrypto.HatchBiometricPassphraseEncryptor;
import com.facebook.aura.hatchlockcrypto.HatchPassphraseGenerator;
import com.facebook.aura.hatchlockcrypto.PassphraseHashResult;
import com.facebook.aura.pause.HatchPauseEnrollmentDestination;
import com.facebook.aura.settings.MC;
import java.util.Arrays;
import javax.crypto.Cipher;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class HatchPauseEnrollmentViewModel extends AEs {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final String TAG = "HatchPauseEnrollmentViewModel";
    public final BLG<HatchPauseEnrollmentDestination> _currentDestination;
    public final BLG<DecryptionState> _decryptionState;
    public final BLG<EnrollmentState> _enrollmentState;
    public final BLG<Boolean> _hasCheckedEnrollment;
    public final BLG<String> _passphrase;
    public final BLG<Boolean> _shouldShowPauseConfirmDialog;
    public final BLG<Boolean> _showUnpauseBottomSheet;
    public final C1BN<HatchPauseEnrollmentDestination> currentDestination;
    public EnrollmentData decryptionEnrollment;
    public final C1BN<DecryptionState> decryptionState;
    public String enrollmentHatchlingId;
    public String enrollmentPassphrase;
    public final C1BN<EnrollmentState> enrollmentState;
    public final C1BN<Boolean> hasCheckedEnrollment;
    public final C1BN<String> passphrase;
    public final C1BN<Boolean> shouldShowPauseConfirmDialog;
    public final C1BN<Boolean> showUnpauseBottomSheet;
    public final HatchPauseEnrollmentFlowStore store;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentViewModel$1", f = "HatchPauseEnrollmentViewModel.kt", l = {132}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentViewModel$1$1", f = "HatchPauseEnrollmentViewModel.kt", l = {133, 145, 149}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03361 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ C10543Hqv<String> $hatchlingId;
            public Object L$0;
            public boolean Z$0;
            public int label;
            public final /* synthetic */ HatchPauseEnrollmentViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03361(HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel, C10543Hqv<String> c10543Hqv, HtJ<? super C03361> htJ) {
                super(2, htJ);
                this.this$0 = hatchPauseEnrollmentViewModel;
                this.$hatchlingId = c10543Hqv;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C03361(this.this$0, this.$hatchlingId, htJ);
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0095 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    X.Hji r4 = X.EnumC10460Hji.A02
                    int r0 = r7.label
                    r3 = 3
                    r6 = 2
                    r5 = 1
                    if (r0 == 0) goto L1e
                    if (r0 == r5) goto L32
                    if (r0 == r6) goto L64
                    if (r0 != r3) goto L96
                    X.Hwg.A00(r8)
                L12:
                    if (r8 == 0) goto L1b
                    com.facebook.aura.pause.HatchPauseEnrollmentViewModel r0 = r7.this$0
                    X.BLG<java.lang.String> r0 = r0._passphrase
                L18:
                    X.AnonymousClass002.A1I(r0, r8)
                L1b:
                    kotlin.Unit r4 = kotlin.Unit.INSTANCE
                    return r4
                L1e:
                    X.Hwg.A00(r8)
                    com.facebook.aura.pause.HatchPauseEnrollmentViewModel r1 = r7.this$0
                    X.Hqv<java.lang.String> r0 = r7.$hatchlingId
                    T r0 = r0.element
                    java.lang.String r0 = (java.lang.String) r0
                    r7.label = r5
                    java.lang.Object r8 = r1.hasEnrollment(r0, r7)
                    if (r8 != r4) goto L35
                    return r4
                L32:
                    X.Hwg.A00(r8)
                L35:
                    boolean r2 = X.AnonymousClass001.A1X(r8)
                    com.facebook.aura.pause.HatchPauseEnrollmentViewModel r0 = r7.this$0
                    if (r2 == 0) goto L4d
                    X.BLG<com.facebook.aura.pause.HatchPauseEnrollmentDestination> r1 = r0._currentDestination
                    com.facebook.aura.pause.HatchPauseEnrollmentDestination$EnrollmentComplete r0 = com.facebook.aura.pause.HatchPauseEnrollmentDestination.EnrollmentComplete.INSTANCE
                    r1.Af8(r0)
                    com.facebook.aura.pause.HatchPauseEnrollmentViewModel r0 = r7.this$0
                    X.BLG<java.lang.Boolean> r0 = r0._shouldShowPauseConfirmDialog
                    java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
                    goto L18
                L4d:
                    com.facebook.aura.pause.HatchPauseEnrollmentFlowStore r1 = r0.store
                    X.Hqv<java.lang.String> r0 = r7.$hatchlingId
                    T r0 = r0.element
                    java.lang.String r0 = (java.lang.String) r0
                    X.20Q r0 = r1.getDestination(r0)
                    r7.Z$0 = r2
                    r7.label = r6
                    java.lang.Object r8 = X.AbstractC9777Gfy.A02(r0, r7)
                    if (r8 != r4) goto L69
                    return r4
                L64:
                    boolean r2 = r7.Z$0
                    X.Hwg.A00(r8)
                L69:
                    java.lang.String r8 = (java.lang.String) r8
                    if (r8 == 0) goto L7a
                    com.facebook.aura.pause.HatchPauseEnrollmentViewModel r0 = r7.this$0
                    X.BLG<com.facebook.aura.pause.HatchPauseEnrollmentDestination> r1 = r0._currentDestination
                    com.facebook.aura.pause.HatchPauseEnrollmentDestination$Companion r0 = com.facebook.aura.pause.HatchPauseEnrollmentDestination.Companion
                    com.facebook.aura.pause.HatchPauseEnrollmentDestination r0 = r0.fromKey(r8)
                    r1.Af8(r0)
                L7a:
                    com.facebook.aura.pause.HatchPauseEnrollmentViewModel r0 = r7.this$0
                    com.facebook.aura.pause.HatchPauseEnrollmentFlowStore r1 = r0.store
                    X.Hqv<java.lang.String> r0 = r7.$hatchlingId
                    T r0 = r0.element
                    java.lang.String r0 = (java.lang.String) r0
                    X.20Q r1 = r1.getPassphrase(r0)
                    r0 = 0
                    r7.L$0 = r0
                    r7.Z$0 = r2
                    r7.label = r3
                    java.lang.Object r8 = X.AbstractC9777Gfy.A02(r1, r7)
                    if (r8 != r4) goto L12
                    return r4
                L96:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pause.HatchPauseEnrollmentViewModel.AnonymousClass1.C03361.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((C03361) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchPauseEnrollmentViewModel.this.new AnonymousClass1(htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 5, insn: 0x004a: IGET (r0 I:T) = (r5 I:X.Hqv) A[Catch: all -> 0x005f] (LINE:74) X.Hqv.element java.lang.Object, block:B:19:0x0048 */
        /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r5v0, types: [X.Hqv] */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ?? r5;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        C10543Hqv c10543HqvA10 = C3cG.A10(obj);
                        ?? CurrentHatchlingId = HatchPauseEnrollmentViewModel.this.currentHatchlingId();
                        if (CurrentHatchlingId == 0) {
                            return Unit.INSTANCE;
                        }
                        c10543HqvA10.element = CurrentHatchlingId;
                        C78T c78tA0y = AnonymousClass001.A0y();
                        C03361 c03361 = new C03361(HatchPauseEnrollmentViewModel.this, c10543HqvA10, null);
                        this.L$0 = c10543HqvA10;
                        this.label = 1;
                        if (GAo.A00(this, c78tA0y, c03361) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                    }
                } catch (Exception e) {
                    String str = (String) r5.element;
                    if (str == null) {
                        str = "none";
                    }
                    C3cH.A1B("Failed to initialize enrollment state for hatchling ", str, HatchPauseEnrollmentViewModel.TAG, e);
                }
                AnonymousClass004.A1D(true, HatchPauseEnrollmentViewModel.this._hasCheckedEnrollment);
                return Unit.INSTANCE;
            } finally {
                AnonymousClass004.A1D(true, HatchPauseEnrollmentViewModel.this._hasCheckedEnrollment);
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchPauseEnrollmentViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentViewModel$2", f = "HatchPauseEnrollmentViewModel.kt", l = {167}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentViewModel$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchPauseEnrollmentViewModel.this.new AnonymousClass2(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel = HatchPauseEnrollmentViewModel.this;
                BLG<DecryptionState> blg = hatchPauseEnrollmentViewModel._decryptionState;
                C20Z<? super DecryptionState> c20z = new C20Z() { // from class: com.facebook.aura.pause.HatchPauseEnrollmentViewModel.2.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((DecryptionState) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(DecryptionState decryptionState, HtJ<? super Unit> htJ) {
                        if (decryptionState instanceof DecryptionState.Failed) {
                            AnonymousClass004.A1D(false, hatchPauseEnrollmentViewModel._showUnpauseBottomSheet);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (blg.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchPauseEnrollmentViewModel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* loaded from: classes.dex */
    public interface DecryptionState {

        /* loaded from: classes2.dex */
        public final class AwaitingBiometric extends C06G implements DecryptionState {
            public static final int $stable = 8;
            public final Cipher cipher;

            public AwaitingBiometric(Cipher cipher) {
                C7384Etj.A0Y(cipher, 0);
                this.cipher = cipher;
            }

            public final AwaitingBiometric copy(Cipher cipher) {
                C7384Etj.A0Y(cipher, 0);
                return new AwaitingBiometric(cipher);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof AwaitingBiometric) && C7384Etj.areEqual(this.cipher, ((AwaitingBiometric) obj).cipher));
            }

            public static /* synthetic */ AwaitingBiometric copy$default(AwaitingBiometric awaitingBiometric, Cipher cipher, int i, Object obj) {
                if ((i & 1) != 0) {
                    cipher = awaitingBiometric.cipher;
                }
                C7384Etj.A0Y(cipher, 0);
                return new AwaitingBiometric(cipher);
            }

            public final Cipher component1() {
                return this.cipher;
            }

            public final Cipher getCipher() {
                return this.cipher;
            }

            public int hashCode() {
                return this.cipher.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        /* loaded from: classes2.dex */
        public final class AwaitingBiometricAuthOnly implements DecryptionState {
            public static final int $stable = 0;
            public static final AwaitingBiometricAuthOnly INSTANCE = new AwaitingBiometricAuthOnly();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof AwaitingBiometricAuthOnly);
            }

            public String toString() {
                return "AwaitingBiometricAuthOnly";
            }

            public int hashCode() {
                return 1797430524;
            }
        }

        /* loaded from: classes2.dex */
        public final class Failed extends C06G implements DecryptionState {
            public static final int $stable = 0;
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

        /* loaded from: classes2.dex */
        public final class Idle implements DecryptionState {
            public static final int $stable = 0;
            public static final Idle INSTANCE = new Idle();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Idle);
            }

            public String toString() {
                return "Idle";
            }

            public int hashCode() {
                return -1436714440;
            }
        }

        /* loaded from: classes2.dex */
        public final class Ready extends C06G implements DecryptionState {
            public static final int $stable = 8;
            public final byte[] derivedBytes;

            public Ready(byte[] bArr) {
                C7384Etj.A0Y(bArr, 0);
                this.derivedBytes = bArr;
            }

            public final Ready copy(byte[] bArr) {
                C7384Etj.A0Y(bArr, 0);
                return new Ready(bArr);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Ready) && C7384Etj.areEqual(this.derivedBytes, ((Ready) obj).derivedBytes));
            }

            public static /* synthetic */ Ready copy$default(Ready ready, byte[] bArr, int i, Object obj) {
                if ((i & 1) != 0) {
                    bArr = ready.derivedBytes;
                }
                C7384Etj.A0Y(bArr, 0);
                return new Ready(bArr);
            }

            public final byte[] component1() {
                return this.derivedBytes;
            }

            public final byte[] getDerivedBytes() {
                return this.derivedBytes;
            }

            public int hashCode() {
                return Arrays.hashCode(this.derivedBytes);
            }

            public String toString() {
                return super.toString();
            }
        }
    }

    public interface EnrollmentState {

        public final class AwaitingBiometric extends C06G implements EnrollmentState {
            public static final int $stable = 8;
            public final Cipher cipher;

            public AwaitingBiometric(Cipher cipher) {
                C7384Etj.A0Y(cipher, 0);
                this.cipher = cipher;
            }

            public final AwaitingBiometric copy(Cipher cipher) {
                C7384Etj.A0Y(cipher, 0);
                return new AwaitingBiometric(cipher);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof AwaitingBiometric) && C7384Etj.areEqual(this.cipher, ((AwaitingBiometric) obj).cipher));
            }

            public static /* synthetic */ AwaitingBiometric copy$default(AwaitingBiometric awaitingBiometric, Cipher cipher, int i, Object obj) {
                if ((i & 1) != 0) {
                    cipher = awaitingBiometric.cipher;
                }
                C7384Etj.A0Y(cipher, 0);
                return new AwaitingBiometric(cipher);
            }

            public final Cipher component1() {
                return this.cipher;
            }

            public final Cipher getCipher() {
                return this.cipher;
            }

            public int hashCode() {
                return this.cipher.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class AwaitingBiometricAuthOnly implements EnrollmentState {
            public static final int $stable = 0;
            public static final AwaitingBiometricAuthOnly INSTANCE = new AwaitingBiometricAuthOnly();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof AwaitingBiometricAuthOnly);
            }

            public String toString() {
                return "AwaitingBiometricAuthOnly";
            }

            public int hashCode() {
                return -918438861;
            }
        }

        public final class Complete implements EnrollmentState {
            public static final int $stable = 0;
            public static final Complete INSTANCE = new Complete();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Complete);
            }

            public String toString() {
                return "Complete";
            }

            public int hashCode() {
                return -1206048378;
            }
        }

        public final class Failed extends C06G implements EnrollmentState {
            public static final int $stable = 0;
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

        public final class Hashing implements EnrollmentState {
            public static final int $stable = 0;
            public static final Hashing INSTANCE = new Hashing();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Hashing);
            }

            public String toString() {
                return "Hashing";
            }

            public int hashCode() {
                return 400875047;
            }
        }

        public final class Idle implements EnrollmentState {
            public static final int $stable = 0;
            public static final Idle INSTANCE = new Idle();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Idle);
            }

            public String toString() {
                return "Idle";
            }

            public int hashCode() {
                return 306407073;
            }
        }

        public final class Storing implements EnrollmentState {
            public static final int $stable = 0;
            public static final Storing INSTANCE = new Storing();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Storing);
            }

            public String toString() {
                return "Storing";
            }

            public int hashCode() {
                return 2114038641;
            }
        }
    }

    public final class Factory implements InterfaceC08439ui {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // X.InterfaceC08439ui
        public <T extends AEs> T create(Class<T> cls) {
            return new HatchPauseEnrollmentViewModel(HatchPauseEnrollmentFlowStore.Companion.getInstance(this.userSession), this.userSession);
        }

        @Override // X.InterfaceC08439ui
        public /* bridge */ <T extends AEs> T create(C9uG<T> c9uG, A6J a6j) {
            return (T) AbstractC08429uh.A00(this, a6j, c9uG);
        }

        @Override // X.InterfaceC08439ui
        public /* bridge */ <T extends AEs> T create(Class<T> cls, A6J a6j) {
            return (T) AbstractC08429uh.A01(this, cls);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentViewModel", f = "HatchPauseEnrollmentViewModel.kt", l = {475}, m = "clear", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentViewModel$clear$1, reason: invalid class name and case insensitive filesystem */
    public final class C134131 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C134131(HtJ<? super C134131> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchPauseEnrollmentViewModel.this.clear(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentViewModel$clear$2", f = "HatchPauseEnrollmentViewModel.kt", l = {475}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentViewModel$clear$2, reason: invalid class name and case insensitive filesystem */
    public final class C134142 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $hatchlingId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134142(String str, HtJ<? super C134142> htJ) {
            super(2, htJ);
            this.$hatchlingId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchPauseEnrollmentViewModel.this.new C134142(this.$hatchlingId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchPauseEnrollmentFlowStore hatchPauseEnrollmentFlowStore = HatchPauseEnrollmentViewModel.this.store;
                String str = this.$hatchlingId;
                this.label = 1;
                if (hatchPauseEnrollmentFlowStore.clear(str, this) == enumC10460Hji) {
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
            return ((C134142) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentViewModel", f = "HatchPauseEnrollmentViewModel.kt", l = {481}, m = "clearTemporaryData", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentViewModel$clearTemporaryData$1, reason: invalid class name and case insensitive filesystem */
    public final class C134151 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C134151(HtJ<? super C134151> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchPauseEnrollmentViewModel.this.clearTemporaryData(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentViewModel$clearTemporaryData$2", f = "HatchPauseEnrollmentViewModel.kt", l = {481}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentViewModel$clearTemporaryData$2, reason: invalid class name and case insensitive filesystem */
    public final class C134162 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $hatchlingId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134162(String str, HtJ<? super C134162> htJ) {
            super(2, htJ);
            this.$hatchlingId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchPauseEnrollmentViewModel.this.new C134162(this.$hatchlingId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchPauseEnrollmentFlowStore hatchPauseEnrollmentFlowStore = HatchPauseEnrollmentViewModel.this.store;
                String str = this.$hatchlingId;
                this.label = 1;
                if (hatchPauseEnrollmentFlowStore.clearTemporaryData(str, this) == enumC10460Hji) {
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
            return ((C134162) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentViewModel$completeBiometricDecryption$1", f = "HatchPauseEnrollmentViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentViewModel$completeBiometricDecryption$1, reason: invalid class name and case insensitive filesystem */
    public final class C134171 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Cipher $cipher;
        public final /* synthetic */ EnrollmentData $enrollment;
        public int label;
        public final /* synthetic */ HatchPauseEnrollmentViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134171(Cipher cipher, EnrollmentData enrollmentData, HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel, HtJ<? super C134171> htJ) {
            super(2, htJ);
            this.$cipher = cipher;
            this.$enrollment = enrollmentData;
            this.this$0 = hatchPauseEnrollmentViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C134171(this.$cipher, this.$enrollment, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            try {
                AnonymousClass002.A1I(this.this$0._decryptionState, new DecryptionState.Ready(HatchBiometricPassphraseEncryptor.INSTANCE.decrypt(this.$cipher, this.$enrollment.encryptedPassphrase)));
            } catch (Exception e) {
                BLG<DecryptionState> blg = this.this$0._decryptionState;
                String message = e.getMessage();
                if (message == null) {
                    message = "Decryption failed";
                }
                AnonymousClass002.A1I(blg, new DecryptionState.Failed(message));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C134171) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentViewModel$completeBiometricEnrollment$1", f = "HatchPauseEnrollmentViewModel.kt", l = {269, 274}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentViewModel$completeBiometricEnrollment$1, reason: invalid class name and case insensitive filesystem */
    public final class C134181 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Cipher $cipher;
        public final /* synthetic */ String $hatchlingId;
        public final /* synthetic */ String $raw;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public final /* synthetic */ HatchPauseEnrollmentViewModel this$0;

        @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentViewModel$completeBiometricEnrollment$1$1", f = "HatchPauseEnrollmentViewModel.kt", l = {275}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentViewModel$completeBiometricEnrollment$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03371 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ byte[] $encrypted;
            public final /* synthetic */ String $hatchlingId;
            public final /* synthetic */ String $keyAlias;
            public int label;
            public final /* synthetic */ HatchPauseEnrollmentViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03371(HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel, String str, String str2, byte[] bArr, HtJ<? super C03371> htJ) {
                super(2, htJ);
                this.this$0 = hatchPauseEnrollmentViewModel;
                this.$hatchlingId = str;
                this.$keyAlias = str2;
                this.$encrypted = bArr;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C03371(this.this$0, this.$hatchlingId, this.$keyAlias, this.$encrypted, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchPauseEnrollmentFlowStore hatchPauseEnrollmentFlowStore = this.this$0.store;
                    String str = this.$hatchlingId;
                    String str2 = this.$keyAlias;
                    byte[] bArr = this.$encrypted;
                    this.label = 1;
                    if (hatchPauseEnrollmentFlowStore.setEnrollment(str, str2, bArr, true, this) == enumC10460Hji) {
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
                return ((C03371) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134181(String str, HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel, Cipher cipher, String str2, HtJ<? super C134181> htJ) {
            super(2, htJ);
            this.$hatchlingId = str;
            this.this$0 = hatchPauseEnrollmentViewModel;
            this.$cipher = cipher;
            this.$raw = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C134181(this.$hatchlingId, this.this$0, this.$cipher, this.$raw, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String strA0M;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (Exception e) {
                BLG<EnrollmentState> blg = this.this$0._enrollmentState;
                String message = e.getMessage();
                if (message == null) {
                    message = "Enrollment failed";
                }
                AnonymousClass002.A1I(blg, new EnrollmentState.Failed(message));
            }
            if (i == 0) {
                Hwg.A00(obj);
                String str = this.$hatchlingId;
                strA0M = FGI.A0M("hulk_", str);
                byte[] bArrDeriveSalt = HatchArgon2Hasher.Companion.deriveSalt(str);
                C78T c78tA0y = AnonymousClass001.A0y();
                HatchPauseEnrollmentViewModel$completeBiometricEnrollment$1$hashResult$1 hatchPauseEnrollmentViewModel$completeBiometricEnrollment$1$hashResult$1 = new HatchPauseEnrollmentViewModel$completeBiometricEnrollment$1$hashResult$1(this.$raw, bArrDeriveSalt, null);
                this.L$0 = strA0M;
                this.L$1 = null;
                this.label = 1;
                obj = GAo.A00(this, c78tA0y, hatchPauseEnrollmentViewModel$completeBiometricEnrollment$1$hashResult$1);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    this.this$0._enrollmentState.Af8(EnrollmentState.Complete.INSTANCE);
                    return Unit.INSTANCE;
                }
                strA0M = (String) this.L$0;
                Hwg.A00(obj);
            }
            this.this$0._enrollmentState.Af8(EnrollmentState.Storing.INSTANCE);
            byte[] bArrEncrypt = HatchBiometricPassphraseEncryptor.INSTANCE.encrypt(this.$cipher, ((PassphraseHashResult) obj).hash);
            C78T c78tA0y2 = AnonymousClass001.A0y();
            C03371 c03371 = new C03371(this.this$0, this.$hatchlingId, strA0M, bArrEncrypt, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
            if (GAo.A00(this, c78tA0y2, c03371) == enumC10460Hji) {
                return enumC10460Hji;
            }
            this.this$0._enrollmentState.Af8(EnrollmentState.Complete.INSTANCE);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C134181) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentViewModel$enrollAndUnpause$1", f = "HatchPauseEnrollmentViewModel.kt", l = {446, 451, 454}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentViewModel$enrollAndUnpause$1, reason: invalid class name and case insensitive filesystem */
    public final class C134191 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $hatchlingId;
        public final /* synthetic */ String $trimmedPassphrase;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public final /* synthetic */ HatchPauseEnrollmentViewModel this$0;

        @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentViewModel$enrollAndUnpause$1$1", f = "HatchPauseEnrollmentViewModel.kt", l = {455}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentViewModel$enrollAndUnpause$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03381 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ byte[] $encrypted;
            public final /* synthetic */ String $hatchlingId;
            public final /* synthetic */ String $keyAlias;
            public int label;
            public final /* synthetic */ HatchPauseEnrollmentViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03381(HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel, String str, String str2, byte[] bArr, HtJ<? super C03381> htJ) {
                super(2, htJ);
                this.this$0 = hatchPauseEnrollmentViewModel;
                this.$hatchlingId = str;
                this.$keyAlias = str2;
                this.$encrypted = bArr;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C03381(this.this$0, this.$hatchlingId, this.$keyAlias, this.$encrypted, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchPauseEnrollmentFlowStore hatchPauseEnrollmentFlowStore = this.this$0.store;
                    String str = this.$hatchlingId;
                    String str2 = this.$keyAlias;
                    byte[] bArr = this.$encrypted;
                    this.label = 1;
                    if (hatchPauseEnrollmentFlowStore.setEnrollment(str, str2, bArr, false, this) == enumC10460Hji) {
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
                return ((C03381) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x009d A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                r9 = r12
                java.lang.String r3 = "hulk_"
                X.Hji r2 = X.EnumC10460Hji.A02
                int r0 = r11.label
                r10 = 0
                r4 = 3
                r6 = 2
                r7 = 1
                if (r0 == 0) goto L2c
                if (r0 == r7) goto L27
                if (r0 == r6) goto L1e
                if (r0 != r4) goto L19
                java.lang.Object r3 = r11.L$2
                com.facebook.aura.hatchlockcrypto.PassphraseHashResult r3 = (com.facebook.aura.hatchlockcrypto.PassphraseHashResult) r3
                goto L9e
            L19:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L1e:
                java.lang.Object r3 = r11.L$2
                com.facebook.aura.hatchlockcrypto.PassphraseHashResult r3 = (com.facebook.aura.hatchlockcrypto.PassphraseHashResult) r3
                java.lang.Object r8 = r11.L$0
                java.lang.String r8 = (java.lang.String) r8
                goto L7b
            L27:
                java.lang.Object r8 = r11.L$0
                java.lang.String r8 = (java.lang.String) r8
                goto L53
            L2c:
                X.Hwg.A00(r12)
                java.lang.String r1 = r11.$hatchlingId     // Catch: java.lang.Exception -> Lb9
                java.lang.String r8 = X.FGI.A0M(r3, r1)     // Catch: java.lang.Exception -> Lb9
                com.facebook.aura.hatchlockcrypto.HatchArgon2Hasher$Companion r0 = com.facebook.aura.hatchlockcrypto.HatchArgon2Hasher.Companion     // Catch: java.lang.Exception -> Lb9
                byte[] r5 = r0.deriveSalt(r1)     // Catch: java.lang.Exception -> Lb9
                X.78T r3 = X.AnonymousClass001.A0y()     // Catch: java.lang.Exception -> Lb9
                java.lang.String r1 = r11.$trimmedPassphrase     // Catch: java.lang.Exception -> Lb9
                com.facebook.aura.pause.HatchPauseEnrollmentViewModel$enrollAndUnpause$1$hashResult$1 r0 = new com.facebook.aura.pause.HatchPauseEnrollmentViewModel$enrollAndUnpause$1$hashResult$1     // Catch: java.lang.Exception -> Lb9
                r0.<init>(r1, r5, r10)     // Catch: java.lang.Exception -> Lb9
                r11.L$0 = r8     // Catch: java.lang.Exception -> Lb9
                r11.L$1 = r10     // Catch: java.lang.Exception -> Lb9
                r11.label = r7     // Catch: java.lang.Exception -> Lb9
                java.lang.Object r9 = X.GAo.A00(r11, r3, r0)     // Catch: java.lang.Exception -> Lb9
                if (r9 != r2) goto L56
                return r2
            L53:
                X.Hwg.A00(r12)     // Catch: java.lang.Exception -> Lb9
            L56:
                com.facebook.aura.hatchlockcrypto.PassphraseHashResult r9 = (com.facebook.aura.hatchlockcrypto.PassphraseHashResult) r9     // Catch: java.lang.Exception -> Lb9
                com.facebook.aura.pause.HatchPauseEnrollmentViewModel r0 = r11.this$0     // Catch: java.lang.Exception -> Lb9
                X.BLG<com.facebook.aura.pause.HatchPauseEnrollmentViewModel$EnrollmentState> r1 = r0._enrollmentState     // Catch: java.lang.Exception -> Lb9
                com.facebook.aura.pause.HatchPauseEnrollmentViewModel$EnrollmentState$Storing r0 = com.facebook.aura.pause.HatchPauseEnrollmentViewModel.EnrollmentState.Storing.INSTANCE     // Catch: java.lang.Exception -> Lb9
                r1.Af8(r0)     // Catch: java.lang.Exception -> Lb9
                X.78T r1 = X.AnonymousClass001.A0y()     // Catch: java.lang.Exception -> Lb9
                com.facebook.aura.pause.HatchPauseEnrollmentViewModel$enrollAndUnpause$1$encrypted$1 r0 = new com.facebook.aura.pause.HatchPauseEnrollmentViewModel$enrollAndUnpause$1$encrypted$1     // Catch: java.lang.Exception -> Lb9
                r0.<init>(r8, r9, r10)     // Catch: java.lang.Exception -> Lb9
                r11.L$0 = r8     // Catch: java.lang.Exception -> Lb9
                r11.L$1 = r10     // Catch: java.lang.Exception -> Lb9
                r11.L$2 = r9     // Catch: java.lang.Exception -> Lb9
                r11.label = r6     // Catch: java.lang.Exception -> Lb9
                java.lang.Object r0 = X.GAo.A00(r11, r1, r0)     // Catch: java.lang.Exception -> Lb9
                if (r0 == r2) goto Ld0
                r3 = r9
                r9 = r0
                goto L7e
            L7b:
                X.Hwg.A00(r12)     // Catch: java.lang.Exception -> Lb9
            L7e:
                byte[] r9 = (byte[]) r9     // Catch: java.lang.Exception -> Lb9
                X.78T r0 = X.AnonymousClass001.A0y()     // Catch: java.lang.Exception -> Lb9
                com.facebook.aura.pause.HatchPauseEnrollmentViewModel r6 = r11.this$0     // Catch: java.lang.Exception -> Lb9
                java.lang.String r7 = r11.$hatchlingId     // Catch: java.lang.Exception -> Lb9
                com.facebook.aura.pause.HatchPauseEnrollmentViewModel$enrollAndUnpause$1$1 r5 = new com.facebook.aura.pause.HatchPauseEnrollmentViewModel$enrollAndUnpause$1$1     // Catch: java.lang.Exception -> Lb9
                r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> Lb9
                r11.L$0 = r10     // Catch: java.lang.Exception -> Lb9
                r11.L$1 = r10     // Catch: java.lang.Exception -> Lb9
                r11.L$2 = r3     // Catch: java.lang.Exception -> Lb9
                r11.L$3 = r10     // Catch: java.lang.Exception -> Lb9
                r11.label = r4     // Catch: java.lang.Exception -> Lb9
                java.lang.Object r0 = X.GAo.A00(r11, r0, r5)     // Catch: java.lang.Exception -> Lb9
                if (r0 != r2) goto La1
                return r2
            L9e:
                X.Hwg.A00(r12)     // Catch: java.lang.Exception -> Lb9
            La1:
                com.facebook.aura.pause.HatchPauseEnrollmentViewModel r0 = r11.this$0     // Catch: java.lang.Exception -> Lb9
                X.BLG<com.facebook.aura.pause.HatchPauseEnrollmentViewModel$EnrollmentState> r1 = r0._enrollmentState     // Catch: java.lang.Exception -> Lb9
                com.facebook.aura.pause.HatchPauseEnrollmentViewModel$EnrollmentState$Complete r0 = com.facebook.aura.pause.HatchPauseEnrollmentViewModel.EnrollmentState.Complete.INSTANCE     // Catch: java.lang.Exception -> Lb9
                r1.Af8(r0)     // Catch: java.lang.Exception -> Lb9
                com.facebook.aura.pause.HatchPauseEnrollmentViewModel r0 = r11.this$0     // Catch: java.lang.Exception -> Lb9
                X.BLG<com.facebook.aura.pause.HatchPauseEnrollmentViewModel$DecryptionState> r2 = r0._decryptionState     // Catch: java.lang.Exception -> Lb9
                byte[] r1 = r3.hash     // Catch: java.lang.Exception -> Lb9
                com.facebook.aura.pause.HatchPauseEnrollmentViewModel$DecryptionState$Ready r0 = new com.facebook.aura.pause.HatchPauseEnrollmentViewModel$DecryptionState$Ready     // Catch: java.lang.Exception -> Lb9
                r0.<init>(r1)     // Catch: java.lang.Exception -> Lb9
                X.AnonymousClass001.A1E(r2, r10, r0)     // Catch: java.lang.Exception -> Lb9
                goto Lce
            Lb9:
                r1 = move-exception
                com.facebook.aura.pause.HatchPauseEnrollmentViewModel r0 = r11.this$0
                X.BLG<com.facebook.aura.pause.HatchPauseEnrollmentViewModel$EnrollmentState> r2 = r0._enrollmentState
                java.lang.String r1 = r1.getMessage()
                if (r1 != 0) goto Lc6
                java.lang.String r1 = "Enrollment failed"
            Lc6:
                com.facebook.aura.pause.HatchPauseEnrollmentViewModel$EnrollmentState$Failed r0 = new com.facebook.aura.pause.HatchPauseEnrollmentViewModel$EnrollmentState$Failed
                r0.<init>(r1)
                X.AnonymousClass001.A1E(r2, r10, r0)
            Lce:
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
            Ld0:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pause.HatchPauseEnrollmentViewModel.C134191.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134191(String str, HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel, String str2, HtJ<? super C134191> htJ) {
            super(2, htJ);
            this.$hatchlingId = str;
            this.this$0 = hatchPauseEnrollmentViewModel;
            this.$trimmedPassphrase = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C134191(this.$hatchlingId, this.this$0, this.$trimmedPassphrase, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C134191) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentViewModel$enrollWithBiometric$1", f = "HatchPauseEnrollmentViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentViewModel$enrollWithBiometric$1, reason: invalid class name and case insensitive filesystem */
    public final class C134201 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $hatchlingId;
        public int label;
        public final /* synthetic */ HatchPauseEnrollmentViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134201(String str, HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel, HtJ<? super C134201> htJ) {
            super(2, htJ);
            this.$hatchlingId = str;
            this.this$0 = hatchPauseEnrollmentViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C134201(this.$hatchlingId, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            try {
                AnonymousClass002.A1I(this.this$0._enrollmentState, new EnrollmentState.AwaitingBiometric(HatchBiometricPassphraseEncryptor.INSTANCE.getEncryptCipher(FGI.A0M("hulk_", this.$hatchlingId))));
            } catch (UserNotAuthenticatedException unused) {
                this.this$0._enrollmentState.Af8(EnrollmentState.AwaitingBiometricAuthOnly.INSTANCE);
            } catch (Exception e) {
                CFK.A08(HatchPauseEnrollmentViewModel.TAG, "Failed to prepare biometric enrollment", e);
                BLG<EnrollmentState> blg = this.this$0._enrollmentState;
                String message = e.getMessage();
                if (message == null) {
                    message = "Enrollment failed";
                }
                AnonymousClass002.A1I(blg, new EnrollmentState.Failed(message));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C134201) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentViewModel$enrollWithoutBiometric$1", f = "HatchPauseEnrollmentViewModel.kt", l = {297, 302, 305}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentViewModel$enrollWithoutBiometric$1, reason: invalid class name and case insensitive filesystem */
    public final class C134211 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $hatchlingId;
        public final /* synthetic */ String $trimmedPassphrase;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public final /* synthetic */ HatchPauseEnrollmentViewModel this$0;

        @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentViewModel$enrollWithoutBiometric$1$1", f = "HatchPauseEnrollmentViewModel.kt", l = {MC.mwa_time_spent_killswitch.__CONFIG__}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentViewModel$enrollWithoutBiometric$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03391 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ byte[] $encrypted;
            public final /* synthetic */ String $hatchlingId;
            public final /* synthetic */ String $keyAlias;
            public int label;
            public final /* synthetic */ HatchPauseEnrollmentViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03391(HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel, String str, String str2, byte[] bArr, HtJ<? super C03391> htJ) {
                super(2, htJ);
                this.this$0 = hatchPauseEnrollmentViewModel;
                this.$hatchlingId = str;
                this.$keyAlias = str2;
                this.$encrypted = bArr;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C03391(this.this$0, this.$hatchlingId, this.$keyAlias, this.$encrypted, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchPauseEnrollmentFlowStore hatchPauseEnrollmentFlowStore = this.this$0.store;
                    String str = this.$hatchlingId;
                    String str2 = this.$keyAlias;
                    byte[] bArr = this.$encrypted;
                    this.label = 1;
                    if (hatchPauseEnrollmentFlowStore.setEnrollment(str, str2, bArr, false, this) == enumC10460Hji) {
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
                return ((C03391) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0093 A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                r9 = r12
                java.lang.String r4 = "hulk_"
                X.Hji r2 = X.EnumC10460Hji.A02
                int r0 = r11.label
                r10 = 0
                r3 = 3
                r6 = 2
                r7 = 1
                if (r0 == 0) goto L24
                if (r0 == r7) goto L1f
                if (r0 == r6) goto L1a
                if (r0 != r3) goto L15
                goto L94
            L15:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L1a:
                java.lang.Object r8 = r11.L$0
                java.lang.String r8 = (java.lang.String) r8
                goto L71
            L1f:
                java.lang.Object r8 = r11.L$0
                java.lang.String r8 = (java.lang.String) r8
                goto L4b
            L24:
                X.Hwg.A00(r12)
                java.lang.String r1 = r11.$hatchlingId     // Catch: java.lang.Exception -> La1
                java.lang.String r8 = X.FGI.A0M(r4, r1)     // Catch: java.lang.Exception -> La1
                com.facebook.aura.hatchlockcrypto.HatchArgon2Hasher$Companion r0 = com.facebook.aura.hatchlockcrypto.HatchArgon2Hasher.Companion     // Catch: java.lang.Exception -> La1
                byte[] r5 = r0.deriveSalt(r1)     // Catch: java.lang.Exception -> La1
                X.78T r4 = X.AnonymousClass001.A0y()     // Catch: java.lang.Exception -> La1
                java.lang.String r1 = r11.$trimmedPassphrase     // Catch: java.lang.Exception -> La1
                com.facebook.aura.pause.HatchPauseEnrollmentViewModel$enrollWithoutBiometric$1$hashResult$1 r0 = new com.facebook.aura.pause.HatchPauseEnrollmentViewModel$enrollWithoutBiometric$1$hashResult$1     // Catch: java.lang.Exception -> La1
                r0.<init>(r1, r5, r10)     // Catch: java.lang.Exception -> La1
                r11.L$0 = r8     // Catch: java.lang.Exception -> La1
                r11.L$1 = r10     // Catch: java.lang.Exception -> La1
                r11.label = r7     // Catch: java.lang.Exception -> La1
                java.lang.Object r9 = X.GAo.A00(r11, r4, r0)     // Catch: java.lang.Exception -> La1
                if (r9 != r2) goto L4e
                return r2
            L4b:
                X.Hwg.A00(r12)     // Catch: java.lang.Exception -> La1
            L4e:
                com.facebook.aura.hatchlockcrypto.PassphraseHashResult r9 = (com.facebook.aura.hatchlockcrypto.PassphraseHashResult) r9     // Catch: java.lang.Exception -> La1
                com.facebook.aura.pause.HatchPauseEnrollmentViewModel r0 = r11.this$0     // Catch: java.lang.Exception -> La1
                X.BLG<com.facebook.aura.pause.HatchPauseEnrollmentViewModel$EnrollmentState> r1 = r0._enrollmentState     // Catch: java.lang.Exception -> La1
                com.facebook.aura.pause.HatchPauseEnrollmentViewModel$EnrollmentState$Storing r0 = com.facebook.aura.pause.HatchPauseEnrollmentViewModel.EnrollmentState.Storing.INSTANCE     // Catch: java.lang.Exception -> La1
                r1.Af8(r0)     // Catch: java.lang.Exception -> La1
                X.78T r1 = X.AnonymousClass001.A0y()     // Catch: java.lang.Exception -> La1
                com.facebook.aura.pause.HatchPauseEnrollmentViewModel$enrollWithoutBiometric$1$encrypted$1 r0 = new com.facebook.aura.pause.HatchPauseEnrollmentViewModel$enrollWithoutBiometric$1$encrypted$1     // Catch: java.lang.Exception -> La1
                r0.<init>(r8, r9, r10)     // Catch: java.lang.Exception -> La1
                r11.L$0 = r8     // Catch: java.lang.Exception -> La1
                r11.L$1 = r10     // Catch: java.lang.Exception -> La1
                r11.L$2 = r10     // Catch: java.lang.Exception -> La1
                r11.label = r6     // Catch: java.lang.Exception -> La1
                java.lang.Object r9 = X.GAo.A00(r11, r1, r0)     // Catch: java.lang.Exception -> La1
                if (r9 != r2) goto L74
                return r2
            L71:
                X.Hwg.A00(r12)     // Catch: java.lang.Exception -> La1
            L74:
                byte[] r9 = (byte[]) r9     // Catch: java.lang.Exception -> La1
                X.78T r0 = X.AnonymousClass001.A0y()     // Catch: java.lang.Exception -> La1
                com.facebook.aura.pause.HatchPauseEnrollmentViewModel r6 = r11.this$0     // Catch: java.lang.Exception -> La1
                java.lang.String r7 = r11.$hatchlingId     // Catch: java.lang.Exception -> La1
                com.facebook.aura.pause.HatchPauseEnrollmentViewModel$enrollWithoutBiometric$1$1 r5 = new com.facebook.aura.pause.HatchPauseEnrollmentViewModel$enrollWithoutBiometric$1$1     // Catch: java.lang.Exception -> La1
                r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> La1
                r11.L$0 = r10     // Catch: java.lang.Exception -> La1
                r11.L$1 = r10     // Catch: java.lang.Exception -> La1
                r11.L$2 = r10     // Catch: java.lang.Exception -> La1
                r11.L$3 = r10     // Catch: java.lang.Exception -> La1
                r11.label = r3     // Catch: java.lang.Exception -> La1
                java.lang.Object r0 = X.GAo.A00(r11, r0, r5)     // Catch: java.lang.Exception -> La1
                if (r0 != r2) goto L97
                return r2
            L94:
                X.Hwg.A00(r12)     // Catch: java.lang.Exception -> La1
            L97:
                com.facebook.aura.pause.HatchPauseEnrollmentViewModel r0 = r11.this$0     // Catch: java.lang.Exception -> La1
                X.BLG<com.facebook.aura.pause.HatchPauseEnrollmentViewModel$EnrollmentState> r1 = r0._enrollmentState     // Catch: java.lang.Exception -> La1
                com.facebook.aura.pause.HatchPauseEnrollmentViewModel$EnrollmentState$Complete r0 = com.facebook.aura.pause.HatchPauseEnrollmentViewModel.EnrollmentState.Complete.INSTANCE     // Catch: java.lang.Exception -> La1
                r1.Af8(r0)     // Catch: java.lang.Exception -> La1
                goto Lb6
            La1:
                r1 = move-exception
                com.facebook.aura.pause.HatchPauseEnrollmentViewModel r0 = r11.this$0
                X.BLG<com.facebook.aura.pause.HatchPauseEnrollmentViewModel$EnrollmentState> r2 = r0._enrollmentState
                java.lang.String r1 = r1.getMessage()
                if (r1 != 0) goto Lae
                java.lang.String r1 = "Enrollment failed"
            Lae:
                com.facebook.aura.pause.HatchPauseEnrollmentViewModel$EnrollmentState$Failed r0 = new com.facebook.aura.pause.HatchPauseEnrollmentViewModel$EnrollmentState$Failed
                r0.<init>(r1)
                X.AnonymousClass001.A1E(r2, r10, r0)
            Lb6:
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pause.HatchPauseEnrollmentViewModel.C134211.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134211(String str, HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel, String str2, HtJ<? super C134211> htJ) {
            super(2, htJ);
            this.$hatchlingId = str;
            this.this$0 = hatchPauseEnrollmentViewModel;
            this.$trimmedPassphrase = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C134211(this.$hatchlingId, this.this$0, this.$trimmedPassphrase, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C134211) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentViewModel$ensurePassphrase$2", f = "HatchPauseEnrollmentViewModel.kt", l = {207}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentViewModel$ensurePassphrase$2, reason: invalid class name and case insensitive filesystem */
    public final class C134222 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $generated;
        public final /* synthetic */ String $hatchlingId;
        public int label;
        public final /* synthetic */ HatchPauseEnrollmentViewModel this$0;

        @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentViewModel$ensurePassphrase$2$1", f = "HatchPauseEnrollmentViewModel.kt", l = {207}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentViewModel$ensurePassphrase$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ String $generated;
            public final /* synthetic */ String $hatchlingId;
            public int label;
            public final /* synthetic */ HatchPauseEnrollmentViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel, String str, String str2, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.this$0 = hatchPauseEnrollmentViewModel;
                this.$hatchlingId = str;
                this.$generated = str2;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, this.$hatchlingId, this.$generated, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchPauseEnrollmentFlowStore hatchPauseEnrollmentFlowStore = this.this$0.store;
                    String str = this.$hatchlingId;
                    String str2 = this.$generated;
                    this.label = 1;
                    if (hatchPauseEnrollmentFlowStore.setPassphrase(str, str2, this) == enumC10460Hji) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134222(String str, HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel, String str2, HtJ<? super C134222> htJ) {
            super(2, htJ);
            this.$hatchlingId = str;
            this.this$0 = hatchPauseEnrollmentViewModel;
            this.$generated = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C134222(this.$hatchlingId, this.this$0, this.$generated, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    C78T c78tA0y = AnonymousClass001.A0y();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$hatchlingId, this.$generated, null);
                    this.label = 1;
                    if (GAo.A00(this, c78tA0y, anonymousClass1) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
            } catch (Exception e) {
                CFK.A08(HatchPauseEnrollmentViewModel.TAG, FGI.A0M("Failed to save passphrase for hatchling ", this.$hatchlingId), e);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C134222) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentViewModel", f = "HatchPauseEnrollmentViewModel.kt", l = {434}, m = "hasEnrollment", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentViewModel$hasEnrollment$1, reason: invalid class name and case insensitive filesystem */
    public final class C134231 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C134231(HtJ<? super C134231> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchPauseEnrollmentViewModel.this.hasEnrollment(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentViewModel$navigateTo$1", f = "HatchPauseEnrollmentViewModel.kt", l = {180}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentViewModel$navigateTo$1, reason: invalid class name and case insensitive filesystem */
    public final class C134241 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchPauseEnrollmentDestination $destination;
        public final /* synthetic */ String $hatchlingId;
        public int label;
        public final /* synthetic */ HatchPauseEnrollmentViewModel this$0;

        @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentViewModel$navigateTo$1$1", f = "HatchPauseEnrollmentViewModel.kt", l = {180}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentViewModel$navigateTo$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03401 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ HatchPauseEnrollmentDestination $destination;
            public final /* synthetic */ String $hatchlingId;
            public int label;
            public final /* synthetic */ HatchPauseEnrollmentViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03401(HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel, String str, HatchPauseEnrollmentDestination hatchPauseEnrollmentDestination, HtJ<? super C03401> htJ) {
                super(2, htJ);
                this.this$0 = hatchPauseEnrollmentViewModel;
                this.$hatchlingId = str;
                this.$destination = hatchPauseEnrollmentDestination;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C03401(this.this$0, this.$hatchlingId, this.$destination, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchPauseEnrollmentFlowStore hatchPauseEnrollmentFlowStore = this.this$0.store;
                    String str = this.$hatchlingId;
                    String key = this.$destination.getKey();
                    this.label = 1;
                    if (hatchPauseEnrollmentFlowStore.setDestination(str, key, this) == enumC10460Hji) {
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
                return ((C03401) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134241(String str, HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel, HatchPauseEnrollmentDestination hatchPauseEnrollmentDestination, HtJ<? super C134241> htJ) {
            super(2, htJ);
            this.$hatchlingId = str;
            this.this$0 = hatchPauseEnrollmentViewModel;
            this.$destination = hatchPauseEnrollmentDestination;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C134241(this.$hatchlingId, this.this$0, this.$destination, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    C78T c78tA0y = AnonymousClass001.A0y();
                    C03401 c03401 = new C03401(this.this$0, this.$hatchlingId, this.$destination, null);
                    this.label = 1;
                    if (GAo.A00(this, c78tA0y, c03401) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
            } catch (Exception e) {
                CFK.A08(HatchPauseEnrollmentViewModel.TAG, FGI.A0M("Failed to save destination for hatchling ", this.$hatchlingId), e);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C134241) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentViewModel$onBiometricAuthSucceeded$1", f = "HatchPauseEnrollmentViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentViewModel$onBiometricAuthSucceeded$1, reason: invalid class name and case insensitive filesystem */
    public final class C134251 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $hatchlingId;
        public int label;
        public final /* synthetic */ HatchPauseEnrollmentViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134251(String str, HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel, HtJ<? super C134251> htJ) {
            super(2, htJ);
            this.$hatchlingId = str;
            this.this$0 = hatchPauseEnrollmentViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C134251(this.$hatchlingId, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            try {
                this.this$0.completeBiometricEnrollment(HatchBiometricPassphraseEncryptor.INSTANCE.getEncryptCipher(FGI.A0M("hulk_", this.$hatchlingId)));
            } catch (Exception e) {
                CFK.A08(HatchPauseEnrollmentViewModel.TAG, "Failed to complete enrollment after auth", e);
                BLG<EnrollmentState> blg = this.this$0._enrollmentState;
                String message = e.getMessage();
                if (message == null) {
                    message = "Enrollment failed";
                }
                AnonymousClass002.A1I(blg, new EnrollmentState.Failed(message));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C134251) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentViewModel$onBiometricDecryptionAuthSucceeded$1", f = "HatchPauseEnrollmentViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentViewModel$onBiometricDecryptionAuthSucceeded$1, reason: invalid class name and case insensitive filesystem */
    public final class C134261 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ EnrollmentData $enrollment;
        public int label;
        public final /* synthetic */ HatchPauseEnrollmentViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134261(EnrollmentData enrollmentData, HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel, HtJ<? super C134261> htJ) {
            super(2, htJ);
            this.$enrollment = enrollmentData;
            this.this$0 = hatchPauseEnrollmentViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C134261(this.$enrollment, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            try {
                HatchBiometricPassphraseEncryptor hatchBiometricPassphraseEncryptor = HatchBiometricPassphraseEncryptor.INSTANCE;
                EnrollmentData enrollmentData = this.$enrollment;
                this.this$0.completeBiometricDecryption(hatchBiometricPassphraseEncryptor.getDecryptCipher(enrollmentData.keyId, enrollmentData.encryptedPassphrase));
            } catch (Exception e) {
                CFK.A08(HatchPauseEnrollmentViewModel.TAG, "Failed to complete decryption after auth", e);
                BLG<DecryptionState> blg = this.this$0._decryptionState;
                String message = e.getMessage();
                if (message == null) {
                    message = "Decryption failed";
                }
                AnonymousClass002.A1I(blg, new DecryptionState.Failed(message));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C134261) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pause.HatchPauseEnrollmentViewModel$preparePause$1", f = "HatchPauseEnrollmentViewModel.kt", l = {MC.mwa_help_and_support.__CONFIG__, 383}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pause.HatchPauseEnrollmentViewModel$preparePause$1, reason: invalid class name and case insensitive filesystem */
    public final class C134271 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $hatchlingId;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134271(String str, HtJ<? super C134271> htJ) {
            super(2, htJ);
            this.$hatchlingId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchPauseEnrollmentViewModel.this.new C134271(this.$hatchlingId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            BLG<DecryptionState> blg;
            DecryptionState ready;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (Exception e) {
                CFK.A08(HatchPauseEnrollmentViewModel.TAG, "Failed to prepare lock", e);
                BLG<DecryptionState> blg2 = HatchPauseEnrollmentViewModel.this._decryptionState;
                String message = e.getMessage();
                if (message == null) {
                    message = "Decryption failed";
                }
                AnonymousClass001.A1E(blg2, null, new DecryptionState.Failed(message));
            }
            if (i == 0) {
                Hwg.A00(obj);
                C78T c78tA0y = AnonymousClass001.A0y();
                HatchPauseEnrollmentViewModel$preparePause$1$enrollment$1 hatchPauseEnrollmentViewModel$preparePause$1$enrollment$1 = new HatchPauseEnrollmentViewModel$preparePause$1$enrollment$1(HatchPauseEnrollmentViewModel.this, this.$hatchlingId, null);
                this.label = 1;
                obj = GAo.A00(this, c78tA0y, hatchPauseEnrollmentViewModel$preparePause$1$enrollment$1);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    blg = HatchPauseEnrollmentViewModel.this._decryptionState;
                    ready = new DecryptionState.Ready((byte[]) obj);
                    blg.Af8(ready);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            EnrollmentData enrollmentData = (EnrollmentData) obj;
            if (enrollmentData == null) {
                AnonymousClass001.A1E(HatchPauseEnrollmentViewModel.this._decryptionState, null, new DecryptionState.Failed("No enrollment data found"));
                return Unit.INSTANCE;
            }
            if (enrollmentData.requiresBiometric) {
                HatchPauseEnrollmentViewModel.this.decryptionEnrollment = enrollmentData;
                try {
                    AnonymousClass001.A1E(HatchPauseEnrollmentViewModel.this._decryptionState, null, new DecryptionState.AwaitingBiometric(HatchBiometricPassphraseEncryptor.INSTANCE.getDecryptCipher(enrollmentData.keyId, enrollmentData.encryptedPassphrase)));
                } catch (UserNotAuthenticatedException unused) {
                    blg = HatchPauseEnrollmentViewModel.this._decryptionState;
                    ready = DecryptionState.AwaitingBiometricAuthOnly.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            C78T c78tA0y2 = AnonymousClass001.A0y();
            HatchPauseEnrollmentViewModel$preparePause$1$derivedBytes$1 hatchPauseEnrollmentViewModel$preparePause$1$derivedBytes$1 = new HatchPauseEnrollmentViewModel$preparePause$1$derivedBytes$1(enrollmentData, null);
            this.L$0 = null;
            this.label = 2;
            obj = GAo.A00(this, c78tA0y2, hatchPauseEnrollmentViewModel$preparePause$1$derivedBytes$1);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
            blg = HatchPauseEnrollmentViewModel.this._decryptionState;
            ready = new DecryptionState.Ready((byte[]) obj);
            blg.Af8(ready);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C134271) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void completeBiometricDecryption(Cipher cipher) {
        C7384Etj.A0Y(cipher, 0);
        EnrollmentData enrollmentData = this.decryptionEnrollment;
        if (enrollmentData != null) {
            AnonymousClass001.A1J(new C134171(cipher, enrollmentData, this, null), AEu.A00(this));
        }
    }

    public final void completeBiometricEnrollment(Cipher cipher) {
        String str;
        C7384Etj.A0Y(cipher, 0);
        String str2 = this.enrollmentHatchlingId;
        if (str2 == null || (str = this.enrollmentPassphrase) == null) {
            return;
        }
        this._enrollmentState.Af8(EnrollmentState.Hashing.INSTANCE);
        AnonymousClass001.A1J(new C134181(str2, this, cipher, str, null), AEu.A00(this));
    }

    public final void navigateTo(HatchPauseEnrollmentDestination hatchPauseEnrollmentDestination) {
        C7384Etj.A0Y(hatchPauseEnrollmentDestination, 0);
        HtJ htJA14 = C3cI.A14(this._currentDestination, hatchPauseEnrollmentDestination);
        String strCurrentHatchlingId = currentHatchlingId();
        if (strCurrentHatchlingId != null) {
            AnonymousClass001.A1J(new C134241(strCurrentHatchlingId, this, hatchPauseEnrollmentDestination, htJA14), AEu.A00(this));
        }
    }

    public final void onBiometricError(String str) {
        C7384Etj.A0Y(str, 0);
        EnrollmentState value = this._enrollmentState.getValue();
        DecryptionState value2 = this._decryptionState.getValue();
        if ((value instanceof EnrollmentState.AwaitingBiometric) || (value instanceof EnrollmentState.AwaitingBiometricAuthOnly)) {
            onEnrollmentFailed(str);
        } else if ((value2 instanceof DecryptionState.AwaitingBiometric) || (value2 instanceof DecryptionState.AwaitingBiometricAuthOnly)) {
            onDecryptionFailed(str);
        }
    }

    public final void onDecryptionFailed(String str) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass002.A1I(this._decryptionState, new DecryptionState.Failed(str));
    }

    public final void onEnrollmentFailed(String str) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass002.A1I(this._enrollmentState, new EnrollmentState.Failed(str));
    }

    public final void preparePause(String str) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass001.A1J(new C134271(str, null), AEu.A00(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object clear(java.lang.String r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.pause.HatchPauseEnrollmentViewModel.C134131
            if (r0 == 0) goto L44
            r5 = r8
            com.facebook.aura.pause.HatchPauseEnrollmentViewModel$clear$1 r5 = (com.facebook.aura.pause.HatchPauseEnrollmentViewModel.C134131) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L4a
            X.Hwg.A00(r1)
        L21:
            X.BLG<com.facebook.aura.pause.HatchPauseEnrollmentDestination> r1 = r6._currentDestination
            com.facebook.aura.pause.HatchPauseEnrollmentDestination$Overview r0 = com.facebook.aura.pause.HatchPauseEnrollmentDestination.Overview.INSTANCE
            r1.Af8(r0)
            X.BLG<java.lang.String> r0 = r6._passphrase
            r0.Af8(r3)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L30:
            X.78T r1 = X.AnonymousClass002.A0s(r1)
            com.facebook.aura.pause.HatchPauseEnrollmentViewModel$clear$2 r0 = new com.facebook.aura.pause.HatchPauseEnrollmentViewModel$clear$2
            r0.<init>(r7, r3)
            r5.L$0 = r3
            r5.label = r2
            java.lang.Object r0 = X.GAo.A00(r5, r1, r0)
            if (r0 != r4) goto L21
            return r4
        L44:
            com.facebook.aura.pause.HatchPauseEnrollmentViewModel$clear$1 r5 = new com.facebook.aura.pause.HatchPauseEnrollmentViewModel$clear$1
            r5.<init>(r8)
            goto L12
        L4a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pause.HatchPauseEnrollmentViewModel.clear(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object clearTemporaryData(java.lang.String r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.pause.HatchPauseEnrollmentViewModel.C134151
            if (r0 == 0) goto L44
            r5 = r8
            com.facebook.aura.pause.HatchPauseEnrollmentViewModel$clearTemporaryData$1 r5 = (com.facebook.aura.pause.HatchPauseEnrollmentViewModel.C134151) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L4a
            X.Hwg.A00(r1)
        L21:
            X.BLG<com.facebook.aura.pause.HatchPauseEnrollmentDestination> r1 = r6._currentDestination
            com.facebook.aura.pause.HatchPauseEnrollmentDestination$Overview r0 = com.facebook.aura.pause.HatchPauseEnrollmentDestination.Overview.INSTANCE
            r1.Af8(r0)
            X.BLG<java.lang.String> r0 = r6._passphrase
            r0.Af8(r3)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L30:
            X.78T r1 = X.AnonymousClass002.A0s(r1)
            com.facebook.aura.pause.HatchPauseEnrollmentViewModel$clearTemporaryData$2 r0 = new com.facebook.aura.pause.HatchPauseEnrollmentViewModel$clearTemporaryData$2
            r0.<init>(r7, r3)
            r5.L$0 = r3
            r5.label = r2
            java.lang.Object r0 = X.GAo.A00(r5, r1, r0)
            if (r0 != r4) goto L21
            return r4
        L44:
            com.facebook.aura.pause.HatchPauseEnrollmentViewModel$clearTemporaryData$1 r5 = new com.facebook.aura.pause.HatchPauseEnrollmentViewModel$clearTemporaryData$1
            r5.<init>(r8)
            goto L12
        L4a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pause.HatchPauseEnrollmentViewModel.clearTemporaryData(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final String currentHatchlingId() {
        return C3cH.A0a(HatchGatewayPrefsStore.Companion, this.userSession);
    }

    public final void dismissLockConfirmDialog() {
        AnonymousClass004.A1D(false, this._shouldShowPauseConfirmDialog);
    }

    public final void dismissUnpauseSheet() {
        AnonymousClass004.A1D(false, this._showUnpauseBottomSheet);
    }

    public final String ensurePassphrase() {
        String value = this._passphrase.getValue();
        if (value == null) {
            value = new String(HatchPassphraseGenerator.INSTANCE.generate(32), DCl.A05);
            AnonymousClass001.A1E(this._passphrase, null, value);
            String strCurrentHatchlingId = currentHatchlingId();
            if (strCurrentHatchlingId != null) {
                AnonymousClass001.A1J(new C134222(strCurrentHatchlingId, this, value, null), AEu.A00(this));
            }
        }
        return value;
    }

    public final C1BN<HatchPauseEnrollmentDestination> getCurrentDestination() {
        return this.currentDestination;
    }

    public final C1BN<DecryptionState> getDecryptionState() {
        return this.decryptionState;
    }

    public final C1BN<EnrollmentState> getEnrollmentState() {
        return this.enrollmentState;
    }

    public final C1BN<Boolean> getHasCheckedEnrollment() {
        return this.hasCheckedEnrollment;
    }

    public final C1BN<String> getPassphrase() {
        return this.passphrase;
    }

    public final C1BN<Boolean> getShouldShowPauseConfirmDialog() {
        return this.shouldShowPauseConfirmDialog;
    }

    public final C1BN<Boolean> getShowUnpauseBottomSheet() {
        return this.showUnpauseBottomSheet;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hasEnrollment(java.lang.String r7, X.HtJ<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.pause.HatchPauseEnrollmentViewModel.C134231
            if (r0 == 0) goto L36
            r5 = r8
            com.facebook.aura.pause.HatchPauseEnrollmentViewModel$hasEnrollment$1 r5 = (com.facebook.aura.pause.HatchPauseEnrollmentViewModel.C134231) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L36
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r0 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r3 = 1
            if (r1 == 0) goto L21
            if (r1 != r3) goto L3c
            X.Hwg.A00(r0)
        L20:
            return r0
        L21:
            X.78T r2 = X.AnonymousClass002.A0s(r0)
            r1 = 0
            com.facebook.aura.pause.HatchPauseEnrollmentViewModel$hasEnrollment$enrollment$1 r0 = new com.facebook.aura.pause.HatchPauseEnrollmentViewModel$hasEnrollment$enrollment$1
            r0.<init>(r6, r7, r1)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r0 = X.GAo.A00(r5, r2, r0)
            if (r0 != r4) goto L20
            return r4
        L36:
            com.facebook.aura.pause.HatchPauseEnrollmentViewModel$hasEnrollment$1 r5 = new com.facebook.aura.pause.HatchPauseEnrollmentViewModel$hasEnrollment$1
            r5.<init>(r8)
            goto L12
        L3c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pause.HatchPauseEnrollmentViewModel.hasEnrollment(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final boolean isUnpausing() {
        DecryptionState value = this._decryptionState.getValue();
        return (value instanceof DecryptionState.AwaitingBiometric) || (value instanceof DecryptionState.AwaitingBiometricAuthOnly);
    }

    public final void onBiometricAuthSucceeded() {
        String str = this.enrollmentHatchlingId;
        if (str == null || this.enrollmentPassphrase == null) {
            return;
        }
        AnonymousClass001.A1J(new C134251(str, this, null), AEu.A00(this));
    }

    public final void onBiometricDecryptionAuthSucceeded() {
        EnrollmentData enrollmentData = this.decryptionEnrollment;
        if (enrollmentData != null) {
            AnonymousClass001.A1J(new C134261(enrollmentData, this, null), AEu.A00(this));
        }
    }

    public final void onBiometricSuccess(Cipher cipher) {
        EnrollmentState value = this._enrollmentState.getValue();
        DecryptionState value2 = this._decryptionState.getValue();
        if (cipher != null) {
            if (value instanceof EnrollmentState.AwaitingBiometric) {
                completeBiometricEnrollment(cipher);
                return;
            } else if (value2 instanceof DecryptionState.AwaitingBiometric) {
                completeBiometricDecryption(cipher);
                return;
            }
        }
        if (value instanceof EnrollmentState.AwaitingBiometricAuthOnly) {
            onBiometricAuthSucceeded();
        } else if (value2 instanceof DecryptionState.AwaitingBiometricAuthOnly) {
            onBiometricDecryptionAuthSucceeded();
        }
    }

    public final void resetDecryptionState() {
        this._decryptionState.Af8(DecryptionState.Idle.INSTANCE);
        this.decryptionEnrollment = null;
    }

    public final void showPauseConfirmDialog() {
        AnonymousClass004.A1D(true, this._shouldShowPauseConfirmDialog);
    }

    public final void showUnpauseSheet() {
        AnonymousClass004.A1D(true, this._showUnpauseBottomSheet);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchPauseEnrollmentViewModel(HatchPauseEnrollmentFlowStore hatchPauseEnrollmentFlowStore, AbstractC3358CGz abstractC3358CGz) {
        boolean zA1b = AnonymousClass004.A1b(hatchPauseEnrollmentFlowStore, abstractC3358CGz);
        this.store = hatchPauseEnrollmentFlowStore;
        this.userSession = abstractC3358CGz;
        C9286GCn c9286GCnA01 = HnJ.A01(HatchPauseEnrollmentDestination.Overview.INSTANCE);
        this._currentDestination = c9286GCnA01;
        this.currentDestination = c9286GCnA01;
        C9286GCn c9286GCnA13 = C3cG.A13();
        this._passphrase = c9286GCnA13;
        this.passphrase = c9286GCnA13;
        C9286GCn c9286GCnA012 = HnJ.A01(EnrollmentState.Idle.INSTANCE);
        this._enrollmentState = c9286GCnA012;
        this.enrollmentState = c9286GCnA012;
        C9286GCn c9286GCnA013 = HnJ.A01(DecryptionState.Idle.INSTANCE);
        this._decryptionState = c9286GCnA013;
        this.decryptionState = c9286GCnA013;
        Boolean boolValueOf = Boolean.valueOf(zA1b);
        C9286GCn c9286GCnA14 = C3cG.A14(boolValueOf);
        this._shouldShowPauseConfirmDialog = c9286GCnA14;
        this.shouldShowPauseConfirmDialog = c9286GCnA14;
        C9286GCn c9286GCnA142 = C3cG.A14(boolValueOf);
        this._hasCheckedEnrollment = c9286GCnA142;
        this.hasCheckedEnrollment = c9286GCnA142;
        C9286GCn c9286GCnA143 = C3cG.A14(boolValueOf);
        this._showUnpauseBottomSheet = c9286GCnA143;
        this.showUnpauseBottomSheet = c9286GCnA143;
        BLL bllA00 = AEu.A00(this);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        C6ys c6ys = C6ys.A00;
        Integer num = C79.A00;
        GAo.A02(num, c6ys, new AnonymousClass2(null), AnonymousClass001.A0e(this, num, c6ys, anonymousClass1, bllA00));
    }

    public final void enrollAndUnpause(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        String strA0l = AnonymousClass002.A0l(str2);
        this._enrollmentState.Af8(EnrollmentState.Hashing.INSTANCE);
        AnonymousClass001.A1J(new C134191(str, this, strA0l, null), AEu.A00(this));
    }

    public final void enrollWithBiometric(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.enrollmentHatchlingId = str;
        this.enrollmentPassphrase = AnonymousClass002.A0l(str2);
        AnonymousClass001.A1J(new C134201(str, this, null), AEu.A00(this));
    }

    public final void enrollWithoutBiometric(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        String strA0l = AnonymousClass002.A0l(str2);
        this._enrollmentState.Af8(EnrollmentState.Hashing.INSTANCE);
        AnonymousClass001.A1J(new C134211(str, this, strA0l, null), AEu.A00(this));
    }
}
