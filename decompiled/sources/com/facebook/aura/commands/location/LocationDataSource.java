package com.facebook.aura.commands.location;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C2nw;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C7qW;
import X.G0V;
import X.GAo;
import X.HsK;
import X.HtJ;
import X.HzP;
import android.location.Address;
import android.location.Location;
import com.facebook.aura.nodes.datasource.DataSource;
import com.facebook.aura.nodes.datasource.DataSourceContext;
import com.facebook.aura.nodes.datasource.DataSourceResult;
import com.facebook.aura.nodes.datasource.ProactiveDelivery;
import com.facebook.aura.nodes.datasource.ProactiveTrigger;
import com.facebook.aura.nodes.registry.HatchDataSourceRegistration;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class LocationDataSource implements DataSource, HatchDataSourceRegistration {
    public static final String description = "Current device location (lat, long, accuracy, address), read when the app is open, plus location pushes emitted when a user-registered geofence is crossed.";
    public static final boolean emitsProactively = true;
    public static volatile LastSent lastSent = null;
    public static final String sourceId = "location";
    public static final boolean supportsBackfill = false;
    public static final LocationDataSource INSTANCE = new LocationDataSource();
    public static final List<String> permissionRequired = Collections.singletonList("android.permission.ACCESS_COARSE_LOCATION");
    public static final ProactiveTrigger proactiveTrigger = new ProactiveTrigger.CallerDriven("geofence broadcast receivers call publishNow() with the crossing coordinates. Sites: GeofenceEventWorker, NodeCommandService geofence path.");
    public static final Object dedupLock = C3cG.A0T();

    public final class LastSent extends C06G {
        public final double lat;
        public final double lng;
        public final long timestampMs;

        public static /* synthetic */ LastSent copy$default(LastSent lastSent, double d, double d2, long j, int i, Object obj) {
            double d3 = d;
            double d4 = d2;
            long j2 = j;
            if ((i & 1) != 0) {
                d3 = lastSent.lat;
            }
            if ((i & 2) != 0) {
                d4 = lastSent.lng;
            }
            if ((i & 4) != 0) {
                j2 = lastSent.timestampMs;
            }
            return new LastSent(d3, d4, j2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof LastSent) {
                    LastSent lastSent = (LastSent) obj;
                    if (Double.compare(this.lat, lastSent.lat) != 0 || Double.compare(this.lng, lastSent.lng) != 0 || this.timestampMs != lastSent.timestampMs) {
                    }
                }
                return false;
            }
            return true;
        }

        public final double component1() {
            return this.lat;
        }

        public final double component2() {
            return this.lng;
        }

        public final long component3() {
            return this.timestampMs;
        }

        public final LastSent copy(double d, double d2, long j) {
            return new LastSent(d, d2, j);
        }

        public final double getLat() {
            return this.lat;
        }

        public final double getLng() {
            return this.lng;
        }

        public final long getTimestampMs() {
            return this.timestampMs;
        }

        public int hashCode() {
            return AnonymousClass006.A05(this.timestampMs, ((HsK.A00(this.lat) * 31) + HsK.A00(this.lng)) * 31);
        }

        public LastSent(double d, double d2, long j) {
            this.lat = d;
            this.lng = d2;
            this.timestampMs = j;
        }

        public String toString() {
            return super.toString();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.location.LocationDataSource$proactiveSync$2", f = "LocationDataSource.kt", l = {103, 113, 130}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.location.LocationDataSource$proactiveSync$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super DataSourceResult>, Object> {
        public final /* synthetic */ DataSourceContext $ctx;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DataSourceContext dataSourceContext, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$ctx = dataSourceContext;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$ctx, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super DataSourceResult> htJ) {
            return new AnonymousClass2(this.$ctx, htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00c2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00cd  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r3 = r20
                X.Hji r2 = X.EnumC10460Hji.A02
                r0 = r19
                int r6 = r0.label
                r5 = 3
                r4 = 2
                r1 = 1
                if (r6 == 0) goto L1f
                if (r6 == r1) goto L3b
                if (r6 == r4) goto L67
                if (r6 != r5) goto Lc8
                X.Hwg.A00(r3)
            L16:
                boolean r0 = X.AnonymousClass001.A1X(r3)
                if (r0 == 0) goto Lcd
                com.facebook.aura.nodes.datasource.DataSourceResult$Ok r2 = com.facebook.aura.nodes.datasource.DataSourceResult.Ok.INSTANCE
                return r2
            L1f:
                X.Hwg.A00(r3)
                android.app.Application r7 = X.C4JM.A00()
                com.facebook.aura.commands.location.HatchLocationProvider r6 = com.facebook.aura.commands.location.HatchLocationProvider.INSTANCE
                r0.L$0 = r7
                r0.label = r1
                r8 = 0
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r12 = r0
                java.lang.Object r3 = r6.getFreshLocation(r7, r8, r10, r12)
                if (r3 != r2) goto L41
                return r2
            L3b:
                java.lang.Object r1 = r0.L$0
                android.content.Context r7 = X.C60P.A02(r1, r3)
            L41:
                r1 = r3
                X.EuR r1 = (X.EuR) r1
                if (r1 != 0) goto L4c
                java.lang.String r1 = "location_unavailable"
                java.lang.String r0 = "Could not determine current location."
                goto Ld1
            L4c:
                com.facebook.aura.commands.location.HatchLocationProvider r6 = com.facebook.aura.commands.location.HatchLocationProvider.INSTANCE
                android.location.Location r3 = r1.A00
                double r8 = r3.getLatitude()
                double r10 = r3.getLongitude()
                r3 = 0
                r0.L$0 = r3
                r0.L$1 = r1
                r0.label = r4
                r12 = r0
                java.lang.Object r3 = r6.reverseGeocodeAddress(r7, r8, r10, r12)
                if (r3 != r2) goto L6e
                return r2
            L67:
                java.lang.Object r1 = r0.L$1
                X.EuR r1 = (X.EuR) r1
                X.Hwg.A00(r3)
            L6e:
                android.location.Address r3 = (android.location.Address) r3
                java.lang.Long r4 = r1.A01()
                if (r4 == 0) goto Lc3
                long r8 = r4.longValue()
            L7a:
                com.facebook.aura.commands.location.LocationDataSource r7 = com.facebook.aura.commands.location.LocationDataSource.INSTANCE
                android.location.Location r4 = r1.A00
                double r10 = r4.getLatitude()
                double r12 = r4.getLongitude()
                java.lang.Long r14 = r1.A01()
                java.lang.Float r15 = r1.A00()
                r19 = 96
                r1 = 0
                r17 = r1
                r18 = r3
                r20 = r1
                r16 = r1
                kotlinx.serialization.json.JsonObject r6 = com.facebook.aura.commands.location.LocationDataSource.locationPublishPayload$default(r7, r8, r10, r12, r14, r15, r16, r17, r18, r19, r20)
                double r11 = r4.getLatitude()
                double r13 = r4.getLongitude()
                r10 = r7
                r15 = r8
                com.facebook.aura.commands.location.LocationDataSource.access$recordClaim(r10, r11, r13, r15)
                com.facebook.aura.nodes.datasource.DataSourceContext r4 = r0.$ctx
                java.lang.String r3 = r7.getSourceId()
                r0.L$0 = r1
                r0.L$1 = r1
                r0.L$2 = r1
                r0.L$3 = r1
                r0.J$0 = r8
                r0.label = r5
                java.lang.Object r3 = r4.publish(r3, r6, r0)
                if (r3 != r2) goto L16
                return r2
            Lc3:
                long r8 = java.lang.System.currentTimeMillis()
                goto L7a
            Lc8:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            Lcd:
                java.lang.String r1 = "publish_failed"
                java.lang.String r0 = "Failed to publish location payload"
            Ld1:
                com.facebook.aura.nodes.datasource.DataSourceResult$Error r2 = new com.facebook.aura.nodes.datasource.DataSourceResult$Error
                r2.<init>(r1, r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.location.LocationDataSource.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.location.LocationDataSource", f = "LocationDataSource.kt", l = {164, 194, 203}, m = "publishNow", v = 2)
    /* renamed from: com.facebook.aura.commands.location.LocationDataSource$publishNow$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public double D$0;
        public double D$1;
        public double D$2;
        public double D$3;
        public long J$0;
        public long J$1;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocationDataSource.this.publishNow(null, 0.0d, 0.0d, null, null, null, null, false, this);
        }
    }

    private final Long claim(double d, double d2, boolean z) {
        Long lValueOf;
        synchronized (dedupLock) {
            if (!z) {
                LastSent lastSent2 = lastSent;
                if (lastSent2 != null && System.currentTimeMillis() - lastSent2.timestampMs < 300000) {
                    float[] fArr = new float[1];
                    Location.distanceBetween(lastSent2.lat, lastSent2.lng, d, d2, fArr);
                    if (fArr[0] < 50.0f) {
                        lValueOf = null;
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            lastSent = new LastSent(d, d2, jCurrentTimeMillis);
            lValueOf = Long.valueOf(jCurrentTimeMillis);
        }
        return lValueOf;
    }

    public static /* synthetic */ JsonObject locationPublishPayload$default(LocationDataSource locationDataSource, long j, double d, double d2, Long l, Float f, String str, String str2, Address address, int i, Object obj) {
        if ((i & 32) != 0) {
            str = null;
        }
        if ((i & 64) != 0) {
            str2 = null;
        }
        if ((i & 128) != 0) {
            address = null;
        }
        return locationDataSource.locationPublishPayload(j, d, d2, l, f, str, str2, address);
    }

    public static /* synthetic */ Object publishNow$default(LocationDataSource locationDataSource, AbstractC3358CGz abstractC3358CGz, double d, double d2, String str, String str2, Long l, Float f, boolean z, HtJ htJ, int i, Object obj) {
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            l = null;
        }
        if ((i & 64) != 0) {
            f = null;
        }
        if ((i & 128) != 0) {
            z = false;
        }
        return locationDataSource.publishNow(abstractC3358CGz, d, d2, str, str2, l, f, z, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordClaim(double d, double d2, long j) {
        synchronized (dedupLock) {
            lastSent = new LastSent(d, d2, j);
        }
    }

    @Override // com.facebook.aura.nodes.registry.HatchDataSourceRegistration
    public DataSource getDataSource() {
        return this;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public String getDescription() {
        return description;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public boolean getEmitsProactively() {
        return emitsProactively;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public List<String> getPermissionRequired() {
        return permissionRequired;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public /* bridge */ ProactiveDelivery getProactiveDelivery() {
        return ProactiveDelivery.DURABLE;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public ProactiveTrigger getProactiveTrigger() {
        return proactiveTrigger;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public String getSourceId() {
        return sourceId;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public boolean getSupportsBackfill() {
        return supportsBackfill;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public /* bridge */ boolean isEnabled() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cb, code lost:
    
        if (r14 == r9) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ce A[PHI: r0 r2 r4 r7 r8 r11 r12 r15
  0x00ce: PHI (r0v2 double) = (r0v0 double), (r0v3 double) binds: [B:20:0x0093, B:32:0x0180] A[DONT_GENERATE, DONT_INLINE]
  0x00ce: PHI (r2v2 double) = (r2v0 double), (r2v3 double) binds: [B:20:0x0093, B:32:0x0180] A[DONT_GENERATE, DONT_INLINE]
  0x00ce: PHI (r4v1 java.lang.Long) = (r4v0 java.lang.Long), (r4v2 java.lang.Long) binds: [B:20:0x0093, B:32:0x0180] A[DONT_GENERATE, DONT_INLINE]
  0x00ce: PHI (r7v1 java.lang.Float) = (r7v0 java.lang.Float), (r7v2 java.lang.Float) binds: [B:20:0x0093, B:32:0x0180] A[DONT_GENERATE, DONT_INLINE]
  0x00ce: PHI (r8v1 java.lang.String) = (r8v0 java.lang.String), (r8v2 java.lang.String) binds: [B:20:0x0093, B:32:0x0180] A[DONT_GENERATE, DONT_INLINE]
  0x00ce: PHI (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v2 java.lang.String) binds: [B:20:0x0093, B:32:0x0180] A[DONT_GENERATE, DONT_INLINE]
  0x00ce: PHI (r12v1 X.CGz) = (r12v0 X.CGz), (r12v2 X.CGz) binds: [B:20:0x0093, B:32:0x0180] A[DONT_GENERATE, DONT_INLINE]
  0x00ce: PHI (r15v1 boolean) = (r15v0 boolean), (r15v2 boolean) binds: [B:20:0x0093, B:32:0x0180] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01be A[Catch: Exception -> 0x01ca, TRY_LEAVE, TryCatch #0 {Exception -> 0x01ca, blocks: (B:37:0x01b5, B:38:0x01b8, B:40:0x01be, B:34:0x0184), top: B:45:0x0035 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object publishNow(X.AbstractC3358CGz r25, double r26, double r28, java.lang.String r30, java.lang.String r31, java.lang.Long r32, java.lang.Float r33, boolean r34, X.HtJ<? super java.lang.Boolean> r35) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.location.LocationDataSource.publishNow(X.CGz, double, double, java.lang.String, java.lang.String, java.lang.Long, java.lang.Float, boolean, X.HtJ):java.lang.Object");
    }

    private final JsonObject locationPublishPayload(long j, double d, double d2, Long l, Float f, String str, String str2, Address address) {
        C2nw c2nwA02 = C7qW.A02();
        C7qW.A05(Long.valueOf(j), "syncedAt", c2nwA02);
        C7qW.A05(C60O.A0k(), "upload_timestamp_ms", c2nwA02);
        C7qW.A07("locations", new LocationDataSource$locationPublishPayload$1$1(d, d2, l, j, f, str, str2, address), c2nwA02);
        return c2nwA02.A00();
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public /* bridge */ Object backfill(String str, String str2, DataSourceContext dataSourceContext, HtJ<? super DataSourceResult> htJ) {
        return DataSource.CC.backfill$suspendImpl(this, str, str2, dataSourceContext, htJ);
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public Object proactiveSync(DataSourceContext dataSourceContext, HtJ<? super DataSourceResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(dataSourceContext, null));
    }
}
