package androidx.core.content;

import X.AnonymousClass007;
import X.BV4;
import X.BV6;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C8j3;
import X.F2D;
import X.F2R;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public class FileProvider extends ContentProvider {
    public F2R A00;
    public String A01;
    public final int A02;
    public final Object A03;
    public static final String[] A06 = {"_display_name", "_size"};
    public static final File A04 = BV4.A0G(CustomConnectorRegisterRepositoryKt.ROOT_PATH);
    public static final HashMap<String, F2R> A05 = BV4.A0u();

    private F2R A00() {
        F2R f2rA01;
        synchronized (this.A03) {
            if (this.A01 == null) {
                throw BV4.A0a("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
            }
            f2rA01 = this.A00;
            if (f2rA01 == null) {
                f2rA01 = A01(getContext(), this.A01, this.A02);
                this.A00 = f2rA01;
            }
        }
        return f2rA01;
    }

    public static F2R A01(Context context, String str, int i) {
        File fileA0O;
        File[] externalFilesDirs;
        F2R f2r;
        HashMap<String, F2R> map = A05;
        synchronized (map) {
            F2R f2r2 = map.get(str);
            f2r = f2r2;
            if (f2r2 == null) {
                try {
                    try {
                        F2D f2d = new F2D(str);
                        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
                        if (providerInfoResolveContentProvider == null) {
                            throw C60Q.A0U("Couldn't find meta-data for provider with authority ", str);
                        }
                        if (((PackageItemInfo) providerInfoResolveContentProvider).metaData == null && i != 0) {
                            Bundle bundle = new Bundle(1);
                            ((PackageItemInfo) providerInfoResolveContentProvider).metaData = bundle;
                            bundle.putInt("android.support.FILE_PROVIDER_PATHS", i);
                        }
                        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
                        if (xmlResourceParserLoadXmlMetaData != null) {
                            while (true) {
                                int next = xmlResourceParserLoadXmlMetaData.next();
                                if (next == 1) {
                                    map.put(str, f2d);
                                    f2r = f2d;
                                    break;
                                }
                                if (next == 2) {
                                    String name = xmlResourceParserLoadXmlMetaData.getName();
                                    String attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "name");
                                    String attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "path");
                                    if ("root-path".equals(name)) {
                                        fileA0O = A04;
                                    } else if ("files-path".equals(name)) {
                                        fileA0O = context.getFilesDir();
                                    } else if ("cache-path".equals(name)) {
                                        fileA0O = context.getCacheDir();
                                    } else if ("external-path".equals(name)) {
                                        fileA0O = Environment.getExternalStorageDirectory();
                                    } else {
                                        if ("external-files-path".equals(name)) {
                                            externalFilesDirs = context.getExternalFilesDirs(null);
                                        } else if ("external-cache-path".equals(name)) {
                                            externalFilesDirs = context.getExternalCacheDirs();
                                        } else if ("external-media-path".equals(name)) {
                                            externalFilesDirs = context.getExternalMediaDirs();
                                        } else {
                                            continue;
                                        }
                                        if (externalFilesDirs.length > 0) {
                                            fileA0O = externalFilesDirs[0];
                                        } else {
                                            continue;
                                        }
                                    }
                                    if (fileA0O == null) {
                                        continue;
                                    } else {
                                        String str2 = new String[]{attributeValue2}[0];
                                        if (str2 != null) {
                                            fileA0O = C3cG.A0O(fileA0O, str2);
                                        }
                                        if (TextUtils.isEmpty(attributeValue)) {
                                            throw C60O.A0i("Name must not be empty");
                                        }
                                        try {
                                            f2d.A01.put(attributeValue, fileA0O.getCanonicalFile());
                                        } catch (IOException e) {
                                            throw BV4.A0Q(AnonymousClass007.A0a("Failed to resolve canonical path for ", fileA0O), e);
                                        }
                                    }
                                }
                            }
                        } else {
                            throw C60O.A0i("Missing android.support.FILE_PROVIDER_PATHS meta-data");
                        }
                    } catch (XmlPullParserException e2) {
                        throw BV4.A0Q("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                    }
                } catch (IOException e3) {
                    throw BV4.A0Q("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                }
            }
        }
        return f2r;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw C8j3.A18("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw C8j3.A18("No external updates");
    }

    public FileProvider(int i) {
        this.A03 = C3cG.A0T();
        this.A02 = i;
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (((ComponentInfo) providerInfo).exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority;
        if (str == null || C60Q.A1V(str)) {
            throw new SecurityException("Provider must have a non-empty authority");
        }
        String str2 = str.split(";")[0];
        synchronized (this.A03) {
            this.A01 = str2;
        }
        HashMap<String, F2R> map = A05;
        synchronized (map) {
            map.remove(str2);
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return A00().AFc(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        File fileAFc = A00().AFc(uri);
        int iA0B = BV6.A0B(fileAFc.getName());
        if (iA0B < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(BV4.A0g(iA0B, fileAFc.getName()));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File fileAFc = A00().AFc(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                throw C60Q.A0U("Invalid mode: ", str);
            }
            i = 1006632960;
        }
        return ParcelFileDescriptor.open(fileAFc, i);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        Object objValueOf;
        File fileAFc = A00().AFc(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = A06;
        }
        int length = strArr.length;
        String[] strArr3 = new String[length];
        Object[] objArr = new Object[length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objValueOf = queryParameter == null ? fileAFc.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objValueOf = Long.valueOf(fileAFc.length());
            }
            objArr[i2] = objValueOf;
            i2 = i;
        }
        String[] strArr4 = new String[i2];
        System.arraycopy(strArr3, 0, strArr4, 0, i2);
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    public FileProvider() {
        this(0);
    }
}
