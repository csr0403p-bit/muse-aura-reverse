package com.facebook.aura.appappearance;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C06G;
import X.C3UX;
import X.C3cG;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.uicontrol.ContributedUiAction;
import com.facebook.aura.uicontrol.UiSuggestionLabel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class SetAppearanceModeUiAction extends C06G implements ContributedUiAction {
    public final int value;

    @DebugMetadata(c = "com.facebook.aura.appappearance.SetAppearanceModeUiAction", f = "AppAppearanceUiCommands.kt", l = {86}, m = "perform", v = 2)
    /* renamed from: com.facebook.aura.appappearance.SetAppearanceModeUiAction$perform$1, reason: invalid class name */
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
            return SetAppearanceModeUiAction.this.perform(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.appappearance.SetAppearanceModeUiAction$perform$2", f = "AppAppearanceUiCommands.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.appappearance.SetAppearanceModeUiAction$perform$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SetAppearanceModeUiAction.this.new AnonymousClass2(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            HatchAppAppearanceManager.INSTANCE.setAppearance(C3cG.A06(), SetAppearanceModeUiAction.this.value);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SetAppearanceModeUiAction.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SetAppearanceModeUiAction) && this.value == ((SetAppearanceModeUiAction) obj).value);
    }

    public static /* synthetic */ SetAppearanceModeUiAction copy$default(SetAppearanceModeUiAction setAppearanceModeUiAction, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = setAppearanceModeUiAction.value;
        }
        return new SetAppearanceModeUiAction(i);
    }

    public final int component1() {
        return this.value;
    }

    public final SetAppearanceModeUiAction copy(int i) {
        return new SetAppearanceModeUiAction(i);
    }

    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    public Integer getIconRes() {
        return null;
    }

    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    public UiSuggestionLabel getSuggestionLabel() {
        return null;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object perform(X.AbstractC3358CGz r7, X.HtJ<? super com.facebook.aura.uicontrol.UiActionExecutor.Result> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.appappearance.SetAppearanceModeUiAction.AnonymousClass1
            if (r0 == 0) goto L39
            r5 = r8
            com.facebook.aura.appappearance.SetAppearanceModeUiAction$perform$1 r5 = (com.facebook.aura.appappearance.SetAppearanceModeUiAction.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L3f
            X.Hwg.A00(r1)
        L20:
            com.facebook.aura.uicontrol.UiActionExecutor$Result$Performed r4 = com.facebook.aura.uicontrol.UiActionExecutor.Result.Performed.INSTANCE
            return r4
        L23:
            X.Hwg.A00(r1)
            X.GBK r2 = com.facebook.aura.executors.AuraDispatchers.mainImmediate
            r1 = 0
            com.facebook.aura.appappearance.SetAppearanceModeUiAction$perform$2 r0 = new com.facebook.aura.appappearance.SetAppearanceModeUiAction$perform$2
            r0.<init>(r1)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r0 = X.GAo.A00(r5, r2, r0)
            if (r0 != r4) goto L20
            return r4
        L39:
            com.facebook.aura.appappearance.SetAppearanceModeUiAction$perform$1 r5 = new com.facebook.aura.appappearance.SetAppearanceModeUiAction$perform$1
            r5.<init>(r8)
            goto L12
        L3f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.appappearance.SetAppearanceModeUiAction.perform(X.CGz, X.HtJ):java.lang.Object");
    }

    public SetAppearanceModeUiAction(int i) {
        this.value = i;
    }

    public String toString() {
        return super.toString();
    }
}
