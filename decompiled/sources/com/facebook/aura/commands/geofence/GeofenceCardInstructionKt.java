package com.facebook.aura.commands.geofence;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C2nw;
import X.C7384Etj;
import X.C7qW;
import X.G0U;
import com.facebook.aura.gateway.service.GeofenceEventWorker;
import com.facebook.aura.nodes.cards.HatchNodeCardJsonKt;
import com.facebook.aura.nodes.core.NodeCardEnvelopeKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class GeofenceCardInstructionKt {

    /* renamed from: com.facebook.aura.commands.geofence.GeofenceCardInstructionKt$geofenceCardEnvelope$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C2nw, Unit> {
        public final /* synthetic */ String $address;
        public final /* synthetic */ String $label;
        public final /* synthetic */ double $latitude;
        public final /* synthetic */ double $longitude;
        public final /* synthetic */ double $radiusMeters;
        public final /* synthetic */ String $trigger;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C2nw c2nw) {
            C7384Etj.A0Y(c2nw, 0);
            C7qW.A06("label", this.$label, c2nw);
            C7qW.A06("trigger", this.$trigger, c2nw);
            C7qW.A05(Double.valueOf(this.$radiusMeters), "radius_meters", c2nw);
            C7qW.A05(Double.valueOf(this.$latitude), GeofenceEventWorker.KEY_LATITUDE, c2nw);
            C7qW.A05(Double.valueOf(this.$longitude), GeofenceEventWorker.KEY_LONGITUDE, c2nw);
            String str = this.$address;
            if (str == null || str.length() <= 0) {
                return;
            }
            C7qW.A06("address", str, c2nw);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, double d, double d2, double d3, String str3) {
            super(1);
            this.$label = str;
            this.$trigger = str2;
            this.$radiusMeters = d;
            this.$latitude = d2;
            this.$longitude = d3;
            this.$address = str3;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C2nw c2nw) {
            invoke2(c2nw);
            return Unit.INSTANCE;
        }
    }

    public static final String geofenceCardEnvelope(String str, String str2, double d, double d2, double d3, String str3, String str4) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(str4, 6);
        return NodeCardEnvelopeKt.nodeCardEnvelope(HatchNodeCardJsonKt.TYPE_GEOFENCE, null, NodeCardEnvelopeKt.nodeCardDeviceInfoFallback(str4, "Location reminder set"), null, new AnonymousClass1(str, str2, d, d2, d3, str3));
    }
}
