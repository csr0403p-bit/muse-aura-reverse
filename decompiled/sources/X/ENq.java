package X;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import libraries.accessv2.src.model.FXAccessException;

/* loaded from: classes5.dex */
public final class ENq implements EOA {
    public static final InterfaceExecutorServiceC3065Bwn A05;
    public final int A00;
    public final C6669EOg A01;
    public final EO0 A02;
    public final Integer A03;
    public final boolean A04;

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;LX/EP0;Ljava/util/Set<+LX/EP1;>;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<LX/ENw;>; */
    @Override // X.EOA
    public final ArrayList ABK(Context context, String str, String str2, Set set, EP0 ep0) throws Throwable {
        boolean z;
        List<Cursor> listSingletonList;
        String strA0n;
        ENz eNz;
        PackageManager packageManager;
        AnonymousClass005.A0x(context, ep0, set);
        C7384Etj.A0Y(str2, 4);
        C6669EOg c6669EOg = this.A01;
        int i = this.A00;
        String strA0M = FGI.A0M("permission_check", "_start");
        C7384Etj.A0Y(strA0M, 2);
        QuickPerformanceLogger quickPerformanceLogger = c6669EOg.A01;
        quickPerformanceLogger.markerPoint(100335617, i, strA0M);
        EO0 eo0 = this.A02;
        String str3 = eo0.A02;
        if (str3 != null && (packageManager = context.getPackageManager()) != null) {
            String packageName = context.getPackageName();
            String str4 = eo0.A01;
            if (!packageName.equals(str4)) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
                C7384Etj.A0U(applicationInfo);
                Bundle bundle = ((PackageItemInfo) applicationInfo).metaData;
                if (bundle == null || !bundle.containsKey(str3)) {
                    throw new FXAccessException(FGI.A0k("Missing permission ", str3, " required to access ", str4, ". Add <meta-data android:name=\"", str3, "\" android:value=\"\" /> to your AndroidManifest.xml"), ENz.A0B);
                }
            }
        }
        C6669EOg.A00("permission_check", "_end", c6669EOg, 100335617, i);
        ArrayList arrayListA0h = C3cG.A0h();
        Uri uriA01 = null;
        try {
            uriA01 = C7Je.A01(eo0.A03);
        } catch (SecurityException | UnsupportedOperationException unused) {
        }
        if (uriA01 != null) {
            quickPerformanceLogger.markerAnnotate(100335617, i, "content_provider_uri", C60O.A0o(uriA01));
            List<C6662ENn> listInvoke = eo0.A04.invoke(ep0, set, str);
            quickPerformanceLogger.markerAnnotate(100335617, i, "cp_query_count", String.valueOf(listInvoke.size()));
            if (!listInvoke.isEmpty()) {
                ContentProviderClient contentProviderClient = null;
                try {
                    try {
                        C6669EOg.A00("client_acquire", "_start", c6669EOg, 100335617, i);
                        PackageManager packageManager2 = context.getPackageManager();
                        if (packageManager2 == null) {
                            throw new FXAccessException("PackageManager not available", ENz.A0D);
                        }
                        try {
                            String str5 = eo0.A01;
                            ApplicationInfo applicationInfo2 = packageManager2.getApplicationInfo(str5, 0);
                            C7384Etj.A0U(applicationInfo2);
                            if (!applicationInfo2.enabled) {
                                throw new FXAccessException(FGI.A0U("Target app ", str5, " is not enabled"), ENz.A02);
                            }
                            C7381Etf c7381EtfA00 = C7mB.A00("*|all_packages|*", AbstractC10402HbJ.A0o);
                            quickPerformanceLogger.markerPoint(100335617, i, "trusted_app_client");
                            ContentProviderClient contentProviderClientA00 = c7381EtfA00.A00(context, uriA01);
                            if (contentProviderClientA00 == null) {
                                ENz eNz2 = ENz.A0A;
                                StringBuilder sbA0x = C3cI.A0x("Failed to get trusted content provider client for ", str5);
                                sbA0x.append(". Make sure app is installed, registers a content provider for authority ");
                                sbA0x.append(uriA01);
                                throw new FXAccessException(AnonymousClass001.A0v(", and has been opened once", sbA0x), eNz2);
                            }
                            try {
                                C6669EOg.A00("client_acquire", "_end", c6669EOg, 100335617, i);
                                C6669EOg.A00("content_provider_query", "_start", c6669EOg, 100335617, i);
                                try {
                                    if (listInvoke.size() == 1) {
                                        C6662ENn c6662ENn = listInvoke.get(0);
                                        Uri uri = c6662ENn.A00;
                                        List<String> list = c6662ENn.A02;
                                        listSingletonList = Collections.singletonList(contentProviderClientA00.query(uri, list != null ? BV4.A1b(list) : null, c6662ENn.A01, null, null, null));
                                    } else {
                                        ArrayList arrayListA0m = AnonymousClass002.A0m(listInvoke);
                                        Iterator<C6662ENn> it = listInvoke.iterator();
                                        while (it.hasNext()) {
                                            it.next();
                                            arrayListA0m.add(new CancellationSignal());
                                        }
                                        ArrayList arrayListA0m2 = AnonymousClass002.A0m(listInvoke);
                                        int i2 = 0;
                                        for (C6662ENn c6662ENn2 : listInvoke) {
                                            int i3 = i2 + 1;
                                            if (i2 < 0) {
                                                AbstractC0885AGm.A14();
                                                throw F60.createAndThrow();
                                            }
                                            arrayListA0m2.add(A05.submit(new CallableC6663ENo(contentProviderClientA00, arrayListA0m, this, c6662ENn2, i2)));
                                            i2 = i3;
                                        }
                                        try {
                                            CPa cPa = CPg.A03;
                                            OutputT outputt = new CPr(ImmutableList.copyOf((Iterable) arrayListA0m2), false).get(10000L, TimeUnit.MILLISECONDS);
                                            C7384Etj.A0X(outputt);
                                            listSingletonList = (List) outputt;
                                            Iterator it2 = arrayListA0m2.iterator();
                                            while (it2.hasNext()) {
                                                try {
                                                    CQD.A00((ListenableFuture) C7384Etj.A0F(it2));
                                                } catch (ExecutionException e) {
                                                    A00(arrayListA0m, arrayListA0m2);
                                                    Throwable cause = e.getCause();
                                                    if (cause == null) {
                                                        throw e;
                                                    }
                                                    throw cause;
                                                }
                                            }
                                        } catch (InterruptedException unused2) {
                                            A00(arrayListA0m, arrayListA0m2);
                                            BV4.A1A();
                                            throw new FXAccessException(FGI.A0U("Fetch from ", str5, " was cancelled while querying"), ENz.A04);
                                        } catch (TimeoutException unused3) {
                                            A00(arrayListA0m, arrayListA0m2);
                                            throw new FXAccessException(FGI.A0g("Fetch from ", str5, " timed out after ", "ms while querying", 10000L), ENz.A0D);
                                        }
                                    }
                                    C6669EOg.A00("content_provider_query", "_end", c6669EOg, 100335617, i);
                                    C6669EOg.A00("cursor_serialization", "_start", c6669EOg, 100335617, i);
                                    try {
                                        int i4 = 0;
                                        int count = 0;
                                        for (Cursor cursor : listSingletonList) {
                                            count += cursor != null ? cursor.getCount() : 0;
                                        }
                                        quickPerformanceLogger.markerAnnotate(100335617, i, "cursor_count", String.valueOf(count));
                                        for (Object obj : listSingletonList) {
                                            int i5 = i4 + 1;
                                            if (i4 < 0) {
                                                AbstractC0885AGm.A14();
                                                throw F60.createAndThrow();
                                            }
                                            Cursor cursor2 = (Cursor) obj;
                                            if (cursor2 != null) {
                                                C6662ENn c6662ENn3 = listInvoke.get(i4);
                                                while (cursor2.moveToNext()) {
                                                    try {
                                                        ENw eNwAhJ = eo0.A05.AhJ(cursor2, c6662ENn3.A03);
                                                        ENw eNw = new ENw(eNwAhJ.A00, eNwAhJ.A02, eNwAhJ.A01, eNwAhJ.A03, eNwAhJ.A04, eNwAhJ.A05, new EO3(eo0));
                                                        if (ENt.A00.A02(str, eNw)) {
                                                            try {
                                                                try {
                                                                } catch (Exception e2) {
                                                                    e = e2;
                                                                }
                                                            } catch (Exception e3) {
                                                                e = e3;
                                                            }
                                                            try {
                                                                c6669EOg.A02(C79.A0P, str2, null, null, ep0, eNw.A04);
                                                                arrayListA0h.add(eNw);
                                                            } catch (Exception e4) {
                                                                e = e4;
                                                                FXAccessException fXAccessException = e instanceof FXAccessException ? (FXAccessException) e : null;
                                                                if ((fXAccessException == null || (eNz = fXAccessException.code) == null || (strA0n = eNz.toString()) == null) && (strA0n = C60O.A0n(e)) == null) {
                                                                    strA0n = "transform_exception";
                                                                }
                                                                StringBuilder sbA0w = C60O.A0w();
                                                                sbA0w.append("Failed to fetch item for query ");
                                                                sbA0w.append(c6662ENn3);
                                                                CFK.A08("AccessLibrary", AnonymousClass001.A0v(" exception", sbA0w), e);
                                                                Integer num = C79.A0T;
                                                                EP1 ep1 = c6662ENn3.A03;
                                                                String message = e.getMessage();
                                                                c6669EOg.A02(num, str2, strA0n, message != null ? AnonymousClass006.A10(EOI.A02, message) : null, ep0, ep1);
                                                            }
                                                        }
                                                    } catch (Exception e5) {
                                                        e = e5;
                                                    }
                                                }
                                            }
                                            i4 = i5;
                                        }
                                        C6669EOg.A00("client_release", "_start", c6669EOg, 100335617, i);
                                        contentProviderClientA00.release();
                                        C6669EOg.A00("client_release", "_end", c6669EOg, 100335617, i);
                                        return arrayListA0h;
                                    } finally {
                                        C6669EOg.A00("cursor_serialization", "_end", c6669EOg, 100335617, i);
                                        for (Cursor cursor3 : listSingletonList) {
                                            if (cursor3 != null) {
                                                try {
                                                    cursor3.close();
                                                } catch (Throwable th) {
                                                    C3cG.A0s(th);
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th2) {
                                    C6669EOg.A00("content_provider_query", "_end", c6669EOg, 100335617, i);
                                    throw th2;
                                }
                            } catch (FXAccessException e6) {
                                throw e6;
                            } catch (Exception e7) {
                                e = e7;
                                String str6 = eo0.A01;
                                String strA0h = FGI.A0h("Failed to query content provider for ", str6, ". ", e.getMessage(), ".");
                                boolean zA1L = AnonymousClass002.A1L(AbstractC10402HbJ.A0k.contains(AbstractC06987ml.A01(context, str6)) ? 1 : 0);
                                if (!(e instanceof SecurityException) || (z = this.A04) == zA1L) {
                                    throw new FXAccessException(strA0h, ENz.A0D);
                                }
                                ENz eNz3 = ENz.A0C;
                                StringBuilder sbA0g = C3cG.A0g(strA0h);
                                sbA0g.append(" This is likely due to mismatched signing keys. Is key debug? (source app): ");
                                sbA0g.append(z);
                                throw new FXAccessException(C60P.A1P(", (target app): ", sbA0g, zA1L), eNz3);
                            } catch (Throwable th3) {
                                th = th3;
                                contentProviderClient = contentProviderClientA00;
                                if (contentProviderClient != null) {
                                    C6669EOg.A00("client_release", "_start", c6669EOg, 100335617, i);
                                    contentProviderClient.release();
                                    C6669EOg.A00("client_release", "_end", c6669EOg, 100335617, i);
                                }
                                throw th;
                            }
                        } catch (PackageManager.NameNotFoundException unused4) {
                            throw new FXAccessException(FGI.A0U("Target app ", eo0.A01, " is not installed"), ENz.A03);
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (FXAccessException e8) {
                    throw e8;
                } catch (Exception e9) {
                    e = e9;
                }
            }
        }
        return arrayListA0h;
    }

    @Override // X.EOA
    public final Integer AJi() {
        return this.A03;
    }

    static {
        InterfaceExecutorServiceC3065Bwn interfaceExecutorServiceC3065BwnA00 = MoreExecutors.A00(Executors.newCachedThreadPool());
        C7384Etj.A0U(interfaceExecutorServiceC3065BwnA00);
        A05 = interfaceExecutorServiceC3065BwnA00;
    }

    public ENq(C6669EOg c6669EOg, EO0 eo0, int i, boolean z) {
        this.A02 = eo0;
        this.A04 = z;
        this.A01 = c6669EOg;
        this.A00 = i;
        this.A03 = eo0.A00;
    }

    private final void A00(List<CancellationSignal> list, List<? extends ListenableFuture<Cursor>> list2) {
        Iterator<CancellationSignal> it = list.iterator();
        while (it.hasNext()) {
            try {
                it.next().cancel();
            } catch (Throwable th) {
                C3cG.A0s(th);
            }
        }
        for (ListenableFuture<Cursor> listenableFuture : list2) {
            listenableFuture.addListener(new RunnableC6664ENp(listenableFuture, this), EnumC3451CNw.A01);
        }
    }
}
