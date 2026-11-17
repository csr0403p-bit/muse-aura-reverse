package X;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.DiW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5435DiW {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final C5480DjH A09;
    public final ImmutableMap<String, String> A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final Map<String, String> A0K;
    public final boolean A0L;
    public final long[] A0M;

    public final long[] A00() {
        long[] jArr = this.A0M;
        if (jArr == null) {
            return null;
        }
        return (long[]) jArr.clone();
    }

    public C5435DiW(Map<String, String> map) {
        this.A0C = "";
        this.A0E = "";
        this.A0F = "";
        this.A02 = -1;
        this.A0J = "";
        this.A08 = -1L;
        this.A01 = -1;
        this.A06 = -1L;
        this.A07 = -1L;
        this.A04 = -1L;
        this.A05 = -1L;
        this.A0D = "";
        this.A0K = Collections.EMPTY_MAP;
        this.A0G = null;
        this.A0H = null;
        this.A0I = null;
        this.A0B = null;
        this.A03 = -1;
        this.A00 = 1.0f;
        this.A09 = null;
        this.A0M = null;
        this.A0A = ImmutableMap.copyOf((Map) map);
        this.A0L = false;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/DiW;[JLjava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V */
    public C5435DiW(C5435DiW c5435DiW, Map map, long[] jArr) {
        long[] jArr2;
        this.A0C = c5435DiW.A0C;
        this.A0E = c5435DiW.A0E;
        this.A0F = c5435DiW.A0F;
        this.A02 = c5435DiW.A02;
        this.A0J = c5435DiW.A0J;
        this.A08 = c5435DiW.A08;
        this.A01 = c5435DiW.A01;
        this.A06 = c5435DiW.A06;
        this.A07 = c5435DiW.A07;
        this.A04 = c5435DiW.A04;
        this.A05 = c5435DiW.A05;
        this.A0D = c5435DiW.A0D;
        this.A0K = c5435DiW.A0K;
        this.A0G = c5435DiW.A0G;
        this.A0H = c5435DiW.A0H;
        this.A0I = c5435DiW.A0I;
        this.A0B = c5435DiW.A0B;
        this.A03 = c5435DiW.A03;
        this.A00 = c5435DiW.A00;
        this.A09 = c5435DiW.A09;
        if (jArr == null) {
            jArr2 = null;
        } else {
            jArr2 = (long[]) jArr.clone();
        }
        this.A0M = jArr2;
        this.A0A = ImmutableMap.copyOf(map);
        this.A0L = c5435DiW.A0L;
    }

    public C5435DiW(C5480DjH c5480DjH, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map map, float f, int i, int i2, int i3, long j) {
        this.A0C = str;
        this.A0E = str2;
        this.A0F = str3;
        this.A02 = i;
        this.A0J = str4;
        this.A08 = j;
        this.A01 = i2;
        this.A06 = 0L;
        this.A07 = 0L;
        this.A04 = 0L;
        this.A05 = 0L;
        this.A0D = str5 == null ? "" : str5;
        this.A0K = map;
        this.A0G = str6;
        this.A0H = str7;
        this.A0I = str8;
        this.A0B = str9;
        this.A03 = i3;
        this.A00 = f;
        this.A09 = c5480DjH;
        this.A0M = null;
        this.A0A = RegularImmutableMap.A03;
        this.A0L = true;
    }
}
