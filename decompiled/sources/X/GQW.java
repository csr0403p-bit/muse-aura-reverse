package X;

import com.facebook.aura.partners.voice.session.impl.VoiceSessionHelpers;

/* loaded from: classes6.dex */
public final class GQW extends C06G {
    public final int A00;
    public final Boolean A02;
    public final String A03;
    public final String A04;
    public final boolean A06;
    public final boolean A09;
    public final EnumC10589Hxc A0A;
    public final String A05 = VoiceSessionHelpers.THREAD_ENTRYPOINT;
    public final int A01 = 26;
    public final boolean A08 = true;
    public final boolean A07 = true;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GQW) {
                GQW gqw = (GQW) obj;
                if (!C7384Etj.areEqual(this.A05, gqw.A05) || !C7384Etj.areEqual(this.A03, gqw.A03) || this.A01 != gqw.A01 || this.A0A != gqw.A0A || this.A06 != gqw.A06 || !C7384Etj.areEqual(this.A02, gqw.A02) || !C7384Etj.areEqual(this.A04, gqw.A04) || this.A09 != gqw.A09 || this.A08 != gqw.A08 || this.A00 != gqw.A00 || this.A07 != gqw.A07) {
                }
            }
            return false;
        }
        return true;
    }

    public GQW(EnumC10589Hxc enumC10589Hxc, Boolean bool, String str, String str2, int i, boolean z, boolean z2) {
        this.A03 = str;
        this.A0A = enumC10589Hxc;
        this.A06 = z;
        this.A02 = bool;
        this.A04 = str2;
        this.A09 = z2;
        this.A00 = i;
    }

    public final int hashCode() {
        return (C0KA.A01((C0KA.A01((C0KA.A01(((((AbstractC7610F5x.A0D((AbstractC7610F5x.A0D(AbstractC7610F5x.A0D(C0KA.A01((((AnonymousClass005.A0F(this.A0A, ((AbstractC7610F5x.A0D(AnonymousClass001.A0G(this.A05) * 31, AnonymousClass006.A0G(this.A03)) * 31 * 31 * 31 * 31 * 31) + this.A01) * 31 * 31) + 1237) * 31) + 1237) * 31 * 31, this.A06), 1237), 1237) + 1237) * 31 * 31, AnonymousClass006.A0D(this.A02)) * 31) + 1237) * 31 * 31) + AnonymousClass006.A0G(this.A04)) * 31, this.A09) + 1237) * 31, this.A08) + this.A00) * 31, this.A07) + 1237) * 31 * 31 * 31;
    }
}
