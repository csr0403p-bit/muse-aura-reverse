package X;

import android.os.Parcel;

/* renamed from: X.CKq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractRunnableC3407CKq implements Runnable {
    public static final String __redex_internal_original_name = "zzv";
    public final CSE A00;

    public static Parcel A00() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        parcelObtain.writeString("com.facebook.aura");
        return parcelObtain;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractRunnableC3407CKq.run():void");
    }

    public AbstractRunnableC3407CKq(CSE cse) {
        this.A00 = cse;
    }

    public AbstractRunnableC3407CKq() {
        this.A00 = null;
    }
}
