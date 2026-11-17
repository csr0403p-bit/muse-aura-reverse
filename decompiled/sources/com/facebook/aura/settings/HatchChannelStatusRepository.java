package com.facebook.aura.settings;

import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.BLG;
import X.C06H;
import X.C20Q;
import X.C3cG;
import X.C7384Etj;
import X.C9286GCn;
import X.G0U;
import X.GDB;
import X.HtJ;
import X.HzP;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public final class HatchChannelStatusRepository {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final C20Q<List<ChannelJson>> channels;
    public final BLG<ChannelStatusSnapshot> snapshot;
    public final AtomicLong tickets;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.settings.HatchChannelStatusRepository", f = "HatchChannelStatusRepository.kt", l = {138}, m = "link", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchChannelStatusRepository$link$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchChannelStatusRepository.this.link(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchChannelStatusRepository", f = "HatchChannelStatusRepository.kt", l = {114}, m = "refresh", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchChannelStatusRepository$refresh$1, reason: invalid class name and case insensitive filesystem */
    public final class C134761 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C134761(HtJ<? super C134761> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchChannelStatusRepository.this.refresh(this);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchChannelStatusRepository$refresh$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<List<? extends ChannelJson>, List<? extends ChannelJson>> {
        public final /* synthetic */ List<ChannelJson> $channels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(List<ChannelJson> list) {
            super(1);
            this.$channels = list;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ List<? extends ChannelJson> invoke(List<? extends ChannelJson> list) {
            return this.$channels;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<ChannelJson> invoke2(List<ChannelJson> list) {
            return this.$channels;
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchChannelStatusRepository$replaceRow$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C134771 extends AbstractC7559F3s implements G0U<List<? extends ChannelJson>, List<? extends ChannelJson>> {
        public final /* synthetic */ ChannelJson $row;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134771(ChannelJson channelJson) {
            super(1);
            this.$row = channelJson;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<ChannelJson> invoke2(List<ChannelJson> list) {
            if (list == null) {
                return null;
            }
            ChannelJson channelJson = this.$row;
            ArrayList arrayList = new ArrayList();
            for (ChannelJson channelJson2 : list) {
                AnonymousClass006.A1O(channelJson2.provider, channelJson.provider, channelJson2, arrayList);
            }
            return AbstractC0878AGe.A0Q(channelJson, arrayList);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ List<? extends ChannelJson> invoke(List<? extends ChannelJson> list) {
            return invoke2((List<ChannelJson>) list);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchChannelStatusRepository", f = "HatchChannelStatusRepository.kt", l = {138}, m = "unlink", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchChannelStatusRepository$unlink$1, reason: invalid class name and case insensitive filesystem */
    public final class C134781 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;
        public /* synthetic */ Object result;

        public C134781(HtJ<? super C134781> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchChannelStatusRepository.this.unlink(null, this);
        }
    }

    private final ChannelStatusSnapshot applyIfNewer(long j, G0U<? super List<ChannelJson>, ? extends List<ChannelJson>> g0u) {
        ChannelStatusSnapshot value;
        ChannelStatusSnapshot channelStatusSnapshot;
        BLG<ChannelStatusSnapshot> blg = this.snapshot;
        do {
            value = blg.getValue();
            channelStatusSnapshot = value;
            if (j > channelStatusSnapshot.ticket) {
                channelStatusSnapshot = new ChannelStatusSnapshot(g0u.invoke(channelStatusSnapshot.channels), j);
            }
        } while (!blg.A6e(value, channelStatusSnapshot));
        return channelStatusSnapshot;
    }

    private final void replaceRow(ChannelJson channelJson) {
        applyIfNewer(this.tickets.incrementAndGet(), new C134771(channelJson));
    }

    public final C20Q<List<ChannelJson>> getChannels() {
        return this.channels;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object link(java.lang.String r26, X.HtJ<? super com.facebook.aura.settings.ChannelLinkResult> r27) {
        /*
            r25 = this;
            r2 = r26
            r6 = r27
            boolean r0 = r6 instanceof com.facebook.aura.settings.HatchChannelStatusRepository.AnonymousClass1
            r4 = r25
            if (r0 == 0) goto Laa
            r3 = r6
            com.facebook.aura.settings.HatchChannelStatusRepository$link$1 r3 = (com.facebook.aura.settings.HatchChannelStatusRepository.AnonymousClass1) r3
            int r5 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r1
            if (r0 == 0) goto Laa
            int r5 = r5 - r1
            r3.label = r5
        L18:
            java.lang.Object r6 = r3.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r5 = r3.label
            r13 = 0
            r0 = 1
            if (r5 == 0) goto L4f
            if (r5 != r0) goto Lb3
            java.lang.Object r2 = r3.L$0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = X.AnonymousClass001.A0q(r6)
        L2c:
            boolean r1 = r3 instanceof X.C10571Hud
            if (r1 == 0) goto L31
            r3 = 0
        L31:
            com.facebook.aura.settings.ChannelLinkOuterJson r3 = (com.facebook.aura.settings.ChannelLinkOuterJson) r3
            if (r3 == 0) goto Lb1
            com.facebook.aura.settings.ChannelLinkResult r1 = com.facebook.aura.settings.HatchChannelsJsonKt.toDomain(r3)
            if (r1 == 0) goto L4e
            boolean r3 = r1.isPaired
            if (r3 != r0) goto L4e
            com.facebook.aura.settings.ChannelJson r5 = new com.facebook.aura.settings.ChannelJson
            r6 = r2
            r7 = r0
            r8 = r13
            r9 = r13
            r10 = r13
            r11 = r13
            r12 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r4.replaceRow(r5)
        L4e:
            return r1
        L4f:
            X.Hwg.A00(r6)
            com.facebook.aura.network.http.HatchHttpApi r5 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.network.api.JarvisPath$ChannelsLink r9 = com.facebook.aura.network.api.JarvisPath.ChannelsLink.INSTANCE
            com.facebook.aura.settings.ChannelProviderRequestJson r10 = new com.facebook.aura.settings.ChannelProviderRequestJson
            r10.<init>(r2, r13)
            com.facebook.aura.network.http.RequestType r11 = com.facebook.aura.network.http.RequestType.POST
            X.CGz r12 = r4.userSession
            r8 = 0
            X.HxE[] r15 = new X.HxE[r8]
            java.util.Set r16 = X.AnonymousClass004.A18()
            X.9jH r19 = X.C9jH.A00
            com.facebook.aura.settings.HatchChannelStatusRepository$link$$inlined$executeJarvisRequest-Z6QaZII$default$1 r6 = com.facebook.aura.settings.HatchChannelStatusRepository$link$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
            com.facebook.aura.settings.HatchChannelStatusRepository$link$$inlined$executeJarvisRequest-Z6QaZII$default$2 r7 = com.facebook.aura.settings.HatchChannelStatusRepository$link$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r3.L$0 = r2
            r3.L$1 = r13
            r3.L$2 = r13
            r3.L$3 = r13
            r3.L$4 = r13
            r3.L$5 = r13
            r3.L$6 = r13
            r3.L$7 = r13
            r3.L$8 = r13
            r3.I$0 = r0
            r3.I$1 = r0
            r3.I$2 = r8
            r3.I$3 = r0
            r3.I$4 = r8
            r3.I$5 = r8
            r3.I$6 = r8
            r3.label = r0
            r14 = r13
            r18 = r0
            r20 = r13
            r21 = r8
            r22 = r0
            r23 = r8
            r24 = r8
            r25 = r13
            r26 = r8
            r27 = r3
            r17 = r0
            java.lang.Object r3 = r5.m1599executeJarvisRequestWithFof5HsY(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            if (r3 != r1) goto L2c
            return r1
        Laa:
            com.facebook.aura.settings.HatchChannelStatusRepository$link$1 r3 = new com.facebook.aura.settings.HatchChannelStatusRepository$link$1
            r3.<init>(r6)
            goto L18
        Lb1:
            r1 = 0
            return r1
        Lb3:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchChannelStatusRepository.link(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refresh(X.HtJ<? super java.util.List<com.facebook.aura.settings.ChannelJson>> r20) {
        /*
            r19 = this;
            r5 = r20
            boolean r0 = r5 instanceof com.facebook.aura.settings.HatchChannelStatusRepository.C134761
            r4 = r19
            if (r0 == 0) goto L88
            r3 = r5
            com.facebook.aura.settings.HatchChannelStatusRepository$refresh$1 r3 = (com.facebook.aura.settings.HatchChannelStatusRepository.C134761) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L88
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r5 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r15 = 1
            if (r0 == 0) goto L43
            if (r0 != r15) goto L8f
            long r0 = r3.J$0
            java.lang.Object r5 = X.AnonymousClass001.A0q(r5)
        L27:
            boolean r3 = r5 instanceof X.C10571Hud
            r2 = 0
            if (r3 == 0) goto L2d
            r5 = r2
        L2d:
            com.facebook.aura.settings.ChannelsPayloadJson r5 = (com.facebook.aura.settings.ChannelsPayloadJson) r5
            if (r5 == 0) goto L8e
            java.util.List r3 = r5.detailedChannels()
            if (r3 == 0) goto L8e
            com.facebook.aura.settings.HatchChannelStatusRepository$refresh$2 r2 = new com.facebook.aura.settings.HatchChannelStatusRepository$refresh$2
            r2.<init>(r3)
            com.facebook.aura.settings.ChannelStatusSnapshot r0 = r4.applyIfNewer(r0, r2)
            java.util.List<com.facebook.aura.settings.ChannelJson> r2 = r0.channels
            return r2
        L43:
            X.Hwg.A00(r5)
            java.util.concurrent.atomic.AtomicLong r0 = r4.tickets
            long r0 = r0.incrementAndGet()
            com.facebook.aura.network.http.HatchHttpApi r5 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.network.api.JarvisPath$ChannelsStatus r8 = com.facebook.aura.network.api.JarvisPath.ChannelsStatus.INSTANCE
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.GET
            X.CGz r10 = r4.userSession
            r7 = 0
            X.HxE[] r12 = new X.HxE[r7]
            java.util.Set r14 = X.AnonymousClass004.A18()
            X.9jH r16 = X.C9jH.A00
            com.facebook.aura.settings.HatchChannelStatusRepository$refresh$$inlined$executeJarvisRequest-1iavgos$default$1 r6 = com.facebook.aura.settings.HatchChannelStatusRepository$refresh$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r11 = 0
            r3.L$0 = r11
            r3.L$1 = r11
            r3.L$2 = r11
            r3.L$3 = r11
            r3.L$4 = r11
            r3.L$5 = r11
            r3.L$6 = r11
            r3.J$0 = r0
            r3.I$0 = r15
            r3.I$1 = r15
            r3.I$2 = r7
            r3.label = r15
            r13 = r11
            r17 = r15
            r18 = r11
            r19 = r7
            r20 = r3
            java.lang.Object r5 = r5.m1595executeBodylessJarvisRequestWithp3iPjrY(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r5 != r2) goto L27
            return r2
        L88:
            com.facebook.aura.settings.HatchChannelStatusRepository$refresh$1 r3 = new com.facebook.aura.settings.HatchChannelStatusRepository$refresh$1
            r3.<init>(r5)
            goto L16
        L8e:
            return r2
        L8f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchChannelStatusRepository.refresh(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object unlink(java.lang.String r26, X.HtJ<? super java.lang.Boolean> r27) {
        /*
            r25 = this;
            r1 = r26
            r6 = r27
            boolean r0 = r6 instanceof com.facebook.aura.settings.HatchChannelStatusRepository.C134781
            r4 = r25
            if (r0 == 0) goto La2
            r3 = r6
            com.facebook.aura.settings.HatchChannelStatusRepository$unlink$1 r3 = (com.facebook.aura.settings.HatchChannelStatusRepository.C134781) r3
            int r5 = r3.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r2
            if (r0 == 0) goto La2
            int r5 = r5 - r2
            r3.label = r5
        L18:
            java.lang.Object r5 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r8 = 1
            if (r0 == 0) goto L46
            if (r0 != r8) goto La9
            java.lang.Object r1 = r3.L$0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = X.AnonymousClass001.A0q(r5)
        L2b:
            boolean r0 = r0 instanceof X.C10571Hud
            r2 = r0 ^ 1
            if (r2 == 0) goto L41
            r8 = 0
            r7 = 0
            com.facebook.aura.settings.ChannelJson r0 = new com.facebook.aura.settings.ChannelJson
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r5 = r0
            r6 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r4.replaceRow(r0)
        L41:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L46:
            X.Hwg.A00(r5)
            com.facebook.aura.network.http.HatchHttpApi r5 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.network.api.JarvisPath$ChannelsUnlink r9 = com.facebook.aura.network.api.JarvisPath.ChannelsUnlink.INSTANCE
            r13 = 0
            com.facebook.aura.settings.ChannelProviderRequestJson r10 = new com.facebook.aura.settings.ChannelProviderRequestJson
            r10.<init>(r1, r13)
            com.facebook.aura.network.http.RequestType r11 = com.facebook.aura.network.http.RequestType.POST
            X.CGz r12 = r4.userSession
            r0 = 0
            X.HxE[] r15 = new X.HxE[r0]
            java.util.Set r16 = X.AnonymousClass004.A18()
            X.9jH r19 = X.C9jH.A00
            com.facebook.aura.settings.HatchChannelStatusRepository$unlink$$inlined$executeJarvisRequest-Z6QaZII$default$1 r6 = com.facebook.aura.settings.HatchChannelStatusRepository$unlink$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
            com.facebook.aura.settings.HatchChannelStatusRepository$unlink$$inlined$executeJarvisRequest-Z6QaZII$default$2 r7 = com.facebook.aura.settings.HatchChannelStatusRepository$unlink$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r3.L$0 = r1
            r3.L$1 = r13
            r3.L$2 = r13
            r3.L$3 = r13
            r3.L$4 = r13
            r3.L$5 = r13
            r3.L$6 = r13
            r3.L$7 = r13
            r3.L$8 = r13
            r3.I$0 = r8
            r3.I$1 = r8
            r3.I$2 = r0
            r3.I$3 = r8
            r3.I$4 = r0
            r3.I$5 = r0
            r3.I$6 = r0
            r3.label = r8
            r14 = r13
            r17 = r8
            r18 = r8
            r20 = r13
            r21 = r0
            r22 = r8
            r23 = r0
            r24 = r0
            r25 = r13
            r26 = r0
            r27 = r3
            java.lang.Object r0 = r5.m1599executeJarvisRequestWithFof5HsY(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            if (r0 != r2) goto L2b
            return r2
        La2:
            com.facebook.aura.settings.HatchChannelStatusRepository$unlink$1 r3 = new com.facebook.aura.settings.HatchChannelStatusRepository$unlink$1
            r3.<init>(r6)
            goto L18
        La9:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchChannelStatusRepository.unlink(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* loaded from: classes.dex */
    public final class Companion {
        public final HatchChannelStatusRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchChannelStatusRepository) abstractC3358CGz.A03(HatchChannelStatusRepository.class, new HatchChannelStatusRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchChannelStatusRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.tickets = new AtomicLong();
        C9286GCn c9286GCnA14 = C3cG.A14(new ChannelStatusSnapshot(null, 0L));
        this.snapshot = c9286GCnA14;
        this.channels = GDB.A01(new HatchChannelStatusRepository$special$$inlined$mapNotNull$1(c9286GCnA14));
    }

    public /* synthetic */ HatchChannelStatusRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
