package com.google.firebase;

import X.AbstractC3533CSo;
import X.AbstractC3568CUn;
import X.C3560CUd;
import X.C3565CUi;
import X.C3566CUj;
import X.C3cG;
import X.C7448EwK;
import X.CSj;
import X.CUY;
import X.InterfaceC3564CUh;
import X.InterfaceC3574CUu;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;LX/CUu<Landroid/content/Context;>;)LX/CUi<*>; */
    public static C3565CUi A00(final InterfaceC3574CUu interfaceC3574CUu, final String str) {
        C3566CUj c3566CUjA00 = C3566CUj.A00(AbstractC3533CSo.class);
        c3566CUjA00.A01 = 1;
        C3566CUj.A02(c3566CUjA00, Context.class, 1);
        return C3566CUj.A01(c3566CUjA00, new CUY(interfaceC3574CUu, str) { // from class: X.CUp
            public final InterfaceC3574CUu A00;
            public final String A01;

            @Override // X.CUY
            public final Object A7X(CUL cul) {
                return new C3529CSk(this.A01, this.A00.ABH(cul.A02(Context.class)));
            }

            {
                this.A01 = str;
                this.A00 = interfaceC3574CUu;
            }
        });
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<C3565CUi<?>> getComponents() {
        String string;
        ArrayList arrayListA0h = C3cG.A0h();
        C3566CUj c3566CUjA00 = C3566CUj.A00(CSj.class);
        C3566CUj.A02(c3566CUjA00, AbstractC3533CSo.class, 2);
        arrayListA0h.add(C3566CUj.A01(c3566CUjA00, new CUY() { // from class: X.CSm
            @Override // X.CUY
            public final Object A7X(CUL cul) {
                Set setA03 = cul.A03(AbstractC3533CSo.class);
                C3530CSl c3530CSl = C3530CSl.A01;
                if (c3530CSl == null) {
                    synchronized (C3530CSl.class) {
                        c3530CSl = C3530CSl.A01;
                        if (c3530CSl == null) {
                            c3530CSl = new C3530CSl();
                            C3530CSl.A01 = c3530CSl;
                        }
                    }
                }
                return new CSj(c3530CSl, setA03);
            }
        }));
        C3566CUj c3566CUjA002 = C3566CUj.A00(C3560CUd.class);
        C3566CUj.A02(c3566CUjA002, Context.class, 1);
        C3566CUj.A02(c3566CUjA002, InterfaceC3564CUh.class, 2);
        arrayListA0h.add(C3566CUj.A01(c3566CUjA002, new CUY() { // from class: X.CUe
            @Override // X.CUY
            public final Object A7X(CUL cul) {
                return new C3560CUd((Context) cul.A02(Context.class), cul.A03(InterfaceC3564CUh.class));
            }
        }));
        arrayListA0h.add(AbstractC3568CUn.A00("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayListA0h.add(AbstractC3568CUn.A00("fire-core", "19.5.0"));
        arrayListA0h.add(AbstractC3568CUn.A00("device-name", Build.PRODUCT.replace(' ', '_').replace('/', '_')));
        arrayListA0h.add(AbstractC3568CUn.A00("device-model", Build.DEVICE.replace(' ', '_').replace('/', '_')));
        arrayListA0h.add(AbstractC3568CUn.A00("device-brand", Build.BRAND.replace(' ', '_').replace('/', '_')));
        arrayListA0h.add(A00(new InterfaceC3574CUu() { // from class: X.CUr
            @Override // X.InterfaceC3574CUu
            public final String ABH(Object obj) {
                ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
            }
        }, "android-target-sdk"));
        arrayListA0h.add(A00(new InterfaceC3574CUu() { // from class: X.CUt
            @Override // X.InterfaceC3574CUu
            public final String ABH(Object obj) {
                ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
            }
        }, "android-min-sdk"));
        arrayListA0h.add(A00(new InterfaceC3574CUu() { // from class: X.CUq
            @Override // X.InterfaceC3574CUu
            public final String ABH(Object obj) {
                Context context = (Context) obj;
                return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
            }
        }, "android-platform"));
        arrayListA0h.add(A00(new InterfaceC3574CUu() { // from class: X.CUo
            @Override // X.InterfaceC3574CUu
            public final String ABH(Object obj) {
                Context context = (Context) obj;
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                return installerPackageName != null ? installerPackageName.replace(' ', '_').replace('/', '_') : "";
            }
        }, "android-installer"));
        try {
            string = C7448EwK.A00.toString();
        } catch (NoClassDefFoundError unused) {
            string = null;
        }
        if (string != null) {
            arrayListA0h.add(AbstractC3568CUn.A00("kotlin", string));
        }
        return arrayListA0h;
    }
}
