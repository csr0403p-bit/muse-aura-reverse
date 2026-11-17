package com.facebook.aura.shortcut;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BFM;
import X.BRg;
import X.C1BN;
import X.C1HY;
import X.C1er;
import X.C2CK;
import X.C3UX;
import X.C7384Etj;
import X.C78N;
import X.F2N;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.HzP;
import X.InterfaceC10560Hsz;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.conversation.widget.api.ConversationCardControls;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.model.AiIdentity;
import com.facebook.aura.nudge.ConversationNudge;
import com.facebook.aura.nudge.NudgeContent;
import com.facebook.aura.nudge.NudgeExpiry;
import com.facebook.aura.nudge.NudgeOutcome;
import com.facebook.aura.nudge.NudgePolicy;
import com.facebook.aura.nudge.NudgePresentation;
import com.facebook.aura.nudge.NudgeSurface;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HomeScreenShortcutNudge implements ConversationNudge {
    public static final String id = "home_screen_shortcut";
    public static final int priority = 50;
    public static final HomeScreenShortcutNudge INSTANCE = new HomeScreenShortcutNudge();
    public static final NudgePolicy policy = new NudgePolicy(2, 30, new NudgeExpiry(60000, true), true);

    @DebugMetadata(c = "com.facebook.aura.shortcut.HomeScreenShortcutNudge", f = "HomeScreenShortcutNudge.kt", l = {71, 72}, m = "isEligible", v = 2)
    /* renamed from: com.facebook.aura.shortcut.HomeScreenShortcutNudge$isEligible$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HomeScreenShortcutNudge.this.isEligible(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shortcut.HomeScreenShortcutNudge", f = "HomeScreenShortcutNudge.kt", l = {134}, m = "pinShortcut", v = 2)
    /* renamed from: com.facebook.aura.shortcut.HomeScreenShortcutNudge$pinShortcut$1, reason: invalid class name and case insensitive filesystem */
    public final class C137851 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C137851(HtJ<? super C137851> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HomeScreenShortcutNudge.this.pinShortcut(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shortcut.HomeScreenShortcutNudge$pinShortcut$2", f = "HomeScreenShortcutNudge.kt", l = {148, 159, 166}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shortcut.HomeScreenShortcutNudge$pinShortcut$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super NudgeOutcome>, Object> {
        public final /* synthetic */ Context $appContext;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ AiIdentity $identity;
        public final /* synthetic */ F2N $lifecycle;
        public final /* synthetic */ InterfaceC10560Hsz<Unit> $pinConfirmed;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int I$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public boolean Z$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, Context context2, AiIdentity aiIdentity, AbstractC3358CGz abstractC3358CGz, F2N f2n, InterfaceC10560Hsz<Unit> interfaceC10560Hsz, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$appContext = context;
            this.$context = context2;
            this.$identity = aiIdentity;
            this.$userSession = abstractC3358CGz;
            this.$lifecycle = f2n;
            this.$pinConfirmed = interfaceC10560Hsz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$appContext, this.$context, this.$identity, this.$userSession, this.$lifecycle, this.$pinConfirmed, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
        /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r7v6, types: [X.27k] */
        /* JADX WARN: Type inference failed for: r7v8, types: [X.HoC] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r7 = r14.L$0
                X.3UX r7 = (X.C3UX) r7
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r14.label
                r4 = 0
                r3 = 3
                r1 = 2
                r6 = 1
                r12 = 0
                if (r0 == 0) goto L21
                if (r0 == r6) goto L66
                if (r0 == r1) goto L94
                if (r0 != r3) goto Lc1
                X.Hwg.A00(r15)
            L18:
                boolean r0 = X.AnonymousClass001.A1X(r15)
                if (r0 != 0) goto Lc6
                com.facebook.aura.nudge.NudgeOutcome r5 = com.facebook.aura.nudge.NudgeOutcome.DECLINED
                return r5
            L21:
                X.Hwg.A00(r15)
                X.F2N r2 = r14.$lifecycle
                com.facebook.aura.shortcut.HomeScreenShortcutNudge$pinShortcut$2$dialogClosed$1 r0 = new com.facebook.aura.shortcut.HomeScreenShortcutNudge$pinShortcut$2$dialogClosed$1
                r0.<init>(r2, r12)
                X.Hrx r7 = X.AnonymousClass001.A10(r0, r7)
                android.content.Context r8 = r14.$appContext
                java.lang.String r0 = "com.facebook.aura.shortcut.ACTION_SHORTCUT_PINNED"
                android.content.Intent r2 = new android.content.Intent
                r2.<init>(r0)
                android.content.Context r0 = r14.$appContext
                java.lang.String r0 = r0.getPackageName()
                android.content.Intent r2 = r2.setPackage(r0)
                r0 = 1140850688(0x44000000, float:512.0)
                android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r8, r4, r2, r0)
                android.content.IntentSender r13 = r0.getIntentSender()
                X.C7384Etj.A0U(r13)
                com.facebook.aura.shortcut.HatchShortcutManager r8 = com.facebook.aura.shortcut.HatchShortcutManager.INSTANCE
                android.content.Context r9 = r14.$context
                com.facebook.aura.model.AiIdentity r10 = r14.$identity
                X.CGz r11 = r14.$userSession
                r14.L$0 = r12
                r14.L$1 = r7
                r14.L$2 = r12
                r14.label = r6
                java.lang.Object r15 = r8.requestPinShortcut(r9, r10, r11, r12, r13, r14)
                if (r15 != r5) goto L6d
                return r5
            L66:
                java.lang.Object r7 = r14.L$1
                X.27k r7 = (X.C27k) r7
                X.Hwg.A00(r15)
            L6d:
                boolean r6 = X.AnonymousClass001.A1X(r15)
                if (r6 != 0) goto L79
                r7.A5w(r12)
                com.facebook.aura.nudge.NudgeOutcome r5 = com.facebook.aura.nudge.NudgeOutcome.FAILED
                return r5
            L79:
                X.Hsz<kotlin.Unit> r0 = r14.$pinConfirmed
                com.facebook.aura.shortcut.HomeScreenShortcutNudge$pinShortcut$2$isConfirmed$1 r2 = new com.facebook.aura.shortcut.HomeScreenShortcutNudge$pinShortcut$2$isConfirmed$1
                r2.<init>(r0, r7, r12)
                r14.L$0 = r12
                r14.L$1 = r7
                r14.L$2 = r12
                r14.Z$0 = r6
                r14.label = r1
                r0 = 60000(0xea60, double:2.9644E-319)
                java.lang.Object r15 = X.GAX.A01(r14, r2, r0)
                if (r15 != r5) goto L9d
                return r5
            L94:
                boolean r6 = r14.Z$0
                java.lang.Object r7 = r14.L$1
                X.HoC r7 = (X.HoC) r7
                X.Hwg.A00(r15)
            L9d:
                java.lang.Boolean r15 = (java.lang.Boolean) r15
                if (r15 == 0) goto La5
                boolean r4 = r15.booleanValue()
            La5:
                r7.A5w(r12)
                if (r4 != 0) goto Lc6
                com.facebook.aura.shortcut.HatchShortcutManager r1 = com.facebook.aura.shortcut.HatchShortcutManager.INSTANCE
                android.content.Context r0 = r14.$context
                r14.L$0 = r12
                r14.L$1 = r12
                r14.L$2 = r12
                r14.Z$0 = r6
                r14.I$0 = r4
                r14.label = r3
                java.lang.Object r15 = r1.isIdentityShortcutPinned(r0, r14)
                if (r15 != r5) goto L18
                return r5
            Lc1:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            Lc6:
                com.facebook.aura.nudge.NudgeOutcome r5 = com.facebook.aura.nudge.NudgeOutcome.COMPLETED
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shortcut.HomeScreenShortcutNudge.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super NudgeOutcome> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object pinShortcut(android.content.Context r12, X.AbstractC3358CGz r13, X.F2N r14, X.HtJ<? super com.facebook.aura.nudge.NudgeOutcome> r15) {
        /*
            r11 = this;
            r3 = r15
            boolean r0 = r15 instanceof com.facebook.aura.shortcut.HomeScreenShortcutNudge.C137851
            if (r0 == 0) goto L27
            r4 = r3
            com.facebook.aura.shortcut.HomeScreenShortcutNudge$pinShortcut$1 r4 = (com.facebook.aura.shortcut.HomeScreenShortcutNudge.C137851) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r4.label = r2
        L13:
            java.lang.Object r1 = r4.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r3 = 1
            if (r0 == 0) goto L36
            if (r0 != r3) goto L31
            java.lang.Object r2 = r4.L$6
            android.content.BroadcastReceiver r2 = (android.content.BroadcastReceiver) r2
            java.lang.Object r7 = r4.L$4
            android.content.Context r7 = (android.content.Context) r7
            goto L2d
        L27:
            com.facebook.aura.shortcut.HomeScreenShortcutNudge$pinShortcut$1 r4 = new com.facebook.aura.shortcut.HomeScreenShortcutNudge$pinShortcut$1
            r4.<init>(r15)
            goto L13
        L2d:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L8b
            goto L87
        L31:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L36:
            X.Hwg.A00(r1)
            com.facebook.aura.gateway.service.HatchGatewayServiceManager r0 = com.facebook.aura.gateway.service.HatchGatewayServiceManager.INSTANCE
            r10 = r13
            com.facebook.aura.gateway.HatchGatewayConnection r0 = r0.getGateway(r13)
            X.1BN r0 = r0.getAiIdentity()
            java.lang.Object r9 = r0.getValue()
            com.facebook.aura.model.AiIdentity r9 = (com.facebook.aura.model.AiIdentity) r9
            if (r9 != 0) goto L4f
            com.facebook.aura.nudge.NudgeOutcome r1 = com.facebook.aura.nudge.NudgeOutcome.FAILED
            return r1
        L4f:
            r8 = r12
            android.content.Context r7 = r12.getApplicationContext()
            r13 = 0
            X.GAt r12 = new X.GAt
            r12.<init>(r13)
            com.facebook.aura.shortcut.HomeScreenShortcutNudge$pinShortcut$receiver$1 r2 = new com.facebook.aura.shortcut.HomeScreenShortcutNudge$pinShortcut$receiver$1
            r2.<init>()
            java.lang.String r0 = "com.facebook.aura.shortcut.ACTION_SHORTCUT_PINNED"
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>(r0)
            r0 = 4
            X.AbstractC4103Cmd.A04(r2, r7, r1, r0)
            com.facebook.aura.shortcut.HomeScreenShortcutNudge$pinShortcut$2 r6 = new com.facebook.aura.shortcut.HomeScreenShortcutNudge$pinShortcut$2     // Catch: java.lang.Throwable -> L8b
            r11 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L8b
            r4.L$0 = r13     // Catch: java.lang.Throwable -> L8b
            r4.L$1 = r13     // Catch: java.lang.Throwable -> L8b
            r4.L$2 = r13     // Catch: java.lang.Throwable -> L8b
            r4.L$3 = r13     // Catch: java.lang.Throwable -> L8b
            r4.L$4 = r7     // Catch: java.lang.Throwable -> L8b
            r4.L$5 = r13     // Catch: java.lang.Throwable -> L8b
            r4.L$6 = r2     // Catch: java.lang.Throwable -> L8b
            r4.label = r3     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r1 = X.Hxb.A00(r6, r4)     // Catch: java.lang.Throwable -> L8b
            if (r1 != r5) goto L87
            return r5
        L87:
            r7.unregisterReceiver(r2)
            return r1
        L8b:
            r0 = move-exception
            r7.unregisterReceiver(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shortcut.HomeScreenShortcutNudge.pinShortcut(android.content.Context, X.CGz, X.F2N, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public void onReset() {
        HomeScreenShortcutPersonalization.isPersonalizedInSession = false;
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public void onShown() {
        HomeScreenShortcutPersonalization.isPersonalizedInSession = false;
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public Function0<Unit> rememberAction(G0U<? super NudgeOutcome, Unit> g0u, BFM bfm, int i) {
        C7384Etj.A0Y(g0u, 0);
        bfm.AgE(1179948830);
        Context contextA0O = AnonymousClass003.A0O(bfm);
        AbstractC3358CGz abstractC3358CGzA0g = AnonymousClass002.A0g(bfm);
        F2N f2nA00 = C1HY.A00(bfm);
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT, obj);
        MutableState mutableStateA00 = C1er.A00(bfm, g0u);
        boolean zA1V = AnonymousClass005.A1V(bfm, contextA0O, abstractC3358CGzA0g, f2nA00, AnonymousClass003.A1N(bfm, c3ux, mutableStateA00));
        Object objAaT2 = bfm.AaT();
        if (zA1V || objAaT2 == obj) {
            objAaT2 = new HomeScreenShortcutNudge$rememberAction$1$1(c3ux, contextA0O, abstractC3358CGzA0g, f2nA00, mutableStateA00);
            bfm.Ai0(objAaT2);
        }
        Function0<Unit> function0 = (Function0) objAaT2;
        AnonymousClass001.A1D(bfm);
        return function0;
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public String getId() {
        return id;
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public NudgePolicy getPolicy() {
        return policy;
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public int getPriority() {
        return priority;
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public /* bridge */ Set<NudgeSurface> getSurfaces() {
        return Collections.singleton(NudgeSurface.PHONE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    @Override // com.facebook.aura.nudge.ConversationNudge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object isEligible(android.content.Context r7, X.AbstractC3358CGz r8, X.HtJ<? super java.lang.Boolean> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.shortcut.HomeScreenShortcutNudge.AnonymousClass1
            if (r0 == 0) goto Lbd
            r3 = r9
            com.facebook.aura.shortcut.HomeScreenShortcutNudge$isEligible$1 r3 = (com.facebook.aura.shortcut.HomeScreenShortcutNudge.AnonymousClass1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lbd
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r1 = r3.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L48
            if (r0 == r2) goto L9b
            if (r0 != r4) goto Lc4
            X.Hwg.A00(r1)
        L23:
            boolean r0 = X.AnonymousClass001.A1X(r1)
            if (r0 == 0) goto L3b
            java.lang.String r4 = "already_pinned"
        L2b:
            r3 = r4
        L2c:
            java.lang.String r1 = "HomeScreenShortcutNudge"
            java.lang.String r0 = "Eligibility blocker=%s"
            X.CFK.A03(r3, r1, r0)
            if (r4 == 0) goto L36
            r2 = 0
        L36:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L3b:
            boolean r0 = com.facebook.aura.shortcut.HomeScreenShortcutSyncKt.getAddToHomeShortcutEnabled()
            if (r0 != 0) goto L44
            java.lang.String r4 = "mobile_config"
            goto L2b
        L44:
            r4 = 0
            java.lang.String r3 = "none"
            goto L2c
        L48:
            X.Hwg.A00(r1)
            com.facebook.aura.gateway.service.HatchGatewayServiceManager r0 = com.facebook.aura.gateway.service.HatchGatewayServiceManager.INSTANCE
            com.facebook.aura.gateway.HatchGatewayConnection r0 = r0.getGateway(r8)
            com.facebook.aura.model.AiIdentity r6 = X.C3cH.A0R(r0)
            boolean r0 = com.facebook.aura.shortcut.HomeScreenShortcutPersonalization.isPersonalizedInSession
            if (r0 != 0) goto L5c
            java.lang.String r4 = "no_rename"
            goto L2b
        L5c:
            if (r6 != 0) goto L61
            java.lang.String r4 = "no_identity"
            goto L2b
        L61:
            com.facebook.aura.model.AvatarMedia r1 = r6.avatarMedia
            com.facebook.aura.avatarassets.appearance.HatchAvatarAppearance r0 = com.facebook.aura.avatarassets.appearance.HatchAvatarAppearance.INSTANCE
            boolean r0 = r0.isDark()
            com.facebook.aura.model.SelectedAvatarMedia r0 = com.facebook.aura.model.AvatarMediaSelectionKt.select(r1, r0)
            java.util.List<java.lang.String> r0 = r0.stills
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L78
            java.lang.String r4 = "no_avatar"
            goto L2b
        L78:
            com.facebook.aura.shortcut.HomeScreenShortcutPersonalization r1 = com.facebook.aura.shortcut.HomeScreenShortcutPersonalization.INSTANCE
            java.lang.String r0 = r6.name
            java.lang.String r0 = X.AnonymousClass002.A0l(r0)
            boolean r0 = r1.isPersonalized(r0)
            if (r0 != 0) goto L89
            java.lang.String r4 = "default_name"
            goto L2b
        L89:
            com.facebook.aura.shortcut.HatchShortcutManager r1 = com.facebook.aura.shortcut.HatchShortcutManager.INSTANCE
            r3.L$0 = r7
            r0 = 0
            r3.L$1 = r0
            r3.L$2 = r0
            r3.label = r2
            java.lang.Object r1 = r1.isRequestPinShortcutSupported(r7, r3)
            if (r1 != r5) goto La2
            return r5
        L9b:
            java.lang.Object r7 = r3.L$0
            android.content.Context r7 = (android.content.Context) r7
            X.Hwg.A00(r1)
        La2:
            boolean r0 = X.AnonymousClass001.A1X(r1)
            if (r0 != 0) goto Lab
            java.lang.String r4 = "pin_unsupported"
            goto L2b
        Lab:
            com.facebook.aura.shortcut.HatchShortcutManager r1 = com.facebook.aura.shortcut.HatchShortcutManager.INSTANCE
            r0 = 0
            r3.L$0 = r0
            r3.L$1 = r0
            r3.L$2 = r0
            r3.label = r4
            java.lang.Object r1 = r1.isIdentityShortcutPinned(r7, r3)
            if (r1 != r5) goto L23
            return r5
        Lbd:
            com.facebook.aura.shortcut.HomeScreenShortcutNudge$isEligible$1 r3 = new com.facebook.aura.shortcut.HomeScreenShortcutNudge$isEligible$1
            r3.<init>(r9)
            goto L12
        Lc4:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shortcut.HomeScreenShortcutNudge.isEligible(android.content.Context, X.CGz, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public /* bridge */ void onDeclined() {
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public /* synthetic */ void Card(ConversationCardControls conversationCardControls, BRg bRg, BFM bfm, int i) {
        ConversationNudge.CC.$default$Card(this, conversationCardControls, bRg, bfm, i);
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public NudgeContent content(BFM bfm, int i) {
        bfm.AgE(1479677701);
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        boolean zA65 = bfm.A65(abstractC3358CGzA0h);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = HatchIdentityProvider.Companion.getInstance(abstractC3358CGzA0h).aiIdentityName;
            bfm.Ai0(objAaT);
        }
        NudgeContent nudgeContent = new NudgeContent(R.drawable.house_door_wght400_outline_24, AnonymousClass001.A0t(bfm, C2CK.A02(bfm, (C1BN) objAaT).getValue(), R.string._name_removed__res_0x7f120f87), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120547), 2, null, 3, true, null, NudgePresentation.CARD, null);
        AnonymousClass001.A1D(bfm);
        return nudgeContent;
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public /* bridge */ Map<String, String> logMetadata() {
        return AGH.A0E();
    }

    @Override // com.facebook.aura.nudge.ConversationNudge
    public /* bridge */ void Card(ConversationCardControls conversationCardControls, BRg bRg, BFM bfm, int i, int i2) {
        ConversationNudge.CC.$default$Card(this, conversationCardControls, bRg, bfm, i, i2);
    }
}
