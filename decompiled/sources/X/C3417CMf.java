package X;

import android.content.Context;
import android.util.Pair;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.io.File;
import java.util.Map;

/* renamed from: X.CMf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3417CMf implements InterfaceC3421CMj {
    public static C3417CMf A03;
    public static final C3418CMg A04 = new C3418CMg();
    public String A00;
    public final Context A01;
    public final File A02;

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Ljava/io/File; */
    @Override // X.InterfaceC3421CMj
    public final File A7m(Map map, int i) {
        String str;
        File externalCacheDir;
        String str2;
        switch (i) {
            case 114712842:
                str = "lib-compressed";
                break;
            case 157877869:
                str = "app_secure_shared";
                break;
            case 172453231:
                str = "app_errorreporting";
                break;
            case 189418750:
                str = "files/ExoPlayerCacheDir";
                break;
            case 194178138:
                str = "app_sigquit";
                break;
            case 211429074:
                str = "modules";
                break;
            case 269765033:
                str = "files/pushinfra_hpke_storage";
                break;
            case 345253467:
                str = "app_optsvc_analytics";
                break;
            case 594169501:
                str = "cache/fb_temp_scoped";
                break;
            case 709674273:
                str = "app_graphservice";
                break;
            case 713759422:
                str = "cache/android_shared_bloks_entrypoints_templates_sessionless";
                break;
            case 1045170971:
                str = "app_qpl";
                break;
            case 1108757295:
                str = "files/GkBootstrap";
                break;
            case 1239662554:
                str = "app_light_prefs";
                break;
            case 1377433890:
                str = "cache/secure_shared";
                break;
            case 1404562392:
                str = "app_file_poolreports";
                break;
            case 1543572765:
                str = "app_analytics";
                break;
            case 1643085664:
                str = "cache/bloks_entrypoints_shared_templates_session_scoped";
                break;
            case 1672668047:
                str = "files/secure_shared";
                break;
            case 1684905197:
                str = "app_ras_blobs";
                break;
            case 1874789883:
                str = "app_minidumps";
                break;
            case 2004344551:
                str = "app_file_poolcollector";
                break;
            case 2067530457:
                str = "cache/ExoPlayerCacheDir";
                break;
            case 2101388817:
                str = "app_fb-forker-tmp";
                break;
            default:
                str = null;
                break;
        }
        Pair pairA0A = BV4.A0A(0, str);
        String strA0z = "__scope__";
        if (i != 594169501 && i != 1643085664) {
            strA0z = null;
        }
        if (strA0z == null || strA0z.length() == 0) {
            strA0z = null;
        } else {
            String[] strArr = AbstractC3420CMi.A00;
            int i2 = 0;
            do {
                String str3 = strArr[i2];
                if (strA0z != null && C7BY.A0q(strA0z, str3, false) && (str2 = (String) map.get(str3)) != null && str2.length() != 0) {
                    strA0z = AbstractC2159Azp.A0z(strA0z, str3, str2);
                }
                i2++;
            } while (i2 < 3);
        }
        Object obj = pairA0A.first;
        Object objA1M = pairA0A.second;
        if (strA0z != null) {
            objA1M = C60P.A1M(CustomConnectorRegisterRepositoryKt.ROOT_PATH, strA0z, BV5.A0q(objA1M));
        }
        Pair pairA0A2 = BV4.A0A(obj, objA1M);
        Object obj2 = pairA0A2.first;
        C7384Etj.A0T(obj2);
        switch (AnonymousClass001.A0F(obj2)) {
            case -1:
                throw C3cG.A0Q("Invalid source path");
            case 0:
            case 1:
                externalCacheDir = this.A02;
                break;
            case 2:
                externalCacheDir = this.A01.getFilesDir();
                break;
            case 3:
                externalCacheDir = this.A01.getCacheDir();
                break;
            case 4:
                externalCacheDir = this.A01.getExternalFilesDir(null);
                break;
            case 5:
                externalCacheDir = this.A01.getExternalCacheDir();
                break;
            default:
                throw C60O.A0i("Cask path factory cannot handle this location");
        }
        if (externalCacheDir == null) {
            Object[] objArr = {pairA0A2.first, pairA0A2.second};
            CFL cfl = AbstractC3422CMk.A00;
            if (CFL.A02(cfl)) {
                cfl.e("PathFactory", C7384Etj.A0K("createRootPathFromType returned null for location=%d path=%s", objArr, 2));
            }
            String strA0k = this.A00;
            if (strA0k == null) {
                strA0k = AnonymousClass002.A0k();
            }
            this.A00 = strA0k;
            externalCacheDir = BV5.A0L("cache/tmp_invalid_path/", strA0k, this.A02);
        }
        Number number = (Number) pairA0A2.first;
        if (number != null) {
            int iIntValue = number.intValue();
            if (iIntValue == 1) {
                return C3cG.A0O(this.A02, AnonymousClass007.A0a("app_", pairA0A2.second));
            }
            if (iIntValue == 0 || iIntValue == 2 || iIntValue == 3 || iIntValue == 4 || iIntValue == 5) {
                return C3cG.A0O(externalCacheDir, (String) pairA0A2.second);
            }
        }
        throw BV5.A0O(pairA0A2.second, "Cask path factory cannot handle this location = ");
    }

    public C3417CMf(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            AbstractC3422CMk.A06("PathFactory", "applicationContext was null; falling back to provided context on thread=%s", Thread.currentThread().getName());
            applicationContext = context;
        }
        this.A01 = applicationContext;
        this.A02 = C3418CMg.A00(context);
    }
}
