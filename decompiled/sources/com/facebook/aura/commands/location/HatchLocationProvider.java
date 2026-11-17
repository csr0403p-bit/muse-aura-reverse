package com.facebook.aura.commands.location;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.C3UX;
import X.C4448CwP;
import X.C4449CwQ;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.C78T;
import X.C7Bm;
import X.C8j3;
import X.C9u;
import X.CwR;
import X.EnumC10460Hji;
import X.EuR;
import X.G0V;
import X.GAX;
import X.GAo;
import X.GBL;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC4454CwW;
import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class HatchLocationProvider {
    public static final int CACHE_POLL_ATTEMPTS = 6;
    public static final long CACHE_POLL_INTERVAL_MS = 500;
    public static final long FRESH_LOCATION_TIMEOUT_MS = 30000;
    public static final long RECENT_LOCATION_MAX_AGE_MS = 3600000;
    public static final long REVERSE_GEOCODE_TIMEOUT_MS = 2000;
    public static final long WARM_MIN_INTERVAL_MS = 60000;
    public static volatile EuR lastFreshFix;
    public static volatile long lastWarmAttemptMs;
    public static volatile InterfaceC4454CwW locationCache;
    public static volatile C4449CwQ statusUtil;
    public static final HatchLocationProvider INSTANCE = new HatchLocationProvider();
    public static final AtomicBoolean warmInFlight = C60O.A1E();

    @DebugMetadata(c = "com.facebook.aura.commands.location.HatchLocationProvider", f = "HatchLocationProvider.kt", l = {187}, m = "getFreshLocation", v = 2)
    /* renamed from: com.facebook.aura.commands.location.HatchLocationProvider$getFreshLocation$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public long J$1;
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
            return HatchLocationProvider.this.getFreshLocation(null, 0L, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.location.HatchLocationProvider", f = "HatchLocationProvider.kt", l = {131, 137}, m = "getLocationWithFreshFallback", v = 2)
    /* renamed from: com.facebook.aura.commands.location.HatchLocationProvider$getLocationWithFreshFallback$1, reason: invalid class name and case insensitive filesystem */
    public final class C111261 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C111261(HtJ<? super C111261> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchLocationProvider.this.getLocationWithFreshFallback(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.location.HatchLocationProvider", f = "HatchLocationProvider.kt", l = {214}, m = "requestFreshLocation", v = 2)
    /* renamed from: com.facebook.aura.commands.location.HatchLocationProvider$requestFreshLocation$1, reason: invalid class name and case insensitive filesystem */
    public final class C111271 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C111271(HtJ<? super C111271> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchLocationProvider.this.requestFreshLocation(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.location.HatchLocationProvider$reverseGeocodeAddress$2", f = "HatchLocationProvider.kt", l = {292, 275}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.location.HatchLocationProvider$reverseGeocodeAddress$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Address>, Object> {
        public final /* synthetic */ Geocoder $geocoder;
        public final /* synthetic */ double $lat;
        public final /* synthetic */ double $lng;
        public double D$0;
        public double D$1;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Geocoder geocoder, double d, double d2, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$geocoder = geocoder;
            this.$lat = d;
            this.$lng = d2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$geocoder, this.$lat, this.$lng, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                if (Build.VERSION.SDK_INT >= 33) {
                    Geocoder geocoder = this.$geocoder;
                    double d = this.$lat;
                    double d2 = this.$lng;
                    this.L$0 = geocoder;
                    this.D$0 = d;
                    this.D$1 = d2;
                    this.label = 1;
                    final GBL gblA04 = C7Bm.A04(this);
                    geocoder.getFromLocation(d, d2, 1, new Geocoder.GeocodeListener() { // from class: com.facebook.aura.commands.location.HatchLocationProvider$reverseGeocodeAddress$2$addresses$1$1
                        @Override // android.location.Geocoder.GeocodeListener
                        public final void onGeocode(List<Address> list) {
                            C7384Etj.A0Y(list, 0);
                            gblA04.resumeWith(list);
                        }
                    });
                    obj = gblA04.A0F();
                } else {
                    C78T c78tA0y = AnonymousClass001.A0y();
                    HatchLocationProvider$reverseGeocodeAddress$2$addresses$2 hatchLocationProvider$reverseGeocodeAddress$2$addresses$2 = new HatchLocationProvider$reverseGeocodeAddress$2$addresses$2(this.$geocoder, this.$lat, this.$lng, null);
                    this.label = 2;
                    obj = GAo.A00(this, c78tA0y, hatchLocationProvider$reverseGeocodeAddress$2$addresses$2);
                }
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1 && i != 2) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            List list = (List) obj;
            if (list != null) {
                return AbstractC0878AGe.A0G(list);
            }
            return null;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Address> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.location.HatchLocationProvider", f = "HatchLocationProvider.kt", l = {164}, m = "warmLocation", v = 2)
    /* renamed from: com.facebook.aura.commands.location.HatchLocationProvider$warmLocation$1, reason: invalid class name and case insensitive filesystem */
    public final class C111281 extends HzP {
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C111281(HtJ<? super C111281> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchLocationProvider.this.warmLocation(null, this);
        }
    }

    public final String formatLocationPrompt(EuR euR) {
        C7384Etj.A0Y(euR, 0);
        Location location = euR.A00;
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        String str = latitude >= 0.0d ? "N" : "S";
        String str2 = longitude >= 0.0d ? "E" : "W";
        double dAbs = Math.abs(latitude);
        double dAbs2 = Math.abs(longitude);
        StringBuilder sbA0x = C60O.A0x("User's current location: ");
        sbA0x.append(dAbs);
        sbA0x.append("\u00b0");
        sbA0x.append(str);
        C8j3.A1K(sbA0x);
        sbA0x.append(dAbs2);
        return C60P.A1M("\u00b0", str2, sbA0x);
    }

    public final EuR getLocation(Context context) {
        C7384Etj.A0Y(context, 0);
        return (EuR) AbstractC0878AGe.A0G(locationCandidates(context));
    }

    public final String getLocationPrompt(Context context) {
        C7384Etj.A0Y(context, 0);
        EuR location = getLocation(context);
        if (location == null) {
            return null;
        }
        return formatLocationPrompt(location);
    }

    public final InterfaceC4454CwW getOrCreateCache$fbandroid_express_aura_java_com_facebook_aura_commands_location_datasource(Context context) {
        C7384Etj.A0Y(context, 0);
        InterfaceC4454CwW interfaceC4454CwW = locationCache;
        if (interfaceC4454CwW != null) {
            return interfaceC4454CwW;
        }
        synchronized (this) {
            InterfaceC4454CwW cwR = locationCache;
            if (cwR == null) {
                LocationManager locationManager = (LocationManager) context.getSystemService(LocationManager.class);
                if (locationManager == null) {
                    return null;
                }
                cwR = new CwR(locationManager, INSTANCE.getStatusUtil(context), new C4448CwP(C9u.A00, RealtimeSinceBootClock.A00));
                locationCache = cwR;
            }
            return cwR;
        }
    }

    public final EuR getRecentLocation(Context context, long j) {
        EuR next;
        C7384Etj.A0Y(context, 0);
        Iterator<EuR> it = locationCandidates(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (INSTANCE.locationAgeMs(next) <= j) {
                break;
            }
        }
        return next;
    }

    public final boolean hasLocationPermission(Context context) {
        C7384Etj.A0Y(context, 0);
        C4449CwQ statusUtil2 = getStatusUtil(context);
        return C4449CwQ.A00(statusUtil2, "android.permission.ACCESS_COARSE_LOCATION") || C4449CwQ.A00(statusUtil2, "android.permission.ACCESS_FINE_LOCATION");
    }

    private final C4449CwQ getStatusUtil(Context context) {
        C4449CwQ c4449CwQ;
        C4449CwQ c4449CwQ2 = statusUtil;
        if (c4449CwQ2 != null) {
            return c4449CwQ2;
        }
        synchronized (this) {
            c4449CwQ = statusUtil;
            if (c4449CwQ == null) {
                Context applicationContext = context.getApplicationContext();
                c4449CwQ = new C4449CwQ(applicationContext, (LocationManager) applicationContext.getSystemService(LocationManager.class));
                statusUtil = c4449CwQ;
            }
        }
        return c4449CwQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<X.EuR> locationCandidates(android.content.Context r17) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.location.HatchLocationProvider.locationCandidates(android.content.Context):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00b8: INVOKE (r5 I:X.CRl) VIRTUAL call: X.CRl.A00():void A[MD:():void (m)] (LINE:184), block:B:43:0x00b8 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object requestFreshLocation(android.content.Context r12, X.HtJ<? super X.EuR> r13) {
        /*
            r11 = this;
            java.lang.String r6 = "Fresh location request failed: "
            boolean r0 = r13 instanceof com.facebook.aura.commands.location.HatchLocationProvider.C111271
            if (r0 == 0) goto L2b
            r4 = r13
            com.facebook.aura.commands.location.HatchLocationProvider$requestFreshLocation$1 r4 = (com.facebook.aura.commands.location.HatchLocationProvider.C111271) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2b
            int r2 = r2 - r1
            r4.label = r2
        L14:
            java.lang.Object r9 = r4.result
            X.Hji r10 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r0 = 48
            java.lang.String r8 = X.C60N.A00(r0)
            r11 = 1
            r7 = 0
            if (r1 == 0) goto L36
            if (r1 != r11) goto L31
            java.lang.Object r5 = r4.L$3
            X.CRl r5 = (X.C3511CRl) r5
            goto L72
        L2b:
            com.facebook.aura.commands.location.HatchLocationProvider$requestFreshLocation$1 r4 = new com.facebook.aura.commands.location.HatchLocationProvider$requestFreshLocation$1
            r4.<init>(r13)
            goto L14
        L31:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L36:
            X.Hwg.A00(r9)
            X.CjU r1 = X.C4001CjU.A00
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r0 = r1.A01(r12, r0)
            if (r0 == 0) goto L4a
            java.lang.String r0 = "Google Play Services unavailable for fresh location request"
            X.CFK.A06(r8, r0)
            return r7
        L4a:
            X.CrC r3 = X.C4109Cmq.A01
            X.CeV r2 = X.InterfaceC3786CeU.A00
            X.Cs4 r1 = X.C4276Cs4.A02
            X.Cmq r0 = new X.Cmq
            r0.<init>(r12, r2, r3, r1)
            X.CRl r5 = new X.CRl
            r5.<init>()
            com.facebook.aura.commands.location.HatchLocationProvider$requestFreshLocation$location$1 r2 = new com.facebook.aura.commands.location.HatchLocationProvider$requestFreshLocation$location$1     // Catch: java.lang.Exception -> La8 java.lang.Throwable -> Lb7
            r2.<init>(r0, r5, r7)     // Catch: java.lang.Exception -> La8 java.lang.Throwable -> Lb7
            r4.L$0 = r7     // Catch: java.lang.Exception -> La8 java.lang.Throwable -> Lb7
            r4.L$1 = r7     // Catch: java.lang.Exception -> La8 java.lang.Throwable -> Lb7
            r4.L$2 = r7     // Catch: java.lang.Exception -> La8 java.lang.Throwable -> Lb7
            r4.L$3 = r5     // Catch: java.lang.Exception -> La8 java.lang.Throwable -> Lb7
            r4.label = r11     // Catch: java.lang.Exception -> La8 java.lang.Throwable -> Lb7
            r0 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r9 = X.GAX.A01(r4, r2, r0)     // Catch: java.lang.Exception -> La8 java.lang.Throwable -> Lb7
            if (r9 != r10) goto L75
            return r10
        L72:
            X.Hwg.A00(r9)     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lb7
        L75:
            android.location.Location r9 = (android.location.Location) r9     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lb7
            if (r9 == 0) goto Lb3
            long r3 = r9.getTime()     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lb7
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto Lb1
            double r1 = r9.getLatitude()     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lb7
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L95
            double r1 = r9.getLongitude()     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lb7
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto Lb1
        L95:
            boolean r0 = r9.hasAccuracy()     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lb7
            if (r0 == 0) goto Lb1
            android.location.Location r1 = new android.location.Location     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lb7
            r1.<init>(r9)     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lb7
            X.EuR r0 = new X.EuR     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lb7
            r0.<init>(r1)     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lb7
            goto Lb2
        La6:
            r0 = move-exception
            goto La9
        La8:
            r0 = move-exception
        La9:
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> Lb7
            X.C3cG.A1G(r6, r0, r8)     // Catch: java.lang.Throwable -> Lb7
            goto Lb3
        Lb1:
            r0 = 0
        Lb2:
            r7 = r0
        Lb3:
            r5.A00()
            return r7
        Lb7:
            r0 = move-exception
            r5.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.location.HatchLocationProvider.requestFreshLocation(android.content.Context, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getFreshLocation(android.content.Context r6, long r7, long r9, X.HtJ<? super X.EuR> r11) {
        /*
            r5 = this;
            boolean r0 = r11 instanceof com.facebook.aura.commands.location.HatchLocationProvider.AnonymousClass1
            if (r0 == 0) goto L4d
            r4 = r11
            com.facebook.aura.commands.location.HatchLocationProvider$getFreshLocation$1 r4 = (com.facebook.aura.commands.location.HatchLocationProvider.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4d
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L53
            long r9 = r4.J$1
            java.lang.Object r6 = r4.L$0
            android.content.Context r6 = (android.content.Context) r6
            X.Hwg.A00(r3)
        L26:
            if (r3 != 0) goto L2c
            X.EuR r3 = r5.getRecentLocation(r6, r9)
        L2c:
            return r3
        L2d:
            X.Hwg.A00(r3)
            boolean r0 = r5.hasLocationPermission(r6)
            if (r0 != 0) goto L38
            r3 = 0
            return r3
        L38:
            X.EuR r3 = r5.getRecentLocation(r6, r7)
            if (r3 != 0) goto L2c
            r4.L$0 = r6
            r4.J$0 = r7
            r4.J$1 = r9
            r4.label = r1
            java.lang.Object r3 = r5.requestFreshLocation(r6, r4)
            if (r3 != r2) goto L26
            return r2
        L4d:
            com.facebook.aura.commands.location.HatchLocationProvider$getFreshLocation$1 r4 = new com.facebook.aura.commands.location.HatchLocationProvider$getFreshLocation$1
            r4.<init>(r11)
            goto L12
        L53:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.location.HatchLocationProvider.getFreshLocation(android.content.Context, long, long, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x004f -> B:26:0x005b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getLocationWithFreshFallback(android.content.Context r8, X.HtJ<? super X.EuR> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.commands.location.HatchLocationProvider.C111261
            if (r0 == 0) goto L74
            r5 = r9
            com.facebook.aura.commands.location.HatchLocationProvider$getLocationWithFreshFallback$1 r5 = (com.facebook.aura.commands.location.HatchLocationProvider.C111261) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r0 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r4 = 2
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 == r3) goto L52
            if (r1 != r4) goto L7a
            java.lang.Object r8 = r5.L$0
            android.content.Context r8 = (android.content.Context) r8
            X.Hwg.A00(r0)
        L27:
            if (r0 != 0) goto L7f
            X.EuR r6 = r7.getLocation(r8)
            return r6
        L2e:
            X.Hwg.A00(r0)
            boolean r0 = r7.hasLocationPermission(r8)
            if (r0 != 0) goto L39
            r6 = 0
            return r6
        L39:
            X.EuR r0 = r7.getLocation(r8)
            if (r0 != 0) goto L7f
            r2 = 1
        L40:
            r5.L$0 = r8
            r0 = 0
            r5.L$1 = r0
            r5.I$0 = r2
            r5.label = r3
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r0 = X.C7Bq.A01(r0, r5)
            if (r0 != r6) goto L5b
            return r6
        L52:
            int r2 = r5.I$0
            java.lang.Object r8 = r5.L$0
            android.content.Context r8 = (android.content.Context) r8
            X.Hwg.A00(r0)
        L5b:
            X.EuR r0 = r7.getLocation(r8)
            if (r0 != 0) goto L7f
            int r2 = r2 + 1
            r0 = 7
            if (r2 < r0) goto L40
            r5.L$0 = r8
            r0 = 0
            r5.L$1 = r0
            r5.label = r4
            java.lang.Object r0 = r7.requestFreshLocation(r8, r5)
            if (r0 != r6) goto L27
            return r6
        L74:
            com.facebook.aura.commands.location.HatchLocationProvider$getLocationWithFreshFallback$1 r5 = new com.facebook.aura.commands.location.HatchLocationProvider$getLocationWithFreshFallback$1
            r5.<init>(r9)
            goto L12
        L7a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L7f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.location.HatchLocationProvider.getLocationWithFreshFallback(android.content.Context, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object warmLocation(android.content.Context r12, X.HtJ<? super kotlin.Unit> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.facebook.aura.commands.location.HatchLocationProvider.C111281
            if (r0 == 0) goto L1f
            r9 = r13
            com.facebook.aura.commands.location.HatchLocationProvider$warmLocation$1 r9 = (com.facebook.aura.commands.location.HatchLocationProvider.C111281) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r9.label = r2
        L12:
            java.lang.Object r1 = r9.result
            X.Hji r10 = X.EnumC10460Hji.A02
            int r0 = r9.label
            r7 = 0
            r8 = 1
            if (r0 == 0) goto L2a
            if (r0 != r8) goto L25
            goto L5c
        L1f:
            com.facebook.aura.commands.location.HatchLocationProvider$warmLocation$1 r9 = new com.facebook.aura.commands.location.HatchLocationProvider$warmLocation$1
            r9.<init>(r13)
            goto L12
        L25:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2a:
            X.Hwg.A00(r1)
            boolean r0 = r11.hasLocationPermission(r12)
            if (r0 == 0) goto L72
            com.facebook.common.time.RealtimeSinceBootClock r0 = com.facebook.common.time.RealtimeSinceBootClock.A00
            long r1 = r0.now()
            long r3 = com.facebook.aura.commands.location.HatchLocationProvider.lastWarmAttemptMs
            long r5 = r1 - r3
            r3 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L72
            java.util.concurrent.atomic.AtomicBoolean r0 = com.facebook.aura.commands.location.HatchLocationProvider.warmInFlight
            boolean r0 = r0.compareAndSet(r7, r8)
            if (r0 == 0) goto L72
            com.facebook.aura.commands.location.HatchLocationProvider.lastWarmAttemptMs = r1
            r0 = 0
            r9.L$0 = r0     // Catch: java.lang.Throwable -> L66
            r9.J$0 = r1     // Catch: java.lang.Throwable -> L66
            r9.label = r8     // Catch: java.lang.Throwable -> L66
            java.lang.Object r1 = r11.getLocationWithFreshFallback(r12, r9)     // Catch: java.lang.Throwable -> L66
            if (r1 != r10) goto L5f
            return r10
        L5c:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L66
        L5f:
            X.EuR r1 = (X.EuR) r1     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L6d
            com.facebook.aura.commands.location.HatchLocationProvider.lastFreshFix = r1     // Catch: java.lang.Throwable -> L66
            goto L6d
        L66:
            r1 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r0 = com.facebook.aura.commands.location.HatchLocationProvider.warmInFlight
            r0.set(r7)
            throw r1
        L6d:
            java.util.concurrent.atomic.AtomicBoolean r0 = com.facebook.aura.commands.location.HatchLocationProvider.warmInFlight
            r0.set(r7)
        L72:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.location.HatchLocationProvider.warmLocation(android.content.Context, X.HtJ):java.lang.Object");
    }

    private final long locationAgeMs(EuR euR) {
        Long lA01 = euR.A01();
        if (lA01 == null) {
            return LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        }
        return System.currentTimeMillis() - lA01.longValue();
    }

    public final Object reverseGeocodeAddress(Context context, double d, double d2, HtJ<? super Address> htJ) {
        if (Geocoder.isPresent()) {
            return GAX.A01(htJ, new AnonymousClass2(new Geocoder(context.getApplicationContext(), Locale.getDefault()), d, d2, null), 2000L);
        }
        return null;
    }
}
