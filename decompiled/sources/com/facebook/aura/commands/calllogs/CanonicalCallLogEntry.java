package com.facebook.aura.commands.calllogs;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C2nw;
import X.C3cG;
import X.C60O;
import X.C60R;
import X.C7384Etj;
import X.C7qW;
import com.facebook.aura.nodes.datasource.NodeSyncTimestamps;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class CanonicalCallLogEntry extends C06G {
    public final long date;
    public final long duration;
    public final long id;
    public final String name;
    public final String number;
    public final int type;

    public CanonicalCallLogEntry(long j, String str, String str2, int i, long j2, long j3) {
        C7384Etj.A0Y(str, 1);
        this.id = j;
        this.number = str;
        this.name = str2;
        this.type = i;
        this.date = j2;
        this.duration = j3;
    }

    public final CanonicalCallLogEntry copy(long j, String str, String str2, int i, long j2, long j3) {
        C7384Etj.A0Y(str, 1);
        return new CanonicalCallLogEntry(j, str, str2, i, j2, j3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CanonicalCallLogEntry) {
                CanonicalCallLogEntry canonicalCallLogEntry = (CanonicalCallLogEntry) obj;
                if (this.id != canonicalCallLogEntry.id || !C7384Etj.areEqual(this.number, canonicalCallLogEntry.number) || !C7384Etj.areEqual(this.name, canonicalCallLogEntry.name) || this.type != canonicalCallLogEntry.type || this.date != canonicalCallLogEntry.date || this.duration != canonicalCallLogEntry.duration) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CanonicalCallLogEntry copy$default(CanonicalCallLogEntry canonicalCallLogEntry, long j, String str, String str2, int i, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = canonicalCallLogEntry.id;
        }
        if ((i2 & 2) != 0) {
            str = canonicalCallLogEntry.number;
        }
        if ((i2 & 4) != 0) {
            str2 = canonicalCallLogEntry.name;
        }
        if ((i2 & 8) != 0) {
            i = canonicalCallLogEntry.type;
        }
        if ((i2 & 16) != 0) {
            j2 = canonicalCallLogEntry.date;
        }
        if ((i2 & 32) != 0) {
            j3 = canonicalCallLogEntry.duration;
        }
        return canonicalCallLogEntry.copy(j, str, str2, i, j2, j3);
    }

    public final long component1() {
        return this.id;
    }

    public final String component2() {
        return this.number;
    }

    public final String component3() {
        return this.name;
    }

    public final int component4() {
        return this.type;
    }

    public final long component5() {
        return this.date;
    }

    public final long component6() {
        return this.duration;
    }

    public final long getDate() {
        return this.date;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNumber() {
        return this.number;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return AnonymousClass006.A06(this.date, (((AnonymousClass005.A0I(this.number, AnonymousClass005.A07(this.id)) + AnonymousClass006.A0G(this.name)) * 31) + this.type) * 31) + C3cG.A02(this.duration);
    }

    public final JsonObject toJson() {
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A05(Long.valueOf(this.id), "id", c2nwA1K);
        C7qW.A06("number", this.number, c2nwA1K);
        C60R.A1M(this.name, "name", c2nwA1K);
        C7qW.A05(Integer.valueOf(this.type), "type", c2nwA1K);
        C7qW.A05(Long.valueOf(this.date), "date", c2nwA1K);
        C7qW.A05(Long.valueOf(this.duration), "duration", c2nwA1K);
        C7qW.A06("direction", CallLogModelsKt.directionOf(this.type), c2nwA1K);
        NodeSyncTimestamps.INSTANCE.putLocalTimeFields(c2nwA1K, this.date, "date");
        return c2nwA1K.A00();
    }

    public String toString() {
        return super.toString();
    }
}
