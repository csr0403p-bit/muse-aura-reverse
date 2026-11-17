package com.facebook.aura.common.video;

import X.AGH;
import X.AbstractC0878AGe;
import X.AbstractC2985Bqu;
import X.AbstractC5636DmK;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BV4;
import X.BXX;
import X.BY2;
import X.C06H;
import X.C10571Hud;
import X.C1S;
import X.C1T;
import X.C1U;
import X.C2988Br0;
import X.C3159C0h;
import X.C3cG;
import X.C4904DDx;
import X.C5246DeB;
import X.C5616Dlx;
import X.C60O;
import X.C7384Etj;
import X.C79;
import X.C7Je;
import X.C9jH;
import X.CFK;
import X.CMu;
import X.CXB;
import X.CXK;
import X.CXO;
import X.CXU;
import X.CXV;
import X.CXW;
import X.CXY;
import X.DDU;
import X.DDi;
import X.DV9;
import X.DVK;
import X.DXV;
import X.DXW;
import X.EnumC2374BWi;
import X.F60;
import X.FGI;
import X.HsJ;
import X.InterfaceC4891DDk;
import X.InterfaceC6095Dva;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import android.text.TextUtils;
import com.facebook.aura.common.video.HatchVideoPrefetcher.HatchAuthHttpDataSourceFactory;
import com.facebook.aura.network.transport.HatchRequestPurpose;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class HatchVideoPrefetcher {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final String PLAY_ORIGIN = "hatch";
    public static final int PREFETCH_TRACKING_LIMIT = 128;
    public static final String TAG = "HatchVideoPrefetcher";
    public volatile boolean prewarmDone;
    public volatile int currentGrootPoolSize = 4;
    public final LinkedHashSet<String> prefetchedVideoIds = C3cG.A0k();
    public final LinkedHashSet<String> prefetchedUriFingerprints = C3cG.A0k();
    public final Object lock = C3cG.A0T();

    public final class HatchAuthHttpDataSourceFactory extends DDU {
        public final String factoryName = "HatchAuthHttpDataSourceFactory";

        @Override // X.DDU
        public CXK createInstance(String str, CXB cxb, CXO cxo, int i, int i2, C3159C0h c3159C0h) {
            AnonymousClass002.A1D(str, 0, c3159C0h);
            HatchTransportHttpDataSourceFactory hatchTransportHttpDataSourceFactory = new HatchTransportHttpDataSourceFactory(str, getRequestPurpose(c3159C0h), Long.valueOf(i2));
            InterfaceC4891DDk interfaceC4891DDkCreateDataSourceInternal = hatchTransportHttpDataSourceFactory.createDataSourceInternal(hatchTransportHttpDataSourceFactory.defaultRequestProperties);
            if (cxb != null) {
                interfaceC4891DDkCreateDataSourceInternal.addTransferListener(cxb);
            }
            return new DDi(interfaceC4891DDkCreateDataSourceInternal);
        }

        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[C1U.values().length];
                try {
                    iArr[2] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[5] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[1] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public HatchAuthHttpDataSourceFactory() {
        }

        private final HatchRequestPurpose getRequestPurpose(C3159C0h c3159C0h) {
            int iOrdinal = c3159C0h.A00.ordinal();
            return (iOrdinal == 2 || iOrdinal == 5 || iOrdinal == 1) ? HatchRequestPurpose.PREFETCH : HatchRequestPurpose.FETCH;
        }

        @Override // X.DDU
        public String getFactoryName() {
            return this.factoryName;
        }

        @Override // X.DDU
        public Map<String, String> getBugReportFiles(String str) {
            return null;
        }
    }

    public final void ensureConfigured(Context context) {
        boolean z;
        boolean z2;
        C7384Etj.A0Y(context, 0);
        CXU cxu = CXV.A04;
        synchronized (cxu) {
            z = CXV.A03;
        }
        if (z) {
            return;
        }
        synchronized (this.lock) {
            synchronized (cxu) {
                z2 = CXV.A03;
            }
            if (!z2) {
                Context applicationContext = context.getApplicationContext();
                HeroPlayerSetting heroPlayerSetting = HatchVideoPlayerGrootHelper.INSTANCE.getHeroPlayerSetting();
                AbstractC5636DmK abstractC5636DmK = new AbstractC5636DmK() { // from class: com.facebook.aura.common.video.HatchVideoPrefetcher$ensureConfigured$1$playerDependencyModule$1
                    {
                        super(null);
                    }

                    @Override // X.AbstractC5636DmK, X.InterfaceC5637DmL
                    public void configureMediaCodecForSDK35() {
                        if (Build.VERSION.SDK_INT >= 35) {
                            AbstractC2985Bqu.A00 = HatchVideoPrefetcher$ensureConfigured$1$playerDependencyModule$1$configureMediaCodecForSDK35$1.INSTANCE;
                        }
                    }

                    @Override // X.AbstractC5636DmK, X.InterfaceC5637DmL
                    public DDU defaultDataSourceFactory(HeroPlayerSetting heroPlayerSetting2, AtomicReference atomicReference, AtomicReference atomicReference2) {
                        return this.this$0.new HatchAuthHttpDataSourceFactory();
                    }

                    @Override // X.AbstractC5636DmK, X.InterfaceC5637DmL
                    public DVK prefetchManagerFactory() {
                        DV9 dv9 = new DV9();
                        dv9.A00 = InterfaceC6095Dva.A00;
                        return dv9;
                    }
                };
                C7384Etj.A0X(applicationContext);
                cxu.A01(applicationContext, new CXW(abstractC5636DmK, heroPlayerSetting, new CXY(), BV4.A0u(), false));
                this.currentGrootPoolSize = 4;
                CFK.A05(TAG, "Configured shared Groot session manager");
            }
        }
    }

    public final String getCacheSafeVideoId$fbandroid_express_aura_java_com_facebook_aura_common_video_video(String str, Uri uri) {
        C7384Etj.A0Y(uri, 1);
        return getCacheSafeVideoId(str, uri.toString());
    }

    public final void prewarmVideoPlayers(Context context) {
        C7384Etj.A0Y(context, 0);
        if (this.prewarmDone) {
            return;
        }
        synchronized (this.lock) {
            if (!this.prewarmDone) {
                ensureConfigured(context);
                this.prewarmDone = true;
                CFK.A05(TAG, "Prewarmed shared Aura video stack");
            }
        }
    }

    public final void resetGrootPoolSize() {
        updateGrootPoolSize(4);
    }

    public final void updateGrootPoolSizeForConversation() {
        updateGrootPoolSize(4);
    }

    /* loaded from: classes3.dex */
    public final class Companion {
        public final HatchVideoPrefetcher getInstance() {
            return (HatchVideoPrefetcher) C5246DeB.A00(65541);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final String getCacheSafeVideoId(String str, String str2) {
        if (str == null) {
            str = str2 == null ? "" : str2;
        }
        return FGI.A0M("hatch_video_", getUriFingerprint(str));
    }

    private final Object getHeroManagerViaReflection() {
        CXV cxv;
        Object objA0s;
        synchronized (CXV.A04) {
            cxv = null;
            if (CXV.A03 && (cxv = CXV.A02) == null) {
                C7384Etj.A0b("grootSessionManager");
                throw F60.createAndThrow();
            }
        }
        if (cxv != null) {
            try {
                objA0s = cxv.getClass().getMethod("getInternalPlayerManagerPrivate", null).invoke(cxv, null);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (HsJ.A00(objA0s) != null) {
                CFK.A06(TAG, "Unable to access HeroManager from Groot session manager");
            }
            if (!(objA0s instanceof C10571Hud)) {
                return objA0s;
            }
        }
        return null;
    }

    private final String getVideoKeyHash(String str, String str2) {
        if (str == null) {
            str = str2 == null ? "unknown" : str2;
        }
        String hexString = Integer.toHexString(str.hashCode());
        C7384Etj.A0U(hexString);
        return hexString;
    }

    private final C4904DDx getVideoSource(String str, String str2, String str3) {
        Uri uriA01;
        if ((str3 == null || str3.length() == 0) && str2 != null) {
            uriA01 = null;
            try {
                uriA01 = C7Je.A01(str2);
            } catch (SecurityException | UnsupportedOperationException unused) {
            }
        } else {
            uriA01 = null;
        }
        C9jH c9jHA0E = AGH.A0E();
        TextUtils.isEmpty(str3);
        if (TextUtils.isEmpty(str3)) {
            return new C4904DDx(uriA01, BY2.GENERAL, BXX.PROGRESSIVE, str, null, "hatch", null, EnumC2374BWi.AUDIO_VIDEO.toString(), c9jHA0E);
        }
        return new C4904DDx(uriA01, BY2.GENERAL, BXX.DASH_VOD, str, str3, "hatch", null, EnumC2374BWi.AUDIO_VIDEO.toString(), c9jHA0E);
    }

    public static /* synthetic */ void prefetchVideoByUri$default(HatchVideoPrefetcher hatchVideoPrefetcher, Context context, String str, String str2, String str3, int i, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        if ((i2 & 16) != 0) {
            i = 1048576;
        }
        hatchVideoPrefetcher.prefetchVideoByUri(context, str, str2, str3, i, C3cG.A1K(i2 & 32, z));
    }

    private final void rememberPrefetchedUri(String str) {
        synchronized (this.lock) {
            this.prefetchedUriFingerprints.add(getUriFingerprint(str));
            while (this.prefetchedUriFingerprints.size() > 128) {
                LinkedHashSet<String> linkedHashSet = this.prefetchedUriFingerprints;
                linkedHashSet.remove(AbstractC0878AGe.A0B(linkedHashSet));
            }
        }
    }

    private final void rememberPrefetchedVideoId(String str) {
        synchronized (this.lock) {
            this.prefetchedVideoIds.add(str);
            while (this.prefetchedVideoIds.size() > 128) {
                LinkedHashSet<String> linkedHashSet = this.prefetchedVideoIds;
                linkedHashSet.remove(AbstractC0878AGe.A0B(linkedHashSet));
            }
        }
    }

    private final void updateGrootPoolSize(int i) {
        CXV cxv;
        if (this.currentGrootPoolSize != i) {
            synchronized (CXV.A04) {
                cxv = null;
                if (CXV.A03 && (cxv = CXV.A02) == null) {
                    C7384Etj.A0b("grootSessionManager");
                    throw F60.createAndThrow();
                }
            }
            if (cxv != null) {
                C5616Dlx c5616DlxA00 = CXV.A00(cxv);
                Trace.beginSection("HeroManager.updatePlayerPoolSize");
                try {
                    DXW dxw = c5616DlxA00.A0Z;
                    if (dxw != null) {
                        synchronized (dxw) {
                            Trace.beginSection("HeroServicePlayerPool.updatePlayerPoolSize");
                            try {
                                int iMax = Math.max(i, dxw.A05.playerPoolSize);
                                DXV dxv = dxw.A03;
                                if (dxv instanceof C2988Br0) {
                                    C2988Br0 c2988Br0 = (C2988Br0) dxv;
                                    synchronized (c2988Br0) {
                                        try {
                                            if (c2988Br0.A00 <= 0) {
                                                c2988Br0.A01.A04(FGI.A0H("Pool resize with maxSize: ", iMax), -1L);
                                            }
                                            c2988Br0.A00 = iMax;
                                        } finally {
                                        }
                                    }
                                    c2988Br0.A05(iMax);
                                } else {
                                    CMu cMu = (CMu) dxv;
                                    if (iMax <= 0) {
                                        CFK.A07("HeroPlayerPoolLruCache", "maxSize must be positive");
                                    } else {
                                        cMu.A06 = true;
                                        try {
                                            cMu.A02.resize(iMax);
                                            cMu.A06 = false;
                                        } catch (Throwable th) {
                                            cMu.A06 = false;
                                            throw th;
                                        }
                                    }
                                }
                                dxw.A04("resize", iMax);
                                Trace.endSection();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
            this.currentGrootPoolSize = i;
        }
    }

    private final String getUriFingerprint(String str) {
        String hexString = Integer.toHexString(str.hashCode());
        C7384Etj.A0U(hexString);
        return hexString;
    }

    private final void invokeHeroManagerPrefetch(C1S c1s) {
        Object objA0s;
        Object heroManagerViaReflection = getHeroManagerViaReflection();
        if (heroManagerViaReflection != null) {
            try {
                objA0s = heroManagerViaReflection.getClass().getMethod("prefetch", C1S.class).invoke(heroManagerViaReflection, c1s);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (HsJ.A00(objA0s) != null) {
                CFK.A06(TAG, "Unable to invoke HeroManager prefetch");
            }
        }
    }

    private final boolean isVideoStartCachedApproximate(String str) {
        Object objA0s;
        Boolean bool;
        Object heroManagerViaReflection = getHeroManagerViaReflection();
        if (heroManagerViaReflection == null) {
            return false;
        }
        try {
            Object objInvoke = heroManagerViaReflection.getClass().getMethod("isVideoStartCachedApproximateCheck", String.class).invoke(heroManagerViaReflection, str);
            objA0s = Boolean.valueOf((!(objInvoke instanceof Boolean) || (bool = (Boolean) objInvoke) == null) ? false : bool.booleanValue());
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (HsJ.A00(objA0s) != null) {
            CFK.A06(TAG, "Unable to query HeroManager cache state");
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = false;
        }
        return AnonymousClass001.A1X(objA0s);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.common.video.PlaybackLoadDebugInfo getPlaybackLoadDebugInfo$fbandroid_express_aura_java_com_facebook_aura_common_video_video(java.lang.String r6, android.net.Uri r7) {
        /*
            r5 = this;
            X.AnonymousClass003.A0u(r6, r7)
            java.lang.Object r2 = r5.lock
            monitor-enter(r2)
            java.util.LinkedHashSet<java.lang.String> r0 = r5.prefetchedVideoIds     // Catch: java.lang.Throwable -> L45
            boolean r0 = r0.contains(r6)     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L1f
            java.util.LinkedHashSet<java.lang.String> r1 = r5.prefetchedUriFingerprints     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = X.C60O.A0o(r7)     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = r5.getUriFingerprint(r0)     // Catch: java.lang.Throwable -> L45
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L45
            r4 = 0
            if (r0 == 0) goto L20
        L1f:
            r4 = 1
        L20:
            monitor-exit(r2)
            boolean r3 = r5.isVideoStartCachedApproximate(r6)
            if (r4 == 0) goto L3d
            com.facebook.aura.common.video.PlaybackLoadSource r2 = com.facebook.aura.common.video.PlaybackLoadSource.FROM_PREFETCH
        L29:
            r7.toString()
            int r0 = r6.hashCode()
            java.lang.String r1 = java.lang.Integer.toHexString(r0)
            X.C7384Etj.A0U(r1)
            com.facebook.aura.common.video.PlaybackLoadDebugInfo r0 = new com.facebook.aura.common.video.PlaybackLoadDebugInfo
            r0.<init>(r2, r4, r3, r1)
            return r0
        L3d:
            if (r3 == 0) goto L42
            com.facebook.aura.common.video.PlaybackLoadSource r2 = com.facebook.aura.common.video.PlaybackLoadSource.FROM_EXISTING_CACHE
            goto L29
        L42:
            com.facebook.aura.common.video.PlaybackLoadSource r2 = com.facebook.aura.common.video.PlaybackLoadSource.NEW_LOAD
            goto L29
        L45:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.common.video.HatchVideoPrefetcher.getPlaybackLoadDebugInfo$fbandroid_express_aura_java_com_facebook_aura_common_video_video(java.lang.String, android.net.Uri):com.facebook.aura.common.video.PlaybackLoadDebugInfo");
    }

    public final void prefetchVideoByUri(Context context, String str, String str2, String str3, int i, boolean z) {
        AnonymousClass003.A0u(context, str);
        if (str2 == null || str2.length() == 0) {
            return;
        }
        ensureConfigured(context);
        String cacheSafeVideoId = getCacheSafeVideoId(str, str2);
        rememberPrefetchedVideoId(cacheSafeVideoId);
        rememberPrefetchedUri(str2);
        getVideoKeyHash(cacheSafeVideoId, str2);
        invokeHeroManagerPrefetch(new C1S(new C1T(), getVideoSource(cacheSafeVideoId, str2, str3), z ? C79.A0Z : C79.A00, i, z));
    }

    private final String getUriFingerprint(Uri uri) {
        return getUriFingerprint(C60O.A0o(uri));
    }
}
