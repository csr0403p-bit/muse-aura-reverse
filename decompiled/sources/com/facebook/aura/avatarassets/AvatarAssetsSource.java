package com.facebook.aura.avatarassets;

import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.C06H;
import X.C3cH;
import X.C7384Etj;
import X.HtJ;
import X.HzP;
import X.InterfaceC7549F2g;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.model.AvatarMedia;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class AvatarAssetsSource implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final AtomicReference<Cached> cached;
    public final SingleFlight flight;
    public final AbstractC3358CGz userSession;

    public final class Cached {
        public final String gateway;
        public final AvatarMedia model;

        public final String getGateway() {
            return this.gateway;
        }

        public final AvatarMedia getModel() {
            return this.model;
        }

        public Cached(String str, AvatarMedia avatarMedia) {
            AnonymousClass003.A0u(str, avatarMedia);
            this.gateway = str;
            this.model = avatarMedia;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.avatarassets.AvatarAssetsSource", f = "AvatarAssetsSource.kt", l = {35}, m = "fetch", v = 2)
    /* renamed from: com.facebook.aura.avatarassets.AvatarAssetsSource$fetch$1, reason: invalid class name */
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
            return AvatarAssetsSource.this.fetch(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.avatarassets.AvatarAssetsSource", f = "AvatarAssetsSource.kt", l = {30}, m = "resolve", v = 2)
    /* renamed from: com.facebook.aura.avatarassets.AvatarAssetsSource$resolve$1, reason: invalid class name and case insensitive filesystem */
    public final class C109871 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C109871(HtJ<? super C109871> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AvatarAssetsSource.this.resolve(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetch(java.lang.String r7, X.HtJ<? super com.facebook.aura.model.AvatarMedia> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.avatarassets.AvatarAssetsSource.AnonymousClass1
            if (r0 == 0) goto L4f
            r5 = r8
            com.facebook.aura.avatarassets.AvatarAssetsSource$fetch$1 r5 = (com.facebook.aura.avatarassets.AvatarAssetsSource.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4f
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L3d
            if (r0 != r2) goto L60
            java.lang.Object r0 = r5.L$0
            java.lang.String r7 = X.C3cG.A0d(r0, r4)
        L23:
            com.facebook.aura.avatarassets.AvatarAssetsJson r4 = (com.facebook.aura.avatarassets.AvatarAssetsJson) r4
            r1 = 0
            if (r4 == 0) goto L3c
            com.facebook.aura.model.AvatarMedia r2 = com.facebook.aura.avatarassets.AvatarMediaMapperKt.avatarMedia(r4)
            com.facebook.aura.model.AppearancePaths r0 = r2.still
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L55
            java.util.Map<com.facebook.aura.model.AvatarVideoVariant, com.facebook.aura.model.AppearancePaths> r0 = r2.videos
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L55
        L3c:
            return r1
        L3d:
            X.Hwg.A00(r4)
            com.facebook.aura.avatarassets.HatchAvatarAssets r1 = com.facebook.aura.avatarassets.HatchAvatarAssets.INSTANCE
            X.CGz r0 = r6.userSession
            r5.L$0 = r7
            r5.label = r2
            java.lang.Object r4 = r1.fetch(r0, r7, r5)
            if (r4 != r3) goto L23
            return r3
        L4f:
            com.facebook.aura.avatarassets.AvatarAssetsSource$fetch$1 r5 = new com.facebook.aura.avatarassets.AvatarAssetsSource$fetch$1
            r5.<init>(r8)
            goto L12
        L55:
            java.util.concurrent.atomic.AtomicReference<com.facebook.aura.avatarassets.AvatarAssetsSource$Cached> r1 = r6.cached
            com.facebook.aura.avatarassets.AvatarAssetsSource$Cached r0 = new com.facebook.aura.avatarassets.AvatarAssetsSource$Cached
            r0.<init>(r7, r2)
            r1.set(r0)
            return r2
        L60:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.avatarassets.AvatarAssetsSource.fetch(java.lang.String, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.flight.clearAndCancelAll();
        this.cached.set(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolve(java.lang.String r9, X.HtJ<? super com.facebook.aura.model.AvatarMedia> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.avatarassets.AvatarAssetsSource.C109871
            if (r0 == 0) goto L78
            r6 = r10
            com.facebook.aura.avatarassets.AvatarAssetsSource$resolve$1 r6 = (com.facebook.aura.avatarassets.AvatarAssetsSource.C109871) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L78
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L2e
            if (r0 != r5) goto L7e
            X.Hwg.A00(r1)
        L21:
            com.facebook.aura.common.coroutines.SingleFlightResult r1 = (com.facebook.aura.common.coroutines.SingleFlightResult) r1
            boolean r0 = r1 instanceof com.facebook.aura.common.coroutines.SingleFlightResult.Result
            if (r0 == 0) goto L2d
            com.facebook.aura.common.coroutines.SingleFlightResult$Result r1 = (com.facebook.aura.common.coroutines.SingleFlightResult.Result) r1
            if (r1 == 0) goto L2d
            T r4 = r1.value
        L2d:
            return r4
        L2e:
            X.Hwg.A00(r1)
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore$Companion r1 = com.facebook.aura.gateway.store.HatchGatewayPrefsStore.Companion
            X.CGz r0 = r8.userSession
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore r0 = r1.getInstance(r0)
            java.lang.String r3 = r0.getGatewayUrl()
            java.util.concurrent.atomic.AtomicReference<com.facebook.aura.avatarassets.AvatarAssetsSource$Cached> r0 = r8.cached
            java.lang.Object r1 = r0.get()
            com.facebook.aura.avatarassets.AvatarAssetsSource$Cached r1 = (com.facebook.aura.avatarassets.AvatarAssetsSource.Cached) r1
            if (r1 == 0) goto L5c
            java.lang.String r0 = r1.gateway
            boolean r0 = X.C7384Etj.areEqual(r0, r3)
            if (r0 == 0) goto L5c
            if (r9 == 0) goto L5c
            com.facebook.aura.model.AvatarMedia r1 = r1.model
            java.lang.String r0 = r1.revision
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L5c
            return r1
        L5c:
            com.facebook.aura.common.coroutines.SingleFlight r2 = r8.flight
            if (r9 != 0) goto L62
            java.lang.String r9 = ""
        L62:
            X.HxE r1 = X.C3cG.A0r(r3, r9)
            com.facebook.aura.avatarassets.AvatarAssetsSource$resolve$result$1 r0 = new com.facebook.aura.avatarassets.AvatarAssetsSource$resolve$result$1
            r0.<init>(r8, r3, r4)
            r6.L$0 = r4
            r6.L$1 = r4
            r6.label = r5
            java.lang.Object r1 = r2.invoke(r1, r0, r6)
            if (r1 != r7) goto L21
            return r7
        L78:
            com.facebook.aura.avatarassets.AvatarAssetsSource$resolve$1 r6 = new com.facebook.aura.avatarassets.AvatarAssetsSource$resolve$1
            r6.<init>(r10)
            goto L12
        L7e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.avatarassets.AvatarAssetsSource.resolve(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final AvatarAssetsSource getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (AvatarAssetsSource) abstractC3358CGz.A03(AvatarAssetsSource.class, new AvatarAssetsSource$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AvatarAssetsSource(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.flight = C3cH.A0M();
        this.cached = new AtomicReference<>();
    }

    public /* synthetic */ AvatarAssetsSource(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
