package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

@Serializable
/* loaded from: classes.dex */
public final class GenericListRow extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final JsonObject extraData;
    public final HatchAttachmentFile file;
    public final FlightRowData flight;
    public final String iconUrl;
    public final String imageUrl;
    public final String messageText;
    public final String subtitle;
    public final String tertiaryTitle;
    public final String title;
    public final String type;
    public final String url;

    public final class Companion {
        public final C9hr<GenericListRow> serializer() {
            return GenericListRow$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public GenericListRow(String str, String str2, String str3, String str4, String str5, String str6, String str7, HatchAttachmentFile hatchAttachmentFile, FlightRowData flightRowData, String str8, JsonObject jsonObject) {
        AnonymousClass002.A1D(str, 0, str6);
        this.title = str;
        this.subtitle = str2;
        this.tertiaryTitle = str3;
        this.imageUrl = str4;
        this.iconUrl = str5;
        this.type = str6;
        this.url = str7;
        this.file = hatchAttachmentFile;
        this.flight = flightRowData;
        this.messageText = str8;
        this.extraData = jsonObject;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(GenericListRow genericListRow, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(genericListRow.title, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || genericListRow.subtitle != null) {
            c9j5.AAP(genericListRow.subtitle, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || genericListRow.tertiaryTitle != null) {
            c9j5.AAP(genericListRow.tertiaryTitle, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || genericListRow.imageUrl != null) {
            c9j5.AAP(genericListRow.imageUrl, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || genericListRow.iconUrl != null) {
            c9j5.AAP(genericListRow.iconUrl, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || !GenericListPresentationKt.GENERIC_LIST_ROW_TYPE_GENERIC.equals(genericListRow.type)) {
            c9j5.AAV(genericListRow.type, c9iZ, 5);
        }
        if (zAfR || genericListRow.url != null) {
            c9j5.AAP(genericListRow.url, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || genericListRow.file != null) {
            c9j5.AAP(genericListRow.file, HatchAttachmentFile$$serializer.INSTANCE, c9iZ, 7);
        }
        if (zAfR || genericListRow.flight != null) {
            c9j5.AAP(genericListRow.flight, FlightRowData$$serializer.INSTANCE, c9iZ, 8);
        }
        if (zAfR || genericListRow.messageText != null) {
            c9j5.AAP(genericListRow.messageText, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || genericListRow.extraData != null) {
            c9j5.AAP(genericListRow.extraData, JsonObjectSerializer.A01, c9iZ, 10);
        }
    }

    public final GenericListRow copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, HatchAttachmentFile hatchAttachmentFile, FlightRowData flightRowData, String str8, JsonObject jsonObject) {
        AnonymousClass002.A1D(str, 0, str6);
        return new GenericListRow(str, str2, str3, str4, str5, str6, str7, hatchAttachmentFile, flightRowData, str8, jsonObject);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GenericListRow) {
                GenericListRow genericListRow = (GenericListRow) obj;
                if (!C7384Etj.areEqual(this.title, genericListRow.title) || !C7384Etj.areEqual(this.subtitle, genericListRow.subtitle) || !C7384Etj.areEqual(this.tertiaryTitle, genericListRow.tertiaryTitle) || !C7384Etj.areEqual(this.imageUrl, genericListRow.imageUrl) || !C7384Etj.areEqual(this.iconUrl, genericListRow.iconUrl) || !C7384Etj.areEqual(this.type, genericListRow.type) || !C7384Etj.areEqual(this.url, genericListRow.url) || !C7384Etj.areEqual(this.file, genericListRow.file) || !C7384Etj.areEqual(this.flight, genericListRow.flight) || !C7384Etj.areEqual(this.messageText, genericListRow.messageText) || !C7384Etj.areEqual(this.extraData, genericListRow.extraData)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GenericListRow copy$default(GenericListRow genericListRow, String str, String str2, String str3, String str4, String str5, String str6, String str7, HatchAttachmentFile hatchAttachmentFile, FlightRowData flightRowData, String str8, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = genericListRow.title;
        }
        if ((i & 2) != 0) {
            str2 = genericListRow.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = genericListRow.tertiaryTitle;
        }
        if ((i & 8) != 0) {
            str4 = genericListRow.imageUrl;
        }
        if ((i & 16) != 0) {
            str5 = genericListRow.iconUrl;
        }
        if ((i & 32) != 0) {
            str6 = genericListRow.type;
        }
        if ((i & 64) != 0) {
            str7 = genericListRow.url;
        }
        if ((i & 128) != 0) {
            hatchAttachmentFile = genericListRow.file;
        }
        if ((i & 256) != 0) {
            flightRowData = genericListRow.flight;
        }
        if ((i & 512) != 0) {
            str8 = genericListRow.messageText;
        }
        if ((i & 1024) != 0) {
            jsonObject = genericListRow.extraData;
        }
        return genericListRow.copy(str, str2, str3, str4, str5, str6, str7, hatchAttachmentFile, flightRowData, str8, jsonObject);
    }

    public final String component1() {
        return this.title;
    }

    public final String component10() {
        return this.messageText;
    }

    public final JsonObject component11() {
        return this.extraData;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.tertiaryTitle;
    }

    public final String component4() {
        return this.imageUrl;
    }

    public final String component5() {
        return this.iconUrl;
    }

    public final String component6() {
        return this.type;
    }

    public final String component7() {
        return this.url;
    }

    public final HatchAttachmentFile component8() {
        return this.file;
    }

    public final FlightRowData component9() {
        return this.flight;
    }

    public final JsonObject getExtraData() {
        return this.extraData;
    }

    public final HatchAttachmentFile getFile() {
        return this.file;
    }

    public final FlightRowData getFlight() {
        return this.flight;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getMessageText() {
        return this.messageText;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTertiaryTitle() {
        return this.tertiaryTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return ((((((((AnonymousClass005.A0I(this.type, (((((((AnonymousClass001.A0G(this.title) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0G(this.tertiaryTitle)) * 31) + AnonymousClass006.A0G(this.imageUrl)) * 31) + AnonymousClass006.A0G(this.iconUrl)) * 31) + AnonymousClass006.A0G(this.url)) * 31) + AnonymousClass006.A0D(this.file)) * 31) + AnonymousClass006.A0D(this.flight)) * 31) + AnonymousClass006.A0G(this.messageText)) * 31) + C06G.A04(this.extraData);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ GenericListRow(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, HatchAttachmentFile hatchAttachmentFile, FlightRowData flightRowData, String str8, JsonObject jsonObject, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(GenericListRow$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.title = str;
        if ((i & 2) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
        if ((i & 4) == 0) {
            this.tertiaryTitle = null;
        } else {
            this.tertiaryTitle = str3;
        }
        if ((i & 8) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str4;
        }
        if ((i & 16) == 0) {
            this.iconUrl = null;
        } else {
            this.iconUrl = str5;
        }
        if ((i & 32) == 0) {
            this.type = GenericListPresentationKt.GENERIC_LIST_ROW_TYPE_GENERIC;
        } else {
            this.type = str6;
        }
        if ((i & 64) == 0) {
            this.url = null;
        } else {
            this.url = str7;
        }
        if ((i & 128) == 0) {
            this.file = null;
        } else {
            this.file = hatchAttachmentFile;
        }
        if ((i & 256) == 0) {
            this.flight = null;
        } else {
            this.flight = flightRowData;
        }
        if ((i & 512) == 0) {
            this.messageText = null;
        } else {
            this.messageText = str8;
        }
        if ((i & 1024) == 0) {
            this.extraData = null;
        } else {
            this.extraData = jsonObject;
        }
    }

    public /* synthetic */ GenericListRow(String str, String str2, String str3, String str4, String str5, String str6, String str7, HatchAttachmentFile hatchAttachmentFile, FlightRowData flightRowData, String str8, JsonObject jsonObject, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? GenericListPresentationKt.GENERIC_LIST_ROW_TYPE_GENERIC : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : hatchAttachmentFile, (i & 256) != 0 ? null : flightRowData, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : jsonObject);
    }
}
