package com.facebook.aura.flight.ui;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class FlightDetailRow extends C06G {
    public static final int $stable = 0;
    public final FlightDetailRowKind kind;
    public final String text;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightDetailRow) {
                FlightDetailRow flightDetailRow = (FlightDetailRow) obj;
                if (this.kind != flightDetailRow.kind || !C7384Etj.areEqual(this.text, flightDetailRow.text)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FlightDetailRow copy$default(FlightDetailRow flightDetailRow, FlightDetailRowKind flightDetailRowKind, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            flightDetailRowKind = flightDetailRow.kind;
        }
        if ((i & 2) != 0) {
            str = flightDetailRow.text;
        }
        AnonymousClass003.A0u(flightDetailRowKind, str);
        return new FlightDetailRow(flightDetailRowKind, str);
    }

    public final FlightDetailRowKind component1() {
        return this.kind;
    }

    public final String component2() {
        return this.text;
    }

    public final FlightDetailRowKind getKind() {
        return this.kind;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.text, AnonymousClass005.A0E(this.kind));
    }

    public FlightDetailRow(FlightDetailRowKind flightDetailRowKind, String str) {
        AnonymousClass003.A0u(flightDetailRowKind, str);
        this.kind = flightDetailRowKind;
        this.text = str;
    }

    public final FlightDetailRow copy(FlightDetailRowKind flightDetailRowKind, String str) {
        AnonymousClass003.A0u(flightDetailRowKind, str);
        return new FlightDetailRow(flightDetailRowKind, str);
    }

    public String toString() {
        return super.toString();
    }
}
