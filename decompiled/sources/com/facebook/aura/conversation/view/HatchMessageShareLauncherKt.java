package com.facebook.aura.conversation.view;

import X.AnonymousClass003;
import X.BFM;
import X.C3UX;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.model.HatchMessageRole;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchMessageShareLauncherKt {
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.jvm.functions.Function0<kotlin.Unit> rememberHatchMessageImageCopyAction(com.facebook.aura.conversation.viewmodel.HatchMessageUiModel r8, java.lang.String r9, X.G0U<? super com.facebook.aura.file.view.api.ContentItem, kotlin.Unit> r10, X.BFM r11, int r12) {
        /*
            r5 = 0
            X.C7384Etj.A0Y(r8, r5)
            r0 = -1401741760(0xffffffffac731e40, float:-3.454917E-12)
            r7 = r11
            r11.AgE(r0)
            r1 = 0
            if (r10 == 0) goto L58
            if (r9 == 0) goto L58
            X.BO6<java.lang.String, com.facebook.aura.file.view.api.ContentItem> r0 = r8.imageCopyTargets
            java.lang.Object r3 = r0.get(r9)
            com.facebook.aura.file.view.api.ContentItem r3 = (com.facebook.aura.file.view.api.ContentItem) r3
            if (r3 == 0) goto L58
            java.lang.String r4 = r3.imageUri
            if (r4 == 0) goto L58
            java.lang.String r6 = r3.workspacePath
            r9 = 2
            r8 = r5
            boolean r0 = com.facebook.aura.conversation.view.richcontent.LocalDeletedMediaKeysKt.isMediaDeleted(r4, r5, r6, r7, r8, r9)
            if (r0 != 0) goto L58
            r0 = r12 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r2 = 256(0x100, float:3.59E-43)
            if (r0 <= r2) goto L36
            boolean r0 = r11.A65(r10)
            if (r0 != 0) goto L3b
        L36:
            r1 = r12 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r2) goto L3c
        L3b:
            r0 = 1
        L3c:
            boolean r1 = X.AnonymousClass001.A1R(r11, r3, r0)
            java.lang.Object r0 = r11.AaT()
            if (r1 != 0) goto L4a
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L52
        L4a:
            com.facebook.aura.conversation.view.HatchMessageShareLauncherKt$rememberHatchMessageImageCopyAction$1$1 r0 = new com.facebook.aura.conversation.view.HatchMessageShareLauncherKt$rememberHatchMessageImageCopyAction$1$1
            r0.<init>(r10, r3)
            r11.Ai0(r0)
        L52:
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            X.AnonymousClass001.A1D(r11)
            return r0
        L58:
            X.AnonymousClass001.A1D(r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageShareLauncherKt.rememberHatchMessageImageCopyAction(com.facebook.aura.conversation.viewmodel.HatchMessageUiModel, java.lang.String, X.G0U, X.BFM, int):kotlin.jvm.functions.Function0");
    }

    public static final boolean canShareText(HatchMessageUiModel hatchMessageUiModel) {
        return hatchMessageUiModel.content.length() > 0 && !hatchMessageUiModel.isStreaming && hatchMessageUiModel.role == HatchMessageRole.AGENT;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.conversation.view.HatchMessageShareActions rememberHatchMessageMediaActions(com.facebook.aura.conversation.viewmodel.HatchMessageUiModel r18, java.lang.String r19, X.C3UX r20, X.BFM r21, int r22) {
        /*
            r0 = -1858491597(0xffffffff9139ab33, float:-1.4646682E-28)
            r4 = r21
            r4.AgE(r0)
            r1 = 0
            r11 = r18
            r2 = r19
            if (r19 == 0) goto L19
            X.BO6<java.lang.String, com.facebook.aura.file.view.api.ContentItem> r0 = r11.mediaShareTargets
            java.lang.Object r5 = r0.get(r2)
            com.facebook.aura.file.view.api.ContentItem r5 = (com.facebook.aura.file.view.api.ContentItem) r5
            if (r5 != 0) goto L21
        L19:
            com.facebook.aura.file.view.api.ContentItem r5 = r11.shareableMedia
            if (r5 != 0) goto L21
        L1d:
            X.AnonymousClass002.A19(r4)
            return r1
        L21:
            java.lang.String r3 = r5.workspacePath
            if (r3 == 0) goto L1d
            java.lang.String r10 = r5.imageUri
            if (r10 == 0) goto L1d
            r13 = 0
            r17 = 2
            r12 = r10
            r14 = r3
            r15 = r4
            r16 = r13
            boolean r0 = com.facebook.aura.conversation.view.richcontent.LocalDeletedMediaKeysKt.isMediaDeleted(r12, r13, r14, r15, r16, r17)
            if (r0 != 0) goto L1d
            android.content.Context r6 = X.AnonymousClass002.A0H(r4)
            com.facebook.aura.navigation.AuraNavigator r13 = X.AnonymousClass002.A0b(r4)
            X.CGz r2 = X.AnonymousClass002.A0h(r4)
            boolean r0 = r4.A67(r13)
            boolean r0 = X.AnonymousClass005.A1T(r4, r3, r5, r10, r0)
            boolean r15 = X.AnonymousClass004.A1T(r4, r6, r2, r0)
            r12 = r22
            r0 = r12 & 896(0x380, float:1.256E-42)
            r9 = r0 ^ 384(0x180, float:5.38E-43)
            r8 = 256(0x100, float:3.59E-43)
            r7 = r20
            if (r9 <= r8) goto L61
            boolean r0 = r4.A67(r7)
            if (r0 != 0) goto L66
        L61:
            r1 = r12 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r8) goto L67
        L66:
            r0 = 1
        L67:
            r15 = r15 | r0
            r0 = r22 & 14
            r0 = r0 ^ 6
            r14 = 4
            if (r0 <= r14) goto L75
            boolean r0 = r4.A67(r11)
            if (r0 != 0) goto L7a
        L75:
            r1 = r22 & 6
            r0 = 0
            if (r1 != r14) goto L7b
        L7a:
            r0 = 1
        L7b:
            r15 = r15 | r0
            java.lang.Object r14 = r4.AaT()
            if (r15 != 0) goto L86
            java.lang.Object r0 = X.C78N.A00
            if (r14 != r0) goto L9d
        L86:
            com.facebook.aura.conversation.view.HatchMessageShareLauncherKt$rememberHatchMessageMediaActions$1$1 r14 = new com.facebook.aura.conversation.view.HatchMessageShareLauncherKt$rememberHatchMessageMediaActions$1$1
            r22 = r11
            r21 = r7
            r20 = r2
            r19 = r6
            r18 = r10
            r17 = r5
            r16 = r3
            r15 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r4.Ai0(r14)
        L9d:
            kotlin.jvm.functions.Function0 r14 = (kotlin.jvm.functions.Function0) r14
            if (r9 <= r8) goto La7
            boolean r0 = r4.A67(r7)
            if (r0 != 0) goto Lac
        La7:
            r1 = r12 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r8) goto Lad
        Lac:
            r0 = 1
        Lad:
            boolean r0 = X.AnonymousClass005.A1W(r4, r6, r3, r5, r0)
            boolean r0 = X.AnonymousClass001.A1T(r4, r2, r0)
            java.lang.Object r8 = r4.AaT()
            if (r0 != 0) goto Lbf
            java.lang.Object r0 = X.C78N.A00
            if (r8 != r0) goto Lcc
        Lbf:
            com.facebook.aura.conversation.view.HatchMessageShareLauncherKt$rememberHatchMessageMediaActions$2$1 r8 = new com.facebook.aura.conversation.view.HatchMessageShareLauncherKt$rememberHatchMessageMediaActions$2$1
            r9 = r7
            r10 = r6
            r11 = r3
            r12 = r5
            r13 = r2
            r8.<init>(r9, r10, r11, r12, r13)
            r4.Ai0(r8)
        Lcc:
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            com.facebook.aura.conversation.view.HatchMessageShareActions r0 = new com.facebook.aura.conversation.view.HatchMessageShareActions
            r0.<init>(r14, r8)
            X.AnonymousClass001.A1D(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageShareLauncherKt.rememberHatchMessageMediaActions(com.facebook.aura.conversation.viewmodel.HatchMessageUiModel, java.lang.String, X.3UX, X.BFM, int):com.facebook.aura.conversation.view.HatchMessageShareActions");
    }

    public static final HatchMessageShareActions rememberHatchMessageShareAction(HatchMessageUiModel hatchMessageUiModel, String str, C3UX c3ux, BFM bfm, int i) {
        AnonymousClass003.A0v(hatchMessageUiModel, c3ux);
        int i2 = HatchMessageUiModel.$stable;
        int i3 = i & 14;
        Function0<Unit> function0RememberHatchMessageTextShareAction = rememberHatchMessageTextShareAction(hatchMessageUiModel, bfm, i2 | i3);
        HatchMessageShareActions hatchMessageShareActionsRememberHatchMessageMediaActions = rememberHatchMessageMediaActions(hatchMessageUiModel, str, c3ux, bfm, (i & 896) | i3 | i2 | (i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX));
        if (hatchMessageShareActionsRememberHatchMessageMediaActions == null) {
            if (!canShareText(hatchMessageUiModel)) {
                return new HatchMessageShareActions(null, null);
            }
            hatchMessageShareActionsRememberHatchMessageMediaActions = new HatchMessageShareActions(function0RememberHatchMessageTextShareAction, null);
        }
        return hatchMessageShareActionsRememberHatchMessageMediaActions;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.jvm.functions.Function0<kotlin.Unit> rememberHatchMessageTextShareAction(com.facebook.aura.conversation.viewmodel.HatchMessageUiModel r10, X.BFM r11, int r12) {
        /*
            android.content.Context r7 = X.AnonymousClass003.A0O(r11)
            com.facebook.aura.navigation.AuraNavigator r8 = X.AnonymousClass003.A0b(r11)
            X.CGz r9 = X.AnonymousClass002.A0g(r11)
            java.lang.Object r0 = r11.AaT()
            java.lang.Object r3 = X.C78N.A00
            java.lang.Object r5 = X.AnonymousClass004.A15(r11, r0, r3)
            X.3UX r5 = (X.C3UX) r5
            r0 = r12 & 14
            r0 = r0 ^ 6
            r2 = 4
            r6 = r10
            if (r0 <= r2) goto L26
            boolean r0 = r11.A65(r10)
            if (r0 != 0) goto L2b
        L26:
            r1 = r12 & 6
            r0 = 0
            if (r1 != r2) goto L2c
        L2b:
            r0 = 1
        L2c:
            boolean r0 = X.AnonymousClass005.A1T(r11, r7, r8, r9, r0)
            boolean r0 = X.AnonymousClass001.A1R(r11, r5, r0)
            java.lang.Object r4 = r11.AaT()
            if (r0 != 0) goto L3c
            if (r4 != r3) goto L44
        L3c:
            com.facebook.aura.conversation.view.HatchMessageShareLauncherKt$rememberHatchMessageTextShareAction$1$1 r4 = new com.facebook.aura.conversation.view.HatchMessageShareLauncherKt$rememberHatchMessageTextShareAction$1$1
            r4.<init>(r5, r6, r7, r8, r9)
            r11.Ai0(r4)
        L44:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageShareLauncherKt.rememberHatchMessageTextShareAction(com.facebook.aura.conversation.viewmodel.HatchMessageUiModel, X.BFM, int):kotlin.jvm.functions.Function0");
    }
}
