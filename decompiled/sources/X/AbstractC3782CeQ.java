package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.os.Parcel;
import android.text.TextUtils;
import com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.common.moduleinstall.internal.zat;
import com.google.android.gms.internal.base.zaa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

/* renamed from: X.CeQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3782CeQ {
    public static final Feature A00;
    public static final Feature A01;
    public static final Feature A02;
    public static final Feature A03;
    public static final Feature A04;
    public static final Feature A05;
    public static final Feature A06;
    public static final Feature A07;
    public static final Feature A08;
    public static final Feature A09;
    public static final C3772CeF A0A;
    public static final Feature[] A0B = new Feature[0];
    public static final C3772CeF A0C;

    static {
        Feature featureA03 = AbstractSafeParcelable.A03("vision.barcode", 1L);
        A00 = featureA03;
        Feature featureA032 = AbstractSafeParcelable.A03("vision.custom.ica", 1L);
        A01 = featureA032;
        Feature featureA033 = AbstractSafeParcelable.A03("vision.face", 1L);
        A02 = featureA033;
        Feature featureA034 = AbstractSafeParcelable.A03("vision.ica", 1L);
        A03 = featureA034;
        Feature featureA035 = AbstractSafeParcelable.A03("vision.ocr", 1L);
        A07 = featureA035;
        Feature featureA036 = AbstractSafeParcelable.A03("mlkit.langid", 1L);
        A04 = featureA036;
        Feature featureA037 = AbstractSafeParcelable.A03("mlkit.nlclassifier", 1L);
        A06 = featureA037;
        Feature featureA038 = AbstractSafeParcelable.A03("tflite_dynamite", 1L);
        A09 = featureA038;
        Feature featureA039 = AbstractSafeParcelable.A03("mlkit.barcode.ui", 1L);
        A05 = featureA039;
        Feature featureA0310 = AbstractSafeParcelable.A03("mlkit.smartreply", 1L);
        A08 = featureA0310;
        C3781CeP c3781CeP = new C3781CeP();
        c3781CeP.A01("barcode", featureA03);
        c3781CeP.A01("custom_ica", featureA032);
        c3781CeP.A01("face", featureA033);
        c3781CeP.A01("ica", featureA034);
        c3781CeP.A01("ocr", featureA035);
        c3781CeP.A01("langid", featureA036);
        c3781CeP.A01("nlclassifier", featureA037);
        c3781CeP.A01("tflite_dynamite", featureA038);
        c3781CeP.A01("barcode_ui", featureA039);
        c3781CeP.A01("smart_reply", featureA0310);
        A0A = c3781CeP.A00();
        C3781CeP c3781CeP2 = new C3781CeP();
        c3781CeP2.A01("com.google.android.gms.vision.barcode", featureA03);
        c3781CeP2.A01("com.google.android.gms.vision.custom.ica", featureA032);
        c3781CeP2.A01("com.google.android.gms.vision.face", featureA033);
        c3781CeP2.A01("com.google.android.gms.vision.ica", featureA034);
        c3781CeP2.A01("com.google.android.gms.vision.ocr", featureA035);
        c3781CeP2.A01("com.google.android.gms.mlkit.langid", featureA036);
        c3781CeP2.A01("com.google.android.gms.mlkit.nlclassifier", featureA037);
        c3781CeP2.A01("com.google.android.gms.tflite_dynamite", featureA038);
        c3781CeP2.A01("com.google.android.gms.mlkit_smartreply", featureA0310);
        A0C = c3781CeP2.A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public static void A00(Context context, String str) {
        CSC cscA02;
        F0L f0l = AbstractC3777CeK.A00;
        Object[] objArr = {str};
        if (objArr[0] == null) {
            throw BV8.A0n(0);
        }
        C3776CeJ c3776CeJ = new C3776CeJ(1, objArr);
        if (GooglePlayServicesUtil.A00(context) < 221500000) {
            Intent intent = new Intent();
            intent.setClassName(AuraCredentialManagerFetchHelper.PROVIDER_PACKAGE, "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
            intent.setAction("com.google.android.gms.vision.DEPENDENCY");
            intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", c3776CeJ));
            intent.putExtra("requester_app_package", ((PackageItemInfo) context.getApplicationInfo()).packageName);
            context.sendBroadcast(intent);
            return;
        }
        C3772CeF c3772CeF = A0A;
        final Feature[] featureArr = new Feature[c3776CeJ.size()];
        for (int i = 0; i < c3776CeJ.size(); i++) {
            Object obj = c3772CeF.get(c3776CeJ.get(i));
            CRy.A03(obj);
            featureArr[i] = obj;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        arrayListA0h.add(new InterfaceC3593CWc() { // from class: X.Cbi
            @Override // X.InterfaceC3593CWc
            public final Feature[] AII() {
                C3772CeF c3772CeF2 = AbstractC3782CeQ.A0C;
                return featureArr;
            }
        });
        CRy.A08(!arrayListA0h.isEmpty(), "APIs must not be empty.");
        final C4107Cmo c4107Cmo = new C4107Cmo(context, InterfaceC3786CeU.A00, C4107Cmo.A00, C4276Cs4.A02);
        TreeSet treeSet = new TreeSet(ApiFeatureRequest.A04);
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((InterfaceC3593CWc) it.next()).AII());
        }
        final ApiFeatureRequest apiFeatureRequest = new ApiFeatureRequest(BV4.A0t(treeSet), null, null, true);
        if (apiFeatureRequest.A00.isEmpty()) {
            cscA02 = CSC.A02(new ModuleInstallResponse(0, false));
        } else {
            C4231Cqf c4231CqfA00 = C4232Cqg.A00();
            c4231CqfA00.A03 = new Feature[]{AbstractC3785CeT.A00};
            c4231CqfA00.A02 = true;
            c4231CqfA00.A00 = 27304;
            c4231CqfA00.A01 = new InterfaceC4375CuV() { // from class: X.Cmt
                @Override // X.InterfaceC4375CuV
                public final void accept(Object obj2, Object obj3) {
                    zat zatVar = new zat((CSE) obj3);
                    zaa zaaVar = (zaa) ((AbstractC4160CoH) obj2).A03();
                    ApiFeatureRequest apiFeatureRequest2 = apiFeatureRequest;
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken(zaaVar.A01);
                    parcelObtain.writeStrongBinder(zatVar.asBinder());
                    parcelObtain.writeInt(1);
                    apiFeatureRequest2.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeStrongBinder(null);
                    zaaVar.A00(parcelObtain, 2);
                }
            };
            cscA02 = AbstractC4178Com.A02(c4107Cmo, c4231CqfA00.A00(), 0);
        }
        cscA02.A0E(new CEg());
    }
}
