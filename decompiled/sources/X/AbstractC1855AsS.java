package X;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import com.facebook.aura.localbrowser.LocalBrowserCapacityKt;
import java.util.List;

/* renamed from: X.AsS, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1855AsS {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    public static final C1860AsY A00(ApQ apQ) {
        ?? spannableString;
        if (apQ == null) {
            return null;
        }
        List list = apQ.A03;
        if (list == null) {
            list = C0881AGi.A00;
        }
        if (list.isEmpty()) {
            spannableString = apQ.A00;
        } else {
            spannableString = new SpannableString(apQ.A00);
            Parcel parcelObtain = Parcel.obtain();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C1733ApU c1733ApUA0c = C8j4.A0c(list, i);
                C1824Aro c1824Aro = (C1824Aro) c1733ApUA0c.A02;
                int i2 = c1733ApUA0c.A01;
                int i3 = c1733ApUA0c.A00;
                parcelObtain.recycle();
                parcelObtain = Parcel.obtain();
                long jADn = c1824Aro.A0D.ADn();
                long j = B6A.A07;
                if (jADn != j) {
                    parcelObtain.writeByte((byte) 1);
                    parcelObtain.writeLong(c1824Aro.A0D.ADn());
                }
                long j2 = c1824Aro.A01;
                long j3 = C1809ArT.A01;
                if (j2 != j3) {
                    parcelObtain.writeByte((byte) 2);
                    long j4 = c1824Aro.A01;
                    long jA01 = C1809ArT.A01(j4);
                    byte b = 0;
                    if (!AnonymousClass002.A1M((jA01 > 0L ? 1 : (jA01 == 0L ? 0 : -1)))) {
                        if (jA01 == LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES) {
                            b = 1;
                        } else if (jA01 == 8589934592L) {
                            b = 2;
                        }
                    }
                    parcelObtain.writeByte(b);
                    if (C1809ArT.A01(j4) != 0) {
                        parcelObtain.writeFloat(C1809ArT.A00(j4));
                    }
                }
                C1736ApY c1736ApY = c1824Aro.A09;
                if (c1736ApY != null) {
                    parcelObtain.writeByte((byte) 3);
                    parcelObtain.writeInt(c1736ApY.A00);
                }
                B0A b0a = c1824Aro.A07;
                if (b0a != null) {
                    int i4 = b0a.A00;
                    parcelObtain.writeByte((byte) 4);
                    byte b2 = 0;
                    if (!AnonymousClass002.A1Q(i4, 0) && i4 == 1) {
                        b2 = 1;
                    }
                    parcelObtain.writeByte(b2);
                }
                B0I b0i = c1824Aro.A08;
                if (b0i != null) {
                    int i5 = b0i.A00;
                    parcelObtain.writeByte((byte) 5);
                    byte b3 = 0;
                    if (!AnonymousClass002.A1Q(i5, 0)) {
                        if (i5 == 65535) {
                            b3 = 1;
                        } else if (i5 == 1) {
                            b3 = 2;
                        } else if (i5 == 2) {
                            b3 = 3;
                        }
                    }
                    parcelObtain.writeByte(b3);
                }
                String str = c1824Aro.A0F;
                if (str != null) {
                    parcelObtain.writeByte((byte) 6);
                    parcelObtain.writeString(str);
                }
                if (c1824Aro.A02 != j3) {
                    parcelObtain.writeByte((byte) 7);
                    long j5 = c1824Aro.A02;
                    long jA012 = C1809ArT.A01(j5);
                    byte b4 = 0;
                    if (!AnonymousClass002.A1M((jA012 > 0L ? 1 : (jA012 == 0L ? 0 : -1)))) {
                        if (jA012 == LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES) {
                            b4 = 1;
                        } else if (jA012 == 8589934592L) {
                            b4 = 2;
                        }
                    }
                    parcelObtain.writeByte(b4);
                    if (C1809ArT.A01(j5) != 0) {
                        parcelObtain.writeFloat(C1809ArT.A00(j5));
                    }
                }
                ArS arS = c1824Aro.A0B;
                if (arS != null) {
                    float f = arS.A00;
                    parcelObtain.writeByte((byte) 8);
                    parcelObtain.writeFloat(f);
                }
                C1807ArQ c1807ArQ = c1824Aro.A0E;
                if (c1807ArQ != null) {
                    parcelObtain.writeByte((byte) 9);
                    parcelObtain.writeFloat(c1807ArQ.A00);
                    parcelObtain.writeFloat(c1807ArQ.A01);
                }
                if (c1824Aro.A00 != j) {
                    parcelObtain.writeByte((byte) 10);
                    parcelObtain.writeLong(c1824Aro.A00);
                }
                BG3 bg3 = c1824Aro.A0C;
                if (bg3 != null) {
                    parcelObtain.writeByte((byte) 11);
                    parcelObtain.writeInt(bg3.A00);
                }
                C1780Aqg c1780Aqg = c1824Aro.A03;
                if (c1780Aqg != null) {
                    parcelObtain.writeByte((byte) 12);
                    parcelObtain.writeLong(c1780Aqg.A01);
                    long j6 = c1780Aqg.A02;
                    parcelObtain.writeFloat(AnonymousClass003.A03(j6));
                    parcelObtain.writeFloat(AnonymousClass004.A00(j6));
                    parcelObtain.writeFloat(c1780Aqg.A00);
                }
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(parcelObtain.marshall(), 0)), i2, i3, 33);
            }
        }
        return new C1860AsY(ClipData.newPlainText("plain text", spannableString));
    }
}
