package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.facebook.aura.ageverification.FaceDetectionEngineKt;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.mlkit_vision_face.zza;
import com.google.android.gms.internal.mlkit_vision_face.zzoq;
import com.google.android.gms.internal.mlkit_vision_face.zzou;
import com.google.android.gms.internal.mlkit_vision_face.zzow;
import com.google.android.gms.internal.mlkit_vision_face.zzoy;
import com.google.android.gms.internal.mlkit_vision_face.zzoz;
import com.google.android.gms.internal.mlkit_vision_face.zzpb;
import com.google.mlkit.common.MlKitException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Cbl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3654Cbl implements Cc6 {
    public boolean A00;
    public zzoy A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final C3696Ccu A05;
    public final C4209CqH A06;

    private final void A00() throws DynamiteModule$LoadingException {
        CbG cbG;
        String str;
        String str2;
        IInterface zzozVar;
        zzoy zzoyVar;
        if (this.A01 == null) {
            zzou zzouVar = new zzou(0.15f, 1, 1, 1, 1, false);
            if (this.A00) {
                cbG = Cb9.A08;
                str = "com.google.mlkit.dynamite.face";
                str2 = FaceDetectionEngineKt.BUNDLED_ENGINE_CLASS;
            } else {
                cbG = Cb9.A09;
                str = "com.google.android.gms.vision.face";
                str2 = "com.google.android.gms.vision.face.mlkit.FaceDetectorCreator";
            }
            Context context = this.A04;
            IBinder iBinderA09 = Cb9.A04(context, cbG, str).A09(str2);
            if (iBinderA09 == null) {
                zzozVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinderA09.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
                zzozVar = iInterfaceQueryLocalInterface instanceof zzpb ? (zzpb) iInterfaceQueryLocalInterface : new zzoz("com.google.mlkit.vision.face.aidls.IFaceDetectorCreator", iBinderA09);
            }
            ObjectWrapper objectWrapper = new ObjectWrapper(context);
            zza zzaVar = (zza) zzozVar;
            Parcel parcelObtain = Parcel.obtain();
            zzb.A01(parcelObtain, objectWrapper, zzaVar.A00);
            parcelObtain.writeInt(1);
            zzouVar.writeToParcel(parcelObtain, 0);
            Parcel parcelA00 = zzaVar.A00(parcelObtain, 1);
            IBinder strongBinder = parcelA00.readStrongBinder();
            if (strongBinder == null) {
                zzoyVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetector");
                zzoyVar = iInterfaceQueryLocalInterface2 instanceof zzoy ? (zzoy) iInterfaceQueryLocalInterface2 : new zzoy("com.google.mlkit.vision.face.aidls.IFaceDetector", strongBinder);
            }
            parcelA00.recycle();
            this.A01 = zzoyVar;
        }
    }

    @Override // X.Cc6
    public final Pair AjD(C3665CcL c3665CcL) throws MlKitException {
        ArrayList arrayListA0h;
        if (this.A01 == null) {
            Ajc();
        }
        if (!this.A02) {
            try {
                zzoy zzoyVar = this.A01;
                if (zzoyVar != null) {
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken(zzoyVar.A00);
                    zzoyVar.A01(parcelObtain, 1);
                }
                this.A02 = true;
            } catch (RemoteException e) {
                throw new MlKitException("Failed to init face detector.", 13, e);
            }
        }
        zzoy zzoyVar2 = this.A01;
        if (zzoyVar2 != null) {
            if (c3665CcL.A03 == -1) {
                ByteBuffer byteBufferA03 = C2H.A00.A03(c3665CcL);
                int i = c3665CcL.A00;
                int i2 = c3665CcL.A01;
                int i3 = c3665CcL.A02;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                c3665CcL = new C3665CcL(byteBufferA03, i, i2, i3);
                C3665CcL.A01(17, 3, i2, i, byteBufferA03.limit(), i3, jElapsedRealtime);
            }
            zzoq zzoqVar = new zzoq(c3665CcL.A03, c3665CcL.A00, c3665CcL.A01, SystemClock.elapsedRealtime(), CbU.A00(c3665CcL.A02));
            ObjectWrapper objectWrapperA01 = CAC.A01(c3665CcL);
            try {
                Parcel parcelObtain2 = Parcel.obtain();
                zzb.A01(parcelObtain2, objectWrapperA01, zzoyVar2.A00);
                parcelObtain2.writeInt(1);
                zzoqVar.writeToParcel(parcelObtain2, 0);
                Parcel parcelA00 = zzoyVar2.A00(parcelObtain2, 3);
                ArrayList arrayListCreateTypedArrayList = parcelA00.createTypedArrayList(zzow.CREATOR);
                parcelA00.recycle();
                arrayListA0h = C3cG.A0h();
                Iterator it = arrayListCreateTypedArrayList.iterator();
                while (it.hasNext()) {
                    arrayListA0h.add(new C4208CqE((zzow) it.next()));
                }
                Iterator it2 = arrayListA0h.iterator();
                while (it2.hasNext()) {
                    ((C4208CqE) it2.next()).A00 = -1;
                }
            } catch (RemoteException e2) {
                throw new MlKitException("Failed to run face detector.", 13, e2);
            }
        } else {
            arrayListA0h = null;
        }
        return BV4.A0A(arrayListA0h, null);
    }

    @Override // X.Cc6
    public final void AjR() {
        try {
            zzoy zzoyVar = this.A01;
            if (zzoyVar != null) {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(zzoyVar.A00);
                zzoyVar.A01(parcelObtain, 2);
                this.A01 = null;
            }
        } catch (RemoteException e) {
            Log.e("DecoupledFaceDelegate", "Failed to release face detector.", e);
        }
        this.A02 = false;
    }

    @Override // X.Cc6
    public final boolean Ajc() throws MlKitException {
        if (this.A01 == null) {
            Context context = this.A04;
            if (Cb9.A00(context, "com.google.mlkit.dynamite.face") > 0) {
                this.A00 = true;
                try {
                    A00();
                } catch (RemoteException e) {
                    throw new MlKitException("Failed to create thick face detector.", 13, e);
                } catch (DynamiteModule$LoadingException e2) {
                    throw new MlKitException("Failed to load the bundled face module.", 13, e2);
                }
            } else {
                this.A00 = false;
                try {
                    A00();
                } catch (RemoteException e3) {
                    Cbw.A01(EnumC10409Hbg.A02, this.A05, this.A00);
                    throw new MlKitException("Failed to create thin face detector.", 13, e3);
                } catch (DynamiteModule$LoadingException e4) {
                    if (!this.A03) {
                        AbstractC3782CeQ.A00(context, "face");
                        this.A03 = true;
                    }
                    Cbw.A01(EnumC10409Hbg.A01, this.A05, this.A00);
                    throw new MlKitException("Waiting for the face module to be downloaded. Please wait.", 14, e4);
                }
            }
            Cbw.A01(EnumC10409Hbg.A04, this.A05, this.A00);
        }
        return this.A00;
    }

    public C3654Cbl(Context context, C3696Ccu c3696Ccu, C4209CqH c4209CqH) {
        this.A04 = context;
        this.A06 = c4209CqH;
        this.A05 = c3696Ccu;
    }
}
