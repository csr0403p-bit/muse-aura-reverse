package com.facebook.auth.viewercontext;

import X.AnonymousClass002;
import X.BV4;
import X.BV7;
import X.BrS;
import X.C2998BrR;
import X.C7580F4t;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;

/* loaded from: classes5.dex */
public final class ViewerContext implements Parcelable {
    public static final ViewerContext A0D;
    public static final Parcelable.Creator<ViewerContext> CREATOR;
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public static final ThreadLocal<Boolean> A0F = new C2998BrR();
    public static final ThreadLocal<Boolean> A0E = new BrS();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                ViewerContext viewerContext = (ViewerContext) obj;
                if (this.A0A == viewerContext.A0A && this.A0C == viewerContext.A0C && this.A09 == viewerContext.A09 && this.A0B == viewerContext.A0B && this.A08 == viewerContext.A08) {
                    String str = this.A06;
                    String str2 = viewerContext.A06;
                    if (str != null) {
                        if (str.equals(str2)) {
                        }
                    } else if (str2 != null) {
                        return false;
                    }
                    String str3 = this.A01;
                    String str4 = viewerContext.A01;
                    if (str3 != null) {
                        if (!str3.equals(str4)) {
                            return false;
                        }
                    } else if (str4 != null) {
                        return false;
                    }
                    String str5 = this.A02;
                    String str6 = viewerContext.A02;
                    if (str5 != null) {
                        if (!str5.equals(str6)) {
                            return false;
                        }
                    } else if (str6 != null) {
                        return false;
                    }
                    String str7 = this.A04;
                    String str8 = viewerContext.A04;
                    if (str7 != null) {
                        if (!str7.equals(str8)) {
                            return false;
                        }
                    } else if (str8 != null) {
                        return false;
                    }
                    String str9 = this.A03;
                    String str10 = viewerContext.A03;
                    if (str9 != null) {
                        if (!str9.equals(str10)) {
                            return false;
                        }
                    } else if (str10 != null) {
                        return false;
                    }
                    String str11 = this.A00;
                    String str12 = viewerContext.A00;
                    if (str11 != null) {
                        if (!str11.equals(str12)) {
                            return false;
                        }
                    } else if (str12 != null) {
                        return false;
                    }
                    String str13 = this.A05;
                    String str14 = viewerContext.A05;
                    if (str13 != null) {
                        if (!str13.equals(str14)) {
                            return false;
                        }
                    } else if (str14 != null) {
                        return false;
                    }
                    String str15 = this.A07;
                    String str16 = viewerContext.A07;
                    if (str15 != null) {
                        return str15.equals(str16);
                    }
                    if (str16 == null) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    static {
        A0D = HatchPriceImpressionEventDataKt.NO_DISCOUNT.length() == 0 ? null : new ViewerContext("", HatchPriceImpressionEventDataKt.NO_DISCOUNT);
        CREATOR = new C7580F4t(14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        int iA0I = ((((((((((((((((((((((BV7.A0I(this.A06) * 31) + BV7.A0I(this.A01)) * 31) + BV7.A0I(this.A02)) * 31) + (this.A0A ? 1 : 0)) * 31) + (this.A0C ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + (this.A0B ? 1 : 0)) * 31) + (this.A08 ? 1 : 0)) * 31) + BV7.A0I(this.A04)) * 31) + BV7.A0I(this.A03)) * 31) + BV7.A0I(this.A07)) * 31) + BV7.A0I(this.A00)) * 31;
        String str = this.A05;
        return iA0I + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A06);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A07);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeString(this.A05);
    }

    public ViewerContext(Parcel parcel) {
        this.A06 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A0A = AnonymousClass002.A1Q(parcel.readInt(), 1);
        this.A0C = AnonymousClass002.A1Q(parcel.readInt(), 1);
        this.A09 = AnonymousClass002.A1Q(parcel.readInt(), 1);
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A07 = parcel.readString();
        this.A00 = parcel.readString();
        this.A0B = AnonymousClass002.A1Q(parcel.readInt(), 1);
        this.A08 = parcel.readInt() == 1;
        this.A05 = parcel.readString();
    }

    public ViewerContext(String str, String str2) {
        if (HatchPriceImpressionEventDataKt.NO_DISCOUNT.length() == 0) {
            throw BV4.A0P();
        }
        this.A06 = HatchPriceImpressionEventDataKt.NO_DISCOUNT;
        this.A01 = "";
        this.A02 = null;
        this.A0A = false;
        this.A0C = false;
        this.A09 = false;
        this.A04 = null;
        this.A03 = null;
        this.A07 = null;
        this.A00 = null;
        this.A0B = false;
        this.A08 = false;
        this.A05 = null;
    }

    public ViewerContext() {
        this.A06 = null;
        this.A01 = null;
        this.A02 = null;
        this.A0A = false;
        this.A0C = false;
        this.A09 = false;
        this.A04 = null;
        this.A03 = null;
        this.A07 = null;
        this.A00 = null;
        this.A0B = false;
        this.A08 = false;
        this.A05 = null;
    }
}
