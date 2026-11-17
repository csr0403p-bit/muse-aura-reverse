package com.facebook.aura.conversation.repo;

import X.AbstractC3358CGz;
import X.C7384Etj;
import com.facebook.aura.conversation.api.PrimarySessionIdProvider;
import com.facebook.aura.conversation.api.PrimarySessionIdSource;

/* loaded from: classes3.dex */
public final class HatchPrimarySessionIdProvider implements PrimarySessionIdProvider {
    public static final HatchPrimarySessionIdProvider INSTANCE = new HatchPrimarySessionIdProvider();

    /* renamed from: com.facebook.aura.conversation.repo.HatchPrimarySessionIdProvider$source$1, reason: invalid class name */
    public final class AnonymousClass1 implements PrimarySessionIdSource {
        public final /* synthetic */ AbstractC3358CGz $userSession;

        public AnonymousClass1(AbstractC3358CGz abstractC3358CGz) {
            this.$userSession = abstractC3358CGz;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
        @Override // com.facebook.aura.conversation.api.PrimarySessionIdSource
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object loadPrimarySessionId(X.HtJ<? super java.lang.String> r7) {
            /*
                r6 = this;
                boolean r0 = r7 instanceof com.facebook.aura.conversation.repo.HatchPrimarySessionIdProvider$source$1$loadPrimarySessionId$1
                if (r0 == 0) goto L41
                r5 = r7
                com.facebook.aura.conversation.repo.HatchPrimarySessionIdProvider$source$1$loadPrimarySessionId$1 r5 = (com.facebook.aura.conversation.repo.HatchPrimarySessionIdProvider$source$1$loadPrimarySessionId$1) r5
                int r2 = r5.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L41
                int r2 = r2 - r1
                r5.label = r2
            L12:
                java.lang.Object r4 = r5.result
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r5.label
                r2 = 1
                if (r0 == 0) goto L2b
                if (r0 != r2) goto L47
                java.lang.Object r1 = r5.L$0
                com.facebook.aura.conversation.repo.HatchPrimarySessionRepository r1 = (com.facebook.aura.conversation.repo.HatchPrimarySessionRepository) r1
                X.Hwg.A00(r4)
            L24:
                X.1BN<java.lang.String> r0 = r1.primarySessionId
                java.lang.Object r3 = r0.getValue()
                return r3
            L2b:
                X.Hwg.A00(r4)
                com.facebook.aura.conversation.repo.HatchPrimarySessionRepository$Companion r1 = com.facebook.aura.conversation.repo.HatchPrimarySessionRepository.Companion
                X.CGz r0 = r6.$userSession
                com.facebook.aura.conversation.repo.HatchPrimarySessionRepository r1 = r1.getInstance(r0)
                r5.L$0 = r1
                r5.label = r2
                java.lang.Object r0 = r1.ensureLoaded(r5)
                if (r0 != r3) goto L24
                return r3
            L41:
                com.facebook.aura.conversation.repo.HatchPrimarySessionIdProvider$source$1$loadPrimarySessionId$1 r5 = new com.facebook.aura.conversation.repo.HatchPrimarySessionIdProvider$source$1$loadPrimarySessionId$1
                r5.<init>(r6, r7)
                goto L12
            L47:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchPrimarySessionIdProvider.AnonymousClass1.loadPrimarySessionId(X.HtJ):java.lang.Object");
        }
    }

    @Override // com.facebook.aura.conversation.api.PrimarySessionIdProvider
    public PrimarySessionIdSource source(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return new AnonymousClass1(abstractC3358CGz);
    }
}
