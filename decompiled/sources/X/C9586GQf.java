package X;

import android.content.Context;
import com.facebook.aura.partners.voice.session.impl.VoiceSessionHelpers;

/* renamed from: X.GQf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9586GQf extends C06G {
    public int A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final long A0D;
    public final Context A0E;
    public final GQX A0F;
    public final GQW A0G;
    public final EnumC10452Hio A0H;
    public final Long A0I;
    public final String A0J;
    public final String A0K;
    public final C3UX A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9586GQf) {
                C9586GQf c9586GQf = (C9586GQf) obj;
                if (this.A0D != c9586GQf.A0D || !C7384Etj.areEqual(this.A0K, c9586GQf.A0K) || !C7384Etj.areEqual(this.A0E, c9586GQf.A0E) || !C7384Etj.areEqual(this.A0L, c9586GQf.A0L) || !C7384Etj.areEqual(this.A0J, c9586GQf.A0J) || !C7384Etj.areEqual(this.A0F, c9586GQf.A0F) || !C7384Etj.areEqual(this.A0G, c9586GQf.A0G) || !C7384Etj.areEqual(this.A0I, c9586GQf.A0I) || this.A0N != c9586GQf.A0N || this.A06 != c9586GQf.A06 || !C7384Etj.areEqual(this.A04, c9586GQf.A04) || this.A00 != c9586GQf.A00 || this.A0A != c9586GQf.A0A || !C7384Etj.areEqual(this.A05, c9586GQf.A05) || !C7384Etj.areEqual(this.A01, c9586GQf.A01) || !C7384Etj.areEqual(this.A02, c9586GQf.A02) || !C7384Etj.areEqual(this.A03, c9586GQf.A03) || !C7384Etj.areEqual(this.A09, c9586GQf.A09) || this.A07 != c9586GQf.A07 || this.A0C != c9586GQf.A0C || this.A0B != c9586GQf.A0B || !C7384Etj.areEqual(this.A08, c9586GQf.A08) || this.A0M != c9586GQf.A0M || this.A0H != c9586GQf.A0H || this.A0O != c9586GQf.A0O) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int iA01 = C0KA.A01(AbstractC7610F5x.A0D((((((((AnonymousClass005.A0F(this.A0F, AnonymousClass005.A0I(this.A0J, AnonymousClass005.A0F(this.A0L, AnonymousClass005.A0F(this.A0E, AnonymousClass005.A0I(this.A0K, C3cI.A01(this.A0D)))))) + AnonymousClass006.A0D(this.A0G)) * 31) + 1237) * 31) + 1237) * 31) + 1237) * 31, AnonymousClass006.A0D(this.A0I)) * 31 * 31 * 31, this.A0N) * 31;
        int iIntValue = this.A06.intValue();
        switch (iIntValue) {
            case 1:
                str = "MEDIA";
                break;
            case 2:
                str = "ASSISTANT";
                break;
            default:
                str = "VOICE_CALL";
                break;
        }
        int iA0D = ((((((((AbstractC7610F5x.A0D(C0KA.A01((((((((iA01 + str.hashCode() + iIntValue) * 31) + AnonymousClass006.A0D(this.A04)) * 31) + 1237) * 31) + this.A00) * 31, this.A0A), AnonymousClass006.A0D(this.A05)) * 31 * 31 * 31 * 31 * 31 * 31 * 31) + AnonymousClass006.A0D(this.A01)) * 31) + AnonymousClass006.A0D(this.A02)) * 31) + AnonymousClass006.A0D(this.A03)) * 31) + AnonymousClass006.A0G(this.A09)) * 31;
        int iIntValue2 = this.A07.intValue();
        return (((((C0KA.A01((((C0KA.A01((C0KA.A01(C0KA.A01((iA0D + (1 != iIntValue2 ? "PLAYOUT_START" : "FIRST_PEER_VIDEO_FRAME").hashCode() + iIntValue2) * 31, this.A0C), this.A0B) + AnonymousClass006.A0G(this.A08)) * 31, this.A0M) + AnonymousClass006.A0D(this.A0H)) * 31) + 1237) * 31, this.A0O) * 31) + 1237) * 31) + 1237) * 31) + 1237;
    }

    public C9586GQf(Context context, GQX gqx, GQW gqw, EnumC10452Hio enumC10452Hio, Integer num, Integer num2, Integer num3, Long l, String str, String str2, String str3, C3UX c3ux, boolean z, boolean z2, boolean z3) {
        C7384Etj.A0Y(str, 4);
        this.A0D = VoiceSessionHelpers.HATCH_BOT_ID;
        this.A0K = "hatch_voice_button";
        this.A0E = context;
        this.A0L = c3ux;
        this.A0J = str;
        this.A0F = gqx;
        this.A0G = gqw;
        this.A0I = l;
        this.A0N = z;
        this.A06 = num;
        this.A04 = null;
        this.A00 = 60000;
        this.A0A = z2;
        this.A05 = num2;
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
        this.A09 = str2;
        this.A07 = num3;
        this.A0C = true;
        this.A0B = true;
        this.A08 = str3;
        this.A0M = z3;
        this.A0H = enumC10452Hio;
        this.A0O = true;
    }
}
