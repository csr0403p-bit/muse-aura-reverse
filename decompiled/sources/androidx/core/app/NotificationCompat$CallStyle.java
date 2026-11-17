package androidx.core.app;

import X.C7502EyJ;
import X.EFo;
import X.EFw;
import X.EFx;
import X.EG8;
import X.EGD;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes5.dex */
public final class NotificationCompat$CallStyle extends EG8 {
    public int A00;
    public PendingIntent A01;
    public PendingIntent A02;
    public PendingIntent A03;
    public EFx A04;
    public Integer A05;
    public Integer A06;
    public boolean A07;
    public IconCompat A08;
    public CharSequence A09;

    public static EGD A00(PendingIntent pendingIntent, NotificationCompat$CallStyle notificationCompat$CallStyle, Integer num, int i, int i2, int i3) {
        if (num == null) {
            num = Integer.valueOf(((EG8) notificationCompat$CallStyle).A00.A0A.getColor(i3));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) ((EG8) notificationCompat$CallStyle).A00.A0A.getResources().getString(i2));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
        Context context = ((EG8) notificationCompat$CallStyle).A00.A0A;
        context.getClass();
        EGD egdA00 = new C7502EyJ(pendingIntent, IconCompat.A00(context.getResources(), context.getPackageName(), i), spannableStringBuilder).A00();
        egdA00.A04.putBoolean("key_action_priority", true);
        return egdA00;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    @Override // X.EG8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(X.EG2 r5) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat$CallStyle.A05(X.EG2):void");
    }

    @Override // X.EG8
    public final void A03(Bundle bundle) {
        super.A03(bundle);
        bundle.putInt("android.callType", this.A00);
        bundle.putBoolean("android.callIsVideo", this.A07);
        EFx eFx = this.A04;
        if (eFx != null) {
            bundle.putParcelable("android.callPerson", EFw.A00(eFx));
        }
        IconCompat iconCompat = this.A08;
        if (iconCompat != null) {
            bundle.putParcelable("android.verificationIcon", EFo.A00(super.A00.A0A, iconCompat));
        }
        bundle.putCharSequence("android.verificationText", this.A09);
        bundle.putParcelable("android.answerIntent", this.A01);
        bundle.putParcelable("android.declineIntent", this.A02);
        bundle.putParcelable("android.hangUpIntent", this.A03);
        Integer num = this.A05;
        if (num != null) {
            bundle.putInt("android.answerColor", num.intValue());
        }
        Integer num2 = this.A06;
        if (num2 != null) {
            bundle.putInt("android.declineColor", num2.intValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // X.EG8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(android.os.Bundle r4) {
        /*
            r3 = this;
            super.A04(r4)
            java.lang.String r0 = "android.callType"
            int r0 = r4.getInt(r0)
            r3.A00 = r0
            java.lang.String r0 = "android.callIsVideo"
            boolean r0 = r4.getBoolean(r0)
            r3.A07 = r0
            java.lang.String r1 = "android.callPerson"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L98
            android.os.Parcelable r0 = r4.getParcelable(r1)
            android.app.Person r0 = (android.app.Person) r0
            X.EFx r0 = X.EFw.A01(r0)
        L25:
            r3.A04 = r0
        L27:
            java.lang.String r1 = "android.verificationIcon"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L87
            android.os.Parcelable r0 = r4.getParcelable(r1)
            androidx.core.graphics.drawable.IconCompat r0 = X.EFo.A01(r0)
        L37:
            r3.A08 = r0
        L39:
            java.lang.String r0 = "android.verificationText"
            java.lang.CharSequence r0 = r4.getCharSequence(r0)
            r3.A09 = r0
            java.lang.String r0 = "android.answerIntent"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            r3.A01 = r0
            java.lang.String r0 = "android.declineIntent"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            r3.A02 = r0
            java.lang.String r0 = "android.hangUpIntent"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            r3.A03 = r0
            java.lang.String r1 = "android.answerColor"
            boolean r0 = r4.containsKey(r1)
            r2 = 0
            if (r0 == 0) goto L85
            int r0 = r4.getInt(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L70:
            r3.A05 = r0
            java.lang.String r1 = "android.declineColor"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L82
            int r0 = r4.getInt(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L82:
            r3.A06 = r2
            return
        L85:
            r0 = r2
            goto L70
        L87:
            java.lang.String r1 = "android.verificationIconCompat"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L39
            android.os.Bundle r0 = r4.getBundle(r1)
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.A01(r0)
            goto L37
        L98:
            java.lang.String r1 = "android.callPersonCompat"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L27
            android.os.Bundle r0 = r4.getBundle(r1)
            X.EFx r0 = X.EFx.A00(r0)
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat$CallStyle.A04(android.os.Bundle):void");
    }
}
