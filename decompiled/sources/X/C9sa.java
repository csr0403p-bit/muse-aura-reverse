package X;

import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* renamed from: X.9sa, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9sa {
    public Integer A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public C9sa() {
        this(C79.A0C, "    ", "type", false, false, false, false, false, true, false, false, false, true, false, false, false);
    }

    public final String toString() {
        String str;
        StringBuilder sbA0x = C60O.A0x("JsonConfiguration(encodeDefaults=");
        sbA0x.append(this.A09);
        sbA0x.append(", ignoreUnknownKeys=");
        sbA0x.append(this.A0B);
        sbA0x.append(", isLenient=");
        sbA0x.append(this.A0C);
        sbA0x.append(", allowStructuredMapKeys=");
        sbA0x.append(this.A05);
        sbA0x.append(", prettyPrint=");
        sbA0x.append(this.A0D);
        sbA0x.append(", explicitNulls=");
        sbA0x.append(this.A0A);
        sbA0x.append(", prettyPrintIndent='");
        sbA0x.append(this.A02);
        sbA0x.append("', coerceInputValues=");
        sbA0x.append(this.A07);
        sbA0x.append(", useArrayPolymorphism=");
        sbA0x.append(this.A0F);
        sbA0x.append(", classDiscriminator='");
        sbA0x.append(this.A01);
        sbA0x.append("', allowSpecialFloatingPointValues=");
        sbA0x.append(this.A04);
        sbA0x.append(", useAlternativeNames=");
        sbA0x.append(this.A0E);
        C8j4.A1R(sbA0x, ", namingStrategy=");
        sbA0x.append(", decodeEnumsCaseInsensitive=");
        sbA0x.append(this.A08);
        sbA0x.append(", allowTrailingComma=");
        sbA0x.append(this.A06);
        sbA0x.append(", allowComments=");
        sbA0x.append(this.A03);
        sbA0x.append(", classDiscriminatorMode=");
        switch (this.A00.intValue()) {
            case 1:
                str = "ALL_JSON_OBJECTS";
                break;
            case 2:
                str = "POLYMORPHIC";
                break;
            default:
                str = HatchPersistedMessageJson.UNSEND_STATUS_NONE;
                break;
        }
        sbA0x.append(str);
        return AnonymousClass006.A0z(sbA0x);
    }

    public C9sa(Integer num, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        AnonymousClass002.A1F(str, 6, str2);
        C7384Etj.A0Y(num, 16);
        this.A09 = z;
        this.A0B = z2;
        this.A0C = z3;
        this.A05 = z4;
        this.A0D = z5;
        this.A0A = z6;
        this.A02 = str;
        this.A07 = z7;
        this.A0F = z8;
        this.A01 = str2;
        this.A04 = z9;
        this.A0E = z10;
        this.A08 = z11;
        this.A06 = z12;
        this.A03 = z13;
        this.A00 = num;
    }
}
