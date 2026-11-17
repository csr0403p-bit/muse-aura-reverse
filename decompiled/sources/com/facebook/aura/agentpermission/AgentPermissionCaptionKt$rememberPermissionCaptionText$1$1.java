package com.facebook.aura.agentpermission;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.ApQ;
import X.C3UX;
import X.C78T;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.executors.AuraDispatchers;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionCaptionKt$rememberPermissionCaptionText$1$1", f = "AgentPermissionCaption.kt", l = {27}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AgentPermissionCaptionKt$rememberPermissionCaptionText$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $caption;
    public final /* synthetic */ MutableState<ApQ> $formattedCaption;
    public final /* synthetic */ long $linkColor;
    public Object L$0;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.agentpermission.AgentPermissionCaptionKt$rememberPermissionCaptionText$1$1$1", f = "AgentPermissionCaption.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionCaptionKt$rememberPermissionCaptionText$1$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ApQ>, Object> {
        public final /* synthetic */ String $caption;
        public final /* synthetic */ long $linkColor;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, long j, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$caption = str;
            this.$linkColor = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$caption, this.$linkColor, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r50) {
            /*
                Method dump skipped, instructions count: 924
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.AgentPermissionCaptionKt$rememberPermissionCaptionText$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ApQ> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionCaptionKt$rememberPermissionCaptionText$1$1(MutableState<ApQ> mutableState, String str, long j, HtJ<? super AgentPermissionCaptionKt$rememberPermissionCaptionText$1$1> htJ) {
        super(2, htJ);
        this.$formattedCaption = mutableState;
        this.$caption = str;
        this.$linkColor = j;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AgentPermissionCaptionKt$rememberPermissionCaptionText$1$1(this.$formattedCaption, this.$caption, this.$linkColor, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            mutableState = this.$formattedCaption;
            C78T c78tM764default = AuraDispatchers.INSTANCE.m764default();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$caption, this.$linkColor, null);
            this.L$0 = mutableState;
            this.label = 1;
            obj = GAo.A00(this, c78tM764default, anonymousClass1);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            mutableState = (MutableState) this.L$0;
            Hwg.A00(obj);
        }
        mutableState.Af8(obj);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AgentPermissionCaptionKt$rememberPermissionCaptionText$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
