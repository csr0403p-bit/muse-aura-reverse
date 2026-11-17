package com.facebook.aura.commands.location;

import X.AbstractC7559F3s;
import X.C2nw;
import X.C3cF;
import X.C7384Etj;
import X.C7pd;
import X.C7qW;
import X.G0U;
import android.location.Address;
import com.facebook.aura.gateway.service.GeofenceEventWorker;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class LocationDataSource$locationPublishPayload$1$1 extends AbstractC7559F3s implements G0U<C7pd, Unit> {
    public final /* synthetic */ Float $accuracyMeters;
    public final /* synthetic */ Address $address;
    public final /* synthetic */ Long $fixTimestampMs;
    public final /* synthetic */ String $geofenceName;
    public final /* synthetic */ double $latitude;
    public final /* synthetic */ double $longitude;
    public final /* synthetic */ long $syncedAt;
    public final /* synthetic */ String $triggerType;

    /* renamed from: com.facebook.aura.commands.location.LocationDataSource$locationPublishPayload$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C2nw, Unit> {
        public final /* synthetic */ Float $accuracyMeters;
        public final /* synthetic */ Address $address;
        public final /* synthetic */ Long $fixTimestampMs;
        public final /* synthetic */ String $geofenceName;
        public final /* synthetic */ double $latitude;
        public final /* synthetic */ double $longitude;
        public final /* synthetic */ long $syncedAt;
        public final /* synthetic */ String $triggerType;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C2nw c2nw) {
            String countryCode;
            String countryName;
            String postalCode;
            String adminArea;
            String subLocality;
            String locality;
            String thoroughfare;
            String featureName;
            String addressLine;
            C7384Etj.A0Y(c2nw, 0);
            C7qW.A05(Double.valueOf(this.$latitude), GeofenceEventWorker.KEY_LATITUDE, c2nw);
            C7qW.A05(Double.valueOf(this.$longitude), GeofenceEventWorker.KEY_LONGITUDE, c2nw);
            Long l = this.$fixTimestampMs;
            C7qW.A05(Long.valueOf(l != null ? l.longValue() : this.$syncedAt), "timestamp", c2nw);
            Float f = this.$accuracyMeters;
            if (f != null) {
                float fFloatValue = f.floatValue();
                if (fFloatValue > 0.0f) {
                    C7qW.A05(Double.valueOf(fFloatValue), "accuracy", c2nw);
                }
            }
            String str = this.$geofenceName;
            if (str != null) {
                C7qW.A06("geofence_name", str, c2nw);
            }
            String str2 = this.$triggerType;
            if (str2 != null) {
                C7qW.A06(GeofenceEventWorker.KEY_TRIGGER_TYPE, str2, c2nw);
            }
            Address address = this.$address;
            if (address != null && (addressLine = address.getAddressLine(0)) != null) {
                C7qW.A06("address", addressLine, c2nw);
            }
            Address address2 = this.$address;
            if (address2 != null && (featureName = address2.getFeatureName()) != null) {
                C7qW.A06("name", featureName, c2nw);
            }
            Address address3 = this.$address;
            if (address3 != null && (thoroughfare = address3.getThoroughfare()) != null) {
                C7qW.A06("thoroughfare", thoroughfare, c2nw);
            }
            Address address4 = this.$address;
            if (address4 != null && (locality = address4.getLocality()) != null) {
                C7qW.A06("locality", locality, c2nw);
            }
            Address address5 = this.$address;
            if (address5 != null && (subLocality = address5.getSubLocality()) != null) {
                C7qW.A06("sub_locality", subLocality, c2nw);
            }
            Address address6 = this.$address;
            if (address6 != null && (adminArea = address6.getAdminArea()) != null) {
                C7qW.A06("administrative_area", adminArea, c2nw);
            }
            Address address7 = this.$address;
            if (address7 != null && (postalCode = address7.getPostalCode()) != null) {
                C7qW.A06(C3cF.A00(6), postalCode, c2nw);
            }
            Address address8 = this.$address;
            if (address8 != null && (countryName = address8.getCountryName()) != null) {
                C7qW.A06("country", countryName, c2nw);
            }
            Address address9 = this.$address;
            if (address9 == null || (countryCode = address9.getCountryCode()) == null) {
                return;
            }
            C7qW.A06("iso_country_code", countryCode, c2nw);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(double d, double d2, Long l, long j, Float f, String str, String str2, Address address) {
            super(1);
            this.$latitude = d;
            this.$longitude = d2;
            this.$fixTimestampMs = l;
            this.$syncedAt = j;
            this.$accuracyMeters = f;
            this.$geofenceName = str;
            this.$triggerType = str2;
            this.$address = address;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C2nw c2nw) {
            invoke2(c2nw);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C7pd c7pd) {
        C7384Etj.A0Y(c7pd, 0);
        C7qW.A0B(new AnonymousClass1(this.$latitude, this.$longitude, this.$fixTimestampMs, this.$syncedAt, this.$accuracyMeters, this.$geofenceName, this.$triggerType, this.$address), c7pd);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationDataSource$locationPublishPayload$1$1(double d, double d2, Long l, long j, Float f, String str, String str2, Address address) {
        super(1);
        this.$latitude = d;
        this.$longitude = d2;
        this.$fixTimestampMs = l;
        this.$syncedAt = j;
        this.$accuracyMeters = f;
        this.$geofenceName = str;
        this.$triggerType = str2;
        this.$address = address;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C7pd c7pd) {
        invoke2(c7pd);
        return Unit.INSTANCE;
    }
}
