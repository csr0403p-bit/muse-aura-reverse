package androidx.glance.appwidget;

import X.AbstractC9245GAx;
import X.AnonymousClass001;
import X.C3cG;
import X.C60O;
import X.C6ys;
import X.C75B;
import X.C75D;
import X.C8iZ;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.facebook.aura.R;
import java.util.Map;

/* loaded from: classes3.dex */
public class GlanceRemoteViewsService extends RemoteViewsService {
    public static final C75D A00 = new C75D();

    public final class GlanceRemoteViewsFactory implements RemoteViewsService.RemoteViewsFactory {
        public final int A00;
        public final Context A01;
        public final int A02;
        public final String A03;

        /* JADX WARN: Removed duplicated region for block: B:38:0x0090 A[PHI: r5
  0x0090: PHI (r5v5 X.HoC) = (r5v4 X.HoC), (r5v6 X.HoC) binds: [B:30:0x0077, B:37:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final java.lang.Object A01(X.C6vW r11, androidx.glance.appwidget.GlanceRemoteViewsService.GlanceRemoteViewsFactory r12, X.HtJ r13) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
            /*
                r3 = 0
                boolean r0 = r13 instanceof X.C8iO
                if (r0 == 0) goto L99
                r10 = r13
                X.8iO r10 = (X.C8iO) r10
                int r0 = r10.$t
                if (r0 != r3) goto L99
                int r2 = r10.A00
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L99
                int r2 = r2 - r1
                r10.A00 = r2
            L17:
                java.lang.Object r5 = r10.A01
                X.Hji r3 = X.EnumC10460Hji.A02
                int r1 = r10.A00
                r8 = 0
                r4 = 3
                r0 = 2
                r2 = 1
                if (r1 == 0) goto L2f
                if (r1 == r2) goto L72
                if (r1 == r0) goto L89
                if (r1 != r4) goto La0
                X.Hwg.A00(r5)
            L2c:
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                return r3
            L2f:
                X.Hwg.A00(r5)
                android.content.Context r6 = r12.A01
                android.appwidget.AppWidgetManager r1 = android.appwidget.AppWidgetManager.getInstance(r6)
                int r0 = r12.A00
                android.appwidget.AppWidgetProviderInfo r0 = r1.getAppWidgetInfo(r0)
                if (r0 == 0) goto L79
                android.content.ComponentName r0 = r0.provider
                if (r0 == 0) goto L79
                java.lang.String r0 = r0.getClassName()
                if (r0 == 0) goto L79
                java.lang.Class r0 = java.lang.Class.forName(r0)
                java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r8)
                java.lang.Object r1 = r0.newInstance(r8)
                java.lang.String r0 = "null cannot be cast to non-null type androidx.glance.appwidget.GlanceAppWidgetReceiver"
                X.C7384Etj.A0Z(r1, r0)
                androidx.glance.appwidget.GlanceAppWidgetReceiver r1 = (androidx.glance.appwidget.GlanceAppWidgetReceiver) r1
                androidx.glance.appwidget.GlanceAppWidget r5 = r1.getGlanceAppWidget()
                if (r5 == 0) goto L79
                X.8ia r9 = new X.8ia
                r9.<init>(r2, r8)
                r10.A00 = r2
                r7 = r11
                java.lang.Object r5 = r5.getOrCreateAppWidgetSession$glance_appwidget(r6, r7, r8, r9, r10)
                if (r5 != r3) goto L75
                return r3
            L72:
                X.Hwg.A00(r5)
            L75:
                X.HoC r5 = (X.HoC) r5
                if (r5 != 0) goto L90
            L79:
                int r0 = r12.A00
                androidx.glance.appwidget.UnmanagedSessionReceiver$Companion r2 = androidx.glance.appwidget.UnmanagedSessionReceiver.A00
                monitor-enter(r2)
                java.util.Map r1 = androidx.glance.appwidget.UnmanagedSessionReceiver.A01     // Catch: java.lang.Throwable -> La5
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> La5
                r1.get(r0)     // Catch: java.lang.Throwable -> La5
                monitor-exit(r2)
                goto L2c
            L89:
                X.Hwg.A00(r5)
                X.HoC r5 = (X.HoC) r5
                if (r5 == 0) goto L2c
            L90:
                r10.A00 = r4
                java.lang.Object r0 = r5.APQ(r10)
                if (r0 != r3) goto L2c
                return r3
            L99:
                X.8iO r10 = new X.8iO
                r10.<init>(r12, r13, r3)
                goto L17
            La0:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            La5:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.GlanceRemoteViewsService.GlanceRemoteViewsFactory.A01(X.6vW, androidx.glance.appwidget.GlanceRemoteViewsService$GlanceRemoteViewsFactory, X.HtJ):java.lang.Object");
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final void onDataSetChanged() throws Throwable {
            AbstractC9245GAx.A00(C6ys.A00, new C8iZ(this, null, 4));
        }

        private final C75B A00() {
            C75B c75b;
            int i = this.A00;
            int i2 = this.A02;
            String str = this.A03;
            C75D c75d = GlanceRemoteViewsService.A00;
            synchronized (c75d) {
                Map<String, C75B> map = c75d.A00;
                StringBuilder sbA0w = C60O.A0w();
                sbA0w.append(i);
                sbA0w.append('-');
                sbA0w.append(i2);
                sbA0w.append('-');
                c75b = map.get(AnonymousClass001.A0v(str, sbA0w));
                if (c75b == null) {
                    c75b = C75B.A04;
                }
            }
            return c75b;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
            return null;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final void onCreate() {
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final void onDestroy() {
            int i = this.A00;
            int i2 = this.A02;
            String str = this.A03;
            C75D c75d = GlanceRemoteViewsService.A00;
            synchronized (c75d) {
                Map<String, C75B> map = c75d.A00;
                StringBuilder sbA0w = C60O.A0w();
                sbA0w.append(i);
                sbA0w.append('-');
                sbA0w.append(i2);
                sbA0w.append('-');
                map.remove(AnonymousClass001.A0v(str, sbA0w));
            }
        }

        public GlanceRemoteViewsFactory(Context context, String str, int i, int i2) {
            this.A01 = context;
            this.A00 = i;
            this.A02 = i2;
            this.A03 = str;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final int getCount() {
            return A00().A02.length;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final long getItemId(int i) {
            try {
                return A00().A02[i];
            } catch (ArrayIndexOutOfBoundsException unused) {
                return -1L;
            }
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final RemoteViews getViewAt(int i) {
            try {
                return A00().A03[i];
            } catch (ArrayIndexOutOfBoundsException unused) {
                return new RemoteViews(this.A01.getPackageName(), R.layout._name_removed__res_0x7f0d01e2);
            }
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final int getViewTypeCount() {
            return A00().A00;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final boolean hasStableIds() {
            return A00().A01;
        }
    }

    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        if (intent == null) {
            throw C60O.A0i("Intent is null");
        }
        int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (intExtra == -1) {
            throw C3cG.A0Q("No app widget id was present in the intent");
        }
        int intExtra2 = intent.getIntExtra("androidx.glance.widget.extra.view_id", -1);
        if (intExtra2 == -1) {
            throw C3cG.A0Q("No view id was present in the intent");
        }
        String stringExtra = intent.getStringExtra("androidx.glance.widget.extra.size_info");
        if (stringExtra == null || stringExtra.length() == 0) {
            throw C3cG.A0Q("No size info was present in the intent");
        }
        return new GlanceRemoteViewsFactory(this, stringExtra, intExtra, intExtra2);
    }
}
