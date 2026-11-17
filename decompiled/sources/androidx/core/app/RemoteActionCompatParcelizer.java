package androidx.core.app;

import X.AbstractC6562EFd;
import X.AnonymousClass002;
import X.C6563EFe;
import X.E1K;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes5.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC6562EFd abstractC6562EFd) throws Throwable {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        E1K e1kA04 = remoteActionCompat.A01;
        if (abstractC6562EFd.A09(1)) {
            e1kA04 = abstractC6562EFd.A04();
        }
        remoteActionCompat.A01 = (IconCompat) e1kA04;
        CharSequence charSequence = remoteActionCompat.A03;
        if (abstractC6562EFd.A09(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C6563EFe) abstractC6562EFd).A05);
        }
        remoteActionCompat.A03 = charSequence;
        CharSequence charSequence2 = remoteActionCompat.A02;
        if (abstractC6562EFd.A09(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C6563EFe) abstractC6562EFd).A05);
        }
        remoteActionCompat.A02 = charSequence2;
        remoteActionCompat.A00 = (PendingIntent) abstractC6562EFd.A02(remoteActionCompat.A00, 4);
        boolean zA1L = remoteActionCompat.A04;
        if (abstractC6562EFd.A09(5)) {
            zA1L = AnonymousClass002.A1L(((C6563EFe) abstractC6562EFd).A05.readInt());
        }
        remoteActionCompat.A04 = zA1L;
        boolean zA1L2 = remoteActionCompat.A05;
        if (abstractC6562EFd.A09(6)) {
            zA1L2 = AnonymousClass002.A1L(((C6563EFe) abstractC6562EFd).A05.readInt());
        }
        remoteActionCompat.A05 = zA1L2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC6562EFd abstractC6562EFd) throws Throwable {
        IconCompat iconCompat = remoteActionCompat.A01;
        abstractC6562EFd.A05(1);
        abstractC6562EFd.A08(iconCompat);
        CharSequence charSequence = remoteActionCompat.A03;
        abstractC6562EFd.A05(2);
        Parcel parcel = ((C6563EFe) abstractC6562EFd).A05;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.A02;
        abstractC6562EFd.A05(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        abstractC6562EFd.A07(remoteActionCompat.A00, 4);
        boolean z = remoteActionCompat.A04;
        abstractC6562EFd.A05(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.A05;
        abstractC6562EFd.A05(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
