package com.facebook.aura.partners.voice.uicontrol;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C06H;
import X.C7384Etj;
import X.C7438Evz;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class VoiceUiControlSink {
    public static final Companion Companion = new Companion();
    public VoiceControlHandler voiceControlHandler;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink$publishCallAvatarUpdate$2", f = "VoiceUiControlSink.kt", l = {120}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink$publishCallAvatarUpdate$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<VoiceControlHandler, HtJ<? super VoiceControlHandler.Result>, Object> {
        public final /* synthetic */ CallAvatarUpdate $update;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CallAvatarUpdate callAvatarUpdate, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$update = callAvatarUpdate;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$update, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            VoiceControlHandler voiceControlHandler = (VoiceControlHandler) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                CallAvatarUpdate callAvatarUpdate = this.$update;
                this.L$0 = null;
                this.label = 1;
                obj = voiceControlHandler.applyCallAvatarUpdate(callAvatarUpdate, this);
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

        @Override // X.G0V
        public final Object invoke(VoiceControlHandler voiceControlHandler, HtJ<? super VoiceControlHandler.Result> htJ) {
            return ((AnonymousClass2) create(voiceControlHandler, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink$publishEndVoiceCall$2", f = "VoiceUiControlSink.kt", l = {115}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink$publishEndVoiceCall$2, reason: invalid class name and case insensitive filesystem */
    public final class C133322 extends AbstractC07127nr implements G0V<VoiceControlHandler, HtJ<? super VoiceControlHandler.Result>, Object> {
        public final /* synthetic */ EndVoiceCallRequest $request;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133322(EndVoiceCallRequest endVoiceCallRequest, HtJ<? super C133322> htJ) {
            super(2, htJ);
            this.$request = endVoiceCallRequest;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C133322 c133322 = new C133322(this.$request, htJ);
            c133322.L$0 = obj;
            return c133322;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            VoiceControlHandler voiceControlHandler = (VoiceControlHandler) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                EndVoiceCallRequest endVoiceCallRequest = this.$request;
                this.L$0 = null;
                this.label = 1;
                obj = voiceControlHandler.endCall(endVoiceCallRequest, this);
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

        @Override // X.G0V
        public final Object invoke(VoiceControlHandler voiceControlHandler, HtJ<? super VoiceControlHandler.Result> htJ) {
            return ((C133322) create(voiceControlHandler, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink$publishMuteVoice$2, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C133332 extends C7438Evz implements G0V {
        public static final C133332 INSTANCE = new C133332();

        public C133332() {
            super(2, VoiceControlHandler.class, "mute", "mute(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final Object invoke(VoiceControlHandler voiceControlHandler, HtJ<? super VoiceControlHandler.Result> htJ) {
            return voiceControlHandler.mute(htJ);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((VoiceControlHandler) obj).mute((HtJ) obj2);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink$publishReconnectVoiceCall$2", f = "VoiceUiControlSink.kt", l = {94}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink$publishReconnectVoiceCall$2, reason: invalid class name and case insensitive filesystem */
    public final class C133342 extends AbstractC07127nr implements G0V<VoiceControlHandler, HtJ<? super VoiceControlHandler.Result>, Object> {
        public final /* synthetic */ ReconnectVoiceCallRequest $request;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133342(ReconnectVoiceCallRequest reconnectVoiceCallRequest, HtJ<? super C133342> htJ) {
            super(2, htJ);
            this.$request = reconnectVoiceCallRequest;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C133342 c133342 = new C133342(this.$request, htJ);
            c133342.L$0 = obj;
            return c133342;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            VoiceControlHandler voiceControlHandler = (VoiceControlHandler) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ReconnectVoiceCallRequest reconnectVoiceCallRequest = this.$request;
                this.L$0 = null;
                this.label = 1;
                obj = voiceControlHandler.reconnectCall(reconnectVoiceCallRequest, this);
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

        @Override // X.G0V
        public final Object invoke(VoiceControlHandler voiceControlHandler, HtJ<? super VoiceControlHandler.Result> htJ) {
            return ((C133342) create(voiceControlHandler, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink$publishSetLiveAvatar$2", f = "VoiceUiControlSink.kt", l = {89}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink$publishSetLiveAvatar$2, reason: invalid class name and case insensitive filesystem */
    public final class C133352 extends AbstractC07127nr implements G0V<VoiceControlHandler, HtJ<? super VoiceControlHandler.Result>, Object> {
        public final /* synthetic */ boolean $enabled;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133352(boolean z, HtJ<? super C133352> htJ) {
            super(2, htJ);
            this.$enabled = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C133352 c133352 = new C133352(this.$enabled, htJ);
            c133352.L$0 = obj;
            return c133352;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            VoiceControlHandler voiceControlHandler = (VoiceControlHandler) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                boolean z = this.$enabled;
                this.L$0 = null;
                this.label = 1;
                obj = voiceControlHandler.setLiveAvatar(z, this);
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

        @Override // X.G0V
        public final Object invoke(VoiceControlHandler voiceControlHandler, HtJ<? super VoiceControlHandler.Result> htJ) {
            return ((C133352) create(voiceControlHandler, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink", f = "VoiceUiControlSink.kt", l = {102, 110}, m = "routeVoiceControl", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink$routeVoiceControl$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceUiControlSink.this.routeVoiceControl(null, this);
        }
    }

    public final Object publishCallAvatarUpdate(CallAvatarUpdate callAvatarUpdate, HtJ<? super VoiceControlHandler.Result> htJ) {
        return routeVoiceControl(new AnonymousClass2(callAvatarUpdate, null), htJ);
    }

    public final Object publishEndVoiceCall(EndVoiceCallRequest endVoiceCallRequest, HtJ<? super VoiceControlHandler.Result> htJ) {
        return routeVoiceControl(new C133322(endVoiceCallRequest, null), htJ);
    }

    public final Object publishReconnectVoiceCall(ReconnectVoiceCallRequest reconnectVoiceCallRequest, HtJ<? super VoiceControlHandler.Result> htJ) {
        return routeVoiceControl(new C133342(reconnectVoiceCallRequest, null), htJ);
    }

    public final Object publishSetLiveAvatar(boolean z, HtJ<? super VoiceControlHandler.Result> htJ) {
        return routeVoiceControl(new C133352(z, null), htJ);
    }

    public final synchronized void registerVoiceControlHandler(VoiceControlHandler voiceControlHandler) {
        C7384Etj.A0Y(voiceControlHandler, 0);
        this.voiceControlHandler = voiceControlHandler;
    }

    public final synchronized void unregisterVoiceControlHandler(VoiceControlHandler voiceControlHandler) {
        C7384Etj.A0Y(voiceControlHandler, 0);
        if (this.voiceControlHandler == voiceControlHandler) {
            this.voiceControlHandler = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object routeVoiceControl(X.G0V<? super com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler, ? super X.HtJ<? super com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler.Result>, ? extends java.lang.Object> r7, X.HtJ<? super com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler.Result> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink.AnonymousClass1
            if (r0 == 0) goto L61
            r5 = r8
            com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink$routeVoiceControl$1 r5 = (com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L61
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r2 = r5.label
            r3 = 2
            r0 = 1
            if (r2 == 0) goto L24
            if (r2 == r0) goto L3a
            if (r2 != r3) goto L67
            X.Hwg.A00(r1)
        L23:
            return r1
        L24:
            X.Hwg.A00(r1)
            monitor-enter(r6)
            com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler r2 = r6.voiceControlHandler     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r6)
            if (r2 == 0) goto L6c
            r5.L$0 = r7
            r5.L$1 = r2
            r5.label = r0
            java.lang.Object r1 = r7.invoke(r2, r5)
            if (r1 != r4) goto L43
            return r4
        L3a:
            java.lang.Object r2 = r5.L$1
            java.lang.Object r7 = r5.L$0
            X.G0V r7 = (X.G0V) r7
            X.Hwg.A00(r1)
        L43:
            com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler$Result r0 = com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler.Result.NO_ACTIVE_CALL
            if (r1 != r0) goto L23
            monitor-enter(r6)
            com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler r1 = r6.voiceControlHandler     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r6)
            if (r1 == 0) goto L6c
            if (r1 == r2) goto L6c
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.L$3 = r0
            r5.label = r3
            java.lang.Object r1 = r7.invoke(r1, r5)
            if (r1 != r4) goto L23
            return r4
        L61:
            com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink$routeVoiceControl$1 r5 = new com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink$routeVoiceControl$1
            r5.<init>(r8)
            goto L12
        L67:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L6c:
            com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler$Result r1 = com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler.Result.NO_ACTIVE_CALL
            return r1
        L6f:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.uicontrol.VoiceUiControlSink.routeVoiceControl(X.G0V, X.HtJ):java.lang.Object");
    }

    public final Object publishMuteVoice(HtJ<? super VoiceControlHandler.Result> htJ) {
        return routeVoiceControl(C133332.INSTANCE, htJ);
    }

    public final class Companion {
        public final VoiceUiControlSink getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (VoiceUiControlSink) abstractC3358CGz.A03(VoiceUiControlSink.class, VoiceUiControlSink$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ VoiceUiControlSink(C06H c06h) {
    }

    public VoiceUiControlSink() {
    }
}
