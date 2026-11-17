package com.facebook.aura.browsertask.navigation;

import X.AbstractC3358CGz;
import X.C7384Etj;
import X.FGI;
import X.HtJ;
import X.HzP;
import com.facebook.aura.R;
import com.facebook.aura.uicontrol.ContributedUiAction;
import com.facebook.aura.uicontrol.UiControlNavigationHost;
import com.facebook.aura.uicontrol.UiSuggestionLabel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class OpenBrowserTaskUiAction implements ContributedUiAction {
    public final String taskId;

    @DebugMetadata(c = "com.facebook.aura.browsertask.navigation.OpenBrowserTaskUiAction", f = "BrowserTaskUiCommands.kt", l = {93}, m = "perform", v = 2)
    /* renamed from: com.facebook.aura.browsertask.navigation.OpenBrowserTaskUiAction$perform$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OpenBrowserTaskUiAction.this.perform(null, this);
        }
    }

    public OpenBrowserTaskUiAction(String str) {
        C7384Etj.A0Y(str, 0);
        this.taskId = str;
    }

    public static final BrowserTaskAgentOpenResult perform$lambda$0(AbstractC3358CGz abstractC3358CGz, OpenBrowserTaskUiAction openBrowserTaskUiAction, UiControlNavigationHost uiControlNavigationHost) {
        C7384Etj.A0Y(uiControlNavigationHost, 2);
        return new BrowserTaskNavigation(abstractC3358CGz).openTaskForAgent$fbandroid_express_aura_java_com_facebook_aura_browsertask_navigation_navigation(openBrowserTaskUiAction.taskId, uiControlNavigationHost.navigator);
    }

    public final OpenBrowserTaskUiAction copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new OpenBrowserTaskUiAction(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof OpenBrowserTaskUiAction) && C7384Etj.areEqual(this.taskId, ((OpenBrowserTaskUiAction) obj).taskId));
    }

    public static /* synthetic */ OpenBrowserTaskUiAction copy$default(OpenBrowserTaskUiAction openBrowserTaskUiAction, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openBrowserTaskUiAction.taskId;
        }
        C7384Etj.A0Y(str, 0);
        return new OpenBrowserTaskUiAction(str);
    }

    public final String component1() {
        return this.taskId;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public int hashCode() {
        return this.taskId.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object perform(final X.AbstractC3358CGz r7, X.HtJ<? super com.facebook.aura.uicontrol.UiActionExecutor.Result> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.browsertask.navigation.OpenBrowserTaskUiAction.AnonymousClass1
            if (r0 == 0) goto L47
            r5 = r8
            com.facebook.aura.browsertask.navigation.OpenBrowserTaskUiAction$perform$1 r5 = (com.facebook.aura.browsertask.navigation.OpenBrowserTaskUiAction.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L2d
            if (r0 != r3) goto L74
            X.Hwg.A00(r1)
        L20:
            com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenResult r1 = (com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenResult) r1
            com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenResult$Opened r0 = com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenResult.Opened.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L4d
            com.facebook.aura.uicontrol.UiActionExecutor$Result$Performed r1 = com.facebook.aura.uicontrol.UiActionExecutor.Result.Performed.INSTANCE
            return r1
        L2d:
            X.Hwg.A00(r1)
            com.facebook.aura.uicontrol.UiControlActionSink$Companion r0 = com.facebook.aura.uicontrol.UiControlActionSink.Companion
            com.facebook.aura.uicontrol.UiControlActionSink r2 = r0.getInstance(r7)
            com.facebook.aura.browsertask.navigation.OpenBrowserTaskUiAction$$ExternalSyntheticLambda0 r1 = new com.facebook.aura.browsertask.navigation.OpenBrowserTaskUiAction$$ExternalSyntheticLambda0
            r1.<init>()
            r0 = 0
            r5.L$0 = r0
            r5.label = r3
            java.lang.Object r1 = r2.withVisibleNavigationHost(r1, r5)
            if (r1 != r4) goto L20
            return r4
        L47:
            com.facebook.aura.browsertask.navigation.OpenBrowserTaskUiAction$perform$1 r5 = new com.facebook.aura.browsertask.navigation.OpenBrowserTaskUiAction$perform$1
            r5.<init>(r8)
            goto L12
        L4d:
            boolean r0 = r1 instanceof com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenResult.Failed
            r3 = 0
            if (r0 == 0) goto L62
            com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenResult$Failed r1 = (com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenResult.Failed) r1
            com.facebook.aura.browsertask.navigation.BrowserTaskAgentOpenFailure r1 = r1.reason
            java.lang.String r0 = r6.taskId
            java.lang.String r0 = com.facebook.aura.browsertask.navigation.BrowserTaskUiCommandsKt.message(r1, r0)
        L5c:
            com.facebook.aura.uicontrol.UiActionExecutor$Result$Unsupported r1 = new com.facebook.aura.uicontrol.UiActionExecutor$Result$Unsupported
            r1.<init>(r0, r3)
            return r1
        L62:
            if (r1 != 0) goto L6f
            java.lang.String r2 = r6.taskId
            java.lang.String r1 = "The app is not on screen, so browser task "
            java.lang.String r0 = " was not opened. Ask the user to open the app and tap the browser card."
            java.lang.String r0 = X.FGI.A0U(r1, r2, r0)
            goto L5c
        L6f:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L74:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.navigation.OpenBrowserTaskUiAction.perform(X.CGz, X.HtJ):java.lang.Object");
    }

    public String toString() {
        return FGI.A0U("OpenBrowserTaskUiAction(taskId=", this.taskId, ")");
    }

    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    public Integer getIconRes() {
        return Integer.valueOf(R.drawable.globe_wght400_outline_24);
    }

    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    public UiSuggestionLabel getSuggestionLabel() {
        return new UiSuggestionLabel(R.string._name_removed__res_0x7f120bd5, R.string._name_removed__res_0x7f120bee);
    }
}
