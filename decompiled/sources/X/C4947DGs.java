package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.aura.analytics.impl.FFMetaAnalyticsUploader;
import com.facebook.aura.analytics.impl.MetaAnalyticsBuilder$maybeEnableOneFabric$identitiesDescriptor$1;
import com.facebook.aura.analytics.impl.MetaAnalyticsBuilder$maybeEnableOneFabric$latencyResolver$1;
import com.facebook.aura.analytics.impl.MetaAnalyticsBuilder$maybeEnableOneFabric$startupStatusProvider$1;
import com.facebook.falco.fabric.FFSingletonJNILogger;
import com.facebook.falco.sampling.FFSamplingBridgeJava;
import com.facebook.tigon.iface.TigonServiceHolder;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.DGs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4947DGs implements DG4 {
    public static final Object A0L = C3cG.A0T();
    public static volatile boolean A0M;
    public DG8 A00;
    public CIA A01;
    public final Context A02;
    public final Looper A03;
    public final DHF A04;
    public final FFMetaAnalyticsUploader A05;
    public final MetaAnalyticsBuilder$maybeEnableOneFabric$latencyResolver$1 A06;
    public final MetaAnalyticsBuilder$maybeEnableOneFabric$startupStatusProvider$1 A07;
    public final C4943DGh A08;
    public final DH8 A09;
    public final C4942DGd A0A;
    public final DGT A0B;
    public final DKG A0C;
    public final Object A0D;
    public final String A0E;
    public final Map<String, Long> A0F;
    public final Set<String> A0G;
    public final F18<DHQ> A0H;
    public volatile C4949DGw A0I;
    public volatile DGc A0J;
    public volatile boolean A0K;

    @Override // X.InterfaceC4936DFr
    public final void AYY(C4932DFh c4932DFh) {
        DGc dGc;
        C7384Etj.A0Y(c4932DFh, 0);
        A00();
        long j = c4932DFh.A01;
        if (j != -2 && j != -4 && (dGc = this.A0J) != null) {
            dGc.onEventReceived();
        }
        DG8 dg8 = this.A00;
        if (dg8 == null) {
            C7384Etj.A0b("eventQueue");
            throw F60.createAndThrow();
        }
        HandlerC4948DGt handlerC4948DGt = (HandlerC4948DGt) dg8;
        BV4.A1D(handlerC4948DGt, c4932DFh, handlerC4948DGt.A01);
    }

    @Override // X.InterfaceC4936DFr
    public final void AYZ(C4932DFh c4932DFh) {
        DGc dGc;
        C7384Etj.A0Y(c4932DFh, 0);
        A00();
        long j = c4932DFh.A01;
        if (j != -2 && j != -4 && (dGc = this.A0J) != null) {
            dGc.onEventReceived();
        }
        DG8 dg8 = this.A00;
        if (dg8 == null) {
            C7384Etj.A0b("eventQueue");
            throw F60.createAndThrow();
        }
        HandlerC4948DGt handlerC4948DGt = (HandlerC4948DGt) dg8;
        handlerC4948DGt.sendMessage(handlerC4948DGt.obtainMessage(handlerC4948DGt.A01, c4932DFh));
    }

    @Override // X.InterfaceC4936DFr
    public final void Ag9(CIA cia) {
        C7384Etj.A0Y(cia, 0);
        AgA(cia);
    }

    @Override // X.DG4
    public final void AgA(CIA cia) {
        long jCreateIdentitiesWithFacebookUser;
        C7384Etj.A0Y(cia, 0);
        A00();
        C4949DGw c4949DGw = this.A0I;
        String str = c4949DGw.A0J;
        MetaAnalyticsBuilder$maybeEnableOneFabric$identitiesDescriptor$1 metaAnalyticsBuilder$maybeEnableOneFabric$identitiesDescriptor$1 = c4949DGw.A0G;
        String str2 = c4949DGw.A0K;
        long j = c4949DGw.A0D;
        C4949DGw c4949DGw2 = new C4949DGw(c4949DGw.A0E, c4949DGw.A0F, metaAnalyticsBuilder$maybeEnableOneFabric$identitiesDescriptor$1, str, str2, c4949DGw.A0H, c4949DGw.A0I, c4949DGw.A0B, c4949DGw.A0C, j);
        c4949DGw2.A04 = c4949DGw.A04;
        c4949DGw2.A02 = c4949DGw.A02;
        c4949DGw2.A03 = c4949DGw.A03;
        HashSet hashSetA0x = BV4.A0x(c4949DGw.A08);
        c4949DGw2.A08 = hashSetA0x;
        c4949DGw2.A0A = c4949DGw.A0A;
        c4949DGw2.A00 = c4949DGw.A00;
        c4949DGw2.A09 = c4949DGw.A09;
        c4949DGw2.A06 = c4949DGw.A06;
        c4949DGw2.A07 = c4949DGw.A07;
        c4949DGw2.A05 = c4949DGw.A05;
        c4949DGw2.A01 = c4949DGw.A01;
        this.A01 = cia;
        C4931DFd c4931DFd = cia.A01;
        if (c4931DFd != null) {
            hashSetA0x.clear();
            c4931DFd.addFieldsToIdentityDescriptor(c4949DGw2);
        }
        if (!c4949DGw2.A09) {
            cia.A00();
        }
        c4949DGw2.A01 = cia;
        FFSingletonJNILogger.setThreadPriority(-100, 0);
        c4949DGw2.A09 = cia.A00();
        DHF dhf = this.A04;
        boolean zA00 = cia.A00();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (dhf) {
            Long l = dhf.A00;
            if (zA00) {
                if (l == null) {
                    dhf.A00 = Long.valueOf(jElapsedRealtime);
                }
            } else if (l != null) {
                long jLongValue = l.longValue();
                dhf.A00 = null;
                BV4.A09(this.A03).post(new DH4(jElapsedRealtime - jLongValue));
            }
        }
        long j2 = c4949DGw2.A0F.getUserConsentState().A00;
        DHG dhg = c4949DGw2.A0E;
        long modeState = dhg != null ? dhg.getModeState() : 0L;
        FFSingletonJNILogger.setClockSyncAuditPrivacy(j2, modeState);
        boolean z = c4949DGw2.A0A;
        String str3 = c4949DGw2.A0J;
        if (z) {
            String str4 = c4949DGw2.A0G.get();
            String str5 = c4949DGw2.A0K;
            long j3 = c4949DGw2.A0D;
            String str6 = c4949DGw2.A0H;
            int i = c4949DGw2.A0B;
            String strA0X = FGI.A0X(str6, " (", ")", i);
            String str7 = c4949DGw2.A0I;
            String str8 = cia.A02;
            int i2 = c4949DGw2.A0C;
            String[] strArr = (String[]) c4949DGw2.A08.toArray(new String[0]);
            long jA01 = C60P.A01(c4949DGw2.A02);
            Long l2 = c4949DGw2.A03;
            jCreateIdentitiesWithFacebookUser = FFSingletonJNILogger.createIdentitiesWithFacebookUser(str3, str4, str5, j3, strA0X, i, str7, str8, i2, j2, modeState, strArr, jA01, l2 != null ? l2.longValue() : 0L);
        } else {
            String str9 = c4949DGw2.A0G.get();
            String str10 = c4949DGw2.A0K;
            long j4 = c4949DGw2.A0D;
            String str11 = c4949DGw2.A0H;
            int i3 = c4949DGw2.A0B;
            String strA0X2 = FGI.A0X(str11, " (", ")", i3);
            String str12 = c4949DGw2.A0I;
            String str13 = cia.A02;
            int i4 = c4949DGw2.A0C;
            String[] strArr2 = (String[]) c4949DGw2.A08.toArray(new String[0]);
            Long l3 = c4949DGw2.A04;
            long jLongValue2 = l3 != null ? l3.longValue() : 0L;
            String str14 = c4949DGw2.A05;
            if (str14 == null) {
                str14 = "";
            }
            jCreateIdentitiesWithFacebookUser = FFSingletonJNILogger.createIdentitiesWithAppScopedUser(str3, str9, str10, j4, strA0X2, i3, str12, str13, i4, j2, modeState, strArr2, jLongValue2, str14);
        }
        c4949DGw2.A00 = jCreateIdentitiesWithFacebookUser;
        FFSingletonJNILogger.setShouldRequestDebugConfig(true);
        synchronized (c4949DGw) {
            c4949DGw.A04 = c4949DGw2.A04;
            c4949DGw.A02 = c4949DGw2.A02;
            c4949DGw.A03 = c4949DGw2.A03;
            c4949DGw.A08 = BV4.A0x(c4949DGw2.A08);
            c4949DGw.A0A = c4949DGw2.A0A;
            c4949DGw.A00 = c4949DGw2.A00;
            c4949DGw.A09 = c4949DGw2.A09;
            c4949DGw.A06 = c4949DGw2.A06;
            c4949DGw.A07 = c4949DGw2.A07;
            c4949DGw.A05 = c4949DGw2.A05;
            c4949DGw.A01 = c4949DGw2.A01;
        }
        this.A0I = c4949DGw2;
        DG8 dg8 = this.A00;
        if (dg8 == null) {
            C7384Etj.A0b("eventQueue");
            throw F60.createAndThrow();
        }
        HandlerC4948DGt handlerC4948DGt = (HandlerC4948DGt) dg8;
        BV4.A1D(handlerC4948DGt, c4949DGw2, handlerC4948DGt.A03);
    }

    @Override // X.DG4
    public final C4934DFk shouldLog(String str) {
        C7384Etj.A0Y(str, 0);
        A00();
        return this.A0B.shouldLog(str, this.A0I);
    }

    public /* synthetic */ C4947DGs(Context context, Looper looper, C4949DGw c4949DGw, FFMetaAnalyticsUploader fFMetaAnalyticsUploader, MetaAnalyticsBuilder$maybeEnableOneFabric$latencyResolver$1 metaAnalyticsBuilder$maybeEnableOneFabric$latencyResolver$1, MetaAnalyticsBuilder$maybeEnableOneFabric$startupStatusProvider$1 metaAnalyticsBuilder$maybeEnableOneFabric$startupStatusProvider$1, C4943DGh c4943DGh, DH8 dh8, C4942DGd c4942DGd, DGT dgt, DKG dkg, String str, Set set, F18 f18) {
        Map<String, Long> map = Collections.EMPTY_MAP;
        C7384Etj.A0V(map);
        AnonymousClass002.A1B(context, 1, f18);
        this.A0I = c4949DGw;
        this.A02 = context;
        this.A0C = dkg;
        this.A0H = f18;
        this.A09 = dh8;
        this.A06 = metaAnalyticsBuilder$maybeEnableOneFabric$latencyResolver$1;
        this.A0A = c4942DGd;
        this.A08 = c4943DGh;
        this.A03 = looper;
        this.A07 = metaAnalyticsBuilder$maybeEnableOneFabric$startupStatusProvider$1;
        this.A0B = dgt;
        this.A05 = fFMetaAnalyticsUploader;
        this.A0G = set;
        this.A0E = str;
        this.A0F = map;
        this.A0D = C3cG.A0T();
        this.A04 = new DHF();
        A00();
    }

    public final void A00() {
        if (this.A0K) {
            return;
        }
        synchronized (this.A0D) {
            if (!this.A0K) {
                try {
                    Context context = this.A02;
                    ETi.A06(context, 0);
                    synchronized (A0L) {
                        try {
                            if (!A0M) {
                                DH8 dh8 = this.A09;
                                FFSingletonJNILogger.setAppId("4331325740476680");
                                FFSingletonJNILogger.setAppVersion("16.0.0.11.159");
                                FFSingletonJNILogger.setClientToken(dh8.A00);
                                FFSingletonJNILogger.setUserAgent(dh8.A01);
                                C4942DGd c4942DGd = this.A0A;
                                FFSingletonJNILogger.setSamplingEnabled(true);
                                FFSingletonJNILogger.setCCEnabled(true);
                                FFSingletonJNILogger.setFailOpenSampling(false);
                                AssetManager assets = context.getAssets();
                                if (assets != null) {
                                    try {
                                        InputStream inputStreamOpen = assets.open("falco_declared_events/events.txt");
                                        C7384Etj.A0U(inputStreamOpen);
                                        Reader inputStreamReader = new InputStreamReader(inputStreamOpen, DCl.A05);
                                        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                                        try {
                                            ArrayList arrayList = new ArrayList();
                                            bufferedReader = bufferedReader != null ? bufferedReader : new BufferedReader(bufferedReader, 8192);
                                            try {
                                                Iterator it = new C8154FWw(new C067379v(bufferedReader)).iterator();
                                                while (it.hasNext()) {
                                                    Object next = it.next();
                                                    C7384Etj.A0Y(next, 1);
                                                    arrayList.add(next);
                                                }
                                                bufferedReader.close();
                                                if (arrayList.size() < 2) {
                                                    throw new IllegalArgumentException("Malformed Falco declared-events asset: missing header");
                                                }
                                                if (!C7384Etj.areEqual(arrayList.get(0), "version=1")) {
                                                    throw new IllegalArgumentException("Malformed Falco declared-events asset: unsupported version");
                                                }
                                                String strA0K = C7BY.A0K("sha256=", (String) arrayList.get(1));
                                                if (C7384Etj.areEqual(strA0K, arrayList.get(1)) || !AbstractC7517Eyo.A00.A08(strA0K)) {
                                                    throw new IllegalArgumentException("Malformed Falco declared-events asset: invalid SHA-256");
                                                }
                                                List listA0Z = AbstractC0878AGe.A0Z(arrayList, 2);
                                                if (!(listA0Z instanceof Collection) || !listA0Z.isEmpty()) {
                                                    Iterator it2 = listA0Z.iterator();
                                                    while (it2.hasNext()) {
                                                        if (((String) it2.next()).length() <= 0) {
                                                            throw new IllegalArgumentException("Malformed Falco declared-events asset: empty event name");
                                                        }
                                                    }
                                                }
                                                if (!listA0Z.equals(AbstractC0878AGe.A0W(AbstractC0878AGe.A0X(AbstractC0878AGe.A0f(listA0Z))))) {
                                                    throw new IllegalArgumentException("Malformed Falco declared-events asset: events are not sorted and unique");
                                                }
                                                String[] strArr = (String[]) listA0Z.toArray(new String[0]);
                                                C7384Etj.A0Y(strA0K, 0);
                                                C7384Etj.A0Y(strArr, 1);
                                                if (bufferedReader != null) {
                                                    bufferedReader.close();
                                                }
                                                FFSingletonJNILogger.setDeclaredEvents(strArr, strA0K);
                                            } finally {
                                            }
                                        } catch (Throwable th) {
                                            try {
                                                throw th;
                                            } finally {
                                            }
                                        }
                                    } catch (FileNotFoundException unused) {
                                    } catch (IOException e) {
                                        CFK.A0J("FFDeclaredEventsLoader", e, "Rejecting unreadable Falco declared-events asset");
                                    } catch (IllegalArgumentException e2) {
                                        CFK.A0J("FFDeclaredEventsLoader", e2, "Rejecting malformed Falco declared-events asset");
                                    }
                                }
                                FFSingletonJNILogger.setBaseFilePath(c4942DGd.A00);
                                FFSingletonJNILogger.setOneFabricHCEnabled(true);
                                FFSingletonJNILogger.setUseHCPlatformFlush(false);
                                FFSingletonJNILogger.setMaxPayloadSize(204800);
                                FFSingletonJNILogger.setMaxNumberOfEvents(1000);
                                FFSingletonJNILogger.setEventExpiryIntervalInMs(604800000L);
                                FFSingletonJNILogger.setMaxNumberOfEventsBeforePurge(25000L);
                                FFSingletonJNILogger.setMinNumberOfEventsAfterPurge(20000L);
                                FFSingletonJNILogger.setStaggerUploadDelay(-1L);
                                FFSingletonJNILogger.setEagerSamplingFetch(true);
                                FFSingletonJNILogger.setForceSamplingConfigRequest(true);
                                FFSingletonJNILogger.setScheduleMode(0);
                                FFSingletonJNILogger.setEnableInternalDebugLogging(false);
                                FFSingletonJNILogger.setEnableResilientPersistence(false);
                                FFSingletonJNILogger.setEnableEventLevelPurgeHealthCounters(true);
                                String str = this.A0E;
                                if (str != null) {
                                    FFSingletonJNILogger.setUrlHostName(str);
                                }
                                FFSingletonJNILogger.setEnableEventBuffering(true);
                                FFSingletonJNILogger.disableBackoff();
                                if ("".length() > 0) {
                                    new Handler(this.A03).post(new DH3());
                                }
                                FFSingletonJNILogger.setClockOffsetAttachToEvents(false);
                                FFSingletonJNILogger.setDeviceTimezoneAttachToEvents(false);
                                C4949DGw c4949DGw = this.A0I;
                                C7384Etj.A0Y(c4949DGw, 0);
                                FFSingletonJNILogger.setClockSyncAuditAppFields(c4949DGw.A0I, c4949DGw.A0B, c4949DGw.A0K, Build.VERSION.SDK_INT);
                                long j = this.A0I.A0F.getUserConsentState().A00;
                                DHG dhg = this.A0I.A0E;
                                FFSingletonJNILogger.setClockSyncAuditPrivacy(j, dhg != null ? dhg.getModeState() : 0L);
                                FFSingletonJNILogger.setMaxNumberOfEventsPerChunk(50L);
                                FFSingletonJNILogger.setSQLIntegrityMode(0);
                                if (C9X.A04()) {
                                    FFSingletonJNILogger.setIsRunningE2ETest();
                                }
                                A0M = true;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    this.A00 = new HandlerC4948DGt(this.A03, this.A0I, this.A06, this.A07, this.A08, this.A0F, this.A0G);
                    DKG dkg = this.A0C;
                    F18<DHQ> f18 = this.A0H;
                    F18<TigonServiceHolder> f182 = this.A09.A02;
                    FFMetaAnalyticsUploader fFMetaAnalyticsUploader = this.A05;
                    C4016Cjx c4016Cjx = new C4016Cjx(this);
                    boolean z = FFSamplingBridgeJava.sIsInitialized;
                    synchronized (FFSamplingBridgeJava.class) {
                        try {
                            if (!FFSamplingBridgeJava.sIsInitialized) {
                                FFSamplingBridgeJava.sHyperThrift = dkg;
                                FFSamplingBridgeJava.sQPLConfigHandlerProvider = f18;
                                FFSamplingBridgeJava.sTigonServiceHolderProvider = f182;
                                FFSamplingBridgeJava.sUploader = fFMetaAnalyticsUploader;
                                FFSamplingBridgeJava.sUploadCallback = c4016Cjx;
                                FFSamplingBridgeJava.sContext = context != null ? context.getApplicationContext() : null;
                                FFSamplingBridgeJava.initNative();
                                FFSamplingBridgeJava.sIsInitialized = true;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    this.A0K = true;
                } catch (IOException unused2) {
                    throw new RuntimeException("SoLoader.init() failed");
                }
            }
        }
    }

    @Override // X.DG4
    public final boolean AOX() {
        return this.A0K;
    }

    @Override // X.InterfaceC4936DFr
    public final void ART(C4931DFd c4931DFd) {
        A00();
        DG8 dg8 = this.A00;
        if (dg8 == null) {
            C7384Etj.A0b("eventQueue");
            throw F60.createAndThrow();
        }
        HandlerC4948DGt handlerC4948DGt = (HandlerC4948DGt) dg8;
        synchronized (handlerC4948DGt.A0C) {
            BV4.A1D(handlerC4948DGt, AnonymousClass001.A0h(), handlerC4948DGt.A06);
        }
    }

    @Override // X.DG4
    public final void AcW(int i) {
        A00();
        FFSingletonJNILogger.triggerUploadNowForInternalUse();
    }

    @Override // X.InterfaceC4936DFr
    public final void AhQ() {
        A00();
        DG8 dg8 = this.A00;
        if (dg8 == null) {
            C7384Etj.A0b("eventQueue");
            throw F60.createAndThrow();
        }
        HandlerC4948DGt handlerC4948DGt = (HandlerC4948DGt) dg8;
        synchronized (handlerC4948DGt.A0C) {
            BV4.A1D(handlerC4948DGt, AnonymousClass001.A0h(), handlerC4948DGt.A06);
        }
    }
}
