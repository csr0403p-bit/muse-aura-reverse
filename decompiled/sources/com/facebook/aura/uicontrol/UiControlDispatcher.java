package com.facebook.aura.uicontrol;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.feed.view.FeedEditHapticsKt;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.json.ClientInvokeResultParamsJson;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.uicontrol.UiAction;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class UiControlDispatcher {
    public static final Companion Companion = new Companion();
    public final Function0<String> clientId;
    public final Function0<Boolean> isNavigationVisible;
    public final G0U<String, Unit> publishChatTheme;
    public final G0U<String, Unit> publishNavigation;
    public final G0U<UiSuggestion, Boolean> publishSuggestion;
    public final G0U<UiAction, Unit> publishTabLightup;
    public final G0V<ClientInvokeResultParamsJson, HtJ<? super Boolean>, Object> sendReply;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.uicontrol.UiControlDispatcher", f = "UiControlDispatcher.kt", l = {91, 97, 107}, m = "dispatch", v = 2)
    /* renamed from: com.facebook.aura.uicontrol.UiControlDispatcher$dispatch$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UiControlDispatcher.this.dispatch(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.uicontrol.UiControlDispatcher$dispatch$2", f = "UiControlDispatcher.kt", l = {91}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.uicontrol.UiControlDispatcher$dispatch$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $commandId;
        public final /* synthetic */ String $invokeId;
        public final /* synthetic */ String $paramsJson;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, String str3, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$commandId = str;
            this.$invokeId = str2;
            this.$paramsJson = str3;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return UiControlDispatcher.this.new AnonymousClass2(this.$commandId, this.$invokeId, this.$paramsJson, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                UiControlDispatcher uiControlDispatcher = UiControlDispatcher.this;
                String str = this.$commandId;
                String str2 = this.$invokeId;
                String str3 = this.$paramsJson;
                this.label = 1;
                if (uiControlDispatcher.execute(str, str2, str3, this) == enumC10460Hji) {
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
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.uicontrol.UiControlDispatcher", f = "UiControlDispatcher.kt", l = {121, 132, 139, VoiceCallForegroundService.AVATAR_TARGET_PX, 145, 146, 153, 158, 170, 172, FeedEditHapticsKt.ZIP_PULSE_AMPLITUDE, 182}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.uicontrol.UiControlDispatcher$execute$1, reason: invalid class name and case insensitive filesystem */
    public final class C142581 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C142581(HtJ<? super C142581> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UiControlDispatcher.this.execute(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.uicontrol.UiControlDispatcher", f = "UiControlDispatcher.kt", l = {221, 222, 227}, m = "handOff", v = 2)
    /* renamed from: com.facebook.aura.uicontrol.UiControlDispatcher$handOff$1, reason: invalid class name and case insensitive filesystem */
    public final class C142591 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C142591(HtJ<? super C142591> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UiControlDispatcher.this.handOff(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.uicontrol.UiControlDispatcher", f = "UiControlDispatcher.kt", l = {199, 208, 210, 212}, m = "handle", v = 2)
    /* renamed from: com.facebook.aura.uicontrol.UiControlDispatcher$handle$1, reason: invalid class name and case insensitive filesystem */
    public final class C142601 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C142601(HtJ<? super C142601> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UiControlDispatcher.this.handle(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.uicontrol.UiControlDispatcher", f = "UiControlDispatcher.kt", l = {250}, m = "replyFailure", v = 2)
    /* renamed from: com.facebook.aura.uicontrol.UiControlDispatcher$replyFailure$1, reason: invalid class name and case insensitive filesystem */
    public final class C142611 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C142611(HtJ<? super C142611> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UiControlDispatcher.this.replyFailure(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.uicontrol.UiControlDispatcher", f = "UiControlDispatcher.kt", l = {237}, m = "replySuccess", v = 2)
    /* renamed from: com.facebook.aura.uicontrol.UiControlDispatcher$replySuccess$1, reason: invalid class name and case insensitive filesystem */
    public final class C142621 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C142621(HtJ<? super C142621> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UiControlDispatcher.this.replySuccess(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object replyFailure(java.lang.String r14, java.lang.String r15, java.lang.String r16, X.HtJ<? super kotlin.Unit> r17) {
        /*
            r13 = this;
            r2 = r15
            r11 = r14
            r4 = r17
            boolean r0 = r4 instanceof com.facebook.aura.uicontrol.UiControlDispatcher.C142611
            if (r0 == 0) goto L84
            r8 = r4
            com.facebook.aura.uicontrol.UiControlDispatcher$replyFailure$1 r8 = (com.facebook.aura.uicontrol.UiControlDispatcher.C142611) r8
            int r3 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L84
            int r3 = r3 - r1
            r8.label = r3
        L16:
            java.lang.Object r1 = r8.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r8.label
            java.lang.String r6 = " code="
            r5 = 8
            java.lang.String r4 = "UiControlDispatcher"
            r3 = 1
            if (r0 == 0) goto L48
            if (r0 != r3) goto L8a
            java.lang.Object r2 = r8.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r11 = r8.L$0
            java.lang.String r11 = (java.lang.String) r11
            X.Hwg.A00(r1)
        L32:
            boolean r0 = X.AnonymousClass001.A1X(r1)
            if (r0 != 0) goto L45
            java.lang.String r1 = X.BQG.A17(r11, r5)
            java.lang.String r0 = "ui.* reply send failed invokeId="
            java.lang.String r0 = X.FGI.A0d(r0, r1, r6, r2)
            X.CFK.A06(r4, r0)
        L45:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L48:
            X.Hwg.A00(r1)
            java.lang.String r1 = X.BQG.A17(r14, r5)
            java.lang.String r0 = "ui.* reply failed invokeId="
            java.lang.String r0 = X.FGI.A0d(r0, r1, r6, r15)
            X.CFK.A05(r4, r0)
            X.G0V<com.facebook.aura.nodes.json.ClientInvokeResultParamsJson, X.HtJ<? super java.lang.Boolean>, java.lang.Object> r1 = r13.sendReply
            kotlin.jvm.functions.Function0<java.lang.String> r0 = r13.clientId
            java.lang.Object r10 = r0.invoke()
            java.lang.String r10 = (java.lang.String) r10
            com.facebook.aura.nodes.json.ClientInvokeErrorJson r15 = new com.facebook.aura.nodes.json.ClientInvokeErrorJson
            r0 = r16
            r15.<init>(r2, r0)
            r13 = 0
            r12 = 0
            com.facebook.aura.nodes.json.ClientInvokeResultParamsJson r9 = new com.facebook.aura.nodes.json.ClientInvokeResultParamsJson
            r14 = r13
            r16 = r13
            r17 = r13
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r8.L$0 = r11
            r8.L$1 = r2
            r8.L$2 = r13
            r8.label = r3
            java.lang.Object r1 = r1.invoke(r9, r8)
            if (r1 != r7) goto L32
            return r7
        L84:
            com.facebook.aura.uicontrol.UiControlDispatcher$replyFailure$1 r8 = new com.facebook.aura.uicontrol.UiControlDispatcher$replyFailure$1
            r8.<init>(r4)
            goto L16
        L8a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.uicontrol.UiControlDispatcher.replyFailure(java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public Companion() {
        }

        public final UiControlDispatcher create(AbstractC3358CGz abstractC3358CGz, G0V<? super ClientInvokeResultParamsJson, ? super HtJ<? super Boolean>, ? extends Object> g0v, Function0<String> function0, G0U<? super String, Unit> g0u, Function0<Boolean> function02, G0U<? super String, Unit> g0u2, G0U<? super UiSuggestion, Boolean> g0u3, G0U<? super UiAction, Unit> g0u4) {
            AnonymousClass005.A17(abstractC3358CGz, g0v, function0, g0u, function02);
            AnonymousClass003.A0z(g0u2, g0u3);
            C7384Etj.A0Y(g0u4, 7);
            return new UiControlDispatcher(abstractC3358CGz, g0v, function0, g0u, function02, g0u2, g0u3, g0u4);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UiActionMode.values().length];
            try {
                AnonymousClass002.A13(UiActionMode.SUGGEST, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(UiActionMode.LIGHTUP, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(UiActionMode.PERFORM, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(java.lang.String r14, java.lang.String r15, java.lang.String r16, X.HtJ<? super kotlin.Unit> r17) throws java.io.UnsupportedEncodingException {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.uicontrol.UiControlDispatcher.execute(java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handOff(com.facebook.aura.nodes.api.HatchUiHandoff r8, com.facebook.aura.uicontrol.UiAction.Navigation r9, java.lang.String r10, X.HtJ<? super kotlin.Unit> r11) throws java.io.UnsupportedEncodingException {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.facebook.aura.uicontrol.UiControlDispatcher.C142591
            if (r0 == 0) goto L28
            r6 = r11
            com.facebook.aura.uicontrol.UiControlDispatcher$handOff$1 r6 = (com.facebook.aura.uicontrol.UiControlDispatcher.C142591) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 3
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 == r2) goto L45
            if (r0 == r3) goto L6f
            if (r0 == r4) goto L6f
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L28:
            com.facebook.aura.uicontrol.UiControlDispatcher$handOff$1 r6 = new com.facebook.aura.uicontrol.UiControlDispatcher$handOff$1
            r6.<init>(r11)
            goto L12
        L2e:
            X.Hwg.A00(r1)
            java.lang.String r1 = com.facebook.aura.uicontrol.UiActionToDeeplinkKt.toDeeplinkUriString(r9)
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r0
            r6.L$2 = r10
            r6.label = r2
            java.lang.Object r1 = r8.open(r1, r6)
            if (r1 != r5) goto L4c
            return r5
        L45:
            java.lang.Object r10 = r6.L$2
            java.lang.String r10 = (java.lang.String) r10
            X.Hwg.A00(r1)
        L4c:
            boolean r1 = X.AnonymousClass001.A1X(r1)
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r0
            r6.L$2 = r0
            if (r1 == 0) goto L64
            r6.label = r3
            java.lang.String r0 = "This device can't show it, so it was opened on the user's paired phone."
            java.lang.Object r0 = r7.replySuccess(r10, r0, r6)
        L61:
            if (r0 != r5) goto L72
            return r5
        L64:
            r6.label = r4
            java.lang.String r1 = "client_failed"
            java.lang.String r0 = "This device can't show it and couldn't reach the user's paired phone."
            java.lang.Object r0 = r7.replyFailure(r10, r1, r0, r6)
            goto L61
        L6f:
            X.Hwg.A00(r1)
        L72:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.uicontrol.UiControlDispatcher.handOff(com.facebook.aura.nodes.api.HatchUiHandoff, com.facebook.aura.uicontrol.UiAction$Navigation, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handle(com.facebook.aura.uicontrol.UiAction r16, java.lang.String r17, java.lang.String r18, X.HtJ<? super kotlin.Unit> r19) {
        /*
            r15 = this;
            r2 = r17
            r5 = r19
            r1 = r18
            boolean r0 = r5 instanceof com.facebook.aura.uicontrol.UiControlDispatcher.C142601
            if (r0 == 0) goto L33
            r14 = r5
            com.facebook.aura.uicontrol.UiControlDispatcher$handle$1 r14 = (com.facebook.aura.uicontrol.UiControlDispatcher.C142601) r14
            int r4 = r14.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r3
            if (r0 == 0) goto L33
            int r4 = r4 - r3
            r14.label = r4
        L18:
            java.lang.Object r9 = r14.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r14.label
            java.lang.String r5 = "client_failed"
            r3 = 4
            r6 = 3
            r8 = 2
            r7 = 1
            if (r0 == 0) goto L39
            if (r0 == r7) goto Lbf
            if (r0 == r8) goto L85
            if (r0 == r6) goto Lbf
            if (r0 == r3) goto Lbf
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L33:
            com.facebook.aura.uicontrol.UiControlDispatcher$handle$1 r14 = new com.facebook.aura.uicontrol.UiControlDispatcher$handle$1
            r14.<init>(r5)
            goto L18
        L39:
            X.Hwg.A00(r9)
            r10 = r16
            boolean r0 = r10 instanceof com.facebook.aura.uicontrol.UiAction.NavigateChatSession
            if (r0 == 0) goto L6d
            kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r15.isNavigationVisible
            boolean r0 = X.AnonymousClass003.A1Y(r0)
            if (r0 != 0) goto L6d
            r0 = 8
            java.lang.String r1 = X.BQG.A17(r2, r0)
            java.lang.String r0 = "ui.navigate.chat.session not opened: app not on screen invokeId="
            java.lang.String r1 = X.FGI.A0M(r0, r1)
            java.lang.String r0 = "UiControlDispatcher"
            X.CFK.A05(r0, r1)
            r0 = 0
            r14.L$0 = r0
            r14.L$1 = r0
            r14.L$2 = r0
            r14.label = r7
            java.lang.String r1 = "The app is not on screen, so the chat session was not opened."
        L66:
            java.lang.Object r0 = r15.replyFailure(r2, r5, r1, r14)
        L6a:
            if (r0 != r4) goto Lc2
            return r4
        L6d:
            com.facebook.aura.uicontrol.UiActionExecutor r9 = com.facebook.aura.uicontrol.UiActionExecutor.INSTANCE
            X.CGz r11 = r15.userSession
            X.G0U<java.lang.String, kotlin.Unit> r12 = r15.publishNavigation
            X.G0U<java.lang.String, kotlin.Unit> r13 = r15.publishChatTheme
            r0 = 0
            r14.L$0 = r0
            r14.L$1 = r2
            r14.L$2 = r1
            r14.label = r8
            java.lang.Object r9 = r9.perform(r10, r11, r12, r13, r14)
            if (r9 != r4) goto L90
            return r4
        L85:
            java.lang.Object r1 = r14.L$2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r14.L$1
            java.lang.String r2 = (java.lang.String) r2
            X.Hwg.A00(r9)
        L90:
            com.facebook.aura.uicontrol.UiActionExecutor$Result r9 = (com.facebook.aura.uicontrol.UiActionExecutor.Result) r9
            boolean r0 = r9 instanceof com.facebook.aura.uicontrol.UiActionExecutor.Result.Performed
            if (r0 == 0) goto La6
            r0 = 0
            r14.L$0 = r0
            r14.L$1 = r0
            r14.L$2 = r0
            r14.L$3 = r0
            r14.label = r6
            java.lang.Object r0 = r15.replySuccess(r2, r1, r14)
            goto L6a
        La6:
            boolean r0 = r9 instanceof com.facebook.aura.uicontrol.UiActionExecutor.Result.Unsupported
            if (r0 == 0) goto Lc5
            com.facebook.aura.uicontrol.UiActionExecutor$Result$Unsupported r9 = (com.facebook.aura.uicontrol.UiActionExecutor.Result.Unsupported) r9
            java.lang.String r0 = r9.errorCode
            if (r0 == 0) goto Lb1
            r5 = r0
        Lb1:
            java.lang.String r1 = r9.reason
            r0 = 0
            r14.L$0 = r0
            r14.L$1 = r0
            r14.L$2 = r0
            r14.L$3 = r0
            r14.label = r3
            goto L66
        Lbf:
            X.Hwg.A00(r9)
        Lc2:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        Lc5:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.uicontrol.UiControlDispatcher.handle(com.facebook.aura.uicontrol.UiAction, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    private final boolean isTabRoot(UiAction uiAction) {
        return C7384Etj.areEqual(uiAction, UiAction.NavigateChat.INSTANCE) || C7384Etj.areEqual(uiAction, UiAction.NavigateFeed.INSTANCE) || C7384Etj.areEqual(uiAction, UiAction.NavigateExplore.INSTANCE) || C7384Etj.areEqual(uiAction, UiAction.NavigateGoals.INSTANCE) || C7384Etj.areEqual(uiAction, UiAction.NavigateLibrary.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object replySuccess(java.lang.String r11, java.lang.String r12, X.HtJ<? super kotlin.Unit> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.facebook.aura.uicontrol.UiControlDispatcher.C142621
            if (r0 == 0) goto L59
            r3 = r13
            com.facebook.aura.uicontrol.UiControlDispatcher$replySuccess$1 r3 = (com.facebook.aura.uicontrol.UiControlDispatcher.C142621) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r1 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r7 = 1
            if (r0 == 0) goto L23
            if (r0 != r7) goto L5f
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L23:
            X.Hwg.A00(r1)
            r0 = 8
            r6 = r11
            java.lang.String r1 = X.BQG.A17(r11, r0)
            java.lang.String r0 = "ui.* reply ok invokeId="
            java.lang.String r1 = X.FGI.A0M(r0, r1)
            java.lang.String r0 = "UiControlDispatcher"
            X.CFK.A05(r0, r1)
            X.G0V<com.facebook.aura.nodes.json.ClientInvokeResultParamsJson, X.HtJ<? super java.lang.Boolean>, java.lang.Object> r1 = r10.sendReply
            kotlin.jvm.functions.Function0<java.lang.String> r0 = r10.clientId
            java.lang.Object r5 = r0.invoke()
            java.lang.String r5 = (java.lang.String) r5
            r9 = 0
            java.lang.String r8 = "{}"
            com.facebook.aura.nodes.json.ClientInvokeResultParamsJson r4 = new com.facebook.aura.nodes.json.ClientInvokeResultParamsJson
            r10 = r9
            r11 = r9
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r3.L$0 = r9
            r3.L$1 = r9
            r3.label = r7
            java.lang.Object r0 = r1.invoke(r4, r3)
            if (r0 != r2) goto L20
            return r2
        L59:
            com.facebook.aura.uicontrol.UiControlDispatcher$replySuccess$1 r3 = new com.facebook.aura.uicontrol.UiControlDispatcher$replySuccess$1
            r3.<init>(r13)
            goto L12
        L5f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.uicontrol.UiControlDispatcher.replySuccess(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object dispatch(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.Long r19, X.HtJ<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.uicontrol.UiControlDispatcher.dispatch(java.lang.String, java.lang.String, java.lang.String, java.lang.Long, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UiControlDispatcher(AbstractC3358CGz abstractC3358CGz, G0V<? super ClientInvokeResultParamsJson, ? super HtJ<? super Boolean>, ? extends Object> g0v, Function0<String> function0, G0U<? super String, Unit> g0u, Function0<Boolean> function02, G0U<? super String, Unit> g0u2, G0U<? super UiSuggestion, Boolean> g0u3, G0U<? super UiAction, Unit> g0u4) {
        AnonymousClass005.A17(abstractC3358CGz, g0v, function0, g0u, function02);
        AnonymousClass003.A0z(g0u2, g0u3);
        C7384Etj.A0Y(g0u4, 7);
        this.userSession = abstractC3358CGz;
        this.sendReply = g0v;
        this.clientId = function0;
        this.publishNavigation = g0u;
        this.isNavigationVisible = function02;
        this.publishChatTheme = g0u2;
        this.publishSuggestion = g0u3;
        this.publishTabLightup = g0u4;
    }

    private final long declaredTimeoutMs(String str) {
        NodeCommandSpec nodeCommandSpec = UiCommandSpecsKt.uiCommandSpecs().get(str);
        if (nodeCommandSpec == null) {
            return 10000L;
        }
        long j = nodeCommandSpec.timeoutMs;
        if (j > 0) {
            return j;
        }
        return 10000L;
    }
}
