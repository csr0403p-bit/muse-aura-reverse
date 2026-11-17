package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.mlkit_vision_label.zza;
import com.google.android.gms.internal.mlkit_vision_label.zzd;
import com.google.android.gms.internal.mlkit_vision_label.zze;
import com.google.android.gms.internal.mlkit_vision_label.zzg;
import com.google.android.gms.internal.mlkit_vision_label.zzh;
import com.google.android.gms.internal.mlkit_vision_label.zzj;
import com.google.android.gms.internal.mlkit_vision_label.zzl;
import com.google.mlkit.common.MlKitException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class CbR implements CcF {
    public boolean A00;
    public zzd A01;
    public final Context A02;
    public final zzj A03;
    public final String A04;

    @Override // X.CcF
    public final ArrayList AjG(C3665CcL c3665CcL) throws MlKitException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Bitmap bitmapA00;
        ByteBuffer byteBufferA01;
        byte[] bArrArray;
        if (this.A01 == null) {
            AjR();
        }
        if (this.A01 == null) {
            throw new MlKitException("Waiting for the image labeling module to be downloaded. Please wait.", 14);
        }
        int i = c3665CcL.A03;
        if (i != -1) {
            if (i == 17) {
                byteBufferA01 = c3665CcL.A06;
                CRy.A03(byteBufferA01);
            } else {
                if (i != 35) {
                    throw new MlKitException("Unsupported image format", 13);
                }
                Image.Plane[] planes = c3665CcL.A05 == null ? null : c3665CcL.A05.A00.getPlanes();
                CRy.A03(planes);
                byteBufferA01 = C2H.A01(planes, c3665CcL.A00, c3665CcL.A01);
            }
            int i2 = c3665CcL.A00;
            int i3 = c3665CcL.A01;
            int i4 = c3665CcL.A02;
            if (byteBufferA01.hasArray() && byteBufferA01.arrayOffset() == 0) {
                bArrArray = byteBufferA01.array();
            } else {
                byteBufferA01.rewind();
                int iLimit = byteBufferA01.limit();
                bArrArray = new byte[iLimit];
                byteBufferA01.get(bArrArray, 0, iLimit);
            }
            YuvImage yuvImage = new YuvImage(bArrArray, 17, i2, i3, null);
            try {
                ByteArrayOutputStream byteArrayOutputStreamA0F = BV4.A0F();
                try {
                    yuvImage.compressToJpeg(new Rect(0, 0, i2, i3), 100, byteArrayOutputStreamA0F);
                    byte[] byteArray = byteArrayOutputStreamA0F.toByteArray();
                    byteArrayOutputStreamA0F.close();
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                    bitmapA00 = C2H.A00(bitmapDecodeByteArray, i4, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStreamA0F.close();
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                Log.w("ImageConvertUtils", "Error closing ByteArrayOutputStream");
                throw new MlKitException("Image conversion error from NV21 format", 13, e);
            }
        } else {
            Bitmap bitmap = c3665CcL.A04;
            CRy.A03(bitmap);
            bitmapA00 = C2H.A00(bitmap, c3665CcL.A02, c3665CcL.A00, c3665CcL.A01);
        }
        try {
            zzd zzdVar = this.A01;
            CRy.A03(zzdVar);
            ObjectWrapper objectWrapper = new ObjectWrapper(bitmapA00);
            zzl zzlVar = new zzl(-1);
            Parcel parcelObtain = Parcel.obtain();
            zzb.A01(parcelObtain, objectWrapper, zzdVar.A00);
            parcelObtain.writeInt(1);
            zzlVar.writeToParcel(parcelObtain, 0);
            Parcel parcelA00 = zzdVar.A00(parcelObtain, 1);
            zzh[] zzhVarArr = (zzh[]) parcelA00.createTypedArray(zzh.CREATOR);
            parcelA00.recycle();
            ArrayList arrayListA0h = C3cG.A0h();
            for (zzh zzhVar : zzhVarArr) {
                arrayListA0h.add(new CS5(zzhVar.A03, zzhVar.A02, zzhVar.A00, zzhVar.A01));
            }
            return arrayListA0h;
        } catch (RemoteException e2) {
            throw new MlKitException("Failed to run legacy image labeler.", 13, e2);
        }
    }

    @Override // X.CcF
    public final void AjR() throws MlKitException {
        IInterface zzeVar;
        zzd zzdVar;
        Log.d("LegacyLabelDelegate", "Try to load legacy label module.");
        if (this.A01 == null) {
            try {
                Context context = this.A02;
                IBinder iBinderA09 = Cb9.A04(context, Cb9.A09, this.A04).A09("com.google.android.gms.vision.label.ChimeraNativeImageLabelerCreator");
                if (iBinderA09 == null) {
                    zzeVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderA09.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator");
                    zzeVar = iInterfaceQueryLocalInterface instanceof zzg ? (zzg) iInterfaceQueryLocalInterface : new zze("com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator", iBinderA09);
                }
                ObjectWrapper objectWrapper = new ObjectWrapper(context);
                zzj zzjVar = this.A03;
                zza zzaVar = (zza) zzeVar;
                Parcel parcelObtain = Parcel.obtain();
                zzb.A01(parcelObtain, objectWrapper, zzaVar.A00);
                parcelObtain.writeInt(1);
                zzjVar.writeToParcel(parcelObtain, 0);
                Parcel parcelA00 = zzaVar.A00(parcelObtain, 1);
                IBinder strongBinder = parcelA00.readStrongBinder();
                if (strongBinder == null) {
                    zzdVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabeler");
                    zzdVar = iInterfaceQueryLocalInterface2 instanceof zzd ? (zzd) iInterfaceQueryLocalInterface2 : new zzd("com.google.android.gms.vision.label.internal.client.INativeImageLabeler", strongBinder);
                }
                parcelA00.recycle();
                this.A01 = zzdVar;
                if (zzdVar != null || this.A00) {
                    return;
                }
                Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
                AbstractC3782CeQ.A00(context, "ica");
                this.A00 = true;
            } catch (RemoteException e) {
                throw new MlKitException("Failed to create legacy image labeler.", 13, e);
            } catch (DynamiteModule$LoadingException e2) {
                if (this.A04.equals("com.google.android.gms.vision.dynamite")) {
                    throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e2);
                }
                if (this.A00) {
                    return;
                }
                Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
                AbstractC3782CeQ.A00(this.A02, "ica");
                this.A00 = true;
            }
        }
    }

    @Override // X.CcF
    public final void AjV() {
        zzd zzdVar = this.A01;
        if (zzdVar != null) {
            try {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(zzdVar.A00);
                zzdVar.A01(parcelObtain, 2);
            } catch (RemoteException e) {
                Log.e("LegacyLabelDelegate", "Failed to release legacy image labeler.", e);
            }
            this.A01 = null;
        }
    }

    public CbR(Context context) {
        this.A02 = context;
        zzj zzjVar = new zzj();
        zzjVar.A01 = 1;
        zzjVar.A02 = -1;
        zzjVar.A00 = 0.6f;
        zzjVar.A03 = 1;
        this.A03 = zzjVar;
        this.A04 = GooglePlayServicesUtil.A00(context) >= 200400000 ? "com.google.android.gms.vision.ica" : "com.google.android.gms.vision.dynamite";
    }
}
