package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentProvider;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import com.facebook.systrace.Systrace;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import libraries.accessv2.src.provider.AccessLibraryContentProvider;

/* loaded from: classes5.dex */
public abstract class EHQ extends ContentProvider {
    public final AtomicBoolean A00 = new AtomicBoolean();
    public final EHT A01 = new EHT(this);

    public static final boolean A04(Context context, EHc eHc) throws NoSuchAlgorithmException {
        C7mA c7mA;
        C7381Etf c7381EtfA00;
        C7384Etj.A0Y(eHc, 1);
        if (eHc.equals(EHY.A00)) {
            c7mA = new C7mA();
            HashSet hashSetA13 = C60O.A13();
            hashSetA13.add(AbstractC06987ml.A01(context, context.getPackageName()));
            c7381EtfA00 = C7mB.A02(Collections.unmodifiableSet(hashSetA13));
        } else {
            if (!eHc.equals(EHZ.A00)) {
                if (eHc.equals(EHX.A00)) {
                    return true;
                }
                throw C3cG.A0q();
            }
            c7mA = new C7mA();
            c7381EtfA00 = C7mB.A00("*|all_packages|*", AbstractC10402HbJ.A0o);
        }
        c7mA.A01 = c7381EtfA00;
        try {
            C06977mk.A00(context, null, c7mA.A00());
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.AbstractCollection, java.util.ArrayList, java.util.List] */
    private final MatrixCursor A05(Uri uri) {
        Object next;
        String str;
        Ey9<EP1> ey9;
        String userData;
        if (!"/accounts".equals(uri.getPath())) {
            return new MatrixCursor(new String[0]);
        }
        MatrixCursor matrixCursor = new MatrixCursor(AccessLibraryContentProvider.A02);
        String queryParameter = uri.getQueryParameter("app_source");
        Iterator it = EP0.A05.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((EP0) next).name().equals(queryParameter)) {
                break;
            }
        }
        EP0 ep0 = (EP0) next;
        if (ep0 == null || (str = ep0.accountManagerType) == null) {
            return matrixCursor;
        }
        String queryParameter2 = uri.getQueryParameter("credential_source");
        if (queryParameter2 != null) {
            List listA0e = C7BY.A0e(queryParameter2, ",");
            ?? A0h = C3cG.A0h();
            Iterator it2 = listA0e.iterator();
            while (it2.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it2);
                Iterator it3 = EP1.A01.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Object next2 = it3.next();
                        if (((EP1) next2).name().equals(AnonymousClass002.A0l(strA0j))) {
                            if (next2 != null) {
                                A0h.add(next2);
                            }
                        }
                    }
                }
            }
            boolean zIsEmpty = A0h.isEmpty();
            ey9 = A0h;
            if (zIsEmpty) {
                return matrixCursor;
            }
        } else {
            ey9 = EP1.A01;
        }
        Context context = getContext();
        if (context == null) {
            return matrixCursor;
        }
        AccountManager accountManager = AccountManager.get(context);
        Account[] accountsByType = accountManager.getAccountsByType(str);
        C7384Etj.A0U(accountsByType);
        for (Account account : accountsByType) {
            String userData2 = accountManager.getUserData(account, "sso_settings_v2");
            String userData3 = accountManager.getUserData(account, "persisted_ts");
            for (EP1 ep1 : ey9) {
                String strA0p = C60O.A0p(ep1, ep0.credentialKeys);
                if (strA0p != null && (userData = accountManager.getUserData(account, strA0p)) != null) {
                    matrixCursor.addRow(new String[]{ep1.name(), userData, userData2, userData3});
                }
            }
        }
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final ContentProviderResult[] applyBatch(ArrayList<ContentProviderOperation> arrayList) {
        C7384Etj.A0Y(arrayList, 0);
        A02("applyBatch");
        A03("applyBatch");
        try {
            A01();
            ContentProviderResult[] contentProviderResultArrApplyBatch = super.applyBatch(arrayList);
            C7384Etj.A0U(contentProviderResultArrApplyBatch);
            return contentProviderResultArrApplyBatch;
        } finally {
            Systrace.A03(512L);
        }
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        C7384Etj.A0Y(str, 0);
        A02("call");
        A03("call");
        try {
            A01();
            return null;
        } finally {
            Systrace.A03(512L);
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        C7384Etj.A0Y(uri, 0);
        A02("delete");
        A03("delete");
        try {
            A01();
            throw C8j3.A17();
        } catch (Throwable th) {
            Systrace.A03(512L);
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        C7384Etj.A0Y(uri, 0);
        A02("getType");
        A03("getType");
        try {
            A00();
            throw C8j3.A17();
        } catch (Throwable th) {
            Systrace.A03(512L);
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        C7384Etj.A0Y(uri, 0);
        A02("insert");
        A03("insert");
        try {
            A01();
            throw C8j3.A17();
        } catch (Throwable th) {
            Systrace.A03(512L);
            throw th;
        }
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C7384Etj.A0Y(configuration, 0);
        A02("onConfigurationChanged");
        try {
            if (this.A00.get()) {
                super.onConfigurationChanged(configuration);
            }
        } finally {
            Systrace.A03(512L);
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C7384Etj.A0Y(uri, 0);
        A02("query");
        A03("query");
        try {
            A00();
            return A05(uri);
        } finally {
            Systrace.A03(512L);
        }
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C7384Etj.A0Y(uri, 0);
        A02("update");
        A03("update");
        try {
            A01();
            throw C8j3.A17();
        } catch (Throwable th) {
            Systrace.A03(512L);
            throw th;
        }
    }

    private final void A00() {
        AtomicBoolean atomicBoolean = this.A00;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                atomicBoolean.set(true);
            }
        }
        if (Binder.getCallingUid() == Process.myUid() && Binder.getCallingPid() == Process.myPid()) {
            return;
        }
        EHa.A00();
        A3q a3q = A3q.A00;
        if (!a3q.isEmpty()) {
            Iterator it = a3q.iterator();
            while (it.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it);
                String strA0e = C60Q.A0e(this);
                if (C7BY.A0q(strA0e, strA0j, false)) {
                    throw new SecurityException(FGI.A0d("Content Provider blocked by kill switch for ", strA0e, ". Called by: ", getCallingPackage()));
                }
            }
        }
        EHW ehw = (EHW) this;
        if (!A04(ehw.getContext(), ((AccessLibraryContentProvider) ehw).A00)) {
            throw new SecurityException(FGI.A0d("Component access not allowed for ", C60Q.A0e(this), ". Called by: ", getCallingPackage()));
        }
    }

    private final void A01() {
        AtomicBoolean atomicBoolean = this.A00;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                atomicBoolean.set(true);
            }
        }
        if (Binder.getCallingUid() == Process.myUid() && Binder.getCallingPid() == Process.myPid()) {
            return;
        }
        EHa.A00();
        A3q a3q = A3q.A00;
        if (!a3q.isEmpty()) {
            Iterator it = a3q.iterator();
            while (it.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it);
                String strA0e = C60Q.A0e(this);
                if (C7BY.A0q(strA0e, strA0j, false)) {
                    throw new SecurityException(FGI.A0d("Content Provider blocked by kill switch for ", strA0e, ". Called by: ", getCallingPackage()));
                }
            }
        }
        EHW ehw = (EHW) this;
        if (!A04(ehw.getContext(), ((AccessLibraryContentProvider) ehw).A01)) {
            throw new SecurityException(FGI.A0d("Component access not allowed for ", C60Q.A0e(this), ". Called by: ", getCallingPackage()));
        }
    }

    private final void A02(String str) {
        if (Systrace.A09(512L)) {
            Systrace.A04(512L, FGI.A0U(C3cI.A0Y(this), ".", str));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        r9 = r5.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
    
        X.BV4.A1T(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a3, code lost:
    
        r6.remove(r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
    
        X.BV4.A1Q(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ad, code lost:
    
        X.BV4.A1Q(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[Catch: Exception -> 0x0181, TRY_ENTER, TryCatch #9 {Exception -> 0x0181, blocks: (B:11:0x0028, B:12:0x0036, B:36:0x009b, B:79:0x0152, B:18:0x0059, B:26:0x0085, B:28:0x008c, B:86:0x015e, B:87:0x015f, B:62:0x012a, B:78:0x0151, B:30:0x008e, B:34:0x0099, B:76:0x014e, B:81:0x0156, B:70:0x013d, B:72:0x0144, B:84:0x0159, B:31:0x008f, B:33:0x0095, B:75:0x0147, B:13:0x003d, B:15:0x0047, B:17:0x0056, B:27:0x0086, B:63:0x012b, B:71:0x013e, B:20:0x0068, B:22:0x0071, B:24:0x0076, B:37:0x00a0, B:41:0x00ad, B:40:0x00a8, B:68:0x013b, B:42:0x00b0, B:61:0x0127, B:67:0x0138, B:65:0x0133, B:21:0x006b, B:43:0x00be, B:45:0x00cc, B:46:0x00db, B:49:0x00e3, B:51:0x00f7, B:53:0x0103, B:54:0x0110, B:57:0x0119, B:58:0x011c, B:60:0x0121, B:38:0x00a3), top: B:120:0x0028, inners: #2, #5, #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A03(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EHQ.A03(java.lang.String):void");
    }

    @Override // android.content.ContentProvider
    public final boolean isTemporary() {
        A02("isTemporary");
        try {
            A00();
            return super.isTemporary();
        } finally {
            Systrace.A03(512L);
        }
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks
    public final void onLowMemory() {
        if (this.A00.get()) {
            A02("onLowMemory");
            try {
                super.onLowMemory();
            } finally {
                Systrace.A03(512L);
            }
        }
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (this.A00.get()) {
            A02("onTrimMemory");
            try {
                super.onTrimMemory(i);
            } finally {
                Systrace.A03(512L);
            }
        }
    }

    @Override // android.content.ContentProvider
    public final int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        AnonymousClass003.A0u(uri, contentValuesArr);
        A02("bulkInsert");
        A03("bulkInsert");
        try {
            A01();
            return super.bulkInsert(uri, contentValuesArr);
        } finally {
            Systrace.A03(512L);
        }
    }

    @Override // android.content.ContentProvider
    public final String[] getStreamTypes(Uri uri, String str) {
        AnonymousClass003.A0u(uri, str);
        A02("getStreamTypes");
        A03("getStreamTypes");
        try {
            A00();
            return null;
        } finally {
            Systrace.A03(512L);
        }
    }

    @Override // android.content.ContentProvider
    public final AssetFileDescriptor openAssetFile(Uri uri, String str) {
        AnonymousClass003.A0u(uri, str);
        A02("openAssetFile");
        A03("openAssetFile");
        try {
            if (C7BY.A0q(str, "w", false)) {
                A01();
            } else {
                A00();
            }
            return super.openAssetFile(uri, str);
        } finally {
            Systrace.A03(512L);
        }
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        AnonymousClass003.A0u(uri, str);
        A02("openFile");
        A03("openFile");
        try {
            if (C7BY.A0q(str, "w", false)) {
                A01();
            } else {
                A00();
            }
            return super.openFile(uri, str);
        } finally {
            Systrace.A03(512L);
        }
    }

    @Override // android.content.ContentProvider
    public final AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle) {
        AnonymousClass003.A0u(uri, str);
        A02("openTypedAssetFile");
        A03("openTypedAssetFile");
        try {
            A00();
            return super.openTypedAssetFile(uri, str, bundle);
        } finally {
            Systrace.A03(512L);
        }
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        A02("shutdown");
        Systrace.A03(512L);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        C7384Etj.A0Y(uri, 0);
        A02("query");
        A03("query");
        try {
            A00();
            return A05(uri);
        } finally {
            Systrace.A03(512L);
        }
    }
}
