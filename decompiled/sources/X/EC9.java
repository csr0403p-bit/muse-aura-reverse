package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.util.Xml;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import com.facebook.aura.maps.scene.HatchMapThemeKt;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes5.dex */
public abstract class EC9 {
    public static int A00 = -100;
    public static C7528Ezc A02;
    public static C7528Ezc A03;
    public static Boolean A04;
    public static boolean A05;
    public static ECC A01 = new ECC(new Bpn());
    public static final Ao0<WeakReference<EC9>> A06 = new Ao0<>(0);
    public static final Object A07 = C3cG.A0T();
    public static final Object A08 = C3cG.A0T();

    public abstract AbstractC8280Fb4 A0I(InterfaceC8306FbY interfaceC8306FbY);

    public abstract void A0J();

    public abstract void A0K();

    public abstract void A0L();

    public abstract void A0M();

    public abstract void A0N(CharSequence charSequence);

    public abstract boolean A0O(int i);

    public static Object A00() {
        Context context;
        Iterator<WeakReference<EC9>> it = A06.iterator();
        while (it.hasNext()) {
            EC9 ec9 = it.next().get();
            if (ec9 != null && (context = ((LayoutInflaterFactory2C8250FaT) ec9).A0k) != null) {
                return context.getSystemService(HatchMapThemeKt.PARAM_LOCALE);
            }
        }
        return null;
    }

    public static /* synthetic */ void A02(Context context) {
        C7528Ezc c7528Ezc;
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                Object objA00 = A00();
                if (objA00 != null) {
                    LocaleList localeListA00 = ECH.A00(objA00);
                    C7528Ezc c7528Ezc2 = C7528Ezc.A01;
                    c7528Ezc = new C7528Ezc(new F2l(localeListA00));
                } else {
                    c7528Ezc = C7528Ezc.A01;
                }
                if (((F2l) c7528Ezc.A00).A00.isEmpty()) {
                    String strA00 = EC8.A00(context);
                    Object systemService = context.getSystemService(HatchMapThemeKt.PARAM_LOCALE);
                    if (systemService != null) {
                        ECH.A01(LocaleList.forLanguageTags(strA00), systemService);
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
        A05 = true;
    }

    public static void A03(EC9 ec9) {
        synchronized (A07) {
            Iterator<WeakReference<EC9>> it = A06.iterator();
            while (it.hasNext()) {
                EC9 ec92 = it.next().get();
                if (ec92 == ec9 || ec92 == null) {
                    it.remove();
                }
            }
        }
    }

    public static boolean A04(Context context) {
        if (A04 == null) {
            try {
                Bundle bundle = ((PackageItemInfo) context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), 640)).metaData;
                if (bundle != null) {
                    A04 = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                A04 = AnonymousClass001.A0h();
            }
        }
        return A04.booleanValue();
    }

    public static void A01(final Context context) {
        if (A04(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (A05) {
                    return;
                }
                A01.execute(new Runnable() { // from class: X.ECF
                    public static final String __redex_internal_original_name = "AppCompatDelegate$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        EC9.A02(context);
                    }
                });
                return;
            }
            synchronized (A08) {
                C7528Ezc c7528Ezc = A02;
                if (c7528Ezc == null) {
                    C7528Ezc c7528EzcA00 = A03;
                    if (c7528EzcA00 == null) {
                        c7528EzcA00 = C7528Ezc.A00(EC8.A00(context));
                        A03 = c7528EzcA00;
                    }
                    if (!((F2l) c7528EzcA00.A00).A00.isEmpty()) {
                        A02 = A03;
                    }
                } else if (!c7528Ezc.equals(A03)) {
                    C7528Ezc c7528Ezc2 = A02;
                    A03 = c7528Ezc2;
                    String languageTags = ((F2l) c7528Ezc2.A00).A00.toLanguageTags();
                    synchronized (EC8.A00) {
                        if (languageTags.equals("")) {
                            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                        } else {
                            try {
                                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                                try {
                                    try {
                                        xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                                        xmlSerializerNewSerializer.startDocument(HatchWebPageParserKt.UTF_8, true);
                                        xmlSerializerNewSerializer.startTag(null, "locales");
                                        xmlSerializerNewSerializer.attribute(null, "application_locales", languageTags);
                                        xmlSerializerNewSerializer.endTag(null, "locales");
                                        xmlSerializerNewSerializer.endDocument();
                                    } catch (Throwable th) {
                                        if (fileOutputStreamOpenFileOutput != null) {
                                            try {
                                                fileOutputStreamOpenFileOutput.close();
                                            } catch (IOException unused) {
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (Exception e) {
                                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e);
                                }
                                if (fileOutputStreamOpenFileOutput != null) {
                                    try {
                                        fileOutputStreamOpenFileOutput.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                            } catch (FileNotFoundException unused3) {
                                BV6.A1L("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", "AppLocalesStorageHelper", new Object[]{"androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"});
                            }
                        }
                    }
                }
            }
        }
    }
}
