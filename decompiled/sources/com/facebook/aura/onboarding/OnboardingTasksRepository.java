package com.facebook.aura.onboarding;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.C06H;
import X.C5246DeB;
import X.HtJ;
import X.HzP;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class OnboardingTasksRepository {
    public static final Companion Companion = new Companion();

    @DebugMetadata(c = "com.facebook.aura.onboarding.OnboardingTasksRepository", f = "OnboardingTasksRepository.kt", l = {84}, m = "getSuggestedTasks", v = 2)
    /* renamed from: com.facebook.aura.onboarding.OnboardingTasksRepository$getSuggestedTasks$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OnboardingTasksRepository.this.getSuggestedTasks(null, this);
        }
    }

    private final String resolveMediaUri(String str, AbstractC3358CGz abstractC3358CGz) {
        String strA0l;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
            return null;
        }
        WorkspaceUriResolver workspaceUriResolver = WorkspaceUriResolver.INSTANCE;
        return workspaceUriResolver.isDaemonApiReference(strA0l) ? workspaceUriResolver.resolveDaemonApiUrl(strA0l, abstractC3358CGz) : strA0l;
    }

    public final class Companion {
        public final OnboardingTasksRepository getInstance() {
            return (OnboardingTasksRepository) C5246DeB.A00(32774);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getSuggestedTasks(X.AbstractC3358CGz r19, X.HtJ<? super java.util.List<com.facebook.aura.onboarding.OnboardingTask>> r20) {
        /*
            r18 = this;
            r5 = r20
            r10 = r19
            boolean r1 = r5 instanceof com.facebook.aura.onboarding.OnboardingTasksRepository.AnonymousClass1
            r0 = r18
            if (r1 == 0) goto Lb8
            r3 = r5
            com.facebook.aura.onboarding.OnboardingTasksRepository$getSuggestedTasks$1 r3 = (com.facebook.aura.onboarding.OnboardingTasksRepository.AnonymousClass1) r3
            int r4 = r3.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r2
            if (r1 == 0) goto Lb8
            int r4 = r4 - r2
            r3.label = r4
        L18:
            java.lang.Object r4 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r3.label
            r15 = 1
            if (r1 == 0) goto L6f
            if (r1 != r15) goto Lc0
            java.lang.Object r10 = r3.L$0
            X.CGz r10 = (X.AbstractC3358CGz) r10
            java.lang.Object r3 = X.AnonymousClass001.A0q(r4)
        L2b:
            boolean r1 = r3 instanceof X.C10571Hud
            r2 = 0
            if (r1 == 0) goto L31
            r3 = r2
        L31:
            com.facebook.aura.onboarding.OnboardingTasksPayloadJson r3 = (com.facebook.aura.onboarding.OnboardingTasksPayloadJson) r3
            if (r3 == 0) goto Lb7
            java.util.List r1 = r3.toDomain()
            if (r1 == 0) goto Lb7
            java.util.ArrayList r5 = X.AnonymousClass003.A0i(r1)
            java.util.Iterator r4 = r1.iterator()
        L43:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto Lbf
            java.lang.Object r3 = r4.next()
            com.facebook.aura.onboarding.OnboardingTask r3 = (com.facebook.aura.onboarding.OnboardingTask) r3
            java.lang.String r1 = r3.iconUri
            java.lang.String r15 = r0.resolveMediaUri(r1, r10)
            java.lang.String r12 = r3.id
            java.lang.String r13 = r3.title
            java.lang.String r14 = r3.description
            java.lang.String r2 = r3.connectorId
            com.facebook.aura.onboarding.OnboardingTask$CardSource r1 = r3.fromCard
            X.AnonymousClass005.A0x(r12, r13, r14)
            com.facebook.aura.onboarding.OnboardingTask r11 = new com.facebook.aura.onboarding.OnboardingTask
            r16 = r2
            r17 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r5.add(r11)
            goto L43
        L6f:
            X.Hwg.A00(r4)
            com.facebook.aura.network.http.HatchHttpApi r5 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.network.api.JarvisPath$OnboardingTasks r8 = com.facebook.aura.network.api.JarvisPath.OnboardingTasks.INSTANCE
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.GET
            java.lang.String r4 = "iconPalette"
            java.lang.String r1 = "color"
            X.HxE r1 = X.C3cG.A0r(r4, r1)
            r7 = 0
            X.HxE[] r12 = new X.HxE[]{r1}
            java.util.Set r14 = X.AnonymousClass004.A18()
            X.9jH r16 = X.AGH.A0E()
            com.facebook.aura.onboarding.OnboardingTasksRepository$getSuggestedTasks$$inlined$executeJarvisRequest-1iavgos$default$1 r6 = com.facebook.aura.onboarding.OnboardingTasksRepository$getSuggestedTasks$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r3.L$0 = r10
            r11 = 0
            r3.L$1 = r11
            r3.L$2 = r11
            r3.L$3 = r11
            r3.L$4 = r11
            r3.L$5 = r11
            r3.L$6 = r11
            r3.L$7 = r11
            r3.I$0 = r15
            r3.I$1 = r15
            r3.I$2 = r7
            r3.label = r15
            r13 = r11
            r17 = r15
            r18 = r11
            r19 = r7
            r20 = r3
            java.lang.Object r3 = r5.m1595executeBodylessJarvisRequestWithp3iPjrY(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r3 != r2) goto L2b
        Lb7:
            return r2
        Lb8:
            com.facebook.aura.onboarding.OnboardingTasksRepository$getSuggestedTasks$1 r3 = new com.facebook.aura.onboarding.OnboardingTasksRepository$getSuggestedTasks$1
            r3.<init>(r5)
            goto L18
        Lbf:
            return r5
        Lc0:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.onboarding.OnboardingTasksRepository.getSuggestedTasks(X.CGz, X.HtJ):java.lang.Object");
    }
}
