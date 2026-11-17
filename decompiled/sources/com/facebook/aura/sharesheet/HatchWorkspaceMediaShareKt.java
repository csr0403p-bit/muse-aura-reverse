package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C3UX;
import X.C7384Etj;
import X.C7BY;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.Context;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.file.actions.HatchFileActions;
import com.facebook.aura.file.actions.HatchFileRef;
import com.facebook.aura.model.HatchDanceShare;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchShareDownloadTarget;
import com.facebook.aura.navigation.key.ShareType;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchWorkspaceMediaShareKt {

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchWorkspaceMediaShareKt", f = "HatchWorkspaceMediaShare.kt", l = {MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS}, m = "prepareRemoteMedia", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchWorkspaceMediaShareKt$prepareRemoteMedia$1, reason: invalid class name */
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
            return HatchWorkspaceMediaShareKt.prepareRemoteMedia(null, null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchWorkspaceMediaShareKt$shareWorkspaceMedia$1, reason: invalid class name and case insensitive filesystem */
    public final class C137171 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ C3UX $coroutineScope;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public final /* synthetic */ String $workspacePath;

        @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchWorkspaceMediaShareKt$shareWorkspaceMedia$1$1", f = "HatchWorkspaceMediaShare.kt", l = {52}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.sharesheet.HatchWorkspaceMediaShareKt$shareWorkspaceMedia$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03621 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ Context $context;
            public final /* synthetic */ String $fileName;
            public final /* synthetic */ AbstractC3358CGz $userSession;
            public final /* synthetic */ String $workspacePath;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03621(Context context, String str, String str2, AbstractC3358CGz abstractC3358CGz, HtJ<? super C03621> htJ) {
                super(2, htJ);
                this.$context = context;
                this.$workspacePath = str;
                this.$fileName = str2;
                this.$userSession = abstractC3358CGz;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C03621(this.$context, this.$workspacePath, this.$fileName, this.$userSession, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchFileActions hatchFileActions = HatchFileActions.INSTANCE;
                    Context context = this.$context;
                    HatchFileRef.Workspace workspace = new HatchFileRef.Workspace(this.$workspacePath, this.$fileName);
                    AbstractC3358CGz abstractC3358CGz = this.$userSession;
                    this.label = 1;
                    if (hatchFileActions.share(context, workspace, abstractC3358CGz, this) == enumC10460Hji) {
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
                return ((C03621) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137171(String str, C3UX c3ux, Context context, String str2, AbstractC3358CGz abstractC3358CGz) {
            super(0);
            this.$workspacePath = str;
            this.$coroutineScope = c3ux;
            this.$context = context;
            this.$fileName = str2;
            this.$userSession = abstractC3358CGz;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            String str = this.$workspacePath;
            if (str != null) {
                AnonymousClass001.A1J(new C03621(this.$context, str, this.$fileName, this.$userSession, null), this.$coroutineScope);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object prepareRemoteMedia(android.content.Context r6, X.AbstractC3358CGz r7, java.lang.String r8, X.HtJ<? super com.facebook.aura.file.actions.HatchFileRef.Local> r9) {
        /*
            boolean r0 = r9 instanceof com.facebook.aura.sharesheet.HatchWorkspaceMediaShareKt.AnonymousClass1
            if (r0 == 0) goto L1f
            r5 = r9
            com.facebook.aura.sharesheet.HatchWorkspaceMediaShareKt$prepareRemoteMedia$1 r5 = (com.facebook.aura.sharesheet.HatchWorkspaceMediaShareKt.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 != r2) goto L25
            goto L46
        L1f:
            com.facebook.aura.sharesheet.HatchWorkspaceMediaShareKt$prepareRemoteMedia$1 r5 = new com.facebook.aura.sharesheet.HatchWorkspaceMediaShareKt$prepareRemoteMedia$1
            r5.<init>(r9)
            goto L12
        L25:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2a:
            X.Hwg.A00(r1)
            com.facebook.aura.sharesheet.HatchShareSheetRepository$Companion r0 = com.facebook.aura.sharesheet.HatchShareSheetRepository.Companion     // Catch: java.util.concurrent.CancellationException -> L5d
            com.facebook.aura.sharesheet.HatchShareSheetRepository r1 = r0.getInstance(r7)     // Catch: java.util.concurrent.CancellationException -> L5d
            android.content.Context r0 = X.AnonymousClass001.A0I(r6)     // Catch: java.util.concurrent.CancellationException -> L5d
            r5.L$0 = r3     // Catch: java.util.concurrent.CancellationException -> L5d
            r5.L$1 = r3     // Catch: java.util.concurrent.CancellationException -> L5d
            r5.L$2 = r3     // Catch: java.util.concurrent.CancellationException -> L5d
            r5.label = r2     // Catch: java.util.concurrent.CancellationException -> L5d
            java.lang.Object r1 = r1.prepareMedia$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(r0, r8, r5)     // Catch: java.util.concurrent.CancellationException -> L5d
            if (r1 != r4) goto L49
            return r4
        L46:
            X.Hwg.A00(r1)     // Catch: java.util.concurrent.CancellationException -> L5d
        L49:
            com.facebook.aura.sharesheet.HatchPreparedShareMedia r1 = (com.facebook.aura.sharesheet.HatchPreparedShareMedia) r1     // Catch: java.util.concurrent.CancellationException -> L5d
            if (r1 == 0) goto L64
            android.net.Uri r1 = r1.uri
            java.lang.String r0 = r1.getLastPathSegment()
            if (r0 != 0) goto L57
            java.lang.String r0 = ""
        L57:
            com.facebook.aura.file.actions.HatchFileRef$Local r3 = new com.facebook.aura.file.actions.HatchFileRef$Local
            r3.<init>(r1, r0)
            return r3
        L5d:
            X.78T r0 = r5.getContext()
            X.HzS.A05(r0)
        L64:
            com.facebook.aura.toast.api.ToastApi r1 = com.facebook.aura.toast.api.ToastApi.INSTANCE
            r0 = 2131890568(0x7f121188, float:1.9415831E38)
            r1.showToast(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchWorkspaceMediaShareKt.prepareRemoteMedia(android.content.Context, X.CGz, java.lang.String, X.HtJ):java.lang.Object");
    }

    public static final void shareWorkspaceMedia(AuraNavigator auraNavigator, String str, String str2, String str3, String str4, String str5, boolean z, Context context, AbstractC3358CGz abstractC3358CGz, C3UX c3ux, String str6, HatchDanceShare hatchDanceShare) {
        ShareType shareType;
        String str7 = str4;
        AnonymousClass005.A11(auraNavigator, str2, str3, 0);
        C7384Etj.A0Y(context, 7);
        AnonymousClass002.A1F(abstractC3358CGz, 8, c3ux);
        String str8 = null;
        if (str5 == null || C7BY.A0j(str5)) {
            shareType = z ? ShareType.VIDEO : ShareType.IMAGE;
        } else {
            str8 = str5;
            shareType = ShareType.MESSAGE_MEDIA;
        }
        if (str4 == null) {
            str7 = str3;
        }
        HatchShareDownloadTarget.Media media = new HatchShareDownloadTarget.Media(str3);
        String str9 = str8;
        if (str8 == null) {
            str9 = str;
        }
        HatchShareSheetMCKt.openHatchShareSheetOrElse(auraNavigator, shareType, str7, null, str3, null, media, null, str9, str8, str6, hatchDanceShare, new C137171(str, c3ux, context, str2, abstractC3358CGz));
    }

    public static /* synthetic */ void shareWorkspaceMedia$default(AuraNavigator auraNavigator, String str, String str2, String str3, String str4, String str5, boolean z, Context context, AbstractC3358CGz abstractC3358CGz, C3UX c3ux, String str6, HatchDanceShare hatchDanceShare, int i, Object obj) {
        if ((i & 512) != 0) {
            str6 = null;
        }
        if ((i & 1024) != 0) {
            hatchDanceShare = null;
        }
        shareWorkspaceMedia(auraNavigator, str, str2, str3, str4, str5, z, context, abstractC3358CGz, c3ux, str6, hatchDanceShare);
    }
}
