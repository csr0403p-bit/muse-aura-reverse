package com.facebook.pushlite.model;

import X.A5H;
import X.AnonymousClass006;
import X.BUU;
import X.BV4;
import X.C06G;
import X.C3cH;
import X.C4158CoD;
import X.C7384Etj;
import X.C9hr;
import X.C9sR;
import X.C9sU;
import X.CFK;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

@Serializable
/* loaded from: classes4.dex */
public final class PushInfraMetaData extends C06G implements Parcelable {
    public final Long A00;
    public final Long A01;
    public final Long A02;
    public final Long A03;
    public final Long A04;
    public final Long A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<PushInfraMetaData> CREATOR = new C4158CoD(5);
    public static final C9sU A0I = C9sR.A00(new BUU(37), C9sU.A03);

    /* loaded from: classes5.dex */
    public final class Companion {
        public static final PushInfraMetaData A00(String str) {
            if (str != null) {
                try {
                    return (PushInfraMetaData) PushInfraMetaData.A0I.A00(str, A5H.A00);
                } catch (Exception e) {
                    CFK.A08("PushInfraMetaData", "Error parsing PIM from json string", e);
                }
            }
            return new PushInfraMetaData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        }

        public final PushInfraMetaData A01(Intent intent) {
            String stringExtra;
            if (intent.hasExtra("pim")) {
                String stringExtra2 = intent.getStringExtra("pim");
                if (stringExtra2 != null && stringExtra2.length() != 0) {
                    return A00(stringExtra2);
                }
            } else if (intent.hasExtra("data") && (stringExtra = intent.getStringExtra("data")) != null) {
                try {
                    JSONObject jSONObjectA19 = BV4.A19(stringExtra);
                    if (jSONObjectA19.has("pim")) {
                        C9sU c9sU = PushInfraMetaData.A0I;
                        return A00(jSONObjectA19.getString("pim"));
                    }
                } catch (JSONException e) {
                    CFK.A08("PushInfraMetaData", "Could not extract PIM, error parsing json \"data\" field on intent", e);
                }
            }
            return new PushInfraMetaData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        }

        public final C9hr<PushInfraMetaData> serializer() {
            return A5H.A00;
        }
    }

    public static void A0y(Parcel parcel, Number number) {
        if (number == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(number.longValue());
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PushInfraMetaData) {
                PushInfraMetaData pushInfraMetaData = (PushInfraMetaData) obj;
                if (!C7384Etj.areEqual(this.A0D, pushInfraMetaData.A0D) || !C7384Etj.areEqual(this.A04, pushInfraMetaData.A04) || !C7384Etj.areEqual(this.A0G, pushInfraMetaData.A0G) || !C7384Etj.areEqual(this.A07, pushInfraMetaData.A07) || !C7384Etj.areEqual(this.A08, pushInfraMetaData.A08) || !C7384Etj.areEqual(this.A09, pushInfraMetaData.A09) || !C7384Etj.areEqual(this.A0H, pushInfraMetaData.A0H) || !C7384Etj.areEqual(this.A0F, pushInfraMetaData.A0F) || !C7384Etj.areEqual(this.A06, pushInfraMetaData.A06) || !C7384Etj.areEqual(this.A03, pushInfraMetaData.A03) || !C7384Etj.areEqual(this.A00, pushInfraMetaData.A00) || !C7384Etj.areEqual(this.A0B, pushInfraMetaData.A0B) || !C7384Etj.areEqual(this.A02, pushInfraMetaData.A02) || !C7384Etj.areEqual(this.A0A, pushInfraMetaData.A0A) || !C7384Etj.areEqual(this.A05, pushInfraMetaData.A05) || !C7384Etj.areEqual(this.A0E, pushInfraMetaData.A0E) || !C7384Etj.areEqual(this.A0C, pushInfraMetaData.A0C) || !C7384Etj.areEqual(this.A01, pushInfraMetaData.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C7384Etj.A0Y(parcel, 0);
        parcel.writeString(this.A0D);
        A0y(parcel, this.A04);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A06);
        A0y(parcel, this.A03);
        A0y(parcel, this.A00);
        parcel.writeString(this.A0B);
        A0y(parcel, this.A02);
        parcel.writeString(this.A0A);
        A0y(parcel, this.A05);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0C);
        A0y(parcel, this.A01);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((AnonymousClass006.A0G(this.A0D) * 31) + AnonymousClass006.A0D(this.A04)) * 31) + AnonymousClass006.A0G(this.A0G)) * 31) + AnonymousClass006.A0G(this.A07)) * 31) + AnonymousClass006.A0G(this.A08)) * 31) + AnonymousClass006.A0G(this.A09)) * 31) + AnonymousClass006.A0G(this.A0H)) * 31) + AnonymousClass006.A0G(this.A0F)) * 31) + AnonymousClass006.A0G(this.A06)) * 31) + AnonymousClass006.A0D(this.A03)) * 31) + AnonymousClass006.A0D(this.A00)) * 31) + AnonymousClass006.A0G(this.A0B)) * 31) + AnonymousClass006.A0D(this.A02)) * 31) + AnonymousClass006.A0G(this.A0A)) * 31) + AnonymousClass006.A0D(this.A05)) * 31) + AnonymousClass006.A0G(this.A0E)) * 31) + AnonymousClass006.A0G(this.A0C)) * 31) + C3cH.A02(this.A01);
    }

    public PushInfraMetaData(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.A0D = str;
        this.A04 = l;
        this.A0G = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A09 = str5;
        this.A0H = str6;
        this.A0F = str7;
        this.A06 = str8;
        this.A03 = l2;
        this.A00 = l3;
        this.A0B = str9;
        this.A02 = l4;
        this.A0A = str10;
        this.A05 = l5;
        this.A0E = str11;
        this.A0C = str12;
        this.A01 = l6;
    }

    public /* synthetic */ PushInfraMetaData(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i) {
        if ((i & 1) == 0) {
            this.A0D = null;
        } else {
            this.A0D = str;
        }
        if ((i & 2) == 0) {
            this.A04 = null;
        } else {
            this.A04 = l;
        }
        if ((i & 4) == 0) {
            this.A0G = null;
        } else {
            this.A0G = str2;
        }
        if ((i & 8) == 0) {
            this.A07 = null;
        } else {
            this.A07 = str3;
        }
        if ((i & 16) == 0) {
            this.A08 = null;
        } else {
            this.A08 = str4;
        }
        if ((i & 32) == 0) {
            this.A09 = null;
        } else {
            this.A09 = str5;
        }
        if ((i & 64) == 0) {
            this.A0H = null;
        } else {
            this.A0H = str6;
        }
        if ((i & 128) == 0) {
            this.A0F = null;
        } else {
            this.A0F = str7;
        }
        if ((i & 256) == 0) {
            this.A06 = null;
        } else {
            this.A06 = str8;
        }
        if ((i & 512) == 0) {
            this.A03 = null;
        } else {
            this.A03 = l2;
        }
        if ((i & 1024) == 0) {
            this.A00 = null;
        } else {
            this.A00 = l3;
        }
        if ((i & 2048) == 0) {
            this.A0B = null;
        } else {
            this.A0B = str9;
        }
        if ((i & 4096) == 0) {
            this.A02 = null;
        } else {
            this.A02 = l4;
        }
        if ((i & 8192) == 0) {
            this.A0A = null;
        } else {
            this.A0A = str10;
        }
        if ((i & 16384) == 0) {
            this.A05 = null;
        } else {
            this.A05 = l5;
        }
        if ((32768 & i) == 0) {
            this.A0E = null;
        } else {
            this.A0E = str11;
        }
        if ((65536 & i) == 0) {
            this.A0C = null;
        } else {
            this.A0C = str12;
        }
        if ((i & 131072) == 0) {
            this.A01 = null;
        } else {
            this.A01 = l6;
        }
    }

    public PushInfraMetaData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }
}
