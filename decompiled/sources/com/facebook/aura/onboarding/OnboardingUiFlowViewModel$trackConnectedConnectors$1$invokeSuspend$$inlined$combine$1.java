package com.facebook.aura.onboarding;

import X.AGI;
import X.AbstractC07127nr;
import X.AbstractC0885AGm;
import X.AnonymousClass001;
import X.BQI;
import X.C20Q;
import X.C20Z;
import X.EnumC10460Hji;
import X.F60;
import X.G0W;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.model.SkillState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class OnboardingUiFlowViewModel$trackConnectedConnectors$1$invokeSuspend$$inlined$combine$1 implements C20Q<BQI<? extends String>> {
    public final /* synthetic */ List $connectorIds$inlined;
    public final /* synthetic */ C20Q[] $flowArray$inlined;

    @DebugMetadata(c = "com.facebook.aura.onboarding.OnboardingUiFlowViewModel$trackConnectedConnectors$1$invokeSuspend$$inlined$combine$1", f = "OnboardingUiFlowViewModel.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "collect", v = 2)
    /* renamed from: com.facebook.aura.onboarding.OnboardingUiFlowViewModel$trackConnectedConnectors$1$invokeSuspend$$inlined$combine$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OnboardingUiFlowViewModel$trackConnectedConnectors$1$invokeSuspend$$inlined$combine$1.this.collect(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.onboarding.OnboardingUiFlowViewModel$trackConnectedConnectors$1$invokeSuspend$$inlined$combine$1$3", f = "OnboardingUiFlowViewModel.kt", l = {288}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.onboarding.OnboardingUiFlowViewModel$trackConnectedConnectors$1$invokeSuspend$$inlined$combine$1$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0W<C20Z<? super BQI<? extends String>>, Skill[], HtJ<? super Unit>, Object> {
        public final /* synthetic */ List $connectorIds$inlined;
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HtJ htJ, List list) {
            super(3, htJ);
            this.$connectorIds$inlined = list;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C20Z c20z = (C20Z) this.L$0;
            Object[] objArr = (Object[]) this.L$1;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                Skill[] skillArr = (Skill[]) objArr;
                List list = this.$connectorIds$inlined;
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                for (Object obj2 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC0885AGm.A14();
                        throw F60.createAndThrow();
                    }
                    Skill skill = skillArr[i2];
                    if ((skill != null ? skill.state : null) == SkillState.CONNECTED) {
                        arrayList.add(obj2);
                    }
                    i2 = i3;
                }
                BQI bqiA09 = AGI.A09(arrayList);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (c20z.emit(bqiA09, this) == enumC10460Hji) {
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

        @Override // X.G0W
        public final Object invoke(C20Z<? super BQI<? extends String>> c20z, Skill[] skillArr, HtJ<? super Unit> htJ) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(htJ, this.$connectorIds$inlined);
            anonymousClass3.L$0 = c20z;
            anonymousClass3.L$1 = skillArr;
            return anonymousClass3.invokeSuspend(Unit.INSTANCE);
        }
    }

    public OnboardingUiFlowViewModel$trackConnectedConnectors$1$invokeSuspend$$inlined$combine$1(C20Q[] c20qArr, List list) {
        this.$flowArray$inlined = c20qArr;
        this.$connectorIds$inlined = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    @Override // X.C20Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(X.C20Z<? super X.BQI<? extends java.lang.String>> r9, X.HtJ r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.onboarding.OnboardingUiFlowViewModel$trackConnectedConnectors$1$invokeSuspend$$inlined$combine$1.AnonymousClass1
            if (r0 == 0) goto L44
            r7 = r10
            com.facebook.aura.onboarding.OnboardingUiFlowViewModel$trackConnectedConnectors$1$invokeSuspend$$inlined$combine$1$1 r7 = (com.facebook.aura.onboarding.OnboardingUiFlowViewModel$trackConnectedConnectors$1$invokeSuspend$$inlined$combine$1.AnonymousClass1) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r1 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r5 = 1
            if (r0 == 0) goto L23
            if (r0 != r5) goto L4a
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L23:
            X.Hwg.A00(r1)
            X.20Q[] r4 = r8.$flowArray$inlined
            com.facebook.aura.onboarding.OnboardingUiFlowViewModel$trackConnectedConnectors$1$invokeSuspend$$inlined$combine$1$2 r3 = new com.facebook.aura.onboarding.OnboardingUiFlowViewModel$trackConnectedConnectors$1$invokeSuspend$$inlined$combine$1$2
            r3.<init>()
            r2 = 0
            java.util.List r1 = r8.$connectorIds$inlined
            com.facebook.aura.onboarding.OnboardingUiFlowViewModel$trackConnectedConnectors$1$invokeSuspend$$inlined$combine$1$3 r0 = new com.facebook.aura.onboarding.OnboardingUiFlowViewModel$trackConnectedConnectors$1$invokeSuspend$$inlined$combine$1$3
            r0.<init>(r2, r1)
            r7.L$0 = r2
            r7.L$1 = r2
            r7.L$2 = r2
            r7.label = r5
            java.lang.Object r0 = X.C4vq.A00(r7, r3, r0, r9, r4)
            if (r0 != r6) goto L20
            return r6
        L44:
            com.facebook.aura.onboarding.OnboardingUiFlowViewModel$trackConnectedConnectors$1$invokeSuspend$$inlined$combine$1$1 r7 = new com.facebook.aura.onboarding.OnboardingUiFlowViewModel$trackConnectedConnectors$1$invokeSuspend$$inlined$combine$1$1
            r7.<init>(r10)
            goto L12
        L4a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.onboarding.OnboardingUiFlowViewModel$trackConnectedConnectors$1$invokeSuspend$$inlined$combine$1.collect(X.20Z, X.HtJ):java.lang.Object");
    }
}
