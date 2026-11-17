package com.facebook.aura.pairs;

import X.AbstractC3358CGz;
import X.C7384Etj;
import com.facebook.aura.explore.api.IdeaConnectionNamesProvider;
import com.facebook.aura.explore.api.IdeaConnectionNamesResolver;

/* loaded from: classes3.dex */
public final class ConnectionsIdeaNamesProvider implements IdeaConnectionNamesProvider {
    public static final int $stable = 0;
    public static final ConnectionsIdeaNamesProvider INSTANCE = new ConnectionsIdeaNamesProvider();

    /* renamed from: com.facebook.aura.pairs.ConnectionsIdeaNamesProvider$resolver$1, reason: invalid class name */
    public final class AnonymousClass1 implements IdeaConnectionNamesResolver {
        public final /* synthetic */ AbstractC3358CGz $userSession;

        public AnonymousClass1(AbstractC3358CGz abstractC3358CGz) {
            this.$userSession = abstractC3358CGz;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
        @Override // com.facebook.aura.explore.api.IdeaConnectionNamesResolver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object names(java.util.List<java.lang.String> r6, X.HtJ<? super java.util.List<java.lang.String>> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.facebook.aura.pairs.ConnectionsIdeaNamesProvider$resolver$1$names$1
                if (r0 == 0) goto L1e
                r4 = r7
                com.facebook.aura.pairs.ConnectionsIdeaNamesProvider$resolver$1$names$1 r4 = (com.facebook.aura.pairs.ConnectionsIdeaNamesProvider$resolver$1$names$1) r4
                int r2 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L1e
                int r2 = r2 - r1
                r4.label = r2
            L12:
                java.lang.Object r1 = r4.result
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r4.label
                r2 = 1
                if (r0 == 0) goto L2d
                if (r0 != r2) goto L28
                goto L24
            L1e:
                com.facebook.aura.pairs.ConnectionsIdeaNamesProvider$resolver$1$names$1 r4 = new com.facebook.aura.pairs.ConnectionsIdeaNamesProvider$resolver$1$names$1
                r4.<init>(r5, r7)
                goto L12
            L24:
                X.Hwg.A00(r1)     // Catch: com.facebook.aura.pairs.PairsException -> L50 java.util.concurrent.CancellationException -> L5f
                return r1
            L28:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L2d:
                X.Hwg.A00(r1)
                com.facebook.aura.utils.HatchUtil r0 = com.facebook.aura.utils.HatchUtil.INSTANCE
                boolean r0 = r0.isConnectionsTabEnabled()
                if (r0 != 0) goto L3b
                X.AGi r3 = X.C0881AGi.A00
                return r3
            L3b:
                com.facebook.aura.pairs.PairsRepository$Companion r1 = com.facebook.aura.pairs.PairsRepository.Companion     // Catch: com.facebook.aura.pairs.PairsException -> L50 java.util.concurrent.CancellationException -> L5f
                X.CGz r0 = r5.$userSession     // Catch: com.facebook.aura.pairs.PairsException -> L50 java.util.concurrent.CancellationException -> L5f
                com.facebook.aura.pairs.PairsRepository r1 = r1.getInstance(r0)     // Catch: com.facebook.aura.pairs.PairsException -> L50 java.util.concurrent.CancellationException -> L5f
                r0 = 0
                r4.L$0 = r0     // Catch: com.facebook.aura.pairs.PairsException -> L50 java.util.concurrent.CancellationException -> L5f
                r4.label = r2     // Catch: com.facebook.aura.pairs.PairsException -> L50 java.util.concurrent.CancellationException -> L5f
                java.lang.Object r1 = r1.connectionNames(r6, r4)     // Catch: com.facebook.aura.pairs.PairsException -> L50 java.util.concurrent.CancellationException -> L5f
                if (r1 != r3) goto L4f
                return r3
            L4f:
                return r1
            L50:
                r0 = move-exception
                java.lang.Object[] r2 = X.C60Q.A1Z(r0)
                java.lang.String r1 = "ConnectionsIdeaNamesProvider"
                java.lang.String r0 = "connection names unavailable: %s"
                X.CFK.A0H(r1, r0, r2)
                X.AGi r0 = X.C0881AGi.A00
                return r0
            L5f:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsIdeaNamesProvider.AnonymousClass1.names(java.util.List, X.HtJ):java.lang.Object");
        }
    }

    @Override // com.facebook.aura.explore.api.IdeaConnectionNamesProvider
    public IdeaConnectionNamesResolver resolver(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return new AnonymousClass1(abstractC3358CGz);
    }
}
