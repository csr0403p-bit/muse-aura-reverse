package X;

import com.facebook.aura.partners.voice.infra.VideoConfigJsonKt;

/* renamed from: X.GoR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10047GoR {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int[] A05;
    public final String[] A06;

    public C10047GoR(Gn5 gn5) {
        this.A02 = gn5.A01;
        this.A00 = gn5.A00;
        this.A04 = gn5.A05;
        this.A05 = gn5.A08;
        this.A06 = gn5.A09;
        this.A03 = gn5.A04;
        this.A01 = gn5.A02;
    }

    public C10047GoR(int[] iArr, String[] strArr) {
        this.A02 = 64;
        this.A00 = 0;
        this.A04 = 4;
        this.A05 = iArr;
        this.A06 = strArr;
        this.A03 = VideoConfigJsonKt.SOURCE_WIDTH;
        this.A01 = 512;
    }
}
