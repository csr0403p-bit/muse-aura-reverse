package com.facebook.aura.model;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class GenericListRowDataJson extends C06G {
    public final HatchAttachmentFileJson file;
    public final FlightRowFlightDataJson flight_data;
    public final int slice_index;
    public final String text;
    public final String url;
    public static final Companion Companion = new Companion();
    public static final int $stable = HatchAttachmentFileJson.$stable;

    public final class Companion {
        public final C9hr<GenericListRowDataJson> serializer() {
            return GenericListRowDataJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(GenericListRowDataJson genericListRowDataJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || genericListRowDataJson.text != null) {
            c9j5.AAP(genericListRowDataJson.text, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || genericListRowDataJson.url != null) {
            c9j5.AAP(genericListRowDataJson.url, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || genericListRowDataJson.file != null) {
            c9j5.AAP(genericListRowDataJson.file, HatchAttachmentFileJson$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || genericListRowDataJson.slice_index != 0) {
            c9j5.AAK(c9iZ, 3, genericListRowDataJson.slice_index);
        }
        if (zAfR || genericListRowDataJson.flight_data != null) {
            c9j5.AAP(genericListRowDataJson.flight_data, FlightRowFlightDataJson$$serializer.INSTANCE, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GenericListRowDataJson) {
                GenericListRowDataJson genericListRowDataJson = (GenericListRowDataJson) obj;
                if (!C7384Etj.areEqual(this.text, genericListRowDataJson.text) || !C7384Etj.areEqual(this.url, genericListRowDataJson.url) || !C7384Etj.areEqual(this.file, genericListRowDataJson.file) || this.slice_index != genericListRowDataJson.slice_index || !C7384Etj.areEqual(this.flight_data, genericListRowDataJson.flight_data)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.model.FlightRowData toFlightDomain(java.util.List<java.lang.String> r31) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.model.GenericListRowDataJson.toFlightDomain(java.util.List):com.facebook.aura.model.FlightRowData");
    }

    public static /* synthetic */ GenericListRowDataJson copy$default(GenericListRowDataJson genericListRowDataJson, String str, String str2, HatchAttachmentFileJson hatchAttachmentFileJson, int i, FlightRowFlightDataJson flightRowFlightDataJson, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = genericListRowDataJson.text;
        }
        if ((i2 & 2) != 0) {
            str2 = genericListRowDataJson.url;
        }
        if ((i2 & 4) != 0) {
            hatchAttachmentFileJson = genericListRowDataJson.file;
        }
        if ((i2 & 8) != 0) {
            i = genericListRowDataJson.slice_index;
        }
        if ((i2 & 16) != 0) {
            flightRowFlightDataJson = genericListRowDataJson.flight_data;
        }
        return genericListRowDataJson.copy(str, str2, hatchAttachmentFileJson, i, flightRowFlightDataJson);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.url;
    }

    public final HatchAttachmentFileJson component3() {
        return this.file;
    }

    public final int component4() {
        return this.slice_index;
    }

    public final FlightRowFlightDataJson component5() {
        return this.flight_data;
    }

    public final GenericListRowDataJson copy(String str, String str2, HatchAttachmentFileJson hatchAttachmentFileJson, int i, FlightRowFlightDataJson flightRowFlightDataJson) {
        return new GenericListRowDataJson(str, str2, hatchAttachmentFileJson, i, flightRowFlightDataJson);
    }

    public final HatchAttachmentFileJson getFile() {
        return this.file;
    }

    public final FlightRowFlightDataJson getFlight_data() {
        return this.flight_data;
    }

    public final int getSlice_index() {
        return this.slice_index;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((((AnonymousClass006.A0G(this.text) * 31) + AnonymousClass006.A0G(this.url)) * 31) + AnonymousClass006.A0D(this.file)) * 31) + this.slice_index) * 31) + C3cH.A02(this.flight_data);
    }

    public GenericListRowDataJson(String str, String str2, HatchAttachmentFileJson hatchAttachmentFileJson, int i, FlightRowFlightDataJson flightRowFlightDataJson) {
        this.text = str;
        this.url = str2;
        this.file = hatchAttachmentFileJson;
        this.slice_index = i;
        this.flight_data = flightRowFlightDataJson;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ GenericListRowDataJson(String str, String str2, HatchAttachmentFileJson hatchAttachmentFileJson, int i, FlightRowFlightDataJson flightRowFlightDataJson, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : hatchAttachmentFileJson, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : flightRowFlightDataJson);
    }

    public /* synthetic */ GenericListRowDataJson(int i, String str, String str2, HatchAttachmentFileJson hatchAttachmentFileJson, int i2, FlightRowFlightDataJson flightRowFlightDataJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.text = null;
        } else {
            this.text = str;
        }
        if ((i & 2) == 0) {
            this.url = null;
        } else {
            this.url = str2;
        }
        if ((i & 4) == 0) {
            this.file = null;
        } else {
            this.file = hatchAttachmentFileJson;
        }
        if ((i & 8) == 0) {
            this.slice_index = 0;
        } else {
            this.slice_index = i2;
        }
        if ((i & 16) == 0) {
            this.flight_data = null;
        } else {
            this.flight_data = flightRowFlightDataJson;
        }
    }

    public GenericListRowDataJson() {
        this(null, null, null, 0, null);
    }
}
