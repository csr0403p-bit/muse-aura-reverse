package com.facebook.aura.partners.voice.infra;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C06H;
import X.C10571Hud;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9258GBl;
import X.CFK;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAX;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzP;
import X.InterfaceC2261BLa;
import X.InterfaceC7549F2g;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.partners.voice.prefs.VoicePrefs;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import org.maplibre.android.R;

/* loaded from: classes2.dex */
public final class VoiceNuxRepository implements InterfaceC7549F2g {
    public static final long ACCOUNT_CHECK_TIMEOUT_MS = 1500;
    public static final Companion Companion = new Companion();
    public static final String TAG = "VoiceNuxRepository";
    public final SingleFlight accountCheck;
    public final AtomicInteger callChecksInFlight;
    public final C3UX scope;
    public final AbstractC3358CGz userSession;
    public final InterfaceC2261BLa writeLock;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceNuxRepository$checkNuxBeforeCall$1", f = "VoiceNuxRepository.kt", l = {44}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.infra.VoiceNuxRepository$checkNuxBeforeCall$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceNuxRepository.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                VoiceNuxRepository voiceNuxRepository = VoiceNuxRepository.this;
                this.label = 1;
                if (voiceNuxRepository.writeSeen(true, this) == enumC10460Hji) {
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
            return VoiceNuxRepository.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.infra.VoiceNuxRepository$checkNuxBeforeCall$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            VoiceNuxRepository.this.callChecksInFlight.decrementAndGet();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceNuxRepository$isSeenOnAccount$2", f = "VoiceNuxRepository.kt", l = {73, 74}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.infra.VoiceNuxRepository$isSeenOnAccount$2, reason: invalid class name and case insensitive filesystem */
    public final class C131282 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public int label;

        public C131282(HtJ<? super C131282> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceNuxRepository.this.new C131282(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchGatewayConnection gateway = HatchGatewayServiceManager.INSTANCE.getGateway(VoiceNuxRepository.this.userSession);
                this.label = 1;
                if (gateway.awaitConnected(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        Hwg.A00(obj);
                    }
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            VoiceNuxRepository voiceNuxRepository = VoiceNuxRepository.this;
            this.label = 2;
            obj = voiceNuxRepository.readSeenOnAccount(this);
            return obj == enumC10460Hji ? enumC10460Hji : obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return VoiceNuxRepository.this.new C131282(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceNuxRepository$markSeen$1", f = "VoiceNuxRepository.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.infra.VoiceNuxRepository$markSeen$1, reason: invalid class name and case insensitive filesystem */
    public final class C131291 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C131291(HtJ<? super C131291> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceNuxRepository.this.new C131291(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                VoiceNuxRepository voiceNuxRepository = VoiceNuxRepository.this;
                this.label = 1;
                if (voiceNuxRepository.writeSeen(true, this) == enumC10460Hji) {
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
            return VoiceNuxRepository.this.new C131291(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceNuxRepository", f = "VoiceNuxRepository.kt", l = {78, 84}, m = "readSeenOnAccount", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.infra.VoiceNuxRepository$readSeenOnAccount$1, reason: invalid class name and case insensitive filesystem */
    public final class C131301 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C131301(HtJ<? super C131301> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceNuxRepository.this.readSeenOnAccount(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceNuxRepository$readSeenOnAccount$2", f = "VoiceNuxRepository.kt", l = {87}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.infra.VoiceNuxRepository$readSeenOnAccount$2, reason: invalid class name and case insensitive filesystem */
    public final class C131312 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C131312(HtJ<? super C131312> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceNuxRepository.this.new C131312(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                VoiceNuxRepository voiceNuxRepository = VoiceNuxRepository.this;
                this.label = 1;
                if (voiceNuxRepository.writeSeen(true, this) == enumC10460Hji) {
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
            return VoiceNuxRepository.this.new C131312(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceNuxRepository", f = "VoiceNuxRepository.kt", l = {130, 104}, m = "writeSeen", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.infra.VoiceNuxRepository$writeSeen$1, reason: invalid class name and case insensitive filesystem */
    public final class C131321 extends HzP {
        public Object L$0;
        public Object L$1;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C131321(HtJ<? super C131321> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceNuxRepository.this.writeSeen(false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object isSeenOnAccount(HtJ<? super Boolean> htJ) {
        return GAX.A01(htJ, new C131282(null), 1500L);
    }

    private final VoiceNuxJson parse(String str) {
        Object objA0s;
        try {
            objA0s = (VoiceNuxJson) HatchJsonKt.HatchJson.A00(str, VoiceNuxJson$$serializer.INSTANCE);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        Throwable thA00 = HsJ.A00(objA0s);
        if (thA00 != null) {
            CFK.A0A(TAG, "Failed to parse the voice NUX state", thA00);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        return (VoiceNuxJson) objA0s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readSeenOnAccount(X.HtJ<? super java.lang.Boolean> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.facebook.aura.partners.voice.infra.VoiceNuxRepository.C131301
            if (r0 == 0) goto La0
            r7 = r10
            com.facebook.aura.partners.voice.infra.VoiceNuxRepository$readSeenOnAccount$1 r7 = (com.facebook.aura.partners.voice.infra.VoiceNuxRepository.C131301) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La0
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r5 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r8 = 2
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L54
            if (r0 == r4) goto L66
            if (r0 != r8) goto Lb8
            java.lang.Object r1 = r7.L$0
            X.Hwg.A00(r5)
        L26:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto La7
            int r0 = r5.length()
            if (r0 == 0) goto La7
            com.facebook.aura.partners.voice.infra.VoiceNuxJson r0 = r9.parse(r5)
            if (r0 == 0) goto La7
            java.lang.Boolean r0 = r0.voice_nux_seen
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto La7
            com.facebook.aura.partners.voice.prefs.VoicePrefs r1 = com.facebook.aura.partners.voice.prefs.VoicePrefs.INSTANCE
            X.CGz r0 = r9.userSession
            r1.setVoiceNuxSeen(r0)
            X.3UX r1 = r9.scope
            com.facebook.aura.partners.voice.infra.VoiceNuxRepository$readSeenOnAccount$2 r0 = new com.facebook.aura.partners.voice.infra.VoiceNuxRepository$readSeenOnAccount$2
            r0.<init>(r3)
            X.AnonymousClass001.A1J(r0, r1)
        L53:
            return r2
        L54:
            X.Hwg.A00(r5)
            com.facebook.aura.gateway.HatchFileOperations r2 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
            X.CGz r1 = r9.userSession
            r7.label = r4
            java.lang.String r0 = "user/voice_nux.json"
            java.lang.Object r5 = r2.readFile(r0, r1, r7)
            if (r5 != r6) goto L69
        L65:
            return r6
        L66:
            X.Hwg.A00(r5)
        L69:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L8b
            int r0 = r5.length()
            if (r0 <= 0) goto L8b
            com.facebook.aura.partners.voice.infra.VoiceNuxJson r0 = r9.parse(r5)
            if (r0 == 0) goto L8b
            java.lang.Boolean r2 = r0.voice_nux_seen
            if (r2 == 0) goto L8b
            boolean r0 = r2.booleanValue()
            if (r0 == 0) goto L53
            com.facebook.aura.partners.voice.prefs.VoicePrefs r1 = com.facebook.aura.partners.voice.prefs.VoicePrefs.INSTANCE
            X.CGz r0 = r9.userSession
            r1.setVoiceNuxSyncedToAccount(r0)
            return r2
        L8b:
            com.facebook.aura.gateway.HatchFileOperations r2 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
            X.CGz r1 = r9.userSession
            r7.L$0 = r5
            r7.L$1 = r3
            r7.label = r8
            java.lang.String r0 = "user/voice.json"
            java.lang.Object r0 = r2.readFile(r0, r1, r7)
            if (r0 == r6) goto L65
            r1 = r5
            r5 = r0
            goto L26
        La0:
            com.facebook.aura.partners.voice.infra.VoiceNuxRepository$readSeenOnAccount$1 r7 = new com.facebook.aura.partners.voice.infra.VoiceNuxRepository$readSeenOnAccount$1
            r7.<init>(r10)
            goto L12
        La7:
            boolean r0 = X.AnonymousClass002.A1X(r1)
            if (r5 != 0) goto Lae
            r4 = 0
        Lae:
            if (r0 == 0) goto Lb7
            if (r4 == 0) goto Lb7
            java.lang.Boolean r2 = X.AnonymousClass001.A0h()
            return r2
        Lb7:
            return r3
        Lb8:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.infra.VoiceNuxRepository.readSeenOnAccount(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a A[Catch: all -> 0x00b8, TryCatch #2 {all -> 0x00b8, blocks: (B:25:0x0081, B:26:0x0084, B:28:0x008a, B:31:0x0095, B:36:0x00aa, B:34:0x00a0), top: B:51:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeSeen(boolean r15, X.HtJ<? super java.lang.Boolean> r16) throws java.lang.Throwable {
        /*
            r14 = this;
            r3 = r16
            boolean r0 = r3 instanceof com.facebook.aura.partners.voice.infra.VoiceNuxRepository.C131321
            if (r0 == 0) goto L2b
            r13 = r3
            com.facebook.aura.partners.voice.infra.VoiceNuxRepository$writeSeen$1 r13 = (com.facebook.aura.partners.voice.infra.VoiceNuxRepository.C131321) r13
            int r2 = r13.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2b
            int r2 = r2 - r1
            r13.label = r2
        L14:
            java.lang.Object r0 = r13.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r13.label
            r10 = 0
            r3 = 2
            r12 = 0
            r9 = 1
            if (r1 == 0) goto L36
            if (r1 == r9) goto L48
            if (r1 != r3) goto L31
            boolean r15 = r13.Z$0
            java.lang.Object r2 = r13.L$0
            X.BLa r2 = (X.InterfaceC2261BLa) r2
            goto L81
        L2b:
            com.facebook.aura.partners.voice.infra.VoiceNuxRepository$writeSeen$1 r13 = new com.facebook.aura.partners.voice.infra.VoiceNuxRepository$writeSeen$1
            r13.<init>(r3)
            goto L14
        L31:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L36:
            X.Hwg.A00(r0)
            X.BLa r2 = r14.writeLock
            r13.L$0 = r2
            r13.Z$0 = r15
            r13.label = r9
            java.lang.Object r0 = r2.APs(r12, r13)
            if (r0 != r4) goto L51
            return r4
        L48:
            boolean r15 = r13.Z$0
            java.lang.Object r2 = r13.L$0
            X.BLa r2 = (X.InterfaceC2261BLa) r2
            X.Hwg.A00(r0)
        L51:
            if (r15 == 0) goto L54
            goto La0
        L54:
            X.9sU r5 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> Lb6
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)     // Catch: java.lang.Throwable -> Lb6
            com.facebook.aura.partners.voice.infra.VoiceNuxJson r1 = new com.facebook.aura.partners.voice.infra.VoiceNuxJson     // Catch: java.lang.Throwable -> Lb6
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lb6
            com.facebook.aura.partners.voice.infra.VoiceNuxJson$$serializer r0 = com.facebook.aura.partners.voice.infra.VoiceNuxJson$$serializer.INSTANCE     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r1 = r5.A02(r1, r0)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r0 = "\n"
            java.lang.String r7 = X.FGI.A0M(r1, r0)     // Catch: java.lang.Throwable -> Lb6
            com.facebook.aura.gateway.HatchFileOperations r5 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r6 = "user/voice_nux.json"
            X.CGz r8 = r14.userSession     // Catch: java.lang.Throwable -> Lb6
            r13.L$0 = r2     // Catch: java.lang.Throwable -> Lb6
            r13.L$1 = r12     // Catch: java.lang.Throwable -> Lb6
            r13.Z$0 = r15     // Catch: java.lang.Throwable -> Lb6
            r13.label = r3     // Catch: java.lang.Throwable -> Lb6
            r11 = r9
            java.lang.Object r0 = r5.writeFile(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> Lb4
            if (r0 != r4) goto L84
            goto Laf
        L81:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> Lb8
        L84:
            com.facebook.aura.gateway.HatchFileOperations$WriteResult r0 = (com.facebook.aura.gateway.HatchFileOperations.WriteResult) r0     // Catch: java.lang.Throwable -> Lb8
            boolean r3 = r0 instanceof com.facebook.aura.gateway.HatchFileOperations.WriteResult.Success     // Catch: java.lang.Throwable -> Lb8
            if (r3 != 0) goto L91
            java.lang.String r1 = "VoiceNuxRepository"
            java.lang.String r0 = "Failed to write user/voice_nux.json"
            X.CFK.A06(r1, r0)     // Catch: java.lang.Throwable -> Lb8
        L91:
            if (r3 == 0) goto L9c
            if (r15 == 0) goto L9c
            com.facebook.aura.partners.voice.prefs.VoicePrefs r1 = com.facebook.aura.partners.voice.prefs.VoicePrefs.INSTANCE     // Catch: java.lang.Throwable -> Lb8
            X.CGz r0 = r14.userSession     // Catch: java.lang.Throwable -> Lb8
            r1.setVoiceNuxSyncedToAccount(r0)     // Catch: java.lang.Throwable -> Lb8
        L9c:
            if (r3 == 0) goto Laa
            r10 = 1
            goto Laa
        La0:
            com.facebook.aura.partners.voice.prefs.VoicePrefs r1 = com.facebook.aura.partners.voice.prefs.VoicePrefs.INSTANCE     // Catch: java.lang.Throwable -> Lb8
            X.CGz r0 = r14.userSession     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r1.hasSeenVoiceNux(r0)     // Catch: java.lang.Throwable -> Lb8
            if (r0 != 0) goto L54
        Laa:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> Lb8
            goto Lb0
        Laf:
            return r4
        Lb0:
            r2.Ahe(r12)
            return r0
        Lb4:
            r0 = move-exception
            goto Lb9
        Lb6:
            r0 = move-exception
            goto Lb9
        Lb8:
            r0 = move-exception
        Lb9:
            r2.Ahe(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.infra.VoiceNuxRepository.writeSeen(boolean, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.accountCheck.clearAndCancelAll();
        Hxb.A03(null, this.scope);
    }

    public final boolean isCheckingBeforeCall() {
        return AnonymousClass002.A1N(this.callChecksInFlight.get());
    }

    public final void markSeen() {
        VoicePrefs.INSTANCE.setVoiceNuxSeen(this.userSession);
        AnonymousClass001.A1J(new C131291(null), this.scope);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readSeenOnAccountAndCache$fbandroid_express_aura_java_com_facebook_aura_partners_voice_infra_infra(X.HtJ<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.partners.voice.infra.VoiceNuxRepository$readSeenOnAccountAndCache$1
            if (r0 == 0) goto L3a
            r4 = r6
            com.facebook.aura.partners.voice.infra.VoiceNuxRepository$readSeenOnAccountAndCache$1 r4 = (com.facebook.aura.partners.voice.infra.VoiceNuxRepository$readSeenOnAccountAndCache$1) r4
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
            if (r1 != r0) goto L40
            X.Hwg.A00(r3)
        L20:
            boolean r0 = X.C3cG.A1P(r3, r0)
            if (r0 == 0) goto L2d
            com.facebook.aura.partners.voice.prefs.VoicePrefs r1 = com.facebook.aura.partners.voice.prefs.VoicePrefs.INSTANCE
            X.CGz r0 = r5.userSession
            r1.setVoiceNuxSeen(r0)
        L2d:
            return r3
        L2e:
            X.Hwg.A00(r3)
            r4.label = r0
            java.lang.Object r3 = r5.readSeenOnAccount(r4)
            if (r3 != r2) goto L20
            return r2
        L3a:
            com.facebook.aura.partners.voice.infra.VoiceNuxRepository$readSeenOnAccountAndCache$1 r4 = new com.facebook.aura.partners.voice.infra.VoiceNuxRepository$readSeenOnAccountAndCache$1
            r4.<init>(r5, r6)
            goto L12
        L40:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.infra.VoiceNuxRepository.readSeenOnAccountAndCache$fbandroid_express_aura_java_com_facebook_aura_partners_voice_infra_infra(X.HtJ):java.lang.Object");
    }

    public final Object resetOnAccount(HtJ<? super Boolean> htJ) {
        VoicePrefs.INSTANCE.clearVoiceNuxSeen(this.userSession);
        return writeSeen(false, htJ);
    }

    public final class Companion {
        public final VoiceNuxRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (VoiceNuxRepository) abstractC3358CGz.A03(VoiceNuxRepository.class, new VoiceNuxRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public VoiceNuxRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.scope = C3cH.A0w();
        this.writeLock = new C9258GBl();
        this.accountCheck = C3cH.A0M();
        this.callChecksInFlight = new AtomicInteger();
    }

    public final void checkNuxBeforeCall(Function0<Unit> function0, Function0<Unit> function02) {
        AnonymousClass003.A0u(function0, function02);
        VoicePrefs voicePrefs = VoicePrefs.INSTANCE;
        if (!voicePrefs.hasSeenVoiceNux(this.userSession)) {
            this.callChecksInFlight.incrementAndGet();
            AnonymousClass001.A11(new VoiceNuxRepository$checkNuxBeforeCall$check$1(this, function02, function0, null), this.scope).AO5(new AnonymousClass2());
        } else {
            if (!voicePrefs.isVoiceNuxSyncedToAccount(this.userSession)) {
                AnonymousClass001.A1J(new AnonymousClass1(null), this.scope);
            }
            function0.invoke();
        }
    }

    public /* synthetic */ VoiceNuxRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
