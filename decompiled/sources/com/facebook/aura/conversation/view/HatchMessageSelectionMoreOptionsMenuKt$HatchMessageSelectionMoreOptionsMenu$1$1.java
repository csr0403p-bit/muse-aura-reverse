package com.facebook.aura.conversation.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.G0U;
import android.content.Context;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageSelectionMoreOptionsMenuKt$HatchMessageSelectionMoreOptionsMenu$1$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onCopy;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ Function0<Unit> $onDownload;
    public final /* synthetic */ Function0<Unit> $onReply;
    public final /* synthetic */ Function0<Unit> $onSelect;
    public final /* synthetic */ Function0<Unit> $onShare;
    public final /* synthetic */ Function0<Unit> $onUnsend;
    public final /* synthetic */ Function0<Unit> $onViewSources;
    public final /* synthetic */ String $pariscopeMessageId;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem r6) {
        /*
            r5 = this;
            r4 = 0
            X.C7384Etj.A0Y(r6, r4)
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r5.$onDismiss
            r0.invoke()
            int r0 = r6.id
            switch(r0) {
                case 0: goto L70;
                case 1: goto L5f;
                case 2: goto L4e;
                case 3: goto L41;
                case 4: goto L39;
                case 5: goto L31;
                case 6: goto L29;
                case 7: goto L1f;
                case 8: goto L17;
                case 9: goto Le;
                case 10: goto Lf;
                default: goto Le;
            }
        Le:
            return
        Lf:
            com.facebook.aura.analytics.hatch.HatchComponent r0 = com.facebook.aura.analytics.hatch.HatchComponent.SAVE_BUTTON
            X.AnonymousClass006.A1A(r0, r5)
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r5.$onDownload
            goto L48
        L17:
            com.facebook.aura.analytics.hatch.HatchComponent r0 = com.facebook.aura.analytics.hatch.HatchComponent.UNSEND_BUTTON
            X.AnonymousClass006.A1A(r0, r5)
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r5.$onUnsend
            goto L48
        L1f:
            com.facebook.aura.conversation.viewmodel.HatchMessageUiModel r1 = r5.$message
            java.util.Map<java.lang.String, java.lang.String> r0 = r5.$threadLogMetadata
            com.facebook.aura.conversation.view.HatchMessageSelectionMoreOptionsMenuKt.logViewSourcesClick(r1, r0)
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r5.$onViewSources
            goto L48
        L29:
            com.facebook.aura.analytics.hatch.HatchComponent r0 = com.facebook.aura.analytics.hatch.HatchComponent.SHARE_BUTTON
            X.AnonymousClass006.A1A(r0, r5)
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r5.$onShare
            goto L48
        L31:
            com.facebook.aura.analytics.hatch.HatchComponent r0 = com.facebook.aura.analytics.hatch.HatchComponent.SELECT_TEXT_BUTTON
            X.AnonymousClass006.A1A(r0, r5)
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r5.$onSelect
            goto L48
        L39:
            com.facebook.aura.analytics.hatch.HatchComponent r0 = com.facebook.aura.analytics.hatch.HatchComponent.COPY_BUTTON
            X.AnonymousClass006.A1A(r0, r5)
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r5.$onCopy
            goto L48
        L41:
            com.facebook.aura.analytics.hatch.HatchComponent r0 = com.facebook.aura.analytics.hatch.HatchComponent.REPLY_BUTTON
            X.AnonymousClass006.A1A(r0, r5)
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r5.$onReply
        L48:
            if (r0 == 0) goto Le
            r0.invoke()
            return
        L4e:
            java.util.Map<java.lang.String, java.lang.String> r0 = r5.$threadLogMetadata
            com.facebook.aura.conversation.view.HatchMessageSelectionMoreOptionsMenuKt.logCopyPariscopeLinkClick(r0)
            com.facebook.aura.conversation.view.HatchPariscopeLauncher r3 = com.facebook.aura.conversation.view.HatchPariscopeLauncher.INSTANCE
            X.CGz r2 = r5.$userSession
            java.lang.String r1 = r5.$pariscopeMessageId
            android.content.Context r0 = r5.$context
            r3.copyLinkToClipboard(r2, r1, r0)
            return
        L5f:
            com.facebook.aura.analytics.hatch.HatchComponent r0 = com.facebook.aura.analytics.hatch.HatchComponent.THUMBS_DOWN
            X.AnonymousClass006.A1A(r0, r5)
            com.facebook.aura.navigation.AuraNavigator r3 = r5.$navigator
            com.facebook.aura.conversation.viewmodel.HatchMessageUiModel r0 = r5.$message
            java.lang.String r0 = r0.id
            com.facebook.aura.navigation.key.HatchFeedbackSheetKey r1 = new com.facebook.aura.navigation.key.HatchFeedbackSheetKey
            r1.<init>(r4, r0)
            goto L81
        L70:
            com.facebook.aura.analytics.hatch.HatchComponent r0 = com.facebook.aura.analytics.hatch.HatchComponent.THUMBS_UP
            X.AnonymousClass006.A1A(r0, r5)
            com.facebook.aura.navigation.AuraNavigator r3 = r5.$navigator
            com.facebook.aura.conversation.viewmodel.HatchMessageUiModel r0 = r5.$message
            java.lang.String r2 = r0.id
            r0 = 1
            com.facebook.aura.navigation.key.HatchFeedbackSheetKey r1 = new com.facebook.aura.navigation.key.HatchFeedbackSheetKey
            r1.<init>(r0, r2)
        L81:
            r3.navigate(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchMessageSelectionMoreOptionsMenuKt$HatchMessageSelectionMoreOptionsMenu$1$1.invoke2(com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageSelectionMoreOptionsMenuKt$HatchMessageSelectionMoreOptionsMenu$1$1(Function0<Unit> function0, Map<String, String> map, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, Function0<Unit> function07, HatchMessageUiModel hatchMessageUiModel, Function0<Unit> function08, AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, String str, Context context) {
        super(1);
        this.$onDismiss = function0;
        this.$threadLogMetadata = map;
        this.$onReply = function02;
        this.$onCopy = function03;
        this.$onShare = function04;
        this.$onDownload = function05;
        this.$onSelect = function06;
        this.$onUnsend = function07;
        this.$message = hatchMessageUiModel;
        this.$onViewSources = function08;
        this.$navigator = auraNavigator;
        this.$userSession = abstractC3358CGz;
        this.$pariscopeMessageId = str;
        this.$context = context;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
