package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.localbrowser.LocalBrowserCapacityKt;
import java.util.List;

/* renamed from: X.AsT, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1856AsT implements C0fG {
    public ClipboardManager A00;
    public final Context A01;

    public static final ClipboardManager A00(C1856AsT c1856AsT) {
        ClipboardManager clipboardManager = c1856AsT.A00;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Object systemService = c1856AsT.A01.getSystemService(HatchFileUIUtils.CLIPBOARD_STAGING_DIR);
        C7384Etj.A0Z(systemService, AnonymousClass000.A00(32));
        ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
        c1856AsT.A00 = clipboardManager2;
        return clipboardManager2;
    }

    public static C1860AsY A01(Object obj) {
        ClipData primaryClip = A00(((C1858AsV) obj).A00).getPrimaryClip();
        if (primaryClip != null) {
            return new C1860AsY(primaryClip);
        }
        return null;
    }

    public C1856AsT(Context context) {
        this.A01 = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0123  */
    @Override // X.C0fG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.ApQ ALZ() {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1856AsT.ALZ():X.ApQ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String] */
    @Override // X.C0fG
    public final void Aey(ApQ apQ) {
        ?? spannableString;
        ClipboardManager clipboardManagerA00 = A00(this);
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
                    long jADn2 = c1824Aro.A0D.ADn();
                    long j2 = 63 & jADn2;
                    if (BMp.A01(j2, 16L) >= 0) {
                        jADn2 = (jADn2 & (-64)) | (j2 - 1);
                    }
                    parcelObtain.writeLong(jADn2);
                }
                long j3 = c1824Aro.A01;
                long j4 = C1809ArT.A01;
                if (j3 != j4) {
                    parcelObtain.writeByte((byte) 2);
                    long j5 = c1824Aro.A01;
                    long jA01 = C1809ArT.A01(j5);
                    byte b = 0;
                    if (!AnonymousClass002.A1M((jA01 > 0L ? 1 : (jA01 == 0L ? 0 : -1)))) {
                        if (jA01 == LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES) {
                            b = 1;
                        } else if (jA01 == 8589934592L) {
                            b = 2;
                        }
                    }
                    parcelObtain.writeByte(b);
                    if (C1809ArT.A01(j5) != 0) {
                        parcelObtain.writeFloat(C1809ArT.A00(j5));
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
                if (c1824Aro.A02 != j4) {
                    parcelObtain.writeByte((byte) 7);
                    long j6 = c1824Aro.A02;
                    long jA012 = C1809ArT.A01(j6);
                    byte b4 = 0;
                    if (!AnonymousClass002.A1M((jA012 > 0L ? 1 : (jA012 == 0L ? 0 : -1)))) {
                        if (jA012 == LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES) {
                            b4 = 1;
                        } else if (jA012 == 8589934592L) {
                            b4 = 2;
                        }
                    }
                    parcelObtain.writeByte(b4);
                    if (C1809ArT.A01(j6) != 0) {
                        parcelObtain.writeFloat(C1809ArT.A00(j6));
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
                    long j7 = c1824Aro.A00;
                    long j8 = 63 & j7;
                    if (BMp.A01(j8, 16L) >= 0) {
                        j7 = (j7 & (-64)) | (j8 - 1);
                    }
                    parcelObtain.writeLong(j7);
                }
                BG3 bg3 = c1824Aro.A0C;
                if (bg3 != null) {
                    parcelObtain.writeByte((byte) 11);
                    parcelObtain.writeInt(bg3.A00);
                }
                C1780Aqg c1780Aqg = c1824Aro.A03;
                if (c1780Aqg != null) {
                    parcelObtain.writeByte((byte) 12);
                    long j9 = c1780Aqg.A01;
                    long j10 = 63 & j9;
                    if (BMp.A01(j10, 16L) >= 0) {
                        j9 = (j9 & (-64)) | (j10 - 1);
                    }
                    parcelObtain.writeLong(j9);
                    long j11 = c1780Aqg.A02;
                    parcelObtain.writeFloat(AnonymousClass003.A03(j11));
                    parcelObtain.writeFloat(AnonymousClass004.A00(j11));
                    parcelObtain.writeFloat(c1780Aqg.A00);
                }
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(parcelObtain.marshall(), 0)), i2, i3, 33);
            }
        }
        clipboardManagerA00.setPrimaryClip(ClipData.newPlainText("plain text", spannableString));
    }
}
