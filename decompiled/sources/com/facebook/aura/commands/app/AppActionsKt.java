package com.facebook.aura.commands.app;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3cG;
import X.HtJ;
import X.HzP;
import android.os.SystemClock;
import com.facebook.aura.conversation.api.ConversationCardOutcome;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.nodes.core.NodeCommandResponse;
import com.facebook.aura.nodes.core.NodeExecutionContext;
import com.facebook.aura.nodes.core.NodeExecutionKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public abstract class AppActionsKt {

    @DebugMetadata(c = "com.facebook.aura.commands.app.AppActionsKt", f = "AppActions.kt", l = {68}, m = "availableAppActions", v = 2)
    /* renamed from: com.facebook.aura.commands.app.AppActionsKt$availableAppActions$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppActionsKt.availableAppActions(null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.app.AppActionsKt", f = "AppActions.kt", l = {58, 59}, m = "canAddHomeScreenShortcut", v = 2)
    /* renamed from: com.facebook.aura.commands.app.AppActionsKt$canAddHomeScreenShortcut$1, reason: invalid class name and case insensitive filesystem */
    public final class C110951 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppActionsKt.canAddHomeScreenShortcut(null, this);
        }

        public C110951(HtJ<? super C110951> htJ) {
            super(htJ);
        }
    }

    public static final AppActionOutcome toAppActionOutcome(ConversationCardOutcome conversationCardOutcome) {
        switch (AnonymousClass001.A0E(conversationCardOutcome, 0)) {
            case 0:
                return AppActionOutcome.COMPLETED;
            case 1:
                return AppActionOutcome.DECLINED;
            case 2:
                return AppActionOutcome.FAILED;
            case 3:
                return AppActionOutcome.EXPIRED;
            case 4:
            case 5:
                return AppActionOutcome.NOT_SHOWN;
            default:
                throw C3cG.A0q();
        }
    }

    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConversationCardOutcome.values().length];
            try {
                AnonymousClass002.A13(ConversationCardOutcome.COMPLETED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConversationCardOutcome.DECLINED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ConversationCardOutcome.FAILED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(ConversationCardOutcome.EXPIRED, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(ConversationCardOutcome.UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(ConversationCardOutcome.CANCELLED, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object availableAppActions(android.content.Context r6, X.HtJ<? super java.util.List<java.lang.String>> r7) {
        /*
            boolean r0 = r7 instanceof com.facebook.aura.commands.app.AppActionsKt.AnonymousClass1
            if (r0 == 0) goto L6c
            r5 = r7
            com.facebook.aura.commands.app.AppActionsKt$availableAppActions$1 r5 = (com.facebook.aura.commands.app.AppActionsKt.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r0 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r3 = 1
            if (r1 == 0) goto L3c
            if (r1 != r3) goto L72
            java.lang.Object r1 = r5.L$2
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r5.L$1
            java.util.List r2 = (java.util.List) r2
            X.Hwg.A00(r0)
        L28:
            boolean r0 = X.AnonymousClass001.A1X(r0)
            if (r0 == 0) goto L37
            com.facebook.aura.nodes.core.NodeCommandId r0 = com.facebook.aura.nodes.core.NodeCommandId.SHORTCUT_ADD_HOME
            java.lang.String r0 = r0.getCommandId()
            r1.add(r0)
        L37:
            X.AII r0 = X.AIM.A18(r2)
            return r0
        L3c:
            X.Hwg.A00(r0)
            X.AII r2 = X.AIM.A17()
            com.facebook.aura.assist.status.HatchDefaultAssistantStatus r1 = com.facebook.aura.assist.status.HatchDefaultAssistantStatus.INSTANCE
            boolean r0 = r1.isDefaultAssistant(r6)
            if (r0 != 0) goto L5a
            boolean r0 = r1.isAssistantRoleAvailable(r6)
            if (r0 == 0) goto L5a
            com.facebook.aura.nodes.core.NodeCommandId r0 = com.facebook.aura.nodes.core.NodeCommandId.ASSISTANT_SET_DEFAULT
            java.lang.String r0 = r0.getCommandId()
            r2.add(r0)
        L5a:
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r2
            r5.L$2 = r2
            r5.label = r3
            java.lang.Object r0 = canAddHomeScreenShortcut(r6, r5)
            if (r0 != r4) goto L6a
            return r4
        L6a:
            r1 = r2
            goto L28
        L6c:
            com.facebook.aura.commands.app.AppActionsKt$availableAppActions$1 r5 = new com.facebook.aura.commands.app.AppActionsKt$availableAppActions$1
            r5.<init>(r7)
            goto L12
        L72:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.app.AppActionsKt.availableAppActions(android.content.Context, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object canAddHomeScreenShortcut(android.content.Context r6, X.HtJ<? super java.lang.Boolean> r7) {
        /*
            boolean r0 = r7 instanceof com.facebook.aura.commands.app.AppActionsKt.C110951
            if (r0 == 0) goto L61
            r5 = r7
            com.facebook.aura.commands.app.AppActionsKt$canAddHomeScreenShortcut$1 r5 = (com.facebook.aura.commands.app.AppActionsKt.C110951) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L61
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 == r2) goto L44
            if (r0 != r3) goto L67
            X.Hwg.A00(r1)
        L23:
            boolean r0 = X.AnonymousClass001.A1X(r1)
            if (r0 != 0) goto L5f
        L29:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L2e:
            X.Hwg.A00(r1)
            boolean r0 = com.facebook.aura.shortcut.HomeScreenShortcutSyncKt.getAddToHomeShortcutEnabled()
            if (r0 == 0) goto L5f
            com.facebook.aura.shortcut.HatchShortcutManager r0 = com.facebook.aura.shortcut.HatchShortcutManager.INSTANCE
            r5.L$0 = r6
            r5.label = r2
            java.lang.Object r1 = r0.isRequestPinShortcutSupported(r6, r5)
            if (r1 != r4) goto L4b
            return r4
        L44:
            java.lang.Object r6 = r5.L$0
            android.content.Context r6 = (android.content.Context) r6
            X.Hwg.A00(r1)
        L4b:
            boolean r0 = X.AnonymousClass001.A1X(r1)
            if (r0 == 0) goto L5f
            com.facebook.aura.shortcut.HatchShortcutManager r1 = com.facebook.aura.shortcut.HatchShortcutManager.INSTANCE
            r0 = 0
            r5.L$0 = r0
            r5.label = r3
            java.lang.Object r1 = r1.isIdentityShortcutPinned(r6, r5)
            if (r1 != r4) goto L23
            return r4
        L5f:
            r2 = 0
            goto L29
        L61:
            com.facebook.aura.commands.app.AppActionsKt$canAddHomeScreenShortcut$1 r5 = new com.facebook.aura.commands.app.AppActionsKt$canAddHomeScreenShortcut$1
            r5.<init>(r7)
            goto L12
        L67:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.app.AppActionsKt.canAddHomeScreenShortcut(android.content.Context, X.HtJ):java.lang.Object");
    }

    public static final Object deliverAppAction(NodeExecutionContext nodeExecutionContext, AppActionOutcome appActionOutcome, HtJ<? super NodeCommandResponse> htJ) {
        return NodeExecutionKt.deliver(nodeExecutionContext, new NodeCommandResponse(true, HatchJsonKt.HatchJson.A03(new AppActionJson(appActionOutcome.getWireValue()), AppActionJson$$serializer.INSTANCE), null, null, null), htJ);
    }

    public static final long appActionCardDeadlineElapsedMs() {
        return SystemClock.elapsedRealtime() + 114000;
    }
}
