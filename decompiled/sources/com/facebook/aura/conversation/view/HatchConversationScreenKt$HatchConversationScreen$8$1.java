package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.C3UX;
import X.C7OU;
import X.G0V;
import X.HtJ;
import X.InterfaceC10560Hsz;
import android.content.Context;
import com.facebook.aura.settings.support.HatchContactSupportViewModelKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationScreenKt$HatchConversationScreen$8$1", f = "HatchConversationScreen.kt", l = {HatchContactSupportViewModelKt.MAX_EMAIL_LENGTH, 325}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationScreenKt$HatchConversationScreen$8$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ InterfaceC10560Hsz<Unit> $notificationPermissionDeferred;
    public final /* synthetic */ C7OU<String, Boolean> $notificationPermissionLauncher;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationScreenKt$HatchConversationScreen$8$1(Context context, C7OU<String, Boolean> c7ou, InterfaceC10560Hsz<Unit> interfaceC10560Hsz, HtJ<? super HatchConversationScreenKt$HatchConversationScreen$8$1> htJ) {
        super(2, htJ);
        this.$context = context;
        this.$notificationPermissionLauncher = c7ou;
        this.$notificationPermissionDeferred = interfaceC10560Hsz;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationScreenKt$HatchConversationScreen$8$1(this.$context, this.$notificationPermissionLauncher, this.$notificationPermissionDeferred, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L12
            if (r0 == r1) goto L28
            if (r0 != r2) goto L49
            X.Hwg.A00(r5)
        Lf:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L12:
            X.Hwg.A00(r5)
            android.content.Context r0 = r4.$context
            boolean r0 = com.facebook.aura.utils.HatchNotificationPermissionLauncherKt.isFirstNotificationPromptPending(r0)
            if (r0 == 0) goto Lf
            r4.label = r1
            r0 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r0 = X.C7Bq.A01(r0, r4)
            if (r0 != r3) goto L2b
            return r3
        L28:
            X.Hwg.A00(r5)
        L2b:
            com.facebook.aura.analytics.hatch.HatchEventType r0 = com.facebook.aura.analytics.hatch.HatchEventType.PERMISSION_PROMPTED
            com.facebook.aura.conversation.view.HatchConversationScreenKt.logNotificationPermission(r0)
            X.7OU<java.lang.String, java.lang.Boolean> r0 = r4.$notificationPermissionLauncher
            java.lang.String r1 = "android.permission.POST_NOTIFICATIONS"
            r0.A02(r1)
            com.facebook.aura.utils.HatchPermissionRequestStore r0 = com.facebook.aura.utils.HatchPermissionRequestStore.INSTANCE
            r0.markPermissionRequested(r1)
            X.Hsz<kotlin.Unit> r0 = r4.$notificationPermissionDeferred
            r4.label = r2
            X.GBM r0 = (X.GBM) r0
            java.lang.Object r0 = r0.A0E(r4)
            if (r0 != r3) goto Lf
            return r3
        L49:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationScreenKt$HatchConversationScreen$8$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchConversationScreenKt$HatchConversationScreen$8$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
