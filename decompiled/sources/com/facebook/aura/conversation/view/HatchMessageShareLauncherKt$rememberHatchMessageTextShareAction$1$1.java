package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.C7384Etj;
import X.G0V;
import X.HtJ;
import android.content.Context;
import android.net.Uri;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.file.actions.HatchShare;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchShareSheetViewModelKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageShareLauncherKt$rememberHatchMessageTextShareAction$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchMessageShareLauncherKt$rememberHatchMessageTextShareAction$1$1$1", f = "HatchMessageShareLauncher.kt", l = {124, 130}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchMessageShareLauncherKt$rememberHatchMessageTextShareAction$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ HatchMessageUiModel $message;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* renamed from: com.facebook.aura.conversation.view.HatchMessageShareLauncherKt$rememberHatchMessageTextShareAction$1$1$1$4, reason: invalid class name */
        public final class AnonymousClass4 extends AbstractC7559F3s implements Function0<Unit> {
            public final /* synthetic */ Context $context;
            public final /* synthetic */ String $mediaUri;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(Context context, String str) {
                super(0);
                this.$context = context;
                this.$mediaUri = str;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                HatchShare hatchShare = HatchShare.INSTANCE;
                Context context = this.$context;
                Uri uri = Uri.parse(this.$mediaUri);
                C7384Etj.A0U(uri);
                hatchShare.shareMedia(context, uri, HatchShareSheetViewModelKt.AVATAR_STORY_STICKER_MIME_TYPE, null, false);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchMessageUiModel hatchMessageUiModel, Context context, AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$message = hatchMessageUiModel;
            this.$context = context;
            this.$navigator = auraNavigator;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$message, this.$context, this.$navigator, this.$userSession, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
            /*
                r17 = this;
                r10 = r18
                X.Hji r7 = X.EnumC10460Hji.A02
                r4 = r17
                int r0 = r4.label
                r6 = 2
                r5 = 1
                r9 = 0
                if (r0 == 0) goto L73
                if (r0 == r5) goto L94
                if (r0 != r6) goto Laf
                java.lang.Object r8 = r4.L$2
                java.lang.String r8 = (java.lang.String) r8
                X.Hwg.A00(r10)
            L18:
                java.lang.String r10 = (java.lang.String) r10
                if (r10 == 0) goto L6a
                com.facebook.aura.navigation.AuraNavigator r6 = r4.$navigator
                com.facebook.aura.conversation.viewmodel.HatchMessageUiModel r0 = r4.$message
                X.AHD<com.facebook.aura.file.view.api.ContentItem> r0 = r0.inlineMediaItems
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L70
                com.facebook.aura.navigation.key.ShareType r7 = com.facebook.aura.navigation.key.ShareType.MESSAGE_MEDIA
            L2a:
                com.facebook.aura.navigation.key.HatchShareDownloadTarget$Media r12 = new com.facebook.aura.navigation.key.HatchShareDownloadTarget$Media
                r12.<init>(r10)
                com.facebook.aura.conversation.viewmodel.HatchMessageUiModel r3 = r4.$message
                com.facebook.aura.model.HatchMessageRole r2 = r3.role
                com.facebook.aura.model.HatchMessageRole r0 = com.facebook.aura.model.HatchMessageRole.USER
                if (r2 != r0) goto L6d
                java.lang.String r1 = r3.serverMessageId
                if (r1 != 0) goto L42
                java.lang.String r1 = r3.id
                boolean r0 = r3.isFromHistory
                r14 = r9
                if (r0 == 0) goto L43
            L42:
                r14 = r1
            L43:
                java.lang.String r1 = r3.id
                com.facebook.aura.model.HatchMessageRole r0 = com.facebook.aura.model.HatchMessageRole.AGENT
                r15 = r9
                if (r2 != r0) goto L4b
                r15 = r1
            L4b:
                java.lang.String r2 = r3.sessionId
                if (r2 == 0) goto L57
                java.lang.String r0 = "primary_session_id"
                boolean r0 = r2.equals(r0)
                if (r0 == 0) goto L58
            L57:
                r2 = r9
            L58:
                android.content.Context r1 = r4.$context
                com.facebook.aura.conversation.view.HatchMessageShareLauncherKt$rememberHatchMessageTextShareAction$1$1$1$4 r0 = new com.facebook.aura.conversation.view.HatchMessageShareLauncherKt$rememberHatchMessageTextShareAction$1$1$1$4
                r0.<init>(r1, r10)
                r11 = r9
                r13 = r8
                r17 = r9
                r18 = r0
                r16 = r2
                com.facebook.aura.sharesheet.HatchShareSheetMCKt.openHatchShareSheetOrElse(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            L6a:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            L6d:
                java.lang.String r1 = r3.id
                goto L42
            L70:
                com.facebook.aura.navigation.key.ShareType r7 = com.facebook.aura.navigation.key.ShareType.MESSAGE
                goto L2a
            L73:
                X.Hwg.A00(r10)
                com.facebook.aura.conversation.viewmodel.HatchMessageUiModel r0 = r4.$message
                java.lang.String r3 = com.facebook.aura.conversation.viewmodel.HatchConversationUiStateKt.buildCopyContent(r0)
                X.CGz r0 = r4.$userSession
                com.facebook.aura.conversation.view.HatchMessageShareLauncherKt$rememberHatchMessageTextShareAction$1$1$1$loadImage$1 r2 = new com.facebook.aura.conversation.view.HatchMessageShareLauncherKt$rememberHatchMessageTextShareAction$1$1$1$loadImage$1
                r2.<init>(r0, r9)
                com.facebook.aura.sharesheet.HatchMessageShareImageRenderer r1 = com.facebook.aura.sharesheet.HatchMessageShareImageRenderer.INSTANCE
                android.content.Context r0 = r4.$context
                r4.L$0 = r9
                r4.L$1 = r9
                r4.label = r5
                java.lang.Object r10 = r1.render(r0, r3, r2, r4)
                if (r10 != r7) goto L97
                return r7
            L94:
                X.Hwg.A00(r10)
            L97:
                r8 = r10
                java.lang.String r8 = (java.lang.String) r8
                if (r8 == 0) goto L6a
                com.facebook.aura.sharesheet.HatchMessageShareImageRenderer r1 = com.facebook.aura.sharesheet.HatchMessageShareImageRenderer.INSTANCE
                android.content.Context r0 = r4.$context
                r4.L$0 = r9
                r4.L$1 = r9
                r4.L$2 = r8
                r4.label = r6
                java.lang.Object r10 = r1.renderOpaqueCard(r0, r8, r4)
                if (r10 != r7) goto L18
                return r7
            Laf:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageShareLauncherKt$rememberHatchMessageTextShareAction$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageShareLauncherKt$rememberHatchMessageTextShareAction$1$1(C3UX c3ux, HatchMessageUiModel hatchMessageUiModel, Context context, AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$coroutineScope = c3ux;
        this.$message = hatchMessageUiModel;
        this.$context = context;
        this.$navigator = auraNavigator;
        this.$userSession = abstractC3358CGz;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AnonymousClass001.A1J(new AnonymousClass1(this.$message, this.$context, this.$navigator, this.$userSession, null), this.$coroutineScope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
