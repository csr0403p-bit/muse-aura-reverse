package androidx.core.widget;

import X.C3cG;
import X.C7384Etj;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.facebook.aura.R;
import com.facebook.aura.maps.model.HatchMapSceneKt;

/* loaded from: classes3.dex */
public final class RemoteViewsCompatService extends RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        C7384Etj.A0Y(intent, 0);
        final int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (intExtra == -1) {
            throw C3cG.A0Q("No app widget id was present in the intent");
        }
        final int intExtra2 = intent.getIntExtra("androidx.core.widget.extra.view_id", -1);
        if (intExtra2 != -1) {
            return new RemoteViewsService.RemoteViewsFactory(this, intExtra, intExtra2) { // from class: X.77q
                public static final C77p A04 = new C77p(new long[0], new RemoteViews[0]);
                public C77p A00 = A04;
                public final int A01;
                public final int A02;
                public final Context A03;

                private final void A00() {
                    C77p c77p;
                    String str;
                    Context context = this.A03;
                    int i = this.A01;
                    int i2 = this.A02;
                    SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.core.widget.prefs.RemoteViewsCompat", 0);
                    C7384Etj.A0U(sharedPreferences);
                    StringBuilder sbA0w = C60O.A0w();
                    sbA0w.append(i);
                    sbA0w.append(HatchMapSceneKt.ARTIFACT_ID_SEPARATOR);
                    sbA0w.append(i2);
                    String string = sharedPreferences.getString(sbA0w.toString(), null);
                    if (string == null) {
                        str = "No collection items were stored for widget ";
                    } else {
                        C07338im c07338im = new C07338im(1);
                        byte[] bArrDecode = Base64.decode(string, 0);
                        C7384Etj.A0U(bArrDecode);
                        C77r c77r = (C77r) C77r.A00(c07338im, bArrDecode);
                        if (C7384Etj.areEqual(Build.VERSION.INCREMENTAL, c77r.A01)) {
                            try {
                            } catch (PackageManager.NameNotFoundException e) {
                                StringBuilder sbA0x = C60O.A0x("Couldn't retrieve version code for ");
                                sbA0x.append(context.getPackageManager());
                                Log.e("RemoteViewsCompatServic", sbA0x.toString(), e);
                                Log.w("RemoteViewsCompatServic", FGI.A0H("Couldn't get version code, not using stored collection items for widget ", i));
                            }
                            if (context.getPackageManager().getPackageInfo(context.getPackageName(), 0).getLongVersionCode() == c77r.A00) {
                                try {
                                    c77p = (C77p) C77r.A00(new C07338im(0), c77r.A02);
                                } catch (Throwable th) {
                                    Log.e("RemoteViewsCompatServic", FGI.A0H("Unable to deserialize stored collection items for widget ", i), th);
                                }
                                if (c77p == null) {
                                    c77p = A04;
                                }
                                this.A00 = c77p;
                            }
                            str = "App version code has changed, not using stored collection items for widget ";
                        } else {
                            str = "Android version code has changed, not using stored collection items for widget ";
                        }
                    }
                    Log.w("RemoteViewsCompatServic", FGI.A0H(str, i));
                    c77p = A04;
                    this.A00 = c77p;
                }

                @Override // android.widget.RemoteViewsService.RemoteViewsFactory
                public final int getCount() {
                    return this.A00.A02.length;
                }

                @Override // android.widget.RemoteViewsService.RemoteViewsFactory
                public final long getItemId(int i) {
                    try {
                        return this.A00.A02[i];
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        return -1L;
                    }
                }

                @Override // android.widget.RemoteViewsService.RemoteViewsFactory
                public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
                    return null;
                }

                @Override // android.widget.RemoteViewsService.RemoteViewsFactory
                public final RemoteViews getViewAt(int i) {
                    try {
                        return this.A00.A03[i];
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        return new RemoteViews(this.A03.getPackageName(), R.layout._name_removed__res_0x7f0d0287);
                    }
                }

                @Override // android.widget.RemoteViewsService.RemoteViewsFactory
                public final int getViewTypeCount() {
                    return this.A00.A00;
                }

                @Override // android.widget.RemoteViewsService.RemoteViewsFactory
                public final boolean hasStableIds() {
                    return this.A00.A01;
                }

                @Override // android.widget.RemoteViewsService.RemoteViewsFactory
                public final void onDestroy() {
                }

                {
                    this.A03 = this;
                    this.A01 = intExtra;
                    this.A02 = intExtra2;
                }

                @Override // android.widget.RemoteViewsService.RemoteViewsFactory
                public final void onCreate() {
                    A00();
                }

                @Override // android.widget.RemoteViewsService.RemoteViewsFactory
                public final void onDataSetChanged() {
                    A00();
                }
            };
        }
        throw C3cG.A0Q("No view id was present in the intent");
    }
}
