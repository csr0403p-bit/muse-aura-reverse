package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.C10650I0u;
import X.C3UX;
import X.C3cG;
import X.C3rb;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.F1E;
import X.G0V;
import X.G2j;
import X.GDB;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore;
import com.facebook.aura.partners.voice.infra.HatchVideoCrop;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$awaitPreparedAvatarLocked$1$adopted$1", f = "SessionController.kt", l = {4575}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class SessionController$awaitPreparedAvatarLocked$1$adopted$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HxE<? extends HatchVoiceVideoConfigStore.Snapshot, ? extends String>>, Object> {
    public final /* synthetic */ F1E $attempts;
    public final /* synthetic */ String $avatarStem;
    public final /* synthetic */ String $callId;
    public final /* synthetic */ String $owner;
    public final /* synthetic */ HatchVideoCrop $portraitCrop;
    public final /* synthetic */ boolean $stillShown;
    public int label;
    public final /* synthetic */ SessionController this$0;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$awaitPreparedAvatarLocked$1$adopted$1$2", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$awaitPreparedAvatarLocked$1$adopted$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G2j<HatchVoiceVideoConfigStore.Snapshot, String, Unit, HtJ<? super HxE<? extends HatchVoiceVideoConfigStore.Snapshot, ? extends String>>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(4, htJ);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(HatchVoiceVideoConfigStore.Snapshot snapshot, String str, Unit unit, HtJ<? super HxE<HatchVoiceVideoConfigStore.Snapshot, String>> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = snapshot;
            anonymousClass2.L$1 = str;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            Object obj3 = this.L$1;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return C3cG.A0r(obj2, obj3);
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Object invoke(HatchVoiceVideoConfigStore.Snapshot snapshot, String str, Unit unit, HtJ<? super HxE<? extends HatchVoiceVideoConfigStore.Snapshot, ? extends String>> htJ) {
            return invoke2(snapshot, str, unit, (HtJ<? super HxE<HatchVoiceVideoConfigStore.Snapshot, String>>) htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$awaitPreparedAvatarLocked$1$adopted$1$3", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$awaitPreparedAvatarLocked$1$adopted$1$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<HxE<? extends HatchVoiceVideoConfigStore.Snapshot, ? extends String>, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $callId;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$callId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$callId, htJ);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(HxE<? extends HatchVoiceVideoConfigStore.Snapshot, ? extends String> hxE, HtJ<? super Boolean> htJ) {
            return invoke2((HxE<HatchVoiceVideoConfigStore.Snapshot, String>) hxE, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HxE hxE = (HxE) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(C7384Etj.areEqual(hxE.second, this.$callId));
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(HxE<HatchVoiceVideoConfigStore.Snapshot, String> hxE, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass3) create(hxE, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$awaitPreparedAvatarLocked$1$adopted$1$4", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$awaitPreparedAvatarLocked$1$adopted$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<HxE<? extends HatchVoiceVideoConfigStore.Snapshot, ? extends String>, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ F1E $attempts;
        public final /* synthetic */ String $avatarStem;
        public final /* synthetic */ String $callId;
        public final /* synthetic */ String $owner;
        public final /* synthetic */ HatchVideoCrop $portraitCrop;
        public final /* synthetic */ boolean $stillShown;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ SessionController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(SessionController sessionController, F1E f1e, String str, String str2, HatchVideoCrop hatchVideoCrop, String str3, boolean z, HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
            this.this$0 = sessionController;
            this.$attempts = f1e;
            this.$owner = str;
            this.$callId = str2;
            this.$portraitCrop = hatchVideoCrop;
            this.$avatarStem = str3;
            this.$stillShown = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$attempts, this.$owner, this.$callId, this.$portraitCrop, this.$avatarStem, this.$stillShown, htJ);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(HxE<? extends HatchVoiceVideoConfigStore.Snapshot, ? extends String> hxE, HtJ<? super Boolean> htJ) {
            return invoke2((HxE<HatchVoiceVideoConfigStore.Snapshot, String>) hxE, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r1 = r11.L$0
                X.HxE r1 = (X.HxE) r1
                int r0 = r11.label
                if (r0 != 0) goto L71
                X.Hwg.A00(r12)
                A r0 = r1.first
                r10 = 0
                if (r0 == 0) goto L6c
                com.facebook.aura.partners.voice.session.impl.SessionController r8 = r11.this$0
                java.util.concurrent.locks.ReentrantLock r5 = r8.lock
                X.F1E r9 = r11.$attempts
                java.lang.String r4 = r11.$owner
                java.lang.String r7 = r11.$callId
                com.facebook.aura.partners.voice.infra.HatchVideoCrop r3 = r11.$portraitCrop
                java.lang.String r6 = r11.$avatarStem
                boolean r2 = r11.$stillShown
                r5.lock()
                int r0 = r9.element     // Catch: java.lang.Throwable -> L61
                r1 = 1
                int r0 = r0 + 1
                r9.element = r0     // Catch: java.lang.Throwable -> L61
                java.lang.String r0 = r8.currentSessionPinOwner     // Catch: java.lang.Throwable -> L61
                boolean r0 = X.C7384Etj.areEqual(r0, r4)     // Catch: java.lang.Throwable -> L61
                if (r0 == 0) goto L39
                boolean r0 = com.facebook.aura.partners.voice.session.impl.SessionController.access$adoptPreparedAvatarLocked(r8, r7, r4, r3, r6)     // Catch: java.lang.Throwable -> L61
                r4 = 1
                if (r0 != 0) goto L3a
            L39:
                r4 = 0
            L3a:
                if (r4 == 0) goto L49
                java.lang.String r1 = "swapped"
                if (r2 == 0) goto L46
                java.lang.String r0 = "wait"
            L42:
                com.facebook.aura.partners.voice.session.impl.SessionController.access$logCompletedDecision(r8, r7, r1, r0, r6)     // Catch: java.lang.Throwable -> L61
                goto L66
            L46:
                java.lang.String r0 = "identity"
                goto L42
            L49:
                int r3 = r9.element     // Catch: java.lang.Throwable -> L61
                if (r3 == r1) goto L51
                int r0 = r3 % 6
                if (r0 != 0) goto L66
            L51:
                java.lang.String r2 = "VoiceSessionController"
                java.lang.String r1 = "live_avatar.wait.retry avatar_stem=%s attempt=%d"
                if (r6 != 0) goto L59
                java.lang.String r6 = "none"
            L59:
                java.lang.Integer r0 = X.C3cG.A0R(r3)     // Catch: java.lang.Throwable -> L61
                X.CFK.A02(r6, r0, r2, r1)     // Catch: java.lang.Throwable -> L61
                goto L66
            L61:
                r0 = move-exception
                r5.unlock()
                throw r0
            L66:
                r5.unlock()
                if (r4 == 0) goto L6c
                r10 = 1
            L6c:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
                return r0
            L71:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController$awaitPreparedAvatarLocked$1$adopted$1.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(HxE<HatchVoiceVideoConfigStore.Snapshot, String> hxE, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass4) create(hxE, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionController$awaitPreparedAvatarLocked$1$adopted$1(SessionController sessionController, String str, F1E f1e, String str2, HatchVideoCrop hatchVideoCrop, String str3, boolean z, HtJ<? super SessionController$awaitPreparedAvatarLocked$1$adopted$1> htJ) {
        super(2, htJ);
        this.this$0 = sessionController;
        this.$callId = str;
        this.$attempts = f1e;
        this.$owner = str2;
        this.$portraitCrop = hatchVideoCrop;
        this.$avatarStem = str3;
        this.$stillShown = z;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SessionController$awaitPreparedAvatarLocked$1$adopted$1(this.this$0, this.$callId, this.$attempts, this.$owner, this.$portraitCrop, this.$avatarStem, this.$stillShown, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HxE<? extends HatchVoiceVideoConfigStore.Snapshot, ? extends String>> htJ) {
        return invoke2(c3ux, (HtJ<? super HxE<HatchVoiceVideoConfigStore.Snapshot, String>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            SessionController sessionController = this.this$0;
            C10650I0u c10650I0u = new C10650I0u(new AnonymousClass3(this.$callId, null), C3rb.A00(new AnonymousClass2(null), sessionController.videoConfigStore.updates, GDB.A01(new SessionController$awaitPreparedAvatarLocked$1$adopted$1$invokeSuspend$$inlined$map$1(sessionController.callMarker)), SessionControllerKt.pinRetryTicks()), 4);
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$attempts, this.$owner, this.$callId, this.$portraitCrop, this.$avatarStem, this.$stillShown, null);
            this.label = 1;
            obj = AbstractC9777Gfy.A01(this, anonymousClass4, c10650I0u);
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

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HxE<HatchVoiceVideoConfigStore.Snapshot, String>> htJ) {
        return ((SessionController$awaitPreparedAvatarLocked$1$adopted$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
