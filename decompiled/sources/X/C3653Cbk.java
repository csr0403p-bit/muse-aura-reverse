package X;

import android.content.Context;
import android.media.Image;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.mlkit_vision_face.zza;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzh;
import com.google.android.gms.internal.mlkit_vision_face.zzj;
import com.google.android.gms.internal.mlkit_vision_face.zzk;
import com.google.android.gms.internal.mlkit_vision_face.zzm;
import com.google.android.gms.internal.mlkit_vision_face.zzp;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Cbk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3653Cbk implements Cc6 {
    public zzj A00;
    public boolean A01;
    public final int A02;
    public final Context A03;
    public final C3696Ccu A04;
    public final C4209CqH A05;

    @Override // X.Cc6
    public final Pair AjD(C3665CcL c3665CcL) throws MlKitException {
        zzf[] zzfVarArr;
        if (this.A00 == null) {
            Ajc();
        }
        zzj zzjVar = this.A00;
        if (zzjVar == null) {
            throw new MlKitException("Waiting for the face detection module to be downloaded. Please wait.", 14);
        }
        try {
            int i = c3665CcL.A00;
            int i2 = c3665CcL.A01;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int iA00 = CbU.A00(c3665CcL.A02);
            zzp zzpVar = new zzp();
            zzpVar.A00 = i;
            zzpVar.A01 = i2;
            zzpVar.A02 = 0;
            zzpVar.A04 = jElapsedRealtime;
            zzpVar.A03 = iA00;
            if (c3665CcL.A03 != 35 || this.A02 < 201500000) {
                ObjectWrapper objectWrapper = new ObjectWrapper(C2H.A00.A03(c3665CcL));
                Parcel parcelObtain = Parcel.obtain();
                zzb.A01(parcelObtain, objectWrapper, zzjVar.A00);
                parcelObtain.writeInt(1);
                zzpVar.writeToParcel(parcelObtain, 0);
                Parcel parcelA00 = zzjVar.A00(parcelObtain, 1);
                zzfVarArr = (zzf[]) parcelA00.createTypedArray(zzf.CREATOR);
                parcelA00.recycle();
            } else {
                Image.Plane[] planes = c3665CcL.A05 == null ? null : c3665CcL.A05.A00.getPlanes();
                CRy.A03(planes);
                ObjectWrapper objectWrapper2 = new ObjectWrapper(planes[0].getBuffer());
                ObjectWrapper objectWrapper3 = new ObjectWrapper(planes[1].getBuffer());
                ObjectWrapper objectWrapper4 = new ObjectWrapper(planes[2].getBuffer());
                int pixelStride = planes[0].getPixelStride();
                int pixelStride2 = planes[1].getPixelStride();
                int pixelStride3 = planes[2].getPixelStride();
                int rowStride = planes[0].getRowStride();
                int rowStride2 = planes[1].getRowStride();
                int rowStride3 = planes[2].getRowStride();
                Parcel parcelObtain2 = Parcel.obtain();
                zzb.A01(parcelObtain2, objectWrapper2, zzjVar.A00);
                parcelObtain2.writeStrongBinder(objectWrapper3.asBinder());
                parcelObtain2.writeStrongBinder(objectWrapper4.asBinder());
                parcelObtain2.writeInt(pixelStride);
                parcelObtain2.writeInt(pixelStride2);
                parcelObtain2.writeInt(pixelStride3);
                parcelObtain2.writeInt(rowStride);
                parcelObtain2.writeInt(rowStride2);
                parcelObtain2.writeInt(rowStride3);
                parcelObtain2.writeInt(1);
                zzpVar.writeToParcel(parcelObtain2, 0);
                Parcel parcelA002 = zzjVar.A00(parcelObtain2, 4);
                zzfVarArr = (zzf[]) parcelA002.createTypedArray(zzf.CREATOR);
                parcelA002.recycle();
            }
            ArrayList arrayListA0h = C3cG.A0h();
            for (zzf zzfVar : zzfVarArr) {
                arrayListA0h.add(new C4208CqE(zzfVar));
            }
            Iterator it = arrayListA0h.iterator();
            while (it.hasNext()) {
                ((C4208CqE) it.next()).A00 = -1;
            }
            return BV4.A0A(arrayListA0h, null);
        } catch (RemoteException e) {
            throw new MlKitException("Failed to detect with legacy face detector", 13, e);
        }
    }

    @Override // X.Cc6
    public final void AjR() {
        zzj zzjVar = this.A00;
        if (zzjVar != null) {
            try {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(zzjVar.A00);
                zzjVar.A01(parcelObtain, 3);
            } catch (RemoteException e) {
                Log.e("LegacyFaceDelegate", "Failed to release legacy face detector.", e);
            }
            this.A00 = null;
        }
    }

    @Override // X.Cc6
    public final boolean Ajc() throws MlKitException {
        IInterface zzkVar;
        if (this.A00 == null) {
            try {
                Context context = this.A03;
                IBinder iBinderA09 = Cb9.A04(context, Cb9.A09, "com.google.android.gms.vision.dynamite").A09("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator");
                if (iBinderA09 == null) {
                    zzkVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderA09.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                    zzkVar = iInterfaceQueryLocalInterface instanceof zzm ? (zzm) iInterfaceQueryLocalInterface : new zzk("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator", iBinderA09);
                }
                ObjectWrapper objectWrapper = new ObjectWrapper(context);
                zzj zzjVar = this.A00;
                if (zzjVar == null) {
                    zzh zzhVar = new zzh();
                    zzhVar.A01 = 0;
                    zzhVar.A02 = 0;
                    zzhVar.A03 = 0;
                    zzhVar.A04 = false;
                    zzhVar.A05 = false;
                    zzhVar.A00 = 0.15f;
                    zza zzaVar = (zza) zzkVar;
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken(zzaVar.A00);
                    parcelObtain.writeStrongBinder(objectWrapper.asBinder());
                    parcelObtain.writeInt(1);
                    zzhVar.writeToParcel(parcelObtain, 0);
                    Parcel parcelA00 = zzaVar.A00(parcelObtain, 1);
                    IBinder strongBinder = parcelA00.readStrongBinder();
                    if (strongBinder == null) {
                        zzjVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
                        zzjVar = iInterfaceQueryLocalInterface2 instanceof zzj ? (zzj) iInterfaceQueryLocalInterface2 : new zzj("com.google.android.gms.vision.face.internal.client.INativeFaceDetector", strongBinder);
                    }
                    parcelA00.recycle();
                    this.A00 = zzjVar;
                }
                if (zzjVar == null && !this.A01) {
                    Log.d("LegacyFaceDelegate", "Request face optional module download.");
                    AbstractC3782CeQ.A00(context, "barcode");
                    this.A01 = true;
                }
                Cbw.A01(EnumC10409Hbg.A04, this.A04, false);
            } catch (RemoteException e) {
                throw new MlKitException("Failed to create legacy face detector.", 13, e);
            } catch (DynamiteModule$LoadingException e2) {
                throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e2);
            }
        }
        return false;
    }

    public C3653Cbk(Context context, C3696Ccu c3696Ccu, C4209CqH c4209CqH) {
        this.A03 = context;
        this.A05 = c4209CqH;
        this.A02 = GooglePlayServicesUtil.A00(context);
        this.A04 = c3696Ccu;
    }
}
